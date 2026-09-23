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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Zip64ExtendedInformationExtraField_parseFromLocalFileData_84508029528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377;
     Object term423;
     Object term426;
     Object term428;

    public Zip64ExtendedInformationExtraField_parseFromLocalFileData_84508029528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term378 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term379 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term381 = (int[]) newIntArray(4);
        Object term390 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term391 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term393 = (int[]) newIntArray(4);
        Object term402 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term403 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term405 = (int[]) newIntArray(4);
        Object term414 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term416 = (byte[]) newByteArray(6);
        setIntField(term379, term379.getClass(), "signum", 1);
        setIntElement(term381, 0, 1120468025);
        setIntElement(term381, 1, 2073146210);
        setIntElement(term381, 2, -77640477);
        setIntElement(term381, 3, 1423636041);
        setField(term379, term379.getClass(), "mag", term381);
        setIntField(term379, term379.getClass(), "bitCountPlusOne", 0);
        setIntField(term379, term379.getClass(), "bitLengthPlusOne", 0);
        setIntField(term379, term379.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term379, term379.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term378, term378.getClass(), "value", term379);
        setField(term377, term377.getClass(), "size", term378);
        setIntField(term391, term391.getClass(), "signum", 1);
        setIntElement(term393, 0, -1621774936);
        setIntElement(term393, 1, -394264255);
        setIntElement(term393, 2, 1489618083);
        setIntElement(term393, 3, 1621161301);
        setField(term391, term391.getClass(), "mag", term393);
        setIntField(term391, term391.getClass(), "bitCountPlusOne", 0);
        setIntField(term391, term391.getClass(), "bitLengthPlusOne", 0);
        setIntField(term391, term391.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term391, term391.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term390, term390.getClass(), "value", term391);
        setField(term377, term377.getClass(), "compressedSize", term390);
        setIntField(term403, term403.getClass(), "signum", 1);
        setIntElement(term405, 0, 1179412034);
        setIntElement(term405, 1, 820827614);
        setIntElement(term405, 2, -758556010);
        setIntElement(term405, 3, -2132082799);
        setField(term403, term403.getClass(), "mag", term405);
        setIntField(term403, term403.getClass(), "bitCountPlusOne", 0);
        setIntField(term403, term403.getClass(), "bitLengthPlusOne", 0);
        setIntField(term403, term403.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term403, term403.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term402, term402.getClass(), "value", term403);
        setField(term377, term377.getClass(), "relativeHeaderOffset", term402);
        setLongField(term414, term414.getClass(), "value", 4872422362414183754L);
        setField(term377, term377.getClass(), "diskStart", term414);
        setByteElement(term416, 0, (byte) 67);
        setByteElement(term416, 1, (byte) 78);
        setByteElement(term416, 2, (byte) 87);
        setByteElement(term416, 3, (byte) 121);
        setByteElement(term416, 4, (byte) -99);
        setByteElement(term416, 5, (byte) -2);
        setField(term377, term377.getClass(), "rawCentralDirectoryData", term416);
        term423 = (byte[]) newByteArray(2);
        setByteElement(term423, 0, (byte) -16);
        setByteElement(term423, 1, (byte) -112);
        term426 = new Integer(568599855);
        term428 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term423;
        args[1] = term426;
        args[2] = term428;
        try {
            callMethod(klass, "parseFromLocalFileData", argTypes, term377, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


