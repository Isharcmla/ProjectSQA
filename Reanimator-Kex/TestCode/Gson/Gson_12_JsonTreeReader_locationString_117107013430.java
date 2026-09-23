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

public class JsonTreeReader_locationString_117107013430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181269;
     Object term181608;

    public JsonTreeReader_locationString_117107013430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181269 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term180955 = (Object[]) newArray("java.lang.Object", 7);
        Object term181327 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term181421 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term181477 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term181269, term181269.getClass(), "stackSize", 7);
        setElement(term180955, 0, term181327);
        setElement(term180955, 1, term181421);
        setElement(term180955, 2, term181477);
        setElement(term180955, 3, "");
        setField(term181269, term181269.getClass(), "stack", term180955);
        term181608 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term181609 = (Object[]) newArray("java.lang.Object", 7);
        Object term181610 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term181611 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term181612 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term181610, term181610.getClass(), "members", null);
        setElement(term181609, 0, term181610);
        setField(term181611, term181611.getClass(), "stack", null);
        setIntField(term181611, term181611.getClass(), "stackSize", 0);
        setField(term181611, term181611.getClass(), "pathNames", null);
        setField(term181611, term181611.getClass(), "pathIndices", null);
        setField(term181611, term181611.getClass(), "in", null);
        setBooleanField(term181611, term181611.getClass(), "lenient", false);
        setField(term181611, term181611.getClass(), "buffer", null);
        setIntField(term181611, term181611.getClass(), "pos", 0);
        setIntField(term181611, term181611.getClass(), "limit", 0);
        setIntField(term181611, term181611.getClass(), "lineNumber", 0);
        setIntField(term181611, term181611.getClass(), "lineStart", 0);
        setIntField(term181611, term181611.getClass(), "peeked", 0);
        setLongField(term181611, term181611.getClass(), "peekedLong", 0L);
        setIntField(term181611, term181611.getClass(), "peekedNumberLength", 0);
        setField(term181611, term181611.getClass(), "peekedString", null);
        setField(term181611, term181611.getClass(), "stack", null);
        setElement(term181609, 1, term181611);
        setField(term181612, term181612.getClass(), "elements", null);
        setElement(term181609, 2, term181612);
        setElement(term181609, 3, "");
        setField(term181608, term181608.getClass(), "stack", term181609);
        setIntField(term181608, term181608.getClass(), "stackSize", 0);
        setField(term181608, term181608.getClass(), "pathNames", null);
        setField(term181608, term181608.getClass(), "pathIndices", null);
        setField(term181608, term181608.getClass(), "in", null);
        setBooleanField(term181608, term181608.getClass(), "lenient", false);
        setField(term181608, term181608.getClass(), "buffer", null);
        setIntField(term181608, term181608.getClass(), "pos", 0);
        setIntField(term181608, term181608.getClass(), "limit", 0);
        setIntField(term181608, term181608.getClass(), "lineNumber", 0);
        setIntField(term181608, term181608.getClass(), "lineStart", 0);
        setIntField(term181608, term181608.getClass(), "peeked", 0);
        setLongField(term181608, term181608.getClass(), "peekedLong", 0L);
        setIntField(term181608, term181608.getClass(), "peekedNumberLength", 0);
        setField(term181608, term181608.getClass(), "peekedString", null);
        setField(term181608, term181608.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term181269, args);
        assertTrue(recursiveEquals(term181269, term181608));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


