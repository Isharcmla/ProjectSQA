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

public class JsonTreeReader_getPath_1170023302276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94495;
     Object term94616;

    public JsonTreeReader_getPath_1170023302276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94495 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term94232 = (Object[]) newArray("java.lang.Object", 35);
        Object term94553 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term94591 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term94495, term94495.getClass(), "stackSize", 3);
        setElement(term94232, 0, term94553);
        setElement(term94232, 32, term94591);
        setField(term94495, term94495.getClass(), "stack", term94232);
        term94616 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term94617 = (Object[]) newArray("java.lang.Object", 35);
        Object term94618 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term94619 = newInstance(Class.forName("java.lang.Object"));
        setField(term94618, term94618.getClass(), "members", null);
        setElement(term94617, 0, term94618);
        setElement(term94617, 32, term94619);
        setField(term94616, term94616.getClass(), "stack", term94617);
        setIntField(term94616, term94616.getClass(), "stackSize", 0);
        setField(term94616, term94616.getClass(), "pathNames", null);
        setField(term94616, term94616.getClass(), "pathIndices", null);
        setField(term94616, term94616.getClass(), "in", null);
        setBooleanField(term94616, term94616.getClass(), "lenient", false);
        setField(term94616, term94616.getClass(), "buffer", null);
        setIntField(term94616, term94616.getClass(), "pos", 0);
        setIntField(term94616, term94616.getClass(), "limit", 0);
        setIntField(term94616, term94616.getClass(), "lineNumber", 0);
        setIntField(term94616, term94616.getClass(), "lineStart", 0);
        setIntField(term94616, term94616.getClass(), "peeked", 0);
        setLongField(term94616, term94616.getClass(), "peekedLong", 0L);
        setIntField(term94616, term94616.getClass(), "peekedNumberLength", 0);
        setField(term94616, term94616.getClass(), "peekedString", null);
        setField(term94616, term94616.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term94495, args);
        assertTrue(recursiveEquals(term94495, term94616));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


