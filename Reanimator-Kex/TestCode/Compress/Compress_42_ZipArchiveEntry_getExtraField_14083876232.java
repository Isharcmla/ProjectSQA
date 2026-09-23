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

public class ZipArchiveEntry_getExtraField_14083876232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20010;
     Object term20177;

    public ZipArchiveEntry_getExtraField_14083876232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20197 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term20196 = ((Class) term20197).getDeclaredField((String) "MICROSECONDS");
        ((Field) term20196).setAccessible(true);
        Object enum76 = ((Field) term20196).get((Object) null);
        Class<? extends Object> term20395 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term20394 = ((Class) term20395).getDeclaredField((String) "NANOSECONDS");
        ((Field) term20394).setAccessible(true);
        Object enum77 = ((Field) term20394).get((Object) null);
        term20010 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term20019 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 8);
        Object term20020 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term20021 = (byte[]) newByteArray(5);
        byte[] term20027 = (byte[]) newByteArray(6);
        byte[] term20036 = (byte[]) newByteArray(6);
        Object term20043 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term20053 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20079 = newInstance(Class.forName("java.time.Instant"));
        Object term20094 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20119 = newInstance(Class.forName("java.time.Instant"));
        Object term20134 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20136 = newInstance(Class.forName("java.time.Instant"));
        byte[] term20156 = (byte[]) newByteArray(7);
        setIntField(term20010, term20010.getClass(), "method", -1);
        setLongField(term20010, term20010.getClass(), "size", -1L);
        setIntField(term20010, term20010.getClass(), "internalAttributes", -1122880881);
        setIntField(term20010, term20010.getClass(), "versionRequired", -542712742);
        setIntField(term20010, term20010.getClass(), "versionMadeBy", -1254072822);
        setIntField(term20010, term20010.getClass(), "platform", -1111249833);
        setIntField(term20010, term20010.getClass(), "rawFlag", -1692331299);
        setLongField(term20010, term20010.getClass(), "externalAttributes", -4393710401270724527L);
        setField(term20010, term20010.getClass(), "extraFields", term20019);
        setByteElement(term20021, 0, (byte) -98);
        setByteElement(term20021, 1, (byte) 48);
        setByteElement(term20021, 2, (byte) 15);
        setByteElement(term20021, 3, (byte) 73);
        setByteElement(term20021, 4, (byte) -77);
        setField(term20020, term20020.getClass(), "localFileData", term20021);
        setByteElement(term20027, 0, (byte) -11);
        setByteElement(term20027, 1, (byte) -95);
        setByteElement(term20027, 2, (byte) 114);
        setByteElement(term20027, 3, (byte) -9);
        setByteElement(term20027, 4, (byte) -113);
        setByteElement(term20027, 5, (byte) -42);
        setField(term20020, term20020.getClass(), "centralDirectoryData", term20027);
        setField(term20010, term20010.getClass(), "unparseableExtra", term20020);
        setField(term20010, term20010.getClass(), "name", "");
        setByteElement(term20036, 0, (byte) 60);
        setByteElement(term20036, 1, (byte) -128);
        setByteElement(term20036, 2, (byte) -55);
        setByteElement(term20036, 3, (byte) -83);
        setByteElement(term20036, 4, (byte) -48);
        setByteElement(term20036, 5, (byte) -113);
        setField(term20010, term20010.getClass(), "rawName", term20036);
        setBooleanField(term20043, term20043.getClass(), "languageEncodingFlag", false);
        setBooleanField(term20043, term20043.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term20043, term20043.getClass(), "encryptionFlag", false);
        setBooleanField(term20043, term20043.getClass(), "strongEncryptionFlag", false);
        setIntField(term20043, term20043.getClass(), "slidingDictionarySize", 0);
        setIntField(term20043, term20043.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term20010, term20010.getClass(), "gpb", term20043);
        setLongField(term20010, term20010.getClass(), "xdostime", -1L);
        setField(term20053, term20053.getClass(), "unit", enum76);
        setLongField(term20053, term20053.getClass(), "value", -4822736661741380518L);
        setLongField(term20079, term20079.getClass(), "seconds", 1359804657L);
        setIntField(term20079, term20079.getClass(), "nanos", 69000000);
        setField(term20053, term20053.getClass(), "instant", term20079);
        setField(term20053, term20053.getClass(), "valueAsString", "dpNsDgfPso");
        setField(term20010, term20010.getClass(), "mtime", term20053);
        setField(term20094, term20094.getClass(), "unit", enum77);
        setLongField(term20094, term20094.getClass(), "value", -5386201758403679145L);
        setLongField(term20119, term20119.getClass(), "seconds", 1589764751L);
        setIntField(term20119, term20119.getClass(), "nanos", 309000000);
        setField(term20094, term20094.getClass(), "instant", term20119);
        setField(term20094, term20094.getClass(), "valueAsString", "hCWPJQKpdc");
        setField(term20010, term20010.getClass(), "atime", term20094);
        setField(term20134, term20134.getClass(), "unit", enum76);
        setLongField(term20134, term20134.getClass(), "value", -7268507582722666254L);
        setLongField(term20136, term20136.getClass(), "seconds", 1291298367L);
        setIntField(term20136, term20136.getClass(), "nanos", 982000000);
        setField(term20134, term20134.getClass(), "instant", term20136);
        setField(term20134, term20134.getClass(), "valueAsString", "WzMEhMXkKx");
        setField(term20010, term20010.getClass(), "ctime", term20134);
        setLongField(term20010, term20010.getClass(), "crc", -1L);
        setLongField(term20010, term20010.getClass(), "csize", -1L);
        setIntField(term20010, term20010.getClass(), "flag", 479531250);
        setByteElement(term20156, 0, (byte) 15);
        setByteElement(term20156, 1, (byte) 38);
        setByteElement(term20156, 2, (byte) -54);
        setByteElement(term20156, 3, (byte) -51);
        setByteElement(term20156, 4, (byte) 101);
        setByteElement(term20156, 5, (byte) 40);
        setByteElement(term20156, 6, (byte) 83);
        setField(term20010, term20010.getClass(), "extra", term20156);
        setField(term20010, term20010.getClass(), "comment", "XOiDvlDhdc");
        term20177 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term20177, term20177.getClass(), "value", -130649791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipShort");
        Object[] args = new Object[1];
        args[0] = term20177;
        callMethod(klass, "getExtraField", argTypes, term20010, args);
    }

};


