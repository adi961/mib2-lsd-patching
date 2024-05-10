/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.smartphoneintegration.sm;

import de.vw.mib.genericevents.EventGeneric;
import de.vw.mib.sm.internal.statemachine.TopStatemachine;
import generated.de.vw.mib.global.datapool.SkinDataPool;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineActivityBase;

public class SmartPhoneIntegrationActivity
extends StatemachineActivityBase {
    private final int subStatemachineId;

    public SmartPhoneIntegrationActivity(TopStatemachine topStatemachine, int n, int n2, int n3, int n4, int n5) {
        super(topStatemachine, n2, n3, n4, n5);
        this.subStatemachineId = n;
    }

    @Override
    public void performStateEntryAction(int n, boolean bl) {
        switch (this.subStatemachineId) {
            case 573: {
                this.performStateEntryAction_SubPopupPoSmiAlertIncompatibleDeviceDynState(n, bl);
                break;
            }
            case 574: {
                this.performStateEntryAction_SubPopupPoSmiCarlifeNoVideoContentDynState(n, bl);
                break;
            }
            case 575: {
                this.performStateEntryAction_SubPopupPoSmiConfirmConnectDetectedCarplayDeviceDynState(n, bl);
                break;
            }
            case 576: {
                this.performStateEntryAction_SubPopupPoSmiConfirmExternalDataTransferDynState(n, bl);
                break;
            }
            case 577: {
                this.performStateEntryAction_SubPopupPoSmiConfirmNewAppleDeviceDynState(n, bl);
                break;
            }
            case 578: {
                this.performStateEntryAction_SubPopupPoSmiInfoConnectionFailedDynState(n, bl);
                break;
            }
            case 579: {
                this.performStateEntryAction_SubPopupPoSmiInfoDisconnectDynState(n, bl);
                break;
            }
            case 580: {
                this.performStateEntryAction_SubPopupPoSmiInfoNotSwapDynState(n, bl);
                break;
            }
            case 581: {
                this.performStateEntryAction_SubPopupPoSmiInfoNoConnectionDuringCallDynState(n, bl);
                break;
            }
            case 582: {
                this.performStateEntryAction_SubPopupPoSmiInfoStartConnectionDynState(n, bl);
                break;
            }
            case 43: {
                this.performStateEntryAction_SubHapticSmartphoneintegrationDynState(n, bl);
                break;
            }
            case 635: {
                this.performStateEntryAction_SubCSmiSetupIncludeState(n, bl);
                break;
            }
            case 637: {
                this.performStateEntryAction_SubIAndroidautoBridge(n, bl);
                break;
            }
            case 649: {
                this.performStateEntryAction_SubICarlifeBridge(n, bl);
                break;
            }
            case 650: {
                this.performStateEntryAction_SubICarplayBridge(n, bl);
                break;
            }
            case 656: {
                this.performStateEntryAction_SubIGenericDomainErrorBridge(n, bl);
                break;
            }
            case 657: {
                this.performStateEntryAction_SubIGenericDomainNotAvailableBridge(n, bl);
                break;
            }
            case 658: {
                this.performStateEntryAction_SubIGenericDomainNotAvailableSwapBridge(n, bl);
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public void performStateExitAction(int n) {
        switch (this.subStatemachineId) {
            case 573: {
                this.performStateExitAction_SubPopupPoSmiAlertIncompatibleDeviceDynState(n);
                break;
            }
            case 574: {
                this.performStateExitAction_SubPopupPoSmiCarlifeNoVideoContentDynState(n);
                break;
            }
            case 575: {
                this.performStateExitAction_SubPopupPoSmiConfirmConnectDetectedCarplayDeviceDynState(n);
                break;
            }
            case 576: {
                this.performStateExitAction_SubPopupPoSmiConfirmExternalDataTransferDynState(n);
                break;
            }
            case 577: {
                this.performStateExitAction_SubPopupPoSmiConfirmNewAppleDeviceDynState(n);
                break;
            }
            case 578: {
                this.performStateExitAction_SubPopupPoSmiInfoConnectionFailedDynState(n);
                break;
            }
            case 579: {
                this.performStateExitAction_SubPopupPoSmiInfoDisconnectDynState(n);
                break;
            }
            case 580: {
                this.performStateExitAction_SubPopupPoSmiInfoNotSwapDynState(n);
                break;
            }
            case 581: {
                this.performStateExitAction_SubPopupPoSmiInfoNoConnectionDuringCallDynState(n);
                break;
            }
            case 582: {
                this.performStateExitAction_SubPopupPoSmiInfoStartConnectionDynState(n);
                break;
            }
            case 43: {
                this.performStateExitAction_SubHapticSmartphoneintegrationDynState(n);
                break;
            }
            case 635: {
                this.performStateExitAction_SubCSmiSetupIncludeState(n);
                break;
            }
            case 637: {
                this.performStateExitAction_SubIAndroidautoBridge(n);
                break;
            }
            case 649: {
                this.performStateExitAction_SubICarlifeBridge(n);
                break;
            }
            case 650: {
                this.performStateExitAction_SubICarplayBridge(n);
                break;
            }
            case 656: {
                this.performStateExitAction_SubIGenericDomainErrorBridge(n);
                break;
            }
            case 657: {
                this.performStateExitAction_SubIGenericDomainNotAvailableBridge(n);
                break;
            }
            case 658: {
                this.performStateExitAction_SubIGenericDomainNotAvailableSwapBridge(n);
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public void performStateFocusGainedAction(int n) {
        switch (this.subStatemachineId) {
            default: 
        }
    }

    @Override
    public void performStateFocusLostAction(int n) {
        switch (this.subStatemachineId) {
            default: 
        }
    }

    @Override
    public boolean evalInternalTransitionGuard(int n) {
        switch (this.subStatemachineId) {
            case 43: {
                return this.evalInternalTransitionGuard_SubHapticSmartphoneintegrationDynState(n);
            }
            case 637: {
                return this.evalInternalTransitionGuard_SubIAndroidautoBridge(n);
            }
            case 649: {
                return this.evalInternalTransitionGuard_SubICarlifeBridge(n);
            }
            case 650: {
                return this.evalInternalTransitionGuard_SubICarplayBridge(n);
            }
        }
        return true;
    }

    @Override
    public void performInternalTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 43: {
                this.performInternalTransitionAction_SubHapticSmartphoneintegrationDynState(n);
                break;
            }
            case 635: {
                this.performInternalTransitionAction_SubCSmiSetupIncludeState(n);
                break;
            }
            case 637: {
                this.performInternalTransitionAction_SubIAndroidautoBridge(n);
                break;
            }
            case 649: {
                this.performInternalTransitionAction_SubICarlifeBridge(n);
                break;
            }
            case 650: {
                this.performInternalTransitionAction_SubICarplayBridge(n);
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public boolean evalTriggeredTransitionGuard(int n) {
        switch (this.subStatemachineId) {
            case 43: {
                return this.evalTriggeredTransitionGuard_SubHapticSmartphoneintegrationDynState(n);
            }
        }
        return true;
    }

    @Override
    public void performTriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 575: {
                this.performTriggeredTransitionAction_SubPopupPoSmiConfirmConnectDetectedCarplayDeviceDynState(n);
                break;
            }
            case 576: {
                this.performTriggeredTransitionAction_SubPopupPoSmiConfirmExternalDataTransferDynState(n);
                break;
            }
            case 577: {
                this.performTriggeredTransitionAction_SubPopupPoSmiConfirmNewAppleDeviceDynState(n);
                break;
            }
            case 43: {
                this.performTriggeredTransitionAction_SubHapticSmartphoneintegrationDynState(n);
                break;
            }
            case 635: {
                this.performTriggeredTransitionAction_SubCSmiSetupIncludeState(n);
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public boolean evalUntriggeredTransitionGuard(int n) {
        switch (this.subStatemachineId) {
            case 574: {
                return this.evalUntriggeredTransitionGuard_SubPopupPoSmiCarlifeNoVideoContentDynState(n);
            }
            case 43: {
                return this.evalUntriggeredTransitionGuard_SubHapticSmartphoneintegrationDynState(n);
            }
        }
        return true;
    }

    @Override
    public void performUntriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 43: {
                this.performUntriggeredTransitionAction_SubHapticSmartphoneintegrationDynState(n);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoSmiAlertIncompatibleDeviceDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Psaid_B535", 573, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoSmiAlertIncompatibleDeviceDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                SmartPhoneIntegrationActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Psaid_B535");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoSmiCarlifeNoVideoContentDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setBoolean(20669, true);
                break;
            }
            case 4: {
                this.enterPopupView("Pscnvc1", 574, 4);
                break;
            }
            case 5: {
                this.enterPopupView("Pscnvc2", 574, 5);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoSmiCarlifeNoVideoContentDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                SmartPhoneIntegrationActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                this.setBoolean(20669, false);
                break;
            }
            case 4: {
                this.leavePopupView("Pscnvc1");
                break;
            }
            case 5: {
                this.leavePopupView("Pscnvc2");
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubPopupPoSmiCarlifeNoVideoContentDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                return !this.getBoolean(1790771200);
            }
        }
        return true;
    }

    private void performStateEntryAction_SubPopupPoSmiConfirmConnectDetectedCarplayDeviceDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(-404684800, 1);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-404684800));
                this.triggerObserver(775957568, eventGeneric);
                break;
            }
            case 3: {
                this.enterPopupView("Psccdcd", 575, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoSmiConfirmConnectDetectedCarplayDeviceDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                SmartPhoneIntegrationActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                this.setInteger(-404684800, 0);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-404684800));
                this.triggerObserver(775957568, eventGeneric);
                break;
            }
            case 3: {
                this.leavePopupView("Psccdcd");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoSmiConfirmConnectDetectedCarplayDeviceDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoSmiConfirmConnectDetectedCarplayDeviceDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoSmiConfirmConnectDetectedCarplayDeviceDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.setInteger(-1865023488, 0);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1865023488));
                this.triggerObserver(843066432, eventGeneric);
                break;
            }
            case 1: {
                this.setInteger(-1865023488, 1);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1865023488));
                this.triggerObserver(843066432, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoSmiConfirmExternalDataTransferDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pscedt", 576, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoSmiConfirmExternalDataTransferDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                SmartPhoneIntegrationActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pscedt");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoSmiConfirmExternalDataTransferDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoSmiConfirmExternalDataTransferDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoSmiConfirmExternalDataTransferDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(15222));
                eventGeneric.setInt(1, this.getInteger(-107085824));
                this.triggerObserver(792734784, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoSmiConfirmNewAppleDeviceDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(-404684800, 1);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-404684800));
                this.triggerObserver(775957568, eventGeneric);
                break;
            }
            case 3: {
                this.enterPopupView("Pscnad", 577, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoSmiConfirmNewAppleDeviceDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                SmartPhoneIntegrationActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                this.setInteger(-404684800, 0);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-404684800));
                this.triggerObserver(775957568, eventGeneric);
                break;
            }
            case 3: {
                this.leavePopupView("Pscnad");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoSmiConfirmNewAppleDeviceDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoSmiConfirmNewAppleDeviceDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoSmiConfirmNewAppleDeviceDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.setInteger(-1820131328, 2);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1820131328));
                this.triggerObserver(1010838592, eventGeneric);
                break;
            }
            case 1: {
                this.setInteger(-1820131328, 1);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1820131328));
                this.triggerObserver(1010838592, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoSmiInfoConnectionFailedDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Psicf", 578, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoSmiInfoConnectionFailedDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                SmartPhoneIntegrationActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Psicf");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoSmiInfoDisconnectDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setBoolean(24342, false);
                break;
            }
            case 2: {
                this.enterPopupView("Psid", 579, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoSmiInfoDisconnectDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                SmartPhoneIntegrationActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                this.setString(-793640960, this.getI18nString(5480));
                break;
            }
            case 2: {
                this.leavePopupView("Psid");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoSmiInfoNotSwapDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Psins", 580, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoSmiInfoNotSwapDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                SmartPhoneIntegrationActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Psins");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoSmiInfoNoConnectionDuringCallDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Psincdc", 581, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoSmiInfoNoConnectionDuringCallDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                SmartPhoneIntegrationActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Psincdc");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoSmiInfoStartConnectionDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Psisc", 582, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoSmiInfoStartConnectionDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                SmartPhoneIntegrationActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Psisc");
                break;
            }
        }
    }

    private void performStateEntryAction_SubHapticSmartphoneintegrationDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(18271, 2);
                this.setString(-175243264, this.getI18nString(5480));
                break;
            }
            case 8: {
                this.setInteger(336199936, 24);
                this.setInteger(16776, SkinDataPool.getInteger(190));
                this.setInteger(18271, 3);
                break;
            }
            case 16: {
                EventGeneric eventGeneric;
                if (!this.getBoolean(-309526528)) {
                    this.setInteger(-452263680, 25);
                }
                if (!this.getBoolean(-309526528)) {
                    eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(-452263680));
                    this.triggerObserver(1191510080, eventGeneric);
                }
                this.setBoolean(-309526528, false);
                this.setInteger(25296896, 26);
                SmartPhoneIntegrationActivity.changeContext("SmartPhoneIntegration");
                this.setInteger(28773, 0);
                this.setInteger(28772, SkinDataPool.getIntegerVector(1)[0]);
                eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(28773));
                eventGeneric.setInt(1, this.getInteger(28772));
                this.triggerObserver(809512000, eventGeneric);
                this.setInteger(28773, 1);
                this.setInteger(28772, SkinDataPool.getIntegerVector(1)[1]);
                eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(28773));
                eventGeneric.setInt(1, this.getInteger(28772));
                this.triggerObserver(809512000, eventGeneric);
                break;
            }
            case 19: {
                this.setInteger(-1373110016, 1533054281);
                this.setInteger(-452263680, 25);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-452263680));
                this.triggerObserver(1191510080, eventGeneric);
                break;
            }
            case 21: {
                this.showView("Si", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 24: {
                this.showView("Sm_B005", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 29: {
                SmartPhoneIntegrationActivity.fireHMIEvent(ANY, BROADCAST, 1348504905);
                break;
            }
            case 37: {
                this.setInteger(1167196160, 14);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1167196160));
                this.triggerObserver(0x50050040, eventGeneric);
                break;
            }
            case 43: {
                SmartPhoneIntegrationActivity.fireHMIEvent(ANY, BROADCAST, 1247907145);
                break;
            }
            case 44: {
                this.setInteger(18271, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubHapticSmartphoneintegrationDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(18271, 0);
                break;
            }
            case 8: {
                this.setInteger(16776, SkinDataPool.getInteger(180));
                this.setInteger(25296896, 0);
                break;
            }
            case 21: {
                this.hideView("Si");
                break;
            }
            case 24: {
                this.hideView("Sm_B005");
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubHapticSmartphoneintegrationDynState(int n) {
        switch (n - this.IT_OFFSET) {
            case 5: {
                return this.getBoolean(-393019392);
            }
            case 6: {
                return this.getBoolean(-393019392);
            }
            case 7: {
                return this.getBoolean(-393019392);
            }
            case 8: {
                return this.getBoolean(-393019392);
            }
            case 17: {
                return this.getInteger(25296896) == 4 || this.getInteger(25296896) == 18 || this.getInteger(25296896) == 23 || this.getInteger(25296896) == 13 || this.getInteger(25296896) == 22 || this.getInteger(25296896) == 6;
            }
            case 18: {
                return this.getInteger(18985) == 6 && this.getInteger(22132) != 0;
            }
            case 19: {
                return this.evalBoolean(70);
            }
            case 20: {
                return this.evalBoolean(70);
            }
            case 21: {
                return this.evalBoolean(70);
            }
            case 22: {
                return this.evalBoolean(70);
            }
            case 23: {
                return this.evalBoolean(70);
            }
            case 24: {
                return this.evalBoolean(70);
            }
            case 25: {
                return this.evalBoolean(70);
            }
            case 26: {
                return this.evalBoolean(70);
            }
            case 27: {
                return this.evalBoolean(70);
            }
            case 28: {
                return this.getInteger(22132) != 0;
            }
            case 29: {
                return this.getInteger(22132) != 0;
            }
            case 30: {
                return this.getInteger(22132) != 0;
            }
            case 31: {
                return this.getInteger(22132) != 0;
            }
            case 32: {
                return this.evalBoolean(70);
            }
            case 33: {
                return this.evalBoolean(70);
            }
            case 34: {
                return this.evalBoolean(70);
            }
            case 35: {
                return this.evalBoolean(70);
            }
            case 36: {
                return this.evalBoolean(70);
            }
            case 37: {
                return this.evalBoolean(70);
            }
            case 38: {
                return this.evalBoolean(70);
            }
            case 39: {
                return this.evalBoolean(70);
            }
            case 40: {
                return this.getInteger(22132) != 0;
            }
            case 41: {
                return this.getInteger(22132) != 0;
            }
            case 42: {
                return this.getInteger(22132) != 0;
            }
            case 51: {
                return this.getInteger(22132) == 1 && this.getInteger(420282624) == SmartPhoneIntegrationActivity.evListItemActionIndex() && SmartPhoneIntegrationActivity.evListItemEventSender().equals("Btn_Mirrorlink");
            }
            case 52: {
                return this.getInteger(22132) == 2 && this.getInteger(420282624) == SmartPhoneIntegrationActivity.evListItemActionIndex() && SmartPhoneIntegrationActivity.evListItemEventSender().equals("Btn_Carplay");
            }
            case 53: {
                return this.getInteger(22132) == 3 && this.getInteger(420282624) == SmartPhoneIntegrationActivity.evListItemActionIndex() && SmartPhoneIntegrationActivity.evListItemEventSender().equals("Btn_AndroidAuto");
            }
            case 54: {
                return this.getInteger(22132) == 4 && this.getInteger(420282624) == SmartPhoneIntegrationActivity.evListItemActionIndex() && SmartPhoneIntegrationActivity.evListItemEventSender().equals("Btn_CarLife");
            }
            case 56: {
                return SmartPhoneIntegrationActivity.evListItemEventSender().equals("Btn_Mirrorlink") && (this.getInteger(22132) != 1 || this.getInteger(420282624) != SmartPhoneIntegrationActivity.evListItemActionIndex());
            }
            case 57: {
                return SmartPhoneIntegrationActivity.evListItemEventSender().equals("Btn_Carplay") && (this.getInteger(420282624) != SmartPhoneIntegrationActivity.evListItemActionIndex() || this.getInteger(22132) != 2);
            }
            case 58: {
                return SmartPhoneIntegrationActivity.evListItemEventSender().equals("Btn_AndroidAuto") && (this.getInteger(22132) != 3 || this.getInteger(420282624) != SmartPhoneIntegrationActivity.evListItemActionIndex());
            }
            case 59: {
                return SmartPhoneIntegrationActivity.evListItemEventSender().equals("Btn_CarLife") && (this.getInteger(420282624) != SmartPhoneIntegrationActivity.evListItemActionIndex() || this.getInteger(22132) != 4);
            }
            case 61: {
                return this.getInteger(25296896) == 26;
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubHapticSmartphoneintegrationDynState(int n) {
        this.performInternalTransitionAction_SubHapticSmartphoneintegrationDynState00(n);
    }

    private void performInternalTransitionAction_SubHapticSmartphoneintegrationDynState00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                if (this.getInteger(25296896) != 26) {
                    this.setBoolean(-309526528, true);
                }
                if (this.getInteger(25296896) != 26) {
                    SmartPhoneIntegrationActivity.fireHMIEvent(ANY, BROADCAST, 1533054281);
                }
                if (this.getInteger(25296896) != 26) break;
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -446263991);
                break;
            }
            case 1: {
                if (this.getInteger(25296896) != 26) {
                    this.setBoolean(-309526528, true);
                }
                if (this.getInteger(25296896) != 26) {
                    SmartPhoneIntegrationActivity.fireHMIEvent(ANY, BROADCAST, 1533054281);
                }
                if (this.getInteger(25296896) != 26) break;
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -446263991);
                break;
            }
            case 2: {
                if (this.getInteger(25296896) != 26) {
                    SmartPhoneIntegrationActivity.fireHMIEvent(ANY, BROADCAST, 1533054281);
                }
                if (this.getInteger(25296896) != 26) break;
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -446263991);
                break;
            }
            case 3: {
                if (this.getInteger(25296896) != 26) {
                    this.setBoolean(-309526528, true);
                }
                if (this.getInteger(25296896) != 26) {
                    SmartPhoneIntegrationActivity.fireHMIEvent(ANY, BROADCAST, 1533054281);
                }
                if (this.getInteger(25296896) != 26) break;
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -446263991);
                break;
            }
            case 4: {
                if (this.getInteger(-308740096) != 25) {
                    this.setBoolean(-309526528, false);
                    SmartPhoneIntegrationActivity.fireHMIEvent(ANY, BROADCAST, 1264618825);
                }
                if (this.getInteger(-308740096) != 25) break;
                this.setInteger(19672, 1);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -446263991);
                break;
            }
            case 5: {
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -412709559);
                break;
            }
            case 6: {
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -412709559);
                break;
            }
            case 7: {
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -412709559);
                break;
            }
            case 8: {
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -412709559);
                break;
            }
            case 9: {
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -496595639);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -429486775);
                break;
            }
            case 10: {
                this.setString(-175243264, this.getString(-1761017600));
                this.setString(-793640960, this.getString(-1761017600));
                this.setInteger(11595, this.getInteger(26743));
                this.setInteger(-1593310976, 0);
                this.setInteger(19672, 0);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -395932343);
                break;
            }
            case 11: {
                this.setBoolean(24342, true);
                break;
            }
            case 12: {
                this.setBoolean(24342, true);
                break;
            }
            case 13: {
                this.setBoolean(24342, true);
                break;
            }
            case 14: {
                this.setBoolean(24342, true);
                break;
            }
            case 15: {
                this.setBoolean(24342, false);
                break;
            }
            case 16: {
                SmartPhoneIntegrationActivity.fireHMIEvent(ANY, BROADCAST, 1533054281);
                break;
            }
            case 17: {
                SmartPhoneIntegrationActivity.fireHMIEvent(ANY, BROADCAST, 1533054281);
                break;
            }
            case 18: {
                this.setInteger(13567, 13);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 19: {
                this.setInteger(13567, 0);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 20: {
                this.setInteger(13567, 4);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 21: {
                this.setInteger(13567, 1);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 22: {
                this.setInteger(13567, 6);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 23: {
                this.setInteger(13567, 14);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 24: {
                this.setInteger(13567, 2);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 25: {
                this.setInteger(13567, 3);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 26: {
                this.setInteger(13567, 5);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 27: {
                this.setInteger(13567, 7);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 28: {
                this.setInteger(13567, 8);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 29: {
                this.setInteger(13567, 9);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 30: {
                this.setInteger(13567, 9);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 31: {
                this.setInteger(13567, 10);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 32: {
                this.setInteger(13567, 7);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 33: {
                this.setInteger(13567, 5);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 34: {
                this.setInteger(13567, 3);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 35: {
                this.setInteger(13567, 2);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 36: {
                this.setInteger(13567, 6);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 37: {
                this.setInteger(13567, 1);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 38: {
                this.setInteger(13567, 4);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 39: {
                this.setInteger(13567, 0);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 40: {
                this.setInteger(13567, 12);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 41: {
                this.setInteger(13567, 12);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 42: {
                this.setInteger(13567, 11);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13567));
                this.triggerObserver(859843648, eventGeneric);
                break;
            }
            case 43: {
                if (this.getInteger(-1080360960) != 0) {
                    this.setBoolean(334561280, true);
                }
                if (this.getInteger(-1080360960) == 0) {
                    this.setBoolean(334561280, false);
                }
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(334561280));
                this.triggerObserver(893398080, eventGeneric);
                break;
            }
            case 44: {
                this.setBoolean(27687, true);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -261714615);
                break;
            }
            case 45: {
                this.setBoolean(27687, true);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -261714615);
                break;
            }
            case 46: {
                this.setBoolean(27687, true);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -261714615);
                break;
            }
            case 47: {
                this.setBoolean(27687, true);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -261714615);
                break;
            }
            case 48: {
                this.setInteger(16776, SkinDataPool.getInteger(180));
                break;
            }
            case 49: {
                this.setInteger(16776, SkinDataPool.getInteger(190));
                break;
            }
            case 50: {
                this.setString(-1160773632, this.getI18nStrings(287)[this.getInteger(26637)]);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -362377911);
                break;
            }
            case 51: {
                this.setInteger(19672, 0);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -244937399);
                break;
            }
            case 52: {
                this.setInteger(19672, 0);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -244937399);
                break;
            }
            case 53: {
                this.setInteger(19672, 0);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -244937399);
                break;
            }
            case 54: {
                this.setInteger(19672, 0);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -244937399);
                break;
            }
            case 55: {
                this.triggerObserver(759180352);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -479818423);
                break;
            }
            case 56: {
                this.setInteger(15222, SmartPhoneIntegrationActivity.evListItemActionIndex());
                this.setInteger(-107085824, 1);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -379155127);
                break;
            }
            case 57: {
                this.setInteger(15222, SmartPhoneIntegrationActivity.evListItemActionIndex());
                this.setInteger(-107085824, 2);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -379155127);
                break;
            }
            case 58: {
                this.setInteger(15222, SmartPhoneIntegrationActivity.evListItemActionIndex());
                this.setInteger(-107085824, 0);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -379155127);
                break;
            }
            case 59: {
                this.setInteger(15222, SmartPhoneIntegrationActivity.evListItemActionIndex());
                this.setInteger(-107085824, 3);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -379155127);
                break;
            }
            case 61: {
                SmartPhoneIntegrationActivity.fireHMIEvent(ANY, BROADCAST, 1533054281);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubHapticSmartphoneintegrationDynState(int n) {
        switch (n - this.TT_OFFSET) {
            case 9: {
                return this.getBoolean(20669) && this.getInteger(22132) == 4;
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubHapticSmartphoneintegrationDynState(int n) {
        this.performTriggeredTransitionAction_SubHapticSmartphoneintegrationDynState0(n);
    }

    private void performTriggeredTransitionAction_SubHapticSmartphoneintegrationDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 6: {
                this.setInteger(19672, 1);
                break;
            }
            case 8: {
                this.setInteger(19672, 1);
                break;
            }
            case 10: {
                this.setInteger(19672, 1);
                SmartPhoneIntegrationActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 643468617);
                break;
            }
            case 12: {
                this.setInteger(19672, 1);
                break;
            }
            case 14: {
                SmartPhoneIntegrationActivity.fireHMIEvent(ANY, BROADCAST, -1973908151);
                break;
            }
            case 15: {
                SmartPhoneIntegrationActivity.fireHMIEvent(ANY, BROADCAST, -1990685367);
                break;
            }
            case 16: {
                SmartPhoneIntegrationActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubHapticSmartphoneintegrationDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 7: {
                return this.getInteger(23881) == 2;
            }
            case 8: {
                return this.getInteger(23881) == 0;
            }
            case 9: {
                return this.getInteger(23881) == 1 && !this.getBoolean(27687);
            }
            case 12: {
                return !this.getBoolean(1991049216) && !this.getBoolean(25829) && !this.getBoolean(-1713700864) && !this.getBoolean(13805);
            }
            case 15: {
                return this.getBoolean(19517);
            }
            case 21: {
                return this.getInteger(19672) == 4 && this.getInteger(22132) != 0;
            }
            case 22: {
                return this.getInteger(19672) == 2;
            }
            case 23: {
                return this.getInteger(19672) == 1;
            }
            case 26: {
                return this.getInteger(22132) == 4;
            }
            case 27: {
                return this.getInteger(22132) == 3;
            }
            case 28: {
                return this.getInteger(22132) == 2;
            }
            case 29: {
                return this.getInteger(22132) == 1;
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubHapticSmartphoneintegrationDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 20: {
                SmartPhoneIntegrationActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 21: {
                this.setInteger(-1593310976, 6);
                this.setInteger(19672, 0);
                break;
            }
            case 22: {
                this.setInteger(19672, 0);
                SmartPhoneIntegrationActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                this.setInteger(-1549598720, SkinDataPool.getInteger(180));
                break;
            }
            case 23: {
                this.setInteger(19672, 0);
                break;
            }
            case 24: {
                this.setInteger(19672, 0);
                break;
            }
            case 26: {
                this.setInteger(-1373110016, 1533054281);
                break;
            }
            case 27: {
                this.setInteger(-1373110016, 1533054281);
                break;
            }
            case 28: {
                this.setInteger(-1373110016, 1533054281);
                break;
            }
            case 29: {
                this.setInteger(-1373110016, 1533054281);
                break;
            }
        }
    }

    private void performStateEntryAction_SubCSmiSetupIncludeState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.showView("Ssm_5458", bl, 122);
                break;
            }
        }
    }

    private void performStateExitAction_SubCSmiSetupIncludeState(int n) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.hideView("Ssm_5458");
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubCSmiSetupIncludeState(int n) {
        this.performInternalTransitionAction_SubCSmiSetupIncludeState0(n);
    }

    private void performInternalTransitionAction_SubCSmiSetupIncludeState0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setInteger(29228, SmartPhoneIntegrationActivity.evListItemActionIndex());
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(29228));
                this.triggerObserver(826289216, eventGeneric);
                break;
            }
            case 1: {
                this.setInteger(21954, SmartPhoneIntegrationActivity.evListItemActionIndex());
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(21954));
                this.triggerObserver(1560870976, eventGeneric);
                break;
            }
            case 2: {
                this.triggerObserver(638263360);
                break;
            }
            case 3: {
                this.triggerObserver(1145179968);
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubCSmiSetupIncludeState(int n) {
        this.performTriggeredTransitionAction_SubCSmiSetupIncludeState0(n);
    }

    private void performTriggeredTransitionAction_SubCSmiSetupIncludeState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                SmartPhoneIntegrationActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIAndroidautoBridge(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 6: {
                this.triggerObserver(541076544);
                this.setBoolean(-393019392, true);
                this.showView("Am", bl, 136);
                break;
            }
        }
    }

    private void performStateExitAction_SubIAndroidautoBridge(int n) {
        switch (n - this.S_OFFSET) {
            case 6: {
                this.hideView("Am");
                this.triggerObserver(557853760);
                this.setBoolean(-393019392, false);
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubIAndroidautoBridge(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                return this.evalBoolean(14);
            }
            case 1: {
                return this.evalBoolean(14);
            }
            case 2: {
                return this.evalBoolean(14);
            }
            case 3: {
                return this.evalBoolean(14);
            }
            case 4: {
                return this.evalBoolean(14);
            }
            case 5: {
                return this.evalBoolean(14);
            }
            case 6: {
                return this.evalBoolean(14);
            }
            case 7: {
                return this.evalBoolean(14);
            }
            case 8: {
                return this.evalBoolean(14);
            }
            case 9: {
                return this.evalBoolean(14);
            }
            case 10: {
                return this.evalBoolean(14);
            }
            case 11: {
                return this.evalBoolean(14);
            }
            case 12: {
                return this.evalBoolean(14);
            }
            case 13: {
                return this.evalBoolean(14);
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubIAndroidautoBridge(int n) {
        this.performInternalTransitionAction_SubIAndroidautoBridge00(n);
    }

    private void performInternalTransitionAction_SubIAndroidautoBridge00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setInteger(-2131886080, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(0x7EEE0000, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(1025507584, 0);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2131886080));
                eventGeneric.setInt(1, this.getInteger(0x7EEE0000));
                eventGeneric.setInt(2, this.getInteger(25429));
                eventGeneric.setInt(3, this.getInteger(25428));
                eventGeneric.setInt(4, this.getInteger(27850));
                eventGeneric.setInt(5, this.getInteger(-1146093568));
                eventGeneric.setInt(6, this.getInteger(1025507584));
                this.triggerObserver(574630976, eventGeneric);
                break;
            }
            case 1: {
                this.setInteger(-2131886080, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(0x7EEE0000, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(27850, SmartPhoneIntegrationActivity.evPointGestureParam1());
                this.setInteger(1025507584, 5);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2131886080));
                eventGeneric.setInt(1, this.getInteger(0x7EEE0000));
                eventGeneric.setInt(2, this.getInteger(25429));
                eventGeneric.setInt(3, this.getInteger(25428));
                eventGeneric.setInt(4, this.getInteger(27850));
                eventGeneric.setInt(5, this.getInteger(-1146093568));
                eventGeneric.setInt(6, this.getInteger(1025507584));
                this.triggerObserver(574630976, eventGeneric);
                break;
            }
            case 2: {
                this.setInteger(-2131886080, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(0x7EEE0000, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(1025507584, 1);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2131886080));
                eventGeneric.setInt(1, this.getInteger(0x7EEE0000));
                eventGeneric.setInt(2, this.getInteger(25429));
                eventGeneric.setInt(3, this.getInteger(25428));
                eventGeneric.setInt(4, this.getInteger(27850));
                eventGeneric.setInt(5, this.getInteger(-1146093568));
                eventGeneric.setInt(6, this.getInteger(1025507584));
                this.triggerObserver(574630976, eventGeneric);
                break;
            }
            case 3: {
                this.setInteger(-2131886080, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(0x7EEE0000, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(1025507584, 1);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2131886080));
                eventGeneric.setInt(1, this.getInteger(0x7EEE0000));
                eventGeneric.setInt(2, this.getInteger(25429));
                eventGeneric.setInt(3, this.getInteger(25428));
                eventGeneric.setInt(4, this.getInteger(27850));
                eventGeneric.setInt(5, this.getInteger(-1146093568));
                eventGeneric.setInt(6, this.getInteger(1025507584));
                this.triggerObserver(574630976, eventGeneric);
                break;
            }
            case 4: {
                this.setInteger(-2131886080, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(0x7EEE0000, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(25429, SmartPhoneIntegrationActivity.evPointGestureParam1());
                this.setInteger(25428, SmartPhoneIntegrationActivity.evPointGestureParam2());
                this.setInteger(1025507584, 3);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2131886080));
                eventGeneric.setInt(1, this.getInteger(0x7EEE0000));
                eventGeneric.setInt(2, this.getInteger(25429));
                eventGeneric.setInt(3, this.getInteger(25428));
                eventGeneric.setInt(4, this.getInteger(27850));
                eventGeneric.setInt(5, this.getInteger(-1146093568));
                eventGeneric.setInt(6, this.getInteger(1025507584));
                this.triggerObserver(574630976, eventGeneric);
                break;
            }
            case 5: {
                this.setInteger(-2131886080, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(0x7EEE0000, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(27850, SmartPhoneIntegrationActivity.evPointGestureParam1());
                this.setInteger(1025507584, 6);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2131886080));
                eventGeneric.setInt(1, this.getInteger(0x7EEE0000));
                eventGeneric.setInt(2, this.getInteger(25429));
                eventGeneric.setInt(3, this.getInteger(25428));
                eventGeneric.setInt(4, this.getInteger(27850));
                eventGeneric.setInt(5, this.getInteger(-1146093568));
                eventGeneric.setInt(6, this.getInteger(1025507584));
                this.triggerObserver(574630976, eventGeneric);
                break;
            }
            case 6: {
                this.setInteger(-2131886080, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(0x7EEE0000, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(25429, SmartPhoneIntegrationActivity.evPointGestureParam1());
                this.setInteger(25428, SmartPhoneIntegrationActivity.evPointGestureParam2());
                this.setInteger(1025507584, 3);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2131886080));
                eventGeneric.setInt(1, this.getInteger(0x7EEE0000));
                eventGeneric.setInt(2, this.getInteger(25429));
                eventGeneric.setInt(3, this.getInteger(25428));
                eventGeneric.setInt(4, this.getInteger(27850));
                eventGeneric.setInt(5, this.getInteger(-1146093568));
                eventGeneric.setInt(6, this.getInteger(1025507584));
                this.triggerObserver(574630976, eventGeneric);
                break;
            }
            case 7: {
                this.setInteger(-2131886080, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(0x7EEE0000, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(27850, SmartPhoneIntegrationActivity.evPointGestureParam1());
                this.setInteger(1025507584, 6);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2131886080));
                eventGeneric.setInt(1, this.getInteger(0x7EEE0000));
                eventGeneric.setInt(2, this.getInteger(25429));
                eventGeneric.setInt(3, this.getInteger(25428));
                eventGeneric.setInt(4, this.getInteger(27850));
                eventGeneric.setInt(5, this.getInteger(-1146093568));
                eventGeneric.setInt(6, this.getInteger(1025507584));
                this.triggerObserver(574630976, eventGeneric);
                break;
            }
            case 8: {
                this.setInteger(-2131886080, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(0x7EEE0000, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(-1146093568, SmartPhoneIntegrationActivity.evPointGestureParam1());
                this.setInteger(27850, SmartPhoneIntegrationActivity.evPointGestureParam2());
                this.setInteger(1025507584, 4);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2131886080));
                eventGeneric.setInt(1, this.getInteger(0x7EEE0000));
                eventGeneric.setInt(2, this.getInteger(25429));
                eventGeneric.setInt(3, this.getInteger(25428));
                eventGeneric.setInt(4, this.getInteger(27850));
                eventGeneric.setInt(5, this.getInteger(-1146093568));
                eventGeneric.setInt(6, this.getInteger(1025507584));
                this.triggerObserver(574630976, eventGeneric);
                break;
            }
            case 9: {
                this.setInteger(1289093120, 0);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1289093120));
                this.triggerObserver(608185408, eventGeneric);
                break;
            }
            case 10: {
                this.setInteger(1289093120, 1);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1289093120));
                this.triggerObserver(608185408, eventGeneric);
                break;
            }
            case 11: {
                this.setInteger(1289093120, 2);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1289093120));
                this.triggerObserver(608185408, eventGeneric);
                break;
            }
            case 12: {
                this.setInteger(1289093120, 3);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1289093120));
                this.triggerObserver(608185408, eventGeneric);
                break;
            }
            case 13: {
                this.setInteger(1289093120, 4);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1289093120));
                this.triggerObserver(608185408, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubICarlifeBridge(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 6: {
                this.triggerObserver(910175296);
                this.setBoolean(-393019392, true);
                this.showView("Cm_BD81", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    private void performStateExitAction_SubICarlifeBridge(int n) {
        switch (n - this.S_OFFSET) {
            case 6: {
                this.hideView("Cm_BD81");
                this.triggerObserver(926952512);
                this.setBoolean(-393019392, false);
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubICarlifeBridge(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                return this.evalBoolean(17);
            }
            case 1: {
                return this.evalBoolean(17);
            }
            case 2: {
                return this.evalBoolean(17);
            }
            case 3: {
                return this.evalBoolean(17);
            }
            case 4: {
                return this.evalBoolean(17);
            }
            case 5: {
                return this.evalBoolean(17);
            }
            case 6: {
                return this.evalBoolean(17);
            }
            case 7: {
                return this.evalBoolean(17);
            }
            case 8: {
                return this.evalBoolean(17);
            }
            case 9: {
                return this.evalBoolean(17);
            }
            case 10: {
                return this.getBoolean(2093219840);
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubICarlifeBridge(int n) {
        this.performInternalTransitionAction_SubICarlifeBridge0(n);
    }

    private void performInternalTransitionAction_SubICarlifeBridge0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setInteger(28106, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(28104, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(-860422144, 0);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(28106));
                eventGeneric.setInt(1, this.getInteger(28104));
                eventGeneric.setInt(2, this.getInteger(-860422144));
                this.triggerObserver(960506944, eventGeneric);
                break;
            }
            case 1: {
                this.setInteger(28106, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(28104, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(-860422144, 1);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(28106));
                eventGeneric.setInt(1, this.getInteger(28104));
                eventGeneric.setInt(2, this.getInteger(-860422144));
                this.triggerObserver(960506944, eventGeneric);
                break;
            }
            case 2: {
                this.setInteger(28106, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(28104, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(-860422144, 1);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(28106));
                eventGeneric.setInt(1, this.getInteger(28104));
                eventGeneric.setInt(2, this.getInteger(-860422144));
                this.triggerObserver(960506944, eventGeneric);
                break;
            }
            case 3: {
                this.setInteger(28106, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(28104, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(-860422144, 2);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(28106));
                eventGeneric.setInt(1, this.getInteger(28104));
                eventGeneric.setInt(2, this.getInteger(-860422144));
                this.triggerObserver(960506944, eventGeneric);
                break;
            }
            case 4: {
                this.setInteger(28106, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(28104, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(-860422144, 2);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(28106));
                eventGeneric.setInt(1, this.getInteger(28104));
                eventGeneric.setInt(2, this.getInteger(-860422144));
                this.triggerObserver(960506944, eventGeneric);
                break;
            }
            case 5: {
                this.setInteger(1844969472, 0);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1844969472));
                this.triggerObserver(977284160, eventGeneric);
                break;
            }
            case 6: {
                this.setInteger(1844969472, 1);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1844969472));
                this.triggerObserver(977284160, eventGeneric);
                break;
            }
            case 7: {
                this.setInteger(1844969472, 2);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1844969472));
                this.triggerObserver(977284160, eventGeneric);
                break;
            }
            case 8: {
                this.setInteger(1844969472, 3);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1844969472));
                this.triggerObserver(977284160, eventGeneric);
                break;
            }
            case 9: {
                this.setInteger(1844969472, 4);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1844969472));
                this.triggerObserver(977284160, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubICarplayBridge(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 4: {
                this.triggerObserver(624962624);
                break;
            }
            case 6: {
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1593310976));
                this.triggerObserver(658517056, eventGeneric);
                this.setBoolean(-393019392, true);
                this.showView("Cm_0409", bl, 135);
                break;
            }
        }
    }

    private void performStateExitAction_SubICarplayBridge(int n) {
        switch (n - this.S_OFFSET) {
            case 4: {
                this.triggerObserver(641739840);
                break;
            }
            case 6: {
                this.hideView("Cm_0409");
                this.setInteger(-1593310976, 0);
                this.triggerObserver(692071488);
                this.setBoolean(-393019392, false);
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubICarplayBridge(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                return this.evalBoolean(18);
            }
            case 1: {
                return this.evalBoolean(18);
            }
            case 2: {
                return this.evalBoolean(18);
            }
            case 3: {
                return this.evalBoolean(18);
            }
            case 4: {
                return this.evalBoolean(18);
            }
            case 5: {
                return this.evalBoolean(18);
            }
            case 6: {
                return this.evalBoolean(18);
            }
            case 7: {
                return this.evalBoolean(18);
            }
            case 8: {
                return this.evalBoolean(18);
            }
            case 9: {
                return this.evalBoolean(18);
            }
            case 10: {
                return this.evalBoolean(18);
            }
            case 11: {
                return this.evalBoolean(18);
            }
            case 12: {
                return this.evalBoolean(18);
            }
            case 13: {
                return this.evalBoolean(18);
            }
            case 14: {
                return this.evalBoolean(18);
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubICarplayBridge(int n) {
        this.performInternalTransitionAction_SubICarplayBridge00(n);
    }

    private void performInternalTransitionAction_SubICarplayBridge00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setInteger(956891392, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(923336960, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(10876, 1);
                this.setInteger(-167509760, 0);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(956891392));
                eventGeneric.setInt(1, this.getInteger(923336960));
                eventGeneric.setInt(2, this.getInteger(-167509760));
                eventGeneric.setInt(3, this.getInteger(10876));
                this.triggerObserver(708848704, eventGeneric);
                break;
            }
            case 1: {
                this.setInteger(956891392, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(923336960, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(10876, 0);
                this.setInteger(-167509760, 0);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(956891392));
                eventGeneric.setInt(1, this.getInteger(923336960));
                eventGeneric.setInt(2, this.getInteger(-167509760));
                eventGeneric.setInt(3, this.getInteger(10876));
                this.triggerObserver(708848704, eventGeneric);
                break;
            }
            case 2: {
                this.setInteger(956891392, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(923336960, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(10876, 0);
                this.setInteger(-167509760, SmartPhoneIntegrationActivity.evPointGestureParam1());
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(956891392));
                eventGeneric.setInt(1, this.getInteger(923336960));
                eventGeneric.setInt(2, this.getInteger(-167509760));
                eventGeneric.setInt(3, this.getInteger(10876));
                this.triggerObserver(708848704, eventGeneric);
                break;
            }
            case 3: {
                this.setInteger(956891392, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(923336960, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(10876, 0);
                this.setInteger(-167509760, 0);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(956891392));
                eventGeneric.setInt(1, this.getInteger(923336960));
                eventGeneric.setInt(2, this.getInteger(-167509760));
                eventGeneric.setInt(3, this.getInteger(10876));
                this.triggerObserver(708848704, eventGeneric);
                break;
            }
            case 4: {
                this.setInteger(956891392, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(923336960, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(10876, 0);
                this.setInteger(-167509760, SmartPhoneIntegrationActivity.evPointGestureParam1());
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(956891392));
                eventGeneric.setInt(1, this.getInteger(923336960));
                eventGeneric.setInt(2, this.getInteger(-167509760));
                eventGeneric.setInt(3, this.getInteger(10876));
                this.triggerObserver(708848704, eventGeneric);
                break;
            }
            case 5: {
                this.setInteger(956891392, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(923336960, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(10876, 0);
                this.setInteger(-167509760, 0);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(956891392));
                eventGeneric.setInt(1, this.getInteger(923336960));
                eventGeneric.setInt(2, this.getInteger(-167509760));
                eventGeneric.setInt(3, this.getInteger(10876));
                this.triggerObserver(708848704, eventGeneric);
                break;
            }
            case 6: {
                this.setInteger(956891392, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(923336960, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(10876, 0);
                this.setInteger(-167509760, SmartPhoneIntegrationActivity.evPointGestureParam1());
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(956891392));
                eventGeneric.setInt(1, this.getInteger(923336960));
                eventGeneric.setInt(2, this.getInteger(-167509760));
                eventGeneric.setInt(3, this.getInteger(10876));
                this.triggerObserver(708848704, eventGeneric);
                break;
            }
            case 7: {
                this.setInteger(956891392, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(923336960, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(10876, 1);
                this.setInteger(-167509760, 0);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(956891392));
                eventGeneric.setInt(1, this.getInteger(923336960));
                eventGeneric.setInt(2, this.getInteger(-167509760));
                eventGeneric.setInt(3, this.getInteger(10876));
                this.triggerObserver(708848704, eventGeneric);
                break;
            }
            case 8: {
                this.setInteger(956891392, SmartPhoneIntegrationActivity.evPointX());
                this.setInteger(923336960, SmartPhoneIntegrationActivity.evPointY());
                this.setInteger(10876, 0);
                this.setInteger(-167509760, SmartPhoneIntegrationActivity.evPointGestureParam2());
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(956891392));
                eventGeneric.setInt(1, this.getInteger(923336960));
                eventGeneric.setInt(2, this.getInteger(-167509760));
                eventGeneric.setInt(3, this.getInteger(10876));
                this.triggerObserver(708848704, eventGeneric);
                break;
            }
            case 9: {
                this.setInteger(789446912, 0);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(789446912));
                this.triggerObserver(725625920, eventGeneric);
                break;
            }
            case 10: {
                this.setInteger(789446912, 1);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(789446912));
                this.triggerObserver(725625920, eventGeneric);
                break;
            }
            case 11: {
                this.setInteger(789446912, 2);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(789446912));
                this.triggerObserver(725625920, eventGeneric);
                break;
            }
            case 12: {
                this.setInteger(789446912, 3);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(789446912));
                this.triggerObserver(725625920, eventGeneric);
                break;
            }
            case 13: {
                this.setInteger(789446912, 4);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(789446912));
                this.triggerObserver(725625920, eventGeneric);
                break;
            }
            case 14: {
                this.setInteger(789446912, 4);
                EventGeneric eventGeneric = SmartPhoneIntegrationActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(789446912));
                this.triggerObserver(725625920, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIGenericDomainErrorBridge(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 4: {
                this.showView("Gde", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    private void performStateExitAction_SubIGenericDomainErrorBridge(int n) {
        switch (n - this.S_OFFSET) {
            case 4: {
                this.hideView("Gde");
                break;
            }
        }
    }

    private void performStateEntryAction_SubIGenericDomainNotAvailableBridge(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 4: {
                this.showView("Gdna", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    private void performStateExitAction_SubIGenericDomainNotAvailableBridge(int n) {
        switch (n - this.S_OFFSET) {
            case 4: {
                this.hideView("Gdna");
                break;
            }
        }
    }

    private void performStateEntryAction_SubIGenericDomainNotAvailableSwapBridge(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 4: {
                this.showView("Gdnas", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    private void performStateExitAction_SubIGenericDomainNotAvailableSwapBridge(int n) {
        switch (n - this.S_OFFSET) {
            case 4: {
                this.hideView("Gdnas");
                break;
            }
        }
    }
}

