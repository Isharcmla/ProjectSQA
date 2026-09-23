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
import java.lang.Object;

public class Zip64ExtendedInformationExtraField_addSizes_118021049819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1109;
     Object term1157;

    public Zip64ExtendedInformationExtraField_addSizes_118021049819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1109 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term1110 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1111 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1113 = (int[]) newIntArray(4);
        Object term1122 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1123 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1125 = (int[]) newIntArray(4);
        Object term1134 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term1135 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1137 = (int[]) newIntArray(4);
        Object term1146 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        byte[] term1148 = (byte[]) newByteArray(8);
        setIntField(term1111, term1111.getClass(), "signum", 1);
        setIntElement(term1113, 0, -14775137);
        setIntElement(term1113, 1, -1380788073);
        setIntElement(term1113, 2, -1043455465);
        setIntElement(term1113, 3, 1812557668);
        setField(term1111, term1111.getClass(), "mag", term1113);
        setIntField(term1111, term1111.getClass(), "bitCountPlusOne", 0);
        setIntField(term1111, term1111.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1111, term1111.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1111, term1111.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1110, term1110.getClass(), "value", term1111);
        setField(term1109, term1109.getClass(), "size", term1110);
        setIntField(term1123, term1123.getClass(), "signum", 1);
        setIntElement(term1125, 0, -1758331737);
        setIntElement(term1125, 1, 567655499);
        setIntElement(term1125, 2, 1829742523);
        setIntElement(term1125, 3, -898778164);
        setField(term1123, term1123.getClass(), "mag", term1125);
        setIntField(term1123, term1123.getClass(), "bitCountPlusOne", 0);
        setIntField(term1123, term1123.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1123, term1123.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1123, term1123.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1122, term1122.getClass(), "value", term1123);
        setField(term1109, term1109.getClass(), "compressedSize", term1122);
        setIntField(term1135, term1135.getClass(), "signum", 1);
        setIntElement(term1137, 0, -1419311421);
        setIntElement(term1137, 1, 1372082494);
        setIntElement(term1137, 2, -1892543811);
        setIntElement(term1137, 3, 1524410079);
        setField(term1135, term1135.getClass(), "mag", term1137);
        setIntField(term1135, term1135.getClass(), "bitCountPlusOne", 0);
        setIntField(term1135, term1135.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1135, term1135.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1135, term1135.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1134, term1134.getClass(), "value", term1135);
        setField(term1109, term1109.getClass(), "relativeHeaderOffset", term1134);
        setLongField(term1146, term1146.getClass(), "value", -6573104506744284592L);
        setField(term1109, term1109.getClass(), "diskStart", term1146);
        setByteElement(term1148, 0, (byte) -118);
        setByteElement(term1148, 1, (byte) -126);
        setByteElement(term1148, 2, (byte) -91);
        setByteElement(term1148, 3, (byte) -104);
        setByteElement(term1148, 4, (byte) -89);
        setByteElement(term1148, 5, (byte) 13);
        setByteElement(term1148, 6, (byte) 44);
        setByteElement(term1148, 7, (byte) -63);
        setField(term1109, term1109.getClass(), "rawCentralDirectoryData", term1148);
        term1157 = (byte[]) newByteArray(6);
        setByteElement(term1157, 0, (byte) 15);
        setByteElement(term1157, 1, (byte) 45);
        setByteElement(term1157, 2, (byte) -39);
        setByteElement(term1157, 3, (byte) -20);
        setByteElement(term1157, 4, (byte) 10);
        setByteElement(term1157, 5, (byte) 77);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1157;
        callMethod(klass, "addSizes", argTypes, term1109, args);
    }

};


