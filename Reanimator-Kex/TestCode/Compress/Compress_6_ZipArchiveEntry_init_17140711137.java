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
import java.util.zip.ZipException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.lang.String;

public class ZipArchiveEntry_init_17140711137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term893;

    public ZipArchiveEntry_init_17140711137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term898 = new LinkedHashMap();
        Class<? extends Object> term23918 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term23917 = ((Class) term23918).getDeclaredField((String) "HOURS");
        ((Field) term23917).setAccessible(true);
        Object enum90 = ((Field) term23917).get((Object) null);
        Class<? extends Object> term24105 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term24104 = ((Class) term24105).getDeclaredField((String) "SECONDS");
        ((Field) term24104).setAccessible(true);
        Object enum91 = ((Field) term24104).get((Object) null);
        term893 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term919 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term938 = newInstance(Class.forName("java.time.Instant"));
        Object term953 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term955 = newInstance(Class.forName("java.time.Instant"));
        Object term970 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term991 = newInstance(Class.forName("java.time.Instant"));
        byte[] term1011 = (byte[]) newByteArray(4);
        setIntField(term893, term893.getClass(), "method", -1);
        setIntField(term893, term893.getClass(), "internalAttributes", 391863371);
        setIntField(term893, term893.getClass(), "platform", -1922583790);
        setLongField(term893, term893.getClass(), "externalAttributes", -8400487765614892086L);
        setField(term893, term893.getClass(), "extraFields", term898);
        setField(term893, term893.getClass(), "name", "");
        setLongField(term893, term893.getClass(), "xdostime", -1L);
        setField(term919, term919.getClass(), "unit", enum90);
        setLongField(term919, term919.getClass(), "value", 5270370404989704783L);
        setLongField(term938, term938.getClass(), "seconds", 1606063635L);
        setIntField(term938, term938.getClass(), "nanos", 837000000);
        setField(term919, term919.getClass(), "instant", term938);
        setField(term919, term919.getClass(), "valueAsString", "MjGYSRKTNF");
        setField(term893, term893.getClass(), "mtime", term919);
        setField(term953, term953.getClass(), "unit", enum90);
        setLongField(term953, term953.getClass(), "value", 7411271909051562686L);
        setLongField(term955, term955.getClass(), "seconds", 1442657565L);
        setIntField(term955, term955.getClass(), "nanos", 302000000);
        setField(term953, term953.getClass(), "instant", term955);
        setField(term953, term953.getClass(), "valueAsString", "hRNSzYYIrc");
        setField(term893, term893.getClass(), "atime", term953);
        setField(term970, term970.getClass(), "unit", enum91);
        setLongField(term970, term970.getClass(), "value", 4872422362414183754L);
        setLongField(term991, term991.getClass(), "seconds", 1515908130L);
        setIntField(term991, term991.getClass(), "nanos", 18000000);
        setField(term970, term970.getClass(), "instant", term991);
        setField(term970, term970.getClass(), "valueAsString", "RMFIsYGgne");
        setField(term893, term893.getClass(), "ctime", term970);
        setLongField(term893, term893.getClass(), "crc", -1L);
        setLongField(term893, term893.getClass(), "size", -1L);
        setLongField(term893, term893.getClass(), "csize", -1L);
        setIntField(term893, term893.getClass(), "flag", -616727354);
        setByteElement(term1011, 0, (byte) -58);
        setByteElement(term1011, 1, (byte) -29);
        setByteElement(term1011, 2, (byte) -54);
        setByteElement(term1011, 3, (byte) -10);
        setField(term893, term893.getClass(), "extra", term1011);
        setField(term893, term893.getClass(), "comment", "NRdvgJlhkX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term893;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ZipException e) {
        }

    }

};


