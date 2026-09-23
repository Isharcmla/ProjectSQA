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

public class JsonWriter_string_294626227524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1081390;
     Object term1266335;

    public JsonWriter_string_294626227524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1081390 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1081428 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1081390, term1081390.getClass(), "htmlSafe", true);
        setField(term1081390, term1081390.getClass(), "out", term1081428);
        term1266335 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1266336 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1266336, term1266336.getClass(), "closed", false);
        setField(term1266336, term1266336.getClass(), "writeBuffer", null);
        setField(term1266336, term1266336.getClass(), "lock", null);
        setField(term1266335, term1266335.getClass(), "out", term1266336);
        setField(term1266335, term1266335.getClass(), "stack", null);
        setIntField(term1266335, term1266335.getClass(), "stackSize", 0);
        setField(term1266335, term1266335.getClass(), "indent", null);
        setField(term1266335, term1266335.getClass(), "separator", null);
        setBooleanField(term1266335, term1266335.getClass(), "lenient", false);
        setBooleanField(term1266335, term1266335.getClass(), "htmlSafe", true);
        setField(term1266335, term1266335.getClass(), "deferredName", null);
        setBooleanField(term1266335, term1266335.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
        callMethod(klass, "string", argTypes, term1081390, args);
        assertTrue(recursiveEquals(term1081390, term1266335));
    }

};


