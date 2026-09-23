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

public class ZipArchiveEntry_removeExtraField_70437903121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12775;
     Object term12924;

    public ZipArchiveEntry_removeExtraField_70437903121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term12781 = new LinkedHashMap();
        Class<? extends Object> term12938 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term12937 = ((Class) term12938).getDeclaredField((String) "SECONDS");
        ((Field) term12937).setAccessible(true);
        Object enum48 = ((Field) term12937).get((Object) null);
        Class<? extends Object> term13121 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term13120 = ((Class) term13121).getDeclaredField((String) "HOURS");
        ((Field) term13120).setAccessible(true);
        Object enum49 = ((Field) term13120).get((Object) null);
        term12775 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term12792 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term12793 = (byte[]) newByteArray(0);
        byte[] term12794 = (byte[]) newByteArray(6);
        byte[] term12803 = (byte[]) newByteArray(5);
        Object term12809 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term12817 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12838 = newInstance(Class.forName("java.time.Instant"));
        Object term12853 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12872 = newInstance(Class.forName("java.time.Instant"));
        Object term12887 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12889 = newInstance(Class.forName("java.time.Instant"));
        byte[] term12909 = (byte[]) newByteArray(1);
        setIntField(term12775, term12775.getClass(), "method", -1);
        setLongField(term12775, term12775.getClass(), "size", -1L);
        setIntField(term12775, term12775.getClass(), "internalAttributes", -341962980);
        setIntField(term12775, term12775.getClass(), "platform", 1532716628);
        setLongField(term12775, term12775.getClass(), "externalAttributes", 41775768178052008L);
        setField(term12775, term12775.getClass(), "extraFields", term12781);
        setField(term12792, term12792.getClass(), "localFileData", term12793);
        setByteElement(term12794, 0, (byte) 114);
        setByteElement(term12794, 1, (byte) 60);
        setByteElement(term12794, 2, (byte) -20);
        setByteElement(term12794, 3, (byte) 100);
        setByteElement(term12794, 4, (byte) -41);
        setByteElement(term12794, 5, (byte) -70);
        setField(term12792, term12792.getClass(), "centralDirectoryData", term12794);
        setField(term12775, term12775.getClass(), "unparseableExtra", term12792);
        setField(term12775, term12775.getClass(), "name", "");
        setByteElement(term12803, 0, (byte) -5);
        setByteElement(term12803, 1, (byte) 119);
        setByteElement(term12803, 2, (byte) 81);
        setByteElement(term12803, 3, (byte) -28);
        setByteElement(term12803, 4, (byte) -18);
        setField(term12775, term12775.getClass(), "rawName", term12803);
        setBooleanField(term12809, term12809.getClass(), "languageEncodingFlag", false);
        setBooleanField(term12809, term12809.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term12809, term12809.getClass(), "encryptionFlag", false);
        setBooleanField(term12809, term12809.getClass(), "strongEncryptionFlag", false);
        setField(term12775, term12775.getClass(), "gpb", term12809);
        setLongField(term12775, term12775.getClass(), "xdostime", -1L);
        setField(term12817, term12817.getClass(), "unit", enum48);
        setLongField(term12817, term12817.getClass(), "value", 6682528376118987775L);
        setLongField(term12838, term12838.getClass(), "seconds", 1803013433L);
        setIntField(term12838, term12838.getClass(), "nanos", 545000000);
        setField(term12817, term12817.getClass(), "instant", term12838);
        setField(term12817, term12817.getClass(), "valueAsString", "oVgzLbrsFr");
        setField(term12775, term12775.getClass(), "mtime", term12817);
        setField(term12853, term12853.getClass(), "unit", enum49);
        setLongField(term12853, term12853.getClass(), "value", 682356318767179819L);
        setLongField(term12872, term12872.getClass(), "seconds", 1843232817L);
        setIntField(term12872, term12872.getClass(), "nanos", 357000000);
        setField(term12853, term12853.getClass(), "instant", term12872);
        setField(term12853, term12853.getClass(), "valueAsString", "vQVyKLdtaz");
        setField(term12775, term12775.getClass(), "atime", term12853);
        setField(term12887, term12887.getClass(), "unit", enum49);
        setLongField(term12887, term12887.getClass(), "value", -7291743527973326814L);
        setLongField(term12889, term12889.getClass(), "seconds", 1628713316L);
        setIntField(term12889, term12889.getClass(), "nanos", 832000000);
        setField(term12887, term12887.getClass(), "instant", term12889);
        setField(term12887, term12887.getClass(), "valueAsString", "OWKQODBLzb");
        setField(term12775, term12775.getClass(), "ctime", term12887);
        setLongField(term12775, term12775.getClass(), "crc", -1L);
        setLongField(term12775, term12775.getClass(), "csize", -1L);
        setIntField(term12775, term12775.getClass(), "flag", 1141317871);
        setByteElement(term12909, 0, (byte) -61);
        setField(term12775, term12775.getClass(), "extra", term12909);
        setField(term12775, term12775.getClass(), "comment", "wGmYcqUkgE");
        term12924 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term12924, term12924.getClass(), "value", 691577392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipShort");
        Object[] args = new Object[1];
        args[0] = term12924;
        callMethod(klass, "removeExtraField", argTypes, term12775, args);
    }

};


