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

public class JsonWriter_string_294626227398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1472696;
     Object term1476399;

    public JsonWriter_string_294626227398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1472696 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1472734 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1472696, term1472696.getClass(), "htmlSafe", true);
        setField(term1472696, term1472696.getClass(), "out", term1472734);
        term1476399 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1476400 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1476400, term1476400.getClass(), "closed", false);
        setField(term1476400, term1476400.getClass(), "writeBuffer", null);
        setField(term1476400, term1476400.getClass(), "lock", null);
        setField(term1476399, term1476399.getClass(), "out", term1476400);
        setField(term1476399, term1476399.getClass(), "stack", null);
        setIntField(term1476399, term1476399.getClass(), "stackSize", 0);
        setField(term1476399, term1476399.getClass(), "indent", null);
        setField(term1476399, term1476399.getClass(), "separator", null);
        setBooleanField(term1476399, term1476399.getClass(), "lenient", false);
        setBooleanField(term1476399, term1476399.getClass(), "htmlSafe", true);
        setField(term1476399, term1476399.getClass(), "deferredName", null);
        setBooleanField(term1476399, term1476399.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0002\b \u0010\u0001\u0010 \u0010  \u0001\u0002\u0001\b\u0002\u0004@@@\u0004\u0004\u0010 \u0004\u0001\u0001\u0001\u0001\u0001\u0001\u0001@\u0001\u0004 \u0002@\u0001\u0001\u0002\b@ \u0001\u0001@\u0001\u0001 \u0004\u0001\u0001\u0001\u0001\u0001\u0002\u0001@\u0001\u0001\u0001\b\u0001\u0001\u0001 \u0002\u0001@\u0001\u0001\u0001\u0001\u0002\u0002\u0001\u0001\u0001\u0001\u0001\u0001@\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001@\u0001\u0001\u0001@\u0001\u0001\u0001@\u0001\u0001\u0001\u0001\u0001\u0001\u0001@\u0001\u0001\u0001@\u0001\u0001\u0001@\u0001\u0001\u0001\u0001\b                                                                    ";
        callMethod(klass, "string", argTypes, term1472696, args);
        assertTrue(recursiveEquals(term1472696, term1476399));
    }

};


