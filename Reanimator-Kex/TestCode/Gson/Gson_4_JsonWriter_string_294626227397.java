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

public class JsonWriter_string_294626227397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1447019;
     Object term1475012;

    public JsonWriter_string_294626227397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1447019 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1447057 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1447019, term1447019.getClass(), "htmlSafe", true);
        setField(term1447019, term1447019.getClass(), "out", term1447057);
        term1475012 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1475013 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1475013, term1475013.getClass(), "closed", false);
        setField(term1475013, term1475013.getClass(), "writeBuffer", null);
        setField(term1475013, term1475013.getClass(), "lock", null);
        setField(term1475012, term1475012.getClass(), "out", term1475013);
        setField(term1475012, term1475012.getClass(), "stack", null);
        setIntField(term1475012, term1475012.getClass(), "stackSize", 0);
        setField(term1475012, term1475012.getClass(), "indent", null);
        setField(term1475012, term1475012.getClass(), "separator", null);
        setBooleanField(term1475012, term1475012.getClass(), "lenient", false);
        setBooleanField(term1475012, term1475012.getClass(), "htmlSafe", true);
        setField(term1475012, term1475012.getClass(), "deferredName", null);
        setBooleanField(term1475012, term1475012.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
        callMethod(klass, "string", argTypes, term1447019, args);
        assertTrue(recursiveEquals(term1447019, term1475012));
    }

};


