/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.navmaptile.sm;

import de.vw.mib.genericevents.EventGeneric;
import de.vw.mib.sm.internal.statemachine.TopStatemachine;
import generated.de.vw.mib.global.datapool.SkinDataPool;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineActivityBase;

public class NavMapTileActivity
extends StatemachineActivityBase {
    public NavMapTileActivity(TopStatemachine topStatemachine, int n, int n2, int n3, int n4, int n5) {
        super(topStatemachine, n2, n3, n4, n5);
    }

    @Override
    public void performStateEntryAction(int n, boolean bl) {
        switch (n - this.S_OFFSET) {
            case 6: {
                this.setBoolean(-1663762432, true);
                EventGeneric eventGeneric = NavMapTileActivity.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-1663762432));
                this.triggerObserver(1199593536, eventGeneric);
                this.setInteger(11262, 10000);
                eventGeneric = NavMapTileActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(11262));
                this.triggerObserver(1182816320, eventGeneric);
                this.setBoolean(13363, false);
                this.setBoolean(-673054720, true);
                this.setInteger(25953, SkinDataPool.getInteger(130));
                this.setInteger(1707016192, SkinDataPool.getInteger(128));
                this.setInteger(-1292632064, SkinDataPool.getInteger(129));
                this.setInteger(-1309409280, SkinDataPool.getInteger(131));
                if (this.getBoolean(20854)) {
                    this.setInteger(25953, SkinDataPool.getInteger(132));
                }
                if (this.getBoolean(20854)) {
                    this.setInteger(1707016192, SkinDataPool.getInteger(133));
                }
                if (this.getBoolean(20854)) {
                    this.setInteger(-1292632064, SkinDataPool.getInteger(134));
                }
                if (this.getBoolean(20854)) {
                    this.setInteger(-1309409280, SkinDataPool.getInteger(135));
                }
                if (this.getBoolean(-1936785408)) {
                    this.setInteger(25953, SkinDataPool.getInteger(136));
                }
                if (this.getBoolean(-1936785408)) {
                    this.setInteger(1707016192, SkinDataPool.getInteger(137));
                }
                if (this.getBoolean(-1936785408)) {
                    this.setInteger(-1292632064, SkinDataPool.getInteger(138));
                }
                if (this.getBoolean(-1936785408)) {
                    this.setInteger(-1309409280, SkinDataPool.getInteger(139));
                }
                this.setInteger(31902, 0);
                eventGeneric = NavMapTileActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(31902));
                eventGeneric.setInt(1, this.getInteger(-1292632064));
                eventGeneric.setInt(2, this.getInteger(-1309409280));
                eventGeneric.setInt(3, this.getInteger(25953));
                eventGeneric.setInt(4, this.getInteger(1707016192));
                this.triggerObserver(1216370752, eventGeneric);
                this.setInteger(-571867136, SkinDataPool.getInteger(156));
                this.setInteger(-622198784, SkinDataPool.getInteger(157));
                if (this.getInteger(26294) == 1) {
                    this.setInteger(-571867136, SkinDataPool.getInteger(154));
                }
                if (this.getInteger(26294) == 1) {
                    this.setInteger(-622198784, SkinDataPool.getInteger(155));
                }
                if (this.getInteger(26294) == 3) {
                    this.setInteger(-571867136, SkinDataPool.getInteger(160));
                }
                if (this.getInteger(26294) == 3) {
                    this.setInteger(-622198784, SkinDataPool.getInteger(161));
                }
                if (this.getInteger(26294) == 2) {
                    this.setInteger(-571867136, SkinDataPool.getInteger(152));
                }
                if (this.getInteger(26294) == 2) {
                    this.setInteger(-622198784, SkinDataPool.getInteger(153));
                }
                if (this.getInteger(26294) == 4) {
                    this.setInteger(-571867136, SkinDataPool.getInteger(158));
                }
                if (this.getInteger(26294) == 4) {
                    this.setInteger(-622198784, SkinDataPool.getInteger(159));
                }
                if (this.getBoolean(20854)) {
                    this.setInteger(-571867136, SkinDataPool.getInteger(162));
                }
                if (this.getBoolean(20854)) {
                    this.setInteger(-622198784, SkinDataPool.getInteger(163));
                }
                if (this.getBoolean(-1936785408)) {
                    this.setInteger(-571867136, SkinDataPool.getInteger(164));
                }
                if (this.getBoolean(-1936785408)) {
                    this.setInteger(-622198784, SkinDataPool.getInteger(165));
                }
                eventGeneric = NavMapTileActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(-571867136));
                eventGeneric.setInt(1, this.getInteger(-622198784));
                this.triggerObserver(1115707456, eventGeneric);
                this.setInteger(857800960, SkinDataPool.getInteger(144));
                this.setInteger(841023744, SkinDataPool.getInteger(145));
                if (this.getInteger(26294) == 1) {
                    this.setInteger(857800960, SkinDataPool.getInteger(142));
                }
                if (this.getInteger(26294) == 1) {
                    this.setInteger(841023744, SkinDataPool.getInteger(143));
                }
                if (this.getInteger(26294) == 3) {
                    this.setInteger(857800960, SkinDataPool.getInteger(148));
                }
                if (this.getInteger(26294) == 3) {
                    this.setInteger(841023744, SkinDataPool.getInteger(149));
                }
                if (this.getInteger(26294) == 2) {
                    this.setInteger(857800960, SkinDataPool.getInteger(140));
                }
                if (this.getInteger(26294) == 2) {
                    this.setInteger(841023744, SkinDataPool.getInteger(141));
                }
                if (this.getInteger(26294) == 4) {
                    this.setInteger(857800960, SkinDataPool.getInteger(146));
                }
                if (this.getInteger(26294) == 4) {
                    this.setInteger(841023744, SkinDataPool.getInteger(147));
                }
                if (this.getBoolean(20854)) {
                    this.setInteger(857800960, SkinDataPool.getInteger(150));
                }
                if (this.getBoolean(20854)) {
                    this.setInteger(841023744, SkinDataPool.getInteger(151));
                }
                eventGeneric = NavMapTileActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(857800960));
                eventGeneric.setInt(1, this.getInteger(841023744));
                this.triggerObserver(1098930240, eventGeneric);
                if (this.getBoolean(19680) && this.getInteger(-1410465792) == 1) {
                    this.setInteger(-620756736, 577);
                    this.setInteger(-654311168, 643);
                    this.setFloat(-639893504, -842249153);
                    eventGeneric = NavMapTileActivity.newEvent();
                    eventGeneric.setInt(0, this.getInteger(-620756736));
                    eventGeneric.setInt(1, this.getInteger(-654311168));
                    eventGeneric.setFloat(2, this.getFloat(-639893504));
                    this.triggerObserver(1249925184, eventGeneric);
                }
                this.showView("Nm", bl, this.getIncludeDdpGroupId());
                break;
            }
            case 7: {
                this.showView("Nml", bl, this.getIncludeDdpGroupId());
                break;
            }
        }
    }

    @Override
    public void performStateExitAction(int n) {
        switch (n - this.S_OFFSET) {
            case 6: {
                this.hideView("Nm");
                this.setInteger(31902, 1);
                EventGeneric eventGeneric = NavMapTileActivity.newEvent();
                eventGeneric.setInt(0, this.getInteger(31902));
                eventGeneric.setInt(1, this.getInteger(-1292632064));
                eventGeneric.setInt(2, this.getInteger(-1309409280));
                eventGeneric.setInt(3, this.getInteger(25953));
                eventGeneric.setInt(4, this.getInteger(1707016192));
                this.triggerObserver(1216370752, eventGeneric);
                break;
            }
            case 7: {
                this.hideView("Nml");
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
                this.fireModelApiDownEvent(this.createModelApiDownEvent(21));
                break;
            }
            case 2: {
                this.fireModelApiDownEvent(this.createModelApiDownEvent(21));
                break;
            }
        }
    }

    @Override
    public boolean evalUntriggeredTransitionGuard(int n) {
        switch (n - this.UT_OFFSET) {
            case 1: {
                return this.getBoolean(1391788032);
            }
        }
        return true;
    }
}

