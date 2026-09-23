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

public class ZipArchiveEntry_getName_109882553830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18684;

    public ZipArchiveEntry_getName_109882553830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term18690 = new LinkedHashMap();
        Class<? extends Object> term18865 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term18864 = ((Class) term18865).getDeclaredField((String) "HOURS");
        ((Field) term18864).setAccessible(true);
        Object enum70 = ((Field) term18864).get((Object) null);
        Class<? extends Object> term19042 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term19041 = ((Class) term19042).getDeclaredField((String) "MINUTES");
        ((Field) term19041).setAccessible(true);
        Object enum71 = ((Field) term19041).get((Object) null);
        Class<? extends Object> term19225 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term19224 = ((Class) term19225).getDeclaredField((String) "MICROSECONDS");
        ((Field) term19224).setAccessible(true);
        Object enum72 = ((Field) term19224).get((Object) null);
        term18684 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term18701 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term18702 = (byte[]) newByteArray(3);
        byte[] term18706 = (byte[]) newByteArray(2);
        byte[] term18711 = (byte[]) newByteArray(2);
        Object term18714 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term18722 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term18741 = newInstance(Class.forName("java.time.Instant"));
        Object term18756 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term18777 = newInstance(Class.forName("java.time.Instant"));
        Object term18792 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term18818 = newInstance(Class.forName("java.time.Instant"));
        byte[] term18838 = (byte[]) newByteArray(5);
        setIntField(term18684, term18684.getClass(), "method", -1);
        setLongField(term18684, term18684.getClass(), "size", -1L);
        setIntField(term18684, term18684.getClass(), "internalAttributes", 1384592638);
        setIntField(term18684, term18684.getClass(), "platform", -1002370457);
        setLongField(term18684, term18684.getClass(), "externalAttributes", -3936701866695933852L);
        setField(term18684, term18684.getClass(), "extraFields", term18690);
        setByteElement(term18702, 0, (byte) 77);
        setByteElement(term18702, 1, (byte) -54);
        setByteElement(term18702, 2, (byte) -59);
        setField(term18701, term18701.getClass(), "localFileData", term18702);
        setByteElement(term18706, 0, (byte) 103);
        setByteElement(term18706, 1, (byte) 127);
        setField(term18701, term18701.getClass(), "centralDirectoryData", term18706);
        setField(term18684, term18684.getClass(), "unparseableExtra", term18701);
        setField(term18684, term18684.getClass(), "name", "");
        setByteElement(term18711, 0, (byte) 58);
        setByteElement(term18711, 1, (byte) -98);
        setField(term18684, term18684.getClass(), "rawName", term18711);
        setBooleanField(term18714, term18714.getClass(), "languageEncodingFlag", false);
        setBooleanField(term18714, term18714.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term18714, term18714.getClass(), "encryptionFlag", false);
        setBooleanField(term18714, term18714.getClass(), "strongEncryptionFlag", false);
        setField(term18684, term18684.getClass(), "gpb", term18714);
        setLongField(term18684, term18684.getClass(), "xdostime", -1L);
        setField(term18722, term18722.getClass(), "unit", enum70);
        setLongField(term18722, term18722.getClass(), "value", 1215116475929634177L);
        setLongField(term18741, term18741.getClass(), "seconds", 1467801054L);
        setIntField(term18741, term18741.getClass(), "nanos", 847000000);
        setField(term18722, term18722.getClass(), "instant", term18741);
        setField(term18722, term18722.getClass(), "valueAsString", "OEXDRUKcFl");
        setField(term18684, term18684.getClass(), "mtime", term18722);
        setField(term18756, term18756.getClass(), "unit", enum71);
        setLongField(term18756, term18756.getClass(), "value", 1597484336218508869L);
        setLongField(term18777, term18777.getClass(), "seconds", 1825626844L);
        setIntField(term18777, term18777.getClass(), "nanos", 992000000);
        setField(term18756, term18756.getClass(), "instant", term18777);
        setField(term18756, term18756.getClass(), "valueAsString", "RYdKCNNMBR");
        setField(term18684, term18684.getClass(), "atime", term18756);
        setField(term18792, term18792.getClass(), "unit", enum72);
        setLongField(term18792, term18792.getClass(), "value", -685023850445639859L);
        setLongField(term18818, term18818.getClass(), "seconds", 1465800799L);
        setIntField(term18818, term18818.getClass(), "nanos", 700000000);
        setField(term18792, term18792.getClass(), "instant", term18818);
        setField(term18792, term18792.getClass(), "valueAsString", "yGtHPyvYiQ");
        setField(term18684, term18684.getClass(), "ctime", term18792);
        setLongField(term18684, term18684.getClass(), "crc", -1L);
        setLongField(term18684, term18684.getClass(), "csize", -1L);
        setIntField(term18684, term18684.getClass(), "flag", 1296895584);
        setByteElement(term18838, 0, (byte) 48);
        setByteElement(term18838, 1, (byte) 15);
        setByteElement(term18838, 2, (byte) 73);
        setByteElement(term18838, 3, (byte) -77);
        setByteElement(term18838, 4, (byte) -11);
        setField(term18684, term18684.getClass(), "extra", term18838);
        setField(term18684, term18684.getClass(), "comment", "MvRIxilFMJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term18684, args);
    }

};


