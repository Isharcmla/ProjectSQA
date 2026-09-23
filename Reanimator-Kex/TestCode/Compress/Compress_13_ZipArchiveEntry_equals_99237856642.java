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

public class ZipArchiveEntry_equals_99237856642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27025;
     Object term27198;

    public ZipArchiveEntry_equals_99237856642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term27031 = new LinkedHashMap();
        Class<? extends Object> term27210 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term27209 = ((Class) term27210).getDeclaredField((String) "MINUTES");
        ((Field) term27209).setAccessible(true);
        Object enum101 = ((Field) term27209).get((Object) null);
        Class<? extends Object> term27393 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term27392 = ((Class) term27393).getDeclaredField((String) "DAYS");
        ((Field) term27392).setAccessible(true);
        Object enum102 = ((Field) term27392).get((Object) null);
        Class<? extends Object> term27567 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term27566 = ((Class) term27567).getDeclaredField((String) "MICROSECONDS");
        ((Field) term27566).setAccessible(true);
        Object enum103 = ((Field) term27566).get((Object) null);
        term27025 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term27042 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term27043 = (byte[]) newByteArray(1);
        byte[] term27045 = (byte[]) newByteArray(2);
        byte[] term27050 = (byte[]) newByteArray(7);
        Object term27058 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term27066 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term27087 = newInstance(Class.forName("java.time.Instant"));
        Object term27102 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term27120 = newInstance(Class.forName("java.time.Instant"));
        Object term27135 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term27161 = newInstance(Class.forName("java.time.Instant"));
        byte[] term27181 = (byte[]) newByteArray(3);
        setIntField(term27025, term27025.getClass(), "method", -1);
        setLongField(term27025, term27025.getClass(), "size", -1L);
        setIntField(term27025, term27025.getClass(), "internalAttributes", -1692331299);
        setIntField(term27025, term27025.getClass(), "platform", 479531250);
        setLongField(term27025, term27025.getClass(), "externalAttributes", -7278883608542636188L);
        setField(term27025, term27025.getClass(), "extraFields", term27031);
        setByteElement(term27043, 0, (byte) -91);
        setField(term27042, term27042.getClass(), "localFileData", term27043);
        setByteElement(term27045, 0, (byte) 59);
        setByteElement(term27045, 1, (byte) -54);
        setField(term27042, term27042.getClass(), "centralDirectoryData", term27045);
        setField(term27025, term27025.getClass(), "unparseableExtra", term27042);
        setField(term27025, term27025.getClass(), "name", "");
        setByteElement(term27050, 0, (byte) 84);
        setByteElement(term27050, 1, (byte) 38);
        setByteElement(term27050, 2, (byte) 126);
        setByteElement(term27050, 3, (byte) -47);
        setByteElement(term27050, 4, (byte) 63);
        setByteElement(term27050, 5, (byte) 10);
        setByteElement(term27050, 6, (byte) 62);
        setField(term27025, term27025.getClass(), "rawName", term27050);
        setBooleanField(term27058, term27058.getClass(), "languageEncodingFlag", false);
        setBooleanField(term27058, term27058.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term27058, term27058.getClass(), "encryptionFlag", false);
        setBooleanField(term27058, term27058.getClass(), "strongEncryptionFlag", false);
        setField(term27025, term27025.getClass(), "gpb", term27058);
        setLongField(term27025, term27025.getClass(), "xdostime", -1L);
        setField(term27066, term27066.getClass(), "unit", enum101);
        setLongField(term27066, term27066.getClass(), "value", -1539859611880912454L);
        setLongField(term27087, term27087.getClass(), "seconds", 1728475746L);
        setIntField(term27087, term27087.getClass(), "nanos", 580000000);
        setField(term27066, term27066.getClass(), "instant", term27087);
        setField(term27066, term27066.getClass(), "valueAsString", "BRIVNtfUWU");
        setField(term27025, term27025.getClass(), "mtime", term27066);
        setField(term27102, term27102.getClass(), "unit", enum102);
        setLongField(term27102, term27102.getClass(), "value", 4100236067313034103L);
        setLongField(term27120, term27120.getClass(), "seconds", 1709196890L);
        setIntField(term27120, term27120.getClass(), "nanos", 88000000);
        setField(term27102, term27102.getClass(), "instant", term27120);
        setField(term27102, term27102.getClass(), "valueAsString", "DbiCVtPPCT");
        setField(term27025, term27025.getClass(), "atime", term27102);
        setField(term27135, term27135.getClass(), "unit", enum103);
        setLongField(term27135, term27135.getClass(), "value", 1195529027276497124L);
        setLongField(term27161, term27161.getClass(), "seconds", 1644794129L);
        setIntField(term27161, term27161.getClass(), "nanos", 220000000);
        setField(term27135, term27135.getClass(), "instant", term27161);
        setField(term27135, term27135.getClass(), "valueAsString", "WzFopsaDuG");
        setField(term27025, term27025.getClass(), "ctime", term27135);
        setLongField(term27025, term27025.getClass(), "crc", -1L);
        setLongField(term27025, term27025.getClass(), "csize", -1L);
        setIntField(term27025, term27025.getClass(), "flag", -130649791);
        setByteElement(term27181, 0, (byte) 115);
        setByteElement(term27181, 1, (byte) -128);
        setByteElement(term27181, 2, (byte) -52);
        setField(term27025, term27025.getClass(), "extra", term27181);
        setField(term27025, term27025.getClass(), "comment", "PapWxkhEWe");
        term27198 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27198;
        callMethod(klass, "equals", argTypes, term27025, args);
    }

};


