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

public class JsonWriter_string_294626227508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352667;
     Object term441461;

    public JsonWriter_string_294626227508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352667 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term352705 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term352667, term352667.getClass(), "htmlSafe", true);
        setField(term352667, term352667.getClass(), "out", term352705);
        term441461 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term441462 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term441462, term441462.getClass(), "closed", false);
        setField(term441462, term441462.getClass(), "writeBuffer", null);
        setField(term441462, term441462.getClass(), "lock", null);
        setField(term441461, term441461.getClass(), "out", term441462);
        setField(term441461, term441461.getClass(), "stack", null);
        setIntField(term441461, term441461.getClass(), "stackSize", 0);
        setField(term441461, term441461.getClass(), "indent", null);
        setField(term441461, term441461.getClass(), "separator", null);
        setBooleanField(term441461, term441461.getClass(), "lenient", false);
        setBooleanField(term441461, term441461.getClass(), "htmlSafe", true);
        setField(term441461, term441461.getClass(), "deferredName", null);
        setBooleanField(term441461, term441461.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0001\u0001\u0004\u0002\u0002\u0001\u0002\u0002\u0002\u0002\u0001\u0004\u0004\u0004\u0001\u0001\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0004\u0004                                                                                                ";
        callMethod(klass, "string", argTypes, term352667, args);
        assertTrue(recursiveEquals(term352667, term441461));
    }

};


