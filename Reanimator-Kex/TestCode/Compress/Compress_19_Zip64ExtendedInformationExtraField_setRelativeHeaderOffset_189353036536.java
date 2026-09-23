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

public class Zip64ExtendedInformationExtraField_setRelativeHeaderOffset_189353036536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term929;
     Object term970;
     Object term4053;
     Object term4065;

    public Zip64ExtendedInformationExtraField_setRelativeHeaderOffset_189353036536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term929 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term930 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term931 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term933 = (int[]) newIntArray(4);
        Object term942 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term943 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term945 = (int[]) newIntArray(4);
        Object term954 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term955 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term957 = (int[]) newIntArray(4);
        Object term966 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term968 = (byte[]) newByteArray(1);
        setIntField(term931, term931.getClass(), "signum", 1);
        setIntElement(term933, 0, -1771124511);
        setIntElement(term933, 1, -2065579551);
        setIntElement(term933, 2, -1186493046);
        setIntElement(term933, 3, 1905653646);
        setField(term931, term931.getClass(), "mag", term933);
        setIntField(term931, term931.getClass(), "bitCountPlusOne", 0);
        setIntField(term931, term931.getClass(), "bitLengthPlusOne", 0);
        setIntField(term931, term931.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term931, term931.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term930, term930.getClass(), "value", term931);
        setField(term929, term929.getClass(), "size", term930);
        setIntField(term943, term943.getClass(), "signum", 1);
        setIntElement(term945, 0, -1279951573);
        setIntElement(term945, 1, -201009402);
        setIntElement(term945, 2, 974558052);
        setIntElement(term945, 3, 214162466);
        setField(term943, term943.getClass(), "mag", term945);
        setIntField(term943, term943.getClass(), "bitCountPlusOne", 0);
        setIntField(term943, term943.getClass(), "bitLengthPlusOne", 0);
        setIntField(term943, term943.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term943, term943.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term942, term942.getClass(), "value", term943);
        setField(term929, term929.getClass(), "compressedSize", term942);
        setIntField(term955, term955.getClass(), "signum", 1);
        setIntElement(term957, 0, 1337565981);
        setIntElement(term957, 1, -50935154);
        setIntElement(term957, 2, -442381425);
        setIntElement(term957, 3, 2025714091);
        setField(term955, term955.getClass(), "mag", term957);
        setIntField(term955, term955.getClass(), "bitCountPlusOne", 0);
        setIntField(term955, term955.getClass(), "bitLengthPlusOne", 0);
        setIntField(term955, term955.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term955, term955.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term954, term954.getClass(), "value", term955);
        setField(term929, term929.getClass(), "relativeHeaderOffset", term954);
        setLongField(term966, term966.getClass(), "value", -5476826692763582090L);
        setField(term929, term929.getClass(), "diskStart", term966);
        setByteElement(term968, 0, (byte) 116);
        setField(term929, term929.getClass(), "rawCentralDirectoryData", term968);
        term970 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term971 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term973 = (int[]) newIntArray(4);
        setIntField(term971, term971.getClass(), "signum", 1);
        setIntElement(term973, 0, -416270825);
        setIntElement(term973, 1, 1927349900);
        setIntElement(term973, 2, 1771220804);
        setIntElement(term973, 3, -1585671012);
        setField(term971, term971.getClass(), "mag", term973);
        setIntField(term971, term971.getClass(), "bitCountPlusOne", 0);
        setIntField(term971, term971.getClass(), "bitLengthPlusOne", 0);
        setIntField(term971, term971.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term971, term971.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term970, term970.getClass(), "value", term971);
        term4053 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term4054 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term4055 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4056 = (int[]) newIntArray(4);
        Object term4057 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term4058 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4059 = (int[]) newIntArray(4);
        Object term4060 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term4061 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4062 = (int[]) newIntArray(4);
        Object term4063 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term4064 = (byte[]) newByteArray(1);
        setIntField(term4055, term4055.getClass(), "signum", 1);
        setIntElement(term4056, 0, -1771124511);
        setIntElement(term4056, 1, -2065579551);
        setIntElement(term4056, 2, -1186493046);
        setIntElement(term4056, 3, 1905653646);
        setField(term4055, term4055.getClass(), "mag", term4056);
        setIntField(term4055, term4055.getClass(), "bitCountPlusOne", 0);
        setIntField(term4055, term4055.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4055, term4055.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4055, term4055.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4054, term4054.getClass(), "value", term4055);
        setField(term4053, term4053.getClass(), "size", term4054);
        setIntField(term4058, term4058.getClass(), "signum", 1);
        setIntElement(term4059, 0, -1279951573);
        setIntElement(term4059, 1, -201009402);
        setIntElement(term4059, 2, 974558052);
        setIntElement(term4059, 3, 214162466);
        setField(term4058, term4058.getClass(), "mag", term4059);
        setIntField(term4058, term4058.getClass(), "bitCountPlusOne", 0);
        setIntField(term4058, term4058.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4058, term4058.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4058, term4058.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4057, term4057.getClass(), "value", term4058);
        setField(term4053, term4053.getClass(), "compressedSize", term4057);
        setIntField(term4061, term4061.getClass(), "signum", 1);
        setIntElement(term4062, 0, -416270825);
        setIntElement(term4062, 1, 1927349900);
        setIntElement(term4062, 2, 1771220804);
        setIntElement(term4062, 3, -1585671012);
        setField(term4061, term4061.getClass(), "mag", term4062);
        setIntField(term4061, term4061.getClass(), "bitCountPlusOne", 0);
        setIntField(term4061, term4061.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4061, term4061.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4061, term4061.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4060, term4060.getClass(), "value", term4061);
        setField(term4053, term4053.getClass(), "relativeHeaderOffset", term4060);
        setLongField(term4063, term4063.getClass(), "value", -5476826692763582090L);
        setField(term4053, term4053.getClass(), "diskStart", term4063);
        setByteElement(term4064, 0, (byte) 116);
        setField(term4053, term4053.getClass(), "rawCentralDirectoryData", term4064);
        term4065 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term4066 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4067 = (int[]) newIntArray(4);
        setIntField(term4066, term4066.getClass(), "signum", 1);
        setIntElement(term4067, 0, -416270825);
        setIntElement(term4067, 1, 1927349900);
        setIntElement(term4067, 2, 1771220804);
        setIntElement(term4067, 3, -1585671012);
        setField(term4066, term4066.getClass(), "mag", term4067);
        setIntField(term4066, term4066.getClass(), "bitCountPlusOne", 0);
        setIntField(term4066, term4066.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4066, term4066.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4066, term4066.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4065, term4065.getClass(), "value", term4066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger");
        Object[] args = new Object[1];
        args[0] = term970;
        callMethod(klass, "setRelativeHeaderOffset", argTypes, term929, args);
        assertTrue(recursiveEquals(term929, term4053));
        assertTrue(recursiveEquals(term970, term4065));
    }

};


