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

public class ZipArchiveEntry_getVersionRequired_129963898354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35416;

    public ZipArchiveEntry_getVersionRequired_129963898354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35596 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term35595 = ((Class) term35596).getDeclaredField((String) "HOURS");
        ((Field) term35595).setAccessible(true);
        Object enum134 = ((Field) term35595).get((Object) null);
        Class<? extends Object> term35783 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term35782 = ((Class) term35783).getDeclaredField((String) "NANOSECONDS");
        ((Field) term35782).setAccessible(true);
        Object enum135 = ((Field) term35782).get((Object) null);
        term35416 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term35425 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 5);
        Object term35426 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term35427 = (byte[]) newByteArray(4);
        byte[] term35432 = (byte[]) newByteArray(7);
        byte[] term35442 = (byte[]) newByteArray(8);
        Object term35451 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term35461 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term35480 = newInstance(Class.forName("java.time.Instant"));
        Object term35495 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term35497 = newInstance(Class.forName("java.time.Instant"));
        Object term35512 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term35537 = newInstance(Class.forName("java.time.Instant"));
        byte[] term35557 = (byte[]) newByteArray(5);
        setIntField(term35416, term35416.getClass(), "method", -1);
        setLongField(term35416, term35416.getClass(), "size", -1L);
        setIntField(term35416, term35416.getClass(), "internalAttributes", -1703035419);
        setIntField(term35416, term35416.getClass(), "versionRequired", 765766290);
        setIntField(term35416, term35416.getClass(), "versionMadeBy", -1284825282);
        setIntField(term35416, term35416.getClass(), "platform", -1941343035);
        setIntField(term35416, term35416.getClass(), "rawFlag", 947897214);
        setLongField(term35416, term35416.getClass(), "externalAttributes", 5330761990446327930L);
        setField(term35416, term35416.getClass(), "extraFields", term35425);
        setByteElement(term35427, 0, (byte) 34);
        setByteElement(term35427, 1, (byte) 100);
        setByteElement(term35427, 2, (byte) 26);
        setByteElement(term35427, 3, (byte) -128);
        setField(term35426, term35426.getClass(), "localFileData", term35427);
        setByteElement(term35432, 0, (byte) 122);
        setByteElement(term35432, 1, (byte) -121);
        setByteElement(term35432, 2, (byte) 43);
        setByteElement(term35432, 3, (byte) 18);
        setByteElement(term35432, 4, (byte) -43);
        setByteElement(term35432, 5, (byte) -64);
        setByteElement(term35432, 6, (byte) 42);
        setField(term35426, term35426.getClass(), "centralDirectoryData", term35432);
        setField(term35416, term35416.getClass(), "unparseableExtra", term35426);
        setField(term35416, term35416.getClass(), "name", "");
        setByteElement(term35442, 0, (byte) 1);
        setByteElement(term35442, 1, (byte) 29);
        setByteElement(term35442, 2, (byte) -120);
        setByteElement(term35442, 3, (byte) -15);
        setByteElement(term35442, 4, (byte) 30);
        setByteElement(term35442, 5, (byte) 77);
        setByteElement(term35442, 6, (byte) -27);
        setByteElement(term35442, 7, (byte) -78);
        setField(term35416, term35416.getClass(), "rawName", term35442);
        setBooleanField(term35451, term35451.getClass(), "languageEncodingFlag", false);
        setBooleanField(term35451, term35451.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term35451, term35451.getClass(), "encryptionFlag", false);
        setBooleanField(term35451, term35451.getClass(), "strongEncryptionFlag", false);
        setIntField(term35451, term35451.getClass(), "slidingDictionarySize", 0);
        setIntField(term35451, term35451.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term35416, term35416.getClass(), "gpb", term35451);
        setLongField(term35416, term35416.getClass(), "xdostime", -1L);
        setField(term35461, term35461.getClass(), "unit", enum134);
        setLongField(term35461, term35461.getClass(), "value", -3954795081650780841L);
        setLongField(term35480, term35480.getClass(), "seconds", 1380470861L);
        setIntField(term35480, term35480.getClass(), "nanos", 286000000);
        setField(term35461, term35461.getClass(), "instant", term35480);
        setField(term35461, term35461.getClass(), "valueAsString", "hOncybyCAH");
        setField(term35416, term35416.getClass(), "mtime", term35461);
        setField(term35495, term35495.getClass(), "unit", enum134);
        setLongField(term35495, term35495.getClass(), "value", 3288791194263207397L);
        setLongField(term35497, term35497.getClass(), "seconds", 1599112543L);
        setIntField(term35497, term35497.getClass(), "nanos", 267000000);
        setField(term35495, term35495.getClass(), "instant", term35497);
        setField(term35495, term35495.getClass(), "valueAsString", "QduALnDSVo");
        setField(term35416, term35416.getClass(), "atime", term35495);
        setField(term35512, term35512.getClass(), "unit", enum135);
        setLongField(term35512, term35512.getClass(), "value", 3288941170644426558L);
        setLongField(term35537, term35537.getClass(), "seconds", 1623705334L);
        setIntField(term35537, term35537.getClass(), "nanos", 907000000);
        setField(term35512, term35512.getClass(), "instant", term35537);
        setField(term35512, term35512.getClass(), "valueAsString", "izPpKDErnQ");
        setField(term35416, term35416.getClass(), "ctime", term35512);
        setLongField(term35416, term35416.getClass(), "crc", -1L);
        setLongField(term35416, term35416.getClass(), "csize", -1L);
        setIntField(term35416, term35416.getClass(), "flag", 1496340209);
        setByteElement(term35557, 0, (byte) 76);
        setByteElement(term35557, 1, (byte) 15);
        setByteElement(term35557, 2, (byte) 68);
        setByteElement(term35557, 3, (byte) 60);
        setByteElement(term35557, 4, (byte) 118);
        setField(term35416, term35416.getClass(), "extra", term35557);
        setField(term35416, term35416.getClass(), "comment", "NnpwZBUTvx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionRequired", argTypes, term35416, args);
    }

};


