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

public class ZipArchiveEntry_setExtraFields_205839310016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9303;
     Object term9484;

    public ZipArchiveEntry_setExtraFields_205839310016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term9309 = new LinkedHashMap();
        Class<? extends Object> term9500 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term9499 = ((Class) term9500).getDeclaredField((String) "MICROSECONDS");
        ((Field) term9499).setAccessible(true);
        Object enum35 = ((Field) term9499).get((Object) null);
        Class<? extends Object> term9698 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term9697 = ((Class) term9698).getDeclaredField((String) "DAYS");
        ((Field) term9697).setAccessible(true);
        Object enum36 = ((Field) term9697).get((Object) null);
        Class<? extends Object> term9872 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term9871 = ((Class) term9872).getDeclaredField((String) "MILLISECONDS");
        ((Field) term9871).setAccessible(true);
        Object enum37 = ((Field) term9871).get((Object) null);
        term9303 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term9320 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term9321 = (byte[]) newByteArray(7);
        byte[] term9329 = (byte[]) newByteArray(3);
        byte[] term9335 = (byte[]) newByteArray(4);
        Object term9340 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term9348 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term9374 = newInstance(Class.forName("java.time.Instant"));
        Object term9389 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term9407 = newInstance(Class.forName("java.time.Instant"));
        Object term9422 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term9448 = newInstance(Class.forName("java.time.Instant"));
        byte[] term9468 = (byte[]) newByteArray(2);
        setIntField(term9303, term9303.getClass(), "method", -1);
        setLongField(term9303, term9303.getClass(), "size", -1L);
        setIntField(term9303, term9303.getClass(), "internalAttributes", 972867650);
        setIntField(term9303, term9303.getClass(), "platform", 1655935355);
        setLongField(term9303, term9303.getClass(), "externalAttributes", -1154553077993834885L);
        setField(term9303, term9303.getClass(), "extraFields", term9309);
        setByteElement(term9321, 0, (byte) -125);
        setByteElement(term9321, 1, (byte) 100);
        setByteElement(term9321, 2, (byte) -1);
        setByteElement(term9321, 3, (byte) -127);
        setByteElement(term9321, 4, (byte) -118);
        setByteElement(term9321, 5, (byte) 69);
        setByteElement(term9321, 6, (byte) 112);
        setField(term9320, term9320.getClass(), "localFileData", term9321);
        setByteElement(term9329, 0, (byte) 77);
        setByteElement(term9329, 1, (byte) -1);
        setByteElement(term9329, 2, (byte) -83);
        setField(term9320, term9320.getClass(), "centralDirectoryData", term9329);
        setField(term9303, term9303.getClass(), "unparseableExtra", term9320);
        setField(term9303, term9303.getClass(), "name", "");
        setByteElement(term9335, 0, (byte) -63);
        setByteElement(term9335, 1, (byte) 108);
        setByteElement(term9335, 2, (byte) -105);
        setByteElement(term9335, 3, (byte) 33);
        setField(term9303, term9303.getClass(), "rawName", term9335);
        setBooleanField(term9340, term9340.getClass(), "languageEncodingFlag", false);
        setBooleanField(term9340, term9340.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term9340, term9340.getClass(), "encryptionFlag", false);
        setBooleanField(term9340, term9340.getClass(), "strongEncryptionFlag", false);
        setField(term9303, term9303.getClass(), "gpb", term9340);
        setLongField(term9303, term9303.getClass(), "xdostime", -1L);
        setField(term9348, term9348.getClass(), "unit", enum35);
        setLongField(term9348, term9348.getClass(), "value", -2850532706972744550L);
        setLongField(term9374, term9374.getClass(), "seconds", 1464439789L);
        setIntField(term9374, term9374.getClass(), "nanos", 888000000);
        setField(term9348, term9348.getClass(), "instant", term9374);
        setField(term9348, term9348.getClass(), "valueAsString", "ffYhPOzlUs");
        setField(term9303, term9303.getClass(), "mtime", term9348);
        setField(term9389, term9389.getClass(), "unit", enum36);
        setLongField(term9389, term9389.getClass(), "value", -2644215923136513282L);
        setLongField(term9407, term9407.getClass(), "seconds", 1405297189L);
        setIntField(term9407, term9407.getClass(), "nanos", 488000000);
        setField(term9389, term9389.getClass(), "instant", term9407);
        setField(term9389, term9389.getClass(), "valueAsString", "MLqYREekMl");
        setField(term9303, term9303.getClass(), "atime", term9389);
        setField(term9422, term9422.getClass(), "unit", enum37);
        setLongField(term9422, term9422.getClass(), "value", -1468719814009985452L);
        setLongField(term9448, term9448.getClass(), "seconds", 1822722644L);
        setIntField(term9448, term9448.getClass(), "nanos", 50000000);
        setField(term9422, term9422.getClass(), "instant", term9448);
        setField(term9422, term9422.getClass(), "valueAsString", "ytSBIKXogI");
        setField(term9303, term9303.getClass(), "ctime", term9422);
        setLongField(term9303, term9303.getClass(), "crc", -1L);
        setLongField(term9303, term9303.getClass(), "csize", -1L);
        setIntField(term9303, term9303.getClass(), "flag", 1240914516);
        setByteElement(term9468, 0, (byte) 109);
        setByteElement(term9468, 1, (byte) -54);
        setField(term9303, term9303.getClass(), "extra", term9468);
        setField(term9303, term9303.getClass(), "comment", "nHXjMycHlU");
        term9484 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9484;
        callMethod(klass, "setExtraFields", argTypes, term9303, args);
    }

};


