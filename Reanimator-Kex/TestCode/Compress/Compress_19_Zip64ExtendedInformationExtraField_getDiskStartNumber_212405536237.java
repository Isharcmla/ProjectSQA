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

public class Zip64ExtendedInformationExtraField_getDiskStartNumber_212405536237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term999;
     Object term4142;
     Object term4102;

    public Zip64ExtendedInformationExtraField_getDiskStartNumber_212405536237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term999 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term1000 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1001 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1003 = (int[]) newIntArray(4);
        Object term1012 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1013 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1015 = (int[]) newIntArray(4);
        Object term1024 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1025 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1027 = (int[]) newIntArray(4);
        Object term1036 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term1038 = (byte[]) newByteArray(0);
        setIntField(term1001, term1001.getClass(), "signum", 1);
        setIntElement(term1003, 0, -96625993);
        setIntElement(term1003, 1, 858831425);
        setIntElement(term1003, 2, 2048299238);
        setIntElement(term1003, 3, 1415585975);
        setField(term1001, term1001.getClass(), "mag", term1003);
        setIntField(term1001, term1001.getClass(), "bitCountPlusOne", 0);
        setIntField(term1001, term1001.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1001, term1001.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1001, term1001.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1000, term1000.getClass(), "value", term1001);
        setField(term999, term999.getClass(), "size", term1000);
        setIntField(term1013, term1013.getClass(), "signum", 1);
        setIntElement(term1015, 0, -595426672);
        setIntElement(term1015, 1, 1740761777);
        setIntElement(term1015, 2, -1048016766);
        setIntElement(term1015, 3, 665122013);
        setField(term1013, term1013.getClass(), "mag", term1015);
        setIntField(term1013, term1013.getClass(), "bitCountPlusOne", 0);
        setIntField(term1013, term1013.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1013, term1013.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1013, term1013.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1012, term1012.getClass(), "value", term1013);
        setField(term999, term999.getClass(), "compressedSize", term1012);
        setIntField(term1025, term1025.getClass(), "signum", 1);
        setIntElement(term1027, 0, -900530926);
        setIntElement(term1027, 1, 156639734);
        setIntElement(term1027, 2, 334540975);
        setIntElement(term1027, 3, -1716710608);
        setField(term1025, term1025.getClass(), "mag", term1027);
        setIntField(term1025, term1025.getClass(), "bitCountPlusOne", 0);
        setIntField(term1025, term1025.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1025, term1025.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1025, term1025.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1024, term1024.getClass(), "value", term1025);
        setField(term999, term999.getClass(), "relativeHeaderOffset", term1024);
        setLongField(term1036, term1036.getClass(), "value", -872011222785455006L);
        setField(term999, term999.getClass(), "diskStart", term1036);
        setField(term999, term999.getClass(), "rawCentralDirectoryData", term1038);
        term4142 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term4143 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term4144 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4145 = (int[]) newIntArray(4);
        Object term4146 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term4147 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4148 = (int[]) newIntArray(4);
        Object term4149 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term4150 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4151 = (int[]) newIntArray(4);
        Object term4152 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term4153 = (byte[]) newByteArray(0);
        setIntField(term4144, term4144.getClass(), "signum", 1);
        setIntElement(term4145, 0, -96625993);
        setIntElement(term4145, 1, 858831425);
        setIntElement(term4145, 2, 2048299238);
        setIntElement(term4145, 3, 1415585975);
        setField(term4144, term4144.getClass(), "mag", term4145);
        setIntField(term4144, term4144.getClass(), "bitCountPlusOne", 0);
        setIntField(term4144, term4144.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4144, term4144.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4144, term4144.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4143, term4143.getClass(), "value", term4144);
        setField(term4142, term4142.getClass(), "size", term4143);
        setIntField(term4147, term4147.getClass(), "signum", 1);
        setIntElement(term4148, 0, -595426672);
        setIntElement(term4148, 1, 1740761777);
        setIntElement(term4148, 2, -1048016766);
        setIntElement(term4148, 3, 665122013);
        setField(term4147, term4147.getClass(), "mag", term4148);
        setIntField(term4147, term4147.getClass(), "bitCountPlusOne", 0);
        setIntField(term4147, term4147.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4147, term4147.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4147, term4147.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4146, term4146.getClass(), "value", term4147);
        setField(term4142, term4142.getClass(), "compressedSize", term4146);
        setIntField(term4150, term4150.getClass(), "signum", 1);
        setIntElement(term4151, 0, -900530926);
        setIntElement(term4151, 1, 156639734);
        setIntElement(term4151, 2, 334540975);
        setIntElement(term4151, 3, -1716710608);
        setField(term4150, term4150.getClass(), "mag", term4151);
        setIntField(term4150, term4150.getClass(), "bitCountPlusOne", 0);
        setIntField(term4150, term4150.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4150, term4150.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4150, term4150.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4149, term4149.getClass(), "value", term4150);
        setField(term4142, term4142.getClass(), "relativeHeaderOffset", term4149);
        setLongField(term4152, term4152.getClass(), "value", -872011222785455006L);
        setField(term4142, term4142.getClass(), "diskStart", term4152);
        setField(term4142, term4142.getClass(), "rawCentralDirectoryData", term4153);
        term4102 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setLongField(term4102, term4102.getClass(), "value", -872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDiskStartNumber", argTypes, term999, args);
        assertTrue(recursiveEquals(term999, term4142));
        assertTrue(recursiveEquals(retValue, term4102));
    }

};


