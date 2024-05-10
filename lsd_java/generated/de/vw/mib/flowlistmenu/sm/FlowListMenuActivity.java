/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.flowlistmenu.sm;

import de.vw.mib.genericevents.EventGeneric;
import de.vw.mib.sm.internal.statemachine.TopStatemachine;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineActivityBase;

public class FlowListMenuActivity
extends StatemachineActivityBase {
    private final int subStatemachineId;

    public FlowListMenuActivity(TopStatemachine topStatemachine, int n, int n2, int n3, int n4, int n5) {
        super(topStatemachine, n2, n3, n4, n5);
        this.subStatemachineId = n;
    }

    @Override
    public void performStateEntryAction(int n, boolean bl) {
        switch (this.subStatemachineId) {
            case 10: {
                this.performStateEntryAction_SubHapticFlowlistmenuDynState(n, bl);
                break;
            }
            case 653: {
                this.performStateEntryAction_SubIConnWizardMainBridge(n, bl);
                break;
            }
            case 654: {
                this.performStateEntryAction_SubIConnWlanSpeller(n, bl);
                break;
            }
            case 701: {
                this.performStateEntryAction_SubIWizardOnlineCarNetInternetbrowserSpeller(n, bl);
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
            case 10: {
                this.performStateExitAction_SubHapticFlowlistmenuDynState(n);
                break;
            }
            case 653: {
                this.performStateExitAction_SubIConnWizardMainBridge(n);
                break;
            }
            case 654: {
                this.performStateExitAction_SubIConnWlanSpeller(n);
                break;
            }
            case 701: {
                this.performStateExitAction_SubIWizardOnlineCarNetInternetbrowserSpeller(n);
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
            case 653: {
                return this.evalInternalTransitionGuard_SubIConnWizardMainBridge(n);
            }
            case 654: {
                return this.evalInternalTransitionGuard_SubIConnWlanSpeller(n);
            }
        }
        return true;
    }

    @Override
    public void performInternalTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 10: {
                this.performInternalTransitionAction_SubHapticFlowlistmenuDynState(n);
                break;
            }
            case 653: {
                this.performInternalTransitionAction_SubIConnWizardMainBridge(n);
                break;
            }
            case 654: {
                this.performInternalTransitionAction_SubIConnWlanSpeller(n);
                break;
            }
            case 701: {
                this.performInternalTransitionAction_SubIWizardOnlineCarNetInternetbrowserSpeller(n);
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
            case 10: {
                return this.evalTriggeredTransitionGuard_SubHapticFlowlistmenuDynState(n);
            }
            case 653: {
                return this.evalTriggeredTransitionGuard_SubIConnWizardMainBridge(n);
            }
        }
        return true;
    }

    @Override
    public void performTriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 10: {
                this.performTriggeredTransitionAction_SubHapticFlowlistmenuDynState(n);
                break;
            }
            case 653: {
                this.performTriggeredTransitionAction_SubIConnWizardMainBridge(n);
                break;
            }
            case 654: {
                this.performTriggeredTransitionAction_SubIConnWlanSpeller(n);
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
            case 10: {
                return this.evalUntriggeredTransitionGuard_SubHapticFlowlistmenuDynState(n);
            }
            case 653: {
                return this.evalUntriggeredTransitionGuard_SubIConnWizardMainBridge(n);
            }
        }
        return true;
    }

    @Override
    public void performUntriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 653: {
                this.performUntriggeredTransitionAction_SubIConnWizardMainBridge(n);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void performStateEntryAction_SubHapticFlowlistmenuDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 5: {
                FlowListMenuActivity.changeContext("Menu");
                this.setInteger(25296896, 40);
                this.setInteger(-1373110016, 1314950473);
                break;
            }
            case 12: {
                this.showView("Fav", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 13: {
                this.setInteger(-1467219968, 11);
                FlowListMenuActivity.changeContext("Menu");
                this.showView("Fd", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 14: {
                this.setInteger(-1467219968, 7);
                FlowListMenuActivity.changeContext("Menu");
                this.showView("Fds", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    private void performStateExitAction_SubHapticFlowlistmenuDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.setInteger(25296896, 0);
                break;
            }
            case 12: {
                this.hideView("Fav");
                break;
            }
            case 13: {
                this.hideView("Fd");
                break;
            }
            case 14: {
                this.hideView("Fds");
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubHapticFlowlistmenuDynState(int n) {
        this.performInternalTransitionAction_SubHapticFlowlistmenuDynState00(n);
    }

    private void performInternalTransitionAction_SubHapticFlowlistmenuDynState00(int n) {
        switch (n - this.IT_OFFSET) {
            case 1: {
                break;
            }
            case 2: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 3: {
                this.setInteger(-2114125824, 1);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1180732745);
                break;
            }
            case 4: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1197509961);
                break;
            }
            case 5: {
                if (this.getBoolean(604176640)) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1335390903);
                }
                if (this.getBoolean(604176640)) break;
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1029737801);
                break;
            }
            case 6: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1281396041);
                break;
            }
            case 7: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1365282121);
                break;
            }
            case 8: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                break;
            }
            case 9: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1482722633);
                break;
            }
            case 10: {
                break;
            }
            case 11: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1516277065);
                break;
            }
            case 12: {
                this.setBoolean(924320000, false);
                this.setBoolean(15665, true);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1583385929);
                break;
            }
            case 13: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1616940361);
                break;
            }
            case 14: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1650494793);
                break;
            }
            case 15: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1298173257);
                break;
            }
            case 16: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1549831497);
                break;
            }
            case 17: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1600163145);
                break;
            }
            case 18: {
                break;
            }
            case 19: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1533054281);
                break;
            }
            case 20: {
                break;
            }
            case 21: {
                this.setInteger(1435762688, FlowListMenuActivity.evIntegerValueValue());
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1435762688));
                this.triggerObserver(605504, eventGeneric);
                break;
            }
            case 22: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1247841609);
                break;
            }
            case 25: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1314950473);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubHapticFlowlistmenuDynState(int n) {
        switch (n - this.TT_OFFSET) {
            case 3: {
                return !this.getBoolean(604176640);
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubHapticFlowlistmenuDynState(int n) {
        this.performTriggeredTransitionAction_SubHapticFlowlistmenuDynState0(n);
    }

    private void performTriggeredTransitionAction_SubHapticFlowlistmenuDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 3: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -647590583);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubHapticFlowlistmenuDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 2: {
                return this.getBoolean(774308096);
            }
            case 3: {
                return this.getBoolean(32206);
            }
            case 4: {
                return this.getBoolean(2006319104);
            }
        }
        return true;
    }

    private void performStateEntryAction_SubIConnWizardMainBridge(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                if (this.getBoolean(-116981504)) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1499172169);
                }
                if (this.getBoolean(-116981504)) break;
                this.setBoolean(-116981504, true);
                break;
            }
            case 6: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1319531191);
                break;
            }
            case 7: {
                if (!this.getBoolean(32340) && this.getInteger(18981) != 0 && !this.getBoolean(30264)) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 442142025);
                }
                if (!this.getBoolean(32340) && this.getInteger(18981) != 0 && !this.getBoolean(30264)) break;
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -832729783);
                break;
            }
            case 25: {
                this.showView("Wccs_974F", bl, 167);
                break;
            }
            case 26: {
                this.showView("Wcscm", bl, 167);
                break;
            }
            case 27: {
                this.setBoolean(1292828928, false);
                break;
            }
            case 30: {
                this.setInteger(15429, 4);
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Wcns", bl, 167);
                break;
            }
            case 31: {
                this.setInteger(15429, 3);
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Wcns", bl, 167);
                break;
            }
            case 32: {
                this.setInteger(15429, 0);
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Wcns", bl, 167);
                break;
            }
            case 33: {
                this.setInteger(15429, 2);
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Wcns", bl, 167);
                break;
            }
            case 34: {
                this.showView("Wcsi", bl, 167);
                break;
            }
            case 40: {
                this.showView("Wccs_259D", bl, 167);
                break;
            }
            case 41: {
                this.showView("Wcsep", bl, 167);
                break;
            }
            case 42: {
                this.showView("Wcid", bl, 167);
                break;
            }
            case 44: {
                this.showView("Wcwhl", bl, 167);
                break;
            }
            case 45: {
                this.enterIncludeDdpGroup(167);
                break;
            }
            case 46: {
                this.showView("Wcw", bl, 167);
                break;
            }
            case 47: {
                this.showView("Wcc", bl, 167);
                break;
            }
            case 48: {
                this.showView("Wcnw", bl, 167);
                break;
            }
            case 49: {
                if (!this.getBoolean(32340) || this.getBoolean(1827078144) || this.getBoolean(19680)) break;
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 929074505);
                break;
            }
            case 50: {
                if (!this.getBoolean(689766656)) break;
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -177828535);
                break;
            }
            case 55: {
                this.setInteger(-1411383296, 3);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1411383296));
                this.triggerObserver(1460470592, eventGeneric);
                this.triggerObserver(1561002048);
                break;
            }
            case 57: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(1292828928, false);
                this.showView("Wcnsa", bl, 167);
                break;
            }
            case 59: {
                this.enterWaitaphoreForProperty(-1399586816, 335, 440, 1483312457, 1466535241);
                break;
            }
            case 62: {
                this.setBoolean(-291766272, true);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-291766272));
                this.triggerObserver(-836302528, eventGeneric);
                this.setBoolean(30452, true);
                eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(421724416));
                eventGeneric.setBoolean(1, this.getBoolean(30452));
                this.triggerObserver(973668416, eventGeneric);
                break;
            }
            case 64: {
                this.enterIncludeDdpGroup(167);
                break;
            }
            case 65: {
                this.enterIncludeDdpGroup(167);
                break;
            }
            case 66: {
                this.showView("Wocnip", bl, 167);
                break;
            }
            case 67: {
                this.showView("Wocnipwf", bl, 167);
                break;
            }
            case 68: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 928746825);
                break;
            }
            case 71: {
                this.showView("Wocnaa", bl, 167);
                break;
            }
            case 72: {
                this.showView("Wocnp", bl, 167);
                break;
            }
            case 73: {
                this.showView("Wocnpoa", bl, 167);
                break;
            }
            case 74: {
                this.showView("Wocnui", bl, 167);
                break;
            }
            case 75: {
                this.showView("Wof", bl, 167);
                break;
            }
            case 76: {
                this.showView("Wosll", bl, 167);
                break;
            }
            case 77: {
                this.showView("Wos", bl, 167);
                break;
            }
            case 78: {
                this.showView("Wos", bl, 167);
                break;
            }
        }
    }

    private void performStateExitAction_SubIConnWizardMainBridge(int n) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.setBoolean(251396096, false);
                this.setBoolean(-627638272, false);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-627638272));
                this.triggerObserver(1443693376, eventGeneric);
                this.setBoolean(32340, false);
                this.setBoolean(689766656, false);
                this.setInteger(1235353600, 0);
                this.setInteger(32117, 0);
                break;
            }
            case 25: {
                this.hideView("Wccs_974F");
                this.setInteger(1963786496, 5);
                break;
            }
            case 26: {
                this.hideView("Wcscm");
                this.setInteger(1963786496, 3);
                break;
            }
            case 27: {
                this.setBoolean(1292828928, false);
                this.triggerObserver(1040842816);
                this.setInteger(-1411383296, 0);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1411383296));
                this.triggerObserver(1460470592, eventGeneric);
                break;
            }
            case 30: {
                this.hideView("Wcns");
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                break;
            }
            case 31: {
                this.hideView("Wcns");
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                break;
            }
            case 32: {
                this.hideView("Wcns");
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                break;
            }
            case 33: {
                this.hideView("Wcns");
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                break;
            }
            case 34: {
                this.hideView("Wcsi");
                break;
            }
            case 40: {
                this.hideView("Wccs_259D");
                this.setInteger(1963786496, 6);
                break;
            }
            case 41: {
                this.hideView("Wcsep");
                this.setInteger(1963786496, 2);
                break;
            }
            case 42: {
                this.hideView("Wcid");
                if (!this.getBoolean(-1748303872)) {
                    this.triggerObserver(1544159296);
                }
                this.setBoolean(-1748303872, false);
                break;
            }
            case 44: {
                this.hideView("Wcwhl");
                break;
            }
            case 45: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 46: {
                this.hideView("Wcw");
                break;
            }
            case 47: {
                this.hideView("Wcc");
                this.setInteger(1963786496, 1);
                break;
            }
            case 48: {
                this.hideView("Wcnw");
                break;
            }
            case 55: {
                this.setInteger(25273, 0);
                break;
            }
            case 57: {
                this.hideView("Wcnsa");
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(1292828928, false);
                break;
            }
            case 59: {
                this.leaveWaitaphore();
                break;
            }
            case 62: {
                this.setBoolean(30452, false);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(421724416));
                eventGeneric.setBoolean(1, this.getBoolean(30452));
                this.triggerObserver(973668416, eventGeneric);
                break;
            }
            case 64: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 65: {
                this.leaveIncludeDdpGroup();
                break;
            }
            case 66: {
                this.hideView("Wocnip");
                break;
            }
            case 67: {
                this.hideView("Wocnipwf");
                break;
            }
            case 68: {
                this.setInteger(25273, 0);
                break;
            }
            case 70: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1201631927);
                break;
            }
            case 71: {
                this.hideView("Wocnaa");
                break;
            }
            case 72: {
                this.hideView("Wocnp");
                break;
            }
            case 73: {
                this.hideView("Wocnpoa");
                break;
            }
            case 74: {
                this.hideView("Wocnui");
                break;
            }
            case 75: {
                this.hideView("Wof");
                this.setBoolean(1558708224, true);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(1558708224));
                this.triggerObserver(1426916160, eventGeneric);
                this.setBoolean(251396096, false);
                this.setBoolean(-627638272, false);
                eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-627638272));
                this.triggerObserver(1443693376, eventGeneric);
                break;
            }
            case 76: {
                this.hideView("Wosll");
                break;
            }
            case 77: {
                this.hideView("Wos");
                this.setBoolean(1558708224, true);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(1558708224));
                this.triggerObserver(1426916160, eventGeneric);
                this.setBoolean(251396096, false);
                this.setBoolean(-627638272, false);
                eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-627638272));
                this.triggerObserver(1443693376, eventGeneric);
                this.triggerObserver(1645019968);
                break;
            }
            case 78: {
                this.hideView("Wos");
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubIConnWizardMainBridge(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                return this.getBoolean(32340);
            }
            case 1: {
                return this.getInteger(18981) == 0;
            }
            case 2: {
                return this.getBoolean(32340);
            }
            case 3: {
                return !this.getBoolean(32340);
            }
            case 5: {
                return this.getBoolean(1812136192);
            }
            case 16: {
                return this.getBoolean(32340) && !this.getBoolean(1827078144) && !this.getBoolean(19680);
            }
            case 20: {
                return this.getLicValue(1899234048, 3, this.getInteger(-1363148800), 0) != 0 && (!this.getBoolean(-678821888) || this.getLicValue(1899234048, 3, this.getInteger(-1363148800), 0) != 1);
            }
            case 23: {
                return this.getBoolean(32340) && !this.getBoolean(1827078144) && !this.getBoolean(19680);
            }
            case 24: {
                return !this.getBoolean(25376);
            }
            case 25: {
                return this.getBoolean(32340);
            }
            case 43: {
                return this.getLicValue(3344, 1, 0, 0) == 4 && !this.getBoolean(-1712783360);
            }
            case 44: {
                return this.getBoolean(32340);
            }
            case 55: {
                return this.getLicValue(3344, 1, 0, 0) == 4 && !this.getBoolean(-1712783360);
            }
            case 56: {
                return this.getBoolean(32340);
            }
            case 57: {
                return this.getBoolean(32340) && this.getInteger(25273) == 1;
            }
            case 58: {
                return this.getBoolean(32340);
            }
            case 59: {
                return this.getInteger(1235353600) != 0;
            }
            case 60: {
                return !this.getBoolean(32340) && this.getInteger(32117) != 0;
            }
            case 61: {
                return this.getInteger(11190) == 0;
            }
            case 62: {
                return this.getInteger(11190) == 1;
            }
            case 72: {
                return this.getBoolean(888012800);
            }
            case 77: {
                return this.getBoolean(32340);
            }
            case 80: {
                return !this.getBoolean(32340) && this.getInteger(32117) == 2;
            }
            case 81: {
                return this.getInteger(32117) == 3 && !this.getBoolean(32340);
            }
            case 82: {
                return !this.getBoolean(32340) && this.getInteger(32117) == 1;
            }
            case 83: {
                return this.getBoolean(32340);
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubIConnWizardMainBridge(int n) {
        this.performInternalTransitionAction_SubIConnWizardMainBridge00(n);
    }

    private void performInternalTransitionAction_SubIConnWizardMainBridge00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1314950473);
                break;
            }
            case 1: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1314950473);
                break;
            }
            case 2: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 912297289);
                break;
            }
            case 3: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1499172169);
                break;
            }
            case 5: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 425364809);
                break;
            }
            case 6: {
                this.setBoolean(853606400, true);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(853606400));
                this.triggerObserver(1510802240, eventGeneric);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1218671287);
                break;
            }
            case 7: {
                this.setBoolean(853606400, false);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(853606400));
                this.triggerObserver(1510802240, eventGeneric);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1218671287);
                break;
            }
            case 8: {
                this.triggerObserver(453050432);
                break;
            }
            case 9: {
                this.setString(1272381440, FlowListMenuActivity.evSpellerValuePressedChar());
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setString(0, this.getString(1272381440));
                this.triggerObserver(469827648, eventGeneric);
                break;
            }
            case 10: {
                this.setBoolean(1292828928, true);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1217884855);
                break;
            }
            case 11: {
                this.setBoolean(1292828928, false);
                break;
            }
            case 12: {
                this.setInteger(32606, FlowListMenuActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(32606));
                this.triggerObserver(-670433216, eventGeneric);
                break;
            }
            case 13: {
                this.setInteger(15429, 1);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 475696457);
                break;
            }
            case 14: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 475696457);
                break;
            }
            case 15: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 475696457);
                break;
            }
            case 16: {
                this.triggerObserver(83951680);
                this.setBoolean(-1138425600, true);
                this.setBoolean(17308, true);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 929074505);
                this.setBoolean(-1748303872, true);
                break;
            }
            case 17: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1063292233);
                this.triggerObserver(83951680);
                this.setBoolean(-1138425600, true);
                this.setBoolean(17308, true);
                this.setBoolean(-1748303872, true);
                break;
            }
            case 18: {
                this.triggerObserver(1544159296);
                this.setBoolean(-1748303872, true);
                break;
            }
            case 19: {
                this.setInteger(-1363148800, FlowListMenuActivity.evListItemActionIndex());
                break;
            }
            case 20: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -816214711);
                break;
            }
            case 21: {
                this.setInteger(2030502144, FlowListMenuActivity.evListItemActionIndex());
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(2030502144));
                this.triggerObserver(1477247808, eventGeneric);
                break;
            }
            case 22: {
                this.triggerObserver(235601984);
                break;
            }
            case 23: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 929074505);
                break;
            }
            case 24: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -732328631);
                break;
            }
            case 25: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 912297289);
                break;
            }
            case 27: {
                this.triggerObserver(1326121024);
                break;
            }
            case 28: {
                this.setString(-1110048768, FlowListMenuActivity.evSpellerValuePressedChar());
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setString(0, this.getString(-1110048768));
                this.triggerObserver(1359675456, eventGeneric);
                break;
            }
            case 29: {
                this.setBoolean(1292828928, true);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1217884855);
                break;
            }
            case 30: {
                this.setBoolean(1292828928, false);
                break;
            }
            case 31: {
                this.setInteger(19318, FlowListMenuActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(19318));
                this.triggerObserver(1376452672, eventGeneric);
                break;
            }
            case 32: {
                this.triggerObserver(1342898240);
                break;
            }
            case 33: {
                this.setInteger(-2098135040, 0);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2098135040));
                this.triggerObserver(1057554496, eventGeneric);
                break;
            }
            case 34: {
                this.setInteger(-2098135040, 1);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2098135040));
                this.triggerObserver(1057554496, eventGeneric);
                break;
            }
            case 35: {
                this.setInteger(-2098135040, 2);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2098135040));
                this.triggerObserver(1057554496, eventGeneric);
                break;
            }
            case 36: {
                this.setInteger(1656815616, FlowListMenuActivity.evPointX());
                this.setInteger(1589706752, FlowListMenuActivity.evPointY());
                this.setInteger(-115867392, 0);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1656815616));
                eventGeneric.setInt(1, this.getInteger(1589706752));
                eventGeneric.setInt(2, this.getInteger(29408));
                eventGeneric.setInt(3, this.getInteger(29405));
                eventGeneric.setInt(4, this.getInteger(-275578880));
                eventGeneric.setInt(5, this.getInteger(-1612906496));
                eventGeneric.setInt(6, this.getInteger(-115867392));
                this.triggerObserver(1040777280, eventGeneric);
                break;
            }
            case 37: {
                this.setInteger(1656815616, FlowListMenuActivity.evPointX());
                this.setInteger(1589706752, FlowListMenuActivity.evPointY());
                this.setInteger(29408, FlowListMenuActivity.evPointGestureParam1());
                this.setInteger(29405, FlowListMenuActivity.evPointGestureParam2());
                this.setInteger(-115867392, 3);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1656815616));
                eventGeneric.setInt(1, this.getInteger(1589706752));
                eventGeneric.setInt(2, this.getInteger(29408));
                eventGeneric.setInt(3, this.getInteger(29405));
                eventGeneric.setInt(4, this.getInteger(-275578880));
                eventGeneric.setInt(5, this.getInteger(-1612906496));
                eventGeneric.setInt(6, this.getInteger(-115867392));
                this.triggerObserver(1040777280, eventGeneric);
                break;
            }
            case 38: {
                this.setInteger(1656815616, FlowListMenuActivity.evPointX());
                this.setInteger(1589706752, FlowListMenuActivity.evPointY());
                this.setInteger(29408, FlowListMenuActivity.evPointGestureParam1());
                this.setInteger(29405, FlowListMenuActivity.evPointGestureParam2());
                this.setInteger(-115867392, 3);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1656815616));
                eventGeneric.setInt(1, this.getInteger(1589706752));
                eventGeneric.setInt(2, this.getInteger(29408));
                eventGeneric.setInt(3, this.getInteger(29405));
                eventGeneric.setInt(4, this.getInteger(-275578880));
                eventGeneric.setInt(5, this.getInteger(-1612906496));
                eventGeneric.setInt(6, this.getInteger(-115867392));
                this.triggerObserver(1040777280, eventGeneric);
                break;
            }
            case 39: {
                this.setInteger(1656815616, FlowListMenuActivity.evPointX());
                this.setInteger(1589706752, FlowListMenuActivity.evPointY());
                this.setInteger(-275578880, FlowListMenuActivity.evPointGestureParam2());
                this.setInteger(-1612906496, FlowListMenuActivity.evPointGestureParam1());
                this.setInteger(-115867392, 4);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1656815616));
                eventGeneric.setInt(1, this.getInteger(1589706752));
                eventGeneric.setInt(2, this.getInteger(29408));
                eventGeneric.setInt(3, this.getInteger(29405));
                eventGeneric.setInt(4, this.getInteger(-275578880));
                eventGeneric.setInt(5, this.getInteger(-1612906496));
                eventGeneric.setInt(6, this.getInteger(-115867392));
                this.triggerObserver(1040777280, eventGeneric);
                break;
            }
            case 40: {
                this.setInteger(1656815616, FlowListMenuActivity.evPointX());
                this.setInteger(1589706752, FlowListMenuActivity.evPointY());
                this.setInteger(-115867392, 1);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1656815616));
                eventGeneric.setInt(1, this.getInteger(1589706752));
                eventGeneric.setInt(2, this.getInteger(29408));
                eventGeneric.setInt(3, this.getInteger(29405));
                eventGeneric.setInt(4, this.getInteger(-275578880));
                eventGeneric.setInt(5, this.getInteger(-1612906496));
                eventGeneric.setInt(6, this.getInteger(-115867392));
                this.triggerObserver(1040777280, eventGeneric);
                break;
            }
            case 41: {
                this.setInteger(384172032, FlowListMenuActivity.evIntegerValueValue());
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(384172032));
                this.triggerObserver(-886634176, eventGeneric);
                break;
            }
            case 42: {
                this.setInteger(-840761344, FlowListMenuActivity.evIntegerValueValue());
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-840761344));
                this.triggerObserver(-903411392, eventGeneric);
                break;
            }
            case 43: {
                this.setBoolean(-1712783360, true);
                break;
            }
            case 44: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 912297289);
                break;
            }
            case 45: {
                this.setInteger(-2098135040, 0);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2098135040));
                this.triggerObserver(1057554496, eventGeneric);
                break;
            }
            case 46: {
                this.setInteger(-2098135040, 1);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2098135040));
                this.triggerObserver(1057554496, eventGeneric);
                break;
            }
            case 47: {
                this.setInteger(-2098135040, 2);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2098135040));
                this.triggerObserver(1057554496, eventGeneric);
                break;
            }
            case 48: {
                this.setInteger(1656815616, FlowListMenuActivity.evPointX());
                this.setInteger(1589706752, FlowListMenuActivity.evPointY());
                this.setInteger(-115867392, 0);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1656815616));
                eventGeneric.setInt(1, this.getInteger(1589706752));
                eventGeneric.setInt(2, this.getInteger(29408));
                eventGeneric.setInt(3, this.getInteger(29405));
                eventGeneric.setInt(4, this.getInteger(-275578880));
                eventGeneric.setInt(5, this.getInteger(-1612906496));
                eventGeneric.setInt(6, this.getInteger(-115867392));
                this.triggerObserver(1040777280, eventGeneric);
                break;
            }
            case 49: {
                this.setInteger(1656815616, FlowListMenuActivity.evPointX());
                this.setInteger(1589706752, FlowListMenuActivity.evPointY());
                this.setInteger(29408, FlowListMenuActivity.evPointGestureParam1());
                this.setInteger(29405, FlowListMenuActivity.evPointGestureParam2());
                this.setInteger(-115867392, 3);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1656815616));
                eventGeneric.setInt(1, this.getInteger(1589706752));
                eventGeneric.setInt(2, this.getInteger(29408));
                eventGeneric.setInt(3, this.getInteger(29405));
                eventGeneric.setInt(4, this.getInteger(-275578880));
                eventGeneric.setInt(5, this.getInteger(-1612906496));
                eventGeneric.setInt(6, this.getInteger(-115867392));
                this.triggerObserver(1040777280, eventGeneric);
                break;
            }
            case 50: {
                this.setInteger(1656815616, FlowListMenuActivity.evPointX());
                this.setInteger(1589706752, FlowListMenuActivity.evPointY());
                this.setInteger(29408, FlowListMenuActivity.evPointGestureParam1());
                this.setInteger(29405, FlowListMenuActivity.evPointGestureParam2());
                this.setInteger(-115867392, 3);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1656815616));
                eventGeneric.setInt(1, this.getInteger(1589706752));
                eventGeneric.setInt(2, this.getInteger(29408));
                eventGeneric.setInt(3, this.getInteger(29405));
                eventGeneric.setInt(4, this.getInteger(-275578880));
                eventGeneric.setInt(5, this.getInteger(-1612906496));
                eventGeneric.setInt(6, this.getInteger(-115867392));
                this.triggerObserver(1040777280, eventGeneric);
                break;
            }
            case 51: {
                this.setInteger(1656815616, FlowListMenuActivity.evPointX());
                this.setInteger(1589706752, FlowListMenuActivity.evPointY());
                this.setInteger(-275578880, FlowListMenuActivity.evPointGestureParam2());
                this.setInteger(-1612906496, FlowListMenuActivity.evPointGestureParam1());
                this.setInteger(-115867392, 4);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1656815616));
                eventGeneric.setInt(1, this.getInteger(1589706752));
                eventGeneric.setInt(2, this.getInteger(29408));
                eventGeneric.setInt(3, this.getInteger(29405));
                eventGeneric.setInt(4, this.getInteger(-275578880));
                eventGeneric.setInt(5, this.getInteger(-1612906496));
                eventGeneric.setInt(6, this.getInteger(-115867392));
                this.triggerObserver(1040777280, eventGeneric);
                break;
            }
            case 52: {
                this.setInteger(1656815616, FlowListMenuActivity.evPointX());
                this.setInteger(1589706752, FlowListMenuActivity.evPointY());
                this.setInteger(-115867392, 1);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1656815616));
                eventGeneric.setInt(1, this.getInteger(1589706752));
                eventGeneric.setInt(2, this.getInteger(29408));
                eventGeneric.setInt(3, this.getInteger(29405));
                eventGeneric.setInt(4, this.getInteger(-275578880));
                eventGeneric.setInt(5, this.getInteger(-1612906496));
                eventGeneric.setInt(6, this.getInteger(-115867392));
                this.triggerObserver(1040777280, eventGeneric);
                break;
            }
            case 53: {
                this.setInteger(384172032, FlowListMenuActivity.evIntegerValueValue());
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(384172032));
                this.triggerObserver(-886634176, eventGeneric);
                break;
            }
            case 54: {
                this.setInteger(-840761344, FlowListMenuActivity.evIntegerValueValue());
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-840761344));
                this.triggerObserver(-903411392, eventGeneric);
                break;
            }
            case 55: {
                this.setBoolean(-1712783360, true);
                break;
            }
            case 56: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 912297289);
                break;
            }
            case 57: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1264618825);
                break;
            }
            case 58: {
                this.triggerObserver(1628242752);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 912297289);
                break;
            }
            case 59: {
                this.setInteger(32117, 0);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1499172169);
                break;
            }
            case 60: {
                this.setInteger(1219231744, 3);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1432390985);
                break;
            }
            case 61: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 912887113);
                break;
            }
            case 62: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 761892169);
                break;
            }
            case 63: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1150972599);
                break;
            }
            case 64: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 896109897);
                break;
            }
            case 65: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 896109897);
                break;
            }
            case 66: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 896109897);
                break;
            }
            case 67: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 896109897);
                break;
            }
            case 68: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 896109897);
                break;
            }
            case 69: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 896109897);
                break;
            }
            case 70: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 896109897);
                break;
            }
            case 71: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 896109897);
                break;
            }
            case 72: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1234727607);
                this.setBoolean(888012800, false);
                break;
            }
            case 73: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 760909129);
                break;
            }
            case 74: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 777686345);
                break;
            }
            case 75: {
                if (this.getInteger(1235353600) == 1 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -379548343);
                }
                if (this.getInteger(1235353600) == 4 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -362771127);
                }
                if (this.getInteger(-1799880704) == 1) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -345993911);
                }
                if (this.getInteger(1235353600) == 3 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -329216695);
                }
                if (this.getInteger(1235353600) == 9 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -312439479);
                }
                if (this.getInteger(1235353600) == 10 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -295662263);
                }
                if (this.getInteger(1235353600) == 15 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -278885047);
                }
                if (this.getInteger(1235353600) == 14 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -262107831);
                }
                if (this.getInteger(1235353600) == 13 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -245330615);
                }
                if (this.getInteger(1235353600) == 98 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -413102775);
                }
                if (this.getInteger(1235353600) == 2 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -396325559);
                }
                if (this.getInteger(1235353600) == 16 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -228553399);
                }
                if (this.getInteger(1235353600) == 19 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -211776183);
                }
                if (this.getInteger(1235353600) == 97 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -178221751);
                }
                if (this.getInteger(1235353600) == 8 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -194998967);
                }
                if (this.getInteger(1235353600) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1499172169);
                }
                this.setInteger(1235353600, 0);
                break;
            }
            case 76: {
                this.setInteger(1219231744, 4);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1432390985);
                break;
            }
            case 77: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 929074505);
                break;
            }
            case 78: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1499172169);
                this.setBoolean(30264, true);
                break;
            }
            case 79: {
                if (this.getInteger(1235353600) == 1 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -379548343);
                }
                if (this.getInteger(1235353600) == 4 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -362771127);
                }
                if (this.getInteger(-1799880704) == 1) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -345993911);
                }
                if (this.getInteger(1235353600) == 3 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -329216695);
                }
                if (this.getInteger(1235353600) == 9 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -312439479);
                }
                if (this.getInteger(1235353600) == 10 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -295662263);
                }
                if (this.getInteger(1235353600) == 15 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -278885047);
                }
                if (this.getInteger(1235353600) == 14 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -262107831);
                }
                if (this.getInteger(1235353600) == 13 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -245330615);
                }
                if (this.getInteger(1235353600) == 98 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -413102775);
                }
                if (this.getInteger(1235353600) == 2 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -396325559);
                }
                if (this.getInteger(1235353600) == 16 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -228553399);
                }
                if (this.getInteger(1235353600) == 19 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -211776183);
                }
                if (this.getInteger(1235353600) == 97 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -178221751);
                }
                if (this.getInteger(1235353600) == 8 && this.getInteger(-1799880704) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -194998967);
                }
                if (this.getInteger(1235353600) == 0) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1499172169);
                }
                this.setInteger(1235353600, 0);
                break;
            }
            case 80: {
                this.setInteger(1235353600, 0);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1234727607);
                break;
            }
            case 81: {
                this.setInteger(32117, 0);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1264618825);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1392317184);
                break;
            }
            case 82: {
                this.setInteger(1235353600, 0);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1234727607);
                break;
            }
            case 83: {
                this.setBoolean(1558708224, true);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(1558708224));
                this.triggerObserver(1426916160, eventGeneric);
                this.setBoolean(251396096, false);
                this.setBoolean(-627638272, false);
                eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-627638272));
                this.triggerObserver(1443693376, eventGeneric);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 929074505);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubIConnWizardMainBridge(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                return this.getInteger(-1163591680) == 0 && this.getBoolean(30686);
            }
            case 16: {
                return this.getInteger(-1163591680) == 1 || this.getInteger(-1163591680) == 2;
            }
            case 27: {
                return (this.getInteger(-1163591680) == 0 || this.getInteger(10348) == 1 || this.getInteger(-500891392) == 1) && this.getBoolean(30686);
            }
            case 38: {
                return this.getLicValue(3344, 4, 0, 0) == 3;
            }
            case 41: {
                return this.getLicValue(3344, 4, 0, 0) == 2;
            }
            case 51: {
                return !this.getBoolean(888012800);
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubIConnWizardMainBridge(int n) {
        this.performTriggeredTransitionAction_SubIConnWizardMainBridge00(n);
    }

    private void performTriggeredTransitionAction_SubIConnWizardMainBridge00(int n) {
        switch (n - this.TT_OFFSET) {
            case 2: {
                this.setBoolean(251396096, true);
                this.setBoolean(-627638272, true);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-627638272));
                this.triggerObserver(1443693376, eventGeneric);
                this.setInteger(1235353600, this.getInteger(18981));
                this.setBoolean(30264, false);
                break;
            }
            case 3: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 4: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 5: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 7: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 8: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 9: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 10: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 11: {
                this.triggerObserver(1208812352);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 12: {
                this.triggerObserver(1192035136);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 13: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 14: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                this.setInteger(-1411383296, 1);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1411383296));
                this.triggerObserver(1460470592, eventGeneric);
                break;
            }
            case 17: {
                this.setInteger(28826, 8);
                this.setInteger(28985, 63);
                this.setInteger(1438187520, 3);
                this.triggerObserver(688586816);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 18: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 19: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 20: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 21: {
                this.triggerObserver(235601984);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 22: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 23: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 24: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 25: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 28: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                this.setInteger(25273, 1);
                break;
            }
            case 29: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 32: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 928746825);
                break;
            }
            case 34: {
                this.triggerObserver(-987297472);
                break;
            }
            case 35: {
                this.triggerObserver(-1004074688);
                break;
            }
            case 36: {
                this.triggerObserver(-987297472);
                break;
            }
            case 37: {
                this.triggerObserver(-1004074688);
                break;
            }
            case 47: {
                this.setInteger(421724416, 4);
                break;
            }
            case 51: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                this.setInteger(25273, 1);
                break;
            }
            case 52: {
                this.setInteger(25273, 2);
                break;
            }
            case 53: {
                this.setInteger(421724416, 3);
                break;
            }
            case 54: {
                this.setInteger(25273, 1);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubIConnWizardMainBridge(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                return this.getInteger(84148480) != 1 && !this.getBoolean(1787297792) && this.getInteger(32117) != 2;
            }
            case 2: {
                return this.getInteger(32117) != 0;
            }
            case 4: {
                return this.getBoolean(-167313152) || this.getInteger(-404357120) == 2 && this.getBoolean(-1628045312) || this.getBoolean(1787297792) && !this.getBoolean(19680);
            }
            case 7: {
                return this.getInteger(-500891392) == 0 && this.getInteger(10348) == 0;
            }
            case 9: {
                return this.getInteger(-500891392) == 0 && this.getInteger(10348) == 0;
            }
            case 11: {
                return !this.getBoolean(30686) && this.getBoolean(1419051008);
            }
            case 12: {
                return !this.getBoolean(1419051008);
            }
            case 15: {
                return this.getInteger(1963786496) == 3;
            }
            case 16: {
                return this.getInteger(1963786496) == 2;
            }
            case 17: {
                return this.getInteger(1963786496) == 5;
            }
            case 19: {
                return this.getInteger(10348) == 2;
            }
            case 21: {
                return this.getBoolean(30686);
            }
            case 26: {
                return !this.getBoolean(20928) && this.getBoolean(1005518848);
            }
            case 28: {
                return this.getInteger(10348) == 0;
            }
            case 29: {
                return !this.getBoolean(20928) && this.getBoolean(1005518848);
            }
            case 31: {
                return this.getInteger(10348) == 0;
            }
            case 34: {
                return this.getInteger(26701) == 3;
            }
            case 35: {
                return this.getInteger(26701) == 4;
            }
            case 38: {
                return this.getInteger(-500891392) == 0;
            }
            case 39: {
                return this.getInteger(-500891392) == 2;
            }
            case 41: {
                return this.getInteger(-500891392) == 0;
            }
            case 43: {
                return this.getInteger(-500891392) == 1;
            }
            case 48: {
                return this.getInteger(18981) == 0 && !this.getBoolean(32340) && (this.getBoolean(-1711472640) || this.getInteger(20401) == 1 || this.getInteger(20401) == 0);
            }
            case 49: {
                return (this.getBoolean(-1711472640) || this.getInteger(20401) == 1) && this.getInteger(18981) != 0;
            }
            case 50: {
                return !this.getBoolean(-107282432) && this.getBoolean(32340) && (this.getInteger(20401) == 0 || this.getInteger(20401) == 1);
            }
            case 51: {
                return !this.getBoolean(-107282432) && this.getInteger(20401) == 2 && this.getInteger(32117) != 0;
            }
            case 52: {
                return !this.getBoolean(-107282432) && this.getInteger(20401) == 2 && this.getInteger(32117) == 0;
            }
            case 53: {
                return !this.getBoolean(-107282432) && this.getInteger(20401) == 1 && this.getInteger(1235353600) == 0;
            }
            case 54: {
                return this.getBoolean(-107282432);
            }
            case 56: {
                return this.getInteger(1235353600) == 0;
            }
            case 57: {
                return this.getBoolean(19680) && this.getInteger(-1399586816) == 3 && this.getInteger(1235353600) != 0;
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubIConnWizardMainBridge(int n) {
        switch (n - this.UT_OFFSET) {
            case 0: {
                this.setBoolean(-116981504, false);
                break;
            }
            case 3: {
                break;
            }
            case 7: {
                if (this.getBoolean(-1628045312)) break;
                this.triggerObserver(520159296);
                break;
            }
            case 9: {
                if (this.getBoolean(-1628045312)) break;
                this.triggerObserver(520159296);
                break;
            }
            case 11: {
                if (this.getBoolean(-1628045312)) break;
                this.triggerObserver(520159296);
                break;
            }
            case 12: {
                this.setInteger(1963786496, 0);
                break;
            }
            case 16: {
                this.setInteger(1963786496, 0);
                break;
            }
            case 17: {
                this.setInteger(1963786496, 0);
                break;
            }
            case 18: {
                this.setInteger(1963786496, 0);
                break;
            }
            case 20: {
                if (this.getBoolean(1959854080)) {
                    this.setInteger(-1411383296, 2);
                }
                if (!this.getBoolean(1959854080)) {
                    this.setInteger(-1411383296, 1);
                }
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1411383296));
                this.triggerObserver(1460470592, eventGeneric);
                break;
            }
            case 23: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 31: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 34: {
                this.triggerObserver(1275789376);
                break;
            }
            case 35: {
                this.triggerObserver(1275789376);
                break;
            }
            case 41: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 46: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 49: {
                if (this.getBoolean(32340)) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 929074505);
                }
                if (!this.getBoolean(32340)) {
                    this.setInteger(1084751872, this.getInteger(1235353600));
                }
                if (!this.getBoolean(32340)) {
                    EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(1084751872));
                    this.triggerObserver(1054217024, eventGeneric);
                }
                if (this.getBoolean(32340)) break;
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1180339529);
                break;
            }
            case 50: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 929074505);
                break;
            }
            case 52: {
                this.setInteger(26351, 44);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(26351));
                this.triggerObserver(1523979072, eventGeneric);
                break;
            }
            case 58: {
                if (this.getBoolean(32340)) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 929074505);
                }
                if (!this.getBoolean(32340)) {
                    this.setInteger(1084751872, this.getInteger(1235353600));
                }
                if (!this.getBoolean(32340)) {
                    EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(1084751872));
                    this.triggerObserver(1054217024, eventGeneric);
                }
                if (this.getBoolean(32340)) break;
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1180339529);
                break;
            }
            case 61: {
                if (this.getBoolean(32340)) {
                    FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 929074505);
                }
                if (!this.getBoolean(32340)) {
                    this.setInteger(1084751872, this.getInteger(18981));
                }
                if (this.getBoolean(32340)) break;
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1084751872));
                this.triggerObserver(1054217024, eventGeneric);
                break;
            }
            case 62: {
                FlowListMenuActivity.lockWaitaphore(-1399586816, 10000);
                this.triggerObserver(1792414528);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIConnWlanSpeller(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.setBoolean(1292828928, false);
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.showView("Cws", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    private void performStateExitAction_SubIConnWlanSpeller(int n) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.hideView("Cws");
                this.setBoolean(1292828928, false);
                this.setInteger(28985, 100);
                this.setInteger(28826, 1);
                this.triggerObserver(-1224081344);
                this.setInteger(1438187520, 0);
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubIConnWlanSpeller(int n) {
        switch (n - this.IT_OFFSET) {
            case 5: {
                return this.getInteger(1438187520) == 1;
            }
            case 6: {
                return this.getInteger(1438187520) == 2;
            }
            case 7: {
                return this.getInteger(1438187520) == 3;
            }
            case 8: {
                return this.getInteger(1438187520) == 5;
            }
            case 9: {
                return this.getInteger(1438187520) == 4;
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubIConnWlanSpeller(int n) {
        this.performInternalTransitionAction_SubIConnWlanSpeller0(n);
    }

    private void performInternalTransitionAction_SubIConnWlanSpeller0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.triggerObserver(-1190526912);
                break;
            }
            case 1: {
                this.setString(21124, FlowListMenuActivity.evSpellerValuePressedChar());
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setString(0, this.getString(21124));
                this.triggerObserver(-1173749696, eventGeneric);
                break;
            }
            case 2: {
                this.setBoolean(1292828928, true);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1217884855);
                break;
            }
            case 3: {
                this.setBoolean(1292828928, false);
                break;
            }
            case 4: {
                this.setInteger(565510144, FlowListMenuActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(565510144));
                this.triggerObserver(-703987648, eventGeneric);
                break;
            }
            case 5: {
                this.triggerObserver(722141248);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1163955529);
                break;
            }
            case 6: {
                this.triggerObserver(705364032);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1163955529);
                break;
            }
            case 7: {
                this.triggerObserver(772472896);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1163955529);
                break;
            }
            case 8: {
                this.triggerObserver(738918464);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1163955529);
                break;
            }
            case 9: {
                this.triggerObserver(755695680);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, 1163955529);
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubIConnWlanSpeller(int n) {
        this.performTriggeredTransitionAction_SubIConnWlanSpeller0(n);
    }

    private void performTriggeredTransitionAction_SubIConnWlanSpeller0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 1: {
                this.triggerObserver(-1207304128);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
        }
    }

    private void performStateEntryAction_SubIWizardOnlineCarNetInternetbrowserSpeller(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.setBoolean(-1397751808, true);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                this.setBoolean(1292828928, false);
                this.showView("Wocnis", bl, 167);
                break;
            }
        }
    }

    private void performStateExitAction_SubIWizardOnlineCarNetInternetbrowserSpeller(int n) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.hideView("Wocnis");
                this.setBoolean(-1397751808, false);
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1397751808));
                this.triggerObserver(1459945536, eventGeneric);
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubIWizardOnlineCarNetInternetbrowserSpeller(int n) {
        this.performInternalTransitionAction_SubIWizardOnlineCarNetInternetbrowserSpeller0(n);
    }

    private void performInternalTransitionAction_SubIWizardOnlineCarNetInternetbrowserSpeller0(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.triggerObserver(-1020851904);
                break;
            }
            case 1: {
                this.setString(19436, FlowListMenuActivity.evSpellerValuePressedChar());
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setString(0, this.getString(19436));
                this.triggerObserver(-1037629120, eventGeneric);
                break;
            }
            case 2: {
                this.setInteger(-241303552, FlowListMenuActivity.evSpellerValueCursorPosition());
                EventGeneric eventGeneric = FlowListMenuActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-241303552));
                this.triggerObserver(-970520256, eventGeneric);
                break;
            }
            case 3: {
                this.setBoolean(1292828928, true);
                FlowListMenuActivity.fireHMIEvent(ANY, BROADCAST, -1217884855);
                break;
            }
            case 4: {
                this.setBoolean(1292828928, false);
                break;
            }
        }
    }
}

