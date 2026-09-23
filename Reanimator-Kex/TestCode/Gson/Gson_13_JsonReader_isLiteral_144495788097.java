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

public class JsonReader_isLiteral_144495788097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26257;
     Object term26493;

    public JsonReader_isLiteral_144495788097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26257 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        term26493 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term26493, term26493.getClass(), "in", null);
        setBooleanField(term26493, term26493.getClass(), "lenient", false);
        setField(term26493, term26493.getClass(), "buffer", null);
        setIntField(term26493, term26493.getClass(), "pos", 0);
        setIntField(term26493, term26493.getClass(), "limit", 0);
        setIntField(term26493, term26493.getClass(), "lineNumber", 0);
        setIntField(term26493, term26493.getClass(), "lineStart", 0);
        setIntField(term26493, term26493.getClass(), "peeked", 0);
        setLongField(term26493, term26493.getClass(), "peekedLong", 0L);
        setIntField(term26493, term26493.getClass(), "peekedNumberLength", 0);
        setField(term26493, term26493.getClass(), "peekedString", null);
        setField(term26493, term26493.getClass(), "stack", null);
        setIntField(term26493, term26493.getClass(), "stackSize", 0);
        setField(term26493, term26493.getClass(), "pathNames", null);
        setField(term26493, term26493.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 125;
        Object retValue = callMethod(klass, "isLiteral", argTypes, term26257, args);
        assertTrue(recursiveEquals(term26257, term26493));
        assertTrue(recursiveEquals(retValue, false));
    }

};


