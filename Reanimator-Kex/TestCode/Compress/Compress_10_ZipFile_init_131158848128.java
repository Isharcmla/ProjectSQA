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
import java.lang.Boolean;

public class ZipFile_init_131158848128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term467;
     Object term504;

    public ZipFile_init_131158848128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8263 = Class.forName((String) "java.io.File$PathStatus");
        Field term8262 = ((Class) term8263).getDeclaredField((String) "INVALID");
        ((Field) term8262).setAccessible(true);
        Object enum12 = ((Field) term8262).get((Object) null);
        term467 = newInstance(Class.forName("java.io.File"));
        setField(term467, term467.getClass(), "path", "SzjVpOQTyS");
        setField(term467, term467.getClass(), "status", enum12);
        setIntField(term467, term467.getClass(), "prefixLength", 1484323161);
        setField(term467, term467.getClass(), "filePath", null);
        term504 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term467;
        args[1] = "MjGYSRKTNF";
        args[2] = term504;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (FileNotFoundException e) {
        }

    }

};


