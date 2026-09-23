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

public class ZipArchiveEntry_mergeExtraFields_150703452632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19346;
     Object term19491;
     Object term19492;

    public ZipArchiveEntry_mergeExtraFields_150703452632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term19351 = new LinkedHashMap();
        Class<? extends Object> term19495 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term19494 = ((Class) term19495).getDeclaredField((String) "MICROSECONDS");
        ((Field) term19494).setAccessible(true);
        Object enum76 = ((Field) term19494).get((Object) null);
        Class<? extends Object> term19693 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term19692 = ((Class) term19693).getDeclaredField((String) "NANOSECONDS");
        ((Field) term19692).setAccessible(true);
        Object enum77 = ((Field) term19692).get((Object) null);
        term19346 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term19372 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term19398 = newInstance(Class.forName("java.time.Instant"));
        Object term19413 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term19438 = newInstance(Class.forName("java.time.Instant"));
        Object term19453 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term19455 = newInstance(Class.forName("java.time.Instant"));
        byte[] term19475 = (byte[]) newByteArray(2);
        setIntField(term19346, term19346.getClass(), "method", -1);
        setIntField(term19346, term19346.getClass(), "internalAttributes", -1697741339);
        setIntField(term19346, term19346.getClass(), "platform", 98922530);
        setLongField(term19346, term19346.getClass(), "externalAttributes", -4393710401270724527L);
        setField(term19346, term19346.getClass(), "extraFields", term19351);
        setField(term19346, term19346.getClass(), "name", "");
        setLongField(term19346, term19346.getClass(), "xdostime", -1L);
        setField(term19372, term19372.getClass(), "unit", enum76);
        setLongField(term19372, term19372.getClass(), "value", -4822736661741380518L);
        setLongField(term19398, term19398.getClass(), "seconds", 1359804657L);
        setIntField(term19398, term19398.getClass(), "nanos", 69000000);
        setField(term19372, term19372.getClass(), "instant", term19398);
        setField(term19372, term19372.getClass(), "valueAsString", "jwsfVjMoJT");
        setField(term19346, term19346.getClass(), "mtime", term19372);
        setField(term19413, term19413.getClass(), "unit", enum77);
        setLongField(term19413, term19413.getClass(), "value", -5386201758403679145L);
        setLongField(term19438, term19438.getClass(), "seconds", 1589764751L);
        setIntField(term19438, term19438.getClass(), "nanos", 309000000);
        setField(term19413, term19413.getClass(), "instant", term19438);
        setField(term19413, term19413.getClass(), "valueAsString", "ZfdXfCCFDf");
        setField(term19346, term19346.getClass(), "atime", term19413);
        setField(term19453, term19453.getClass(), "unit", enum76);
        setLongField(term19453, term19453.getClass(), "value", -7268507582722666254L);
        setLongField(term19455, term19455.getClass(), "seconds", 1291298367L);
        setIntField(term19455, term19455.getClass(), "nanos", 982000000);
        setField(term19453, term19453.getClass(), "instant", term19455);
        setField(term19453, term19453.getClass(), "valueAsString", "MwwjNtdOFT");
        setField(term19346, term19346.getClass(), "ctime", term19453);
        setLongField(term19346, term19346.getClass(), "crc", -1L);
        setLongField(term19346, term19346.getClass(), "size", -1L);
        setLongField(term19346, term19346.getClass(), "csize", -1L);
        setIntField(term19346, term19346.getClass(), "flag", -1388471422);
        setByteElement(term19475, 0, (byte) -96);
        setByteElement(term19475, 1, (byte) -22);
        setField(term19346, term19346.getClass(), "extra", term19475);
        setField(term19346, term19346.getClass(), "comment", "VYkqXKVlAJ");
        term19491 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 5);
        term19492 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField"), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term19491;
        args[1] = term19492;
        callMethod(klass, "mergeExtraFields", argTypes, term19346, args);
    }

};


