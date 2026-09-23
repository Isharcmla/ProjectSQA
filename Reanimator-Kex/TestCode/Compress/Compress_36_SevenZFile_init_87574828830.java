package org.apache.commons.compress.archivers.sevenz;

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
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class SevenZFile_init_87574828830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212;

    public SevenZFile_init_87574828830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14422 = Class.forName((String) "java.io.File$PathStatus");
        Field term14421 = ((Class) term14422).getDeclaredField((String) "INVALID");
        ((Field) term14421).setAccessible(true);
        Object enum3 = ((Field) term14421).get((Object) null);
        term212 = newInstance(Class.forName("java.io.File"));
        setField(term212, term212.getClass(), "path", "sjlJAEtRrb");
        setField(term212, term212.getClass(), "status", enum3);
        setIntField(term212, term212.getClass(), "prefixLength", 1162663216);
        setField(term212, term212.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term212;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (FileNotFoundException e) {
        }

    }

};


