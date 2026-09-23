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

public class ZipArchiveEntry_getRawName_174120182745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29113;

    public ZipArchiveEntry_getRawName_174120182745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29281 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term29280 = ((Class) term29281).getDeclaredField((String) "MINUTES");
        ((Field) term29280).setAccessible(true);
        Object enum110 = ((Field) term29280).get((Object) null);
        Class<? extends Object> term29464 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term29463 = ((Class) term29464).getDeclaredField((String) "MILLISECONDS");
        ((Field) term29463).setAccessible(true);
        Object enum111 = ((Field) term29463).get((Object) null);
        Class<? extends Object> term29662 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term29661 = ((Class) term29662).getDeclaredField((String) "DAYS");
        ((Field) term29661).setAccessible(true);
        Object enum112 = ((Field) term29661).get((Object) null);
        term29113 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term29122 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 5);
        Object term29123 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term29124 = (byte[]) newByteArray(2);
        byte[] term29127 = (byte[]) newByteArray(3);
        byte[] term29133 = (byte[]) newByteArray(1);
        Object term29135 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term29145 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term29166 = newInstance(Class.forName("java.time.Instant"));
        Object term29181 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term29207 = newInstance(Class.forName("java.time.Instant"));
        Object term29222 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term29240 = newInstance(Class.forName("java.time.Instant"));
        byte[] term29260 = (byte[]) newByteArray(0);
        setIntField(term29113, term29113.getClass(), "method", -1);
        setLongField(term29113, term29113.getClass(), "size", -1L);
        setIntField(term29113, term29113.getClass(), "internalAttributes", -146054762);
        setIntField(term29113, term29113.getClass(), "versionRequired", 798043553);
        setIntField(term29113, term29113.getClass(), "versionMadeBy", 533197381);
        setIntField(term29113, term29113.getClass(), "platform", 1048271679);
        setIntField(term29113, term29113.getClass(), "rawFlag", -1529797673);
        setLongField(term29113, term29113.getClass(), "externalAttributes", 4616440478358528406L);
        setField(term29113, term29113.getClass(), "extraFields", term29122);
        setByteElement(term29124, 0, (byte) 104);
        setByteElement(term29124, 1, (byte) 28);
        setField(term29123, term29123.getClass(), "localFileData", term29124);
        setByteElement(term29127, 0, (byte) -84);
        setByteElement(term29127, 1, (byte) 69);
        setByteElement(term29127, 2, (byte) -101);
        setField(term29123, term29123.getClass(), "centralDirectoryData", term29127);
        setField(term29113, term29113.getClass(), "unparseableExtra", term29123);
        setField(term29113, term29113.getClass(), "name", "");
        setByteElement(term29133, 0, (byte) -44);
        setField(term29113, term29113.getClass(), "rawName", term29133);
        setBooleanField(term29135, term29135.getClass(), "languageEncodingFlag", false);
        setBooleanField(term29135, term29135.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term29135, term29135.getClass(), "encryptionFlag", false);
        setBooleanField(term29135, term29135.getClass(), "strongEncryptionFlag", false);
        setIntField(term29135, term29135.getClass(), "slidingDictionarySize", 0);
        setIntField(term29135, term29135.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term29113, term29113.getClass(), "gpb", term29135);
        setLongField(term29113, term29113.getClass(), "xdostime", -1L);
        setField(term29145, term29145.getClass(), "unit", enum110);
        setLongField(term29145, term29145.getClass(), "value", 3427570961451840069L);
        setLongField(term29166, term29166.getClass(), "seconds", 1546787987L);
        setIntField(term29166, term29166.getClass(), "nanos", 439000000);
        setField(term29145, term29145.getClass(), "instant", term29166);
        setField(term29145, term29145.getClass(), "valueAsString", "xtftXXMbem");
        setField(term29113, term29113.getClass(), "mtime", term29145);
        setField(term29181, term29181.getClass(), "unit", enum111);
        setLongField(term29181, term29181.getClass(), "value", 4502292577098212311L);
        setLongField(term29207, term29207.getClass(), "seconds", 1851914886L);
        setIntField(term29207, term29207.getClass(), "nanos", 282000000);
        setField(term29181, term29181.getClass(), "instant", term29207);
        setField(term29181, term29181.getClass(), "valueAsString", "cudZvLMQon");
        setField(term29113, term29113.getClass(), "atime", term29181);
        setField(term29222, term29222.getClass(), "unit", enum112);
        setLongField(term29222, term29222.getClass(), "value", -3730936709704460408L);
        setLongField(term29240, term29240.getClass(), "seconds", 1831760729L);
        setIntField(term29240, term29240.getClass(), "nanos", 790000000);
        setField(term29222, term29222.getClass(), "instant", term29240);
        setField(term29222, term29222.getClass(), "valueAsString", "lihXWlGDxk");
        setField(term29113, term29113.getClass(), "ctime", term29222);
        setLongField(term29113, term29113.getClass(), "crc", -1L);
        setLongField(term29113, term29113.getClass(), "csize", -1L);
        setIntField(term29113, term29113.getClass(), "flag", -868676396);
        setField(term29113, term29113.getClass(), "extra", term29260);
        setField(term29113, term29113.getClass(), "comment", "JmcmxoGhIK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRawName", argTypes, term29113, args);
    }

};


