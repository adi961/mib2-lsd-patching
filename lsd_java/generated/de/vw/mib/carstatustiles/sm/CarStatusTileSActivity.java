/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.carstatustiles.sm;

import de.vw.mib.modelapi.ModelApiDownEvent;
import de.vw.mib.sm.internal.statemachine.TopStatemachine;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineActivityBase;

public class CarStatusTileSActivity
extends StatemachineActivityBase {
    public CarStatusTileSActivity(TopStatemachine topStatemachine, int n, int n2, int n3, int n4, int n5) {
        super(topStatemachine, n2, n3, n4, n5);
    }

    @Override
    public void performStateEntryAction(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 6: {
                this.showView("Csst", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 7: {
                this.showView("Cstslc", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    @Override
    public void performStateExitAction(int n) {
        switch (n - this.S_OFFSET) {
            case 6: {
                this.hideView("Csst");
                break;
            }
            case 7: {
                this.hideView("Cstslc");
                break;
            }
        }
    }

    @Override
    public void performInternalTransitionAction(int n) {
        this.performInternalTransitionAction0(n);
    }

    private void performInternalTransitionAction0(int n) {
        switch (n - this.IT_OFFSET) {
            case 1: {
                if (CarStatusTileSActivity.evIntegerValueValue() == 0) {
                    this.setInteger(2031681792, 0);
                }
                if (CarStatusTileSActivity.evIntegerValueValue() == 1 && this.getBoolean(-927596544)) {
                    this.setInteger(2031681792, 1);
                }
                if (CarStatusTileSActivity.evIntegerValueValue() == 1 && !this.getBoolean(-927596544)) {
                    this.setInteger(2031681792, 2);
                }
                if (CarStatusTileSActivity.evIntegerValueValue() == 2 && this.getBoolean(-927596544)) {
                    this.setInteger(2031681792, 2);
                }
                ModelApiDownEvent modelApiDownEvent = this.createModelApiDownEvent(7);
                modelApiDownEvent.setInt(0, this.getInteger(2031681792));
                this.fireModelApiDownEvent(modelApiDownEvent);
                break;
            }
        }
    }

    @Override
    public boolean evalUntriggeredTransitionGuard(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                return this.getInteger(1374879744) == 1;
            }
        }
        return true;
    }
}

