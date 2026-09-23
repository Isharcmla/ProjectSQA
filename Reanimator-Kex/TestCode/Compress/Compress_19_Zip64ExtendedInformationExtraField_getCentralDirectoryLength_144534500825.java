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

public class Zip64ExtendedInformationExtraField_getCentralDirectoryLength_144534500825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205;
     Object term1585;
     Object term1539;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryLength_144534500825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term206 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term207 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term209 = (int[]) newIntArray(4);
        Object term218 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term219 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term221 = (int[]) newIntArray(4);
        Object term230 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term231 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term233 = (int[]) newIntArray(4);
        Object term242 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term244 = (byte[]) newByteArray(3);
        setIntField(term207, term207.getClass(), "signum", 1);
        setIntElement(term209, 0, -1424172433);
        setIntElement(term209, 1, -368227377);
        setIntElement(term209, 2, 1566796227);
        setIntElement(term209, 3, 1170646410);
        setField(term207, term207.getClass(), "mag", term209);
        setIntField(term207, term207.getClass(), "bitCountPlusOne", 0);
        setIntField(term207, term207.getClass(), "bitLengthPlusOne", 0);
        setIntField(term207, term207.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term207, term207.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term206, term206.getClass(), "value", term207);
        setField(term205, term205.getClass(), "size", term206);
        setIntField(term219, term219.getClass(), "signum", 1);
        setIntElement(term221, 0, -1226014174);
        setIntElement(term221, 1, -2050417409);
        setIntElement(term221, 2, -381532063);
        setIntElement(term221, 3, 1690768155);
        setField(term219, term219.getClass(), "mag", term221);
        setIntField(term219, term219.getClass(), "bitCountPlusOne", 0);
        setIntField(term219, term219.getClass(), "bitLengthPlusOne", 0);
        setIntField(term219, term219.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term219, term219.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term218, term218.getClass(), "value", term219);
        setField(term205, term205.getClass(), "compressedSize", term218);
        setIntField(term231, term231.getClass(), "signum", 1);
        setIntElement(term233, 0, 1790215573);
        setIntElement(term233, 1, -955413894);
        setIntElement(term233, 2, -1724021567);
        setIntElement(term233, 3, 1660449041);
        setField(term231, term231.getClass(), "mag", term233);
        setIntField(term231, term231.getClass(), "bitCountPlusOne", 0);
        setIntField(term231, term231.getClass(), "bitLengthPlusOne", 0);
        setIntField(term231, term231.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term231, term231.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term230, term230.getClass(), "value", term231);
        setField(term205, term205.getClass(), "relativeHeaderOffset", term230);
        setLongField(term242, term242.getClass(), "value", -8400487765614892086L);
        setField(term205, term205.getClass(), "diskStart", term242);
        setByteElement(term244, 0, (byte) 79);
        setByteElement(term244, 1, (byte) -119);
        setByteElement(term244, 2, (byte) -66);
        setField(term205, term205.getClass(), "rawCentralDirectoryData", term244);
        term1585 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term1586 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1587 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1588 = (int[]) newIntArray(4);
        Object term1589 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1590 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1591 = (int[]) newIntArray(4);
        Object term1592 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1593 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1594 = (int[]) newIntArray(4);
        Object term1595 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term1596 = (byte[]) newByteArray(3);
        setIntField(term1587, term1587.getClass(), "signum", 1);
        setIntElement(term1588, 0, -1424172433);
        setIntElement(term1588, 1, -368227377);
        setIntElement(term1588, 2, 1566796227);
        setIntElement(term1588, 3, 1170646410);
        setField(term1587, term1587.getClass(), "mag", term1588);
        setIntField(term1587, term1587.getClass(), "bitCountPlusOne", 0);
        setIntField(term1587, term1587.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1587, term1587.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1587, term1587.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1586, term1586.getClass(), "value", term1587);
        setField(term1585, term1585.getClass(), "size", term1586);
        setIntField(term1590, term1590.getClass(), "signum", 1);
        setIntElement(term1591, 0, -1226014174);
        setIntElement(term1591, 1, -2050417409);
        setIntElement(term1591, 2, -381532063);
        setIntElement(term1591, 3, 1690768155);
        setField(term1590, term1590.getClass(), "mag", term1591);
        setIntField(term1590, term1590.getClass(), "bitCountPlusOne", 0);
        setIntField(term1590, term1590.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1590, term1590.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1590, term1590.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1589, term1589.getClass(), "value", term1590);
        setField(term1585, term1585.getClass(), "compressedSize", term1589);
        setIntField(term1593, term1593.getClass(), "signum", 1);
        setIntElement(term1594, 0, 1790215573);
        setIntElement(term1594, 1, -955413894);
        setIntElement(term1594, 2, -1724021567);
        setIntElement(term1594, 3, 1660449041);
        setField(term1593, term1593.getClass(), "mag", term1594);
        setIntField(term1593, term1593.getClass(), "bitCountPlusOne", 0);
        setIntField(term1593, term1593.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1593, term1593.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1593, term1593.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1592, term1592.getClass(), "value", term1593);
        setField(term1585, term1585.getClass(), "relativeHeaderOffset", term1592);
        setLongField(term1595, term1595.getClass(), "value", -8400487765614892086L);
        setField(term1585, term1585.getClass(), "diskStart", term1595);
        setByteElement(term1596, 0, (byte) 79);
        setByteElement(term1596, 1, (byte) -119);
        setByteElement(term1596, 2, (byte) -66);
        setField(term1585, term1585.getClass(), "rawCentralDirectoryData", term1596);
        term1539 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term1539, term1539.getClass(), "value", 28);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term205, args);
        assertTrue(recursiveEquals(term205, term1585));
        assertTrue(recursiveEquals(retValue, term1539));
    }

};


