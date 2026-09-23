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
import java.lang.String;
import java.lang.Object;

public class JsonReader_peek_161933219877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18504;
     Object term18530;
     Object enum0;

    public JsonReader_peek_161933219877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18504 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term18504, term18504.getClass(), "peeked", 14);
        term18530 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term18530, term18530.getClass(), "in", null);
        setBooleanField(term18530, term18530.getClass(), "lenient", false);
        setField(term18530, term18530.getClass(), "buffer", null);
        setIntField(term18530, term18530.getClass(), "pos", 0);
        setIntField(term18530, term18530.getClass(), "limit", 0);
        setIntField(term18530, term18530.getClass(), "lineNumber", 0);
        setIntField(term18530, term18530.getClass(), "lineStart", 0);
        setIntField(term18530, term18530.getClass(), "peeked", 14);
        setLongField(term18530, term18530.getClass(), "peekedLong", 0L);
        setIntField(term18530, term18530.getClass(), "peekedNumberLength", 0);
        setField(term18530, term18530.getClass(), "peekedString", null);
        setField(term18530, term18530.getClass(), "stack", null);
        setIntField(term18530, term18530.getClass(), "stackSize", 0);
        setField(term18530, term18530.getClass(), "pathNames", null);
        setField(term18530, term18530.getClass(), "pathIndices", null);
        Class<? extends Object> term18653 = Class.forName((String) "com.google.gson.stream.JsonToken");
        Field term18652 = ((Class) term18653).getDeclaredField((String) "NAME");
        ((Field) term18652).setAccessible(true);
        enum0 = ((Field) term18652).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "peek", argTypes, term18504, args);
        assertTrue(recursiveEquals(term18504, term18530));
        assertTrue(recursiveEquals(retValue, enum0));
    }

};


