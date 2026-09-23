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
import java.lang.Integer;

public class ZipArchiveEntry_setPlatform_149379641316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9243;
     Object term9431;

    public ZipArchiveEntry_setPlatform_149379641316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9456 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term9455 = ((Class) term9456).getDeclaredField((String) "MICROSECONDS");
        ((Field) term9455).setAccessible(true);
        Object enum35 = ((Field) term9455).get((Object) null);
        Class<? extends Object> term9654 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term9653 = ((Class) term9654).getDeclaredField((String) "DAYS");
        ((Field) term9653).setAccessible(true);
        Object enum36 = ((Field) term9653).get((Object) null);
        Class<? extends Object> term9828 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term9827 = ((Class) term9828).getDeclaredField((String) "MILLISECONDS");
        ((Field) term9827).setAccessible(true);
        Object enum37 = ((Field) term9827).get((Object) null);
        term9243 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term9252 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 7);
        Object term9253 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term9254 = (byte[]) newByteArray(9);
        byte[] term9264 = (byte[]) newByteArray(7);
        byte[] term9274 = (byte[]) newByteArray(6);
        Object term9281 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term9291 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term9317 = newInstance(Class.forName("java.time.Instant"));
        Object term9332 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term9350 = newInstance(Class.forName("java.time.Instant"));
        Object term9365 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term9391 = newInstance(Class.forName("java.time.Instant"));
        byte[] term9411 = (byte[]) newByteArray(6);
        setIntField(term9243, term9243.getClass(), "method", -1);
        setLongField(term9243, term9243.getClass(), "size", -1L);
        setIntField(term9243, term9243.getClass(), "internalAttributes", 1596213415);
        setIntField(term9243, term9243.getClass(), "versionRequired", -268815336);
        setIntField(term9243, term9243.getClass(), "versionMadeBy", -1210583429);
        setIntField(term9243, term9243.getClass(), "platform", -663691365);
        setIntField(term9243, term9243.getClass(), "rawFlag", 339854490);
        setLongField(term9243, term9243.getClass(), "externalAttributes", -1154553077993834885L);
        setField(term9243, term9243.getClass(), "extraFields", term9252);
        setByteElement(term9254, 0, (byte) 100);
        setByteElement(term9254, 1, (byte) -1);
        setByteElement(term9254, 2, (byte) -127);
        setByteElement(term9254, 3, (byte) -118);
        setByteElement(term9254, 4, (byte) 69);
        setByteElement(term9254, 5, (byte) 112);
        setByteElement(term9254, 6, (byte) 77);
        setByteElement(term9254, 7, (byte) -1);
        setByteElement(term9254, 8, (byte) -83);
        setField(term9253, term9253.getClass(), "localFileData", term9254);
        setByteElement(term9264, 0, (byte) -63);
        setByteElement(term9264, 1, (byte) 108);
        setByteElement(term9264, 2, (byte) -105);
        setByteElement(term9264, 3, (byte) 33);
        setByteElement(term9264, 4, (byte) 109);
        setByteElement(term9264, 5, (byte) -54);
        setByteElement(term9264, 6, (byte) -85);
        setField(term9253, term9253.getClass(), "centralDirectoryData", term9264);
        setField(term9243, term9243.getClass(), "unparseableExtra", term9253);
        setField(term9243, term9243.getClass(), "name", "");
        setByteElement(term9274, 0, (byte) 81);
        setByteElement(term9274, 1, (byte) -113);
        setByteElement(term9274, 2, (byte) 90);
        setByteElement(term9274, 3, (byte) 10);
        setByteElement(term9274, 4, (byte) 87);
        setByteElement(term9274, 5, (byte) -35);
        setField(term9243, term9243.getClass(), "rawName", term9274);
        setBooleanField(term9281, term9281.getClass(), "languageEncodingFlag", false);
        setBooleanField(term9281, term9281.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term9281, term9281.getClass(), "encryptionFlag", false);
        setBooleanField(term9281, term9281.getClass(), "strongEncryptionFlag", false);
        setIntField(term9281, term9281.getClass(), "slidingDictionarySize", 0);
        setIntField(term9281, term9281.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term9243, term9243.getClass(), "gpb", term9281);
        setLongField(term9243, term9243.getClass(), "xdostime", -1L);
        setField(term9291, term9291.getClass(), "unit", enum35);
        setLongField(term9291, term9291.getClass(), "value", -2850532706972744550L);
        setLongField(term9317, term9317.getClass(), "seconds", 1464439789L);
        setIntField(term9317, term9317.getClass(), "nanos", 888000000);
        setField(term9291, term9291.getClass(), "instant", term9317);
        setField(term9291, term9291.getClass(), "valueAsString", "ffYhPOzlUs");
        setField(term9243, term9243.getClass(), "mtime", term9291);
        setField(term9332, term9332.getClass(), "unit", enum36);
        setLongField(term9332, term9332.getClass(), "value", -2644215923136513282L);
        setLongField(term9350, term9350.getClass(), "seconds", 1405297189L);
        setIntField(term9350, term9350.getClass(), "nanos", 488000000);
        setField(term9332, term9332.getClass(), "instant", term9350);
        setField(term9332, term9332.getClass(), "valueAsString", "MLqYREekMl");
        setField(term9243, term9243.getClass(), "atime", term9332);
        setField(term9365, term9365.getClass(), "unit", enum37);
        setLongField(term9365, term9365.getClass(), "value", -1468719814009985452L);
        setLongField(term9391, term9391.getClass(), "seconds", 1822722644L);
        setIntField(term9391, term9391.getClass(), "nanos", 50000000);
        setField(term9365, term9365.getClass(), "instant", term9391);
        setField(term9365, term9365.getClass(), "valueAsString", "ytSBIKXogI");
        setField(term9243, term9243.getClass(), "ctime", term9365);
        setLongField(term9243, term9243.getClass(), "crc", -1L);
        setLongField(term9243, term9243.getClass(), "csize", -1L);
        setIntField(term9243, term9243.getClass(), "flag", -615654495);
        setByteElement(term9411, 0, (byte) -14);
        setByteElement(term9411, 1, (byte) 10);
        setByteElement(term9411, 2, (byte) 65);
        setByteElement(term9411, 3, (byte) -44);
        setByteElement(term9411, 4, (byte) 115);
        setByteElement(term9411, 5, (byte) -32);
        setField(term9243, term9243.getClass(), "extra", term9411);
        setField(term9243, term9243.getClass(), "comment", "nHXjMycHlU");
        term9431 = new Integer(-341962980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9431;
        callMethod(klass, "setPlatform", argTypes, term9243, args);
    }

};


