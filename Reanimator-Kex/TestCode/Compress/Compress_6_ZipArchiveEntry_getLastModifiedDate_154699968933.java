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

public class ZipArchiveEntry_getLastModifiedDate_154699968933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19909;

    public ZipArchiveEntry_getLastModifiedDate_154699968933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term19914 = new LinkedHashMap();
        Class<? extends Object> term20072 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term20071 = ((Class) term20072).getDeclaredField((String) "NANOSECONDS");
        ((Field) term20071).setAccessible(true);
        Object enum78 = ((Field) term20071).get((Object) null);
        Class<? extends Object> term20267 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term20266 = ((Class) term20267).getDeclaredField((String) "MILLISECONDS");
        ((Field) term20266).setAccessible(true);
        Object enum79 = ((Field) term20266).get((Object) null);
        Class<? extends Object> term20465 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term20464 = ((Class) term20465).getDeclaredField((String) "DAYS");
        ((Field) term20464).setAccessible(true);
        Object enum80 = ((Field) term20464).get((Object) null);
        term19909 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term19935 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term19960 = newInstance(Class.forName("java.time.Instant"));
        Object term19975 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20001 = newInstance(Class.forName("java.time.Instant"));
        Object term20016 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term20034 = newInstance(Class.forName("java.time.Instant"));
        byte[] term20054 = (byte[]) newByteArray(3);
        setIntField(term19909, term19909.getClass(), "method", -1);
        setIntField(term19909, term19909.getClass(), "internalAttributes", 1598895173);
        setIntField(term19909, term19909.getClass(), "platform", 1830648570);
        setLongField(term19909, term19909.getClass(), "externalAttributes", 5671808784468963649L);
        setField(term19909, term19909.getClass(), "extraFields", term19914);
        setField(term19909, term19909.getClass(), "name", "");
        setLongField(term19909, term19909.getClass(), "xdostime", -1L);
        setField(term19935, term19935.getClass(), "unit", enum78);
        setLongField(term19935, term19935.getClass(), "value", 2297097306706899827L);
        setLongField(term19960, term19960.getClass(), "seconds", 1491199740L);
        setIntField(term19960, term19960.getClass(), "nanos", 539000000);
        setField(term19935, term19935.getClass(), "instant", term19960);
        setField(term19935, term19935.getClass(), "valueAsString", "aNWLJdrZMq");
        setField(term19909, term19909.getClass(), "mtime", term19935);
        setField(term19975, term19975.getClass(), "unit", enum79);
        setLongField(term19975, term19975.getClass(), "value", -900457279156388404L);
        setLongField(term20001, term20001.getClass(), "seconds", 1462014881L);
        setIntField(term20001, term20001.getClass(), "nanos", 310000000);
        setField(term19975, term19975.getClass(), "instant", term20001);
        setField(term19975, term19975.getClass(), "valueAsString", "HHmNoYxIGj");
        setField(term19909, term19909.getClass(), "atime", term19975);
        setField(term20016, term20016.getClass(), "unit", enum80);
        setLongField(term20016, term20016.getClass(), "value", 1084801489398441516L);
        setLongField(term20034, term20034.getClass(), "seconds", 1818986525L);
        setIntField(term20034, term20034.getClass(), "nanos", 805000000);
        setField(term20016, term20016.getClass(), "instant", term20034);
        setField(term20016, term20016.getClass(), "valueAsString", "PtirvZmsGt");
        setField(term19909, term19909.getClass(), "ctime", term20016);
        setLongField(term19909, term19909.getClass(), "crc", -1L);
        setLongField(term19909, term19909.getClass(), "size", -1L);
        setLongField(term19909, term19909.getClass(), "csize", -1L);
        setIntField(term19909, term19909.getClass(), "flag", -227365013);
        setByteElement(term20054, 0, (byte) -5);
        setByteElement(term20054, 1, (byte) -124);
        setByteElement(term20054, 2, (byte) -105);
        setField(term19909, term19909.getClass(), "extra", term20054);
        setField(term19909, term19909.getClass(), "comment", "HWkpTmtlrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term19909, args);
    }

};


