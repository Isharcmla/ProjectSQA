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
     Object term42322;
     Object term43131;
     Object enum3;

    public JsonReader_peek_1619332198140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42322 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term42322, term42322.getClass(), "peeked", 11);
        term43131 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term43131, term43131.getClass(), "in", null);
        setBooleanField(term43131, term43131.getClass(), "lenient", false);
        setField(term43131, term43131.getClass(), "buffer", null);
        setIntField(term43131, term43131.getClass(), "pos", 0);
        setIntField(term43131, term43131.getClass(), "limit", 0);
        setIntField(term43131, term43131.getClass(), "lineNumber", 0);
        setIntField(term43131, term43131.getClass(), "lineStart", 0);
        setIntField(term43131, term43131.getClass(), "peeked", 11);
        setLongField(term43131, term43131.getClass(), "peekedLong", 0L);
        setIntField(term43131, term43131.getClass(), "peekedNumberLength", 0);
        setField(term43131, term43131.getClass(), "peekedString", null);
        setField(term43131, term43131.getClass(), "stack", null);
        setIntField(term43131, term43131.getClass(), "stackSize", 0);
        setField(term43131, term43131.getClass(), "pathNames", null);
        setField(term43131, term43131.getClass(), "pathIndices", null);
        Class<? extends Object> term43133 = Class.forName((String) "com.google.gson.stream.JsonToken");
        Field term43132 = ((Class) term43133).getDeclaredField((String) "STRING");
        ((Field) term43132).setAccessible(true);
        enum3 = ((Field) term43132).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "peek", argTypes, term42322, args);
        assertTrue(recursiveEquals(term42322, term43131));
        assertTrue(recursiveEquals(retValue, enum3));
    }

};


