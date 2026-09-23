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

public class JsonReader_peek_1619332198106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32022;
     Object term32877;
     Object enum2;

    public JsonReader_peek_1619332198106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32022 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term32022, term32022.getClass(), "peeked", 10);
        term32877 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term32877, term32877.getClass(), "in", null);
        setBooleanField(term32877, term32877.getClass(), "lenient", false);
        setField(term32877, term32877.getClass(), "buffer", null);
        setIntField(term32877, term32877.getClass(), "pos", 0);
        setIntField(term32877, term32877.getClass(), "limit", 0);
        setIntField(term32877, term32877.getClass(), "lineNumber", 0);
        setIntField(term32877, term32877.getClass(), "lineStart", 0);
        setIntField(term32877, term32877.getClass(), "peeked", 10);
        setLongField(term32877, term32877.getClass(), "peekedLong", 0L);
        setIntField(term32877, term32877.getClass(), "peekedNumberLength", 0);
        setField(term32877, term32877.getClass(), "peekedString", null);
        setField(term32877, term32877.getClass(), "stack", null);
        setIntField(term32877, term32877.getClass(), "stackSize", 0);
        setField(term32877, term32877.getClass(), "pathNames", null);
        setField(term32877, term32877.getClass(), "pathIndices", null);
        Class<? extends Object> term32879 = Class.forName((String) "com.google.gson.stream.JsonToken");
        Field term32878 = ((Class) term32879).getDeclaredField((String) "STRING");
        ((Field) term32878).setAccessible(true);
        enum2 = ((Field) term32878).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "peek", argTypes, term32022, args);
        assertTrue(recursiveEquals(term32022, term32877));
        assertTrue(recursiveEquals(retValue, enum2));
    }

};


