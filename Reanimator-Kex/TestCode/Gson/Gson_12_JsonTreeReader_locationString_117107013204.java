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

public class JsonTreeReader_locationString_117107013204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52359;
     Object term52453;

    public JsonTreeReader_locationString_117107013204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52359 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term52097 = (Object[]) newArray("java.lang.Object", 490);
        Object term52417 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term52359, term52359.getClass(), "stackSize", 3);
        setElement(term52097, 0, term52417);
        setField(term52359, term52359.getClass(), "stack", term52097);
        term52453 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term52454 = (Object[]) newArray("java.lang.Object", 490);
        Object term52455 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setField(term52455, term52455.getClass(), "members", null);
        setElement(term52454, 0, term52455);
        setField(term52453, term52453.getClass(), "stack", term52454);
        setIntField(term52453, term52453.getClass(), "stackSize", 0);
        setField(term52453, term52453.getClass(), "pathNames", null);
        setField(term52453, term52453.getClass(), "pathIndices", null);
        setField(term52453, term52453.getClass(), "in", null);
        setBooleanField(term52453, term52453.getClass(), "lenient", false);
        setField(term52453, term52453.getClass(), "buffer", null);
        setIntField(term52453, term52453.getClass(), "pos", 0);
        setIntField(term52453, term52453.getClass(), "limit", 0);
        setIntField(term52453, term52453.getClass(), "lineNumber", 0);
        setIntField(term52453, term52453.getClass(), "lineStart", 0);
        setIntField(term52453, term52453.getClass(), "peeked", 0);
        setLongField(term52453, term52453.getClass(), "peekedLong", 0L);
        setIntField(term52453, term52453.getClass(), "peekedNumberLength", 0);
        setField(term52453, term52453.getClass(), "peekedString", null);
        setField(term52453, term52453.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term52359, args);
        assertTrue(recursiveEquals(term52359, term52453));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


