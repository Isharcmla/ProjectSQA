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

public class ZipArchiveEntry_getPlatform_202341241714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7923;

    public ZipArchiveEntry_getPlatform_202341241714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term7929 = new LinkedHashMap();
        Class<? extends Object> term8105 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term8104 = ((Class) term8105).getDeclaredField((String) "HOURS");
        ((Field) term8104).setAccessible(true);
        Object enum30 = ((Field) term8104).get((Object) null);
        Class<? extends Object> term8282 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term8281 = ((Class) term8282).getDeclaredField((String) "NANOSECONDS");
        ((Field) term8281).setAccessible(true);
        Object enum31 = ((Field) term8281).get((Object) null);
        term7923 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term7940 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term7941 = (byte[]) newByteArray(8);
        byte[] term7950 = (byte[]) newByteArray(6);
        byte[] term7959 = (byte[]) newByteArray(2);
        Object term7962 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term7970 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term7989 = newInstance(Class.forName("java.time.Instant"));
        Object term8004 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term8029 = newInstance(Class.forName("java.time.Instant"));
        Object term8044 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term8046 = newInstance(Class.forName("java.time.Instant"));
        byte[] term8066 = (byte[]) newByteArray(8);
        setIntField(term7923, term7923.getClass(), "method", -1);
        setLongField(term7923, term7923.getClass(), "size", -1L);
        setIntField(term7923, term7923.getClass(), "internalAttributes", -93135961);
        setIntField(term7923, term7923.getClass(), "platform", -112921587);
        setLongField(term7923, term7923.getClass(), "externalAttributes", 4784595517102746672L);
        setField(term7923, term7923.getClass(), "extraFields", term7929);
        setByteElement(term7941, 0, (byte) -2);
        setByteElement(term7941, 1, (byte) 103);
        setByteElement(term7941, 2, (byte) 23);
        setByteElement(term7941, 3, (byte) 96);
        setByteElement(term7941, 4, (byte) -70);
        setByteElement(term7941, 5, (byte) -73);
        setByteElement(term7941, 6, (byte) 1);
        setByteElement(term7941, 7, (byte) 99);
        setField(term7940, term7940.getClass(), "localFileData", term7941);
        setByteElement(term7950, 0, (byte) -121);
        setByteElement(term7950, 1, (byte) -50);
        setByteElement(term7950, 2, (byte) -79);
        setByteElement(term7950, 3, (byte) 110);
        setByteElement(term7950, 4, (byte) -111);
        setByteElement(term7950, 5, (byte) -54);
        setField(term7940, term7940.getClass(), "centralDirectoryData", term7950);
        setField(term7923, term7923.getClass(), "unparseableExtra", term7940);
        setField(term7923, term7923.getClass(), "name", "");
        setByteElement(term7959, 0, (byte) -25);
        setByteElement(term7959, 1, (byte) -35);
        setField(term7923, term7923.getClass(), "rawName", term7959);
        setBooleanField(term7962, term7962.getClass(), "languageEncodingFlag", false);
        setBooleanField(term7962, term7962.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term7962, term7962.getClass(), "encryptionFlag", false);
        setBooleanField(term7962, term7962.getClass(), "strongEncryptionFlag", false);
        setField(term7923, term7923.getClass(), "gpb", term7962);
        setLongField(term7923, term7923.getClass(), "xdostime", -1L);
        setField(term7970, term7970.getClass(), "unit", enum30);
        setLongField(term7970, term7970.getClass(), "value", -7612550318181586304L);
        setLongField(term7989, term7989.getClass(), "seconds", 1660012192L);
        setIntField(term7989, term7989.getClass(), "nanos", 918000000);
        setField(term7970, term7970.getClass(), "instant", term7989);
        setField(term7970, term7970.getClass(), "valueAsString", "xLbjWUgOIL");
        setField(term7923, term7923.getClass(), "mtime", term7970);
        setField(term8004, term8004.getClass(), "unit", enum31);
        setLongField(term8004, term8004.getClass(), "value", -2170847986967241072L);
        setLongField(term8029, term8029.getClass(), "seconds", 1876890800L);
        setIntField(term8029, term8029.getClass(), "nanos", 559000000);
        setField(term8004, term8004.getClass(), "instant", term8029);
        setField(term8004, term8004.getClass(), "valueAsString", "jDtqGUpnZN");
        setField(term7923, term7923.getClass(), "atime", term8004);
        setField(term8044, term8044.getClass(), "unit", enum31);
        setLongField(term8044, term8044.getClass(), "value", 4044358158040652353L);
        setLongField(term8046, term8046.getClass(), "seconds", 1304550099L);
        setIntField(term8046, term8046.getClass(), "nanos", 366000000);
        setField(term8044, term8044.getClass(), "instant", term8046);
        setField(term8044, term8044.getClass(), "valueAsString", "nGKItKLYNC");
        setField(term7923, term7923.getClass(), "ctime", term8044);
        setLongField(term7923, term7923.getClass(), "crc", -1L);
        setLongField(term7923, term7923.getClass(), "csize", -1L);
        setIntField(term7923, term7923.getClass(), "flag", 287287233);
        setByteElement(term8066, 0, (byte) 3);
        setByteElement(term8066, 1, (byte) -10);
        setByteElement(term8066, 2, (byte) -106);
        setByteElement(term8066, 3, (byte) -124);
        setByteElement(term8066, 4, (byte) -71);
        setByteElement(term8066, 5, (byte) 113);
        setByteElement(term8066, 6, (byte) -77);
        setByteElement(term8066, 7, (byte) -12);
        setField(term7923, term7923.getClass(), "extra", term8066);
        setField(term7923, term7923.getClass(), "comment", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlatform", argTypes, term7923, args);
    }

};


