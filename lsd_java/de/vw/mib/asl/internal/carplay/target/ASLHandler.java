/*
 * Decompiled with CFR 0.152.
 */
package de.vw.mib.asl.internal.carplay.target;

import de.vw.mib.asl.api.smartphoneintegration.ASLSmartphoneIntegrationAPI;
import de.vw.mib.asl.api.smartphoneintegration.ASLSmartphoneIntegrationFactory;
import de.vw.mib.asl.api.system.ASLSystemFactory;
import de.vw.mib.asl.framework.internal.framework.ServiceManager;
import de.vw.mib.asl.internal.carplay.audio.CarPlayAudiohandling;
import de.vw.mib.asl.internal.carplay.common.CarPlayGlobalProperies;
import de.vw.mib.asl.internal.carplay.common.CarPlayHMIRequestParameterConfiguration;
import de.vw.mib.asl.internal.carplay.common.CarPlayModeHandling;
import de.vw.mib.asl.internal.carplay.speech.SpeechApplicant;
import de.vw.mib.asl.internal.carplay.target.HsmTarget;
import de.vw.mib.dialogactivation.ActivationState;
import de.vw.mib.genericevents.EventGeneric;
import de.vw.mib.log4mib.LogMessage;
import generated.de.vw.mib.asl.internal.ListManager;
import generated.de.vw.mib.asl.internal.carplay.transformer.CarPlayCanvasDimensionCollector;
import java.util.Hashtable;
import org.dsi.ifc.carplay.AppStateRequest;
import org.dsi.ifc.carplay.ResourceRequest;
import org.dsi.ifc.carplay.ServiceConfiguration;
import org.dsi.ifc.carplay.TouchEvent;

public class ASLHandler {
    public String classname = "ASLController";
    private CarPlayGlobalProperies properties;
    private HsmTarget target;
    private SpeechApplicant speechapplicant;
    private CarPlayAudiohandling audiohandling;
    private CarPlayModeHandling modehandling;
    private SpeechApplicant speech;
    int TOUCH_EVENT_RELEASED = 0;
    int TOUCH_EVENT_PRESSED_ONE_FINGER = 1;
    int TOUCH_EVENT_PRESSED_TWO_FINGERS = 2;

    public ASLHandler(HsmTarget hsmTarget, CarPlayGlobalProperies carPlayGlobalProperies, SpeechApplicant speechApplicant, CarPlayAudiohandling carPlayAudiohandling, CarPlayModeHandling carPlayModeHandling, SpeechApplicant speechApplicant2) {
        this.target = hsmTarget;
        this.properties = carPlayGlobalProperies;
        this.speechapplicant = speechApplicant;
        this.audiohandling = carPlayAudiohandling;
        this.modehandling = carPlayModeHandling;
        this.speech = speechApplicant2;
    }

    public void handleAslApiEnterCarPlayCanvas(EventGeneric eventGeneric) {
        int n = eventGeneric.getInt(0);
        this.properties.setCanvasVisible(true);
        if (this.properties.getConnectionState() != 0 && this.properties.getConnectionState() != 1 && this.properties.getCurrentScreenSource() != 2) {
            if (n == 6) {
                this.target.getDSICarPlay().requestUI(2);
            } else {
                this.target.getDSICarPlay().requestUI(0);
            }
        }
    }

    public void handleAslApiLeaveCarPlayCanvas() {
        this.properties.setCanvasVisible(false);
        if (this.properties.getConnectionState() != 0 && this.properties.getConnectionState() != 1 && (this.properties.getCurrentScreenSource() == 2 || this.properties.isVideoBorrowState())) {
            this.modehandling.takeScreen("Take Screen: Carplay canvas was left");
            int n = 1;
            if (n != this.properties.getCurrentScreenSource()) {
                this.properties.setCurrentScreenSource(n);
            }
        }
    }

    public void handleAslApiEV_CARPLAY_SOUND_SET_CONNECTION_ANSWER(int n, int n2) {
        Object object;
        int n3 = this.properties.getCurrentSoundStatus(n);
        int n4 = -1;
        int n5 = -1;
        if (n2 == 0 && n3 == 0 && this.target.isTraceEnabled()) {
            object = this.target.trace();
            object.append(this.classname).append(".").append(new StringBuffer().append("handleAslApiEV_CARPLAY_SOUND_SET_CONNECTION_ANSWER - WARNING! Got an answer out of order from audio management - got a result_ok for not requested connection ").append(n).toString()).log();
        }
        if (n == 151 && this.properties.getCurrentMainAudioType() != 1) {
            n5 = 163;
        } else if (n == 163) {
            n5 = 151;
        } else if (n == 152) {
            n5 = 153;
        } else if (n == 153) {
            n5 = 152;
        }
        if (n5 != -1) {
            n4 = this.properties.getCurrentSoundStatus(n5);
        }
        if (n2 == 0) {
            this.properties.setCurrentSoundStatus(n, 3);
            if (n4 != -1) {
                if (n4 == 3) {
                    if (n3 != 3) {
                        if (this.target.isTraceEnabled()) {
                            object = this.target.trace();
                            object.append(this.classname).append(".").append("handleAslApiEV_CARPLAY_SOUND_SET_CONNECTION_ANSWER - result ok, is pair, pair status = ready, own was not ready (pair: ").append(n).append(" and ").append(n5).append(") => response").log();
                        }
                        this.properties.setPhoneWaitsForResponseMainAudioType(false);
                        this.target.getDSICarPlay().responseUpdateMainAudioType(this.getAnswerForMainAudioType(n));
                    }
                } else if (n4 != 2 && n4 == 0) {
                    // empty if block
                }
            } else if (n != 154 && n != 155 && n3 != 3) {
                if (this.target.isTraceEnabled()) {
                    object = this.target.trace();
                    object.append(this.classname).append(".").append("handleAslApiEV_CARPLAY_SOUND_SET_CONNECTION_ANSWER - result ok, no pair, own was not ready (channel: ").append(n).append(") => response").log();
                }
                if (this.properties.isConnected()) {
                    this.properties.setPhoneWaitsForResponseMainAudioType(false);
                    this.target.getDSICarPlay().responseUpdateMainAudioType(this.getAnswerForMainAudioType(n));
                }
            }
        } else {
            this.properties.setCurrentSoundStatus(n, 0);
            if (n4 != -1) {
                if (n4 != 0 && (n4 == 2 || n4 == 3)) {
                    if (this.target.isTraceEnabled()) {
                        object = this.target.trace();
                        object.append(this.classname).append(".").append("handleAslApiEV_CARPLAY_SOUND_SET_CONNECTION_ANSWER - result Nok, is pair, pair status = ready|pending (pair: ").append(n).append(" and ").append(n5).append(") => response & take audio").log();
                    }
                    this.properties.setPhoneWaitsForResponseMainAudioType(false);
                    this.target.getDSICarPlay().responseUpdateMainAudioType(this.getAnswerForMainAudioType(n));
                    if (this.isValidConnection(n)) {
                        this.audiohandling.releaseAudioConnection(n5, false);
                        this.audiohandling.takeMainAudio("Take Audio: Audio connection could not be established for one out of two requested connections");
                    }
                }
            } else if (n != 154 && n != 155) {
                if (this.target.isTraceEnabled()) {
                    object = this.target.trace();
                    object.append(this.classname).append(".").append("handleAslApiEV_CARPLAY_SOUND_SET_CONNECTION_ANSWER - result Nok, no pair (channel: ").append(n).append(") => response & take audio").log();
                }
                if (this.properties.isConnected()) {
                    this.properties.setPhoneWaitsForResponseMainAudioType(false);
                    this.target.getDSICarPlay().responseUpdateMainAudioType(this.getAnswerForMainAudioType(n));
                    if (this.isValidConnection(n)) {
                        this.audiohandling.takeMainAudio("Take Audio: Audio connection could not be established");
                    }
                }
            }
        }
        if (n == 162 && n2 == 0) {
            if (!this.properties.isActiveEntertainment()) {
                if (this.target.isTraceEnabled()) {
                    object = this.target.trace();
                    object.append(this.classname).append(".").append("handleAslApiEV_CARPLAY_SOUND_SET_CONNECTION_ANSWER - got the media connection but we are not active entertainment => release connection!").log();
                }
                this.audiohandling.releaseAudioConnection(162, true);
            } else {
                if (this.target.isTraceEnabled()) {
                    object = this.target.trace();
                    object.append(this.classname).append(".").append("handleAslApiEV_CARPLAY_SOUND_SET_CONNECTION_ANSWER - send ACTIVATED").log();
                }
                object = ServiceManager.mGenericEventFactory.newEvent(-1067707136);
                this.target.sendSafe((EventGeneric)object);
                this.target.triggerObserver(924081408, null);
                if (this.properties.isConnected() && this.properties.getCurrentMainAudioSource() == 2) {
                    this.audiohandling.changeVolumeLock(false);
                    if (this.properties.getCurrentMuteState()) {
                        this.audiohandling.releaseUserMute();
                    }
                } else {
                    this.audiohandling.changeVolumeLock(true);
                }
                this.audiohandling.checkAudibleStatus(this.properties.getCurrentAudibleState());
            }
        }
    }

    public void handleAslApiEV_CARPLAY_SOUND_RELEASE_CONNECTION_ANSWER(int n) {
        if (this.properties.getCurrentSoundStatus(n) != 2 && this.properties.getCurrentSoundStatus(n) != 1) {
            this.properties.setCurrentSoundStatus(n, 0);
        }
        if ((n == 152 || n == 153) && this.speechapplicant.isCarplayActive()) {
            this.speechapplicant.forceChangeState(ActivationState.INACTIVE);
            this.target.getDSICarPlay().requestSIRIAction(1);
            this.target.getDSICarPlay().requestSIRIAction(2);
        }
        if (this.isValidConnection(n) && this.properties.isSoundManagementAvailable() && this.properties.getCurrentSoundStatus(n) != 1) {
            this.audiohandling.takeMainAudio("Take Audio: audio connection was released");
        }
    }

    public void handleAslApiASL_SMARTPHONEINTEGRATION_CONNECTION_ESTABLISHED_CARPLAY() {
        LogMessage logMessage;
        if (this.target.isTraceEnabled()) {
            logMessage = this.target.trace();
            logMessage.append(this.classname).append(".").append("handleAslApiASL_SMARTPHONEINTEGRATION_CONNECTION_ESTABLISHED_CARPLAY").log();
        }
        if (this.properties.getConnectionState() == 0) {
            this.properties.setConnectionState(1);
        } else if (this.properties.getConnectionState() == 2) {
            if (!this.speechapplicant.isRegistered()) {
                if (this.target.isTraceEnabled()) {
                    logMessage = this.target.trace();
                    logMessage.append(this.classname).append(".").append(" call speechapplicant.registerService()").log();
                }
                this.speechapplicant.registerService();
            }
            this.properties.setConnectionState(3);
            this.audiohandling.setAudioConnection(154, false);
            this.sendStartService();
        }
    }

    public void handleAslApiASL_SMARTPHONEINTEGRATION_CONNECTION_LOST_CARPLAY() {
        if (this.target.isTraceEnabled()) {
            LogMessage logMessage = this.target.trace();
            logMessage.append(this.classname).append(".").append("handleAslApiASL_SMARTPHONEINTEGRATION_CONNECTION_LOST_CARPLAY").log();
        }
        if (this.target.getTimerServer().isTimerActive(this.target.getTargetId(), -1417281280)) {
            this.target.stopTimer(-1417281280);
        }
        if (this.target.getTimerServer().isTimerActive(this.target.getTargetId(), -1400504064)) {
            this.target.stopTimer(-1400504064);
        }
        if (this.properties.getConnectionState() == 3) {
            this.properties.setConnectionState(2);
        } else if (this.properties.getConnectionState() == 1) {
            this.properties.setConnectionState(0);
        }
        this.audiohandling.releaseAllConnections(true, true);
        if (this.target.getTimerServer().isTimerActive(this.target.getTargetId(), -1434058496)) {
            this.target.stopTimer(-1434058496);
        }
        this.speechapplicant.setWasSiriStart(false);
        if (this.speechapplicant.isCarplayActive()) {
            this.speechapplicant.forceChangeState(ActivationState.INACTIVE);
        }
        if (this.speechapplicant.isRegistered()) {
            this.speechapplicant.unregister();
        }
        if (this.properties.getActiveNavigation() == 2) {
            ServiceManager.aslPropertyManager.valueChangedBoolean(963062784, false);
            this.properties.setActiveNavigation(1);
        }
        this.properties.setAudioBorrowState(false);
        this.properties.setVideoBorrowState(false);
        this.properties.setCurrentMainAudioType(0);
        this.properties.setTelephonyStateValid(false);
        if (this.properties.isActiveEntertainment() && this.properties.getCurrentSoundStatus(162) == 3) {
            this.audiohandling.changeVolumeLock(true);
        }
        this.properties.setAutoplayFirstMediaRequest(true);
        this.properties.setDelayBorrowAudio(false);
        this.properties.setPhoneWaitsForResponseMainAudioType(false);
        this.properties.setCurrentCallStates(new Hashtable());
        this.target.getClusterService().sendCallStatesUpdate();
    }

    public void handleHmiSimpleTouchEvent(EventGeneric eventGeneric) {
        int n = eventGeneric.getInt(0);
        int n2 = eventGeneric.getInt(1);
        int n3 = eventGeneric.getInt(2);
        int n4 = eventGeneric.getInt(3);
        if (n3 == 0) {
            TouchEvent[] touchEventArray;
            if (this.target.isTraceEnabled()) {
                touchEventArray = this.target.trace();
                touchEventArray.append(this.classname).append(".handleHmiSimpleTouchEvent (x,y)=(").append(n).append(",").append(n2).append(")").log();
            }
            touchEventArray = new TouchEvent[]{new TouchEvent(n, n2)};
            int n5 = 0;
            n5 = n4 == 0 ? this.TOUCH_EVENT_PRESSED_ONE_FINGER : this.TOUCH_EVENT_RELEASED;
            this.target.getDSICarPlay().postTouchEvent(1, n5, touchEventArray);
        }
    }

    public void handleHmiRotaryEvent(EventGeneric eventGeneric) {
        int n = eventGeneric.getInt(0);
        if (n == 0) {
            this.target.getDSICarPlay().postRotaryEvent(-1);
        } else if (n == 1) {
            this.target.getDSICarPlay().postRotaryEvent(1);
        } else if (n == 2) {
            this.target.getDSICarPlay().postButtonEvent(1, 0);
        } else if (n == 4) {
            this.target.getDSICarPlay().postButtonEvent(1, 1);
        }
    }

    public void handleHmiMflEvent(EventGeneric eventGeneric) {
        int n = eventGeneric.getInt(0);
        if (this.target.isTraceEnabled()) {
            LogMessage logMessage = this.target.trace();
            logMessage.append(this.classname).append(".handleHmiMflEvent(gesture=").append(n).log();
        }
        switch (n) {
            case 0: {
                this.target.getDSICarPlay().postButtonEvent(9, 1);
                break;
            }
            case 1: {
                break;
            }
            case 2: {
                this.target.getDSICarPlay().postButtonEvent(10, 1);
                break;
            }
            case 3: {
                this.target.getDSICarPlay().postButtonEvent(10, 1);
                break;
            }
            case 4: {
                this.target.getDSICarPlay().postButtonEvent(9, 1);
                break;
            }
            case 5: {
                break;
            }
            case 6: {
                break;
            }
            case 7: {
                break;
            }
            case 8: {
                this.target.getDSICarPlay().postButtonEvent(20, 0);
                break;
            }
            case 9: 
            case 10: {
                this.target.getDSICarPlay().postButtonEvent(20, 1);
                break;
            }
            case 11: {
                this.target.getDSICarPlay().postButtonEvent(15, 0);
                break;
            }
            case 12: {
                this.target.getDSICarPlay().postButtonEvent(15, 1);
                break;
            }
            case 13: {
                this.target.getDSICarPlay().postButtonEvent(9, 0);
                break;
            }
            case 14: {
                this.target.getDSICarPlay().postButtonEvent(10, 0);
                break;
            }
        }
    }

    public void sendStartService() {
        CarPlayHMIRequestParameterConfiguration carPlayHMIRequestParameterConfiguration = this.properties.getParamconfig();
        String[] stringArray = new String[]{};
        boolean bl = false;
        if (ServiceManager.configManagerDiag.getDriverSide() == 2) {
            bl = true;
        }
        int n = ServiceManager.configManagerDiag.getCarplayCanvasOffsetX();
        int n2 = 0;
        int n3 = ServiceManager.configManagerDiag.getLayoutCarplayCanvasDimensionHeight();
        int n4 = ServiceManager.configManagerDiag.getLayoutCarplayCanvasDimensionWidth();
        int n5 = 105;
        int n6 = 174;
        ASLSmartphoneIntegrationAPI aSLSmartphoneIntegrationAPI = ASLSmartphoneIntegrationFactory.getSmartphoneIntegrationApi();
        if (aSLSmartphoneIntegrationAPI != null) {
            n6 = (int)(aSLSmartphoneIntegrationAPI.getPixelDimensionWidth() * (double)n4);
            n5 = (int)(aSLSmartphoneIntegrationAPI.getPixelDimensionHeight() * (double)n3);
            if (this.target.isTraceEnabled()) {
                this.target.trace(new StringBuffer().append("ASLHandler::sendStartService( width->").append(n6).append("=").append(aSLSmartphoneIntegrationAPI.getPixelDimensionWidth()).append("*").append(n4).toString());
                this.target.trace(new StringBuffer().append("ASLHandler::sendStartService( height->").append(n5).append("=").append(aSLSmartphoneIntegrationAPI.getPixelDimensionHeight()).append("*").append(n3).toString());
            }
        } else if (this.target.isTraceEnabled()) {
            this.target.trace("StartupHandler::startAndroidAutoService2(smartphoneintegrationAPI == null)");
        }
        Object[] objectArray = new CarPlayCanvasDimensionCollector[]{new CarPlayCanvasDimensionCollector()};
        objectArray[0].carplay_height = n3;
        objectArray[0].carplay_width = n4;
        ListManager.getGenericASLList(946285568).updateList(objectArray);
        AppStateRequest[] appStateRequestArray = carPlayHMIRequestParameterConfiguration.getCompleteAppStateRequest(false, this.properties.isHmiRouteGuidanceActive(), this.speech.isOtherSpeechActive() == ActivationState.ACTIVE);
        super.getClass();
        ServiceConfiguration serviceConfiguration = new ServiceConfiguration(appStateRequestArray, carPlayHMIRequestParameterConfiguration.getRessourceRequest(3), 3, n4, n3, n, n2, this.properties.getOemIconTitle(), bl, n4, n3, stringArray, this.properties.isNightMode(), n5, n6, this.getInputFeatures());
        this.target.getDSICarPlay().startService(serviceConfiguration);
        this.properties.setCurrentScreenSource(1);
    }

    private int getInputFeatures() {
        int n = ASLSystemFactory.getSystemApi().getAbtFeatureService().getRotaryEncoderType();
        if (n == 2) {
            return 5;
        }
        return 4;
    }

    public void handleSoundManagerStatus(EventGeneric eventGeneric) {
        int n = eventGeneric.getInt(0);
        if (n == 0) {
            LogMessage logMessage;
            if (this.target.isTraceEnabled()) {
                logMessage = this.target.trace();
                logMessage.append(this.classname).append(".handle(ASL_SOUND_AUDIOMNGMNT_STATUS)").append(" ASL_SOUND_AUDIOMNGMNT_UNAVAILABLE").log();
            }
            this.properties.setSoundManagementAvailable(false);
            if (this.properties.isConnected()) {
                if (this.target.isTraceEnabled()) {
                    logMessage = this.target.trace();
                    logMessage.append(this.classname).append(".handle(ASL_SOUND_AUDIOMNGMNT_STATUS)").append(" release all connections but leave EntertainmentManager alone").log();
                }
                this.audiohandling.releaseAllConnections(true, true);
                this.properties.setCurrentSoundStatus(162, 0);
                if (this.properties.getCurrentMainAudioSource() == 2) {
                    if (this.target.isTraceEnabled()) {
                        logMessage = this.target.trace();
                        logMessage.append(this.classname).append(".handle(ASL_SOUND_AUDIOMNGMNT_STATUS)").append(" borrow audio").log();
                    }
                    this.audiohandling.borrowMainAudio("Borrow audio: audio management is not longer available");
                }
            }
        } else if (n == 1) {
            if (this.target.isTraceEnabled()) {
                LogMessage logMessage = this.target.trace();
                logMessage.append(this.classname).append(".handle(ASL_SOUND_AUDIOMNGMNT_STATUS)").append(" ASL_SOUND_AUDIOMNGMNT_AVAILABLE").log();
            }
            this.properties.setSoundManagementAvailable(true);
        } else if (n == 2) {
            LogMessage logMessage;
            if (this.target.isTraceEnabled()) {
                logMessage = this.target.trace();
                logMessage.append(this.classname).append(".handle(ASL_SOUND_AUDIOMNGMNT_STATUS)").append(" ASL_SOUND_AUDIOMNGMNT_AVAILABLE_RESTORE_CONNECTIONS").log();
            }
            this.properties.setSoundManagementAvailable(true);
            if (this.properties.isConnected()) {
                if (this.target.isTraceEnabled()) {
                    logMessage = this.target.trace();
                    logMessage.append(this.classname).append(".handle(ASL_SOUND_AUDIOMNGMNT_STATUS)").append(" reconnect dio announcement").log();
                }
                this.audiohandling.setAudioConnection(154, false);
                if (this.properties.isActiveEntertainment()) {
                    if (this.target.isTraceEnabled()) {
                        logMessage = this.target.trace();
                        logMessage.append(this.classname).append(".handle(ASL_SOUND_AUDIOMNGMNT_STATUS)").append(" unborrow main audio").log();
                    }
                    this.audiohandling.unborrowMainAudio("Unborrow Audio: audio management is now available again");
                }
            }
        }
    }

    public void handleDayNightMode(EventGeneric eventGeneric) {
        boolean bl = eventGeneric.getBoolean(0);
        if (this.target.isTraceEnabled()) {
            LogMessage logMessage = this.target.trace();
            logMessage.append(this.classname).append(".handle(DAYNIGHT_MODE)").append(" new mode: night mode is ").append(bl).log();
        }
        this.properties.setNightMode(bl);
        if (this.properties.isConnected()) {
            this.target.getDSICarPlay().requestNightMode(bl);
        }
    }

    private boolean isValidConnection(int n) {
        return (n == 151 || n == 163) && this.properties.getCurrentMainAudioType() == 3 || (n == 152 || n == 153) && this.properties.getCurrentMainAudioType() == 4 || n == this.properties.getRingtoneConnection() && this.properties.getCurrentMainAudioType() == 1 || n == 162 && this.properties.getCurrentMainAudioType() == 2;
    }

    private int getAnswerForMainAudioType(int n) {
        if (n == 163) {
            return 3;
        }
        if (n == 162) {
            return 2;
        }
        if (n == 152 || n == 153) {
            return 4;
        }
        if (n == this.properties.getRingtoneConnection() && this.properties.getRingtoneConnection() != 151) {
            return 1;
        }
        if (n == 151 && this.properties.getRingtoneConnection() == 165) {
            if (this.properties.getCurrentMainAudioType() == 1) {
                return 1;
            }
            return 3;
        }
        return 0;
    }

    public void checkDelayedBorrowState(int n) {
        LogMessage logMessage;
        if (this.target.isTraceEnabled()) {
            logMessage = this.target.trace();
            logMessage.append(this.classname).append(".checkDelayedBorrowState - SDS ended").log();
        }
        if (this.properties.isDelayBorrowAudio() && this.properties.getCurrentMainAudioSource() == 2 && this.properties.getCurrentMainAudioType() == 2) {
            if (this.target.isTraceEnabled()) {
                logMessage = this.target.trace();
                logMessage.append(this.classname).append(".checkDelayedBorrowState - SDS warmup ended without sds session => do BORROW now").log();
            }
            if (this.properties.getCurrentSoundStatus(151) == 0 && this.properties.getCurrentSoundStatus(163) == 0 && this.properties.getCurrentSoundStatus(152) == 0 && this.properties.getCurrentSoundStatus(153) == 0 && this.properties.getCurrentSoundStatus(this.properties.getRingtoneConnection()) == 0) {
                this.audiohandling.borrowMainAudio("Borrow audio after delay: Audio is not audible but overlain by another audio source");
            } else if (this.target.isTraceEnabled()) {
                logMessage = this.target.trace();
                logMessage.append(this.classname).append(".checkDelayedBorrowState - Dont borrow because there is another own audio connection active").log();
            }
            this.properties.setDelayBorrowAudio(false);
        }
    }

    public void handleTaActive() {
        if (this.speechapplicant.isCarplayActive()) {
            if (this.target.isTraceEnabled()) {
                LogMessage logMessage = this.target.trace();
                logMessage.append(this.classname).append(".handleTaActive - cancel running siri session to make the TA hearable").log();
            }
            this.speechapplicant.forceChangeState(ActivationState.INACTIVE);
            this.target.getDSICarPlay().requestSIRIAction(1);
            this.target.getDSICarPlay().requestSIRIAction(2);
        }
    }

    public void checkForSync() {
        LogMessage logMessage;
        block58: {
            block56: {
                block57: {
                    if (this.target.isTraceEnabled()) {
                        logMessage = this.target.trace();
                        logMessage.append(this.classname).append(".checkForSync - check video source sync...").log();
                    }
                    if (this.properties.getCurrentScreenSource() == 2) {
                        if (!this.properties.isCanvasVisible()) {
                            if (this.target.isTraceEnabled()) {
                                logMessage = this.target.trace();
                                logMessage.append(this.classname).append(".checkForSync - async video source found: VideoMode = Device but canvas invisible => TAKE video source to get sync...").log();
                            }
                            this.modehandling.takeScreen("Take Screen: Watchdog found an async video source - canvas is invisible");
                        } else if (this.properties.isCanvasVisible() && this.properties.isCanvasDimed()) {
                            if (this.target.isTraceEnabled()) {
                                logMessage = this.target.trace();
                                logMessage.append(this.classname).append(".checkForSync - async video source found: VideoMode = Device, canvas is visible BUT popup is open => BORROW video source to get sync...").log();
                            }
                            this.modehandling.borrowScreen("Borrow Screen: Watchdog found an async video source - canvas is visible but a popup is open");
                        } else if (this.properties.isCanvasVisible() && !this.properties.isCanvasDimed() && this.target.isTraceEnabled()) {
                            logMessage = this.target.trace();
                            logMessage.append(this.classname).append(".checkForSync - video source is in sync.").log();
                        }
                    } else if (this.properties.getCurrentScreenSource() == 1) {
                        if (!this.properties.isCanvasVisible() || this.properties.isCanvasDimed()) {
                            if (this.target.isTraceEnabled()) {
                                logMessage = this.target.trace();
                                logMessage.append(this.classname).append(".checkForSync -  video source is in sync.").log();
                            }
                        } else if (this.properties.isCanvasVisible() && !this.properties.isCanvasDimed()) {
                            if (this.target.isTraceEnabled()) {
                                logMessage = this.target.trace();
                                logMessage.append(this.classname).append(".checkForSync - async video source found: VideoMode = HMI but canvas visible and no popup open => REQUEST_UI to get sync...").log();
                            }
                            this.target.getDSICarPlay().requestUI(0);
                        }
                    } else if (this.properties.getCurrentScreenSource() == 0) {
                        if (this.target.isTraceEnabled()) {
                            logMessage = this.target.trace();
                            logMessage.append(this.classname).append(".checkForSync - video source is set to unknown => tell the device the state we are currently in...").log();
                        }
                        if (!this.properties.isCanvasVisible()) {
                            if (this.target.isTraceEnabled()) {
                                logMessage = this.target.trace();
                                logMessage.append(this.classname).append(".checkForSync - canvas is invisible => TAKE video source...").log();
                            }
                            this.modehandling.takeScreen("Take Screen: Watchdog found an async video source - canvas is invisible");
                        } else if (this.properties.isCanvasVisible() && this.properties.isCanvasDimed()) {
                            if (this.target.isTraceEnabled()) {
                                logMessage = this.target.trace();
                                logMessage.append(this.classname).append(".checkForSync - canvas is visible but with popup => BORROW video source...").log();
                            }
                            this.modehandling.borrowScreen("Borrow Screen: Watchdog found an async video source - canvas is visible but a popup is open");
                        } else if (this.properties.isCanvasVisible() && !this.properties.isCanvasDimed()) {
                            if (this.target.isTraceEnabled()) {
                                logMessage = this.target.trace();
                                logMessage.append(this.classname).append(".checkForSync - canvas is visible without a popup => REQUEST_UI...").log();
                            }
                            this.target.getDSICarPlay().requestUI(0);
                        }
                    }
                    if (this.target.isTraceEnabled()) {
                        logMessage = this.target.trace();
                        logMessage.append(this.classname).append(".checkForSync - check audio source sync...").log();
                    }
                    if (this.properties.getCurrentMainAudioSource() != 2) break block56;
                    if (this.properties.isSoundManagementAvailable()) break block57;
                    if (this.target.isTraceEnabled()) {
                        logMessage = this.target.trace();
                        logMessage.append(this.classname).append(".checkForSync - audio source = device but sound management not available => BORROW audio...").log();
                    }
                    this.audiohandling.borrowMainAudio("Borrow audio: audio management is not available (triggered by watchdog)");
                    break block58;
                }
                switch (this.properties.getCurrentMainAudioType()) {
                    case 0: {
                        if (this.target.isTraceEnabled()) {
                            logMessage = this.target.trace();
                            logMessage.append(this.classname).append(".checkForSync - Source = Device, Type = NONE => Nothing to check.").log();
                            break;
                        }
                        break block58;
                    }
                    case 1: {
                        if (this.target.isTraceEnabled()) {
                            logMessage = this.target.trace();
                            logMessage.append(this.classname).append(".checkForSync - Source = Device, Type = Alert => Check ringtone...").log();
                        }
                        if (!this.audiohandling.checkAudioSourceState(this.properties.getRingtoneConnection())) {
                            if (this.target.isTraceEnabled()) {
                                logMessage = this.target.trace();
                                logMessage.append(this.classname).append(".checkForSync - async audio source found - ringtone is not set => TAKE audio...").log();
                            }
                            this.audiohandling.takeMainAudio("Take Audio: Watchdog found an async audio source - ringtone connection is not set");
                            break;
                        }
                        break block58;
                    }
                    case 3: {
                        if (this.target.isTraceEnabled()) {
                            logMessage = this.target.trace();
                            logMessage.append(this.classname).append(".checkForSync - Source = Device, Type = Phone => Check phone and phone input...").log();
                        }
                        if (!this.audiohandling.checkAudioSourceState(151) || !this.audiohandling.checkAudioSourceState(163)) {
                            if (this.target.isTraceEnabled()) {
                                logMessage = this.target.trace();
                                logMessage.append(this.classname).append(".checkForSync - async audio source found - input or output is not set => TAKE audio...").log();
                            }
                            this.audiohandling.takeMainAudio("Take Audio: Watchdog found an async audio source - phone connection is not set (in or out)");
                            break;
                        }
                        break block58;
                    }
                    case 4: {
                        if (this.target.isTraceEnabled()) {
                            logMessage = this.target.trace();
                            logMessage.append(this.classname).append(".checkForSync - Source = Device, Type = Speech => Check speech and speech input...").log();
                        }
                        if (!this.audiohandling.checkAudioSourceState(152) || !this.audiohandling.checkAudioSourceState(153)) {
                            if (this.target.isTraceEnabled()) {
                                logMessage = this.target.trace();
                                logMessage.append(this.classname).append(".checkForSync - async audio source found - input or output is not set => TAKE audio...").log();
                            }
                            this.audiohandling.takeMainAudio("Take Audio: Watchdog found an async audio source - speech connection is not set (in or out)");
                            break;
                        }
                        break block58;
                    }
                    case 2: {
                        if (this.target.isTraceEnabled()) {
                            logMessage = this.target.trace();
                            logMessage.append(this.classname).append(".checkForSync - Source = Device, Type = Media => Check media connection and entertainment manager...").log();
                        }
                        if (!this.audiohandling.checkAudioSourceState(162)) {
                            if (this.target.isTraceEnabled()) {
                                logMessage = this.target.trace();
                                logMessage.append(this.classname).append(".checkForSync - async audio source found - media is not set => TAKE audio...").log();
                            }
                            this.audiohandling.takeMainAudio("Take Audio: Watchdog found an async audio source - media connection is not set");
                            break;
                        }
                        if (!this.properties.isActiveEntertainment()) {
                            if (this.target.isTraceEnabled()) {
                                logMessage = this.target.trace();
                                logMessage.append(this.classname).append(".checkForSync - async audio source found - we are not entertainment source => TAKE audio...").log();
                            }
                            this.audiohandling.takeMainAudio("Take Audio: Watchdog found an async audio source - carplay is not the active entertainment source");
                            break;
                        }
                        break block58;
                    }
                }
                break block58;
            }
            if (this.properties.getCurrentMainAudioSource() == 1) {
                if (this.target.isTraceEnabled()) {
                    logMessage = this.target.trace();
                    logMessage.append(this.classname).append(".checkForSync - Source = MainUnit => check if all audio connections are released...").log();
                }
                if (this.audiohandling.checkAudioSourceState(this.properties.getRingtoneConnection()) || this.audiohandling.checkAudioSourceState(151) || this.audiohandling.checkAudioSourceState(163) || this.audiohandling.checkAudioSourceState(152) || this.audiohandling.checkAudioSourceState(153)) {
                    if (this.target.isTraceEnabled()) {
                        logMessage = this.target.trace();
                        logMessage.append(this.classname).append(".checkForSync - async audio found - one or more audio connections are still present but not needed => release all of them...").log();
                    }
                    this.audiohandling.releaseAllConnections(false, false);
                }
            }
        }
        if (this.target.isTraceEnabled()) {
            logMessage = this.target.trace();
            logMessage.append(this.classname).append(".checkForSync - all sync tests done.").log();
        }
    }

    public void executeTeardown() {
        if (!this.properties.isConnected() || this.properties.getCurrentMainAudioSource() == 1) {
            if (this.target.isTraceEnabled()) {
                LogMessage logMessage = this.target.trace();
                logMessage.append(this.classname).append(".executeTeardown - teardown no longer needed").log();
            }
        } else {
            this.audiohandling.handleAudioSourceChange(0, this.properties.getCurrentMainAudioSource(), true);
            this.properties.setCurrentMainAudioType(0);
        }
    }

    public void executeEdgeDelay() {
        if (!this.properties.isConnected()) {
            if (this.target.isTraceEnabled()) {
                LogMessage logMessage = this.target.trace();
                logMessage.append(this.classname).append(".executeEdgeDelay - disconnected - switch display source no longer needed").log();
            }
        } else if (!this.properties.isDoEdgeDelayExecution()) {
            if (this.target.isTraceEnabled()) {
                LogMessage logMessage = this.target.trace();
                logMessage.append(this.classname).append(".executeEdgeDelay - execution not requested - switch display source not needed").log();
            }
        } else {
            if (!this.properties.isCanvasVisible()) {
                if (this.target.isTraceEnabled()) {
                    this.target.trace("CARPLAY - trigger ASL_SMARTPHONEINTEGRATION_CARPLAY_TRIGGERED_CONTEXTSWITCH_TO_CARPLAY");
                }
                this.target.triggerObserver(672423168, null);
                this.properties.setVideoBorrowState(false);
            }
            if (this.properties.isCanvasDimed()) {
                if (this.target.isTraceEnabled()) {
                    this.target.trace("CARPLAY - screen requested but a popup is still open -> borrow screen back");
                }
                this.modehandling.borrowScreen("Borrow Screen: Screen was requested but a popup is open (during execution of edge delay)");
            }
        }
        this.properties.setDoEdgeDelayExecution(false);
    }

    public void handleAslApiOcuCallState(int n) {
        if (this.properties.isConnected()) {
            if (n != 0) {
                CarPlayHMIRequestParameterConfiguration carPlayHMIRequestParameterConfiguration = this.properties.getParamconfig();
                super.getClass();
                ResourceRequest[] resourceRequestArray = carPlayHMIRequestParameterConfiguration.getRessourceRequest(0);
                CarPlayHMIRequestParameterConfiguration carPlayHMIRequestParameterConfiguration2 = this.properties.getParamconfig();
                super.getClass();
                AppStateRequest[] appStateRequestArray = carPlayHMIRequestParameterConfiguration2.getAppStateRequest(1);
                this.target.getDSICarPlay().requestModeChange(resourceRequestArray, appStateRequestArray, "OCU call has started");
            } else if (this.properties.getOcuCallState() != 0) {
                CarPlayHMIRequestParameterConfiguration carPlayHMIRequestParameterConfiguration = this.properties.getParamconfig();
                super.getClass();
                ResourceRequest[] resourceRequestArray = carPlayHMIRequestParameterConfiguration.getRessourceRequest(0);
                CarPlayHMIRequestParameterConfiguration carPlayHMIRequestParameterConfiguration3 = this.properties.getParamconfig();
                super.getClass();
                AppStateRequest[] appStateRequestArray = carPlayHMIRequestParameterConfiguration3.getAppStateRequest(7);
                this.target.getDSICarPlay().requestModeChange(resourceRequestArray, appStateRequestArray, "OCU call has stopped");
            }
        }
        this.properties.setOcuCallState(n);
    }
}

