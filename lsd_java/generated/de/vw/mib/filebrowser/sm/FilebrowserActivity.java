/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.filebrowser.sm;

import de.vw.mib.genericevents.EventGeneric;
import de.vw.mib.sm.internal.statemachine.TopStatemachine;
import generated.de.vw.mib.global.datapool.SkinDataPool;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineActivityBase;

public class FilebrowserActivity
extends StatemachineActivityBase {
    private final int subStatemachineId;

    public FilebrowserActivity(TopStatemachine topStatemachine, int n, int n2, int n3, int n4, int n5) {
        super(topStatemachine, n2, n3, n4, n5);
        this.subStatemachineId = n;
    }

    @Override
    public void performStateEntryAction(int n, boolean bl) {
        switch (this.subStatemachineId) {
            case 9: {
                this.performStateEntryAction_SubHapticFilebrowserDynState(n, bl);
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
            default: {
                return;
            }
        }
    }

    @Override
    public void performStateExitAction(int n) {
        switch (this.subStatemachineId) {
            case 9: {
                this.performStateExitAction_SubHapticFilebrowserDynState(n);
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
            case 9: {
                return this.evalInternalTransitionGuard_SubHapticFilebrowserDynState(n);
            }
        }
        return true;
    }

    @Override
    public void performInternalTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 9: {
                this.performInternalTransitionAction_SubHapticFilebrowserDynState(n);
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
            default: 
        }
        return true;
    }

    @Override
    public void performTriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 9: {
                this.performTriggeredTransitionAction_SubHapticFilebrowserDynState(n);
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
            case 9: {
                return this.evalUntriggeredTransitionGuard_SubHapticFilebrowserDynState(n);
            }
        }
        return true;
    }

    @Override
    public void performUntriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 9: {
                this.performUntriggeredTransitionAction_SubHapticFilebrowserDynState(n);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void performStateEntryAction_SubHapticFilebrowserDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(31672, 2);
                break;
            }
            case 8: {
                this.setInteger(336199936, 7);
                this.setInteger(13561, SkinDataPool.getInteger(190));
                this.setInteger(25296896, 17);
                this.setInteger(31672, 3);
                break;
            }
            case 18: {
                this.setInteger(-220266496, 0);
                this.setInteger(-276758528, 0);
                break;
            }
            case 22: {
                this.setInteger(-1225523200, 3);
                EventGeneric eventGeneric = FilebrowserActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1225523200));
                this.triggerObserver(0x44010040, eventGeneric);
                this.triggerObserver(-1442250688);
                this.showView("Fmsp", bl, 6);
                break;
            }
            case 23: {
                this.showView("Fmsp", bl, 6);
                break;
            }
            case 24: {
                this.triggerObserver(-1442250688);
                this.showView("Fmsr", bl, 6);
                break;
            }
            case 28: {
                this.showView("Fs", bl, 6);
                break;
            }
            case 29: {
                break;
            }
            case 31: {
                this.showView("Fs", bl, 6);
                break;
            }
            case 32: {
                break;
            }
            case 34: {
                this.showView("Fs", bl, 6);
                break;
            }
            case 35: {
                this.setInteger(1167196160, 9);
                EventGeneric eventGeneric = FilebrowserActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1167196160));
                this.triggerObserver(0x50050040, eventGeneric);
                break;
            }
            case 39: {
                FilebrowserActivity.fireHMIEvent(ANY, BROADCAST, 1264618825);
                break;
            }
            case 40: {
                this.setInteger(31672, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubHapticFilebrowserDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(31672, 0);
                break;
            }
            case 8: {
                this.setInteger(13561, SkinDataPool.getInteger(180));
                this.setInteger(25296896, 0);
                break;
            }
            case 11: {
                this.setInteger(797048832, 0);
                break;
            }
            case 22: {
                this.hideView("Fmsp");
                break;
            }
            case 23: {
                this.hideView("Fmsp");
                break;
            }
            case 24: {
                this.hideView("Fmsr");
                break;
            }
            case 28: {
                this.hideView("Fs");
                this.setBoolean(21249, false);
                break;
            }
            case 29: {
                break;
            }
            case 31: {
                this.hideView("Fs");
                break;
            }
            case 32: {
                break;
            }
            case 34: {
                this.hideView("Fs");
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubHapticFilebrowserDynState(int n) {
        switch (n - this.IT_OFFSET) {
            case 2: {
                return this.getInteger(1088815104) == 35;
            }
            case 3: {
                return this.getInteger(1088815104) == 1;
            }
            case 4: {
                return this.getInteger(1088815104) == 10;
            }
            case 5: {
                return this.getInteger(1088815104) == 34;
            }
            case 12: {
                return FilebrowserActivity.evListItemEventSender().equals("Button");
            }
            case 14: {
                return FilebrowserActivity.evListItemEventSender().equals("Button");
            }
            case 16: {
                return FilebrowserActivity.evListItemEventSender().equals("ButtonFolderOpen");
            }
            case 20: {
                return this.getInteger(1088815104) == 2;
            }
            case 21: {
                return this.getInteger(1088815104) == 2;
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubHapticFilebrowserDynState(int n) {
        this.performInternalTransitionAction_SubHapticFilebrowserDynState00(n);
    }

    private void performInternalTransitionAction_SubHapticFilebrowserDynState00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setInteger(13561, SkinDataPool.getInteger(190));
                break;
            }
            case 1: {
                this.setInteger(13561, SkinDataPool.getInteger(180));
                break;
            }
            case 2: {
                FilebrowserActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                break;
            }
            case 3: {
                FilebrowserActivity.fireHMIEvent(ANY, BROADCAST, 1516277065);
                break;
            }
            case 4: {
                this.setInteger(22807, 4);
                FilebrowserActivity.fireHMIEvent(ANY, BROADCAST, 1616940361);
                break;
            }
            case 5: {
                this.setInteger(1088815104, 0);
                this.setInteger(-455409664, 7);
                FilebrowserActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                break;
            }
            case 6: {
                this.setInteger(1843527680, 1);
                EventGeneric eventGeneric = FilebrowserActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1843527680));
                this.triggerObserver(1057030208, eventGeneric);
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -429879991);
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 51);
                break;
            }
            case 7: {
                this.setInteger(1843527680, 2);
                EventGeneric eventGeneric = FilebrowserActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1843527680));
                this.triggerObserver(1057030208, eventGeneric);
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -429879991);
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 51);
                break;
            }
            case 8: {
                this.setInteger(-2098003968, 2);
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -496988855);
                break;
            }
            case 9: {
                this.setInteger(-2098003968, 1);
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -496988855);
                break;
            }
            case 10: {
                this.setInteger(-220266496, 0);
                this.setInteger(-276758528, 0);
                break;
            }
            case 11: {
                this.setInteger(1843527680, 0);
                EventGeneric eventGeneric = FilebrowserActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1843527680));
                this.triggerObserver(1057030208, eventGeneric);
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -429879991);
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 51);
                break;
            }
            case 12: {
                this.setInteger(17596, FilebrowserActivity.evListItemActionIndex());
                EventGeneric eventGeneric = FilebrowserActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(17596));
                this.triggerObserver(0x40010040, eventGeneric);
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -429879991);
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 52);
                break;
            }
            case 13: {
                this.setInteger(1088815104, 0);
                break;
            }
            case 14: {
                this.setInteger(17596, FilebrowserActivity.evListItemActionIndex());
                EventGeneric eventGeneric = FilebrowserActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(17596));
                this.triggerObserver(0x40010040, eventGeneric);
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -429879991);
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 52);
                break;
            }
            case 15: {
                this.setInteger(330956800, this.getInteger(-509673472));
                this.setResourceLocator(29084, this.getResourceLocator(-1869938688));
                EventGeneric eventGeneric = FilebrowserActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(330956800));
                eventGeneric.setObject(1, this.getResourceLocator(29084));
                this.triggerObserver(-1425801152, eventGeneric);
                this.setInteger(22807, 4);
                this.setInteger(1088815104, 0);
                FilebrowserActivity.fireHMIEvent(ANY, BROADCAST, 1616940361);
                break;
            }
            case 16: {
                this.setInteger(17596, FilebrowserActivity.evListItemActionIndex());
                EventGeneric eventGeneric = FilebrowserActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(17596));
                this.triggerObserver(0x40010040, eventGeneric);
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -429879991);
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 52);
                break;
            }
            case 17: {
                this.setInteger(1088815104, 0);
                this.setInteger(-455409664, 7);
                FilebrowserActivity.fireHMIEvent(ANY, BROADCAST, 1449168201);
                break;
            }
            case 19: {
                this.setInteger(-48561920, FilebrowserActivity.evListItemActionIndex());
                EventGeneric eventGeneric = FilebrowserActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-48561920));
                this.triggerObserver(1107361856, eventGeneric);
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 2002488649);
                break;
            }
            case 20: {
                this.setInteger(29840, 10);
                this.setInteger(447414272, 3);
                FilebrowserActivity.fireHMIEvent(ANY, BROADCAST, 1516277065);
                break;
            }
            case 21: {
                this.setInteger(29840, 10);
                this.setInteger(447414272, 3);
                FilebrowserActivity.fireHMIEvent(ANY, BROADCAST, 1516277065);
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubHapticFilebrowserDynState(int n) {
        this.performTriggeredTransitionAction_SubHapticFilebrowserDynState0(n);
    }

    private void performTriggeredTransitionAction_SubHapticFilebrowserDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 3: {
                this.setInteger(-220266496, 0);
                this.setInteger(-276758528, 0);
                break;
            }
            case 5: {
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -429879991);
                FilebrowserActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 51);
                FilebrowserActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 6: {
                FilebrowserActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubHapticFilebrowserDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 7: {
                return this.getInteger(0xEED0000) == 1;
            }
            case 8: {
                return this.getInteger(0xEED0000) == 0;
            }
            case 11: {
                return this.getInteger(447414272) == 1;
            }
            case 12: {
                return this.getInteger(447414272) == 2;
            }
            case 15: {
                return this.getBoolean(2029649920);
            }
            case 18: {
                return this.getInteger(797048832) == 1;
            }
            case 20: {
                return this.getInteger(797048832) == 4;
            }
            case 21: {
                return this.getInteger(797048832) == 1;
            }
            case 24: {
                return this.getInteger(797048832) == 1;
            }
            case 25: {
                return this.getInteger(797048832) == 4;
            }
            case 26: {
                return this.getInteger(797048832) == 2;
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubHapticFilebrowserDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 21: {
                this.setInteger(-1225523200, 1);
                EventGeneric eventGeneric = FilebrowserActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1225523200));
                this.triggerObserver(0x44010040, eventGeneric);
                break;
            }
            case 22: {
                this.setInteger(-1225523200, 2);
                EventGeneric eventGeneric = FilebrowserActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1225523200));
                this.triggerObserver(0x44010040, eventGeneric);
                break;
            }
            case 24: {
                this.setInteger(-1225523200, 2);
                EventGeneric eventGeneric = FilebrowserActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1225523200));
                this.triggerObserver(0x44010040, eventGeneric);
                break;
            }
            case 25: {
                this.setInteger(-1225523200, 3);
                EventGeneric eventGeneric = FilebrowserActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1225523200));
                this.triggerObserver(0x44010040, eventGeneric);
                break;
            }
            case 26: {
                this.setInteger(-1225523200, 2);
                EventGeneric eventGeneric = FilebrowserActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1225523200));
                this.triggerObserver(0x44010040, eventGeneric);
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
}

