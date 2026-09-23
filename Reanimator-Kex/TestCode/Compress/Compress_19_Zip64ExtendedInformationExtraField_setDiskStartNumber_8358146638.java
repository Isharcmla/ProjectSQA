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

public class Zip64ExtendedInformationExtraField_setDiskStartNumber_8358146638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1051;
     Object term1093;
     Object term4220;
     Object term4232;

    public Zip64ExtendedInformationExtraField_setDiskStartNumber_8358146638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1051 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term1052 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1053 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1055 = (int[]) newIntArray(4);
        Object term1064 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1065 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1067 = (int[]) newIntArray(4);
        Object term1076 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1077 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1079 = (int[]) newIntArray(4);
        Object term1088 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term1090 = (byte[]) newByteArray(2);
        setIntField(term1053, term1053.getClass(), "signum", 1);
        setIntElement(term1055, 0, 1028631840);
        setIntElement(term1055, 1, -1509536045);
        setIntElement(term1055, 2, -439420060);
        setIntElement(term1055, 3, 2006509111);
        setField(term1053, term1053.getClass(), "mag", term1055);
        setIntField(term1053, term1053.getClass(), "bitCountPlusOne", 0);
        setIntField(term1053, term1053.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1053, term1053.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1053, term1053.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1052, term1052.getClass(), "value", term1053);
        setField(term1051, term1051.getClass(), "size", term1052);
        setIntField(term1065, term1065.getClass(), "signum", 1);
        setIntElement(term1067, 0, -2096734519);
        setIntElement(term1067, 1, 1690368128);
        setIntElement(term1067, 2, -664560);
        setIntElement(term1067, 3, -2119859660);
        setField(term1065, term1065.getClass(), "mag", term1067);
        setIntField(term1065, term1065.getClass(), "bitCountPlusOne", 0);
        setIntField(term1065, term1065.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1065, term1065.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1065, term1065.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1064, term1064.getClass(), "value", term1065);
        setField(term1051, term1051.getClass(), "compressedSize", term1064);
        setIntField(term1077, term1077.getClass(), "signum", 1);
        setIntElement(term1079, 0, -1972950250);
        setIntElement(term1079, 1, 1158581818);
        setIntElement(term1079, 2, 1884192502);
        setIntElement(term1079, 3, 1299154171);
        setField(term1077, term1077.getClass(), "mag", term1079);
        setIntField(term1077, term1077.getClass(), "bitCountPlusOne", 0);
        setIntField(term1077, term1077.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1077, term1077.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1077, term1077.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1076, term1076.getClass(), "value", term1077);
        setField(term1051, term1051.getClass(), "relativeHeaderOffset", term1076);
        setLongField(term1088, term1088.getClass(), "value", -316468845751588286L);
        setField(term1051, term1051.getClass(), "diskStart", term1088);
        setByteElement(term1090, 0, (byte) -81);
        setByteElement(term1090, 1, (byte) 102);
        setField(term1051, term1051.getClass(), "rawCentralDirectoryData", term1090);
        term1093 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setLongField(term1093, term1093.getClass(), "value", 5127676408959197577L);
        term4220 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term4221 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term4222 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4223 = (int[]) newIntArray(4);
        Object term4224 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term4225 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4226 = (int[]) newIntArray(4);
        Object term4227 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term4228 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4229 = (int[]) newIntArray(4);
        Object term4230 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term4231 = (byte[]) newByteArray(2);
        setIntField(term4222, term4222.getClass(), "signum", 1);
        setIntElement(term4223, 0, 1028631840);
        setIntElement(term4223, 1, -1509536045);
        setIntElement(term4223, 2, -439420060);
        setIntElement(term4223, 3, 2006509111);
        setField(term4222, term4222.getClass(), "mag", term4223);
        setIntField(term4222, term4222.getClass(), "bitCountPlusOne", 0);
        setIntField(term4222, term4222.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4222, term4222.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4222, term4222.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4221, term4221.getClass(), "value", term4222);
        setField(term4220, term4220.getClass(), "size", term4221);
        setIntField(term4225, term4225.getClass(), "signum", 1);
        setIntElement(term4226, 0, -2096734519);
        setIntElement(term4226, 1, 1690368128);
        setIntElement(term4226, 2, -664560);
        setIntElement(term4226, 3, -2119859660);
        setField(term4225, term4225.getClass(), "mag", term4226);
        setIntField(term4225, term4225.getClass(), "bitCountPlusOne", 0);
        setIntField(term4225, term4225.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4225, term4225.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4225, term4225.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4224, term4224.getClass(), "value", term4225);
        setField(term4220, term4220.getClass(), "compressedSize", term4224);
        setIntField(term4228, term4228.getClass(), "signum", 1);
        setIntElement(term4229, 0, -1972950250);
        setIntElement(term4229, 1, 1158581818);
        setIntElement(term4229, 2, 1884192502);
        setIntElement(term4229, 3, 1299154171);
        setField(term4228, term4228.getClass(), "mag", term4229);
        setIntField(term4228, term4228.getClass(), "bitCountPlusOne", 0);
        setIntField(term4228, term4228.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4228, term4228.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4228, term4228.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4227, term4227.getClass(), "value", term4228);
        setField(term4220, term4220.getClass(), "relativeHeaderOffset", term4227);
        setLongField(term4230, term4230.getClass(), "value", 5127676408959197577L);
        setField(term4220, term4220.getClass(), "diskStart", term4230);
        setByteElement(term4231, 0, (byte) -81);
        setByteElement(term4231, 1, (byte) 102);
        setField(term4220, term4220.getClass(), "rawCentralDirectoryData", term4231);
        term4232 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setLongField(term4232, term4232.getClass(), "value", 5127676408959197577L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
        Object[] args = new Object[1];
        args[0] = term1093;
        callMethod(klass, "setDiskStartNumber", argTypes, term1051, args);
        assertTrue(recursiveEquals(term1051, term4220));
        assertTrue(recursiveEquals(term1093, term4232));
    }

};


