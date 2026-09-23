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
import java.lang.String;
import java.lang.Object;

public class ZipArchiveEntry_init_16730203354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1434;

    public ZipArchiveEntry_init_16730203354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1504 = Class.forName((String) "java.io.File$PathStatus");
        Field term1503 = ((Class) term1504).getDeclaredField((String) "INVALID");
        ((Field) term1503).setAccessible(true);
        Object enum5 = ((Field) term1503).get((Object) null);
        term1434 = newInstance(Class.forName("java.io.File"));
        setField(term1434, term1434.getClass(), "path", "NRdvgJlhkX");
        setField(term1434, term1434.getClass(), "status", enum5);
        setIntField(term1434, term1434.getClass(), "prefixLength", 1227103734);
        setField(term1434, term1434.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1434;
        args[1] = "uuaPigETmJ";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


