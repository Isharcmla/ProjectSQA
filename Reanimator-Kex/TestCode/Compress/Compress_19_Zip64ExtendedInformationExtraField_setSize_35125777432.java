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

public class Zip64ExtendedInformationExtraField_setSize_35125777432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term659;
     Object term704;
     Object term3678;
     Object term3690;

    public Zip64ExtendedInformationExtraField_setSize_35125777432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term659 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term660 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term661 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term663 = (int[]) newIntArray(4);
        Object term672 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term673 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term675 = (int[]) newIntArray(4);
        Object term684 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term685 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term687 = (int[]) newIntArray(4);
        Object term696 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term698 = (byte[]) newByteArray(5);
        setIntField(term661, term661.getClass(), "signum", 1);
        setIntElement(term663, 0, 575708700);
        setIntElement(term663, 1, 2121050859);
        setIntElement(term663, 2, 126015623);
        setIntElement(term663, 3, -1607592672);
        setField(term661, term661.getClass(), "mag", term663);
        setIntField(term661, term661.getClass(), "bitCountPlusOne", 0);
        setIntField(term661, term661.getClass(), "bitLengthPlusOne", 0);
        setIntField(term661, term661.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term661, term661.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term660, term660.getClass(), "value", term661);
        setField(term659, term659.getClass(), "size", term660);
        setIntField(term673, term673.getClass(), "signum", 1);
        setIntElement(term675, 0, -360922875);
        setIntElement(term675, 1, -79459861);
        setIntElement(term675, 2, -2078380282);
        setIntElement(term675, 3, -1746405494);
        setField(term673, term673.getClass(), "mag", term675);
        setIntField(term673, term673.getClass(), "bitCountPlusOne", 0);
        setIntField(term673, term673.getClass(), "bitLengthPlusOne", 0);
        setIntField(term673, term673.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term673, term673.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term672, term672.getClass(), "value", term673);
        setField(term659, term659.getClass(), "compressedSize", term672);
        setIntField(term685, term685.getClass(), "signum", 1);
        setIntElement(term687, 0, 424099332);
        setIntElement(term687, 1, 278178375);
        setIntElement(term687, 2, 667870343);
        setIntElement(term687, 3, 2065826437);
        setField(term685, term685.getClass(), "mag", term687);
        setIntField(term685, term685.getClass(), "bitCountPlusOne", 0);
        setIntField(term685, term685.getClass(), "bitLengthPlusOne", 0);
        setIntField(term685, term685.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term685, term685.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term684, term684.getClass(), "value", term685);
        setField(term659, term659.getClass(), "relativeHeaderOffset", term684);
        setLongField(term696, term696.getClass(), "value", -2813493605142626659L);
        setField(term659, term659.getClass(), "diskStart", term696);
        setByteElement(term698, 0, (byte) -22);
        setByteElement(term698, 1, (byte) 93);
        setByteElement(term698, 2, (byte) 69);
        setByteElement(term698, 3, (byte) -74);
        setByteElement(term698, 4, (byte) -123);
        setField(term659, term659.getClass(), "rawCentralDirectoryData", term698);
        term704 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term705 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term707 = (int[]) newIntArray(4);
        setIntField(term705, term705.getClass(), "signum", 1);
        setIntElement(term707, 0, 279652791);
        setIntElement(term707, 1, 39512956);
        setIntElement(term707, 2, -2007846750);
        setIntElement(term707, 3, 1626703124);
        setField(term705, term705.getClass(), "mag", term707);
        setIntField(term705, term705.getClass(), "bitCountPlusOne", 0);
        setIntField(term705, term705.getClass(), "bitLengthPlusOne", 0);
        setIntField(term705, term705.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term705, term705.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term704, term704.getClass(), "value", term705);
        term3678 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term3679 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3680 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3681 = (int[]) newIntArray(4);
        Object term3682 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3683 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3684 = (int[]) newIntArray(4);
        Object term3685 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3686 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3687 = (int[]) newIntArray(4);
        Object term3688 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term3689 = (byte[]) newByteArray(5);
        setIntField(term3680, term3680.getClass(), "signum", 1);
        setIntElement(term3681, 0, 279652791);
        setIntElement(term3681, 1, 39512956);
        setIntElement(term3681, 2, -2007846750);
        setIntElement(term3681, 3, 1626703124);
        setField(term3680, term3680.getClass(), "mag", term3681);
        setIntField(term3680, term3680.getClass(), "bitCountPlusOne", 0);
        setIntField(term3680, term3680.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3680, term3680.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3680, term3680.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3679, term3679.getClass(), "value", term3680);
        setField(term3678, term3678.getClass(), "size", term3679);
        setIntField(term3683, term3683.getClass(), "signum", 1);
        setIntElement(term3684, 0, -360922875);
        setIntElement(term3684, 1, -79459861);
        setIntElement(term3684, 2, -2078380282);
        setIntElement(term3684, 3, -1746405494);
        setField(term3683, term3683.getClass(), "mag", term3684);
        setIntField(term3683, term3683.getClass(), "bitCountPlusOne", 0);
        setIntField(term3683, term3683.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3683, term3683.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3683, term3683.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3682, term3682.getClass(), "value", term3683);
        setField(term3678, term3678.getClass(), "compressedSize", term3682);
        setIntField(term3686, term3686.getClass(), "signum", 1);
        setIntElement(term3687, 0, 424099332);
        setIntElement(term3687, 1, 278178375);
        setIntElement(term3687, 2, 667870343);
        setIntElement(term3687, 3, 2065826437);
        setField(term3686, term3686.getClass(), "mag", term3687);
        setIntField(term3686, term3686.getClass(), "bitCountPlusOne", 0);
        setIntField(term3686, term3686.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3686, term3686.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3686, term3686.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3685, term3685.getClass(), "value", term3686);
        setField(term3678, term3678.getClass(), "relativeHeaderOffset", term3685);
        setLongField(term3688, term3688.getClass(), "value", -2813493605142626659L);
        setField(term3678, term3678.getClass(), "diskStart", term3688);
        setByteElement(term3689, 0, (byte) -22);
        setByteElement(term3689, 1, (byte) 93);
        setByteElement(term3689, 2, (byte) 69);
        setByteElement(term3689, 3, (byte) -74);
        setByteElement(term3689, 4, (byte) -123);
        setField(term3678, term3678.getClass(), "rawCentralDirectoryData", term3689);
        term3690 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term3691 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3692 = (int[]) newIntArray(4);
        setIntField(term3691, term3691.getClass(), "signum", 1);
        setIntElement(term3692, 0, 279652791);
        setIntElement(term3692, 1, 39512956);
        setIntElement(term3692, 2, -2007846750);
        setIntElement(term3692, 3, 1626703124);
        setField(term3691, term3691.getClass(), "mag", term3692);
        setIntField(term3691, term3691.getClass(), "bitCountPlusOne", 0);
        setIntField(term3691, term3691.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3691, term3691.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3691, term3691.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3690, term3690.getClass(), "value", term3691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger");
        Object[] args = new Object[1];
        args[0] = term704;
        callMethod(klass, "setSize", argTypes, term659, args);
        assertTrue(recursiveEquals(term659, term3678));
        assertTrue(recursiveEquals(term704, term3690));
    }

};


