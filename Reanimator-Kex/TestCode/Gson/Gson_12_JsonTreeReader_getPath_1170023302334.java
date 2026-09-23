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

public class JsonTreeReader_getPath_1170023302334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127432;
     Object term127580;

    public JsonTreeReader_getPath_1170023302334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127432 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term127149 = (Object[]) newArray("java.lang.Object", 495);
        Object term127490 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term127548 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term127432, term127432.getClass(), "stackSize", 5);
        setElement(term127149, 1, term127490);
        setElement(term127149, 4, term127548);
        setField(term127432, term127432.getClass(), "stack", term127149);
        term127580 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term127581 = (Object[]) newArray("java.lang.Object", 495);
        Object term127582 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term127583 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setField(term127582, term127582.getClass(), "members", null);
        setElement(term127581, 1, term127582);
        setField(term127583, term127583.getClass(), "members", null);
        setElement(term127581, 4, term127583);
        setField(term127580, term127580.getClass(), "stack", term127581);
        setIntField(term127580, term127580.getClass(), "stackSize", 0);
        setField(term127580, term127580.getClass(), "pathNames", null);
        setField(term127580, term127580.getClass(), "pathIndices", null);
        setField(term127580, term127580.getClass(), "in", null);
        setBooleanField(term127580, term127580.getClass(), "lenient", false);
        setField(term127580, term127580.getClass(), "buffer", null);
        setIntField(term127580, term127580.getClass(), "pos", 0);
        setIntField(term127580, term127580.getClass(), "limit", 0);
        setIntField(term127580, term127580.getClass(), "lineNumber", 0);
        setIntField(term127580, term127580.getClass(), "lineStart", 0);
        setIntField(term127580, term127580.getClass(), "peeked", 0);
        setLongField(term127580, term127580.getClass(), "peekedLong", 0L);
        setIntField(term127580, term127580.getClass(), "peekedNumberLength", 0);
        setField(term127580, term127580.getClass(), "peekedString", null);
        setField(term127580, term127580.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term127432, args);
        assertTrue(recursiveEquals(term127432, term127580));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


