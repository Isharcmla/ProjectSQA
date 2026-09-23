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

public class JsonReader_isLiteral_1444957880233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76080;
     Object term76107;

    public JsonReader_isLiteral_1444957880233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76080 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        term76107 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term76107, term76107.getClass(), "in", null);
        setBooleanField(term76107, term76107.getClass(), "lenient", false);
        setField(term76107, term76107.getClass(), "buffer", null);
        setIntField(term76107, term76107.getClass(), "pos", 0);
        setIntField(term76107, term76107.getClass(), "limit", 0);
        setIntField(term76107, term76107.getClass(), "lineNumber", 0);
        setIntField(term76107, term76107.getClass(), "lineStart", 0);
        setIntField(term76107, term76107.getClass(), "peeked", 0);
        setLongField(term76107, term76107.getClass(), "peekedLong", 0L);
        setIntField(term76107, term76107.getClass(), "peekedNumberLength", 0);
        setField(term76107, term76107.getClass(), "peekedString", null);
        setField(term76107, term76107.getClass(), "stack", null);
        setIntField(term76107, term76107.getClass(), "stackSize", 0);
        setField(term76107, term76107.getClass(), "pathNames", null);
        setField(term76107, term76107.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 13;
        Object retValue = callMethod(klass, "isLiteral", argTypes, term76080, args);
        assertTrue(recursiveEquals(term76080, term76107));
        assertTrue(recursiveEquals(retValue, false));
    }

};


