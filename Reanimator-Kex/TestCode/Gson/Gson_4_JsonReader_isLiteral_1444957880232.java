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

public class JsonReader_isLiteral_1444957880232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76000;
     Object term76093;

    public JsonReader_isLiteral_1444957880232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76000 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        term76093 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term76093, term76093.getClass(), "in", null);
        setBooleanField(term76093, term76093.getClass(), "lenient", false);
        setField(term76093, term76093.getClass(), "buffer", null);
        setIntField(term76093, term76093.getClass(), "pos", 0);
        setIntField(term76093, term76093.getClass(), "limit", 0);
        setIntField(term76093, term76093.getClass(), "lineNumber", 0);
        setIntField(term76093, term76093.getClass(), "lineStart", 0);
        setIntField(term76093, term76093.getClass(), "peeked", 0);
        setLongField(term76093, term76093.getClass(), "peekedLong", 0L);
        setIntField(term76093, term76093.getClass(), "peekedNumberLength", 0);
        setField(term76093, term76093.getClass(), "peekedString", null);
        setField(term76093, term76093.getClass(), "stack", null);
        setIntField(term76093, term76093.getClass(), "stackSize", 0);
        setField(term76093, term76093.getClass(), "pathNames", null);
        setField(term76093, term76093.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 32;
        Object retValue = callMethod(klass, "isLiteral", argTypes, term76000, args);
        assertTrue(recursiveEquals(term76000, term76093));
        assertTrue(recursiveEquals(retValue, false));
    }

};


