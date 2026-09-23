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

public class JsonReader_peek_161933219898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25805;
     Object term26455;
     Object enum0;

    public JsonReader_peek_161933219898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25805 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term25805, term25805.getClass(), "peeked", 10);
        term26455 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term26455, term26455.getClass(), "in", null);
        setBooleanField(term26455, term26455.getClass(), "lenient", false);
        setField(term26455, term26455.getClass(), "buffer", null);
        setIntField(term26455, term26455.getClass(), "pos", 0);
        setIntField(term26455, term26455.getClass(), "limit", 0);
        setIntField(term26455, term26455.getClass(), "lineNumber", 0);
        setIntField(term26455, term26455.getClass(), "lineStart", 0);
        setIntField(term26455, term26455.getClass(), "peeked", 10);
        setLongField(term26455, term26455.getClass(), "peekedLong", 0L);
        setIntField(term26455, term26455.getClass(), "peekedNumberLength", 0);
        setField(term26455, term26455.getClass(), "peekedString", null);
        setField(term26455, term26455.getClass(), "stack", null);
        setIntField(term26455, term26455.getClass(), "stackSize", 0);
        setField(term26455, term26455.getClass(), "pathNames", null);
        setField(term26455, term26455.getClass(), "pathIndices", null);
        Class<? extends Object> term26578 = Class.forName((String) "com.google.gson.stream.JsonToken");
        Field term26577 = ((Class) term26578).getDeclaredField((String) "STRING");
        ((Field) term26577).setAccessible(true);
        enum0 = ((Field) term26577).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "peek", argTypes, term25805, args);
        assertTrue(recursiveEquals(term25805, term26455));
        assertTrue(recursiveEquals(retValue, enum0));
    }

};


