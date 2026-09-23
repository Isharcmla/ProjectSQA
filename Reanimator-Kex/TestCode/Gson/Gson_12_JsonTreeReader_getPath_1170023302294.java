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

public class JsonTreeReader_getPath_1170023302294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104591;
     Object term105054;

    public JsonTreeReader_getPath_1170023302294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104591 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term104291 = (Object[]) newArray("java.lang.Object", 495);
        Object term104649 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term104743 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term104837 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term104931 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term104989 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term104591, term104591.getClass(), "stackSize", 6);
        setElement(term104291, 1, term104649);
        setElement(term104291, 2, term104743);
        setElement(term104291, 3, term104837);
        setElement(term104291, 4, term104931);
        setElement(term104291, 5, term104989);
        setField(term104591, term104591.getClass(), "stack", term104291);
        term105054 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term105055 = (Object[]) newArray("java.lang.Object", 495);
        Object term105056 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term105057 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term105058 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term105059 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term105060 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setField(term105056, term105056.getClass(), "members", null);
        setElement(term105055, 1, term105056);
        setField(term105057, term105057.getClass(), "stack", null);
        setIntField(term105057, term105057.getClass(), "stackSize", 0);
        setField(term105057, term105057.getClass(), "pathNames", null);
        setField(term105057, term105057.getClass(), "pathIndices", null);
        setField(term105057, term105057.getClass(), "in", null);
        setBooleanField(term105057, term105057.getClass(), "lenient", false);
        setField(term105057, term105057.getClass(), "buffer", null);
        setIntField(term105057, term105057.getClass(), "pos", 0);
        setIntField(term105057, term105057.getClass(), "limit", 0);
        setIntField(term105057, term105057.getClass(), "lineNumber", 0);
        setIntField(term105057, term105057.getClass(), "lineStart", 0);
        setIntField(term105057, term105057.getClass(), "peeked", 0);
        setLongField(term105057, term105057.getClass(), "peekedLong", 0L);
        setIntField(term105057, term105057.getClass(), "peekedNumberLength", 0);
        setField(term105057, term105057.getClass(), "peekedString", null);
        setField(term105057, term105057.getClass(), "stack", null);
        setElement(term105055, 2, term105057);
        setField(term105058, term105058.getClass(), "stack", null);
        setIntField(term105058, term105058.getClass(), "stackSize", 0);
        setField(term105058, term105058.getClass(), "pathNames", null);
        setField(term105058, term105058.getClass(), "pathIndices", null);
        setField(term105058, term105058.getClass(), "in", null);
        setBooleanField(term105058, term105058.getClass(), "lenient", false);
        setField(term105058, term105058.getClass(), "buffer", null);
        setIntField(term105058, term105058.getClass(), "pos", 0);
        setIntField(term105058, term105058.getClass(), "limit", 0);
        setIntField(term105058, term105058.getClass(), "lineNumber", 0);
        setIntField(term105058, term105058.getClass(), "lineStart", 0);
        setIntField(term105058, term105058.getClass(), "peeked", 0);
        setLongField(term105058, term105058.getClass(), "peekedLong", 0L);
        setIntField(term105058, term105058.getClass(), "peekedNumberLength", 0);
        setField(term105058, term105058.getClass(), "peekedString", null);
        setField(term105058, term105058.getClass(), "stack", null);
        setElement(term105055, 3, term105058);
        setField(term105059, term105059.getClass(), "stack", null);
        setIntField(term105059, term105059.getClass(), "stackSize", 0);
        setField(term105059, term105059.getClass(), "pathNames", null);
        setField(term105059, term105059.getClass(), "pathIndices", null);
        setField(term105059, term105059.getClass(), "in", null);
        setBooleanField(term105059, term105059.getClass(), "lenient", false);
        setField(term105059, term105059.getClass(), "buffer", null);
        setIntField(term105059, term105059.getClass(), "pos", 0);
        setIntField(term105059, term105059.getClass(), "limit", 0);
        setIntField(term105059, term105059.getClass(), "lineNumber", 0);
        setIntField(term105059, term105059.getClass(), "lineStart", 0);
        setIntField(term105059, term105059.getClass(), "peeked", 0);
        setLongField(term105059, term105059.getClass(), "peekedLong", 0L);
        setIntField(term105059, term105059.getClass(), "peekedNumberLength", 0);
        setField(term105059, term105059.getClass(), "peekedString", null);
        setField(term105059, term105059.getClass(), "stack", null);
        setElement(term105055, 4, term105059);
        setField(term105060, term105060.getClass(), "members", null);
        setElement(term105055, 5, term105060);
        setField(term105054, term105054.getClass(), "stack", term105055);
        setIntField(term105054, term105054.getClass(), "stackSize", 0);
        setField(term105054, term105054.getClass(), "pathNames", null);
        setField(term105054, term105054.getClass(), "pathIndices", null);
        setField(term105054, term105054.getClass(), "in", null);
        setBooleanField(term105054, term105054.getClass(), "lenient", false);
        setField(term105054, term105054.getClass(), "buffer", null);
        setIntField(term105054, term105054.getClass(), "pos", 0);
        setIntField(term105054, term105054.getClass(), "limit", 0);
        setIntField(term105054, term105054.getClass(), "lineNumber", 0);
        setIntField(term105054, term105054.getClass(), "lineStart", 0);
        setIntField(term105054, term105054.getClass(), "peeked", 0);
        setLongField(term105054, term105054.getClass(), "peekedLong", 0L);
        setIntField(term105054, term105054.getClass(), "peekedNumberLength", 0);
        setField(term105054, term105054.getClass(), "peekedString", null);
        setField(term105054, term105054.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term104591, args);
        assertTrue(recursiveEquals(term104591, term105054));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


