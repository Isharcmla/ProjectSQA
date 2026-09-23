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

public class ZipArchiveEntry_getUnparseableExtraFieldData_14140039224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14868;

    public ZipArchiveEntry_getUnparseableExtraFieldData_14140039224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term14874 = new LinkedHashMap();
        Class<? extends Object> term15073 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term15072 = ((Class) term15073).getDeclaredField((String) "DAYS");
        ((Field) term15072).setAccessible(true);
        Object enum56 = ((Field) term15072).get((Object) null);
        Class<? extends Object> term15247 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term15246 = ((Class) term15247).getDeclaredField((String) "MILLISECONDS");
        ((Field) term15246).setAccessible(true);
        Object enum57 = ((Field) term15246).get((Object) null);
        Class<? extends Object> term15445 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term15444 = ((Class) term15445).getDeclaredField((String) "MICROSECONDS");
        ((Field) term15444).setAccessible(true);
        Object enum58 = ((Field) term15444).get((Object) null);
        term14868 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term14885 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term14886 = (byte[]) newByteArray(6);
        byte[] term14893 = (byte[]) newByteArray(4);
        byte[] term14900 = (byte[]) newByteArray(6);
        Object term14907 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term14915 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term14933 = newInstance(Class.forName("java.time.Instant"));
        Object term14948 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term14974 = newInstance(Class.forName("java.time.Instant"));
        Object term14989 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term15015 = newInstance(Class.forName("java.time.Instant"));
        byte[] term15035 = (byte[]) newByteArray(7);
        setIntField(term14868, term14868.getClass(), "method", -1);
        setLongField(term14868, term14868.getClass(), "size", -1L);
        setIntField(term14868, term14868.getClass(), "internalAttributes", -2015854073);
        setIntField(term14868, term14868.getClass(), "platform", 538259104);
        setLongField(term14868, term14868.getClass(), "externalAttributes", -8652538484981166496L);
        setField(term14868, term14868.getClass(), "extraFields", term14874);
        setByteElement(term14886, 0, (byte) -61);
        setByteElement(term14886, 1, (byte) -34);
        setByteElement(term14886, 2, (byte) 73);
        setByteElement(term14886, 3, (byte) 10);
        setByteElement(term14886, 4, (byte) 36);
        setByteElement(term14886, 5, (byte) 103);
        setField(term14885, term14885.getClass(), "localFileData", term14886);
        setByteElement(term14893, 0, (byte) -64);
        setByteElement(term14893, 1, (byte) -107);
        setByteElement(term14893, 2, (byte) 119);
        setByteElement(term14893, 3, (byte) -109);
        setField(term14885, term14885.getClass(), "centralDirectoryData", term14893);
        setField(term14868, term14868.getClass(), "unparseableExtra", term14885);
        setField(term14868, term14868.getClass(), "name", "");
        setByteElement(term14900, 0, (byte) 87);
        setByteElement(term14900, 1, (byte) 97);
        setByteElement(term14900, 2, (byte) 51);
        setByteElement(term14900, 3, (byte) 24);
        setByteElement(term14900, 4, (byte) -14);
        setByteElement(term14900, 5, (byte) 74);
        setField(term14868, term14868.getClass(), "rawName", term14900);
        setBooleanField(term14907, term14907.getClass(), "languageEncodingFlag", false);
        setBooleanField(term14907, term14907.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term14907, term14907.getClass(), "encryptionFlag", false);
        setBooleanField(term14907, term14907.getClass(), "strongEncryptionFlag", false);
        setField(term14868, term14868.getClass(), "gpb", term14907);
        setLongField(term14868, term14868.getClass(), "xdostime", -1L);
        setField(term14915, term14915.getClass(), "unit", enum56);
        setLongField(term14915, term14915.getClass(), "value", 2701184207686293431L);
        setLongField(term14933, term14933.getClass(), "seconds", 1838375779L);
        setIntField(term14933, term14933.getClass(), "nanos", 277000000);
        setField(term14915, term14915.getClass(), "instant", term14933);
        setField(term14915, term14915.getClass(), "valueAsString", "PkWMRdJcBb");
        setField(term14868, term14868.getClass(), "mtime", term14915);
        setField(term14948, term14948.getClass(), "unit", enum57);
        setLongField(term14948, term14948.getClass(), "value", 4474998035090263139L);
        setLongField(term14974, term14974.getClass(), "seconds", 1332889705L);
        setIntField(term14974, term14974.getClass(), "nanos", 432000000);
        setField(term14948, term14948.getClass(), "instant", term14974);
        setField(term14948, term14948.getClass(), "valueAsString", "jSpAteRute");
        setField(term14868, term14868.getClass(), "atime", term14948);
        setField(term14989, term14989.getClass(), "unit", enum58);
        setLongField(term14989, term14989.getClass(), "value", 2848819812340321742L);
        setLongField(term15015, term15015.getClass(), "seconds", 1597251967L);
        setIntField(term15015, term15015.getClass(), "nanos", 116000000);
        setField(term14989, term14989.getClass(), "instant", term15015);
        setField(term14989, term14989.getClass(), "valueAsString", "swZVeJAxjt");
        setField(term14868, term14868.getClass(), "ctime", term14989);
        setLongField(term14868, term14868.getClass(), "crc", -1L);
        setLongField(term14868, term14868.getClass(), "csize", -1L);
        setIntField(term14868, term14868.getClass(), "flag", -343325701);
        setByteElement(term15035, 0, (byte) 56);
        setByteElement(term15035, 1, (byte) -76);
        setByteElement(term15035, 2, (byte) -29);
        setByteElement(term15035, 3, (byte) 121);
        setByteElement(term15035, 4, (byte) -17);
        setByteElement(term15035, 5, (byte) -123);
        setByteElement(term15035, 6, (byte) -76);
        setField(term14868, term14868.getClass(), "extra", term15035);
        setField(term14868, term14868.getClass(), "comment", "xOcJIiQQDu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnparseableExtraFieldData", argTypes, term14868, args);
    }

};


