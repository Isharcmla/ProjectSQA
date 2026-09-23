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

public class Zip64ExtendedInformationExtraField_setCompressedSize_202774535734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term799;
     Object term841;
     Object term3822;
     Object term3834;

    public Zip64ExtendedInformationExtraField_setCompressedSize_202774535734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term799 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term800 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term801 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term803 = (int[]) newIntArray(4);
        Object term812 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term813 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term815 = (int[]) newIntArray(4);
        Object term824 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term825 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term827 = (int[]) newIntArray(4);
        Object term836 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term838 = (byte[]) newByteArray(2);
        setIntField(term801, term801.getClass(), "signum", 1);
        setIntElement(term803, 0, -92660371);
        setIntElement(term803, 1, 1806660338);
        setIntElement(term803, 2, -1813466624);
        setIntElement(term803, 3, 2057596020);
        setField(term801, term801.getClass(), "mag", term803);
        setIntField(term801, term801.getClass(), "bitCountPlusOne", 0);
        setIntField(term801, term801.getClass(), "bitLengthPlusOne", 0);
        setIntField(term801, term801.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term801, term801.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term800, term800.getClass(), "value", term801);
        setField(term799, term799.getClass(), "size", term800);
        setIntField(term813, term813.getClass(), "signum", 1);
        setIntElement(term815, 0, 1396472396);
        setIntElement(term815, 1, -2060859936);
        setIntElement(term815, 2, -1259907501);
        setIntElement(term815, 3, -1922979571);
        setField(term813, term813.getClass(), "mag", term815);
        setIntField(term813, term813.getClass(), "bitCountPlusOne", 0);
        setIntField(term813, term813.getClass(), "bitLengthPlusOne", 0);
        setIntField(term813, term813.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term813, term813.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term812, term812.getClass(), "value", term813);
        setField(term799, term799.getClass(), "compressedSize", term812);
        setIntField(term825, term825.getClass(), "signum", 1);
        setIntElement(term827, 0, -789677596);
        setIntElement(term827, 1, 2125233649);
        setIntElement(term827, 2, -30111918);
        setIntElement(term827, 3, 1728725444);
        setField(term825, term825.getClass(), "mag", term827);
        setIntField(term825, term825.getClass(), "bitCountPlusOne", 0);
        setIntField(term825, term825.getClass(), "bitLengthPlusOne", 0);
        setIntField(term825, term825.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term825, term825.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term824, term824.getClass(), "value", term825);
        setField(term799, term799.getClass(), "relativeHeaderOffset", term824);
        setLongField(term836, term836.getClass(), "value", -4325723315152823407L);
        setField(term799, term799.getClass(), "diskStart", term836);
        setByteElement(term838, 0, (byte) 98);
        setByteElement(term838, 1, (byte) 79);
        setField(term799, term799.getClass(), "rawCentralDirectoryData", term838);
        term841 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term842 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term844 = (int[]) newIntArray(4);
        setIntField(term842, term842.getClass(), "signum", 1);
        setIntElement(term844, 0, 386067591);
        setIntElement(term844, 1, 1611550029);
        setIntElement(term844, 2, -1165460443);
        setIntElement(term844, 3, -1219032652);
        setField(term842, term842.getClass(), "mag", term844);
        setIntField(term842, term842.getClass(), "bitCountPlusOne", 0);
        setIntField(term842, term842.getClass(), "bitLengthPlusOne", 0);
        setIntField(term842, term842.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term842, term842.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term841, term841.getClass(), "value", term842);
        term3822 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term3823 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3824 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3825 = (int[]) newIntArray(4);
        Object term3826 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3827 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3828 = (int[]) newIntArray(4);
        Object term3829 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3830 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3831 = (int[]) newIntArray(4);
        Object term3832 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term3833 = (byte[]) newByteArray(2);
        setIntField(term3824, term3824.getClass(), "signum", 1);
        setIntElement(term3825, 0, -92660371);
        setIntElement(term3825, 1, 1806660338);
        setIntElement(term3825, 2, -1813466624);
        setIntElement(term3825, 3, 2057596020);
        setField(term3824, term3824.getClass(), "mag", term3825);
        setIntField(term3824, term3824.getClass(), "bitCountPlusOne", 0);
        setIntField(term3824, term3824.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3824, term3824.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3824, term3824.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3823, term3823.getClass(), "value", term3824);
        setField(term3822, term3822.getClass(), "size", term3823);
        setIntField(term3827, term3827.getClass(), "signum", 1);
        setIntElement(term3828, 0, 386067591);
        setIntElement(term3828, 1, 1611550029);
        setIntElement(term3828, 2, -1165460443);
        setIntElement(term3828, 3, -1219032652);
        setField(term3827, term3827.getClass(), "mag", term3828);
        setIntField(term3827, term3827.getClass(), "bitCountPlusOne", 0);
        setIntField(term3827, term3827.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3827, term3827.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3827, term3827.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3826, term3826.getClass(), "value", term3827);
        setField(term3822, term3822.getClass(), "compressedSize", term3826);
        setIntField(term3830, term3830.getClass(), "signum", 1);
        setIntElement(term3831, 0, -789677596);
        setIntElement(term3831, 1, 2125233649);
        setIntElement(term3831, 2, -30111918);
        setIntElement(term3831, 3, 1728725444);
        setField(term3830, term3830.getClass(), "mag", term3831);
        setIntField(term3830, term3830.getClass(), "bitCountPlusOne", 0);
        setIntField(term3830, term3830.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3830, term3830.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3830, term3830.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3829, term3829.getClass(), "value", term3830);
        setField(term3822, term3822.getClass(), "relativeHeaderOffset", term3829);
        setLongField(term3832, term3832.getClass(), "value", -4325723315152823407L);
        setField(term3822, term3822.getClass(), "diskStart", term3832);
        setByteElement(term3833, 0, (byte) 98);
        setByteElement(term3833, 1, (byte) 79);
        setField(term3822, term3822.getClass(), "rawCentralDirectoryData", term3833);
        term3834 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3835 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3836 = (int[]) newIntArray(4);
        setIntField(term3835, term3835.getClass(), "signum", 1);
        setIntElement(term3836, 0, 386067591);
        setIntElement(term3836, 1, 1611550029);
        setIntElement(term3836, 2, -1165460443);
        setIntElement(term3836, 3, -1219032652);
        setField(term3835, term3835.getClass(), "mag", term3836);
        setIntField(term3835, term3835.getClass(), "bitCountPlusOne", 0);
        setIntField(term3835, term3835.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3835, term3835.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3835, term3835.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3834, term3834.getClass(), "value", term3835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger");
        Object[] args = new Object[1];
        args[0] = term841;
        callMethod(klass, "setCompressedSize", argTypes, term799, args);
        assertTrue(recursiveEquals(term799, term3822));
        assertTrue(recursiveEquals(term841, term3834));
    }

};


