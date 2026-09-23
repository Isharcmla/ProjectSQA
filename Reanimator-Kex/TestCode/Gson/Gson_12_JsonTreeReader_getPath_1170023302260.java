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

public class JsonTreeReader_getPath_1170023302260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81875;
     Object term82152;

    public JsonTreeReader_getPath_1170023302260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81875 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term81563 = (Object[]) newArray("java.lang.Object", 138);
        Object term81931 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term82075 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$SubMap$SubMapEntryIterator"));
        int[] term81567 = (int[]) newIntArray(50);
        setIntField(term81875, term81875.getClass(), "stackSize", 3);
        setElement(term81563, 0, term81931);
        setElement(term81563, 1, term82075);
        setField(term81875, term81875.getClass(), "stack", term81563);
        setField(term81875, term81875.getClass(), "pathIndices", term81567);
        term82152 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term82153 = (Object[]) newArray("java.lang.Object", 138);
        Object term82154 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term82155 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$SubMap$SubMapEntryIterator"));
        setField(term82154, term82154.getClass(), "elements", null);
        setElement(term82153, 0, term82154);
        setField(term82155, term82155.getClass(), "this$0", null);
        setField(term82155, term82155.getClass(), "lastReturned", null);
        setField(term82155, term82155.getClass(), "next", null);
        setField(term82155, term82155.getClass(), "nextValue", null);
        setElement(term82153, 1, term82155);
        setField(term82152, term82152.getClass(), "stack", term82153);
        setIntField(term82152, term82152.getClass(), "stackSize", 0);
        setField(term82152, term82152.getClass(), "pathNames", null);
        setField(term82152, term82152.getClass(), "pathIndices", null);
        setField(term82152, term82152.getClass(), "in", null);
        setBooleanField(term82152, term82152.getClass(), "lenient", false);
        setField(term82152, term82152.getClass(), "buffer", null);
        setIntField(term82152, term82152.getClass(), "pos", 0);
        setIntField(term82152, term82152.getClass(), "limit", 0);
        setIntField(term82152, term82152.getClass(), "lineNumber", 0);
        setIntField(term82152, term82152.getClass(), "lineStart", 0);
        setIntField(term82152, term82152.getClass(), "peeked", 0);
        setLongField(term82152, term82152.getClass(), "peekedLong", 0L);
        setIntField(term82152, term82152.getClass(), "peekedNumberLength", 0);
        setField(term82152, term82152.getClass(), "peekedString", null);
        setField(term82152, term82152.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term81875, args);
        assertTrue(recursiveEquals(term81875, term82152));
        assertTrue(recursiveEquals(retValue, "$[0]"));
    }

};


