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
import java.lang.Long;

public class ZipArchiveEntry_setExternalAttributes_4598311811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5856;
     Object term6032;

    public ZipArchiveEntry_setExternalAttributes_4598311811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term5862 = new LinkedHashMap();
        Class<? extends Object> term6049 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term6048 = ((Class) term6049).getDeclaredField((String) "DAYS");
        ((Field) term6048).setAccessible(true);
        Object enum22 = ((Field) term6048).get((Object) null);
        Class<? extends Object> term6223 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term6222 = ((Class) term6223).getDeclaredField((String) "MILLISECONDS");
        ((Field) term6222).setAccessible(true);
        Object enum23 = ((Field) term6222).get((Object) null);
        Class<? extends Object> term6421 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term6420 = ((Class) term6421).getDeclaredField((String) "SECONDS");
        ((Field) term6420).setAccessible(true);
        Object enum24 = ((Field) term6420).get((Object) null);
        term5856 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term5873 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term5874 = (byte[]) newByteArray(2);
        byte[] term5877 = (byte[]) newByteArray(6);
        byte[] term5886 = (byte[]) newByteArray(6);
        Object term5893 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term5901 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term5919 = newInstance(Class.forName("java.time.Instant"));
        Object term5934 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term5960 = newInstance(Class.forName("java.time.Instant"));
        Object term5975 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term5996 = newInstance(Class.forName("java.time.Instant"));
        byte[] term6016 = (byte[]) newByteArray(2);
        setIntField(term5856, term5856.getClass(), "method", -1);
        setLongField(term5856, term5856.getClass(), "size", -1L);
        setIntField(term5856, term5856.getClass(), "internalAttributes", 579005622);
        setIntField(term5856, term5856.getClass(), "platform", -14890619);
        setLongField(term5856, term5856.getClass(), "externalAttributes", -5892135042702373494L);
        setField(term5856, term5856.getClass(), "extraFields", term5862);
        setByteElement(term5874, 0, (byte) -28);
        setByteElement(term5874, 1, (byte) 115);
        setField(term5873, term5873.getClass(), "localFileData", term5874);
        setByteElement(term5877, 0, (byte) 96);
        setByteElement(term5877, 1, (byte) 51);
        setByteElement(term5877, 2, (byte) -53);
        setByteElement(term5877, 3, (byte) -8);
        setByteElement(term5877, 4, (byte) -9);
        setByteElement(term5877, 5, (byte) 97);
        setField(term5873, term5873.getClass(), "centralDirectoryData", term5877);
        setField(term5856, term5856.getClass(), "unparseableExtra", term5873);
        setField(term5856, term5856.getClass(), "name", "");
        setByteElement(term5886, 0, (byte) -46);
        setByteElement(term5886, 1, (byte) 14);
        setByteElement(term5886, 2, (byte) 34);
        setByteElement(term5886, 3, (byte) 126);
        setByteElement(term5886, 4, (byte) 7);
        setByteElement(term5886, 5, (byte) -96);
        setField(term5856, term5856.getClass(), "rawName", term5886);
        setBooleanField(term5893, term5893.getClass(), "languageEncodingFlag", false);
        setBooleanField(term5893, term5893.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term5893, term5893.getClass(), "encryptionFlag", false);
        setBooleanField(term5893, term5893.getClass(), "strongEncryptionFlag", false);
        setField(term5856, term5856.getClass(), "gpb", term5893);
        setLongField(term5856, term5856.getClass(), "xdostime", -1L);
        setField(term5901, term5901.getClass(), "unit", enum22);
        setLongField(term5901, term5901.getClass(), "value", 5262507301787091109L);
        setLongField(term5919, term5919.getClass(), "seconds", 1347418561L);
        setIntField(term5919, term5919.getClass(), "nanos", 385000000);
        setField(term5901, term5901.getClass(), "instant", term5919);
        setField(term5901, term5901.getClass(), "valueAsString", "xrwlQZdwCp");
        setField(term5856, term5856.getClass(), "mtime", term5901);
        setField(term5934, term5934.getClass(), "unit", enum23);
        setLongField(term5934, term5934.getClass(), "value", -6823727938421990489L);
        setLongField(term5960, term5960.getClass(), "seconds", 1502176153L);
        setIntField(term5960, term5960.getClass(), "nanos", 899000000);
        setField(term5934, term5934.getClass(), "instant", term5960);
        setField(term5934, term5934.getClass(), "valueAsString", "IDCWpPLRkE");
        setField(term5856, term5856.getClass(), "atime", term5934);
        setField(term5975, term5975.getClass(), "unit", enum24);
        setLongField(term5975, term5975.getClass(), "value", -484994522244390100L);
        setLongField(term5996, term5996.getClass(), "seconds", 1630970644L);
        setIntField(term5996, term5996.getClass(), "nanos", 759000000);
        setField(term5975, term5975.getClass(), "instant", term5996);
        setField(term5975, term5975.getClass(), "valueAsString", "nyiiPDVjAc");
        setField(term5856, term5856.getClass(), "ctime", term5975);
        setLongField(term5856, term5856.getClass(), "crc", -1L);
        setLongField(term5856, term5856.getClass(), "csize", -1L);
        setIntField(term5856, term5856.getClass(), "flag", 454281060);
        setByteElement(term6016, 0, (byte) -22);
        setByteElement(term6016, 1, (byte) -5);
        setField(term5856, term5856.getClass(), "extra", term6016);
        setField(term5856, term5856.getClass(), "comment", "aKnKipADSo");
        term6032 = new Long(1233889271256172047L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6032;
        callMethod(klass, "setExternalAttributes", argTypes, term5856, args);
    }

};


