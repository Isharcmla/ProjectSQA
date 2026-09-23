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

public class ZipArchiveEntry_addAsFirstExtraField_184299653220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12186;

    public ZipArchiveEntry_addAsFirstExtraField_184299653220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term12192 = new LinkedHashMap();
        Class<? extends Object> term12359 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term12358 = ((Class) term12359).getDeclaredField((String) "MICROSECONDS");
        ((Field) term12358).setAccessible(true);
        Object enum46 = ((Field) term12358).get((Object) null);
        Class<? extends Object> term12567 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term12566 = ((Class) term12567).getDeclaredField((String) "MILLISECONDS");
        ((Field) term12566).setAccessible(true);
        Object enum47 = ((Field) term12566).get((Object) null);
        term12186 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term12203 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term12204 = (byte[]) newByteArray(0);
        byte[] term12205 = (byte[]) newByteArray(6);
        byte[] term12214 = (byte[]) newByteArray(5);
        Object term12220 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term12228 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12254 = newInstance(Class.forName("java.time.Instant"));
        Object term12269 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12271 = newInstance(Class.forName("java.time.Instant"));
        Object term12286 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12312 = newInstance(Class.forName("java.time.Instant"));
        byte[] term12332 = (byte[]) newByteArray(1);
        setIntField(term12186, term12186.getClass(), "method", -1);
        setLongField(term12186, term12186.getClass(), "size", -1L);
        setIntField(term12186, term12186.getClass(), "internalAttributes", -268815336);
        setIntField(term12186, term12186.getClass(), "platform", -1210583429);
        setLongField(term12186, term12186.getClass(), "externalAttributes", 305759998609888272L);
        setField(term12186, term12186.getClass(), "extraFields", term12192);
        setField(term12203, term12203.getClass(), "localFileData", term12204);
        setByteElement(term12205, 0, (byte) -4);
        setByteElement(term12205, 1, (byte) 28);
        setByteElement(term12205, 2, (byte) 94);
        setByteElement(term12205, 4, (byte) -96);
        setByteElement(term12205, 5, (byte) -88);
        setField(term12203, term12203.getClass(), "centralDirectoryData", term12205);
        setField(term12186, term12186.getClass(), "unparseableExtra", term12203);
        setField(term12186, term12186.getClass(), "name", "");
        setByteElement(term12214, 0, (byte) -73);
        setByteElement(term12214, 1, (byte) 105);
        setByteElement(term12214, 2, (byte) -86);
        setByteElement(term12214, 3, (byte) 84);
        setByteElement(term12214, 4, (byte) -70);
        setField(term12186, term12186.getClass(), "rawName", term12214);
        setBooleanField(term12220, term12220.getClass(), "languageEncodingFlag", false);
        setBooleanField(term12220, term12220.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term12220, term12220.getClass(), "encryptionFlag", false);
        setBooleanField(term12220, term12220.getClass(), "strongEncryptionFlag", false);
        setField(term12186, term12186.getClass(), "gpb", term12220);
        setLongField(term12186, term12186.getClass(), "xdostime", -1L);
        setField(term12228, term12228.getClass(), "unit", enum46);
        setLongField(term12228, term12228.getClass(), "value", -8654565919063661957L);
        setLongField(term12254, term12254.getClass(), "seconds", 1362798563L);
        setIntField(term12254, term12254.getClass(), "nanos", 394000000);
        setField(term12228, term12228.getClass(), "instant", term12254);
        setField(term12228, term12228.getClass(), "valueAsString", "JUmudUmaaV");
        setField(term12186, term12186.getClass(), "mtime", term12228);
        setField(term12269, term12269.getClass(), "unit", enum46);
        setLongField(term12269, term12269.getClass(), "value", -5248475803419977214L);
        setLongField(term12271, term12271.getClass(), "seconds", 1853981979L);
        setIntField(term12271, term12271.getClass(), "nanos", 281000000);
        setField(term12269, term12269.getClass(), "instant", term12271);
        setField(term12269, term12269.getClass(), "valueAsString", "KoyGrUJeJW");
        setField(term12186, term12186.getClass(), "atime", term12269);
        setField(term12286, term12286.getClass(), "unit", enum47);
        setLongField(term12286, term12286.getClass(), "value", -6723783499250797216L);
        setLongField(term12312, term12312.getClass(), "seconds", 1795954337L);
        setIntField(term12312, term12312.getClass(), "nanos", 628000000);
        setField(term12286, term12286.getClass(), "instant", term12312);
        setField(term12286, term12286.getClass(), "valueAsString", "HqBOwkVqjD");
        setField(term12186, term12186.getClass(), "ctime", term12286);
        setLongField(term12186, term12186.getClass(), "crc", -1L);
        setLongField(term12186, term12186.getClass(), "csize", -1L);
        setIntField(term12186, term12186.getClass(), "flag", 339854490);
        setByteElement(term12332, 0, (byte) 84);
        setField(term12186, term12186.getClass(), "extra", term12332);
        setField(term12186, term12186.getClass(), "comment", "MAcUBcBckh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addAsFirstExtraField", argTypes, term12186, args);
    }

};


