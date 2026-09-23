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

public class ZipArchiveEntry_getInternalAttributes_4125712669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4185;

    public ZipArchiveEntry_getInternalAttributes_4125712669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term4190 = new LinkedHashMap();
        Class<? extends Object> term4343 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term4342 = ((Class) term4343).getDeclaredField((String) "DAYS");
        ((Field) term4342).setAccessible(true);
        Object enum16 = ((Field) term4342).get((Object) null);
        Class<? extends Object> term4517 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term4516 = ((Class) term4517).getDeclaredField((String) "MICROSECONDS");
        ((Field) term4516).setAccessible(true);
        Object enum17 = ((Field) term4516).get((Object) null);
        Class<? extends Object> term4715 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term4714 = ((Class) term4715).getDeclaredField((String) "MINUTES");
        ((Field) term4714).setAccessible(true);
        Object enum18 = ((Field) term4714).get((Object) null);
        term4185 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term4211 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term4229 = newInstance(Class.forName("java.time.Instant"));
        Object term4244 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term4270 = newInstance(Class.forName("java.time.Instant"));
        Object term4285 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term4306 = newInstance(Class.forName("java.time.Instant"));
        byte[] term4326 = (byte[]) newByteArray(2);
        setIntField(term4185, term4185.getClass(), "method", -1);
        setIntField(term4185, term4185.getClass(), "internalAttributes", -203030934);
        setIntField(term4185, term4185.getClass(), "platform", -1179120542);
        setLongField(term4185, term4185.getClass(), "externalAttributes", -4365849114644724155L);
        setField(term4185, term4185.getClass(), "extraFields", term4190);
        setField(term4185, term4185.getClass(), "name", "");
        setLongField(term4185, term4185.getClass(), "xdostime", -1L);
        setField(term4211, term4211.getClass(), "unit", enum16);
        setLongField(term4211, term4211.getClass(), "value", 2486810210675247493L);
        setLongField(term4229, term4229.getClass(), "seconds", 1668587229L);
        setIntField(term4229, term4229.getClass(), "nanos", 825000000);
        setField(term4211, term4211.getClass(), "instant", term4229);
        setField(term4211, term4211.getClass(), "valueAsString", "kuTXqwMtDB");
        setField(term4185, term4185.getClass(), "mtime", term4211);
        setField(term4244, term4244.getClass(), "unit", enum17);
        setLongField(term4244, term4244.getClass(), "value", 7009926388951271268L);
        setLongField(term4270, term4270.getClass(), "seconds", 1725140217L);
        setIntField(term4270, term4270.getClass(), "nanos", 647000000);
        setField(term4244, term4244.getClass(), "instant", term4270);
        setField(term4244, term4244.getClass(), "valueAsString", "Ghbwtircqb");
        setField(term4185, term4185.getClass(), "atime", term4244);
        setField(term4285, term4285.getClass(), "unit", enum18);
        setLongField(term4285, term4285.getClass(), "value", -7672528020740371001L);
        setLongField(term4306, term4306.getClass(), "seconds", 1550716994L);
        setIntField(term4306, term4306.getClass(), "nanos", 689000000);
        setField(term4285, term4285.getClass(), "instant", term4306);
        setField(term4285, term4285.getClass(), "valueAsString", "xrwlQZdwCp");
        setField(term4185, term4185.getClass(), "ctime", term4285);
        setLongField(term4185, term4185.getClass(), "crc", -1L);
        setLongField(term4185, term4185.getClass(), "size", -1L);
        setLongField(term4185, term4185.getClass(), "csize", -1L);
        setIntField(term4185, term4185.getClass(), "flag", -73683645);
        setByteElement(term4326, 0, (byte) -16);
        setByteElement(term4326, 1, (byte) -112);
        setField(term4185, term4185.getClass(), "extra", term4326);
        setField(term4185, term4185.getClass(), "comment", "IDCWpPLRkE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInternalAttributes", argTypes, term4185, args);
    }

};


