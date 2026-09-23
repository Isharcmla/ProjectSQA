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
import java.lang.Boolean;

public class ZipArchiveEntry_getExtraFields_88501317019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11300;
     Object term11473;

    public ZipArchiveEntry_getExtraFields_88501317019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11490 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term11489 = ((Class) term11490).getDeclaredField((String) "SECONDS");
        ((Field) term11489).setAccessible(true);
        Object enum43 = ((Field) term11489).get((Object) null);
        Class<? extends Object> term11673 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term11672 = ((Class) term11673).getDeclaredField((String) "MINUTES");
        ((Field) term11672).setAccessible(true);
        Object enum44 = ((Field) term11672).get((Object) null);
        Class<? extends Object> term11856 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term11855 = ((Class) term11856).getDeclaredField((String) "MICROSECONDS");
        ((Field) term11855).setAccessible(true);
        Object enum45 = ((Field) term11855).get((Object) null);
        term11300 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term11309 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 6);
        Object term11310 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term11311 = (byte[]) newByteArray(7);
        byte[] term11319 = (byte[]) newByteArray(0);
        byte[] term11322 = (byte[]) newByteArray(7);
        Object term11330 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term11340 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term11361 = newInstance(Class.forName("java.time.Instant"));
        Object term11376 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term11397 = newInstance(Class.forName("java.time.Instant"));
        Object term11412 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term11438 = newInstance(Class.forName("java.time.Instant"));
        byte[] term11458 = (byte[]) newByteArray(1);
        setIntField(term11300, term11300.getClass(), "method", -1);
        setLongField(term11300, term11300.getClass(), "size", -1L);
        setIntField(term11300, term11300.getClass(), "internalAttributes", 480137250);
        setIntField(term11300, term11300.getClass(), "versionRequired", -341152642);
        setIntField(term11300, term11300.getClass(), "versionMadeBy", -2015854073);
        setIntField(term11300, term11300.getClass(), "platform", 538259104);
        setIntField(term11300, term11300.getClass(), "rawFlag", 96566506);
        setLongField(term11300, term11300.getClass(), "externalAttributes", 2062173786000223358L);
        setField(term11300, term11300.getClass(), "extraFields", term11309);
        setByteElement(term11311, 0, (byte) 17);
        setByteElement(term11311, 1, (byte) -126);
        setByteElement(term11311, 2, (byte) 35);
        setByteElement(term11311, 3, (byte) -46);
        setByteElement(term11311, 4, (byte) -14);
        setByteElement(term11311, 5, (byte) 124);
        setByteElement(term11311, 6, (byte) -124);
        setField(term11310, term11310.getClass(), "localFileData", term11311);
        setField(term11310, term11310.getClass(), "centralDirectoryData", term11319);
        setField(term11300, term11300.getClass(), "unparseableExtra", term11310);
        setField(term11300, term11300.getClass(), "name", "");
        setByteElement(term11322, 0, (byte) -72);
        setByteElement(term11322, 1, (byte) 90);
        setByteElement(term11322, 2, (byte) -34);
        setByteElement(term11322, 3, (byte) -2);
        setByteElement(term11322, 4, (byte) 96);
        setByteElement(term11322, 5, (byte) 55);
        setByteElement(term11322, 6, (byte) -103);
        setField(term11300, term11300.getClass(), "rawName", term11322);
        setBooleanField(term11330, term11330.getClass(), "languageEncodingFlag", false);
        setBooleanField(term11330, term11330.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term11330, term11330.getClass(), "encryptionFlag", false);
        setBooleanField(term11330, term11330.getClass(), "strongEncryptionFlag", false);
        setIntField(term11330, term11330.getClass(), "slidingDictionarySize", 0);
        setIntField(term11330, term11330.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term11300, term11300.getClass(), "gpb", term11330);
        setLongField(term11300, term11300.getClass(), "xdostime", -1L);
        setField(term11340, term11340.getClass(), "unit", enum43);
        setLongField(term11340, term11340.getClass(), "value", -8658027316505137504L);
        setLongField(term11361, term11361.getClass(), "seconds", 1741462563L);
        setIntField(term11361, term11361.getClass(), "nanos", 811000000);
        setField(term11340, term11340.getClass(), "instant", term11361);
        setField(term11340, term11340.getClass(), "valueAsString", "tPlsykYBqO");
        setField(term11300, term11300.getClass(), "mtime", term11340);
        setField(term11376, term11376.getClass(), "unit", enum44);
        setLongField(term11376, term11376.getClass(), "value", 414749984815662075L);
        setLongField(term11397, term11397.getClass(), "seconds", 1762012701L);
        setIntField(term11397, term11397.getClass(), "nanos", 322000000);
        setField(term11376, term11376.getClass(), "instant", term11397);
        setField(term11376, term11376.getClass(), "valueAsString", "bLPjGVBhlX");
        setField(term11300, term11300.getClass(), "atime", term11376);
        setField(term11412, term11412.getClass(), "unit", enum45);
        setLongField(term11412, term11412.getClass(), "value", 463622836963501975L);
        setLongField(term11438, term11438.getClass(), "seconds", 1695443269L);
        setIntField(term11438, term11438.getClass(), "nanos", 458000000);
        setField(term11412, term11412.getClass(), "instant", term11438);
        setField(term11412, term11412.getClass(), "valueAsString", "whBvTVIIlC");
        setField(term11300, term11300.getClass(), "ctime", term11412);
        setLongField(term11300, term11300.getClass(), "crc", -1L);
        setLongField(term11300, term11300.getClass(), "csize", -1L);
        setIntField(term11300, term11300.getClass(), "flag", -343325701);
        setByteElement(term11458, 0, (byte) -103);
        setField(term11300, term11300.getClass(), "extra", term11458);
        setField(term11300, term11300.getClass(), "comment", "IgRJUzaCwW");
        term11473 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term11473;
        callMethod(klass, "getExtraFields", argTypes, term11300, args);
    }

};


