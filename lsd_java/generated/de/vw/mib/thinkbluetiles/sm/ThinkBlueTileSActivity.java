/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.thinkbluetiles.sm;

import de.vw.mib.sm.internal.statemachine.TopStatemachine;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineActivityBase;

public class ThinkBlueTileSActivity
extends StatemachineActivityBase {
    public ThinkBlueTileSActivity(TopStatemachine topStatemachine, int n, int n2, int n3, int n4, int n5) {
        super(topStatemachine, n2, n3, n4, n5);
    }

    @Override
    public void performStateEntryAction(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 6: {
                if (this.getInteger(-371654656) == 0) {
                    this.setInteger(528744448, this.getInteger(32345));
                    this.setInteger(421789952, this.getInteger(32345));
                    if (this.getInteger(32345) == 4) {
                        this.setBoolean(0xAA10000, false);
                    }
                    if (this.getInteger(32345) == 4) {
                        this.setBoolean(483983360, false);
                    }
                    if (this.getInteger(32345) != 4) {
                        this.setBoolean(0xAA10000, true);
                    }
                    if (this.getInteger(32345) != 4) {
                        this.setInteger(1979514880, this.getInteger(923992320));
                    }
                    if (this.getInteger(32345) == 1 && this.getInteger(32345) != 4) {
                        this.fireModelApiDownEvent(this.createModelApiDownEvent(38));
                    }
                }
                this.showView("Ctstm", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 7: {
                this.showView("Tbtslc", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    @Override
    public void performStateExitAction(int n) {
        switch (n - this.S_OFFSET) {
            case 6: {
                this.hideView("Ctstm");
                if (this.getInteger(-371654656) != 0) break;
                ThinkBlueTileSActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1298697545);
                ThinkBlueTileSActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1349029193);
                if (this.getInteger(32345) != 2 && this.getInteger(32345) != 0 && this.getInteger(32345) != 4) {
                    this.fireModelApiDownEvent(this.createModelApiDownEvent(37));
                }
                this.setBoolean(483983360, false);
                this.setBoolean(0xAA10000, false);
                this.setInteger(528744448, 4);
                this.setInteger(421789952, 4);
                break;
            }
            case 7: {
                this.hideView("Tbtslc");
                break;
            }
        }
    }

    @Override
    public boolean evalInternalTransitionGuard(int n) {
        switch (n - this.IT_OFFSET) {
            case 1: {
                return this.getInteger(-371654656) == 0;
            }
            case 2: {
                return this.getInteger(32345) != 2 && this.getInteger(32345) != 0 && this.getInteger(-371654656) == 0;
            }
            case 3: {
                return this.getInteger(32345) == 4 && this.getInteger(-371654656) == 0;
            }
            case 4: {
                return this.getInteger(421789952) == this.getInteger(528744448) && this.getInteger(32345) != 4 && this.getInteger(-371654656) == 0;
            }
            case 5: {
                return this.getInteger(32345) != 4 && this.getInteger(421789952) != this.getInteger(528744448) && this.getInteger(-371654656) == 0;
            }
            case 6: {
                return this.getInteger(32345) == 4 && !this.getBoolean(483983360) && this.getInteger(-371654656) == 0;
            }
            case 7: {
                return this.getInteger(32345) != 4 && this.getBoolean(483983360) && this.getInteger(-371654656) == 0;
            }
            case 8: {
                return this.getInteger(32345) != 4 && !this.getBoolean(483983360) && this.getInteger(-371654656) == 0;
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
                if (this.getInteger(32345) == 4) break;
                ThinkBlueTileSActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1332251977);
                this.setBoolean(483983360, true);
                break;
            }
            case 2: {
                this.setBoolean(0xAA10000, false);
                this.fireModelApiDownEvent(this.createModelApiDownEvent(37));
                break;
            }
            case 3: {
                this.setBoolean(0xAA10000, false);
                this.setBoolean(483983360, false);
                break;
            }
            case 4: {
                ThinkBlueTileSActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1281920329);
                this.setBoolean(483983360, false);
                break;
            }
            case 5: {
                this.setBoolean(483983360, true);
                this.setInteger(1979514880, this.getInteger(923992320));
                ThinkBlueTileSActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1332251977);
                this.setInteger(528744448, this.getInteger(421789952));
                break;
            }
            case 6: {
                ThinkBlueTileSActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1298697545);
                this.setInteger(528744448, this.getInteger(32345));
                this.setInteger(421789952, this.getInteger(32345));
                this.setBoolean(0xAA10000, false);
                break;
            }
            case 7: {
                this.setInteger(421789952, this.getInteger(32345));
                break;
            }
            case 8: {
                ThinkBlueTileSActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1298697545);
                this.setBoolean(0xAA10000, true);
                this.setInteger(528744448, this.getInteger(32345));
                this.setInteger(421789952, this.getInteger(528744448));
                this.setInteger(1979514880, this.getInteger(923992320));
                this.setBoolean(483983360, true);
                if (this.getInteger(32345) == 1) {
                    this.fireModelApiDownEvent(this.createModelApiDownEvent(38));
                }
                ThinkBlueTileSActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1332251977);
                break;
            }
            case 9: {
                this.setInteger(-371654656, ThinkBlueTileSActivity.evIntegerValueValue());
                if (this.getInteger(-371654656) == 0) {
                    this.setInteger(528744448, this.getInteger(32345));
                    this.setInteger(421789952, this.getInteger(32345));
                    if (this.getInteger(32345) == 4) {
                        this.setBoolean(0xAA10000, false);
                    }
                    if (this.getInteger(32345) == 4) {
                        this.setBoolean(483983360, false);
                    }
                    if (this.getInteger(32345) != 4) {
                        this.setBoolean(0xAA10000, true);
                    }
                    if (this.getInteger(32345) != 4) {
                        this.setInteger(1979514880, this.getInteger(923992320));
                    }
                    if (this.getInteger(32345) == 1 && this.getInteger(32345) != 4) {
                        this.fireModelApiDownEvent(this.createModelApiDownEvent(38));
                    }
                    if (this.getInteger(32345) != 4) {
                        ThinkBlueTileSActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1332251977);
                        this.setBoolean(483983360, true);
                    }
                }
                if (this.getInteger(-371654656) == 0) break;
                ThinkBlueTileSActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1298697545);
                ThinkBlueTileSActivity.fireHMIEvent(this.fromMe(), this.meSelf(), 1349029193);
                if (this.getInteger(32345) != 2 && this.getInteger(32345) != 0 && this.getInteger(32345) != 4) {
                    this.fireModelApiDownEvent(this.createModelApiDownEvent(37));
                }
                this.setBoolean(483983360, false);
                this.setBoolean(0xAA10000, false);
                this.setInteger(528744448, 4);
                this.setInteger(421789952, 4);
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

