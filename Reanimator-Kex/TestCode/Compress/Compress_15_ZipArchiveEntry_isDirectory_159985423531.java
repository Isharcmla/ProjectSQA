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

public class ZipArchiveEntry_isDirectory_159985423531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19437;

    public ZipArchiveEntry_isDirectory_159985423531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term19443 = new LinkedHashMap();
        Class<? extends Object> term19627 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term19626 = ((Class) term19627).getDeclaredField((String) "MILLISECONDS");
        ((Field) term19626).setAccessible(true);
        Object enum73 = ((Field) term19626).get((Object) null);
        Class<? extends Object> term19825 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term19824 = ((Class) term19825).getDeclaredField((String) "SECONDS");
        ((Field) term19824).setAccessible(true);
        Object enum74 = ((Field) term19824).get((Object) null);
        Class<? extends Object> term20008 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term20007 = ((Class) term20008).getDeclaredField((String) "DAYS");
        ((Field) term20007).setAccessible(true);
        Object enum75 = ((Field) term20007).get((Object) null);
        term19437 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term19454 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term19455 = (byte[]) newByteArray(4);
        byte[] term19460 = (byte[]) newByteArray(8);
        byte[] term19471 = (byte[]) newByteArray(0);
        Object term19472 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term19480 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term19506 = newInstance(Class.forName("java.time.Instant"));
        Object term19521 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term19542 = newInstance(Class.forName("java.time.Instant"));
        Object term19557 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term19575 = newInstance(Class.forName("java.time.Instant"));
        byte[] term19595 = (byte[]) newByteArray(5);
        setIntField(term19437, term19437.getClass(), "method", -1);
        setLongField(term19437, term19437.getClass(), "size", -1L);
        setIntField(term19437, term19437.getClass(), "internalAttributes", 1041916673);
        setIntField(term19437, term19437.getClass(), "platform", -601863069);
        setLongField(term19437, term19437.getClass(), "externalAttributes", -6950146046121430355L);
        setField(term19437, term19437.getClass(), "extraFields", term19443);
        setByteElement(term19455, 0, (byte) -95);
        setByteElement(term19455, 1, (byte) 114);
        setByteElement(term19455, 2, (byte) -9);
        setByteElement(term19455, 3, (byte) -113);
        setField(term19454, term19454.getClass(), "localFileData", term19455);
        setByteElement(term19460, 0, (byte) -42);
        setByteElement(term19460, 1, (byte) 60);
        setByteElement(term19460, 2, (byte) -128);
        setByteElement(term19460, 3, (byte) -55);
        setByteElement(term19460, 4, (byte) -83);
        setByteElement(term19460, 5, (byte) -48);
        setByteElement(term19460, 6, (byte) -113);
        setByteElement(term19460, 7, (byte) 15);
        setField(term19454, term19454.getClass(), "centralDirectoryData", term19460);
        setField(term19437, term19437.getClass(), "unparseableExtra", term19454);
        setField(term19437, term19437.getClass(), "name", "");
        setField(term19437, term19437.getClass(), "rawName", term19471);
        setBooleanField(term19472, term19472.getClass(), "languageEncodingFlag", false);
        setBooleanField(term19472, term19472.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term19472, term19472.getClass(), "encryptionFlag", false);
        setBooleanField(term19472, term19472.getClass(), "strongEncryptionFlag", false);
        setField(term19437, term19437.getClass(), "gpb", term19472);
        setLongField(term19437, term19437.getClass(), "xdostime", -1L);
        setField(term19480, term19480.getClass(), "unit", enum73);
        setLongField(term19480, term19480.getClass(), "value", 1667122142089513324L);
        setLongField(term19506, term19506.getClass(), "seconds", 1597439765L);
        setIntField(term19506, term19506.getClass(), "nanos", 774000000);
        setField(term19480, term19480.getClass(), "instant", term19506);
        setField(term19480, term19480.getClass(), "valueAsString", "iNwOJRBEjp");
        setField(term19437, term19437.getClass(), "mtime", term19480);
        setField(term19521, term19521.getClass(), "unit", enum74);
        setLongField(term19521, term19521.getClass(), "value", -6342139649364011743L);
        setLongField(term19542, term19542.getClass(), "seconds", 1354753325L);
        setIntField(term19542, term19542.getClass(), "nanos", 477000000);
        setField(term19521, term19521.getClass(), "instant", term19542);
        setField(term19521, term19521.getClass(), "valueAsString", "XylxrMBraH");
        setField(term19437, term19437.getClass(), "atime", term19521);
        setField(term19557, term19557.getClass(), "unit", enum75);
        setLongField(term19557, term19557.getClass(), "value", -4924950707540628022L);
        setLongField(term19575, term19575.getClass(), "seconds", 1415444053L);
        setIntField(term19575, term19575.getClass(), "nanos", 422000000);
        setField(term19557, term19557.getClass(), "instant", term19575);
        setField(term19557, term19557.getClass(), "valueAsString", "pORebkoRdD");
        setField(term19437, term19437.getClass(), "ctime", term19557);
        setLongField(term19437, term19437.getClass(), "crc", -1L);
        setLongField(term19437, term19437.getClass(), "csize", -1L);
        setIntField(term19437, term19437.getClass(), "flag", -1885090354);
        setByteElement(term19595, 0, (byte) 38);
        setByteElement(term19595, 1, (byte) -54);
        setByteElement(term19595, 2, (byte) -51);
        setByteElement(term19595, 3, (byte) 101);
        setByteElement(term19595, 4, (byte) 40);
        setField(term19437, term19437.getClass(), "extra", term19595);
        setField(term19437, term19437.getClass(), "comment", "mXGCWJDOqA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDirectory", argTypes, term19437, args);
    }

};


