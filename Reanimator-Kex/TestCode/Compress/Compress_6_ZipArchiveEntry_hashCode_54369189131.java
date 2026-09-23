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

public class ZipArchiveEntry_hashCode_54369189131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18614;

    public ZipArchiveEntry_hashCode_54369189131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term18619 = new LinkedHashMap();
        Class<? extends Object> term18776 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term18775 = ((Class) term18776).getDeclaredField((String) "MILLISECONDS");
        ((Field) term18775).setAccessible(true);
        Object enum73 = ((Field) term18775).get((Object) null);
        Class<? extends Object> term18974 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term18973 = ((Class) term18974).getDeclaredField((String) "SECONDS");
        ((Field) term18973).setAccessible(true);
        Object enum74 = ((Field) term18973).get((Object) null);
        Class<? extends Object> term19157 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term19156 = ((Class) term19157).getDeclaredField((String) "DAYS");
        ((Field) term19156).setAccessible(true);
        Object enum75 = ((Field) term19156).get((Object) null);
        term18614 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term18640 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term18666 = newInstance(Class.forName("java.time.Instant"));
        Object term18681 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term18702 = newInstance(Class.forName("java.time.Instant"));
        Object term18717 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term18735 = newInstance(Class.forName("java.time.Instant"));
        byte[] term18755 = (byte[]) newByteArray(6);
        setIntField(term18614, term18614.getClass(), "method", -1);
        setIntField(term18614, term18614.getClass(), "internalAttributes", -25637976);
        setIntField(term18614, term18614.getClass(), "platform", 1555897383);
        setLongField(term18614, term18614.getClass(), "externalAttributes", -6950146046121430355L);
        setField(term18614, term18614.getClass(), "extraFields", term18619);
        setField(term18614, term18614.getClass(), "name", "");
        setLongField(term18614, term18614.getClass(), "xdostime", -1L);
        setField(term18640, term18640.getClass(), "unit", enum73);
        setLongField(term18640, term18640.getClass(), "value", 1667122142089513324L);
        setLongField(term18666, term18666.getClass(), "seconds", 1597439765L);
        setIntField(term18666, term18666.getClass(), "nanos", 774000000);
        setField(term18640, term18640.getClass(), "instant", term18666);
        setField(term18640, term18640.getClass(), "valueAsString", "EeBVbzjcCI");
        setField(term18614, term18614.getClass(), "mtime", term18640);
        setField(term18681, term18681.getClass(), "unit", enum74);
        setLongField(term18681, term18681.getClass(), "value", -6342139649364011743L);
        setLongField(term18702, term18702.getClass(), "seconds", 1354753325L);
        setIntField(term18702, term18702.getClass(), "nanos", 477000000);
        setField(term18681, term18681.getClass(), "instant", term18702);
        setField(term18681, term18681.getClass(), "valueAsString", "UfQtPRyWRC");
        setField(term18614, term18614.getClass(), "atime", term18681);
        setField(term18717, term18717.getClass(), "unit", enum75);
        setLongField(term18717, term18717.getClass(), "value", -4924950707540628022L);
        setLongField(term18735, term18735.getClass(), "seconds", 1415444053L);
        setIntField(term18735, term18735.getClass(), "nanos", 422000000);
        setField(term18717, term18717.getClass(), "instant", term18735);
        setField(term18717, term18717.getClass(), "valueAsString", "FPvxVzzSvD");
        setField(term18614, term18614.getClass(), "ctime", term18717);
        setLongField(term18614, term18614.getClass(), "crc", -1L);
        setLongField(term18614, term18614.getClass(), "size", -1L);
        setLongField(term18614, term18614.getClass(), "csize", -1L);
        setIntField(term18614, term18614.getClass(), "flag", 202001407);
        setByteElement(term18755, 0, (byte) 97);
        setByteElement(term18755, 1, (byte) -46);
        setByteElement(term18755, 2, (byte) 14);
        setByteElement(term18755, 3, (byte) 34);
        setByteElement(term18755, 4, (byte) 126);
        setByteElement(term18755, 5, (byte) 7);
        setField(term18614, term18614.getClass(), "extra", term18755);
        setField(term18614, term18614.getClass(), "comment", "WHcwFgsGFC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term18614, args);
    }

};


