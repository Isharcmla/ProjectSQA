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
import java.io.FileNotFoundException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ZipFile_init_176674973327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;

    public ZipFile_init_176674973327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7430 = Class.forName((String) "java.io.File$PathStatus");
        Field term7429 = ((Class) term7430).getDeclaredField((String) "INVALID");
        ((Field) term7429).setAccessible(true);
        Object enum11 = ((Field) term7429).get((Object) null);
        term267 = newInstance(Class.forName("java.io.File"));
        setField(term267, term267.getClass(), "path", "jJCZpVmanW");
        setField(term267, term267.getClass(), "status", enum11);
        setIntField(term267, term267.getClass(), "prefixLength", 1162663216);
        setField(term267, term267.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term267;
        args[1] = "EGtDIRbSSb";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (FileNotFoundException e) {
        }

    }

};


