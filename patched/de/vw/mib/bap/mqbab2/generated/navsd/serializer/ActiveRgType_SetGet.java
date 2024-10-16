/*
 * Decompiled with CFR 0.152.
 */
package de.vw.mib.bap.mqbab2.generated.navsd.serializer;

import de.vw.mib.bap.datatypes.BAPEntity;
import de.vw.mib.bap.requests.SetGetProperty;
import de.vw.mib.bap.stream.BitStream;

public /*final*/ class ActiveRgType_SetGet
implements SetGetProperty {
    public int rgtype;
    public static /*final*/ int RG_TYPE_RGI_FROM_BAP_FUNCTION_MANEUVER_DESCRIPTIOR;
    public static /*final*/ int RG_TYPE_MOST_KDK;
    public static /*final*/ int RG_TYPE_COMPASS_FROM_BAP_FUNCTION_COMPASS_INFO;
    public static /*final*/ int RG_TYPE_MOST_MAP;
    public static /*final*/ int RG_TYPE_LVDS_MAP_VIDEO_STREAM_RECEIVED_VIA_LVDS_DF4_1;
    public static /*final*/ int RG_TYPE_LVDS_KDK_VIDEO_STREAM_RECEIVED_VIA_LVDS_DF4_3;
    public static /*final*/ int RG_TYPE_APPLY_ASG_DEFAULT_ROUTE_GUIDANCE_PRESENTATION;

    public ActiveRgType_SetGet() {
        this.internalReset();
        this.customInitialization();
    }

    public ActiveRgType_SetGet(BitStream bitStream) {
        this();
        this.deserialize(bitStream);
    }

    private void internalReset() {
        this.rgtype = 0;
    }

   // @Override
    public void reset() {
        this.internalReset();
    }

   // @Override
    public boolean equalTo(BAPEntity bAPEntity) {
        ActiveRgType_SetGet activeRgType_SetGet = (ActiveRgType_SetGet)bAPEntity;
        return this.rgtype == activeRgType_SetGet.rgtype;
    }

    private void customInitialization() {
    }

   // @Override
    public String toString() {
        return "ActiveRgType_SetGet:";
    }

   // @Override
    public int bitSize() {
        return 0;
    }

   // @Override
    public void serialize(BitStream bitStream) {
    }

   // @Override
    public void deserialize(BitStream bitStream) {
        this.rgtype = bitStream.popFrontByte();
    }

    public static int functionId() {
        return 39;
    }

   // @Override
    public int getFunctionId() {
        return ActiveRgType_SetGet.functionId();
    }
}

