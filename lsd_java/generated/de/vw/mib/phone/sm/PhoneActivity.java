/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.phone.sm;

import de.vw.mib.datapool.FormatterService;
import de.vw.mib.genericevents.EventGeneric;
import de.vw.mib.sm.internal.statemachine.TopStatemachine;
import generated.de.vw.mib.global.datapool.DataConstants;
import generated.de.vw.mib.global.datapool.SkinDataPool;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineActivityBase;

public class PhoneActivity
extends StatemachineActivityBase {
    private final int subStatemachineId;

    public PhoneActivity(TopStatemachine topStatemachine, int n, int n2, int n3, int n4, int n5) {
        super(topStatemachine, n2, n3, n4, n5);
        this.subStatemachineId = n;
    }

    @Override
    public void performStateEntryAction(int n, boolean bl) {
        switch (this.subStatemachineId) {
            case 639: {
                this.performStateEntryAction_SubIBluetoothBondingError(n, bl);
                break;
            }
            case 83: {
                this.performStateEntryAction_SubPopupBluetoothBondingProfileSelectionCheckDynState(n, bl);
                break;
            }
            case 646: {
                this.performStateEntryAction_SubIBluetoothEnableA2dp(n, bl);
                break;
            }
            case 684: {
                this.performStateEntryAction_SubIPhoneEnableNad(n, bl);
                break;
            }
            case 84: {
                this.performStateEntryAction_SubPopupBluetoothBondingServiceRequestDynState(n, bl);
                break;
            }
            case 638: {
                this.performStateEntryAction_SubIBluetoothBonding(n, bl);
                break;
            }
            case 642: {
                this.performStateEntryAction_SubIBluetoothConnectAuth(n, bl);
                break;
            }
            case 643: {
                this.performStateEntryAction_SubIBluetoothConnectError(n, bl);
                break;
            }
            case 86: {
                this.performStateEntryAction_SubPopupBluetoothConnectDynState(n, bl);
                break;
            }
            case 87: {
                this.performStateEntryAction_SubPopupBluetoothEnableEngineDynState(n, bl);
                break;
            }
            case 648: {
                this.performStateEntryAction_SubIBluetoothToggleEngine(n, bl);
                break;
            }
            case 154: {
                this.performStateEntryAction_SubPopupPhoneEmergencyDynState(n, bl);
                break;
            }
            case 156: {
                this.performStateEntryAction_SubPopupPhoneSupplServiceDynState(n, bl);
                break;
            }
            case 160: {
                this.performStateEntryAction_SubPopupPoAlertBluetoothA2dpInfoDynstate(n, bl);
                break;
            }
            case 161: {
                this.performStateEntryAction_SubPopupPoAlertBluetoothDenyRoleChangeDynState(n, bl);
                break;
            }
            case 162: {
                this.performStateEntryAction_SubPopupPoAlertBluetoothPairingDeletingAllFailedDynState(n, bl);
                break;
            }
            case 163: {
                this.performStateEntryAction_SubPopupPoAlertBluetoothPairingDeletingFailedDynState(n, bl);
                break;
            }
            case 164: {
                this.performStateEntryAction_SubPopupPoAlertBluetoothProfileDisconnectFailedNoSimDynState(n, bl);
                break;
            }
            case 165: {
                this.performStateEntryAction_SubPopupPoAlertBluetoothProfileDisconnectFailedDynState(n, bl);
                break;
            }
            case 166: {
                this.performStateEntryAction_SubPopupPoAlertBluetoothSwdlErrorDynState(n, bl);
                break;
            }
            case 172: {
                this.performStateEntryAction_SubPopupPoAlertPhoneActiveCallHandoverWarningDynState(n, bl);
                break;
            }
            case 173: {
                this.performStateEntryAction_SubPopupPoAlertPhoneActiveCallTerminationWarningDynState(n, bl);
                break;
            }
            case 174: {
                this.performStateEntryAction_SubPopupPoAlertPhoneAdditionalErrorDynState(n, bl);
                break;
            }
            case 175: {
                this.performStateEntryAction_SubPopupPoAlertPhoneDialingFailedDynState(n, bl);
                break;
            }
            case 176: {
                this.performStateEntryAction_SubPopupPoAlertPhoneEcallErrorDynState(n, bl);
                break;
            }
            case 177: {
                this.performStateEntryAction_SubPopupPoAlertPhoneMecAcnLicenseExpiryWarningDynState(n, bl);
                break;
            }
            case 178: {
                this.performStateEntryAction_SubPopupPoAlertPhoneNotInstalledDynState(n, bl);
                break;
            }
            case 179: {
                this.performStateEntryAction_SubPopupPoAlertPhoneNoLineFreeDynState(n, bl);
                break;
            }
            case 180: {
                this.performStateEntryAction_SubPopupPoAlertPhonePinInvalidDynState(n, bl);
                break;
            }
            case 181: {
                this.performStateEntryAction_SubPopupPoAlertPhonePukInvalidDynState(n, bl);
                break;
            }
            case 182: {
                this.performStateEntryAction_SubPopupPoAlertPhoneSapDowngradeDynState(n, bl);
                break;
            }
            case 183: {
                this.performStateEntryAction_SubPopupPoAlertPhoneSimDataonlyDynState(n, bl);
                break;
            }
            case 184: {
                this.performStateEntryAction_SubPopupPoAlertPhoneTempServiceCodeFailureDynState(n, bl);
                break;
            }
            case 185: {
                this.performStateEntryAction_SubPopupPoAlertPhoneTempWlcForeignObjectDetectionDynState(n, bl);
                break;
            }
            case 201: {
                this.performStateEntryAction_SubPopupPoConfirmBluetoothContactsFailureDynState(n, bl);
                break;
            }
            case 202: {
                this.performStateEntryAction_SubPopupPoConfirmBluetoothDisableA2dpDynState(n, bl);
                break;
            }
            case 203: {
                this.performStateEntryAction_SubPopupPoConfirmBluetoothEnableA2dpDynState(n, bl);
                break;
            }
            case 204: {
                this.performStateEntryAction_SubPopupPoConfirmBluetoothHelpDynState(n, bl);
                break;
            }
            case 205: {
                this.performStateEntryAction_SubPopupPoConfirmBluetoothPairingDeleteAllDynState(n, bl);
                break;
            }
            case 206: {
                this.performStateEntryAction_SubPopupPoConfirmBluetoothPairingDeleteDynState(n, bl);
                break;
            }
            case 207: {
                this.performStateEntryAction_SubPopupPoConfirmBluetoothProfileDisconnectDynState(n, bl);
                break;
            }
            case 208: {
                this.performStateEntryAction_SubPopupPoConfirmBluetoothSwdlInProgressDynState(n, bl);
                break;
            }
            case 265: {
                this.performStateEntryAction_SubPopupPoConfirmPhoneCallStackDelDynState(n, bl);
                break;
            }
            case 266: {
                this.performStateEntryAction_SubPopupPoConfirmPhoneCallStackEntryDelDynState(n, bl);
                break;
            }
            case 267: {
                this.performStateEntryAction_SubPopupPoConfirmPhoneDeferredPhoneCallDynState(n, bl);
                break;
            }
            case 268: {
                this.performStateEntryAction_SubPopupPoConfirmPhoneDisablePmDynState(n, bl);
                break;
            }
            case 269: {
                this.performStateEntryAction_SubPopupPoConfirmPhoneEnableMpcDynState(n, bl);
                break;
            }
            case 270: {
                this.performStateEntryAction_SubPopupPoConfirmPhoneExtUsmConfirmationDynState(n, bl);
                break;
            }
            case 271: {
                this.performStateEntryAction_SubPopupPoConfirmPhoneFavoriteDelallDynState(n, bl);
                break;
            }
            case 272: {
                this.performStateEntryAction_SubPopupPoConfirmPhoneFavoriteDelDynState(n, bl);
                break;
            }
            case 273: {
                this.performStateEntryAction_SubPopupPoConfirmPhoneNadDataOnlyDynState(n, bl);
                break;
            }
            case 274: {
                this.performStateEntryAction_SubPopupPoConfirmPhoneNadUsageDynState(n, bl);
                break;
            }
            case 275: {
                this.performStateEntryAction_SubPopupPoConfirmPhonePinSaveDynState(n, bl);
                break;
            }
            case 276: {
                this.performStateEntryAction_SubPopupPoConfirmPhoneSecurityDelete2ndPinDynState(n, bl);
                break;
            }
            case 277: {
                this.performStateEntryAction_SubPopupPoConfirmPhoneSetupNetworkSelectionDynState(n, bl);
                break;
            }
            case 278: {
                this.performStateEntryAction_SubPopupPoConfirmPhoneTempIncomingDynState(n, bl);
                break;
            }
            case 325: {
                this.performStateEntryAction_SubPopupPoInfoBluetoothBatteryWarningDynState(n, bl);
                break;
            }
            case 326: {
                this.performStateEntryAction_SubPopupPoInfoBluetoothConnectionLostDynState(n, bl);
                break;
            }
            case 327: {
                this.performStateEntryAction_SubPopupPoInfoBluetoothContactsAvailableDynState(n, bl);
                break;
            }
            case 328: {
                this.performStateEntryAction_SubPopupPoInfoBluetoothContactsIncompleteDynState(n, bl);
                break;
            }
            case 329: {
                this.performStateEntryAction_SubPopupPoInfoBluetoothOppContactsAvailableDynState(n, bl);
                break;
            }
            case 330: {
                this.performStateEntryAction_SubPopupPoInfoBluetoothScontactErrorGeneralDynState(n, bl);
                break;
            }
            case 331: {
                this.performStateEntryAction_SubPopupPoInfoBluetoothServiceConnectionLostDynState(n, bl);
                break;
            }
            case 421: {
                this.performStateEntryAction_SubPopupPoInfoPhoneExtMecAcnConfirmationDynState(n, bl);
                break;
            }
            case 422: {
                this.performStateEntryAction_SubPopupPoInfoPhoneExtNotLicensedDynState(n, bl);
                break;
            }
            case 423: {
                this.performStateEntryAction_SubPopupPoInfoPhoneExtTerminatedByErrorDynState(n, bl);
                break;
            }
            case 424: {
                this.performStateEntryAction_SubPopupPoInfoPhoneNadBlockedAppconnDynState(n, bl);
                break;
            }
            case 425: {
                this.performStateEntryAction_SubPopupPoInfoPhoneNetworkNotReachableDynState(n, bl);
                break;
            }
            case 426: {
                this.performStateEntryAction_SubPopupPoInfoPhoneNetworkRegistrationNotAllowedDynState(n, bl);
                break;
            }
            case 427: {
                this.performStateEntryAction_SubPopupPoInfoPhoneNosupNetworkDynState(n, bl);
                break;
            }
            case 428: {
                this.performStateEntryAction_SubPopupPoInfoPhonePinChangedFailureDynState(n, bl);
                break;
            }
            case 429: {
                this.performStateEntryAction_SubPopupPoInfoPhonePinChangedSuccessDynState(n, bl);
                break;
            }
            case 430: {
                this.performStateEntryAction_SubPopupPoInfoPhoneTempServiceCodeSuccessDynState(n, bl);
                break;
            }
            case 431: {
                this.performStateEntryAction_SubPopupPoInfoPhoneTempWlcObjectChargeDynState(n, bl);
                break;
            }
            case 560: {
                this.performStateEntryAction_SubPopupPoPhoneWaitstateTransparentDynState(n, bl);
                break;
            }
            case 565: {
                this.performStateEntryAction_SubPopupPoProgressPhonePinVerificationDynState(n, bl);
                break;
            }
            case 566: {
                this.performStateEntryAction_SubPopupPoProgressPhonePukVerificationDynState(n, bl);
                break;
            }
            case 568: {
                this.performStateEntryAction_SubPopupPoProgressWaitingDynState(n, bl);
                break;
            }
            case 35: {
                this.performStateEntryAction_SubHapticPhoneDynState(n, bl);
                break;
            }
            case 640: {
                this.performStateEntryAction_SubIBluetoothBondingProfileSelection(n, bl);
                break;
            }
            case 641: {
                this.performStateEntryAction_SubIBluetoothBondingSearch(n, bl);
                break;
            }
            case 645: {
                this.performStateEntryAction_SubIBluetoothConnectWaitPhone(n, bl);
                break;
            }
            case 647: {
                this.performStateEntryAction_SubIBluetoothSetup(n, bl);
                break;
            }
            case 655: {
                this.performStateEntryAction_SubICustomerUpdateActiveBridge(n, bl);
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
            case 680: {
                this.performStateEntryAction_SubIPhoneContactsJustSelectNumber(n, bl);
                break;
            }
            case 681: {
                this.performStateEntryAction_SubIPhoneContactsSearch(n, bl);
                break;
            }
            case 682: {
                this.performStateEntryAction_SubIPhoneContactsSearchJustSelectNumber(n, bl);
                break;
            }
            case 683: {
                this.performStateEntryAction_SubIPhoneContactDetails(n, bl);
                break;
            }
            case 685: {
                this.performStateEntryAction_SubIPhoneMainDial(n, bl);
                break;
            }
            case 686: {
                this.performStateEntryAction_SubIPhoneMainDialNumber(n, bl);
                break;
            }
            case 687: {
                this.performStateEntryAction_SubIPhoneSearchContactsDevice(n, bl);
                break;
            }
            case 688: {
                this.performStateEntryAction_SubIPhoneSearchPhones(n, bl);
                break;
            }
            case 689: {
                this.performStateEntryAction_SubIPhoneSetup(n, bl);
                break;
            }
            case 690: {
                this.performStateEntryAction_SubIPhoneSetupContactsSelection(n, bl);
                break;
            }
            case 691: {
                this.performStateEntryAction_SubIPhoneSetupContactsSelectionWait(n, bl);
                break;
            }
            case 692: {
                this.performStateEntryAction_SubIPhoneSetupMailboxNumberChoose(n, bl);
                break;
            }
            case 693: {
                this.performStateEntryAction_SubIPhoneSetupNetworkSelection(n, bl);
                break;
            }
            case 694: {
                this.performStateEntryAction_SubIPhoneSetupPhoneSelection(n, bl);
                break;
            }
            case 695: {
                this.performStateEntryAction_SubIPhoneSetupPhoneSelectionWait(n, bl);
                break;
            }
            case 70: {
                this.performStateEntryAction_SubPromptingPhoneDynState(n, bl);
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
            case 639: {
                this.performStateExitAction_SubIBluetoothBondingError(n);
                break;
            }
            case 83: {
                this.performStateExitAction_SubPopupBluetoothBondingProfileSelectionCheckDynState(n);
                break;
            }
            case 646: {
                this.performStateExitAction_SubIBluetoothEnableA2dp(n);
                break;
            }
            case 684: {
                this.performStateExitAction_SubIPhoneEnableNad(n);
                break;
            }
            case 84: {
                this.performStateExitAction_SubPopupBluetoothBondingServiceRequestDynState(n);
                break;
            }
            case 638: {
                this.performStateExitAction_SubIBluetoothBonding(n);
                break;
            }
            case 85: {
                this.performStateExitAction_SubPopupBluetoothConnectAuthDynState(n);
                break;
            }
            case 642: {
                this.performStateExitAction_SubIBluetoothConnectAuth(n);
                break;
            }
            case 643: {
                this.performStateExitAction_SubIBluetoothConnectError(n);
                break;
            }
            case 86: {
                this.performStateExitAction_SubPopupBluetoothConnectDynState(n);
                break;
            }
            case 87: {
                this.performStateExitAction_SubPopupBluetoothEnableEngineDynState(n);
                break;
            }
            case 648: {
                this.performStateExitAction_SubIBluetoothToggleEngine(n);
                break;
            }
            case 88: {
                this.performStateExitAction_SubPopupBluetoothToggleEngineDynState(n);
                break;
            }
            case 154: {
                this.performStateExitAction_SubPopupPhoneEmergencyDynState(n);
                break;
            }
            case 155: {
                this.performStateExitAction_SubPopupPhoneEnableNadDynState(n);
                break;
            }
            case 156: {
                this.performStateExitAction_SubPopupPhoneSupplServiceDynState(n);
                break;
            }
            case 160: {
                this.performStateExitAction_SubPopupPoAlertBluetoothA2dpInfoDynstate(n);
                break;
            }
            case 161: {
                this.performStateExitAction_SubPopupPoAlertBluetoothDenyRoleChangeDynState(n);
                break;
            }
            case 162: {
                this.performStateExitAction_SubPopupPoAlertBluetoothPairingDeletingAllFailedDynState(n);
                break;
            }
            case 163: {
                this.performStateExitAction_SubPopupPoAlertBluetoothPairingDeletingFailedDynState(n);
                break;
            }
            case 164: {
                this.performStateExitAction_SubPopupPoAlertBluetoothProfileDisconnectFailedNoSimDynState(n);
                break;
            }
            case 165: {
                this.performStateExitAction_SubPopupPoAlertBluetoothProfileDisconnectFailedDynState(n);
                break;
            }
            case 166: {
                this.performStateExitAction_SubPopupPoAlertBluetoothSwdlErrorDynState(n);
                break;
            }
            case 172: {
                this.performStateExitAction_SubPopupPoAlertPhoneActiveCallHandoverWarningDynState(n);
                break;
            }
            case 173: {
                this.performStateExitAction_SubPopupPoAlertPhoneActiveCallTerminationWarningDynState(n);
                break;
            }
            case 174: {
                this.performStateExitAction_SubPopupPoAlertPhoneAdditionalErrorDynState(n);
                break;
            }
            case 175: {
                this.performStateExitAction_SubPopupPoAlertPhoneDialingFailedDynState(n);
                break;
            }
            case 176: {
                this.performStateExitAction_SubPopupPoAlertPhoneEcallErrorDynState(n);
                break;
            }
            case 177: {
                this.performStateExitAction_SubPopupPoAlertPhoneMecAcnLicenseExpiryWarningDynState(n);
                break;
            }
            case 178: {
                this.performStateExitAction_SubPopupPoAlertPhoneNotInstalledDynState(n);
                break;
            }
            case 179: {
                this.performStateExitAction_SubPopupPoAlertPhoneNoLineFreeDynState(n);
                break;
            }
            case 180: {
                this.performStateExitAction_SubPopupPoAlertPhonePinInvalidDynState(n);
                break;
            }
            case 181: {
                this.performStateExitAction_SubPopupPoAlertPhonePukInvalidDynState(n);
                break;
            }
            case 182: {
                this.performStateExitAction_SubPopupPoAlertPhoneSapDowngradeDynState(n);
                break;
            }
            case 183: {
                this.performStateExitAction_SubPopupPoAlertPhoneSimDataonlyDynState(n);
                break;
            }
            case 184: {
                this.performStateExitAction_SubPopupPoAlertPhoneTempServiceCodeFailureDynState(n);
                break;
            }
            case 185: {
                this.performStateExitAction_SubPopupPoAlertPhoneTempWlcForeignObjectDetectionDynState(n);
                break;
            }
            case 201: {
                this.performStateExitAction_SubPopupPoConfirmBluetoothContactsFailureDynState(n);
                break;
            }
            case 202: {
                this.performStateExitAction_SubPopupPoConfirmBluetoothDisableA2dpDynState(n);
                break;
            }
            case 203: {
                this.performStateExitAction_SubPopupPoConfirmBluetoothEnableA2dpDynState(n);
                break;
            }
            case 204: {
                this.performStateExitAction_SubPopupPoConfirmBluetoothHelpDynState(n);
                break;
            }
            case 205: {
                this.performStateExitAction_SubPopupPoConfirmBluetoothPairingDeleteAllDynState(n);
                break;
            }
            case 206: {
                this.performStateExitAction_SubPopupPoConfirmBluetoothPairingDeleteDynState(n);
                break;
            }
            case 207: {
                this.performStateExitAction_SubPopupPoConfirmBluetoothProfileDisconnectDynState(n);
                break;
            }
            case 208: {
                this.performStateExitAction_SubPopupPoConfirmBluetoothSwdlInProgressDynState(n);
                break;
            }
            case 265: {
                this.performStateExitAction_SubPopupPoConfirmPhoneCallStackDelDynState(n);
                break;
            }
            case 266: {
                this.performStateExitAction_SubPopupPoConfirmPhoneCallStackEntryDelDynState(n);
                break;
            }
            case 267: {
                this.performStateExitAction_SubPopupPoConfirmPhoneDeferredPhoneCallDynState(n);
                break;
            }
            case 268: {
                this.performStateExitAction_SubPopupPoConfirmPhoneDisablePmDynState(n);
                break;
            }
            case 269: {
                this.performStateExitAction_SubPopupPoConfirmPhoneEnableMpcDynState(n);
                break;
            }
            case 270: {
                this.performStateExitAction_SubPopupPoConfirmPhoneExtUsmConfirmationDynState(n);
                break;
            }
            case 271: {
                this.performStateExitAction_SubPopupPoConfirmPhoneFavoriteDelallDynState(n);
                break;
            }
            case 272: {
                this.performStateExitAction_SubPopupPoConfirmPhoneFavoriteDelDynState(n);
                break;
            }
            case 273: {
                this.performStateExitAction_SubPopupPoConfirmPhoneNadDataOnlyDynState(n);
                break;
            }
            case 274: {
                this.performStateExitAction_SubPopupPoConfirmPhoneNadUsageDynState(n);
                break;
            }
            case 275: {
                this.performStateExitAction_SubPopupPoConfirmPhonePinSaveDynState(n);
                break;
            }
            case 276: {
                this.performStateExitAction_SubPopupPoConfirmPhoneSecurityDelete2ndPinDynState(n);
                break;
            }
            case 277: {
                this.performStateExitAction_SubPopupPoConfirmPhoneSetupNetworkSelectionDynState(n);
                break;
            }
            case 278: {
                this.performStateExitAction_SubPopupPoConfirmPhoneTempIncomingDynState(n);
                break;
            }
            case 325: {
                this.performStateExitAction_SubPopupPoInfoBluetoothBatteryWarningDynState(n);
                break;
            }
            case 326: {
                this.performStateExitAction_SubPopupPoInfoBluetoothConnectionLostDynState(n);
                break;
            }
            case 327: {
                this.performStateExitAction_SubPopupPoInfoBluetoothContactsAvailableDynState(n);
                break;
            }
            case 328: {
                this.performStateExitAction_SubPopupPoInfoBluetoothContactsIncompleteDynState(n);
                break;
            }
            case 329: {
                this.performStateExitAction_SubPopupPoInfoBluetoothOppContactsAvailableDynState(n);
                break;
            }
            case 330: {
                this.performStateExitAction_SubPopupPoInfoBluetoothScontactErrorGeneralDynState(n);
                break;
            }
            case 331: {
                this.performStateExitAction_SubPopupPoInfoBluetoothServiceConnectionLostDynState(n);
                break;
            }
            case 421: {
                this.performStateExitAction_SubPopupPoInfoPhoneExtMecAcnConfirmationDynState(n);
                break;
            }
            case 422: {
                this.performStateExitAction_SubPopupPoInfoPhoneExtNotLicensedDynState(n);
                break;
            }
            case 423: {
                this.performStateExitAction_SubPopupPoInfoPhoneExtTerminatedByErrorDynState(n);
                break;
            }
            case 424: {
                this.performStateExitAction_SubPopupPoInfoPhoneNadBlockedAppconnDynState(n);
                break;
            }
            case 425: {
                this.performStateExitAction_SubPopupPoInfoPhoneNetworkNotReachableDynState(n);
                break;
            }
            case 426: {
                this.performStateExitAction_SubPopupPoInfoPhoneNetworkRegistrationNotAllowedDynState(n);
                break;
            }
            case 427: {
                this.performStateExitAction_SubPopupPoInfoPhoneNosupNetworkDynState(n);
                break;
            }
            case 428: {
                this.performStateExitAction_SubPopupPoInfoPhonePinChangedFailureDynState(n);
                break;
            }
            case 429: {
                this.performStateExitAction_SubPopupPoInfoPhonePinChangedSuccessDynState(n);
                break;
            }
            case 430: {
                this.performStateExitAction_SubPopupPoInfoPhoneTempServiceCodeSuccessDynState(n);
                break;
            }
            case 431: {
                this.performStateExitAction_SubPopupPoInfoPhoneTempWlcObjectChargeDynState(n);
                break;
            }
            case 560: {
                this.performStateExitAction_SubPopupPoPhoneWaitstateTransparentDynState(n);
                break;
            }
            case 565: {
                this.performStateExitAction_SubPopupPoProgressPhonePinVerificationDynState(n);
                break;
            }
            case 566: {
                this.performStateExitAction_SubPopupPoProgressPhonePukVerificationDynState(n);
                break;
            }
            case 568: {
                this.performStateExitAction_SubPopupPoProgressWaitingDynState(n);
                break;
            }
            case 35: {
                this.performStateExitAction_SubHapticPhoneDynState(n);
                break;
            }
            case 640: {
                this.performStateExitAction_SubIBluetoothBondingProfileSelection(n);
                break;
            }
            case 641: {
                this.performStateExitAction_SubIBluetoothBondingSearch(n);
                break;
            }
            case 647: {
                this.performStateExitAction_SubIBluetoothSetup(n);
                break;
            }
            case 655: {
                this.performStateExitAction_SubICustomerUpdateActiveBridge(n);
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
            case 680: {
                this.performStateExitAction_SubIPhoneContactsJustSelectNumber(n);
                break;
            }
            case 681: {
                this.performStateExitAction_SubIPhoneContactsSearch(n);
                break;
            }
            case 682: {
                this.performStateExitAction_SubIPhoneContactsSearchJustSelectNumber(n);
                break;
            }
            case 683: {
                this.performStateExitAction_SubIPhoneContactDetails(n);
                break;
            }
            case 685: {
                this.performStateExitAction_SubIPhoneMainDial(n);
                break;
            }
            case 686: {
                this.performStateExitAction_SubIPhoneMainDialNumber(n);
                break;
            }
            case 687: {
                this.performStateExitAction_SubIPhoneSearchContactsDevice(n);
                break;
            }
            case 688: {
                this.performStateExitAction_SubIPhoneSearchPhones(n);
                break;
            }
            case 689: {
                this.performStateExitAction_SubIPhoneSetup(n);
                break;
            }
            case 690: {
                this.performStateExitAction_SubIPhoneSetupContactsSelection(n);
                break;
            }
            case 691: {
                this.performStateExitAction_SubIPhoneSetupContactsSelectionWait(n);
                break;
            }
            case 692: {
                this.performStateExitAction_SubIPhoneSetupMailboxNumberChoose(n);
                break;
            }
            case 693: {
                this.performStateExitAction_SubIPhoneSetupNetworkSelection(n);
                break;
            }
            case 694: {
                this.performStateExitAction_SubIPhoneSetupPhoneSelection(n);
                break;
            }
            case 695: {
                this.performStateExitAction_SubIPhoneSetupPhoneSelectionWait(n);
                break;
            }
            case 70: {
                this.performStateExitAction_SubPromptingPhoneDynState(n);
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
            case 638: {
                return this.evalInternalTransitionGuard_SubIBluetoothBonding(n);
            }
            case 642: {
                return this.evalInternalTransitionGuard_SubIBluetoothConnectAuth(n);
            }
            case 35: {
                return this.evalInternalTransitionGuard_SubHapticPhoneDynState(n);
            }
            case 641: {
                return this.evalInternalTransitionGuard_SubIBluetoothBondingSearch(n);
            }
            case 647: {
                return this.evalInternalTransitionGuard_SubIBluetoothSetup(n);
            }
            case 680: {
                return this.evalInternalTransitionGuard_SubIPhoneContactsJustSelectNumber(n);
            }
            case 683: {
                return this.evalInternalTransitionGuard_SubIPhoneContactDetails(n);
            }
            case 685: {
                return this.evalInternalTransitionGuard_SubIPhoneMainDial(n);
            }
            case 689: {
                return this.evalInternalTransitionGuard_SubIPhoneSetup(n);
            }
            case 692: {
                return this.evalInternalTransitionGuard_SubIPhoneSetupMailboxNumberChoose(n);
            }
            case 694: {
                return this.evalInternalTransitionGuard_SubIPhoneSetupPhoneSelection(n);
            }
        }
        return true;
    }

    @Override
    public void performInternalTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 83: {
                this.performInternalTransitionAction_SubPopupBluetoothBondingProfileSelectionCheckDynState(n);
                break;
            }
            case 638: {
                this.performInternalTransitionAction_SubIBluetoothBonding(n);
                break;
            }
            case 642: {
                this.performInternalTransitionAction_SubIBluetoothConnectAuth(n);
                break;
            }
            case 87: {
                this.performInternalTransitionAction_SubPopupBluetoothEnableEngineDynState(n);
                break;
            }
            case 88: {
                this.performInternalTransitionAction_SubPopupBluetoothToggleEngineDynState(n);
                break;
            }
            case 154: {
                this.performInternalTransitionAction_SubPopupPhoneEmergencyDynState(n);
                break;
            }
            case 203: {
                this.performInternalTransitionAction_SubPopupPoConfirmBluetoothEnableA2dpDynState(n);
                break;
            }
            case 278: {
                this.performInternalTransitionAction_SubPopupPoConfirmPhoneTempIncomingDynState(n);
                break;
            }
            case 421: {
                this.performInternalTransitionAction_SubPopupPoInfoPhoneExtMecAcnConfirmationDynState(n);
                break;
            }
            case 35: {
                this.performInternalTransitionAction_SubHapticPhoneDynState(n);
                break;
            }
            case 640: {
                this.performInternalTransitionAction_SubIBluetoothBondingProfileSelection(n);
                break;
            }
            case 641: {
                this.performInternalTransitionAction_SubIBluetoothBondingSearch(n);
                break;
            }
            case 647: {
                this.performInternalTransitionAction_SubIBluetoothSetup(n);
                break;
            }
            case 680: {
                this.performInternalTransitionAction_SubIPhoneContactsJustSelectNumber(n);
                break;
            }
            case 681: {
                this.performInternalTransitionAction_SubIPhoneContactsSearch(n);
                break;
            }
            case 682: {
                this.performInternalTransitionAction_SubIPhoneContactsSearchJustSelectNumber(n);
                break;
            }
            case 683: {
                this.performInternalTransitionAction_SubIPhoneContactDetails(n);
                break;
            }
            case 685: {
                this.performInternalTransitionAction_SubIPhoneMainDial(n);
                break;
            }
            case 689: {
                this.performInternalTransitionAction_SubIPhoneSetup(n);
                break;
            }
            case 690: {
                this.performInternalTransitionAction_SubIPhoneSetupContactsSelection(n);
                break;
            }
            case 692: {
                this.performInternalTransitionAction_SubIPhoneSetupMailboxNumberChoose(n);
                break;
            }
            case 693: {
                this.performInternalTransitionAction_SubIPhoneSetupNetworkSelection(n);
                break;
            }
            case 694: {
                this.performInternalTransitionAction_SubIPhoneSetupPhoneSelection(n);
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
            case 83: {
                return this.evalTriggeredTransitionGuard_SubPopupBluetoothBondingProfileSelectionCheckDynState(n);
            }
            case 648: {
                return this.evalTriggeredTransitionGuard_SubIBluetoothToggleEngine(n);
            }
            case 35: {
                return this.evalTriggeredTransitionGuard_SubHapticPhoneDynState(n);
            }
            case 641: {
                return this.evalTriggeredTransitionGuard_SubIBluetoothBondingSearch(n);
            }
            case 647: {
                return this.evalTriggeredTransitionGuard_SubIBluetoothSetup(n);
            }
            case 680: {
                return this.evalTriggeredTransitionGuard_SubIPhoneContactsJustSelectNumber(n);
            }
            case 681: {
                return this.evalTriggeredTransitionGuard_SubIPhoneContactsSearch(n);
            }
            case 682: {
                return this.evalTriggeredTransitionGuard_SubIPhoneContactsSearchJustSelectNumber(n);
            }
            case 683: {
                return this.evalTriggeredTransitionGuard_SubIPhoneContactDetails(n);
            }
            case 685: {
                return this.evalTriggeredTransitionGuard_SubIPhoneMainDial(n);
            }
            case 689: {
                return this.evalTriggeredTransitionGuard_SubIPhoneSetup(n);
            }
            case 690: {
                return this.evalTriggeredTransitionGuard_SubIPhoneSetupContactsSelection(n);
            }
            case 694: {
                return this.evalTriggeredTransitionGuard_SubIPhoneSetupPhoneSelection(n);
            }
        }
        return true;
    }

    @Override
    public void performTriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 639: {
                this.performTriggeredTransitionAction_SubIBluetoothBondingError(n);
                break;
            }
            case 83: {
                this.performTriggeredTransitionAction_SubPopupBluetoothBondingProfileSelectionCheckDynState(n);
                break;
            }
            case 646: {
                this.performTriggeredTransitionAction_SubIBluetoothEnableA2dp(n);
                break;
            }
            case 84: {
                this.performTriggeredTransitionAction_SubPopupBluetoothBondingServiceRequestDynState(n);
                break;
            }
            case 638: {
                this.performTriggeredTransitionAction_SubIBluetoothBonding(n);
                break;
            }
            case 642: {
                this.performTriggeredTransitionAction_SubIBluetoothConnectAuth(n);
                break;
            }
            case 86: {
                this.performTriggeredTransitionAction_SubPopupBluetoothConnectDynState(n);
                break;
            }
            case 87: {
                this.performTriggeredTransitionAction_SubPopupBluetoothEnableEngineDynState(n);
                break;
            }
            case 648: {
                this.performTriggeredTransitionAction_SubIBluetoothToggleEngine(n);
                break;
            }
            case 154: {
                this.performTriggeredTransitionAction_SubPopupPhoneEmergencyDynState(n);
                break;
            }
            case 156: {
                this.performTriggeredTransitionAction_SubPopupPhoneSupplServiceDynState(n);
                break;
            }
            case 166: {
                this.performTriggeredTransitionAction_SubPopupPoAlertBluetoothSwdlErrorDynState(n);
                break;
            }
            case 177: {
                this.performTriggeredTransitionAction_SubPopupPoAlertPhoneMecAcnLicenseExpiryWarningDynState(n);
                break;
            }
            case 201: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmBluetoothContactsFailureDynState(n);
                break;
            }
            case 202: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmBluetoothDisableA2dpDynState(n);
                break;
            }
            case 205: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmBluetoothPairingDeleteAllDynState(n);
                break;
            }
            case 206: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmBluetoothPairingDeleteDynState(n);
                break;
            }
            case 207: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmBluetoothProfileDisconnectDynState(n);
                break;
            }
            case 265: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneCallStackDelDynState(n);
                break;
            }
            case 266: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneCallStackEntryDelDynState(n);
                break;
            }
            case 267: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneDeferredPhoneCallDynState(n);
                break;
            }
            case 268: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneDisablePmDynState(n);
                break;
            }
            case 269: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneEnableMpcDynState(n);
                break;
            }
            case 270: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneExtUsmConfirmationDynState(n);
                break;
            }
            case 271: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneFavoriteDelallDynState(n);
                break;
            }
            case 272: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneFavoriteDelDynState(n);
                break;
            }
            case 273: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneNadDataOnlyDynState(n);
                break;
            }
            case 274: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneNadUsageDynState(n);
                break;
            }
            case 275: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmPhonePinSaveDynState(n);
                break;
            }
            case 276: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneSecurityDelete2ndPinDynState(n);
                break;
            }
            case 277: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneSetupNetworkSelectionDynState(n);
                break;
            }
            case 278: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneTempIncomingDynState(n);
                break;
            }
            case 421: {
                this.performTriggeredTransitionAction_SubPopupPoInfoPhoneExtMecAcnConfirmationDynState(n);
                break;
            }
            case 35: {
                this.performTriggeredTransitionAction_SubHapticPhoneDynState(n);
                break;
            }
            case 641: {
                this.performTriggeredTransitionAction_SubIBluetoothBondingSearch(n);
                break;
            }
            case 647: {
                this.performTriggeredTransitionAction_SubIBluetoothSetup(n);
                break;
            }
            case 680: {
                this.performTriggeredTransitionAction_SubIPhoneContactsJustSelectNumber(n);
                break;
            }
            case 681: {
                this.performTriggeredTransitionAction_SubIPhoneContactsSearch(n);
                break;
            }
            case 682: {
                this.performTriggeredTransitionAction_SubIPhoneContactsSearchJustSelectNumber(n);
                break;
            }
            case 683: {
                this.performTriggeredTransitionAction_SubIPhoneContactDetails(n);
                break;
            }
            case 685: {
                this.performTriggeredTransitionAction_SubIPhoneMainDial(n);
                break;
            }
            case 689: {
                this.performTriggeredTransitionAction_SubIPhoneSetup(n);
                break;
            }
            case 690: {
                this.performTriggeredTransitionAction_SubIPhoneSetupContactsSelection(n);
                break;
            }
            case 693: {
                this.performTriggeredTransitionAction_SubIPhoneSetupNetworkSelection(n);
                break;
            }
            case 694: {
                this.performTriggeredTransitionAction_SubIPhoneSetupPhoneSelection(n);
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
            case 639: {
                return this.evalUntriggeredTransitionGuard_SubIBluetoothBondingError(n);
            }
            case 83: {
                return this.evalUntriggeredTransitionGuard_SubPopupBluetoothBondingProfileSelectionCheckDynState(n);
            }
            case 84: {
                return this.evalUntriggeredTransitionGuard_SubPopupBluetoothBondingServiceRequestDynState(n);
            }
            case 638: {
                return this.evalUntriggeredTransitionGuard_SubIBluetoothBonding(n);
            }
            case 642: {
                return this.evalUntriggeredTransitionGuard_SubIBluetoothConnectAuth(n);
            }
            case 643: {
                return this.evalUntriggeredTransitionGuard_SubIBluetoothConnectError(n);
            }
            case 86: {
                return this.evalUntriggeredTransitionGuard_SubPopupBluetoothConnectDynState(n);
            }
            case 87: {
                return this.evalUntriggeredTransitionGuard_SubPopupBluetoothEnableEngineDynState(n);
            }
            case 648: {
                return this.evalUntriggeredTransitionGuard_SubIBluetoothToggleEngine(n);
            }
            case 156: {
                return this.evalUntriggeredTransitionGuard_SubPopupPhoneSupplServiceDynState(n);
            }
            case 268: {
                return this.evalUntriggeredTransitionGuard_SubPopupPoConfirmPhoneDisablePmDynState(n);
            }
            case 274: {
                return this.evalUntriggeredTransitionGuard_SubPopupPoConfirmPhoneNadUsageDynState(n);
            }
            case 278: {
                return this.evalUntriggeredTransitionGuard_SubPopupPoConfirmPhoneTempIncomingDynState(n);
            }
            case 35: {
                return this.evalUntriggeredTransitionGuard_SubHapticPhoneDynState(n);
            }
            case 640: {
                return this.evalUntriggeredTransitionGuard_SubIBluetoothBondingProfileSelection(n);
            }
            case 641: {
                return this.evalUntriggeredTransitionGuard_SubIBluetoothBondingSearch(n);
            }
            case 645: {
                return this.evalUntriggeredTransitionGuard_SubIBluetoothConnectWaitPhone(n);
            }
            case 647: {
                return this.evalUntriggeredTransitionGuard_SubIBluetoothSetup(n);
            }
            case 655: {
                return this.evalUntriggeredTransitionGuard_SubICustomerUpdateActiveBridge(n);
            }
            case 680: {
                return this.evalUntriggeredTransitionGuard_SubIPhoneContactsJustSelectNumber(n);
            }
            case 683: {
                return this.evalUntriggeredTransitionGuard_SubIPhoneContactDetails(n);
            }
            case 685: {
                return this.evalUntriggeredTransitionGuard_SubIPhoneMainDial(n);
            }
            case 686: {
                return this.evalUntriggeredTransitionGuard_SubIPhoneMainDialNumber(n);
            }
            case 687: {
                return this.evalUntriggeredTransitionGuard_SubIPhoneSearchContactsDevice(n);
            }
            case 688: {
                return this.evalUntriggeredTransitionGuard_SubIPhoneSearchPhones(n);
            }
            case 689: {
                return this.evalUntriggeredTransitionGuard_SubIPhoneSetup(n);
            }
            case 691: {
                return this.evalUntriggeredTransitionGuard_SubIPhoneSetupContactsSelectionWait(n);
            }
            case 695: {
                return this.evalUntriggeredTransitionGuard_SubIPhoneSetupPhoneSelectionWait(n);
            }
        }
        return true;
    }

    @Override
    public void performUntriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 83: {
                this.performUntriggeredTransitionAction_SubPopupBluetoothBondingProfileSelectionCheckDynState(n);
                break;
            }
            case 646: {
                this.performUntriggeredTransitionAction_SubIBluetoothEnableA2dp(n);
                break;
            }
            case 684: {
                this.performUntriggeredTransitionAction_SubIPhoneEnableNad(n);
                break;
            }
            case 84: {
                this.performUntriggeredTransitionAction_SubPopupBluetoothBondingServiceRequestDynState(n);
                break;
            }
            case 638: {
                this.performUntriggeredTransitionAction_SubIBluetoothBonding(n);
                break;
            }
            case 642: {
                this.performUntriggeredTransitionAction_SubIBluetoothConnectAuth(n);
                break;
            }
            case 86: {
                this.performUntriggeredTransitionAction_SubPopupBluetoothConnectDynState(n);
                break;
            }
            case 87: {
                this.performUntriggeredTransitionAction_SubPopupBluetoothEnableEngineDynState(n);
                break;
            }
            case 648: {
                this.performUntriggeredTransitionAction_SubIBluetoothToggleEngine(n);
                break;
            }
            case 88: {
                this.performUntriggeredTransitionAction_SubPopupBluetoothToggleEngineDynState(n);
                break;
            }
            case 156: {
                this.performUntriggeredTransitionAction_SubPopupPhoneSupplServiceDynState(n);
                break;
            }
            case 175: {
                this.performUntriggeredTransitionAction_SubPopupPoAlertPhoneDialingFailedDynState(n);
                break;
            }
            case 266: {
                this.performUntriggeredTransitionAction_SubPopupPoConfirmPhoneCallStackEntryDelDynState(n);
                break;
            }
            case 268: {
                this.performUntriggeredTransitionAction_SubPopupPoConfirmPhoneDisablePmDynState(n);
                break;
            }
            case 274: {
                this.performUntriggeredTransitionAction_SubPopupPoConfirmPhoneNadUsageDynState(n);
                break;
            }
            case 277: {
                this.performUntriggeredTransitionAction_SubPopupPoConfirmPhoneSetupNetworkSelectionDynState(n);
                break;
            }
            case 278: {
                this.performUntriggeredTransitionAction_SubPopupPoConfirmPhoneTempIncomingDynState(n);
                break;
            }
            case 35: {
                this.performUntriggeredTransitionAction_SubHapticPhoneDynState(n);
                break;
            }
            case 640: {
                this.performUntriggeredTransitionAction_SubIBluetoothBondingProfileSelection(n);
                break;
            }
            case 641: {
                this.performUntriggeredTransitionAction_SubIBluetoothBondingSearch(n);
                break;
            }
            case 645: {
                this.performUntriggeredTransitionAction_SubIBluetoothConnectWaitPhone(n);
                break;
            }
            case 647: {
                this.performUntriggeredTransitionAction_SubIBluetoothSetup(n);
                break;
            }
            case 680: {
                this.performUntriggeredTransitionAction_SubIPhoneContactsJustSelectNumber(n);
                break;
            }
            case 681: {
                this.performUntriggeredTransitionAction_SubIPhoneContactsSearch(n);
                break;
            }
            case 682: {
                this.performUntriggeredTransitionAction_SubIPhoneContactsSearchJustSelectNumber(n);
                break;
            }
            case 683: {
                this.performUntriggeredTransitionAction_SubIPhoneContactDetails(n);
                break;
            }
            case 685: {
                this.performUntriggeredTransitionAction_SubIPhoneMainDial(n);
                break;
            }
            case 686: {
                this.performUntriggeredTransitionAction_SubIPhoneMainDialNumber(n);
                break;
            }
            case 687: {
                this.performUntriggeredTransitionAction_SubIPhoneSearchContactsDevice(n);
                break;
            }
            case 688: {
                this.performUntriggeredTransitionAction_SubIPhoneSearchPhones(n);
                break;
            }
            case 689: {
                this.performUntriggeredTransitionAction_SubIPhoneSetup(n);
                break;
            }
            case 690: {
                this.performUntriggeredTransitionAction_SubIPhoneSetupContactsSelection(n);
                break;
            }
            case 691: {
                this.performUntriggeredTransitionAction_SubIPhoneSetupContactsSelectionWait(n);
                break;
            }
            case 692: {
                this.performUntriggeredTransitionAction_SubIPhoneSetupMailboxNumberChoose(n);
                break;
            }
            case 694: {
                this.performUntriggeredTransitionAction_SubIPhoneSetupPhoneSelection(n);
                break;
            }
            case 695: {
                this.performUntriggeredTransitionAction_SubIPhoneSetupPhoneSelectionWait(n);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void performStateEntryAction_SubIBluetoothBondingError(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(-458162176, 0);
                break;
            }
            case 4: {
                if (this.getLicValue(2855, 6, 0, 0) == 15) {
                    this.setString(14443, FormatterService.format((CharSequence)this.getI18nString(3975), this.getLicValue(2855, 0, 0, ""), this.getString(24686)));
                }
                if (this.getLicValue(2855, 6, 0, 0) == 14) {
                    this.setString(14443, FormatterService.format((CharSequence)this.getI18nString(3976), this.getLicValue(2855, 0, 0, ""), this.getString(24686)));
                }
                this.enterPopupView("Pabbca", 639, 4);
                break;
            }
            case 5: {
                this.enterPopupView("Pabbcc", 639, 5);
                break;
            }
            case 6: {
                this.setString(-608305152, this.getString(378994688));
                if (this.getInteger(-116195072) != 0 && !this.getString(1423114240).equalsIgnoreCase(this.getString(15902))) {
                    this.setString(-608305152, this.getString(1423114240));
                }
                this.enterPopupView("Pabbclee", 639, 6);
                break;
            }
            case 7: {
                this.enterPopupView("Pabbge", 639, 7);
                break;
            }
            case 8: {
                this.enterPopupView("Pabboor", 639, 8);
                break;
            }
            case 9: {
                this.enterPopupView("Pabbpge", 639, 9);
                break;
            }
            case 10: {
                this.enterPopupView("Pabbppe", 639, 10);
                break;
            }
            case 11: {
                this.enterPopupView("Pabbpte", 639, 11);
                break;
            }
            case 12: {
                this.enterPopupView("Pabbse", 639, 12);
                break;
            }
            case 13: {
                this.enterPopupView("Pabbsni", 639, 13);
                break;
            }
            case 14: {
                this.setString(801832960, this.getI18nString(4133));
                this.setString(801832960, this.getI18nString(4132));
                if (this.getLicValue(2353, 0, this.getInteger(-846462976), "").equals(DataConstants.LANG_SYSTEM_SETUP_MAIN_LANGUAGE_LIST_ISO[0])) {
                    this.setString(801832960, this.getI18nString(4131));
                }
                this.enterPopupView("Pcbh", 639, 14);
                break;
            }
        }
    }

    private void performStateExitAction_SubIBluetoothBondingError(int n) {
        switch (n - this.S_OFFSET) {
            case 4: {
                this.leavePopupView("Pabbca");
                break;
            }
            case 5: {
                this.leavePopupView("Pabbcc");
                break;
            }
            case 6: {
                this.leavePopupView("Pabbclee");
                break;
            }
            case 7: {
                this.leavePopupView("Pabbge");
                break;
            }
            case 8: {
                this.leavePopupView("Pabboor");
                break;
            }
            case 9: {
                this.leavePopupView("Pabbpge");
                break;
            }
            case 10: {
                this.leavePopupView("Pabbppe");
                break;
            }
            case 11: {
                this.leavePopupView("Pabbpte");
                break;
            }
            case 12: {
                this.leavePopupView("Pabbse");
                break;
            }
            case 13: {
                this.leavePopupView("Pabbsni");
                break;
            }
            case 14: {
                this.leavePopupView("Pcbh");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubIBluetoothBondingError(int n) {
        this.performTriggeredTransitionAction_SubIBluetoothBondingError0(n);
    }

    private void performTriggeredTransitionAction_SubIBluetoothBondingError0(int n) {
        switch (n - this.TT_OFFSET) {
            case 2: {
                this.setInteger(22854, 1);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(22854));
                this.triggerObserver(-396618432, eventGeneric);
                this.setInteger(-458162176, 1);
                break;
            }
            case 3: {
                this.setInteger(22854, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(22854));
                this.triggerObserver(-396618432, eventGeneric);
                this.setInteger(-458162176, 1);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIBluetoothBondingError(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                return this.getLicValue(2855, 6, 0, 0) == 1 || this.getLicValue(2855, 6, 0, 0) == 7 || this.getLicValue(2855, 6, 0, 0) == 8 || this.getLicValue(2855, 6, 0, 0) == 9;
            }
            case 2: {
                return this.getLicValue(2855, 6, 0, 0) == 2;
            }
            case 3: {
                return this.getLicValue(2855, 6, 0, 0) == 3;
            }
            case 4: {
                return this.getLicValue(2855, 6, 0, 0) == 4;
            }
            case 5: {
                return this.getLicValue(2855, 6, 0, 0) == 5;
            }
            case 6: {
                return this.getLicValue(2855, 6, 0, 0) == 6;
            }
            case 7: {
                return this.getLicValue(2855, 6, 0, 0) == 11 && this.getBoolean(30686);
            }
            case 8: {
                return this.getLicValue(2855, 6, 0, 0) == 12;
            }
            case 9: {
                return this.getLicValue(2855, 6, 0, 0) == 13;
            }
            case 10: {
                return this.getLicValue(2855, 6, 0, 0) == 14 || this.getLicValue(2855, 6, 0, 0) == 15;
            }
        }
        return true;
    }

    private void performStateEntryAction_SubPopupBluetoothBondingProfileSelectionCheckDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 6: {
                this.enterPopupView("Pabpna", 83, 6);
                break;
            }
            case 7: {
                this.enterPopupView("Papnht", 83, 7);
                break;
            }
            case 8: {
                this.enterPopupView("Papnnf", 83, 8);
                break;
            }
            case 9: {
                this.enterPopupView("Pcbea", 83, 9);
                break;
            }
            case 10: {
                this.enterPopupView("Pcpen", 83, 10);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupBluetoothBondingProfileSelectionCheckDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1549438281);
                break;
            }
            case 6: {
                this.leavePopupView("Pabpna");
                break;
            }
            case 7: {
                this.leavePopupView("Papnht");
                break;
            }
            case 8: {
                this.leavePopupView("Papnnf");
                break;
            }
            case 9: {
                this.leavePopupView("Pcbea");
                break;
            }
            case 10: {
                this.leavePopupView("Pcpen");
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubPopupBluetoothBondingProfileSelectionCheckDynState(int n) {
        this.performInternalTransitionAction_SubPopupBluetoothBondingProfileSelectionCheckDynState0(n);
    }

    private void performInternalTransitionAction_SubPopupBluetoothBondingProfileSelectionCheckDynState0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setBoolean(28564, true);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2069925193);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubPopupBluetoothBondingProfileSelectionCheckDynState(int n) {
        switch (n - this.TT_OFFSET) {
            case 5: {
                return this.getBoolean(30686);
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubPopupBluetoothBondingProfileSelectionCheckDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupBluetoothBondingProfileSelectionCheckDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupBluetoothBondingProfileSelectionCheckDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                this.setBoolean(28564, false);
                break;
            }
            case 2: {
                this.setBoolean(28564, false);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubPopupBluetoothBondingProfileSelectionCheckDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 3: {
                return this.getInteger(28224) == 1 && !this.getBoolean(31551) && this.getBoolean(30686);
            }
            case 4: {
                return this.getInteger(28224) == 1 && this.getInteger(15949) == 5 && this.getBoolean(30686);
            }
            case 5: {
                return this.getInteger(28224) == 1 && this.getInteger(15949) == 1 && this.getBoolean(30686);
            }
            case 6: {
                return !this.getBoolean(1191313664) && (this.getInteger(28224) == 6 || this.getInteger(28224) == 5);
            }
            case 7: {
                return !this.getBoolean(-454950912);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubPopupBluetoothBondingProfileSelectionCheckDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                if (this.getBoolean(-454950912)) break;
                this.setBoolean(-454950912, true);
                break;
            }
            case 2: {
                this.setBoolean(28564, false);
                break;
            }
            case 7: {
                this.setBoolean(28564, false);
                break;
            }
            case 8: {
                this.setBoolean(28564, true);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIBluetoothEnableA2dp(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pabane", 646, 3);
                break;
            }
            case 4: {
                this.enterPopupView("Ppbeaw", 646, 4);
                break;
            }
        }
    }

    private void performStateExitAction_SubIBluetoothEnableA2dp(int n) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.leavePopupView("Pabane");
                break;
            }
            case 4: {
                this.leavePopupView("Ppbeaw");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubIBluetoothEnableA2dp(int n) {
        this.performTriggeredTransitionAction_SubIBluetoothEnableA2dp0(n);
    }

    private void performTriggeredTransitionAction_SubIBluetoothEnableA2dp0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.setBoolean(28564, false);
                break;
            }
        }
    }

    private void performUntriggeredTransitionAction_SubIBluetoothEnableA2dp(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                this.setBoolean(-1466236928, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1466236928));
                this.triggerObserver(-503119808, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIPhoneEnableNad(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Papnne", 684, 3);
                break;
            }
            case 4: {
                this.enterPopupView("Ppw_9F78", 684, 4);
                break;
            }
        }
    }

    private void performStateExitAction_SubIPhoneEnableNad(int n) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.leavePopupView("Papnne");
                break;
            }
            case 4: {
                this.leavePopupView("Ppw_9F78");
                break;
            }
        }
    }

    private void performUntriggeredTransitionAction_SubIPhoneEnableNad(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                this.setBoolean(-638976000, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-638976000));
                this.triggerObserver(621019200, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupBluetoothBondingServiceRequestDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 7: {
                this.enterPopupView("Pabbse", 84, 7);
                break;
            }
            case 8: {
                this.setString(801832960, this.getI18nString(4133));
                this.setString(801832960, this.getI18nString(4132));
                if (this.getLicValue(2353, 0, this.getInteger(-846462976), "").equals(DataConstants.LANG_SYSTEM_SETUP_MAIN_LANGUAGE_LIST_ISO[0])) {
                    this.setString(801832960, this.getI18nString(4131));
                }
                this.enterPopupView("Pcbh", 84, 8);
                break;
            }
            case 9: {
                this.enterPopupView("Ppbsr", 84, 9);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupBluetoothBondingServiceRequestDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1582992713);
                this.triggerObserver(-50069440);
                break;
            }
            case 7: {
                this.leavePopupView("Pabbse");
                break;
            }
            case 8: {
                this.leavePopupView("Pcbh");
                break;
            }
            case 9: {
                this.leavePopupView("Ppbsr");
                this.triggerObserver(-50069440);
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupBluetoothBondingServiceRequestDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupBluetoothBondingServiceRequestDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupBluetoothBondingServiceRequestDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.setInteger(-1113784320, 3);
                break;
            }
            case 1: {
                this.setBoolean(25513, true);
                break;
            }
            case 4: {
                this.setInteger(-1113784320, 3);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubPopupBluetoothBondingServiceRequestDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 3: {
                return this.getInteger(-1113784320) == 4;
            }
            case 5: {
                return this.getListItemControl(1141, true).getItemCount() > 0;
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubPopupBluetoothBondingServiceRequestDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 2: {
                this.setInteger(-1113784320, 3);
                break;
            }
            case 3: {
                this.triggerObserver(2080571456);
                break;
            }
            case 4: {
                this.setInteger(-1113784320, 3);
                break;
            }
            case 5: {
                this.setInteger(-1113784320, 4);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIBluetoothBonding(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setBoolean(969801728, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(969801728));
                this.triggerObserver(1476722752, eventGeneric);
                break;
            }
            case 12: {
                this.enterWaitaphoreForProperty(-1122696960, 477, 587, 1349094729, 1332317513);
                break;
            }
            case 13: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.enterPopupView("Bbpsr", 638, 13);
                break;
            }
            case 15: {
                this.enterPopupView("Pabbcid", 638, 15);
                break;
            }
            case 16: {
                this.enterPopupView("Ppbbpr", 638, 16);
                break;
            }
            case 17: {
                this.enterPopupView("Ppbbse", 638, 17);
                break;
            }
            case 21: {
                this.triggerObserver(1845690432);
                this.enterPopupView("Pabbua", 638, 21);
                break;
            }
            case 22: {
                this.enterPopupView("Pcbbs", 638, 22);
                break;
            }
            case 23: {
                this.enterPopupView("Ppbbpv", 638, 23);
                break;
            }
            case 25: {
                this.triggerObserver(1845690432);
                this.enterPopupView("Pabbua", 638, 25);
                break;
            }
            case 26: {
                this.enterPopupView("Ppbeb", 638, 26);
                break;
            }
        }
    }

    private void performStateExitAction_SubIBluetoothBonding(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.triggerObserver(-50069440);
                this.setBoolean(969801728, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(969801728));
                this.triggerObserver(1476722752, eventGeneric);
                break;
            }
            case 12: {
                this.leaveWaitaphore();
                break;
            }
            case 13: {
                this.leavePopupView("Bbpsr");
                this.triggerObserver(-1996292032);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(-877985792, false);
                break;
            }
            case 15: {
                this.leavePopupView("Pabbcid");
                break;
            }
            case 16: {
                this.leavePopupView("Ppbbpr");
                this.triggerObserver(-50069440);
                break;
            }
            case 17: {
                this.leavePopupView("Ppbbse");
                break;
            }
            case 21: {
                this.leavePopupView("Pabbua");
                break;
            }
            case 22: {
                this.leavePopupView("Pcbbs");
                break;
            }
            case 23: {
                this.leavePopupView("Ppbbpv");
                this.triggerObserver(-50069440);
                break;
            }
            case 25: {
                this.leavePopupView("Pabbua");
                break;
            }
            case 26: {
                this.leavePopupView("Ppbeb");
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubIBluetoothBonding(int n) {
        switch (n - this.IT_OFFSET) {
            case 1: {
                return !this.getBoolean(-877985792);
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubIBluetoothBonding(int n) {
        this.performInternalTransitionAction_SubIBluetoothBonding0(n);
    }

    private void performInternalTransitionAction_SubIBluetoothBonding0(int n) {
        switch (n - this.IT_OFFSET) {
            case 1: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 2: {
                this.triggerObserver(-1979514816);
                break;
            }
            case 3: {
                this.setString(-1374945024, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(-1986330624, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(28641, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(1726676992, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(-1374945024));
                eventGeneric.setInt(1, this.getInteger(28641));
                eventGeneric.setInt(2, this.getInteger(1726676992));
                eventGeneric.setInt(3, this.getInteger(-1986330624));
                this.triggerObserver(-799271616, eventGeneric);
                break;
            }
            case 4: {
                this.setInteger(22103, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(22103));
                this.triggerObserver(-1912405952, eventGeneric);
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubIBluetoothBonding(int n) {
        this.performTriggeredTransitionAction_SubIBluetoothBonding0(n);
    }

    private void performTriggeredTransitionAction_SubIBluetoothBonding0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.setInteger(-1113784320, 3);
                break;
            }
            case 1: {
                this.setInteger(-1113784320, 4);
                break;
            }
            case 3: {
                this.triggerObserver(-1962737600);
                break;
            }
            case 4: {
                this.triggerObserver(-1878851520);
                break;
            }
            case 12: {
                this.setInteger(-1113784320, 3);
                break;
            }
            case 13: {
                this.triggerObserver(-2029846464);
                break;
            }
            case 17: {
                this.setInteger(-1113784320, 3);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIBluetoothBonding(int n) {
        switch (n - this.UT_OFFSET) {
            case 7: {
                return this.getInteger(2008678400) == 1;
            }
            case 8: {
                return this.getInteger(-284688128) == 2 && this.getInteger(11479) == 2;
            }
            case 9: {
                return this.getInteger(-284688128) == 1;
            }
            case 13: {
                return this.getInteger(-284688128) == 0;
            }
            case 14: {
                return this.getInteger(-284688128) == 2 && this.getInteger(11479) == 1;
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIBluetoothBonding(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                this.setInteger(-1113784320, 3);
                break;
            }
            case 6: {
                PhoneActivity.lockWaitaphore(-1122696960, 10000);
                this.triggerObserver(-1945960384);
                this.setBoolean(-877985792, true);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupBluetoothConnectAuthDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
        }
    }

    private void performStateEntryAction_SubIBluetoothConnectAuth(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 6: {
                this.enterWaitaphoreForProperty(19324, 477, 587, 1416203593, 1399426377);
                break;
            }
            case 7: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.enterPopupView("Bpsr", 642, 7);
                break;
            }
            case 12: {
                this.enterWaitaphoreForProperty(-1860370176, 477, 587, 1416203593, 1399426377);
                break;
            }
            case 13: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(1292828928, false);
                this.enterPopupView("Busr", 642, 13);
                break;
            }
            case 17: {
                this.triggerObserver(1845690432);
                this.enterPopupView("Pabcua", 642, 17);
                break;
            }
            case 18: {
                this.enterPopupView("Ppw_9F78", 642, 18);
                break;
            }
        }
    }

    private void performStateExitAction_SubIBluetoothConnectAuth(int n) {
        switch (n - this.S_OFFSET) {
            case 6: {
                this.leaveWaitaphore();
                break;
            }
            case 7: {
                this.leavePopupView("Bpsr");
                this.triggerObserver(-1862074304);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(-877985792, false);
                break;
            }
            case 12: {
                this.leaveWaitaphore();
                break;
            }
            case 13: {
                this.leavePopupView("Busr");
                this.triggerObserver(-1744633792);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(1292828928, false);
                this.setBoolean(-877985792, false);
                break;
            }
            case 17: {
                this.leavePopupView("Pabcua");
                break;
            }
            case 18: {
                this.leavePopupView("Ppw_9F78");
                this.triggerObserver(-50069440);
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubIBluetoothConnectAuth(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                return !this.getBoolean(-877985792);
            }
            case 4: {
                return !this.getBoolean(-877985792);
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubIBluetoothConnectAuth(int n) {
        this.performInternalTransitionAction_SubIBluetoothConnectAuth0(n);
    }

    private void performInternalTransitionAction_SubIBluetoothConnectAuth0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 1: {
                this.triggerObserver(-1845297088);
                break;
            }
            case 2: {
                this.setString(518979584, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(93585408, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(26752, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(63504384, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(518979584));
                eventGeneric.setInt(1, this.getInteger(26752));
                eventGeneric.setInt(2, this.getInteger(63504384));
                eventGeneric.setInt(3, this.getInteger(93585408));
                this.triggerObserver(-782494400, eventGeneric);
                break;
            }
            case 3: {
                this.setInteger(14253, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(14253));
                this.triggerObserver(-1778188224, eventGeneric);
                break;
            }
            case 4: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 5: {
                this.triggerObserver(-1727856576);
                break;
            }
            case 6: {
                this.setString(0x100E0100, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(-1026359296, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(531038208, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(17791, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(0x100E0100));
                eventGeneric.setInt(1, this.getInteger(531038208));
                eventGeneric.setInt(2, this.getInteger(17791));
                eventGeneric.setInt(3, this.getInteger(-1026359296));
                this.triggerObserver(-765717184, eventGeneric);
                break;
            }
            case 7: {
                this.setInteger(18408, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(18408));
                this.triggerObserver(-1660747712, eventGeneric);
                break;
            }
            case 8: {
                this.setBoolean(1292828928, true);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1217884855);
                break;
            }
            case 9: {
                this.setBoolean(1292828928, false);
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubIBluetoothConnectAuth(int n) {
        this.performTriggeredTransitionAction_SubIBluetoothConnectAuth0(n);
    }

    private void performTriggeredTransitionAction_SubIBluetoothConnectAuth0(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                this.setInteger(-1113784320, 1);
                break;
            }
            case 2: {
                this.triggerObserver(-1862074304);
                break;
            }
            case 3: {
                this.triggerObserver(-1761411008);
                break;
            }
            case 8: {
                this.triggerObserver(-1643970496);
                break;
            }
            case 9: {
                this.triggerObserver(-1744633792);
                break;
            }
            case 12: {
                this.setInteger(-1113784320, 2);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIBluetoothConnectAuth(int n) {
        switch (n - this.UT_OFFSET) {
            case 6: {
                return this.getBoolean(31387);
            }
            case 8: {
                return this.getBoolean(31387);
            }
            case 9: {
                return this.getBoolean(386531584);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIBluetoothConnectAuth(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                this.setInteger(-1113784320, 2);
                break;
            }
            case 2: {
                PhoneActivity.lockWaitaphore(19324, 10000);
                this.triggerObserver(-1811742656);
                this.setBoolean(-877985792, true);
                break;
            }
            case 4: {
                PhoneActivity.lockWaitaphore(-1860370176, 10000);
                this.triggerObserver(-1694302144);
                this.setBoolean(-877985792, true);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIBluetoothConnectError(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 4: {
                this.enterPopupView("Pabcge", 643, 4);
                break;
            }
            case 5: {
                this.enterPopupView("Pabcpe", 643, 5);
                break;
            }
            case 6: {
                this.enterPopupView("Pabcue", 643, 6);
                break;
            }
        }
    }

    private void performStateExitAction_SubIBluetoothConnectError(int n) {
        switch (n - this.S_OFFSET) {
            case 4: {
                this.leavePopupView("Pabcge");
                break;
            }
            case 5: {
                this.leavePopupView("Pabcpe");
                break;
            }
            case 6: {
                this.leavePopupView("Pabcue");
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIBluetoothConnectError(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                return this.getInteger(0x1A000100) == 1;
            }
            case 2: {
                return this.getInteger(0x1A000100) == 2;
            }
            case 3: {
                return this.getInteger(0x1A000100) == 3;
            }
        }
        return true;
    }

    private void performStateEntryAction_SubPopupBluetoothConnectDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.triggerObserver(-1358495680);
                break;
            }
            case 6: {
                this.triggerObserver(1845690432);
                this.enterPopupView("Pabbua", 86, 6);
                break;
            }
            case 7: {
                this.enterPopupView("Pcbm", 86, 7);
                break;
            }
            case 8: {
                this.setBoolean(26327, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(26327));
                this.triggerObserver(-284557248, eventGeneric);
                this.enterPopupView("Ppbec", 86, 8);
                break;
            }
            case 15: {
                this.enterPopupView("Pcbu", 86, 15);
                break;
            }
            case 16: {
                this.setBoolean(26327, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(26327));
                this.triggerObserver(-284557248, eventGeneric);
                this.enterPopupView("Ppbec", 86, 16);
                break;
            }
            case 28: {
                this.enterPopupView("Pibbs", 86, 28);
                break;
            }
            case 34: {
                this.enterPopupView("Pcbrooa", 86, 34);
                break;
            }
            case 35: {
                this.enterPopupView("Ppwt_787C", 86, 35);
                break;
            }
            case 37: {
                this.enterPopupView("Pcbros", 86, 37);
                break;
            }
            case 38: {
                this.setBoolean(26327, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(26327));
                this.triggerObserver(-284557248, eventGeneric);
                this.enterPopupView("Ppbec", 86, 38);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupBluetoothConnectDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1599769929);
                this.triggerObserver(-50069440);
                this.triggerObserver(-2113732544);
                break;
            }
            case 6: {
                this.leavePopupView("Pabbua");
                break;
            }
            case 7: {
                this.leavePopupView("Pcbm");
                break;
            }
            case 8: {
                this.leavePopupView("Ppbec");
                this.triggerObserver(-50069440);
                this.setBoolean(26327, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(26327));
                this.triggerObserver(-284557248, eventGeneric);
                break;
            }
            case 9: {
                this.triggerObserver(-50069440);
                break;
            }
            case 15: {
                this.leavePopupView("Pcbu");
                break;
            }
            case 16: {
                this.leavePopupView("Ppbec");
                this.triggerObserver(-50069440);
                this.setBoolean(26327, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(26327));
                this.triggerObserver(-284557248, eventGeneric);
                break;
            }
            case 28: {
                this.leavePopupView("Pibbs");
                break;
            }
            case 34: {
                this.leavePopupView("Pcbrooa");
                break;
            }
            case 35: {
                this.leavePopupView("Ppwt_787C");
                break;
            }
            case 37: {
                this.leavePopupView("Pcbros");
                break;
            }
            case 38: {
                this.leavePopupView("Ppbec");
                this.triggerObserver(-50069440);
                this.setBoolean(26327, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(26327));
                this.triggerObserver(-284557248, eventGeneric);
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupBluetoothConnectDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupBluetoothConnectDynState00(n);
    }

    private void performTriggeredTransitionAction_SubPopupBluetoothConnectDynState00(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.setBoolean(25513, true);
                break;
            }
            case 2: {
                this.setInteger(-1113784320, 2);
                this.setBoolean(25513, false);
                break;
            }
            case 3: {
                this.setInteger(-1113784320, 2);
                break;
            }
            case 6: {
                this.setInteger(-1113784320, 1);
                break;
            }
            case 8: {
                this.setInteger(-1113784320, 2);
                break;
            }
            case 9: {
                this.triggerObserver(1996685376);
                this.triggerObserver(1896022080);
                this.triggerObserver(1912799296);
                this.setInteger(-1113784320, 2);
                break;
            }
            case 10: {
                this.setBoolean(25513, true);
                break;
            }
            case 11: {
                this.setBoolean(25513, false);
                this.setString(-557318144, this.getString(-729808896));
                this.setString(-1428750336, this.getI18nString(3454));
                this.setInteger(-1113784320, 2);
                this.triggerObserver(-2013069248);
                break;
            }
            case 14: {
                this.setInteger(763559936, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(763559936));
                this.triggerObserver(319488064, eventGeneric);
                break;
            }
            case 16: {
                this.setInteger(763559936, 1);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(763559936));
                this.triggerObserver(319488064, eventGeneric);
                break;
            }
            case 19: {
                this.setInteger(763559936, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(763559936));
                this.triggerObserver(319488064, eventGeneric);
                break;
            }
            case 20: {
                this.setInteger(763559936, 1);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(763559936));
                this.triggerObserver(319488064, eventGeneric);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubPopupBluetoothConnectDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 6: {
                return this.getInteger(-1113784320) == 3;
            }
            case 7: {
                return this.getBoolean(25513);
            }
            case 9: {
                return this.getBoolean(972947456) && this.getInteger(19495) == 2 && this.getBoolean(-2081357824) && this.getBoolean(30686) && this.getBoolean(20317);
            }
            case 18: {
                return this.getInteger(28224) > 0 || this.getInteger(-1113784320) == 3;
            }
            case 20: {
                return this.getInteger(-1113784320) == 4;
            }
            case 25: {
                return this.getBoolean(25160);
            }
            case 26: {
                return !this.getBoolean(0x9B0000) && this.getBoolean(-2079522560);
            }
            case 27: {
                return this.getBoolean(0x9B0000) && this.getBoolean(25513);
            }
            case 28: {
                return this.getInteger(28224) == 10 && this.getLicValue(1143, 0, 0, false) && this.getBoolean(30686) && this.getBoolean(20317);
            }
            case 29: {
                return !this.getBoolean(0x9B0000) && !this.getBoolean(-2079522560) && (this.getInteger(28224) == 2 || this.getInteger(28224) == 1) && !this.getBoolean(26017) && !this.getBoolean(1927938048);
            }
            case 31: {
                return !this.getBoolean(-1747910656) && this.getBoolean(972947456);
            }
            case 33: {
                return this.getInteger(-458162176) == 1;
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubPopupBluetoothConnectDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                this.setInteger(-1113784320, 2);
                this.setBoolean(25513, false);
                break;
            }
            case 7: {
                this.setInteger(-1113784320, 2);
                this.setString(-557318144, this.getString(15902));
                this.setString(-1428750336, this.getI18nString(3454));
                this.triggerObserver(-2013069248);
                break;
            }
            case 8: {
                this.setInteger(-1113784320, 2);
                this.setString(-557318144, this.getString(15902));
                this.setString(-1428750336, this.getI18nString(3454));
                this.triggerObserver(-2013069248);
                break;
            }
            case 20: {
                this.triggerObserver(2047017024);
                break;
            }
            case 21: {
                this.setInteger(-1113784320, 2);
                break;
            }
            case 24: {
                this.triggerObserver(2013462592);
                break;
            }
            case 30: {
                this.setInteger(763559936, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(763559936));
                this.triggerObserver(319488064, eventGeneric);
                break;
            }
            case 31: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2086702409);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2069925193);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2103479625);
                this.triggerObserver(1879244864);
                break;
            }
            case 32: {
                this.triggerObserver(2047017024);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupBluetoothEnableEngineDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.enterPopupView("Pabse", 87, 5);
                break;
            }
            case 6: {
                this.enterPopupView("Pibseg", 87, 6);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupBluetoothEnableEngineDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1616547145);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1650888009);
                break;
            }
            case 5: {
                this.leavePopupView("Pabse");
                break;
            }
            case 6: {
                this.leavePopupView("Pibseg");
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubPopupBluetoothEnableEngineDynState(int n) {
        this.performInternalTransitionAction_SubPopupBluetoothEnableEngineDynState0(n);
    }

    private void performInternalTransitionAction_SubPopupBluetoothEnableEngineDynState0(int n) {
        switch (n - this.IT_OFFSET) {
            case 1: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2120256841);
                break;
            }
            case 2: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2120256841);
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupBluetoothEnableEngineDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupBluetoothEnableEngineDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupBluetoothEnableEngineDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.setInteger(1088815104, 30);
                this.setInteger(28813, 1);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1499499849);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubPopupBluetoothEnableEngineDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 2: {
                return this.getBoolean(-522977280) && this.getBoolean(25376) && this.getInteger(16685) != 2;
            }
            case 3: {
                return this.getInteger(1023279104) == 2;
            }
            case 4: {
                return !this.getBoolean(-522977280) && this.getBoolean(25376) && this.getInteger(16685) != 2;
            }
            case 5: {
                return !this.getBoolean(25376) && this.getInteger(16685) != 2;
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubPopupBluetoothEnableEngineDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 4: {
                this.setInteger(27116, 0);
                break;
            }
            case 6: {
                this.setInteger(16685, 2);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIBluetoothToggleEngine(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.setInteger(16685, 2);
                this.enterPopupView("Pabend", 648, 5);
                break;
            }
            case 6: {
                this.setInteger(16685, 2);
                this.enterPopupView("Pabene", 648, 6);
                break;
            }
            case 7: {
                this.enterPopupView("Pabse", 648, 7);
                break;
            }
            case 8: {
                this.enterPopupView("Pcbde", 648, 8);
                break;
            }
            case 9: {
                this.enterPopupView("Pcbsip", 648, 9);
                break;
            }
            case 10: {
                this.enterPopupView("Ppbebw", 648, 10);
                break;
            }
            case 11: {
                this.enterPopupView("Ppw_9F78", 648, 11);
                break;
            }
        }
    }

    private void performStateExitAction_SubIBluetoothToggleEngine(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1666878793);
                this.triggerObserver(-50069440);
                if (this.getInteger(27116) == 0) break;
                this.setInteger(27116, 0);
                break;
            }
            case 5: {
                this.leavePopupView("Pabend");
                break;
            }
            case 6: {
                this.leavePopupView("Pabene");
                break;
            }
            case 7: {
                this.leavePopupView("Pabse");
                break;
            }
            case 8: {
                this.leavePopupView("Pcbde");
                break;
            }
            case 9: {
                this.leavePopupView("Pcbsip");
                break;
            }
            case 10: {
                this.leavePopupView("Ppbebw");
                break;
            }
            case 11: {
                this.leavePopupView("Ppw_9F78");
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubIBluetoothToggleEngine(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                return this.getInteger(27116) != 0;
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubIBluetoothToggleEngine(int n) {
        this.performTriggeredTransitionAction_SubIBluetoothToggleEngine0(n);
    }

    private void performTriggeredTransitionAction_SubIBluetoothToggleEngine0(int n) {
        switch (n - this.TT_OFFSET) {
            case 5: {
                this.setInteger(1088815104, 30);
                this.setInteger(28813, 1);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1499499849);
                break;
            }
            case 7: {
                this.setBoolean(27372, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(27372));
                this.triggerObserver(-2096955328, eventGeneric);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIBluetoothToggleEngine(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                return this.getInteger(1023279104) == 1;
            }
            case 2: {
                return this.getInteger(1023279104) == 2;
            }
            case 3: {
                return this.getBoolean(-522977280) && this.getBoolean(17620);
            }
            case 4: {
                return this.getBoolean(-522977280) && !this.getBoolean(17620);
            }
            case 5: {
                return !this.getBoolean(-522977280);
            }
            case 7: {
                return this.getInteger(27116) == 3;
            }
            case 8: {
                return this.getInteger(27116) == 4;
            }
            case 9: {
                return this.getInteger(27116) == 1;
            }
            case 10: {
                return this.getInteger(27116) == 2;
            }
            case 11: {
                return this.getInteger(27116) == 5;
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIBluetoothToggleEngine(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                this.setInteger(16685, 1);
                break;
            }
            case 4: {
                this.setBoolean(27372, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(27372));
                this.triggerObserver(-2096955328, eventGeneric);
                break;
            }
            case 5: {
                this.setBoolean(27372, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(27372));
                this.triggerObserver(-2096955328, eventGeneric);
                break;
            }
            case 6: {
                this.setBoolean(27372, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(27372));
                this.triggerObserver(-2096955328, eventGeneric);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupBluetoothToggleEngineDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1666878793);
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubPopupBluetoothToggleEngineDynState(int n) {
        this.performInternalTransitionAction_SubPopupBluetoothToggleEngineDynState0(n);
    }

    private void performInternalTransitionAction_SubPopupBluetoothToggleEngineDynState0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2137034057);
                break;
            }
            case 1: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2137034057);
                break;
            }
        }
    }

    private void performUntriggeredTransitionAction_SubPopupBluetoothToggleEngineDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                this.setInteger(27116, 0);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPhoneEmergencyDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Papef", 154, 3);
                break;
            }
            case 4: {
                this.enterPopupView("Pcpe", 154, 4);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPhoneEmergencyDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Papef");
                break;
            }
            case 4: {
                this.leavePopupView("Pcpe");
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubPopupPhoneEmergencyDynState(int n) {
        this.performInternalTransitionAction_SubPopupPhoneEmergencyDynState00(n);
    }

    private void performInternalTransitionAction_SubPopupPhoneEmergencyDynState00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 1: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 2: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 3: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 4: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 5: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 6: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 7: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 8: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 9: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 10: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 11: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 12: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 13: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 14: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 15: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 16: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 17: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 18: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 19: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 20: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 29: {
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(22895));
                this.triggerObserver(-1067707072, eventGeneric);
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPhoneEmergencyDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPhoneEmergencyDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPhoneEmergencyDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 3: {
                this.triggerObserver(-1627193280);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPhoneEnableNadDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -664433335);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPhoneSupplServiceDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 7: {
                this.enterPopupView("Paptscf", 156, 7);
                break;
            }
            case 8: {
                this.enterPopupView("Pcptsu", 156, 8);
                break;
            }
            case 10: {
                this.enterPopupView("Ppptssr", 156, 10);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPhoneSupplServiceDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 7: {
                this.leavePopupView("Paptscf");
                break;
            }
            case 8: {
                this.leavePopupView("Pcptsu");
                break;
            }
            case 10: {
                this.leavePopupView("Ppptssr");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPhoneSupplServiceDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPhoneSupplServiceDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPhoneSupplServiceDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                this.triggerObserver(1711472704);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubPopupPhoneSupplServiceDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 3: {
                return this.getInteger(32558) == 1;
            }
            case 4: {
                return this.getInteger(32558) == 2;
            }
            case 5: {
                return this.getInteger(32558) == 3;
            }
            case 7: {
                return this.getInteger(32558) == 0;
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubPopupPhoneSupplServiceDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 3: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -346452663);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertBluetoothA2dpInfoDynstate(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pabai", 160, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertBluetoothA2dpInfoDynstate(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pabai");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertBluetoothDenyRoleChangeDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pabdrc", 161, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertBluetoothDenyRoleChangeDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pabdrc");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertBluetoothPairingDeletingAllFailedDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pabpdaf", 162, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertBluetoothPairingDeletingAllFailedDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pabpdaf");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertBluetoothPairingDeletingFailedDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pabpdf_38F6", 163, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertBluetoothPairingDeletingFailedDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pabpdf_38F6");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertBluetoothProfileDisconnectFailedNoSimDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pabpdfns", 164, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertBluetoothProfileDisconnectFailedNoSimDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -43676343);
                break;
            }
            case 3: {
                this.leavePopupView("Pabpdfns");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertBluetoothProfileDisconnectFailedDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pabpdf_3383", 165, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertBluetoothProfileDisconnectFailedDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pabpdf_3383");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertBluetoothSwdlErrorDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pabse", 166, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertBluetoothSwdlErrorDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pabse");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoAlertBluetoothSwdlErrorDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoAlertBluetoothSwdlErrorDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoAlertBluetoothSwdlErrorDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -26899127);
                break;
            }
            case 1: {
                this.setInteger(1088815104, 30);
                this.setInteger(28813, 1);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1499499849);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertPhoneActiveCallHandoverWarningDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Papachw", 172, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertPhoneActiveCallHandoverWarningDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Papachw");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertPhoneActiveCallTerminationWarningDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Papactw", 173, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertPhoneActiveCallTerminationWarningDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Papactw");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertPhoneAdditionalErrorDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Papae", 174, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertPhoneAdditionalErrorDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Papae");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertPhoneDialingFailedDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Papdf", 175, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertPhoneDialingFailedDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Papdf");
                break;
            }
        }
    }

    private void performUntriggeredTransitionAction_SubPopupPoAlertPhoneDialingFailedDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertPhoneEcallErrorDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Papee", 176, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertPhoneEcallErrorDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Papee");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertPhoneMecAcnLicenseExpiryWarningDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Papmalew", 177, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertPhoneMecAcnLicenseExpiryWarningDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Papmalew");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoAlertPhoneMecAcnLicenseExpiryWarningDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoAlertPhoneMecAcnLicenseExpiryWarningDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoAlertPhoneMecAcnLicenseExpiryWarningDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.triggerObserver(-329509568);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertPhoneNotInstalledDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Papni", 178, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertPhoneNotInstalledDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 23498057);
                break;
            }
            case 3: {
                this.leavePopupView("Papni");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertPhoneNoLineFreeDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Papnlf", 179, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertPhoneNoLineFreeDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Papnlf");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertPhonePinInvalidDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pappi_DEF6", 180, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertPhonePinInvalidDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pappi_DEF6");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertPhonePukInvalidDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pappi_2CC2", 181, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertPhonePukInvalidDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pappi_2CC2");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertPhoneSapDowngradeDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Papsd_088C", 182, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertPhoneSapDowngradeDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Papsd_088C");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertPhoneSimDataonlyDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.setString(-183041792, this.getI18nString(4070));
                if (this.getBoolean(0x1D110100)) {
                    this.setString(-183041792, this.getI18nString(4071));
                }
                this.enterPopupView("Papsd_419A", 183, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertPhoneSimDataonlyDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Papsd_419A");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertPhoneTempServiceCodeFailureDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Paptscf", 184, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertPhoneTempServiceCodeFailureDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Paptscf");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertPhoneTempWlcForeignObjectDetectionDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Paptwfod", 185, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertPhoneTempWlcForeignObjectDetectionDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Paptwfod");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmBluetoothContactsFailureDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcbcf", 201, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmBluetoothContactsFailureDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcbcf");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmBluetoothContactsFailureDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmBluetoothContactsFailureDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmBluetoothContactsFailureDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.triggerObserver(-1023213504);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmBluetoothDisableA2dpDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcbda", 202, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmBluetoothDisableA2dpDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcbda");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmBluetoothDisableA2dpDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmBluetoothDisableA2dpDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmBluetoothDisableA2dpDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                this.setBoolean(-1466236928, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1466236928));
                this.triggerObserver(-503119808, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmBluetoothEnableA2dpDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 4: {
                this.enterPopupView("Pcbea", 203, 4);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmBluetoothEnableA2dpDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 224824649);
                break;
            }
            case 4: {
                this.leavePopupView("Pcbea");
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubPopupPoConfirmBluetoothEnableA2dpDynState(int n) {
        this.performInternalTransitionAction_SubPopupPoConfirmBluetoothEnableA2dpDynState0(n);
    }

    private void performInternalTransitionAction_SubPopupPoConfirmBluetoothEnableA2dpDynState0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setBoolean(28564, true);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1906274999);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmBluetoothHelpDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.setString(801832960, this.getI18nString(4133));
                this.setString(801832960, this.getI18nString(4132));
                if (this.getLicValue(2353, 0, this.getInteger(-846462976), "").equals(DataConstants.LANG_SYSTEM_SETUP_MAIN_LANGUAGE_LIST_ISO[0])) {
                    this.setString(801832960, this.getI18nString(4131));
                }
                this.enterPopupView("Pcbh", 204, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmBluetoothHelpDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcbh");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmBluetoothPairingDeleteAllDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcbpda", 205, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmBluetoothPairingDeleteAllDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcbpda");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmBluetoothPairingDeleteAllDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmBluetoothPairingDeleteAllDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmBluetoothPairingDeleteAllDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                this.triggerObserver(-553451456);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 559582537);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmBluetoothPairingDeleteDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcbpd_F765", 206, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmBluetoothPairingDeleteDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcbpd_F765");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmBluetoothPairingDeleteDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmBluetoothPairingDeleteDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmBluetoothPairingDeleteDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(486014976));
                this.triggerObserver(-536674240, eventGeneric);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 559582537);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmBluetoothProfileDisconnectDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcbpd_766B", 207, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmBluetoothProfileDisconnectDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcbpd_766B");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmBluetoothProfileDisconnectDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmBluetoothProfileDisconnectDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmBluetoothProfileDisconnectDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                this.triggerObserver(1996685376);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 559582537);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmBluetoothSwdlInProgressDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcbsip", 208, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmBluetoothSwdlInProgressDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 241601865);
                break;
            }
            case 3: {
                this.leavePopupView("Pcbsip");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmPhoneCallStackDelDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcpcsd", 265, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmPhoneCallStackDelDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcpcsd");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneCallStackDelDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneCallStackDelDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneCallStackDelDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-652672768));
                this.triggerObserver(-1107099584, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmPhoneCallStackEntryDelDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcpcsed", 266, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmPhoneCallStackEntryDelDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcpcsed");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneCallStackEntryDelDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneCallStackEntryDelDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneCallStackEntryDelDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-521535488));
                this.triggerObserver(-1090322368, eventGeneric);
                break;
            }
        }
    }

    private void performUntriggeredTransitionAction_SubPopupPoConfirmPhoneCallStackEntryDelDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                if (this.getInteger(-388825088) == 1) {
                    this.setString(-1007419392, this.getLicValue(1170, 9, this.getInteger(-1781792768), ""));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setString(-1007419392, this.getLicValue(1171, 9, this.getInteger(385155072), ""));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setString(-1007419392, this.getLicValue(1172, 9, this.getInteger(26851), ""));
                }
                if (this.getInteger(-388825088) == 3) {
                    this.setString(-1007419392, this.getLicValue(1173, 9, this.getInteger(29052), ""));
                }
                if (this.getInteger(-388825088) == 1) {
                    this.setString(1174929664, this.getLicValue(1170, 10, this.getInteger(-1781792768), ""));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setString(1174929664, this.getLicValue(1171, 10, this.getInteger(385155072), ""));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setString(1174929664, this.getLicValue(1172, 10, this.getInteger(26851), ""));
                }
                if (this.getInteger(-388825088) != 3) break;
                this.setString(1174929664, this.getLicValue(1173, 10, this.getInteger(29052), ""));
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmPhoneDeferredPhoneCallDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                if (this.getInteger(-476971008) == 0) {
                    this.setString(22550, this.getString(15902));
                }
                if (this.getInteger(-476971008) == 1) {
                    this.setString(22550, this.getString(378994688));
                }
                this.enterPopupView("Pcpdpc", 267, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmPhoneDeferredPhoneCallDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcpdpc");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneDeferredPhoneCallDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneDeferredPhoneCallDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneDeferredPhoneCallDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.triggerObserver(-1017375424);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmPhoneDisablePmDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 4: {
                this.enterPopupView("Pcpdp", 268, 4);
                break;
            }
            case 5: {
                this.enterPopupView("Ppw_9F78", 268, 5);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmPhoneDisablePmDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 4: {
                this.leavePopupView("Pcpdp");
                break;
            }
            case 5: {
                this.leavePopupView("Ppw_9F78");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneDisablePmDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneDisablePmDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneDisablePmDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 2: {
                this.setBoolean(-638976000, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-638976000));
                this.triggerObserver(621019200, eventGeneric);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubPopupPoConfirmPhoneDisablePmDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                return !this.getBoolean(31551);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubPopupPoConfirmPhoneDisablePmDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                this.setBoolean(-638976000, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-638976000));
                this.triggerObserver(621019200, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmPhoneEnableMpcDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcpem", 269, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmPhoneEnableMpcDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcpem");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneEnableMpcDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneEnableMpcDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneEnableMpcDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                this.setBoolean(-507314176, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-507314176));
                this.triggerObserver(-217907136, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmPhoneExtUsmConfirmationDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcpeuc", 270, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmPhoneExtUsmConfirmationDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcpeuc");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneExtUsmConfirmationDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneExtUsmConfirmationDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneExtUsmConfirmationDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.triggerObserver(-346286784);
                break;
            }
            case 1: {
                this.triggerObserver(-463727296);
                break;
            }
            case 2: {
                this.triggerObserver(-480504512);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmPhoneFavoriteDelallDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcpfd_FD35", 271, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmPhoneFavoriteDelallDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcpfd_FD35");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneFavoriteDelallDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneFavoriteDelallDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneFavoriteDelallDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.triggerObserver(-368508864);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmPhoneFavoriteDelDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcpfd_AD4F", 272, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmPhoneFavoriteDelDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcpfd_AD4F");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneFavoriteDelDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneFavoriteDelDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneFavoriteDelDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1792737280));
                this.triggerObserver(-687669184, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmPhoneNadDataOnlyDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcpndo", 273, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmPhoneNadDataOnlyDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcpndo");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneNadDataOnlyDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneNadDataOnlyDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneNadDataOnlyDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.setInteger(1088815104, 35);
                this.setInteger(29840, 1);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1398836553);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmPhoneNadUsageDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 4: {
                this.enterPopupView("Pcpndo", 274, 4);
                break;
            }
            case 5: {
                this.enterPopupView("Pcpnu", 274, 5);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmPhoneNadUsageDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 4: {
                this.leavePopupView("Pcpndo");
                break;
            }
            case 5: {
                this.leavePopupView("Pcpnu");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneNadUsageDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneNadUsageDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneNadUsageDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 2: {
                this.setInteger(1088815104, 30);
                this.setInteger(29840, 1);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1398836553);
                break;
            }
            case 3: {
                this.setBoolean(584581120, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(584581120));
                this.triggerObserver(822804544, eventGeneric);
                break;
            }
            case 4: {
                this.setBoolean(584581120, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(584581120));
                this.triggerObserver(822804544, eventGeneric);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubPopupPoConfirmPhoneNadUsageDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                return !this.getBoolean(27464) && this.getBoolean(13359) && this.getBoolean(1542979584);
            }
            case 2: {
                return !this.getBoolean(27464) && this.getBoolean(17886);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubPopupPoConfirmPhoneNadUsageDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                this.setBoolean(584581120, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(584581120));
                this.triggerObserver(822804544, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmPhonePinSaveDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcpps", 275, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmPhonePinSaveDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcpps");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhonePinSaveDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmPhonePinSaveDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhonePinSaveDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                this.setBoolean(1557266432, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(1557266432));
                this.triggerObserver(0xB040040, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmPhoneSecurityDelete2ndPinDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcpsd2p", 276, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmPhoneSecurityDelete2ndPinDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcpsd2p");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneSecurityDelete2ndPinDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneSecurityDelete2ndPinDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneSecurityDelete2ndPinDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.triggerObserver(369754176);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmPhoneSetupNetworkSelectionDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcpsns", 277, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmPhoneSetupNetworkSelectionDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1332120905);
                break;
            }
            case 3: {
                this.leavePopupView("Pcpsns");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneSetupNetworkSelectionDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneSetupNetworkSelectionDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneSetupNetworkSelectionDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1348570441);
                break;
            }
            case 1: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1365347657);
                break;
            }
        }
    }

    private void performUntriggeredTransitionAction_SubPopupPoConfirmPhoneSetupNetworkSelectionDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                if (this.getBoolean(11654)) {
                    this.setString(0xD1D0100, this.getI18nString(4355));
                }
                if (this.getBoolean(11654)) break;
                this.setString(0xD1D0100, this.getI18nString(4356));
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmPhoneTempIncomingDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 8: {
                this.enterPopupView("Pcpti", 278, 8);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmPhoneTempIncomingDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 8: {
                this.leavePopupView("Pcpti");
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubPopupPoConfirmPhoneTempIncomingDynState(int n) {
        this.performInternalTransitionAction_SubPopupPoConfirmPhoneTempIncomingDynState00(n);
    }

    private void performInternalTransitionAction_SubPopupPoConfirmPhoneTempIncomingDynState00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 1: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 2: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 3: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 4: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 5: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 6: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 7: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 8: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 9: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(606077184, true);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 10: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 11: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 12: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 13: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 14: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 15: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 16: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
            case 17: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneTempIncomingDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmPhoneTempIncomingDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmPhoneTempIncomingDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.setBoolean(606077184, true);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                break;
            }
            case 1: {
                this.setInteger(-105840640, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-105840640));
                this.triggerObserver(-1475739584, eventGeneric);
                this.setBoolean(-493289472, true);
                break;
            }
            case 2: {
                this.setBoolean(1759903744, false);
                break;
            }
            case 3: {
                this.setBoolean(1759903744, false);
                break;
            }
            case 4: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                break;
            }
            case 5: {
                this.setInteger(15085, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(15085));
                this.triggerObserver(-1509752768, eventGeneric);
                this.setBoolean(-493289472, true);
                break;
            }
            case 7: {
                this.setInteger(-68091904, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-68091904));
                this.triggerObserver(-1560084416, eventGeneric);
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                break;
            }
            case 8: {
                this.setInteger(-1398800384, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1398800384));
                this.triggerObserver(-1610416064, eventGeneric);
                this.setBoolean(-493289472, true);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubPopupPoConfirmPhoneTempIncomingDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 3: {
                return this.getInteger(-308740096) == 9 || this.getInteger(-308740096) == 3 || this.getInteger(-308740096) == 1 || this.getInteger(-308740096) == 2 || this.getBoolean(19935);
            }
            case 5: {
                return !this.getBoolean(-493289472);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubPopupPoConfirmPhoneTempIncomingDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 3: {
                this.setBoolean(1759903744, false);
                break;
            }
            case 4: {
                this.setBoolean(1759903744, true);
                this.setInteger(13743, 1);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                break;
            }
            case 5: {
                this.setBoolean(1759903744, false);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoBluetoothBatteryWarningDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pibbw", 325, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoBluetoothBatteryWarningDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pibbw");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoBluetoothConnectionLostDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pibcl", 326, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoBluetoothConnectionLostDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pibcl");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoBluetoothContactsAvailableDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pibca", 327, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoBluetoothContactsAvailableDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pibca");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoBluetoothContactsIncompleteDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pibci", 328, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoBluetoothContactsIncompleteDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pibci");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoBluetoothOppContactsAvailableDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Piboca", 329, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoBluetoothOppContactsAvailableDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Piboca");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoBluetoothScontactErrorGeneralDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pibseg", 330, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoBluetoothScontactErrorGeneralDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pibseg");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoBluetoothServiceConnectionLostDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pibscl", 331, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoBluetoothServiceConnectionLostDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pibscl");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoPhoneExtMecAcnConfirmationDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.setBoolean(-2102657024, true);
                this.enterPopupView("Pipemac", 421, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoPhoneExtMecAcnConfirmationDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pipemac");
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubPopupPoInfoPhoneExtMecAcnConfirmationDynState(int n) {
        this.performInternalTransitionAction_SubPopupPoInfoPhoneExtMecAcnConfirmationDynState00(n);
    }

    private void performInternalTransitionAction_SubPopupPoInfoPhoneExtMecAcnConfirmationDynState00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 1: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 2: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 3: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 4: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 5: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 6: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 7: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 8: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 9: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 10: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 11: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 12: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 13: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 14: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 15: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 16: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 17: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 18: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 19: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 20: {
                this.triggerObserver(-1627193280);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                break;
            }
            case 29: {
                this.setBoolean(-2102657024, false);
                this.triggerObserver(-262400704);
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoInfoPhoneExtMecAcnConfirmationDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoInfoPhoneExtMecAcnConfirmationDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoInfoPhoneExtMecAcnConfirmationDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.triggerObserver(-295955136);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoPhoneExtNotLicensedDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.setString(749469696, this.getI18nString(4622));
                if (this.getInteger(-1761541888) == 3) {
                    this.setString(749469696, this.getI18nString(4623));
                }
                if (this.getInteger(-1761541888) == 4) {
                    this.setString(749469696, this.getI18nString(4624));
                }
                this.enterPopupView("Pipenl", 422, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoPhoneExtNotLicensedDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pipenl");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoPhoneExtTerminatedByErrorDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pipetbe", 423, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoPhoneExtTerminatedByErrorDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pipetbe");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoPhoneNadBlockedAppconnDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                if (this.getBoolean(11585)) {
                    this.setString(32482, this.getI18nString(4628));
                }
                if (this.getBoolean(0x1D110100)) {
                    this.setString(32482, this.getI18nString(4629));
                }
                this.enterPopupView("Pipnba", 424, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoPhoneNadBlockedAppconnDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pipnba");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoPhoneNetworkNotReachableDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pipnnr", 425, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoPhoneNetworkNotReachableDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pipnnr");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoPhoneNetworkRegistrationNotAllowedDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pipnrna", 426, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoPhoneNetworkRegistrationNotAllowedDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pipnrna");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoPhoneNosupNetworkDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pipnn", 427, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoPhoneNosupNetworkDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pipnn");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoPhonePinChangedFailureDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pippcf", 428, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoPhonePinChangedFailureDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pippcf");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoPhonePinChangedSuccessDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pippcs", 429, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoPhonePinChangedSuccessDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pippcs");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoPhoneTempServiceCodeSuccessDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Piptscs", 430, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoPhoneTempServiceCodeSuccessDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Piptscs");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoPhoneTempWlcObjectChargeDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Piptwoc", 431, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoPhoneTempWlcObjectChargeDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Piptwoc");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoPhoneWaitstateTransparentDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Ppwt_787C", 560, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoPhoneWaitstateTransparentDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Ppwt_787C");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoProgressPhonePinVerificationDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Ppppv_9402", 565, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoProgressPhonePinVerificationDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Ppppv_9402");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoProgressPhonePukVerificationDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Ppppv_9C15", 566, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoProgressPhonePukVerificationDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Ppppv_9C15");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoProgressWaitingDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Ppw_9F78", 568, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoProgressWaitingDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Ppw_9F78");
                break;
            }
        }
    }

    private void performStateEntryAction_SubHapticPhoneDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(-420282368, 2);
                this.setInteger(-455409664, 0);
                break;
            }
            case 3: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1973383863);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1956606647);
                this.setInteger(19164, -1);
                if (!this.getBoolean(-1312686080) || !(this.getBoolean(30686) || this.getBoolean(20317)) || !this.getBoolean(1527709952)) break;
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -480670391);
                break;
            }
            case 7: {
                this.setInteger(336199936, 8);
                this.setInteger(18457, SkinDataPool.getInteger(190));
                this.setInteger(25296896, 5);
                this.setInteger(-420282368, 3);
                break;
            }
            case 15: {
                this.setInteger(336199936, 8);
                this.setInteger(1167196160, 3);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1167196160));
                this.triggerObserver(0x50050040, eventGeneric);
                break;
            }
            case 18: {
                if (!this.getBoolean(606077184)) break;
                this.setBoolean(24913, true);
                this.setBoolean(632356864, true);
                this.setBoolean(30202, true);
                this.setBoolean(78708736, true);
                this.setBoolean(118751488, true);
                this.setBoolean(11972, true);
                this.setBoolean(31574, true);
                this.setBoolean(1725235200, true);
                this.setBoolean(-1230569472, true);
                break;
            }
            case 22: {
                this.setInteger(14307, this.getInteger(-308740096));
                this.setString(-290062336, this.getI18nString(3610));
                this.setString(-2018050048, this.getI18nString(3605));
                this.setString(-793444352, this.getI18nString(3607));
                this.setString(1351221248, this.getI18nString(3609));
                this.setString(673644800, this.getI18nString(3606));
                this.setString(27923, this.getI18nString(3604));
                this.setString(1041367296, this.getI18nString(3608));
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(-290062336));
                eventGeneric.setString(1, this.getString(-2018050048));
                eventGeneric.setString(2, this.getString(-793444352));
                eventGeneric.setString(3, this.getString(1351221248));
                eventGeneric.setString(4, this.getString(673644800));
                eventGeneric.setString(5, this.getString(27923));
                eventGeneric.setString(6, this.getString(1041367296));
                this.triggerObserver(-1056767936, eventGeneric);
                this.setBoolean(-908001280, false);
                this.setBoolean(10159, false);
                if (this.getInteger(14021) == 0) {
                    PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1973383863);
                }
                if (this.getInteger(14021) != 0) break;
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1956606647);
                break;
            }
            case 37: {
                this.enterWaitaphoreForProperty(-388825088, 477, 587, 1114213705, 1097436489);
                break;
            }
            case 38: {
                this.setBoolean(10159, false);
                break;
            }
            case 48: {
                this.setInteger(513081344, 0);
                this.showView("Pc_CB02", bl, 42);
                break;
            }
            case 52: {
                this.enterWaitaphoreForProperty(-1647837184, 477, 587, 1114213705, 1097436489);
                break;
            }
            case 56: {
                this.enterIncludeDdpGroup(41);
                break;
            }
            case 60: {
                this.enterIncludeDdpGroup(41);
                break;
            }
            case 61: {
                this.enterIncludeDdpGroup(41);
                break;
            }
            case 62: {
                this.enterIncludeDdpGroup(41);
                break;
            }
            case 68: {
                this.showView("Pc_0D31", bl, 41);
                break;
            }
            case 72: {
                this.enterWaitaphoreForProperty(-1647837184, 477, 587, 1114213705, 1097436489);
                break;
            }
            case 76: {
                this.enterWaitaphoreForProperty(-1647837184, 477, 587, 1114213705, 1097436489);
                break;
            }
            case 83: {
                this.enterWaitaphoreForProperty(833093632, 477, 587, 1114213705, 1097436489);
                break;
            }
            case 92: {
                if (this.getInteger(13743) != 1 && this.getInteger(13743) != 12 && this.getInteger(14021) == 0) {
                    this.setInteger(-452263680, 5);
                }
                if (this.getInteger(13743) != 1 && this.getInteger(13743) != 12 && this.getInteger(14021) == 0) {
                    EventGeneric eventGeneric = PhoneActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(-452263680));
                    this.triggerObserver(1191510080, eventGeneric);
                }
                PhoneActivity.changeContext("Phone");
                break;
            }
            case 106: {
                this.triggerObserver(-547613376);
                break;
            }
            case 113: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 115: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2120256841);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2137034057);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2090824375);
                break;
            }
            case 120: {
                this.setInteger(-1373110016, 1449168201);
                this.showView("Pianf", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 124: {
                this.setInteger(-1373110016, 1449168201);
                this.showView("Pibso", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 125: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2120256841);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2137034057);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2090824375);
                break;
            }
            case 128: {
                if (this.getBoolean(-522977280)) {
                    this.setInteger(-34603008, this.getInteger(529399808));
                }
                if (this.getBoolean(-522977280)) {
                    this.setInteger(-1600978944, 1);
                }
                if (this.getBoolean(-522977280)) {
                    EventGeneric eventGeneric = PhoneActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(-1600978944));
                    this.triggerObserver(-967043776, eventGeneric);
                }
                this.setInteger(-1373110016, 1449168201);
                this.showView("Pnc", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 129: {
                this.setInteger(-1373110016, 1449168201);
                this.showView("Pr", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 130: {
                if (this.getBoolean(-522977280)) {
                    this.setInteger(-34603008, this.getInteger(529399808));
                }
                if (this.getBoolean(-522977280)) {
                    this.setInteger(-1600978944, 1);
                }
                if (this.getBoolean(-522977280)) {
                    EventGeneric eventGeneric = PhoneActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(-1600978944));
                    this.triggerObserver(-967043776, eventGeneric);
                }
                this.setInteger(-1373110016, 1449168201);
                this.showView("Psni", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 133: {
                this.setInteger(-1373110016, 1449168201);
                this.showView("Pinht", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 136: {
                this.setInteger(-1373110016, 1449168201);
                this.showView("Pini", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 139: {
                this.setInteger(-1373110016, 1449168201);
                this.showView("Pinnf", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 142: {
                this.setInteger(-1373110016, 1449168201);
                this.showView("Pinso", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 145: {
                this.setInteger(-1373110016, 1449168201);
                this.showView("Piso", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 146: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2120256841);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2137034057);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2090824375);
                break;
            }
            case 154: {
                this.enterWaitaphoreForProperty(16263, 477, 587, 1114213705, 1097436489);
                break;
            }
            case 155: {
                this.setBoolean(-1717567488, true);
                this.setString(-657063936, FormatterService.format(this.getI18nString(3578), Integer.toString(this.getInteger(534118400))));
                this.setInteger(29235, 4);
                this.setInteger(29379, 8);
                this.triggerObserver(-754778048);
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Plch", bl, 44);
                break;
            }
            case 158: {
                this.enterWaitaphoreForProperty(16263, 477, 587, 1114213705, 1097436489);
                break;
            }
            case 159: {
                this.setBoolean(-1717567488, false);
                this.setString(-657063936, FormatterService.format(this.getI18nString(3579), Integer.toString(this.getInteger(17375))));
                this.setInteger(29235, 8);
                this.setInteger(29379, 8);
                this.triggerObserver(-754778048);
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Plch", bl, 44);
                break;
            }
            case 163: {
                this.setString(1394278656, this.getI18nString(3865));
                break;
            }
            case 165: {
                this.enterWaitaphoreForProperty(986382336, 477, 587, 1114213705, 1097436489);
                break;
            }
            case 166: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Psscpn", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 169: {
                this.enterWaitaphoreForProperty(986382336, 477, 587, 1114213705, 1097436489);
                break;
            }
            case 170: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Psscpn", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 172: {
                this.setInteger(-1373110016, 1449168201);
                this.showView("Pnr", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 173: {
                this.setInteger(-1373110016, 1449168201);
                this.showView("Ppr_C80D", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 174: {
                this.setInteger(-1373110016, 1449168201);
                this.showView("Ppr_4B1E", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 175: {
                this.setInteger(-1373110016, 1449168201);
                this.showView("Psb", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 176: {
                this.setInteger(-1373110016, 1449168201);
                this.showView("Psi", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 177: {
                this.setInteger(-1373110016, 1449168201);
                this.showView("Psnf", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 178: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1621062327);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1604285111);
                break;
            }
            case 180: {
                this.setBoolean(606077184, false);
                break;
            }
            case 184: {
                if (this.getInteger(11738) == 1) {
                    PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1973842615);
                }
                if (this.getInteger(11738) != 1) break;
                this.setInteger(11738, 0);
                break;
            }
            case 190: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805611703);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1939829431);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1889497783);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1872720567);
                if (this.getBoolean(-219152384)) {
                    this.setBoolean(632356864, true);
                }
                if (!this.getBoolean(-219152384)) break;
                this.triggerObserver(-956104640);
                break;
            }
            case 200: {
                this.enterWaitaphoreForProperty(-1647837184, 477, 587, 1114213705, 1097436489);
                break;
            }
            case 201: {
                if (this.getInteger(14021) == 0) {
                    this.setInteger(13743, 0);
                }
                if (this.getInteger(14021) == 0) {
                    PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1465945417);
                }
                this.showView("Pci", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 205: {
                this.enterWaitaphoreForProperty(-1647837184, 477, 587, 1114213705, 1097436489);
                break;
            }
            case 207: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                if (this.getInteger(14021) == 0) {
                    this.setInteger(13743, 0);
                }
                if (this.getInteger(14021) == 0) {
                    PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1465945417);
                }
                if (this.getBoolean(1106116608)) {
                    PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1185313463);
                }
                this.setInteger(-1373110016, 1449168201);
                this.showView("Pmc", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 211: {
                this.setInteger(30528, SkinDataPool.getInteger(173));
                if (this.getBoolean(2006319104)) {
                    this.setInteger(30528, SkinDataPool.getInteger(173));
                }
                if (this.getBoolean(32206)) {
                    this.setInteger(30528, SkinDataPool.getInteger(171));
                }
                if (this.getBoolean(774308096)) {
                    this.setInteger(30528, SkinDataPool.getInteger(172));
                }
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(30528));
                this.triggerObserver(-654114752, eventGeneric);
                if (this.getBoolean(22801)) {
                    this.setInteger(754515968, SkinDataPool.getInteger(174));
                }
                if (this.getBoolean(22801)) {
                    eventGeneric = PhoneActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(754515968));
                    this.triggerObserver(-446950080, eventGeneric);
                }
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                this.setInteger(-1373110016, 1449168201);
                this.showView("Pmn", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 223: {
                this.setBoolean(606077184, true);
                break;
            }
            case 225: {
                this.setString(-237699072, this.getI18nString(3677));
                if (this.getInteger(22132) == 3) {
                    this.setString(-237699072, this.getI18nString(3678));
                }
                this.showView("Pmca_428D", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 226: {
                this.setInteger(13743, 0);
                this.setBoolean(606077184, true);
                this.setBoolean(1759903744, false);
                break;
            }
            case 229: {
                this.showView("Pmceo_52B0", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 230: {
                this.showView("Pmceo_49FC", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 236: {
                this.setBoolean(606077184, true);
                break;
            }
            case 238: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1755738807);
                break;
            }
            case 239: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1604743863);
                break;
            }
            case 246: {
                this.showView("Puip", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 248: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1264618825);
                break;
            }
            case 249: {
                this.setInteger(-420282368, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubHapticPhoneDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(-420282368, 0);
                break;
            }
            case 7: {
                this.setInteger(18457, SkinDataPool.getInteger(180));
                this.setBoolean(1759903744, false);
                this.setInteger(25296896, 0);
                break;
            }
            case 22: {
                this.setInteger(-455409664, 0);
                if (this.getInteger(-2082799616) <= 0 && this.getInteger(-2082799616) != 0) break;
                this.setInteger(-2082799616, -1);
                break;
            }
            case 37: {
                this.leaveWaitaphore();
                break;
            }
            case 44: {
                this.setBoolean(10159, false);
                break;
            }
            case 48: {
                this.hideView("Pc_CB02");
                break;
            }
            case 52: {
                this.leaveWaitaphore();
                break;
            }
            case 56: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 60: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 61: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 62: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 68: {
                this.hideView("Pc_0D31");
                break;
            }
            case 72: {
                this.leaveWaitaphore();
                break;
            }
            case 76: {
                this.leaveWaitaphore();
                break;
            }
            case 83: {
                this.leaveWaitaphore();
                break;
            }
            case 97: {
                this.setInteger(-455409664, 0);
                break;
            }
            case 106: {
                this.triggerObserver(-530836160);
                break;
            }
            case 113: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 120: {
                this.hideView("Pianf");
                this.triggerObserver(0x55050040);
                break;
            }
            case 124: {
                this.hideView("Pibso");
                this.triggerObserver(0x55050040);
                break;
            }
            case 128: {
                this.hideView("Pnc");
                this.triggerObserver(0x55050040);
                if (this.getBoolean(-522977280)) {
                    this.setInteger(-1600978944, this.getInteger(-34603008));
                }
                if (!this.getBoolean(-522977280)) break;
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1600978944));
                this.triggerObserver(-967043776, eventGeneric);
                break;
            }
            case 129: {
                this.hideView("Pr");
                this.triggerObserver(0x55050040);
                break;
            }
            case 130: {
                this.hideView("Psni");
                this.triggerObserver(0x55050040);
                if (this.getBoolean(-522977280)) {
                    this.setInteger(-1600978944, this.getInteger(-34603008));
                }
                if (!this.getBoolean(-522977280)) break;
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1600978944));
                this.triggerObserver(-967043776, eventGeneric);
                break;
            }
            case 133: {
                this.hideView("Pinht");
                this.triggerObserver(0x55050040);
                break;
            }
            case 136: {
                this.hideView("Pini");
                this.triggerObserver(0x55050040);
                break;
            }
            case 139: {
                this.hideView("Pinnf");
                this.triggerObserver(0x55050040);
                break;
            }
            case 142: {
                this.hideView("Pinso");
                this.triggerObserver(0x55050040);
                break;
            }
            case 145: {
                this.hideView("Piso");
                this.triggerObserver(0x55050040);
                break;
            }
            case 154: {
                this.leaveWaitaphore();
                break;
            }
            case 155: {
                this.hideView("Plch");
                this.triggerObserver(-754778048);
                this.triggerObserver(-788332480);
                this.triggerObserver(0x55050040);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(-877985792, false);
                break;
            }
            case 158: {
                this.leaveWaitaphore();
                break;
            }
            case 159: {
                this.hideView("Plch");
                this.triggerObserver(-754778048);
                this.triggerObserver(-788332480);
                this.triggerObserver(0x55050040);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(-877985792, false);
                break;
            }
            case 165: {
                this.leaveWaitaphore();
                break;
            }
            case 166: {
                this.hideView("Psscpn");
                this.triggerObserver(369360960);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(-877985792, false);
                break;
            }
            case 169: {
                this.leaveWaitaphore();
                break;
            }
            case 170: {
                this.hideView("Psscpn");
                this.triggerObserver(369360960);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(-877985792, false);
                break;
            }
            case 172: {
                this.hideView("Pnr");
                this.triggerObserver(0x55050040);
                break;
            }
            case 173: {
                this.hideView("Ppr_C80D");
                break;
            }
            case 174: {
                this.hideView("Ppr_4B1E");
                break;
            }
            case 175: {
                this.hideView("Psb");
                this.triggerObserver(0x55050040);
                break;
            }
            case 176: {
                this.hideView("Psi");
                this.triggerObserver(0x55050040);
                break;
            }
            case 177: {
                this.hideView("Psnf");
                this.triggerObserver(0x55050040);
                break;
            }
            case 200: {
                this.leaveWaitaphore();
                break;
            }
            case 201: {
                this.hideView("Pci");
                break;
            }
            case 205: {
                this.leaveWaitaphore();
                break;
            }
            case 207: {
                this.hideView("Pmc");
                this.triggerObserver(0x55050040);
                if (!this.getBoolean(1759903744)) break;
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 211: {
                this.hideView("Pmn");
                this.triggerObserver(0x55050040);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 225: {
                this.hideView("Pmca_428D");
                break;
            }
            case 229: {
                this.hideView("Pmceo_52B0");
                break;
            }
            case 230: {
                this.hideView("Pmceo_49FC");
                break;
            }
            case 246: {
                this.hideView("Puip");
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubHapticPhoneDynState(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                return this.getInteger(14021) == 1 && this.getInteger(14570) == 1 && (this.getBoolean(30686) || this.getBoolean(20317));
            }
            case 1: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 2: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 3: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 4: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 5: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 6: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 7: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 8: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 9: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 10: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 11: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 12: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 13: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 14: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 15: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 16: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 17: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 18: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 19: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 20: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 21: {
                return (this.getBoolean(30686) || this.getBoolean(20317)) && this.getInteger(20623) != 5;
            }
            case 22: {
                return (this.getBoolean(30686) || this.getBoolean(20317)) && this.getInteger(20623) != 5;
            }
            case 23: {
                return (this.getBoolean(30686) || this.getBoolean(20317)) && this.getInteger(20623) != 5;
            }
            case 24: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 25: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 26: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 27: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 28: {
                return (this.getBoolean(30686) || this.getBoolean(20317)) && this.getBoolean(82313216);
            }
            case 29: {
                return (this.getBoolean(30686) || this.getBoolean(20317)) && this.getBoolean(30686);
            }
            case 30: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 31: {
                return this.getInteger(14021) == 1 && this.getInteger(14570) == 1 && (this.getBoolean(30686) || this.getBoolean(20317));
            }
            case 32: {
                return this.getInteger(14021) > 1 && this.getInteger(14570) == 1 && (this.getBoolean(30686) || this.getBoolean(20317));
            }
            case 33: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 34: {
                return this.getBoolean(1106116608) && this.getInteger(14570) == 1 && (this.getBoolean(30686) || this.getBoolean(20317));
            }
            case 35: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 36: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 37: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 38: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 39: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 40: {
                return (this.getBoolean(30686) || this.getBoolean(20317)) && this.getBoolean(30686);
            }
            case 41: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 42: {
                return (this.getBoolean(30686) || this.getBoolean(20317)) && this.getBoolean(30686);
            }
            case 43: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 44: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 45: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 46: {
                return this.getBoolean(-1312686080) && (this.getBoolean(30686) || this.getBoolean(20317));
            }
            case 47: {
                return this.getBoolean(-1312686080) && (this.getBoolean(30686) || this.getBoolean(20317));
            }
            case 48: {
                return this.getBoolean(-1312686080) && (this.getBoolean(30686) || this.getBoolean(20317));
            }
            case 49: {
                return this.getBoolean(-1312686080) && (this.getBoolean(30686) || this.getBoolean(20317));
            }
            case 50: {
                return this.getBoolean(-1312686080) && (this.getBoolean(30686) || this.getBoolean(20317));
            }
            case 51: {
                return this.getBoolean(-1312686080) && (this.getBoolean(30686) || this.getBoolean(20317));
            }
            case 52: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 53: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 54: {
                return this.getBoolean(-1175977984);
            }
            case 55: {
                return (this.getBoolean(30686) || this.getBoolean(20317)) && this.getBoolean(94240768);
            }
            case 56: {
                return (this.getBoolean(30686) || this.getBoolean(20317)) && this.getBoolean(94240768) && this.getBoolean(-89391104) && this.getBoolean(220659968);
            }
            case 57: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 58: {
                return (this.getBoolean(30686) || this.getBoolean(20317)) && this.getBoolean(-1776418560);
            }
            case 59: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 60: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 61: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 63: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 64: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 65: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 66: {
                return this.getBoolean(30686) || this.getBoolean(20317);
            }
            case 67: {
                return (this.getBoolean(30686) || this.getBoolean(20317)) && !this.getBoolean(-1776418560);
            }
            case 74: {
                return this.getBoolean(82313216);
            }
            case 75: {
                return this.getBoolean(22883) && this.getBoolean(-1312686080);
            }
            case 76: {
                return this.getInteger(27122) == 1 && this.getBoolean(1646592256);
            }
            case 82: {
                return PhoneActivity.evListItemEventSender().equals("Button_Mixed");
            }
            case 83: {
                return PhoneActivity.evListItemEventSender().equals("Button_Missed");
            }
            case 84: {
                return PhoneActivity.evListItemEventSender().equals("Button_Accepted");
            }
            case 85: {
                return PhoneActivity.evListItemEventSender().equals("Button_Dialed");
            }
            case 88: {
                return this.getBoolean(10159);
            }
            case 90: {
                return this.getBoolean(-219152384);
            }
            case 92: {
                return this.getInteger(-2082799616) == -1 && PhoneActivity.evListItemEventSender().equals("Button_Contact");
            }
            case 93: {
                return (this.getInteger(-2082799616) > 0 || this.getInteger(-2082799616) == 0) && this.getInteger(-2082799616) == PhoneActivity.evListItemActionIndex() && PhoneActivity.evListItemEventSender().equals("Button_Details");
            }
            case 94: {
                return (this.getInteger(-2082799616) > 0 || this.getInteger(-2082799616) == 0) && this.getInteger(-2082799616) != PhoneActivity.evListItemActionIndex() && PhoneActivity.evListItemEventSender().equals("Button_Details");
            }
            case 95: {
                return this.getInteger(-2082799616) == -1 && PhoneActivity.evListItemEventSender().equals("Button_Details");
            }
            case 96: {
                return (this.getInteger(-2082799616) > 0 || this.getInteger(-2082799616) == 0) && this.getInteger(-2082799616) != PhoneActivity.evListItemActionIndex();
            }
            case 97: {
                return (this.getInteger(-2082799616) > 0 || this.getInteger(-2082799616) == 0) && this.getInteger(-2082799616) == PhoneActivity.evListItemActionIndex();
            }
            case 98: {
                return this.getInteger(-355139584) == 8 || this.getInteger(-355139584) == 9;
            }
            case 99: {
                return !(this.getInteger(-355139584) != 2 && this.getInteger(-355139584) != 3 && this.getInteger(-355139584) != 7 || this.getInteger(16413) != 0 && this.getInteger(16413) <= 0);
            }
            case 100: {
                return !(this.getInteger(-355139584) != 2 && this.getInteger(-355139584) != 3 && this.getInteger(-355139584) != 7 || this.getInteger(16413) != 0 && this.getInteger(16413) <= 0);
            }
            case 101: {
                return this.getLicValue(1190, 8, this.getInteger(-1717633024), false) && this.getInteger(-355139584) == 2 && (this.getInteger(-2082799616) > this.getInteger(-1717633024) || this.getInteger(-2082799616) < this.getInteger(-1717633024));
            }
            case 102: {
                return this.getLicValue(1190, 8, this.getInteger(-1717633024), false) && this.getInteger(-355139584) == 2 && this.getInteger(-2082799616) == this.getInteger(-1717633024);
            }
            case 110: {
                return !this.getBoolean(-522977280) || !this.getBoolean(25376);
            }
            case 116: {
                return !this.getBoolean(-522977280) || !this.getBoolean(25376);
            }
            case 120: {
                return !this.getBoolean(-522977280) || !this.getBoolean(25376);
            }
            case 127: {
                return !this.getBoolean(-522977280) || !this.getBoolean(25376);
            }
            case 134: {
                return !this.getBoolean(-877985792);
            }
            case 135: {
                return !this.getBoolean(-877985792);
            }
            case 143: {
                return !this.getBoolean(-877985792);
            }
            case 144: {
                return !this.getBoolean(-877985792);
            }
            case 150: {
                return !this.getBoolean(-877985792);
            }
            case 154: {
                return !this.getBoolean(-877985792);
            }
            case 158: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 159: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 160: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 161: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 162: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 163: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 164: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 165: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 166: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 167: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 168: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 169: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 170: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 171: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 172: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 173: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 174: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 175: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 176: {
                return this.getInteger(14021) == 1 && this.getLicValue(1158, 11, 0, 4) == 3;
            }
            case 180: {
                return PhoneActivity.evListItemEventSender().equals("Button_Split");
            }
            case 181: {
                return PhoneActivity.evListItemEventSender().equals("Button_Remove");
            }
            case 185: {
                return PhoneActivity.evListItemEventSender().equals("Button_AcceptCall");
            }
            case 186: {
                return PhoneActivity.evListItemEventSender().equals("Button_ResumeCall");
            }
            case 187: {
                return PhoneActivity.evListItemEventSender().equals("Button_ReplaceCall");
            }
            case 188: {
                return PhoneActivity.evListItemEventSender().equals("Button_AcceptResponseHoldCall");
            }
            case 189: {
                return PhoneActivity.evListItemEventSender().equals("Button_Join");
            }
            case 190: {
                return PhoneActivity.evListItemEventSender().equals("Button_HoldCall");
            }
            case 191: {
                return PhoneActivity.evListItemEventSender().equals("Button_RingtoneMuted") && !this.getBoolean(-1577779200);
            }
            case 192: {
                return PhoneActivity.evListItemEventSender().equals("Button_RingtoneMuted") && this.getBoolean(-1577779200);
            }
            case 193: {
                return PhoneActivity.evListItemEventSender().equals("Button_MicrophoneMuted") && !this.getBoolean(-1717043200);
            }
            case 194: {
                return PhoneActivity.evListItemEventSender().equals("Button_MicrophoneMuted") && this.getBoolean(-1717043200);
            }
            case 195: {
                return PhoneActivity.evListItemEventSender().equals("Button_HandsfreeAudio");
            }
            case 196: {
                return PhoneActivity.evListItemEventSender().equals("Button_HangUpCall");
            }
            case 197: {
                return PhoneActivity.evListItemEventSender().equals("Button_ResponseHold");
            }
            case 200: {
                return this.getInteger(14021) == 1 && (this.getBoolean(30686) || this.getBoolean(20317));
            }
            case 201: {
                return this.getInteger(14021) == 1 && (this.getBoolean(30686) || this.getBoolean(20317));
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubHapticPhoneDynState(int n) {
        this.performInternalTransitionAction_SubHapticPhoneDynState000(n);
    }

    private void performInternalTransitionAction_SubHapticPhoneDynState000(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -530215607);
                this.setBoolean(606077184, true);
                this.setInteger(13743, 1);
                this.setBoolean(1759903744, true);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1000764087);
                break;
            }
            case 1: {
                if (this.getInteger(31624) == 0 && this.getInteger(14021) == 1) {
                    this.setBoolean(25540, !this.getBoolean(25540));
                }
                if (this.getInteger(31624) == 1 && this.getInteger(14021) == 2) {
                    this.setBoolean(21684, !this.getBoolean(21684));
                }
                if (this.getInteger(31624) == 2 && this.getInteger(14021) == 3) {
                    this.setBoolean(819331072, !this.getBoolean(819331072));
                }
                if (this.getInteger(31624) == 3 && this.getInteger(14021) == 2 && this.getBoolean(2111963136)) {
                    this.setBoolean(1706033152, !this.getBoolean(1706033152));
                }
                if (this.getInteger(31624) == 2 && this.getInteger(14021) == 1 && this.getBoolean(12714)) {
                    this.setBoolean(-434831104, !this.getBoolean(-434831104));
                }
                if (this.getInteger(31624) == 1 && this.getInteger(14021) == 0 && !this.getBoolean(840106240)) {
                    this.setBoolean(31711, !this.getBoolean(31711));
                }
                if (this.getInteger(31624) == 3 && this.getInteger(14021) == 2 && this.getBoolean(12714)) {
                    this.setBoolean(24673, !this.getBoolean(24673));
                }
                if (this.getInteger(31624) == 3 && this.getInteger(14021) == 2 && this.getBoolean(840106240)) {
                    this.setBoolean(-1382088704, !this.getBoolean(-1382088704));
                }
                if (this.getInteger(31624) == 2 && this.getInteger(14021) == 1 && this.getBoolean(840106240)) {
                    this.setBoolean(986120192, !this.getBoolean(986120192));
                }
                this.setInteger(31624, this.getInteger(14021));
                this.setBoolean(840106240, false);
                this.setBoolean(12714, false);
                this.setBoolean(2111963136, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -781873847);
                break;
            }
            case 2: {
                if (this.getLicValue(1158, 11, 0, 4) == 6) {
                    this.setBoolean(840106240, true);
                }
                if (this.getLicValue(1158, 11, 1, 4) == 6) {
                    this.setBoolean(12714, true);
                }
                if (this.getLicValue(1158, 11, 2, 4) != 6) break;
                this.setBoolean(2111963136, true);
                break;
            }
            case 3: {
                this.setInteger(31624, this.getInteger(14021));
                this.setBoolean(840106240, false);
                this.setBoolean(12714, false);
                this.setBoolean(2111963136, false);
                if (this.getInteger(14021) == 0 && this.getInteger(-420282368) != 3) {
                    this.setBoolean(606077184, true);
                }
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -848982711);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -865759927);
                break;
            }
            case 4: {
                this.setInteger(27116, 1);
                break;
            }
            case 5: {
                this.setInteger(27116, 3);
                break;
            }
            case 6: {
                this.setInteger(27116, 2);
                break;
            }
            case 7: {
                this.setInteger(27116, 4);
                break;
            }
            case 8: {
                this.setInteger(27116, 5);
                break;
            }
            case 9: {
                this.setInteger(-1113784320, 2);
                this.setBoolean(972947456, true);
                this.setBoolean(-1747910656, this.getBoolean(-1508245248));
                if (this.getInteger(-116195072) == 0 && this.getInteger(19495) == 0 && this.getInteger(-804781824) == 0) {
                    this.setString(-407306240, "");
                }
                if (!(this.getInteger(-1458241280) != 1 && this.getInteger(-1458241280) != 2 && this.getInteger(-1458241280) != 3 && this.getInteger(-1458241280) != 4 || this.getInteger(19495) != 1 && this.getInteger(19495) != 2 && this.getInteger(19495) != 3 && this.getInteger(19495) != 4 || this.getBoolean(26017) && !this.getBoolean(1927938048))) {
                    this.setString(-407306240, this.getString(15902));
                }
                if (!(this.getInteger(-1458241280) != 1 && this.getInteger(-1458241280) != 2 && this.getInteger(-1458241280) != 3 && this.getInteger(-1458241280) != 4 || this.getInteger(1253703680) != 1 && this.getInteger(1253703680) != 2 && this.getInteger(1253703680) != 3 && this.getInteger(1253703680) != 4 || !this.getBoolean(26017) && (this.getInteger(-1458241280) != 1 || this.getInteger(1253703680) != 1))) {
                    this.setString(-407306240, this.getString(378994688));
                }
                if (!(this.getInteger(-1458241280) != 5 && this.getInteger(-1458241280) != 6 || this.getInteger(-116195072) != 1 && this.getInteger(-116195072) != 2)) {
                    this.setString(-407306240, this.getString(1423114240));
                }
                if ((this.getInteger(-1458241280) == 7 || this.getInteger(-1458241280) == 8 || this.getInteger(-1458241280) == 9 || this.getInteger(-1458241280) == 10 || this.getInteger(-1458241280) == 11 || this.getInteger(-1458241280) == 12 || this.getInteger(-1458241280) == 13 || this.getInteger(-1458241280) == 14 || this.getInteger(-1458241280) == 15 || this.getInteger(-1458241280) == 16) && (this.getInteger(-804781824) == 1 || this.getInteger(-804781824) == 2 || this.getInteger(-804781824) == 3 || this.getInteger(-804781824) == 4 || this.getInteger(-804781824) == 5 || this.getInteger(-804781824) == 6 || this.getInteger(-804781824) == 7 && this.getInteger(-338493440) == 0 || this.getInteger(-804781824) == 8 || this.getInteger(-804781824) == 9 || this.getInteger(-804781824) == 10)) {
                    this.setString(-407306240, this.getString(10407));
                }
                if (this.getInteger(-1458241280) == 13 && this.getInteger(-804781824) == 0 && this.getInteger(-338493440) == 1) {
                    this.setString(-407306240, this.getString(227999744));
                }
                this.setString(-557318144, this.getString(-729808896));
                this.setString(-1428750336, this.getI18nStrings(200)[this.getInteger(-1458241280)]);
                this.setInteger(28224, 0);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 2035912009);
                break;
            }
            case 10: {
                this.setInteger(-1113784320, 2);
                this.setBoolean(972947456, true);
                this.setBoolean(-1747910656, this.getBoolean(-1508245248));
                if (this.getInteger(-116195072) == 0 && this.getInteger(19495) == 0 && this.getInteger(-804781824) == 0) {
                    this.setString(-407306240, "");
                }
                if (!(this.getInteger(-1458241280) != 1 && this.getInteger(-1458241280) != 2 && this.getInteger(-1458241280) != 3 && this.getInteger(-1458241280) != 4 || this.getInteger(19495) != 1 && this.getInteger(19495) != 2 && this.getInteger(19495) != 3 && this.getInteger(19495) != 4 || this.getBoolean(26017) && !this.getBoolean(1927938048))) {
                    this.setString(-407306240, this.getString(15902));
                }
                if (!(this.getInteger(-1458241280) != 1 && this.getInteger(-1458241280) != 2 && this.getInteger(-1458241280) != 3 && this.getInteger(-1458241280) != 4 || this.getInteger(1253703680) != 1 && this.getInteger(1253703680) != 2 && this.getInteger(1253703680) != 3 && this.getInteger(1253703680) != 4 || !this.getBoolean(26017) && (this.getInteger(-1458241280) != 1 || this.getInteger(1253703680) != 1))) {
                    this.setString(-407306240, this.getString(378994688));
                }
                if (!(this.getInteger(-1458241280) != 5 && this.getInteger(-1458241280) != 6 || this.getInteger(-116195072) != 1 && this.getInteger(-116195072) != 2)) {
                    this.setString(-407306240, this.getString(1423114240));
                }
                if ((this.getInteger(-1458241280) == 7 || this.getInteger(-1458241280) == 8 || this.getInteger(-1458241280) == 9 || this.getInteger(-1458241280) == 10 || this.getInteger(-1458241280) == 11 || this.getInteger(-1458241280) == 12 || this.getInteger(-1458241280) == 13 || this.getInteger(-1458241280) == 14 || this.getInteger(-1458241280) == 15 || this.getInteger(-1458241280) == 16) && (this.getInteger(-804781824) == 1 || this.getInteger(-804781824) == 2 || this.getInteger(-804781824) == 3 || this.getInteger(-804781824) == 4 || this.getInteger(-804781824) == 5 || this.getInteger(-804781824) == 6 || this.getInteger(-804781824) == 7 && this.getInteger(-338493440) == 0 || this.getInteger(-804781824) == 8 || this.getInteger(-804781824) == 9 || this.getInteger(-804781824) == 10)) {
                    this.setString(-407306240, this.getString(10407));
                }
                if (this.getInteger(-1458241280) == 13 && this.getInteger(-804781824) == 7 && this.getInteger(-338493440) == 1) {
                    this.setString(-407306240, this.getString(227999744));
                }
                this.setString(-557318144, this.getString(-729808896));
                this.setString(-1428750336, this.getI18nStrings(200)[this.getInteger(-1458241280)]);
                this.setInteger(28224, 0);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 2035912009);
                break;
            }
            case 11: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -849769143);
                break;
            }
            case 12: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -933655223);
                break;
            }
            case 13: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -950432439);
                break;
            }
            case 14: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1772057271);
                break;
            }
            case 15: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2052689225);
                break;
            }
            case 16: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -916878007);
                break;
            }
            case 17: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1470526135);
                break;
            }
            case 18: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -900100791);
                break;
            }
            case 19: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -883323575);
                break;
            }
            case 20: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1839624887);
                break;
            }
            case 21: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2086702409);
                break;
            }
            case 22: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2086702409);
                break;
            }
            case 23: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2086702409);
                break;
            }
            case 24: {
                this.setBoolean(606077184, true);
                break;
            }
            case 25: {
                this.setBoolean(606077184, true);
                break;
            }
            case 26: {
                this.setBoolean(606077184, true);
                break;
            }
            case 27: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1940288183);
                break;
            }
            case 28: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2107601591);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1721725623);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1638298295);
                break;
            }
            case 29: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1688629943);
                break;
            }
            case 30: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1705407159);
                break;
            }
            case 31: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -530215607);
                this.setBoolean(606077184, true);
                this.setInteger(13743, 1);
                this.setBoolean(1759903744, true);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1000764087);
                break;
            }
            case 32: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -530215607);
                this.setBoolean(606077184, true);
                this.setInteger(13743, 1);
                this.setBoolean(1759903744, true);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                break;
            }
            case 33: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -479883959);
                this.setBoolean(606077184, true);
                this.setInteger(13743, 0);
                break;
            }
            case 34: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -530215607);
                this.setBoolean(606077184, true);
                this.setInteger(13743, 1);
                this.setBoolean(1759903744, true);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                break;
            }
            case 35: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1973842615);
                break;
            }
            case 36: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                break;
            }
            case 37: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                break;
            }
            case 38: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                break;
            }
            case 39: {
                this.setString(28686, "");
                break;
            }
            case 40: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1067872951);
                break;
            }
            case 41: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1671852727);
                break;
            }
            case 42: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1051095735);
                break;
            }
            case 43: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                break;
            }
            case 44: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                break;
            }
            case 45: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                break;
            }
            case 46: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1721725623);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -530215607);
                this.setBoolean(606077184, true);
                this.setInteger(13743, 12);
                this.setBoolean(1759903744, true);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                break;
            }
            case 47: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1721725623);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -530215607);
                this.setBoolean(606077184, true);
                this.setInteger(13743, 12);
                this.setBoolean(1759903744, true);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                break;
            }
            case 48: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -530215607);
                this.setBoolean(606077184, true);
                this.setInteger(13743, 12);
                this.setBoolean(1759903744, true);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                break;
            }
            case 49: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -530215607);
                this.setBoolean(606077184, true);
                this.setInteger(13743, 12);
                this.setBoolean(1759903744, true);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                break;
            }
            case 50: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -480670391);
                break;
            }
            case 51: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1721725623);
                break;
            }
            case 52: {
                this.setBoolean(632356864, true);
                this.setInteger(-2082799616, -1);
                break;
            }
            case 53: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1839166135);
                break;
            }
            case 54: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1973383863);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1956606647);
                break;
            }
            case 55: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1487303351);
                break;
            }
            case 56: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -329675447);
                break;
            }
            case 57: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1213893961);
                break;
            }
            case 58: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1134981815);
                break;
            }
            case 59: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1621521079);
                break;
            }
            case 60: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1520857783);
                break;
            }
            case 61: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1537634999);
                break;
            }
            case 62: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1314950473);
                break;
            }
            case 63: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1856402103);
                break;
            }
            case 64: {
                this.setString(-284360448, this.getI18nString(4625));
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -463893175);
                break;
            }
            case 65: {
                this.setString(-284360448, this.getI18nString(4626));
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -463893175);
                break;
            }
            case 66: {
                this.setString(-284360448, this.getI18nString(4627));
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -463893175);
                break;
            }
            case 67: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1822388919);
                break;
            }
            case 68: {
                this.setInteger(18457, SkinDataPool.getInteger(180));
                break;
            }
            case 69: {
                this.setInteger(18457, SkinDataPool.getInteger(190));
                break;
            }
            case 70: {
                this.setBoolean(24913, true);
                this.setBoolean(632356864, true);
                this.setBoolean(30202, true);
                this.setBoolean(78708736, true);
                this.setBoolean(118751488, true);
                this.setBoolean(11972, true);
                this.setBoolean(31574, true);
                this.setBoolean(1725235200, true);
                this.setBoolean(-1230569472, true);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -513438391);
                break;
            }
            case 71: {
                this.setBoolean(24913, true);
                this.setBoolean(632356864, true);
                this.setBoolean(30202, true);
                this.setBoolean(78708736, true);
                this.setBoolean(118751488, true);
                this.setBoolean(11972, true);
                this.setBoolean(31574, true);
                this.setBoolean(1725235200, true);
                this.setBoolean(-1230569472, true);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -479883959);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -463106743);
                break;
            }
            case 72: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1655075511);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1331793225);
                break;
            }
            case 73: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1806070455);
                break;
            }
            case 74: {
                this.setString(22895, this.getString(-407764992));
                this.triggerObserver(-1425866688);
                break;
            }
            case 75: {
                this.triggerObserver(-480504512);
                break;
            }
            case 76: {
                this.setBoolean(1759903744, false);
                this.setInteger(-997851136, 0);
                this.setInteger(1088815104, 30);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1331727689);
                break;
            }
            case 77: {
                this.setBoolean(1759903744, false);
                this.setInteger(19672, 4);
                this.setInteger(1088815104, 30);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1533054281);
                break;
            }
            case 78: {
                this.triggerObserver(302710848);
                break;
            }
            case 79: {
                this.setString(984547328, this.getString(823263488));
                this.setInteger(-455409664, 1);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1465945417);
                break;
            }
            case 80: {
                this.setInteger(1889402880, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 81: {
                break;
            }
            case 82: {
                this.setInteger(-1096744960, 3);
                PhoneActivity.lockWaitaphore(-388825088, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1096744960));
                this.triggerObserver(-1039990720, eventGeneric);
                this.setBoolean(10159, true);
                break;
            }
            case 83: {
                this.setInteger(-1096744960, 2);
                PhoneActivity.lockWaitaphore(-388825088, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1096744960));
                this.triggerObserver(-1039990720, eventGeneric);
                this.setBoolean(10159, true);
                break;
            }
            case 84: {
                this.setInteger(-1096744960, 1);
                PhoneActivity.lockWaitaphore(-388825088, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1096744960));
                this.triggerObserver(-1039990720, eventGeneric);
                this.setBoolean(10159, true);
                break;
            }
            case 85: {
                this.setInteger(-1096744960, 0);
                PhoneActivity.lockWaitaphore(-388825088, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1096744960));
                this.triggerObserver(-1039990720, eventGeneric);
                this.setBoolean(10159, true);
                break;
            }
            case 86: {
                this.setInteger(513081344, 1);
                this.setString(-1332150272, PhoneActivity.evListItemEventSender());
                this.setLong(12175, PhoneActivity.evListItemObjectId());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(12175));
                this.triggerObserver(-497281728, eventGeneric);
                break;
            }
            case 87: {
                this.setInteger(513081344, 2);
                this.setString(-1332150272, PhoneActivity.evListItemEventSender());
                this.setLong(12175, PhoneActivity.evListItemObjectId());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(12175));
                this.triggerObserver(-497281728, eventGeneric);
                break;
            }
            case 88: {
                this.setInteger(11806, 0);
                this.setBoolean(10159, false);
                break;
            }
            case 89: {
                break;
            }
            case 90: {
                this.triggerObserver(-956104640);
                this.setInteger(-2082799616, -1);
                break;
            }
            case 91: {
                this.setInteger(-1717633024, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 92: {
                this.setInteger(-355139584, 2);
                this.setLong(19840, PhoneActivity.evListItemObjectId());
                PhoneActivity.lockWaitaphore(-1647837184, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(19840));
                this.triggerObserver(-1006436288, eventGeneric);
                break;
            }
            case 93: {
                this.setInteger(-355139584, 3);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -731542199);
                break;
            }
            case 94: {
                this.setInteger(-2082799616, -1);
                this.setInteger(-355139584, 9);
                this.setLong(19840, PhoneActivity.evListItemObjectId());
                break;
            }
            case 95: {
                this.setInteger(-355139584, 3);
                this.setLong(19840, PhoneActivity.evListItemObjectId());
                PhoneActivity.lockWaitaphore(-1647837184, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(19840));
                this.triggerObserver(-1006436288, eventGeneric);
                break;
            }
            case 96: {
                this.setInteger(-2082799616, -1);
                this.setInteger(-355139584, 8);
                this.setLong(19840, PhoneActivity.evListItemObjectId());
                break;
            }
            case 97: {
                this.setInteger(-2082799616, -1);
                this.setInteger(-355139584, 0);
                break;
            }
            case 98: {
                if (this.getInteger(-355139584) != 9) {
                    this.setInteger(-355139584, 2);
                }
                if (this.getInteger(-355139584) == 9) {
                    this.setInteger(-355139584, 3);
                }
                PhoneActivity.lockWaitaphore(-1647837184, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(19840));
                this.triggerObserver(-1006436288, eventGeneric);
                break;
            }
            case 99: {
                this.setInteger(-1717633024, this.getInteger(16413));
                break;
            }
            case 100: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -731542199);
                break;
            }
            case 101: {
                this.setInteger(-2082799616, this.getInteger(-1717633024));
                break;
            }
            case 102: {
                this.setInteger(-2082799616, -1);
                break;
            }
            case 103: {
                this.setInteger(1828978944, PhoneActivity.evListItemActionIndex());
                if (PhoneActivity.evListItemEventSender().equals("Button_ContactDetails")) {
                    this.setInteger(-355139584, 4);
                }
                if (PhoneActivity.evListItemEventSender().equals("Button_DialPrefix")) {
                    this.setInteger(-355139584, 5);
                }
                if (!PhoneActivity.evListItemEventSender().equals("Button_Use")) break;
                this.setInteger(-355139584, 6);
                break;
            }
            case 104: {
                this.setInteger(-355139584, 7);
                this.setLong(19840, PhoneActivity.evListItemObjectId());
                PhoneActivity.lockWaitaphore(-1647837184, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(19840));
                this.triggerObserver(-1006436288, eventGeneric);
                break;
            }
            case 105: {
                this.triggerObserver(-1023213504);
                break;
            }
            case 108: {
                this.triggerObserver(1963130944);
                this.setBoolean(21393, false);
                break;
            }
            case 110: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 2069466441);
                break;
            }
            case 115: {
                this.setBoolean(-638976000, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-638976000));
                this.triggerObserver(621019200, eventGeneric);
                this.setBoolean(11354, false);
                break;
            }
            case 116: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 2069466441);
                break;
            }
            case 119: {
                this.setBoolean(-638976000, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-638976000));
                this.triggerObserver(621019200, eventGeneric);
                this.setBoolean(11354, false);
                break;
            }
            case 120: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 2069466441);
                break;
            }
            case 121: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1957065399);
                this.setBoolean(571146496, false);
                break;
            }
            case 122: {
                this.setBoolean(571146496, true);
                break;
            }
            case 125: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1957065399);
                this.setBoolean(571146496, false);
                break;
            }
            case 126: {
                this.setBoolean(571146496, true);
                break;
            }
            case 127: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 2069466441);
                break;
            }
            case 128: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 526028105);
                break;
            }
            case 129: {
                this.setBoolean(1557266432, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(1557266432));
                this.triggerObserver(0xB040040, eventGeneric);
                eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(27884));
                this.triggerObserver(-301727680, eventGeneric);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1571189431);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1621062327);
                break;
            }
            case 130: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 542805321);
                break;
            }
            case 131: {
                this.setBoolean(1557266432, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(1557266432));
                this.triggerObserver(0xB040040, eventGeneric);
                eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(27884));
                this.triggerObserver(-301727680, eventGeneric);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1554412215);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1604285111);
                break;
            }
            case 134: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 135: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 136: {
                this.triggerObserver(-771555264);
                break;
            }
            case 137: {
                this.triggerObserver(-754778048);
                break;
            }
            case 138: {
                this.setString(-945225728, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(43057152, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(25963, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(-1447755776, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(-945225728));
                eventGeneric.setInt(1, this.getInteger(25963));
                eventGeneric.setInt(2, this.getInteger(-1447755776));
                eventGeneric.setInt(3, this.getInteger(43057152));
                this.triggerObserver(-715385536, eventGeneric);
                break;
            }
            case 139: {
                this.setBoolean(1557266432, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(1557266432));
                this.triggerObserver(0xB040040, eventGeneric);
                this.triggerObserver(336199744);
                break;
            }
            case 140: {
                this.setBoolean(1557266432, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(1557266432));
                this.triggerObserver(0xB040040, eventGeneric);
                this.triggerObserver(336199744);
                break;
            }
            case 141: {
                this.setInteger(-83623680, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-83623680));
                this.triggerObserver(-704446400, eventGeneric);
                break;
            }
            case 142: {
                this.setInteger(1889402880, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 143: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 144: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 145: {
                this.triggerObserver(-771555264);
                break;
            }
            case 146: {
                this.triggerObserver(-754778048);
                break;
            }
            case 147: {
                this.setString(-945225728, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(43057152, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(25963, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(-1447755776, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(-945225728));
                eventGeneric.setInt(1, this.getInteger(25963));
                eventGeneric.setInt(2, this.getInteger(-1447755776));
                eventGeneric.setInt(3, this.getInteger(43057152));
                this.triggerObserver(-715385536, eventGeneric);
                break;
            }
            case 148: {
                this.setInteger(-83623680, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-83623680));
                this.triggerObserver(-704446400, eventGeneric);
                break;
            }
            case 149: {
                this.setInteger(1889402880, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 150: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 151: {
                this.triggerObserver(386138176);
                break;
            }
            case 152: {
                this.setString(19733, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(-149618432, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(971702272, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(31114, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(19733));
                eventGeneric.setInt(1, this.getInteger(971702272));
                eventGeneric.setInt(2, this.getInteger(31114));
                eventGeneric.setInt(3, this.getInteger(-149618432));
                this.triggerObserver(-614722240, eventGeneric);
                break;
            }
            case 153: {
                this.setInteger(-2117337088, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2117337088));
                this.triggerObserver(486801472, eventGeneric);
                break;
            }
            case 154: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 155: {
                this.triggerObserver(386138176);
                break;
            }
            case 156: {
                this.setString(19733, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(-149618432, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(971702272, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(31114, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(19733));
                eventGeneric.setInt(1, this.getInteger(971702272));
                eventGeneric.setInt(2, this.getInteger(31114));
                eventGeneric.setInt(3, this.getInteger(-149618432));
                this.triggerObserver(-614722240, eventGeneric);
                break;
            }
            case 157: {
                this.setInteger(-2117337088, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2117337088));
                this.triggerObserver(486801472, eventGeneric);
                break;
            }
            case 158: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 159: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 160: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 161: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 162: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 163: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 164: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 165: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 166: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 167: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 168: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 169: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 170: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 171: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 172: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 173: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 174: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 175: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 176: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 177: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1185313463);
                break;
            }
            case 180: {
                this.setInteger(-2067267584, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2067267584));
                this.triggerObserver(-1375535040, eventGeneric);
                break;
            }
            case 181: {
                this.setInteger(823591168, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(823591168));
                this.triggerObserver(-1409089472, eventGeneric);
                break;
            }
            case 182: {
                this.setInteger(-1881014272, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 183: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -396784311);
                break;
            }
            case 184: {
                this.setInteger(1403977728, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 185: {
                this.setInteger(-1398800384, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1398800384));
                this.triggerObserver(-1610416064, eventGeneric);
                this.setBoolean(-493289472, true);
                break;
            }
            case 186: {
                this.setInteger(20256, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(20256));
                this.triggerObserver(-1492975552, eventGeneric);
                this.setBoolean(-493289472, true);
                break;
            }
            case 187: {
                this.setInteger(15085, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(15085));
                this.triggerObserver(-1509752768, eventGeneric);
                this.setBoolean(-493289472, true);
                break;
            }
            case 188: {
                this.setInteger(0x22210100, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(0x22210100));
                this.triggerObserver(-1492516800, eventGeneric);
                this.setBoolean(-493289472, true);
                break;
            }
            case 189: {
                this.setInteger(51773696, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(51773696));
                this.triggerObserver(-1526529984, eventGeneric);
                break;
            }
            case 190: {
                this.setInteger(1155006464, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1155006464));
                this.triggerObserver(-1543307200, eventGeneric);
                break;
            }
            case 191: {
                this.setBoolean(-1713307648, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 192: {
                this.setBoolean(-1713307648, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1713307648));
                this.triggerObserver(1745027136, eventGeneric);
                break;
            }
            case 193: {
                this.setBoolean(898170880, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(898170880));
                this.triggerObserver(1728249920, eventGeneric);
                break;
            }
            case 194: {
                this.setBoolean(898170880, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(898170880));
                this.triggerObserver(1728249920, eventGeneric);
                break;
            }
            case 195: {
                this.setInteger(-1541668608, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1541668608));
                this.triggerObserver(-363064000, eventGeneric);
                break;
            }
            case 196: {
                this.setInteger(-68091904, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-68091904));
                this.triggerObserver(-1560084416, eventGeneric);
                break;
            }
            case 197: {
                this.setInteger(-105840640, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-105840640));
                this.triggerObserver(-1475739584, eventGeneric);
                break;
            }
            case 198: {
                break;
            }
            case 199: {
                break;
            }
            case 200: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -530215607);
                this.setBoolean(606077184, true);
                this.setInteger(13743, 1);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1000764087);
                break;
            }
            case 201: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -530215607);
                this.setBoolean(606077184, true);
                this.setInteger(13743, 1);
                this.setBoolean(1759903744, false);
                this.setBoolean(-493289472, false);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1000764087);
                break;
            }
            case 202: {
                this.triggerObserver(-1050929856);
                break;
            }
            case 203: {
                this.triggerObserver(-1050929856);
                break;
            }
            case 204: {
                this.triggerObserver(-279177920);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubHapticPhoneDynState(int n) {
        switch (n - this.TT_OFFSET) {
            case 12: {
                return this.getInteger(14021) == 0;
            }
            case 17: {
                return this.getInteger(14021) == 0;
            }
            case 18: {
                return (this.getInteger(19495) == 1 || this.getBoolean(26017) && this.getInteger(938344448) == 2 && !this.getBoolean(151519488)) && this.getInteger(14021) == 0;
            }
            case 24: {
                return this.getInteger(513081344) == 2;
            }
            case 25: {
                return this.getInteger(513081344) == 1;
            }
            case 31: {
                return !this.getBoolean(-219152384);
            }
            case 32: {
                return this.getInteger(-355139584) == 7;
            }
            case 34: {
                return this.getInteger(-355139584) == 2 || this.getInteger(-355139584) == 3;
            }
            case 78: {
                return PhoneActivity.evListItemEventSender().equals("Button_Call") && this.getLicValue(1160, 8, this.getInteger(-1881014272), false);
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubHapticPhoneDynState(int n) {
        this.performTriggeredTransitionAction_SubHapticPhoneDynState00(n);
    }

    private void performTriggeredTransitionAction_SubHapticPhoneDynState00(int n) {
        switch (n - this.TT_OFFSET) {
            case 2: {
                this.setInteger(13743, 0);
                this.setBoolean(1759903744, false);
                this.setBoolean(632356864, true);
                this.setBoolean(24913, true);
                this.setBoolean(11972, true);
                this.setBoolean(30202, true);
                this.setBoolean(606077184, true);
                this.triggerObserver(-956104640);
                break;
            }
            case 7: {
                this.setString(28686, "");
                if (this.getBoolean(-908001280)) {
                    this.triggerObserver(-1291648960);
                }
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1973383863);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1956606647);
                break;
            }
            case 9: {
                this.setInteger(13743, 0);
                break;
            }
            case 10: {
                this.setInteger(13743, 0);
                break;
            }
            case 12: {
                this.setBoolean(1759903744, false);
                break;
            }
            case 15: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 16: {
                this.setString(984547328, this.getLicValue(277091584, 0, this.getInteger(1889402880), ""));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getLicValue(277091584, 0, this.getInteger(1889402880), ""));
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                break;
            }
            case 17: {
                this.setBoolean(1759903744, false);
                break;
            }
            case 18: {
                this.setBoolean(1759903744, false);
                break;
            }
            case 19: {
                this.setBoolean(1759903744, false);
                break;
            }
            case 20: {
                this.setBoolean(1759903744, false);
                break;
            }
            case 21: {
                this.setBoolean(1759903744, false);
                this.setBoolean(78708736, true);
                this.setBoolean(118751488, true);
                this.setBoolean(11972, true);
                this.setBoolean(31574, true);
                this.setBoolean(1725235200, true);
                this.setBoolean(-1230569472, true);
                break;
            }
            case 24: {
                this.setInteger(513081344, 0);
                if (this.getInteger(-388825088) == 1) {
                    this.setInteger(-1781792768, this.getInteger(18377));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setInteger(385155072, this.getInteger(18377));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setInteger(26851, this.getInteger(18377));
                }
                if (this.getInteger(-388825088) == 3) {
                    this.setInteger(29052, this.getInteger(18377));
                }
                this.setString(28686, "");
                if (this.getInteger(-388825088) == 1 && !this.getLicValue(1170, 10, this.getInteger(-1781792768), "").equals("")) {
                    this.setString(28686, this.getLicValue(1170, 10, this.getInteger(-1781792768), ""));
                }
                if (this.getInteger(-388825088) == 0 && !this.getLicValue(1171, 10, this.getInteger(385155072), "").equals("")) {
                    this.setString(28686, this.getLicValue(1171, 10, this.getInteger(385155072), ""));
                }
                if (this.getInteger(-388825088) == 2 && !this.getLicValue(1172, 10, this.getInteger(26851), "").equals("")) {
                    this.setString(28686, this.getLicValue(1172, 10, this.getInteger(26851), ""));
                }
                if (this.getInteger(-388825088) == 3 && !this.getLicValue(1173, 10, this.getInteger(29052), "").equals("")) {
                    this.setString(28686, this.getLicValue(1173, 10, this.getInteger(29052), ""));
                }
                this.setInteger(13743, 0);
                break;
            }
            case 25: {
                this.setInteger(513081344, 0);
                if (this.getInteger(-388825088) == 1) {
                    this.setInteger(-1781792768, this.getInteger(18377));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setInteger(385155072, this.getInteger(18377));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setInteger(26851, this.getInteger(18377));
                }
                if (this.getInteger(-388825088) != 3) break;
                this.setInteger(29052, this.getInteger(18377));
                break;
            }
            case 26: {
                this.setBoolean(24913, true);
                this.setBoolean(11972, true);
                break;
            }
            case 29: {
                if (this.getSpellerData(1267400704).getEnteredText().length() > 0) {
                    this.triggerObserver(-838664128);
                }
                if (this.getSpellerData(1267400704).getEnteredText().length() == 0) {
                    this.triggerObserver(-956104640);
                }
                if (this.getSpellerData(1267400704).getEnteredText().length() <= 0) break;
                this.setBoolean(632356864, true);
                break;
            }
            case 30: {
                this.triggerObserver(-905772992);
                break;
            }
            case 32: {
                this.setString(28686, this.getLicValue(1190, 4, this.getInteger(-1717633024), ""));
                break;
            }
            case 33: {
                this.setString(28686, this.getLicValue(1189, 1, this.getInteger(1828978944), ""));
                break;
            }
            case 35: {
                this.setBoolean(632356864, true);
                if (!this.getBoolean(-219152384)) break;
                this.triggerObserver(-956104640);
                break;
            }
            case 45: {
                this.setString(984547328, this.getString(-407764992));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getString(-407764992));
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                break;
            }
            case 46: {
                this.setString(984547328, this.getLicValue(277091584, 0, this.getInteger(1889402880), ""));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getLicValue(277091584, 0, this.getInteger(1889402880), ""));
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                break;
            }
            case 48: {
                this.setString(984547328, this.getString(-407764992));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getString(-407764992));
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                break;
            }
            case 52: {
                this.setString(984547328, this.getString(-407764992));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getString(-407764992));
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                break;
            }
            case 53: {
                this.setString(984547328, this.getLicValue(277091584, 0, this.getInteger(1889402880), ""));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getLicValue(277091584, 0, this.getInteger(1889402880), ""));
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                break;
            }
            case 55: {
                this.setString(984547328, this.getString(-407764992));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getString(-407764992));
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                break;
            }
            case 56: {
                this.setBoolean(1557266432, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(1557266432));
                this.triggerObserver(0xB040040, eventGeneric);
                break;
            }
            case 57: {
                break;
            }
            case 61: {
                this.triggerObserver(402915392);
                break;
            }
            case 62: {
                this.triggerObserver(503578688);
                this.setString(1394278656, this.getI18nString(3866));
                break;
            }
            case 66: {
                this.triggerObserver(352976960);
                this.triggerObserver(436469824);
                break;
            }
            case 67: {
                this.triggerObserver(402915392);
                break;
            }
            case 73: {
                this.setBoolean(1759903744, false);
                break;
            }
            case 79: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 84: {
                this.setBoolean(1759903744, false);
                this.setInteger(12930, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 85: {
                this.setInteger(1645084928, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1645084928));
                this.triggerObserver(-670891968, eventGeneric);
                this.setBoolean(1759903744, false);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubHapticPhoneDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 32: {
                return this.getBoolean(24913);
            }
            case 36: {
                return this.getString(-1332150272).equals("Button_Callstack");
            }
            case 37: {
                return this.getString(-1332150272).equals("Button_DialPrefix");
            }
            case 38: {
                return this.getString(-1332150272).equals("Button_Details");
            }
            case 39: {
                return this.getString(-1332150272).equals("Button_Use");
            }
            case 51: {
                return this.getBoolean(632356864);
            }
            case 57: {
                return this.getInteger(13743) == 10;
            }
            case 58: {
                return this.getInteger(13743) == 8;
            }
            case 59: {
                return this.getInteger(13743) == 9;
            }
            case 61: {
                return !this.getLicValue(1190, 8, this.getInteger(-1717633024), false) && this.getInteger(-355139584) == 2;
            }
            case 63: {
                return this.getInteger(-355139584) == 5;
            }
            case 64: {
                return this.getInteger(-355139584) == 6;
            }
            case 68: {
                return this.getSpellerData(1267400704).getMatchCount() > 1;
            }
            case 69: {
                return this.getSpellerData(1267400704).getMatchCount() == 1;
            }
            case 75: {
                return this.getInteger(2040725504) > 0;
            }
            case 87: {
                return this.getBoolean(25376);
            }
            case 92: {
                return this.getInteger(-455409664) == 2 && !this.getBoolean(19517);
            }
            case 93: {
                return (this.getInteger(-455409664) == 5 || this.getInteger(-455409664) == 3 || this.getInteger(-455409664) == 7) && !this.getBoolean(19517);
            }
            case 94: {
                return this.getInteger(-455409664) == 6 && !this.getBoolean(19517);
            }
            case 95: {
                return this.getInteger(-455409664) == 9 && !this.getBoolean(19517);
            }
            case 96: {
                return this.getInteger(-455409664) == 10 && !this.getBoolean(19517);
            }
            case 98: {
                return this.getInteger(1088815104) == 1;
            }
            case 99: {
                return this.getInteger(1088815104) == 21;
            }
            case 100: {
                return this.getInteger(1088815104) == 20;
            }
            case 106: {
                return this.getInteger(938344448) != 0 && !this.getBoolean(151519488) && this.getInteger(-519634688) == 11 && this.getBoolean(30686);
            }
            case 110: {
                return this.getInteger(11096) == 12 && this.getBoolean(-522977280);
            }
            case 111: {
                return !this.getBoolean(-509345792) || !this.getBoolean(31551);
            }
            case 112: {
                return this.getBoolean(-509345792) && this.getBoolean(31551) && this.getBoolean(30686) && !this.getBoolean(1927938048);
            }
            case 129: {
                return this.getInteger(-519634688) == 11;
            }
            case 130: {
                return this.getInteger(-519634688) == 7;
            }
            case 131: {
                return this.getInteger(-519634688) == 0 || this.getInteger(-519634688) == 1;
            }
            case 132: {
                return this.getInteger(-519634688) == 12;
            }
            case 133: {
                return this.getInteger(-519634688) == 3;
            }
            case 134: {
                return this.getInteger(-519634688) == 5;
            }
            case 153: {
                return PhoneActivity.evListItemEventSender().equals("Button_CallInfo") && this.getLicValue(1158, 23, this.getInteger(1403977728), 0) == 6;
            }
            case 154: {
                return PhoneActivity.evListItemEventSender().equals("Button_ToContact") && this.getLicValue(1158, 23, this.getInteger(1403977728), 0) < 3 && this.getLicValue(1158, 14, this.getInteger(1403977728), false);
            }
            case 155: {
                return PhoneActivity.evListItemEventSender().equals("Button_CallInfo") && this.getLicValue(1158, 23, this.getInteger(1403977728), 0) < 3 && this.getLicValue(1158, 14, this.getInteger(1403977728), false);
            }
            case 158: {
                return this.getBoolean(30202);
            }
            case 160: {
                return this.getInteger(14021) > 0;
            }
            case 164: {
                return this.getInteger(1088815104) == 41;
            }
            case 166: {
                return this.getInteger(13743) == 2 || this.getInteger(13743) == 4 || this.getInteger(13743) == 6 || this.getInteger(13743) == 5;
            }
            case 167: {
                return this.getInteger(13743) == 1;
            }
            case 168: {
                return this.getInteger(13743) == 3;
            }
            case 169: {
                return this.getInteger(-455409664) == 1;
            }
            case 170: {
                return this.getInteger(-455409664) == 8;
            }
            case 171: {
                return this.getInteger(13743) == 11;
            }
            case 172: {
                return this.getInteger(11738) == 2;
            }
            case 174: {
                return this.getLicValue(1194, 3, this.getInteger(12930), "").equals("") || this.getLicValue(1194, 5, this.getInteger(12930), false);
            }
            case 176: {
                return this.getInteger(13743) == 10;
            }
            case 177: {
                return this.getInteger(-455409664) == 11;
            }
            case 179: {
                return this.getInteger(-519634688) == 2;
            }
            case 180: {
                return this.getInteger(-519634688) != 2 && this.getBoolean(30686);
            }
            case 182: {
                return this.getBoolean(-509345792) && !this.getBoolean(31551) && (this.getInteger(15949) == 4 || this.getInteger(15949) == 8 || this.getInteger(15949) == 3) && !this.getBoolean(-522977280) && this.getBoolean(30686);
            }
            case 183: {
                return this.getBoolean(-509345792) && !this.getBoolean(31551) && (this.getInteger(20585) == 2 || this.getInteger(20585) == 5) && this.getBoolean(30686);
            }
            case 184: {
                return !this.getBoolean(-522977280) && !this.getBoolean(-509345792);
            }
            case 185: {
                return (this.getInteger(15949) == 6 || this.getInteger(15949) == 7) && this.getBoolean(30686);
            }
            case 186: {
                return this.getBoolean(-509345792) && this.getInteger(15949) == 1 && this.getInteger(19495) != 2 && this.getBoolean(30686);
            }
            case 187: {
                return this.getBoolean(-509345792) && this.getInteger(15949) == 5 && this.getBoolean(30686) && (!this.getBoolean(-522977280) || this.getInteger(20585) == 2 || this.getInteger(20585) == 5);
            }
            case 188: {
                return (this.getBoolean(-509345792) && this.getBoolean(31551) || this.getBoolean(-522977280)) && this.getInteger(15949) != 0 && this.getInteger(15949) != 6 && (this.getInteger(11096) == 1 || this.getInteger(11096) == 12);
            }
            case 189: {
                return this.getInteger(11096) == 9 && this.getBoolean(30686) && this.getBoolean(20317);
            }
            case 190: {
                return this.getInteger(11096) == 5;
            }
            case 196: {
                return this.getBoolean(1034223616);
            }
            case 198: {
                return this.getInteger(-455409664) == 2 || this.getInteger(-455409664) == 5 || this.getInteger(-455409664) == 3 || this.getInteger(-455409664) == 6 || this.getInteger(-455409664) == 7 || this.getInteger(-455409664) == 9 || this.getInteger(-455409664) == 10;
            }
            case 199: {
                return this.getBoolean(13359) && this.getBoolean(-588775424);
            }
            case 200: {
                return this.getInteger(-1761541888) != 0 && this.getBoolean(-1312686080);
            }
            case 201: {
                return this.getBoolean(24527);
            }
            case 202: {
                return this.getBoolean(-1494024192);
            }
            case 203: {
                return this.getBoolean(1638006784);
            }
            case 204: {
                return (this.getLicValue(1158, 11, 0, 4) != 0 && this.getLicValue(1158, 21, 0, 0) == 1 || this.getLicValue(1158, 11, 1, 4) != 0 && this.getLicValue(1158, 21, 1, 0) == 1 || this.getLicValue(1158, 11, 2, 4) != 0 && this.getLicValue(1158, 21, 2, 0) == 1) && this.getInteger(-519634688) != 2;
            }
            case 206: {
                return this.getInteger(13743) == 1 || this.getInteger(13743) == 12;
            }
            case 210: {
                return this.getInteger(1088815104) == 50;
            }
            case 211: {
                return this.getInteger(1088815104) == 51;
            }
            case 212: {
                return this.getInteger(1088815104) == 52;
            }
            case 213: {
                return this.getInteger(1088815104) == 53;
            }
            case 214: {
                return this.getInteger(1088815104) == 41;
            }
            case 215: {
                return this.getInteger(1088815104) == 59;
            }
            case 216: {
                return this.getInteger(1088815104) == 49;
            }
            case 217: {
                return this.getInteger(1088815104) == 48;
            }
            case 218: {
                return this.getInteger(1088815104) == 47;
            }
            case 220: {
                return this.getBoolean(-509345792) && this.getBoolean(30686);
            }
            case 222: {
                return this.getBoolean(1759903744);
            }
            case 224: {
                return !this.getBoolean(-493289472) && this.getBoolean(1759903744);
            }
            case 226: {
                return !(this.getBoolean(30686) || this.getBoolean(20317));
            }
            case 227: {
                return this.getInteger(1023279104) == 2;
            }
            case 229: {
                return this.getInteger(1023279104) == 1 && !this.getBoolean(-509345792);
            }
            case 230: {
                return this.getInteger(14570) == 1;
            }
            case 231: {
                return this.getInteger(14570) == 0;
            }
            case 233: {
                return this.getInteger(13743) == 0 && this.getInteger(11738) == 0 && this.getInteger(-455409664) == 0 && !this.getBoolean(606077184) && !this.getBoolean(19517) && (this.getBoolean(30686) || this.getBoolean(20317)) && this.getInteger(1023279104) != 2;
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubHapticPhoneDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 16: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 22: {
                this.triggerObserver(-1123876800);
                break;
            }
            case 24: {
                if (this.getInteger(11806) == 4) {
                    this.setInteger(-1096744960, 3);
                }
                if (this.getInteger(11806) == 2) {
                    this.setInteger(-1096744960, 0);
                }
                if (this.getInteger(11806) == 1) {
                    this.setInteger(-1096744960, 1);
                }
                if (this.getInteger(11806) == 3) {
                    this.setInteger(-1096744960, 2);
                }
                if (this.getInteger(11806) != 1 && this.getInteger(11806) != 2 && this.getInteger(11806) != 3 && this.getInteger(11806) != 4) break;
                PhoneActivity.lockWaitaphore(-388825088, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1096744960));
                this.triggerObserver(-1039990720, eventGeneric);
                break;
            }
            case 27: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 32: {
                this.setBoolean(24913, false);
                break;
            }
            case 34: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 35: {
                if (this.getInteger(-388825088) == 1) {
                    this.setInteger(1427636480, this.getInteger(-1781792768));
                }
                if (this.getInteger(-388825088) == 1) {
                    this.setLong(-469761792, this.getLicValue(1170, 0, this.getInteger(-1781792768), 0L));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setInteger(1427636480, this.getInteger(385155072));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setLong(-469761792, this.getLicValue(1171, 0, this.getInteger(385155072), 0L));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setInteger(1427636480, this.getInteger(26851));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setLong(-469761792, this.getLicValue(1172, 0, this.getInteger(26851), 0L));
                }
                if (this.getInteger(-388825088) == 3) {
                    this.setInteger(1427636480, this.getInteger(29052));
                }
                if (this.getInteger(-388825088) == 3) {
                    this.setLong(-469761792, this.getLicValue(1173, 0, this.getInteger(29052), 0L));
                }
                PhoneActivity.lockWaitaphore(-1647837184, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1427636480));
                eventGeneric.setLong(1, this.getLong(-469761792));
                this.triggerObserver(-514058944, eventGeneric);
                break;
            }
            case 36: {
                if (this.getInteger(-388825088) == 1) {
                    this.setString(984547328, this.getLicValue(1170, 10, this.getInteger(-1781792768), ""));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setString(984547328, this.getLicValue(1171, 10, this.getInteger(385155072), ""));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setString(984547328, this.getLicValue(1172, 10, this.getInteger(26851), ""));
                }
                if (this.getInteger(-388825088) == 3) {
                    this.setString(984547328, this.getLicValue(1173, 10, this.getInteger(29052), ""));
                }
                this.setInteger(1099104256, 0);
                if (this.getInteger(-388825088) == 1) {
                    this.setLong(-527826944, this.getLicValue(1170, 4, this.getInteger(-1781792768), 0L));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setLong(-527826944, this.getLicValue(1171, 4, this.getInteger(385155072), 0L));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setLong(-527826944, this.getLicValue(1172, 4, this.getInteger(26851), 0L));
                }
                if (this.getInteger(-388825088) == 3) {
                    this.setLong(-527826944, this.getLicValue(1173, 4, this.getInteger(29052), 0L));
                }
                if (this.getInteger(-388825088) == 1) {
                    this.setString(1545076992, this.getLicValue(1170, 10, this.getInteger(-1781792768), ""));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setString(1545076992, this.getLicValue(1171, 10, this.getInteger(385155072), ""));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setString(1545076992, this.getLicValue(1172, 10, this.getInteger(26851), ""));
                }
                if (this.getInteger(-388825088) == 3) {
                    this.setString(1545076992, this.getLicValue(1173, 10, this.getInteger(29052), ""));
                }
                if (this.getInteger(-388825088) == 1) {
                    this.setInteger(29056, this.getLicValue(1170, 18, this.getInteger(-1781792768), 0));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setInteger(29056, this.getLicValue(1171, 18, this.getInteger(385155072), 0));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setInteger(29056, this.getLicValue(1172, 18, this.getInteger(26851), 0));
                }
                if (this.getInteger(-388825088) == 3) {
                    this.setInteger(29056, this.getLicValue(1173, 18, this.getInteger(29052), 0));
                }
                if (this.getInteger(-388825088) == 1) {
                    this.setInteger(-1147076608, this.getLicValue(1170, 19, this.getInteger(-1781792768), 0));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setInteger(-1147076608, this.getLicValue(1171, 19, this.getInteger(385155072), 0));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setInteger(-1147076608, this.getLicValue(1172, 19, this.getInteger(26851), 0));
                }
                if (this.getInteger(-388825088) == 3) {
                    this.setInteger(-1147076608, this.getLicValue(1173, 19, this.getInteger(29052), 0));
                }
                if (this.getInteger(-388825088) == 1) {
                    this.setInteger(1637744640, -1);
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setInteger(1637744640, -1);
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setInteger(1637744640, -1);
                }
                if (this.getInteger(-388825088) != 3) break;
                this.setInteger(1637744640, -1);
                break;
            }
            case 37: {
                if (this.getInteger(-388825088) == 1) {
                    this.setString(984547328, FormatterService.format((CharSequence)"${0}${1}", this.getString(537657600), this.getLicValue(1170, 10, this.getInteger(-1781792768), "")));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setString(984547328, FormatterService.format((CharSequence)"${0}${1}", this.getString(537657600), this.getLicValue(1171, 10, this.getInteger(385155072), "")));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setString(984547328, FormatterService.format((CharSequence)"${0}${1}", this.getString(537657600), this.getLicValue(1172, 10, this.getInteger(26851), "")));
                }
                if (this.getInteger(-388825088) == 3) {
                    this.setString(984547328, FormatterService.format((CharSequence)"${0}${1}", this.getString(537657600), this.getLicValue(1173, 10, this.getInteger(29052), "")));
                }
                this.setInteger(1099104256, 0);
                if (this.getInteger(-388825088) == 1) {
                    this.setLong(-527826944, this.getLicValue(1170, 4, this.getInteger(-1781792768), 0L));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setLong(-527826944, this.getLicValue(1171, 4, this.getInteger(385155072), 0L));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setLong(-527826944, this.getLicValue(1172, 4, this.getInteger(26851), 0L));
                }
                if (this.getInteger(-388825088) == 3) {
                    this.setLong(-527826944, this.getLicValue(1173, 4, this.getInteger(29052), 0L));
                }
                if (this.getInteger(-388825088) == 1) {
                    this.setString(1545076992, FormatterService.format((CharSequence)"${0}${1}", this.getString(537657600), this.getLicValue(1170, 10, this.getInteger(-1781792768), "")));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setString(1545076992, FormatterService.format((CharSequence)"${0}${1}", this.getString(537657600), this.getLicValue(1171, 10, this.getInteger(385155072), "")));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setString(1545076992, FormatterService.format((CharSequence)"${0}${1}", this.getString(537657600), this.getLicValue(1172, 10, this.getInteger(26851), "")));
                }
                if (this.getInteger(-388825088) == 3) {
                    this.setString(1545076992, FormatterService.format((CharSequence)"${0}${1}", this.getString(537657600), this.getLicValue(1173, 10, this.getInteger(29052), "")));
                }
                if (this.getInteger(-388825088) == 1) {
                    this.setInteger(29056, this.getLicValue(1170, 18, this.getInteger(-1781792768), 0));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setInteger(29056, this.getLicValue(1171, 18, this.getInteger(385155072), 0));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setInteger(29056, this.getLicValue(1172, 18, this.getInteger(26851), 0));
                }
                if (this.getInteger(-388825088) == 3) {
                    this.setInteger(29056, this.getLicValue(1173, 18, this.getInteger(29052), 0));
                }
                if (this.getInteger(-388825088) == 1) {
                    this.setInteger(-1147076608, this.getLicValue(1170, 19, this.getInteger(-1781792768), 0));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setInteger(-1147076608, this.getLicValue(1171, 19, this.getInteger(385155072), 0));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setInteger(-1147076608, this.getLicValue(1172, 19, this.getInteger(26851), 0));
                }
                if (this.getInteger(-388825088) == 3) {
                    this.setInteger(-1147076608, this.getLicValue(1173, 19, this.getInteger(29052), 0));
                }
                if (this.getInteger(-388825088) == 1) {
                    this.setInteger(1637744640, -1);
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setInteger(1637744640, -1);
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setInteger(1637744640, -1);
                }
                if (this.getInteger(-388825088) != 3) break;
                this.setInteger(1637744640, -1);
                break;
            }
            case 39: {
                this.setString(28686, "");
                if (this.getInteger(-388825088) == 1) {
                    this.setString(28686, this.getLicValue(1170, 10, this.getInteger(-1781792768), ""));
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setString(28686, this.getLicValue(1171, 10, this.getInteger(385155072), ""));
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setString(28686, this.getLicValue(1172, 10, this.getInteger(26851), ""));
                }
                if (this.getInteger(-388825088) == 3) {
                    this.setString(28686, this.getLicValue(1173, 10, this.getInteger(29052), ""));
                }
                this.setInteger(13743, 0);
                break;
            }
            case 45: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 46: {
                this.setInteger(-355139584, 0);
                break;
            }
            case 51: {
                this.setBoolean(632356864, false);
                this.setInteger(-2082799616, -1);
                break;
            }
            case 53: {
                this.setInteger(13743, 0);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 54: {
                this.setLong(19840, this.getLong(22401));
                PhoneActivity.lockWaitaphore(-1647837184, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(19840));
                this.triggerObserver(-1006436288, eventGeneric);
                break;
            }
            case 55: {
                this.setInteger(13743, 0);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 56: {
                this.setLong(19840, this.getLong(1744371712));
                PhoneActivity.lockWaitaphore(-1647837184, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(19840));
                this.triggerObserver(-1006436288, eventGeneric);
                break;
            }
            case 57: {
                this.setInteger(13743, 0);
                break;
            }
            case 58: {
                this.setInteger(-1717633024, 0);
                this.setInteger(-2082799616, -1);
                break;
            }
            case 59: {
                this.setInteger(-1717633024, 0);
                this.setInteger(-2082799616, -1);
                break;
            }
            case 61: {
                this.setInteger(-2082799616, -1);
                this.setString(984547328, this.getLicValue(1190, 4, this.getInteger(-1717633024), ""));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, this.getLicValue(1190, 2, this.getInteger(-1717633024), 0L));
                this.setString(1545076992, this.getLicValue(1190, 4, this.getInteger(-1717633024), ""));
                this.setInteger(29056, this.getLicValue(1190, 9, this.getInteger(-1717633024), 0));
                this.setInteger(-1147076608, this.getLicValue(1190, 10, this.getInteger(-1717633024), 0));
                this.setInteger(1637744640, -1);
                break;
            }
            case 62: {
                this.setLong(-527826944, this.getLicValue(1190, 2, this.getInteger(-1717633024), 0L));
                this.setString(1545076992, this.getLicValue(1190, 4, this.getInteger(-1717633024), ""));
                this.setInteger(29056, this.getLicValue(1190, 9, this.getInteger(-1717633024), 0));
                this.setInteger(-1147076608, this.getLicValue(1190, 10, this.getInteger(-1717633024), 0));
                this.setInteger(1637744640, -1);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 63: {
                this.setString(984547328, FormatterService.format((CharSequence)"${0}${1}", this.getString(537657600), this.getLicValue(1189, 1, this.getInteger(1828978944), "")));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, this.getLicValue(1190, 2, this.getInteger(-1717633024), 0L));
                this.setString(1545076992, FormatterService.format((CharSequence)"${0}${1}", this.getString(537657600), this.getLicValue(1189, 1, this.getInteger(1828978944), "")));
                this.setInteger(29056, this.getLicValue(1189, 2, this.getInteger(1828978944), 0));
                this.setInteger(-1147076608, this.getLicValue(1189, 5, this.getInteger(1828978944), 0));
                this.setInteger(1637744640, -1);
                break;
            }
            case 64: {
                this.setString(28686, this.getLicValue(1189, 1, this.getInteger(1828978944), ""));
                break;
            }
            case 65: {
                this.setString(984547328, this.getLicValue(1189, 1, this.getInteger(1828978944), ""));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, this.getLicValue(1190, 2, this.getInteger(-1717633024), 0L));
                this.setString(1545076992, this.getLicValue(1189, 1, this.getInteger(1828978944), ""));
                this.setInteger(29056, this.getLicValue(1189, 2, this.getInteger(1828978944), 0));
                this.setInteger(-1147076608, this.getLicValue(1189, 5, this.getInteger(1828978944), 0));
                this.setInteger(1637744640, -1);
                break;
            }
            case 67: {
                PhoneActivity.lockWaitaphore(833093632, 1);
                this.triggerObserver(-972881856);
                break;
            }
            case 69: {
                this.setInteger(13743, 8);
                break;
            }
            case 75: {
                this.setInteger(11806, 3);
                break;
            }
            case 76: {
                this.setInteger(11806, 4);
                break;
            }
            case 88: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -866546359);
                break;
            }
            case 92: {
                this.setInteger(906100992, 0);
                this.setBoolean(606077184, true);
                break;
            }
            case 93: {
                this.setBoolean(78708736, true);
                this.setBoolean(118751488, true);
                this.setBoolean(11972, true);
                this.setBoolean(31574, true);
                this.setBoolean(1725235200, true);
                this.setBoolean(-1230569472, true);
                break;
            }
            case 94: {
                this.setBoolean(606077184, true);
                break;
            }
            case 95: {
                this.setInteger(13743, 10);
                break;
            }
            case 96: {
                this.setInteger(13743, 11);
                break;
            }
            case 97: {
                this.setBoolean(78708736, true);
                this.setBoolean(118751488, true);
                this.setBoolean(11972, true);
                this.setBoolean(31574, true);
                this.setBoolean(1725235200, true);
                this.setBoolean(-1230569472, true);
                break;
            }
            case 98: {
                this.setInteger(1088815104, 0);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1516277065);
                break;
            }
            case 99: {
                this.setInteger(84869376, 2);
                this.setInteger(1088815104, 0);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1281396041);
                break;
            }
            case 100: {
                this.setInteger(84869376, 1);
                this.setInteger(1088815104, 0);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1281396041);
                break;
            }
            case 101: {
                this.setInteger(1088815104, 0);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1616940361);
                break;
            }
            case 105: {
                this.setBoolean(21393, true);
                break;
            }
            case 115: {
                this.setBoolean(11354, true);
                break;
            }
            case 116: {
                this.setBoolean(11354, true);
                break;
            }
            case 117: {
                this.setBoolean(571146496, true);
                break;
            }
            case 118: {
                this.setBoolean(571146496, true);
                break;
            }
            case 123: {
                PhoneActivity.lockWaitaphore(16263, 10000);
                this.triggerObserver(-738000832);
                this.setBoolean(-877985792, true);
                break;
            }
            case 124: {
                PhoneActivity.lockWaitaphore(16263, 10000);
                this.triggerObserver(-738000832);
                this.setBoolean(-877985792, true);
                break;
            }
            case 127: {
                this.setInteger(-728760320, 1);
                PhoneActivity.lockWaitaphore(986382336, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-728760320));
                this.triggerObserver(419692608, eventGeneric);
                this.setBoolean(-877985792, true);
                break;
            }
            case 128: {
                this.setInteger(-728760320, 2);
                PhoneActivity.lockWaitaphore(986382336, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-728760320));
                this.triggerObserver(419692608, eventGeneric);
                this.setBoolean(-877985792, true);
                break;
            }
            case 133: {
                break;
            }
            case 134: {
                break;
            }
            case 138: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                if (!this.getBoolean(-219152384)) break;
                this.triggerObserver(-956104640);
                break;
            }
            case 144: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 145: {
                this.setInteger(13743, 0);
                break;
            }
            case 147: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 149: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 150: {
                this.setInteger(1487929344, PhoneActivity.evListItemActionIndex());
                PhoneActivity.lockWaitaphore(-1647837184, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1487929344));
                this.triggerObserver(-1392312256, eventGeneric);
                break;
            }
            case 151: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 152: {
                this.setInteger(19575, this.getInteger(1403977728));
                PhoneActivity.lockWaitaphore(-1647837184, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(19575));
                this.triggerObserver(-1476198336, eventGeneric);
                break;
            }
            case 153: {
                this.setBoolean(1759903744, false);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 154: {
                this.setBoolean(1759903744, false);
                break;
            }
            case 155: {
                this.setBoolean(1759903744, false);
                break;
            }
            case 158: {
                this.setBoolean(30202, false);
                break;
            }
            case 161: {
                break;
            }
            case 164: {
                this.setInteger(1088815104, 0);
                this.setInteger(-997851136, 4);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1331727689);
                this.setBoolean(606077184, true);
                break;
            }
            case 166: {
                this.setInteger(1099104256, 0);
                this.setInteger(13743, 0);
                break;
            }
            case 167: {
                this.setInteger(13743, 0);
                break;
            }
            case 169: {
                this.setInteger(-455409664, 0);
                this.setInteger(1099104256, 0);
                this.setBoolean(1759903744, true);
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getString(984547328));
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                break;
            }
            case 173: {
                this.setInteger(13743, 0);
                break;
            }
            case 174: {
                this.setInteger(1645084928, this.getInteger(12930));
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1645084928));
                this.triggerObserver(-670891968, eventGeneric);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 175: {
                this.setString(984547328, this.getLicValue(1194, 3, this.getInteger(12930), ""));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, this.getLicValue(1194, 1, this.getInteger(12930), 0L));
                this.setString(1545076992, this.getLicValue(1194, 3, this.getInteger(12930), ""));
                this.setInteger(29056, this.getLicValue(1194, 7, this.getInteger(12930), 0));
                this.setInteger(-1147076608, this.getLicValue(1194, 9, this.getInteger(12930), 0));
                this.setInteger(1637744640, this.getInteger(12930));
                break;
            }
            case 177: {
                this.setInteger(1645084928, PhoneActivity.evListItemActionIndex());
                this.setBoolean(1759903744, false);
                this.setInteger(-455409664, 0);
                break;
            }
            case 201: {
                this.setBoolean(606077184, true);
                break;
            }
            case 202: {
                this.setBoolean(606077184, true);
                break;
            }
            case 203: {
                this.setBoolean(606077184, true);
                break;
            }
            case 206: {
                this.setInteger(-452263680, this.getInteger(14307));
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-452263680));
                this.triggerObserver(1191510080, eventGeneric);
                break;
            }
            case 208: {
                this.setInteger(1088815104, 0);
                break;
            }
            case 210: {
                this.setInteger(1088815104, 0);
                this.setInteger(-507183104, 11);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1365282121);
                break;
            }
            case 211: {
                this.setInteger(1088815104, 0);
                this.setInteger(-507183104, 20);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1365282121);
                break;
            }
            case 212: {
                this.setInteger(1088815104, 0);
                this.setInteger(-507183104, 30);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1365282121);
                break;
            }
            case 213: {
                this.setInteger(1088815104, 0);
                this.setInteger(-507183104, 18);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1365282121);
                break;
            }
            case 214: {
                this.setInteger(1088815104, 0);
                this.setInteger(-997851136, 4);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1331727689);
                break;
            }
            case 215: {
                this.setInteger(1088815104, 0);
                this.setInteger(-507183104, 50);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1365282121);
                break;
            }
            case 216: {
                this.setInteger(1088815104, 0);
                this.setInteger(-507183104, 51);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1365282121);
                break;
            }
            case 217: {
                this.setInteger(1088815104, 0);
                this.setInteger(-507183104, 40);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1365282121);
                break;
            }
            case 218: {
                this.setInteger(1088815104, 0);
                this.setInteger(-507183104, 41);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1365282121);
                break;
            }
            case 224: {
                this.setInteger(1088815104, 0);
                break;
            }
            case 233: {
                this.setInteger(-1373110016, 1449168201);
                if (this.getInteger(13743) != 1 && this.getInteger(14021) == 0) {
                    this.setInteger(-452263680, 5);
                }
                if (this.getInteger(13743) != 1 && this.getInteger(14021) == 0) {
                    EventGeneric eventGeneric = PhoneActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(-452263680));
                    this.triggerObserver(1191510080, eventGeneric);
                }
                PhoneActivity.changeContext("Phone");
                break;
            }
        }
    }

    private void performStateEntryAction_SubIBluetoothBondingProfileSelection(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2002357577);
                break;
            }
            case 6: {
                this.showView("Bbps", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    private void performStateExitAction_SubIBluetoothBondingProfileSelection(int n) {
        switch (n - this.S_OFFSET) {
            case 6: {
                this.hideView("Bbps");
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubIBluetoothBondingProfileSelection(int n) {
        this.performInternalTransitionAction_SubIBluetoothBondingProfileSelection0(n);
    }

    private void performInternalTransitionAction_SubIBluetoothBondingProfileSelection0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setInteger(-456982528, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 1: {
                this.setInteger(0x21000100, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(0x21000100));
                this.triggerObserver(2130903104, eventGeneric);
                this.setBoolean(972947456, false);
                this.setString(-1428750336, this.getI18nStrings(200)[this.getLicValue(1141, 0, this.getInteger(-456982528), 0)]);
                this.setInteger(28224, this.getLicValue(1141, 0, this.getInteger(-456982528), 0));
                this.setBoolean(25160, this.getLicValue(1141, 1, this.getInteger(-456982528), false));
                this.setBoolean(-454950912, this.getLicValue(1141, 2, this.getInteger(-456982528), false));
                this.setString(-407306240, "");
                if (!(this.getInteger(19495) == 0 || this.getBoolean(26017) && !this.getBoolean(1927938048) || this.getLicValue(1141, 1, this.getInteger(-456982528), false) || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 1 && this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 2 && this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 3 && this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 4)) {
                    this.setString(-407306240, this.getString(15902));
                }
                if (this.getInteger(1253703680) != 0 && (this.getBoolean(26017) || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 1 && this.getInteger(1253703680) == 1) && !this.getLicValue(1141, 1, this.getInteger(-456982528), false) && (this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 1 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 2 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 3 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 4)) {
                    this.setString(-407306240, this.getString(378994688));
                }
                if (!(this.getInteger(-116195072) == 0 || this.getLicValue(1141, 1, this.getInteger(-456982528), false) || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 5 && this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 6)) {
                    this.setString(-407306240, this.getString(1423114240));
                }
                if (this.getInteger(-804781824) != 0 && !this.getLicValue(1141, 1, this.getInteger(-456982528), false) && (this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 7 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 8 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 9 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 10 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 11 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 12 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 13 && this.getInteger(-338493440) == 0 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 14 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 15 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 16)) {
                    this.setString(-407306240, this.getString(10407));
                }
                if (this.getInteger(-338493440) != 0 && !this.getLicValue(1141, 1, this.getInteger(-456982528), false) && this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 13) {
                    this.setString(-407306240, this.getString(227999744));
                }
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2002357577);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIBluetoothBondingProfileSelection(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                return this.getInteger(1795883264) == 1;
            }
            case 2: {
                return this.getInteger(906100992) == 2 && this.getLicValue(1143, 5, 0, false) && this.getLicValue(1143, 2, 0, false) && this.getBoolean(30686) && this.getBoolean(20317);
            }
            case 4: {
                return this.getBoolean(28564);
            }
            case 5: {
                return !this.getBoolean(28564) && this.getInteger(1795883264) == 1;
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIBluetoothBondingProfileSelection(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                this.setInteger(-456982528, 0);
                this.setInteger(0x21000100, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(0x21000100));
                this.triggerObserver(2130903104, eventGeneric);
                break;
            }
            case 2: {
                this.triggerObserver(-2147286976);
                this.setInteger(-456982528, 0);
                this.setString(-1428750336, this.getI18nString(3454));
                this.setInteger(28224, 1);
                this.setBoolean(25160, this.getLicValue(1143, 0, 0, false));
                this.setBoolean(-454950912, this.getLicValue(1143, 1, 0, false));
                break;
            }
            case 4: {
                this.setBoolean(972947456, false);
                if (this.getInteger(-895287296) == 1) {
                    this.setBoolean(-1747910656, this.getLicValue(1142, 3, this.getInteger(0x30000100), false));
                }
                if (this.getInteger(-895287296) == 1) {
                    this.setString(-557318144, this.getLicValue(1142, 1, this.getInteger(0x30000100), ""));
                }
                if (this.getInteger(1795883264) > 1 && this.getInteger(-895287296) == 1) {
                    this.setString(-1428750336, this.getI18nStrings(200)[this.getLicValue(1141, 0, this.getInteger(-456982528), 0)]);
                }
                if (this.getInteger(1795883264) == 1 && this.getInteger(-895287296) == 1) {
                    this.setString(-1428750336, this.getI18nStrings(200)[this.getLicValue(1142, 0, this.getInteger(0x30000100), 0)]);
                }
                this.setString(-407306240, "");
                if (!(this.getInteger(19495) == 0 || this.getBoolean(26017) && !this.getBoolean(1927938048) || this.getLicValue(1141, 1, this.getInteger(-456982528), false) || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 1 && this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 2 && this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 3 && this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 4)) {
                    this.setString(-407306240, this.getString(15902));
                }
                if (this.getInteger(1253703680) != 0 && (this.getBoolean(26017) || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 1 && this.getInteger(1253703680) == 1) && !this.getLicValue(1141, 1, this.getInteger(-456982528), false) && (this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 1 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 2 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 3 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 4)) {
                    this.setString(-407306240, this.getString(378994688));
                }
                if (!(this.getInteger(-116195072) == 0 || this.getLicValue(1141, 1, this.getInteger(-456982528), false) || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 5 && this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 6)) {
                    this.setString(-407306240, this.getString(1423114240));
                }
                if (this.getInteger(-804781824) != 0 && !this.getLicValue(1141, 1, this.getInteger(-456982528), false) && (this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 7 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 8 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 9 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 10 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 11 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 12 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 13 && this.getInteger(-338493440) == 0 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 14 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 15 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 16)) {
                    this.setString(-407306240, this.getString(10407));
                }
                if (this.getInteger(-338493440) == 0 || this.getLicValue(1141, 1, this.getInteger(-456982528), false) || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 13) break;
                this.setString(-407306240, this.getString(227999744));
                break;
            }
            case 5: {
                this.setBoolean(972947456, false);
                this.setInteger(-456982528, 0);
                if (this.getInteger(-895287296) == 1) {
                    this.setBoolean(-1747910656, this.getLicValue(1142, 3, this.getInteger(0x30000100), false));
                }
                if (this.getInteger(-895287296) == 1) {
                    this.setString(-557318144, this.getLicValue(1142, 1, this.getInteger(0x30000100), ""));
                }
                if (this.getInteger(-895287296) == 1) {
                    this.setString(-1428750336, this.getI18nStrings(200)[this.getLicValue(1142, 0, this.getInteger(0x30000100), 0)]);
                }
                this.setString(-407306240, "");
                if (!(this.getInteger(19495) == 0 || this.getBoolean(26017) && !this.getBoolean(1927938048) || this.getLicValue(1141, 1, this.getInteger(-456982528), false) || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 1 && this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 2 && this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 3 && this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 4)) {
                    this.setString(-407306240, this.getString(15902));
                }
                if (this.getInteger(1253703680) != 0 && (this.getBoolean(26017) || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 1 && this.getInteger(1253703680) == 1) && !this.getLicValue(1141, 1, this.getInteger(-456982528), false) && (this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 1 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 2 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 3 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 4)) {
                    this.setString(-407306240, this.getString(378994688));
                }
                if (!(this.getInteger(-116195072) == 0 || this.getLicValue(1141, 1, this.getInteger(-456982528), false) || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 5 && this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 6)) {
                    this.setString(-407306240, this.getString(1423114240));
                }
                if (this.getInteger(-804781824) != 0 && !this.getLicValue(1141, 1, this.getInteger(-456982528), false) && (this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 7 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 8 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 9 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 10 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 11 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 12 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 13 && this.getInteger(-338493440) == 0 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 14 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 15 || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) == 16)) {
                    this.setString(-407306240, this.getString(10407));
                }
                if (this.getInteger(-338493440) == 0 || this.getLicValue(1141, 1, this.getInteger(-456982528), false) || this.getLicValue(1141, 0, this.getInteger(-456982528), 0) != 13) break;
                this.setString(-407306240, this.getString(227999744));
                break;
            }
        }
    }

    private void performStateEntryAction_SubIBluetoothBondingSearch(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setBoolean(969801728, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(969801728));
                this.triggerObserver(1476722752, eventGeneric);
                this.triggerObserver(-1358495680);
                break;
            }
            case 2: {
                this.enterIncludeDdpGroup(45);
                break;
            }
            case 7: {
                this.showView("Bbsrdf", bl, 45);
                break;
            }
            case 8: {
                this.setInteger(31592, 2);
                this.showView("Bbsri", bl, 145);
                break;
            }
            case 9: {
                this.showView("Bbsrndf", bl, 145);
                break;
            }
            case 17: {
                this.enterWaitaphoreForProperty(1858535424, 477, 587, 1382649161, 1365871945);
                break;
            }
            case 21: {
                if (this.getInteger(31592) == 0) {
                    this.enterWaitaphoreForProperty(27689, 477, 587, 1382649161, 1365871945);
                    break;
                }
                if (this.getInteger(31592) != 0) {
                    this.enterWaitaphoreForProperty(27689, 477, 587, 1382649161, 1365871945);
                    break;
                }
                this.enterWaitaphoreForNothing(1382649161);
                break;
            }
            case 22: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 2035912009);
                break;
            }
            case 23: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1755738807);
                break;
            }
            case 24: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1353085623);
                break;
            }
        }
    }

    private void performStateExitAction_SubIBluetoothBondingSearch(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                if (this.getBoolean(27689)) {
                    this.triggerObserver(1862467648);
                }
                this.setBoolean(969801728, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(969801728));
                this.triggerObserver(1476722752, eventGeneric);
                this.triggerObserver(-2113732544);
                break;
            }
            case 2: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 4: {
                if (this.getBoolean(27689)) {
                    this.triggerObserver(1862467648);
                }
                this.setInteger(31592, 0);
                break;
            }
            case 7: {
                this.hideView("Bbsrdf");
                break;
            }
            case 8: {
                this.hideView("Bbsri");
                break;
            }
            case 9: {
                this.hideView("Bbsrndf");
                break;
            }
            case 17: {
                this.leaveWaitaphore();
                break;
            }
            case 21: {
                this.leaveWaitaphore();
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubIBluetoothBondingSearch(int n) {
        switch (n - this.IT_OFFSET) {
            case 1: {
                return this.getLicValue(1142, 2, this.getInteger(0x30000100), 0) == 0;
            }
            case 2: {
                return PhoneActivity.evListItemEventSender().equals("Button_Help");
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubIBluetoothBondingSearch(int n) {
        this.performInternalTransitionAction_SubIBluetoothBondingSearch0(n);
    }

    private void performInternalTransitionAction_SubIBluetoothBondingSearch0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setInteger(0x30000100, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 1: {
                if (this.getBoolean(27689)) {
                    this.triggerObserver(1862467648);
                }
                this.setInteger(25626, PhoneActivity.evListItemActionIndex());
                PhoneActivity.lockWaitaphore(1858535424, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(25626));
                this.triggerObserver(-2130509760, eventGeneric);
                this.setInteger(22419, PhoneActivity.evListItemActionIndex());
                eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(22419));
                this.triggerObserver(2097348672, eventGeneric);
                this.setBoolean(972947456, false);
                this.setBoolean(-1747910656, this.getLicValue(1142, 3, this.getInteger(0x30000100), false));
                this.setString(-557318144, this.getLicValue(1142, 1, this.getInteger(0x30000100), ""));
                this.setString(-1428750336, "");
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2019134793);
                break;
            }
            case 2: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1420194487);
                break;
            }
            case 3: {
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(27884));
                this.triggerObserver(-301727680, eventGeneric);
                this.setBoolean(-609091584, true);
                this.setInteger(31592, 3);
                break;
            }
            case 4: {
                this.setBoolean(-609091584, true);
                this.setInteger(31592, 3);
                break;
            }
            case 5: {
                this.setInteger(31592, 2);
                break;
            }
            case 6: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1420194487);
                break;
            }
            case 7: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1420194487);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubIBluetoothBondingSearch(int n) {
        switch (n - this.TT_OFFSET) {
            case 2: {
                return !this.getBoolean(28564) && (this.getLicValue(1142, 2, this.getInteger(0x30000100), 0) > 1 || this.getLicValue(1142, 2, this.getInteger(0x30000100), 0) < 1);
            }
            case 4: {
                return this.getLicValue(1142, 2, this.getInteger(0x30000100), 0) > 0;
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubIBluetoothBondingSearch(int n) {
        this.performTriggeredTransitionAction_SubIBluetoothBondingSearch0(n);
    }

    private void performTriggeredTransitionAction_SubIBluetoothBondingSearch0(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                this.setInteger(31592, 1);
                break;
            }
            case 2: {
                this.setInteger(-895287296, 1);
                break;
            }
            case 3: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                this.setInteger(31592, 3);
                break;
            }
            case 4: {
                this.setInteger(25626, PhoneActivity.evListItemActionIndex());
                this.setBoolean(972947456, false);
                this.setBoolean(-1747910656, this.getLicValue(1142, 3, this.getInteger(0x30000100), false));
                this.setString(28810, this.getLicValue(1142, 1, this.getInteger(0x30000100), ""));
                this.setString(-557318144, this.getLicValue(1142, 1, this.getInteger(0x30000100), ""));
                this.setString(-1428750336, this.getI18nStrings(200)[this.getLicValue(1142, 0, this.getInteger(0x30000100), 0)]);
                this.setInteger(1795883264, this.getLicValue(1142, 2, this.getInteger(0x30000100), 0));
                this.setInteger(28224, this.getLicValue(1142, 0, this.getInteger(0x30000100), 0));
                this.setBoolean(25160, this.getLicValue(1142, 4, this.getInteger(0x30000100), false));
                this.setBoolean(-454950912, this.getLicValue(1142, 5, this.getInteger(0x30000100), false));
                this.setInteger(-895287296, 1);
                this.setString(-407306240, "");
                if (!(this.getInteger(19495) == 0 || this.getBoolean(26017) && !this.getBoolean(1927938048) || this.getLicValue(1142, 4, this.getInteger(0x30000100), false) || this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) != 1 && this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) != 2 && this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) != 3 && this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) != 4)) {
                    this.setString(-407306240, this.getString(15902));
                }
                if (this.getInteger(1253703680) != 0 && (this.getBoolean(26017) || this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) == 1 && this.getInteger(1253703680) == 1) && !this.getLicValue(1142, 4, this.getInteger(0x30000100), false) && (this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) == 1 || this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) == 2 || this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) == 3 || this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) == 4)) {
                    this.setString(-407306240, this.getString(378994688));
                }
                if (!(this.getInteger(-116195072) == 0 || this.getLicValue(1142, 4, this.getInteger(0x30000100), false) || this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) != 5 && this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) != 6)) {
                    this.setString(-407306240, this.getString(1423114240));
                }
                if (this.getInteger(-804781824) != 0 && !this.getLicValue(1142, 4, this.getInteger(0x30000100), false) && (this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) == 7 || this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) == 8 || this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) == 9 || this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) == 10 || this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) == 11 || this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) == 12 || this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) == 13 && this.getInteger(-338493440) == 0 || this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) == 14 || this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) == 15 || this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) == 16)) {
                    this.setString(-407306240, this.getString(10407));
                }
                if (this.getInteger(-338493440) == 0 || this.getLicValue(1142, 4, this.getInteger(0x30000100), false) || this.getLicValue(1142, 0, this.getInteger(0x30000100), 0) != 13) break;
                this.setString(-407306240, this.getString(227999744));
                break;
            }
            case 6: {
                this.setBoolean(-609091584, false);
                this.setInteger(31592, 4);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIBluetoothBondingSearch(int n) {
        switch (n - this.UT_OFFSET) {
            case 3: {
                return this.getInteger(31592) == 1;
            }
            case 4: {
                return this.getInteger(31592) == 2 && this.getListItemControl(1142, true).getItemCount() == 0;
            }
            case 5: {
                return (this.getInteger(31592) == 2 || this.getInteger(31592) == 3) && this.getListItemControl(1142, true).getItemCount() > 0 || this.getInteger(31592) == 4;
            }
            case 6: {
                return this.getInteger(31592) == 3 && this.getListItemControl(1142, true).getItemCount() == 0;
            }
            case 10: {
                return this.getInteger(1795883264) == 1;
            }
            case 16: {
                return this.getInteger(-1113784320) == 1;
            }
            case 18: {
                return this.getBoolean(25160);
            }
            case 20: {
                return this.getInteger(1023279104) == 2;
            }
            case 21: {
                return this.getInteger(1023279104) == 1;
            }
            case 23: {
                return this.getInteger(-1113784320) == 4;
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIBluetoothBondingSearch(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                this.setInteger(31592, 0);
                break;
            }
            case 3: {
                this.setBoolean(-609091584, true);
                break;
            }
            case 8: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 10: {
                this.setInteger(31592, 3);
                break;
            }
            case 11: {
                this.setInteger(-895287296, 1);
                break;
            }
            case 12: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 13: {
                PhoneActivity.lockWaitaphore(1858535424, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(25626));
                this.triggerObserver(-2130509760, eventGeneric);
                break;
            }
            case 14: {
                this.setInteger(31592, 1);
                break;
            }
            case 15: {
                if (this.getInteger(31592) == 0) {
                    PhoneActivity.lockWaitaphore(27689, 10000);
                    EventGeneric eventGeneric = PhoneActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(906100992));
                    this.triggerObserver(285868096, eventGeneric);
                }
                if (this.getInteger(31592) == 0) break;
                PhoneActivity.lockWaitaphore(27689, 10000);
                this.triggerObserver(2114125888);
                break;
            }
            case 17: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                this.setInteger(31592, 3);
                break;
            }
            case 19: {
                this.setBoolean(972947456, false);
                break;
            }
            case 23: {
                this.setBoolean(972947456, false);
                this.setBoolean(-1747910656, this.getLicValue(1142, 3, this.getInteger(0x30000100), false));
                this.setString(28810, this.getLicValue(1142, 1, this.getInteger(0x30000100), ""));
                this.setString(-557318144, this.getLicValue(1142, 1, this.getInteger(0x30000100), ""));
                this.setString(-1428750336, this.getI18nStrings(200)[this.getLicValue(1142, 0, this.getInteger(0x30000100), 0)]);
                this.setInteger(1795883264, this.getLicValue(1142, 2, this.getInteger(0x30000100), 0));
                this.setInteger(28224, this.getLicValue(1142, 0, this.getInteger(0x30000100), 0));
                this.setBoolean(25160, this.getLicValue(1142, 4, this.getInteger(0x30000100), false));
                this.setBoolean(-454950912, this.getLicValue(1142, 5, this.getInteger(0x30000100), false));
                this.setInteger(-895287296, 1);
                break;
            }
            case 24: {
                this.setInteger(31592, 3);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIBluetoothConnectWaitPhone(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 2069466441);
                break;
            }
            case 7: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 2035912009);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIBluetoothConnectWaitPhone(int n) {
        switch (n - this.UT_OFFSET) {
            case 3: {
                return this.getInteger(-1113784320) == 1;
            }
            case 5: {
                return this.getBoolean(-522977280) && this.getBoolean(25376);
            }
            case 7: {
                return !this.getBoolean(-522977280) || !this.getBoolean(25376);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIBluetoothConnectWaitPhone(int n) {
        switch (n - this.UT_OFFSET) {
            case 3: {
                this.setInteger(13743, 0);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1465945417);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIBluetoothSetup(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterIncludeDdpGroup(47);
                break;
            }
            case 6: {
                this.enterWaitaphoreForProperty(516620288, 477, 587, 1449758025, 1432980809);
                break;
            }
            case 7: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(1292828928, false);
                this.showView("Bsne", bl, 47);
                break;
            }
            case 8: {
                this.triggerObserver(-1358495680);
                break;
            }
            case 10: {
                this.enterIncludeDdpGroup(47);
                break;
            }
            case 12: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 2035912009);
                break;
            }
            case 15: {
                this.enterIncludeDdpGroup(47);
                break;
            }
            case 18: {
                this.showView("Bspm", bl, 47);
                break;
            }
            case 25: {
                this.enterWaitaphoreForProperty(1858535424, 477, 587, 1449758025, 1432980809);
                break;
            }
            case 26: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1772516023);
                break;
            }
            case 27: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1755738807);
                break;
            }
            case 28: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1353085623);
                break;
            }
            case 36: {
                this.showView("Bs", bl, 47);
                break;
            }
            case 37: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1755738807);
                break;
            }
            case 38: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1353085623);
                break;
            }
        }
    }

    private void performStateExitAction_SubIBluetoothSetup(int n) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 6: {
                this.leaveWaitaphore();
                break;
            }
            case 7: {
                this.hideView("Bsne");
                this.triggerObserver(-452788160);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(1292828928, false);
                this.setBoolean(-877985792, false);
                break;
            }
            case 8: {
                this.triggerObserver(-2113732544);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1889497783);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1872720567);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1855943351);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2023715511);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2040492727);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2057269943);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -2074047159);
                break;
            }
            case 10: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 15: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 18: {
                this.hideView("Bspm");
                break;
            }
            case 25: {
                this.leaveWaitaphore();
                break;
            }
            case 36: {
                this.hideView("Bs");
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubIBluetoothSetup(int n) {
        switch (n - this.IT_OFFSET) {
            case 2: {
                return !this.getBoolean(-877985792);
            }
            case 16: {
                return PhoneActivity.evListItemEventSender().equals("Button_Name") && this.getLicValue(1204, 2, this.getInteger(13513), 0) == 0;
            }
            case 17: {
                return PhoneActivity.evListItemEventSender().equals("Button_Name") && this.getLicValue(1204, 2, this.getInteger(13513), 0) == 1 && (this.getLicValue(1204, 3, this.getInteger(13513), false) || this.getLicValue(1204, 7, this.getInteger(13513), false) || this.getLicValue(1204, 5, this.getInteger(13513), false));
            }
            case 18: {
                return PhoneActivity.evListItemEventSender().equals("Button_Name") && this.getLicValue(1204, 2, this.getInteger(13513), 0) == 1 && !this.getLicValue(1204, 3, this.getInteger(13513), false) && !this.getLicValue(1204, 7, this.getInteger(13513), false) && !this.getLicValue(1204, 5, this.getInteger(13513), false);
            }
            case 19: {
                return PhoneActivity.evListItemEventSender().equals("Button_Delete");
            }
            case 20: {
                return this.getBoolean(25376) && PhoneActivity.evListItemActionIndex() == 1;
            }
            case 21: {
                return this.getBoolean(25376) && PhoneActivity.evListItemActionIndex() == 0;
            }
            case 22: {
                return PhoneActivity.evListItemEventSender().equals("Button_BluetoothEnabled") && this.getInteger(20585) == 1;
            }
            case 23: {
                return PhoneActivity.evListItemEventSender().equals("Button_BluetoothEnabled") && this.getInteger(20585) == 0;
            }
            case 24: {
                return PhoneActivity.evListItemEventSender().equals("Button_AudioVideoProfiles") && this.getBoolean(-522977280) && !this.getBoolean(1191313664);
            }
            case 25: {
                return PhoneActivity.evListItemEventSender().equals("Button_AudioVideoProfiles") && this.getBoolean(-522977280) && this.getBoolean(1191313664);
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubIBluetoothSetup(int n) {
        this.performInternalTransitionAction_SubIBluetoothSetup00(n);
    }

    private void performInternalTransitionAction_SubIBluetoothSetup00(int n) {
        switch (n - this.IT_OFFSET) {
            case 2: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 3: {
                this.triggerObserver(-436010944);
                break;
            }
            case 4: {
                this.setString(17486, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(23118, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(-1984102400, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(-1224081152, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(17486));
                eventGeneric.setInt(1, this.getInteger(-1984102400));
                eventGeneric.setInt(2, this.getInteger(-1224081152));
                eventGeneric.setInt(3, this.getInteger(23118));
                this.triggerObserver(-681831104, eventGeneric);
                break;
            }
            case 5: {
                this.setInteger(266534912, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(266534912));
                this.triggerObserver(-368902080, eventGeneric);
                break;
            }
            case 6: {
                this.setBoolean(1292828928, true);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1217884855);
                break;
            }
            case 7: {
                this.setBoolean(1292828928, false);
                break;
            }
            case 8: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1822847671);
                break;
            }
            case 9: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                break;
            }
            case 10: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1806070455);
                break;
            }
            case 11: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                break;
            }
            case 12: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1789293239);
                break;
            }
            case 13: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                break;
            }
            case 14: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1386640055);
                break;
            }
            case 15: {
                this.setInteger(13513, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 16: {
                this.setInteger(-133496576, PhoneActivity.evListItemActionIndex());
                PhoneActivity.lockWaitaphore(1858535424, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-133496576));
                this.triggerObserver(-519897024, eventGeneric);
                this.setBoolean(972947456, false);
                this.setBoolean(-1747910656, true);
                this.setString(-557318144, this.getLicValue(1204, 0, this.getInteger(13513), ""));
                this.setString(-1428750336, "");
                this.triggerObserver(2080571456);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2019134793);
                break;
            }
            case 17: {
                this.setInteger(-133496576, PhoneActivity.evListItemActionIndex());
                PhoneActivity.lockWaitaphore(1858535424, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-133496576));
                this.triggerObserver(-519897024, eventGeneric);
                this.setInteger(0x21000100, 0);
                eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(0x21000100));
                this.triggerObserver(2130903104, eventGeneric);
                this.setString(706937088, this.getLicValue(1204, 0, this.getInteger(13513), ""));
                this.setString(23800, FormatterService.format(this.getI18nString(4145), this.getLicValue(1204, 0, this.getInteger(13513), "")));
                this.setString(-1366294528, this.getI18nStrings(200)[this.getLicValue(1204, 1, this.getInteger(13513), -1)]);
                this.setInteger(28224, this.getLicValue(1204, 1, this.getInteger(13513), -1));
                this.setBoolean(-1747910656, true);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1369862839);
                break;
            }
            case 18: {
                this.setInteger(-133496576, PhoneActivity.evListItemActionIndex());
                PhoneActivity.lockWaitaphore(1858535424, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-133496576));
                this.triggerObserver(-519897024, eventGeneric);
                this.setInteger(0x21000100, 0);
                eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(0x21000100));
                this.triggerObserver(2130903104, eventGeneric);
                this.setBoolean(-1747910656, true);
                this.setBoolean(972947456, false);
                this.setString(-557318144, this.getLicValue(1204, 0, this.getInteger(13513), ""));
                this.setString(-1428750336, this.getI18nStrings(200)[this.getLicValue(1204, 1, this.getInteger(13513), -1)]);
                this.setInteger(28224, this.getLicValue(1204, 1, this.getInteger(13513), -1));
                this.setInteger(1795883264, this.getLicValue(1204, 2, this.getInteger(13513), 0));
                this.setBoolean(25160, false);
                this.setString(-407306240, "");
                if (!(this.getInteger(19495) == 0 || this.getBoolean(26017) && !this.getBoolean(1927938048) || this.getLicValue(1204, 7, this.getInteger(13513), false) || this.getLicValue(1204, 1, this.getInteger(13513), -1) != 1 && this.getLicValue(1204, 1, this.getInteger(13513), -1) != 2 && this.getLicValue(1204, 1, this.getInteger(13513), -1) != 3 && this.getLicValue(1204, 1, this.getInteger(13513), -1) != 4)) {
                    this.setString(-407306240, this.getString(15902));
                }
                if (this.getInteger(1253703680) != 0 && (this.getBoolean(26017) || this.getLicValue(1204, 1, this.getInteger(13513), -1) == 1 && this.getInteger(1253703680) == 1) && !this.getLicValue(1204, 7, this.getInteger(13513), false) && (this.getLicValue(1204, 1, this.getInteger(13513), -1) == 1 || this.getLicValue(1204, 1, this.getInteger(13513), -1) == 2 || this.getLicValue(1204, 1, this.getInteger(13513), -1) == 3 || this.getLicValue(1204, 1, this.getInteger(13513), -1) == 4)) {
                    this.setString(-407306240, this.getString(378994688));
                }
                if (!(this.getInteger(-116195072) == 0 || this.getLicValue(1204, 3, this.getInteger(13513), false) || this.getLicValue(1204, 1, this.getInteger(13513), -1) != 5 && this.getLicValue(1204, 1, this.getInteger(13513), -1) != 6)) {
                    this.setString(-407306240, this.getString(1423114240));
                }
                if (this.getInteger(-804781824) != 0 && !this.getLicValue(1204, 5, this.getInteger(13513), false) && (this.getLicValue(1204, 1, this.getInteger(13513), -1) == 7 || this.getLicValue(1204, 1, this.getInteger(13513), -1) == 8 || this.getLicValue(1204, 1, this.getInteger(13513), -1) == 9 || this.getLicValue(1204, 1, this.getInteger(13513), -1) == 10 || this.getLicValue(1204, 1, this.getInteger(13513), -1) == 11 || this.getLicValue(1204, 1, this.getInteger(13513), -1) == 12 || this.getLicValue(1204, 1, this.getInteger(13513), -1) == 13 && this.getInteger(-338493440) == 0 || this.getLicValue(1204, 1, this.getInteger(13513), -1) == 14 || this.getLicValue(1204, 1, this.getInteger(13513), -1) == 15 || this.getLicValue(1204, 1, this.getInteger(13513), -1) == 16)) {
                    this.setString(-407306240, this.getString(10407));
                }
                if (this.getInteger(-338493440) != 0 && !this.getLicValue(1204, 5, this.getInteger(13513), false) && this.getLicValue(1204, 1, this.getInteger(13513), -1) == 13) {
                    this.setString(-407306240, this.getString(227999744));
                }
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 2035912009);
                break;
            }
            case 19: {
                this.setInteger(486014976, PhoneActivity.evListItemActionIndex());
                this.setInteger(-133496576, PhoneActivity.evListItemActionIndex());
                PhoneActivity.lockWaitaphore(1858535424, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-133496576));
                this.triggerObserver(-519897024, eventGeneric);
                this.setString(2125791232, this.getLicValue(1204, 0, this.getInteger(13513), ""));
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1403417271);
                break;
            }
            case 20: {
                this.setInteger(-1600978944, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1600978944));
                this.triggerObserver(-967043776, eventGeneric);
                break;
            }
            case 21: {
                this.setInteger(-1600978944, 1);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1600978944));
                this.triggerObserver(-967043776, eventGeneric);
                break;
            }
            case 22: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 2069466441);
                break;
            }
            case 23: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2086243657);
                break;
            }
            case 24: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1436971703);
                break;
            }
            case 25: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1453748919);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubIBluetoothSetup(int n) {
        switch (n - this.TT_OFFSET) {
            case 7: {
                return PhoneActivity.evListItemEventSender().equals("Button_Name") && this.getLicValue(1204, 2, this.getInteger(13513), 0) > 1;
            }
            case 9: {
                return this.getLicValue(1204, 2, this.getInteger(13513), 0) > 0;
            }
            case 17: {
                return this.getBoolean(25376);
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubIBluetoothSetup(int n) {
        this.performTriggeredTransitionAction_SubIBluetoothSetup0(n);
    }

    private void performTriggeredTransitionAction_SubIBluetoothSetup0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.triggerObserver(-352124864);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 1: {
                this.triggerObserver(-419233728);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 5: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 7: {
                this.setInteger(-133496576, PhoneActivity.evListItemActionIndex());
                this.setString(28810, this.getLicValue(1204, 0, this.getInteger(13513), ""));
                this.setString(-557318144, this.getLicValue(1204, 0, this.getInteger(13513), ""));
                this.setString(706937088, this.getLicValue(1204, 0, this.getInteger(13513), ""));
                this.setBoolean(-1747910656, true);
                this.setInteger(1795883264, this.getLicValue(1204, 2, this.getInteger(13513), 0));
                this.setInteger(-895287296, 2);
                break;
            }
            case 9: {
                if (this.getLicValue(1204, 2, this.getInteger(13513), 0) == 1) {
                    this.setInteger(0x21000100, 0);
                }
                if (this.getLicValue(1204, 2, this.getInteger(13513), 0) == 1) {
                    EventGeneric eventGeneric = PhoneActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(0x21000100));
                    this.triggerObserver(2130903104, eventGeneric);
                }
                this.setString(28810, this.getLicValue(1204, 0, this.getInteger(13513), ""));
                this.setString(-557318144, this.getLicValue(1204, 0, this.getInteger(13513), ""));
                this.setString(706937088, this.getLicValue(1204, 0, this.getInteger(13513), ""));
                this.setBoolean(-1747910656, true);
                this.setInteger(1795883264, this.getLicValue(1204, 2, this.getInteger(13513), 0));
                this.setInteger(-895287296, 2);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 10: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIBluetoothSetup(int n) {
        switch (n - this.UT_OFFSET) {
            case 9: {
                return this.getBoolean(118751488);
            }
            case 15: {
                return this.getInteger(1023279104) == 2;
            }
            case 16: {
                return this.getInteger(1023279104) == 1;
            }
            case 18: {
                return this.getLicValue(1204, 2, this.getInteger(13513), 0) < 2;
            }
            case 20: {
                return this.getBoolean(25160) && this.getInteger(28224) == 13 && this.getInteger(938344448) != 2 && this.getBoolean(30686);
            }
            case 21: {
                return this.getBoolean(25160) && (this.getInteger(28224) != 13 || this.getInteger(938344448) == 2 && !this.getBoolean(151519488));
            }
            case 25: {
                return this.getBoolean(78708736);
            }
            case 27: {
                return PhoneActivity.evListItemEventSender().equals("Button_PairedDevices") && this.getBoolean(-522977280);
            }
            case 28: {
                return PhoneActivity.evListItemEventSender().equals("Button_SearchDevices") && this.getBoolean(-522977280);
            }
            case 29: {
                return PhoneActivity.evListItemEventSender().equals("Button_HUDeviceName") && this.getBoolean(-522977280);
            }
            case 31: {
                return this.getInteger(1023279104) == 2;
            }
            case 32: {
                return this.getInteger(1023279104) == 1;
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIBluetoothSetup(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 2: {
                this.setString(552665088, this.getString(1629683968));
                PhoneActivity.lockWaitaphore(516620288, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(552665088));
                this.triggerObserver(-402456512, eventGeneric);
                this.setBoolean(-877985792, true);
                break;
            }
            case 3: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 7: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 9: {
                this.setBoolean(118751488, false);
                break;
            }
            case 12: {
                this.triggerObserver(1996685376);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 559582537);
                break;
            }
            case 13: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 14: {
                PhoneActivity.lockWaitaphore(1858535424, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-133496576));
                this.triggerObserver(-519897024, eventGeneric);
                break;
            }
            case 17: {
                this.setInteger(-400752384, this.getInteger(906100992));
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-400752384));
                this.triggerObserver(-1005977536, eventGeneric);
                break;
            }
            case 19: {
                this.setInteger(-895287296, 2);
                break;
            }
            case 21: {
                this.setInteger(0x21000100, this.getInteger(-456982528));
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(0x21000100));
                this.triggerObserver(2130903104, eventGeneric);
                this.setString(706937088, this.getLicValue(1204, 0, this.getInteger(13513), ""));
                this.setString(-1366294528, this.getI18nStrings(200)[this.getLicValue(1141, 0, this.getInteger(-456982528), 0)]);
                this.setString(23800, FormatterService.format(this.getI18nString(4146), this.getI18nStrings(200)[this.getLicValue(1141, 0, this.getInteger(-456982528), 0)]));
                break;
            }
            case 22: {
                this.setInteger(0x21000100, this.getInteger(-456982528));
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(0x21000100));
                this.triggerObserver(2130903104, eventGeneric);
                this.setBoolean(972947456, false);
                this.setBoolean(-1747910656, true);
                this.setString(-557318144, this.getLicValue(1204, 0, this.getInteger(13513), ""));
                this.setString(-1428750336, this.getI18nStrings(200)[this.getLicValue(1141, 0, this.getInteger(-456982528), 0)]);
                this.setInteger(28224, this.getLicValue(1141, 0, this.getInteger(-456982528), 0));
                this.setBoolean(25160, this.getLicValue(1141, 1, this.getInteger(-456982528), false));
                this.setBoolean(-454950912, this.getLicValue(1141, 2, this.getInteger(-456982528), false));
                break;
            }
            case 25: {
                this.setBoolean(78708736, false);
                break;
            }
            case 27: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 28: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 29: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
        }
    }

    private void performStateEntryAction_SubICustomerUpdateActiveBridge(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 7: {
                this.showView("Scdac", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    private void performStateExitAction_SubICustomerUpdateActiveBridge(int n) {
        switch (n - this.S_OFFSET) {
            case 7: {
                this.hideView("Scdac");
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubICustomerUpdateActiveBridge(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                return (this.getInteger(336199936) == 10 || this.getInteger(336199936) == 13) && (this.getInteger(20027) == 1 || this.getInteger(20027) == -1) || this.getInteger(336199936) == 3 && (this.getInteger(20027) == 2 || this.getInteger(20027) == -1) || this.getInteger(336199936) == 2 && (this.getInteger(20027) == 3 || this.getInteger(20027) == -1) || this.getInteger(336199936) == 0 && (this.getInteger(20027) == 4 || this.getInteger(20027) == -1) || this.getInteger(336199936) == 8 && (this.getInteger(20027) == 5 || this.getInteger(20027) == -1) || this.getInteger(336199936) == 1 && (this.getInteger(20027) == 6 || this.getInteger(20027) == -1) || this.getInteger(336199936) == 4 && (this.getInteger(20027) == 7 || this.getInteger(20027) == -1);
            }
        }
        return true;
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

    private void performStateEntryAction_SubIPhoneContactsJustSelectNumber(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setBoolean(606077184, true);
                if (this.getBoolean(-219152384)) {
                    this.setBoolean(632356864, true);
                }
                if (!this.getBoolean(-219152384)) break;
                this.triggerObserver(-956104640);
                break;
            }
            case 2: {
                this.enterIncludeDdpGroup(41);
                break;
            }
            case 9: {
                this.showView("Pcjsn_D13A", bl, 41);
                break;
            }
            case 13: {
                this.enterWaitaphoreForProperty(833093632, 477, 587, 1919520073, 1902742857);
                break;
            }
        }
    }

    private void performStateExitAction_SubIPhoneContactsJustSelectNumber(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setBoolean(632356864, true);
                break;
            }
            case 2: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 9: {
                this.hideView("Pcjsn_D13A");
                break;
            }
            case 13: {
                this.leaveWaitaphore();
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubIPhoneContactsJustSelectNumber(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                return this.getInteger(-355139584) == 9;
            }
            case 1: {
                return this.getBoolean(-219152384);
            }
            case 3: {
                return this.getInteger(-2082799616) == -1;
            }
            case 4: {
                return (this.getInteger(-2082799616) > 0 || this.getInteger(-2082799616) == 0) && this.getInteger(-2082799616) != PhoneActivity.evListItemActionIndex();
            }
            case 5: {
                return (this.getInteger(-2082799616) > 0 || this.getInteger(-2082799616) == 0) && this.getInteger(-2082799616) == PhoneActivity.evListItemActionIndex();
            }
            case 6: {
                return this.getInteger(-355139584) == 8;
            }
            case 7: {
                return !(this.getInteger(-355139584) != 2 && this.getInteger(-355139584) != 7 || this.getInteger(16413) != 0 && this.getInteger(16413) <= 0);
            }
            case 8: {
                return !(this.getInteger(-355139584) != 2 && this.getInteger(-355139584) != 7 || this.getInteger(16413) != 0 && this.getInteger(16413) <= 0);
            }
            case 9: {
                return this.getLicValue(1190, 8, this.getInteger(-1717633024), false) && this.getInteger(-355139584) == 2 && (this.getInteger(-2082799616) > this.getInteger(-1717633024) || this.getInteger(-2082799616) < this.getInteger(-1717633024));
            }
            case 10: {
                return this.getLicValue(1190, 8, this.getInteger(-1717633024), false) && this.getInteger(-355139584) == 2 && this.getInteger(-2082799616) == this.getInteger(-1717633024);
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubIPhoneContactsJustSelectNumber(int n) {
        this.performInternalTransitionAction_SubIPhoneContactsJustSelectNumber00(n);
    }

    private void performInternalTransitionAction_SubIPhoneContactsJustSelectNumber00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setInteger(-355139584, 2);
                this.setLong(19840, this.getLicValue(1190, 2, this.getInteger(-1717633024), 0L));
                PhoneActivity.lockWaitaphore(-1647837184, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(19840));
                this.triggerObserver(-1006436288, eventGeneric);
                break;
            }
            case 1: {
                this.triggerObserver(-956104640);
                this.setInteger(-2082799616, -1);
                break;
            }
            case 2: {
                this.setInteger(-1717633024, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 3: {
                this.setInteger(-355139584, 2);
                this.setLong(19840, PhoneActivity.evListItemObjectId());
                PhoneActivity.lockWaitaphore(-1647837184, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(19840));
                this.triggerObserver(-1006436288, eventGeneric);
                break;
            }
            case 4: {
                this.setInteger(-2082799616, -1);
                this.setInteger(-355139584, 8);
                this.setLong(19840, PhoneActivity.evListItemObjectId());
                break;
            }
            case 5: {
                this.setInteger(-2082799616, -1);
                this.setInteger(-355139584, 0);
                break;
            }
            case 6: {
                this.setInteger(-355139584, 2);
                PhoneActivity.lockWaitaphore(-1647837184, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(19840));
                this.triggerObserver(-1006436288, eventGeneric);
                break;
            }
            case 7: {
                this.setInteger(-1717633024, this.getInteger(16413));
                break;
            }
            case 8: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -731542199);
                break;
            }
            case 9: {
                this.setInteger(-2082799616, this.getInteger(-1717633024));
                break;
            }
            case 10: {
                this.setInteger(-2082799616, -1);
                break;
            }
            case 11: {
                this.setInteger(1828978944, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 12: {
                this.triggerObserver(-1023213504);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubIPhoneContactsJustSelectNumber(int n) {
        switch (n - this.TT_OFFSET) {
            case 2: {
                return !this.getLicValue(1190, 8, this.getInteger(-1717633024), false);
            }
            case 4: {
                return !this.getBoolean(-219152384);
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubIPhoneContactsJustSelectNumber(int n) {
        this.performTriggeredTransitionAction_SubIPhoneContactsJustSelectNumber0(n);
    }

    private void performTriggeredTransitionAction_SubIPhoneContactsJustSelectNumber0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.triggerObserver(-905772992);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 1: {
                if (this.getSpellerData(1267400704).getEnteredText().length() > 0) {
                    this.triggerObserver(-838664128);
                }
                if (this.getSpellerData(1267400704).getEnteredText().length() == 0) {
                    this.triggerObserver(-956104640);
                }
                if (this.getSpellerData(1267400704).getEnteredText().length() <= 0) break;
                this.setBoolean(632356864, true);
                break;
            }
            case 2: {
                this.setLong(31539, this.getLicValue(1190, 2, this.getInteger(-1717633024), 0L));
                this.setString(21608, this.getLicValue(1190, 4, this.getInteger(-1717633024), ""));
                this.setInteger(12497, this.getLicValue(1190, 9, this.getInteger(-1717633024), 0));
                this.setInteger(29266, this.getLicValue(1190, 10, this.getInteger(-1717633024), 0));
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(31539));
                eventGeneric.setString(1, this.getString(21608));
                eventGeneric.setInt(2, this.getInteger(12497));
                eventGeneric.setInt(3, this.getInteger(29266));
                this.triggerObserver(-413395648, eventGeneric);
                break;
            }
            case 3: {
                this.setLong(31539, this.getLicValue(1190, 2, this.getInteger(-1717633024), 0L));
                this.setString(21608, this.getLicValue(1189, 1, this.getInteger(1828978944), ""));
                this.setInteger(12497, this.getLicValue(1189, 2, this.getInteger(1828978944), 0));
                this.setInteger(29266, this.getLicValue(1189, 5, this.getInteger(1828978944), 0));
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(31539));
                eventGeneric.setString(1, this.getString(21608));
                eventGeneric.setInt(2, this.getInteger(12497));
                eventGeneric.setInt(3, this.getInteger(29266));
                this.triggerObserver(-413395648, eventGeneric);
                break;
            }
            case 4: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIPhoneContactsJustSelectNumber(int n) {
        switch (n - this.UT_OFFSET) {
            case 4: {
                return this.getBoolean(632356864);
            }
            case 8: {
                return this.getSpellerData(1267400704).getMatchCount() > 1;
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIPhoneContactsJustSelectNumber(int n) {
        switch (n - this.UT_OFFSET) {
            case 4: {
                this.setBoolean(632356864, false);
                this.setInteger(-2082799616, -1);
                break;
            }
            case 7: {
                PhoneActivity.lockWaitaphore(833093632, 1);
                this.triggerObserver(-972881856);
                break;
            }
            case 8: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 9: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIPhoneContactsSearch(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.setBoolean(1292828928, false);
                break;
            }
            case 8: {
                if (this.getInteger(-2082799616) != -1) {
                    this.setInteger(-2082799616, -1);
                }
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Pcse", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 9: {
                this.enterWaitaphoreForProperty(1267400704, 477, 587, 1953074505, 1936297289);
                break;
            }
        }
    }

    private void performStateExitAction_SubIPhoneContactsSearch(int n) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.triggerObserver(-939327424);
                this.setBoolean(1292828928, false);
                break;
            }
            case 8: {
                this.hideView("Pcse");
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                break;
            }
            case 9: {
                this.leaveWaitaphore();
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubIPhoneContactsSearch(int n) {
        this.performInternalTransitionAction_SubIPhoneContactsSearch0(n);
    }

    private void performInternalTransitionAction_SubIPhoneContactsSearch0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.triggerObserver(-922550208);
                break;
            }
            case 1: {
                this.setString(13436, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(-175702016, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(1793785856, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(-1475411712, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(13436));
                eventGeneric.setInt(1, this.getInteger(1793785856));
                eventGeneric.setInt(2, this.getInteger(-1475411712));
                eventGeneric.setInt(3, this.getInteger(-175702016));
                this.triggerObserver(-732162752, eventGeneric);
                break;
            }
            case 2: {
                this.setInteger(20189, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(20189));
                this.triggerObserver(-855441344, eventGeneric);
                break;
            }
            case 3: {
                this.setBoolean(1292828928, true);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1217884855);
                break;
            }
            case 4: {
                this.setBoolean(1292828928, false);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubIPhoneContactsSearch(int n) {
        switch (n - this.TT_OFFSET) {
            case 2: {
                return this.getSpellerData(1267400704).getEnteredText().length() > 0 && this.getSpellerData(1267400704).getMatchCount() > 0 && (this.getSpellerData(1267400704).getMatchCount() == SkinDataPool.getInteger(170) || this.getSpellerData(1267400704).getMatchCount() < SkinDataPool.getInteger(170)) && this.getInteger(21342) != 8 && !this.getBoolean(1151008768) && !this.getLicValue(2353, 0, this.getInteger(-846462976), "").equals(DataConstants.LANG_SYSTEM_SETUP_MAIN_LANGUAGE_LIST_ISO[27]);
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubIPhoneContactsSearch(int n) {
        this.performTriggeredTransitionAction_SubIPhoneContactsSearch0(n);
    }

    private void performTriggeredTransitionAction_SubIPhoneContactsSearch0(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                if (this.getSpellerData(1267400704).getEnteredText().length() <= 0) break;
                this.triggerObserver(-838664128);
                break;
            }
            case 2: {
                this.setInteger(1997799680, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1997799680));
                this.triggerObserver(1292501056, eventGeneric);
                if (this.getSpellerData(1267400704).getEnteredText().length() <= 0) break;
                this.triggerObserver(-838664128);
                break;
            }
        }
    }

    private void performUntriggeredTransitionAction_SubIPhoneContactsSearch(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                if (this.getInteger(19164) == -1) {
                    this.setInteger(28783, this.evalInt(3));
                }
                this.setString(29244, "");
                this.setInteger(-1644101376, 0);
                if (this.getInteger(28783) == SkinDataPool.getInteger(7) || this.getInteger(28783) == 4) {
                    this.setInteger(-1644101376, 1);
                }
                PhoneActivity.lockWaitaphore(1267400704, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(29244));
                eventGeneric.setInt(1, this.getInteger(-1644101376));
                this.triggerObserver(-334888896, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIPhoneContactsSearchJustSelectNumber(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.setBoolean(1292828928, false);
                break;
            }
            case 8: {
                if (this.getInteger(-2082799616) != -1) {
                    this.setInteger(-2082799616, -1);
                }
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Pcsjsne", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 9: {
                this.enterWaitaphoreForProperty(1267400704, 477, 587, 1986628937, 1969851721);
                break;
            }
        }
    }

    private void performStateExitAction_SubIPhoneContactsSearchJustSelectNumber(int n) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.triggerObserver(-939327424);
                this.setBoolean(1292828928, false);
                break;
            }
            case 8: {
                this.hideView("Pcsjsne");
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                break;
            }
            case 9: {
                this.leaveWaitaphore();
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubIPhoneContactsSearchJustSelectNumber(int n) {
        this.performInternalTransitionAction_SubIPhoneContactsSearchJustSelectNumber0(n);
    }

    private void performInternalTransitionAction_SubIPhoneContactsSearchJustSelectNumber0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.triggerObserver(-922550208);
                break;
            }
            case 1: {
                this.setString(13436, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(-175702016, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(1793785856, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(-1475411712, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(13436));
                eventGeneric.setInt(1, this.getInteger(1793785856));
                eventGeneric.setInt(2, this.getInteger(-1475411712));
                eventGeneric.setInt(3, this.getInteger(-175702016));
                this.triggerObserver(-732162752, eventGeneric);
                break;
            }
            case 2: {
                this.setInteger(20189, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(20189));
                this.triggerObserver(-855441344, eventGeneric);
                break;
            }
            case 3: {
                this.setBoolean(1292828928, true);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1217884855);
                break;
            }
            case 4: {
                this.setBoolean(1292828928, false);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubIPhoneContactsSearchJustSelectNumber(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                return this.getSpellerData(1267400704).getEnteredText().length() > 0 && this.getSpellerData(1267400704).getMatchCount() > 0 && (this.getSpellerData(1267400704).getMatchCount() == SkinDataPool.getInteger(170) || this.getSpellerData(1267400704).getMatchCount() < SkinDataPool.getInteger(170)) && this.getInteger(21342) != 8 && !this.getBoolean(1151008768) && !this.getLicValue(2353, 0, this.getInteger(-846462976), "").equals(DataConstants.LANG_SYSTEM_SETUP_MAIN_LANGUAGE_LIST_ISO[27]);
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubIPhoneContactsSearchJustSelectNumber(int n) {
        this.performTriggeredTransitionAction_SubIPhoneContactsSearchJustSelectNumber0(n);
    }

    private void performTriggeredTransitionAction_SubIPhoneContactsSearchJustSelectNumber0(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                this.setInteger(1997799680, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1997799680));
                this.triggerObserver(1292501056, eventGeneric);
                if (this.getSpellerData(1267400704).getEnteredText().length() <= 0) break;
                this.triggerObserver(-838664128);
                break;
            }
            case 2: {
                if (this.getSpellerData(1267400704).getEnteredText().length() <= 0) break;
                this.triggerObserver(-838664128);
                break;
            }
        }
    }

    private void performUntriggeredTransitionAction_SubIPhoneContactsSearchJustSelectNumber(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                if (this.getInteger(19164) == -1) {
                    this.setInteger(28783, this.evalInt(3));
                }
                this.setString(29244, "");
                this.setInteger(-1644101376, 0);
                if (this.getInteger(28783) == SkinDataPool.getInteger(7) || this.getInteger(28783) == 4) {
                    this.setInteger(-1644101376, 1);
                }
                PhoneActivity.lockWaitaphore(1267400704, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(29244));
                eventGeneric.setInt(1, this.getInteger(-1644101376));
                this.triggerObserver(-334888896, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIPhoneContactDetails(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 6: {
                if (this.getInteger(-355139584) == 3 && this.getInteger(-2082799616) != this.getInteger(-1717633024)) {
                    this.setInteger(-2082799616, -1);
                }
                this.showView("Pcd", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    private void performStateExitAction_SubIPhoneContactDetails(int n) {
        switch (n - this.S_OFFSET) {
            case 6: {
                this.hideView("Pcd");
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubIPhoneContactDetails(int n) {
        switch (n - this.IT_OFFSET) {
            case 2: {
                return PhoneActivity.evListItemEventSender().equals("Button_Speak__Icon");
            }
            case 3: {
                return PhoneActivity.evListItemEventSender().equals("Button_Speak__Phonetics_Icon");
            }
            case 4: {
                return PhoneActivity.evListItemEventSender().equals("Button_Address") && this.getBoolean(22877);
            }
            case 5: {
                return PhoneActivity.evListItemEventSender().equals("Button_ContactDetails_Message");
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubIPhoneContactDetails(int n) {
        this.performInternalTransitionAction_SubIPhoneContactDetails0(n);
    }

    private void performInternalTransitionAction_SubIPhoneContactDetails0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                break;
            }
            case 1: {
                if (PhoneActivity.evListItemEventSender().equals("Button_ContactDetails") || PhoneActivity.evListItemEventSender().equals("Button_ContactDetails_Edit") || PhoneActivity.evListItemEventSender().equals("Button_ContactDetails_DialPrefix") || PhoneActivity.evListItemEventSender().equals("Button_ContactDetails_Message")) {
                    this.setInteger(-1632763904, PhoneActivity.evListItemActionIndex());
                }
                if (!PhoneActivity.evListItemEventSender().equals("Button_Address")) break;
                this.setInteger(-1433075712, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 2: {
                this.setLong(864681984, this.getLicValue(1188, 1, 0, 0L));
                this.setString(1274085376, this.getLicValue(1188, 2, 0, ""));
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -161051319);
                break;
            }
            case 3: {
                this.setLong(864681984, this.getLicValue(1188, 1, 0, 0L));
                this.setString(1274085376, this.getLicValue(1188, 2, 0, ""));
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -161051319);
                break;
            }
            case 4: {
                this.setInteger(24252, this.getInteger(-1433075712));
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(24252));
                this.triggerObserver(-933489344, eventGeneric);
                break;
            }
            case 5: {
                this.setLong(29990, this.getLicValue(1188, 1, 0, 0L));
                this.setString(-778305536, this.getLicValue(1188, 2, 0, ""));
                this.setString(1474428928, this.getLicValue(1189, 1, this.getInteger(-1632763904), ""));
                this.setInteger(-997851136, 2);
                this.setInteger(1088815104, 36);
                this.setBoolean(606077184, true);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1331727689);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubIPhoneContactDetails(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                return PhoneActivity.evListItemEventSender().equals("Button_ContactDetails");
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubIPhoneContactDetails(int n) {
        this.performTriggeredTransitionAction_SubIPhoneContactDetails0(n);
    }

    private void performTriggeredTransitionAction_SubIPhoneContactDetails0(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                this.setString(28686, this.getLicValue(1189, 1, this.getInteger(-1632763904), ""));
                this.setInteger(13743, 0);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIPhoneContactDetails(int n) {
        switch (n - this.UT_OFFSET) {
            case 3: {
                return PhoneActivity.evListItemEventSender().equals("Button_ContactDetails");
            }
            case 4: {
                return PhoneActivity.evListItemEventSender().equals("Button_ContactDetails_DialPrefix");
            }
            case 5: {
                return PhoneActivity.evListItemEventSender().equals("Button_ContactDetails_Edit");
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIPhoneContactDetails(int n) {
        switch (n - this.UT_OFFSET) {
            case 3: {
                this.setString(984547328, this.getLicValue(1189, 1, this.getInteger(-1632763904), ""));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, this.getLicValue(1188, 1, 0, 0L));
                this.setString(1545076992, this.getLicValue(1189, 1, this.getInteger(-1632763904), ""));
                this.setInteger(29056, this.getLicValue(1189, 2, this.getInteger(-1632763904), 0));
                this.setInteger(-1147076608, this.getLicValue(1189, 5, this.getInteger(-1632763904), 0));
                this.setInteger(1637744640, -1);
                break;
            }
            case 4: {
                this.setString(984547328, FormatterService.format((CharSequence)"${0}${1}", this.getString(537657600), this.getLicValue(1189, 1, this.getInteger(-1632763904), "")));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, this.getLicValue(1188, 1, 0, 0L));
                this.setString(1545076992, FormatterService.format((CharSequence)"${0}${1}", this.getString(537657600), this.getLicValue(1189, 1, this.getInteger(-1632763904), "")));
                this.setInteger(29056, this.getLicValue(1189, 2, this.getInteger(-1632763904), 0));
                this.setInteger(-1147076608, this.getLicValue(1189, 5, this.getInteger(-1632763904), 0));
                this.setInteger(1637744640, -1);
                break;
            }
            case 5: {
                this.setString(28686, this.getLicValue(1189, 1, this.getInteger(-1632763904), ""));
                this.setInteger(13743, 0);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIPhoneMainDial(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.enterIncludeDdpGroup(43);
                break;
            }
            case 6: {
                this.enterIncludeDdpGroup(43);
                break;
            }
            case 10: {
                this.enterIncludeDdpGroup(43);
                break;
            }
            case 13: {
                this.showView("Pcd", bl, 43);
                break;
            }
            case 21: {
                this.enterWaitaphoreForProperty(10909, 477, 587, 2020183369, 2003406153);
                break;
            }
            case 22: {
                this.triggerObserver(-1140654016);
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(-908001280, true);
                this.showView("Pmde", bl, 43);
                break;
            }
            case 26: {
                this.enterWaitaphoreForProperty(-1647837184, 477, 587, 2020183369, 2003406153);
                break;
            }
            case 29: {
                this.enterIncludeDdpGroup(43);
                break;
            }
        }
    }

    private void performStateExitAction_SubIPhoneMainDial(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                if (this.getInteger(11738) != 0) {
                    this.setInteger(11738, 0);
                }
                if (this.getInteger(13743) == 0) break;
                this.setInteger(13743, 0);
                break;
            }
            case 5: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 6: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 10: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 13: {
                this.hideView("Pcd");
                break;
            }
            case 21: {
                this.leaveWaitaphore();
                break;
            }
            case 22: {
                this.hideView("Pmde");
                this.setString(28686, this.getSpellerData(10909).getEnteredText());
                this.setInteger(20442, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(20442));
                this.triggerObserver(-1157431232, eventGeneric);
                if (this.getBoolean(-877985792)) {
                    this.triggerObserver(-1341980608);
                }
                this.setBoolean(-1397751808, false);
                eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(-908001280, false);
                this.setBoolean(-877985792, false);
                break;
            }
            case 26: {
                this.leaveWaitaphore();
                break;
            }
            case 29: {
                this.leaveIncludeDdpGroup();
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubIPhoneMainDial(int n) {
        switch (n - this.IT_OFFSET) {
            case 3: {
                return PhoneActivity.evListItemEventSender().equals("Button_Speak__Icon");
            }
            case 4: {
                return PhoneActivity.evListItemEventSender().equals("Button_Speak__Phonetics_Icon");
            }
            case 5: {
                return PhoneActivity.evListItemEventSender().equals("Button_Address") && this.getBoolean(22877);
            }
            case 6: {
                return PhoneActivity.evListItemEventSender().equals("Button_ContactDetails_Message");
            }
            case 7: {
                return this.getBoolean(22883) && this.getBoolean(-1312686080);
            }
            case 8: {
                return this.getBoolean(-134742016) && this.getBoolean(-1312686080);
            }
            case 9: {
                return this.getBoolean(1501691904) && this.getBoolean(-1312686080);
            }
            case 10: {
                return !this.getBoolean(-877985792);
            }
            case 12: {
                return !this.getBoolean(332136448);
            }
            case 13: {
                return this.getBoolean(332136448);
            }
            case 14: {
                return PhoneActivity.evSpellerValuePressedChar().equals("0");
            }
            case 17: {
                return this.getInteger(14021) > 0;
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubIPhoneMainDial(int n) {
        this.performInternalTransitionAction_SubIPhoneMainDial00(n);
    }

    private void performInternalTransitionAction_SubIPhoneMainDial00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                break;
            }
            case 1: {
                break;
            }
            case 2: {
                if (PhoneActivity.evListItemEventSender().equals("Button_ContactDetails") || PhoneActivity.evListItemEventSender().equals("Button_ContactDetails_Edit") || PhoneActivity.evListItemEventSender().equals("Button_ContactDetails_DialPrefix") || PhoneActivity.evListItemEventSender().equals("Button_ContactDetails_Message")) {
                    this.setInteger(-1632763904, PhoneActivity.evListItemActionIndex());
                }
                if (!PhoneActivity.evListItemEventSender().equals("Button_Address")) break;
                this.setInteger(-1433075712, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 3: {
                this.setLong(864681984, this.getLicValue(1188, 1, 0, 0L));
                this.setString(1274085376, this.getLicValue(1188, 2, 0, ""));
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -161051319);
                break;
            }
            case 4: {
                this.setLong(864681984, this.getLicValue(1188, 1, 0, 0L));
                this.setString(1274085376, this.getLicValue(1188, 2, 0, ""));
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -161051319);
                break;
            }
            case 5: {
                this.setInteger(24252, this.getInteger(-1433075712));
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(24252));
                this.triggerObserver(-933489344, eventGeneric);
                break;
            }
            case 6: {
                this.setLong(29990, this.getLicValue(1188, 1, 0, 0L));
                this.setString(-778305536, this.getLicValue(1188, 2, 0, ""));
                this.setString(1474428928, this.getLicValue(1189, 1, this.getInteger(-1632763904), ""));
                this.setInteger(-997851136, 2);
                this.setInteger(1088815104, 39);
                this.setBoolean(606077184, true);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1331727689);
                break;
            }
            case 7: {
                this.triggerObserver(-480504512);
                break;
            }
            case 8: {
                this.triggerObserver(-463727296);
                break;
            }
            case 9: {
                this.triggerObserver(-312732352);
                break;
            }
            case 10: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 11: {
                this.triggerObserver(-1325203392);
                break;
            }
            case 12: {
                this.setString(-959774720, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(28459, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(1322385408, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(29031, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(-959774720));
                eventGeneric.setInt(1, this.getInteger(1322385408));
                eventGeneric.setInt(2, this.getInteger(29031));
                eventGeneric.setInt(3, this.getInteger(28459));
                this.triggerObserver(-748939968, eventGeneric);
                break;
            }
            case 13: {
                this.setString(19512, PhoneActivity.evSpellerValuePressedChar());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(19512));
                this.triggerObserver(-1174208448, eventGeneric);
                break;
            }
            case 14: {
                this.setString(-959774720, "+");
                this.setInteger(28459, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(1322385408, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(29031, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(-959774720));
                eventGeneric.setInt(1, this.getInteger(1322385408));
                eventGeneric.setInt(2, this.getInteger(29031));
                eventGeneric.setInt(3, this.getInteger(28459));
                this.triggerObserver(-748939968, eventGeneric);
                break;
            }
            case 15: {
                this.setInteger(-1676476160, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1676476160));
                this.triggerObserver(-1190985664, eventGeneric);
                break;
            }
            case 16: {
                this.setInteger(421331200, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 17: {
                this.setInteger(-68091904, 0);
                if (this.getInteger(14021) == 2 && this.getLicValue(1158, 11, 1, 4) == 5) {
                    this.setInteger(-68091904, 1);
                }
                if (this.getInteger(14021) == 3 && this.getLicValue(1158, 11, 2, 4) == 5) {
                    this.setInteger(-68091904, 2);
                }
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-68091904));
                this.triggerObserver(-1560084416, eventGeneric);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubIPhoneMainDial(int n) {
        switch (n - this.TT_OFFSET) {
            case 5: {
                return PhoneActivity.evListItemEventSender().equals("Button_ContactDetails");
            }
            case 8: {
                return PhoneActivity.evSpellerValuePressedChar().equals("1");
            }
            case 14: {
                return this.getSpellerData(10909).getEnteredText().length() == 0;
            }
            case 15: {
                return this.getSpellerData(10909).getEnteredText().length() == 0;
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubIPhoneMainDial(int n) {
        this.performTriggeredTransitionAction_SubIPhoneMainDial00(n);
    }

    private void performTriggeredTransitionAction_SubIPhoneMainDial00(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.setString(984547328, this.getString(13702));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getString(13702));
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                break;
            }
            case 1: {
                this.setString(984547328, this.getString(1393819904));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getString(1393819904));
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                break;
            }
            case 2: {
                this.setString(984547328, this.getString(-407764992));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getString(-407764992));
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                break;
            }
            case 5: {
                this.setString(28686, this.getLicValue(1189, 1, this.getInteger(-1632763904), ""));
                this.setInteger(13743, 0);
                break;
            }
            case 7: {
                break;
            }
            case 9: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -479883959);
                this.setBoolean(606077184, true);
                this.setInteger(13743, 0);
                break;
            }
            case 10: {
                this.setInteger(1099104256, 2);
                this.setLong(-527826944, 0L);
                this.setString(1545076992, FormatterService.format((CharSequence)"${0}${1}", this.getString(537657600), this.getSpellerData(10909).getEnteredText()));
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                break;
            }
            case 11: {
                this.setInteger(1099104256, 1);
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getSpellerData(10909).getEnteredText());
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                break;
            }
            case 13: {
                this.setString(28686, this.getString(1393819904));
                break;
            }
            case 14: {
                this.setString(28686, this.getLicValue(2565, 3, 0, ""));
                break;
            }
            case 15: {
                this.setString(28686, this.getLicValue(2565, 3, 0, ""));
                break;
            }
            case 16: {
                this.setString(28686, this.getString(-407764992));
                break;
            }
            case 17: {
                this.setString(28686, this.getString(-407764992));
                break;
            }
            case 18: {
                this.setString(28686, this.getString(1393819904));
                break;
            }
            case 19: {
                this.setString(28686, this.getString(13702));
                break;
            }
            case 20: {
                this.setString(28686, this.getString(13702));
                break;
            }
            case 22: {
                this.setInteger(13291, PhoneActivity.evListItemActionIndex());
                PhoneActivity.lockWaitaphore(-1647837184, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13291));
                this.triggerObserver(-1358757824, eventGeneric);
                this.setString(28686, this.getLicValue(1169, 2, this.getInteger(421331200), ""));
                break;
            }
            case 23: {
                this.setString(28686, this.getString(1827930112));
                break;
            }
            case 28: {
                this.triggerObserver(0x34040040);
                break;
            }
            case 29: {
                this.triggerObserver(956563520);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIPhoneMainDial(int n) {
        switch (n - this.UT_OFFSET) {
            case 8: {
                return PhoneActivity.evListItemEventSender().equals("Button_ContactDetails");
            }
            case 9: {
                return PhoneActivity.evListItemEventSender().equals("Button_ContactDetails_DialPrefix");
            }
            case 10: {
                return PhoneActivity.evListItemEventSender().equals("Button_ContactDetails_Edit");
            }
            case 20: {
                return this.getString(1827930112).equals("") || this.getInteger(11738) == 2;
            }
            case 22: {
                return this.getInteger(13743) == 3 || this.getInteger(11738) == 2;
            }
            case 23: {
                return this.getInteger(-455409664) == 8;
            }
            case 24: {
                return this.getInteger(13743) == 11;
            }
            case 26: {
                return this.getInteger(13743) == 3 || this.getInteger(11738) == 2;
            }
            case 28: {
                return this.getInteger(13743) == 3;
            }
            case 29: {
                return this.getInteger(11738) == 2;
            }
            case 31: {
                return this.getLicValue(1169, 4, this.getInteger(421331200), false);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIPhoneMainDial(int n) {
        switch (n - this.UT_OFFSET) {
            case 8: {
                this.setString(984547328, this.getLicValue(1189, 1, this.getInteger(-1632763904), ""));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, this.getLicValue(1188, 1, 0, 0L));
                this.setString(1545076992, this.getLicValue(1189, 1, this.getInteger(-1632763904), ""));
                this.setInteger(29056, this.getLicValue(1189, 2, this.getInteger(-1632763904), 0));
                this.setInteger(-1147076608, this.getLicValue(1189, 5, this.getInteger(-1632763904), 0));
                this.setInteger(1637744640, -1);
                break;
            }
            case 9: {
                this.setString(984547328, FormatterService.format((CharSequence)"${0}${1}", this.getString(537657600), this.getLicValue(1189, 1, this.getInteger(-1632763904), "")));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, this.getLicValue(1188, 1, 0, 0L));
                this.setString(1545076992, FormatterService.format((CharSequence)"${0}${1}", this.getString(537657600), this.getLicValue(1189, 1, this.getInteger(-1632763904), "")));
                this.setInteger(29056, this.getLicValue(1189, 2, this.getInteger(-1632763904), 0));
                this.setInteger(-1147076608, this.getLicValue(1189, 5, this.getInteger(-1632763904), 0));
                this.setInteger(1637744640, -1);
                break;
            }
            case 10: {
                this.setString(28686, this.getLicValue(1189, 1, this.getInteger(-1632763904), ""));
                this.setInteger(13743, 0);
                break;
            }
            case 15: {
                this.setBoolean(23939, false);
                this.setBoolean(23939, true);
                PhoneActivity.lockWaitaphore(10909, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(28686));
                eventGeneric.setBoolean(1, this.getBoolean(23939));
                this.triggerObserver(-1542848448, eventGeneric);
                this.setBoolean(-877985792, true);
                break;
            }
            case 17: {
                this.setInteger(13291, this.getInteger(421331200));
                PhoneActivity.lockWaitaphore(-1647837184, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13291));
                this.triggerObserver(-1358757824, eventGeneric);
                break;
            }
            case 21: {
                this.setInteger(13743, 0);
                this.setString(984547328, this.getString(1827930112));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getString(1827930112));
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                break;
            }
            case 23: {
                this.setInteger(13743, 0);
                this.setInteger(-455409664, 0);
                break;
            }
            case 25: {
                this.setInteger(13743, 0);
                this.setInteger(-455409664, 0);
                break;
            }
            case 26: {
                this.setInteger(13743, 0);
                this.setInteger(11738, 0);
                break;
            }
            case 27: {
                this.setInteger(13743, 0);
                break;
            }
            case 28: {
                this.setInteger(13743, 0);
                this.setString(984547328, this.getSpellerData(802095104).getEnteredText());
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getSpellerData(802095104).getEnteredText());
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                break;
            }
            case 29: {
                this.setInteger(11738, 0);
                break;
            }
            case 30: {
                this.setInteger(13743, 0);
                this.setString(28686, this.getSpellerData(802095104).getEnteredText());
                break;
            }
            case 32: {
                this.setInteger(13291, this.getInteger(421331200));
                PhoneActivity.lockWaitaphore(-1647837184, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13291));
                this.triggerObserver(-1358757824, eventGeneric);
                this.setString(984547328, this.getLicValue(1169, 2, this.getInteger(421331200), ""));
                this.setInteger(1099104256, 0);
                this.setLong(-527826944, this.getLicValue(1169, 0, this.getInteger(421331200), 0L));
                this.setString(1545076992, this.getLicValue(1169, 2, this.getInteger(421331200), ""));
                this.setInteger(29056, this.getLicValue(1169, 5, this.getInteger(421331200), 0));
                this.setInteger(-1147076608, this.getLicValue(1169, 6, this.getInteger(421331200), 0));
                this.setInteger(1637744640, -1);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIPhoneMainDialNumber(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.setBoolean(606077184, true);
                this.setInteger(13743, 0);
                break;
            }
            case 11: {
                if (this.getInteger(1099104256) == 0) {
                    this.enterWaitaphoreForProperty(1511588096, 477, 587, 2053737801, 2036960585);
                    break;
                }
                if (this.getInteger(1099104256) == 1) {
                    this.enterWaitaphoreForProperty(1511588096, 477, 587, 2053737801, 2036960585);
                    break;
                }
                if (this.getInteger(1099104256) == 2) {
                    this.enterWaitaphoreForProperty(1511588096, 477, 587, 2053737801, 2036960585);
                    break;
                }
                this.enterWaitaphoreForNothing(2053737801);
                break;
            }
        }
    }

    private void performStateExitAction_SubIPhoneMainDialNumber(int n) {
        switch (n - this.S_OFFSET) {
            case 11: {
                this.leaveWaitaphore();
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIPhoneMainDialNumber(int n) {
        switch (n - this.UT_OFFSET) {
            case 2: {
                return this.getInteger(1511588096) == 1 && this.getString(-85655552).equals(this.getString(1393819904));
            }
            case 3: {
                return this.getInteger(1511588096) == 1 && this.getString(-85655552).equals(this.getString(13702));
            }
            case 4: {
                return this.getInteger(1511588096) == 1 && this.getString(-85655552).equals(this.getString(1827930112));
            }
            case 6: {
                return !this.getBoolean(15583) || this.getBoolean(1804468224) || this.getBoolean(13359) && this.getBoolean(-588775424);
            }
            case 7: {
                return this.getInteger(1511588096) == 2 || this.getInteger(1511588096) == 1 && this.getString(-85655552).equals(this.getString(-407764992));
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIPhoneMainDialNumber(int n) {
        switch (n - this.UT_OFFSET) {
            case 2: {
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getString(1393819904));
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(-527826944));
                eventGeneric.setString(1, this.getString(1545076992));
                eventGeneric.setInt(2, this.getInteger(29056));
                eventGeneric.setInt(3, this.getInteger(-1147076608));
                eventGeneric.setInt(4, this.getInteger(1637744640));
                this.triggerObserver(-430172864, eventGeneric);
                break;
            }
            case 3: {
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getString(13702));
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(-527826944));
                eventGeneric.setString(1, this.getString(1545076992));
                eventGeneric.setInt(2, this.getInteger(29056));
                eventGeneric.setInt(3, this.getInteger(-1147076608));
                eventGeneric.setInt(4, this.getInteger(1637744640));
                this.triggerObserver(-430172864, eventGeneric);
                break;
            }
            case 4: {
                this.setLong(-527826944, 0L);
                this.setString(1545076992, this.getString(1827930112));
                this.setInteger(29056, 0);
                this.setInteger(-1147076608, 0);
                this.setInteger(1637744640, -1);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(-527826944));
                eventGeneric.setString(1, this.getString(1545076992));
                eventGeneric.setInt(2, this.getInteger(29056));
                eventGeneric.setInt(3, this.getInteger(-1147076608));
                eventGeneric.setInt(4, this.getInteger(1637744640));
                this.triggerObserver(-430172864, eventGeneric);
                break;
            }
            case 5: {
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(-527826944));
                eventGeneric.setString(1, this.getString(1545076992));
                eventGeneric.setInt(2, this.getInteger(29056));
                eventGeneric.setInt(3, this.getInteger(-1147076608));
                eventGeneric.setInt(4, this.getInteger(1637744640));
                this.triggerObserver(-430172864, eventGeneric);
                break;
            }
            case 6: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587966647);
                break;
            }
            case 7: {
                this.setString(22895, this.getString(-85655552));
                this.triggerObserver(-1425866688);
                break;
            }
            case 10: {
                if (this.getInteger(1099104256) == 0) {
                    PhoneActivity.lockWaitaphore(1511588096, 10000);
                    EventGeneric eventGeneric = PhoneActivity.newEvent();
                    eventGeneric.setString(0, this.getString(984547328));
                    this.triggerObserver(-1459421120, eventGeneric);
                }
                if (this.getInteger(1099104256) == 1) {
                    PhoneActivity.lockWaitaphore(1511588096, 10000);
                    this.triggerObserver(-1258094528);
                }
                if (this.getInteger(1099104256) != 2) break;
                PhoneActivity.lockWaitaphore(1511588096, 10000);
                this.triggerObserver(-1241317312);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIPhoneSearchContactsDevice(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.triggerObserver(-1358495680);
                break;
            }
            case 3: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 2069466441);
                break;
            }
        }
    }

    private void performStateExitAction_SubIPhoneSearchContactsDevice(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.triggerObserver(-2113732544);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIPhoneSearchContactsDevice(int n) {
        switch (n - this.UT_OFFSET) {
            case 4: {
                return this.getBoolean(-522977280) && this.getBoolean(25376);
            }
            case 6: {
                return !this.getBoolean(-522977280) || !this.getBoolean(25376);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIPhoneSearchContactsDevice(int n) {
        switch (n - this.UT_OFFSET) {
            case 2: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 4: {
                this.setInteger(906100992, 11);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIPhoneSearchPhones(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.triggerObserver(-1358495680);
                break;
            }
            case 3: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 2069466441);
                break;
            }
            case 6: {
                this.enterIncludeDdpGroup(45);
                break;
            }
        }
    }

    private void performStateExitAction_SubIPhoneSearchPhones(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.triggerObserver(-2113732544);
                break;
            }
            case 6: {
                this.leaveIncludeDdpGroup();
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIPhoneSearchPhones(int n) {
        switch (n - this.UT_OFFSET) {
            case 4: {
                return this.getBoolean(-522977280) && this.getBoolean(25376);
            }
            case 6: {
                return !this.getBoolean(-522977280) || !this.getBoolean(25376);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIPhoneSearchPhones(int n) {
        switch (n - this.UT_OFFSET) {
            case 4: {
                this.setInteger(906100992, 2);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIPhoneSetup(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setBoolean(606077184, true);
                break;
            }
            case 2: {
                this.enterIncludeDdpGroup(40);
                break;
            }
            case 3: {
                this.enterIncludeDdpGroup(40);
                break;
            }
            case 7: {
                this.enterIncludeDdpGroup(40);
                break;
            }
            case 12: {
                this.showView("Pscfscn", bl, 40);
                break;
            }
            case 15: {
                this.enterWaitaphoreForProperty(1072431104, 477, 587, 2087292233, 2070515017);
                break;
            }
            case 16: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Pscfen", bl, 40);
                break;
            }
            case 17: {
                this.showView("Pscf", bl, 40);
                break;
            }
            case 21: {
                this.showView("Pscs_A68D", bl, 40);
                break;
            }
            case 28: {
                this.enterWaitaphoreForProperty(-388825088, 477, 587, 2087292233, 2070515017);
                break;
            }
            case 30: {
                this.showView("Pscsde", bl, 40);
                break;
            }
            case 33: {
                this.enterIncludeDdpGroup(40);
                break;
            }
            case 34: {
                this.enterIncludeDdpGroup(40);
                break;
            }
            case 35: {
                this.enterIncludeDdpGroup(40);
                break;
            }
            case 36: {
                this.enterIncludeDdpGroup(40);
                break;
            }
            case 41: {
                this.triggerObserver(671350848);
                this.showView("Psir", bl, 40);
                break;
            }
            case 46: {
                this.enterWaitaphoreForProperty(12518, 477, 587, 2087292233, 2070515017);
                break;
            }
            case 47: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(1292828928, false);
                this.showView("Pspre", bl, 40);
                break;
            }
            case 53: {
                this.showView("Psp", bl, 40);
                break;
            }
            case 56: {
                this.setInteger(30528, SkinDataPool.getInteger(173));
                if (this.getBoolean(2006319104)) {
                    this.setInteger(30528, SkinDataPool.getInteger(173));
                }
                if (this.getBoolean(32206)) {
                    this.setInteger(30528, SkinDataPool.getInteger(171));
                }
                if (this.getBoolean(774308096)) {
                    this.setInteger(30528, SkinDataPool.getInteger(172));
                }
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(30528));
                this.triggerObserver(-654114752, eventGeneric);
                if (this.getBoolean(22801)) {
                    this.setInteger(754515968, SkinDataPool.getInteger(174));
                }
                if (this.getBoolean(22801)) {
                    eventGeneric = PhoneActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(754515968));
                    this.triggerObserver(-446950080, eventGeneric);
                }
                this.showView("Pspfs", bl, 40);
                break;
            }
            case 65: {
                this.enterWaitaphoreForProperty(986382336, 477, 587, 2087292233, 2070515017);
                break;
            }
            case 66: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Psap", bl, 40);
                break;
            }
            case 73: {
                this.enterWaitaphoreForProperty(14878, 477, 587, 2087292233, 2070515017);
                break;
            }
            case 74: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(1292828928, false);
                this.showView("Pscn", bl, 40);
                break;
            }
            case 81: {
                this.enterWaitaphoreForProperty(986382336, 477, 587, 2087292233, 2070515017);
                break;
            }
            case 82: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Psap", bl, 40);
                break;
            }
            case 85: {
                this.enterWaitaphoreForProperty(986382336, 477, 587, 2087292233, 2070515017);
                break;
            }
            case 86: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Psscpn", bl, 40);
                break;
            }
            case 89: {
                this.enterWaitaphoreForProperty(986382336, 477, 587, 2087292233, 2070515017);
                break;
            }
            case 90: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Psscpn", bl, 40);
                break;
            }
            case 94: {
                this.showView("Pss", bl, 40);
                break;
            }
            case 99: {
                this.showView("Ps", bl, 40);
                break;
            }
        }
    }

    private void performStateExitAction_SubIPhoneSetup(int n) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 3: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 7: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 12: {
                this.hideView("Pscfscn");
                break;
            }
            case 15: {
                this.leaveWaitaphore();
                break;
            }
            case 16: {
                this.hideView("Pscfen");
                this.triggerObserver(-201129920);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(-877985792, false);
                break;
            }
            case 17: {
                this.hideView("Pscf");
                break;
            }
            case 21: {
                this.hideView("Pscs_A68D");
                break;
            }
            case 28: {
                this.leaveWaitaphore();
                break;
            }
            case 30: {
                this.hideView("Pscsde");
                break;
            }
            case 33: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 34: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 35: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 36: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 41: {
                this.hideView("Psir");
                this.triggerObserver(688128064);
                this.triggerObserver(654573632);
                break;
            }
            case 46: {
                this.leaveWaitaphore();
                break;
            }
            case 47: {
                this.hideView("Pspre");
                this.triggerObserver(0x3040040);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(1292828928, false);
                this.setBoolean(-877985792, false);
                break;
            }
            case 53: {
                this.hideView("Psp");
                break;
            }
            case 56: {
                this.hideView("Pspfs");
                break;
            }
            case 57: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                break;
            }
            case 65: {
                this.leaveWaitaphore();
                break;
            }
            case 66: {
                this.hideView("Psap");
                this.triggerObserver(369360960);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(-877985792, false);
                break;
            }
            case 73: {
                this.leaveWaitaphore();
                break;
            }
            case 74: {
                this.hideView("Pscn");
                this.triggerObserver(0xD040040);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(1292828928, false);
                this.setBoolean(-877985792, false);
                break;
            }
            case 81: {
                this.leaveWaitaphore();
                break;
            }
            case 82: {
                this.hideView("Psap");
                this.triggerObserver(369360960);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(-877985792, false);
                break;
            }
            case 85: {
                this.leaveWaitaphore();
                break;
            }
            case 86: {
                this.hideView("Psscpn");
                this.triggerObserver(369360960);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                this.setBoolean(-877985792, false);
                break;
            }
            case 89: {
                this.leaveWaitaphore();
                break;
            }
            case 90: {
                this.hideView("Psscpn");
                this.triggerObserver(369360960);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(-877985792, false);
                break;
            }
            case 94: {
                this.hideView("Pss");
                break;
            }
            case 99: {
                this.hideView("Ps");
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubIPhoneSetup(int n) {
        switch (n - this.IT_OFFSET) {
            case 5: {
                return this.getLicValue(1190, 8, this.getInteger(-1717633024), false) && (this.getInteger(-2082799616) > PhoneActivity.evListItemActionIndex() || this.getInteger(-2082799616) < PhoneActivity.evListItemActionIndex());
            }
            case 6: {
                return this.getLicValue(1190, 8, this.getInteger(-1717633024), false) && this.getInteger(-2082799616) == PhoneActivity.evListItemActionIndex();
            }
            case 9: {
                return !this.getBoolean(-877985792);
            }
            case 12: {
                return PhoneActivity.evSpellerValuePressedChar().equals("0");
            }
            case 14: {
                return PhoneActivity.evListItemActionIndex() == 1;
            }
            case 15: {
                return PhoneActivity.evListItemActionIndex() == 2;
            }
            case 20: {
                return PhoneActivity.evListItemEventSender().equals("Button_AutomaticRedial") && this.getLicValue(1211, 3, 0, false);
            }
            case 21: {
                return PhoneActivity.evListItemEventSender().equals("Button_AutomaticRedial") && !this.getLicValue(1211, 3, 0, false);
            }
            case 22: {
                return PhoneActivity.evListItemEventSender().equals("Button_AutomaticAcceptCall") && this.getLicValue(1211, 2, 0, false);
            }
            case 23: {
                return PhoneActivity.evListItemEventSender().equals("Button_AutomaticAcceptCall") && !this.getLicValue(1211, 2, 0, false);
            }
            case 24: {
                return PhoneActivity.evListItemActionIndex() == 0 && PhoneActivity.evListItemEventSender().equals("Button_CallWaiting");
            }
            case 25: {
                return PhoneActivity.evListItemActionIndex() == 1 && PhoneActivity.evListItemEventSender().equals("Button_CallWaiting");
            }
            case 26: {
                return PhoneActivity.evListItemActionIndex() == 2 && PhoneActivity.evListItemEventSender().equals("Button_CallWaiting");
            }
            case 27: {
                return PhoneActivity.evListItemActionIndex() == 0 && PhoneActivity.evListItemEventSender().equals("Button_SendCallingID");
            }
            case 28: {
                return PhoneActivity.evListItemActionIndex() == 1 && PhoneActivity.evListItemEventSender().equals("Button_SendCallingID");
            }
            case 29: {
                return PhoneActivity.evListItemActionIndex() == 2 && PhoneActivity.evListItemEventSender().equals("Button_SendCallingID");
            }
            case 30: {
                return PhoneActivity.evListItemActionIndex() == 3 && PhoneActivity.evListItemEventSender().equals("Button_SendCallingID");
            }
            case 31: {
                return PhoneActivity.evListItemEventSender().equals("Button_Mixed");
            }
            case 32: {
                return PhoneActivity.evListItemEventSender().equals("Button_Missed");
            }
            case 33: {
                return PhoneActivity.evListItemEventSender().equals("Button_Dialed");
            }
            case 34: {
                return PhoneActivity.evListItemEventSender().equals("Button_Accepted");
            }
            case 36: {
                return PhoneActivity.evListItemEventSender().equals("Button_Callstack") && (this.getInteger(-388825088) == 1 && this.getLicValue(1170, 15, this.getInteger(-1781792768), false) || this.getInteger(-388825088) == 0 && this.getLicValue(1171, 15, this.getInteger(385155072), false) || this.getInteger(-388825088) == 2 && this.getLicValue(1172, 15, this.getInteger(26851), false) || this.getInteger(-388825088) == 3 && this.getLicValue(1173, 15, this.getInteger(29052), false));
            }
            case 37: {
                return PhoneActivity.evListItemEventSender().equals("Button_DeleteAll");
            }
            case 39: {
                return !this.getBoolean(-877985792);
            }
            case 45: {
                return PhoneActivity.evListItemEventSender().equals("Button_DownloadContacts");
            }
            case 46: {
                return PhoneActivity.evListItemEventSender().equals("Button_PhoneReminder") && this.getBoolean(19711);
            }
            case 47: {
                return PhoneActivity.evListItemEventSender().equals("Button_PhoneReminder") && !this.getBoolean(19711);
            }
            case 48: {
                return this.getBoolean(935395328) && PhoneActivity.evListItemEventSender().equals("Button_Pictures");
            }
            case 49: {
                return !this.getBoolean(935395328) && PhoneActivity.evListItemEventSender().equals("Button_Pictures");
            }
            case 50: {
                return PhoneActivity.evListItemActionIndex() == 0 && PhoneActivity.evListItemEventSender().equals("Button_Optimization");
            }
            case 51: {
                return PhoneActivity.evListItemActionIndex() == 1 && PhoneActivity.evListItemEventSender().equals("Button_Optimization");
            }
            case 52: {
                return PhoneActivity.evListItemActionIndex() == 2 && PhoneActivity.evListItemEventSender().equals("Button_Optimization");
            }
            case 53: {
                return PhoneActivity.evListItemActionIndex() == 0 && PhoneActivity.evListItemEventSender().equals("Button_GlobalSortOrder");
            }
            case 54: {
                return PhoneActivity.evListItemActionIndex() == 1 && PhoneActivity.evListItemEventSender().equals("Button_GlobalSortOrder");
            }
            case 57: {
                return !this.getLicValue(1194, 5, this.getInteger(12930), false);
            }
            case 61: {
                return !this.getBoolean(-877985792);
            }
            case 66: {
                return !this.getBoolean(-877985792);
            }
            case 72: {
                return !this.getBoolean(-877985792);
            }
            case 77: {
                return !this.getBoolean(-877985792);
            }
            case 81: {
                return this.getBoolean(-1930428416);
            }
            case 82: {
                return this.getBoolean(-1930428416);
            }
            case 83: {
                return this.getBoolean(-1930428416);
            }
            case 84: {
                return this.getBoolean(-1930428416);
            }
            case 85: {
                return !this.getBoolean(-877985792);
            }
            case 89: {
                return PhoneActivity.evListItemEventSender().equals("Button_DeleteSecondPIN") && this.getBoolean(13996);
            }
            case 90: {
                return PhoneActivity.evListItemEventSender().equals("Button_CurrentPIN");
            }
            case 91: {
                return PhoneActivity.evListItemEventSender().equals("Button_OtherPIN");
            }
            case 92: {
                return PhoneActivity.evListItemEventSender().equals("Button_PhoneModule") && this.getBoolean(31551) && this.getBoolean(30686);
            }
            case 93: {
                return PhoneActivity.evListItemEventSender().equals("Button_PhoneModule") && !this.getBoolean(31551) && this.getBoolean(30686);
            }
            case 94: {
                return PhoneActivity.evListItemEventSender().equals("Button_BluetoothSetup") && !this.getBoolean(25376);
            }
            case 95: {
                return PhoneActivity.evListItemActionIndex() == 0;
            }
            case 96: {
                return PhoneActivity.evListItemActionIndex() == 1;
            }
            case 97: {
                return PhoneActivity.evListItemActionIndex() == 2;
            }
            case 98: {
                return PhoneActivity.evListItemActionIndex() == 3;
            }
            case 99: {
                return PhoneActivity.evListItemActionIndex() == 4;
            }
            case 100: {
                return PhoneActivity.evListItemActionIndex() == 5;
            }
            case 101: {
                return PhoneActivity.evListItemEventSender().equals("Button_HandsfreeAudioMode") && this.getBoolean(1468792832);
            }
            case 102: {
                return PhoneActivity.evListItemEventSender().equals("Button_HandsfreeAudioMode") && !this.getBoolean(1468792832);
            }
            case 103: {
                return PhoneActivity.evListItemEventSender().equals("Button_AutomaticAcceptCall") && this.getLicValue(1211, 2, 0, false);
            }
            case 104: {
                return PhoneActivity.evListItemEventSender().equals("Button_AutomaticAcceptCall") && !this.getLicValue(1211, 2, 0, false);
            }
            case 105: {
                return this.getBoolean(-1630797824) && PhoneActivity.evListItemEventSender().equals("Button_MultipartyCall") && this.getBoolean(867565568);
            }
            case 106: {
                return !this.getBoolean(-1630797824) && PhoneActivity.evListItemEventSender().equals("Button_MultipartyCall") && this.getBoolean(867565568);
            }
            case 107: {
                return PhoneActivity.evListItemEventSender().equals("Button_Messages");
            }
            case 108: {
                return PhoneActivity.evListItemEventSender().equals("Button_PhoneModuleUsageDataOnly") && this.getBoolean(30686) && (this.getBoolean(11585) || this.getBoolean(0x1D110100));
            }
            case 109: {
                return PhoneActivity.evListItemEventSender().equals("Button_PhoneModuleUsageDataOnly") && !this.getBoolean(151519488) && !this.getBoolean(0x1D110100) && !this.getBoolean(11585) && this.getBoolean(30686);
            }
            case 110: {
                return PhoneActivity.evListItemEventSender().equals("Button_PhoneModuleUsageDataOnly") && this.getBoolean(151519488) && this.getBoolean(30686);
            }
            case 111: {
                return PhoneActivity.evListItemEventSender().equals("Button_NetworkSettings");
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubIPhoneSetup(int n) {
        this.performInternalTransitionAction_SubIPhoneSetup000(n);
    }

    private void performInternalTransitionAction_SubIPhoneSetup000(int n) {
        switch (n - this.IT_OFFSET) {
            case 1: {
                break;
            }
            case 2: {
                this.setBoolean(-351993600, true);
                break;
            }
            case 3: {
                this.setBoolean(-351993600, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1504080567);
                break;
            }
            case 4: {
                this.setBoolean(-351993600, false);
                break;
            }
            case 5: {
                this.setLong(19840, this.getLicValue(1190, 2, this.getInteger(-1717633024), 0L));
                PhoneActivity.lockWaitaphore(-1647837184, 1000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(19840));
                this.triggerObserver(-1006436288, eventGeneric);
                this.setInteger(-2082799616, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 6: {
                this.setInteger(-2082799616, -1);
                break;
            }
            case 7: {
                this.setInteger(-1717633024, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 8: {
                this.setInteger(1828978944, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 9: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 10: {
                this.triggerObserver(-184352704);
                break;
            }
            case 11: {
                this.setString(-1311703040, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(685834240, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(1756626944, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(1353449472, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(-1311703040));
                eventGeneric.setInt(1, this.getInteger(1756626944));
                eventGeneric.setInt(2, this.getInteger(1353449472));
                eventGeneric.setInt(3, this.getInteger(685834240));
                this.triggerObserver(-665053888, eventGeneric);
                break;
            }
            case 12: {
                this.setString(-1311703040, "+");
                this.setInteger(685834240, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(1756626944, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(1353449472, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(-1311703040));
                eventGeneric.setInt(1, this.getInteger(1756626944));
                eventGeneric.setInt(2, this.getInteger(1353449472));
                eventGeneric.setInt(3, this.getInteger(685834240));
                this.triggerObserver(-665053888, eventGeneric);
                break;
            }
            case 13: {
                this.setInteger(13233, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(13233));
                this.triggerObserver(-100466624, eventGeneric);
                break;
            }
            case 14: {
                this.setInteger(1016791040, this.getInteger(0x1EE00000));
                this.setInteger(42663936, 2);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1016791040));
                eventGeneric.setInt(1, this.getInteger(42663936));
                this.triggerObserver(-301793216, eventGeneric);
                break;
            }
            case 15: {
                this.setInteger(1016791040, this.getInteger(0x1EE00000));
                this.setInteger(42663936, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1016791040));
                eventGeneric.setInt(1, this.getInteger(42663936));
                this.triggerObserver(-301793216, eventGeneric);
                break;
            }
            case 16: {
                this.setInteger(0x1EE00000, PhoneActivity.evListItemActionIndex());
                this.setInteger(21736, this.getLicValue(1210, 2, this.getInteger(0x1EE00000), 0));
                break;
            }
            case 17: {
                this.setBoolean(1008075008, true);
                break;
            }
            case 18: {
                this.setBoolean(1008075008, false);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1504080567);
                break;
            }
            case 19: {
                this.setBoolean(1008075008, false);
                break;
            }
            case 20: {
                this.setBoolean(-1245446144, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1245446144));
                this.triggerObserver(-268238784, eventGeneric);
                break;
            }
            case 21: {
                this.setBoolean(-1245446144, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1245446144));
                this.triggerObserver(-268238784, eventGeneric);
                break;
            }
            case 22: {
                this.setBoolean(-2102853632, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-2102853632));
                this.triggerObserver(-285016000, eventGeneric);
                break;
            }
            case 23: {
                this.setBoolean(-2102853632, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-2102853632));
                this.triggerObserver(-285016000, eventGeneric);
                break;
            }
            case 24: {
                this.setInteger(1020329984, 1);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1020329984));
                this.triggerObserver(-251461568, eventGeneric);
                break;
            }
            case 25: {
                this.setInteger(1020329984, 2);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1020329984));
                this.triggerObserver(-251461568, eventGeneric);
                break;
            }
            case 26: {
                this.setInteger(1020329984, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1020329984));
                this.triggerObserver(-251461568, eventGeneric);
                break;
            }
            case 27: {
                this.setInteger(874316032, 1);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(874316032));
                this.triggerObserver(-1034152640, eventGeneric);
                break;
            }
            case 28: {
                this.setInteger(874316032, 2);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(874316032));
                this.triggerObserver(-1034152640, eventGeneric);
                break;
            }
            case 29: {
                this.setInteger(874316032, 3);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(874316032));
                this.triggerObserver(-1034152640, eventGeneric);
                break;
            }
            case 30: {
                this.setInteger(874316032, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(874316032));
                this.triggerObserver(-1034152640, eventGeneric);
                break;
            }
            case 31: {
                this.setInteger(-1096744960, 3);
                PhoneActivity.lockWaitaphore(-388825088, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1096744960));
                this.triggerObserver(-1039990720, eventGeneric);
                break;
            }
            case 32: {
                this.setInteger(-1096744960, 2);
                PhoneActivity.lockWaitaphore(-388825088, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1096744960));
                this.triggerObserver(-1039990720, eventGeneric);
                break;
            }
            case 33: {
                this.setInteger(-1096744960, 0);
                PhoneActivity.lockWaitaphore(-388825088, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1096744960));
                this.triggerObserver(-1039990720, eventGeneric);
                break;
            }
            case 34: {
                this.setInteger(-1096744960, 1);
                PhoneActivity.lockWaitaphore(-388825088, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1096744960));
                this.triggerObserver(-1039990720, eventGeneric);
                break;
            }
            case 35: {
                if (this.getInteger(-388825088) == 1) {
                    this.setInteger(-1781792768, PhoneActivity.evListItemActionIndex());
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setInteger(385155072, PhoneActivity.evListItemActionIndex());
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setInteger(26851, PhoneActivity.evListItemActionIndex());
                }
                if (this.getInteger(-388825088) != 3) break;
                this.setInteger(29052, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 36: {
                if (this.getInteger(-388825088) == 1) {
                    this.setInteger(-1781792768, PhoneActivity.evListItemActionIndex());
                }
                if (this.getInteger(-388825088) == 0) {
                    this.setInteger(385155072, PhoneActivity.evListItemActionIndex());
                }
                if (this.getInteger(-388825088) == 2) {
                    this.setInteger(26851, PhoneActivity.evListItemActionIndex());
                }
                if (this.getInteger(-388825088) == 3) {
                    this.setInteger(29052, PhoneActivity.evListItemActionIndex());
                }
                this.setInteger(-521535488, PhoneActivity.evListItemActionIndex());
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1202090679);
                break;
            }
            case 37: {
                this.setInteger(-652672768, this.getInteger(-1096744960));
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1218867895);
                break;
            }
            case 38: {
                this.triggerObserver(688128064);
                this.setInteger(-118751232, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-118751232));
                this.triggerObserver(553910336, eventGeneric);
                this.setInteger(24211, PhoneActivity.evListItemActionIndex());
                eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(24211));
                this.triggerObserver(520355904, eventGeneric);
                break;
            }
            case 39: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 40: {
                this.triggerObserver(0x4040040);
                break;
            }
            case 41: {
                this.setString(11524, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(1559232512, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(532938752, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(-1139212032, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(11524));
                eventGeneric.setInt(1, this.getInteger(532938752));
                eventGeneric.setInt(2, this.getInteger(-1139212032));
                eventGeneric.setInt(3, this.getInteger(1559232512));
                this.triggerObserver(-648276672, eventGeneric);
                break;
            }
            case 42: {
                this.setInteger(-972422912, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-972422912));
                this.triggerObserver(0x8040040, eventGeneric);
                break;
            }
            case 43: {
                this.setBoolean(1292828928, true);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1217884855);
                break;
            }
            case 44: {
                this.setBoolean(1292828928, false);
                break;
            }
            case 45: {
                this.triggerObserver(-1023213504);
                break;
            }
            case 46: {
                this.setBoolean(-622329856, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-622329856));
                this.triggerObserver(0x22040040, eventGeneric);
                break;
            }
            case 47: {
                this.setBoolean(-622329856, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-622329856));
                this.triggerObserver(0x22040040, eventGeneric);
                break;
            }
            case 48: {
                this.setBoolean(-2133852160, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-2133852160));
                this.triggerObserver(262208, eventGeneric);
                break;
            }
            case 49: {
                this.setBoolean(-2133852160, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-2133852160));
                this.triggerObserver(262208, eventGeneric);
                break;
            }
            case 50: {
                this.setInteger(17342, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(17342));
                this.triggerObserver(-16580544, eventGeneric);
                break;
            }
            case 51: {
                this.setInteger(17342, 1);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(17342));
                this.triggerObserver(-16580544, eventGeneric);
                break;
            }
            case 52: {
                this.setInteger(17342, 2);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(17342));
                this.triggerObserver(-16580544, eventGeneric);
                break;
            }
            case 53: {
                this.setInteger(619184128, 2);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(619184128));
                this.triggerObserver(-267780032, eventGeneric);
                break;
            }
            case 54: {
                this.setInteger(619184128, 1);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(619184128));
                this.triggerObserver(-267780032, eventGeneric);
                break;
            }
            case 55: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1101427383);
                break;
            }
            case 56: {
                this.setInteger(12930, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 57: {
                this.setInteger(1792737280, PhoneActivity.evListItemActionIndex());
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1118204599);
                break;
            }
            case 58: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -380007095);
                break;
            }
            case 59: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -363229879);
                break;
            }
            case 60: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 526028105);
                break;
            }
            case 61: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 62: {
                this.triggerObserver(386138176);
                break;
            }
            case 63: {
                this.setString(19733, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(-149618432, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(971702272, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(31114, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(19733));
                eventGeneric.setInt(1, this.getInteger(971702272));
                eventGeneric.setInt(2, this.getInteger(31114));
                eventGeneric.setInt(3, this.getInteger(-149618432));
                this.triggerObserver(-614722240, eventGeneric);
                break;
            }
            case 64: {
                this.triggerObserver(352583744);
                break;
            }
            case 65: {
                this.setInteger(-2117337088, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2117337088));
                this.triggerObserver(486801472, eventGeneric);
                break;
            }
            case 66: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 67: {
                this.triggerObserver(0xE040040);
                break;
            }
            case 68: {
                this.setString(1907032064, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(1220608000, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(-2053898240, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(-2752512, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(1907032064));
                eventGeneric.setInt(1, this.getInteger(-2053898240));
                eventGeneric.setInt(2, this.getInteger(-2752512));
                eventGeneric.setInt(3, this.getInteger(1220608000));
                this.triggerObserver(-631499456, eventGeneric);
                break;
            }
            case 69: {
                this.setInteger(950403072, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(950403072));
                this.triggerObserver(0x14040040, eventGeneric);
                break;
            }
            case 70: {
                this.setBoolean(1292828928, true);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1217884855);
                break;
            }
            case 71: {
                this.setBoolean(1292828928, false);
                break;
            }
            case 72: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 73: {
                this.triggerObserver(386138176);
                break;
            }
            case 74: {
                this.setString(19733, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(-149618432, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(971702272, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(31114, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(19733));
                eventGeneric.setInt(1, this.getInteger(971702272));
                eventGeneric.setInt(2, this.getInteger(31114));
                eventGeneric.setInt(3, this.getInteger(-149618432));
                this.triggerObserver(-614722240, eventGeneric);
                break;
            }
            case 75: {
                this.triggerObserver(352583744);
                break;
            }
            case 76: {
                this.setInteger(-2117337088, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2117337088));
                this.triggerObserver(486801472, eventGeneric);
                break;
            }
            case 77: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 78: {
                this.triggerObserver(386138176);
                break;
            }
            case 79: {
                this.setString(19733, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(-149618432, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(971702272, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(31114, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(19733));
                eventGeneric.setInt(1, this.getInteger(971702272));
                eventGeneric.setInt(2, this.getInteger(31114));
                eventGeneric.setInt(3, this.getInteger(-149618432));
                this.triggerObserver(-614722240, eventGeneric);
                break;
            }
            case 80: {
                this.setInteger(-2117337088, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2117337088));
                this.triggerObserver(486801472, eventGeneric);
                break;
            }
            case 81: {
                this.triggerObserver(386531392);
                break;
            }
            case 82: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1621062327);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(27884));
                this.triggerObserver(-301727680, eventGeneric);
                this.setInteger(13743, 0);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1465945417);
                break;
            }
            case 85: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 86: {
                this.triggerObserver(386138176);
                break;
            }
            case 87: {
                this.setString(19733, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(-149618432, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(971702272, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(31114, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(19733));
                eventGeneric.setInt(1, this.getInteger(971702272));
                eventGeneric.setInt(2, this.getInteger(31114));
                eventGeneric.setInt(3, this.getInteger(-149618432));
                this.triggerObserver(-614722240, eventGeneric);
                break;
            }
            case 88: {
                this.setInteger(-2117337088, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2117337088));
                this.triggerObserver(486801472, eventGeneric);
                break;
            }
            case 89: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1034318519);
                break;
            }
            case 90: {
                this.setInteger(-652214016, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-652214016));
                this.triggerObserver(269090880, eventGeneric);
                break;
            }
            case 91: {
                this.setInteger(-652214016, 1);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-652214016));
                this.triggerObserver(269090880, eventGeneric);
                break;
            }
            case 92: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1168536247);
                break;
            }
            case 93: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1957065399);
                break;
            }
            case 94: {
                this.setInteger(906100992, 0);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -866546359);
                break;
            }
            case 95: {
                this.setInteger(-1541668608, 0);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1541668608));
                this.triggerObserver(-363064000, eventGeneric);
                break;
            }
            case 96: {
                this.setInteger(-1541668608, 1);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1541668608));
                this.triggerObserver(-363064000, eventGeneric);
                break;
            }
            case 97: {
                this.setInteger(-1541668608, 2);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1541668608));
                this.triggerObserver(-363064000, eventGeneric);
                break;
            }
            case 98: {
                this.setInteger(-1541668608, 3);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1541668608));
                this.triggerObserver(-363064000, eventGeneric);
                break;
            }
            case 99: {
                this.setInteger(-1541668608, 4);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1541668608));
                this.triggerObserver(-363064000, eventGeneric);
                break;
            }
            case 100: {
                this.setInteger(-1541668608, 5);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1541668608));
                this.triggerObserver(-363064000, eventGeneric);
                break;
            }
            case 101: {
                this.setBoolean(14880, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(14880));
                this.triggerObserver(0x24040040, eventGeneric);
                break;
            }
            case 102: {
                this.setBoolean(14880, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(14880));
                this.triggerObserver(0x24040040, eventGeneric);
                break;
            }
            case 103: {
                this.setBoolean(-2102853632, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-2102853632));
                this.triggerObserver(-285016000, eventGeneric);
                break;
            }
            case 104: {
                this.setBoolean(-2102853632, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-2102853632));
                this.triggerObserver(-285016000, eventGeneric);
                break;
            }
            case 105: {
                this.setBoolean(-507314176, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-507314176));
                this.triggerObserver(-217907136, eventGeneric);
                break;
            }
            case 106: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1151759031);
                break;
            }
            case 107: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                this.setInteger(-997851136, 3);
                this.setInteger(1088815104, 35);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1331727689);
                break;
            }
            case 108: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -447115959);
                break;
            }
            case 109: {
                this.setBoolean(584581120, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(584581120));
                this.triggerObserver(822804544, eventGeneric);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1084650167);
                break;
            }
            case 110: {
                this.setBoolean(584581120, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(584581120));
                this.triggerObserver(822804544, eventGeneric);
                break;
            }
            case 111: {
                this.setInteger(1088815104, 35);
                this.setInteger(29840, 1);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 1398836553);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubIPhoneSetup(int n) {
        switch (n - this.TT_OFFSET) {
            case 2: {
                return !this.getLicValue(1190, 8, this.getInteger(-1717633024), false);
            }
            case 12: {
                return PhoneActivity.evListItemActionIndex() == 0;
            }
            case 28: {
                return this.getLicValue(1194, 5, this.getInteger(12930), false);
            }
            case 29: {
                return !this.getBoolean(-1785921536);
            }
            case 46: {
                return this.getBoolean(-1930428416);
            }
            case 48: {
                return !this.getBoolean(-1930428416);
            }
            case 58: {
                return PhoneActivity.evListItemEventSender().equals("Button_AutomaticPIN") || PhoneActivity.evListItemEventSender().equals("Button_PINRequired") || PhoneActivity.evListItemEventSender().equals("Button_ChangePIN") || PhoneActivity.evListItemEventSender().equals("Button_AddSecondPIN") && !this.getBoolean(13996) || PhoneActivity.evListItemEventSender().equals("Button_ChangeSecondPIN") || PhoneActivity.evListItemEventSender().equals("Button_ChangeNameCurrent") || PhoneActivity.evListItemEventSender().equals("Button_ChangeNameOther");
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubIPhoneSetup(int n) {
        this.performTriggeredTransitionAction_SubIPhoneSetup00(n);
    }

    private void performTriggeredTransitionAction_SubIPhoneSetup00(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                if (this.getSpellerData(1267400704).getEnteredText().length() > 0) {
                    this.triggerObserver(-838664128);
                }
                if (this.getSpellerData(1267400704).getEnteredText().length() == 0) {
                    this.triggerObserver(-956104640);
                }
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 1: {
                this.triggerObserver(-905772992);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 2: {
                this.setString(781910016, this.getLicValue(1190, 4, this.getInteger(-1717633024), ""));
                break;
            }
            case 4: {
                this.setString(781910016, this.getLicValue(1189, 1, this.getInteger(1828978944), ""));
                break;
            }
            case 5: {
                PhoneActivity.lockWaitaphore(833093632, 1);
                this.triggerObserver(-972881856);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 6: {
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(501612544));
                this.triggerObserver(-134021056, eventGeneric);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 7: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 11: {
                this.setBoolean(632356864, true);
                this.triggerObserver(-956104640);
                break;
            }
            case 12: {
                this.setInteger(1016791040, this.getInteger(0x1EE00000));
                this.setInteger(42663936, 1);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1016791040));
                eventGeneric.setInt(1, this.getInteger(42663936));
                this.triggerObserver(-301793216, eventGeneric);
                this.setInteger(501612544, this.getInteger(0x1EE00000));
                this.setString(781910016, this.getLicValue(1210, 1, this.getInteger(0x1EE00000), ""));
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 17: {
                this.triggerObserver(956563520);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 18: {
                this.triggerObserver(0x34040040);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 19: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 20: {
                this.triggerObserver(0x5040040);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 22: {
                this.triggerObserver(0x9040040);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 27: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 28: {
                this.setInteger(1645084928, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1645084928));
                this.triggerObserver(-670891968, eventGeneric);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 30: {
                this.triggerObserver(402915392);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 36: {
                if (this.getInteger(27316) == 0) {
                    this.triggerObserver(0x11040040);
                }
                if (this.getInteger(27316) == 1) {
                    this.triggerObserver(302252096);
                }
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 37: {
                this.triggerObserver(0xF040040);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 40: {
                this.triggerObserver(402915392);
                break;
            }
            case 45: {
                this.triggerObserver(402915392);
                break;
            }
            case 46: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1621062327);
                break;
            }
            case 47: {
                this.triggerObserver(402915392);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1621062327);
                break;
            }
            case 48: {
                this.triggerObserver(503578688);
                this.setString(1394278656, this.getI18nString(3866));
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 52: {
                this.setString(148635648, this.getI18nString(3770));
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 53: {
                this.setString(1394278656, this.getI18nString(3865));
                this.triggerObserver(402915392);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIPhoneSetup(int n) {
        switch (n - this.UT_OFFSET) {
            case 15: {
                return this.getBoolean(11972);
            }
            case 29: {
                return this.getBoolean(1725235200);
            }
            case 31: {
                return PhoneActivity.evListItemEventSender().equals("Button_MailboxNumber");
            }
            case 32: {
                return PhoneActivity.evListItemEventSender().equals("Button_NetworkSelection");
            }
            case 33: {
                return PhoneActivity.evListItemEventSender().equals("Button_UserProfileName");
            }
            case 34: {
                return PhoneActivity.evListItemEventSender().equals("Button_ContactDeviceSelection");
            }
            case 35: {
                return PhoneActivity.evListItemEventSender().equals("Button_EditFavorites");
            }
            case 36: {
                return PhoneActivity.evListItemEventSender().equals("Button_InternalRingtone");
            }
            case 38: {
                return this.getInteger(-455409664) == 7;
            }
            case 45: {
                return !this.getBoolean(25430);
            }
            case 47: {
                return this.getInteger(-1995767552) == 1;
            }
            case 57: {
                return this.getInteger(-1995767552) == 1;
            }
            case 59: {
                return PhoneActivity.evListItemEventSender().equals("Button_AutomaticPIN");
            }
            case 60: {
                return PhoneActivity.evListItemEventSender().equals("Button_ChangePIN");
            }
            case 61: {
                return PhoneActivity.evListItemEventSender().equals("Button_AddSecondPIN") && !this.getBoolean(13996);
            }
            case 62: {
                return PhoneActivity.evListItemEventSender().equals("Button_ChangeNameCurrent");
            }
            case 63: {
                return PhoneActivity.evListItemEventSender().equals("Button_ChangeNameOther");
            }
            case 65: {
                return this.getBoolean(-1230569472);
            }
            case 69: {
                return this.getBoolean(31574);
            }
            case 71: {
                return PhoneActivity.evListItemEventSender().equals("Button_Profile");
            }
            case 72: {
                return PhoneActivity.evListItemEventSender().equals("Button_PhoneSelection");
            }
            case 73: {
                return PhoneActivity.evListItemEventSender().equals("Button_Security");
            }
            case 74: {
                return PhoneActivity.evListItemEventSender().equals("Button_Callsettings") && (this.getBoolean(30686) && this.getBoolean(20317) && this.getInteger(19495) == 1 || this.getBoolean(30686));
            }
            case 75: {
                return PhoneActivity.evListItemEventSender().equals("Button_Callforwarding");
            }
            case 76: {
                return PhoneActivity.evListItemEventSender().equals("Button_BluetoothSetup") && this.getBoolean(25376);
            }
            case 77: {
                return PhoneActivity.evListItemEventSender().equals("Button_DeleteCallstacks");
            }
            case 79: {
                return this.getInteger(-455409664) == 7;
            }
            case 80: {
                return this.getInteger(-455409664) == 5;
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIPhoneSetup(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 3: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 4: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 5: {
                this.triggerObserver(-335347648);
                this.setBoolean(-351993600, false);
                break;
            }
            case 6: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                if (this.getBoolean(-219152384)) {
                    this.setBoolean(632356864, true);
                }
                if (!this.getBoolean(-219152384)) break;
                this.triggerObserver(-956104640);
                break;
            }
            case 8: {
                PhoneActivity.lockWaitaphore(1072431104, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(781910016));
                this.triggerObserver(-150798272, eventGeneric);
                this.setBoolean(-877985792, true);
                break;
            }
            case 9: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 10: {
                this.triggerObserver(-318570432);
                this.setBoolean(1008075008, false);
                break;
            }
            case 11: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 13: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 14: {
                this.setInteger(-1096744960, 3);
                PhoneActivity.lockWaitaphore(-388825088, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1096744960));
                this.triggerObserver(-1039990720, eventGeneric);
                break;
            }
            case 15: {
                this.setBoolean(11972, false);
                break;
            }
            case 17: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 18: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                if (!this.getBoolean(-219152384)) break;
                this.triggerObserver(-956104640);
                break;
            }
            case 19: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 25: {
                this.setString(852492288, this.getString(15902));
                PhoneActivity.lockWaitaphore(12518, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(852492288));
                this.triggerObserver(0x6040040, eventGeneric);
                this.setBoolean(-877985792, true);
                break;
            }
            case 29: {
                this.setBoolean(1725235200, false);
                break;
            }
            case 31: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 32: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 33: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 35: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 36: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 38: {
                this.setInteger(-455409664, 0);
                break;
            }
            case 40: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 44: {
                this.setInteger(-728760320, 0);
                PhoneActivity.lockWaitaphore(986382336, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-728760320));
                this.triggerObserver(419692608, eventGeneric);
                this.setBoolean(-877985792, true);
                break;
            }
            case 45: {
                this.setString(148635648, this.getI18nString(3770));
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 46: {
                this.setBoolean(1557266432, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(1557266432));
                this.triggerObserver(0xB040040, eventGeneric);
                if (!this.getBoolean(13996)) break;
                this.triggerObserver(369754176);
                break;
            }
            case 47: {
                this.setString(148635648, this.getI18nString(3771));
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(27884));
                this.triggerObserver(-301727680, eventGeneric);
                break;
            }
            case 48: {
                this.setBoolean(1557266432, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(1557266432));
                this.triggerObserver(0xB040040, eventGeneric);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 50: {
                PhoneActivity.lockWaitaphore(14878, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(-1994063616));
                eventGeneric.setInt(1, 0);
                this.triggerObserver(0x10040040, eventGeneric);
                this.setBoolean(-877985792, true);
                break;
            }
            case 52: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 54: {
                this.setInteger(-728760320, 0);
                PhoneActivity.lockWaitaphore(986382336, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-728760320));
                this.triggerObserver(419692608, eventGeneric);
                this.setBoolean(-877985792, true);
                break;
            }
            case 55: {
                this.setInteger(-728760320, 1);
                PhoneActivity.lockWaitaphore(986382336, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-728760320));
                this.triggerObserver(419692608, eventGeneric);
                this.setBoolean(-877985792, true);
                break;
            }
            case 56: {
                this.setInteger(-728760320, 2);
                PhoneActivity.lockWaitaphore(986382336, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-728760320));
                this.triggerObserver(419692608, eventGeneric);
                this.setBoolean(-877985792, true);
                break;
            }
            case 57: {
                this.setString(148635648, this.getI18nString(3771));
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(27884));
                this.triggerObserver(-301727680, eventGeneric);
                break;
            }
            case 58: {
                this.triggerObserver(436469824);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 559582537);
                break;
            }
            case 60: {
                this.setString(1394278656, this.getI18nString(3865));
                this.setBoolean(-1930428416, false);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 61: {
                this.setString(1394278656, this.getI18nString(3864));
                this.setBoolean(-1930428416, true);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 62: {
                this.setString(-1994063616, this.getString(23282));
                this.setInteger(27316, 0);
                this.setString(-31063808, this.getI18nString(3812));
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 63: {
                this.setString(-1994063616, this.getString(0x11070100));
                this.setInteger(27316, 1);
                this.setString(-31063808, this.getI18nString(3813));
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 65: {
                this.setBoolean(-1230569472, false);
                break;
            }
            case 69: {
                this.setBoolean(31574, false);
                break;
            }
            case 71: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 73: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 74: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 75: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 76: {
                this.setInteger(906100992, 0);
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 80: {
                this.setInteger(-455409664, 0);
                break;
            }
            case 81: {
                this.setInteger(-455409664, 0);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIPhoneSetupContactsSelection(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setBoolean(606077184, true);
                this.triggerObserver(-1358495680);
                break;
            }
            case 5: {
                this.showView("Pscs_E26B", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    private void performStateExitAction_SubIPhoneSetupContactsSelection(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.triggerObserver(-2113732544);
                break;
            }
            case 5: {
                this.hideView("Pscs_E26B");
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubIPhoneSetupContactsSelection(int n) {
        this.performInternalTransitionAction_SubIPhoneSetupContactsSelection0(n);
    }

    private void performInternalTransitionAction_SubIPhoneSetupContactsSelection0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setInteger(27147, PhoneActivity.evListItemActionIndex());
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubIPhoneSetupContactsSelection(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                return !this.getLicValue(3603, 4, this.getInteger(27147), false);
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubIPhoneSetupContactsSelection(int n) {
        this.performTriggeredTransitionAction_SubIPhoneSetupContactsSelection0(n);
    }

    private void performTriggeredTransitionAction_SubIPhoneSetupContactsSelection0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 1: {
                this.setInteger(0xE990000, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(0xE990000));
                this.triggerObserver(302645312, eventGeneric);
                this.setBoolean(972947456, false);
                this.setBoolean(-1747910656, true);
                this.setString(-557318144, this.getLicValue(3603, 0, this.getInteger(27147), ""));
                this.setString(-1428750336, this.getI18nStrings(200)[this.getLicValue(3603, 1, this.getInteger(27147), 0)]);
                this.setInteger(28224, this.getLicValue(3603, 1, this.getInteger(27147), 0));
                this.setBoolean(25160, this.getLicValue(3603, 4, this.getInteger(27147), false));
                this.setString(-407306240, this.getString(227999744));
                break;
            }
        }
    }

    private void performUntriggeredTransitionAction_SubIPhoneSetupContactsSelection(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIPhoneSetupContactsSelectionWait(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.triggerObserver(-1358495680);
                break;
            }
            case 5: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 2069466441);
                break;
            }
        }
    }

    private void performStateExitAction_SubIPhoneSetupContactsSelectionWait(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.triggerObserver(-2113732544);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIPhoneSetupContactsSelectionWait(int n) {
        switch (n - this.UT_OFFSET) {
            case 3: {
                return this.getBoolean(-522977280) && this.getBoolean(25376) && this.getListItemControl(3603, true).getItemCount() == 0;
            }
            case 4: {
                return this.getBoolean(-522977280) && this.getBoolean(25376) && this.getListItemControl(3603, true).getItemCount() > 0;
            }
            case 6: {
                return !this.getBoolean(25376);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIPhoneSetupContactsSelectionWait(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 4: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 6: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -866546359);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIPhoneSetupMailboxNumberChoose(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.enterWaitaphoreForProperty(802095104, 477, 587, 2120846665, 2104069449);
                break;
            }
            case 6: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Psmne", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    private void performStateExitAction_SubIPhoneSetupMailboxNumberChoose(int n) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.leaveWaitaphore();
                break;
            }
            case 6: {
                this.hideView("Psmne");
                this.triggerObserver(822345792);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(-877985792, false);
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubIPhoneSetupMailboxNumberChoose(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                return !this.getBoolean(-877985792);
            }
            case 4: {
                return PhoneActivity.evSpellerValuePressedChar().equals("0");
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubIPhoneSetupMailboxNumberChoose(int n) {
        this.performInternalTransitionAction_SubIPhoneSetupMailboxNumberChoose0(n);
    }

    private void performInternalTransitionAction_SubIPhoneSetupMailboxNumberChoose0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -345666231);
                break;
            }
            case 1: {
                this.triggerObserver(839123008);
                break;
            }
            case 2: {
                this.triggerObserver(0x34040040);
                break;
            }
            case 3: {
                this.setString(25633, PhoneActivity.evSpellerValuePressedChar());
                this.setInteger(-1341193984, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(-1662779392, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(15140, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(25633));
                eventGeneric.setInt(1, this.getInteger(-1662779392));
                eventGeneric.setInt(2, this.getInteger(15140));
                eventGeneric.setInt(3, this.getInteger(-1341193984));
                this.triggerObserver(-581167808, eventGeneric);
                break;
            }
            case 4: {
                this.setString(25633, "+");
                this.setInteger(-1341193984, PhoneActivity.evSpellerValueCursorPosition());
                this.setInteger(-1662779392, PhoneActivity.evSpellerValueSelectionStart());
                this.setInteger(15140, PhoneActivity.evSpellerValueSelectionEnd());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(25633));
                eventGeneric.setInt(1, this.getInteger(-1662779392));
                eventGeneric.setInt(2, this.getInteger(15140));
                eventGeneric.setInt(3, this.getInteger(-1341193984));
                this.triggerObserver(-581167808, eventGeneric);
                break;
            }
            case 5: {
                this.setInteger(2041446400, PhoneActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(2041446400));
                this.triggerObserver(939786304, eventGeneric);
                break;
            }
        }
    }

    private void performUntriggeredTransitionAction_SubIPhoneSetupMailboxNumberChoose(int n) {
        switch (n - this.UT_OFFSET) {
            case 2: {
                this.setString(-153550848, this.getString(1827930112));
                PhoneActivity.lockWaitaphore(802095104, 10000);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setString(0, this.getString(-153550848));
                this.triggerObserver(889454656, eventGeneric);
                this.setBoolean(-877985792, true);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIPhoneSetupNetworkSelection(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setBoolean(606077184, true);
                break;
            }
            case 3: {
                this.showView("Psns", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 4: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1017541303);
                break;
            }
        }
    }

    private void performStateExitAction_SubIPhoneSetupNetworkSelection(int n) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.hideView("Psns");
                this.triggerObserver(-564390592);
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubIPhoneSetupNetworkSelection(int n) {
        this.performInternalTransitionAction_SubIPhoneSetupNetworkSelection0(n);
    }

    private void performInternalTransitionAction_SubIPhoneSetupNetworkSelection0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setBoolean(29881, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(29881));
                this.triggerObserver(-603783104, eventGeneric);
                this.setInteger(16784, PhoneActivity.evListItemActionIndex());
                eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(16784));
                this.triggerObserver(-620560320, eventGeneric);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 559582537);
                break;
            }
            case 1: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -413561527);
                break;
            }
            case 3: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -430338743);
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubIPhoneSetupNetworkSelection(int n) {
        this.performTriggeredTransitionAction_SubIPhoneSetupNetworkSelection0(n);
    }

    private void performTriggeredTransitionAction_SubIPhoneSetupNetworkSelection0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1587507895);
                break;
            }
            case 1: {
                this.setBoolean(29881, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(29881));
                this.triggerObserver(-603783104, eventGeneric);
                break;
            }
            case 4: {
                this.setBoolean(29881, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(29881));
                this.triggerObserver(-603783104, eventGeneric);
                break;
            }
            case 5: {
                this.triggerObserver(-587005888);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIPhoneSetupPhoneSelection(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setBoolean(606077184, true);
                this.triggerObserver(-1358495680);
                break;
            }
            case 5: {
                this.showView("Psps", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    private void performStateExitAction_SubIPhoneSetupPhoneSelection(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.triggerObserver(-2113732544);
                break;
            }
            case 5: {
                this.hideView("Psps");
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubIPhoneSetupPhoneSelection(int n) {
        switch (n - this.IT_OFFSET) {
            case 1: {
                return !this.getLicValue(1198, 5, this.getInteger(-1710489344), false) && this.getLicValue(1198, 6, this.getInteger(-1710489344), 0) != 0;
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubIPhoneSetupPhoneSelection(int n) {
        this.performInternalTransitionAction_SubIPhoneSetupPhoneSelection0(n);
    }

    private void performInternalTransitionAction_SubIPhoneSetupPhoneSelection0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setInteger(-1710489344, PhoneActivity.evListItemActionIndex());
                break;
            }
            case 1: {
                this.setInteger(2024996864, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(2024996864));
                this.triggerObserver(-570228672, eventGeneric);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubIPhoneSetupPhoneSelection(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                return !this.getLicValue(1198, 5, this.getInteger(-1710489344), false);
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubIPhoneSetupPhoneSelection(int n) {
        this.performTriggeredTransitionAction_SubIPhoneSetupPhoneSelection0(n);
    }

    private void performTriggeredTransitionAction_SubIPhoneSetupPhoneSelection0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.setInteger(2024996864, PhoneActivity.evListItemActionIndex());
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(2024996864));
                this.triggerObserver(-570228672, eventGeneric);
                this.setBoolean(972947456, false);
                this.setBoolean(-1747910656, this.getLicValue(1198, 3, this.getInteger(-1710489344), false));
                this.setString(-557318144, this.getLicValue(1198, 0, this.getInteger(-1710489344), ""));
                this.setString(-1428750336, this.getI18nStrings(200)[this.getLicValue(1198, 2, this.getInteger(-1710489344), 0)]);
                this.setInteger(28224, this.getLicValue(1198, 2, this.getInteger(-1710489344), 0));
                this.setBoolean(25160, this.getLicValue(1198, 5, this.getInteger(-1710489344), false));
                if (this.getInteger(19495) != 0 && (!this.getBoolean(26017) || this.getBoolean(1927938048))) {
                    this.setString(-407306240, this.getString(15902));
                }
                if (this.getInteger(1253703680) == 0 || !this.getBoolean(26017) && (this.getInteger(28224) != 1 || this.getInteger(1253703680) != 1)) break;
                this.setString(-407306240, this.getString(378994688));
                break;
            }
            case 1: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
        }
    }

    private void performUntriggeredTransitionAction_SubIPhoneSetupPhoneSelection(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIPhoneSetupPhoneSelectionWait(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.triggerObserver(-1358495680);
                break;
            }
            case 9: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, 2069466441);
                break;
            }
        }
    }

    private void performStateExitAction_SubIPhoneSetupPhoneSelectionWait(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.triggerObserver(-2113732544);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIPhoneSetupPhoneSelectionWait(int n) {
        switch (n - this.UT_OFFSET) {
            case 5: {
                return (!this.getBoolean(-522977280) || !this.getBoolean(25376)) && this.getListItemControl(1198, true).getItemCount() == 0;
            }
            case 6: {
                return this.getBoolean(-522977280) && this.getBoolean(25376) && this.getListItemControl(1198, true).getItemCount() == 0;
            }
            case 8: {
                return this.getBoolean(-522977280) && this.getBoolean(25376);
            }
            case 9: {
                return (!this.getBoolean(-522977280) || !this.getBoolean(25376)) && this.getInteger(938344448) == 2 && !this.getBoolean(151519488);
            }
            case 11: {
                return !this.getBoolean(25376) && (this.getInteger(938344448) != 2 || this.getBoolean(151519488));
            }
            case 12: {
                return this.getInteger(938344448) == 2 && !this.getBoolean(151519488) && this.getBoolean(30686);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIPhoneSetupPhoneSelectionWait(int n) {
        switch (n - this.UT_OFFSET) {
            case 2: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 3: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 6: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 7: {
                PhoneActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 8: {
                this.setBoolean(0x11F00000, true);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(0x11F00000));
                this.triggerObserver(-351731648, eventGeneric);
                this.setBoolean(1022754816, false);
                eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(1022754816));
                this.triggerObserver(-334954432, eventGeneric);
                break;
            }
            case 9: {
                this.setBoolean(0x11F00000, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(0x11F00000));
                this.triggerObserver(-351731648, eventGeneric);
                this.setBoolean(1022754816, true);
                eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(1022754816));
                this.triggerObserver(-334954432, eventGeneric);
                break;
            }
            case 11: {
                PhoneActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -866546359);
                break;
            }
            case 12: {
                this.setBoolean(0x11F00000, false);
                EventGeneric eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(0x11F00000));
                this.triggerObserver(-351731648, eventGeneric);
                this.setBoolean(1022754816, true);
                eventGeneric = PhoneActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(1022754816));
                this.triggerObserver(-334954432, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPromptingPhoneDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                PhoneActivity.changeSdFeatureCollection(this.topStatemachine.getSpeechIndex(), this.topStatemachine.getSpeechClientId());
                break;
            }
            case 3: {
                PhoneActivity.pushSdFeatureCollection(this.topStatemachine.getSpeechIndex(), 10);
                break;
            }
            case 5: {
                PhoneActivity.pushSdFeatureCollection(this.topStatemachine.getSpeechIndex(), 9);
                PhoneActivity.changeSdFeatureCollection(this.topStatemachine.getSpeechIndex(), this.topStatemachine.getSpeechClientId());
                break;
            }
            case 6: {
                PhoneActivity.changeSdFeatureCollection(this.topStatemachine.getSpeechIndex(), this.topStatemachine.getSpeechClientId());
                break;
            }
        }
    }

    private void performStateExitAction_SubPromptingPhoneDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 3: {
                PhoneActivity.popSdFeatureCollection(this.topStatemachine.getSpeechIndex());
                break;
            }
            case 5: {
                PhoneActivity.popSdFeatureCollection(this.topStatemachine.getSpeechIndex());
                break;
            }
        }
    }
}

