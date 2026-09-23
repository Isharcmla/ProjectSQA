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

public class ZipArchiveEntry_isDirectory_159985423529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17312;

    public ZipArchiveEntry_isDirectory_159985423529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term17317 = new LinkedHashMap();
        Class<? extends Object> term17454 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term17453 = ((Class) term17454).getDeclaredField((String) "SECONDS");
        ((Field) term17453).setAccessible(true);
        Object enum68 = ((Field) term17453).get((Object) null);
        Class<? extends Object> term17637 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term17636 = ((Class) term17637).getDeclaredField((String) "MICROSECONDS");
        ((Field) term17636).setAccessible(true);
        Object enum69 = ((Field) term17636).get((Object) null);
        term17312 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term17338 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term17359 = newInstance(Class.forName("java.time.Instant"));
        Object term17374 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term17400 = newInstance(Class.forName("java.time.Instant"));
        Object term17415 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term17417 = newInstance(Class.forName("java.time.Instant"));
        byte[] term17437 = (byte[]) newByteArray(2);
        setIntField(term17312, term17312.getClass(), "method", -1);
        setIntField(term17312, term17312.getClass(), "internalAttributes", -1963464809);
        setIntField(term17312, term17312.getClass(), "platform", 71190297);
        setLongField(term17312, term17312.getClass(), "externalAttributes", 1368340889161782793L);
        setField(term17312, term17312.getClass(), "extraFields", term17317);
        setField(term17312, term17312.getClass(), "name", "");
        setLongField(term17312, term17312.getClass(), "xdostime", -1L);
        setField(term17338, term17338.getClass(), "unit", enum68);
        setLongField(term17338, term17338.getClass(), "value", -5786861555969446503L);
        setLongField(term17359, term17359.getClass(), "seconds", 1531349402L);
        setIntField(term17359, term17359.getClass(), "nanos", 53000000);
        setField(term17338, term17338.getClass(), "instant", term17359);
        setField(term17338, term17338.getClass(), "valueAsString", "gCWtLVKVVe");
        setField(term17312, term17312.getClass(), "mtime", term17338);
        setField(term17374, term17374.getClass(), "unit", enum69);
        setLongField(term17374, term17374.getClass(), "value", 2354625302846375590L);
        setLongField(term17400, term17400.getClass(), "seconds", 1264055800L);
        setIntField(term17400, term17400.getClass(), "nanos", 343000000);
        setField(term17374, term17374.getClass(), "instant", term17400);
        setField(term17374, term17374.getClass(), "valueAsString", "fWKJoSoCwE");
        setField(term17312, term17312.getClass(), "atime", term17374);
        setField(term17415, term17415.getClass(), "unit", enum68);
        setLongField(term17415, term17415.getClass(), "value", 7276637106827860087L);
        setLongField(term17417, term17417.getClass(), "seconds", 1450883259L);
        setIntField(term17417, term17417.getClass(), "nanos", 896000000);
        setField(term17415, term17415.getClass(), "instant", term17417);
        setField(term17415, term17415.getClass(), "valueAsString", "wfaXBpWAUH");
        setField(term17312, term17312.getClass(), "ctime", term17415);
        setLongField(term17312, term17312.getClass(), "crc", -1L);
        setLongField(term17312, term17312.getClass(), "size", -1L);
        setLongField(term17312, term17312.getClass(), "csize", -1L);
        setIntField(term17312, term17312.getClass(), "flag", 1202361360);
        setByteElement(term17437, 0, (byte) 70);
        setByteElement(term17437, 1, (byte) -28);
        setField(term17312, term17312.getClass(), "extra", term17437);
        setField(term17312, term17312.getClass(), "comment", "VMeAzAHwZj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDirectory", argTypes, term17312, args);
    }

};


