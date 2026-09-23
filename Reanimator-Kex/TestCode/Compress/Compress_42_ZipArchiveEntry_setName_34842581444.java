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

public class ZipArchiveEntry_setName_34842581444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28302;
     Object term28497;

    public ZipArchiveEntry_setName_34842581444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28516 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term28515 = ((Class) term28516).getDeclaredField((String) "HOURS");
        ((Field) term28515).setAccessible(true);
        Object enum107 = ((Field) term28515).get((Object) null);
        Class<? extends Object> term28693 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term28692 = ((Class) term28693).getDeclaredField((String) "NANOSECONDS");
        ((Field) term28692).setAccessible(true);
        Object enum108 = ((Field) term28692).get((Object) null);
        Class<? extends Object> term28888 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term28887 = ((Class) term28888).getDeclaredField((String) "MICROSECONDS");
        ((Field) term28887).setAccessible(true);
        Object enum109 = ((Field) term28887).get((Object) null);
        term28302 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term28311 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 8);
        Object term28312 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term28313 = (byte[]) newByteArray(0);
        byte[] term28314 = (byte[]) newByteArray(7);
        byte[] term28324 = (byte[]) newByteArray(9);
        Object term28334 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term28344 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term28363 = newInstance(Class.forName("java.time.Instant"));
        Object term28378 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term28403 = newInstance(Class.forName("java.time.Instant"));
        Object term28418 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term28444 = newInstance(Class.forName("java.time.Instant"));
        byte[] term28464 = (byte[]) newByteArray(7);
        setIntField(term28302, term28302.getClass(), "method", -1);
        setLongField(term28302, term28302.getClass(), "size", -1L);
        setIntField(term28302, term28302.getClass(), "internalAttributes", -1422859977);
        setIntField(term28302, term28302.getClass(), "versionRequired", -1972436591);
        setIntField(term28302, term28302.getClass(), "versionMadeBy", 68922753);
        setIntField(term28302, term28302.getClass(), "platform", -220791533);
        setIntField(term28302, term28302.getClass(), "rawFlag", 1741500243);
        setLongField(term28302, term28302.getClass(), "externalAttributes", 5219030281405653303L);
        setField(term28302, term28302.getClass(), "extraFields", term28311);
        setField(term28312, term28312.getClass(), "localFileData", term28313);
        setByteElement(term28314, 0, (byte) 18);
        setByteElement(term28314, 1, (byte) -53);
        setByteElement(term28314, 2, (byte) 46);
        setByteElement(term28314, 3, (byte) -106);
        setByteElement(term28314, 4, (byte) 3);
        setByteElement(term28314, 5, (byte) 120);
        setByteElement(term28314, 6, (byte) 120);
        setField(term28312, term28312.getClass(), "centralDirectoryData", term28314);
        setField(term28302, term28302.getClass(), "unparseableExtra", term28312);
        setField(term28302, term28302.getClass(), "name", "");
        setByteElement(term28324, 0, (byte) -126);
        setByteElement(term28324, 1, (byte) -44);
        setByteElement(term28324, 2, (byte) -119);
        setByteElement(term28324, 3, (byte) 65);
        setByteElement(term28324, 4, (byte) -125);
        setByteElement(term28324, 5, (byte) -126);
        setByteElement(term28324, 6, (byte) 80);
        setByteElement(term28324, 7, (byte) 118);
        setByteElement(term28324, 8, (byte) -116);
        setField(term28302, term28302.getClass(), "rawName", term28324);
        setBooleanField(term28334, term28334.getClass(), "languageEncodingFlag", false);
        setBooleanField(term28334, term28334.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term28334, term28334.getClass(), "encryptionFlag", false);
        setBooleanField(term28334, term28334.getClass(), "strongEncryptionFlag", false);
        setIntField(term28334, term28334.getClass(), "slidingDictionarySize", 0);
        setIntField(term28334, term28334.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term28302, term28302.getClass(), "gpb", term28334);
        setLongField(term28302, term28302.getClass(), "xdostime", -1L);
        setField(term28344, term28344.getClass(), "unit", enum107);
        setLongField(term28344, term28344.getClass(), "value", -8471550651709805183L);
        setLongField(term28363, term28363.getClass(), "seconds", 1299449078L);
        setIntField(term28363, term28363.getClass(), "nanos", 379000000);
        setField(term28344, term28344.getClass(), "instant", term28363);
        setField(term28344, term28344.getClass(), "valueAsString", "DSNsTGYXDF");
        setField(term28302, term28302.getClass(), "mtime", term28344);
        setField(term28378, term28378.getClass(), "unit", enum108);
        setLongField(term28378, term28378.getClass(), "value", -948292411727204525L);
        setLongField(term28403, term28403.getClass(), "seconds", 1476988157L);
        setIntField(term28403, term28403.getClass(), "nanos", 231000000);
        setField(term28378, term28378.getClass(), "instant", term28403);
        setField(term28378, term28378.getClass(), "valueAsString", "sQvGcVjdEx");
        setField(term28302, term28302.getClass(), "atime", term28378);
        setField(term28418, term28418.getClass(), "unit", enum109);
        setLongField(term28418, term28418.getClass(), "value", -8892586408602479513L);
        setLongField(term28444, term28444.getClass(), "seconds", 1386198897L);
        setIntField(term28444, term28444.getClass(), "nanos", 453000000);
        setField(term28418, term28418.getClass(), "instant", term28444);
        setField(term28418, term28418.getClass(), "valueAsString", "rLHAoqXgPh");
        setField(term28302, term28302.getClass(), "ctime", term28418);
        setLongField(term28302, term28302.getClass(), "crc", -1L);
        setLongField(term28302, term28302.getClass(), "csize", -1L);
        setIntField(term28302, term28302.getClass(), "flag", -2070466617);
        setByteElement(term28464, 0, (byte) 85);
        setByteElement(term28464, 1, (byte) 24);
        setByteElement(term28464, 2, (byte) -51);
        setByteElement(term28464, 3, (byte) 123);
        setByteElement(term28464, 4, (byte) 104);
        setByteElement(term28464, 5, (byte) 85);
        setByteElement(term28464, 6, (byte) -27);
        setField(term28302, term28302.getClass(), "extra", term28464);
        setField(term28302, term28302.getClass(), "comment", "zUlRdimJtU");
        term28497 = (byte[]) newByteArray(1);
        setByteElement(term28497, 0, (byte) 106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "vwbEQQNQrx";
        args[1] = term28497;
        callMethod(klass, "setName", argTypes, term28302, args);
    }

};


