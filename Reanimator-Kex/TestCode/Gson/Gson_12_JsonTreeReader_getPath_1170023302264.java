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

public class JsonTreeReader_getPath_1170023302264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86255;
     Object term86379;

    public JsonTreeReader_getPath_1170023302264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86255 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term86104 = (Object[]) newArray("java.lang.Object", 491);
        Object term86313 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term86351 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term86255, term86255.getClass(), "stackSize", 4);
        setElement(term86104, 2, term86313);
        setElement(term86104, 256, term86351);
        setField(term86255, term86255.getClass(), "stack", term86104);
        term86379 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term86380 = (Object[]) newArray("java.lang.Object", 491);
        Object term86381 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term86382 = newInstance(Class.forName("java.lang.Object"));
        setField(term86381, term86381.getClass(), "members", null);
        setElement(term86380, 2, term86381);
        setElement(term86380, 256, term86382);
        setField(term86379, term86379.getClass(), "stack", term86380);
        setIntField(term86379, term86379.getClass(), "stackSize", 0);
        setField(term86379, term86379.getClass(), "pathNames", null);
        setField(term86379, term86379.getClass(), "pathIndices", null);
        setField(term86379, term86379.getClass(), "in", null);
        setBooleanField(term86379, term86379.getClass(), "lenient", false);
        setField(term86379, term86379.getClass(), "buffer", null);
        setIntField(term86379, term86379.getClass(), "pos", 0);
        setIntField(term86379, term86379.getClass(), "limit", 0);
        setIntField(term86379, term86379.getClass(), "lineNumber", 0);
        setIntField(term86379, term86379.getClass(), "lineStart", 0);
        setIntField(term86379, term86379.getClass(), "peeked", 0);
        setLongField(term86379, term86379.getClass(), "peekedLong", 0L);
        setIntField(term86379, term86379.getClass(), "peekedNumberLength", 0);
        setField(term86379, term86379.getClass(), "peekedString", null);
        setField(term86379, term86379.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term86255, args);
        assertTrue(recursiveEquals(term86255, term86379));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


