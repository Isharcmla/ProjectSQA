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

public class JsonReader_peek_1619332198126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37817;
     Object term38832;
     Object enum1;

    public JsonReader_peek_1619332198126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37817 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term37817, term37817.getClass(), "peeked", 5);
        term38832 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term38832, term38832.getClass(), "in", null);
        setBooleanField(term38832, term38832.getClass(), "lenient", false);
        setField(term38832, term38832.getClass(), "buffer", null);
        setIntField(term38832, term38832.getClass(), "pos", 0);
        setIntField(term38832, term38832.getClass(), "limit", 0);
        setIntField(term38832, term38832.getClass(), "lineNumber", 0);
        setIntField(term38832, term38832.getClass(), "lineStart", 0);
        setIntField(term38832, term38832.getClass(), "peeked", 5);
        setLongField(term38832, term38832.getClass(), "peekedLong", 0L);
        setIntField(term38832, term38832.getClass(), "peekedNumberLength", 0);
        setField(term38832, term38832.getClass(), "peekedString", null);
        setField(term38832, term38832.getClass(), "stack", null);
        setIntField(term38832, term38832.getClass(), "stackSize", 0);
        setField(term38832, term38832.getClass(), "pathNames", null);
        setField(term38832, term38832.getClass(), "pathIndices", null);
        Class<? extends Object> term38834 = Class.forName((String) "com.google.gson.stream.JsonToken");
        Field term38833 = ((Class) term38834).getDeclaredField((String) "BOOLEAN");
        ((Field) term38833).setAccessible(true);
        enum1 = ((Field) term38833).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "peek", argTypes, term37817, args);
        assertTrue(recursiveEquals(term37817, term38832));
        assertTrue(recursiveEquals(retValue, enum1));
    }

};


