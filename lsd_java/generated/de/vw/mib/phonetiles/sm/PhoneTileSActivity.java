/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.phonetiles.sm;

import de.vw.mib.genericevents.EventGeneric;
import de.vw.mib.sm.internal.statemachine.TopStatemachine;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineActivityBase;

public class PhoneTileSActivity
extends StatemachineActivityBase {
    private final int subStatemachineId;

    public PhoneTileSActivity(TopStatemachine topStatemachine, int n, int n2, int n3, int n4, int n5) {
        super(topStatemachine, n2, n3, n4, n5);
        this.subStatemachineId = n;
    }

    @Override
    public void performStateEntryAction(int n, boolean bl) {
        switch (this.subStatemachineId) {
            case 559: {
                this.performStateEntryAction_SubPopupPoPhonetilesWaitstateTransparentDynState(n, bl);
                break;
            }
            case 34: {
                this.performStateEntryAction_SubHapticPhonetilesDynState(n, bl);
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
            case 559: {
                this.performStateExitAction_SubPopupPoPhonetilesWaitstateTransparentDynState(n);
                break;
            }
            case 34: {
                this.performStateExitAction_SubHapticPhonetilesDynState(n);
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
            case 34: {
                return this.evalInternalTransitionGuard_SubHapticPhonetilesDynState(n);
            }
        }
        return true;
    }

    @Override
    public void performInternalTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 34: {
                this.performInternalTransitionAction_SubHapticPhonetilesDynState(n);
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
            case 34: {
                return this.evalTriggeredTransitionGuard_SubHapticPhonetilesDynState(n);
            }
        }
        return true;
    }

    @Override
    public void performTriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 34: {
                this.performTriggeredTransitionAction_SubHapticPhonetilesDynState(n);
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
            case 34: {
                return this.evalUntriggeredTransitionGuard_SubHapticPhonetilesDynState(n);
            }
        }
        return true;
    }

    @Override
    public void performUntriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            default: 
        }
    }

    private void performStateEntryAction_SubPopupPoPhonetilesWaitstateTransparentDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Ppwt_721E", 559, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoPhonetilesWaitstateTransparentDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                PhoneTileSActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Ppwt_721E");
                break;
            }
        }
    }

    private void performStateEntryAction_SubHapticPhonetilesDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.showView("Pstl", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 6: {
                this.setBoolean(-855834624, true);
                EventGeneric eventGeneric = PhoneTileSActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-855834624));
                this.triggerObserver(-147102144, eventGeneric);
                break;
            }
            case 8: {
                this.showView("Pstnp", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 10: {
                this.enterWaitaphoreForProperty(354025728, 476, 586, 1080659273, 1063882057);
                break;
            }
            case 12: {
                this.showView("Pstc", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 13: {
                this.setInteger(1560150016, 6);
                if (this.getBoolean(2006319104)) {
                    this.setInteger(1560150016, 6);
                }
                if (this.getBoolean(32206)) {
                    this.setInteger(1560150016, 10);
                }
                if (this.getBoolean(774308096)) {
                    this.setInteger(1560150016, 10);
                }
                EventGeneric eventGeneric = PhoneTileSActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1560150016));
                this.triggerObserver(-381983168, eventGeneric);
                if (this.getBoolean(906887424)) {
                    this.setInteger(31597, 5);
                }
                if (this.getBoolean(906887424)) {
                    eventGeneric = PhoneTileSActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(31597));
                    this.triggerObserver(-398760384, eventGeneric);
                }
                this.showView("Pstf", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    private void performStateExitAction_SubHapticPhonetilesDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.hideView("Pstl");
                break;
            }
            case 6: {
                this.setBoolean(-855834624, false);
                EventGeneric eventGeneric = PhoneTileSActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-855834624));
                this.triggerObserver(-147102144, eventGeneric);
                break;
            }
            case 8: {
                this.hideView("Pstnp");
                break;
            }
            case 10: {
                this.leaveWaitaphore();
                break;
            }
            case 12: {
                this.hideView("Pstc");
                break;
            }
            case 13: {
                this.hideView("Pstf");
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubHapticPhonetilesDynState(int n) {
        switch (n - this.IT_OFFSET) {
            case 7: {
                return !this.getBoolean(-674824192);
            }
            case 8: {
                return this.getBoolean(-674824192);
            }
            case 9: {
                return !this.getBoolean(-1279787008);
            }
            case 10: {
                return this.getBoolean(-1279787008);
            }
            case 15: {
                return this.getLicValue(-94214656, 6, this.getInteger(1175453952), false);
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubHapticPhonetilesDynState(int n) {
        this.performInternalTransitionAction_SubHapticPhonetilesDynState00(n);
    }

    private void performInternalTransitionAction_SubHapticPhonetilesDynState00(int n) {
        switch (n - this.IT_OFFSET) {
            case 1: {
                this.triggerObserver(-331651520);
                break;
            }
            case 2: {
                this.triggerObserver(-214211008);
                break;
            }
            case 3: {
                this.triggerObserver(-247765440);
                break;
            }
            case 4: {
                this.triggerObserver(-314874304);
                break;
            }
            case 5: {
                this.triggerObserver(-264542656);
                break;
            }
            case 6: {
                this.triggerObserver(-281319872);
                break;
            }
            case 7: {
                this.setBoolean(28557, true);
                EventGeneric eventGeneric = PhoneTileSActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(28557));
                this.triggerObserver(-348428736, eventGeneric);
                break;
            }
            case 8: {
                this.setBoolean(28557, false);
                EventGeneric eventGeneric = PhoneTileSActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(28557));
                this.triggerObserver(-348428736, eventGeneric);
                break;
            }
            case 9: {
                this.setBoolean(-1592852224, true);
                EventGeneric eventGeneric = PhoneTileSActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1592852224));
                this.triggerObserver(-365205952, eventGeneric);
                break;
            }
            case 10: {
                this.setBoolean(-1592852224, false);
                EventGeneric eventGeneric = PhoneTileSActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1592852224));
                this.triggerObserver(-365205952, eventGeneric);
                break;
            }
            case 11: {
                this.triggerObserver(-298097088);
                break;
            }
            case 12: {
                this.triggerObserver(-230988224);
                break;
            }
            case 13: {
                this.setInteger(-888864512, 0);
                EventGeneric eventGeneric = PhoneTileSActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-888864512));
                this.triggerObserver(-197433792, eventGeneric);
                break;
            }
            case 14: {
                this.setInteger(1175453952, PhoneTileSActivity.evListItemActionIndex());
                this.setInteger(129302528, this.getInteger(1175453952));
                EventGeneric eventGeneric = PhoneTileSActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(129302528));
                this.triggerObserver(-180656576, eventGeneric);
                break;
            }
            case 15: {
                this.setInteger(13743, 0);
                this.setInteger(-455409664, 11);
                this.setInteger(1088815104, 0);
                PhoneTileSActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubHapticPhonetilesDynState(int n) {
        switch (n - this.TT_OFFSET) {
            case 9: {
                return !this.getLicValue(-94214656, 6, this.getInteger(1175453952), false);
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubHapticPhonetilesDynState(int n) {
        this.performTriggeredTransitionAction_SubHapticPhonetilesDynState0(n);
    }

    private void performTriggeredTransitionAction_SubHapticPhonetilesDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 7: {
                this.setLong(-527826944, 0L);
                this.setInteger(29056, this.getLicValue(-94214656, 0, this.getInteger(1175453952), 0));
                this.setInteger(-1147076608, this.getLicValue(-94214656, 0, this.getInteger(1175453952), 0));
                this.setString(1545076992, this.getLicValue(-94214656, 3, this.getInteger(1175453952), ""));
                this.setInteger(1637744640, this.getInteger(1175453952));
                this.setString(984547328, this.getLicValue(-94214656, 3, this.getInteger(1175453952), ""));
                this.setInteger(13743, 2);
                PhoneTileSActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                break;
            }
            case 8: {
                if (this.getInteger(354025728) != 1) {
                    this.setLong(-527826944, 0L);
                    this.setInteger(29056, this.getLicValue(-94214656, 0, this.getInteger(1175453952), 0));
                    this.setInteger(-1147076608, this.getLicValue(-94214656, 0, this.getInteger(1175453952), 0));
                    this.setString(1545076992, this.getLicValue(-94214656, 3, this.getInteger(1175453952), ""));
                    this.setInteger(1637744640, this.getInteger(1175453952));
                    this.setString(984547328, this.getLicValue(-94214656, 3, this.getInteger(1175453952), ""));
                    this.setInteger(13743, 2);
                    PhoneTileSActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                }
                if (this.getInteger(354025728) != 1) break;
                this.setLong(-527826944, 0L);
                this.setInteger(29056, this.getLicValue(-94214656, 0, this.getInteger(1175453952), 0));
                this.setInteger(-1147076608, this.getLicValue(-94214656, 0, this.getInteger(1175453952), 0));
                this.setString(1545076992, this.getLicValue(-94214656, 3, this.getInteger(1175453952), ""));
                this.setInteger(1637744640, this.getInteger(1175453952));
                EventGeneric eventGeneric = PhoneTileSActivity.newEvent();
                eventGeneric.setLong(0, this.getLong(-527826944));
                eventGeneric.setString(1, this.getString(1545076992));
                eventGeneric.setInt(2, this.getInteger(29056));
                eventGeneric.setInt(3, this.getInteger(-1147076608));
                eventGeneric.setInt(4, this.getInteger(1637744640));
                this.triggerObserver(-430172864, eventGeneric);
                break;
            }
            case 9: {
                this.setString(-108920832, this.getLicValue(-94214656, 3, this.getInteger(1175453952), ""));
                PhoneTileSActivity.lockWaitaphore(354025728, 1000);
                EventGeneric eventGeneric = PhoneTileSActivity.newEvent();
                eventGeneric.setString(0, this.getString(-108920832));
                this.triggerObserver(-163879360, eventGeneric);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubHapticPhonetilesDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 4: {
                return this.getInteger(16652) == 0;
            }
            case 6: {
                return this.getInteger(-2064711680) != 5 || this.getInteger(-303693824) != 2;
            }
            case 8: {
                return this.getInteger(2140733440) == 0 || this.getInteger(2140733440) == 2;
            }
        }
        return true;
    }
}

