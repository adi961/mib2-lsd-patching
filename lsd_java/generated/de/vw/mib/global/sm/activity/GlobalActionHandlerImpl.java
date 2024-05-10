/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.global.sm.activity;

import de.vw.mib.genericevents.EventGeneric;
import de.vw.mib.sm.internal.activity.GlobalActionHandler;
import generated.de.vw.mib.global.datapool.SkinDataPool;
import generated.de.vw.mib.global.sm.internal.activity.StatemachineHandlerBase;

public final class GlobalActionHandlerImpl
extends StatemachineHandlerBase
implements GlobalActionHandler {
    public static final int NO_ACTION_ID;
    public static final int GAC_CAR_SETUP_AMBIANCE_SETTINGS_SET_SLIDERTO_VISIBLE;
    public static final int GAC_MEDIA_SET_PROPERTIES_FOR_MEDIA_MINIPLAYERS;
    public static final int GAC_MEDIA_BROWSER_SET_ITEM_VISIBILITY_SET_PARENT_INDES_SETTINGS;
    public static final int GAC_NAV_ROUTE_CALC_RESET_PROGRESS_STATES_FOR_ALL_ROUTES;
    public static final int GAC_NAV_MAP_LAYOUT_SET_CONTENT_MAIN_MAP_OVERVIEW;
    public static final int GAC_NAV_MAP_LAYOUT_SET_CARSUR_POSITION;
    public static final int GAC_NAV_MAP_LAYOUT_CARSUR_POSITIONS_25D3DHEADING;
    public static final int GAC_NAV_MAP_LAYOUT_CARSUR_POSITIONS_2D_NORTH;
    public static final int GAC_NAV_MAP_LAYOUT_CARSUR_POSITIONS_2D_HEADING;
    public static final int GAC_NAV_MAP_LAYOUT_CONTENT_MAIN_MAP_OVERVIEW_NO_SS;
    public static final int GAC_NAV_MAP_LAYOUT_CONTENT_MAIN_MAP_OVERVIEW_SS;
    public static final int GAC_NAV_MAP_LAYOUT_CONTENT_MAIN_MAP_DEFAULT_NO_SS;
    public static final int GAC_NAV_MAP_LAYOUT_CONTENT_MAIN_MAP_DEFAULT_SS;
    public static final int GAC_NAV_MAP_LAYOUT_SET_CONTENT_MAIN_MAP_DEFAULT;
    public static final int GAC_NAV_MAP_LAYOUT_HOT_POINT_POSITIONS_NO_SS;
    public static final int GAC_NAV_MAP_LAYOUT_HOT_POINT_POSITIONS_SS;
    public static final int GAC_NAV_MAP_LAYOUT_HOT_POINT_POSITION_2D_NORTH;
    public static final int GAC_NAV_MAP_LAYOUT_SET_HOT_POINT_POSITION_2D_NORTH;
    public static final int GAC_NAV_MAP_LAYOUT_SET_HOT_POINT_POSITION_2D_HEADING;
    public static final int GAC_NAV_MAP_LAYOUT_HOT_POINT_POSITION_2D_HEADING;
    public static final int GAC_NAV_MAP_LAYOUT_SET_HOT_POINT_POSITION;
    public static final int GAC_NAV_MAP_LAYOUT_SET_HOT_POINT_POSITION_25D_HEADING;
    public static final int GAC_NAV_MAP_LAYOUT_HOT_POINT_POSITION_25D_HEADING;
    public static final int GAC_NAV_MAP_LAYOUT_SET_CARSUR_POSITION_2D_NORTH;
    public static final int GAC_NAV_MAP_LAYOUT_SET_HOT_POINT_POSITION_NO_SS;
    public static final int GAC_NAV_MAP_LAYOUT_SET_HOT_POINT_POSITION_SS;
    public static final int GAC_NAV_MAP_LAYOUT_CARSUR_POSITIONS_NO_SS;
    public static final int GAC_NAV_MAP_LAYOUT_CARSUR_POSITIONS_SS;
    public static final int GAC_NAV_MAP_LAYOUT_SET_CARSUR_POSITION_2D_HEADING;
    public static final int GAC_NAV_MAIN_MAP_MACRO_PUSH_UP_VIEW_2D;
    public static final int GAC_NAV_MAIN_MAP_MACRO_BTN_HEADING;
    public static final int GAC_NAV_MAIN_MAP_MACRO_BTN_CCP;
    public static final int GAC_NAV_MAIN_MAP_MACRO_BTN_ROCKET;
    public static final int GAC_NAV_MAP_LAYOUT_SET_PERSPECTIVE;
    public static final int GAC_NAV_MAP_LAYOUT_SET_CONTENT_MAIN_MAP_RANGEVIEW;
    public static final int GAC_NAV_MAP_LAYOUT_SET_CARSUR_POSITION_25D3D_HEADING;
    public static final int GAC_NAV_MAP_LAYOUT_SET_CONTENT_MAIN_MAP_RESTORE_NO_SS;
    public static final int GAC_NAV_MAP_LAYOUT_CONTENT_MAIN_MAP_RANGEVIEW_NO_SS;
    public static final int GAC_NAV_MAP_LAYOUT_CONTENT_MAIN_MAP_RANGEVIEW_SS;
    public static final int GAC_NAV_MAP_LAYOUT_SET_CONTENT_MAIN_MAP_RESTORE_SS;
    public static final int GAC_NAV_MAP_LAYOUT_HOT_POINT_POSITION_RANGE_VIEW;
    public static final int GAC_NAV_MAP_LAYOUT_SET_HOT_POINT_POSITION_WITH_RANGE_VIEW;
    public static final int GAC_NAV_MAP_LAYOUT_HOT_POINT_POSITION_RANGE_VIEW_NO_SS;
    public static final int GAC_NAV_MAP_LAYOUT_HOT_POINT_POSITION_RANGE_VIEW_SS;
    public static final int GAC_NAV_MAP_LAYOUT_SAVE_MAIN_MAP_SETTINGS_TO_MODEL;
    public static final int GAC_NAV_MAP_LAYOUT_RESTORE_MAIN_MAP_SETTINGS_FROM_MODEL;
    public static final int GAC_NAV_MAP_LAYOUT_HOT_POINT_POSITIONS_GUIDANCE_NO_SS;
    public static final int GAC_NAV_MAP_LAYOUT_HOT_POINT_POSITIONS_NO_GUIDANCE_NO_SS;
    public static final int GAC_NAV_MAP_LAYOUT_HOT_POINT_POSITIONS_NO_GUIDANCE_SS;
    public static final int GAC_NAV_MAP_LAYOUT_HOT_POINT_POSITIONS_GUIDANCE_SS;
    public static final int GAC_NAV_MAP_VISIBILITY_SHOW_MAP_IN_ABTTEMPORARILY;
    public static final int GAC_NAV_MAP_VISIBILITY_SWITCH_MAP_BACK_TO_COMBI;
    public static final int GAC_NAV_MAP_VISIBILITY_LEAVE_MAP_VIEW_TO_NAV_MAIN_DUE_TO_MAP_IN_FPK;
    public static final int GAC_NAV_REENTER_DEST_INPUT_FOR_VICINITY;
    public static final int GAC_NAV_NEW_DEST_DETAIL_BROWSER_PARAMS;
    public static final int GAC_NAV_POI_INITSEARCHAREA_SET_PARAM_TO_LAST;
    public static final int GAC_NAV_POI_ONLINESERVICES_INITSEARCHAREA_SET_PARAM_TO_LAST;
    public static final int GAC_SOUND_ICC_HANDLING_ACTIVATE;
    public static final int GAC_SOUND_ICC_HANDLING_DEACTIVATE;
    static final /* synthetic */ boolean $assertionsDisabled;
    static /* synthetic */ Class class$generated$de$vw$mib$global$sm$activity$GlobalActionHandlerImpl;

    @Override
    public void handleGlobalAction(int n) {
        switch (n) {
            case 1: {
                this.setBoolean(30716, false);
                this.setBoolean(24958, true);
                break;
            }
            case 2: {
                this.setString(-808910848, this.getLicValue(58, 1, 0, ""));
                if (!this.evalBoolean(73)) {
                    if (this.getLicValue(58, 1, 0, "").equals("filterCriteria.artists")) {
                        this.setString(-808910848, this.getI18nString(2227));
                    }
                    if (this.getLicValue(58, 1, 0, "").equals("filterCriteria.unknownArtist")) {
                        this.setString(-808910848, this.getI18nString(2230));
                    }
                    if (this.getLicValue(58, 1, 0, "").equals("filterCriteria.unknownArtists")) {
                        this.setString(-808910848, this.getI18nString(2231));
                    }
                    if (this.getLicValue(58, 1, 0, "").equals("filterCriteria.variousArtists")) {
                        this.setString(-808910848, this.getI18nString(2232));
                    }
                }
                if (this.evalBoolean(73)) {
                    this.setString(-808910848, this.getString(412418048));
                }
                this.setString(-2054553600, this.getLicValue(58, 0, 0, ""));
                if (!this.evalBoolean(73)) {
                    if (this.getLicValue(58, 0, 0, "").equals("filterCriteria.albums")) {
                        this.setString(-2054553600, this.getI18nString(2226));
                    }
                    if (this.getLicValue(58, 0, 0, "").equals("filterCriteria.unknownAlbum")) {
                        this.setString(-2054553600, this.getI18nString(2228));
                    }
                    if (this.getLicValue(58, 0, 0, "").equals("filterCriteria.unknownAlbums")) {
                        this.setString(-2054553600, this.getI18nString(2229));
                    }
                }
                if (this.evalBoolean(73)) {
                    this.setString(-2054553600, "");
                }
                if (this.evalBoolean(71)) {
                    this.setBoolean(26774, true);
                    this.setBoolean(1931215104, false);
                }
                if (this.evalBoolean(71)) break;
                this.setBoolean(1931215104, true);
                this.setBoolean(26774, false);
                break;
            }
            case 3: {
                if (this.getInteger(-720830208) == 0) {
                    this.setBoolean(1240858624, true);
                }
                if (this.getInteger(-720830208) != 0) {
                    this.setBoolean(1240858624, false);
                }
                if (this.getInteger(-720830208) == 2) {
                    this.setBoolean(0xEBB0000, true);
                }
                if (this.getInteger(-720830208) != 2) {
                    this.setBoolean(0xEBB0000, false);
                }
                if (this.getInteger(-720830208) == 3) {
                    this.setBoolean(1745158400, true);
                }
                if (this.getInteger(-720830208) != 3) {
                    this.setBoolean(1745158400, false);
                }
                if (this.getInteger(-720830208) == 1) {
                    this.setBoolean(32245, true);
                }
                if (this.getInteger(-720830208) != 1) {
                    this.setBoolean(32245, false);
                }
                if (this.getBoolean(602210304) && this.getInteger(-720830208) == 0) {
                    this.setInteger(-942735360, this.getInteger(29914));
                }
                if (this.getInteger(-720830208) != 2 && this.getInteger(-720830208) != 3 && this.getInteger(-720830208) != 0) break;
                this.setBoolean(602210304, false);
                break;
            }
            case 4: {
                this.setInteger(766312448, 0);
                this.setInteger(-836370176, 0);
                this.setInteger(1037697024, 0);
                break;
            }
            case 5: {
                this.setInteger(-672923648, 0);
                this.handleGlobalAction(10);
                if (this.evalBoolean(25)) {
                    this.handleGlobalAction(11);
                }
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(-672923648));
                eventGeneric.setInt(1, this.getInteger(2095775744));
                eventGeneric.setInt(2, this.getInteger(2078998528));
                eventGeneric.setInt(3, this.getInteger(28460));
                eventGeneric.setInt(4, this.getInteger(153485568));
                this.triggerObserver(771883072, eventGeneric);
                break;
            }
            case 6: {
                this.handleGlobalAction(8);
                if (this.getInteger(-1732116480) == 1) {
                    this.handleGlobalAction(9);
                }
                if (this.getInteger(-1732116480) > 1) {
                    this.handleGlobalAction(7);
                }
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(-959512576));
                eventGeneric.setInt(1, this.getInteger(-993067008));
                this.triggerObserver(1325531200, eventGeneric);
                break;
            }
            case 7: {
                this.setInteger(-959512576, SkinDataPool.getInteger(95));
                this.setInteger(-993067008, SkinDataPool.getInteger(96));
                if (this.evalBoolean(25)) {
                    this.setInteger(-959512576, SkinDataPool.getInteger(97));
                }
                if (!this.evalBoolean(25)) break;
                this.setInteger(-993067008, SkinDataPool.getInteger(98));
                break;
            }
            case 8: {
                this.setInteger(-959512576, SkinDataPool.getInteger(103));
                this.setInteger(-993067008, SkinDataPool.getInteger(104));
                if (this.evalBoolean(25)) {
                    this.setInteger(-959512576, SkinDataPool.getInteger(105));
                }
                if (!this.evalBoolean(25)) break;
                this.setInteger(-993067008, SkinDataPool.getInteger(106));
                break;
            }
            case 9: {
                this.setInteger(-959512576, SkinDataPool.getInteger(99));
                this.setInteger(-993067008, SkinDataPool.getInteger(100));
                if (this.evalBoolean(25)) {
                    this.setInteger(-959512576, SkinDataPool.getInteger(101));
                }
                if (!this.evalBoolean(25)) break;
                this.setInteger(-993067008, SkinDataPool.getInteger(102));
                break;
            }
            case 10: {
                this.setInteger(2095775744, SkinDataPool.getInteger(71));
                this.setInteger(2078998528, SkinDataPool.getInteger(72));
                this.setInteger(28460, SkinDataPool.getInteger(69));
                this.setInteger(153485568, SkinDataPool.getInteger(70));
                break;
            }
            case 11: {
                this.setInteger(2095775744, SkinDataPool.getInteger(75));
                this.setInteger(2078998528, SkinDataPool.getInteger(76));
                this.setInteger(28460, SkinDataPool.getInteger(73));
                this.setInteger(153485568, SkinDataPool.getInteger(74));
                break;
            }
            case 12: {
                this.setInteger(2095775744, 0);
                this.setInteger(2078998528, SkinDataPool.getInteger(64));
                this.setInteger(28460, SkinDataPool.getInteger(63));
                this.setInteger(153485568, SkinDataPool.getInteger(62));
                break;
            }
            case 13: {
                this.setInteger(2095775744, SkinDataPool.getInteger(86));
                this.setInteger(2078998528, SkinDataPool.getInteger(64));
                this.setInteger(153485568, SkinDataPool.getInteger(85));
                this.setInteger(28460, SkinDataPool.getInteger(63));
                break;
            }
            case 14: {
                this.setInteger(-672923648, 0);
                this.handleGlobalAction(12);
                if (this.evalBoolean(25)) {
                    this.handleGlobalAction(13);
                }
                if (this.getInteger(-1732116480) == 2 || this.getInteger(-1732116480) == 3 || this.getInteger(-1732116480) == 4) {
                    this.setInteger(28460, SkinDataPool.getInteger(57));
                }
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(-672923648));
                eventGeneric.setInt(1, this.getInteger(2095775744));
                eventGeneric.setInt(2, this.getInteger(2078998528));
                eventGeneric.setInt(3, this.getInteger(28460));
                eventGeneric.setInt(4, this.getInteger(153485568));
                this.triggerObserver(771883072, eventGeneric);
                break;
            }
            case 15: {
                this.handleGlobalAction(48);
                if (this.getInteger(471924992) != 1) break;
                this.handleGlobalAction(47);
                break;
            }
            case 16: {
                this.handleGlobalAction(49);
                if (this.getInteger(471924992) != 1) break;
                this.handleGlobalAction(50);
                break;
            }
            case 17: {
                this.setInteger(21308, SkinDataPool.getInteger(103));
                this.setInteger(21307, SkinDataPool.getInteger(104));
                if (this.evalBoolean(25)) {
                    this.setInteger(21308, SkinDataPool.getInteger(105));
                }
                if (!this.evalBoolean(25)) break;
                this.setInteger(21307, SkinDataPool.getInteger(106));
                break;
            }
            case 18: {
                this.handleGlobalAction(17);
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(21308));
                eventGeneric.setInt(1, this.getInteger(21307));
                this.triggerObserver(420151360, eventGeneric);
                break;
            }
            case 19: {
                this.handleGlobalAction(20);
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(21308));
                eventGeneric.setInt(1, this.getInteger(21307));
                this.triggerObserver(420151360, eventGeneric);
                break;
            }
            case 20: {
                this.setInteger(21308, SkinDataPool.getInteger(99));
                this.setInteger(21307, SkinDataPool.getInteger(100));
                if (this.evalBoolean(25)) {
                    this.setInteger(21308, SkinDataPool.getInteger(101));
                }
                if (!this.evalBoolean(25)) break;
                this.setInteger(21307, SkinDataPool.getInteger(102));
                break;
            }
            case 21: {
                if (!this.evalBoolean(25)) {
                    this.handleGlobalAction(15);
                }
                if (this.evalBoolean(25)) {
                    this.handleGlobalAction(16);
                }
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(21308));
                eventGeneric.setInt(1, this.getInteger(21307));
                this.triggerObserver(420151360, eventGeneric);
                break;
            }
            case 22: {
                this.handleGlobalAction(23);
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(21308));
                eventGeneric.setInt(1, this.getInteger(21307));
                this.triggerObserver(420151360, eventGeneric);
                break;
            }
            case 23: {
                this.setInteger(21308, SkinDataPool.getInteger(95));
                this.setInteger(21307, SkinDataPool.getInteger(96));
                if (this.evalBoolean(25)) {
                    this.setInteger(21308, SkinDataPool.getInteger(97));
                }
                if (!this.evalBoolean(25)) break;
                this.setInteger(21307, SkinDataPool.getInteger(98));
                break;
            }
            case 24: {
                this.handleGlobalAction(8);
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(-959512576));
                eventGeneric.setInt(1, this.getInteger(-993067008));
                this.triggerObserver(1325531200, eventGeneric);
                break;
            }
            case 25: {
                this.handleGlobalAction(15);
                if (this.getBoolean(-1885798400)) {
                    this.handleGlobalAction(43);
                }
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(21308));
                eventGeneric.setInt(1, this.getInteger(21307));
                this.triggerObserver(420151360, eventGeneric);
                break;
            }
            case 26: {
                this.handleGlobalAction(16);
                if (this.getBoolean(-1885798400)) {
                    this.handleGlobalAction(44);
                }
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(21308));
                eventGeneric.setInt(1, this.getInteger(21307));
                this.triggerObserver(420151360, eventGeneric);
                break;
            }
            case 27: {
                this.setInteger(-959512576, SkinDataPool.getInteger(103));
                this.setInteger(-993067008, SkinDataPool.getInteger(104));
                if (this.getInteger(-1732116480) == 1) {
                    this.setInteger(-959512576, SkinDataPool.getInteger(99));
                }
                if (this.getInteger(-1732116480) == 1) {
                    this.setInteger(-993067008, SkinDataPool.getInteger(100));
                }
                if (this.getInteger(-1732116480) > 1) {
                    this.setInteger(-959512576, SkinDataPool.getInteger(95));
                }
                if (this.getInteger(-1732116480) <= 1) break;
                this.setInteger(-993067008, SkinDataPool.getInteger(96));
                break;
            }
            case 28: {
                this.setInteger(-959512576, SkinDataPool.getInteger(105));
                this.setInteger(-993067008, SkinDataPool.getInteger(106));
                if (this.getInteger(-1732116480) == 1) {
                    this.setInteger(-959512576, SkinDataPool.getInteger(101));
                }
                if (this.getInteger(-1732116480) == 1) {
                    this.setInteger(-993067008, SkinDataPool.getInteger(102));
                }
                if (this.getInteger(-1732116480) > 1) {
                    this.setInteger(-959512576, SkinDataPool.getInteger(97));
                }
                if (this.getInteger(-1732116480) <= 1) break;
                this.setInteger(-993067008, SkinDataPool.getInteger(98));
                break;
            }
            case 29: {
                this.handleGlobalAction(9);
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(-959512576));
                eventGeneric.setInt(1, this.getInteger(-993067008));
                this.triggerObserver(1325531200, eventGeneric);
                break;
            }
            case 30: {
                EventGeneric eventGeneric;
                this.setBoolean(-201588736, false);
                if (this.getBoolean(-1885798400)) {
                    eventGeneric = GlobalActionHandlerImpl.newEvent();
                    eventGeneric.setBoolean(0, this.getBoolean(-201588736));
                    this.triggerObserver(201982016, eventGeneric);
                }
                this.handleGlobalAction(14);
                this.handleGlobalAction(8);
                if (this.getInteger(331939840) == 1 && (this.getInteger(14126) < 10000 || this.getBoolean(10154) || this.getBoolean(-1885798400))) {
                    this.handleGlobalAction(9);
                }
                eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(-959512576));
                eventGeneric.setInt(1, this.getInteger(-993067008));
                this.triggerObserver(1325531200, eventGeneric);
                this.handleGlobalAction(17);
                if (this.getInteger(331939840) == 1 && (this.getInteger(14126) < 10000 || this.getBoolean(10154) || this.getBoolean(-1885798400))) {
                    this.handleGlobalAction(20);
                }
                eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(21308));
                eventGeneric.setInt(1, this.getInteger(21307));
                this.triggerObserver(420151360, eventGeneric);
                this.setInteger(-1192361984, 0);
                if (this.getInteger(331939840) == 1 && (this.getInteger(14126) < 10000 || this.getBoolean(10154) || this.getBoolean(-1885798400))) {
                    this.setInteger(-1192361984, 1);
                }
                if (this.getInteger(331939840) == 1 && !this.getBoolean(10154) && this.getInteger(14126) >= 10000 && !this.getBoolean(-1885798400)) {
                    this.setBoolean(581763072, true);
                }
                if (!this.getBoolean(-1081671680) || this.getBoolean(10154) || this.getBoolean(2011955200) || this.getBoolean(-1885798400)) {
                    this.triggerObserver(1224867904);
                }
                if (this.getBoolean(-1081671680) && !this.getBoolean(10154) && !this.getBoolean(2011955200) && !this.getBoolean(-1885798400)) {
                    this.triggerObserver(1191313472);
                }
                eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1192361984));
                this.triggerObserver(822214720, eventGeneric);
                this.setInteger(331939840, this.getInteger(-1192361984));
                break;
            }
            case 31: {
                EventGeneric eventGeneric;
                this.handleGlobalAction(8);
                if (this.getInteger(-1732116480) == 0) {
                    this.handleGlobalAction(9);
                }
                if (!this.getBoolean(-1081671680)) {
                    eventGeneric = GlobalActionHandlerImpl.newEvent();
                    eventGeneric.setInt(0, this.getInteger(-959512576));
                    eventGeneric.setInt(1, this.getInteger(-993067008));
                    this.triggerObserver(1325531200, eventGeneric);
                }
                this.handleGlobalAction(17);
                if (this.getInteger(-1732116480) == 0) {
                    this.handleGlobalAction(20);
                }
                if (!this.getBoolean(-1081671680)) {
                    eventGeneric = GlobalActionHandlerImpl.newEvent();
                    eventGeneric.setInt(0, this.getInteger(21308));
                    eventGeneric.setInt(1, this.getInteger(21307));
                    this.triggerObserver(420151360, eventGeneric);
                }
                this.setInteger(331939840, this.getInteger(-1732116480));
                this.setInteger(-1192361984, 0);
                if (this.getInteger(331939840) == 0) {
                    this.setInteger(-1192361984, 1);
                }
                if (!this.getBoolean(-1081671680) || this.getBoolean(10154) || this.getBoolean(2011955200) || this.getBoolean(-1885798400)) {
                    this.triggerObserver(1224867904);
                }
                if (this.getBoolean(-1081671680)) {
                    this.triggerObserver(1191313472);
                }
                eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1192361984));
                this.triggerObserver(822214720, eventGeneric);
                this.setInteger(331939840, this.getInteger(-1192361984));
                break;
            }
            case 32: {
                this.handleGlobalAction(6);
                this.handleGlobalAction(21);
                this.setInteger(-1192361984, 0);
                if (this.getInteger(-1732116480) == 1) {
                    this.setInteger(-1192361984, 1);
                }
                if (this.getInteger(-1732116480) == 2) {
                    this.setInteger(-1192361984, 2);
                }
                if (this.getInteger(-1732116480) == 3) {
                    this.setInteger(-1192361984, 3);
                }
                if (this.getInteger(-1732116480) == 4) {
                    this.setInteger(-1192361984, 4);
                }
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1192361984));
                this.triggerObserver(822214720, eventGeneric);
                this.triggerObserver(1224867904);
                break;
            }
            case 33: {
                this.triggerObserver(1375862848);
                break;
            }
            case 34: {
                this.setInteger(-1192361984, 0);
                if (this.getInteger(-1732116480) == 1) {
                    this.setInteger(-1192361984, 1);
                }
                if (this.getInteger(-1732116480) == 2) {
                    this.setInteger(-1192361984, 2);
                }
                if (this.getInteger(-1732116480) == 3) {
                    this.setInteger(-1192361984, 3);
                }
                if (this.getInteger(-1732116480) == 4) {
                    this.setInteger(-1192361984, 4);
                }
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(-1192361984));
                this.triggerObserver(822214720, eventGeneric);
                break;
            }
            case 35: {
                this.setInteger(-672923648, 0);
                this.handleGlobalAction(38);
                if (this.evalBoolean(25)) {
                    this.handleGlobalAction(39);
                }
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(-672923648));
                eventGeneric.setInt(1, this.getInteger(2095775744));
                eventGeneric.setInt(2, this.getInteger(2078998528));
                eventGeneric.setInt(3, this.getInteger(28460));
                eventGeneric.setInt(4, this.getInteger(153485568));
                this.triggerObserver(771883072, eventGeneric);
                break;
            }
            case 36: {
                this.handleGlobalAction(7);
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(-959512576));
                eventGeneric.setInt(1, this.getInteger(-993067008));
                this.triggerObserver(1325531200, eventGeneric);
                break;
            }
            case 37: {
                this.setInteger(-672923648, 0);
                this.handleGlobalAction(12);
                if (this.getInteger(-1732116480) == 2 || this.getInteger(-1732116480) == 3 || this.getInteger(-1732116480) == 4) {
                    this.setInteger(28460, SkinDataPool.getInteger(57));
                }
                if (this.getBoolean(10154) && this.getInteger(471924992) == 1) {
                    this.handleGlobalAction(10);
                }
                if (this.getBoolean(-1885798400)) {
                    this.handleGlobalAction(38);
                }
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(-672923648));
                eventGeneric.setInt(1, this.getInteger(2095775744));
                eventGeneric.setInt(2, this.getInteger(2078998528));
                eventGeneric.setInt(3, this.getInteger(28460));
                eventGeneric.setInt(4, this.getInteger(153485568));
                this.triggerObserver(771883072, eventGeneric);
                break;
            }
            case 38: {
                this.setInteger(2095775744, SkinDataPool.getInteger(83));
                this.setInteger(2078998528, SkinDataPool.getInteger(84));
                this.setInteger(28460, SkinDataPool.getInteger(81));
                this.setInteger(153485568, SkinDataPool.getInteger(82));
                if (!this.getBoolean(0x21220100)) {
                    this.setInteger(2095775744, SkinDataPool.getInteger(67));
                }
                if (!this.getBoolean(0x21220100)) {
                    this.setInteger(2078998528, SkinDataPool.getInteger(68));
                }
                if (!this.getBoolean(0x21220100)) {
                    this.setInteger(28460, SkinDataPool.getInteger(65));
                }
                if (this.getBoolean(0x21220100)) break;
                this.setInteger(153485568, SkinDataPool.getInteger(66));
                break;
            }
            case 39: {
                this.setInteger(2095775744, SkinDataPool.getInteger(93));
                this.setInteger(2078998528, SkinDataPool.getInteger(94));
                this.setInteger(28460, SkinDataPool.getInteger(91));
                this.setInteger(153485568, SkinDataPool.getInteger(92));
                if (!this.getBoolean(0x21220100)) {
                    this.setInteger(2095775744, SkinDataPool.getInteger(89));
                }
                if (!this.getBoolean(0x21220100)) {
                    this.setInteger(2078998528, SkinDataPool.getInteger(90));
                }
                if (!this.getBoolean(0x21220100)) {
                    this.setInteger(28460, SkinDataPool.getInteger(87));
                }
                if (this.getBoolean(0x21220100)) break;
                this.setInteger(153485568, SkinDataPool.getInteger(88));
                break;
            }
            case 40: {
                this.setInteger(-672923648, 0);
                this.handleGlobalAction(13);
                if (this.getInteger(-1732116480) == 2 || this.getInteger(-1732116480) == 3 || this.getInteger(-1732116480) == 4) {
                    this.setInteger(28460, SkinDataPool.getInteger(57));
                }
                if (this.getBoolean(10154) && this.getInteger(471924992) == 1) {
                    this.handleGlobalAction(11);
                }
                if (this.getBoolean(-1885798400)) {
                    this.handleGlobalAction(39);
                }
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(-672923648));
                eventGeneric.setInt(1, this.getInteger(2095775744));
                eventGeneric.setInt(2, this.getInteger(2078998528));
                eventGeneric.setInt(3, this.getInteger(28460));
                eventGeneric.setInt(4, this.getInteger(153485568));
                this.triggerObserver(771883072, eventGeneric);
                break;
            }
            case 41: {
                this.setInteger(21308, SkinDataPool.getInteger(107));
                this.setInteger(21307, SkinDataPool.getInteger(108));
                if (this.evalBoolean(25)) {
                    this.setInteger(21308, SkinDataPool.getInteger(115));
                }
                if (!this.evalBoolean(25)) break;
                this.setInteger(21307, SkinDataPool.getInteger(116));
                break;
            }
            case 42: {
                if (!this.evalBoolean(25)) {
                    this.handleGlobalAction(15);
                }
                if (this.evalBoolean(25)) {
                    this.handleGlobalAction(16);
                }
                if (this.getBoolean(-1885798400) || this.getBoolean(-151715840)) {
                    this.handleGlobalAction(41);
                }
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(21308));
                eventGeneric.setInt(1, this.getInteger(21307));
                this.triggerObserver(420151360, eventGeneric);
                break;
            }
            case 43: {
                this.setInteger(21308, SkinDataPool.getInteger(107));
                this.setInteger(21307, SkinDataPool.getInteger(108));
                break;
            }
            case 44: {
                this.setInteger(21308, SkinDataPool.getInteger(115));
                this.setInteger(21307, SkinDataPool.getInteger(116));
                break;
            }
            case 45: {
                this.setBoolean(-151715840, false);
                if (this.getBoolean(-1885798400)) {
                    this.setBoolean(-151715840, true);
                }
                this.setBoolean(587792640, false);
                if (this.getBoolean(0x77B00000) || this.getBoolean(1518403584)) {
                    this.setBoolean(587792640, true);
                }
                this.setBoolean(705888512, false);
                if (this.getBoolean(-1081671680)) {
                    this.setBoolean(705888512, true);
                }
                this.setInteger(1923153920, this.getInteger(-1732116480));
                break;
            }
            case 46: {
                EventGeneric eventGeneric;
                if (!this.getBoolean(-151715840)) {
                    this.setInteger(-672923648, 0);
                    this.handleGlobalAction(12);
                    if (this.getBoolean(587792640)) {
                        this.handleGlobalAction(13);
                    }
                    if (this.getInteger(1923153920) != 0 && this.getInteger(1923153920) != 1 && this.getInteger(1923153920) != 2) {
                        this.setInteger(28460, SkinDataPool.getInteger(57));
                    }
                    eventGeneric = GlobalActionHandlerImpl.newEvent();
                    eventGeneric.setInt(0, this.getInteger(-672923648));
                    eventGeneric.setInt(1, this.getInteger(2095775744));
                    eventGeneric.setInt(2, this.getInteger(2078998528));
                    eventGeneric.setInt(3, this.getInteger(28460));
                    eventGeneric.setInt(4, this.getInteger(153485568));
                    this.triggerObserver(771883072, eventGeneric);
                }
                if (this.getBoolean(-151715840)) {
                    this.handleGlobalAction(35);
                }
                if (!this.getBoolean(705888512) && !this.getBoolean(-151715840)) {
                    this.setInteger(-959512576, SkinDataPool.getInteger(103));
                    this.setInteger(-993067008, SkinDataPool.getInteger(104));
                    if (this.getBoolean(587792640)) {
                        this.setInteger(-959512576, SkinDataPool.getInteger(105));
                    }
                    if (this.getBoolean(587792640)) {
                        this.setInteger(-993067008, SkinDataPool.getInteger(106));
                    }
                    if (this.getInteger(1923153920) == 1) {
                        this.setInteger(-959512576, SkinDataPool.getInteger(99));
                        this.setInteger(-993067008, SkinDataPool.getInteger(100));
                        if (this.getBoolean(587792640)) {
                            this.setInteger(-959512576, SkinDataPool.getInteger(101));
                        }
                        if (this.getBoolean(587792640)) {
                            this.setInteger(-993067008, SkinDataPool.getInteger(102));
                        }
                    }
                    if (this.getInteger(1923153920) > 1) {
                        this.setInteger(-959512576, SkinDataPool.getInteger(95));
                        this.setInteger(-993067008, SkinDataPool.getInteger(96));
                        if (this.getBoolean(587792640)) {
                            this.setInteger(-959512576, SkinDataPool.getInteger(97));
                        }
                        if (this.getBoolean(587792640)) {
                            this.setInteger(-993067008, SkinDataPool.getInteger(98));
                        }
                    }
                    eventGeneric = GlobalActionHandlerImpl.newEvent();
                    eventGeneric.setInt(0, this.getInteger(-959512576));
                    eventGeneric.setInt(1, this.getInteger(-993067008));
                    this.triggerObserver(1325531200, eventGeneric);
                }
                this.setInteger(21308, SkinDataPool.getInteger(103));
                this.setInteger(21307, SkinDataPool.getInteger(104));
                if (this.getInteger(1923153920) == 1) {
                    this.setInteger(21308, SkinDataPool.getInteger(99));
                }
                if (this.getInteger(1923153920) == 1) {
                    this.setInteger(21307, SkinDataPool.getInteger(100));
                }
                if (this.getInteger(1923153920) > 1) {
                    this.setInteger(21308, SkinDataPool.getInteger(95));
                }
                if (this.getInteger(1923153920) > 1) {
                    this.setInteger(21307, SkinDataPool.getInteger(96));
                }
                if (this.getBoolean(587792640)) {
                    this.setInteger(21308, SkinDataPool.getInteger(105));
                    this.setInteger(21307, SkinDataPool.getInteger(106));
                    if (this.getInteger(1923153920) == 1) {
                        this.setInteger(21308, SkinDataPool.getInteger(101));
                    }
                    if (this.getInteger(1923153920) == 1) {
                        this.setInteger(21307, SkinDataPool.getInteger(102));
                    }
                    if (this.getInteger(1923153920) > 1) {
                        this.setInteger(21308, SkinDataPool.getInteger(97));
                    }
                    if (this.getInteger(1923153920) > 1) {
                        this.setInteger(21307, SkinDataPool.getInteger(98));
                    }
                }
                if (this.getBoolean(-151715840)) {
                    this.setInteger(21308, SkinDataPool.getInteger(107));
                    this.setInteger(21307, SkinDataPool.getInteger(108));
                    if (this.getBoolean(587792640)) {
                        this.setInteger(21308, SkinDataPool.getInteger(115));
                    }
                    if (this.getBoolean(587792640)) {
                        this.setInteger(21307, SkinDataPool.getInteger(116));
                    }
                }
                eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(21308));
                eventGeneric.setInt(1, this.getInteger(21307));
                this.triggerObserver(420151360, eventGeneric);
                if (!this.getBoolean(-151715840)) {
                    this.setInteger(-1192361984, 0);
                    if (this.getInteger(1923153920) == 1) {
                        this.setInteger(-1192361984, 1);
                    }
                    if (this.getInteger(1923153920) == 2) {
                        this.setInteger(-1192361984, 2);
                    }
                    if (this.getInteger(1923153920) == 3) {
                        this.setInteger(-1192361984, 3);
                    }
                    if (this.getInteger(1923153920) == 4) {
                        this.setInteger(-1192361984, 4);
                    }
                    eventGeneric = GlobalActionHandlerImpl.newEvent();
                    eventGeneric.setInt(0, this.getInteger(-1192361984));
                    this.triggerObserver(822214720, eventGeneric);
                }
                if (!this.getBoolean(705888512) && !this.getBoolean(-151715840)) {
                    this.triggerObserver(1224867904);
                }
                if (!this.getBoolean(-151715840) && this.getBoolean(705888512)) {
                    this.triggerObserver(1191313472);
                }
                this.setBoolean(-201588736, true);
                if (!this.getBoolean(-151715840)) break;
                eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(-201588736));
                this.triggerObserver(201982016, eventGeneric);
                break;
            }
            case 47: {
                this.setInteger(21308, SkinDataPool.getInteger(103));
                this.setInteger(21307, SkinDataPool.getInteger(104));
                if (this.getInteger(-1732116480) == 1) {
                    this.setInteger(21308, SkinDataPool.getInteger(99));
                }
                if (this.getInteger(-1732116480) == 1) {
                    this.setInteger(21307, SkinDataPool.getInteger(100));
                }
                if (this.getInteger(-1732116480) > 1) {
                    this.setInteger(21308, SkinDataPool.getInteger(95));
                }
                if (this.getInteger(-1732116480) > 1) {
                    this.setInteger(21307, SkinDataPool.getInteger(96));
                }
                if (this.getBoolean(10154) || this.getBoolean(2011955200)) {
                    this.setInteger(21308, SkinDataPool.getInteger(103));
                }
                if (!this.getBoolean(10154) && !this.getBoolean(2011955200)) break;
                this.setInteger(21307, SkinDataPool.getInteger(104));
                break;
            }
            case 48: {
                this.setInteger(21308, SkinDataPool.getInteger(103));
                this.setInteger(21307, SkinDataPool.getInteger(104));
                if (this.getInteger(-1732116480) == 1) {
                    this.setInteger(21308, SkinDataPool.getInteger(99));
                }
                if (this.getInteger(-1732116480) == 1) {
                    this.setInteger(21307, SkinDataPool.getInteger(100));
                }
                if (this.getInteger(-1732116480) > 1) {
                    this.setInteger(21308, SkinDataPool.getInteger(95));
                }
                if (this.getInteger(-1732116480) <= 1) break;
                this.setInteger(21307, SkinDataPool.getInteger(96));
                break;
            }
            case 49: {
                this.setInteger(21308, SkinDataPool.getInteger(105));
                this.setInteger(21307, SkinDataPool.getInteger(106));
                if (this.getInteger(-1732116480) == 1) {
                    this.setInteger(21308, SkinDataPool.getInteger(101));
                }
                if (this.getInteger(-1732116480) == 1) {
                    this.setInteger(21307, SkinDataPool.getInteger(102));
                }
                if (this.getInteger(-1732116480) > 1) {
                    this.setInteger(21308, SkinDataPool.getInteger(97));
                }
                if (this.getInteger(-1732116480) <= 1) break;
                this.setInteger(21307, SkinDataPool.getInteger(98));
                break;
            }
            case 50: {
                this.setInteger(21308, SkinDataPool.getInteger(105));
                this.setInteger(21307, SkinDataPool.getInteger(106));
                if (this.getInteger(-1732116480) == 1) {
                    this.setInteger(21308, SkinDataPool.getInteger(101));
                }
                if (this.getInteger(-1732116480) == 1) {
                    this.setInteger(21307, SkinDataPool.getInteger(102));
                }
                if (this.getInteger(-1732116480) > 1) {
                    this.setInteger(21308, SkinDataPool.getInteger(97));
                }
                if (this.getInteger(-1732116480) > 1) {
                    this.setInteger(21307, SkinDataPool.getInteger(98));
                }
                if (this.getBoolean(2011955200) || this.getBoolean(10154)) {
                    this.setInteger(21308, SkinDataPool.getInteger(105));
                }
                if (!this.getBoolean(2011955200) && !this.getBoolean(10154)) break;
                this.setInteger(21307, SkinDataPool.getInteger(106));
                break;
            }
            case 51: {
                this.triggerObserver(1405685824);
                this.setBoolean(2006712320, true);
                this.setBoolean(515440640, true);
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(515440640));
                this.triggerObserver(2026442816, eventGeneric);
                break;
            }
            case 52: {
                this.triggerObserver(1405685824);
                this.setBoolean(2006712320, false);
                this.setBoolean(515440640, false);
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(515440640));
                this.triggerObserver(2026442816, eventGeneric);
                break;
            }
            case 53: {
                this.setInteger(132251648, 6);
                GlobalActionHandlerImpl.fireHMIEvent(ANY, BROADCAST, 1382059337);
                this.setBoolean(2006712320, false);
                this.setBoolean(515440640, false);
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setBoolean(0, this.getBoolean(515440640));
                this.triggerObserver(2026442816, eventGeneric);
                break;
            }
            case 54: {
                this.setInteger(27798, 2);
                if (this.getInteger(-1509424896) == 0) {
                    this.setInteger(-1193082880, 8);
                }
                if (this.getInteger(-1509424896) == 1 && (this.getInteger(1944977408) == 0 || this.getInteger(1944977408) == 3)) {
                    this.setInteger(-1193082880, 9);
                }
                if (this.getInteger(-1509424896) == 1 && (this.getInteger(1944977408) == 1 || this.getInteger(1944977408) == 2 || this.getInteger(1944977408) == 4)) {
                    this.setInteger(-1193082880, 14);
                }
                this.setInteger(132251648, 10);
                GlobalActionHandlerImpl.fireHMIEvent(ANY, BROADCAST, 1382059337);
                break;
            }
            case 55: {
                this.setBoolean(16065, true);
                this.setInteger(1795227904, 0);
                this.setInteger(19179, 2);
                this.setInteger(-1852506112, 49);
                this.setString(-1524760320, this.getLicValue(1777340416, 6, 0, ""));
                this.setString(-1814560768, this.getLicValue(1777340416, 3, 0, ""));
                break;
            }
            case 56: {
                this.setInteger(-259588096, 0);
                break;
            }
            case 57: {
                this.setInteger(1049034752, 0);
                break;
            }
            case 58: {
                this.setBoolean(11087, true);
                this.setInteger(22221, 0);
                this.setInteger(29077, 0);
                this.setInteger(216989696, 12);
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(216989696));
                this.triggerObserver(-352059328, eventGeneric);
                break;
            }
            case 59: {
                if (this.getInteger(22221) == -1) break;
                this.setBoolean(11087, false);
                this.setInteger(22221, -1);
                this.setInteger(29077, -1);
                this.setInteger(216989696, 0);
                EventGeneric eventGeneric = GlobalActionHandlerImpl.newEvent();
                eventGeneric.setInt(0, this.getInteger(216989696));
                this.triggerObserver(-352059328, eventGeneric);
                break;
            }
            default: {
                if (!$assertionsDisabled && n != 0) {
                    throw new AssertionError((Object)"Never call this method with an unknown id.");
                }
                break;
            }
        }
    }

    static /* synthetic */ Class class$(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }

    static {
        $assertionsDisabled = !(class$generated$de$vw$mib$global$sm$activity$GlobalActionHandlerImpl == null ? (class$generated$de$vw$mib$global$sm$activity$GlobalActionHandlerImpl = GlobalActionHandlerImpl.class$("generated.de.vw.mib.global.sm.activity.GlobalActionHandlerImpl")) : class$generated$de$vw$mib$global$sm$activity$GlobalActionHandlerImpl).desiredAssertionStatus();
    }
}

