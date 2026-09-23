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
import java.lang.String;
import java.lang.Object;

public class JsonTreeReader_peek_46746328353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7798;
     Object term9685;
     Object enum1;

    public JsonTreeReader_peek_46746328353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7798 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term7798, term7798.getClass(), "stack", null);
        setIntField(term7798, term7798.getClass(), "stackSize", 0);
        setField(term7798, term7798.getClass(), "pathNames", null);
        setField(term7798, term7798.getClass(), "pathIndices", null);
        setField(term7798, term7798.getClass(), "in", null);
        setBooleanField(term7798, term7798.getClass(), "lenient", false);
        setField(term7798, term7798.getClass(), "buffer", null);
        setIntField(term7798, term7798.getClass(), "pos", 0);
        setIntField(term7798, term7798.getClass(), "limit", 0);
        setIntField(term7798, term7798.getClass(), "lineNumber", 0);
        setIntField(term7798, term7798.getClass(), "lineStart", 0);
        setIntField(term7798, term7798.getClass(), "peeked", 0);
        setLongField(term7798, term7798.getClass(), "peekedLong", 0L);
        setIntField(term7798, term7798.getClass(), "peekedNumberLength", 0);
        setField(term7798, term7798.getClass(), "peekedString", null);
        setField(term7798, term7798.getClass(), "stack", null);
        term9685 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term9685, term9685.getClass(), "stack", null);
        setIntField(term9685, term9685.getClass(), "stackSize", 0);
        setField(term9685, term9685.getClass(), "pathNames", null);
        setField(term9685, term9685.getClass(), "pathIndices", null);
        setField(term9685, term9685.getClass(), "in", null);
        setBooleanField(term9685, term9685.getClass(), "lenient", false);
        setField(term9685, term9685.getClass(), "buffer", null);
        setIntField(term9685, term9685.getClass(), "pos", 0);
        setIntField(term9685, term9685.getClass(), "limit", 0);
        setIntField(term9685, term9685.getClass(), "lineNumber", 0);
        setIntField(term9685, term9685.getClass(), "lineStart", 0);
        setIntField(term9685, term9685.getClass(), "peeked", 0);
        setLongField(term9685, term9685.getClass(), "peekedLong", 0L);
        setIntField(term9685, term9685.getClass(), "peekedNumberLength", 0);
        setField(term9685, term9685.getClass(), "peekedString", null);
        setField(term9685, term9685.getClass(), "stack", null);
        Class<? extends Object> term9755 = Class.forName((String) "com.google.gson.stream.JsonToken");
        Field term9754 = ((Class) term9755).getDeclaredField((String) "END_DOCUMENT");
        ((Field) term9754).setAccessible(true);
        enum1 = ((Field) term9754).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "peek", argTypes, term7798, args);
        assertTrue(recursiveEquals(term7798, term9685));
        assertTrue(recursiveEquals(retValue, enum1));
    }

};


