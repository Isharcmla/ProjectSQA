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

public class Zip64ExtendedInformationExtraField_parseFromCentralDirectoryData_162003082029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450;
     Object term496;
     Object term504;
     Object term506;

    public Zip64ExtendedInformationExtraField_parseFromCentralDirectoryData_162003082029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term450 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term451 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term452 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term454 = (int[]) newIntArray(4);
        Object term463 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term464 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term466 = (int[]) newIntArray(4);
        Object term475 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term476 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term478 = (int[]) newIntArray(4);
        Object term487 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term489 = (byte[]) newByteArray(6);
        setIntField(term452, term452.getClass(), "signum", 1);
        setIntElement(term454, 0, 1117380577);
        setIntElement(term454, 1, -1877052693);
        setIntElement(term454, 2, 1366433848);
        setIntElement(term454, 3, 1096447770);
        setField(term452, term452.getClass(), "mag", term454);
        setIntField(term452, term452.getClass(), "bitCountPlusOne", 0);
        setIntField(term452, term452.getClass(), "bitLengthPlusOne", 0);
        setIntField(term452, term452.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term452, term452.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term451, term451.getClass(), "value", term452);
        setField(term450, term450.getClass(), "size", term451);
        setIntField(term464, term464.getClass(), "signum", 1);
        setIntElement(term466, 0, -726640958);
        setIntElement(term466, 1, 560379572);
        setIntElement(term466, 2, -1232687926);
        setIntElement(term466, 3, -1400821230);
        setField(term464, term464.getClass(), "mag", term466);
        setIntField(term464, term464.getClass(), "bitCountPlusOne", 0);
        setIntField(term464, term464.getClass(), "bitLengthPlusOne", 0);
        setIntField(term464, term464.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term464, term464.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term463, term463.getClass(), "value", term464);
        setField(term450, term450.getClass(), "compressedSize", term463);
        setIntField(term476, term476.getClass(), "signum", 1);
        setIntElement(term478, 0, -884953937);
        setIntElement(term478, 1, -1552322929);
        setIntElement(term478, 2, 1391116072);
        setIntElement(term478, 3, -1488444321);
        setField(term476, term476.getClass(), "mag", term478);
        setIntField(term476, term476.getClass(), "bitCountPlusOne", 0);
        setIntField(term476, term476.getClass(), "bitLengthPlusOne", 0);
        setIntField(term476, term476.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term476, term476.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term475, term475.getClass(), "value", term476);
        setField(term450, term450.getClass(), "relativeHeaderOffset", term475);
        setLongField(term487, term487.getClass(), "value", 6811161968424632369L);
        setField(term450, term450.getClass(), "diskStart", term487);
        setByteElement(term489, 0, (byte) -111);
        setByteElement(term489, 1, (byte) 23);
        setByteElement(term489, 2, (byte) -15);
        setByteElement(term489, 3, (byte) 36);
        setByteElement(term489, 4, (byte) 118);
        setByteElement(term489, 5, (byte) 106);
        setField(term450, term450.getClass(), "rawCentralDirectoryData", term489);
        term496 = (byte[]) newByteArray(7);
        setByteElement(term496, 0, (byte) 98);
        setByteElement(term496, 1, (byte) 67);
        setByteElement(term496, 2, (byte) 66);
        setByteElement(term496, 3, (byte) -121);
        setByteElement(term496, 4, (byte) -119);
        setByteElement(term496, 5, (byte) 71);
        setByteElement(term496, 6, (byte) 80);
        term504 = new Integer(1484323161);
        term506 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term496;
        args[1] = term504;
        args[2] = term506;
        try {
            callMethod(klass, "parseFromCentralDirectoryData", argTypes, term450, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


