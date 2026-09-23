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

public class JsonTreeReader_getPath_1170023302308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112884;
     Object term113152;

    public JsonTreeReader_getPath_1170023302308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112884 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term112552 = (Object[]) newArray("java.lang.Object", 495);
        Object term112942 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term113000 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term113056 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term113094 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term112884, term112884.getClass(), "stackSize", 15);
        setElement(term112552, 0, term112942);
        setElement(term112552, 2, term113000);
        setElement(term112552, 9, term113056);
        setElement(term112552, 32, term113094);
        setField(term112884, term112884.getClass(), "stack", term112552);
        term113152 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term113153 = (Object[]) newArray("java.lang.Object", 495);
        Object term113154 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term113155 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term113156 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term113157 = newInstance(Class.forName("java.lang.Object"));
        setField(term113154, term113154.getClass(), "members", null);
        setElement(term113153, 0, term113154);
        setField(term113155, term113155.getClass(), "members", null);
        setElement(term113153, 2, term113155);
        setField(term113156, term113156.getClass(), "elements", null);
        setElement(term113153, 9, term113156);
        setElement(term113153, 32, term113157);
        setField(term113152, term113152.getClass(), "stack", term113153);
        setIntField(term113152, term113152.getClass(), "stackSize", 0);
        setField(term113152, term113152.getClass(), "pathNames", null);
        setField(term113152, term113152.getClass(), "pathIndices", null);
        setField(term113152, term113152.getClass(), "in", null);
        setBooleanField(term113152, term113152.getClass(), "lenient", false);
        setField(term113152, term113152.getClass(), "buffer", null);
        setIntField(term113152, term113152.getClass(), "pos", 0);
        setIntField(term113152, term113152.getClass(), "limit", 0);
        setIntField(term113152, term113152.getClass(), "lineNumber", 0);
        setIntField(term113152, term113152.getClass(), "lineStart", 0);
        setIntField(term113152, term113152.getClass(), "peeked", 0);
        setLongField(term113152, term113152.getClass(), "peekedLong", 0L);
        setIntField(term113152, term113152.getClass(), "peekedNumberLength", 0);
        setField(term113152, term113152.getClass(), "peekedString", null);
        setField(term113152, term113152.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term112884, args);
        assertTrue(recursiveEquals(term112884, term113152));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


