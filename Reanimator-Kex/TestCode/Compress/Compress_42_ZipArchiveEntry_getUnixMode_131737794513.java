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

public class ZipArchiveEntry_getUnixMode_131737794513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7343;

    public ZipArchiveEntry_getUnixMode_131737794513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7527 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term7526 = ((Class) term7527).getDeclaredField((String) "HOURS");
        ((Field) term7526).setAccessible(true);
        Object enum28 = ((Field) term7526).get((Object) null);
        Class<? extends Object> term7704 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term7703 = ((Class) term7704).getDeclaredField((String) "SECONDS");
        ((Field) term7703).setAccessible(true);
        Object enum29 = ((Field) term7703).get((Object) null);
        term7343 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term7352 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 6);
        Object term7353 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term7354 = (byte[]) newByteArray(8);
        byte[] term7363 = (byte[]) newByteArray(9);
        byte[] term7375 = (byte[]) newByteArray(7);
        Object term7383 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term7393 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term7412 = newInstance(Class.forName("java.time.Instant"));
        Object term7427 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term7448 = newInstance(Class.forName("java.time.Instant"));
        Object term7463 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term7465 = newInstance(Class.forName("java.time.Instant"));
        byte[] term7485 = (byte[]) newByteArray(3);
        setIntField(term7343, term7343.getClass(), "method", -1);
        setLongField(term7343, term7343.getClass(), "size", -1L);
        setIntField(term7343, term7343.getClass(), "internalAttributes", -478195677);
        setIntField(term7343, term7343.getClass(), "versionRequired", 972867650);
        setIntField(term7343, term7343.getClass(), "versionMadeBy", 1655935355);
        setIntField(term7343, term7343.getClass(), "platform", -481533957);
        setIntField(term7343, term7343.getClass(), "rawFlag", 1240914516);
        setLongField(term7343, term7343.getClass(), "externalAttributes", 4178434741742309755L);
        setField(term7343, term7343.getClass(), "extraFields", term7352);
        setByteElement(term7354, 0, (byte) 107);
        setByteElement(term7354, 1, (byte) -109);
        setByteElement(term7354, 2, (byte) 122);
        setByteElement(term7354, 3, (byte) 83);
        setByteElement(term7354, 4, (byte) -123);
        setByteElement(term7354, 5, (byte) -76);
        setByteElement(term7354, 6, (byte) -115);
        setByteElement(term7354, 7, (byte) -48);
        setField(term7353, term7353.getClass(), "localFileData", term7354);
        setByteElement(term7363, 0, (byte) 126);
        setByteElement(term7363, 1, (byte) -2);
        setByteElement(term7363, 2, (byte) 103);
        setByteElement(term7363, 3, (byte) 23);
        setByteElement(term7363, 4, (byte) 96);
        setByteElement(term7363, 5, (byte) -70);
        setByteElement(term7363, 6, (byte) -73);
        setByteElement(term7363, 7, (byte) 1);
        setByteElement(term7363, 8, (byte) 99);
        setField(term7353, term7353.getClass(), "centralDirectoryData", term7363);
        setField(term7343, term7343.getClass(), "unparseableExtra", term7353);
        setField(term7343, term7343.getClass(), "name", "");
        setByteElement(term7375, 0, (byte) -121);
        setByteElement(term7375, 1, (byte) -50);
        setByteElement(term7375, 2, (byte) -79);
        setByteElement(term7375, 3, (byte) 110);
        setByteElement(term7375, 4, (byte) -111);
        setByteElement(term7375, 5, (byte) -54);
        setByteElement(term7375, 6, (byte) -25);
        setField(term7343, term7343.getClass(), "rawName", term7375);
        setBooleanField(term7383, term7383.getClass(), "languageEncodingFlag", false);
        setBooleanField(term7383, term7383.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term7383, term7383.getClass(), "encryptionFlag", false);
        setBooleanField(term7383, term7383.getClass(), "strongEncryptionFlag", false);
        setIntField(term7383, term7383.getClass(), "slidingDictionarySize", 0);
        setIntField(term7383, term7383.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term7343, term7343.getClass(), "gpb", term7383);
        setLongField(term7343, term7343.getClass(), "xdostime", -1L);
        setField(term7393, term7393.getClass(), "unit", enum28);
        setLongField(term7393, term7393.getClass(), "value", -2068172595987555756L);
        setLongField(term7412, term7412.getClass(), "seconds", 1496877828L);
        setIntField(term7412, term7412.getClass(), "nanos", 764000000);
        setField(term7393, term7393.getClass(), "instant", term7412);
        setField(term7393, term7393.getClass(), "valueAsString", "BndsHwAFMv");
        setField(term7343, term7343.getClass(), "mtime", term7393);
        setField(term7427, term7427.getClass(), "unit", enum29);
        setLongField(term7427, term7427.getClass(), "value", -6292278961887936280L);
        setLongField(term7448, term7448.getClass(), "seconds", 1691886468L);
        setIntField(term7448, term7448.getClass(), "nanos", 367000000);
        setField(term7427, term7427.getClass(), "instant", term7448);
        setField(term7427, term7427.getClass(), "valueAsString", "GzFkzHGYFt");
        setField(term7343, term7343.getClass(), "atime", term7427);
        setField(term7463, term7463.getClass(), "unit", enum28);
        setLongField(term7463, term7463.getClass(), "value", -6645965768855543712L);
        setLongField(term7465, term7465.getClass(), "seconds", 1442388534L);
        setIntField(term7465, term7465.getClass(), "nanos", 632000000);
        setField(term7463, term7463.getClass(), "instant", term7465);
        setField(term7463, term7463.getClass(), "valueAsString", "tShwQLRGNe");
        setField(term7343, term7343.getClass(), "ctime", term7463);
        setLongField(term7343, term7343.getClass(), "crc", -1L);
        setLongField(term7343, term7343.getClass(), "csize", -1L);
        setIntField(term7343, term7343.getClass(), "flag", -1465035361);
        setByteElement(term7485, 0, (byte) -35);
        setByteElement(term7485, 1, (byte) 3);
        setByteElement(term7485, 2, (byte) -10);
        setField(term7343, term7343.getClass(), "extra", term7485);
        setField(term7343, term7343.getClass(), "comment", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnixMode", argTypes, term7343, args);
    }

};


