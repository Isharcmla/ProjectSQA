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

public class JsonTreeReader_locationString_117107013416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174845;
     Object term174996;

    public JsonTreeReader_locationString_117107013416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174845 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term174573 = (Object[]) newArray("java.lang.Object", 502);
        Object term174903 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term174959 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term174845, term174845.getClass(), "stackSize", 4);
        setElement(term174573, 0, term174903);
        setElement(term174573, 2, term174959);
        setField(term174845, term174845.getClass(), "stack", term174573);
        term174996 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term174997 = (Object[]) newArray("java.lang.Object", 502);
        Object term174998 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term174999 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term174998, term174998.getClass(), "members", null);
        setElement(term174997, 0, term174998);
        setField(term174999, term174999.getClass(), "elements", null);
        setElement(term174997, 2, term174999);
        setField(term174996, term174996.getClass(), "stack", term174997);
        setIntField(term174996, term174996.getClass(), "stackSize", 0);
        setField(term174996, term174996.getClass(), "pathNames", null);
        setField(term174996, term174996.getClass(), "pathIndices", null);
        setField(term174996, term174996.getClass(), "in", null);
        setBooleanField(term174996, term174996.getClass(), "lenient", false);
        setField(term174996, term174996.getClass(), "buffer", null);
        setIntField(term174996, term174996.getClass(), "pos", 0);
        setIntField(term174996, term174996.getClass(), "limit", 0);
        setIntField(term174996, term174996.getClass(), "lineNumber", 0);
        setIntField(term174996, term174996.getClass(), "lineStart", 0);
        setIntField(term174996, term174996.getClass(), "peeked", 0);
        setLongField(term174996, term174996.getClass(), "peekedLong", 0L);
        setIntField(term174996, term174996.getClass(), "peekedNumberLength", 0);
        setField(term174996, term174996.getClass(), "peekedString", null);
        setField(term174996, term174996.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term174845, args);
        assertTrue(recursiveEquals(term174845, term174996));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


