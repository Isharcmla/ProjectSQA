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

public class JsonTreeReader_locationString_117107013328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123560;
     Object term123774;

    public JsonTreeReader_locationString_117107013328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123560 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term123270 = (Object[]) newArray("java.lang.Object", 10);
        Object term123618 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term123674 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term123730 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term123560, term123560.getClass(), "stackSize", 6);
        setElement(term123270, 0, term123618);
        setElement(term123270, 2, term123674);
        setElement(term123270, 5, term123730);
        setField(term123560, term123560.getClass(), "stack", term123270);
        term123774 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term123775 = (Object[]) newArray("java.lang.Object", 10);
        Object term123776 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term123777 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term123778 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term123776, term123776.getClass(), "members", null);
        setElement(term123775, 0, term123776);
        setField(term123777, term123777.getClass(), "elements", null);
        setElement(term123775, 2, term123777);
        setField(term123778, term123778.getClass(), "elements", null);
        setElement(term123775, 5, term123778);
        setField(term123774, term123774.getClass(), "stack", term123775);
        setIntField(term123774, term123774.getClass(), "stackSize", 0);
        setField(term123774, term123774.getClass(), "pathNames", null);
        setField(term123774, term123774.getClass(), "pathIndices", null);
        setField(term123774, term123774.getClass(), "in", null);
        setBooleanField(term123774, term123774.getClass(), "lenient", false);
        setField(term123774, term123774.getClass(), "buffer", null);
        setIntField(term123774, term123774.getClass(), "pos", 0);
        setIntField(term123774, term123774.getClass(), "limit", 0);
        setIntField(term123774, term123774.getClass(), "lineNumber", 0);
        setIntField(term123774, term123774.getClass(), "lineStart", 0);
        setIntField(term123774, term123774.getClass(), "peeked", 0);
        setLongField(term123774, term123774.getClass(), "peekedLong", 0L);
        setIntField(term123774, term123774.getClass(), "peekedNumberLength", 0);
        setField(term123774, term123774.getClass(), "peekedString", null);
        setField(term123774, term123774.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term123560, args);
        assertTrue(recursiveEquals(term123560, term123774));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


