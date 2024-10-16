/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.tvtuner.sm;

import de.vw.mib.genericevents.EventGeneric;
import de.vw.mib.modelapi.ModelApiDownEvent;
import de.vw.mib.sm.internal.statemachine.TopStatemachine;
import generated.de.vw.mib.global.datapool.SkinDataPool;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineActivityBase;

public class TvtunerActivity
extends StatemachineActivityBase {
    private final int subStatemachineId;

    public TvtunerActivity(TopStatemachine topStatemachine, int n, int n2, int n3, int n4, int n5) {
        super(topStatemachine, n2, n3, n4, n5);
        this.subStatemachineId = n;
    }

    @Override
    public void performStateEntryAction(int n, boolean bl) {
        switch (this.subStatemachineId) {
            case 619: {
                this.performStateEntryAction_SubPopupPoTvtunerCasAlertDynState(n, bl);
                break;
            }
            case 620: {
                this.performStateEntryAction_SubPopupPoTvtunerCasInformationDynState(n, bl);
                break;
            }
            case 621: {
                this.performStateEntryAction_SubPopupPoTvtunerConfirmDeleteAllPresetsDynState(n, bl);
                break;
            }
            case 622: {
                this.performStateEntryAction_SubPopupPoTvtunerConfirmDeleteSelectedPresetDynState(n, bl);
                break;
            }
            case 623: {
                this.performStateEntryAction_SubPopupPoTvtunerEwsMessageDynState(n, bl);
                break;
            }
            case 624: {
                this.performStateEntryAction_SubPopupPoTvtunerNotifyTunerNotAvailableDynState(n, bl);
                break;
            }
            case 64: {
                this.performStateEntryAction_SubHapticTvTunerDynState(n, bl);
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
            case 619: {
                this.performStateExitAction_SubPopupPoTvtunerCasAlertDynState(n);
                break;
            }
            case 620: {
                this.performStateExitAction_SubPopupPoTvtunerCasInformationDynState(n);
                break;
            }
            case 621: {
                this.performStateExitAction_SubPopupPoTvtunerConfirmDeleteAllPresetsDynState(n);
                break;
            }
            case 622: {
                this.performStateExitAction_SubPopupPoTvtunerConfirmDeleteSelectedPresetDynState(n);
                break;
            }
            case 623: {
                this.performStateExitAction_SubPopupPoTvtunerEwsMessageDynState(n);
                break;
            }
            case 624: {
                this.performStateExitAction_SubPopupPoTvtunerNotifyTunerNotAvailableDynState(n);
                break;
            }
            case 64: {
                this.performStateExitAction_SubHapticTvTunerDynState(n);
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
            case 64: {
                return this.evalInternalTransitionGuard_SubHapticTvTunerDynState(n);
            }
        }
        return true;
    }

    @Override
    public void performInternalTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 64: {
                this.performInternalTransitionAction_SubHapticTvTunerDynState(n);
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
            case 64: {
                return this.evalTriggeredTransitionGuard_SubHapticTvTunerDynState(n);
            }
        }
        return true;
    }

    @Override
    public void performTriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 621: {
                this.performTriggeredTransitionAction_SubPopupPoTvtunerConfirmDeleteAllPresetsDynState(n);
                break;
            }
            case 622: {
                this.performTriggeredTransitionAction_SubPopupPoTvtunerConfirmDeleteSelectedPresetDynState(n);
                break;
            }
            case 64: {
                this.performTriggeredTransitionAction_SubHapticTvTunerDynState(n);
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
            case 64: {
                return this.evalUntriggeredTransitionGuard_SubHapticTvTunerDynState(n);
            }
        }
        return true;
    }

    @Override
    public void performUntriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 64: {
                this.performUntriggeredTransitionAction_SubHapticTvTunerDynState(n);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoTvtunerCasAlertDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Ptca", 619, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoTvtunerCasAlertDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                TvtunerActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Ptca");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoTvtunerCasInformationDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Ptci", 620, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoTvtunerCasInformationDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                TvtunerActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Ptci");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoTvtunerConfirmDeleteAllPresetsDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Ptcdap", 621, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoTvtunerConfirmDeleteAllPresetsDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                TvtunerActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Ptcdap");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoTvtunerConfirmDeleteAllPresetsDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoTvtunerConfirmDeleteAllPresetsDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoTvtunerConfirmDeleteAllPresetsDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 1: {
                this.triggerObserver(537395264);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoTvtunerConfirmDeleteSelectedPresetDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Ptcdsp", 622, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoTvtunerConfirmDeleteSelectedPresetDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                TvtunerActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Ptcdsp");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoTvtunerConfirmDeleteSelectedPresetDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoTvtunerConfirmDeleteSelectedPresetDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoTvtunerConfirmDeleteSelectedPresetDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1428685056));
                this.triggerObserver(554172480, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoTvtunerEwsMessageDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Ptemal", 623, 3);
                break;
            }
            case 4: {
                this.enterPopupView("Ptemmd", 623, 4);
                break;
            }
            case 5: {
                this.enterPopupView("Ptem", 623, 5);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoTvtunerEwsMessageDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                TvtunerActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                this.triggerObserver(17367104);
                break;
            }
            case 3: {
                this.leavePopupView("Ptemal");
                break;
            }
            case 4: {
                this.leavePopupView("Ptemmd");
                break;
            }
            case 5: {
                this.leavePopupView("Ptem");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoTvtunerNotifyTunerNotAvailableDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Ptntna", 624, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoTvtunerNotifyTunerNotAvailableDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                TvtunerActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Ptntna");
                break;
            }
        }
    }

    private void performStateEntryAction_SubHapticTvTunerDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(16651, 2);
                this.setInteger(31196, 0);
                break;
            }
            case 8: {
                this.setInteger(336199936, 19);
                this.setInteger(25296896, 22);
                this.setInteger(16651, 3);
                this.setInteger(1977221120, SkinDataPool.getInteger(190));
                break;
            }
            case 14: {
                this.setInteger(1167196160, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1167196160));
                this.triggerObserver(0x50050040, eventGeneric);
                break;
            }
            case 17: {
                this.triggerObserver(-1358430144);
                TvtunerActivity.changeContext("TVTuner");
                if (this.getInteger(12361) == 0 || this.getInteger(0xFA0000) == 0) {
                    TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1482329417);
                }
                if (this.getInteger(12361) == 1 && this.getInteger(0xFA0000) == 1) {
                    TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1117745847);
                }
                this.setInteger(20194, 5);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(20194));
                this.triggerObserver(-284950464, eventGeneric);
                this.setInteger(-452263680, 21);
                eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-452263680));
                this.triggerObserver(1191510080, eventGeneric);
                if (this.getInteger(12361) == 1 && this.getInteger(0xFA0000) == 1) {
                    this.setBoolean(-1802108928, true);
                }
                if (this.getInteger(12361) != 0 && this.getInteger(0xFA0000) != 0) break;
                this.setBoolean(-1802108928, false);
                break;
            }
            case 24: {
                this.setInteger(31196, 0);
                break;
            }
            case 27: {
                this.showView("Tsam", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 28: {
                this.setBoolean(-408682496, false);
                this.setBoolean(-151584768, false);
                this.setBoolean(1292697856, false);
                this.showView("Tsamds", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 29: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805087415);
                this.setBoolean(-1248067584, true);
                this.setInteger(-1373110016, 1549831497);
                this.showView("Tam_9D1A", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 32: {
                this.triggerObserver(201850944);
                this.showView("Tpsl_70DF", bl, 22);
                break;
            }
            case 33: {
                this.showView("Tpl_088F", bl, 22);
                break;
            }
            case 34: {
                this.triggerObserver(-1526267840);
                this.showView("Tsl_FF9F", bl, 22);
                break;
            }
            case 35: {
                this.setInteger(31196, 0);
                break;
            }
            case 39: {
                this.setBoolean(984481792, false);
                this.showView("Tsmacl", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 40: {
                this.showView("Tsmci", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 41: {
                this.setBoolean(-408682496, false);
                this.setBoolean(-151584768, false);
                this.setBoolean(1292697856, false);
                this.showView("Tsmds", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 42: {
                this.showView("Tsmpdl", bl, 26);
                break;
            }
            case 43: {
                this.showView("Tsmtl", bl, 25);
                break;
            }
            case 44: {
                this.showView("Tsva", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 45: {
                this.showView("Tsm_559B", bl, 24);
                break;
            }
            case 46: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1754755767);
                this.setBoolean(-594149376, true);
                this.setInteger(-1373110016, 1549831497);
                this.triggerObserver(-1557846464);
                this.setBoolean(-2080440320, true);
                ModelApiDownEvent modelApiDownEvent = this.createModelApiDownEvent(34);
                modelApiDownEvent.setBoolean(0, this.getBoolean(-2080440320));
                this.fireModelApiDownEvent(modelApiDownEvent);
                this.showView("Tdm_97E5", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 47: {
                this.setBoolean(18529, true);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(18529));
                this.triggerObserver(-1056440256, eventGeneric);
                this.setBoolean(20562, false);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                this.setBoolean(249233408, true);
                if (this.getInteger(934871040) == 13) {
                    this.setBoolean(0x7100100, true);
                }
                if (this.getInteger(934871040) == 13) {
                    TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 392793417);
                }
                if (this.getInteger(934871040) == 0) {
                    TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 463);
                }
                this.showView("Ttm", bl, 23);
                break;
            }
            case 48: {
                this.setInteger(16651, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubHapticTvTunerDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(16651, 0);
                break;
            }
            case 8: {
                this.setInteger(25296896, 0);
                this.setInteger(1977221120, SkinDataPool.getInteger(180));
                this.setInteger(466223104, this.getInteger(1591083008));
                break;
            }
            case 17: {
                this.triggerObserver(-1341652928);
                if (this.getBoolean(688455936)) {
                    this.setBoolean(-1802108928, false);
                }
                if (this.getInteger(1591083008) != 0 || this.getInteger(934871040) == 0) break;
                this.setInteger(-2102788096, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2102788096));
                this.triggerObserver(-1022885824, eventGeneric);
                break;
            }
            case 27: {
                this.hideView("Tsam");
                break;
            }
            case 28: {
                this.hideView("Tsamds");
                break;
            }
            case 29: {
                this.hideView("Tam_9D1A");
                break;
            }
            case 32: {
                this.hideView("Tpsl_70DF");
                this.triggerObserver(218628160);
                break;
            }
            case 33: {
                this.hideView("Tpl_088F");
                break;
            }
            case 34: {
                this.hideView("Tsl_FF9F");
                this.triggerObserver(-1509490624);
                break;
            }
            case 39: {
                this.hideView("Tsmacl");
                break;
            }
            case 40: {
                this.hideView("Tsmci");
                break;
            }
            case 41: {
                this.hideView("Tsmds");
                break;
            }
            case 42: {
                this.hideView("Tsmpdl");
                break;
            }
            case 43: {
                this.hideView("Tsmtl");
                break;
            }
            case 44: {
                this.hideView("Tsva");
                break;
            }
            case 45: {
                this.hideView("Tsm_559B");
                break;
            }
            case 46: {
                this.hideView("Tdm_97E5");
                if (this.getBoolean(11264)) {
                    this.triggerObserver(1678442560);
                }
                if (this.getInteger(-38404096) == 0) {
                    this.triggerObserver(-1962475456);
                    this.setBoolean(1692729344, true);
                    this.setBoolean(1844051968, false);
                    this.setInteger(-38404096, 1);
                }
                this.setBoolean(-2080440320, false);
                ModelApiDownEvent modelApiDownEvent = this.createModelApiDownEvent(34);
                modelApiDownEvent.setBoolean(0, this.getBoolean(-2080440320));
                this.fireModelApiDownEvent(modelApiDownEvent);
                break;
            }
            case 47: {
                this.hideView("Ttm");
                this.setBoolean(18529, false);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(18529));
                this.triggerObserver(-1056440256, eventGeneric);
                this.setBoolean(20562, true);
                break;
            }
        }
    }

    private boolean evalInternalTransitionGuard_SubHapticTvTunerDynState(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                return this.getInteger(25296896) == 6 || this.getInteger(25296896) == 13 || this.getInteger(25296896) == 23 || this.getInteger(25296896) == 18 || this.getInteger(25296896) == 4 || this.getInteger(25296896) == 26 && this.getInteger(18985) == 6;
            }
            case 1: {
                return this.getInteger(-1212219392) == 1 && this.getInteger(18985) == 5 && this.getInteger(1591083008) == 0 && this.getInteger(-38404096) == 1 && this.getInteger(-1861222144) != 5;
            }
            case 2: {
                return this.getInteger(-1212219392) == 1 && this.getInteger(18985) == 5 && this.getInteger(1591083008) == 0 && this.getInteger(-38404096) == 1 && this.getInteger(-1861222144) != 5;
            }
            case 3: {
                return this.getInteger(-1212219392) == 1 && this.getInteger(18985) == 5 && this.getInteger(1591083008) == 0 && this.getInteger(-38404096) == 0 && this.getInteger(-1861222144) != 5;
            }
            case 4: {
                return this.getInteger(-1212219392) == 1 && this.getInteger(18985) == 5 && this.getInteger(1591083008) == 0 && this.getInteger(-38404096) == 0 && this.getInteger(-1861222144) != 5;
            }
            case 5: {
                return this.getInteger(-1212219392) == 1 && this.getInteger(18985) == 5 && this.getInteger(1591083008) == 0 && this.getInteger(-38404096) == 1 && this.getInteger(-1861222144) != 5;
            }
            case 6: {
                return this.getInteger(-1212219392) == 1 && this.getInteger(18985) == 5 && this.getInteger(1591083008) == 0 && this.getInteger(-38404096) == 1 && this.getInteger(-1861222144) != 5;
            }
            case 13: {
                return this.getInteger(12361) == 0 || this.getInteger(0xFA0000) == 0;
            }
            case 14: {
                return this.getInteger(12361) == 1 && this.getInteger(0xFA0000) == 1;
            }
            case 30: {
                return !this.getBoolean(-408682496);
            }
            case 31: {
                return this.getBoolean(-408682496);
            }
            case 32: {
                return !this.getBoolean(-151584768);
            }
            case 33: {
                return this.getBoolean(-151584768);
            }
            case 34: {
                return !this.getBoolean(1292697856);
            }
            case 35: {
                return this.getBoolean(1292697856);
            }
            case 36: {
                return this.getBoolean(-408682496);
            }
            case 37: {
                return this.getBoolean(-408682496);
            }
            case 38: {
                return this.getBoolean(-151584768);
            }
            case 39: {
                return this.getBoolean(-151584768);
            }
            case 40: {
                return this.getBoolean(1292697856);
            }
            case 41: {
                return this.getBoolean(1292697856);
            }
            case 42: {
                return !this.getBoolean(0x21220100) && !this.getBoolean(-1026686976);
            }
            case 43: {
                return !this.getBoolean(0x21220100) && this.getBoolean(-1248067584);
            }
            case 44: {
                return !this.getBoolean(0x21220100) && !this.getBoolean(-1248067584);
            }
            case 45: {
                return !this.getBoolean(0x21220100);
            }
            case 46: {
                return !this.getBoolean(0x21220100);
            }
            case 47: {
                return !this.getBoolean(0x21220100);
            }
            case 48: {
                return !this.getBoolean(0x21220100);
            }
            case 49: {
                return !this.getBoolean(0x21220100);
            }
            case 50: {
                return !this.getBoolean(0x21220100) && this.getBoolean(-1248067584);
            }
            case 51: {
                return this.getBoolean(0x21220100);
            }
            case 52: {
                return this.getBoolean(0x21220100);
            }
            case 63: {
                return TvtunerActivity.evListItemEventSender().equals("Button_Station");
            }
            case 64: {
                return TvtunerActivity.evListItemEventSender().equals("Button_Store");
            }
            case 86: {
                return !this.getBoolean(-408682496);
            }
            case 87: {
                return this.getBoolean(-408682496);
            }
            case 88: {
                return !this.getBoolean(-151584768);
            }
            case 89: {
                return this.getBoolean(-151584768);
            }
            case 90: {
                return !this.getBoolean(1292697856);
            }
            case 91: {
                return this.getBoolean(1292697856);
            }
            case 92: {
                return this.getBoolean(-408682496);
            }
            case 93: {
                return this.getBoolean(-408682496);
            }
            case 94: {
                return this.getBoolean(-151584768);
            }
            case 95: {
                return this.getBoolean(-151584768);
            }
            case 96: {
                return this.getBoolean(1292697856);
            }
            case 97: {
                return this.getBoolean(1292697856);
            }
            case 101: {
                return this.getBoolean(0xB60000);
            }
            case 102: {
                return !this.getBoolean(0xB60000);
            }
            case 103: {
                return this.getBoolean(-812843008);
            }
            case 104: {
                return !this.getBoolean(-812843008);
            }
            case 110: {
                return this.getBoolean(278069248);
            }
            case 111: {
                return !this.getBoolean(278069248);
            }
            case 113: {
                return this.getBoolean(0xB60000);
            }
            case 114: {
                return !this.getBoolean(0xB60000);
            }
            case 115: {
                return this.getBoolean(-1646985216);
            }
            case 116: {
                return !this.getBoolean(-1646985216);
            }
            case 118: {
                return this.getInteger(-38404096) == 1 && this.getInteger(-1861222144) != 5;
            }
            case 119: {
                return this.getInteger(-38404096) == 1 && this.getInteger(-1861222144) != 5;
            }
            case 120: {
                return this.getInteger(-38404096) == 0 && this.getInteger(-1861222144) != 5;
            }
            case 121: {
                return this.getInteger(-38404096) == 0 && this.getInteger(-1861222144) != 5;
            }
            case 123: {
                return this.getInteger(-38404096) == 0 && this.getInteger(-1861222144) != 5;
            }
            case 124: {
                return this.getInteger(-38404096) == 0 && this.getInteger(-1861222144) != 5;
            }
            case 125: {
                return this.getInteger(-38404096) == 0 && this.getInteger(-1861222144) != 5;
            }
            case 126: {
                return this.getInteger(-38404096) == 0 && this.getInteger(-1861222144) != 5;
            }
            case 137: {
                return this.getBoolean(0x21220100);
            }
            case 138: {
                return this.getBoolean(0x21220100);
            }
            case 140: {
                return this.getInteger(-38404096) == 1 && (this.getInteger(-1861222144) != 5 || this.getBoolean(0x21220100));
            }
            case 142: {
                return this.getBoolean(0x21220100) && !this.getBoolean(-359661568) || !this.getBoolean(0x21220100) && this.getInteger(-1861222144) != 5 && !this.getBoolean(-1026686976);
            }
            case 143: {
                return this.getInteger(-38404096) == 0;
            }
            case 144: {
                return !this.getBoolean(0x21220100) && this.getBoolean(-594149376);
            }
            case 145: {
                return !this.getBoolean(0x21220100) && !this.getBoolean(-594149376);
            }
            case 146: {
                return !this.getBoolean(0x21220100) && this.getBoolean(-594149376);
            }
            case 147: {
                return !this.getBoolean(0x21220100) && this.getBoolean(-594149376);
            }
            case 148: {
                return !this.getBoolean(0x21220100);
            }
            case 149: {
                return !this.getBoolean(0x21220100);
            }
            case 150: {
                return !this.getBoolean(0x21220100);
            }
            case 151: {
                return !this.getBoolean(0x21220100);
            }
            case 152: {
                return !this.getBoolean(0x21220100);
            }
            case 153: {
                return !this.getBoolean(0x21220100);
            }
            case 154: {
                return !this.getBoolean(0x21220100);
            }
            case 155: {
                return !this.getBoolean(0x21220100);
            }
            case 156: {
                return !this.getBoolean(0x21220100);
            }
            case 157: {
                return !this.getBoolean(0x21220100);
            }
            case 161: {
                return TvtunerActivity.evPointGestureParam1() > 0 && this.getInteger(-38404096) == 1 && this.getInteger(-1861222144) != 5;
            }
            case 162: {
                return TvtunerActivity.evPointGestureParam1() < 0 && this.getInteger(-38404096) == 1 && this.getInteger(-1861222144) != 5;
            }
            case 163: {
                return !this.getBoolean(0x21220100);
            }
            case 164: {
                return this.getInteger(-38404096) == 1 && this.getInteger(14428) == 0 && this.getInteger(-1861222144) != 5;
            }
            case 165: {
                return this.getInteger(-38404096) == 1 && this.getInteger(14428) == 1 && this.getInteger(-1861222144) != 5;
            }
            case 166: {
                return this.getInteger(-38404096) == 1 && this.getInteger(14428) == 0 && this.getInteger(-1861222144) != 5;
            }
            case 167: {
                return this.getInteger(-38404096) == 1 && this.getInteger(14428) == 1 && this.getInteger(-1861222144) != 5;
            }
            case 168: {
                return this.getInteger(-38404096) == 0 && this.getBoolean(11264);
            }
            case 169: {
                return this.getInteger(-38404096) == 0 && !this.getBoolean(11264);
            }
            case 170: {
                return this.getInteger(-38404096) == 0;
            }
            case 171: {
                return this.getInteger(-38404096) == 0;
            }
            case 172: {
                return this.getInteger(-38404096) == 0 && !this.getBoolean(11264) && this.getInteger(-1861222144) != 5;
            }
            case 173: {
                return this.getInteger(-38404096) == 0 && !this.getBoolean(11264) && this.getInteger(-1861222144) != 5;
            }
            case 174: {
                return this.getInteger(-1861222144) == 5;
            }
            case 175: {
                return this.getInteger(-38404096) == 1;
            }
            case 176: {
                return this.getInteger(-38404096) == 1;
            }
            case 178: {
                return this.getInteger(934871040) != 13 && this.getInteger(934871040) != 15;
            }
            case 179: {
                return this.getInteger(934871040) != 13 && this.getInteger(934871040) != 15;
            }
            case 218: {
                return this.getInteger(934871040) != 1 && this.getInteger(934871040) != 11;
            }
            case 219: {
                return this.getInteger(934871040) != 1 && this.getInteger(934871040) != 11;
            }
            case 220: {
                return this.getInteger(934871040) == 1 || this.getInteger(934871040) == 11;
            }
            case 221: {
                return this.getInteger(934871040) == 1 || this.getInteger(934871040) == 11;
            }
            case 224: {
                return this.getInteger(1170538496) == 0;
            }
            case 225: {
                return this.getInteger(1170538496) == 1;
            }
            case 230: {
                return this.getInteger(28330) == 0;
            }
            case 231: {
                return this.getInteger(28330) == 1;
            }
            case 232: {
                return this.getInteger(934871040) == 13 || this.getInteger(934871040) == 11;
            }
            case 237: {
                return this.getInteger(934871040) != 12;
            }
            case 238: {
                return this.getBoolean(0x21220100);
            }
            case 239: {
                return this.getBoolean(0x21220100);
            }
            case 240: {
                return this.getBoolean(0x21220100) && !this.getBoolean(-359661568) || !this.getBoolean(0x21220100);
            }
            case 241: {
                return !this.getBoolean(0x21220100) && this.getBoolean(249233408);
            }
            case 242: {
                return !this.getBoolean(0x21220100) && !this.getBoolean(249233408);
            }
            case 243: {
                return !this.getBoolean(0x21220100) && this.getBoolean(249233408);
            }
            case 244: {
                return !this.getBoolean(0x21220100) && this.getBoolean(249233408);
            }
            case 245: {
                return !this.getBoolean(0x21220100);
            }
            case 246: {
                return this.getInteger(934871040) == 13;
            }
            case 251: {
                return this.getInteger(934871040) == 13;
            }
            case 252: {
                return this.getInteger(934871040) == 13;
            }
            case 253: {
                return this.getInteger(934871040) == 1 || this.getInteger(934871040) == 11;
            }
            case 254: {
                return this.getInteger(934871040) == 1 || this.getInteger(934871040) == 11;
            }
            case 255: {
                return this.getInteger(934871040) == 1 || this.getInteger(934871040) == 11;
            }
            case 256: {
                return this.getInteger(934871040) == 1 || this.getInteger(934871040) == 11;
            }
            case 257: {
                return this.getInteger(934871040) == 15;
            }
            case 258: {
                return this.getInteger(934871040) == 15;
            }
            case 259: {
                return this.getInteger(934871040) == 15;
            }
            case 260: {
                return this.getInteger(934871040) == 15;
            }
        }
        return true;
    }

    private void performInternalTransitionAction_SubHapticTvTunerDynState(int n) {
        this.performInternalTransitionAction_SubHapticTvTunerDynState000(n);
    }

    private void performInternalTransitionAction_SubHapticTvTunerDynState000(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, 1549831497);
                break;
            }
            case 1: {
                this.triggerObserver(2013724736);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1754755767);
                break;
            }
            case 2: {
                this.triggerObserver(2030501952);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1754755767);
                break;
            }
            case 3: {
                this.triggerObserver(-2113470400);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 40471881);
                break;
            }
            case 4: {
                this.triggerObserver(-2130247616);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 40471881);
                break;
            }
            case 5: {
                this.triggerObserver(2013724736);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1754755767);
                break;
            }
            case 6: {
                this.triggerObserver(2030501952);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1754755767);
                break;
            }
            case 7: {
                this.setInteger(-707919872, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-707919872));
                this.triggerObserver(-351862720, eventGeneric);
                break;
            }
            case 8: {
                this.setInteger(-707919872, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-707919872));
                this.triggerObserver(-351862720, eventGeneric);
                break;
            }
            case 9: {
                this.setInteger(1977221120, SkinDataPool.getInteger(180));
                break;
            }
            case 10: {
                this.setInteger(1977221120, SkinDataPool.getInteger(190));
                break;
            }
            case 11: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -295137975);
                break;
            }
            case 12: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -295137975);
                break;
            }
            case 13: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1482329417);
                this.setBoolean(-1802108928, false);
                break;
            }
            case 14: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1117745847);
                this.setBoolean(-1802108928, true);
                break;
            }
            case 15: {
                this.setInteger(148963328, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(148963328));
                this.triggerObserver(-1995964352, eventGeneric);
                break;
            }
            case 16: {
                this.setInteger(148963328, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(148963328));
                this.triggerObserver(-1995964352, eventGeneric);
                break;
            }
            case 17: {
                this.setInteger(148963328, 2);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(148963328));
                this.triggerObserver(-1995964352, eventGeneric);
                break;
            }
            case 18: {
                this.setInteger(1807941632, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1807941632));
                this.triggerObserver(-2012741568, eventGeneric);
                break;
            }
            case 19: {
                this.setInteger(1807941632, 2);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1807941632));
                this.triggerObserver(-2012741568, eventGeneric);
                break;
            }
            case 20: {
                this.setInteger(29840, 1);
                this.setInteger(1088815104, 80);
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, 1583385929);
                break;
            }
            case 21: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -93811383);
                break;
            }
            case 22: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -43479735);
                break;
            }
            case 23: {
                this.setInteger(1474035712, TvtunerActivity.evIntegerValueValue());
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1474035712));
                this.triggerObserver(2063597632, eventGeneric);
                break;
            }
            case 24: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -77034167);
                break;
            }
            case 25: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -26702519);
                break;
            }
            case 26: {
                this.setInteger(29960, TvtunerActivity.evIntegerValueValue());
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(29960));
                this.triggerObserver(2080374848, eventGeneric);
                break;
            }
            case 27: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -60256951);
                break;
            }
            case 28: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -9925303);
                break;
            }
            case 29: {
                this.setInteger(1741553664, TvtunerActivity.evIntegerValueValue());
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1741553664));
                this.triggerObserver(-2147483584, eventGeneric);
                break;
            }
            case 30: {
                this.setBoolean(-408682496, true);
                this.setBoolean(-151584768, false);
                this.setBoolean(1292697856, false);
                this.setInteger(-2082668544, 1);
                this.setInteger(17430, 0);
                this.setInteger(1571487744, 0);
                break;
            }
            case 31: {
                this.setBoolean(-408682496, false);
                break;
            }
            case 32: {
                this.setBoolean(-408682496, false);
                this.setBoolean(-151584768, true);
                this.setBoolean(1292697856, false);
                this.setInteger(-2082668544, 0);
                this.setInteger(17430, 1);
                this.setInteger(1571487744, 0);
                break;
            }
            case 33: {
                this.setBoolean(-151584768, false);
                break;
            }
            case 34: {
                this.setBoolean(-408682496, false);
                this.setBoolean(-151584768, false);
                this.setBoolean(1292697856, true);
                this.setInteger(-2082668544, 0);
                this.setInteger(17430, 0);
                this.setInteger(1571487744, 1);
                break;
            }
            case 35: {
                this.setBoolean(1292697856, false);
                break;
            }
            case 36: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -93811383);
                break;
            }
            case 37: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -43479735);
                break;
            }
            case 38: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -77034167);
                break;
            }
            case 39: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -26702519);
                break;
            }
            case 40: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -60256951);
                break;
            }
            case 41: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -9925303);
                break;
            }
            case 42: {
                this.setBoolean(-1248067584, false);
                break;
            }
            case 43: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, 577342793);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1788310199);
                this.setBoolean(-1248067584, false);
                break;
            }
            case 44: {
                this.setBoolean(-1248067584, true);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1788310199);
                break;
            }
            case 45: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1788310199);
                break;
            }
            case 46: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1788310199);
                break;
            }
            case 47: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805087415);
                break;
            }
            case 48: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1788310199);
                break;
            }
            case 49: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805087415);
                break;
            }
            case 50: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1805087415);
                break;
            }
            case 51: {
                this.setBoolean(-1248067584, true);
                break;
            }
            case 52: {
                this.setBoolean(-1248067584, false);
                break;
            }
            case 53: {
                this.setInteger(-1196621824, TvtunerActivity.evListItemActionIndex());
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1196621824));
                this.triggerObserver(-83427264, eventGeneric);
                break;
            }
            case 54: {
                this.setInteger(-1245642752, TvtunerActivity.evListItemActionIndex());
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1245642752));
                this.triggerObserver(-234422208, eventGeneric);
                break;
            }
            case 55: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 74026313);
                break;
            }
            case 56: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 74026313);
                break;
            }
            case 57: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 74026313);
                break;
            }
            case 58: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 74026313);
                break;
            }
            case 59: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 74026313);
                break;
            }
            case 60: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 74026313);
                break;
            }
            case 61: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 74026313);
                break;
            }
            case 62: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 74026313);
                break;
            }
            case 63: {
                this.setInteger(27330, TvtunerActivity.evListItemActionIndex());
                this.setLong(28279, this.getLicValue(2525, 3, this.getInteger(27330), 0L));
                this.setInteger(0x5100100, this.getLicValue(2525, 5, this.getInteger(27330), 0));
                this.setInteger(-319553536, this.getLicValue(2525, 2, this.getInteger(27330), 0));
                this.setBoolean(1880752384, false);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(27330));
                eventGeneric.setLong(1, this.getLong(28279));
                eventGeneric.setInt(2, this.getInteger(0x5100100));
                eventGeneric.setInt(3, this.getInteger(-319553536));
                eventGeneric.setBoolean(4, this.getBoolean(1880752384));
                this.triggerObserver(84475968, eventGeneric);
                break;
            }
            case 64: {
                this.setInteger(27330, TvtunerActivity.evListItemActionIndex());
                this.setLong(28279, this.getLicValue(2525, 3, this.getInteger(27330), 0L));
                this.setInteger(0x5100100, this.getLicValue(2525, 5, this.getInteger(27330), 0));
                this.setInteger(-319553536, this.getLicValue(2525, 2, this.getInteger(27330), 0));
                this.setBoolean(1880752384, true);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(27330));
                eventGeneric.setLong(1, this.getLong(28279));
                eventGeneric.setInt(2, this.getInteger(0x5100100));
                eventGeneric.setInt(3, this.getInteger(-319553536));
                eventGeneric.setBoolean(4, this.getBoolean(1880752384));
                this.triggerObserver(84475968, eventGeneric);
                break;
            }
            case 65: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 208244041);
                break;
            }
            case 66: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 208244041);
                break;
            }
            case 67: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 208244041);
                break;
            }
            case 68: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 208244041);
                break;
            }
            case 69: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 208244041);
                break;
            }
            case 70: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 208244041);
                break;
            }
            case 71: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 208244041);
                break;
            }
            case 72: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 208244041);
                break;
            }
            case 73: {
                this.setInteger(29342, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(29342));
                this.triggerObserver(-1608178112, eventGeneric);
                break;
            }
            case 74: {
                this.setInteger(29342, 2);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(29342));
                this.triggerObserver(-1608178112, eventGeneric);
                break;
            }
            case 75: {
                this.setInteger(29342, 3);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(29342));
                this.triggerObserver(-1608178112, eventGeneric);
                break;
            }
            case 76: {
                this.setBoolean(984481792, true);
                this.setInteger(-864026624, TvtunerActivity.evListItemActionIndex());
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-864026624));
                this.triggerObserver(1560805440, eventGeneric);
                break;
            }
            case 77: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -93811383);
                break;
            }
            case 78: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -43479735);
                break;
            }
            case 79: {
                this.setInteger(1474035712, TvtunerActivity.evIntegerValueValue());
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1474035712));
                this.triggerObserver(2063597632, eventGeneric);
                break;
            }
            case 80: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -77034167);
                break;
            }
            case 81: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -26702519);
                break;
            }
            case 82: {
                this.setInteger(29960, TvtunerActivity.evIntegerValueValue());
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(29960));
                this.triggerObserver(2080374848, eventGeneric);
                break;
            }
            case 83: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -60256951);
                break;
            }
            case 84: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -9925303);
                break;
            }
            case 85: {
                this.setInteger(1741553664, TvtunerActivity.evIntegerValueValue());
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1741553664));
                this.triggerObserver(-2147483584, eventGeneric);
                break;
            }
            case 86: {
                this.setBoolean(-408682496, true);
                this.setBoolean(-151584768, false);
                this.setBoolean(1292697856, false);
                this.setInteger(-2082668544, 1);
                this.setInteger(17430, 0);
                this.setInteger(1571487744, 0);
                break;
            }
            case 87: {
                this.setBoolean(-408682496, false);
                break;
            }
            case 88: {
                this.setBoolean(-408682496, false);
                this.setBoolean(-151584768, true);
                this.setBoolean(1292697856, false);
                this.setInteger(-2082668544, 0);
                this.setInteger(17430, 1);
                this.setInteger(1571487744, 0);
                break;
            }
            case 89: {
                this.setBoolean(-151584768, false);
                break;
            }
            case 90: {
                this.setBoolean(-408682496, false);
                this.setBoolean(-151584768, false);
                this.setBoolean(1292697856, true);
                this.setInteger(-2082668544, 0);
                this.setInteger(17430, 0);
                this.setInteger(1571487744, 1);
                break;
            }
            case 91: {
                this.setBoolean(1292697856, false);
                break;
            }
            case 92: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -93811383);
                break;
            }
            case 93: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -43479735);
                break;
            }
            case 94: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -77034167);
                break;
            }
            case 95: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -26702519);
                break;
            }
            case 96: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -60256951);
                break;
            }
            case 97: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -9925303);
                break;
            }
            case 98: {
                this.setInteger(1428685056, TvtunerActivity.evListItemActionIndex());
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1465552201);
                break;
            }
            case 99: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1448774985);
                break;
            }
            case 100: {
                this.setInteger(-1510277120, TvtunerActivity.evListItemActionIndex());
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1510277120));
                this.triggerObserver(1929838656, eventGeneric);
                break;
            }
            case 101: {
                this.setBoolean(24107, false);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(24107));
                this.triggerObserver(-1073217472, eventGeneric);
                break;
            }
            case 102: {
                this.setBoolean(24107, true);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(24107));
                this.triggerObserver(-1073217472, eventGeneric);
                break;
            }
            case 103: {
                this.setBoolean(113967104, false);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(113967104));
                this.triggerObserver(-1559822272, eventGeneric);
                break;
            }
            case 104: {
                this.setBoolean(113967104, true);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(113967104));
                this.triggerObserver(-1559822272, eventGeneric);
                break;
            }
            case 105: {
                this.setInteger(1140391936, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1140391936));
                this.triggerObserver(-452526016, eventGeneric);
                break;
            }
            case 106: {
                this.setInteger(1140391936, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1140391936));
                this.triggerObserver(-452526016, eventGeneric);
                break;
            }
            case 107: {
                this.setInteger(-1682309120, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1682309120));
                this.triggerObserver(235405376, eventGeneric);
                break;
            }
            case 108: {
                this.setInteger(-1682309120, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1682309120));
                this.triggerObserver(235405376, eventGeneric);
                break;
            }
            case 109: {
                this.setInteger(-1682309120, 2);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1682309120));
                this.triggerObserver(235405376, eventGeneric);
                break;
            }
            case 110: {
                this.setBoolean(17127, false);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(17127));
                this.triggerObserver(302514240, eventGeneric);
                break;
            }
            case 111: {
                this.setBoolean(17127, true);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(17127));
                this.triggerObserver(302514240, eventGeneric);
                break;
            }
            case 112: {
                this.setInteger(29840, 1);
                this.setInteger(1088815104, 81);
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, 1583385929);
                break;
            }
            case 113: {
                this.setBoolean(24107, false);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(24107));
                this.triggerObserver(-1073217472, eventGeneric);
                break;
            }
            case 114: {
                this.setBoolean(24107, true);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(24107));
                this.triggerObserver(-1073217472, eventGeneric);
                break;
            }
            case 115: {
                this.setBoolean(28040, false);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(28040));
                this.triggerObserver(-1591400896, eventGeneric);
                break;
            }
            case 116: {
                this.setBoolean(28040, true);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(28040));
                this.triggerObserver(-1591400896, eventGeneric);
                break;
            }
            case 117: {
                this.setInteger(-2102788096, 11);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2102788096));
                this.triggerObserver(-1022885824, eventGeneric);
                break;
            }
            case 118: {
                this.triggerObserver(2013724736);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1754755767);
                break;
            }
            case 119: {
                this.triggerObserver(2030501952);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1754755767);
                break;
            }
            case 120: {
                this.triggerObserver(-2130247616);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 40471881);
                break;
            }
            case 121: {
                this.triggerObserver(-2113470400);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 40471881);
                break;
            }
            case 122: {
                this.triggerObserver(-1979252672);
                this.setBoolean(1844051968, true);
                this.setInteger(-38404096, 0);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 40471881);
                this.setBoolean(1692729344, false);
                break;
            }
            case 123: {
                this.triggerObserver(-1626931136);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 57249097);
                break;
            }
            case 124: {
                this.triggerObserver(-1610153920);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 40471881);
                break;
            }
            case 125: {
                this.triggerObserver(-1643708352);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 57249097);
                break;
            }
            case 126: {
                this.triggerObserver(-1610153920);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 40471881);
                break;
            }
            case 127: {
                this.setInteger(-2102788096, 13);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2102788096));
                this.triggerObserver(-1022885824, eventGeneric);
                break;
            }
            case 128: {
                this.setInteger(-2102788096, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2102788096));
                this.triggerObserver(-1022885824, eventGeneric);
                break;
            }
            case 129: {
                this.setInteger(-2102788096, 3);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2102788096));
                this.triggerObserver(-1022885824, eventGeneric);
                break;
            }
            case 130: {
                this.setInteger(-2102788096, 9);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2102788096));
                this.triggerObserver(-1022885824, eventGeneric);
                break;
            }
            case 131: {
                this.setInteger(-2102788096, 10);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2102788096));
                this.triggerObserver(-1022885824, eventGeneric);
                break;
            }
            case 132: {
                this.setInteger(-2102788096, 14);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2102788096));
                this.triggerObserver(-1022885824, eventGeneric);
                break;
            }
            case 133: {
                this.setInteger(-2102788096, 15);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2102788096));
                this.triggerObserver(-1022885824, eventGeneric);
                break;
            }
            case 134: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 57249097);
                break;
            }
            case 135: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 57249097);
                break;
            }
            case 136: {
                this.setBoolean(1844051968, false);
                this.setInteger(-38404096, 1);
                this.triggerObserver(-1962475456);
                this.setBoolean(1692729344, true);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1754755767);
                break;
            }
            case 137: {
                this.setBoolean(-594149376, true);
                break;
            }
            case 138: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1754755767);
                break;
            }
            case 139: {
                this.setBoolean(-594149376, true);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1754755767);
                break;
            }
            case 140: {
                this.setBoolean(-594149376, false);
                break;
            }
            case 141: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 191466825);
                break;
            }
            case 142: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 174689609);
                break;
            }
            case 143: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 6917449);
                break;
            }
            case 144: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 174689609);
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, 577342793);
                break;
            }
            case 145: {
                this.setBoolean(-594149376, true);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1737978551);
                break;
            }
            case 146: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 191466825);
                break;
            }
            case 147: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 191466825);
                break;
            }
            case 148: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1737978551);
                break;
            }
            case 149: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1737978551);
                break;
            }
            case 150: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1737978551);
                break;
            }
            case 151: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1754755767);
                break;
            }
            case 152: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1737978551);
                break;
            }
            case 153: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1737978551);
                break;
            }
            case 154: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1737978551);
                break;
            }
            case 155: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1737978551);
                break;
            }
            case 156: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1737978551);
                this.setBoolean(-594149376, true);
                break;
            }
            case 157: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1754755767);
                break;
            }
            case 161: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -195130039);
                break;
            }
            case 162: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -228684471);
                break;
            }
            case 163: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1754755767);
                break;
            }
            case 164: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -161575607);
                break;
            }
            case 165: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -94466743);
                break;
            }
            case 166: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -161575607);
                break;
            }
            case 167: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -94466743);
                break;
            }
            case 168: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 57249097);
                break;
            }
            case 169: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 40471881);
                break;
            }
            case 170: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 6917449);
                break;
            }
            case 171: {
                if (this.getBoolean(11264)) {
                    this.triggerObserver(1678442560);
                }
                this.setBoolean(1844051968, false);
                this.setInteger(-38404096, 1);
                this.triggerObserver(-1962475456);
                this.setBoolean(1692729344, true);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1754755767);
                break;
            }
            case 172: {
                this.triggerObserver(-2130247616);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 40471881);
                break;
            }
            case 173: {
                this.triggerObserver(-2113470400);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 40471881);
                break;
            }
            case 174: {
                this.triggerObserver(1174995008);
                break;
            }
            case 175: {
                this.setInteger(10741, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(10741));
                this.triggerObserver(-1574623680, eventGeneric);
                if (this.getInteger(-1861222144) != 5 && this.getInteger(12361) == 1 && this.getInteger(0xFA0000) == 1) {
                    this.triggerObserver(2013724736);
                }
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1754755767);
                break;
            }
            case 176: {
                this.setInteger(10741, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(10741));
                this.triggerObserver(-1574623680, eventGeneric);
                if (this.getInteger(-1861222144) != 5 && this.getInteger(12361) == 1 && this.getInteger(0xFA0000) == 1) {
                    this.triggerObserver(2030501952);
                }
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1754755767);
                break;
            }
            case 177: {
                this.setInteger(-2102788096, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2102788096));
                this.triggerObserver(-1022885824, eventGeneric);
                break;
            }
            case 178: {
                this.setInteger(23526, -1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(23526));
                this.triggerObserver(-620232640, eventGeneric);
                break;
            }
            case 179: {
                this.setInteger(23526, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(23526));
                this.triggerObserver(-620232640, eventGeneric);
                break;
            }
            case 180: {
                this.setInteger(-827392000, 14);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 181: {
                this.setInteger(-827392000, 14);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 182: {
                this.setInteger(-827392000, 15);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 183: {
                this.setInteger(-827392000, 15);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 184: {
                this.setInteger(-827392000, 12);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 185: {
                this.setInteger(-827392000, 12);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 186: {
                this.setInteger(-827392000, 13);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 187: {
                this.setInteger(-827392000, 13);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 188: {
                this.setInteger(-827392000, 6);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 189: {
                this.setInteger(-827392000, 6);
                this.setInteger(1862992128, 0);
                if (this.getInteger(934871040) == 3) {
                    this.setBoolean(14931, false);
                    this.setBoolean(29760, true);
                }
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 190: {
                this.setInteger(-827392000, 3);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 191: {
                this.setInteger(-827392000, 3);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (!this.getBoolean(0x21220100)) {
                    TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                }
                if (this.getInteger(934871040) == 13) {
                    this.setInteger(-2102788096, 0);
                }
                if (this.getInteger(934871040) != 13) break;
                eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-2102788096));
                this.triggerObserver(-1022885824, eventGeneric);
                break;
            }
            case 192: {
                this.setInteger(-827392000, 1);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 193: {
                this.setInteger(-827392000, 1);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 194: {
                this.setInteger(-827392000, 2);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 195: {
                this.setInteger(-827392000, 2);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 196: {
                this.setInteger(-827392000, 4);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 197: {
                this.setInteger(-827392000, 4);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 198: {
                this.setInteger(-827392000, 29);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 199: {
                this.setInteger(-827392000, 29);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 200: {
                this.setInteger(-827392000, 20);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 201: {
                this.setInteger(-827392000, 20);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 202: {
                this.setInteger(-827392000, 21);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 203: {
                this.setInteger(-827392000, 21);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 204: {
                this.setInteger(-827392000, 22);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 205: {
                this.setInteger(-827392000, 22);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 206: {
                this.setInteger(-827392000, 23);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 207: {
                this.setInteger(-827392000, 23);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 208: {
                this.setInteger(-827392000, 24);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 209: {
                this.setInteger(-827392000, 24);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 210: {
                this.setInteger(-827392000, 25);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 211: {
                this.setInteger(-827392000, 25);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 212: {
                this.setInteger(-827392000, 26);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 213: {
                this.setInteger(-827392000, 26);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 214: {
                this.setInteger(-827392000, 27);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 215: {
                this.setInteger(-827392000, 27);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 216: {
                this.setInteger(-827392000, 28);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 217: {
                this.setInteger(-827392000, 28);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 218: {
                this.setBoolean(14931, false);
                this.setBoolean(29760, true);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 219: {
                this.setBoolean(14931, true);
                this.setBoolean(29760, false);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 220: {
                this.setBoolean(-1910767360, false);
                this.setBoolean(32389, true);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 221: {
                this.setBoolean(-1910767360, true);
                this.setBoolean(32389, false);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 222: {
                this.setBoolean(-65535744, false);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 223: {
                this.setBoolean(-65535744, true);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 224: {
                this.setInteger(1170538496, 1);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 225: {
                this.setInteger(1170538496, 0);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 226: {
                this.setBoolean(1325400320, false);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 227: {
                this.setBoolean(1325400320, true);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 228: {
                this.setBoolean(16571, false);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 229: {
                this.setBoolean(16571, true);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 230: {
                this.setInteger(28330, 1);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 231: {
                this.setInteger(28330, 0);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 232: {
                this.setInteger(1425080320, TvtunerActivity.evPointGestureParam1());
                this.setInteger(1408303104, TvtunerActivity.evPointGestureParam2());
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1425080320));
                eventGeneric.setInt(1, this.getInteger(1408303104));
                this.triggerObserver(-301334464, eventGeneric);
                break;
            }
            case 233: {
                this.setInteger(-827392000, 2);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                this.setInteger(-827392000, 2);
                this.setInteger(1862992128, 0);
                eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                break;
            }
            case 234: {
                this.setInteger(-827392000, 5);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 235: {
                this.setInteger(-827392000, 5);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                break;
            }
            case 236: {
                this.setBoolean(249233408, true);
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 237: {
                this.setBoolean(249233408, false);
                break;
            }
            case 238: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 443125065);
                break;
            }
            case 239: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 426347849);
                break;
            }
            case 240: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 426347849);
                break;
            }
            case 241: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 426347849);
                break;
            }
            case 242: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                this.setBoolean(249233408, true);
                break;
            }
            case 243: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 443125065);
                break;
            }
            case 244: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 443125065);
                break;
            }
            case 245: {
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 246: {
                this.setBoolean(0x7100100, false);
                break;
            }
            case 247: {
                this.setInteger(-827392000, 7);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 248: {
                this.setInteger(-827392000, 7);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 249: {
                this.setInteger(-827392000, 38);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 250: {
                this.setInteger(-827392000, 38);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 251: {
                this.setInteger(-827392000, 15);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                this.setInteger(-827392000, 15);
                this.setInteger(1862992128, 0);
                eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 252: {
                this.setInteger(-827392000, 14);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                this.setInteger(-827392000, 14);
                this.setInteger(1862992128, 0);
                eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1704424119);
                break;
            }
            case 253: {
                this.setInteger(-827392000, 33);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 254: {
                this.setInteger(-827392000, 33);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 255: {
                this.setInteger(-827392000, 32);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 256: {
                this.setInteger(-827392000, 32);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 257: {
                this.setInteger(-827392000, 12);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                this.setInteger(-827392000, 12);
                this.setInteger(1862992128, 0);
                eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 258: {
                this.setInteger(-827392000, 13);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                this.setInteger(-827392000, 13);
                this.setInteger(1862992128, 0);
                eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 259: {
                this.setInteger(-827392000, 6);
                this.setInteger(1862992128, 1);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
            case 260: {
                this.setInteger(-827392000, 6);
                this.setInteger(1862992128, 0);
                EventGeneric eventGeneric = TvtunerActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1862992128));
                eventGeneric.setInt(1, this.getInteger(-827392000));
                this.triggerObserver(-586678208, eventGeneric);
                if (this.getBoolean(0x21220100)) break;
                TvtunerActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -1687646903);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubHapticTvTunerDynState(int n) {
        switch (n - this.TT_OFFSET) {
            case 15: {
                return TvtunerActivity.evListItemEventSender().equals("Button_Station");
            }
            case 18: {
                return this.getBoolean(984481792);
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubHapticTvTunerDynState(int n) {
        this.performTriggeredTransitionAction_SubHapticTvTunerDynState00(n);
    }

    private void performTriggeredTransitionAction_SubHapticTvTunerDynState00(int n) {
        switch (n - this.TT_OFFSET) {
            case 5: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 7: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 8: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 17: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 18: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 19: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 20: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 21: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 22: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 23: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 24: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 26: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
            case 29: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubHapticTvTunerDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 6: {
                return this.getInteger(27660) == 0;
            }
            case 7: {
                return this.getInteger(27660) == 1;
            }
            case 12: {
                return this.getInteger(1591083008) == 0;
            }
            case 14: {
                return this.getBoolean(19517) && this.getInteger(1591083008) == 0;
            }
            case 15: {
                return this.getBoolean(19517) && this.getInteger(1591083008) == 1;
            }
            case 16: {
                return this.getInteger(1591083008) != this.getInteger(466223104) && this.getInteger(1591083008) == 0;
            }
            case 17: {
                return this.getInteger(1591083008) != this.getInteger(466223104) && this.getInteger(1591083008) == 1;
            }
            case 18: {
                return this.getInteger(31196) == 2 || this.getInteger(1591083008) == 1;
            }
            case 19: {
                return this.getInteger(31196) == 1;
            }
            case 22: {
                return this.getBoolean(19517);
            }
            case 23: {
                return this.getInteger(31196) == 2;
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubHapticTvTunerDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 25: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                break;
            }
            case 28: {
                TvtunerActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
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

