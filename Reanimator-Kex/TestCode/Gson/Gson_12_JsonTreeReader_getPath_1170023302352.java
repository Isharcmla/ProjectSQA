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

public class JsonTreeReader_getPath_1170023302352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139557;
     Object term139807;

    public JsonTreeReader_getPath_1170023302352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139557 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term139256 = (Object[]) newArray("java.lang.Object", 491);
        Object term139615 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term139673 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term139731 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term139769 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term139557, term139557.getClass(), "stackSize", 7);
        setElement(term139256, 0, term139615);
        setElement(term139256, 3, term139673);
        setElement(term139256, 6, term139731);
        setElement(term139256, 256, term139769);
        setField(term139557, term139557.getClass(), "stack", term139256);
        term139807 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term139808 = (Object[]) newArray("java.lang.Object", 491);
        Object term139809 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term139810 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term139811 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term139812 = newInstance(Class.forName("java.lang.Object"));
        setField(term139809, term139809.getClass(), "members", null);
        setElement(term139808, 0, term139809);
        setField(term139810, term139810.getClass(), "members", null);
        setElement(term139808, 3, term139810);
        setField(term139811, term139811.getClass(), "members", null);
        setElement(term139808, 6, term139811);
        setElement(term139808, 256, term139812);
        setField(term139807, term139807.getClass(), "stack", term139808);
        setIntField(term139807, term139807.getClass(), "stackSize", 0);
        setField(term139807, term139807.getClass(), "pathNames", null);
        setField(term139807, term139807.getClass(), "pathIndices", null);
        setField(term139807, term139807.getClass(), "in", null);
        setBooleanField(term139807, term139807.getClass(), "lenient", false);
        setField(term139807, term139807.getClass(), "buffer", null);
        setIntField(term139807, term139807.getClass(), "pos", 0);
        setIntField(term139807, term139807.getClass(), "limit", 0);
        setIntField(term139807, term139807.getClass(), "lineNumber", 0);
        setIntField(term139807, term139807.getClass(), "lineStart", 0);
        setIntField(term139807, term139807.getClass(), "peeked", 0);
        setLongField(term139807, term139807.getClass(), "peekedLong", 0L);
        setIntField(term139807, term139807.getClass(), "peekedNumberLength", 0);
        setField(term139807, term139807.getClass(), "peekedString", null);
        setField(term139807, term139807.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term139557, args);
        assertTrue(recursiveEquals(term139557, term139807));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


