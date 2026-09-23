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
import java.lang.Integer;

public class ZipArchiveEntry_setInternalAttributes_18264968929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4322;
     Object term4500;

    public ZipArchiveEntry_setInternalAttributes_18264968929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term4328 = new LinkedHashMap();
        Class<? extends Object> term4516 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term4515 = ((Class) term4516).getDeclaredField((String) "DAYS");
        ((Field) term4515).setAccessible(true);
        Object enum16 = ((Field) term4515).get((Object) null);
        Class<? extends Object> term4690 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term4689 = ((Class) term4690).getDeclaredField((String) "MICROSECONDS");
        ((Field) term4689).setAccessible(true);
        Object enum17 = ((Field) term4689).get((Object) null);
        Class<? extends Object> term4888 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term4887 = ((Class) term4888).getDeclaredField((String) "MINUTES");
        ((Field) term4887).setAccessible(true);
        Object enum18 = ((Field) term4887).get((Object) null);
        term4322 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term4339 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term4340 = (byte[]) newByteArray(1);
        byte[] term4342 = (byte[]) newByteArray(9);
        byte[] term4354 = (byte[]) newByteArray(3);
        Object term4358 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term4366 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term4384 = newInstance(Class.forName("java.time.Instant"));
        Object term4399 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term4425 = newInstance(Class.forName("java.time.Instant"));
        Object term4440 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term4461 = newInstance(Class.forName("java.time.Instant"));
        byte[] term4481 = (byte[]) newByteArray(5);
        setIntField(term4322, term4322.getClass(), "method", -1);
        setLongField(term4322, term4322.getClass(), "size", -1L);
        setIntField(term4322, term4322.getClass(), "internalAttributes", -1087774327);
        setIntField(term4322, term4322.getClass(), "platform", -1530420153);
        setLongField(term4322, term4322.getClass(), "externalAttributes", -4365849114644724155L);
        setField(term4322, term4322.getClass(), "extraFields", term4328);
        setByteElement(term4340, 0, (byte) 35);
        setField(term4339, term4339.getClass(), "localFileData", term4340);
        setByteElement(term4342, 0, (byte) 66);
        setByteElement(term4342, 1, (byte) 123);
        setByteElement(term4342, 2, (byte) -5);
        setByteElement(term4342, 3, (byte) 84);
        setByteElement(term4342, 4, (byte) -97);
        setByteElement(term4342, 5, (byte) -24);
        setByteElement(term4342, 6, (byte) 88);
        setByteElement(term4342, 7, (byte) 96);
        setByteElement(term4342, 8, (byte) 70);
        setField(term4339, term4339.getClass(), "centralDirectoryData", term4342);
        setField(term4322, term4322.getClass(), "unparseableExtra", term4339);
        setField(term4322, term4322.getClass(), "name", "");
        setByteElement(term4354, 0, (byte) 48);
        setByteElement(term4354, 1, (byte) -46);
        setByteElement(term4354, 2, (byte) -128);
        setField(term4322, term4322.getClass(), "rawName", term4354);
        setBooleanField(term4358, term4358.getClass(), "languageEncodingFlag", false);
        setBooleanField(term4358, term4358.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term4358, term4358.getClass(), "encryptionFlag", false);
        setBooleanField(term4358, term4358.getClass(), "strongEncryptionFlag", false);
        setField(term4322, term4322.getClass(), "gpb", term4358);
        setLongField(term4322, term4322.getClass(), "xdostime", -1L);
        setField(term4366, term4366.getClass(), "unit", enum16);
        setLongField(term4366, term4366.getClass(), "value", 2486810210675247493L);
        setLongField(term4384, term4384.getClass(), "seconds", 1668587229L);
        setIntField(term4384, term4384.getClass(), "nanos", 825000000);
        setField(term4366, term4366.getClass(), "instant", term4384);
        setField(term4366, term4366.getClass(), "valueAsString", "IoAlmYsBwc");
        setField(term4322, term4322.getClass(), "mtime", term4366);
        setField(term4399, term4399.getClass(), "unit", enum17);
        setLongField(term4399, term4399.getClass(), "value", 7009926388951271268L);
        setLongField(term4425, term4425.getClass(), "seconds", 1725140217L);
        setIntField(term4425, term4425.getClass(), "nanos", 647000000);
        setField(term4399, term4399.getClass(), "instant", term4425);
        setField(term4399, term4399.getClass(), "valueAsString", "TEParAifyi");
        setField(term4322, term4322.getClass(), "atime", term4399);
        setField(term4440, term4440.getClass(), "unit", enum18);
        setLongField(term4440, term4440.getClass(), "value", -7672528020740371001L);
        setLongField(term4461, term4461.getClass(), "seconds", 1550716994L);
        setIntField(term4461, term4461.getClass(), "nanos", 689000000);
        setField(term4440, term4440.getClass(), "instant", term4461);
        setField(term4440, term4440.getClass(), "valueAsString", "OWDIEULEFu");
        setField(term4322, term4322.getClass(), "ctime", term4440);
        setLongField(term4322, term4322.getClass(), "crc", -1L);
        setLongField(term4322, term4322.getClass(), "csize", -1L);
        setIntField(term4322, term4322.getClass(), "flag", -1145578966);
        setByteElement(term4481, 0, (byte) 66);
        setByteElement(term4481, 1, (byte) -112);
        setByteElement(term4481, 2, (byte) 81);
        setByteElement(term4481, 3, (byte) 65);
        setByteElement(term4481, 4, (byte) -44);
        setField(term4322, term4322.getClass(), "extra", term4481);
        setField(term4322, term4322.getClass(), "comment", "dWRymuLBtr");
        term4500 = new Integer(1962444399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4500;
        callMethod(klass, "setInternalAttributes", argTypes, term4322, args);
    }

};


