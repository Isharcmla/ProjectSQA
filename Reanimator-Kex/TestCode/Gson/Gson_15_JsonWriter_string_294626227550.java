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

public class JsonWriter_string_294626227550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1888178;
     Object term2163438;

    public JsonWriter_string_294626227550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1888178 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1888216 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1888178, term1888178.getClass(), "htmlSafe", true);
        setField(term1888178, term1888178.getClass(), "out", term1888216);
        term2163438 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2163439 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2163439, term2163439.getClass(), "closed", false);
        setField(term2163439, term2163439.getClass(), "writeBuffer", null);
        setField(term2163439, term2163439.getClass(), "lock", null);
        setField(term2163438, term2163438.getClass(), "out", term2163439);
        setField(term2163438, term2163438.getClass(), "stack", null);
        setIntField(term2163438, term2163438.getClass(), "stackSize", 0);
        setField(term2163438, term2163438.getClass(), "indent", null);
        setField(term2163438, term2163438.getClass(), "separator", null);
        setBooleanField(term2163438, term2163438.getClass(), "lenient", false);
        setBooleanField(term2163438, term2163438.getClass(), "htmlSafe", true);
        setField(term2163438, term2163438.getClass(), "deferredName", null);
        setBooleanField(term2163438, term2163438.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
        callMethod(klass, "string", argTypes, term1888178, args);
        assertTrue(recursiveEquals(term1888178, term2163438));
    }

};


