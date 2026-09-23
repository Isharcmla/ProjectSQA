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

public class Zip64ExtendedInformationExtraField_init_125309961321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term13;
     Object term1217;
     Object term1224;
     Object term1227;

    public Zip64ExtendedInformationExtraField_init_125309961321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term2 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4 = (int[]) newIntArray(4);
        setIntField(term2, term2.getClass(), "signum", 1);
        setIntElement(term4, 0, 791012385);
        setIntElement(term4, 1, 819285061);
        setIntElement(term4, 2, 1509521496);
        setIntElement(term4, 3, 1264343831);
        setField(term2, term2.getClass(), "mag", term4);
        setIntField(term2, term2.getClass(), "bitCountPlusOne", 0);
        setIntField(term2, term2.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2, term2.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2, term2.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1, term1.getClass(), "value", term2);
        term13 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term14 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term16 = (int[]) newIntArray(4);
        setIntField(term14, term14.getClass(), "signum", 1);
        setIntElement(term16, 0, 313747341);
        setIntElement(term16, 1, -964936229);
        setIntElement(term16, 2, -478647413);
        setIntElement(term16, 3, -898923898);
        setField(term14, term14.getClass(), "mag", term16);
        setIntField(term14, term14.getClass(), "bitCountPlusOne", 0);
        setIntField(term14, term14.getClass(), "bitLengthPlusOne", 0);
        setIntField(term14, term14.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term14, term14.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term13, term13.getClass(), "value", term14);
        term1217 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term1218 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1219 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1220 = (int[]) newIntArray(4);
        Object term1221 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1222 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1223 = (int[]) newIntArray(4);
        setIntField(term1219, term1219.getClass(), "signum", 1);
        setIntElement(term1220, 0, 791012385);
        setIntElement(term1220, 1, 819285061);
        setIntElement(term1220, 2, 1509521496);
        setIntElement(term1220, 3, 1264343831);
        setField(term1219, term1219.getClass(), "mag", term1220);
        setIntField(term1219, term1219.getClass(), "bitCountPlusOne", 0);
        setIntField(term1219, term1219.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1219, term1219.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1219, term1219.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1218, term1218.getClass(), "value", term1219);
        setField(term1217, term1217.getClass(), "size", term1218);
        setIntField(term1222, term1222.getClass(), "signum", 1);
        setIntElement(term1223, 0, 313747341);
        setIntElement(term1223, 1, -964936229);
        setIntElement(term1223, 2, -478647413);
        setIntElement(term1223, 3, -898923898);
        setField(term1222, term1222.getClass(), "mag", term1223);
        setIntField(term1222, term1222.getClass(), "bitCountPlusOne", 0);
        setIntField(term1222, term1222.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1222, term1222.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1222, term1222.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1221, term1221.getClass(), "value", term1222);
        setField(term1217, term1217.getClass(), "compressedSize", term1221);
        setField(term1217, term1217.getClass(), "relativeHeaderOffset", null);
        setField(term1217, term1217.getClass(), "diskStart", null);
        setField(term1217, term1217.getClass(), "rawCentralDirectoryData", null);
        term1224 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1225 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1226 = (int[]) newIntArray(4);
        setIntField(term1225, term1225.getClass(), "signum", 1);
        setIntElement(term1226, 0, 791012385);
        setIntElement(term1226, 1, 819285061);
        setIntElement(term1226, 2, 1509521496);
        setIntElement(term1226, 3, 1264343831);
        setField(term1225, term1225.getClass(), "mag", term1226);
        setIntField(term1225, term1225.getClass(), "bitCountPlusOne", 0);
        setIntField(term1225, term1225.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1225, term1225.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1225, term1225.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1224, term1224.getClass(), "value", term1225);
        term1227 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1228 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1229 = (int[]) newIntArray(4);
        setIntField(term1228, term1228.getClass(), "signum", 1);
        setIntElement(term1229, 0, 313747341);
        setIntElement(term1229, 1, -964936229);
        setIntElement(term1229, 2, -478647413);
        setIntElement(term1229, 3, -898923898);
        setField(term1228, term1228.getClass(), "mag", term1229);
        setIntField(term1228, term1228.getClass(), "bitCountPlusOne", 0);
        setIntField(term1228, term1228.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1228, term1228.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1228, term1228.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1227, term1227.getClass(), "value", term1228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term13;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1217));
        assertTrue(recursiveEquals(term1, term1224));
        assertTrue(recursiveEquals(term13, term1227));
    }

};


