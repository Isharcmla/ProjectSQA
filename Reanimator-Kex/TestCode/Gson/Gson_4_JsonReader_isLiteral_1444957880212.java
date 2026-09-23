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

public class JsonReader_isLiteral_1444957880212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69126;
     Object term69763;

    public JsonReader_isLiteral_1444957880212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69126 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        term69763 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term69763, term69763.getClass(), "in", null);
        setBooleanField(term69763, term69763.getClass(), "lenient", false);
        setField(term69763, term69763.getClass(), "buffer", null);
        setIntField(term69763, term69763.getClass(), "pos", 0);
        setIntField(term69763, term69763.getClass(), "limit", 0);
        setIntField(term69763, term69763.getClass(), "lineNumber", 0);
        setIntField(term69763, term69763.getClass(), "lineStart", 0);
        setIntField(term69763, term69763.getClass(), "peeked", 0);
        setLongField(term69763, term69763.getClass(), "peekedLong", 0L);
        setIntField(term69763, term69763.getClass(), "peekedNumberLength", 0);
        setField(term69763, term69763.getClass(), "peekedString", null);
        setField(term69763, term69763.getClass(), "stack", null);
        setIntField(term69763, term69763.getClass(), "stackSize", 0);
        setField(term69763, term69763.getClass(), "pathNames", null);
        setField(term69763, term69763.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 9;
        Object retValue = callMethod(klass, "isLiteral", argTypes, term69126, args);
        assertTrue(recursiveEquals(term69126, term69763));
        assertTrue(recursiveEquals(retValue, false));
    }

};


