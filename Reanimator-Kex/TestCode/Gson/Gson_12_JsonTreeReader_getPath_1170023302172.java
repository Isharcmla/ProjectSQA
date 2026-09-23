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

public class JsonTreeReader_getPath_1170023302172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40858;
     Object term41577;

    public JsonTreeReader_getPath_1170023302172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40858 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term40728 = (Object[]) newArray("java.lang.Object", 489);
        Object term40916 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term40954 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term40858, term40858.getClass(), "stackSize", 1);
        setElement(term40728, 0, term40916);
        setElement(term40728, 256, term40954);
        setField(term40858, term40858.getClass(), "stack", term40728);
        term41577 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term41578 = (Object[]) newArray("java.lang.Object", 489);
        Object term41579 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term41580 = newInstance(Class.forName("java.lang.Object"));
        setField(term41579, term41579.getClass(), "members", null);
        setElement(term41578, 0, term41579);
        setElement(term41578, 256, term41580);
        setField(term41577, term41577.getClass(), "stack", term41578);
        setIntField(term41577, term41577.getClass(), "stackSize", 0);
        setField(term41577, term41577.getClass(), "pathNames", null);
        setField(term41577, term41577.getClass(), "pathIndices", null);
        setField(term41577, term41577.getClass(), "in", null);
        setBooleanField(term41577, term41577.getClass(), "lenient", false);
        setField(term41577, term41577.getClass(), "buffer", null);
        setIntField(term41577, term41577.getClass(), "pos", 0);
        setIntField(term41577, term41577.getClass(), "limit", 0);
        setIntField(term41577, term41577.getClass(), "lineNumber", 0);
        setIntField(term41577, term41577.getClass(), "lineStart", 0);
        setIntField(term41577, term41577.getClass(), "peeked", 0);
        setLongField(term41577, term41577.getClass(), "peekedLong", 0L);
        setIntField(term41577, term41577.getClass(), "peekedNumberLength", 0);
        setField(term41577, term41577.getClass(), "peekedString", null);
        setField(term41577, term41577.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term40858, args);
        assertTrue(recursiveEquals(term40858, term41577));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


