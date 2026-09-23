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

public class JsonReader_peek_1619332198109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30118;
     Object term30858;
     Object enum1;

    public JsonReader_peek_1619332198109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30118 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term30118, term30118.getClass(), "peeked", 2);
        term30858 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term30858, term30858.getClass(), "in", null);
        setBooleanField(term30858, term30858.getClass(), "lenient", false);
        setField(term30858, term30858.getClass(), "buffer", null);
        setIntField(term30858, term30858.getClass(), "pos", 0);
        setIntField(term30858, term30858.getClass(), "limit", 0);
        setIntField(term30858, term30858.getClass(), "lineNumber", 0);
        setIntField(term30858, term30858.getClass(), "lineStart", 0);
        setIntField(term30858, term30858.getClass(), "peeked", 2);
        setLongField(term30858, term30858.getClass(), "peekedLong", 0L);
        setIntField(term30858, term30858.getClass(), "peekedNumberLength", 0);
        setField(term30858, term30858.getClass(), "peekedString", null);
        setField(term30858, term30858.getClass(), "stack", null);
        setIntField(term30858, term30858.getClass(), "stackSize", 0);
        setField(term30858, term30858.getClass(), "pathNames", null);
        setField(term30858, term30858.getClass(), "pathIndices", null);
        Class<? extends Object> term30860 = Class.forName((String) "com.google.gson.stream.JsonToken");
        Field term30859 = ((Class) term30860).getDeclaredField((String) "END_OBJECT");
        ((Field) term30859).setAccessible(true);
        enum1 = ((Field) term30859).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "peek", argTypes, term30118, args);
        assertTrue(recursiveEquals(term30118, term30858));
        assertTrue(recursiveEquals(retValue, enum1));
    }

};


