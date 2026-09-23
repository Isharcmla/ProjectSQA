package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.bind.EqualityUtils.*;
import java.lang.Object;

public class JsonTreeReader_getPath_1170023302412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173391;
     Object term173539;

    public JsonTreeReader_getPath_1170023302412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173391 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term173101 = (Object[]) newArray("java.lang.Object", 15);
        Object term173449 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term173507 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term173391, term173391.getClass(), "stackSize", 6);
        setElement(term173101, 0, term173449);
        setElement(term173101, 2, term173507);
        setField(term173391, term173391.getClass(), "stack", term173101);
        term173539 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term173540 = (Object[]) newArray("java.lang.Object", 15);
        Object term173541 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term173542 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setField(term173541, term173541.getClass(), "members", null);
        setElement(term173540, 0, term173541);
        setField(term173542, term173542.getClass(), "members", null);
        setElement(term173540, 2, term173542);
        setField(term173539, term173539.getClass(), "stack", term173540);
        setIntField(term173539, term173539.getClass(), "stackSize", 0);
        setField(term173539, term173539.getClass(), "pathNames", null);
        setField(term173539, term173539.getClass(), "pathIndices", null);
        setField(term173539, term173539.getClass(), "in", null);
        setBooleanField(term173539, term173539.getClass(), "lenient", false);
        setField(term173539, term173539.getClass(), "buffer", null);
        setIntField(term173539, term173539.getClass(), "pos", 0);
        setIntField(term173539, term173539.getClass(), "limit", 0);
        setIntField(term173539, term173539.getClass(), "lineNumber", 0);
        setIntField(term173539, term173539.getClass(), "lineStart", 0);
        setIntField(term173539, term173539.getClass(), "peeked", 0);
        setLongField(term173539, term173539.getClass(), "peekedLong", 0L);
        setIntField(term173539, term173539.getClass(), "peekedNumberLength", 0);
        setField(term173539, term173539.getClass(), "peekedString", null);
        setField(term173539, term173539.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term173391, args);
        assertTrue(recursiveEquals(term173391, term173539));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


