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

public class Zip64ExtendedInformationExtraField_getHeaderId_165624679023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;
     Object term1397;
     Object term1350;

    public Zip64ExtendedInformationExtraField_getHeaderId_165624679023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term84 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term85 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term87 = (int[]) newIntArray(4);
        Object term96 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term97 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term99 = (int[]) newIntArray(4);
        Object term108 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term109 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term111 = (int[]) newIntArray(4);
        Object term120 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term122 = (byte[]) newByteArray(5);
        setIntField(term85, term85.getClass(), "signum", 1);
        setIntElement(term87, 0, 2037839064);
        setIntElement(term87, 1, -1644256257);
        setIntElement(term87, 2, -32263804);
        setIntElement(term87, 3, -252903944);
        setField(term85, term85.getClass(), "mag", term87);
        setIntField(term85, term85.getClass(), "bitCountPlusOne", 0);
        setIntField(term85, term85.getClass(), "bitLengthPlusOne", 0);
        setIntField(term85, term85.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term85, term85.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term84, term84.getClass(), "value", term85);
        setField(term83, term83.getClass(), "size", term84);
        setIntField(term97, term97.getClass(), "signum", 1);
        setIntElement(term99, 0, -1863190589);
        setIntElement(term99, 1, -1847873469);
        setIntElement(term99, 2, 390017059);
        setIntElement(term99, 3, -251162061);
        setField(term97, term97.getClass(), "mag", term99);
        setIntField(term97, term97.getClass(), "bitCountPlusOne", 0);
        setIntField(term97, term97.getClass(), "bitLengthPlusOne", 0);
        setIntField(term97, term97.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term97, term97.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term96, term96.getClass(), "value", term97);
        setField(term83, term83.getClass(), "compressedSize", term96);
        setIntField(term109, term109.getClass(), "signum", 1);
        setIntElement(term111, 0, 610795187);
        setIntElement(term111, 1, 1979806705);
        setIntElement(term111, 2, 1795089907);
        setIntElement(term111, 3, 1645000889);
        setField(term109, term109.getClass(), "mag", term111);
        setIntField(term109, term109.getClass(), "bitCountPlusOne", 0);
        setIntField(term109, term109.getClass(), "bitLengthPlusOne", 0);
        setIntField(term109, term109.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term109, term109.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term108, term108.getClass(), "value", term109);
        setField(term83, term83.getClass(), "relativeHeaderOffset", term108);
        setLongField(term120, term120.getClass(), "value", 6375119433582206027L);
        setField(term83, term83.getClass(), "diskStart", term120);
        setByteElement(term122, 0, (byte) 47);
        setByteElement(term122, 1, (byte) 48);
        setByteElement(term122, 2, (byte) 89);
        setByteElement(term122, 3, (byte) 75);
        setByteElement(term122, 4, (byte) 18);
        setField(term83, term83.getClass(), "rawCentralDirectoryData", term122);
        term1397 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term1398 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1399 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1400 = (int[]) newIntArray(4);
        Object term1401 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1402 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1403 = (int[]) newIntArray(4);
        Object term1404 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1405 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1406 = (int[]) newIntArray(4);
        Object term1407 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term1408 = (byte[]) newByteArray(5);
        setIntField(term1399, term1399.getClass(), "signum", 1);
        setIntElement(term1400, 0, 2037839064);
        setIntElement(term1400, 1, -1644256257);
        setIntElement(term1400, 2, -32263804);
        setIntElement(term1400, 3, -252903944);
        setField(term1399, term1399.getClass(), "mag", term1400);
        setIntField(term1399, term1399.getClass(), "bitCountPlusOne", 0);
        setIntField(term1399, term1399.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1399, term1399.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1399, term1399.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1398, term1398.getClass(), "value", term1399);
        setField(term1397, term1397.getClass(), "size", term1398);
        setIntField(term1402, term1402.getClass(), "signum", 1);
        setIntElement(term1403, 0, -1863190589);
        setIntElement(term1403, 1, -1847873469);
        setIntElement(term1403, 2, 390017059);
        setIntElement(term1403, 3, -251162061);
        setField(term1402, term1402.getClass(), "mag", term1403);
        setIntField(term1402, term1402.getClass(), "bitCountPlusOne", 0);
        setIntField(term1402, term1402.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1402, term1402.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1402, term1402.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1401, term1401.getClass(), "value", term1402);
        setField(term1397, term1397.getClass(), "compressedSize", term1401);
        setIntField(term1405, term1405.getClass(), "signum", 1);
        setIntElement(term1406, 0, 610795187);
        setIntElement(term1406, 1, 1979806705);
        setIntElement(term1406, 2, 1795089907);
        setIntElement(term1406, 3, 1645000889);
        setField(term1405, term1405.getClass(), "mag", term1406);
        setIntField(term1405, term1405.getClass(), "bitCountPlusOne", 0);
        setIntField(term1405, term1405.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1405, term1405.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1405, term1405.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1404, term1404.getClass(), "value", term1405);
        setField(term1397, term1397.getClass(), "relativeHeaderOffset", term1404);
        setLongField(term1407, term1407.getClass(), "value", 6375119433582206027L);
        setField(term1397, term1397.getClass(), "diskStart", term1407);
        setByteElement(term1408, 0, (byte) 47);
        setByteElement(term1408, 1, (byte) 48);
        setByteElement(term1408, 2, (byte) 89);
        setByteElement(term1408, 3, (byte) 75);
        setByteElement(term1408, 4, (byte) 18);
        setField(term1397, term1397.getClass(), "rawCentralDirectoryData", term1408);
        term1350 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term1350, term1350.getClass(), "value", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeaderId", argTypes, term83, args);
        assertTrue(recursiveEquals(term83, term1397));
        assertTrue(recursiveEquals(retValue, term1350));
    }

};


