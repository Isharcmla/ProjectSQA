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

public class JsonTreeReader_locationString_117107013410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172887;
     Object term172978;

    public JsonTreeReader_locationString_117107013410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172887 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term172618 = (Object[]) newArray("java.lang.Object", 4);
        Object term172943 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term172887, term172887.getClass(), "stackSize", 2);
        setElement(term172618, 1, term172943);
        setField(term172887, term172887.getClass(), "stack", term172618);
        term172978 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term172979 = (Object[]) newArray("java.lang.Object", 4);
        Object term172980 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term172980, term172980.getClass(), "elements", null);
        setElement(term172979, 1, term172980);
        setField(term172978, term172978.getClass(), "stack", term172979);
        setIntField(term172978, term172978.getClass(), "stackSize", 0);
        setField(term172978, term172978.getClass(), "pathNames", null);
        setField(term172978, term172978.getClass(), "pathIndices", null);
        setField(term172978, term172978.getClass(), "in", null);
        setBooleanField(term172978, term172978.getClass(), "lenient", false);
        setField(term172978, term172978.getClass(), "buffer", null);
        setIntField(term172978, term172978.getClass(), "pos", 0);
        setIntField(term172978, term172978.getClass(), "limit", 0);
        setIntField(term172978, term172978.getClass(), "lineNumber", 0);
        setIntField(term172978, term172978.getClass(), "lineStart", 0);
        setIntField(term172978, term172978.getClass(), "peeked", 0);
        setLongField(term172978, term172978.getClass(), "peekedLong", 0L);
        setIntField(term172978, term172978.getClass(), "peekedNumberLength", 0);
        setField(term172978, term172978.getClass(), "peekedString", null);
        setField(term172978, term172978.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term172887, args);
        assertTrue(recursiveEquals(term172887, term172978));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


