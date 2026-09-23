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

public class ZipArchiveEntry_addExtraField_64781258419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11393;

    public ZipArchiveEntry_addExtraField_64781258419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term11399 = new LinkedHashMap();
        Class<? extends Object> term11607 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term11606 = ((Class) term11607).getDeclaredField((String) "SECONDS");
        ((Field) term11606).setAccessible(true);
        Object enum43 = ((Field) term11606).get((Object) null);
        Class<? extends Object> term11790 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term11789 = ((Class) term11790).getDeclaredField((String) "MINUTES");
        ((Field) term11789).setAccessible(true);
        Object enum44 = ((Field) term11789).get((Object) null);
        Class<? extends Object> term11973 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term11972 = ((Class) term11973).getDeclaredField((String) "MICROSECONDS");
        ((Field) term11972).setAccessible(true);
        Object enum45 = ((Field) term11972).get((Object) null);
        term11393 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term11410 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term11411 = (byte[]) newByteArray(9);
        byte[] term11421 = (byte[]) newByteArray(7);
        byte[] term11431 = (byte[]) newByteArray(6);
        Object term11438 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term11446 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term11467 = newInstance(Class.forName("java.time.Instant"));
        Object term11482 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term11503 = newInstance(Class.forName("java.time.Instant"));
        Object term11518 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term11544 = newInstance(Class.forName("java.time.Instant"));
        byte[] term11564 = (byte[]) newByteArray(6);
        setIntField(term11393, term11393.getClass(), "method", -1);
        setLongField(term11393, term11393.getClass(), "size", -1L);
        setIntField(term11393, term11393.getClass(), "internalAttributes", -894662986);
        setIntField(term11393, term11393.getClass(), "platform", 304775596);
        setLongField(term11393, term11393.getClass(), "externalAttributes", 2062173786000223358L);
        setField(term11393, term11393.getClass(), "extraFields", term11399);
        setByteElement(term11411, 0, (byte) 90);
        setByteElement(term11411, 1, (byte) -34);
        setByteElement(term11411, 2, (byte) -2);
        setByteElement(term11411, 3, (byte) 96);
        setByteElement(term11411, 4, (byte) 55);
        setByteElement(term11411, 5, (byte) -103);
        setByteElement(term11411, 6, (byte) -103);
        setByteElement(term11411, 7, (byte) -98);
        setByteElement(term11411, 8, (byte) -119);
        setField(term11410, term11410.getClass(), "localFileData", term11411);
        setByteElement(term11421, 0, (byte) 120);
        setByteElement(term11421, 1, (byte) -15);
        setByteElement(term11421, 2, (byte) 115);
        setByteElement(term11421, 3, (byte) 52);
        setByteElement(term11421, 4, (byte) 96);
        setByteElement(term11421, 5, (byte) 40);
        setByteElement(term11421, 6, (byte) -5);
        setField(term11410, term11410.getClass(), "centralDirectoryData", term11421);
        setField(term11393, term11393.getClass(), "unparseableExtra", term11410);
        setField(term11393, term11393.getClass(), "name", "");
        setByteElement(term11431, 0, (byte) 24);
        setByteElement(term11431, 1, (byte) -39);
        setByteElement(term11431, 2, (byte) 30);
        setByteElement(term11431, 3, (byte) -119);
        setByteElement(term11431, 4, (byte) 94);
        setByteElement(term11431, 5, (byte) -52);
        setField(term11393, term11393.getClass(), "rawName", term11431);
        setBooleanField(term11438, term11438.getClass(), "languageEncodingFlag", false);
        setBooleanField(term11438, term11438.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term11438, term11438.getClass(), "encryptionFlag", false);
        setBooleanField(term11438, term11438.getClass(), "strongEncryptionFlag", false);
        setField(term11393, term11393.getClass(), "gpb", term11438);
        setLongField(term11393, term11393.getClass(), "xdostime", -1L);
        setField(term11446, term11446.getClass(), "unit", enum43);
        setLongField(term11446, term11446.getClass(), "value", -8658027316505137504L);
        setLongField(term11467, term11467.getClass(), "seconds", 1741462563L);
        setIntField(term11467, term11467.getClass(), "nanos", 811000000);
        setField(term11446, term11446.getClass(), "instant", term11467);
        setField(term11446, term11446.getClass(), "valueAsString", "tPlsykYBqO");
        setField(term11393, term11393.getClass(), "mtime", term11446);
        setField(term11482, term11482.getClass(), "unit", enum44);
        setLongField(term11482, term11482.getClass(), "value", 414749984815662075L);
        setLongField(term11503, term11503.getClass(), "seconds", 1762012701L);
        setIntField(term11503, term11503.getClass(), "nanos", 322000000);
        setField(term11482, term11482.getClass(), "instant", term11503);
        setField(term11482, term11482.getClass(), "valueAsString", "bLPjGVBhlX");
        setField(term11393, term11393.getClass(), "atime", term11482);
        setField(term11518, term11518.getClass(), "unit", enum45);
        setLongField(term11518, term11518.getClass(), "value", 463622836963501975L);
        setLongField(term11544, term11544.getClass(), "seconds", 1695443269L);
        setIntField(term11544, term11544.getClass(), "nanos", 458000000);
        setField(term11518, term11518.getClass(), "instant", term11544);
        setField(term11518, term11518.getClass(), "valueAsString", "whBvTVIIlC");
        setField(term11393, term11393.getClass(), "ctime", term11518);
        setLongField(term11393, term11393.getClass(), "crc", -1L);
        setLongField(term11393, term11393.getClass(), "csize", -1L);
        setIntField(term11393, term11393.getClass(), "flag", -1888585309);
        setByteElement(term11564, 0, (byte) -33);
        setByteElement(term11564, 1, (byte) 16);
        setByteElement(term11564, 2, (byte) 20);
        setByteElement(term11564, 3, (byte) -114);
        setByteElement(term11564, 4, (byte) 93);
        setByteElement(term11564, 5, (byte) -60);
        setField(term11393, term11393.getClass(), "extra", term11564);
        setField(term11393, term11393.getClass(), "comment", "IgRJUzaCwW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addExtraField", argTypes, term11393, args);
    }

};


