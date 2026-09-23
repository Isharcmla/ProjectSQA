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

public class JsonReader_peek_1619332198150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43747;
     Object term44548;
     Object enum3;

    public JsonReader_peek_1619332198150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43747 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term43747, term43747.getClass(), "peeked", 13);
        term44548 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term44548, term44548.getClass(), "in", null);
        setBooleanField(term44548, term44548.getClass(), "lenient", false);
        setField(term44548, term44548.getClass(), "buffer", null);
        setIntField(term44548, term44548.getClass(), "pos", 0);
        setIntField(term44548, term44548.getClass(), "limit", 0);
        setIntField(term44548, term44548.getClass(), "lineNumber", 0);
        setIntField(term44548, term44548.getClass(), "lineStart", 0);
        setIntField(term44548, term44548.getClass(), "peeked", 13);
        setLongField(term44548, term44548.getClass(), "peekedLong", 0L);
        setIntField(term44548, term44548.getClass(), "peekedNumberLength", 0);
        setField(term44548, term44548.getClass(), "peekedString", null);
        setField(term44548, term44548.getClass(), "stack", null);
        setIntField(term44548, term44548.getClass(), "stackSize", 0);
        setField(term44548, term44548.getClass(), "pathNames", null);
        setField(term44548, term44548.getClass(), "pathIndices", null);
        Class<? extends Object> term44550 = Class.forName((String) "com.google.gson.stream.JsonToken");
        Field term44549 = ((Class) term44550).getDeclaredField((String) "NAME");
        ((Field) term44549).setAccessible(true);
        enum3 = ((Field) term44549).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "peek", argTypes, term43747, args);
        assertTrue(recursiveEquals(term43747, term44548));
        assertTrue(recursiveEquals(retValue, enum3));
    }

};


