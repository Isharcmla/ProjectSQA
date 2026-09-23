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

public class ZipArchiveEntry_getGeneralPurposeBit_88017514238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24069;

    public ZipArchiveEntry_getGeneralPurposeBit_88017514238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term24075 = new LinkedHashMap();
        Class<? extends Object> term24266 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term24265 = ((Class) term24266).getDeclaredField((String) "MILLISECONDS");
        ((Field) term24265).setAccessible(true);
        Object enum90 = ((Field) term24265).get((Object) null);
        Class<? extends Object> term24464 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term24463 = ((Class) term24464).getDeclaredField((String) "MICROSECONDS");
        ((Field) term24463).setAccessible(true);
        Object enum91 = ((Field) term24463).get((Object) null);
        Class<? extends Object> term24662 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term24661 = ((Class) term24662).getDeclaredField((String) "HOURS");
        ((Field) term24661).setAccessible(true);
        Object enum92 = ((Field) term24661).get((Object) null);
        term24069 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term24086 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term24087 = (byte[]) newByteArray(7);
        byte[] term24095 = (byte[]) newByteArray(2);
        byte[] term24100 = (byte[]) newByteArray(2);
        Object term24103 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term24111 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term24137 = newInstance(Class.forName("java.time.Instant"));
        Object term24152 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term24178 = newInstance(Class.forName("java.time.Instant"));
        Object term24193 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term24212 = newInstance(Class.forName("java.time.Instant"));
        byte[] term24232 = (byte[]) newByteArray(8);
        setIntField(term24069, term24069.getClass(), "method", -1);
        setLongField(term24069, term24069.getClass(), "size", -1L);
        setIntField(term24069, term24069.getClass(), "internalAttributes", 1694224101);
        setIntField(term24069, term24069.getClass(), "platform", 937859191);
        setLongField(term24069, term24069.getClass(), "externalAttributes", 8034714140377562739L);
        setField(term24069, term24069.getClass(), "extraFields", term24075);
        setByteElement(term24087, 0, (byte) 73);
        setByteElement(term24087, 1, (byte) -67);
        setByteElement(term24087, 2, (byte) -72);
        setByteElement(term24087, 3, (byte) 38);
        setByteElement(term24087, 4, (byte) 91);
        setByteElement(term24087, 5, (byte) 113);
        setByteElement(term24087, 6, (byte) -75);
        setField(term24086, term24086.getClass(), "localFileData", term24087);
        setByteElement(term24095, 0, (byte) -92);
        setByteElement(term24095, 1, (byte) 52);
        setField(term24086, term24086.getClass(), "centralDirectoryData", term24095);
        setField(term24069, term24069.getClass(), "unparseableExtra", term24086);
        setField(term24069, term24069.getClass(), "name", "");
        setByteElement(term24100, 0, (byte) -101);
        setByteElement(term24100, 1, (byte) -64);
        setField(term24069, term24069.getClass(), "rawName", term24100);
        setBooleanField(term24103, term24103.getClass(), "languageEncodingFlag", false);
        setBooleanField(term24103, term24103.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term24103, term24103.getClass(), "encryptionFlag", false);
        setBooleanField(term24103, term24103.getClass(), "strongEncryptionFlag", false);
        setField(term24069, term24069.getClass(), "gpb", term24103);
        setLongField(term24069, term24069.getClass(), "xdostime", -1L);
        setField(term24111, term24111.getClass(), "unit", enum90);
        setLongField(term24111, term24111.getClass(), "value", -2924531382671518368L);
        setLongField(term24137, term24137.getClass(), "seconds", 1695488381L);
        setIntField(term24137, term24137.getClass(), "nanos", 249000000);
        setField(term24111, term24111.getClass(), "instant", term24137);
        setField(term24111, term24111.getClass(), "valueAsString", "UfQtPRyWRC");
        setField(term24069, term24069.getClass(), "mtime", term24111);
        setField(term24152, term24152.getClass(), "unit", enum91);
        setLongField(term24152, term24152.getClass(), "value", -3948863953565024517L);
        setLongField(term24178, term24178.getClass(), "seconds", 1342895876L);
        setIntField(term24178, term24178.getClass(), "nanos", 146000000);
        setField(term24152, term24152.getClass(), "instant", term24178);
        setField(term24152, term24152.getClass(), "valueAsString", "FPvxVzzSvD");
        setField(term24069, term24069.getClass(), "atime", term24152);
        setField(term24193, term24193.getClass(), "unit", enum92);
        setLongField(term24193, term24193.getClass(), "value", -6587807377747738663L);
        setLongField(term24212, term24212.getClass(), "seconds", 1511301614L);
        setIntField(term24212, term24212.getClass(), "nanos", 327000000);
        setField(term24193, term24193.getClass(), "instant", term24212);
        setField(term24193, term24193.getClass(), "valueAsString", "WHcwFgsGFC");
        setField(term24069, term24069.getClass(), "ctime", term24193);
        setLongField(term24069, term24069.getClass(), "crc", -1L);
        setLongField(term24069, term24069.getClass(), "csize", -1L);
        setIntField(term24069, term24069.getClass(), "flag", -2131181468);
        setByteElement(term24232, 0, (byte) 107);
        setByteElement(term24232, 1, (byte) 91);
        setByteElement(term24232, 2, (byte) -24);
        setByteElement(term24232, 3, (byte) -68);
        setByteElement(term24232, 4, (byte) -75);
        setByteElement(term24232, 5, (byte) 82);
        setByteElement(term24232, 6, (byte) -127);
        setByteElement(term24232, 7, (byte) 23);
        setField(term24069, term24069.getClass(), "extra", term24232);
        setField(term24069, term24069.getClass(), "comment", "HzqpegHiRq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneralPurposeBit", argTypes, term24069, args);
    }

};


