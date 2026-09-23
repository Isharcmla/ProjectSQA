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

public class JsonTreeReader_getPath_1170023302386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160562;
     Object term160921;

    public JsonTreeReader_getPath_1170023302386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160562 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term160194 = (Object[]) newArray("java.lang.Object", 107);
        Object term160620 = newInstance(Class.forName("com.google.gson.JsonObject"));
        char[] term160087 = (char[]) newCharArray(105);
        Object term160676 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term160562, term160562.getClass(), "stackSize", 7);
        setElement(term160194, 0, term160620);
        setElement(term160194, 1, term160087);
        setElement(term160194, 2, term160676);
        setField(term160562, term160562.getClass(), "stack", term160194);
        term160921 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term160922 = (Object[]) newArray("java.lang.Object", 107);
        Object term160923 = newInstance(Class.forName("com.google.gson.JsonObject"));
        char[] term160924 = (char[]) newCharArray(105);
        Object term160925 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term160923, term160923.getClass(), "members", null);
        setElement(term160922, 0, term160923);
        setElement(term160922, 1, term160924);
        setField(term160925, term160925.getClass(), "elements", null);
        setElement(term160922, 2, term160925);
        setField(term160921, term160921.getClass(), "stack", term160922);
        setIntField(term160921, term160921.getClass(), "stackSize", 0);
        setField(term160921, term160921.getClass(), "pathNames", null);
        setField(term160921, term160921.getClass(), "pathIndices", null);
        setField(term160921, term160921.getClass(), "in", null);
        setBooleanField(term160921, term160921.getClass(), "lenient", false);
        setField(term160921, term160921.getClass(), "buffer", null);
        setIntField(term160921, term160921.getClass(), "pos", 0);
        setIntField(term160921, term160921.getClass(), "limit", 0);
        setIntField(term160921, term160921.getClass(), "lineNumber", 0);
        setIntField(term160921, term160921.getClass(), "lineStart", 0);
        setIntField(term160921, term160921.getClass(), "peeked", 0);
        setLongField(term160921, term160921.getClass(), "peekedLong", 0L);
        setIntField(term160921, term160921.getClass(), "peekedNumberLength", 0);
        setField(term160921, term160921.getClass(), "peekedString", null);
        setField(term160921, term160921.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term160562, args);
        assertTrue(recursiveEquals(term160562, term160921));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


