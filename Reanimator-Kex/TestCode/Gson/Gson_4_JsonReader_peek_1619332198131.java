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

public class JsonReader_peek_1619332198131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40103;
     Object term40466;
     Object enum2;

    public JsonReader_peek_1619332198131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40103 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term40103, term40103.getClass(), "peeked", 10);
        term40466 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term40466, term40466.getClass(), "in", null);
        setBooleanField(term40466, term40466.getClass(), "lenient", false);
        setField(term40466, term40466.getClass(), "buffer", null);
        setIntField(term40466, term40466.getClass(), "pos", 0);
        setIntField(term40466, term40466.getClass(), "limit", 0);
        setIntField(term40466, term40466.getClass(), "lineNumber", 0);
        setIntField(term40466, term40466.getClass(), "lineStart", 0);
        setIntField(term40466, term40466.getClass(), "peeked", 10);
        setLongField(term40466, term40466.getClass(), "peekedLong", 0L);
        setIntField(term40466, term40466.getClass(), "peekedNumberLength", 0);
        setField(term40466, term40466.getClass(), "peekedString", null);
        setField(term40466, term40466.getClass(), "stack", null);
        setIntField(term40466, term40466.getClass(), "stackSize", 0);
        setField(term40466, term40466.getClass(), "pathNames", null);
        setField(term40466, term40466.getClass(), "pathIndices", null);
        Class<? extends Object> term40468 = Class.forName((String) "com.google.gson.stream.JsonToken");
        Field term40467 = ((Class) term40468).getDeclaredField((String) "STRING");
        ((Field) term40467).setAccessible(true);
        enum2 = ((Field) term40467).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "peek", argTypes, term40103, args);
        assertTrue(recursiveEquals(term40103, term40466));
        assertTrue(recursiveEquals(retValue, enum2));
    }

};


