package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.bind.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class JsonTreeReader_expect_1713317781101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20754;
     Object enum3;
     Object term21399;
     Object enum4;

    public JsonTreeReader_expect_1713317781101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20754 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setIntField(term20754, term20754.getClass(), "stackSize", 0);
        Class<? extends Object> term21404 = Class.forName((String) "com.google.gson.stream.JsonToken");
        Field term21403 = ((Class) term21404).getDeclaredField((String) "END_DOCUMENT");
        ((Field) term21403).setAccessible(true);
        enum3 = ((Field) term21403).get((Object) null);
        term21399 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term21399, term21399.getClass(), "stack", null);
        setIntField(term21399, term21399.getClass(), "stackSize", 0);
        setField(term21399, term21399.getClass(), "pathNames", null);
        setField(term21399, term21399.getClass(), "pathIndices", null);
        setField(term21399, term21399.getClass(), "in", null);
        setBooleanField(term21399, term21399.getClass(), "lenient", false);
        setField(term21399, term21399.getClass(), "buffer", null);
        setIntField(term21399, term21399.getClass(), "pos", 0);
        setIntField(term21399, term21399.getClass(), "limit", 0);
        setIntField(term21399, term21399.getClass(), "lineNumber", 0);
        setIntField(term21399, term21399.getClass(), "lineStart", 0);
        setIntField(term21399, term21399.getClass(), "peeked", 0);
        setLongField(term21399, term21399.getClass(), "peekedLong", 0L);
        setIntField(term21399, term21399.getClass(), "peekedNumberLength", 0);
        setField(term21399, term21399.getClass(), "peekedString", null);
        setField(term21399, term21399.getClass(), "stack", null);
        Class<? extends Object> term21607 = Class.forName((String) "com.google.gson.stream.JsonToken");
        Field term21606 = ((Class) term21607).getDeclaredField((String) "END_DOCUMENT");
        ((Field) term21606).setAccessible(true);
        enum4 = ((Field) term21606).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonToken");
        Object[] args = new Object[1];
        args[0] = enum3;
        callMethod(klass, "expect", argTypes, term20754, args);
        assertTrue(recursiveEquals(term20754, term21399));
        assertTrue(recursiveEquals(enum3, enum4));
    }

};


