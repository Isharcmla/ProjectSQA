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
import java.util.LinkedHashMap;
import java.lang.Object;
import java.lang.String;

public class ZipArchiveEntry_hashCode_54369189137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23716;

    public ZipArchiveEntry_hashCode_54369189137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term23722 = new LinkedHashMap();
        Class<? extends Object> term23858 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term23857 = ((Class) term23858).getDeclaredField((String) "DAYS");
        ((Field) term23857).setAccessible(true);
        Object enum89 = ((Field) term23857).get((Object) null);
        term23716 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term23733 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term23734 = (byte[]) newByteArray(2);
        byte[] term23737 = (byte[]) newByteArray(5);
        byte[] term23745 = (byte[]) newByteArray(1);
        Object term23747 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term23755 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term23773 = newInstance(Class.forName("java.time.Instant"));
        Object term23788 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term23790 = newInstance(Class.forName("java.time.Instant"));
        Object term23805 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term23807 = newInstance(Class.forName("java.time.Instant"));
        byte[] term23827 = (byte[]) newByteArray(8);
        setIntField(term23716, term23716.getClass(), "method", -1);
        setLongField(term23716, term23716.getClass(), "size", -1L);
        setIntField(term23716, term23716.getClass(), "internalAttributes", 318591690);
        setIntField(term23716, term23716.getClass(), "platform", -165587447);
        setLongField(term23716, term23716.getClass(), "externalAttributes", 7495904023107549024L);
        setField(term23716, term23716.getClass(), "extraFields", term23722);
        setByteElement(term23734, 0, (byte) 56);
        setByteElement(term23734, 1, (byte) -61);
        setField(term23733, term23733.getClass(), "localFileData", term23734);
        setByteElement(term23737, 0, (byte) -108);
        setByteElement(term23737, 1, (byte) 10);
        setByteElement(term23737, 2, (byte) -83);
        setByteElement(term23737, 3, (byte) -117);
        setByteElement(term23737, 4, (byte) 97);
        setField(term23733, term23733.getClass(), "centralDirectoryData", term23737);
        setField(term23716, term23716.getClass(), "unparseableExtra", term23733);
        setField(term23716, term23716.getClass(), "name", "");
        setByteElement(term23745, 0, (byte) 100);
        setField(term23716, term23716.getClass(), "rawName", term23745);
        setBooleanField(term23747, term23747.getClass(), "languageEncodingFlag", false);
        setBooleanField(term23747, term23747.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term23747, term23747.getClass(), "encryptionFlag", false);
        setBooleanField(term23747, term23747.getClass(), "strongEncryptionFlag", false);
        setField(term23716, term23716.getClass(), "gpb", term23747);
        setLongField(term23716, term23716.getClass(), "xdostime", -1L);
        setField(term23755, term23755.getClass(), "unit", enum89);
        setLongField(term23755, term23755.getClass(), "value", 8802866251294305945L);
        setLongField(term23773, term23773.getClass(), "seconds", 1618612705L);
        setIntField(term23773, term23773.getClass(), "nanos", 278000000);
        setField(term23755, term23755.getClass(), "instant", term23773);
        setField(term23755, term23755.getClass(), "valueAsString", "mvrkADEgpp");
        setField(term23716, term23716.getClass(), "mtime", term23755);
        setField(term23788, term23788.getClass(), "unit", enum89);
        setLongField(term23788, term23788.getClass(), "value", 4513004407927379358L);
        setLongField(term23790, term23790.getClass(), "seconds", 1584154591L);
        setIntField(term23790, term23790.getClass(), "nanos", 305000000);
        setField(term23788, term23788.getClass(), "instant", term23790);
        setField(term23788, term23788.getClass(), "valueAsString", "pXOkjyeIRb");
        setField(term23716, term23716.getClass(), "atime", term23788);
        setField(term23805, term23805.getClass(), "unit", enum89);
        setLongField(term23805, term23805.getClass(), "value", -7115418542247301000L);
        setLongField(term23807, term23807.getClass(), "seconds", 1309150342L);
        setIntField(term23807, term23807.getClass(), "nanos", 717000000);
        setField(term23805, term23805.getClass(), "instant", term23807);
        setField(term23805, term23805.getClass(), "valueAsString", "GgZWSjxjyE");
        setField(term23716, term23716.getClass(), "ctime", term23805);
        setLongField(term23716, term23716.getClass(), "crc", -1L);
        setLongField(term23716, term23716.getClass(), "csize", -1L);
        setIntField(term23716, term23716.getClass(), "flag", 806595993);
        setByteElement(term23827, 0, (byte) 79);
        setByteElement(term23827, 1, (byte) -56);
        setByteElement(term23827, 2, (byte) 105);
        setByteElement(term23827, 3, (byte) -8);
        setByteElement(term23827, 4, (byte) 62);
        setByteElement(term23827, 5, (byte) 38);
        setByteElement(term23827, 6, (byte) 31);
        setByteElement(term23827, 7, (byte) -105);
        setField(term23716, term23716.getClass(), "extra", term23827);
        setField(term23716, term23716.getClass(), "comment", "EeBVbzjcCI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term23716, args);
    }

};


