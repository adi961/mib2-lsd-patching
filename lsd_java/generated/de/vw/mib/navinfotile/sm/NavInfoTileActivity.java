/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.navinfotile.sm;

import de.vw.mib.genericevents.EventGeneric;
import de.vw.mib.modelapi.ModelApiDownEvent;
import de.vw.mib.sm.internal.statemachine.TopStatemachine;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineActivityBase;

public class NavInfoTileActivity
extends StatemachineActivityBase {
    private final int subStatemachineId;

    public NavInfoTileActivity(TopStatemachine topStatemachine, int n, int n2, int n3, int n4, int n5) {
        super(topStatemachine, n2, n3, n4, n5);
        this.subStatemachineId = n;
    }

    @Override
    public void performStateEntryAction(int n, boolean bl) {
        switch (this.subStatemachineId) {
            case 473: {
                this.performStateEntryAction_SubPopupPoNavInfotileWaitstateDynState(n, bl);
                break;
            }
            case 24: {
                this.performStateEntryAction_SubHapticNavinfotileDynState(n, bl);
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
            case 473: {
                this.performStateExitAction_SubPopupPoNavInfotileWaitstateDynState(n);
                break;
            }
            case 24: {
                this.performStateExitAction_SubHapticNavinfotileDynState(n);
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
            default: 
        }
        return true;
    }

    @Override
    public void performInternalTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 24: {
                this.performInternalTransitionAction_SubHapticNavinfotileDynState(n);
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
            default: 
        }
    }

    @Override
    public boolean evalUntriggeredTransitionGuard(int n) {
        switch (this.subStatemachineId) {
            case 24: {
                return this.evalUntriggeredTransitionGuard_SubHapticNavinfotileDynState(n);
            }
        }
        return true;
    }

    @Override
    public void performUntriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 24: {
                this.performUntriggeredTransitionAction_SubHapticNavinfotileDynState(n);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoNavInfotileWaitstateDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pniw", 473, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoNavInfotileWaitstateDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                NavInfoTileActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pniw");
                break;
            }
        }
    }

    private void performStateEntryAction_SubHapticNavinfotileDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 7: {
                this.enterWaitaphoreForProperty(-199360256, 390, 495, 1013550409, 996773193);
                break;
            }
            case 10: {
                this.setBoolean(10542, true);
                this.setInteger(665190400, this.getInteger(1814036736));
                if (this.getInteger(1814036736) == 0 || this.getInteger(1814036736) == 2) {
                    this.setInteger(665190400, 0);
                    this.setInteger(1477574912, 0);
                }
                if (this.getInteger(1814036736) == 1) {
                    this.setInteger(665190400, 1);
                    this.setInteger(1477574912, 1);
                }
                if (this.getInteger(1814036736) == 3 || this.getInteger(1814036736) == 4) {
                    if (this.getInteger(471924992) == 1) {
                        this.setInteger(665190400, 2);
                        this.setInteger(1477574912, 3);
                    }
                    if (this.getInteger(471924992) != 1 && this.getInteger(20523) != 0) {
                        this.setInteger(665190400, 2);
                        this.setInteger(1477574912, 4);
                    }
                    if (this.getInteger(471924992) != 1 && this.getInteger(20523) == 0) {
                        this.setInteger(665190400, 0);
                        this.setInteger(1477574912, 0);
                    }
                }
                this.setInteger(486932736, this.getInteger(665190400));
                Object object = this.createModelApiDownEvent(20);
                object.setInt(0, this.getInteger(1477574912));
                this.fireModelApiDownEvent((ModelApiDownEvent)object);
                if (this.getInteger(471924992) != 1 && this.getInteger(20523) != 0 && this.getInteger(1477574912) == 4) {
                    this.setInteger(-925827072, 2);
                }
                if (this.getInteger(471924992) != 1 && this.getInteger(1477574912) != 4 && this.getInteger(20523) != 0) {
                    this.setInteger(-925827072, 1);
                }
                if (this.getInteger(471924992) == 1 && this.getInteger(20523) != 0) {
                    this.setInteger(-925827072, 1);
                }
                if (this.getInteger(20523) == 0) {
                    this.setInteger(-925827072, 0);
                }
                if (this.getInteger(20523) != 0) {
                    object = NavInfoTileActivity.newEvent();
                    ((EventGeneric)object).setInt(0, this.getInteger(-925827072));
                    this.triggerObserver(-469345728, (EventGeneric)object);
                }
                if (this.getInteger(22521) != 1 || !this.getBoolean(-568459008)) {
                    NavInfoTileActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1650822473);
                }
                this.showView("Ni", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 11: {
                this.showView("Nil", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    private void performStateExitAction_SubHapticNavinfotileDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 7: {
                this.leaveWaitaphore();
                break;
            }
            case 10: {
                this.hideView("Ni");
                if (this.getInteger(20523) == 2) {
                    this.setInteger(-925827072, 1);
                }
                if (this.getInteger(20523) == 0 || this.getInteger(-925827072) == 0) break;
                EventGeneric eventGeneric = NavInfoTileActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-925827072));
                this.triggerObserver(-469345728, eventGeneric);
                break;
            }
            case 11: {
                this.hideView("Nil");
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubHapticNavinfotileDynState(int n) {
        this.performInternalTransitionAction_SubHapticNavinfotileDynState00(n);
    }

    private void performInternalTransitionAction_SubHapticNavinfotileDynState00(int n) {
        switch (n - this.IT_OFFSET) {
            case 1: {
                if (NavInfoTileActivity.evPointGestureParam1() > 0) {
                    this.setInteger(738722048, 0);
                }
                if (NavInfoTileActivity.evPointGestureParam1() < 0) {
                    this.setInteger(738722048, 1);
                }
                if (NavInfoTileActivity.evPointGestureParam1() == 0) break;
                EventGeneric eventGeneric = NavInfoTileActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(738722048));
                this.triggerObserver(-502900160, eventGeneric);
                break;
            }
            case 2: {
                this.setInteger(-2020802560, NavInfoTileActivity.evListItemActionIndex());
                EventGeneric eventGeneric = NavInfoTileActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2020802560));
                this.triggerObserver(-486122944, eventGeneric);
                break;
            }
            case 3: {
                if (this.getInteger(20523) == 1 && this.getInteger(10665) == 4) {
                    this.setInteger(-925827072, 2);
                }
                if (this.getInteger(20523) == 2 && this.getInteger(10665) != 4) {
                    this.setInteger(-925827072, 1);
                }
                if (this.getInteger(20523) == 0) break;
                EventGeneric eventGeneric = NavInfoTileActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-925827072));
                this.triggerObserver(-469345728, eventGeneric);
                break;
            }
            case 4: {
                this.setInteger(1455816704, NavInfoTileActivity.evIntegerValueValue());
                if (this.getInteger(471924992) == 1 && this.getInteger(1455816704) == 2) {
                    this.setInteger(1455816704, this.getInteger(1455816704) + 1);
                }
                if (this.getInteger(471924992) != 1 && this.getInteger(1455816704) == 2) {
                    this.setInteger(1455816704, this.getInteger(1455816704) + 2);
                }
                this.setInteger(1477574912, this.getInteger(1455816704));
                Object object = this.createModelApiDownEvent(20);
                object.setInt(0, this.getInteger(1477574912));
                this.fireModelApiDownEvent((ModelApiDownEvent)object);
                if (this.getInteger(20523) == 1 && this.getInteger(1477574912) == 4 && this.getInteger(471924992) != 1) {
                    this.setInteger(-925827072, 2);
                }
                if (this.getInteger(20523) == 2 && this.getInteger(471924992) != 1 && this.getInteger(1477574912) != 4) {
                    this.setInteger(-925827072, 1);
                }
                if (this.getInteger(471924992) == 1 && this.getInteger(20523) != 0) {
                    this.setInteger(-925827072, 1);
                }
                if (this.getInteger(20523) == 0 || this.getInteger(-925827072) == 0) break;
                object = NavInfoTileActivity.newEvent();
                ((EventGeneric)object).setInt(0, this.getInteger(-925827072));
                this.triggerObserver(-469345728, (EventGeneric)object);
                break;
            }
            case 5: {
                if (this.getInteger(22521) == 1) break;
                NavInfoTileActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1650822473);
                break;
            }
            case 6: {
                if (this.getBoolean(-568459008)) break;
                NavInfoTileActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1650822473);
                break;
            }
            case 7: {
                this.setInteger(-2020802560, 0);
                EventGeneric eventGeneric = NavInfoTileActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2020802560));
                this.triggerObserver(-486122944, eventGeneric);
                break;
            }
            case 8: {
                this.setInteger(-2020802560, 1);
                EventGeneric eventGeneric = NavInfoTileActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2020802560));
                this.triggerObserver(-486122944, eventGeneric);
                break;
            }
            case 9: {
                this.setInteger(665190400, this.getInteger(1814036736));
                if (this.getInteger(1814036736) == 0 || this.getInteger(1814036736) == 2) {
                    this.setInteger(665190400, 0);
                    this.setInteger(1477574912, 0);
                }
                if (this.getInteger(1814036736) == 1) {
                    this.setInteger(665190400, 1);
                    this.setInteger(1477574912, 1);
                }
                if (this.getInteger(1814036736) == 3 || this.getInteger(1814036736) == 4) {
                    if (this.getInteger(471924992) == 1) {
                        this.setInteger(665190400, 2);
                        this.setInteger(1477574912, 3);
                    }
                    if (this.getInteger(471924992) != 1 && this.getBoolean(2038956032)) {
                        this.setInteger(665190400, 2);
                        this.setInteger(1477574912, 4);
                    }
                    if (this.getInteger(471924992) != 1 && this.getInteger(20523) == 0) {
                        this.setInteger(665190400, 0);
                        this.setInteger(1477574912, 0);
                    }
                }
                this.setInteger(486932736, this.getInteger(665190400));
                Object object = this.createModelApiDownEvent(20);
                object.setInt(0, this.getInteger(1477574912));
                this.fireModelApiDownEvent((ModelApiDownEvent)object);
                if (this.getInteger(471924992) != 1 && this.getInteger(20523) != 0 && this.getInteger(1477574912) == 4) {
                    this.setInteger(-925827072, 2);
                }
                if (this.getInteger(471924992) != 1 && this.getInteger(1477574912) != 4 && this.getInteger(20523) != 0) {
                    this.setInteger(-925827072, 1);
                }
                if (this.getInteger(471924992) == 1 && this.getInteger(20523) != 0) {
                    this.setInteger(-925827072, 1);
                }
                if (this.getInteger(20523) == 0) {
                    this.setInteger(-925827072, 0);
                }
                if (this.getInteger(20523) == 0) break;
                object = NavInfoTileActivity.newEvent();
                ((EventGeneric)object).setInt(0, this.getInteger(-925827072));
                this.triggerObserver(-469345728, (EventGeneric)object);
                break;
            }
            case 10: {
                this.setInteger(665190400, this.getInteger(1814036736));
                if (this.getInteger(1814036736) == 0 || this.getInteger(1814036736) == 2) {
                    this.setInteger(665190400, 0);
                    this.setInteger(1477574912, 0);
                }
                if (this.getInteger(1814036736) == 1) {
                    this.setInteger(665190400, 1);
                    this.setInteger(1477574912, 1);
                }
                if (this.getInteger(1814036736) == 3 || this.getInteger(1814036736) == 4) {
                    if (this.getInteger(471924992) == 1) {
                        this.setInteger(665190400, 2);
                        this.setInteger(1477574912, 3);
                    }
                    if (this.getInteger(471924992) != 1 && this.getBoolean(2038956032)) {
                        this.setInteger(665190400, 2);
                        this.setInteger(1477574912, 4);
                    }
                    if (this.getInteger(471924992) != 1 && this.getInteger(20523) == 0) {
                        this.setInteger(665190400, 0);
                        this.setInteger(1477574912, 0);
                    }
                }
                this.setInteger(486932736, this.getInteger(665190400));
                Object object = this.createModelApiDownEvent(20);
                object.setInt(0, this.getInteger(1477574912));
                this.fireModelApiDownEvent((ModelApiDownEvent)object);
                if (this.getInteger(471924992) != 1 && this.getInteger(20523) != 0 && this.getInteger(1477574912) == 4) {
                    this.setInteger(-925827072, 2);
                }
                if (this.getInteger(471924992) != 1 && this.getInteger(1477574912) != 4 && this.getInteger(20523) != 0) {
                    this.setInteger(-925827072, 1);
                }
                if (this.getInteger(471924992) == 1 && this.getInteger(20523) != 0) {
                    this.setInteger(-925827072, 1);
                }
                if (this.getInteger(20523) == 0) {
                    this.setInteger(-925827072, 0);
                }
                if (this.getInteger(20523) == 0) break;
                object = NavInfoTileActivity.newEvent();
                ((EventGeneric)object).setInt(0, this.getInteger(-925827072));
                this.triggerObserver(-469345728, (EventGeneric)object);
                break;
            }
            case 11: {
                this.setInteger(665190400, this.getInteger(1814036736));
                if (this.getInteger(1814036736) == 0 || this.getInteger(1814036736) == 2) {
                    this.setInteger(665190400, 0);
                    this.setInteger(1477574912, 0);
                }
                if (this.getInteger(1814036736) == 1) {
                    this.setInteger(665190400, 1);
                    this.setInteger(1477574912, 1);
                }
                if (this.getInteger(1814036736) == 3 || this.getInteger(1814036736) == 4) {
                    if (this.getInteger(471924992) == 1) {
                        this.setInteger(665190400, 2);
                        this.setInteger(1477574912, 3);
                    }
                    if (this.getInteger(471924992) != 1 && this.getInteger(20523) != 0) {
                        this.setInteger(665190400, 2);
                        this.setInteger(1477574912, 4);
                    }
                    if (this.getInteger(471924992) != 1 && this.getInteger(20523) == 0) {
                        this.setInteger(665190400, 0);
                        this.setInteger(1477574912, 0);
                    }
                }
                this.setInteger(486932736, this.getInteger(665190400));
                ModelApiDownEvent modelApiDownEvent = this.createModelApiDownEvent(20);
                modelApiDownEvent.setInt(0, this.getInteger(1477574912));
                this.fireModelApiDownEvent(modelApiDownEvent);
                break;
            }
            case 12: {
                if (!this.getBoolean(-568459008) || this.getInteger(22521) != 1) break;
                NavInfoTileActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1667599689);
                break;
            }
            case 13: {
                if (!this.getBoolean(-568459008) || this.getInteger(22521) != 1) break;
                NavInfoTileActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1667599689);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubHapticNavinfotileDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                return this.getInteger(22521) == 1 && this.getBoolean(-568459008) && !this.getBoolean(21799);
            }
            case 2: {
                return this.getInteger(22521) == 1 && this.getBoolean(-568459008) && this.getBoolean(21799);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubHapticNavinfotileDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 2: {
                this.setBoolean(21799, false);
                break;
            }
            case 6: {
                NavInfoTileActivity.lockWaitaphore(-199360256, 250);
                this.fireModelApiDownEvent(this.createModelApiDownEvent(19));
                break;
            }
        }
    }
}

