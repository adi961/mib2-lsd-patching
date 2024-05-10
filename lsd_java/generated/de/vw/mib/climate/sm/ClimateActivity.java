/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.climate.sm;

import de.vw.mib.genericevents.EventGeneric;
import de.vw.mib.sm.internal.statemachine.TopStatemachine;
import generated.de.vw.mib.global.datapool.SkinDataPool;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineActivityBase;

public class ClimateActivity
extends StatemachineActivityBase {
    private final int subStatemachineId;

    public ClimateActivity(TopStatemachine topStatemachine, int n, int n2, int n3, int n4, int n5) {
        super(topStatemachine, n2, n3, n4, n5);
        this.subStatemachineId = n;
    }

    @Override
    public void performStateEntryAction(int n, boolean bl) {
        switch (this.subStatemachineId) {
            case 167: {
                this.performStateEntryAction_SubPopupPoAlertClimateDiagKl15offDynState(n, bl);
                break;
            }
            case 199: {
                this.performStateEntryAction_SubPopupPoClimateAirdistributionDynState(n, bl);
                break;
            }
            case 200: {
                this.performStateEntryAction_SubPopupPoClimateTemperatureDynState(n, bl);
                break;
            }
            case 304: {
                this.performStateEntryAction_SubPopupPoDisclaimerClimateFunctionFailureDynState(n, bl);
                break;
            }
            case 305: {
                this.performStateEntryAction_SubPopupPoDisclaimerClimateSetupIsNotAvailableDynState(n, bl);
                break;
            }
            case 362: {
                this.performStateEntryAction_SubPopupPoInfoClimateParkheaterNotOperationalDynState(n, bl);
                break;
            }
            case 363: {
                this.performStateEntryAction_SubPopupPoInfoClimateSeatheaterVentilationDynState(n, bl);
                break;
            }
            case 6: {
                this.performStateEntryAction_SubHapticClimateDynState(n, bl);
                break;
            }
            case 652: {
                this.performStateEntryAction_SubIClimateEntryInclude(n, bl);
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
            case 679: {
                this.performStateEntryAction_SubIParkHeatingBridge(n, bl);
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
            case 167: {
                this.performStateExitAction_SubPopupPoAlertClimateDiagKl15offDynState(n);
                break;
            }
            case 199: {
                this.performStateExitAction_SubPopupPoClimateAirdistributionDynState(n);
                break;
            }
            case 200: {
                this.performStateExitAction_SubPopupPoClimateTemperatureDynState(n);
                break;
            }
            case 304: {
                this.performStateExitAction_SubPopupPoDisclaimerClimateFunctionFailureDynState(n);
                break;
            }
            case 305: {
                this.performStateExitAction_SubPopupPoDisclaimerClimateSetupIsNotAvailableDynState(n);
                break;
            }
            case 362: {
                this.performStateExitAction_SubPopupPoInfoClimateParkheaterNotOperationalDynState(n);
                break;
            }
            case 363: {
                this.performStateExitAction_SubPopupPoInfoClimateSeatheaterVentilationDynState(n);
                break;
            }
            case 6: {
                this.performStateExitAction_SubHapticClimateDynState(n);
                break;
            }
            case 652: {
                this.performStateExitAction_SubIClimateEntryInclude(n);
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
            case 679: {
                this.performStateExitAction_SubIParkHeatingBridge(n);
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
            case 167: {
                return this.evalInternalTransitionGuard_SubPopupPoAlertClimateDiagKl15offDynState(n);
            }
            case 363: {
                return this.evalInternalTransitionGuard_SubPopupPoInfoClimateSeatheaterVentilationDynState(n);
            }
            case 6: {
                return this.evalInternalTransitionGuard_SubHapticClimateDynState(n);
            }
            case 652: {
                return this.evalInternalTransitionGuard_SubIClimateEntryInclude(n);
            }
        }
        return true;
    }

    @Override
    public void performInternalTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 167: {
                this.performInternalTransitionAction_SubPopupPoAlertClimateDiagKl15offDynState(n);
                break;
            }
            case 199: {
                this.performInternalTransitionAction_SubPopupPoClimateAirdistributionDynState(n);
                break;
            }
            case 200: {
                this.performInternalTransitionAction_SubPopupPoClimateTemperatureDynState(n);
                break;
            }
            case 363: {
                this.performInternalTransitionAction_SubPopupPoInfoClimateSeatheaterVentilationDynState(n);
                break;
            }
            case 6: {
                this.performInternalTransitionAction_SubHapticClimateDynState(n);
                break;
            }
            case 652: {
                this.performInternalTransitionAction_SubIClimateEntryInclude(n);
                break;
            }
            case 679: {
                this.performInternalTransitionAction_SubIParkHeatingBridge(n);
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
            case 679: {
                return this.evalTriggeredTransitionGuard_SubIParkHeatingBridge(n);
            }
        }
        return true;
    }

    @Override
    public void performTriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 652: {
                this.performTriggeredTransitionAction_SubIClimateEntryInclude(n);
                break;
            }
            case 679: {
                this.performTriggeredTransitionAction_SubIParkHeatingBridge(n);
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
            case 199: {
                return this.evalUntriggeredTransitionGuard_SubPopupPoClimateAirdistributionDynState(n);
            }
            case 652: {
                return this.evalUntriggeredTransitionGuard_SubIClimateEntryInclude(n);
            }
            case 679: {
                return this.evalUntriggeredTransitionGuard_SubIParkHeatingBridge(n);
            }
        }
        return true;
    }

    @Override
    public void performUntriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 199: {
                this.performUntriggeredTransitionAction_SubPopupPoClimateAirdistributionDynState(n);
                break;
            }
            case 652: {
                this.performUntriggeredTransitionAction_SubIClimateEntryInclude(n);
                break;
            }
            case 679: {
                this.performUntriggeredTransitionAction_SubIParkHeatingBridge(n);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertClimateDiagKl15offDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pacdk", 167, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertClimateDiagKl15offDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                ClimateActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pacdk");
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubPopupPoAlertClimateDiagKl15offDynState(int n) {
        switch (n - this.IT_OFFSET) {
            case 1: {
                return this.getBoolean(-1175977984);
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubPopupPoAlertClimateDiagKl15offDynState(int n) {
        this.performInternalTransitionAction_SubPopupPoAlertClimateDiagKl15offDynState0(n);
    }

    private void performInternalTransitionAction_SubPopupPoAlertClimateDiagKl15offDynState0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1553953463);
                break;
            }
            case 1: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1553953463);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoClimateAirdistributionDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 4: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -715158199);
                this.enterPopupView("Pca", 199, 4);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoClimateAirdistributionDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                ClimateActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 4: {
                this.leavePopupView("Pca");
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -698380983);
                this.triggerObserver(-1048182464);
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubPopupPoClimateAirdistributionDynState(int n) {
        this.performInternalTransitionAction_SubPopupPoClimateAirdistributionDynState0(n);
    }

    private void performInternalTransitionAction_SubPopupPoClimateAirdistributionDynState0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -715158199);
                break;
            }
            case 1: {
                this.setInteger(851378176, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(851378176));
                this.triggerObserver(-1132068544, eventGeneric);
                break;
            }
            case 2: {
                this.setInteger(-75497472, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-75497472));
                this.triggerObserver(-1115291328, eventGeneric);
                break;
            }
            case 3: {
                this.setInteger(638976256, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(638976256));
                this.triggerObserver(-1148845760, eventGeneric);
                break;
            }
            case 4: {
                this.setInteger(29492, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(29492));
                this.triggerObserver(-1182400192, eventGeneric);
                break;
            }
            case 5: {
                this.setInteger(-458620928, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-458620928));
                this.triggerObserver(-1098514112, eventGeneric);
                break;
            }
            case 6: {
                this.setInteger(-1172242176, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1172242176));
                this.triggerObserver(-1165622976, eventGeneric);
                break;
            }
            case 7: {
                this.setInteger(-2020016128, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2020016128));
                this.triggerObserver(-1450835648, eventGeneric);
                break;
            }
            case 8: {
                this.setInteger(-439025664, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-439025664));
                this.triggerObserver(-1434058432, eventGeneric);
                break;
            }
            case 9: {
                this.setInteger(1578696960, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1578696960));
                this.triggerObserver(-1417281216, eventGeneric);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubPopupPoClimateAirdistributionDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                return this.getBoolean(-1339883264);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubPopupPoClimateAirdistributionDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                this.triggerObserver(-1048182464);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoClimateTemperatureDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 174493001);
                this.enterPopupView("Pct", 200, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoClimateTemperatureDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                ClimateActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pct");
                this.triggerObserver(-947519168);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 191270217);
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubPopupPoClimateTemperatureDynState(int n) {
        this.performInternalTransitionAction_SubPopupPoClimateTemperatureDynState0(n);
    }

    private void performInternalTransitionAction_SubPopupPoClimateTemperatureDynState0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 174493001);
                break;
            }
            case 1: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 174493001);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoDisclaimerClimateFunctionFailureDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pdcff", 304, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoDisclaimerClimateFunctionFailureDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                ClimateActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pdcff");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoDisclaimerClimateSetupIsNotAvailableDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pdcsina", 305, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoDisclaimerClimateSetupIsNotAvailableDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                ClimateActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pdcsina");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoClimateParkheaterNotOperationalDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Picpno", 362, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoClimateParkheaterNotOperationalDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                ClimateActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Picpno");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoClimateSeatheaterVentilationDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                this.enterPopupView("Picsv", 363, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoClimateSeatheaterVentilationDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                ClimateActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Picsv");
                if (this.getBoolean(-205193216)) {
                    this.triggerObserver(-1534721728);
                }
                if (this.getBoolean(-1281359872)) {
                    this.triggerObserver(-1551498944);
                }
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -664826551);
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubPopupPoInfoClimateSeatheaterVentilationDynState(int n) {
        switch (n - this.IT_OFFSET) {
            case 18: {
                return this.getBoolean(1926889472);
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubPopupPoInfoClimateSeatheaterVentilationDynState(int n) {
        this.performInternalTransitionAction_SubPopupPoInfoClimateSeatheaterVentilationDynState00(n);
    }

    private void performInternalTransitionAction_SubPopupPoInfoClimateSeatheaterVentilationDynState00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setBoolean(-1281359872, true);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 1: {
                this.setBoolean(-205193216, true);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 2: {
                this.setInteger(-944439296, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-944439296));
                this.triggerObserver(-134217664, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 3: {
                this.setInteger(-944439296, 1);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-944439296));
                this.triggerObserver(-134217664, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 4: {
                this.setInteger(-944439296, 2);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-944439296));
                this.triggerObserver(-134217664, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 5: {
                this.setInteger(-944439296, 3);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-944439296));
                this.triggerObserver(-134217664, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 6: {
                this.setInteger(20422, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(20422));
                this.triggerObserver(-117440448, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 7: {
                this.setInteger(20422, 1);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(20422));
                this.triggerObserver(-117440448, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 8: {
                this.setInteger(20422, 2);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(20422));
                this.triggerObserver(-117440448, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 9: {
                this.setInteger(20422, 3);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(20422));
                this.triggerObserver(-117440448, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 10: {
                this.setInteger(-2003304448, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2003304448));
                this.triggerObserver(-100663232, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 11: {
                this.setInteger(-2003304448, 1);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2003304448));
                this.triggerObserver(-100663232, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 12: {
                this.setInteger(-2003304448, 2);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2003304448));
                this.triggerObserver(-100663232, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 13: {
                this.setInteger(-2003304448, 3);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2003304448));
                this.triggerObserver(-100663232, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 14: {
                this.setInteger(-655687680, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-655687680));
                this.triggerObserver(-83886016, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 15: {
                this.setInteger(-655687680, 1);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-655687680));
                this.triggerObserver(-83886016, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 16: {
                this.setInteger(-655687680, 2);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-655687680));
                this.triggerObserver(-83886016, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 17: {
                this.setInteger(-655687680, 3);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-655687680));
                this.triggerObserver(-83886016, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 18: {
                this.triggerObserver(-201326528);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 19: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1235186359);
                break;
            }
            case 20: {
                if (this.getBoolean(21904)) {
                    this.triggerObserver(-201326528);
                }
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 21: {
                EventGeneric eventGeneric;
                if (!this.getBoolean(21904)) {
                    this.setInteger(18028, 0);
                    eventGeneric = ClimateActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(18028));
                    this.triggerObserver(-897187520, eventGeneric);
                }
                if (this.getBoolean(21904)) {
                    this.setInteger(902889472, 0);
                    eventGeneric = ClimateActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(902889472));
                    this.triggerObserver(1711996992, eventGeneric);
                }
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 22: {
                EventGeneric eventGeneric;
                if (!this.getBoolean(21904)) {
                    this.setInteger(18028, 1);
                    eventGeneric = ClimateActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(18028));
                    this.triggerObserver(-897187520, eventGeneric);
                }
                if (this.getBoolean(21904)) {
                    this.setInteger(902889472, 1);
                    eventGeneric = ClimateActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(902889472));
                    this.triggerObserver(1711996992, eventGeneric);
                }
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
            case 23: {
                EventGeneric eventGeneric;
                if (!this.getBoolean(21904)) {
                    this.setInteger(18028, 2);
                    eventGeneric = ClimateActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(18028));
                    this.triggerObserver(-897187520, eventGeneric);
                }
                if (this.getBoolean(21904)) {
                    this.setInteger(902889472, 2);
                    eventGeneric = ClimateActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(902889472));
                    this.triggerObserver(1711996992, eventGeneric);
                }
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -681603767);
                break;
            }
        }
    }

    private void performStateEntryAction_SubHapticClimateDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(1471086592, 2);
                break;
            }
            case 8: {
                this.setInteger(25296896, 12);
                this.setInteger(1471086592, 3);
                this.setInteger(22399, this.getInteger(-452263680));
                ClimateActivity.changeContext("Climate");
                break;
            }
            case 11: {
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 1247907145);
                break;
            }
            case 12: {
                this.setInteger(1471086592, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubHapticClimateDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(1471086592, 0);
                break;
            }
            case 8: {
                this.setInteger(25296896, 0);
                if (this.getBoolean(-1175977984)) break;
                this.setInteger(-452263680, this.getInteger(22399));
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 1264618825);
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubHapticClimateDynState(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                return this.getBoolean(-1175977984);
            }
            case 1: {
                return this.getBoolean(-1175977984);
            }
            case 2: {
                return this.getBoolean(-1175977984);
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubHapticClimateDynState(int n) {
        this.performInternalTransitionAction_SubHapticClimateDynState0(n);
    }

    private void performInternalTransitionAction_SubHapticClimateDynState0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setBoolean(-1281359872, true);
                this.setBoolean(-205193216, false);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1012567369);
                break;
            }
            case 1: {
                this.setBoolean(-1281359872, false);
                this.setBoolean(-205193216, true);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1012567369);
                break;
            }
            case 2: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 660245833);
                break;
            }
            case 3: {
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 1197509961);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIClimateEntryInclude(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(336199936, 6);
                this.setInteger(416415744, SkinDataPool.getInteger(190));
                break;
            }
            case 4: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -278950583);
                this.triggerObserver(-1568276160);
                if (this.getBoolean(0x21220100) && this.getBoolean(328531968)) break;
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -312505015);
                break;
            }
            case 7: {
                this.triggerObserver(-930741952);
                this.setInteger(-1373110016, 1197509961);
                this.setFlagVector(29124, this.getFlagVector(-1813577728));
                break;
            }
            case 10: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 274763081);
                this.showView("Cdd", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 15: {
                this.showView("Cdfi", bl, 145);
                break;
            }
            case 16: {
                this.showView("Cp", bl, 110);
                break;
            }
            case 17: {
                this.showView("Csa", bl, 107);
                break;
            }
        }
    }

    private void performStateExitAction_SubIClimateEntryInclude(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(416415744, SkinDataPool.getInteger(180));
                break;
            }
            case 4: {
                this.triggerObserver(-33554368);
                break;
            }
            case 7: {
                this.triggerObserver(-913964736);
                break;
            }
            case 10: {
                this.hideView("Cdd");
                this.setBoolean(-1339883264, false);
                break;
            }
            case 15: {
                this.hideView("Cdfi");
                break;
            }
            case 16: {
                this.hideView("Cp");
                break;
            }
            case 17: {
                this.hideView("Csa");
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubIClimateEntryInclude(int n) {
        switch (n - this.IT_OFFSET) {
            case 5: {
                return this.getBoolean(0x21220100) && this.getBoolean(328531968);
            }
            case 6: {
                return !this.getBoolean(0x21220100) || !this.getBoolean(328531968);
            }
            case 7: {
                return this.getInteger(-659488768) == 1 || this.getBoolean(1033437184);
            }
            case 8: {
                return this.getBoolean(0x21220100) && (this.getInteger(-659488768) == 1 || this.getBoolean(1033437184)) && this.getBoolean(328531968);
            }
            case 9: {
                return !(this.getInteger(-659488768) != 1 && !this.getBoolean(1033437184) || this.getBoolean(0x21220100) && this.getBoolean(328531968));
            }
            case 10: {
                return this.getInteger(-659488768) == 0 || this.getInteger(-659488768) == 1;
            }
            case 11: {
                return !this.getBoolean(-1175977984);
            }
            case 39: {
                return !this.getBoolean(21769);
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubIClimateEntryInclude(int n) {
        this.performInternalTransitionAction_SubIClimateEntryInclude00(n);
    }

    private void performInternalTransitionAction_SubIClimateEntryInclude00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setInteger(416415744, SkinDataPool.getInteger(190));
                break;
            }
            case 1: {
                this.setInteger(416415744, SkinDataPool.getInteger(180));
                break;
            }
            case 2: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -312505015);
                break;
            }
            case 3: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -312505015);
                break;
            }
            case 4: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -312505015);
                break;
            }
            case 5: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -312505015);
                break;
            }
            case 6: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -312505015);
                break;
            }
            case 7: {
                if (!this.getBoolean(0x21220100) || !this.getBoolean(328531968)) {
                    this.setInteger(18728, 15000);
                }
                if (this.getBoolean(0x21220100) && this.getBoolean(328531968)) {
                    this.setInteger(18728, 10000);
                }
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(18728));
                this.triggerObserver(-150536128, eventGeneric);
                break;
            }
            case 8: {
                this.triggerObserver(-133758912);
                break;
            }
            case 9: {
                this.triggerObserver(-133758912);
                break;
            }
            case 10: {
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 1415613769);
                break;
            }
            case 11: {
                if (this.getInteger(-659488768) != 0 && this.getInteger(-659488768) != 1) {
                    ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 962170185);
                }
                if (this.getInteger(-659488768) != 0 && this.getInteger(-659488768) != 1) break;
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 1415613769);
                break;
            }
            case 13: {
                if (!this.getBoolean(31502)) {
                    this.triggerObserver(-1568276160);
                }
                if (!this.getBoolean(31502)) break;
                this.triggerObserver(-33554368);
                break;
            }
            case 14: {
                this.setInteger(22948, ClimateActivity.evListItemActionIndex());
                this.setInteger(636551168, ClimateActivity.evListItemActionIndex());
                break;
            }
            case 15: {
                if (this.getBoolean(-402194176)) {
                    this.setInteger(12740, ClimateActivity.evListItemActionIndex());
                    this.setInteger(636551168, ClimateActivity.evListItemActionIndex());
                }
                if (this.getBoolean(-402194176)) break;
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 811240777);
                break;
            }
            case 16: {
                EventGeneric eventGeneric;
                this.setInteger(952565760, ClimateActivity.evListItemActionIndex());
                if (ClimateActivity.evListItemEventSender().equals("BtnIncreaseTemp")) {
                    this.setInteger(10209, 1);
                    eventGeneric = ClimateActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(952565760));
                    eventGeneric.setInt(1, this.getInteger(10209));
                    this.triggerObserver(-1467612864, eventGeneric);
                }
                if (!ClimateActivity.evListItemEventSender().equals("BtnDecreaseTemp")) break;
                this.setInteger(10209, 0);
                eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(952565760));
                eventGeneric.setInt(1, this.getInteger(10209));
                this.triggerObserver(-1467612864, eventGeneric);
                break;
            }
            case 17: {
                this.setInteger(15452, ClimateActivity.evListItemActionIndex());
                this.setInteger(636551168, ClimateActivity.evListItemActionIndex());
                this.setInteger(532545536, ClimateActivity.evListItemActionIndex());
                break;
            }
            case 18: {
                this.triggerObserver(1258618944);
                break;
            }
            case 19: {
                this.setBoolean(-1339883264, true);
                break;
            }
            case 20: {
                this.triggerObserver(0x55050040);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 274763081);
                this.setBoolean(-1339883264, false);
                break;
            }
            case 21: {
                this.triggerObserver(0x55050040);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 274763081);
                break;
            }
            case 22: {
                this.setInteger(15452, -1);
                this.setInteger(636551168, -1);
                break;
            }
            case 23: {
                this.setInteger(-2112356096, this.getInteger(22948));
                this.setInteger(-1091698688, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2112356096));
                eventGeneric.setInt(1, this.getInteger(-1091698688));
                this.triggerObserver(-1517944512, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 274763081);
                break;
            }
            case 24: {
                this.setInteger(-2112356096, this.getInteger(22948));
                this.setInteger(-1091698688, 1);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2112356096));
                eventGeneric.setInt(1, this.getInteger(-1091698688));
                this.triggerObserver(-1517944512, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 274763081);
                break;
            }
            case 25: {
                this.setInteger(-2112356096, this.getInteger(22948));
                this.setInteger(-1091698688, 2);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2112356096));
                eventGeneric.setInt(1, this.getInteger(-1091698688));
                this.triggerObserver(-1517944512, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 274763081);
                break;
            }
            case 26: {
                this.setInteger(-2112356096, this.getInteger(22948));
                this.setInteger(-1091698688, 3);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2112356096));
                eventGeneric.setInt(1, this.getInteger(-1091698688));
                this.triggerObserver(-1517944512, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 274763081);
                break;
            }
            case 27: {
                this.setInteger(16952, this.getInteger(12740));
                this.setInteger(1669660672, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(16952));
                eventGeneric.setInt(1, this.getInteger(1669660672));
                this.triggerObserver(-1484390080, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 274763081);
                break;
            }
            case 28: {
                this.setInteger(16952, this.getInteger(12740));
                this.setInteger(1669660672, 1);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(16952));
                eventGeneric.setInt(1, this.getInteger(1669660672));
                this.triggerObserver(-1484390080, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 274763081);
                break;
            }
            case 29: {
                this.setInteger(16952, this.getInteger(12740));
                this.setInteger(1669660672, 2);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(16952));
                eventGeneric.setInt(1, this.getInteger(1669660672));
                this.triggerObserver(-1484390080, eventGeneric);
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 274763081);
                break;
            }
            case 30: {
                this.setInteger(1961033728, this.getInteger(532545536));
                this.setInteger(-236257280, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1961033728));
                eventGeneric.setInt(1, this.getInteger(-236257280));
                eventGeneric.setInt(2, this.getInteger(1844445184));
                this.triggerObserver(-1232731840, eventGeneric);
                break;
            }
            case 31: {
                this.setInteger(1961033728, this.getInteger(532545536));
                this.setInteger(-236257280, 1);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1961033728));
                eventGeneric.setInt(1, this.getInteger(-236257280));
                eventGeneric.setInt(2, this.getInteger(1844445184));
                this.triggerObserver(-1232731840, eventGeneric);
                break;
            }
            case 32: {
                this.setInteger(1961033728, this.getInteger(532545536));
                this.setInteger(-236257280, -1);
                this.setInteger(1844445184, ClimateActivity.evIntegerValueValue());
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1961033728));
                eventGeneric.setInt(1, this.getInteger(-236257280));
                eventGeneric.setInt(2, this.getInteger(1844445184));
                this.triggerObserver(-1232731840, eventGeneric);
                break;
            }
            case 33: {
                this.setInteger(-2020016128, this.getInteger(532545536));
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2020016128));
                this.triggerObserver(-1450835648, eventGeneric);
                break;
            }
            case 34: {
                this.setInteger(-439025664, this.getInteger(532545536));
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-439025664));
                this.triggerObserver(-1434058432, eventGeneric);
                break;
            }
            case 35: {
                this.setInteger(1578696960, this.getInteger(532545536));
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1578696960));
                this.triggerObserver(-1417281216, eventGeneric);
                break;
            }
            case 36: {
                this.setInteger(-830013440, this.getInteger(532545536));
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-830013440));
                this.triggerObserver(-1333395136, eventGeneric);
                break;
            }
            case 37: {
                this.setInteger(-773128192, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-773128192));
                this.triggerObserver(-1316617920, eventGeneric);
                break;
            }
            case 38: {
                this.setInteger(27890, 1);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(27890));
                this.triggerObserver(-1299840704, eventGeneric);
                break;
            }
            case 39: {
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 6327625);
                break;
            }
            case 40: {
                if (this.getBoolean(-1364393984)) {
                    this.triggerObserver(-167772096);
                }
                if (this.getBoolean(-1364393984)) break;
                this.triggerObserver(-150994880);
                break;
            }
            case 41: {
                if (this.getBoolean(12641)) {
                    this.triggerObserver(-1215954624);
                }
                if (this.getBoolean(12641)) break;
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 811240777);
                break;
            }
            case 42: {
                if (this.getBoolean(1926889472)) {
                    this.triggerObserver(-201326528);
                }
                if (this.getBoolean(1926889472) || !this.getBoolean(935002112)) break;
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 811240777);
                break;
            }
            case 43: {
                if (this.getBoolean(-1112408064)) {
                    this.triggerObserver(-184549312);
                }
                if (this.getBoolean(-1112408064)) break;
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 811240777);
                break;
            }
            case 44: {
                if (this.getBoolean(20849)) {
                    this.triggerObserver(-1601830592);
                }
                if (this.getBoolean(20849)) break;
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 811240777);
                break;
            }
            case 45: {
                if (!(this.getBoolean(-425852928) && this.getBoolean(870449152) || this.getBoolean(10142) && this.getBoolean(-3604480) || this.getBoolean(1040515328) && this.getBoolean(0x830000) || this.getBoolean(-652803840) || this.getBoolean(470089984) && this.getBoolean(25144) || this.getBoolean(1894383616) && this.getBoolean(12245) || this.getBoolean(935002112) && this.getBoolean(-2050293760))) {
                    ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 828017993);
                }
                if (!(this.getBoolean(-425852928) && this.getBoolean(870449152) || this.getBoolean(10142) && this.getBoolean(-3604480) || this.getBoolean(1040515328) && this.getBoolean(0x830000) || this.getBoolean(-652803840) || this.getBoolean(470089984) && this.getBoolean(25144) || this.getBoolean(1894383616) && this.getBoolean(12245)) && (!this.getBoolean(935002112) || !this.getBoolean(-2050293760))) break;
                ClimateActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 761302345);
                break;
            }
            case 46: {
                if (this.getBoolean(1926889472)) {
                    this.triggerObserver(-201326528);
                }
                if (this.getBoolean(1926889472) || !this.getBoolean(935002112)) break;
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 811240777);
                break;
            }
            case 47: {
                if (this.getBoolean(-1112408064)) {
                    this.triggerObserver(-184549312);
                }
                if (this.getBoolean(-1112408064)) break;
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 811240777);
                break;
            }
            case 48: {
                if (this.getBoolean(-417070848)) {
                    this.triggerObserver(-1199177408);
                }
                if (this.getBoolean(-417070848)) break;
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 811240777);
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubIClimateEntryInclude(int n) {
        this.performTriggeredTransitionAction_SubIClimateEntryInclude0(n);
    }

    private void performTriggeredTransitionAction_SubIClimateEntryInclude0(int n) {
        switch (n - this.TT_OFFSET) {
            case 2: {
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 5: {
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 811240777);
                break;
            }
            case 6: {
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, -1973908151);
                break;
            }
            case 7: {
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, -1990685367);
                break;
            }
            case 8: {
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIClimateEntryInclude(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                return this.getInteger(1374879744) == 0;
            }
            case 1: {
                return this.getInteger(1374879744) == 1;
            }
            case 9: {
                return !this.getBoolean(-417070848);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIClimateEntryInclude(int n) {
        switch (n - this.UT_OFFSET) {
            case 9: {
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 811240777);
                break;
            }
            case 10: {
                if (this.getBoolean(2114322688)) break;
                this.triggerObserver(-1199177408);
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

    private void performStateEntryAction_SubIParkHeatingBridge(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 9: {
                this.showView("Cpd", bl, 108);
                break;
            }
            case 10: {
                this.showView("Cptp", bl, 108);
                break;
            }
            case 11: {
                this.showView("Cpts", bl, 108);
                break;
            }
            case 12: {
                this.showView("Cpm", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    private void performStateExitAction_SubIParkHeatingBridge(int n) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.triggerObserver(-16777152);
                break;
            }
            case 9: {
                this.hideView("Cpd");
                break;
            }
            case 10: {
                this.hideView("Cptp");
                this.setInteger(1101791232, this.getInteger(-1174798336));
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1101791232));
                this.triggerObserver(1107886144, eventGeneric);
                break;
            }
            case 11: {
                this.hideView("Cpts");
                break;
            }
            case 12: {
                this.hideView("Cpm");
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubIParkHeatingBridge(int n) {
        this.performInternalTransitionAction_SubIParkHeatingBridge00(n);
    }

    private void performInternalTransitionAction_SubIParkHeatingBridge00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setInteger(-558563328, ClimateActivity.evIntegerValueValue());
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-558563328));
                this.triggerObserver(-318767040, eventGeneric);
                break;
            }
            case 1: {
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 291540297);
                break;
            }
            case 2: {
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, 308317513);
                break;
            }
            case 3: {
                this.setBoolean(919666688, true);
                this.setInteger(26018, this.getInteger(-1174798336));
                this.setInteger(-410189824, 2);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(26018));
                eventGeneric.setInt(1, this.getInteger(-410189824));
                this.triggerObserver(-285212608, eventGeneric);
                break;
            }
            case 4: {
                this.setBoolean(919666688, false);
                this.setInteger(1938030592, this.getInteger(-1174798336));
                this.setInteger(-1517879296, 2);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1938030592));
                eventGeneric.setInt(1, this.getInteger(-1517879296));
                this.triggerObserver(-301989824, eventGeneric);
                break;
            }
            case 5: {
                this.setBoolean(11992, true);
                this.setInteger(26018, this.getInteger(-1174798336));
                this.setInteger(-410189824, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(26018));
                eventGeneric.setInt(1, this.getInteger(-410189824));
                this.triggerObserver(-285212608, eventGeneric);
                break;
            }
            case 6: {
                this.setBoolean(11992, false);
                this.setInteger(1938030592, this.getInteger(-1174798336));
                this.setInteger(-1517879296, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1938030592));
                eventGeneric.setInt(1, this.getInteger(-1517879296));
                this.triggerObserver(-301989824, eventGeneric);
                break;
            }
            case 7: {
                this.setBoolean(935723008, true);
                this.setInteger(26018, this.getInteger(-1174798336));
                this.setInteger(-410189824, 1);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(26018));
                eventGeneric.setInt(1, this.getInteger(-410189824));
                this.triggerObserver(-285212608, eventGeneric);
                break;
            }
            case 8: {
                this.setBoolean(935723008, false);
                this.setInteger(1938030592, this.getInteger(-1174798336));
                this.setInteger(-1517879296, 1);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1938030592));
                eventGeneric.setInt(1, this.getInteger(-1517879296));
                this.triggerObserver(-301989824, eventGeneric);
                break;
            }
            case 9: {
                this.setBoolean(29786, true);
                this.setInteger(26018, this.getInteger(-1174798336));
                this.setInteger(-410189824, 3);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(26018));
                eventGeneric.setInt(1, this.getInteger(-410189824));
                this.triggerObserver(-285212608, eventGeneric);
                break;
            }
            case 10: {
                this.setBoolean(29786, false);
                this.setInteger(1938030592, this.getInteger(-1174798336));
                this.setInteger(-1517879296, 3);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1938030592));
                eventGeneric.setInt(1, this.getInteger(-1517879296));
                this.triggerObserver(-301989824, eventGeneric);
                break;
            }
            case 11: {
                this.setInteger(22295, this.getInteger(-1174798336));
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(22295));
                this.triggerObserver(-335544256, eventGeneric);
                break;
            }
            case 12: {
                this.setInteger(22295, -1);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(22295));
                this.triggerObserver(-335544256, eventGeneric);
                break;
            }
            case 13: {
                this.setInteger(22295, 0);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(22295));
                this.triggerObserver(-335544256, eventGeneric);
                break;
            }
            case 14: {
                this.setInteger(22295, 1);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(22295));
                this.triggerObserver(-335544256, eventGeneric);
                break;
            }
            case 15: {
                this.setInteger(22295, 2);
                EventGeneric eventGeneric = ClimateActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(22295));
                this.triggerObserver(-335544256, eventGeneric);
                break;
            }
            case 16: {
                this.triggerObserver(-67108800);
                break;
            }
            case 17: {
                if (this.getInteger(-283377408) == 0) break;
                this.triggerObserver(-50331584);
                break;
            }
            case 18: {
                if (this.getInteger(-283377408) != 0) break;
                this.triggerObserver(-50331584);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubIParkHeatingBridge(int n) {
        switch (n - this.TT_OFFSET) {
            case 4: {
                return this.getInteger(22674) != 0;
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubIParkHeatingBridge(int n) {
        this.performTriggeredTransitionAction_SubIParkHeatingBridge0(n);
    }

    private void performTriggeredTransitionAction_SubIParkHeatingBridge0(int n) {
        switch (n - this.TT_OFFSET) {
            case 8: {
                this.setInteger(-1174798336, 1);
                break;
            }
            case 9: {
                this.setInteger(-1174798336, 2);
                break;
            }
            case 10: {
                this.setInteger(-1174798336, 0);
                break;
            }
            case 11: {
                this.setInteger(-1174798336, 2);
                break;
            }
            case 13: {
                this.setInteger(-1174798336, 0);
                break;
            }
            case 14: {
                this.setInteger(-1174798336, 1);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIParkHeatingBridge(int n) {
        switch (n - this.UT_OFFSET) {
            case 3: {
                return !this.getBoolean(-23068672);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIParkHeatingBridge(int n) {
        switch (n - this.UT_OFFSET) {
            case 3: {
                ClimateActivity.fireHMIEvent(ANY, BROADCAST, -832991927);
                break;
            }
        }
    }
}

