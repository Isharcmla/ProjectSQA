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

public class ZipArchiveEntry_getLastModifiedDate_154699968941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26258;

    public ZipArchiveEntry_getLastModifiedDate_154699968941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term26264 = new LinkedHashMap();
        Class<? extends Object> term26455 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term26454 = ((Class) term26455).getDeclaredField((String) "DAYS");
        ((Field) term26454).setAccessible(true);
        Object enum98 = ((Field) term26454).get((Object) null);
        Class<? extends Object> term26629 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term26628 = ((Class) term26629).getDeclaredField((String) "MICROSECONDS");
        ((Field) term26628).setAccessible(true);
        Object enum99 = ((Field) term26628).get((Object) null);
        Class<? extends Object> term26827 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term26826 = ((Class) term26827).getDeclaredField((String) "SECONDS");
        ((Field) term26826).setAccessible(true);
        Object enum100 = ((Field) term26826).get((Object) null);
        term26258 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term26275 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term26276 = (byte[]) newByteArray(8);
        byte[] term26285 = (byte[]) newByteArray(5);
        byte[] term26293 = (byte[]) newByteArray(2);
        Object term26296 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term26304 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term26322 = newInstance(Class.forName("java.time.Instant"));
        Object term26337 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term26363 = newInstance(Class.forName("java.time.Instant"));
        Object term26378 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term26399 = newInstance(Class.forName("java.time.Instant"));
        byte[] term26419 = (byte[]) newByteArray(6);
        setIntField(term26258, term26258.getClass(), "method", -1);
        setLongField(term26258, term26258.getClass(), "size", -1L);
        setIntField(term26258, term26258.getClass(), "internalAttributes", -1022990421);
        setIntField(term26258, term26258.getClass(), "platform", 1045547089);
        setLongField(term26258, term26258.getClass(), "externalAttributes", 3452833434644634217L);
        setField(term26258, term26258.getClass(), "extraFields", term26264);
        setByteElement(term26276, 0, (byte) 108);
        setByteElement(term26276, 1, (byte) 118);
        setByteElement(term26276, 2, (byte) 111);
        setByteElement(term26276, 3, (byte) -122);
        setByteElement(term26276, 4, (byte) -76);
        setByteElement(term26276, 5, (byte) -97);
        setByteElement(term26276, 6, (byte) 101);
        setByteElement(term26276, 7, (byte) 111);
        setField(term26275, term26275.getClass(), "localFileData", term26276);
        setByteElement(term26285, 0, (byte) -38);
        setByteElement(term26285, 1, (byte) 24);
        setByteElement(term26285, 2, (byte) 43);
        setByteElement(term26285, 3, (byte) -126);
        setByteElement(term26285, 4, (byte) -59);
        setField(term26275, term26275.getClass(), "centralDirectoryData", term26285);
        setField(term26258, term26258.getClass(), "unparseableExtra", term26275);
        setField(term26258, term26258.getClass(), "name", "");
        setByteElement(term26293, 0, (byte) 27);
        setByteElement(term26293, 1, (byte) 98);
        setField(term26258, term26258.getClass(), "rawName", term26293);
        setBooleanField(term26296, term26296.getClass(), "languageEncodingFlag", false);
        setBooleanField(term26296, term26296.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term26296, term26296.getClass(), "encryptionFlag", false);
        setBooleanField(term26296, term26296.getClass(), "strongEncryptionFlag", false);
        setField(term26258, term26258.getClass(), "gpb", term26296);
        setLongField(term26258, term26258.getClass(), "xdostime", -1L);
        setField(term26304, term26304.getClass(), "unit", enum98);
        setLongField(term26304, term26304.getClass(), "value", -8603648071751666348L);
        setLongField(term26322, term26322.getClass(), "seconds", 1676489642L);
        setIntField(term26322, term26322.getClass(), "nanos", 491000000);
        setField(term26304, term26304.getClass(), "instant", term26322);
        setField(term26304, term26304.getClass(), "valueAsString", "HWkpTmtlrc");
        setField(term26258, term26258.getClass(), "mtime", term26304);
        setField(term26337, term26337.getClass(), "unit", enum99);
        setLongField(term26337, term26337.getClass(), "value", -7884871963229073324L);
        setLongField(term26363, term26363.getClass(), "seconds", 1724978506L);
        setIntField(term26363, term26363.getClass(), "nanos", 464000000);
        setField(term26337, term26337.getClass(), "instant", term26363);
        setField(term26337, term26337.getClass(), "valueAsString", "hMmaoREuCK");
        setField(term26258, term26258.getClass(), "atime", term26337);
        setField(term26378, term26378.getClass(), "unit", enum100);
        setLongField(term26378, term26378.getClass(), "value", -8649738738252714180L);
        setLongField(term26399, term26399.getClass(), "seconds", 1743154792L);
        setIntField(term26399, term26399.getClass(), "nanos", 108000000);
        setField(term26378, term26378.getClass(), "instant", term26399);
        setField(term26378, term26378.getClass(), "valueAsString", "VeDtgDzGAN");
        setField(term26258, term26258.getClass(), "ctime", term26378);
        setLongField(term26258, term26258.getClass(), "crc", -1L);
        setLongField(term26258, term26258.getClass(), "csize", -1L);
        setIntField(term26258, term26258.getClass(), "flag", -542712742);
        setByteElement(term26419, 0, (byte) 80);
        setByteElement(term26419, 1, (byte) 18);
        setByteElement(term26419, 2, (byte) 66);
        setByteElement(term26419, 3, (byte) 71);
        setByteElement(term26419, 4, (byte) 119);
        setByteElement(term26419, 5, (byte) -13);
        setField(term26258, term26258.getClass(), "extra", term26419);
        setField(term26258, term26258.getClass(), "comment", "aWYOWZFyaX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term26258, args);
    }

};


