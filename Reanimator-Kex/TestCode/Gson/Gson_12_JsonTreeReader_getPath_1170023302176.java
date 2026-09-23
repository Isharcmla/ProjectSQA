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

public class JsonTreeReader_getPath_1170023302176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42784;
     Object term42845;

    public JsonTreeReader_getPath_1170023302176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42784 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term42653 = (Object[]) newArray("java.lang.Object", 489);
        Object term42822 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term42784, term42784.getClass(), "stackSize", 2);
        setElement(term42653, 128, term42822);
        setField(term42784, term42784.getClass(), "stack", term42653);
        term42845 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term42846 = (Object[]) newArray("java.lang.Object", 489);
        Object term42847 = newInstance(Class.forName("java.lang.Object"));
        setElement(term42846, 128, term42847);
        setField(term42845, term42845.getClass(), "stack", term42846);
        setIntField(term42845, term42845.getClass(), "stackSize", 0);
        setField(term42845, term42845.getClass(), "pathNames", null);
        setField(term42845, term42845.getClass(), "pathIndices", null);
        setField(term42845, term42845.getClass(), "in", null);
        setBooleanField(term42845, term42845.getClass(), "lenient", false);
        setField(term42845, term42845.getClass(), "buffer", null);
        setIntField(term42845, term42845.getClass(), "pos", 0);
        setIntField(term42845, term42845.getClass(), "limit", 0);
        setIntField(term42845, term42845.getClass(), "lineNumber", 0);
        setIntField(term42845, term42845.getClass(), "lineStart", 0);
        setIntField(term42845, term42845.getClass(), "peeked", 0);
        setLongField(term42845, term42845.getClass(), "peekedLong", 0L);
        setIntField(term42845, term42845.getClass(), "peekedNumberLength", 0);
        setField(term42845, term42845.getClass(), "peekedString", null);
        setField(term42845, term42845.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term42784, args);
        assertTrue(recursiveEquals(term42784, term42845));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


