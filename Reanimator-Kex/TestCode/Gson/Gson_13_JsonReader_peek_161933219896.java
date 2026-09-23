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

public class JsonReader_peek_161933219896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25811;
     Object term26284;
     Object enum1;

    public JsonReader_peek_161933219896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25811 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term25811, term25811.getClass(), "peeked", 4);
        term26284 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term26284, term26284.getClass(), "in", null);
        setBooleanField(term26284, term26284.getClass(), "lenient", false);
        setField(term26284, term26284.getClass(), "buffer", null);
        setIntField(term26284, term26284.getClass(), "pos", 0);
        setIntField(term26284, term26284.getClass(), "limit", 0);
        setIntField(term26284, term26284.getClass(), "lineNumber", 0);
        setIntField(term26284, term26284.getClass(), "lineStart", 0);
        setIntField(term26284, term26284.getClass(), "peeked", 4);
        setLongField(term26284, term26284.getClass(), "peekedLong", 0L);
        setIntField(term26284, term26284.getClass(), "peekedNumberLength", 0);
        setField(term26284, term26284.getClass(), "peekedString", null);
        setField(term26284, term26284.getClass(), "stack", null);
        setIntField(term26284, term26284.getClass(), "stackSize", 0);
        setField(term26284, term26284.getClass(), "pathNames", null);
        setField(term26284, term26284.getClass(), "pathIndices", null);
        Class<? extends Object> term26286 = Class.forName((String) "com.google.gson.stream.JsonToken");
        Field term26285 = ((Class) term26286).getDeclaredField((String) "END_ARRAY");
        ((Field) term26285).setAccessible(true);
        enum1 = ((Field) term26285).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "peek", argTypes, term25811, args);
        assertTrue(recursiveEquals(term25811, term26284));
        assertTrue(recursiveEquals(retValue, enum1));
    }

};


