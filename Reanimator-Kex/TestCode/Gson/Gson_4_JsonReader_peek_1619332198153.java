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

public class JsonReader_peek_1619332198153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45902;
     Object term46456;
     Object enum4;

    public JsonReader_peek_1619332198153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45902 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term45902, term45902.getClass(), "peeked", 8);
        term46456 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term46456, term46456.getClass(), "in", null);
        setBooleanField(term46456, term46456.getClass(), "lenient", false);
        setField(term46456, term46456.getClass(), "buffer", null);
        setIntField(term46456, term46456.getClass(), "pos", 0);
        setIntField(term46456, term46456.getClass(), "limit", 0);
        setIntField(term46456, term46456.getClass(), "lineNumber", 0);
        setIntField(term46456, term46456.getClass(), "lineStart", 0);
        setIntField(term46456, term46456.getClass(), "peeked", 8);
        setLongField(term46456, term46456.getClass(), "peekedLong", 0L);
        setIntField(term46456, term46456.getClass(), "peekedNumberLength", 0);
        setField(term46456, term46456.getClass(), "peekedString", null);
        setField(term46456, term46456.getClass(), "stack", null);
        setIntField(term46456, term46456.getClass(), "stackSize", 0);
        setField(term46456, term46456.getClass(), "pathNames", null);
        setField(term46456, term46456.getClass(), "pathIndices", null);
        Class<? extends Object> term46458 = Class.forName((String) "com.google.gson.stream.JsonToken");
        Field term46457 = ((Class) term46458).getDeclaredField((String) "STRING");
        ((Field) term46457).setAccessible(true);
        enum4 = ((Field) term46457).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "peek", argTypes, term45902, args);
        assertTrue(recursiveEquals(term45902, term46456));
        assertTrue(recursiveEquals(retValue, enum4));
    }

};


