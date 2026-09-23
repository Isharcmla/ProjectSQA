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

public class Zip64ExtendedInformationExtraField_getSize_134691937231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term595;
     Object term3581;
     Object term3535;

    public Zip64ExtendedInformationExtraField_getSize_134691937231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term595 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term596 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term597 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term599 = (int[]) newIntArray(4);
        Object term608 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term609 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term611 = (int[]) newIntArray(4);
        Object term620 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term621 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term623 = (int[]) newIntArray(4);
        Object term632 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term634 = (byte[]) newByteArray(6);
        setIntField(term597, term597.getClass(), "signum", 1);
        setIntElement(term599, 0, -2141012790);
        setIntElement(term599, 1, 1180498058);
        setIntElement(term599, 2, -466025674);
        setIntElement(term599, 3, 1937134398);
        setField(term597, term597.getClass(), "mag", term599);
        setIntField(term597, term597.getClass(), "bitCountPlusOne", 0);
        setIntField(term597, term597.getClass(), "bitLengthPlusOne", 0);
        setIntField(term597, term597.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term597, term597.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term596, term596.getClass(), "value", term597);
        setField(term595, term595.getClass(), "size", term596);
        setIntField(term609, term609.getClass(), "signum", 1);
        setIntElement(term611, 0, 1621794386);
        setIntElement(term611, 1, 864216383);
        setIntElement(term611, 2, -881266322);
        setIntElement(term611, 3, -126622889);
        setField(term609, term609.getClass(), "mag", term611);
        setIntField(term609, term609.getClass(), "bitCountPlusOne", 0);
        setIntField(term609, term609.getClass(), "bitLengthPlusOne", 0);
        setIntField(term609, term609.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term609, term609.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term608, term608.getClass(), "value", term609);
        setField(term595, term595.getClass(), "compressedSize", term608);
        setIntField(term621, term621.getClass(), "signum", 1);
        setIntElement(term623, 0, -141694687);
        setIntElement(term623, 1, 1643916803);
        setIntElement(term623, 2, -759585303);
        setIntElement(term623, 3, 237895233);
        setField(term621, term621.getClass(), "mag", term623);
        setIntField(term621, term621.getClass(), "bitCountPlusOne", 0);
        setIntField(term621, term621.getClass(), "bitLengthPlusOne", 0);
        setIntField(term621, term621.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term621, term621.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term620, term620.getClass(), "value", term621);
        setField(term595, term595.getClass(), "relativeHeaderOffset", term620);
        setLongField(term632, term632.getClass(), "value", 6967924379644551255L);
        setField(term595, term595.getClass(), "diskStart", term632);
        setByteElement(term634, 0, (byte) 72);
        setByteElement(term634, 1, (byte) 111);
        setByteElement(term634, 2, (byte) 99);
        setByteElement(term634, 3, (byte) -12);
        setByteElement(term634, 4, (byte) -61);
        setByteElement(term634, 5, (byte) -85);
        setField(term595, term595.getClass(), "rawCentralDirectoryData", term634);
        term3581 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term3582 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3583 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3584 = (int[]) newIntArray(4);
        Object term3585 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3586 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3587 = (int[]) newIntArray(4);
        Object term3588 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3589 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3590 = (int[]) newIntArray(4);
        Object term3591 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term3592 = (byte[]) newByteArray(6);
        setIntField(term3583, term3583.getClass(), "signum", 1);
        setIntElement(term3584, 0, -2141012790);
        setIntElement(term3584, 1, 1180498058);
        setIntElement(term3584, 2, -466025674);
        setIntElement(term3584, 3, 1937134398);
        setField(term3583, term3583.getClass(), "mag", term3584);
        setIntField(term3583, term3583.getClass(), "bitCountPlusOne", 0);
        setIntField(term3583, term3583.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3583, term3583.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3583, term3583.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3582, term3582.getClass(), "value", term3583);
        setField(term3581, term3581.getClass(), "size", term3582);
        setIntField(term3586, term3586.getClass(), "signum", 1);
        setIntElement(term3587, 0, 1621794386);
        setIntElement(term3587, 1, 864216383);
        setIntElement(term3587, 2, -881266322);
        setIntElement(term3587, 3, -126622889);
        setField(term3586, term3586.getClass(), "mag", term3587);
        setIntField(term3586, term3586.getClass(), "bitCountPlusOne", 0);
        setIntField(term3586, term3586.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3586, term3586.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3586, term3586.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3585, term3585.getClass(), "value", term3586);
        setField(term3581, term3581.getClass(), "compressedSize", term3585);
        setIntField(term3589, term3589.getClass(), "signum", 1);
        setIntElement(term3590, 0, -141694687);
        setIntElement(term3590, 1, 1643916803);
        setIntElement(term3590, 2, -759585303);
        setIntElement(term3590, 3, 237895233);
        setField(term3589, term3589.getClass(), "mag", term3590);
        setIntField(term3589, term3589.getClass(), "bitCountPlusOne", 0);
        setIntField(term3589, term3589.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3589, term3589.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3589, term3589.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3588, term3588.getClass(), "value", term3589);
        setField(term3581, term3581.getClass(), "relativeHeaderOffset", term3588);
        setLongField(term3591, term3591.getClass(), "value", 6967924379644551255L);
        setField(term3581, term3581.getClass(), "diskStart", term3591);
        setByteElement(term3592, 0, (byte) 72);
        setByteElement(term3592, 1, (byte) 111);
        setByteElement(term3592, 2, (byte) 99);
        setByteElement(term3592, 3, (byte) -12);
        setByteElement(term3592, 4, (byte) -61);
        setByteElement(term3592, 5, (byte) -85);
        setField(term3581, term3581.getClass(), "rawCentralDirectoryData", term3592);
        term3535 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3536 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3538 = (int[]) newIntArray(4);
        setIntField(term3536, term3536.getClass(), "signum", 1);
        setIntElement(term3538, 0, -2141012790);
        setIntElement(term3538, 1, 1180498058);
        setIntElement(term3538, 2, -466025674);
        setIntElement(term3538, 3, 1937134398);
        setField(term3536, term3536.getClass(), "mag", term3538);
        setIntField(term3536, term3536.getClass(), "bitCountPlusOne", 0);
        setIntField(term3536, term3536.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3536, term3536.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3536, term3536.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3535, term3535.getClass(), "value", term3536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSize", argTypes, term595, args);
        assertTrue(recursiveEquals(term595, term3581));
        assertTrue(recursiveEquals(retValue, term3535));
    }

};


