/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.mirrorlink.sm;

import de.vw.mib.genericevents.EventGeneric;
import de.vw.mib.sm.internal.statemachine.TopStatemachine;
import generated.de.vw.mib.global.datapool.SkinDataPool;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineActivityBase;

public class MirrorlinkActivity
extends StatemachineActivityBase {
    private final int subStatemachineId;

    public MirrorlinkActivity(TopStatemachine topStatemachine, int n, int n2, int n3, int n4, int n5) {
        super(topStatemachine, n2, n3, n4, n5);
        this.subStatemachineId = n;
    }

    @Override
    public void performStateEntryAction(int n, boolean bl) {
        switch (this.subStatemachineId) {
            case 250: {
                this.performStateEntryAction_SubPopupPoConfirmMirrorlinkAppNotificationDynState(n, bl);
                break;
            }
            case 251: {
                this.performStateEntryAction_SubPopupPoConfirmMirrorAppIncompatibleDynState(n, bl);
                break;
            }
            case 252: {
                this.performStateEntryAction_SubPopupPoConfirmMirrorAppNotStartableRegionDynState(n, bl);
                break;
            }
            case 253: {
                this.performStateEntryAction_SubPopupPoConfirmMirrorAppNotStartableDynState(n, bl);
                break;
            }
            case 254: {
                this.performStateEntryAction_SubPopupPoConfirmMirrorDeveloperModeDynState(n, bl);
                break;
            }
            case 255: {
                this.performStateEntryAction_SubPopupPoConfirmMirrorLimitedCompatibleDynState2(n, bl);
                break;
            }
            case 307: {
                this.performStateEntryAction_SubPopupPoErrorMirrorAppNotFunctionalDynState(n, bl);
                break;
            }
            case 309: {
                this.performStateEntryAction_SubPopupPoFatalErrorMirrorlinkDynState(n, bl);
                break;
            }
            case 323: {
                this.performStateEntryAction_SubPopupPoGobalMirrorAudioErrorDynState(n, bl);
                break;
            }
            case 404: {
                this.performStateEntryAction_SubPopupPoInfoMirrolinkAppIncompatibleDynState(n, bl);
                break;
            }
            case 22: {
                this.performStateEntryAction_SubHapticMirrorlinkDynState(n, bl);
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
            case 250: {
                this.performStateExitAction_SubPopupPoConfirmMirrorlinkAppNotificationDynState(n);
                break;
            }
            case 251: {
                this.performStateExitAction_SubPopupPoConfirmMirrorAppIncompatibleDynState(n);
                break;
            }
            case 252: {
                this.performStateExitAction_SubPopupPoConfirmMirrorAppNotStartableRegionDynState(n);
                break;
            }
            case 253: {
                this.performStateExitAction_SubPopupPoConfirmMirrorAppNotStartableDynState(n);
                break;
            }
            case 254: {
                this.performStateExitAction_SubPopupPoConfirmMirrorDeveloperModeDynState(n);
                break;
            }
            case 255: {
                this.performStateExitAction_SubPopupPoConfirmMirrorLimitedCompatibleDynState2(n);
                break;
            }
            case 307: {
                this.performStateExitAction_SubPopupPoErrorMirrorAppNotFunctionalDynState(n);
                break;
            }
            case 309: {
                this.performStateExitAction_SubPopupPoFatalErrorMirrorlinkDynState(n);
                break;
            }
            case 323: {
                this.performStateExitAction_SubPopupPoGobalMirrorAudioErrorDynState(n);
                break;
            }
            case 404: {
                this.performStateExitAction_SubPopupPoInfoMirrolinkAppIncompatibleDynState(n);
                break;
            }
            case 22: {
                this.performStateExitAction_SubHapticMirrorlinkDynState(n);
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
            default: 
        }
        return true;
    }

    @Override
    public void performInternalTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 22: {
                this.performInternalTransitionAction_SubHapticMirrorlinkDynState(n);
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
            case 22: {
                return this.evalTriggeredTransitionGuard_SubHapticMirrorlinkDynState(n);
            }
        }
        return true;
    }

    @Override
    public void performTriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 250: {
                this.performTriggeredTransitionAction_SubPopupPoConfirmMirrorlinkAppNotificationDynState(n);
                break;
            }
            case 309: {
                this.performTriggeredTransitionAction_SubPopupPoFatalErrorMirrorlinkDynState(n);
                break;
            }
            case 22: {
                this.performTriggeredTransitionAction_SubHapticMirrorlinkDynState(n);
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
            case 22: {
                return this.evalUntriggeredTransitionGuard_SubHapticMirrorlinkDynState(n);
            }
        }
        return true;
    }

    @Override
    public void performUntriggeredTransitionAction(int n) {
        switch (this.subStatemachineId) {
            case 22: {
                this.performUntriggeredTransitionAction_SubHapticMirrorlinkDynState(n);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmMirrorlinkAppNotificationDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setBoolean(2064777472, false);
                break;
            }
            case 3: {
                this.enterPopupView("Pcman", 250, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmMirrorlinkAppNotificationDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                MirrorlinkActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                if (this.getBoolean(2064777472)) break;
                this.setInteger(10902, 0);
                EventGeneric eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(1, this.getInteger(10902));
                this.triggerObserver(1161957184, eventGeneric);
                break;
            }
            case 3: {
                this.leavePopupView("Pcman");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmMirrorlinkAppNotificationDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoConfirmMirrorlinkAppNotificationDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoConfirmMirrorlinkAppNotificationDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.setBoolean(2064777472, true);
                this.setInteger(10902, 1);
                EventGeneric eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(1, this.getInteger(10902));
                this.triggerObserver(1161957184, eventGeneric);
                break;
            }
            case 1: {
                this.setBoolean(2064777472, true);
                this.setInteger(10902, 2);
                EventGeneric eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(1, this.getInteger(10902));
                this.triggerObserver(1161957184, eventGeneric);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmMirrorAppIncompatibleDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pcmai", 251, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmMirrorAppIncompatibleDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                MirrorlinkActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pcmai");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmMirrorAppNotStartableRegionDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pcmansr", 252, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmMirrorAppNotStartableRegionDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                MirrorlinkActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pcmansr");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmMirrorAppNotStartableDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pcmans", 253, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmMirrorAppNotStartableDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                MirrorlinkActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pcmans");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmMirrorDeveloperModeDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pcmdm", 254, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmMirrorDeveloperModeDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                MirrorlinkActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pcmdm");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoConfirmMirrorLimitedCompatibleDynState2(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pcmlc", 255, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoConfirmMirrorLimitedCompatibleDynState2(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                MirrorlinkActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pcmlc");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoErrorMirrorAppNotFunctionalDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pemanf", 307, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoErrorMirrorAppNotFunctionalDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                MirrorlinkActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pemanf");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoFatalErrorMirrorlinkDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pfem", 309, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoFatalErrorMirrorlinkDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                MirrorlinkActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pfem");
                break;
            }
        }
    }

    private void performTriggeredTransitionAction_SubPopupPoFatalErrorMirrorlinkDynState(int n) {
        this.performTriggeredTransitionAction_SubPopupPoFatalErrorMirrorlinkDynState0(n);
    }

    private void performTriggeredTransitionAction_SubPopupPoFatalErrorMirrorlinkDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 0: {
                this.triggerObserver(1527316544);
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoGobalMirrorAudioErrorDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.enterPopupView("Pgmae", 323, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoGobalMirrorAudioErrorDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                MirrorlinkActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 2: {
                this.leavePopupView("Pgmae");
                break;
            }
        }
    }

    private void performStateEntryAction_SubPopupPoInfoMirrolinkAppIncompatibleDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 3: {
                this.enterPopupView("Pimai", 404, 3);
                break;
            }
        }
    }

    private void performStateExitAction_SubPopupPoInfoMirrolinkAppIncompatibleDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                MirrorlinkActivity.fireDynamicStateEvent(this.topStatemachine.getId(), 2, this.topStatemachine.getPopupInfoId());
                break;
            }
            case 3: {
                this.leavePopupView("Pimai");
                break;
            }
        }
    }

    private void performStateEntryAction_SubHapticMirrorlinkDynState(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(-1240792832, 2);
                this.setBoolean(587005952, false);
                if (!this.getBoolean(17873)) {
                    this.setBoolean(32615, true);
                }
                if (this.getBoolean(17873)) {
                    this.setBoolean(32615, false);
                }
                this.setBoolean(2109210624, true);
                this.setBoolean(16559, true);
                break;
            }
            case 8: {
                this.setInteger(25296896, 26);
                this.setInteger(-1240792832, 3);
                break;
            }
            case 10: {
                this.triggerObserver(1678377024);
                MirrorlinkActivity.changeContext("Mirrorlink");
                break;
            }
            case 13: {
                this.showView("Mcoa", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 15: {
                this.triggerObserver(1644822592);
                this.setBoolean(587005952, false);
                this.setBoolean(2109210624, true);
                this.setBoolean(16559, true);
                break;
            }
            case 17: {
                this.showView("Mam", bl, 124);
                break;
            }
            case 18: {
                this.setBoolean(587005952, true);
                this.showView("Mm_FD5A", bl, 123);
                break;
            }
            case 19: {
                MirrorlinkActivity.fireHMIEvent(ANY, BROADCAST, 1247907145);
                break;
            }
            case 20: {
                this.setInteger(-1240792832, 2);
                break;
            }
        }
    }

    private void performStateExitAction_SubHapticMirrorlinkDynState(int n) {
        switch (n - this.S_OFFSET) {
            case 0: {
                this.setInteger(-1240792832, 0);
                break;
            }
            case 8: {
                this.setInteger(25296896, 0);
                break;
            }
            case 10: {
                this.triggerObserver(1695154240);
                break;
            }
            case 13: {
                this.hideView("Mcoa");
                break;
            }
            case 15: {
                this.triggerObserver(1661599808);
                break;
            }
            case 17: {
                this.hideView("Mam");
                break;
            }
            case 18: {
                this.hideView("Mm_FD5A");
                break;
            }
        }
    }

    private void performInternalTransitionAction_SubHapticMirrorlinkDynState(int n) {
        this.performInternalTransitionAction_SubHapticMirrorlinkDynState00(n);
    }

    private void performInternalTransitionAction_SubHapticMirrorlinkDynState00(int n) {
        switch (n - this.IT_OFFSET) {
            case 0: {
                this.setBoolean(587005952, false);
                break;
            }
            case 1: {
                break;
            }
            case 2: {
                this.setInteger(317784064, 100);
                this.setInteger(-607911936, 100);
                EventGeneric eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-607911936));
                eventGeneric.setInt(1, this.getInteger(317784064));
                this.triggerObserver(1560936512, eventGeneric);
                break;
            }
            case 3: {
                this.setInteger(-1549598720, SkinDataPool.getInteger(190));
                break;
            }
            case 4: {
                this.setInteger(-1549598720, SkinDataPool.getInteger(180));
                break;
            }
            case 5: {
                this.triggerObserver(1078071104);
                break;
            }
            case 6: {
                this.triggerObserver(1527316544);
                this.setBoolean(587005952, false);
                break;
            }
            case 7: {
                this.setInteger(30370, MirrorlinkActivity.evListItemActionIndex());
                EventGeneric eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(30370));
                this.triggerObserver(-301400000, eventGeneric);
                break;
            }
            case 8: {
                MirrorlinkActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 73764169);
                break;
            }
            case 9: {
                this.triggerObserver(1094848320);
                break;
            }
            case 10: {
                this.setBoolean(25386, true);
                break;
            }
            case 11: {
                this.setBoolean(25386, false);
                break;
            }
            case 12: {
                MirrorlinkActivity.fireHMIEvent(ANY, BROADCAST, 594120009);
                break;
            }
            case 13: {
                this.setInteger(1370882048, MirrorlinkActivity.evPointX());
                this.setInteger(1320550400, MirrorlinkActivity.evPointY());
                this.setInteger(236323072, 0);
                EventGeneric eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1370882048));
                eventGeneric.setInt(1, this.getInteger(1320550400));
                eventGeneric.setInt(2, this.getInteger(1858011136));
                eventGeneric.setInt(3, this.getInteger(1824456704));
                eventGeneric.setInt(4, this.getInteger(23553));
                eventGeneric.setInt(5, this.getInteger(-327155712));
                eventGeneric.setInt(6, this.getInteger(236323072));
                this.triggerObserver(-1140195264, eventGeneric);
                this.setInteger(10717, MirrorlinkActivity.evPointX());
                this.setInteger(10716, MirrorlinkActivity.evPointY());
                this.setInteger(-1148911616, 0);
                eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(10717));
                eventGeneric.setInt(1, this.getInteger(10716));
                eventGeneric.setInt(2, this.getInteger(-1148911616));
                this.triggerObserver(-1609957312, eventGeneric);
                break;
            }
            case 14: {
                this.setInteger(1370882048, MirrorlinkActivity.evPointX());
                this.setInteger(1320550400, MirrorlinkActivity.evPointY());
                this.setInteger(236323072, 2);
                EventGeneric eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1370882048));
                eventGeneric.setInt(1, this.getInteger(1320550400));
                eventGeneric.setInt(2, this.getInteger(1858011136));
                eventGeneric.setInt(3, this.getInteger(1824456704));
                eventGeneric.setInt(4, this.getInteger(23553));
                eventGeneric.setInt(5, this.getInteger(-327155712));
                eventGeneric.setInt(6, this.getInteger(236323072));
                this.triggerObserver(-1140195264, eventGeneric);
                this.setInteger(10717, MirrorlinkActivity.evPointX());
                this.setInteger(10716, MirrorlinkActivity.evPointY());
                this.setInteger(-1148911616, 0);
                eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(10717));
                eventGeneric.setInt(1, this.getInteger(10716));
                eventGeneric.setInt(2, this.getInteger(-1148911616));
                this.triggerObserver(-1609957312, eventGeneric);
                this.setInteger(-1148911616, 1);
                eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(10717));
                eventGeneric.setInt(1, this.getInteger(10716));
                eventGeneric.setInt(2, this.getInteger(-1148911616));
                this.triggerObserver(-1609957312, eventGeneric);
                break;
            }
            case 15: {
                this.setInteger(1370882048, MirrorlinkActivity.evPointX());
                this.setInteger(1320550400, MirrorlinkActivity.evPointY());
                this.setInteger(1858011136, MirrorlinkActivity.evPointGestureParam1());
                this.setInteger(1824456704, MirrorlinkActivity.evPointGestureParam2());
                this.setInteger(236323072, 3);
                EventGeneric eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1370882048));
                eventGeneric.setInt(1, this.getInteger(1320550400));
                eventGeneric.setInt(2, this.getInteger(1858011136));
                eventGeneric.setInt(3, this.getInteger(1824456704));
                eventGeneric.setInt(4, this.getInteger(23553));
                eventGeneric.setInt(5, this.getInteger(-327155712));
                eventGeneric.setInt(6, this.getInteger(236323072));
                this.triggerObserver(-1140195264, eventGeneric);
                this.setInteger(10717, MirrorlinkActivity.evPointX());
                this.setInteger(10716, MirrorlinkActivity.evPointY());
                this.setInteger(-1148911616, 0);
                eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(10717));
                eventGeneric.setInt(1, this.getInteger(10716));
                eventGeneric.setInt(2, this.getInteger(-1148911616));
                this.triggerObserver(-1609957312, eventGeneric);
                break;
            }
            case 16: {
                this.setInteger(1370882048, MirrorlinkActivity.evPointX());
                this.setInteger(1320550400, MirrorlinkActivity.evPointY());
                this.setInteger(-327155712, MirrorlinkActivity.evPointGestureParam1());
                this.setInteger(23553, MirrorlinkActivity.evPointGestureParam2());
                this.setInteger(236323072, 4);
                EventGeneric eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1370882048));
                eventGeneric.setInt(1, this.getInteger(1320550400));
                eventGeneric.setInt(2, this.getInteger(1858011136));
                eventGeneric.setInt(3, this.getInteger(1824456704));
                eventGeneric.setInt(4, this.getInteger(23553));
                eventGeneric.setInt(5, this.getInteger(-327155712));
                eventGeneric.setInt(6, this.getInteger(236323072));
                this.triggerObserver(-1140195264, eventGeneric);
                break;
            }
            case 17: {
                this.setInteger(1370882048, MirrorlinkActivity.evPointX());
                this.setInteger(1320550400, MirrorlinkActivity.evPointY());
                this.setInteger(236323072, 1);
                EventGeneric eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(1370882048));
                eventGeneric.setInt(1, this.getInteger(1320550400));
                eventGeneric.setInt(2, this.getInteger(1858011136));
                eventGeneric.setInt(3, this.getInteger(1824456704));
                eventGeneric.setInt(4, this.getInteger(23553));
                eventGeneric.setInt(5, this.getInteger(-327155712));
                eventGeneric.setInt(6, this.getInteger(236323072));
                this.triggerObserver(-1140195264, eventGeneric);
                this.setInteger(10717, MirrorlinkActivity.evPointX());
                this.setInteger(10716, MirrorlinkActivity.evPointY());
                this.setInteger(-1148911616, 1);
                eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(10717));
                eventGeneric.setInt(1, this.getInteger(10716));
                eventGeneric.setInt(2, this.getInteger(-1148911616));
                this.triggerObserver(-1609957312, eventGeneric);
                break;
            }
            case 18: {
                this.setBoolean(13682, !this.getBoolean(13682));
                this.setBoolean(32615, !this.getBoolean(32615));
                this.setBoolean(17873, !this.getBoolean(17873));
                break;
            }
            case 19: {
                this.setBoolean(21100, !this.getBoolean(21100));
                MirrorlinkActivity.fireHMIEvent(ANY, BROADCAST, 594120009);
                break;
            }
            case 20: {
                if (!this.getBoolean(17873)) {
                    this.setBoolean(2109210624, !this.getBoolean(2109210624));
                }
                if (!this.getBoolean(17873)) break;
                this.setBoolean(16559, !this.getBoolean(16559));
                break;
            }
            case 21: {
                MirrorlinkActivity.fireHMIEvent(ANY, BROADCAST, -1957130935);
                this.setInteger(19672, 2);
                MirrorlinkActivity.fireHMIEvent(ANY, BROADCAST, 1533054281);
                break;
            }
            case 22: {
                this.setInteger(19672, 1);
                MirrorlinkActivity.fireHMIEvent(ANY, BROADCAST, 1533054281);
                break;
            }
        }
    }

    private boolean evalTriggeredTransitionGuard_SubHapticMirrorlinkDynState(int n) {
        switch (n - this.TT_OFFSET) {
            case 3: {
                return this.getBoolean(-1432944640);
            }
        }
        return true;
    }

    private void performTriggeredTransitionAction_SubHapticMirrorlinkDynState(int n) {
        this.performTriggeredTransitionAction_SubHapticMirrorlinkDynState0(n);
    }

    private void performTriggeredTransitionAction_SubHapticMirrorlinkDynState0(int n) {
        switch (n - this.TT_OFFSET) {
            case 3: {
                this.setBoolean(587005952, false);
                break;
            }
            case 4: {
                this.triggerObserver(1376387136);
                break;
            }
            case 8: {
                this.triggerObserver(2114650176);
                break;
            }
            case 9: {
                this.setInteger(551092224, MirrorlinkActivity.evListItemActionIndex());
                this.setInteger(-17825792, MirrorlinkActivity.evListItemActionIndex());
                break;
            }
        }
    }

    private boolean evalUntriggeredTransitionGuard_SubHapticMirrorlinkDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 7: {
                return !this.getLicValue(3419, 1, this.getInteger(-17825792), false) && this.getBoolean(-1359216640);
            }
            case 8: {
                return !this.getLicValue(3419, 3, this.getInteger(-17825792), false) && this.getBoolean(-1359216640);
            }
            case 9: {
                return this.getBoolean(-1376518144);
            }
            case 12: {
                return this.getListItemControl(3545, true).getItemCount() > 0 && !this.getBoolean(587005952);
            }
            case 13: {
                return this.getBoolean(-1432944640) && !this.getBoolean(587005952);
            }
            case 14: {
                return this.getBoolean(314638336) && this.getBoolean(-1878785792) && !this.getBoolean(587005952);
            }
            case 15: {
                return this.getBoolean(-6356992);
            }
        }
        return true;
    }

    private void performUntriggeredTransitionAction_SubHapticMirrorlinkDynState(int n) {
        switch (n - this.UT_OFFSET) {
            case 7: {
                MirrorlinkActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -77296311);
                break;
            }
            case 8: {
                MirrorlinkActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 107318601);
                break;
            }
            case 9: {
                MirrorlinkActivity.fireHMIEvent(this.fromMe(), this.meSelf(), -60519095);
                break;
            }
            case 10: {
                EventGeneric eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(551092224));
                this.triggerObserver(1460207680, eventGeneric);
                break;
            }
            case 11: {
                MirrorlinkActivity.fireHMIEvent(ANY, BROADCAST, -1940353719);
                this.setInteger(16776, SkinDataPool.getInteger(190));
                break;
            }
            case 13: {
                if (this.getListItemControl(3545, true).getItemCount() == 0) {
                    this.setInteger(551092224, 0);
                }
                if (this.getListItemControl(3545, true).getItemCount() != 0) break;
                EventGeneric eventGeneric = MirrorlinkActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(551092224));
                this.triggerObserver(1460207680, eventGeneric);
                break;
            }
            case 14: {
                this.triggerObserver(2114650176);
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

