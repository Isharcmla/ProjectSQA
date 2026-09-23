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

public class ZipArchiveEntry_addExtraField_64781258419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10892;

    public ZipArchiveEntry_addExtraField_64781258419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term10897 = new LinkedHashMap();
        Class<? extends Object> term11053 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term11052 = ((Class) term11053).getDeclaredField((String) "SECONDS");
        ((Field) term11052).setAccessible(true);
        Object enum43 = ((Field) term11052).get((Object) null);
        Class<? extends Object> term11236 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term11235 = ((Class) term11236).getDeclaredField((String) "MINUTES");
        ((Field) term11235).setAccessible(true);
        Object enum44 = ((Field) term11235).get((Object) null);
        Class<? extends Object> term11419 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term11418 = ((Class) term11419).getDeclaredField((String) "MICROSECONDS");
        ((Field) term11418).setAccessible(true);
        Object enum45 = ((Field) term11418).get((Object) null);
        term10892 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term10918 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10939 = newInstance(Class.forName("java.time.Instant"));
        Object term10954 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10975 = newInstance(Class.forName("java.time.Instant"));
        Object term10990 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term11016 = newInstance(Class.forName("java.time.Instant"));
        byte[] term11036 = (byte[]) newByteArray(2);
        setIntField(term10892, term10892.getClass(), "method", -1);
        setIntField(term10892, term10892.getClass(), "internalAttributes", 1240914516);
        setIntField(term10892, term10892.getClass(), "platform", -1465035361);
        setLongField(term10892, term10892.getClass(), "externalAttributes", 2062173786000223358L);
        setField(term10892, term10892.getClass(), "extraFields", term10897);
        setField(term10892, term10892.getClass(), "name", "");
        setLongField(term10892, term10892.getClass(), "xdostime", -1L);
        setField(term10918, term10918.getClass(), "unit", enum43);
        setLongField(term10918, term10918.getClass(), "value", -8658027316505137504L);
        setLongField(term10939, term10939.getClass(), "seconds", 1741462563L);
        setIntField(term10939, term10939.getClass(), "nanos", 811000000);
        setField(term10918, term10918.getClass(), "instant", term10939);
        setField(term10918, term10918.getClass(), "valueAsString", "cAPeiZHKGJ");
        setField(term10892, term10892.getClass(), "mtime", term10918);
        setField(term10954, term10954.getClass(), "unit", enum44);
        setLongField(term10954, term10954.getClass(), "value", 414749984815662075L);
        setLongField(term10975, term10975.getClass(), "seconds", 1762012701L);
        setIntField(term10975, term10975.getClass(), "nanos", 322000000);
        setField(term10954, term10954.getClass(), "instant", term10975);
        setField(term10954, term10954.getClass(), "valueAsString", "LvJFtLBaxj");
        setField(term10892, term10892.getClass(), "atime", term10954);
        setField(term10990, term10990.getClass(), "unit", enum45);
        setLongField(term10990, term10990.getClass(), "value", 463622836963501975L);
        setLongField(term11016, term11016.getClass(), "seconds", 1695443269L);
        setIntField(term11016, term11016.getClass(), "nanos", 458000000);
        setField(term10990, term10990.getClass(), "instant", term11016);
        setField(term10990, term10990.getClass(), "valueAsString", "PHvxnGHptP");
        setField(term10892, term10892.getClass(), "ctime", term10990);
        setLongField(term10892, term10892.getClass(), "crc", -1L);
        setLongField(term10892, term10892.getClass(), "size", -1L);
        setLongField(term10892, term10892.getClass(), "csize", -1L);
        setIntField(term10892, term10892.getClass(), "flag", 1090617576);
        setByteElement(term11036, 0, (byte) 116);
        setByteElement(term11036, 1, (byte) -81);
        setField(term10892, term10892.getClass(), "extra", term11036);
        setField(term10892, term10892.getClass(), "comment", "TimdotUuNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addExtraField", argTypes, term10892, args);
    }

};


