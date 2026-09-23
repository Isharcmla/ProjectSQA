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

public class Zip64ExtendedInformationExtraField_getRelativeHeaderOffset_176116852135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term871;
     Object term3966;
     Object term3910;

    public Zip64ExtendedInformationExtraField_getRelativeHeaderOffset_176116852135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term871 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term872 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term873 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term875 = (int[]) newIntArray(4);
        Object term884 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term885 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term887 = (int[]) newIntArray(4);
        Object term896 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term897 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term899 = (int[]) newIntArray(4);
        Object term908 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term910 = (byte[]) newByteArray(3);
        setIntField(term873, term873.getClass(), "signum", 1);
        setIntElement(term875, 0, 23271998);
        setIntElement(term875, 1, 1665933532);
        setIntElement(term875, 2, -2029352665);
        setIntElement(term875, 3, -825384049);
        setField(term873, term873.getClass(), "mag", term875);
        setIntField(term873, term873.getClass(), "bitCountPlusOne", 0);
        setIntField(term873, term873.getClass(), "bitLengthPlusOne", 0);
        setIntField(term873, term873.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term873, term873.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term872, term872.getClass(), "value", term873);
        setField(term871, term871.getClass(), "size", term872);
        setIntField(term885, term885.getClass(), "signum", 1);
        setIntElement(term887, 0, -1324232828);
        setIntElement(term887, 1, 1852426136);
        setIntElement(term887, 2, -1851277557);
        setIntElement(term887, 3, -903339850);
        setField(term885, term885.getClass(), "mag", term887);
        setIntField(term885, term885.getClass(), "bitCountPlusOne", 0);
        setIntField(term885, term885.getClass(), "bitLengthPlusOne", 0);
        setIntField(term885, term885.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term885, term885.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term884, term884.getClass(), "value", term885);
        setField(term871, term871.getClass(), "compressedSize", term884);
        setIntField(term897, term897.getClass(), "signum", 1);
        setIntElement(term899, 0, -410725284);
        setIntElement(term899, 1, -584036954);
        setIntElement(term899, 2, 51969616);
        setIntElement(term899, 3, -152693189);
        setField(term897, term897.getClass(), "mag", term899);
        setIntField(term897, term897.getClass(), "bitCountPlusOne", 0);
        setIntField(term897, term897.getClass(), "bitLengthPlusOne", 0);
        setIntField(term897, term897.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term897, term897.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term896, term896.getClass(), "value", term897);
        setField(term871, term871.getClass(), "relativeHeaderOffset", term896);
        setLongField(term908, term908.getClass(), "value", 2535595959091595249L);
        setField(term871, term871.getClass(), "diskStart", term908);
        setByteElement(term910, 0, (byte) 61);
        setByteElement(term910, 1, (byte) -92);
        setByteElement(term910, 2, (byte) -42);
        setField(term871, term871.getClass(), "rawCentralDirectoryData", term910);
        term3966 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term3967 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3968 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3969 = (int[]) newIntArray(4);
        Object term3970 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3971 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3972 = (int[]) newIntArray(4);
        Object term3973 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3974 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3975 = (int[]) newIntArray(4);
        Object term3976 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term3977 = (byte[]) newByteArray(3);
        setIntField(term3968, term3968.getClass(), "signum", 1);
        setIntElement(term3969, 0, 23271998);
        setIntElement(term3969, 1, 1665933532);
        setIntElement(term3969, 2, -2029352665);
        setIntElement(term3969, 3, -825384049);
        setField(term3968, term3968.getClass(), "mag", term3969);
        setIntField(term3968, term3968.getClass(), "bitCountPlusOne", 0);
        setIntField(term3968, term3968.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3968, term3968.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3968, term3968.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3967, term3967.getClass(), "value", term3968);
        setField(term3966, term3966.getClass(), "size", term3967);
        setIntField(term3971, term3971.getClass(), "signum", 1);
        setIntElement(term3972, 0, -1324232828);
        setIntElement(term3972, 1, 1852426136);
        setIntElement(term3972, 2, -1851277557);
        setIntElement(term3972, 3, -903339850);
        setField(term3971, term3971.getClass(), "mag", term3972);
        setIntField(term3971, term3971.getClass(), "bitCountPlusOne", 0);
        setIntField(term3971, term3971.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3971, term3971.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3971, term3971.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3970, term3970.getClass(), "value", term3971);
        setField(term3966, term3966.getClass(), "compressedSize", term3970);
        setIntField(term3974, term3974.getClass(), "signum", 1);
        setIntElement(term3975, 0, -410725284);
        setIntElement(term3975, 1, -584036954);
        setIntElement(term3975, 2, 51969616);
        setIntElement(term3975, 3, -152693189);
        setField(term3974, term3974.getClass(), "mag", term3975);
        setIntField(term3974, term3974.getClass(), "bitCountPlusOne", 0);
        setIntField(term3974, term3974.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3974, term3974.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3974, term3974.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3973, term3973.getClass(), "value", term3974);
        setField(term3966, term3966.getClass(), "relativeHeaderOffset", term3973);
        setLongField(term3976, term3976.getClass(), "value", 2535595959091595249L);
        setField(term3966, term3966.getClass(), "diskStart", term3976);
        setByteElement(term3977, 0, (byte) 61);
        setByteElement(term3977, 1, (byte) -92);
        setByteElement(term3977, 2, (byte) -42);
        setField(term3966, term3966.getClass(), "rawCentralDirectoryData", term3977);
        term3910 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3911 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3915 = (int[]) newIntArray(4);
        setIntField(term3911, term3911.getClass(), "signum", 1);
        setIntElement(term3915, 0, -410725284);
        setIntElement(term3915, 1, -584036954);
        setIntElement(term3915, 2, 51969616);
        setIntElement(term3915, 3, -152693189);
        setField(term3911, term3911.getClass(), "mag", term3915);
        setIntField(term3911, term3911.getClass(), "bitCountPlusOne", 0);
        setIntField(term3911, term3911.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3911, term3911.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3911, term3911.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3910, term3910.getClass(), "value", term3911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativeHeaderOffset", argTypes, term871, args);
        assertTrue(recursiveEquals(term871, term3966));
        assertTrue(recursiveEquals(retValue, term3910));
    }

};


