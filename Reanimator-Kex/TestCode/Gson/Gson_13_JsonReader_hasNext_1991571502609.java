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

public class JsonReader_hasNext_1991571502609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1217962;
     Object term1217993;

    public JsonReader_hasNext_1991571502609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1217962 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setIntField(term1217962, term1217962.getClass(), "peeked", 0);
        term1217993 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term1217993, term1217993.getClass(), "stack", null);
        setIntField(term1217993, term1217993.getClass(), "stackSize", 0);
        setField(term1217993, term1217993.getClass(), "pathNames", null);
        setField(term1217993, term1217993.getClass(), "pathIndices", null);
        setField(term1217993, term1217993.getClass(), "in", null);
        setBooleanField(term1217993, term1217993.getClass(), "lenient", false);
        setField(term1217993, term1217993.getClass(), "buffer", null);
        setIntField(term1217993, term1217993.getClass(), "pos", 0);
        setIntField(term1217993, term1217993.getClass(), "limit", 0);
        setIntField(term1217993, term1217993.getClass(), "lineNumber", 0);
        setIntField(term1217993, term1217993.getClass(), "lineStart", 0);
        setIntField(term1217993, term1217993.getClass(), "peeked", 0);
        setLongField(term1217993, term1217993.getClass(), "peekedLong", 0L);
        setIntField(term1217993, term1217993.getClass(), "peekedNumberLength", 0);
        setField(term1217993, term1217993.getClass(), "peekedString", null);
        setField(term1217993, term1217993.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term1217962, args);
        assertTrue(recursiveEquals(term1217962, term1217993));
    }

};


