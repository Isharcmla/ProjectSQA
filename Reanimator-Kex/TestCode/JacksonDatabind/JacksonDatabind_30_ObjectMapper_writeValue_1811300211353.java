package com.fasterxml.jackson.databind;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ObjectMapper_writeValue_1811300211353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5669;
     Object term5694;

    public ObjectMapper_writeValue_1811300211353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83079 = Class.forName((String) "java.io.File$PathStatus");
        Field term83078 = ((Class) term83079).getDeclaredField((String) "CHECKED");
        ((Field) term83078).setAccessible(true);
        Object enum9 = ((Field) term83078).get((Object) null);
        term5669 = newInstance(Class.forName("java.io.File"));
        setField(term5669, term5669.getClass(), "path", "uuaPigETmJ");
        setField(term5669, term5669.getClass(), "status", enum9);
        setIntField(term5669, term5669.getClass(), "prefixLength", 1725571209);
        setField(term5669, term5669.getClass(), "filePath", null);
        term5694 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term5669;
        args[1] = term5694;
        try {
            callMethod(klass, "writeValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


