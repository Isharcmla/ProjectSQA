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

public class JsonWriter_string_294626227561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2901451;
     Object term2909416;

    public JsonWriter_string_294626227561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2901451 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2901489 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2901451, term2901451.getClass(), "htmlSafe", true);
        setField(term2901451, term2901451.getClass(), "out", term2901489);
        term2909416 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2909417 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2909417, term2909417.getClass(), "closed", false);
        setField(term2909417, term2909417.getClass(), "writeBuffer", null);
        setField(term2909417, term2909417.getClass(), "lock", null);
        setField(term2909416, term2909416.getClass(), "out", term2909417);
        setField(term2909416, term2909416.getClass(), "stack", null);
        setIntField(term2909416, term2909416.getClass(), "stackSize", 0);
        setField(term2909416, term2909416.getClass(), "indent", null);
        setField(term2909416, term2909416.getClass(), "separator", null);
        setBooleanField(term2909416, term2909416.getClass(), "lenient", false);
        setBooleanField(term2909416, term2909416.getClass(), "htmlSafe", true);
        setField(term2909416, term2909416.getClass(), "deferredName", null);
        setBooleanField(term2909416, term2909416.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
        callMethod(klass, "string", argTypes, term2901451, args);
        assertTrue(recursiveEquals(term2901451, term2909416));
    }

};


