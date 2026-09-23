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

public class JsonTreeReader_getPath_1170023302274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93621;
     Object term93700;

    public JsonTreeReader_getPath_1170023302274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93621 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term93363 = (Object[]) newArray("java.lang.Object", 10);
        Object term93677 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term93621, term93621.getClass(), "stackSize", 3);
        setElement(term93363, 0, term93677);
        setField(term93621, term93621.getClass(), "stack", term93363);
        term93700 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term93701 = (Object[]) newArray("java.lang.Object", 10);
        Object term93702 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term93702, term93702.getClass(), "elements", null);
        setElement(term93701, 0, term93702);
        setField(term93700, term93700.getClass(), "stack", term93701);
        setIntField(term93700, term93700.getClass(), "stackSize", 0);
        setField(term93700, term93700.getClass(), "pathNames", null);
        setField(term93700, term93700.getClass(), "pathIndices", null);
        setField(term93700, term93700.getClass(), "in", null);
        setBooleanField(term93700, term93700.getClass(), "lenient", false);
        setField(term93700, term93700.getClass(), "buffer", null);
        setIntField(term93700, term93700.getClass(), "pos", 0);
        setIntField(term93700, term93700.getClass(), "limit", 0);
        setIntField(term93700, term93700.getClass(), "lineNumber", 0);
        setIntField(term93700, term93700.getClass(), "lineStart", 0);
        setIntField(term93700, term93700.getClass(), "peeked", 0);
        setLongField(term93700, term93700.getClass(), "peekedLong", 0L);
        setIntField(term93700, term93700.getClass(), "peekedNumberLength", 0);
        setField(term93700, term93700.getClass(), "peekedString", null);
        setField(term93700, term93700.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term93621, args);
        assertTrue(recursiveEquals(term93621, term93700));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


