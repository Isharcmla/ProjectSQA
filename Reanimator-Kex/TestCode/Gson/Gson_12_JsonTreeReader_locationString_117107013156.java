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

public class JsonTreeReader_locationString_117107013156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36688;
     Object term37356;

    public JsonTreeReader_locationString_117107013156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36688 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term36558 = (Object[]) newArray("java.lang.Object", 1);
        Object term36726 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term36688, term36688.getClass(), "stackSize", 1);
        setElement(term36558, 0, term36726);
        setField(term36688, term36688.getClass(), "stack", term36558);
        term37356 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term37357 = (Object[]) newArray("java.lang.Object", 1);
        Object term37358 = newInstance(Class.forName("java.lang.Object"));
        setElement(term37357, 0, term37358);
        setField(term37356, term37356.getClass(), "stack", term37357);
        setIntField(term37356, term37356.getClass(), "stackSize", 0);
        setField(term37356, term37356.getClass(), "pathNames", null);
        setField(term37356, term37356.getClass(), "pathIndices", null);
        setField(term37356, term37356.getClass(), "in", null);
        setBooleanField(term37356, term37356.getClass(), "lenient", false);
        setField(term37356, term37356.getClass(), "buffer", null);
        setIntField(term37356, term37356.getClass(), "pos", 0);
        setIntField(term37356, term37356.getClass(), "limit", 0);
        setIntField(term37356, term37356.getClass(), "lineNumber", 0);
        setIntField(term37356, term37356.getClass(), "lineStart", 0);
        setIntField(term37356, term37356.getClass(), "peeked", 0);
        setLongField(term37356, term37356.getClass(), "peekedLong", 0L);
        setIntField(term37356, term37356.getClass(), "peekedNumberLength", 0);
        setField(term37356, term37356.getClass(), "peekedString", null);
        setField(term37356, term37356.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term36688, args);
        assertTrue(recursiveEquals(term36688, term37356));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


