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

public class Zip64ExtendedInformationExtraField_getCompressedSize_99954257333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737;
     Object term3849;
     Object term3735;

    public Zip64ExtendedInformationExtraField_getCompressedSize_99954257333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term737 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term738 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term739 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term741 = (int[]) newIntArray(4);
        Object term750 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term751 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term753 = (int[]) newIntArray(4);
        Object term762 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term763 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term765 = (int[]) newIntArray(4);
        Object term774 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term776 = (byte[]) newByteArray(5);
        setIntField(term739, term739.getClass(), "signum", 1);
        setIntElement(term741, 0, -680881152);
        setIntElement(term741, 1, -1463060226);
        setIntElement(term741, 2, 656194908);
        setIntElement(term741, 3, -11859444);
        setField(term739, term739.getClass(), "mag", term741);
        setIntField(term739, term739.getClass(), "bitCountPlusOne", 0);
        setIntField(term739, term739.getClass(), "bitLengthPlusOne", 0);
        setIntField(term739, term739.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term739, term739.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term738, term738.getClass(), "value", term739);
        setField(term737, term737.getClass(), "size", term738);
        setIntField(term751, term751.getClass(), "signum", 1);
        setIntElement(term753, 0, 1966569481);
        setIntElement(term753, 1, 728259814);
        setIntElement(term753, 2, -444215654);
        setIntElement(term753, 3, 577824005);
        setField(term751, term751.getClass(), "mag", term753);
        setIntField(term751, term751.getClass(), "bitCountPlusOne", 0);
        setIntField(term751, term751.getClass(), "bitLengthPlusOne", 0);
        setIntField(term751, term751.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term751, term751.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term750, term750.getClass(), "value", term751);
        setField(term737, term737.getClass(), "compressedSize", term750);
        setIntField(term763, term763.getClass(), "signum", 1);
        setIntElement(term765, 0, -2103755347);
        setIntElement(term765, 1, 215069094);
        setIntElement(term765, 2, -1244457347);
        setIntElement(term765, 3, 1161055583);
        setField(term763, term763.getClass(), "mag", term765);
        setIntField(term763, term763.getClass(), "bitCountPlusOne", 0);
        setIntField(term763, term763.getClass(), "bitLengthPlusOne", 0);
        setIntField(term763, term763.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term763, term763.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term762, term762.getClass(), "value", term763);
        setField(term737, term737.getClass(), "relativeHeaderOffset", term762);
        setLongField(term774, term774.getClass(), "value", -8885298608300233488L);
        setField(term737, term737.getClass(), "diskStart", term774);
        setByteElement(term776, 0, (byte) -23);
        setByteElement(term776, 1, (byte) 100);
        setByteElement(term776, 2, (byte) 106);
        setByteElement(term776, 3, (byte) -57);
        setByteElement(term776, 4, (byte) -103);
        setField(term737, term737.getClass(), "rawCentralDirectoryData", term776);
        term3849 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term3850 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3851 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3852 = (int[]) newIntArray(4);
        Object term3854 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3855 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3857 = (int[]) newIntArray(4);
        Object term3858 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3859 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3860 = (int[]) newIntArray(4);
        Object term3861 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term3862 = (byte[]) newByteArray(5);
        setIntField(term3851, term3851.getClass(), "signum", 1);
        setIntElement(term3852, 0, -680881152);
        setIntElement(term3852, 1, -1463060226);
        setIntElement(term3852, 2, 656194908);
        setIntElement(term3852, 3, -11859444);
        setField(term3851, term3851.getClass(), "mag", term3852);
        setIntField(term3851, term3851.getClass(), "bitCountPlusOne", 0);
        setIntField(term3851, term3851.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3851, term3851.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3851, term3851.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3850, term3850.getClass(), "value", term3851);
        setField(term3849, term3849.getClass(), "size", term3850);
        setIntField(term3855, term3855.getClass(), "signum", 1);
        setIntElement(term3857, 0, 1966569481);
        setIntElement(term3857, 1, 728259814);
        setIntElement(term3857, 2, -444215654);
        setIntElement(term3857, 3, 577824005);
        setField(term3855, term3855.getClass(), "mag", term3857);
        setIntField(term3855, term3855.getClass(), "bitCountPlusOne", 0);
        setIntField(term3855, term3855.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3855, term3855.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3855, term3855.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3854, term3854.getClass(), "value", term3855);
        setField(term3849, term3849.getClass(), "compressedSize", term3854);
        setIntField(term3859, term3859.getClass(), "signum", 1);
        setIntElement(term3860, 0, -2103755347);
        setIntElement(term3860, 1, 215069094);
        setIntElement(term3860, 2, -1244457347);
        setIntElement(term3860, 3, 1161055583);
        setField(term3859, term3859.getClass(), "mag", term3860);
        setIntField(term3859, term3859.getClass(), "bitCountPlusOne", 0);
        setIntField(term3859, term3859.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3859, term3859.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3859, term3859.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3858, term3858.getClass(), "value", term3859);
        setField(term3849, term3849.getClass(), "relativeHeaderOffset", term3858);
        setLongField(term3861, term3861.getClass(), "value", -8885298608300233488L);
        setField(term3849, term3849.getClass(), "diskStart", term3861);
        setByteElement(term3862, 0, (byte) -23);
        setByteElement(term3862, 1, (byte) 100);
        setByteElement(term3862, 2, (byte) 106);
        setByteElement(term3862, 3, (byte) -57);
        setByteElement(term3862, 4, (byte) -103);
        setField(term3849, term3849.getClass(), "rawCentralDirectoryData", term3862);
        term3735 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3736 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3738 = (int[]) newIntArray(4);
        setIntField(term3736, term3736.getClass(), "signum", 1);
        setIntElement(term3738, 0, 1966569481);
        setIntElement(term3738, 1, 728259814);
        setIntElement(term3738, 2, -444215654);
        setIntElement(term3738, 3, 577824005);
        setField(term3736, term3736.getClass(), "mag", term3738);
        setIntField(term3736, term3736.getClass(), "bitCountPlusOne", 0);
        setIntField(term3736, term3736.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3736, term3736.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3736, term3736.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3735, term3735.getClass(), "value", term3736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCompressedSize", argTypes, term737, args);
        assertTrue(recursiveEquals(term737, term3849));
        assertTrue(recursiveEquals(retValue, term3735));
    }

};


