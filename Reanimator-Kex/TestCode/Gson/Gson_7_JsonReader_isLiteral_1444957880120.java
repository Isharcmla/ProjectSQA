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

public class JsonReader_isLiteral_1444957880120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34035;
     Object term34666;

    public JsonReader_isLiteral_1444957880120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34035 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        term34666 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term34666, term34666.getClass(), "in", null);
        setBooleanField(term34666, term34666.getClass(), "lenient", false);
        setField(term34666, term34666.getClass(), "buffer", null);
        setIntField(term34666, term34666.getClass(), "pos", 0);
        setIntField(term34666, term34666.getClass(), "limit", 0);
        setIntField(term34666, term34666.getClass(), "lineNumber", 0);
        setIntField(term34666, term34666.getClass(), "lineStart", 0);
        setIntField(term34666, term34666.getClass(), "peeked", 0);
        setLongField(term34666, term34666.getClass(), "peekedLong", 0L);
        setIntField(term34666, term34666.getClass(), "peekedNumberLength", 0);
        setField(term34666, term34666.getClass(), "peekedString", null);
        setField(term34666, term34666.getClass(), "stack", null);
        setIntField(term34666, term34666.getClass(), "stackSize", 0);
        setField(term34666, term34666.getClass(), "pathNames", null);
        setField(term34666, term34666.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 13;
        Object retValue = callMethod(klass, "isLiteral", argTypes, term34035, args);
        assertTrue(recursiveEquals(term34035, term34666));
        assertTrue(recursiveEquals(retValue, false));
    }

};


