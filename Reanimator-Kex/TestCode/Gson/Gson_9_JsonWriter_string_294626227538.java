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

public class JsonWriter_string_294626227538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1285526;
     Object term1434265;

    public JsonWriter_string_294626227538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1285526 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1285564 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1285526, term1285526.getClass(), "htmlSafe", true);
        setField(term1285526, term1285526.getClass(), "out", term1285564);
        term1434265 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1434266 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1434266, term1434266.getClass(), "closed", false);
        setField(term1434266, term1434266.getClass(), "writeBuffer", null);
        setField(term1434266, term1434266.getClass(), "lock", null);
        setField(term1434265, term1434265.getClass(), "out", term1434266);
        setField(term1434265, term1434265.getClass(), "stack", null);
        setIntField(term1434265, term1434265.getClass(), "stackSize", 0);
        setField(term1434265, term1434265.getClass(), "indent", null);
        setField(term1434265, term1434265.getClass(), "separator", null);
        setBooleanField(term1434265, term1434265.getClass(), "lenient", false);
        setBooleanField(term1434265, term1434265.getClass(), "htmlSafe", true);
        setField(term1434265, term1434265.getClass(), "deferredName", null);
        setBooleanField(term1434265, term1434265.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
        callMethod(klass, "string", argTypes, term1285526, args);
        assertTrue(recursiveEquals(term1285526, term1434265));
    }

};


