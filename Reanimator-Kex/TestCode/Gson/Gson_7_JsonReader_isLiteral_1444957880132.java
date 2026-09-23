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

public class JsonReader_isLiteral_1444957880132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38943;
     Object term39580;

    public JsonReader_isLiteral_1444957880132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38943 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        term39580 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term39580, term39580.getClass(), "in", null);
        setBooleanField(term39580, term39580.getClass(), "lenient", false);
        setField(term39580, term39580.getClass(), "buffer", null);
        setIntField(term39580, term39580.getClass(), "pos", 0);
        setIntField(term39580, term39580.getClass(), "limit", 0);
        setIntField(term39580, term39580.getClass(), "lineNumber", 0);
        setIntField(term39580, term39580.getClass(), "lineStart", 0);
        setIntField(term39580, term39580.getClass(), "peeked", 0);
        setLongField(term39580, term39580.getClass(), "peekedLong", 0L);
        setIntField(term39580, term39580.getClass(), "peekedNumberLength", 0);
        setField(term39580, term39580.getClass(), "peekedString", null);
        setField(term39580, term39580.getClass(), "stack", null);
        setIntField(term39580, term39580.getClass(), "stackSize", 0);
        setField(term39580, term39580.getClass(), "pathNames", null);
        setField(term39580, term39580.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 32;
        Object retValue = callMethod(klass, "isLiteral", argTypes, term38943, args);
        assertTrue(recursiveEquals(term38943, term39580));
        assertTrue(recursiveEquals(retValue, false));
    }

};


