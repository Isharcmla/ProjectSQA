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
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class ZipArchiveEntry_init_167302033539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1413;
     Object term25187;
     Object term25194;

    public ZipArchiveEntry_init_167302033539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25213 = Class.forName((String) "java.io.File$PathStatus");
        Field term25212 = ((Class) term25213).getDeclaredField((String) "INVALID");
        ((Field) term25212).setAccessible(true);
        Object enum96 = ((Field) term25212).get((Object) null);
        term1413 = newInstance(Class.forName("java.io.File"));
        setField(term1413, term1413.getClass(), "path", "uuaPigETmJ");
        setField(term1413, term1413.getClass(), "status", enum96);
        setIntField(term1413, term1413.getClass(), "prefixLength", -2038273078);
        setField(term1413, term1413.getClass(), "filePath", null);
        Class<? extends Object> term25376 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term25375 = ((Class) term25376).getDeclaredField((String) "MILLISECONDS");
        ((Field) term25375).setAccessible(true);
        Object enum97 = ((Field) term25375).get((Object) null);
        term25187 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term25190 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        setIntField(term25187, term25187.getClass(), "method", -1);
        setIntField(term25187, term25187.getClass(), "internalAttributes", 0);
        setIntField(term25187, term25187.getClass(), "platform", 0);
        setLongField(term25187, term25187.getClass(), "externalAttributes", 0L);
        setField(term25187, term25187.getClass(), "extraFields", null);
        setField(term25187, term25187.getClass(), "name", "MxlszYVzRf");
        setLongField(term25187, term25187.getClass(), "xdostime", 2162688L);
        setField(term25190, term25190.getClass(), "unit", enum97);
        setLongField(term25190, term25190.getClass(), "value", 0L);
        setField(term25190, term25190.getClass(), "instant", null);
        setField(term25190, term25190.getClass(), "valueAsString", null);
        setField(term25187, term25187.getClass(), "mtime", term25190);
        setField(term25187, term25187.getClass(), "atime", null);
        setField(term25187, term25187.getClass(), "ctime", null);
        setLongField(term25187, term25187.getClass(), "crc", -1L);
        setLongField(term25187, term25187.getClass(), "size", -1L);
        setLongField(term25187, term25187.getClass(), "csize", -1L);
        setIntField(term25187, term25187.getClass(), "flag", 0);
        setField(term25187, term25187.getClass(), "extra", null);
        setField(term25187, term25187.getClass(), "comment", null);
        Class<? extends Object> term25574 = Class.forName((String) "java.io.File$PathStatus");
        Field term25573 = ((Class) term25574).getDeclaredField((String) "INVALID");
        ((Field) term25573).setAccessible(true);
        Object enum98 = ((Field) term25573).get((Object) null);
        term25194 = newInstance(Class.forName("java.io.File"));
        setField(term25194, term25194.getClass(), "path", "uuaPigETmJ");
        setField(term25194, term25194.getClass(), "status", enum98);
        setIntField(term25194, term25194.getClass(), "prefixLength", -2038273078);
        setField(term25194, term25194.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1413;
        args[1] = "MxlszYVzRf";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term25187));
        assertTrue(recursiveEquals(term1413, term25194));
    }

};


