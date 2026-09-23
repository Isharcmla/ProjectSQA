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
import java.util.zip.ZipException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class Zip64ExtendedInformationExtraField_reparseCentralDirectoryData_37540522930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533;
     Object term574;
     Object term576;
     Object term578;
     Object term580;

    public Zip64ExtendedInformationExtraField_reparseCentralDirectoryData_37540522930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term533 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term534 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term535 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term537 = (int[]) newIntArray(4);
        Object term546 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term547 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term549 = (int[]) newIntArray(4);
        Object term558 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term559 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term561 = (int[]) newIntArray(4);
        Object term570 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term572 = (byte[]) newByteArray(1);
        setIntField(term535, term535.getClass(), "signum", 1);
        setIntElement(term537, 0, 406125295);
        setIntElement(term537, 1, 2079774647);
        setIntElement(term537, 2, -1679855400);
        setIntElement(term537, 3, -1698414316);
        setField(term535, term535.getClass(), "mag", term537);
        setIntField(term535, term535.getClass(), "bitCountPlusOne", 0);
        setIntField(term535, term535.getClass(), "bitLengthPlusOne", 0);
        setIntField(term535, term535.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term535, term535.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term534, term534.getClass(), "value", term535);
        setField(term533, term533.getClass(), "size", term534);
        setIntField(term547, term547.getClass(), "signum", 1);
        setIntElement(term549, 0, -1579463205);
        setIntElement(term549, 1, -29752152);
        setIntElement(term549, 2, 470785771);
        setIntElement(term549, 3, 1415994203);
        setField(term547, term547.getClass(), "mag", term549);
        setIntField(term547, term547.getClass(), "bitCountPlusOne", 0);
        setIntField(term547, term547.getClass(), "bitLengthPlusOne", 0);
        setIntField(term547, term547.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term547, term547.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term546, term546.getClass(), "value", term547);
        setField(term533, term533.getClass(), "compressedSize", term546);
        setIntField(term559, term559.getClass(), "signum", 1);
        setIntElement(term561, 0, 1431346068);
        setIntElement(term561, 1, -283113660);
        setIntElement(term561, 2, -1383524811);
        setIntElement(term561, 3, 815937577);
        setField(term559, term559.getClass(), "mag", term561);
        setIntField(term559, term559.getClass(), "bitCountPlusOne", 0);
        setIntField(term559, term559.getClass(), "bitLengthPlusOne", 0);
        setIntField(term559, term559.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term559, term559.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term558, term558.getClass(), "value", term559);
        setField(term533, term533.getClass(), "relativeHeaderOffset", term558);
        setLongField(term570, term570.getClass(), "value", -7237588299778557629L);
        setField(term533, term533.getClass(), "diskStart", term570);
        setByteElement(term572, 0, (byte) 42);
        setField(term533, term533.getClass(), "rawCentralDirectoryData", term572);
        term574 = new Boolean(false);
        term576 = new Boolean(false);
        term578 = new Boolean(false);
        term580 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term574;
        args[1] = term576;
        args[2] = term578;
        args[3] = term580;
        try {
            callMethod(klass, "reparseCentralDirectoryData", argTypes, term533, args);
            assertTrue(false);
        }
        catch (ZipException e) {
        }

    }

};


