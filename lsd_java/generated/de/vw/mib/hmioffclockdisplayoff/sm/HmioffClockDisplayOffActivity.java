/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.hmioffclockdisplayoff.sm;

import de.vw.mib.genericevents.EventGeneric;
import de.vw.mib.sm.internal.statemachine.TopStatemachine;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineActivityBase;

public class HmioffClockDisplayOffActivity
extends StatemachineActivityBase {
    public HmioffClockDisplayOffActivity(TopStatemachine topStatemachine, int n, int n2, int n3, int n4, int n5) {
        super(topStatemachine, n2, n3, n4, n5);
    }

    @Override
    public void performStateEntryAction(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 5: {
                this.setInteger(808059136, this.getInteger(-623837184));
                break;
            }
            case 7: {
                this.setInteger(808059136, this.getInteger(-623837184));
                if (!this.getBoolean(1033437184)) {
                    this.setInteger(824836352, 0);
                }
                if (this.getBoolean(1033437184)) {
                    this.setInteger(824836352, 1);
                }
                this.showView("Hocv_08DA85708EEB9B2F_CA54", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    @Override
    public void performStateExitAction(int n) {
        switch (n - this.S_OFFSET) {
            case 7: {
                this.hideView("Hocv_08DA85708EEB9B2F_CA54");
                break;
            }
        }
    }

    @Override
    public boolean evalInternalTransitionGuard(int n) {
        switch (n - this.IT_OFFSET) {
            case 1: {
                return this.getInteger(-308740096) == 6;
            }
            case 2: {
                return this.getInteger(-308740096) == 4;
            }
        }
        return true;
    }

    @Override
    public void performInternalTransitionAction(int n) {
        this.performInternalTransitionAction0(n);
    }

    private void performInternalTransitionAction0(int n) {
        switch (n - this.IT_OFFSET) {
            case 1: {
                this.setInteger(-452263680, 4);
                EventGeneric eventGeneric = HmioffClockDisplayOffActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-452263680));
                this.triggerObserver(1191510080, eventGeneric);
                break;
            }
            case 2: {
                this.setInteger(-452263680, 6);
                EventGeneric eventGeneric = HmioffClockDisplayOffActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-452263680));
                this.triggerObserver(1191510080, eventGeneric);
                break;
            }
            case 3: {
                this.setInteger(808059136, HmioffClockDisplayOffActivity.evIntegerValueValue());
                this.setInteger(841613568, this.getInteger(808059136));
                EventGeneric eventGeneric = HmioffClockDisplayOffActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(841613568));
                this.triggerObserver(1612800064, eventGeneric);
                break;
            }
        }
    }
}

