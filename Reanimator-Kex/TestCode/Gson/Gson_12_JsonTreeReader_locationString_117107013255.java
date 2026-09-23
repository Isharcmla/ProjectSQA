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

public class JsonTreeReader_locationString_117107013255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76994;
     Object term79099;

    public JsonTreeReader_locationString_117107013255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76994 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term76841 = (Object[]) newArray("java.lang.Object", 4);
        Object term77088 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term77146 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term76994, term76994.getClass(), "stackSize", 4);
        setElement(term76841, 0, term77088);
        setElement(term76841, 1, term77146);
        setField(term76994, term76994.getClass(), "stack", term76841);
        term79099 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term79100 = (Object[]) newArray("java.lang.Object", 4);
        Object term79101 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term79102 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setField(term79101, term79101.getClass(), "stack", null);
        setIntField(term79101, term79101.getClass(), "stackSize", 0);
        setField(term79101, term79101.getClass(), "pathNames", null);
        setField(term79101, term79101.getClass(), "pathIndices", null);
        setField(term79101, term79101.getClass(), "in", null);
        setBooleanField(term79101, term79101.getClass(), "lenient", false);
        setField(term79101, term79101.getClass(), "buffer", null);
        setIntField(term79101, term79101.getClass(), "pos", 0);
        setIntField(term79101, term79101.getClass(), "limit", 0);
        setIntField(term79101, term79101.getClass(), "lineNumber", 0);
        setIntField(term79101, term79101.getClass(), "lineStart", 0);
        setIntField(term79101, term79101.getClass(), "peeked", 0);
        setLongField(term79101, term79101.getClass(), "peekedLong", 0L);
        setIntField(term79101, term79101.getClass(), "peekedNumberLength", 0);
        setField(term79101, term79101.getClass(), "peekedString", null);
        setField(term79101, term79101.getClass(), "stack", null);
        setElement(term79100, 0, term79101);
        setField(term79102, term79102.getClass(), "members", null);
        setElement(term79100, 1, term79102);
        setField(term79099, term79099.getClass(), "stack", term79100);
        setIntField(term79099, term79099.getClass(), "stackSize", 0);
        setField(term79099, term79099.getClass(), "pathNames", null);
        setField(term79099, term79099.getClass(), "pathIndices", null);
        setField(term79099, term79099.getClass(), "in", null);
        setBooleanField(term79099, term79099.getClass(), "lenient", false);
        setField(term79099, term79099.getClass(), "buffer", null);
        setIntField(term79099, term79099.getClass(), "pos", 0);
        setIntField(term79099, term79099.getClass(), "limit", 0);
        setIntField(term79099, term79099.getClass(), "lineNumber", 0);
        setIntField(term79099, term79099.getClass(), "lineStart", 0);
        setIntField(term79099, term79099.getClass(), "peeked", 0);
        setLongField(term79099, term79099.getClass(), "peekedLong", 0L);
        setIntField(term79099, term79099.getClass(), "peekedNumberLength", 0);
        setField(term79099, term79099.getClass(), "peekedString", null);
        setField(term79099, term79099.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term76994, args);
        assertTrue(recursiveEquals(term76994, term79099));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


