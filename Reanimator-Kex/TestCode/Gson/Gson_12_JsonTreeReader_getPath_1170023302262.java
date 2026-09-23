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

public class JsonTreeReader_getPath_1170023302262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83464;
     Object term84624;

    public JsonTreeReader_getPath_1170023302262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83464 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term82704 = (Object[]) newArray("java.lang.Object", 107);
        Object term83520 = newInstance(Class.forName("com.google.gson.JsonArray"));
        char[] term82212 = (char[]) newCharArray(489);
        Object term83578 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term83616 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term83464, term83464.getClass(), "stackSize", 4);
        setElement(term82704, 0, term83520);
        setElement(term82704, 1, term82212);
        setElement(term82704, 3, term83578);
        setElement(term82704, 64, term83616);
        setField(term83464, term83464.getClass(), "stack", term82704);
        term84624 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term84625 = (Object[]) newArray("java.lang.Object", 107);
        Object term84626 = newInstance(Class.forName("com.google.gson.JsonArray"));
        char[] term84627 = (char[]) newCharArray(489);
        Object term84628 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term84629 = newInstance(Class.forName("java.lang.Object"));
        setField(term84626, term84626.getClass(), "elements", null);
        setElement(term84625, 0, term84626);
        setElement(term84625, 1, term84627);
        setField(term84628, term84628.getClass(), "members", null);
        setElement(term84625, 3, term84628);
        setElement(term84625, 64, term84629);
        setField(term84624, term84624.getClass(), "stack", term84625);
        setIntField(term84624, term84624.getClass(), "stackSize", 0);
        setField(term84624, term84624.getClass(), "pathNames", null);
        setField(term84624, term84624.getClass(), "pathIndices", null);
        setField(term84624, term84624.getClass(), "in", null);
        setBooleanField(term84624, term84624.getClass(), "lenient", false);
        setField(term84624, term84624.getClass(), "buffer", null);
        setIntField(term84624, term84624.getClass(), "pos", 0);
        setIntField(term84624, term84624.getClass(), "limit", 0);
        setIntField(term84624, term84624.getClass(), "lineNumber", 0);
        setIntField(term84624, term84624.getClass(), "lineStart", 0);
        setIntField(term84624, term84624.getClass(), "peeked", 0);
        setLongField(term84624, term84624.getClass(), "peekedLong", 0L);
        setIntField(term84624, term84624.getClass(), "peekedNumberLength", 0);
        setField(term84624, term84624.getClass(), "peekedString", null);
        setField(term84624, term84624.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term83464, args);
        assertTrue(recursiveEquals(term83464, term84624));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


