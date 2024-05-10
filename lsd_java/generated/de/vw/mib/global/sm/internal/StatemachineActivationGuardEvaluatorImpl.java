/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.global.sm.internal;

import de.vw.mib.sm.internal.statemachine.StatemachineActivationGuardEvaluator;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineHandlerBase;

public class StatemachineActivationGuardEvaluatorImpl
extends StatemachineHandlerBase
implements StatemachineActivationGuardEvaluator {
    @Override
    public boolean statemachineShallBeStarted(int n) {
        switch (n) {
            case 553: {
                return this.getInteger(17141) == 0;
            }
            case 555: {
                return this.getInteger(1471086592) == 0;
            }
            case 558: {
                return this.getInteger(31672) == 0;
            }
            case 565: {
                return this.getInteger(-657195008) == 0;
            }
            case 568: {
                return this.getInteger(353894656) == 0;
            }
            case 569: {
                return this.getInteger(-877789184) == 0;
            }
            case 570: {
                return this.getInteger(-1240792832) == 0;
            }
            case 575: {
                return this.getInteger(-284425984) == 0;
            }
            case 576: {
                return this.getInteger(19157) == 0;
            }
            case 578: {
                return false;
            }
            case 579: {
                return this.getInteger(26935296) == 0;
            }
            case 583: {
                return this.getInteger(-420282368) == 0;
            }
            case 585: {
                return this.getInteger(19247) == 0;
            }
            case 587: {
                return this.getInteger(-711589888) == 0;
            }
            case 591: {
                return this.getInteger(18271) == 0;
            }
            case 601: {
                return this.getInteger(520225024) == 0;
            }
            case 602: {
                return this.getInteger(1594818816) == 0;
            }
            case 603: {
                return this.getInteger(1594818816) == 0;
            }
            case 604: {
                return this.getInteger(-353501184) == 0;
            }
            case 605: {
                return this.getInteger(1501626368) == 0;
            }
            case 607: {
                return this.getInteger(-351731456) == 0;
            }
            case 610: {
                return this.getInteger(-323289088) == 0;
            }
            case 612: {
                return this.getInteger(16651) == 0;
            }
            case 613: {
                return this.getInteger(21641) == 0;
            }
            case 614: {
                return this.getInteger(472056064) == 0;
            }
            case 616: {
                return this.getInteger(-284425984) == 0;
            }
            case 618: {
                return this.getInteger(-351731456) == 0;
            }
        }
        return true;
    }
}

