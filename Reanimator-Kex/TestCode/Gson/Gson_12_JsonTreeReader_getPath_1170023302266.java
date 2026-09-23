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

public class JsonTreeReader_getPath_1170023302266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87026;
     Object term87147;

    public JsonTreeReader_getPath_1170023302266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87026 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term86879 = (Object[]) newArray("java.lang.Object", 491);
        Object term87082 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term87120 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term87026, term87026.getClass(), "stackSize", 4);
        setElement(term86879, 2, term87082);
        setElement(term86879, 256, term87120);
        setField(term87026, term87026.getClass(), "stack", term86879);
        term87147 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term87148 = (Object[]) newArray("java.lang.Object", 491);
        Object term87149 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term87150 = newInstance(Class.forName("java.lang.Object"));
        setField(term87149, term87149.getClass(), "elements", null);
        setElement(term87148, 2, term87149);
        setElement(term87148, 256, term87150);
        setField(term87147, term87147.getClass(), "stack", term87148);
        setIntField(term87147, term87147.getClass(), "stackSize", 0);
        setField(term87147, term87147.getClass(), "pathNames", null);
        setField(term87147, term87147.getClass(), "pathIndices", null);
        setField(term87147, term87147.getClass(), "in", null);
        setBooleanField(term87147, term87147.getClass(), "lenient", false);
        setField(term87147, term87147.getClass(), "buffer", null);
        setIntField(term87147, term87147.getClass(), "pos", 0);
        setIntField(term87147, term87147.getClass(), "limit", 0);
        setIntField(term87147, term87147.getClass(), "lineNumber", 0);
        setIntField(term87147, term87147.getClass(), "lineStart", 0);
        setIntField(term87147, term87147.getClass(), "peeked", 0);
        setLongField(term87147, term87147.getClass(), "peekedLong", 0L);
        setIntField(term87147, term87147.getClass(), "peekedNumberLength", 0);
        setField(term87147, term87147.getClass(), "peekedString", null);
        setField(term87147, term87147.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term87026, args);
        assertTrue(recursiveEquals(term87026, term87147));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


