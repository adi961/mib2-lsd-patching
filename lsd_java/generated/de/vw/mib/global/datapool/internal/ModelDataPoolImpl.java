/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.global.datapool.internal;

import de.vw.mib.collections.ints.IntBooleanMap;
import de.vw.mib.collections.ints.IntBooleanOptHashMap;
import de.vw.mib.collections.ints.IntFloatMap;
import de.vw.mib.collections.ints.IntFloatOptHashMap;
import de.vw.mib.collections.ints.IntIntMap;
import de.vw.mib.collections.ints.IntIntOptHashMap;
import de.vw.mib.collections.ints.IntLongMap;
import de.vw.mib.collections.ints.IntLongOptHashMap;
import de.vw.mib.collections.ints.IntObjectMap;
import de.vw.mib.collections.ints.IntObjectOptHashMap;
import de.vw.mib.datapool.internal.AbstractDatapool;
import de.vw.mib.error.HMIException;
import de.vw.mib.event.consumer.DatapoolEventConsumer;
import de.vw.mib.hmi.internal.ServiceManagerCommon;
import de.vw.mib.hmi.utils.MagicNumber;
import de.vw.mib.hmi.utils.ResData;
import de.vw.mib.log4mib.Logger;
import de.vw.mib.properties.values.SpellerData;
import java.io.File;
import java.io.IOException;

public class ModelDataPoolImpl
extends AbstractDatapool
implements DatapoolEventConsumer {
    public static final int CHECKSUM;
    private Object[] poolData = null;

    private Object[] getPoolData() {
        if (this.poolData == null) {
            Logger logger = ServiceManagerCommon.loggerFactory.getLogger(8);
            try {
                File file = ResData.getResFile(ServiceManagerCommon.configurationManager, "modeldatapool.res");
                if (ServiceManagerCommon.perfService != null) {
                    ServiceManagerCommon.perfService.performanceLogStartup(2, 2, 1);
                }
                this.poolData = ResData.loadAndCheck(ServiceManagerCommon.fileManager, file, MagicNumber.MODELDATAPOOL_RES, -258698827, 0, logger, 1);
                if (ServiceManagerCommon.perfService != null) {
                    ServiceManagerCommon.perfService.performanceLogStartup(2, 2, 2);
                }
            }
            catch (IOException iOException) {
                HMIException hMIException = new HMIException(iOException.getMessage(), iOException.getCause());
                hMIException.setStackTrace(iOException.getStackTrace());
                throw hMIException;
            }
        }
        return this.poolData;
    }

    @Override
    protected IntObjectMap loadObjectValues() {
        if (ServiceManagerCommon.perfService != null) {
            ServiceManagerCommon.perfService.performanceLogStartup(7, 1, 1);
        }
        IntObjectMap intObjectMap = ModelDataPoolImpl.createObjects(this.getPoolData(), 1);
        if (ServiceManagerCommon.perfService != null) {
            ServiceManagerCommon.perfService.performanceLogStartup(7, 1, 2);
        }
        return intObjectMap;
    }

    @Override
    protected IntBooleanMap loadBooleanValues() {
        if (ServiceManagerCommon.perfService != null) {
            ServiceManagerCommon.perfService.performanceLogStartup(8, 1, 1);
        }
        IntBooleanMap intBooleanMap = this.createBoolean(this.getPoolData(), 6);
        if (ServiceManagerCommon.perfService != null) {
            ServiceManagerCommon.perfService.performanceLogStartup(8, 1, 2);
        }
        return intBooleanMap;
    }

    @Override
    protected IntFloatMap loadFloatValues() {
        if (ServiceManagerCommon.perfService != null) {
            ServiceManagerCommon.perfService.performanceLogStartup(9, 1, 1);
        }
        IntFloatMap intFloatMap = this.createFloat(this.getPoolData(), 11);
        if (ServiceManagerCommon.perfService != null) {
            ServiceManagerCommon.perfService.performanceLogStartup(9, 1, 2);
        }
        return intFloatMap;
    }

    @Override
    protected IntIntMap loadIntValues() {
        if (ServiceManagerCommon.perfService != null) {
            ServiceManagerCommon.perfService.performanceLogStartup(10, 1, 1);
        }
        IntIntMap intIntMap = this.createInt(this.getPoolData(), 16);
        if (ServiceManagerCommon.perfService != null) {
            ServiceManagerCommon.perfService.performanceLogStartup(10, 1, 2);
        }
        return intIntMap;
    }

    @Override
    protected IntLongMap loadLongValues() {
        if (ServiceManagerCommon.perfService != null) {
            ServiceManagerCommon.perfService.performanceLogStartup(11, 1, 1);
        }
        IntLongMap intLongMap = this.createLong(this.getPoolData(), 21);
        if (ServiceManagerCommon.perfService != null) {
            ServiceManagerCommon.perfService.performanceLogStartup(11, 1, 2);
        }
        return intLongMap;
    }

    public static IntObjectMap createObjects(Object[] objectArray, int n) {
        objectArray[n + 1] = ModelDataPoolImpl.convertStringArrayToObjectArray((String[])objectArray[n + 1]);
        objectArray[n + 4] = ModelDataPoolImpl.convertStringArrayToObjectArray((String[])objectArray[n + 4]);
        IntObjectOptHashMap intObjectOptHashMap = IntObjectOptHashMap.createFromInternalData(objectArray, n);
        intObjectOptHashMap.put(21208, new boolean[]{false, false});
        intObjectOptHashMap.put(14901, new boolean[]{false, false});
        intObjectOptHashMap.put(1039925248, new int[]{10, 10, 10, 10, 10});
        intObjectOptHashMap.put(12690, new int[]{-1, -1, -1, -1, -1});
        intObjectOptHashMap.put(-843120640, new int[]{10, 10, 10, 10, 10});
        intObjectOptHashMap.put(-1410072576, new int[]{-1, -1, -1, -1, -1});
        intObjectOptHashMap.put(-897384448, new int[]{10, 10, 10, 10, 10});
        intObjectOptHashMap.put(16807, new int[]{-1, -1, -1, -1, -1});
        intObjectOptHashMap.put(16886, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        intObjectOptHashMap.put(31051, new SpellerData());
        intObjectOptHashMap.put(1267728384, new SpellerData());
        intObjectOptHashMap.put(30570, new boolean[]{false, false, false, false});
        intObjectOptHashMap.put(14686, new boolean[]{false, false, false});
        intObjectOptHashMap.put(-2019295232, new boolean[]{false, false, false, false, false});
        intObjectOptHashMap.put(-1585119232, new boolean[]{false, false, false, false});
        intObjectOptHashMap.put(-1615659008, new int[]{-1, -1, -1, -1});
        intObjectOptHashMap.put(28030, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        intObjectOptHashMap.put(-1448083456, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        intObjectOptHashMap.put(0x61000100, new SpellerData());
        intObjectOptHashMap.put(-440270848, new SpellerData());
        intObjectOptHashMap.put(1260781824, new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false});
        intObjectOptHashMap.put(-1375272704, new int[]{0});
        intObjectOptHashMap.put(1168834560, new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1});
        intObjectOptHashMap.put(2112552960, new boolean[]{false, false, false, false, false, false, false});
        intObjectOptHashMap.put(24374, new boolean[]{false, false, false});
        intObjectOptHashMap.put(23191, new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1});
        intObjectOptHashMap.put(1912865024, new int[]{0, 0});
        intObjectOptHashMap.put(11282, new int[]{0, 0, 14, 14, 14, 14, 0, 0, 0, 0, 14, 14, 14, 14, 0, 0});
        intObjectOptHashMap.put(-994443264, new SpellerData());
        intObjectOptHashMap.put(14618, new boolean[]{false, false, false});
        intObjectOptHashMap.put(-1579352064, new int[0]);
        intObjectOptHashMap.put(14599, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        intObjectOptHashMap.put(2115502336, new boolean[]{true, false});
        intObjectOptHashMap.put(10597, new boolean[]{false, false});
        intObjectOptHashMap.put(110952448, new boolean[]{false, false});
        intObjectOptHashMap.put(23383, new boolean[]{false, false});
        intObjectOptHashMap.put(1156710400, new boolean[]{false, false});
        intObjectOptHashMap.put(13625, new boolean[]{false, false});
        intObjectOptHashMap.put(17034, new boolean[]{false, false});
        intObjectOptHashMap.put(13669, new int[]{0, 3, 9, 259, 265, 517, 521, 3, 5, 261, 515, 1});
        intObjectOptHashMap.put(-1813577728, new boolean[]{true, true});
        intObjectOptHashMap.put(-1011351552, new boolean[]{true, true});
        intObjectOptHashMap.put(1323237376, new boolean[]{true, true});
        intObjectOptHashMap.put(10390, new boolean[]{true, true, true, false, true});
        intObjectOptHashMap.put(14573, new SpellerData());
        intObjectOptHashMap.put(1268842496, new SpellerData());
        intObjectOptHashMap.put(-266862336, new SpellerData());
        intObjectOptHashMap.put(32459, new SpellerData());
        intObjectOptHashMap.put(-2045771520, new SpellerData());
        intObjectOptHashMap.put(212336640, new SpellerData());
        intObjectOptHashMap.put(-66912000, new SpellerData());
        intObjectOptHashMap.put(0x8110100, new SpellerData());
        intObjectOptHashMap.put(-1176240128, new SpellerData());
        intObjectOptHashMap.put(10869, new SpellerData());
        intObjectOptHashMap.put(-494206976, new SpellerData());
        intObjectOptHashMap.put(-135266304, new SpellerData());
        intObjectOptHashMap.put(-586612480, new SpellerData());
        intObjectOptHashMap.put(11558, new SpellerData());
        intObjectOptHashMap.put(739377408, new SpellerData());
        intObjectOptHashMap.put(1552416768, new SpellerData());
        intObjectOptHashMap.put(27177, new SpellerData());
        intObjectOptHashMap.put(-304349184, new SpellerData());
        intObjectOptHashMap.put(954007552, new boolean[]{true, true, true, true, true, true, true, true});
        intObjectOptHashMap.put(1928200192, new SpellerData());
        intObjectOptHashMap.put(-706215936, new SpellerData());
        intObjectOptHashMap.put(-1122696960, new SpellerData());
        intObjectOptHashMap.put(19324, new SpellerData());
        intObjectOptHashMap.put(-1860370176, new SpellerData());
        intObjectOptHashMap.put(10909, new SpellerData());
        intObjectOptHashMap.put(1267400704, new SpellerData());
        intObjectOptHashMap.put(16263, new SpellerData());
        intObjectOptHashMap.put(516620288, new SpellerData());
        intObjectOptHashMap.put(1072431104, new SpellerData());
        intObjectOptHashMap.put(12518, new SpellerData());
        intObjectOptHashMap.put(14878, new SpellerData());
        intObjectOptHashMap.put(986382336, new SpellerData());
        intObjectOptHashMap.put(802095104, new SpellerData());
        intObjectOptHashMap.put(1176568064, new boolean[]{false, false});
        intObjectOptHashMap.put(1440940032, new String[]{"de_DE", "en_GB", "es_ES", "ru_RU", ""});
        intObjectOptHashMap.put(-1659436800, new boolean[]{true, true, true, true, true, true, true, true, true, false, true, true, false, false, false});
        intObjectOptHashMap.put(-367918848, new boolean[]{false, false, false, false, false, false, false});
        intObjectOptHashMap.put(1574305792, new SpellerData());
        intObjectOptHashMap.put(29124, new boolean[0]);
        intObjectOptHashMap.put(34078976, new String[0]);
        return intObjectOptHashMap;
    }

    private IntBooleanMap createBoolean(Object[] objectArray, int n) {
        objectArray[n + 1] = this.convertByteArrayToBooleanArray((byte[])objectArray[n + 1]);
        objectArray[n + 4] = this.convertByteArrayToBooleanArray((byte[])objectArray[n + 4]);
        IntBooleanOptHashMap intBooleanOptHashMap = IntBooleanOptHashMap.createFromInternalData(objectArray, n);
        return intBooleanOptHashMap;
    }

    private IntFloatMap createFloat(Object[] objectArray, int n) {
        IntFloatOptHashMap intFloatOptHashMap = IntFloatOptHashMap.createFromInternalData(objectArray, n);
        return intFloatOptHashMap;
    }

    private IntIntMap createInt(Object[] objectArray, int n) {
        IntIntOptHashMap intIntOptHashMap = IntIntOptHashMap.createFromInternalData(objectArray, n);
        return intIntOptHashMap;
    }

    private IntLongMap createLong(Object[] objectArray, int n) {
        IntLongOptHashMap intLongOptHashMap = IntLongOptHashMap.createFromInternalData(objectArray, n);
        return intLongOptHashMap;
    }

    private boolean[] convertByteArrayToBooleanArray(byte[] byArray) {
        boolean bl = true;
        boolean[] blArray = new boolean[byArray.length];
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            blArray[i2] = byArray[i2] == 1;
        }
        return blArray;
    }

    private static Object[] convertStringArrayToObjectArray(String[] stringArray) {
        String[] stringArray2 = stringArray;
        Object[] objectArray = new Object[stringArray2.length];
        System.arraycopy((Object)stringArray2, 0, (Object)objectArray, 0, stringArray2.length);
        return objectArray;
    }
}

