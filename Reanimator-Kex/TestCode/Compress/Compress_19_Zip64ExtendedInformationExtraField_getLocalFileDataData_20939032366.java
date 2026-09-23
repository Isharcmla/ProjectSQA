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

public class Zip64ExtendedInformationExtraField_getLocalFileDataData_20939032366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263;

    public Zip64ExtendedInformationExtraField_getLocalFileDataData_20939032366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term264 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term265 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term267 = (int[]) newIntArray(4);
        Object term276 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term277 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term279 = (int[]) newIntArray(4);
        Object term288 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term289 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term291 = (int[]) newIntArray(4);
        Object term300 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term302 = (byte[]) newByteArray(4);
        setIntField(term265, term265.getClass(), "signum", 1);
        setIntElement(term267, 0, 1338396187);
        setIntElement(term267, 1, 1024067317);
        setIntElement(term267, 2, -1542624227);
        setIntElement(term267, 3, -690934961);
        setField(term265, term265.getClass(), "mag", term267);
        setIntField(term265, term265.getClass(), "bitCountPlusOne", 0);
        setIntField(term265, term265.getClass(), "bitLengthPlusOne", 0);
        setIntField(term265, term265.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term265, term265.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term264, term264.getClass(), "value", term265);
        setField(term263, term263.getClass(), "size", term264);
        setIntField(term277, term277.getClass(), "signum", 1);
        setIntElement(term279, 0, 1947935327);
        setIntElement(term279, 1, -1349728251);
        setIntElement(term279, 2, 1726888622);
        setIntElement(term279, 3, -1978853245);
        setField(term277, term277.getClass(), "mag", term279);
        setIntField(term277, term277.getClass(), "bitCountPlusOne", 0);
        setIntField(term277, term277.getClass(), "bitLengthPlusOne", 0);
        setIntField(term277, term277.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term277, term277.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term276, term276.getClass(), "value", term277);
        setField(term263, term263.getClass(), "compressedSize", term276);
        setIntField(term289, term289.getClass(), "signum", 1);
        setIntElement(term291, 0, -2110912439);
        setIntElement(term291, 1, -1522472114);
        setIntElement(term291, 2, -1740681823);
        setIntElement(term291, 3, -1478790406);
        setField(term289, term289.getClass(), "mag", term291);
        setIntField(term289, term289.getClass(), "bitCountPlusOne", 0);
        setIntField(term289, term289.getClass(), "bitLengthPlusOne", 0);
        setIntField(term289, term289.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term289, term289.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term288, term288.getClass(), "value", term289);
        setField(term263, term263.getClass(), "relativeHeaderOffset", term288);
        setLongField(term300, term300.getClass(), "value", 5270370404989704783L);
        setField(term263, term263.getClass(), "diskStart", term300);
        setByteElement(term302, 0, (byte) 83);
        setByteElement(term302, 1, (byte) 74);
        setByteElement(term302, 2, (byte) -71);
        setByteElement(term302, 3, (byte) 49);
        setField(term263, term263.getClass(), "rawCentralDirectoryData", term302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocalFileDataData", argTypes, term263, args);
    }

};


