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

public class JsonTreeReader_locationString_117107013282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97205;
     Object term97482;

    public JsonTreeReader_locationString_117107013282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97205 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term96932 = (Object[]) newArray("java.lang.Object", 504);
        Object term97261 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term97371 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term97427 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term97205, term97205.getClass(), "stackSize", 10);
        setElement(term96932, 1, term97261);
        setElement(term96932, 2, term97371);
        setElement(term96932, 3, term97427);
        setField(term97205, term97205.getClass(), "stack", term96932);
        term97482 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term97483 = (Object[]) newArray("java.lang.Object", 504);
        Object term97484 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term97485 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term97486 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term97484, term97484.getClass(), "elements", null);
        setElement(term97483, 1, term97484);
        setElement(term97483, 2, term97485);
        setField(term97486, term97486.getClass(), "elements", null);
        setElement(term97483, 3, term97486);
        setField(term97482, term97482.getClass(), "stack", term97483);
        setIntField(term97482, term97482.getClass(), "stackSize", 0);
        setField(term97482, term97482.getClass(), "pathNames", null);
        setField(term97482, term97482.getClass(), "pathIndices", null);
        setField(term97482, term97482.getClass(), "in", null);
        setBooleanField(term97482, term97482.getClass(), "lenient", false);
        setField(term97482, term97482.getClass(), "buffer", null);
        setIntField(term97482, term97482.getClass(), "pos", 0);
        setIntField(term97482, term97482.getClass(), "limit", 0);
        setIntField(term97482, term97482.getClass(), "lineNumber", 0);
        setIntField(term97482, term97482.getClass(), "lineStart", 0);
        setIntField(term97482, term97482.getClass(), "peeked", 0);
        setLongField(term97482, term97482.getClass(), "peekedLong", 0L);
        setIntField(term97482, term97482.getClass(), "peekedNumberLength", 0);
        setField(term97482, term97482.getClass(), "peekedString", null);
        setField(term97482, term97482.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term97205, args);
        assertTrue(recursiveEquals(term97205, term97482));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


