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

public class JsonTreeReader_locationString_117107013300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108203;
     Object term108555;

    public JsonTreeReader_locationString_117107013300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108203 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term107909 = (Object[]) newArray("java.lang.Object", 512);
        Object term108259 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object[] term107911 = (Object[]) newArray("java.lang.Object", 0);
        Object term108353 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term108411 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term108203, term108203.getClass(), "stackSize", 36);
        setElement(term107909, 1, term108259);
        setElement(term107909, 2, term107911);
        setElement(term107909, 3, term108353);
        setElement(term107909, 4, term108411);
        setField(term108203, term108203.getClass(), "stack", term107909);
        term108555 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term108556 = (Object[]) newArray("java.lang.Object", 512);
        Object term108557 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object[] term108558 = (Object[]) newArray("java.lang.Object", 0);
        Object term108559 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term108560 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setField(term108557, term108557.getClass(), "elements", null);
        setElement(term108556, 1, term108557);
        setElement(term108556, 2, term108558);
        setField(term108559, term108559.getClass(), "stack", null);
        setIntField(term108559, term108559.getClass(), "stackSize", 0);
        setField(term108559, term108559.getClass(), "pathNames", null);
        setField(term108559, term108559.getClass(), "pathIndices", null);
        setField(term108559, term108559.getClass(), "in", null);
        setBooleanField(term108559, term108559.getClass(), "lenient", false);
        setField(term108559, term108559.getClass(), "buffer", null);
        setIntField(term108559, term108559.getClass(), "pos", 0);
        setIntField(term108559, term108559.getClass(), "limit", 0);
        setIntField(term108559, term108559.getClass(), "lineNumber", 0);
        setIntField(term108559, term108559.getClass(), "lineStart", 0);
        setIntField(term108559, term108559.getClass(), "peeked", 0);
        setLongField(term108559, term108559.getClass(), "peekedLong", 0L);
        setIntField(term108559, term108559.getClass(), "peekedNumberLength", 0);
        setField(term108559, term108559.getClass(), "peekedString", null);
        setField(term108559, term108559.getClass(), "stack", null);
        setElement(term108556, 3, term108559);
        setField(term108560, term108560.getClass(), "members", null);
        setElement(term108556, 4, term108560);
        setField(term108555, term108555.getClass(), "stack", term108556);
        setIntField(term108555, term108555.getClass(), "stackSize", 0);
        setField(term108555, term108555.getClass(), "pathNames", null);
        setField(term108555, term108555.getClass(), "pathIndices", null);
        setField(term108555, term108555.getClass(), "in", null);
        setBooleanField(term108555, term108555.getClass(), "lenient", false);
        setField(term108555, term108555.getClass(), "buffer", null);
        setIntField(term108555, term108555.getClass(), "pos", 0);
        setIntField(term108555, term108555.getClass(), "limit", 0);
        setIntField(term108555, term108555.getClass(), "lineNumber", 0);
        setIntField(term108555, term108555.getClass(), "lineStart", 0);
        setIntField(term108555, term108555.getClass(), "peeked", 0);
        setLongField(term108555, term108555.getClass(), "peekedLong", 0L);
        setIntField(term108555, term108555.getClass(), "peekedNumberLength", 0);
        setField(term108555, term108555.getClass(), "peekedString", null);
        setField(term108555, term108555.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term108203, args);
        assertTrue(recursiveEquals(term108203, term108555));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


