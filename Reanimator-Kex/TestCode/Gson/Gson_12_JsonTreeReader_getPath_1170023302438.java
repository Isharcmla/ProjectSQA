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

public class JsonTreeReader_getPath_1170023302438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185283;
     Object term185646;

    public JsonTreeReader_getPath_1170023302438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185283 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term184954 = (Object[]) newArray("java.lang.Object", 494);
        Object term185341 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term185399 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term185493 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term185531 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term185283, term185283.getClass(), "stackSize", 9);
        setElement(term184954, 0, term185341);
        setElement(term184954, 2, term185399);
        setElement(term184954, 6, term185493);
        setElement(term184954, 32, term185531);
        setField(term185283, term185283.getClass(), "stack", term184954);
        term185646 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term185647 = (Object[]) newArray("java.lang.Object", 494);
        Object term185648 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term185649 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term185650 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term185651 = newInstance(Class.forName("java.lang.Object"));
        setField(term185648, term185648.getClass(), "members", null);
        setElement(term185647, 0, term185648);
        setField(term185649, term185649.getClass(), "members", null);
        setElement(term185647, 2, term185649);
        setField(term185650, term185650.getClass(), "stack", null);
        setIntField(term185650, term185650.getClass(), "stackSize", 0);
        setField(term185650, term185650.getClass(), "pathNames", null);
        setField(term185650, term185650.getClass(), "pathIndices", null);
        setField(term185650, term185650.getClass(), "in", null);
        setBooleanField(term185650, term185650.getClass(), "lenient", false);
        setField(term185650, term185650.getClass(), "buffer", null);
        setIntField(term185650, term185650.getClass(), "pos", 0);
        setIntField(term185650, term185650.getClass(), "limit", 0);
        setIntField(term185650, term185650.getClass(), "lineNumber", 0);
        setIntField(term185650, term185650.getClass(), "lineStart", 0);
        setIntField(term185650, term185650.getClass(), "peeked", 0);
        setLongField(term185650, term185650.getClass(), "peekedLong", 0L);
        setIntField(term185650, term185650.getClass(), "peekedNumberLength", 0);
        setField(term185650, term185650.getClass(), "peekedString", null);
        setField(term185650, term185650.getClass(), "stack", null);
        setElement(term185647, 6, term185650);
        setElement(term185647, 32, term185651);
        setField(term185646, term185646.getClass(), "stack", term185647);
        setIntField(term185646, term185646.getClass(), "stackSize", 0);
        setField(term185646, term185646.getClass(), "pathNames", null);
        setField(term185646, term185646.getClass(), "pathIndices", null);
        setField(term185646, term185646.getClass(), "in", null);
        setBooleanField(term185646, term185646.getClass(), "lenient", false);
        setField(term185646, term185646.getClass(), "buffer", null);
        setIntField(term185646, term185646.getClass(), "pos", 0);
        setIntField(term185646, term185646.getClass(), "limit", 0);
        setIntField(term185646, term185646.getClass(), "lineNumber", 0);
        setIntField(term185646, term185646.getClass(), "lineStart", 0);
        setIntField(term185646, term185646.getClass(), "peeked", 0);
        setLongField(term185646, term185646.getClass(), "peekedLong", 0L);
        setIntField(term185646, term185646.getClass(), "peekedNumberLength", 0);
        setField(term185646, term185646.getClass(), "peekedString", null);
        setField(term185646, term185646.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term185283, args);
        assertTrue(recursiveEquals(term185283, term185646));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


