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

public class ZipArchiveEntry_setExtra_201311499634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21382;
     Object term21551;

    public ZipArchiveEntry_setExtra_201311499634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21568 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term21567 = ((Class) term21568).getDeclaredField((String) "SECONDS");
        ((Field) term21567).setAccessible(true);
        Object enum81 = ((Field) term21567).get((Object) null);
        Class<? extends Object> term21751 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term21750 = ((Class) term21751).getDeclaredField((String) "DAYS");
        ((Field) term21750).setAccessible(true);
        Object enum82 = ((Field) term21750).get((Object) null);
        Class<? extends Object> term21925 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term21924 = ((Class) term21925).getDeclaredField((String) "MICROSECONDS");
        ((Field) term21924).setAccessible(true);
        Object enum83 = ((Field) term21924).get((Object) null);
        term21382 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term21391 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 8);
        Object term21392 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term21393 = (byte[]) newByteArray(5);
        byte[] term21399 = (byte[]) newByteArray(2);
        byte[] term21404 = (byte[]) newByteArray(6);
        Object term21411 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term21421 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term21442 = newInstance(Class.forName("java.time.Instant"));
        Object term21457 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term21475 = newInstance(Class.forName("java.time.Instant"));
        Object term21490 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term21516 = newInstance(Class.forName("java.time.Instant"));
        byte[] term21536 = (byte[]) newByteArray(1);
        setIntField(term21382, term21382.getClass(), "method", -1);
        setLongField(term21382, term21382.getClass(), "size", -1L);
        setIntField(term21382, term21382.getClass(), "internalAttributes", 1008080511);
        setIntField(term21382, term21382.getClass(), "versionRequired", 1935707624);
        setIntField(term21382, term21382.getClass(), "versionMadeBy", 1507074215);
        setIntField(term21382, term21382.getClass(), "platform", -282881827);
        setIntField(term21382, term21382.getClass(), "rawFlag", -1183353915);
        setLongField(term21382, term21382.getClass(), "externalAttributes", 6273754186658578034L);
        setField(term21382, term21382.getClass(), "extraFields", term21391);
        setByteElement(term21393, 0, (byte) 56);
        setByteElement(term21393, 1, (byte) -47);
        setByteElement(term21393, 2, (byte) 126);
        setByteElement(term21393, 3, (byte) 118);
        setByteElement(term21393, 4, (byte) -114);
        setField(term21392, term21392.getClass(), "localFileData", term21393);
        setByteElement(term21399, 0, (byte) 97);
        setByteElement(term21399, 1, (byte) -75);
        setField(term21392, term21392.getClass(), "centralDirectoryData", term21399);
        setField(term21382, term21382.getClass(), "unparseableExtra", term21392);
        setField(term21382, term21382.getClass(), "name", "");
        setByteElement(term21404, 0, (byte) 52);
        setByteElement(term21404, 1, (byte) -128);
        setByteElement(term21404, 2, (byte) 120);
        setByteElement(term21404, 3, (byte) 49);
        setByteElement(term21404, 4, (byte) 74);
        setByteElement(term21404, 5, (byte) 37);
        setField(term21382, term21382.getClass(), "rawName", term21404);
        setBooleanField(term21411, term21411.getClass(), "languageEncodingFlag", false);
        setBooleanField(term21411, term21411.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term21411, term21411.getClass(), "encryptionFlag", false);
        setBooleanField(term21411, term21411.getClass(), "strongEncryptionFlag", false);
        setIntField(term21411, term21411.getClass(), "slidingDictionarySize", 0);
        setIntField(term21411, term21411.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term21382, term21382.getClass(), "gpb", term21411);
        setLongField(term21382, term21382.getClass(), "xdostime", -1L);
        setField(term21421, term21421.getClass(), "unit", enum81);
        setLongField(term21421, term21421.getClass(), "value", 3620247240684476031L);
        setLongField(term21442, term21442.getClass(), "seconds", 1603923786L);
        setIntField(term21442, term21442.getClass(), "nanos", 801000000);
        setField(term21421, term21421.getClass(), "instant", term21442);
        setField(term21421, term21421.getClass(), "valueAsString", "xIeFjkHkOe");
        setField(term21382, term21382.getClass(), "mtime", term21421);
        setField(term21457, term21457.getClass(), "unit", enum82);
        setLongField(term21457, term21457.getClass(), "value", 8313800941204938919L);
        setLongField(term21475, term21475.getClass(), "seconds", 1369557267L);
        setIntField(term21475, term21475.getClass(), "nanos", 611000000);
        setField(term21457, term21457.getClass(), "instant", term21475);
        setField(term21457, term21457.getClass(), "valueAsString", "SdCKLMIYnX");
        setField(term21382, term21382.getClass(), "atime", term21457);
        setField(term21490, term21490.getClass(), "unit", enum83);
        setLongField(term21490, term21490.getClass(), "value", -1214968196781083707L);
        setLongField(term21516, term21516.getClass(), "seconds", 1510293079L);
        setIntField(term21516, term21516.getClass(), "nanos", 351000000);
        setField(term21490, term21490.getClass(), "instant", term21516);
        setField(term21490, term21490.getClass(), "valueAsString", "OJJtVNPyKZ");
        setField(term21382, term21382.getClass(), "ctime", term21490);
        setLongField(term21382, term21382.getClass(), "crc", -1L);
        setLongField(term21382, term21382.getClass(), "csize", -1L);
        setIntField(term21382, term21382.getClass(), "flag", -420030135);
        setByteElement(term21536, 0, (byte) -78);
        setField(term21382, term21382.getClass(), "extra", term21536);
        setField(term21382, term21382.getClass(), "comment", "AKNapTAfmD");
        term21551 = (byte[]) newByteArray(2);
        setByteElement(term21551, 0, (byte) 3);
        setByteElement(term21551, 1, (byte) -30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term21551;
        callMethod(klass, "setExtra", argTypes, term21382, args);
    }

};


