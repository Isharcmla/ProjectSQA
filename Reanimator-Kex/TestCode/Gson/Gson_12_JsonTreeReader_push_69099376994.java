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

public class JsonTreeReader_push_69099376994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19458;
     Object term19491;

    public JsonTreeReader_push_69099376994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19458 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term19356 = (Object[]) newArray("java.lang.Object", 489);
        setIntField(term19458, term19458.getClass(), "stackSize", 0);
        setField(term19458, term19458.getClass(), "stack", term19356);
        term19491 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term19492 = (Object[]) newArray("java.lang.Object", 489);
        setField(term19491, term19491.getClass(), "stack", term19492);
        setIntField(term19491, term19491.getClass(), "stackSize", 0);
        setField(term19491, term19491.getClass(), "pathNames", null);
        setField(term19491, term19491.getClass(), "pathIndices", null);
        setField(term19491, term19491.getClass(), "in", null);
        setBooleanField(term19491, term19491.getClass(), "lenient", false);
        setField(term19491, term19491.getClass(), "buffer", null);
        setIntField(term19491, term19491.getClass(), "pos", 0);
        setIntField(term19491, term19491.getClass(), "limit", 0);
        setIntField(term19491, term19491.getClass(), "lineNumber", 0);
        setIntField(term19491, term19491.getClass(), "lineStart", 0);
        setIntField(term19491, term19491.getClass(), "peeked", 0);
        setLongField(term19491, term19491.getClass(), "peekedLong", 0L);
        setIntField(term19491, term19491.getClass(), "peekedNumberLength", 0);
        setField(term19491, term19491.getClass(), "peekedString", null);
        setField(term19491, term19491.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "push", argTypes, term19458, args);
        assertTrue(recursiveEquals(term19458, term19491));
    }

};


