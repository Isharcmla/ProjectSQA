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

public class JsonReader_peek_1619332198120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35504;
     Object term36438;
     Object enum0;

    public JsonReader_peek_1619332198120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35504 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term35504, term35504.getClass(), "peeked", 13);
        term36438 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term36438, term36438.getClass(), "in", null);
        setBooleanField(term36438, term36438.getClass(), "lenient", false);
        setField(term36438, term36438.getClass(), "buffer", null);
        setIntField(term36438, term36438.getClass(), "pos", 0);
        setIntField(term36438, term36438.getClass(), "limit", 0);
        setIntField(term36438, term36438.getClass(), "lineNumber", 0);
        setIntField(term36438, term36438.getClass(), "lineStart", 0);
        setIntField(term36438, term36438.getClass(), "peeked", 13);
        setLongField(term36438, term36438.getClass(), "peekedLong", 0L);
        setIntField(term36438, term36438.getClass(), "peekedNumberLength", 0);
        setField(term36438, term36438.getClass(), "peekedString", null);
        setField(term36438, term36438.getClass(), "stack", null);
        setIntField(term36438, term36438.getClass(), "stackSize", 0);
        setField(term36438, term36438.getClass(), "pathNames", null);
        setField(term36438, term36438.getClass(), "pathIndices", null);
        Class<? extends Object> term36563 = Class.forName((String) "com.google.gson.stream.JsonToken");
        Field term36562 = ((Class) term36563).getDeclaredField((String) "NAME");
        ((Field) term36562).setAccessible(true);
        enum0 = ((Field) term36562).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "peek", argTypes, term35504, args);
        assertTrue(recursiveEquals(term35504, term36438));
        assertTrue(recursiveEquals(retValue, enum0));
    }

};


