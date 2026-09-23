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

public class ZipArchiveEntry_getExtraFields_88501410018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10172;

    public ZipArchiveEntry_getExtraFields_88501410018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term10177 = new LinkedHashMap();
        Class<? extends Object> term10328 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term10327 = ((Class) term10328).getDeclaredField((String) "SECONDS");
        ((Field) term10327).setAccessible(true);
        Object enum40 = ((Field) term10327).get((Object) null);
        Class<? extends Object> term10511 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term10510 = ((Class) term10511).getDeclaredField((String) "MILLISECONDS");
        ((Field) term10510).setAccessible(true);
        Object enum41 = ((Field) term10510).get((Object) null);
        Class<? extends Object> term10709 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term10708 = ((Class) term10709).getDeclaredField((String) "DAYS");
        ((Field) term10708).setAccessible(true);
        Object enum42 = ((Field) term10708).get((Object) null);
        term10172 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term10198 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10219 = newInstance(Class.forName("java.time.Instant"));
        Object term10234 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10260 = newInstance(Class.forName("java.time.Instant"));
        Object term10275 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10293 = newInstance(Class.forName("java.time.Instant"));
        byte[] term10313 = (byte[]) newByteArray(0);
        setIntField(term10172, term10172.getClass(), "method", -1);
        setIntField(term10172, term10172.getClass(), "internalAttributes", 1375330971);
        setIntField(term10172, term10172.getClass(), "platform", -478195677);
        setLongField(term10172, term10172.getClass(), "externalAttributes", 5953383087795962419L);
        setField(term10172, term10172.getClass(), "extraFields", term10177);
        setField(term10172, term10172.getClass(), "name", "");
        setLongField(term10172, term10172.getClass(), "xdostime", -1L);
        setField(term10198, term10198.getClass(), "unit", enum40);
        setLongField(term10198, term10198.getClass(), "value", 7994303628307559416L);
        setLongField(term10219, term10219.getClass(), "seconds", 1633022775L);
        setIntField(term10219, term10219.getClass(), "nanos", 487000000);
        setField(term10198, term10198.getClass(), "instant", term10219);
        setField(term10198, term10198.getClass(), "valueAsString", "wGmYcqUkgE");
        setField(term10172, term10172.getClass(), "mtime", term10198);
        setField(term10234, term10234.getClass(), "unit", enum41);
        setLongField(term10234, term10234.getClass(), "value", 2443640364875054177L);
        setLongField(term10260, term10260.getClass(), "seconds", 1819209638L);
        setIntField(term10260, term10260.getClass(), "nanos", 549000000);
        setField(term10234, term10234.getClass(), "instant", term10260);
        setField(term10234, term10234.getClass(), "valueAsString", "idgaQsnJpQ");
        setField(term10172, term10172.getClass(), "atime", term10234);
        setField(term10275, term10275.getClass(), "unit", enum42);
        setLongField(term10275, term10275.getClass(), "value", -1610676979013636850L);
        setLongField(term10293, term10293.getClass(), "seconds", 1400709778L);
        setIntField(term10293, term10293.getClass(), "nanos", 698000000);
        setField(term10275, term10275.getClass(), "instant", term10293);
        setField(term10275, term10275.getClass(), "valueAsString", "VgZnGoIFwQ");
        setField(term10172, term10172.getClass(), "ctime", term10275);
        setLongField(term10172, term10172.getClass(), "crc", -1L);
        setLongField(term10172, term10172.getClass(), "size", -1L);
        setLongField(term10172, term10172.getClass(), "csize", -1L);
        setIntField(term10172, term10172.getClass(), "flag", 972867650);
        setField(term10172, term10172.getClass(), "extra", term10313);
        setField(term10172, term10172.getClass(), "comment", "jUbSRrkrYZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtraFields", argTypes, term10172, args);
    }

};


