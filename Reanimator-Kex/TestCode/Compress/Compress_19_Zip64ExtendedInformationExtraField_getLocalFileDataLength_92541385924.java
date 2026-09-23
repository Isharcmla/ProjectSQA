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

public class Zip64ExtendedInformationExtraField_getLocalFileDataLength_92541385924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145;
     Object term1491;
     Object term1444;

    public Zip64ExtendedInformationExtraField_getLocalFileDataLength_92541385924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term146 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term147 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term149 = (int[]) newIntArray(4);
        Object term158 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term159 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term161 = (int[]) newIntArray(4);
        Object term170 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term171 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term173 = (int[]) newIntArray(4);
        Object term182 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term184 = (byte[]) newByteArray(4);
        setIntField(term147, term147.getClass(), "signum", 1);
        setIntElement(term149, 0, 1135451131);
        setIntElement(term149, 1, 1118470130);
        setIntElement(term149, 2, -2027280057);
        setIntElement(term149, 3, -1981732417);
        setField(term147, term147.getClass(), "mag", term149);
        setIntField(term147, term147.getClass(), "bitCountPlusOne", 0);
        setIntField(term147, term147.getClass(), "bitLengthPlusOne", 0);
        setIntField(term147, term147.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term147, term147.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term146, term146.getClass(), "value", term147);
        setField(term145, term145.getClass(), "size", term146);
        setIntField(term159, term159.getClass(), "signum", 1);
        setIntElement(term161, 0, 1201981348);
        setIntElement(term161, 1, 1356528867);
        setIntElement(term161, 2, 718976955);
        setIntElement(term161, 3, 1214022696);
        setField(term159, term159.getClass(), "mag", term161);
        setIntField(term159, term159.getClass(), "bitCountPlusOne", 0);
        setIntField(term159, term159.getClass(), "bitLengthPlusOne", 0);
        setIntField(term159, term159.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term159, term159.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term158, term158.getClass(), "value", term159);
        setField(term145, term145.getClass(), "compressedSize", term158);
        setIntField(term171, term171.getClass(), "signum", 1);
        setIntElement(term173, 0, 1871116404);
        setIntElement(term173, 1, 1664795693);
        setIntElement(term173, 2, -187884068);
        setIntElement(term173, 3, -1009608970);
        setField(term171, term171.getClass(), "mag", term173);
        setIntField(term171, term171.getClass(), "bitCountPlusOne", 0);
        setIntField(term171, term171.getClass(), "bitLengthPlusOne", 0);
        setIntField(term171, term171.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term171, term171.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term170, term170.getClass(), "value", term171);
        setField(term145, term145.getClass(), "relativeHeaderOffset", term170);
        setLongField(term182, term182.getClass(), "value", -8257434502486459194L);
        setField(term145, term145.getClass(), "diskStart", term182);
        setByteElement(term184, 0, (byte) -58);
        setByteElement(term184, 1, (byte) -29);
        setByteElement(term184, 2, (byte) -54);
        setByteElement(term184, 3, (byte) -10);
        setField(term145, term145.getClass(), "rawCentralDirectoryData", term184);
        term1491 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term1492 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1493 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1494 = (int[]) newIntArray(4);
        Object term1495 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1496 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1497 = (int[]) newIntArray(4);
        Object term1498 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1499 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1500 = (int[]) newIntArray(4);
        Object term1501 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term1502 = (byte[]) newByteArray(4);
        setIntField(term1493, term1493.getClass(), "signum", 1);
        setIntElement(term1494, 0, 1135451131);
        setIntElement(term1494, 1, 1118470130);
        setIntElement(term1494, 2, -2027280057);
        setIntElement(term1494, 3, -1981732417);
        setField(term1493, term1493.getClass(), "mag", term1494);
        setIntField(term1493, term1493.getClass(), "bitCountPlusOne", 0);
        setIntField(term1493, term1493.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1493, term1493.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1493, term1493.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1492, term1492.getClass(), "value", term1493);
        setField(term1491, term1491.getClass(), "size", term1492);
        setIntField(term1496, term1496.getClass(), "signum", 1);
        setIntElement(term1497, 0, 1201981348);
        setIntElement(term1497, 1, 1356528867);
        setIntElement(term1497, 2, 718976955);
        setIntElement(term1497, 3, 1214022696);
        setField(term1496, term1496.getClass(), "mag", term1497);
        setIntField(term1496, term1496.getClass(), "bitCountPlusOne", 0);
        setIntField(term1496, term1496.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1496, term1496.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1496, term1496.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1495, term1495.getClass(), "value", term1496);
        setField(term1491, term1491.getClass(), "compressedSize", term1495);
        setIntField(term1499, term1499.getClass(), "signum", 1);
        setIntElement(term1500, 0, 1871116404);
        setIntElement(term1500, 1, 1664795693);
        setIntElement(term1500, 2, -187884068);
        setIntElement(term1500, 3, -1009608970);
        setField(term1499, term1499.getClass(), "mag", term1500);
        setIntField(term1499, term1499.getClass(), "bitCountPlusOne", 0);
        setIntField(term1499, term1499.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1499, term1499.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1499, term1499.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1498, term1498.getClass(), "value", term1499);
        setField(term1491, term1491.getClass(), "relativeHeaderOffset", term1498);
        setLongField(term1501, term1501.getClass(), "value", -8257434502486459194L);
        setField(term1491, term1491.getClass(), "diskStart", term1501);
        setByteElement(term1502, 0, (byte) -58);
        setByteElement(term1502, 1, (byte) -29);
        setByteElement(term1502, 2, (byte) -54);
        setByteElement(term1502, 3, (byte) -10);
        setField(term1491, term1491.getClass(), "rawCentralDirectoryData", term1502);
        term1444 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term1444, term1444.getClass(), "value", 16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term145, args);
        assertTrue(recursiveEquals(term145, term1491));
        assertTrue(recursiveEquals(retValue, term1444));
    }

};


