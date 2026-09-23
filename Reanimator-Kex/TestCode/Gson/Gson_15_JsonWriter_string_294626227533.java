package com.google.gson.stream;

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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.stream.EqualityUtils.*;
import java.lang.Object;

public class JsonWriter_string_294626227533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1359771;
     Object term1366809;

    public JsonWriter_string_294626227533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1359771 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1359809 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1359771, term1359771.getClass(), "htmlSafe", true);
        setField(term1359771, term1359771.getClass(), "out", term1359809);
        term1366809 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1366810 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1366810, term1366810.getClass(), "closed", false);
        setField(term1366810, term1366810.getClass(), "writeBuffer", null);
        setField(term1366810, term1366810.getClass(), "lock", null);
        setField(term1366809, term1366809.getClass(), "out", term1366810);
        setField(term1366809, term1366809.getClass(), "stack", null);
        setIntField(term1366809, term1366809.getClass(), "stackSize", 0);
        setField(term1366809, term1366809.getClass(), "indent", null);
        setField(term1366809, term1366809.getClass(), "separator", null);
        setBooleanField(term1366809, term1366809.getClass(), "lenient", false);
        setBooleanField(term1366809, term1366809.getClass(), "htmlSafe", true);
        setField(term1366809, term1366809.getClass(), "deferredName", null);
        setBooleanField(term1366809, term1366809.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ";
        callMethod(klass, "string", argTypes, term1359771, args);
        assertTrue(recursiveEquals(term1359771, term1366809));
    }

};


