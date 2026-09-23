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

public class ZipArchiveEntry_removeUnparseableExtraFieldData_132434478422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13318;

    public ZipArchiveEntry_removeUnparseableExtraFieldData_132434478422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term13324 = new LinkedHashMap();
        Class<? extends Object> term13504 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term13503 = ((Class) term13504).getDeclaredField((String) "NANOSECONDS");
        ((Field) term13503).setAccessible(true);
        Object enum50 = ((Field) term13503).get((Object) null);
        Class<? extends Object> term13699 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term13698 = ((Class) term13699).getDeclaredField((String) "SECONDS");
        ((Field) term13698).setAccessible(true);
        Object enum51 = ((Field) term13698).get((Object) null);
        Class<? extends Object> term13882 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term13881 = ((Class) term13882).getDeclaredField((String) "MILLISECONDS");
        ((Field) term13881).setAccessible(true);
        Object enum52 = ((Field) term13881).get((Object) null);
        term13318 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term13335 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term13336 = (byte[]) newByteArray(4);
        byte[] term13341 = (byte[]) newByteArray(1);
        byte[] term13345 = (byte[]) newByteArray(1);
        Object term13347 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term13355 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term13380 = newInstance(Class.forName("java.time.Instant"));
        Object term13395 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term13416 = newInstance(Class.forName("java.time.Instant"));
        Object term13431 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term13457 = newInstance(Class.forName("java.time.Instant"));
        byte[] term13477 = (byte[]) newByteArray(6);
        setIntField(term13318, term13318.getClass(), "method", -1);
        setLongField(term13318, term13318.getClass(), "size", -1L);
        setIntField(term13318, term13318.getClass(), "internalAttributes", -1963434938);
        setIntField(term13318, term13318.getClass(), "platform", 906181092);
        setLongField(term13318, term13318.getClass(), "externalAttributes", -5963439350418910964L);
        setField(term13318, term13318.getClass(), "extraFields", term13324);
        setByteElement(term13336, 0, (byte) 70);
        setByteElement(term13336, 1, (byte) 89);
        setByteElement(term13336, 2, (byte) -99);
        setByteElement(term13336, 3, (byte) 59);
        setField(term13335, term13335.getClass(), "localFileData", term13336);
        setByteElement(term13341, 0, (byte) -99);
        setField(term13335, term13335.getClass(), "centralDirectoryData", term13341);
        setField(term13318, term13318.getClass(), "unparseableExtra", term13335);
        setField(term13318, term13318.getClass(), "name", "");
        setByteElement(term13345, 0, (byte) 61);
        setField(term13318, term13318.getClass(), "rawName", term13345);
        setBooleanField(term13347, term13347.getClass(), "languageEncodingFlag", false);
        setBooleanField(term13347, term13347.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term13347, term13347.getClass(), "encryptionFlag", false);
        setBooleanField(term13347, term13347.getClass(), "strongEncryptionFlag", false);
        setField(term13318, term13318.getClass(), "gpb", term13347);
        setLongField(term13318, term13318.getClass(), "xdostime", -1L);
        setField(term13355, term13355.getClass(), "unit", enum50);
        setLongField(term13355, term13355.getClass(), "value", 9013624480170062917L);
        setLongField(term13380, term13380.getClass(), "seconds", 1393218035L);
        setIntField(term13380, term13380.getClass(), "nanos", 243000000);
        setField(term13355, term13355.getClass(), "instant", term13380);
        setField(term13355, term13355.getClass(), "valueAsString", "idgaQsnJpQ");
        setField(term13318, term13318.getClass(), "mtime", term13355);
        setField(term13395, term13395.getClass(), "unit", enum51);
        setLongField(term13395, term13395.getClass(), "value", 7862575738391801707L);
        setLongField(term13416, term13416.getClass(), "seconds", 1762165441L);
        setIntField(term13416, term13416.getClass(), "nanos", 299000000);
        setField(term13395, term13395.getClass(), "instant", term13416);
        setField(term13395, term13395.getClass(), "valueAsString", "VgZnGoIFwQ");
        setField(term13318, term13318.getClass(), "atime", term13395);
        setField(term13431, term13431.getClass(), "unit", enum52);
        setLongField(term13431, term13431.getClass(), "value", 50358265865610362L);
        setLongField(term13457, term13457.getClass(), "seconds", 1395497491L);
        setIntField(term13457, term13457.getClass(), "nanos", 666000000);
        setField(term13431, term13431.getClass(), "instant", term13457);
        setField(term13431, term13431.getClass(), "valueAsString", "jUbSRrkrYZ");
        setField(term13318, term13318.getClass(), "ctime", term13431);
        setLongField(term13318, term13318.getClass(), "crc", -1L);
        setLongField(term13318, term13318.getClass(), "csize", -1L);
        setIntField(term13318, term13318.getClass(), "flag", 1386130016);
        setByteElement(term13477, 0, (byte) 100);
        setByteElement(term13477, 1, (byte) 55);
        setByteElement(term13477, 2, (byte) -111);
        setByteElement(term13477, 3, (byte) -127);
        setByteElement(term13477, 4, (byte) 19);
        setByteElement(term13477, 5, (byte) 83);
        setField(term13318, term13318.getClass(), "extra", term13477);
        setField(term13318, term13318.getClass(), "comment", "bWWfajKbEX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeUnparseableExtraFieldData", argTypes, term13318, args);
    }

};


