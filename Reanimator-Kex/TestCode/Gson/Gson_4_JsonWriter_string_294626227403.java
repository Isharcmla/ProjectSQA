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

public class JsonWriter_string_294626227403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1959174;
     Object term1992379;

    public JsonWriter_string_294626227403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1959174 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1959212 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1959174, term1959174.getClass(), "htmlSafe", true);
        setField(term1959174, term1959174.getClass(), "out", term1959212);
        term1992379 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1992380 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1992380, term1992380.getClass(), "closed", false);
        setField(term1992380, term1992380.getClass(), "writeBuffer", null);
        setField(term1992380, term1992380.getClass(), "lock", null);
        setField(term1992379, term1992379.getClass(), "out", term1992380);
        setField(term1992379, term1992379.getClass(), "stack", null);
        setIntField(term1992379, term1992379.getClass(), "stackSize", 0);
        setField(term1992379, term1992379.getClass(), "indent", null);
        setField(term1992379, term1992379.getClass(), "separator", null);
        setBooleanField(term1992379, term1992379.getClass(), "lenient", false);
        setBooleanField(term1992379, term1992379.getClass(), "htmlSafe", true);
        setField(term1992379, term1992379.getClass(), "deferredName", null);
        setBooleanField(term1992379, term1992379.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0002\u0004\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ";
        callMethod(klass, "string", argTypes, term1959174, args);
        assertTrue(recursiveEquals(term1959174, term1992379));
    }

};


