/*
 * Decompiled with CFR 0.152.
 */
package de.vw.mib.asl.internal.androidauto.target;

import de.vw.mib.asl.api.androidauto.ASLAndroidAutoFactory;
import de.vw.mib.asl.api.exboxm.ASLExboxmFactory;
import de.vw.mib.asl.api.exboxm.audioinformation.ExboxAudioInformationService;
import de.vw.mib.asl.api.exboxm.guidance.ExboxGuidanceManager;
import de.vw.mib.asl.api.media.ASLMediaFactory;
import de.vw.mib.asl.api.navbap.ASLNavBAPAPI;
import de.vw.mib.asl.api.navbap.ASLNavBAPFactory;
import de.vw.mib.asl.api.navbap.INavLaneGuidanceDataNavBap;
import de.vw.mib.asl.api.navigation.ASLNavigationFactory;
import de.vw.mib.asl.api.navigation.ASLNavigationServices;
import de.vw.mib.asl.api.navigation.util.ASLNavigationUtilFactory;
import de.vw.mib.asl.framework.api.displaymanagement.ASLDisplaymanagementFactory;
import de.vw.mib.asl.framework.api.displaymanagement.displayable.DisplayableService;
import de.vw.mib.asl.framework.api.dsiproxy.DSIProxy;
import de.vw.mib.asl.framework.api.dsiproxy.DSIProxyFactory;
import de.vw.mib.asl.framework.api.dsiproxy.DSIServiceStateListener;
import de.vw.mib.asl.framework.api.framework.ASLFrameworkFactory;
import de.vw.mib.asl.framework.internal.framework.AbstractASLTarget;
import de.vw.mib.asl.framework.internal.framework.GenericCollector;
import de.vw.mib.asl.framework.internal.framework.ServiceManager;
import de.vw.mib.asl.framework.internal.framework.dsi.util.RuntimeGeneratedConstants;
import de.vw.mib.asl.internal.androidauto.api.impl.ASLAndroidAutoExBoxServiceImpl;
import de.vw.mib.asl.internal.androidauto.api.impl.ExboxGuidanceListenerImpl;
import de.vw.mib.asl.internal.androidauto.target.ASLEventHandler;
import de.vw.mib.asl.internal.androidauto.target.ASLHandler;
import de.vw.mib.asl.internal.androidauto.target.AndroidAutoGlobalProperties;
import de.vw.mib.asl.internal.androidauto.target.AudioHandler;
import de.vw.mib.asl.internal.androidauto.target.DSIHandler;
import de.vw.mib.asl.internal.androidauto.target.DisplayableListener;
import de.vw.mib.asl.internal.androidauto.target.KeyHandler;
import de.vw.mib.asl.internal.androidauto.target.NavigationListener;
import de.vw.mib.asl.internal.androidauto.target.PopupHandler;
import de.vw.mib.asl.internal.androidauto.target.RequestHandler;
import de.vw.mib.asl.internal.androidauto.target.SpeechHandler;
import de.vw.mib.asl.internal.androidauto.target.StartupHandler;
import de.vw.mib.asl.internal.androidauto.target.TimerHandler;
import de.vw.mib.asl.internal.exboxm.api.impl.ASLExboxmAPIImpl;
import de.vw.mib.asl.internal.exboxm.api.impl.audioinformation.ExboxAudioInformationServiceImpl;
import de.vw.mib.asl.internal.list.impl.GenericASLList;
import de.vw.mib.asl.internal.navigation.bap.HsmTargetBap;
import de.vw.mib.asl.internal.navigation.bap.api.impl.INavLaneGuidanceDataNavBapImpl;
import de.vw.mib.asl.internal.navigation.gateway.NavGateway;
import de.vw.mib.bap.mqbab2.common.api.APIFactory;
import de.vw.mib.bap.mqbab2.common.api.navigation.NavigationASLDataAdapter;
import de.vw.mib.bap.mqbab2.common.api.navigation.datatypes.NavigationDistanceToNextManeuver;
import de.vw.mib.bap.mqbab2.common.api.navigation.datatypes.iterator.elements.NavigationManeuverDescriptorElement;
import de.vw.mib.bap.mqbab2.navsd.controller.NavSdTarget;
import de.vw.mib.bap.mqbpq.navsd.functions.NavSDBindingFactoryAll;
import de.vw.mib.bap.mqbab2.navsd.functions.RGStatus;
import de.vw.mib.bap.mqbpq.navsd.functions.DistanceToNextManeuver;
import de.vw.mib.bap.mqbpq.navsd.functions.RouteGuidanceStatus;
import de.vw.mib.genericevents.EventGeneric;
import de.vw.mib.genericevents.GenericEvents;
import de.vw.mib.log4mib.LogMessage;
import de.vw.mib.threads.AsyncServiceFactory;
import de.vw.mib.util.Util;
import generated.de.vw.mib.asl.internal.ListManager;
import org.dsi.ifc.androidauto2.*;
import org.dsi.ifc.base.DSIListener;
import org.dsi.ifc.global.ResourceLocator;
import org.dsi.ifc.navigation.BapManeuverDescriptor;
import org.dsi.ifc.navigation.NavLaneGuidanceData;
import org.dsi.ifc.tmc.TmcMessage;
import org.osgi.framework.ServiceReference;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class AndroidAutoTarget
        extends AbstractASLTarget
        implements DSIServiceStateListener {
    private TimerHandler timerHandler;
    private ASLHandler aslHandler;
    private ASLEventHandler aslEventHandler;
    private DSIHandler dsihandler;
    private AudioHandler audioHandler;
    private AndroidAutoGlobalProperties properties;
    private StartupHandler startupHandler;
    private NavigationListener navigationListener;
    private RequestHandler requestHandler;
    private SpeechHandler speechHandler;
    private KeyHandler keyHandler;
    private PopupHandler popupHandler;
    private DisplayableListener displayableListener;
    private ASLNavigationServices navServices;
    private ExboxGuidanceListenerImpl exboxGuidanceListenerImpl;
    private DisplayableService dispService;
    private DSIAndroidAuto2 dsiAndroidAuto2;
    private DSIListener dsiAndroidAuto2Listener;
    private boolean targetStarted = false;
    boolean dsiSmartPhoneIntegrationAvailable = false;
    private /*final*/ String _classname = "AndroidAutoTarget";
    private ASLAndroidAutoExBoxServiceImpl apiImpl;
    private NavigationHandler navigationHandler;

    /*final*/ int[] OBSERVED_EVENTS = new int[]{
            6100005,
            6100006,
            6100016,
            6100017,
            6100025,
            4000045,
            4000015,
            4000024,
            4000021,
            4000007,
            4300038,
    };
    /*final*/ int[] DSI_ANDROIDAUTO2_ATTR = new int[]{ 1, 6, 2 , 3, 4 , 5 , 7 , 8 };
    static /* synthetic */ Class class$org$dsi$ifc$androidauto2$DSIAndroidAuto2;
    static /* synthetic */ Class class$org$dsi$ifc$androidauto2$DSIAndroidAuto2Listener;
    static /* synthetic */ Class class$de$vw$mib$threads$AsyncServiceFactory;
    static /* synthetic */ Class class$de$vw$mib$popup$PopupInformationHandler;

    public AndroidAutoTarget(GenericEvents genericEvents, int n, String string) {
        super(genericEvents, n, string);
        System.out.println("AADEBUG: Target AndroidAuto - Initialising Target AndroidAuto (1)! ");

        if (this.isTraceEnabled()) {
            this.trace("Target AndroidAuto - Initialising Target AndroidAuto (1)!");
        }
        this.initHandler();
    }

    public AndroidAutoTarget(GenericEvents genericEvents, String string) {
        super(genericEvents, string);
        System.out.println("AADEBUG: Target AndroidAuto - Initialising Target AndroidAuto (2)! ");

        if (this.isTraceEnabled()) {
            this.trace("Target AndroidAuto - Initialising Target AndroidAuto (2)!");
        }
        this.initHandler();
    }

    public AndroidAutoTarget(GenericEvents genericEvents, int n) {
        super(genericEvents, n);
        System.out.println("AADEBUG: Target AndroidAuto - Initialising Target AndroidAuto (3)! ");


        if (this.isTraceEnabled()) {
            this.trace("Target AndroidAuto - Initialising Target AndroidAuto (3)!");
        }
        this.initHandler();
    }

    private void initHandler() {
        if (this.isTraceEnabled()) {
            this.trace("AndroidAutoTarget::initHandler()");
        }
        this.properties = new AndroidAutoGlobalProperties();
        this.startupHandler = new StartupHandler(this);
        this.audioHandler = new AudioHandler(this, this.properties, this.startupHandler);
        this.speechHandler = new SpeechHandler(this, ServiceManager.bundleContext, this.properties, this.startupHandler, this.audioHandler);
        this.requestHandler = new RequestHandler(this, this.properties, this.startupHandler, this.audioHandler, this.speechHandler);
        this.dsihandler = new DSIHandler(this, this.audioHandler, this.requestHandler);
        this.aslHandler = new ASLHandler(this, this.properties, this.startupHandler, this.audioHandler, this.speechHandler);
        this.aslEventHandler = new ASLEventHandler(this, this.audioHandler, this.aslHandler);
        this.popupHandler = new PopupHandler(this);
        this.displayableListener = new DisplayableListener(this, this.properties, this.startupHandler);
        this.keyHandler = new KeyHandler(this, this.properties, this.startupHandler, this.speechHandler);
        this.navigationListener = new NavigationListener(this, this.properties, this.startupHandler);
        this.timerHandler = new TimerHandler(this, this.audioHandler, this.requestHandler);
        ExboxGuidanceManager exboxGuidanceManager = ASLExboxmFactory.getExboxmApi().getExboxGuidanceManager();
        this.exboxGuidanceListenerImpl = new ExboxGuidanceListenerImpl(this.navigationListener, exboxGuidanceManager);
        this.navigationHandler = new NavigationHandler();
        this.requestHandler.initNavigationListener(this.navigationListener);
        this.aslHandler.initNavigationListener(this.navigationListener);
        this.audioHandler.initTimerHandler(this.timerHandler);
        this.requestHandler.initTimerHandler(this.timerHandler);
        this.aslHandler.initTimerHandler(this.timerHandler);
        this.requestHandler.initExBoxNavServices(this.exboxGuidanceListenerImpl);

        System.out.println("AADEBUG: initHandler targetId: " + this.getTargetId() + " default: " + this.getDefaultTargetId() + "classifier: " + this.getClassifier() + " subClassifier: " + this.getSubClassifier());
    }


    // @Override
    public void gotEvent(EventGeneric eventGeneric) {
        //System.out.println("AADEBUG: Target AndroidAuto - gotEvent() " + eventGeneric.toString());
        //System.out.println("AADEBUG: eventId: " + eventGeneric.getReceiverEventId());
        if (this.aslEventHandler == null) {
            if (this.isTraceEnabled()) {
                this.warn("Target AndroidAuto - got an event! target is not fully startet yet - event will be ignored");
            }
        } else {
            if (this.isTraceEnabled()) {
                this.trace("Target AndroidAuto - got an event! target is set, call event handling");
            }
            this.aslEventHandler.handleEvent(eventGeneric);
        }
    }

    public void initializeDSI() {
        System.out.println("AADEBUG: initializeDSI()");

        if (this.isTraceEnabled()) {
            this.trace().append("AndroidAutoTarget").append(".initializeDSI()").log();
        }
        DSIProxy object = DSIProxyFactory.getDSIProxyAPI().getDSIProxy();
        this.dsiAndroidAuto2 = (DSIAndroidAuto2) object.getService(this, class$org$dsi$ifc$androidauto2$DSIAndroidAuto2 == null ? (class$org$dsi$ifc$androidauto2$DSIAndroidAuto2 = AndroidAutoTarget.class$("org.dsi.ifc.androidauto2.DSIAndroidAuto2")) : class$org$dsi$ifc$androidauto2$DSIAndroidAuto2);
        if (this.isTraceEnabled()) {
            this.trace("Target AndroidAuto - createDSIListenerMethodAdapter! ");
        }
        this.dsiAndroidAuto2Listener = object.getAdapterFactory().createDSIListenerMethodAdapter(this, class$org$dsi$ifc$androidauto2$DSIAndroidAuto2Listener == null ? (class$org$dsi$ifc$androidauto2$DSIAndroidAuto2Listener = AndroidAutoTarget.class$("org.dsi.ifc.androidauto2.DSIAndroidAuto2Listener")) : class$org$dsi$ifc$androidauto2$DSIAndroidAuto2Listener);
        if (this.isTraceEnabled()) {
            this.trace("Target AndroidAuto - createDSIListenerMethodAdapter finished!");
        }
        if (this.isTraceEnabled()) {
            this.trace("Target AndroidAuto - Listener is set, now add response listener!");
        }
        object.addResponseListener(this, class$org$dsi$ifc$androidauto2$DSIAndroidAuto2Listener == null ? (class$org$dsi$ifc$androidauto2$DSIAndroidAuto2Listener = AndroidAutoTarget.class$("org.dsi.ifc.androidauto2.DSIAndroidAuto2Listener")) : class$org$dsi$ifc$androidauto2$DSIAndroidAuto2Listener, this.dsiAndroidAuto2Listener);
        if (this.isTraceEnabled()) {
            this.trace("Target AndroidAuto - service set, now set notification!");
        }
        this.dsiAndroidAuto2.setNotification(this.DSI_ANDROIDAUTO2_ATTR, this.dsiAndroidAuto2Listener);

        boolean c1 = class$org$dsi$ifc$androidauto2$DSIAndroidAuto2Listener != null;
        boolean c2 = class$org$dsi$ifc$androidauto2$DSIAndroidAuto2Listener != null;
        System.out.println("AADEBUG: class$org$dsi$ifc$androidauto2$DSIAndroidAuto2: " + c1 + " class$org$dsi$ifc$androidauto2$DSIAndroidAuto2Listener: " + c2);

        boolean c3 = class$de$vw$mib$threads$AsyncServiceFactory != null;
        boolean c4 = class$de$vw$mib$popup$PopupInformationHandler != null;
        System.out.println("AADEBUG: class$de$vw$mib$threads$AsyncServiceFactory: " + c3 + " class$de$vw$mib$popup$PopupInformationHandler: " + c4);

    }

    private void deInitializeDSI() {
        if (this.dsiAndroidAuto2Listener != null) {
            DSIProxyFactory.getDSIProxyAPI().getDSIProxy().removeResponseListener(this, class$org$dsi$ifc$androidauto2$DSIAndroidAuto2Listener == null ? (class$org$dsi$ifc$androidauto2$DSIAndroidAuto2Listener = AndroidAutoTarget.class$("org.dsi.ifc.androidauto2.DSIAndroidAuto2Listener")) : class$org$dsi$ifc$androidauto2$DSIAndroidAuto2Listener, this.dsiAndroidAuto2Listener);
        }
        this.dsiAndroidAuto2Listener = null;
    }

    public DSIAndroidAuto2 getDSIAndroidAuto2() {
        if (!this.startupHandler.isDSI2Registered()) {
            this.warn().append("AndroidAutoTarget").append(".getDSIAndroidAuto2() Invalid DSI instance").log();
        }
        return this.dsiAndroidAuto2;
    }

    public void startup() {
        System.out.println("AADEBUG: startup()");
        if (this.isTraceEnabled()) {
            this.trace().append("AndroidAutoTarget").append(".startup()").log();
        }
        DSIProxyFactory.getDSIProxyAPI().getDSIProxy().addServiceStateListener(class$org$dsi$ifc$androidauto2$DSIAndroidAuto2 == null ? (class$org$dsi$ifc$androidauto2$DSIAndroidAuto2 = AndroidAutoTarget.class$("org.dsi.ifc.androidauto2.DSIAndroidAuto2")) : class$org$dsi$ifc$androidauto2$DSIAndroidAuto2, this);
        this.addObservers(this.OBSERVED_EVENTS);
        this.targetStarted = true;
        ServiceReference[] serviceReferenceArray = ServiceManager.bundleContext.getServiceReferences((class$de$vw$mib$threads$AsyncServiceFactory == null ? (class$de$vw$mib$threads$AsyncServiceFactory = AndroidAutoTarget.class$("de.vw.mib.threads.AsyncServiceFactory")) : class$de$vw$mib$threads$AsyncServiceFactory).getName(), "(MIBThreadId=3)");
        AsyncServiceFactory asyncServiceFactory = (AsyncServiceFactory) ServiceManager.bundleContext.getService(serviceReferenceArray[0]);
        ServiceManager.bundleContext.registerService((class$de$vw$mib$popup$PopupInformationHandler == null ? (class$de$vw$mib$popup$PopupInformationHandler = AndroidAutoTarget.class$("de.vw.mib.popup.PopupInformationHandler")) : class$de$vw$mib$popup$PopupInformationHandler).getName(), asyncServiceFactory.create(this.popupHandler, new Class[]{class$de$vw$mib$popup$PopupInformationHandler == null ? (class$de$vw$mib$popup$PopupInformationHandler = AndroidAutoTarget.class$("de.vw.mib.popup.PopupInformationHandler")) : class$de$vw$mib$popup$PopupInformationHandler}), null);
        if (this.exboxGuidanceListenerImpl != null) {
            this.exboxGuidanceListenerImpl.startup();
        }
    }

    public void shutdown() {
        System.out.println("AADEBUG: shutdown()");

        if (this.isTraceEnabled()) {
            this.trace().append("AndroidAutoTarget").append(".shutdown()").log();
        }
        if (this.targetStarted) {
            DSIProxyFactory.getDSIProxyAPI().getDSIProxy().removeServiceStateListener(class$org$dsi$ifc$androidauto2$DSIAndroidAuto2 == null ? (class$org$dsi$ifc$androidauto2$DSIAndroidAuto2 = AndroidAutoTarget.class$("org.dsi.ifc.androidauto2.DSIAndroidAuto2")) : class$org$dsi$ifc$androidauto2$DSIAndroidAuto2, this);
            this.removeObservers(this.OBSERVED_EVENTS);
            this.deInitializeDSI();
            this.targetStarted = false;
        }
        if (this.exboxGuidanceListenerImpl != null) {
            this.exboxGuidanceListenerImpl.shutdown();
        }
    }

    // @Override
    public int getClassifier() {
        return 8388678;
    }

    // @Override
    public int getSubClassifier() {
        return 1;
    }

    // @Override
    public int getDefaultTargetId() {
        return 1590002;
    }


    // @Override
    public void registered(String string, int n) {
        System.out.println("AADEBUG: registered() trace: " + this.isTraceEnabled());
        String string2 = string.intern();
        if (this.isTraceEnabled()) {
            LogMessage logMessage = this.trace();
            logMessage.append("AndroidAutoTarget").append(".registered(").append(Util.isNullOrEmpty(string2) ? "<null>" : string).append(", ").append(n).append(")").log();
        }
        if (string2.equals(RuntimeGeneratedConstants.SERVICE_TS_NS[2])) {
            this.initializeDSI();
            this.audioHandler.registerTargetToEntertainmentManager();
            this.startupHandler.setDSI2Registered(true);
            this.navServices = ASLNavigationFactory.getNavigationApi().getASLNavigationServices(this.navigationListener);
            this.navigationListener.initNavServices(this.navServices);
            this.apiImpl = (ASLAndroidAutoExBoxServiceImpl) ASLAndroidAutoFactory.getAndroidAutoApi().getExBoxService();
            this.apiImpl.setTarget(this);
        }
        if (this.isTraceEnabled()) {
            this.trace(new StringBuffer().append("==> startuphandler.isDSI2Registered() = ").append(this.startupHandler.isDSI2Registered()).toString());
        }
        this.dispService = ASLDisplaymanagementFactory.getDisplaymanagementApi().getDisplayableService();
        this.trace(new StringBuffer().append("dispService           = ").append(this.dispService).toString());
        this.trace(new StringBuffer().append("displayableListener   = ").append(this.displayableListener).toString());
        if (this.dispService != null) {
            this.trace("TargetAndroidAutoDSI#dispService.addListener( displayableListener );");
            this.dispService.addListener(this.displayableListener);
        }
    }

    // @Override
    public void unregistered(String string, int n) {
        String string2 = string.intern();
        if (this.isTraceEnabled()) {
            LogMessage logMessage = this.trace();
            logMessage.append("AndroidAutoTarget").append(".unregistered(").append(Util.isNullOrEmpty(string2) ? "<null>" : string).append(", ").append(n).append(")").log();
        }
        if (string2.equals(RuntimeGeneratedConstants.SERVICE_TS_NS[2])) {
            this.deInitializeDSI();
            this.startupHandler.setDSI2Registered(false);
        }
        if (this.dispService != null) {
            this.trace("TargetAndroidAutoDSI#dispService.removeListener( displayableListener );");
            this.dispService.removeListener(this.displayableListener);
        }
    }

    public RequestHandler getRequestHandler() {
        return this.requestHandler;
    }

    public void dsiAndroidAuto2VideoFocusRequestNotification(int n, int n2) {
        System.out.println("AADEBUG: dsiAndroidAuto2VideoFocusRequestNotification()" + " n:" + n + " n2: "+ n2);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#videoFocusRequestNotification called");
        }
        this.dsihandler.handleDsiAndroidAuto2VideoFocusRequestNotification(n, n2);
    }

    public void dsiAndroidAuto2VideoAvailable(boolean bl, int n) {
        System.out.println("AADEBUG: dsiAndroidAuto2VideoAvailable()" + " n:" + n + " bl: " + bl);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#videoAvailable called");
        }
        this.dsihandler.handleDsiAndroidAuto2VideoAvailable(bl, n);
    }

    public void dsiAndroidAuto2AudioFocusRequestNotification(int n, int n2) {
        System.out.println("AADEBUG: dsiAndroidAuto2AudioFocusRequestNotification()" + " n:" + n + " n2: "+ n2);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#audioFocusRequestNotification called");
        }
        this.dsihandler.handleDsiAndroidAuto2AudioFocusRequestNotification(n, n2);
    }

    public void dsiAndroidAuto2AudioAvailable(int n, boolean bl, int n2) {
        System.out.println("AADEBUG: dsiAndroidAuto2AudioAvailable()" + " n:" + n + " bl: " + bl + " n2: "+ n2);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#audioAvailable called");
        }
        System.out.println("AADEBUG dsiAndroidAuto2AudioAvailable n: " + n + " n2: " + n2 + " bl: " + bl);
        this.dsihandler.handleDsiAndroidAuto2AudioAvailable(n, bl, n2);
    }

    public void dsiAndroidAuto2VoiceSessionNotification(int n, int n2) {
        System.out.println("AADEBUG: dsiAndroidAuto2VoiceSessionNotification()" + " n:" + n + " n2: "+ n2);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#voiceSessionNotification called");
        }
        this.dsihandler.handleDsiAndroidAuto2VoiceSessionNotification(n, n2);
    }

    public void dsiAndroidAuto2MicrophoneRequestNotification(int n, int n2) {
        System.out.println("AADEBUG: dsiAndroidAuto2MicrophoneRequestNotification()" + " n:" + n + " n2: "+ n2);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#microphoneRequestNotification called");
        }
        this.dsihandler.handleDsiAndroidAuto2MicrophoneRequestNotification(n, n2);
    }

    public void dsiAndroidAuto2NavFocusRequestNotification(int focus, int valid) {
        System.out.println("AADEBUG: dsiAndroidAuto2NavFocusRequestNotification()" + " focus:" + focus + " n2: "+ valid);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#navFocusRequestNotification called");
        }
        this.dsihandler.handleDsiAndroidAuto2NavFocusRequestNotification(focus, valid);

        if (valid == 1) {
            this.navigationHandler.navigationFocus(focus);
        }
    }

    public void dsiAndroidAuto2UpdateCallState(CallState[] callStateArray, int n) {
        System.out.println("AADEBUG: dsiAndroidAuto2UpdateCallState()" + " n:" + n + " callStateArray.length: " + callStateArray.length);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#updateCallState called");
        }
    }

    public void dsiAndroidAuto2UpdateTelephonyState(TelephonyState telephonyState, int n) {
        System.out.println("AADEBUG: dsiAndroidAuto2UpdateTelephonyState()" + " n:" + n + " telephonyState: " + telephonyState);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#updateTelephonyState called");
        }
    }

    public void dsiAndroidAuto2UpdateNowPlayingData(TrackData trackData, int valid) {
        System.out.println("AADEBUG: dsiAndroidAuto2UpdateNowPlayingData()" + " trackData: " + trackData + " valid: " + valid);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#updateNowPlayingData called");
        }

        //DsiAudioInformationListener listener = new DsiAudioInformationListener()

        /*ASLExboxmAPIImpl exboxmAPI = new ASLExboxmAPIImpl();
        ExboxAudioInformationServiceImpl impl = (ExboxAudioInformationServiceImpl) exboxmAPI.getAudioInformationService().getCurrentStationInfo();
        impl.*/
    }

    public void dsiAndroidAuto2UpdatePlaybackState(PlaybackInfo playbackInfo, int valid) {
        System.out.println("AADEBUG: dsiAndroidAuto2UpdatePlaybackState()" + " playbackInfo: " + playbackInfo + " valid: " + valid);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#updatePlaybackState called");
        }
    }

    public void dsiAndroidAuto2UpdatePlayposition(int timePosition, int valid) {
        System.out.println("AADEBUG: dsiAndroidAuto2UpdatePlayposition()" + " timePosition:" + timePosition + " valid: " + valid);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#updateServiceStatus called");
        }
    }

    public void dsiAndroidAuto2UpdateCoverArtUrl(ResourceLocator resourceLocator, int n) {
        System.out.println("AADEBUG: dsiAndroidAuto2UpdateCoverArtUrl()" + " resourceLocator: " + resourceLocator + " n: " + n);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#updateCoverArtUrl called");
        }
        System.out.println("AADEBUG dsiAndroidAuto2UpdateCoverArtUrl " + resourceLocator.url);

    }

    public void dsiAndroidAuto2UpdateNavigationNextTurnEvent(String road, int turnSide, int event, int turnAngle, int turnNumber, int valid) {
        System.out.println("AADEBUG: dsiAndroidAuto2UpdateNavigationNextTurnEvent()" + " road: " + road + " turnSide: " + turnSide + " event: " + event + " turnAngle: " + turnAngle + " turnNumber: " + turnNumber + " valid: " + valid);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#updateNavigationNextTurnEvent called");
        }

        if (valid == 1) {
            this.navigationHandler.handleNextTurnEvent(road, turnSide, event, turnAngle, turnNumber);
        }
    }

    public void dsiAndroidAuto2UpdateNavigationNextTurnDistance(int distanceMeters, int timeSeconds, int valid) {
        System.out.println("AADEBUG: dsiAndroidAuto2UpdateNavigationNextTurnDistance()" + " distanceMeters: " + distanceMeters + " timeSeconds: " + timeSeconds + " valid: " + valid);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#updateNavigationNextTurnDistance called");
        }

        if (valid == 1) {
            this.navigationHandler.handleUpdateNextTurnDistanceEvent(distanceMeters, timeSeconds);
        }
    }

    public void dsiAndroidAuto2SetExternalDestination(double d2, double d3, String string, String string2) {
        System.out.println("AADEBUG: dsiAndroidAuto2SetExternalDestination()" + " d2: " + d2 + " d3: " + d3 + " string: " + string + " string2: " + string2);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#setExternalDestination called");
        }
    }

    public void dsiAndroidAuto2BluetoothPairingRequest(String string, int n) {
        System.out.println("AADEBUG: dsiAndroidAuto2BluetoothPairingRequest()" + " string: " + string + " n: " + n);
        if (this.isTraceEnabled()) {
            this.trace("TargetAndroidAuto2DSI#bluetoothPairingRequest called");
        }
    }

    static /* synthetic */ Class class$(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classNotFoundException) {
            try {
                throw new NoClassDefFoundError().initCause(classNotFoundException);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }
}

