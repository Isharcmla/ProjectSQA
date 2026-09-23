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

public class JsonTreeReader_locationString_117107013242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72423;
     Object term72586;

    public JsonTreeReader_locationString_117107013242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72423 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term72155 = (Object[]) newArray("java.lang.Object", 11);
        Object term72481 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term72537 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term72423, term72423.getClass(), "stackSize", 8);
        setElement(term72155, 0, term72481);
        setElement(term72155, 2, term72537);
        setField(term72423, term72423.getClass(), "stack", term72155);
        term72586 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term72587 = (Object[]) newArray("java.lang.Object", 11);
        Object term72588 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term72589 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term72588, term72588.getClass(), "members", null);
        setElement(term72587, 0, term72588);
        setField(term72589, term72589.getClass(), "elements", null);
        setElement(term72587, 2, term72589);
        setField(term72586, term72586.getClass(), "stack", term72587);
        setIntField(term72586, term72586.getClass(), "stackSize", 0);
        setField(term72586, term72586.getClass(), "pathNames", null);
        setField(term72586, term72586.getClass(), "pathIndices", null);
        setField(term72586, term72586.getClass(), "in", null);
        setBooleanField(term72586, term72586.getClass(), "lenient", false);
        setField(term72586, term72586.getClass(), "buffer", null);
        setIntField(term72586, term72586.getClass(), "pos", 0);
        setIntField(term72586, term72586.getClass(), "limit", 0);
        setIntField(term72586, term72586.getClass(), "lineNumber", 0);
        setIntField(term72586, term72586.getClass(), "lineStart", 0);
        setIntField(term72586, term72586.getClass(), "peeked", 0);
        setLongField(term72586, term72586.getClass(), "peekedLong", 0L);
        setIntField(term72586, term72586.getClass(), "peekedNumberLength", 0);
        setField(term72586, term72586.getClass(), "peekedString", null);
        setField(term72586, term72586.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term72423, args);
        assertTrue(recursiveEquals(term72423, term72586));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


