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

public class JsonTreeReader_locationString_117107013231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67051;
     Object term67586;

    public JsonTreeReader_locationString_117107013231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67051 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term66796 = (Object[]) newArray("java.lang.Object", 10);
        Object term67107 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term67051, term67051.getClass(), "stackSize", 3);
        setElement(term66796, 0, term67107);
        setField(term67051, term67051.getClass(), "stack", term66796);
        term67586 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term67587 = (Object[]) newArray("java.lang.Object", 10);
        Object term67588 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term67588, term67588.getClass(), "elements", null);
        setElement(term67587, 0, term67588);
        setField(term67586, term67586.getClass(), "stack", term67587);
        setIntField(term67586, term67586.getClass(), "stackSize", 0);
        setField(term67586, term67586.getClass(), "pathNames", null);
        setField(term67586, term67586.getClass(), "pathIndices", null);
        setField(term67586, term67586.getClass(), "in", null);
        setBooleanField(term67586, term67586.getClass(), "lenient", false);
        setField(term67586, term67586.getClass(), "buffer", null);
        setIntField(term67586, term67586.getClass(), "pos", 0);
        setIntField(term67586, term67586.getClass(), "limit", 0);
        setIntField(term67586, term67586.getClass(), "lineNumber", 0);
        setIntField(term67586, term67586.getClass(), "lineStart", 0);
        setIntField(term67586, term67586.getClass(), "peeked", 0);
        setLongField(term67586, term67586.getClass(), "peekedLong", 0L);
        setIntField(term67586, term67586.getClass(), "peekedNumberLength", 0);
        setField(term67586, term67586.getClass(), "peekedString", null);
        setField(term67586, term67586.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term67051, args);
        assertTrue(recursiveEquals(term67051, term67586));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


