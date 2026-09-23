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

public class ZipArchiveEntry_getExtraField_14083876222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12730;
     Object term12894;

    public ZipArchiveEntry_getExtraField_14083876222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term12735 = new LinkedHashMap();
        Class<? extends Object> term12897 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term12896 = ((Class) term12897).getDeclaredField((String) "NANOSECONDS");
        ((Field) term12896).setAccessible(true);
        Object enum50 = ((Field) term12896).get((Object) null);
        Class<? extends Object> term13092 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term13091 = ((Class) term13092).getDeclaredField((String) "SECONDS");
        ((Field) term13091).setAccessible(true);
        Object enum51 = ((Field) term13091).get((Object) null);
        Class<? extends Object> term13275 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term13274 = ((Class) term13275).getDeclaredField((String) "MILLISECONDS");
        ((Field) term13274).setAccessible(true);
        Object enum52 = ((Field) term13274).get((Object) null);
        term12730 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term12756 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12781 = newInstance(Class.forName("java.time.Instant"));
        Object term12796 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12817 = newInstance(Class.forName("java.time.Instant"));
        Object term12832 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12858 = newInstance(Class.forName("java.time.Instant"));
        byte[] term12878 = (byte[]) newByteArray(2);
        setIntField(term12730, term12730.getClass(), "method", -1);
        setIntField(term12730, term12730.getClass(), "internalAttributes", 304775596);
        setIntField(term12730, term12730.getClass(), "platform", -1347665717);
        setLongField(term12730, term12730.getClass(), "externalAttributes", -5963439350418910964L);
        setField(term12730, term12730.getClass(), "extraFields", term12735);
        setField(term12730, term12730.getClass(), "name", "");
        setLongField(term12730, term12730.getClass(), "xdostime", -1L);
        setField(term12756, term12756.getClass(), "unit", enum50);
        setLongField(term12756, term12756.getClass(), "value", 9013624480170062917L);
        setLongField(term12781, term12781.getClass(), "seconds", 1393218035L);
        setIntField(term12781, term12781.getClass(), "nanos", 243000000);
        setField(term12756, term12756.getClass(), "instant", term12781);
        setField(term12756, term12756.getClass(), "valueAsString", "BKLfkLiZTH");
        setField(term12730, term12730.getClass(), "mtime", term12756);
        setField(term12796, term12796.getClass(), "unit", enum51);
        setLongField(term12796, term12796.getClass(), "value", 7862575738391801707L);
        setLongField(term12817, term12817.getClass(), "seconds", 1762165441L);
        setIntField(term12817, term12817.getClass(), "nanos", 299000000);
        setField(term12796, term12796.getClass(), "instant", term12817);
        setField(term12796, term12796.getClass(), "valueAsString", "SPpkrGcPRr");
        setField(term12730, term12730.getClass(), "atime", term12796);
        setField(term12832, term12832.getClass(), "unit", enum52);
        setLongField(term12832, term12832.getClass(), "value", 50358265865610362L);
        setLongField(term12858, term12858.getClass(), "seconds", 1395497491L);
        setIntField(term12858, term12858.getClass(), "nanos", 666000000);
        setField(term12832, term12832.getClass(), "instant", term12858);
        setField(term12832, term12832.getClass(), "valueAsString", "sEccwbJKYE");
        setField(term12730, term12730.getClass(), "ctime", term12832);
        setLongField(term12730, term12730.getClass(), "crc", -1L);
        setLongField(term12730, term12730.getClass(), "size", -1L);
        setLongField(term12730, term12730.getClass(), "csize", -1L);
        setIntField(term12730, term12730.getClass(), "flag", -1888585309);
        setByteElement(term12878, 0, (byte) 77);
        setByteElement(term12878, 1, (byte) 14);
        setField(term12730, term12730.getClass(), "extra", term12878);
        setField(term12730, term12730.getClass(), "comment", "AWRooQKkdW");
        term12894 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term12894, term12894.getClass(), "value", 1596213415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipShort");
        Object[] args = new Object[1];
        args[0] = term12894;
        callMethod(klass, "getExtraField", argTypes, term12730, args);
    }

};


