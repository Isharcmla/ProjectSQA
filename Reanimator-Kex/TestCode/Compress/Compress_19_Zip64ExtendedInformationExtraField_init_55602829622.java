package org.apache.commons.compress.archivers.zip;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;
import java.lang.Object;

public class Zip64ExtendedInformationExtraField_init_55602829622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;
     Object term45;
     Object term57;
     Object term69;
     Object term1293;
     Object term1304;
     Object term1307;
     Object term1310;
     Object term1313;

    public Zip64ExtendedInformationExtraField_init_55602829622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term34 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term36 = (int[]) newIntArray(4);
        setIntField(term34, term34.getClass(), "signum", 1);
        setIntElement(term36, 0, -165862327);
        setIntElement(term36, 1, 1335502000);
        setIntElement(term36, 2, -1994335642);
        setIntElement(term36, 3, -1099245088);
        setField(term34, term34.getClass(), "mag", term36);
        setIntField(term34, term34.getClass(), "bitCountPlusOne", 0);
        setIntField(term34, term34.getClass(), "bitLengthPlusOne", 0);
        setIntField(term34, term34.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term34, term34.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term33, term33.getClass(), "value", term34);
        term45 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term46 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term48 = (int[]) newIntArray(4);
        setIntField(term46, term46.getClass(), "signum", 1);
        setIntElement(term48, 0, 1397923395);
        setIntElement(term48, 1, 1257594315);
        setIntElement(term48, 2, -1189378466);
        setIntElement(term48, 3, 834705699);
        setField(term46, term46.getClass(), "mag", term48);
        setIntField(term46, term46.getClass(), "bitCountPlusOne", 0);
        setIntField(term46, term46.getClass(), "bitLengthPlusOne", 0);
        setIntField(term46, term46.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term46, term46.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term45, term45.getClass(), "value", term46);
        term57 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term58 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term60 = (int[]) newIntArray(4);
        setIntField(term58, term58.getClass(), "signum", 1);
        setIntElement(term60, 0, -890532197);
        setIntElement(term60, 1, 1140403369);
        setIntElement(term60, 2, 1309324128);
        setIntElement(term60, 3, 1465941822);
        setField(term58, term58.getClass(), "mag", term60);
        setIntField(term58, term58.getClass(), "bitCountPlusOne", 0);
        setIntField(term58, term58.getClass(), "bitLengthPlusOne", 0);
        setIntField(term58, term58.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term58, term58.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term57, term57.getClass(), "value", term58);
        term69 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setLongField(term69, term69.getClass(), "value", 2442117782898005296L);
        term1293 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term1294 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1295 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1296 = (int[]) newIntArray(4);
        Object term1297 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1298 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1299 = (int[]) newIntArray(4);
        Object term1300 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1301 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1302 = (int[]) newIntArray(4);
        Object term1303 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setIntField(term1295, term1295.getClass(), "signum", 1);
        setIntElement(term1296, 0, -165862327);
        setIntElement(term1296, 1, 1335502000);
        setIntElement(term1296, 2, -1994335642);
        setIntElement(term1296, 3, -1099245088);
        setField(term1295, term1295.getClass(), "mag", term1296);
        setIntField(term1295, term1295.getClass(), "bitCountPlusOne", 0);
        setIntField(term1295, term1295.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1295, term1295.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1295, term1295.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1294, term1294.getClass(), "value", term1295);
        setField(term1293, term1293.getClass(), "size", term1294);
        setIntField(term1298, term1298.getClass(), "signum", 1);
        setIntElement(term1299, 0, 1397923395);
        setIntElement(term1299, 1, 1257594315);
        setIntElement(term1299, 2, -1189378466);
        setIntElement(term1299, 3, 834705699);
        setField(term1298, term1298.getClass(), "mag", term1299);
        setIntField(term1298, term1298.getClass(), "bitCountPlusOne", 0);
        setIntField(term1298, term1298.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1298, term1298.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1298, term1298.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1297, term1297.getClass(), "value", term1298);
        setField(term1293, term1293.getClass(), "compressedSize", term1297);
        setIntField(term1301, term1301.getClass(), "signum", 1);
        setIntElement(term1302, 0, -890532197);
        setIntElement(term1302, 1, 1140403369);
        setIntElement(term1302, 2, 1309324128);
        setIntElement(term1302, 3, 1465941822);
        setField(term1301, term1301.getClass(), "mag", term1302);
        setIntField(term1301, term1301.getClass(), "bitCountPlusOne", 0);
        setIntField(term1301, term1301.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1301, term1301.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1301, term1301.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1300, term1300.getClass(), "value", term1301);
        setField(term1293, term1293.getClass(), "relativeHeaderOffset", term1300);
        setLongField(term1303, term1303.getClass(), "value", 2442117782898005296L);
        setField(term1293, term1293.getClass(), "diskStart", term1303);
        setField(term1293, term1293.getClass(), "rawCentralDirectoryData", null);
        term1304 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1305 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1306 = (int[]) newIntArray(4);
        setIntField(term1305, term1305.getClass(), "signum", 1);
        setIntElement(term1306, 0, -165862327);
        setIntElement(term1306, 1, 1335502000);
        setIntElement(term1306, 2, -1994335642);
        setIntElement(term1306, 3, -1099245088);
        setField(term1305, term1305.getClass(), "mag", term1306);
        setIntField(term1305, term1305.getClass(), "bitCountPlusOne", 0);
        setIntField(term1305, term1305.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1305, term1305.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1305, term1305.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1304, term1304.getClass(), "value", term1305);
        term1307 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1308 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1309 = (int[]) newIntArray(4);
        setIntField(term1308, term1308.getClass(), "signum", 1);
        setIntElement(term1309, 0, 1397923395);
        setIntElement(term1309, 1, 1257594315);
        setIntElement(term1309, 2, -1189378466);
        setIntElement(term1309, 3, 834705699);
        setField(term1308, term1308.getClass(), "mag", term1309);
        setIntField(term1308, term1308.getClass(), "bitCountPlusOne", 0);
        setIntField(term1308, term1308.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1308, term1308.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1308, term1308.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1307, term1307.getClass(), "value", term1308);
        term1310 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1311 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1312 = (int[]) newIntArray(4);
        setIntField(term1311, term1311.getClass(), "signum", 1);
        setIntElement(term1312, 0, -890532197);
        setIntElement(term1312, 1, 1140403369);
        setIntElement(term1312, 2, 1309324128);
        setIntElement(term1312, 3, 1465941822);
        setField(term1311, term1311.getClass(), "mag", term1312);
        setIntField(term1311, term1311.getClass(), "bitCountPlusOne", 0);
        setIntField(term1311, term1311.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1311, term1311.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1311, term1311.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1310, term1310.getClass(), "value", term1311);
        term1313 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setLongField(term1313, term1313.getClass(), "value", 2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger");
        argTypes[2] = Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger");
        argTypes[3] = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
        Object[] args = new Object[4];
        args[0] = term33;
        args[1] = term45;
        args[2] = term57;
        args[3] = term69;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1293));
        assertTrue(recursiveEquals(term33, term1304));
        assertTrue(recursiveEquals(term45, term1307));
        assertTrue(recursiveEquals(term57, term1310));
        assertTrue(recursiveEquals(term69, term1313));
    }

};


