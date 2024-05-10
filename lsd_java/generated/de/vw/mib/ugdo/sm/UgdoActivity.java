/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.ugdo.sm;

import de.vw.mib.genericevents.EventGeneric;
import de.vw.mib.sm.internal.statemachine.TopStatemachine;
import generated.de.vw.mib.global.datapool.SkinDataPool;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineActivityBase;

public class UgdoActivity
extends StatemachineActivityBase {
    private final int subStatemachineId;

    public UgdoActivity(TopStatemachine topStatemachine, int n, int n2, int n3, int n4, int n5) {
        super(topStatemachine, n2, n3, n4, n5);
        this.subStatemachineId = n;
    }

    @Override
    public void performStateEntryAction(int n, boolean bl) {
        switch (this.subStatemachineId) {
            case 196: {
                this.performStateEntryAction_SubPopupPoAlertUgdoDeleteErrorDynState(n, bl);
                break;
            }
            case 197: {
                this.performStateEntryAction_SubPopupPoAlertUgdoDeleteSuccessDynState(n, bl);
                break;
            }
            case 297: {
                this.performStateEntryAction_SubPopupPoConfirmUgdoDeleteDynState(n, bl);
                break;
            }
            case 298: {
                this.performStateEntryAction_SubPopupPoConfirmUgdoSyncDynState(n, bl);
                break;
            }
            case 299: {
                this.performStateEntryAction_SubPopupPoConfirmUgdoTeachDynState(n, bl);
                break;
            }
            case 65: {
                this.performStateEntryAction_SubHapticUgdoDynState(n, bl);
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
            case 196: {
                this.performStateExitAction_SubPopupPoAlertUgdoDeleteErrorDynState(n);
                break;
            }
            case 197: {
                this.performStateExitAction_SubPopupPoAlertUgdoDeleteSuccessDynState(n);
                break;
            }
            case 297: {
                this.performStateExitAction_SubPopupPoConfirmUgdoDeleteDynState(n);
                break;
            }
            case 298: {
                this.performStateExitAction_SubPopupPoConfirmUgdoSyncDynState(n);
                break;
            }
            case 299: {
                this.performStateExitAction_SubPopupPoConfirmUgdoTeachDynState(n);
                break;
            }
            case 65: {
                this.performStateExitAction_SubHapticUgdoDynState(n);
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
            case 298: {
                this.performStateFocusGainedAction_SubPopupPoConfirmUgdoSyncDynState(n);
                break;
            }
            case 299: {
                this.performStateFocusGainedAction_SubPopupPoConfirmUgdoTeachDynState(n);
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public void performStateFocusLostAction(int n) {
        switch (this.subStatemachineId) {
            case 298: {
                this.performStateFocusLostAction_SubPopupPoConfirmUgdoSyncDynState(n);
                break;
            }
            case 299: {
                this.performStateFocusLostAction_SubPopupPoConfirmUgdoTeachDynState(n);
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public boolean evalInternalTransitionGuard(int n) {
        switch (this.subStatemachineId) {
            case 298: {
                return this.evalInternalTransitionGuard_SubPopupPoConfirmUgdoSyncDynState(n);
            }
            case 299: {
                return this.evalInternalTransitionGuard_SubPopupPoConfirmUgdoTeachDynState(n);
            }
            case 65: {
                return this.evalInternalTransitionGuard_SubHapticUgdoDynState(n);
            }
        }
        return true;
    }

    @Override
    public void performInternalTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 196: {
                this.performInternalTransitionAction_SubPopupPoAlertUgdoDeleteErrorDynState(n);
                break;
            }
            case 197: {
                this.performInternalTransitionAction_SubPopupPoAlertUgdoDeleteSuccessDynState(n);
                break;
            }
            case 297: {
                this.performInternalTransitionAction_SubPopupPoConfirmUgdoDeleteDynState(n);
                break;
            }
            case 298: {
                this.performInternalTransitionAction_SubPopupPoConfirmUgdoSyncDynState(n);
                break;
            }
            case 299: {
                this.performInternalTransitionAction_SubPopupPoConfirmUgdoTeachDynState(n);
                break;
            }
            case 65: {
                this.performInternalTransitionAction_SubHapticUgdoDynState(n);
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
            case 65: {
                return this.evalTriggeredTransitionGuard_SubHapticUgdoDynState(n);
            }
        }
        return true;
    }

    @Override
    public void performTriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 298: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmUgdoSyncDynState(n);
                break;
            }
            case 299: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmUgdoTeachDynState(n);
                break;
            }
            case 65: {
                this.performTriggeredTransitionAction_SubHapticUgdoDynState(n);
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
            case 298: {
                return this.evalUntriggeredTransitionGuard_SubPopupPoConfirmUgdoSyncDynState(n);
            }
            case 299: {
                return this.evalUntriggeredTransitionGuard_SubPopupPoConfirmUgdoTeachDynState(n);
            }
            case 65: {
                return this.evalUntriggeredTransitionGuard_SubHapticUgdoDynState(n);
            }
        }
        return true;
    }

    @Override
    public void performUntriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 298: {
                this.performUntriggeredTransitionAction_SubPopupPoConfirmUgdoSyncDynState(n);
                break;
            }
            case 299: {
                this.performUntriggeredTransitionAction_SubPopupPoConfirmUgdoTeachDynState(n);
                break;
            }
            case 65: {
                this.performUntriggeredTransitionAction_SubHapticUgdoDynState(n);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertUgdoDeleteErrorDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Paude", 196, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertUgdoDeleteErrorDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                UgdoActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Paude");
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubPopupPoAlertUgdoDeleteErrorDynState(int n) {
        this.performInternalTransitionAction_SubPopupPoAlertUgdoDeleteErrorDynState0(n);
    }

    private void performInternalTransitionAction_SubPopupPoAlertUgdoDeleteErrorDynState0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 90606921);
                break;
            }
            case 1: {
                this.setInteger(252969216, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(252969216));
                eventGeneric.setInt(1, 0);
                this.triggerObserver(-483251904, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoAlertUgdoDeleteSuccessDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pauds", 197, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoAlertUgdoDeleteSuccessDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                UgdoActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pauds");
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubPopupPoAlertUgdoDeleteSuccessDynState(int n) {
        this.performInternalTransitionAction_SubPopupPoAlertUgdoDeleteSuccessDynState0(n);
    }

    private void performInternalTransitionAction_SubPopupPoAlertUgdoDeleteSuccessDynState0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 107384137);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmUgdoDeleteDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pcud", 297, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmUgdoDeleteDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                UgdoActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pcud");
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubPopupPoConfirmUgdoDeleteDynState(int n) {
        this.performInternalTransitionAction_SubPopupPoConfirmUgdoDeleteDynState0(n);
    }

    private void performInternalTransitionAction_SubPopupPoConfirmUgdoDeleteDynState0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setBoolean(1426260224, false);
                this.setInteger(252969216, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(252969216));
                eventGeneric.setInt(1, 0);
                this.triggerObserver(-483251904, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmUgdoSyncDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.setInteger(22972, 4);
                this.enterPopupView("Pcus4", 298, 5);
                break;
            }
            case 6: {
                this.enterPopupView("Pcusa", 298, 6);
                break;
            }
            case 7: {
                this.setInteger(22972, 7);
                this.enterPopupView("Pcuse", 298, 7);
                break;
            }
            case 8: {
                this.setInteger(22972, 0);
                this.enterPopupView("Pcuss", 298, 8);
                break;
            }
            case 9: {
                this.enterPopupView("Pcuts", 298, 9);
                break;
            }
            case 10: {
                this.setInteger(22972, 1);
                this.enterPopupView("Pmus_CBB2", 298, 10);
                break;
            }
            case 11: {
                this.setInteger(22972, 2);
                this.enterPopupView("Pmus_8439", 298, 11);
                break;
            }
            case 12: {
                this.setInteger(22972, 3);
                this.enterPopupView("Pmus_ED32", 298, 12);
                break;
            }
            case 13: {
                this.setInteger(22972, 5);
                this.enterPopupView("Pmusw_AA29", 298, 13);
                break;
            }
            case 14: {
                this.setInteger(22972, 6);
                this.enterPopupView("Pmusw_CA3C", 298, 14);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmUgdoSyncDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                UgdoActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                if (this.getBoolean(10125)) {
                    this.setInteger(482803712, 1);
                }
                if (this.getBoolean(10125)) {
                    EventGeneric eventGeneric = UgdoActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(482803712));
                    this.triggerObserver(-248370880, eventGeneric);
                }
                this.setBoolean(10125, false);
                this.setBoolean(-686817024, false);
                break;
            }
            case 5: {
                this.leavePopupView("Pcus4");
                break;
            }
            case 6: {
                this.leavePopupView("Pcusa");
                break;
            }
            case 7: {
                this.leavePopupView("Pcuse");
                break;
            }
            case 8: {
                this.leavePopupView("Pcuss");
                break;
            }
            case 9: {
                this.leavePopupView("Pcuts");
                break;
            }
            case 10: {
                this.leavePopupView("Pmus_CBB2");
                break;
            }
            case 11: {
                this.leavePopupView("Pmus_8439");
                break;
            }
            case 12: {
                this.leavePopupView("Pmus_ED32");
                break;
            }
            case 13: {
                this.leavePopupView("Pmusw_AA29");
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1637315255);
                this.setInteger(-761462784, -1);
                break;
            }
            case 14: {
                this.leavePopupView("Pmusw_CA3C");
                break;
            }
        }
    }

    private void performStateFocusGainedAction_SubPopupPoConfirmUgdoSyncDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 4: {
                this.setBoolean(10125, true);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 962694473);
                break;
            }
        }
    }

    private void performStateFocusLostAction_SubPopupPoConfirmUgdoSyncDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 4: {
                this.setInteger(482803712, 0);
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(482803712));
                this.triggerObserver(-248370880, eventGeneric);
                this.setBoolean(10125, false);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubPopupPoConfirmUgdoSyncDynState(int n) {
        switch (n - this.IT_OFFSET) {
            case 12: {
                return this.getInteger(22972) == 6;
            }
            case 13: {
                return this.getInteger(22972) == 0;
            }
            case 14: {
                return this.getInteger(22972) == 4;
            }
            case 15: {
                return this.getInteger(22972) == 3;
            }
            case 16: {
                return this.getInteger(22972) == 2;
            }
            case 17: {
                return this.getInteger(22972) == 1;
            }
            case 18: {
                return this.getInteger(22972) == 7;
            }
            case 19: {
                return this.getInteger(22972) == 5;
            }
            case 20: {
                return !this.getBoolean(-1175977984);
            }
            case 22: {
                return !this.getBoolean(-1175977984);
            }
            case 24: {
                return !this.getBoolean(-1175977984);
            }
            case 26: {
                return !this.getBoolean(-1175977984);
            }
            case 28: {
                return !this.getBoolean(-1175977984);
            }
            case 30: {
                return !this.getBoolean(-1175977984);
            }
            case 32: {
                return !this.getBoolean(-1175977984);
            }
            case 34: {
                return !this.getBoolean(-1175977984);
            }
            case 36: {
                return this.getBoolean(30404);
            }
            case 37: {
                return this.getBoolean(30404);
            }
            case 38: {
                return this.getBoolean(30404);
            }
            case 39: {
                return this.getBoolean(30404);
            }
            case 40: {
                return this.getBoolean(30404);
            }
            case 41: {
                return this.getBoolean(30404);
            }
            case 44: {
                return !this.getBoolean(-1175977984);
            }
            case 46: {
                return !this.getBoolean(-1175977984);
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubPopupPoConfirmUgdoSyncDynState(int n) {
        this.performInternalTransitionAction_SubPopupPoConfirmUgdoSyncDynState00(n);
    }

    private void performInternalTransitionAction_SubPopupPoConfirmUgdoSyncDynState00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setInteger(-1577910272, this.getLicValue(5908736, 0, 0, 0));
                this.setInteger(15511, this.getLicValue(5908736, 1, 0, 0));
                if (this.getInteger(15511) == 1) {
                    this.setBoolean(13186, true);
                }
                if (this.getInteger(15511) != 1) {
                    this.setBoolean(13186, false);
                }
                if (this.getInteger(15511) == 2) {
                    this.setBoolean(24268, true);
                }
                if (this.getInteger(15511) != 2) {
                    this.setBoolean(24268, false);
                }
                if (this.getInteger(15511) == 3) {
                    this.setBoolean(1367932928, true);
                }
                if (this.getInteger(15511) == 3) break;
                this.setBoolean(1367932928, false);
                break;
            }
            case 1: {
                this.setInteger(12698, this.getInteger(15511));
                this.setInteger(0x44F00000, this.getInteger(-1577910272));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                break;
            }
            case 2: {
                this.setInteger(12698, this.getInteger(15511));
                this.setInteger(0x44F00000, this.getInteger(-1577910272));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                break;
            }
            case 3: {
                this.setInteger(12698, this.getInteger(15511));
                this.setInteger(0x44F00000, this.getInteger(-1577910272));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                break;
            }
            case 4: {
                this.setInteger(12698, this.getInteger(15511));
                this.setInteger(0x44F00000, this.getInteger(-1577910272));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                break;
            }
            case 5: {
                this.setInteger(12698, this.getInteger(15511));
                this.setInteger(0x44F00000, this.getInteger(-1577910272));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                break;
            }
            case 6: {
                this.setInteger(12698, this.getInteger(15511));
                this.setInteger(0x44F00000, this.getInteger(-1577910272));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                break;
            }
            case 7: {
                this.setInteger(12698, this.getInteger(15511));
                this.setInteger(0x44F00000, this.getInteger(-1577910272));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                break;
            }
            case 8: {
                this.setInteger(12698, this.getInteger(15511));
                this.setInteger(0x44F00000, this.getInteger(-1577910272));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                break;
            }
            case 9: {
                this.setInteger(12698, this.getInteger(15511));
                this.setInteger(0x44F00000, this.getInteger(-1577910272));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                break;
            }
            case 10: {
                this.setInteger(12698, this.getInteger(15511));
                this.setInteger(0x44F00000, this.getInteger(-1577910272));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                break;
            }
            case 11: {
                this.setInteger(12698, this.getInteger(15511));
                this.setInteger(0x44F00000, this.getInteger(-1577910272));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                break;
            }
            case 12: {
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 727813449);
                break;
            }
            case 13: {
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 677481801);
                break;
            }
            case 14: {
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 643927369);
                break;
            }
            case 15: {
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 627150153);
                break;
            }
            case 16: {
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 610372937);
                break;
            }
            case 17: {
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 593595721);
                break;
            }
            case 18: {
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 660704585);
                break;
            }
            case 19: {
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 711036233);
                break;
            }
            case 20: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(-741343232, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 21: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 22: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(-741343232, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 23: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 24: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(-741343232, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 25: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 26: {
                this.triggerObserver(-97375936);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(-741343232, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 27: {
                this.triggerObserver(-97375936);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 28: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1449561417);
                this.setBoolean(-741343232, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 29: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1449561417);
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 30: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(-741343232, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 31: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 32: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(-741343232, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 33: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 34: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(-741343232, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 35: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 36: {
                this.setInteger(-761462784, 8);
                break;
            }
            case 37: {
                this.setInteger(-761462784, 1);
                break;
            }
            case 38: {
                this.setInteger(-761462784, 2);
                break;
            }
            case 39: {
                this.setInteger(-761462784, 3);
                break;
            }
            case 40: {
                this.setInteger(-761462784, 7);
                this.setBoolean(-458948608, true);
                break;
            }
            case 41: {
                this.setInteger(-761462784, 7);
                this.setBoolean(-458948608, false);
                break;
            }
            case 42: {
                this.setBoolean(30404, false);
                if (this.getInteger(-761462784) == 1) {
                    UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 593595721);
                }
                if (this.getInteger(-761462784) == 2) {
                    UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 610372937);
                }
                if (this.getInteger(-761462784) == 3) {
                    UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 627150153);
                }
                if (this.getInteger(-761462784) == 8) {
                    UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 694259017);
                }
                if (this.getInteger(-761462784) != 7) break;
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 660704585);
                break;
            }
            case 43: {
                this.setBoolean(30404, true);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1654092471);
                break;
            }
            case 44: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(-741343232, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 45: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 46: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(-741343232, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 47: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1416006985);
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmUgdoSyncDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmUgdoSyncDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmUgdoSyncDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 8: {
                this.setBoolean(-458948608, false);
                break;
            }
            case 11: {
                this.setBoolean(-458948608, true);
                break;
            }
            case 19: {
                this.setInteger(-811794432, this.getInteger(-1577910272));
                this.setInteger(28632, this.getInteger(15511));
                this.setBoolean(-356974592, false);
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-356974592));
                eventGeneric.setInt(1, this.getInteger(28632));
                eventGeneric.setInt(2, this.getInteger(-811794432));
                this.triggerObserver(-214816448, eventGeneric);
                break;
            }
            case 20: {
                this.setInteger(-811794432, this.getInteger(-1577910272));
                this.setInteger(28632, this.getInteger(15511));
                this.setBoolean(-356974592, true);
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-356974592));
                eventGeneric.setInt(1, this.getInteger(28632));
                eventGeneric.setInt(2, this.getInteger(-811794432));
                this.triggerObserver(-214816448, eventGeneric);
                break;
            }
            case 21: {
                this.setInteger(12698, this.getInteger(15511));
                this.setInteger(0x44F00000, this.getInteger(-1577910272));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                break;
            }
            case 22: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(382533632));
                eventGeneric.setInt(1, this.getInteger(1895497728));
                this.triggerObserver(-449697472, eventGeneric);
                break;
            }
            case 23: {
                if (this.getBoolean(-458948608)) {
                    this.setInteger(12698, this.getInteger(15511));
                }
                if (this.getBoolean(-458948608)) {
                    this.setInteger(0x44F00000, this.getInteger(-1577910272));
                }
                if (!this.getBoolean(-458948608)) break;
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(12698));
                eventGeneric.setInt(1, this.getInteger(0x44F00000));
                this.triggerObserver(-231593664, eventGeneric);
                break;
            }
            case 25: {
                this.setInteger(382533632, this.getInteger(15511));
                this.setInteger(1895497728, this.getInteger(-1577910272));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(382533632));
                eventGeneric.setInt(1, this.getInteger(1895497728));
                this.triggerObserver(-449697472, eventGeneric);
                break;
            }
            case 26: {
                this.setBoolean(-659357696, true);
                if (this.getInteger(25296896) != 2) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1633717577);
                }
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1755345591);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubPopupPoConfirmUgdoSyncDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                return this.getBoolean(-686817024);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubPopupPoConfirmUgdoSyncDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                this.setBoolean(-659357696, true);
                if (this.getInteger(25296896) != 2) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1633717577);
                }
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1755345591);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmUgdoTeachDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 6: {
                this.enterPopupView("Pcuta", 299, 6);
                break;
            }
            case 7: {
                this.enterPopupView("Pcute", 299, 7);
                break;
            }
            case 8: {
                this.setInteger(15511, this.getLicValue(5908736, 1, 0, 0));
                this.setInteger(-1577910272, this.getLicValue(5908736, 0, 0, 0));
                this.enterPopupView("Pcutf", 299, 8);
                break;
            }
            case 9: {
                this.enterPopupView("Pcuts", 299, 9);
                break;
            }
            case 10: {
                this.setBoolean(31334, false);
                this.enterPopupView("Pmut_1591", 299, 10);
                break;
            }
            case 11: {
                this.enterPopupView("Pmut_7A3D", 299, 11);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmUgdoTeachDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                UgdoActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                if (this.getBoolean(-1859976960)) {
                    this.setInteger(482803712, 1);
                }
                if (this.getBoolean(-1859976960)) {
                    EventGeneric eventGeneric = UgdoActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(482803712));
                    this.triggerObserver(-248370880, eventGeneric);
                }
                this.setBoolean(-1859976960, false);
                break;
            }
            case 6: {
                this.leavePopupView("Pcuta");
                break;
            }
            case 7: {
                this.leavePopupView("Pcute");
                break;
            }
            case 8: {
                this.leavePopupView("Pcutf");
                break;
            }
            case 9: {
                this.leavePopupView("Pcuts");
                break;
            }
            case 10: {
                this.leavePopupView("Pmut_1591");
                break;
            }
            case 11: {
                this.leavePopupView("Pmut_7A3D");
                break;
            }
        }
    }

    private void performStateFocusGainedAction_SubPopupPoConfirmUgdoTeachDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.setBoolean(-1859976960, true);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 945917257);
                break;
            }
        }
    }

    private void performStateFocusLostAction_SubPopupPoConfirmUgdoTeachDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.setInteger(482803712, 0);
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(482803712));
                this.triggerObserver(-248370880, eventGeneric);
                this.setBoolean(-1859976960, false);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1449561417);
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubPopupPoConfirmUgdoTeachDynState(int n) {
        switch (n - this.IT_OFFSET) {
            case 14: {
                return !this.getBoolean(-1175977984);
            }
            case 16: {
                return !this.getBoolean(-1175977984);
            }
            case 18: {
                return !this.getBoolean(-1175977984);
            }
            case 20: {
                return !this.getBoolean(-1175977984);
            }
            case 22: {
                return !this.getBoolean(-1175977984);
            }
            case 27: {
                return !this.getBoolean(-1175977984);
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubPopupPoConfirmUgdoTeachDynState(int n) {
        this.performInternalTransitionAction_SubPopupPoConfirmUgdoTeachDynState00(n);
    }

    private void performInternalTransitionAction_SubPopupPoConfirmUgdoTeachDynState00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setInteger(-1577910272, this.getLicValue(5908736, 0, 0, 0));
                this.setInteger(15511, this.getLicValue(5908736, 1, 0, 0));
                if (this.getInteger(15511) == 1) {
                    this.setBoolean(13186, true);
                }
                if (this.getInteger(15511) != 1) {
                    this.setBoolean(13186, false);
                }
                if (this.getInteger(15511) == 2) {
                    this.setBoolean(24268, true);
                }
                if (this.getInteger(15511) != 2) {
                    this.setBoolean(24268, false);
                }
                if (this.getInteger(15511) == 3) {
                    this.setBoolean(1367932928, true);
                }
                if (this.getInteger(15511) == 3) break;
                this.setBoolean(1367932928, false);
                break;
            }
            case 1: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                break;
            }
            case 2: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                break;
            }
            case 3: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                break;
            }
            case 4: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                break;
            }
            case 5: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                break;
            }
            case 6: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                break;
            }
            case 7: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                break;
            }
            case 8: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                break;
            }
            case 9: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                break;
            }
            case 10: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                break;
            }
            case 11: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                break;
            }
            case 12: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                break;
            }
            case 13: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                break;
            }
            case 14: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                this.setBoolean(-741343232, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 15: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 16: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1449561417);
                this.setBoolean(-741343232, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 17: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1449561417);
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 18: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                this.triggerObserver(-97375936);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1449561417);
                this.setBoolean(-741343232, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 19: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                this.triggerObserver(-97375936);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1449561417);
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 20: {
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1449561417);
                this.setBoolean(-741343232, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 21: {
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1449561417);
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 22: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1449561417);
                this.setBoolean(-741343232, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 23: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1449561417);
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 24: {
                this.setInteger(-1550974976, this.getInteger(-1577910272));
                this.setInteger(24724, this.getInteger(15511));
                this.setInteger(616497152, 0);
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(24724));
                eventGeneric.setInt(1, this.getInteger(-1550974976));
                eventGeneric.setInt(2, this.getInteger(616497152));
                this.triggerObserver(-114153152, eventGeneric);
                break;
            }
            case 25: {
                this.setInteger(-1550974976, this.getInteger(-1577910272));
                this.setInteger(24724, this.getInteger(15511));
                this.setInteger(616497152, 1);
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(24724));
                eventGeneric.setInt(1, this.getInteger(-1550974976));
                eventGeneric.setInt(2, this.getInteger(616497152));
                this.triggerObserver(-114153152, eventGeneric);
                break;
            }
            case 26: {
                this.setInteger(-1550974976, this.getInteger(-1577910272));
                this.setInteger(24724, this.getInteger(15511));
                this.setInteger(616497152, 2);
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(24724));
                eventGeneric.setInt(1, this.getInteger(-1550974976));
                eventGeneric.setInt(2, this.getInteger(616497152));
                this.triggerObserver(-114153152, eventGeneric);
                break;
            }
            case 27: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1449561417);
                this.setBoolean(-741343232, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 28: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1449561417);
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmUgdoTeachDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmUgdoTeachDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmUgdoTeachDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 3: {
                this.setInteger(-1585053696, this.getInteger(-1577910272));
                this.setInteger(-1362493440, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1362493440));
                eventGeneric.setInt(1, this.getInteger(-1585053696));
                this.triggerObserver(-198039232, eventGeneric);
                this.setBoolean(-659357696, false);
                if (this.getInteger(25296896) == 2) break;
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1633717577);
                break;
            }
            case 4: {
                this.setBoolean(-659357696, false);
                if (this.getInteger(25296896) == 2) break;
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1633717577);
                break;
            }
            case 7: {
                this.triggerObserver(-181262016);
                break;
            }
            case 8: {
                this.setInteger(30801920, this.getInteger(-1577910272));
                this.setInteger(-434634496, this.getInteger(15511));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-434634496));
                eventGeneric.setInt(1, this.getInteger(30801920));
                this.triggerObserver(-533583552, eventGeneric);
                break;
            }
            case 9: {
                this.triggerObserver(-181262016);
                break;
            }
            case 10: {
                this.setBoolean(-659357696, true);
                if (this.getInteger(25296896) != 2) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1633717577);
                }
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1755345591);
                break;
            }
            case 14: {
                this.setBoolean(-686817024, true);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1432784201);
                break;
            }
            case 16: {
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1432784201);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubPopupPoConfirmUgdoTeachDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                return this.getBoolean(31334);
            }
            case 2: {
                return this.getLicValue(-78042880, 0, 5, false) || this.getLicValue(-78042880, 0, 6, false);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubPopupPoConfirmUgdoTeachDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                this.setInteger(-434634496, this.getInteger(15511));
                this.setInteger(30801920, this.getInteger(-1577910272));
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-434634496));
                eventGeneric.setInt(1, this.getInteger(30801920));
                this.triggerObserver(-533583552, eventGeneric);
                break;
            }
            case 3: {
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-434634496));
                eventGeneric.setInt(1, this.getInteger(30801920));
                this.triggerObserver(-533583552, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubHapticUgdoDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(21641, 2);
                break;
            }
            case 8: {
                this.setInteger(336199936, 23);
                this.setInteger(30060, SkinDataPool.getInteger(190));
                this.setInteger(25296896, 2);
                this.setInteger(21641, 3);
                break;
            }
            case 17: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(1292828928, false);
                this.setBoolean(-659357696, false);
                this.showView("Ur", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 18: {
                if (this.getInteger(15511) == 1) {
                    this.setBoolean(13186, true);
                }
                if (this.getInteger(15511) != 1) {
                    this.setBoolean(13186, false);
                }
                if (this.getInteger(15511) == 2) {
                    this.setBoolean(24268, true);
                }
                if (this.getInteger(15511) != 2) {
                    this.setBoolean(24268, false);
                }
                if (this.getInteger(15511) == 3) {
                    this.setBoolean(1367932928, true);
                }
                if (this.getInteger(15511) != 3) {
                    this.setBoolean(1367932928, false);
                }
                this.showView("Uc", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 19: {
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1264618825);
                break;
            }
            case 20: {
                this.setInteger(21641, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubHapticUgdoDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(21641, 0);
                break;
            }
            case 8: {
                this.setInteger(30060, SkinDataPool.getInteger(180));
                this.setInteger(25296896, 0);
                break;
            }
            case 17: {
                this.hideView("Ur");
                this.triggerObserver(-349034176);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(1292828928, false);
                break;
            }
            case 18: {
                this.hideView("Uc");
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubHapticUgdoDynState(int n) {
        switch (n - this.IT_OFFSET) {
            case 8: {
                return this.getLicValue(-78042880, 0, 3, false);
            }
            case 9: {
                return !this.getLicValue(-78042880, 0, 3, false);
            }
            case 10: {
                return this.getLicValue(-78042880, 0, 1, false);
            }
            case 11: {
                return !this.getLicValue(-78042880, 0, 1, false);
            }
            case 15: {
                return this.getLicValue(-78042880, 0, 2, false);
            }
            case 16: {
                return !this.getLicValue(-78042880, 0, 2, false);
            }
            case 18: {
                return !this.getLicValue(-78042880, 0, 0, false);
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubHapticUgdoDynState(int n) {
        this.performInternalTransitionAction_SubHapticUgdoDynState00(n);
    }

    private void performInternalTransitionAction_SubHapticUgdoDynState00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setInteger(30060, SkinDataPool.getInteger(190));
                break;
            }
            case 1: {
                this.setInteger(30060, SkinDataPool.getInteger(180));
                break;
            }
            case 2: {
                this.triggerObserver(-281925312);
                this.triggerObserver(-399365824);
                this.triggerObserver(-382588608);
                this.setInteger(2112880640, this.getInteger(15511));
                this.setInteger(2007760896, this.getInteger(-1577910272));
                if (this.getInteger(15511) == 1) {
                    this.setString(939196416, this.getLicValue(-229037824, 2, 0, "free"));
                }
                if (this.getInteger(15511) == 2) {
                    this.setString(939196416, this.getLicValue(-229037824, 2, 1, "free"));
                }
                if (this.getInteger(15511) == 3) {
                    this.setString(939196416, this.getLicValue(-229037824, 2, 2, "free"));
                }
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(2112880640));
                eventGeneric.setInt(1, this.getInteger(2007760896));
                eventGeneric.setString(2, this.getString(939196416));
                this.triggerObserver(-164484800, eventGeneric);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 3: {
                this.triggerObserver(-332256960);
                break;
            }
            case 4: {
                this.setString(723190016, UgdoActivity.evSpellerValuePressedChar());
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setString(0, this.getString(723190016));
                this.triggerObserver(-315479744, eventGeneric);
                break;
            }
            case 5: {
                this.setInteger(-825294848, UgdoActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-825294848));
                this.triggerObserver(-298702528, eventGeneric);
                break;
            }
            case 6: {
                this.setBoolean(1292828928, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, -1217884855);
                break;
            }
            case 7: {
                this.setBoolean(1292828928, false);
                break;
            }
            case 8: {
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1399229769);
                break;
            }
            case 9: {
                if (this.getLicValue(-78042880, 1, 3, 0) == 4) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1684442441);
                }
                if (this.getLicValue(-78042880, 1, 3, 0) == 1) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1717996873);
                }
                if (this.getLicValue(-78042880, 1, 3, 0) == 2) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1751551305);
                }
                if (this.getLicValue(-78042880, 1, 3, 0) == 3) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1785105737);
                }
                if (this.getLicValue(-78042880, 1, 3, 0) == 5) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1852214601);
                }
                if (this.getLicValue(-78042880, 1, 3, 0) != 6) break;
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1885769033);
                break;
            }
            case 10: {
                this.setBoolean(31334, true);
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1466338633);
                break;
            }
            case 11: {
                if (this.getLicValue(-78042880, 1, 1, 0) == 4) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1684442441);
                }
                if (this.getLicValue(-78042880, 1, 1, 0) == 1) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1717996873);
                }
                if (this.getLicValue(-78042880, 1, 1, 0) == 2) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1751551305);
                }
                if (this.getLicValue(-78042880, 1, 1, 0) == 3) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1785105737);
                }
                if (this.getLicValue(-78042880, 1, 1, 0) == 5) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1852214601);
                }
                if (this.getLicValue(-78042880, 1, 1, 0) != 6) break;
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1885769033);
                break;
            }
            case 12: {
                this.setInteger(15511, 1);
                this.setInteger(-1577910272, 0);
                this.setBoolean(24268, false);
                this.setBoolean(1367932928, false);
                this.setBoolean(13186, true);
                break;
            }
            case 13: {
                this.setInteger(15511, 2);
                this.setInteger(-1577910272, 0);
                this.setBoolean(1367932928, false);
                this.setBoolean(13186, false);
                this.setBoolean(24268, true);
                break;
            }
            case 14: {
                this.setInteger(15511, 3);
                this.setInteger(-1577910272, 0);
                this.setBoolean(24268, false);
                this.setBoolean(13186, false);
                this.setBoolean(1367932928, true);
                break;
            }
            case 15: {
                UgdoActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1432784201);
                break;
            }
            case 16: {
                if (this.getLicValue(-78042880, 1, 2, 0) == 4) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1684442441);
                }
                if (this.getLicValue(-78042880, 1, 2, 0) == 1) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1717996873);
                }
                if (this.getLicValue(-78042880, 1, 2, 0) == 2) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1751551305);
                }
                if (this.getLicValue(-78042880, 1, 2, 0) == 3) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1785105737);
                }
                if (this.getLicValue(-78042880, 1, 2, 0) == 5) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1852214601);
                }
                if (this.getLicValue(-78042880, 1, 2, 0) != 6) break;
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1885769033);
                break;
            }
            case 17: {
                this.setBoolean(1742405632, true);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 18: {
                if (this.getLicValue(-78042880, 1, 0, 0) == 4) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1684442441);
                }
                if (this.getLicValue(-78042880, 1, 0, 0) == 1) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1717996873);
                }
                if (this.getLicValue(-78042880, 1, 0, 0) == 2) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1751551305);
                }
                if (this.getLicValue(-78042880, 1, 0, 0) == 3) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1785105737);
                }
                if (this.getLicValue(-78042880, 1, 0, 0) == 5) {
                    UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1852214601);
                }
                if (this.getLicValue(-78042880, 1, 0, 0) != 6) break;
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, 1885769033);
                break;
            }
            case 19: {
                if (this.getLicValue(5908736, 1, 0, 0) != 2) {
                    this.setBoolean(24268, false);
                }
                if (this.getLicValue(5908736, 1, 0, 0) == 2) {
                    this.setBoolean(24268, true);
                }
                if (this.getLicValue(5908736, 1, 0, 0) != 3) {
                    this.setBoolean(1367932928, false);
                }
                if (this.getLicValue(5908736, 1, 0, 0) == 3) {
                    this.setBoolean(1367932928, true);
                }
                if (this.getLicValue(5908736, 1, 0, 0) != 1) {
                    this.setBoolean(13186, false);
                }
                if (this.getLicValue(5908736, 1, 0, 0) == 1) {
                    this.setBoolean(13186, true);
                }
                this.setInteger(15511, this.getLicValue(5908736, 1, 0, 0));
                this.setInteger(-1577910272, this.getLicValue(5908736, 0, 0, 0));
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubHapticUgdoDynState(int n) {
        switch (n - this.TT_OFFSET) {
            case 5: {
                return this.getLicValue(-78042880, 0, 0, false);
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubHapticUgdoDynState(int n) {
        this.performTriggeredTransitionAction_SubHapticUgdoDynState0(n);
    }

    private void performTriggeredTransitionAction_SubHapticUgdoDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 2: {
                this.triggerObserver(-265148096);
                this.triggerObserver(-365811392);
                break;
            }
            case 3: {
                this.triggerObserver(-281925312);
                this.triggerObserver(-399365824);
                this.triggerObserver(-382588608);
                break;
            }
            case 4: {
                this.setInteger(2112880640, this.getInteger(15511));
                this.setInteger(2007760896, this.getInteger(-1577910272));
                if (this.getInteger(15511) == 1) {
                    this.setString(939196416, this.getLicValue(-229037824, 2, 0, "free"));
                }
                if (this.getInteger(15511) == 2) {
                    this.setString(939196416, this.getLicValue(-229037824, 2, 1, "free"));
                }
                if (this.getInteger(15511) == 3) {
                    this.setString(939196416, this.getLicValue(-229037824, 2, 2, "free"));
                }
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(2112880640));
                eventGeneric.setInt(1, this.getInteger(2007760896));
                eventGeneric.setString(2, this.getString(939196416));
                this.triggerObserver(-164484800, eventGeneric);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 5: {
                this.setInteger(2112880640, this.getInteger(15511));
                this.setInteger(2007760896, this.getInteger(-1577910272));
                if (this.getInteger(15511) == 1) {
                    this.setString(939196416, this.getLicValue(-229037824, 2, 0, "free"));
                }
                if (this.getInteger(15511) == 2) {
                    this.setString(939196416, this.getLicValue(-229037824, 2, 1, "free"));
                }
                if (this.getInteger(15511) == 3) {
                    this.setString(939196416, this.getLicValue(-229037824, 2, 2, "free"));
                }
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(2112880640));
                eventGeneric.setInt(1, this.getInteger(2007760896));
                eventGeneric.setString(2, this.getString(939196416));
                this.triggerObserver(-164484800, eventGeneric);
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubHapticUgdoDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 7: {
                return this.getBoolean(-659357696);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubHapticUgdoDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 7: {
                this.setInteger(2112880640, this.getInteger(15511));
                this.setInteger(2007760896, this.getInteger(-1577910272));
                if (this.getInteger(15511) == 1) {
                    this.setString(939196416, this.getLicValue(-229037824, 2, 0, "free"));
                }
                if (this.getInteger(15511) == 2) {
                    this.setString(939196416, this.getLicValue(-229037824, 2, 1, "free"));
                }
                if (this.getInteger(15511) == 3) {
                    this.setString(939196416, this.getLicValue(-229037824, 2, 2, "free"));
                }
                EventGeneric eventGeneric = UgdoActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(2112880640));
                eventGeneric.setInt(1, this.getInteger(2007760896));
                eventGeneric.setString(2, this.getString(939196416));
                this.triggerObserver(-164484800, eventGeneric);
                break;
            }
            case 8: {
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 11: {
                UgdoActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
        }
    }
}

