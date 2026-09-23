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
import java.lang.String;

public class ZipArchiveEntry_isUnixSymlink_37003256914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7909;

    public ZipArchiveEntry_isUnixSymlink_37003256914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8062 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term8061 = ((Class) term8062).getDeclaredField((String) "HOURS");
        ((Field) term8061).setAccessible(true);
        Object enum30 = ((Field) term8061).get((Object) null);
        Class<? extends Object> term8239 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term8238 = ((Class) term8239).getDeclaredField((String) "NANOSECONDS");
        ((Field) term8238).setAccessible(true);
        Object enum31 = ((Field) term8238).get((Object) null);
        term7909 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term7918 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 4);
        Object term7919 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term7920 = (byte[]) newByteArray(2);
        byte[] term7923 = (byte[]) newByteArray(5);
        byte[] term7931 = (byte[]) newByteArray(0);
        Object term7932 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term7942 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term7961 = newInstance(Class.forName("java.time.Instant"));
        Object term7976 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term8001 = newInstance(Class.forName("java.time.Instant"));
        Object term8016 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term8018 = newInstance(Class.forName("java.time.Instant"));
        byte[] term8038 = (byte[]) newByteArray(2);
        setIntField(term7909, term7909.getClass(), "method", -1);
        setLongField(term7909, term7909.getClass(), "size", -1L);
        setIntField(term7909, term7909.getClass(), "internalAttributes", 1442160736);
        setIntField(term7909, term7909.getClass(), "versionRequired", 1114000454);
        setIntField(term7909, term7909.getClass(), "versionMadeBy", -556405712);
        setIntField(term7909, term7909.getClass(), "platform", -1772434990);
        setIntField(term7909, term7909.getClass(), "rawFlag", -1845499264);
        setLongField(term7909, term7909.getClass(), "externalAttributes", 4784595517102746672L);
        setField(term7909, term7909.getClass(), "extraFields", term7918);
        setByteElement(term7920, 0, (byte) -106);
        setByteElement(term7920, 1, (byte) -124);
        setField(term7919, term7919.getClass(), "localFileData", term7920);
        setByteElement(term7923, 0, (byte) -71);
        setByteElement(term7923, 1, (byte) 113);
        setByteElement(term7923, 2, (byte) -77);
        setByteElement(term7923, 3, (byte) -12);
        setByteElement(term7923, 4, (byte) 58);
        setField(term7919, term7919.getClass(), "centralDirectoryData", term7923);
        setField(term7909, term7909.getClass(), "unparseableExtra", term7919);
        setField(term7909, term7909.getClass(), "name", "");
        setField(term7909, term7909.getClass(), "rawName", term7931);
        setBooleanField(term7932, term7932.getClass(), "languageEncodingFlag", false);
        setBooleanField(term7932, term7932.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term7932, term7932.getClass(), "encryptionFlag", false);
        setBooleanField(term7932, term7932.getClass(), "strongEncryptionFlag", false);
        setIntField(term7932, term7932.getClass(), "slidingDictionarySize", 0);
        setIntField(term7932, term7932.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term7909, term7909.getClass(), "gpb", term7932);
        setLongField(term7909, term7909.getClass(), "xdostime", -1L);
        setField(term7942, term7942.getClass(), "unit", enum30);
        setLongField(term7942, term7942.getClass(), "value", -7612550318181586304L);
        setLongField(term7961, term7961.getClass(), "seconds", 1660012192L);
        setIntField(term7961, term7961.getClass(), "nanos", 918000000);
        setField(term7942, term7942.getClass(), "instant", term7961);
        setField(term7942, term7942.getClass(), "valueAsString", "xLbjWUgOIL");
        setField(term7909, term7909.getClass(), "mtime", term7942);
        setField(term7976, term7976.getClass(), "unit", enum31);
        setLongField(term7976, term7976.getClass(), "value", -2170847986967241072L);
        setLongField(term8001, term8001.getClass(), "seconds", 1876890800L);
        setIntField(term8001, term8001.getClass(), "nanos", 559000000);
        setField(term7976, term7976.getClass(), "instant", term8001);
        setField(term7976, term7976.getClass(), "valueAsString", "jDtqGUpnZN");
        setField(term7909, term7909.getClass(), "atime", term7976);
        setField(term8016, term8016.getClass(), "unit", enum31);
        setLongField(term8016, term8016.getClass(), "value", 4044358158040652353L);
        setLongField(term8018, term8018.getClass(), "seconds", 1304550099L);
        setIntField(term8018, term8018.getClass(), "nanos", 366000000);
        setField(term8016, term8016.getClass(), "instant", term8018);
        setField(term8016, term8016.getClass(), "valueAsString", "nGKItKLYNC");
        setField(term7909, term7909.getClass(), "ctime", term8016);
        setLongField(term7909, term7909.getClass(), "crc", -1L);
        setLongField(term7909, term7909.getClass(), "csize", -1L);
        setIntField(term7909, term7909.getClass(), "flag", -505439934);
        setByteElement(term8038, 0, (byte) 12);
        setByteElement(term8038, 1, (byte) 79);
        setField(term7909, term7909.getClass(), "extra", term8038);
        setField(term7909, term7909.getClass(), "comment", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUnixSymlink", argTypes, term7909, args);
    }

};


