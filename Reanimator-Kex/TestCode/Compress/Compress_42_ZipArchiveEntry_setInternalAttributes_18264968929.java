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

public class ZipArchiveEntry_setInternalAttributes_18264968929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4321;
     Object term4494;

    public ZipArchiveEntry_setInternalAttributes_18264968929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4509 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term4508 = ((Class) term4509).getDeclaredField((String) "DAYS");
        ((Field) term4508).setAccessible(true);
        Object enum16 = ((Field) term4508).get((Object) null);
        Class<? extends Object> term4683 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term4682 = ((Class) term4683).getDeclaredField((String) "MICROSECONDS");
        ((Field) term4682).setAccessible(true);
        Object enum17 = ((Field) term4682).get((Object) null);
        Class<? extends Object> term4881 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term4880 = ((Class) term4881).getDeclaredField((String) "MINUTES");
        ((Field) term4880).setAccessible(true);
        Object enum18 = ((Field) term4880).get((Object) null);
        term4321 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term4330 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 5);
        Object term4331 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term4332 = (byte[]) newByteArray(3);
        byte[] term4336 = (byte[]) newByteArray(7);
        byte[] term4346 = (byte[]) newByteArray(2);
        Object term4349 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term4359 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term4377 = newInstance(Class.forName("java.time.Instant"));
        Object term4392 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term4418 = newInstance(Class.forName("java.time.Instant"));
        Object term4433 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term4454 = newInstance(Class.forName("java.time.Instant"));
        byte[] term4474 = (byte[]) newByteArray(6);
        setIntField(term4321, term4321.getClass(), "method", -1);
        setLongField(term4321, term4321.getClass(), "size", -1L);
        setIntField(term4321, term4321.getClass(), "internalAttributes", -817164822);
        setIntField(term4321, term4321.getClass(), "versionRequired", -1016503459);
        setIntField(term4321, term4321.getClass(), "versionMadeBy", -1968847291);
        setIntField(term4321, term4321.getClass(), "platform", 579005622);
        setIntField(term4321, term4321.getClass(), "rawFlag", -14890619);
        setLongField(term4321, term4321.getClass(), "externalAttributes", -4365849114644724155L);
        setField(term4321, term4321.getClass(), "extraFields", term4330);
        setByteElement(term4332, 0, (byte) -128);
        setByteElement(term4332, 1, (byte) 66);
        setByteElement(term4332, 2, (byte) -112);
        setField(term4331, term4331.getClass(), "localFileData", term4332);
        setByteElement(term4336, 0, (byte) 81);
        setByteElement(term4336, 1, (byte) 65);
        setByteElement(term4336, 2, (byte) -44);
        setByteElement(term4336, 3, (byte) 33);
        setByteElement(term4336, 4, (byte) -74);
        setByteElement(term4336, 5, (byte) -84);
        setByteElement(term4336, 6, (byte) -53);
        setField(term4331, term4331.getClass(), "centralDirectoryData", term4336);
        setField(term4321, term4321.getClass(), "unparseableExtra", term4331);
        setField(term4321, term4321.getClass(), "name", "");
        setByteElement(term4346, 0, (byte) -93);
        setByteElement(term4346, 1, (byte) 82);
        setField(term4321, term4321.getClass(), "rawName", term4346);
        setBooleanField(term4349, term4349.getClass(), "languageEncodingFlag", false);
        setBooleanField(term4349, term4349.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term4349, term4349.getClass(), "encryptionFlag", false);
        setBooleanField(term4349, term4349.getClass(), "strongEncryptionFlag", false);
        setIntField(term4349, term4349.getClass(), "slidingDictionarySize", 0);
        setIntField(term4349, term4349.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term4321, term4321.getClass(), "gpb", term4349);
        setLongField(term4321, term4321.getClass(), "xdostime", -1L);
        setField(term4359, term4359.getClass(), "unit", enum16);
        setLongField(term4359, term4359.getClass(), "value", 2486810210675247493L);
        setLongField(term4377, term4377.getClass(), "seconds", 1668587229L);
        setIntField(term4377, term4377.getClass(), "nanos", 825000000);
        setField(term4359, term4359.getClass(), "instant", term4377);
        setField(term4359, term4359.getClass(), "valueAsString", "IoAlmYsBwc");
        setField(term4321, term4321.getClass(), "mtime", term4359);
        setField(term4392, term4392.getClass(), "unit", enum17);
        setLongField(term4392, term4392.getClass(), "value", 7009926388951271268L);
        setLongField(term4418, term4418.getClass(), "seconds", 1725140217L);
        setIntField(term4418, term4418.getClass(), "nanos", 647000000);
        setField(term4392, term4392.getClass(), "instant", term4418);
        setField(term4392, term4392.getClass(), "valueAsString", "TEParAifyi");
        setField(term4321, term4321.getClass(), "atime", term4392);
        setField(term4433, term4433.getClass(), "unit", enum18);
        setLongField(term4433, term4433.getClass(), "value", -7672528020740371001L);
        setLongField(term4454, term4454.getClass(), "seconds", 1550716994L);
        setIntField(term4454, term4454.getClass(), "nanos", 689000000);
        setField(term4433, term4433.getClass(), "instant", term4454);
        setField(term4433, term4433.getClass(), "valueAsString", "OWDIEULEFu");
        setField(term4321, term4321.getClass(), "ctime", term4433);
        setLongField(term4321, term4321.getClass(), "crc", -1L);
        setLongField(term4321, term4321.getClass(), "csize", -1L);
        setIntField(term4321, term4321.getClass(), "flag", 1632125673);
        setByteElement(term4474, 0, (byte) -89);
        setByteElement(term4474, 1, (byte) 24);
        setByteElement(term4474, 2, (byte) 123);
        setByteElement(term4474, 3, (byte) -101);
        setByteElement(term4474, 4, (byte) -102);
        setByteElement(term4474, 5, (byte) -95);
        setField(term4321, term4321.getClass(), "extra", term4474);
        setField(term4321, term4321.getClass(), "comment", "dWRymuLBtr");
        term4494 = new Integer(-1786399638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4494;
        callMethod(klass, "setInternalAttributes", argTypes, term4321, args);
    }

};


