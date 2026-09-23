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

public class ZipArchiveEntry_isDirectory_159985423540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25186;

    public ZipArchiveEntry_isDirectory_159985423540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25394 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term25393 = ((Class) term25394).getDeclaredField((String) "MICROSECONDS");
        ((Field) term25393).setAccessible(true);
        Object enum95 = ((Field) term25393).get((Object) null);
        Class<? extends Object> term25592 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term25591 = ((Class) term25592).getDeclaredField((String) "MINUTES");
        ((Field) term25591).setAccessible(true);
        Object enum96 = ((Field) term25591).get((Object) null);
        Class<? extends Object> term25775 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term25774 = ((Class) term25775).getDeclaredField((String) "NANOSECONDS");
        ((Field) term25774).setAccessible(true);
        Object enum97 = ((Field) term25774).get((Object) null);
        term25186 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term25195 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 8);
        Object term25196 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term25197 = (byte[]) newByteArray(1);
        byte[] term25199 = (byte[]) newByteArray(9);
        byte[] term25211 = (byte[]) newByteArray(8);
        Object term25220 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term25230 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term25256 = newInstance(Class.forName("java.time.Instant"));
        Object term25271 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term25292 = newInstance(Class.forName("java.time.Instant"));
        Object term25307 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term25332 = newInstance(Class.forName("java.time.Instant"));
        byte[] term25352 = (byte[]) newByteArray(9);
        setIntField(term25186, term25186.getClass(), "method", -1);
        setLongField(term25186, term25186.getClass(), "size", -1L);
        setIntField(term25186, term25186.getClass(), "internalAttributes", 574481092);
        setIntField(term25186, term25186.getClass(), "versionRequired", -310528004);
        setIntField(term25186, term25186.getClass(), "versionMadeBy", -634976996);
        setIntField(term25186, term25186.getClass(), "platform", -1015274146);
        setIntField(term25186, term25186.getClass(), "rawFlag", -49052672);
        setLongField(term25186, term25186.getClass(), "externalAttributes", 138235087558060686L);
        setField(term25186, term25186.getClass(), "extraFields", term25195);
        setByteElement(term25197, 0, (byte) -24);
        setField(term25196, term25196.getClass(), "localFileData", term25197);
        setByteElement(term25199, 0, (byte) -68);
        setByteElement(term25199, 1, (byte) -75);
        setByteElement(term25199, 2, (byte) 82);
        setByteElement(term25199, 3, (byte) -127);
        setByteElement(term25199, 4, (byte) 23);
        setByteElement(term25199, 5, (byte) 98);
        setByteElement(term25199, 6, (byte) 11);
        setByteElement(term25199, 7, (byte) 108);
        setByteElement(term25199, 8, (byte) 97);
        setField(term25196, term25196.getClass(), "centralDirectoryData", term25199);
        setField(term25186, term25186.getClass(), "unparseableExtra", term25196);
        setField(term25186, term25186.getClass(), "name", "");
        setByteElement(term25211, 0, (byte) -9);
        setByteElement(term25211, 1, (byte) -101);
        setByteElement(term25211, 2, (byte) 49);
        setByteElement(term25211, 3, (byte) 34);
        setByteElement(term25211, 4, (byte) -23);
        setByteElement(term25211, 5, (byte) 45);
        setByteElement(term25211, 6, (byte) -64);
        setByteElement(term25211, 7, (byte) -25);
        setField(term25186, term25186.getClass(), "rawName", term25211);
        setBooleanField(term25220, term25220.getClass(), "languageEncodingFlag", false);
        setBooleanField(term25220, term25220.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term25220, term25220.getClass(), "encryptionFlag", false);
        setBooleanField(term25220, term25220.getClass(), "strongEncryptionFlag", false);
        setIntField(term25220, term25220.getClass(), "slidingDictionarySize", 0);
        setIntField(term25220, term25220.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term25186, term25186.getClass(), "gpb", term25220);
        setLongField(term25186, term25186.getClass(), "xdostime", -1L);
        setField(term25230, term25230.getClass(), "unit", enum95);
        setLongField(term25230, term25230.getClass(), "value", 5381386339318883012L);
        setLongField(term25256, term25256.getClass(), "seconds", 1870046835L);
        setIntField(term25256, term25256.getClass(), "nanos", 492000000);
        setField(term25230, term25230.getClass(), "instant", term25256);
        setField(term25230, term25230.getClass(), "valueAsString", "MwwjNtdOFT");
        setField(term25186, term25186.getClass(), "mtime", term25230);
        setField(term25271, term25271.getClass(), "unit", enum96);
        setLongField(term25271, term25271.getClass(), "value", -1333707622307134180L);
        setLongField(term25292, term25292.getClass(), "seconds", 1655686811L);
        setIntField(term25292, term25292.getClass(), "nanos", 13000000);
        setField(term25271, term25271.getClass(), "instant", term25292);
        setField(term25271, term25271.getClass(), "valueAsString", "VYkqXKVlAJ");
        setField(term25186, term25186.getClass(), "atime", term25271);
        setField(term25307, term25307.getClass(), "unit", enum97);
        setLongField(term25307, term25307.getClass(), "value", -4360569253593381888L);
        setLongField(term25332, term25332.getClass(), "seconds", 1319373084L);
        setIntField(term25332, term25332.getClass(), "nanos", 958000000);
        setField(term25307, term25307.getClass(), "instant", term25332);
        setField(term25307, term25307.getClass(), "valueAsString", "XkIoWJRNwN");
        setField(term25186, term25186.getClass(), "ctime", term25307);
        setLongField(term25186, term25186.getClass(), "crc", -1L);
        setLongField(term25186, term25186.getClass(), "csize", -1L);
        setIntField(term25186, term25186.getClass(), "flag", 339372704);
        setByteElement(term25352, 0, (byte) 28);
        setByteElement(term25352, 1, (byte) 56);
        setByteElement(term25352, 2, (byte) -111);
        setByteElement(term25352, 3, (byte) -98);
        setByteElement(term25352, 4, (byte) -91);
        setByteElement(term25352, 5, (byte) -12);
        setByteElement(term25352, 6, (byte) 13);
        setByteElement(term25352, 7, (byte) 35);
        setByteElement(term25352, 8, (byte) -41);
        setField(term25186, term25186.getClass(), "extra", term25352);
        setField(term25186, term25186.getClass(), "comment", "aNWLJdrZMq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDirectory", argTypes, term25186, args);
    }

};


