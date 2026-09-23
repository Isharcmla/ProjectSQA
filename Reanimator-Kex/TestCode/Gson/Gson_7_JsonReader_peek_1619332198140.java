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

public class JsonReader_peek_1619332198140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40435;
     Object term41083;
     Object enum2;

    public JsonReader_peek_1619332198140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40435 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term40435, term40435.getClass(), "peeked", 12);
        term41083 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term41083, term41083.getClass(), "in", null);
        setBooleanField(term41083, term41083.getClass(), "lenient", false);
        setField(term41083, term41083.getClass(), "buffer", null);
        setIntField(term41083, term41083.getClass(), "pos", 0);
        setIntField(term41083, term41083.getClass(), "limit", 0);
        setIntField(term41083, term41083.getClass(), "lineNumber", 0);
        setIntField(term41083, term41083.getClass(), "lineStart", 0);
        setIntField(term41083, term41083.getClass(), "peeked", 12);
        setLongField(term41083, term41083.getClass(), "peekedLong", 0L);
        setIntField(term41083, term41083.getClass(), "peekedNumberLength", 0);
        setField(term41083, term41083.getClass(), "peekedString", null);
        setField(term41083, term41083.getClass(), "stack", null);
        setIntField(term41083, term41083.getClass(), "stackSize", 0);
        setField(term41083, term41083.getClass(), "pathNames", null);
        setField(term41083, term41083.getClass(), "pathIndices", null);
        Class<? extends Object> term41085 = Class.forName((String) "com.google.gson.stream.JsonToken");
        Field term41084 = ((Class) term41085).getDeclaredField((String) "NAME");
        ((Field) term41084).setAccessible(true);
        enum2 = ((Field) term41084).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "peek", argTypes, term40435, args);
        assertTrue(recursiveEquals(term40435, term41083));
        assertTrue(recursiveEquals(retValue, enum2));
    }

};


