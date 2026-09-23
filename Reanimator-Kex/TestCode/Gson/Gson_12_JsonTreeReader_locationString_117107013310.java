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

public class JsonTreeReader_locationString_117107013310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113800;
     Object term114069;

    public JsonTreeReader_locationString_117107013310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113800 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term113503 = (Object[]) newArray("java.lang.Object", 16);
        Object term113858 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term113952 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term114010 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term113800, term113800.getClass(), "stackSize", 11);
        setElement(term113503, 0, term113858);
        setElement(term113503, 1, "");
        setElement(term113503, 2, term113952);
        setElement(term113503, 5, term114010);
        setField(term113800, term113800.getClass(), "stack", term113503);
        term114069 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term114070 = (Object[]) newArray("java.lang.Object", 16);
        Object term114071 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term114074 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term114075 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setField(term114071, term114071.getClass(), "members", null);
        setElement(term114070, 0, term114071);
        setElement(term114070, 1, "");
        setField(term114074, term114074.getClass(), "elements", null);
        setElement(term114070, 2, term114074);
        setField(term114075, term114075.getClass(), "members", null);
        setElement(term114070, 5, term114075);
        setField(term114069, term114069.getClass(), "stack", term114070);
        setIntField(term114069, term114069.getClass(), "stackSize", 0);
        setField(term114069, term114069.getClass(), "pathNames", null);
        setField(term114069, term114069.getClass(), "pathIndices", null);
        setField(term114069, term114069.getClass(), "in", null);
        setBooleanField(term114069, term114069.getClass(), "lenient", false);
        setField(term114069, term114069.getClass(), "buffer", null);
        setIntField(term114069, term114069.getClass(), "pos", 0);
        setIntField(term114069, term114069.getClass(), "limit", 0);
        setIntField(term114069, term114069.getClass(), "lineNumber", 0);
        setIntField(term114069, term114069.getClass(), "lineStart", 0);
        setIntField(term114069, term114069.getClass(), "peeked", 0);
        setLongField(term114069, term114069.getClass(), "peekedLong", 0L);
        setIntField(term114069, term114069.getClass(), "peekedNumberLength", 0);
        setField(term114069, term114069.getClass(), "peekedString", null);
        setField(term114069, term114069.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term113800, args);
        assertTrue(recursiveEquals(term113800, term114069));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


