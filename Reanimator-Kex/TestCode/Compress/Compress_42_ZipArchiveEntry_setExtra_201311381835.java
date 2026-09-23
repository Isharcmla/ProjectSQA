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

public class ZipArchiveEntry_setExtra_201311381835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22135;

    public ZipArchiveEntry_setExtra_201311381835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22301 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term22300 = ((Class) term22301).getDeclaredField((String) "MINUTES");
        ((Field) term22300).setAccessible(true);
        Object enum84 = ((Field) term22300).get((Object) null);
        Class<? extends Object> term22484 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term22483 = ((Class) term22484).getDeclaredField((String) "MILLISECONDS");
        ((Field) term22483).setAccessible(true);
        Object enum85 = ((Field) term22483).get((Object) null);
        term22135 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term22144 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 7);
        Object term22145 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term22146 = (byte[]) newByteArray(3);
        byte[] term22150 = (byte[]) newByteArray(3);
        byte[] term22156 = (byte[]) newByteArray(4);
        Object term22161 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term22171 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term22192 = newInstance(Class.forName("java.time.Instant"));
        Object term22207 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term22233 = newInstance(Class.forName("java.time.Instant"));
        Object term22248 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term22250 = newInstance(Class.forName("java.time.Instant"));
        byte[] term22270 = (byte[]) newByteArray(6);
        setIntField(term22135, term22135.getClass(), "method", -1);
        setLongField(term22135, term22135.getClass(), "size", -1L);
        setIntField(term22135, term22135.getClass(), "internalAttributes", 49950830);
        setIntField(term22135, term22135.getClass(), "versionRequired", -525257914);
        setIntField(term22135, term22135.getClass(), "versionMadeBy", 147209682);
        setIntField(term22135, term22135.getClass(), "platform", 34470066);
        setIntField(term22135, term22135.getClass(), "rawFlag", 2058711405);
        setLongField(term22135, term22135.getClass(), "externalAttributes", -1804015692891701666L);
        setField(term22135, term22135.getClass(), "extraFields", term22144);
        setByteElement(term22146, 0, (byte) -67);
        setByteElement(term22146, 1, (byte) -67);
        setByteElement(term22146, 2, (byte) -94);
        setField(term22145, term22145.getClass(), "localFileData", term22146);
        setByteElement(term22150, 0, (byte) 78);
        setByteElement(term22150, 1, (byte) 8);
        setByteElement(term22150, 2, (byte) 25);
        setField(term22145, term22145.getClass(), "centralDirectoryData", term22150);
        setField(term22135, term22135.getClass(), "unparseableExtra", term22145);
        setField(term22135, term22135.getClass(), "name", "");
        setByteElement(term22156, 0, (byte) 103);
        setByteElement(term22156, 1, (byte) 111);
        setByteElement(term22156, 2, (byte) -43);
        setByteElement(term22156, 3, (byte) 35);
        setField(term22135, term22135.getClass(), "rawName", term22156);
        setBooleanField(term22161, term22161.getClass(), "languageEncodingFlag", false);
        setBooleanField(term22161, term22161.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term22161, term22161.getClass(), "encryptionFlag", false);
        setBooleanField(term22161, term22161.getClass(), "strongEncryptionFlag", false);
        setIntField(term22161, term22161.getClass(), "slidingDictionarySize", 0);
        setIntField(term22161, term22161.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term22135, term22135.getClass(), "gpb", term22161);
        setLongField(term22135, term22135.getClass(), "xdostime", -1L);
        setField(term22171, term22171.getClass(), "unit", enum84);
        setLongField(term22171, term22171.getClass(), "value", -6432617521836576658L);
        setLongField(term22192, term22192.getClass(), "seconds", 1335407252L);
        setIntField(term22192, term22192.getClass(), "nanos", 58000000);
        setField(term22171, term22171.getClass(), "instant", term22192);
        setField(term22171, term22171.getClass(), "valueAsString", "xJgPlLxpgC");
        setField(term22135, term22135.getClass(), "mtime", term22171);
        setField(term22207, term22207.getClass(), "unit", enum85);
        setLongField(term22207, term22207.getClass(), "value", -2255965562447970862L);
        setLongField(term22233, term22233.getClass(), "seconds", 1616851468L);
        setIntField(term22233, term22233.getClass(), "nanos", 678000000);
        setField(term22207, term22207.getClass(), "instant", term22233);
        setField(term22207, term22207.getClass(), "valueAsString", "EYtfuJaxiM");
        setField(term22135, term22135.getClass(), "atime", term22207);
        setField(term22248, term22248.getClass(), "unit", enum85);
        setLongField(term22248, term22248.getClass(), "value", 148047808219672941L);
        setLongField(term22250, term22250.getClass(), "seconds", 1319559754L);
        setIntField(term22250, term22250.getClass(), "nanos", 821000000);
        setField(term22248, term22248.getClass(), "instant", term22250);
        setField(term22248, term22248.getClass(), "valueAsString", "gCWtLVKVVe");
        setField(term22135, term22135.getClass(), "ctime", term22248);
        setLongField(term22135, term22135.getClass(), "crc", -1L);
        setLongField(term22135, term22135.getClass(), "csize", -1L);
        setIntField(term22135, term22135.getClass(), "flag", 1743683601);
        setByteElement(term22270, 0, (byte) 62);
        setByteElement(term22270, 1, (byte) 90);
        setByteElement(term22270, 2, (byte) -40);
        setByteElement(term22270, 3, (byte) 79);
        setByteElement(term22270, 4, (byte) -102);
        setByteElement(term22270, 5, (byte) 55);
        setField(term22135, term22135.getClass(), "extra", term22270);
        setField(term22135, term22135.getClass(), "comment", "fWKJoSoCwE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setExtra", argTypes, term22135, args);
    }

};


