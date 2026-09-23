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
import java.lang.StringBuilder;

public class JsonTreeReader_locationString_117107013422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177648;
     Object term177882;

    public JsonTreeReader_locationString_117107013422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term177822 = new StringBuilder();
        term177648 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term177358 = (Object[]) newArray("java.lang.Object", 237);
        Object term177706 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term177762 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term177648, term177648.getClass(), "stackSize", 5);
        setElement(term177358, 0, term177706);
        setElement(term177358, 2, term177762);
        setElement(term177358, 4, term177822);
        setField(term177648, term177648.getClass(), "stack", term177358);
        term177882 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term177883 = (Object[]) newArray("java.lang.Object", 237);
        Object term177884 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term177885 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term177886 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term177887 = (byte[]) newByteArray(16);
        setField(term177884, term177884.getClass(), "members", null);
        setElement(term177883, 0, term177884);
        setField(term177885, term177885.getClass(), "elements", null);
        setElement(term177883, 2, term177885);
        setField(term177886, term177886.getClass(), "value", term177887);
        setByteField(term177886, term177886.getClass(), "coder", (byte) 0);
        setIntField(term177886, term177886.getClass(), "count", 0);
        setElement(term177883, 4, term177886);
        setField(term177882, term177882.getClass(), "stack", term177883);
        setIntField(term177882, term177882.getClass(), "stackSize", 0);
        setField(term177882, term177882.getClass(), "pathNames", null);
        setField(term177882, term177882.getClass(), "pathIndices", null);
        setField(term177882, term177882.getClass(), "in", null);
        setBooleanField(term177882, term177882.getClass(), "lenient", false);
        setField(term177882, term177882.getClass(), "buffer", null);
        setIntField(term177882, term177882.getClass(), "pos", 0);
        setIntField(term177882, term177882.getClass(), "limit", 0);
        setIntField(term177882, term177882.getClass(), "lineNumber", 0);
        setIntField(term177882, term177882.getClass(), "lineStart", 0);
        setIntField(term177882, term177882.getClass(), "peeked", 0);
        setLongField(term177882, term177882.getClass(), "peekedLong", 0L);
        setIntField(term177882, term177882.getClass(), "peekedNumberLength", 0);
        setField(term177882, term177882.getClass(), "peekedString", null);
        setField(term177882, term177882.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term177648, args);
        assertTrue(recursiveEquals(term177648, term177882));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


