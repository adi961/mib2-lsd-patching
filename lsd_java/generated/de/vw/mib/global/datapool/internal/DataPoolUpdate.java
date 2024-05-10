/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.global.datapool.internal;

import de.vw.mib.app.framework.AppDefinition;
import de.vw.mib.datapool.ModelDatapoolObserver;
import de.vw.mib.hmi.internal.ServiceManagerCommon;
import de.vw.mib.list.ListItemControlListener;
import generated.de.vw.mib.global.datapool.ModelDataPoolBase;
import generated.de.vw.mib.global.datapool.internal.DataPoolUpdate$AslListUpdate;

public class DataPoolUpdate
extends ModelDataPoolBase
implements ModelDatapoolObserver {
    private boolean suppressUpdate = true;

    private boolean suppressUpdate() {
        if (this.suppressUpdate && ServiceManagerCommon.startupManagerService.isDatapoolUpdatesEnabled()) {
            this.suppressUpdate = false;
        }
        return this.suppressUpdate;
    }

    public ListItemControlListener createAslListUpdate(int n) {
        return new DataPoolUpdate$AslListUpdate(this, n);
    }

    void aslListChanged(int n) {
        if (this.suppressUpdate()) {
            return;
        }
        block0 : switch (n) {
            case 58: {
                this.fireCommonEvent(null, null, -1335587511);
                break;
            }
            case 10530: {
                this.fireCommonEvent(null, null, -1016623799);
                break;
            }
            case 10480: {
                this.fireCommonEvent(null, null, -949514935);
                break;
            }
            case 10462: {
                this.fireCommonEvent(null, null, -379089591);
                break;
            }
            case 10560: {
                int n2 = this.getLicValue(10560, 2, 0, 0);
                switch (n2) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: {
                        this.fireDiscreteEvent(null, null, -781742775);
                        break;
                    }
                }
                n2 = this.getLicValue(10560, 1, 0, 0);
                switch (n2) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: {
                        this.fireDiscreteEvent(null, null, -748188343);
                        break;
                    }
                }
                n2 = this.getLicValue(10560, 0, 0, -1);
                switch (n2) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: {
                        this.fireDiscreteEvent(null, null, -764965559);
                        break;
                    }
                }
                n2 = this.getLicValue(10560, 3, 0, 1);
                switch (n2) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: {
                        this.fireDiscreteEvent(null, null, -731411127);
                        break block0;
                    }
                }
                break;
            }
            case 110049: {
                this.fireCommonEvent(null, null, 1801489737);
                break;
            }
            case 332: {
                this.fireCommonEvent(null, null, 1918930249);
                break;
            }
            case 333: {
                this.fireCommonEvent(null, null, 1935707465);
                break;
            }
            case 3344: {
                this.fireCommonEvent(null, null, -1973318327);
                break;
            }
            case 5710002: {
                this.fireCommonEvent(null, null, -1637577399);
                break;
            }
            case 462: {
                this.fireCommonEvent(null, null, -110850743);
                break;
            }
            case 924: {
                int n3 = this.getLicValue(924, 2, 0, 0);
                if (n3 != 2) break;
                this.fireDiscreteEvent(null, null, 1063619913);
                break;
            }
            case 1310055: {
                this.fireCommonEvent(null, null, -1956278967);
                break;
            }
            case 1461: {
                this.fireCommonEvent(null, null, -932672183);
                break;
            }
            case 2710016: {
                this.fireCommonEvent(null, null, 258510153);
                break;
            }
        }
    }

    @Override
    public void datapoolValueChanged(int n) {
        if (this.suppressUpdate()) {
            return;
        }
        int n2 = n & 0xFF;
        block0 : switch (n2) {
            case 0: {
                if (n == 0xFA0000) {
                    this.fireCommonEvent(null, null, -1320409600);
                    break;
                }
                if (n != 11264) break;
                this.fireCommonEvent(null, null, 582);
                break;
            }
            case 2: {
                if (n == 43712512) {
                    int n3 = this.getInteger(43712512);
                    switch (n3) {
                        case 1: {
                            this.fireDiscreteEvent(null, null, -1167815351);
                            break block0;
                        }
                        case 2: {
                            this.fireDiscreteEvent(null, null, -1151038135);
                            break block0;
                        }
                        case 4: {
                            this.fireDiscreteEvent(null, null, -1184592567);
                            break block0;
                        }
                        case 5: {
                            this.fireDiscreteEvent(null, null, -1201369783);
                            break block0;
                        }
                        case 6: {
                            this.fireDiscreteEvent(null, null, -1218146999);
                            break block0;
                        }
                    }
                    break;
                }
                if (n != 45744128) break;
                this.fireCommonEvent(null, null, -513766071);
                break;
            }
            case 5: {
                if (n != 84148480) break;
                this.fireCommonEvent(null, null, -1872392887);
                break;
            }
            case 6: {
                if (n != 100794624) break;
                this.fireCommonEvent(null, null, -983003831);
                break;
            }
            case 7: {
                if (n != 129826816) break;
                this.fireCommonEvent(null, null, -899183287);
                break;
            }
            case 9: {
                int n4;
                if (n == 21769) {
                    this.fireCommonEvent(null, null, 1751158089);
                    break;
                }
                if (n != 163643392 || (n4 = this.getInteger(163643392)) != 2) break;
                this.fireDiscreteEvent(null, null, 1197837641);
                break;
            }
            case 12: {
                if (n == 16652) {
                    int n5 = this.getInteger(16652);
                    switch (n5) {
                        case 0: {
                            this.fireDiscreteEvent(null, null, -395997879);
                            break block0;
                        }
                        case 1: 
                        case 2: 
                        case 3: {
                            this.fireDiscreteEvent(null, null, -379220663);
                            break block0;
                        }
                    }
                    break;
                }
                if (n == 27660) {
                    this.fireCommonEvent(null, null, -1268478647);
                    break;
                }
                if (n != 26124) break;
                this.fireCommonEvent(null, null, 426282313);
                break;
            }
            case 13: {
                if (n != 0xDD90000) break;
                int n6 = this.getInteger(0xDD90000);
                switch (n6) {
                    case 1: {
                        this.fireDiscreteEvent(null, null, -1536914103);
                        break block0;
                    }
                    case 2: {
                        this.fireDiscreteEvent(null, null, -1553691319);
                        break block0;
                    }
                    case 3: {
                        this.fireDiscreteEvent(null, null, -1520136887);
                        break block0;
                    }
                }
                break;
            }
            case 14: {
                if (n == 19214) {
                    this.fireCommonEvent(null, null, -232637952);
                    break;
                }
                if (n == 31502) {
                    this.fireCommonEvent(null, null, 1734380873);
                    break;
                }
                if (n != 0xEED0000) break;
                this.fireCommonEvent(null, null, -60453559);
                break;
            }
            case 15: {
                int n7;
                if (n != 260964352 || (n7 = this.getInteger(260964352)) != 1) break;
                this.fireDiscreteEvent(null, null, 1264946505);
                break;
            }
            case 17: {
                if (n == 295174144) {
                    this.fireCommonEvent(null, null, -1923576503);
                    break;
                }
                if (n == 296550400) {
                    this.fireCommonEvent(null, null, 527011145);
                    break;
                }
                if (n != 0x11AA0000) break;
                this.fireCommonEvent(null, null, 1550159177);
                break;
            }
            case 23: {
                if (n != 400556032) break;
                int n8 = this.getInteger(400556032);
                switch (n8) {
                    case 0: {
                        this.fireDiscreteEvent(null, null, -714633911);
                        break block0;
                    }
                    case 1: {
                        this.fireDiscreteEvent(null, null, -697856695);
                        break block0;
                    }
                }
                break;
            }
            case 27: {
                if (n != 454820096) break;
                this.fireCommonEvent(null, null, -1033401015);
                break;
            }
            case 28: {
                if (n == 471924992) {
                    int n9 = this.getInteger(471924992);
                    switch (n9) {
                        case 0: 
                        case 2: {
                            this.fireDiscreteEvent(null, null, 543526217);
                            break block0;
                        }
                        case 1: {
                            this.fireDiscreteEvent(null, null, 593857865);
                            break block0;
                        }
                    }
                    break;
                }
                if (n != 16412) break;
                this.fireCommonEvent(null, null, 1980249088);
                break;
            }
            case 29: {
                if (n != 16413) break;
                this.fireCommonEvent(null, null, 172);
                break;
            }
            case 30: {
                boolean bl;
                if (n != 22302 || !(bl = this.getBoolean(22302))) break;
                this.fireDiscreteEvent(null, null, 1399164233);
                break;
            }
            case 31: {
                if (n == 27679) {
                    int n10 = this.getInteger(27679);
                    switch (n10) {
                        case 2: {
                            this.fireDiscreteEvent(null, null, -899379895);
                            break block0;
                        }
                        case 3: {
                            this.fireDiscreteEvent(null, null, -882602679);
                            break block0;
                        }
                        case 4: {
                            this.fireDiscreteEvent(null, null, -849048247);
                            break block0;
                        }
                        case 5: {
                            this.fireDiscreteEvent(null, null, -932934327);
                            break block0;
                        }
                        case 6: {
                            this.fireDiscreteEvent(null, null, -865825463);
                            break block0;
                        }
                        case 7: {
                            this.fireDiscreteEvent(null, null, -916157111);
                            break block0;
                        }
                    }
                    break;
                }
                if (n != 23839) break;
                boolean bl = this.getBoolean(23839);
                if (bl) {
                    this.fireDiscreteEvent(null, null, -748122807);
                    break;
                }
                this.fireDiscreteEvent(null, null, -731345591);
                break;
            }
            case 32: {
                if (n == 0x20A00000) {
                    this.fireCommonEvent(null, null, -848851639);
                    break;
                }
                if (n == 23328) {
                    this.fireCommonEvent(null, null, -362246839);
                    break;
                }
                if (n != 25376) break;
                this.fireCommonEvent(null, null, 292064585);
                break;
            }
            case 34: {
                if (n != 13858) break;
                int n11 = this.getInteger(13858);
                switch (n11) {
                    case 0: {
                        this.fireDiscreteEvent(null, null, -1301967543);
                        break block0;
                    }
                    case 1: {
                        this.fireDiscreteEvent(null, null, -1553625783);
                        break block0;
                    }
                    case 2: {
                        this.fireDiscreteEvent(null, null, -1452962487);
                        break block0;
                    }
                    case 3: {
                        this.fireDiscreteEvent(null, null, -1436185271);
                        break block0;
                    }
                    case 4: {
                        this.fireDiscreteEvent(null, null, -1536848567);
                        break block0;
                    }
                    case 5: {
                        this.fireDiscreteEvent(null, null, -1419408055);
                        break block0;
                    }
                    case 6: {
                        this.fireDiscreteEvent(null, null, -1520071351);
                        break block0;
                    }
                    case 7: {
                        this.fireDiscreteEvent(null, null, -1486516919);
                        break block0;
                    }
                    case 8: {
                        this.fireDiscreteEvent(null, null, -1469739703);
                        break block0;
                    }
                    case 9: {
                        this.fireDiscreteEvent(null, null, -1503294135);
                        break block0;
                    }
                    case 10: {
                        this.fireDiscreteEvent(null, null, -1385853623);
                        break block0;
                    }
                    case 11: {
                        this.fireDiscreteEvent(null, null, -1402630839);
                        break block0;
                    }
                    case 12: {
                        this.fireDiscreteEvent(null, null, -1369076407);
                        break block0;
                    }
                    case 13: {
                        this.fireDiscreteEvent(null, null, -1352299191);
                        break block0;
                    }
                    case 14: {
                        this.fireDiscreteEvent(null, null, -1335521975);
                        break block0;
                    }
                    case 15: {
                        this.fireDiscreteEvent(null, null, -1318744759);
                        break block0;
                    }
                    case 101: {
                        this.fireDiscreteEvent(null, null, -1805284023);
                        break block0;
                    }
                    case 102: {
                        this.fireDiscreteEvent(null, null, -1704620727);
                        break block0;
                    }
                    case 103: {
                        this.fireDiscreteEvent(null, null, -1687843511);
                        break block0;
                    }
                    case 104: {
                        this.fireDiscreteEvent(null, null, -1788506807);
                        break block0;
                    }
                    case 105: {
                        this.fireDiscreteEvent(null, null, -1671066295);
                        break block0;
                    }
                    case 106: {
                        this.fireDiscreteEvent(null, null, -1771729591);
                        break block0;
                    }
                    case 107: {
                        this.fireDiscreteEvent(null, null, -1738175159);
                        break block0;
                    }
                    case 108: {
                        this.fireDiscreteEvent(null, null, -1721397943);
                        break block0;
                    }
                    case 109: {
                        this.fireDiscreteEvent(null, null, -1754952375);
                        break block0;
                    }
                    case 110: {
                        this.fireDiscreteEvent(null, null, -1637511863);
                        break block0;
                    }
                    case 111: {
                        this.fireDiscreteEvent(null, null, -1654289079);
                        break block0;
                    }
                    case 112: {
                        this.fireDiscreteEvent(null, null, -1620734647);
                        break block0;
                    }
                    case 113: {
                        this.fireDiscreteEvent(null, null, -1603957431);
                        break block0;
                    }
                    case 114: {
                        this.fireDiscreteEvent(null, null, -1587180215);
                        break block0;
                    }
                    case 115: {
                        this.fireDiscreteEvent(null, null, -1570402999);
                        break block0;
                    }
                }
                break;
            }
            case 36: {
                if (n != 27172) break;
                int n12 = this.getInteger(27172);
                switch (n12) {
                    case 2: {
                        this.fireDiscreteEvent(null, null, -1402696375);
                        break block0;
                    }
                    case 3: {
                        this.fireDiscreteEvent(null, null, -1385919159);
                        break block0;
                    }
                    case 4: {
                        this.fireDiscreteEvent(null, null, -1352364727);
                        break block0;
                    }
                    case 7: {
                        this.fireDiscreteEvent(null, null, -1436250807);
                        break block0;
                    }
                    case 8: {
                        this.fireDiscreteEvent(null, null, -1369141943);
                        break block0;
                    }
                    case 9: {
                        this.fireDiscreteEvent(null, null, -1419473591);
                        break block0;
                    }
                }
                break;
            }
            case 37: {
                if (n != 621150464) break;
                this.fireCommonEvent(null, null, 543788361);
                break;
            }
            case 38: {
                if (n != 649723904) break;
                int n13 = this.getInteger(649723904);
                switch (n13) {
                    case 2: {
                        this.fireDiscreteEvent(null, null, -1100706487);
                        break block0;
                    }
                    case 3: {
                        this.fireDiscreteEvent(null, null, -1083929271);
                        break block0;
                    }
                    case 4: {
                        this.fireDiscreteEvent(null, null, -1067152055);
                        break block0;
                    }
                    case 5: {
                        this.fireDiscreteEvent(null, null, -1050374839);
                        break block0;
                    }
                    case 6: {
                        this.fireDiscreteEvent(null, null, -1117483703);
                        break block0;
                    }
                }
                break;
            }
            case 39: {
                if (n != 667287552) break;
                this.fireCommonEvent(null, null, -983069367);
                break;
            }
            case 41: {
                boolean bl;
                if (n != 688455936 || !(bl = this.getBoolean(688455936))) break;
                this.fireDiscreteEvent(null, null, 124292425);
                break;
            }
            case 42: {
                if (n != 718929920) break;
                this.fireCommonEvent(null, null, -228225719);
                break;
            }
            case 43: {
                int n14;
                if (n == 723124480) {
                    int n15 = this.getInteger(723124480);
                    switch (n15) {
                        case 1: {
                            this.fireDiscreteEvent(null, null, 291867977);
                            break block0;
                        }
                        case 2: {
                            this.fireDiscreteEvent(null, null, 275090761);
                            break block0;
                        }
                        case 3: {
                            this.fireDiscreteEvent(null, null, 174427465);
                            break block0;
                        }
                        case 4: {
                            this.fireDiscreteEvent(null, null, 258313545);
                            break block0;
                        }
                        case 5: {
                            this.fireDiscreteEvent(null, null, 191204681);
                            break block0;
                        }
                        case 6: {
                            this.fireDiscreteEvent(null, null, 207981897);
                            break block0;
                        }
                        case 7: {
                            this.fireDiscreteEvent(null, null, 224759113);
                            break block0;
                        }
                        case 8: {
                            this.fireDiscreteEvent(null, null, 241536329);
                            break block0;
                        }
                    }
                    break;
                }
                if (n != 736100352 || (n14 = this.getInteger(736100352)) != 1) break;
                this.fireDiscreteEvent(null, null, -177762999);
                break;
            }
            case 44: {
                if (n != 25900) break;
                int n16 = this.getInteger(25900);
                switch (n16) {
                    case 0: {
                        this.fireDiscreteEvent(null, null, -563638967);
                        break block0;
                    }
                    case 1: {
                        this.fireDiscreteEvent(null, null, -546861751);
                        break block0;
                    }
                }
                break;
            }
            case 45: {
                if (n != 13869) break;
                this.fireCommonEvent(null, null, -915960503);
                break;
            }
            case 46: {
                if (n != 32558) break;
                int n17 = this.getInteger(32558);
                switch (n17) {
                    case 1: 
                    case 2: 
                    case 3: {
                        this.fireDiscreteEvent(null, null, -412775095);
                        break block0;
                    }
                }
                break;
            }
            case 47: {
                int n18;
                if (n != 788529408 || (n18 = this.getInteger(788529408)) != 1) break;
                this.fireDiscreteEvent(null, null, 1013288265);
                break;
            }
            case 49: {
                if (n == 823263488) {
                    this.fireCommonEvent(null, null, -546992823);
                    break;
                }
                if (n != 822214912) break;
                this.fireCommonEvent(null, null, 1818332489);
                break;
            }
            case 50: {
                if (n != 27698) break;
                this.fireCommonEvent(null, null, -412644023);
                break;
            }
            case 51: {
                if (n == 868876288) {
                    int n19 = this.getInteger(868876288);
                    switch (n19) {
                        case 2: {
                            this.fireDiscreteEvent(null, null, -463434423);
                            break block0;
                        }
                        case 3: {
                            this.fireDiscreteEvent(null, null, -480211639);
                            break block0;
                        }
                    }
                    break;
                }
                if (n != 16179) break;
                this.fireCommonEvent(null, null, -1855615671);
                break;
            }
            case 52: {
                if (n != 10548) break;
                this.fireCommonEvent(null, null, -1100444343);
                break;
            }
            case 53: {
                if (n != 904658944) break;
                this.fireCommonEvent(null, null, -379024055);
                break;
            }
            case 56: {
                if (n != 27192) break;
                int n20 = this.getInteger(27192);
                switch (n20) {
                    case 3: {
                        this.fireDiscreteEvent(null, null, -1285255863);
                        break block0;
                    }
                    case 4: {
                        this.fireDiscreteEvent(null, null, -1302033079);
                        break block0;
                    }
                    case 5: {
                        this.fireDiscreteEvent(null, null, -1318810295);
                        break block0;
                    }
                }
                break;
            }
            case 57: {
                if (n == 17465) {
                    boolean bl = this.getBoolean(17465);
                    if (bl) {
                        this.fireDiscreteEvent(null, null, 99618816);
                        break;
                    }
                    this.fireDiscreteEvent(null, null, 116396032);
                    break;
                }
                if (n != 969015296) break;
                this.fireCommonEvent(null, null, 275287369);
                break;
            }
            case 58: {
                if (n != 974782720) break;
                this.fireCommonEvent(null, null, -429421239);
                break;
            }
            case 59: {
                if (n == 20027) {
                    this.fireCommonEvent(null, null, 1835044169);
                    break;
                }
                if (n != 998965248) break;
                this.fireCommonEvent(null, null, -1889170103);
                break;
            }
            case 60: {
                int n21;
                if (n != 1023279104 || (n21 = this.getInteger(1023279104)) != 0) break;
                this.fireDiscreteEvent(null, null, 1650101577);
                break;
            }
            case 62: {
                if (n != 1052835840) break;
                int n22 = this.getInteger(1052835840);
                switch (n22) {
                    case 0: {
                        this.fireDiscreteEvent(null, null, -647525047);
                        break block0;
                    }
                    case 1: {
                        this.fireDiscreteEvent(null, null, -613970615);
                        break block0;
                    }
                    case 2: {
                        this.fireDiscreteEvent(null, null, -630747831);
                        break block0;
                    }
                    case 3: {
                        this.fireDiscreteEvent(null, null, -664302263);
                        break block0;
                    }
                    case 4: {
                        this.fireDiscreteEvent(null, null, -681079479);
                        break block0;
                    }
                }
                break;
            }
            case 65: {
                if (n != 1106116608) break;
                boolean bl = this.getBoolean(1106116608);
                if (bl) {
                    this.fireDiscreteEvent(null, null, -681210551);
                    break;
                }
                this.fireDiscreteEvent(null, null, -697987767);
                break;
            }
            case 68: {
                if (n == 32068) {
                    this.fireCommonEvent(null, null, 90541385);
                    break;
                }
                if (n != 20548) break;
                this.fireCommonEvent(null, null, -1184330423);
                break;
            }
            case 70: {
                if (n != 12614) break;
                boolean bl = this.getBoolean(12614);
                if (bl) {
                    this.fireDiscreteEvent(null, null, -597127863);
                    break;
                }
                this.fireDiscreteEvent(null, null, -580350647);
                break;
            }
            case 71: {
                if (n != 1199833088) break;
                int n23 = this.getInteger(1199833088);
                switch (n23) {
                    case 0: {
                        this.fireDiscreteEvent(null, null, -597193399);
                        break block0;
                    }
                    case 1: {
                        this.fireDiscreteEvent(null, null, -580416183);
                        break block0;
                    }
                }
                break;
            }
            case 72: {
                if (n != 32584) break;
                this.fireCommonEvent(null, null, 57118025);
                break;
            }
            case 73: {
                if (n == 23881) {
                    this.fireCommonEvent(null, null, -463041207);
                    break;
                }
                if (n != 12361) break;
                this.fireCommonEvent(null, null, 444);
                break;
            }
            case 74: {
                if (n != 13642) break;
                this.fireCommonEvent(null, null, 1868598601);
                break;
            }
            case 75: {
                if (n != 1267400704) break;
                this.fireCommonEvent(null, null, -748319415);
                break;
            }
            case 77: {
                if (n != 1306787840) break;
                this.fireCommonEvent(null, null, -865628855);
                break;
            }
            case 79: {
                int n24;
                if (n != 1326907648 || (n24 = this.getInteger(1326907648)) != 0) break;
                this.fireDiscreteEvent(null, null, -1620800183);
                break;
            }
            case 81: {
                if (n != 1374879744) break;
                this.fireCommonEvent(null, null, -1604350647);
                break;
            }
            case 82: {
                if (n == 1388249088) {
                    this.fireCommonEvent(null, null, -932737719);
                    break;
                }
                if (n != 1391788032) break;
                boolean bl = this.getBoolean(1391788032);
                if (bl) {
                    this.fireDiscreteEvent(null, null, 1952484681);
                    break;
                }
                this.fireDiscreteEvent(null, null, 1969261897);
                break;
            }
            case 84: {
                if (n != 25684) break;
                this.fireCommonEvent(null, null, -211448503);
                break;
            }
            case 85: {
                if (n == 20821) {
                    this.fireCommonEvent(null, null, -731607735);
                    break;
                }
                if (n != 0x55A50000) break;
                this.fireCommonEvent(null, null, 451);
                break;
            }
            case 86: {
                if (n != 1453195264) break;
                boolean bl = this.getBoolean(1453195264);
                if (bl) {
                    this.fireDiscreteEvent(null, null, -345535159);
                    break;
                }
                this.fireDiscreteEvent(null, null, -328757943);
                break;
            }
            case 87: {
                if (n == 20567) {
                    boolean bl = this.getBoolean(20567);
                    if (!bl) break;
                    this.fireDiscreteEvent(null, null, 1298500937);
                    break;
                }
                if (n != 24151) break;
                int n25 = this.getInteger(24151);
                switch (n25) {
                    case 2: {
                        this.fireDiscreteEvent(null, null, 1231392073);
                        break block0;
                    }
                    case 4: {
                        this.fireDiscreteEvent(null, null, 1214614857);
                        break block0;
                    }
                }
                break;
            }
            case 88: {
                if (n == 1476919552) {
                    this.fireCommonEvent(null, null, -714830519);
                    break;
                }
                if (n == 1478164736) {
                    int n26 = this.getInteger(1478164736);
                    switch (n26) {
                        case 0: {
                            this.fireDiscreteEvent(null, null, 728075593);
                            break block0;
                        }
                        case 1: {
                            this.fireDiscreteEvent(null, null, 711298377);
                            break block0;
                        }
                        case 2: {
                            this.fireDiscreteEvent(null, null, 694521161);
                            break block0;
                        }
                        case 3: {
                            this.fireDiscreteEvent(null, null, 744852809);
                            break block0;
                        }
                    }
                    break;
                }
                if (n != 27480) break;
                this.fireCommonEvent(null, null, 174624073);
                break;
            }
            case 89: {
                int n27;
                if (n == 32345) {
                    this.fireCommonEvent(null, null, -1202156215);
                    break;
                }
                if (n == 0x59990000) {
                    this.fireCommonEvent(null, null, 979406153);
                    break;
                }
                if (n != 16473 || (n27 = this.getInteger(16473)) != 1) break;
                this.fireDiscreteEvent(null, null, 861965641);
                break;
            }
            case 91: {
                if (n != 1527709952) break;
                boolean bl = this.getBoolean(1527709952);
                if (bl) {
                    this.fireDiscreteEvent(null, null, -614101687);
                    break;
                }
                this.fireDiscreteEvent(null, null, -597324471);
                break;
            }
            case 94: {
                if (n == 1587216384) {
                    this.fireCommonEvent(null, null, -815297207);
                    break;
                }
                if (n != 1591083008) break;
                this.fireCommonEvent(null, null, 442);
                break;
            }
            case 97: {
                if (n != 1641349120) break;
                this.fireCommonEvent(null, null, -1184527031);
                break;
            }
            case 98: {
                if (n == 29538) {
                    this.fireCommonEvent(null, null, -1604022967);
                    break;
                }
                if (n == 1646592256) {
                    boolean bl = this.getBoolean(1646592256);
                    if (bl) break;
                    this.fireDiscreteEvent(null, null, -228291255);
                    break;
                }
                if (n != 30050) break;
                int n28 = this.getInteger(30050);
                switch (n28) {
                    case 0: {
                        this.fireDiscreteEvent(null, null, -916419255);
                        break block0;
                    }
                    case 1: {
                        this.fireDiscreteEvent(null, null, -899642039);
                        break block0;
                    }
                }
                break;
            }
            case 99: {
                if (n != 18531) break;
                this.fireCommonEvent(null, null, -949711543);
                break;
            }
            case 103: {
                boolean bl;
                if (n != 16743 || !(bl = this.getBoolean(16743))) break;
                this.fireDiscreteEvent(null, null, 1382387017);
                break;
            }
            case 106: {
                if (n != 14442) break;
                int n29 = this.getInteger(14442);
                switch (n29) {
                    case 0: 
                    case 1: {
                        this.fireDiscreteEvent(null, null, 10020);
                        break block0;
                    }
                }
                break;
            }
            case 108: {
                if (n == 1814036736) {
                    this.fireCommonEvent(null, null, -1537700535);
                    break;
                }
                if (n != 1812136192) break;
                this.fireCommonEvent(null, null, -932868791);
                break;
            }
            case 110: {
                if (n != 1855848448) break;
                this.fireCommonEvent(null, null, -697922231);
                break;
            }
            case 112: {
                if (n != 1881014528) break;
                int n30 = this.getInteger(1881014528);
                switch (n30) {
                    case 0: {
                        this.fireDiscreteEvent(null, null, -1167553207);
                        break block0;
                    }
                    case 1: {
                        this.fireDiscreteEvent(null, null, -1133998775);
                        break block0;
                    }
                    case 2: {
                        this.fireDiscreteEvent(null, null, -1150775991);
                        break block0;
                    }
                }
                break;
            }
            case 114: {
                boolean bl;
                if (n != 1924661248 || (bl = this.getBoolean(1924661248))) break;
                this.fireDiscreteEvent(null, null, 1801555273);
                break;
            }
            case 115: {
                if (n != 29299) break;
                this.fireCommonEvent(null, null, -311980727);
                break;
            }
            case 117: {
                if (n != 1978859520) break;
                this.fireCommonEvent(null, null, -161182391);
                break;
            }
            case 118: {
                if (n != 1991049216) break;
                this.fireCommonEvent(null, null, -312046263);
                break;
            }
            case 119: {
                if (n == 0x77B00000) {
                    this.fireCommonEvent(null, null, 1281723721);
                    break;
                }
                if (n != 2008678400) break;
                int n31 = this.getInteger(2008678400);
                switch (n31) {
                    case 0: {
                        this.fireDiscreteEvent(null, null, 224955721);
                        break block0;
                    }
                    case 1: {
                        this.fireDiscreteEvent(null, null, 208178505);
                        break block0;
                    }
                }
                break;
            }
            case 120: {
                if (n != 2023948288) break;
                int n32 = this.getInteger(2023948288);
                switch (n32) {
                    case 2: {
                        this.fireDiscreteEvent(null, null, -1234924215);
                        break block0;
                    }
                    case 4: {
                        this.fireDiscreteEvent(null, null, -1251701431);
                        break block0;
                    }
                }
                break;
            }
            case 122: {
                if (n != 2058420224) break;
                this.fireCommonEvent(null, null, -278557367);
                break;
            }
            case 123: {
                if (n != 2077884416) break;
                this.fireCommonEvent(null, null, -999781047);
                break;
            }
            case 125: {
                if (n == 23421) {
                    this.fireCommonEvent(null, null, -1286042295);
                    break;
                }
                if (n == 2105606144) {
                    int n33 = this.getInteger(2105606144);
                    switch (n33) {
                        case 0: {
                            this.fireDiscreteEvent(null, null, -983265975);
                            break block0;
                        }
                        case 1: 
                        case 4: {
                            this.fireDiscreteEvent(null, null, -966488759);
                            break block0;
                        }
                        case 2: 
                        case 3: 
                        case 7: {
                            this.fireDiscreteEvent(null, null, -1016820407);
                            break block0;
                        }
                        case 5: {
                            this.fireDiscreteEvent(null, null, -1000043191);
                            break block0;
                        }
                    }
                    break;
                }
                if (n != 22653) break;
                this.fireCommonEvent(null, null, -479752887);
                break;
            }
            case 127: {
                if (n == 2143879168) {
                    this.fireCommonEvent(null, null, -462975671);
                    break;
                }
                if (n == 19327) {
                    int n34 = this.getInteger(19327);
                    switch (n34) {
                        case 0: {
                            this.fireDiscreteEvent(null, null, 91);
                            break block0;
                        }
                        case 1: {
                            this.fireDiscreteEvent(null, null, 90);
                            break block0;
                        }
                        case 2: {
                            this.fireDiscreteEvent(null, null, 92);
                            break block0;
                        }
                    }
                    break;
                }
                if (n == 2132345088) {
                    this.fireCommonEvent(null, null, -1905947319);
                    break;
                }
                if (n == 2140733440) {
                    this.fireCommonEvent(null, null, -362443447);
                    break;
                }
                if (n != 18303) break;
                this.fireCommonEvent(null, null, -1016558263);
                break;
            }
            case 131: {
                if (n == -2084372480) {
                    this.fireCommonEvent(null, null, -1453028023);
                    break;
                }
                if (n != -2087911424) break;
                this.fireCommonEvent(null, null, 446);
                break;
            }
            case 132: {
                if (n == -2070216704) {
                    this.fireCommonEvent(null, null, -1469805239);
                    break;
                }
                if (n != -2069102592) break;
                int n35 = this.getInteger(-2069102592);
                switch (n35) {
                    case 0: {
                        this.fireDiscreteEvent(null, null, -530084535);
                        break block0;
                    }
                    case 1: {
                        this.fireDiscreteEvent(null, null, -513307319);
                        break block0;
                    }
                }
                break;
            }
            case 133: {
                if (n != -2054488064) break;
                int n36 = this.getInteger(-2054488064);
                switch (n36) {
                    case 0: {
                        this.fireDiscreteEvent(null, null, -295334583);
                        break block0;
                    }
                    case 1: {
                        this.fireDiscreteEvent(null, null, -312111799);
                        break block0;
                    }
                }
                break;
            }
            case 137: {
                if (n == 11657) {
                    this.fireCommonEvent(null, null, -211514039);
                    break;
                }
                if (n != -1995767552) break;
                this.fireCommonEvent(null, null, -429552311);
                break;
            }
            case 145: {
                if (n != -1860566784) break;
                this.fireCommonEvent(null, null, -1134260919);
                break;
            }
            case 146: {
                if (n == 22674) {
                    this.fireCommonEvent(null, null, 1818266953);
                    break;
                }
                if (n != 14738) break;
                this.fireCommonEvent(null, null, 1885375817);
                break;
            }
            case 149: {
                if (n != -1785921536) break;
                this.fireCommonEvent(null, null, -446329527);
                break;
            }
            case 150: {
                if (n != -1776418560) break;
                boolean bl = this.getBoolean(-1776418560);
                if (bl) {
                    this.fireDiscreteEvent(null, null, -326953728);
                    break;
                }
                this.fireDiscreteEvent(null, null, -310176512);
                break;
            }
            case 151: {
                if (n != -1761541888) break;
                int n37 = this.getInteger(-1761541888);
                switch (n37) {
                    case 0: {
                        this.fireDiscreteEvent(null, null, -882537143);
                        break block0;
                    }
                    case 1: {
                        this.fireDiscreteEvent(null, null, -647656119);
                        break block0;
                    }
                    case 2: {
                        this.fireDiscreteEvent(null, null, -580547255);
                        break block0;
                    }
                    case 3: {
                        this.fireDiscreteEvent(null, null, -630878903);
                        break block0;
                    }
                    case 4: {
                        this.fireDiscreteEvent(null, null, -563770039);
                        break block0;
                    }
                }
                break;
            }
            case 152: {
                if (n != 30104) break;
                this.fireCommonEvent(null, null, 141069641);
                break;
            }
            case 153: {
                if (n != -1713700864) break;
                this.fireCommonEvent(null, null, -278491831);
                break;
            }
            case 154: {
                boolean bl;
                if (n != 17562 || (bl = this.getBoolean(17562))) break;
                this.fireDiscreteEvent(null, null, -882864823);
                break;
            }
            case 157: {
                if (n == 30109) {
                    int n38 = this.getInteger(30109);
                    switch (n38) {
                        case 2: {
                            this.fireDiscreteEvent(null, null, 677743945);
                            break block0;
                        }
                        case 3: {
                            this.fireDiscreteEvent(null, null, 660966729);
                            break block0;
                        }
                        case 4: {
                            this.fireDiscreteEvent(null, null, 627412297);
                            break block0;
                        }
                        case 6: {
                            this.fireDiscreteEvent(null, null, 644189513);
                            break block0;
                        }
                    }
                    break;
                }
                if (n == -1647837184) {
                    boolean bl = this.getBoolean(-1647837184);
                    if (!bl) break;
                    this.fireDiscreteEvent(null, null, -714764983);
                    break;
                }
                if (n != 21917) break;
                this.fireCommonEvent(null, null, -647459511);
                break;
            }
            case 158: {
                boolean bl;
                if (n != 12190 || !(bl = this.getBoolean(12190))) break;
                this.fireDiscreteEvent(null, null, 493194569);
                break;
            }
            case 159: {
                if (n != -1625620224) break;
                int n39 = this.getInteger(-1625620224);
                switch (n39) {
                    case 0: 
                    case 1: {
                        this.fireDiscreteEvent(null, null, 1918995785);
                        break block0;
                    }
                }
                break;
            }
            case 160: {
                if (n != -1595998208) break;
                this.fireCommonEvent(null, null, -1050178231);
                break;
            }
            case 166: {
                int n40;
                if (n == -1497104384) {
                    this.fireCommonEvent(null, null, -832074423);
                    break;
                }
                if (n != -1508310784 || (n40 = this.getInteger(-1508310784)) != 4) break;
                this.fireDiscreteEvent(null, null, 509971785);
                break;
            }
            case 168: {
                if (n != -1466302464) break;
                this.fireCommonEvent(null, null, -446198455);
                break;
            }
            case 169: {
                if (n != 10665) break;
                int n41 = this.getInteger(10665);
                switch (n41) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: {
                        this.fireDiscreteEvent(null, null, -181577216);
                        break block0;
                    }
                }
                break;
            }
            case 170: {
                if (n != -1432944640) break;
                this.fireCommonEvent(null, null, 157650249);
                break;
            }
            case 174: {
                if (n != -1362362368) break;
                this.fireCommonEvent(null, null, 191401289);
                break;
            }
            case 177: {
                if (n == -1313538048) {
                    this.fireCommonEvent(null, null, 1851821385);
                    break;
                }
                if (n != 20401) break;
                this.fireCommonEvent(null, null, -1201304247);
                break;
            }
            case 181: {
                if (n != -1242759168) break;
                this.fireCommonEvent(null, null, -882406071);
                break;
            }
            case 182: {
                if (n == -1225981952) {
                    this.fireCommonEvent(null, null, -999846583);
                    break;
                }
                if (n == 14262) {
                    int n42 = this.getInteger(14262);
                    if (n42 != 1) break;
                    this.fireDiscreteEvent(null, null, 476417353);
                    break;
                }
                if (n != 11190) break;
                this.fireCommonEvent(null, null, -1167749815);
                break;
            }
            case 183: {
                if (n != -1212219392) break;
                int n43 = this.getInteger(-1212219392);
                switch (n43) {
                    case 1: {
                        this.fireDiscreteEvent(null, null, -144274103);
                        break block0;
                    }
                    case 2: {
                        this.fireDiscreteEvent(null, null, -60388023);
                        break block0;
                    }
                    case 3: {
                        this.fireDiscreteEvent(null, null, -110719671);
                        break block0;
                    }
                    case 4: {
                        this.fireDiscreteEvent(null, null, -93942455);
                        break block0;
                    }
                    case 5: {
                        this.fireDiscreteEvent(null, null, -77165239);
                        break block0;
                    }
                    case 6: {
                        this.fireDiscreteEvent(null, null, -43610807);
                        break block0;
                    }
                    case 7: {
                        this.fireDiscreteEvent(null, null, -127496887);
                        break block0;
                    }
                }
                break;
            }
            case 184: {
                if (n == -1194852352) {
                    int n44 = this.getInteger(-1194852352);
                    switch (n44) {
                        case 2: {
                            this.fireDiscreteEvent(null, null, -429617847);
                            break block0;
                        }
                        case 3: {
                            this.fireDiscreteEvent(null, null, -412840631);
                            break block0;
                        }
                        case 4: {
                            this.fireDiscreteEvent(null, null, -362508983);
                            break block0;
                        }
                        case 5: {
                            this.fireDiscreteEvent(null, null, -463172279);
                            break block0;
                        }
                        case 6: {
                            this.fireDiscreteEvent(null, null, -396063415);
                            break block0;
                        }
                        case 7: {
                            this.fireDiscreteEvent(null, null, -446395063);
                            break block0;
                        }
                        case 8: {
                            this.fireDiscreteEvent(null, null, -379286199);
                            break block0;
                        }
                    }
                    break;
                }
                if (n != 30904) break;
                this.fireCommonEvent(null, null, -395866807);
                break;
            }
            case 185: {
                if (n == -1178075136) {
                    int n45 = this.getInteger(-1178075136);
                    switch (n45) {
                        case 2: {
                            this.fireDiscreteEvent(null, null, -547058359);
                            break block0;
                        }
                        case 3: {
                            this.fireDiscreteEvent(null, null, -530281143);
                            break block0;
                        }
                        case 4: {
                            this.fireDiscreteEvent(null, null, -479949495);
                            break block0;
                        }
                        case 5: {
                            this.fireDiscreteEvent(null, null, -580612791);
                            break block0;
                        }
                        case 6: {
                            this.fireDiscreteEvent(null, null, -513503927);
                            break block0;
                        }
                        case 7: {
                            this.fireDiscreteEvent(null, null, -563835575);
                            break block0;
                        }
                        case 8: {
                            this.fireDiscreteEvent(null, null, -496726711);
                            break block0;
                        }
                    }
                    break;
                }
                if (n == -1175977984) {
                    this.fireCommonEvent(null, null, -362312375);
                    break;
                }
                if (n != 21945) break;
                int n46 = this.getInteger(21945);
                switch (n46) {
                    case 0: {
                        this.fireDiscreteEvent(null, null, 107515209);
                        break block0;
                    }
                    case 1: {
                        this.fireDiscreteEvent(null, null, 90737993);
                        break block0;
                    }
                    case 2: 
                    case 3: {
                        this.fireDiscreteEvent(null, null, -278426295);
                        break block0;
                    }
                }
                break;
            }
            case 186: {
                if (n != -1163591680) break;
                this.fireCommonEvent(null, null, 996183369);
                break;
            }
            case 187: {
                if (n != 25787) break;
                int n47 = this.getInteger(25787);
                switch (n47) {
                    case 2: {
                        this.fireDiscreteEvent(null, null, -312177335);
                        break block0;
                    }
                    case 3: {
                        this.fireDiscreteEvent(null, null, -295400119);
                        break block0;
                    }
                    case 4: {
                        this.fireDiscreteEvent(null, null, -245068471);
                        break block0;
                    }
                    case 5: {
                        this.fireDiscreteEvent(null, null, -345731767);
                        break block0;
                    }
                    case 6: {
                        this.fireDiscreteEvent(null, null, -278622903);
                        break block0;
                    }
                    case 7: {
                        this.fireDiscreteEvent(null, null, -328954551);
                        break block0;
                    }
                    case 8: {
                        this.fireDiscreteEvent(null, null, -261845687);
                        break block0;
                    }
                }
                break;
            }
            case 188: {
                if (n != -1127743488) break;
                int n48 = this.getInteger(-1127743488);
                switch (n48) {
                    case 2: {
                        this.fireDiscreteEvent(null, null, -664498871);
                        break block0;
                    }
                    case 3: {
                        this.fireDiscreteEvent(null, null, -647721655);
                        break block0;
                    }
                    case 4: {
                        this.fireDiscreteEvent(null, null, -597390007);
                        break block0;
                    }
                    case 5: {
                        this.fireDiscreteEvent(null, null, -698053303);
                        break block0;
                    }
                    case 6: {
                        this.fireDiscreteEvent(null, null, -630944439);
                        break block0;
                    }
                    case 7: {
                        this.fireDiscreteEvent(null, null, -681276087);
                        break block0;
                    }
                    case 8: {
                        this.fireDiscreteEvent(null, null, -614167223);
                        break block0;
                    }
                }
                break;
            }
            case 189: {
                if (n != 28093) break;
                this.fireCommonEvent(null, null, -26833591);
                break;
            }
            case 190: {
                if (n != -1106050816) break;
                int n49 = this.getInteger(-1106050816);
                switch (n49) {
                    case 0: 
                    case 1: 
                    case 2: {
                        this.fireDiscreteEvent(null, null, -144667319);
                        break block0;
                    }
                }
                break;
            }
            case 191: {
                if (n != -1080360960) break;
                this.fireCommonEvent(null, null, -345600695);
                break;
            }
            case 197: {
                if (n == 24773) {
                    int n50 = this.getInteger(24773);
                    switch (n50) {
                        case 0: {
                            this.fireDiscreteEvent(null, null, 342199625);
                            break block0;
                        }
                        case 1: {
                            this.fireDiscreteEvent(null, null, 358976841);
                            break block0;
                        }
                        case 2: {
                            this.fireDiscreteEvent(null, null, 325422409);
                            break block0;
                        }
                        case 3: {
                            this.fireDiscreteEvent(null, null, 1516604745);
                            break block0;
                        }
                        case 4: {
                            this.fireDiscreteEvent(null, null, 1046842697);
                            break block0;
                        }
                        case 5: {
                            this.fireDiscreteEvent(null, null, 1449495881);
                            break block0;
                        }
                    }
                    break;
                }
                if (n != 14021) break;
                int n51 = this.getInteger(14021);
                switch (n51) {
                    case 0: {
                        this.fireDiscreteEvent(null, null, -899314359);
                        break block0;
                    }
                    case 1: 
                    case 2: 
                    case 3: {
                        this.fireDiscreteEvent(null, null, -798651063);
                        break block0;
                    }
                }
                break;
            }
            case 200: {
                if (n != -924057600) break;
                this.fireCommonEvent(null, null, -93876919);
                break;
            }
            case 201: {
                if (n == 18377) {
                    this.fireCommonEvent(null, null, -832205495);
                    break;
                }
                if (n != -922615552) break;
                this.fireCommonEvent(null, null, 1902153033);
                break;
            }
            case 202: {
                if (n == -891551744) {
                    this.fireCommonEvent(null, null, -1066955447);
                    break;
                }
                if (n != -895221760) break;
                this.fireCommonEvent(null, null, -2124051127);
                break;
            }
            case 203: {
                if (n != 32459) break;
                this.fireCommonEvent(null, null, -194736823);
                break;
            }
            case 204: {
                if (n == -859242496) {
                    this.fireCommonEvent(null, null, -798519991);
                    break;
                }
                if (n == -872152832) {
                    this.fireCommonEvent(null, null, -127627959);
                    break;
                }
                if (n != 31180) break;
                this.fireCommonEvent(null, null, 241732937);
                break;
            }
            case 205: {
                if (n != -846462976) break;
                this.fireCommonEvent(null, null, 1684049225);
                break;
            }
            case 208: {
                if (n != 28112) break;
                this.fireCommonEvent(null, null, -144405175);
                break;
            }
            case 211: {
                boolean bl;
                if (n != -754188032 || !(bl = this.getBoolean(-754188032))) break;
                this.fireDiscreteEvent(null, null, 1248169289);
                break;
            }
            case 212: {
                if (n != 30932) break;
                this.fireCommonEvent(null, null, -10056375);
                break;
            }
            case 213: {
                if (n == -720830208) {
                    int n52 = this.getInteger(-720830208);
                    switch (n52) {
                        case 0: 
                        case 1: 
                        case 2: 
                        case 3: {
                            this.fireDiscreteEvent(null, null, -1503359671);
                            break block0;
                        }
                        case 4: {
                            this.fireDiscreteEvent(null, null, -1486582455);
                            break block0;
                        }
                    }
                    break;
                }
                if (n == -708182016) {
                    this.fireCommonEvent(null, null, -915894967);
                    break;
                }
                if (n != 26069) break;
                this.fireCommonEvent(null, null, 6786377);
                break;
            }
            case 216: {
                if (n != -659488768) break;
                int n53 = this.getInteger(-659488768);
                switch (n53) {
                    case 0: {
                        this.fireDiscreteEvent(null, null, -244871863);
                        break block0;
                    }
                    case 1: {
                        this.fireDiscreteEvent(null, null, -228094647);
                        break block0;
                    }
                    case 2: {
                        this.fireDiscreteEvent(null, null, -211317431);
                        break block0;
                    }
                    case 3: {
                        this.fireDiscreteEvent(null, null, -261649079);
                        break block0;
                    }
                    case 7: {
                        this.fireDiscreteEvent(null, null, -194540215);
                        break block0;
                    }
                }
                break;
            }
            case 218: {
                if (n != 29914) break;
                this.fireCommonEvent(null, null, -1570468535);
                break;
            }
            case 222: {
                if (n != -568459008) break;
                boolean bl = this.getBoolean(-568459008);
                if (bl) {
                    this.fireDiscreteEvent(null, null, -164800000);
                    break;
                }
                this.fireDiscreteEvent(null, null, -164800000);
                break;
            }
            case 223: {
                if (n != -545128448) break;
                this.fireCommonEvent(null, null, -1201173175);
                break;
            }
            case 225: {
                if (n == -519634688) {
                    this.fireCommonEvent(null, null, -496661175);
                    break;
                }
                if (n != -503840768) break;
                this.fireCommonEvent(null, null, -1234662071);
                break;
            }
            case 229: {
                if (n == 12005) {
                    int n54 = this.getInteger(12005);
                    switch (n54) {
                        case 2: {
                            this.fireDiscreteEvent(null, null, -798716599);
                            break block0;
                        }
                        case 3: {
                            this.fireDiscreteEvent(null, null, -781939383);
                            break block0;
                        }
                        case 4: {
                            this.fireDiscreteEvent(null, null, -748384951);
                            break block0;
                        }
                        case 5: {
                            this.fireDiscreteEvent(null, null, -832271031);
                            break block0;
                        }
                        case 6: {
                            this.fireDiscreteEvent(null, null, -765162167);
                            break block0;
                        }
                        case 7: {
                            this.fireDiscreteEvent(null, null, -815493815);
                            break block0;
                        }
                    }
                    break;
                }
                if (n == 25829) {
                    this.fireCommonEvent(null, null, -295269047);
                    break;
                }
                if (n != -444203008) break;
                this.fireCommonEvent(null, null, 140873033);
                break;
            }
            case 230: {
                if (n != 30950) break;
                this.fireCommonEvent(null, null, 124095817);
                break;
            }
            case 231: {
                if (n == -417070848) {
                    this.fireCommonEvent(null, null, 1784712521);
                    break;
                }
                if (n != 13543) break;
                this.fireCommonEvent(null, null, 157846857);
                break;
            }
            case 232: {
                if (n != -388825088) break;
                this.fireCommonEvent(null, null, -815428279);
                break;
            }
            case 233: {
                if (n == 32233) {
                    this.fireCommonEvent(null, null, -496530103);
                    break;
                }
                if (n != -374472704) break;
                int n55 = this.getInteger(-374472704);
                switch (n55) {
                    case 0: {
                        this.fireDiscreteEvent(null, null, 1483050313);
                        break block0;
                    }
                    case 1: {
                        this.fireDiscreteEvent(null, null, 1499827529);
                        break block0;
                    }
                }
                break;
            }
            case 234: {
                if (n != -359661568) break;
                this.fireCommonEvent(null, null, -1100509879);
                break;
            }
            case 236: {
                int n56;
                if (n != -333250304 || (n56 = this.getInteger(-333250304)) != 2) break;
                this.fireDiscreteEvent(null, null, 1197837641);
                break;
            }
            case 237: {
                if (n != 13805) break;
                this.fireCommonEvent(null, null, -328823479);
                break;
            }
            case 242: {
                if (n != 27122) break;
                this.fireCommonEvent(null, null, -177959607);
                break;
            }
            case 245: {
                if (n != 10997) break;
                int n57 = this.getInteger(10997);
                switch (n57) {
                    case 0: {
                        this.fireDiscreteEvent(null, null, 1164283209);
                        break block0;
                    }
                    case 1: {
                        this.fireDiscreteEvent(null, null, 526749001);
                        break block0;
                    }
                }
                break;
            }
            case 247: {
                if (n != -140640256) break;
                this.fireCommonEvent(null, null, -681145015);
                break;
            }
            case 249: {
                if (n == -107282432) {
                    this.fireCommonEvent(null, null, -1218081463);
                    break;
                }
                if (n == -116195072) {
                    this.fireCommonEvent(null, null, 1633324361);
                    break;
                }
                if (n != 22521) break;
                this.fireCommonEvent(null, null, 375754057);
                break;
            }
            case 251: {
                if (n != -67829760) break;
                this.fireCommonEvent(null, null, -966292151);
                break;
            }
            case 254: {
                if (n != -23068672) break;
                this.fireCommonEvent(null, null, 1767935305);
                break;
            }
            case 255: {
                int n58;
                if (n != -2818048 || (n58 = this.getInteger(-2818048)) != 1) break;
                this.fireDiscreteEvent(null, null, -1033597623);
                break;
            }
        }
    }

    private void fireCommonEvent(AppDefinition appDefinition, AppDefinition appDefinition2, int n) {
        ServiceManagerCommon.statemachineEventDispatcher.createAndSubmitDpChangedEvent(appDefinition, appDefinition2, n);
    }

    private void fireDiscreteEvent(AppDefinition appDefinition, AppDefinition appDefinition2, int n) {
        ServiceManagerCommon.statemachineEventDispatcher.createAndSubmitDpChangedEvent(appDefinition, appDefinition2, n);
    }
}

