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
import java.lang.Boolean;

public class ZipArchiveEntry_mergeExtraFields_150703452640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25474;
     Object term25655;
     Object term25656;

    public ZipArchiveEntry_mergeExtraFields_150703452640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term25480 = new LinkedHashMap();
        Class<? extends Object> term25672 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term25671 = ((Class) term25672).getDeclaredField((String) "MICROSECONDS");
        ((Field) term25671).setAccessible(true);
        Object enum95 = ((Field) term25671).get((Object) null);
        Class<? extends Object> term25870 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term25869 = ((Class) term25870).getDeclaredField((String) "MINUTES");
        ((Field) term25869).setAccessible(true);
        Object enum96 = ((Field) term25869).get((Object) null);
        Class<? extends Object> term26053 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term26052 = ((Class) term26053).getDeclaredField((String) "NANOSECONDS");
        ((Field) term26052).setAccessible(true);
        Object enum97 = ((Field) term26052).get((Object) null);
        term25474 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term25491 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term25492 = (byte[]) newByteArray(5);
        byte[] term25498 = (byte[]) newByteArray(2);
        byte[] term25503 = (byte[]) newByteArray(6);
        Object term25510 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term25518 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term25544 = newInstance(Class.forName("java.time.Instant"));
        Object term25559 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term25580 = newInstance(Class.forName("java.time.Instant"));
        Object term25595 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term25620 = newInstance(Class.forName("java.time.Instant"));
        byte[] term25640 = (byte[]) newByteArray(1);
        setIntField(term25474, term25474.getClass(), "method", -1);
        setLongField(term25474, term25474.getClass(), "size", -1L);
        setIntField(term25474, term25474.getClass(), "internalAttributes", 388157121);
        setIntField(term25474, term25474.getClass(), "platform", 1684998508);
        setLongField(term25474, term25474.getClass(), "externalAttributes", 5381386339318883012L);
        setField(term25474, term25474.getClass(), "extraFields", term25480);
        setByteElement(term25492, 0, (byte) 125);
        setByteElement(term25492, 1, (byte) -119);
        setByteElement(term25492, 2, (byte) 94);
        setByteElement(term25492, 3, (byte) -1);
        setByteElement(term25492, 4, (byte) 99);
        setField(term25491, term25491.getClass(), "localFileData", term25492);
        setByteElement(term25498, 0, (byte) 32);
        setByteElement(term25498, 1, (byte) -81);
        setField(term25491, term25491.getClass(), "centralDirectoryData", term25498);
        setField(term25474, term25474.getClass(), "unparseableExtra", term25491);
        setField(term25474, term25474.getClass(), "name", "");
        setByteElement(term25503, 0, (byte) 122);
        setByteElement(term25503, 1, (byte) 27);
        setByteElement(term25503, 2, (byte) -118);
        setByteElement(term25503, 3, (byte) 37);
        setByteElement(term25503, 4, (byte) -9);
        setByteElement(term25503, 5, (byte) -3);
        setField(term25474, term25474.getClass(), "rawName", term25503);
        setBooleanField(term25510, term25510.getClass(), "languageEncodingFlag", false);
        setBooleanField(term25510, term25510.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term25510, term25510.getClass(), "encryptionFlag", false);
        setBooleanField(term25510, term25510.getClass(), "strongEncryptionFlag", false);
        setField(term25474, term25474.getClass(), "gpb", term25510);
        setLongField(term25474, term25474.getClass(), "xdostime", -1L);
        setField(term25518, term25518.getClass(), "unit", enum95);
        setLongField(term25518, term25518.getClass(), "value", -1333707622307134180L);
        setLongField(term25544, term25544.getClass(), "seconds", 1870046835L);
        setIntField(term25544, term25544.getClass(), "nanos", 492000000);
        setField(term25518, term25518.getClass(), "instant", term25544);
        setField(term25518, term25518.getClass(), "valueAsString", "XkIoWJRNwN");
        setField(term25474, term25474.getClass(), "mtime", term25518);
        setField(term25559, term25559.getClass(), "unit", enum96);
        setLongField(term25559, term25559.getClass(), "value", -4360569253593381888L);
        setLongField(term25580, term25580.getClass(), "seconds", 1655686811L);
        setIntField(term25580, term25580.getClass(), "nanos", 13000000);
        setField(term25559, term25559.getClass(), "instant", term25580);
        setField(term25559, term25559.getClass(), "valueAsString", "aNWLJdrZMq");
        setField(term25474, term25474.getClass(), "atime", term25559);
        setField(term25595, term25595.getClass(), "unit", enum97);
        setLongField(term25595, term25595.getClass(), "value", 1457594663983990440L);
        setLongField(term25620, term25620.getClass(), "seconds", 1319373084L);
        setIntField(term25620, term25620.getClass(), "nanos", 958000000);
        setField(term25595, term25595.getClass(), "instant", term25620);
        setField(term25595, term25595.getClass(), "valueAsString", "HHmNoYxIGj");
        setField(term25474, term25474.getClass(), "ctime", term25595);
        setLongField(term25474, term25474.getClass(), "crc", -1L);
        setLongField(term25474, term25474.getClass(), "csize", -1L);
        setIntField(term25474, term25474.getClass(), "flag", 1270666529);
        setByteElement(term25640, 0, (byte) 68);
        setField(term25474, term25474.getClass(), "extra", term25640);
        setField(term25474, term25474.getClass(), "comment", "PtirvZmsGt");
        term25655 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 6);
        term25656 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField"), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term25655;
        args[1] = term25656;
        callMethod(klass, "mergeExtraFields", argTypes, term25474, args);
    }

};


