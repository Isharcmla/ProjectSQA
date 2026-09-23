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

public class ZipArchiveEntry_addExtraField_64781258428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17222;

    public ZipArchiveEntry_addExtraField_64781258428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17399 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term17398 = ((Class) term17399).getDeclaredField((String) "SECONDS");
        ((Field) term17398).setAccessible(true);
        Object enum65 = ((Field) term17398).get((Object) null);
        Class<? extends Object> term17582 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term17581 = ((Class) term17582).getDeclaredField((String) "DAYS");
        ((Field) term17581).setAccessible(true);
        Object enum66 = ((Field) term17581).get((Object) null);
        Class<? extends Object> term17756 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term17755 = ((Class) term17756).getDeclaredField((String) "HOURS");
        ((Field) term17755).setAccessible(true);
        Object enum67 = ((Field) term17755).get((Object) null);
        term17222 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term17231 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 8);
        Object term17232 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term17233 = (byte[]) newByteArray(5);
        byte[] term17239 = (byte[]) newByteArray(6);
        byte[] term17248 = (byte[]) newByteArray(3);
        Object term17252 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term17262 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term17283 = newInstance(Class.forName("java.time.Instant"));
        Object term17298 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term17316 = newInstance(Class.forName("java.time.Instant"));
        Object term17331 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term17350 = newInstance(Class.forName("java.time.Instant"));
        byte[] term17370 = (byte[]) newByteArray(0);
        setIntField(term17222, term17222.getClass(), "method", -1);
        setLongField(term17222, term17222.getClass(), "size", -1L);
        setIntField(term17222, term17222.getClass(), "internalAttributes", 1102721075);
        setIntField(term17222, term17222.getClass(), "versionRequired", -426764678);
        setIntField(term17222, term17222.getClass(), "versionMadeBy", -1222614956);
        setIntField(term17222, term17222.getClass(), "platform", -1870495012);
        setIntField(term17222, term17222.getClass(), "rawFlag", -1310015129);
        setLongField(term17222, term17222.getClass(), "externalAttributes", -5216789073301458893L);
        setField(term17222, term17222.getClass(), "extraFields", term17231);
        setByteElement(term17233, 0, (byte) -59);
        setByteElement(term17233, 1, (byte) 126);
        setByteElement(term17233, 2, (byte) -15);
        setByteElement(term17233, 3, (byte) 60);
        setByteElement(term17233, 4, (byte) -51);
        setField(term17232, term17232.getClass(), "localFileData", term17233);
        setByteElement(term17239, 0, (byte) 65);
        setByteElement(term17239, 1, (byte) 103);
        setByteElement(term17239, 2, (byte) -19);
        setByteElement(term17239, 3, (byte) -36);
        setByteElement(term17239, 4, (byte) -23);
        setByteElement(term17239, 5, (byte) -100);
        setField(term17232, term17232.getClass(), "centralDirectoryData", term17239);
        setField(term17222, term17222.getClass(), "unparseableExtra", term17232);
        setField(term17222, term17222.getClass(), "name", "");
        setByteElement(term17248, 0, (byte) 23);
        setByteElement(term17248, 1, (byte) -30);
        setByteElement(term17248, 2, (byte) -37);
        setField(term17222, term17222.getClass(), "rawName", term17248);
        setBooleanField(term17252, term17252.getClass(), "languageEncodingFlag", false);
        setBooleanField(term17252, term17252.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term17252, term17252.getClass(), "encryptionFlag", false);
        setBooleanField(term17252, term17252.getClass(), "strongEncryptionFlag", false);
        setIntField(term17252, term17252.getClass(), "slidingDictionarySize", 0);
        setIntField(term17252, term17252.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term17222, term17222.getClass(), "gpb", term17252);
        setLongField(term17222, term17222.getClass(), "xdostime", -1L);
        setField(term17262, term17262.getClass(), "unit", enum65);
        setLongField(term17262, term17262.getClass(), "value", -1832940336320585644L);
        setLongField(term17283, term17283.getClass(), "seconds", 1643999113L);
        setIntField(term17283, term17283.getClass(), "nanos", 575000000);
        setField(term17262, term17262.getClass(), "instant", term17283);
        setField(term17262, term17262.getClass(), "valueAsString", "QXzGXbEXMu");
        setField(term17222, term17222.getClass(), "mtime", term17262);
        setField(term17298, term17298.getClass(), "unit", enum66);
        setLongField(term17298, term17298.getClass(), "value", -8033714905181142681L);
        setLongField(term17316, term17316.getClass(), "seconds", 1689446810L);
        setIntField(term17316, term17316.getClass(), "nanos", 999000000);
        setField(term17298, term17298.getClass(), "instant", term17316);
        setField(term17298, term17298.getClass(), "valueAsString", "qxSDVejjiY");
        setField(term17222, term17222.getClass(), "atime", term17298);
        setField(term17331, term17331.getClass(), "unit", enum67);
        setLongField(term17331, term17331.getClass(), "value", -9040825890007374809L);
        setLongField(term17350, term17350.getClass(), "seconds", 1570732321L);
        setIntField(term17350, term17350.getClass(), "nanos", 79000000);
        setField(term17331, term17331.getClass(), "instant", term17350);
        setField(term17331, term17331.getClass(), "valueAsString", "xBsXSDjXYK");
        setField(term17222, term17222.getClass(), "ctime", term17331);
        setLongField(term17222, term17222.getClass(), "crc", -1L);
        setLongField(term17222, term17222.getClass(), "csize", -1L);
        setIntField(term17222, term17222.getClass(), "flag", -2104981311);
        setField(term17222, term17222.getClass(), "extra", term17370);
        setField(term17222, term17222.getClass(), "comment", "sEnIVFtZuQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addExtraField", argTypes, term17222, args);
    }

};


