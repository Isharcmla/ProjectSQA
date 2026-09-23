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

public class ZipArchiveEntry_equals_99237856651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33475;
     Object term33628;

    public ZipArchiveEntry_equals_99237856651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33638 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term33637 = ((Class) term33638).getDeclaredField((String) "HOURS");
        ((Field) term33637).setAccessible(true);
        Object enum127 = ((Field) term33637).get((Object) null);
        Class<? extends Object> term33815 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term33814 = ((Class) term33815).getDeclaredField((String) "MILLISECONDS");
        ((Field) term33814).setAccessible(true);
        Object enum128 = ((Field) term33814).get((Object) null);
        term33475 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term33484 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 8);
        Object term33485 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term33486 = (byte[]) newByteArray(4);
        byte[] term33491 = (byte[]) newByteArray(0);
        byte[] term33494 = (byte[]) newByteArray(4);
        Object term33499 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term33509 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term33528 = newInstance(Class.forName("java.time.Instant"));
        Object term33543 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term33569 = newInstance(Class.forName("java.time.Instant"));
        Object term33584 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term33586 = newInstance(Class.forName("java.time.Instant"));
        byte[] term33606 = (byte[]) newByteArray(8);
        setIntField(term33475, term33475.getClass(), "method", -1);
        setLongField(term33475, term33475.getClass(), "size", -1L);
        setIntField(term33475, term33475.getClass(), "internalAttributes", 1084849225);
        setIntField(term33475, term33475.getClass(), "versionRequired", -1702055571);
        setIntField(term33475, term33475.getClass(), "versionMadeBy", -944542900);
        setIntField(term33475, term33475.getClass(), "platform", 2063762142);
        setIntField(term33475, term33475.getClass(), "rawFlag", 1658391716);
        setLongField(term33475, term33475.getClass(), "externalAttributes", 5246058710498845622L);
        setField(term33475, term33475.getClass(), "extraFields", term33484);
        setByteElement(term33486, 0, (byte) -89);
        setByteElement(term33486, 1, (byte) -11);
        setByteElement(term33486, 2, (byte) 63);
        setByteElement(term33486, 3, (byte) -15);
        setField(term33485, term33485.getClass(), "localFileData", term33486);
        setField(term33485, term33485.getClass(), "centralDirectoryData", term33491);
        setField(term33475, term33475.getClass(), "unparseableExtra", term33485);
        setField(term33475, term33475.getClass(), "name", "");
        setByteElement(term33494, 0, (byte) -1);
        setByteElement(term33494, 1, (byte) 121);
        setByteElement(term33494, 2, (byte) 80);
        setByteElement(term33494, 3, (byte) -82);
        setField(term33475, term33475.getClass(), "rawName", term33494);
        setBooleanField(term33499, term33499.getClass(), "languageEncodingFlag", false);
        setBooleanField(term33499, term33499.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term33499, term33499.getClass(), "encryptionFlag", false);
        setBooleanField(term33499, term33499.getClass(), "strongEncryptionFlag", false);
        setIntField(term33499, term33499.getClass(), "slidingDictionarySize", 0);
        setIntField(term33499, term33499.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term33475, term33475.getClass(), "gpb", term33499);
        setLongField(term33475, term33475.getClass(), "xdostime", -1L);
        setField(term33509, term33509.getClass(), "unit", enum127);
        setLongField(term33509, term33509.getClass(), "value", 4394651392080968777L);
        setLongField(term33528, term33528.getClass(), "seconds", 1668084172L);
        setIntField(term33528, term33528.getClass(), "nanos", 11000000);
        setField(term33509, term33509.getClass(), "instant", term33528);
        setField(term33509, term33509.getClass(), "valueAsString", "XJJNClzHRf");
        setField(term33475, term33475.getClass(), "mtime", term33509);
        setField(term33543, term33543.getClass(), "unit", enum128);
        setLongField(term33543, term33543.getClass(), "value", -7310273014364148916L);
        setLongField(term33569, term33569.getClass(), "seconds", 1677893735L);
        setIntField(term33569, term33569.getClass(), "nanos", 410000000);
        setField(term33543, term33543.getClass(), "instant", term33569);
        setField(term33543, term33543.getClass(), "valueAsString", "HDaezxQfQR");
        setField(term33475, term33475.getClass(), "atime", term33543);
        setField(term33584, term33584.getClass(), "unit", enum128);
        setLongField(term33584, term33584.getClass(), "value", 8863790908271299748L);
        setLongField(term33586, term33586.getClass(), "seconds", 1541734264L);
        setIntField(term33586, term33586.getClass(), "nanos", 920000000);
        setField(term33584, term33584.getClass(), "instant", term33586);
        setField(term33584, term33584.getClass(), "valueAsString", "iikZEapDlu");
        setField(term33475, term33475.getClass(), "ctime", term33584);
        setLongField(term33475, term33475.getClass(), "crc", -1L);
        setLongField(term33475, term33475.getClass(), "csize", -1L);
        setIntField(term33475, term33475.getClass(), "flag", 2143282300);
        setByteElement(term33606, 0, (byte) -67);
        setByteElement(term33606, 1, (byte) -44);
        setByteElement(term33606, 2, (byte) 115);
        setByteElement(term33606, 3, (byte) 30);
        setByteElement(term33606, 4, (byte) -99);
        setByteElement(term33606, 5, (byte) 76);
        setByteElement(term33606, 6, (byte) 10);
        setByteElement(term33606, 7, (byte) 94);
        setField(term33475, term33475.getClass(), "extra", term33606);
        setField(term33475, term33475.getClass(), "comment", "nhoHrZfnIN");
        term33628 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term33628;
        callMethod(klass, "equals", argTypes, term33475, args);
    }

};


