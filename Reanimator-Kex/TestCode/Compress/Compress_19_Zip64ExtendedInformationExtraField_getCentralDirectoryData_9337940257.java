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
import java.lang.Object;

public class Zip64ExtendedInformationExtraField_getCentralDirectoryData_9337940257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryData_9337940257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term324 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term325 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term327 = (int[]) newIntArray(4);
        Object term336 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term337 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term339 = (int[]) newIntArray(4);
        Object term348 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term349 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term351 = (int[]) newIntArray(4);
        Object term360 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term362 = (byte[]) newByteArray(1);
        setIntField(term325, term325.getClass(), "signum", 1);
        setIntElement(term327, 0, 234112249);
        setIntElement(term327, 1, 753114167);
        setIntElement(term327, 2, -1046012143);
        setIntElement(term327, 3, 264659769);
        setField(term325, term325.getClass(), "mag", term327);
        setIntField(term325, term325.getClass(), "bitCountPlusOne", 0);
        setIntField(term325, term325.getClass(), "bitLengthPlusOne", 0);
        setIntField(term325, term325.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term325, term325.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term324, term324.getClass(), "value", term325);
        setField(term323, term323.getClass(), "size", term324);
        setIntField(term337, term337.getClass(), "signum", 1);
        setIntElement(term339, 0, 763680091);
        setIntElement(term339, 1, -647074485);
        setIntElement(term339, 2, -328599277);
        setIntElement(term339, 3, 182874972);
        setField(term337, term337.getClass(), "mag", term339);
        setIntField(term337, term337.getClass(), "bitCountPlusOne", 0);
        setIntField(term337, term337.getClass(), "bitLengthPlusOne", 0);
        setIntField(term337, term337.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term337, term337.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term336, term336.getClass(), "value", term337);
        setField(term323, term323.getClass(), "compressedSize", term336);
        setIntField(term349, term349.getClass(), "signum", 1);
        setIntElement(term351, 0, 1296639623);
        setIntElement(term351, 1, 243556927);
        setIntElement(term351, 2, -1679623855);
        setIntElement(term351, 3, 592478179);
        setField(term349, term349.getClass(), "mag", term351);
        setIntField(term349, term349.getClass(), "bitCountPlusOne", 0);
        setIntField(term349, term349.getClass(), "bitLengthPlusOne", 0);
        setIntField(term349, term349.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term349, term349.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term348, term348.getClass(), "value", term349);
        setField(term323, term323.getClass(), "relativeHeaderOffset", term348);
        setLongField(term360, term360.getClass(), "value", 7411271909051562686L);
        setField(term323, term323.getClass(), "diskStart", term360);
        setByteElement(term362, 0, (byte) -54);
        setField(term323, term323.getClass(), "rawCentralDirectoryData", term362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCentralDirectoryData", argTypes, term323, args);
    }

};


