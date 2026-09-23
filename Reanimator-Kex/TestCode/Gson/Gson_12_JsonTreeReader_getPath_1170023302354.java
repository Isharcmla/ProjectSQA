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

public class JsonTreeReader_getPath_1170023302354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140633;
     Object term140869;

    public JsonTreeReader_getPath_1170023302354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140633 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term140310 = (Object[]) newArray("java.lang.Object", 495);
        Object term140691 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term140749 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term140787 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term140633, term140633.getClass(), "stackSize", 23);
        setElement(term140310, 0, term140691);
        setElement(term140310, 2, term140749);
        setElement(term140310, 8, term140749);
        setElement(term140310, 128, term140787);
        setField(term140633, term140633.getClass(), "stack", term140310);
        term140869 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term140870 = (Object[]) newArray("java.lang.Object", 495);
        Object term140871 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term140872 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term140873 = newInstance(Class.forName("java.lang.Object"));
        setField(term140871, term140871.getClass(), "members", null);
        setElement(term140870, 0, term140871);
        setField(term140872, term140872.getClass(), "members", null);
        setElement(term140870, 2, term140872);
        setElement(term140870, 8, term140872);
        setElement(term140870, 128, term140873);
        setField(term140869, term140869.getClass(), "stack", term140870);
        setIntField(term140869, term140869.getClass(), "stackSize", 0);
        setField(term140869, term140869.getClass(), "pathNames", null);
        setField(term140869, term140869.getClass(), "pathIndices", null);
        setField(term140869, term140869.getClass(), "in", null);
        setBooleanField(term140869, term140869.getClass(), "lenient", false);
        setField(term140869, term140869.getClass(), "buffer", null);
        setIntField(term140869, term140869.getClass(), "pos", 0);
        setIntField(term140869, term140869.getClass(), "limit", 0);
        setIntField(term140869, term140869.getClass(), "lineNumber", 0);
        setIntField(term140869, term140869.getClass(), "lineStart", 0);
        setIntField(term140869, term140869.getClass(), "peeked", 0);
        setLongField(term140869, term140869.getClass(), "peekedLong", 0L);
        setIntField(term140869, term140869.getClass(), "peekedNumberLength", 0);
        setField(term140869, term140869.getClass(), "peekedString", null);
        setField(term140869, term140869.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term140633, args);
        assertTrue(recursiveEquals(term140633, term140869));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


