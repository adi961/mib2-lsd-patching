/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.spacegestureindicator.sm;

import de.vw.mib.sm.internal.statemachine.TopStatemachine;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineActivityBase;

public class SpaceGestureIndicatorActivity
extends StatemachineActivityBase {
    public SpaceGestureIndicatorActivity(TopStatemachine topStatemachine, int n, int n2, int n3, int n4, int n5) {
        super(topStatemachine, n2, n3, n4, n5);
    }

    @Override
    public void performStateEntryAction(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.showView("Sgi", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    @Override
    public void performStateExitAction(int n) {
        switch (n - this.S_OFFSET) {
            case 2: {
                this.hideView("Sgi");
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
            case 0: {
                if (this.getInteger(23421) == 1) {
                    this.setBoolean(314048512, true);
                }
                if (this.getInteger(23421) == 1) {
                    this.setBoolean(-471400448, true);
                }
                if (this.getInteger(23421) == 1) {
                    this.setBoolean(-2035089408, true);
                }
                if (this.getInteger(23421) == 1) {
                    this.setBoolean(-334954240, true);
                }
                if (this.getInteger(23421) == 3) {
                    this.setBoolean(-1278279680, true);
                }
                if (this.getInteger(23421) == 4) {
                    this.setBoolean(-124846080, true);
                }
                if (this.getInteger(23421) == 6) {
                    this.setBoolean(15234, true);
                }
                if (this.getInteger(23421) == 5) {
                    this.setBoolean(839450880, true);
                }
                SpaceGestureIndicatorActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 73895241);
                if (this.getInteger(23421) == 1) {
                    this.setBoolean(17656, true);
                }
                if (this.getInteger(23421) != 2) break;
                this.setBoolean(17656, false);
                break;
            }
            case 1: {
                this.setBoolean(314048512, false);
                this.setBoolean(-2035089408, false);
                this.setBoolean(-471400448, false);
                this.setBoolean(-334954240, false);
                this.setBoolean(15234, false);
                this.setBoolean(839450880, false);
                this.setBoolean(-124846080, false);
                this.setBoolean(-1278279680, false);
                break;
            }
        }
    }
}

