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

public class JsonTreeReader_getPath_1170023302380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157835;
     Object term158145;

    public JsonTreeReader_getPath_1170023302380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157835 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term157546 = (Object[]) newArray("java.lang.Object", 12);
        Object term157893 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term157987 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term158045 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object[] term157550 = (Object[]) newArray("java.lang.Object", 0);
        Object term158101 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term157835, term157835.getClass(), "stackSize", 7);
        setElement(term157546, 0, term157893);
        setElement(term157546, 1, term157987);
        setElement(term157546, 3, term158045);
        setElement(term157546, 4, term157550);
        setElement(term157546, 5, term158101);
        setField(term157835, term157835.getClass(), "stack", term157546);
        term158145 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term158146 = (Object[]) newArray("java.lang.Object", 12);
        Object term158147 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term158148 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term158149 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object[] term158150 = (Object[]) newArray("java.lang.Object", 0);
        Object term158151 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term158147, term158147.getClass(), "members", null);
        setElement(term158146, 0, term158147);
        setField(term158148, term158148.getClass(), "stack", null);
        setIntField(term158148, term158148.getClass(), "stackSize", 0);
        setField(term158148, term158148.getClass(), "pathNames", null);
        setField(term158148, term158148.getClass(), "pathIndices", null);
        setField(term158148, term158148.getClass(), "in", null);
        setBooleanField(term158148, term158148.getClass(), "lenient", false);
        setField(term158148, term158148.getClass(), "buffer", null);
        setIntField(term158148, term158148.getClass(), "pos", 0);
        setIntField(term158148, term158148.getClass(), "limit", 0);
        setIntField(term158148, term158148.getClass(), "lineNumber", 0);
        setIntField(term158148, term158148.getClass(), "lineStart", 0);
        setIntField(term158148, term158148.getClass(), "peeked", 0);
        setLongField(term158148, term158148.getClass(), "peekedLong", 0L);
        setIntField(term158148, term158148.getClass(), "peekedNumberLength", 0);
        setField(term158148, term158148.getClass(), "peekedString", null);
        setField(term158148, term158148.getClass(), "stack", null);
        setElement(term158146, 1, term158148);
        setField(term158149, term158149.getClass(), "members", null);
        setElement(term158146, 3, term158149);
        setElement(term158146, 4, term158150);
        setField(term158151, term158151.getClass(), "elements", null);
        setElement(term158146, 5, term158151);
        setField(term158145, term158145.getClass(), "stack", term158146);
        setIntField(term158145, term158145.getClass(), "stackSize", 0);
        setField(term158145, term158145.getClass(), "pathNames", null);
        setField(term158145, term158145.getClass(), "pathIndices", null);
        setField(term158145, term158145.getClass(), "in", null);
        setBooleanField(term158145, term158145.getClass(), "lenient", false);
        setField(term158145, term158145.getClass(), "buffer", null);
        setIntField(term158145, term158145.getClass(), "pos", 0);
        setIntField(term158145, term158145.getClass(), "limit", 0);
        setIntField(term158145, term158145.getClass(), "lineNumber", 0);
        setIntField(term158145, term158145.getClass(), "lineStart", 0);
        setIntField(term158145, term158145.getClass(), "peeked", 0);
        setLongField(term158145, term158145.getClass(), "peekedLong", 0L);
        setIntField(term158145, term158145.getClass(), "peekedNumberLength", 0);
        setField(term158145, term158145.getClass(), "peekedString", null);
        setField(term158145, term158145.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term157835, args);
        assertTrue(recursiveEquals(term157835, term158145));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


