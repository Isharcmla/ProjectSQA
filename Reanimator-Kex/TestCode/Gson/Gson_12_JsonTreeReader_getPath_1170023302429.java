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

public class JsonTreeReader_getPath_1170023302429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180450;
     Object term181545;

    public JsonTreeReader_getPath_1170023302429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180450 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term180166 = (Object[]) newArray("java.lang.Object", 495);
        Object term180508 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term180566 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term180604 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term180450, term180450.getClass(), "stackSize", 5);
        setElement(term180166, 0, term180508);
        setElement(term180166, 2, term180566);
        setElement(term180166, 256, term180604);
        setField(term180450, term180450.getClass(), "stack", term180166);
        term181545 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term181546 = (Object[]) newArray("java.lang.Object", 495);
        Object term181547 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term181548 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term181549 = newInstance(Class.forName("java.lang.Object"));
        setField(term181547, term181547.getClass(), "members", null);
        setElement(term181546, 0, term181547);
        setField(term181548, term181548.getClass(), "members", null);
        setElement(term181546, 2, term181548);
        setElement(term181546, 256, term181549);
        setField(term181545, term181545.getClass(), "stack", term181546);
        setIntField(term181545, term181545.getClass(), "stackSize", 0);
        setField(term181545, term181545.getClass(), "pathNames", null);
        setField(term181545, term181545.getClass(), "pathIndices", null);
        setField(term181545, term181545.getClass(), "in", null);
        setBooleanField(term181545, term181545.getClass(), "lenient", false);
        setField(term181545, term181545.getClass(), "buffer", null);
        setIntField(term181545, term181545.getClass(), "pos", 0);
        setIntField(term181545, term181545.getClass(), "limit", 0);
        setIntField(term181545, term181545.getClass(), "lineNumber", 0);
        setIntField(term181545, term181545.getClass(), "lineStart", 0);
        setIntField(term181545, term181545.getClass(), "peeked", 0);
        setLongField(term181545, term181545.getClass(), "peekedLong", 0L);
        setIntField(term181545, term181545.getClass(), "peekedNumberLength", 0);
        setField(term181545, term181545.getClass(), "peekedString", null);
        setField(term181545, term181545.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term180450, args);
        assertTrue(recursiveEquals(term180450, term181545));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


