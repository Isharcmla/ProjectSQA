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

public class JsonTreeReader_locationString_117107013392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163316;
     Object term163407;

    public JsonTreeReader_locationString_117107013392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163316 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term163058 = (Object[]) newArray("java.lang.Object", 19);
        Object term163372 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term163316, term163316.getClass(), "stackSize", 3);
        setElement(term163058, 0, term163372);
        setElement(term163058, 2, term163372);
        setField(term163316, term163316.getClass(), "stack", term163058);
        term163407 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term163408 = (Object[]) newArray("java.lang.Object", 19);
        Object term163409 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term163409, term163409.getClass(), "elements", null);
        setElement(term163408, 0, term163409);
        setElement(term163408, 2, term163409);
        setField(term163407, term163407.getClass(), "stack", term163408);
        setIntField(term163407, term163407.getClass(), "stackSize", 0);
        setField(term163407, term163407.getClass(), "pathNames", null);
        setField(term163407, term163407.getClass(), "pathIndices", null);
        setField(term163407, term163407.getClass(), "in", null);
        setBooleanField(term163407, term163407.getClass(), "lenient", false);
        setField(term163407, term163407.getClass(), "buffer", null);
        setIntField(term163407, term163407.getClass(), "pos", 0);
        setIntField(term163407, term163407.getClass(), "limit", 0);
        setIntField(term163407, term163407.getClass(), "lineNumber", 0);
        setIntField(term163407, term163407.getClass(), "lineStart", 0);
        setIntField(term163407, term163407.getClass(), "peeked", 0);
        setLongField(term163407, term163407.getClass(), "peekedLong", 0L);
        setIntField(term163407, term163407.getClass(), "peekedNumberLength", 0);
        setField(term163407, term163407.getClass(), "peekedString", null);
        setField(term163407, term163407.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term163316, args);
        assertTrue(recursiveEquals(term163316, term163407));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


