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

public class JsonReader_isLiteral_1444957880340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119478;
     Object term119597;

    public JsonReader_isLiteral_1444957880340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119478 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setBooleanField(term119478, term119478.getClass(), "lenient", true);
        term119597 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term119597, term119597.getClass(), "in", null);
        setBooleanField(term119597, term119597.getClass(), "lenient", true);
        setField(term119597, term119597.getClass(), "buffer", null);
        setIntField(term119597, term119597.getClass(), "pos", 0);
        setIntField(term119597, term119597.getClass(), "limit", 0);
        setIntField(term119597, term119597.getClass(), "lineNumber", 0);
        setIntField(term119597, term119597.getClass(), "lineStart", 0);
        setIntField(term119597, term119597.getClass(), "peeked", 0);
        setLongField(term119597, term119597.getClass(), "peekedLong", 0L);
        setIntField(term119597, term119597.getClass(), "peekedNumberLength", 0);
        setField(term119597, term119597.getClass(), "peekedString", null);
        setField(term119597, term119597.getClass(), "stack", null);
        setIntField(term119597, term119597.getClass(), "stackSize", 0);
        setField(term119597, term119597.getClass(), "pathNames", null);
        setField(term119597, term119597.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 59;
        Object retValue = callMethod(klass, "isLiteral", argTypes, term119478, args);
        assertTrue(recursiveEquals(term119478, term119597));
        assertTrue(recursiveEquals(retValue, false));
    }

};


