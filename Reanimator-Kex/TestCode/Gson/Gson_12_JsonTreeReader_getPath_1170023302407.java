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
import java.lang.StringBuilder;

public class JsonTreeReader_getPath_1170023302407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170844;
     Object term171959;

    public JsonTreeReader_getPath_1170023302407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term171210 = new StringBuilder();
        term170844 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term170532 = (Object[]) newArray("java.lang.Object", 247);
        Object term170902 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term170940 = newInstance(Class.forName("java.lang.Object"));
        Object term170998 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term171056 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term171150 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setIntField(term170844, term170844.getClass(), "stackSize", 7);
        setElement(term170532, 0, term170902);
        setElement(term170532, 1, term170940);
        setElement(term170532, 2, term170998);
        setElement(term170532, 3, term171056);
        setElement(term170532, 4, term171150);
        setElement(term170532, 6, term171210);
        setElement(term170532, 64, term171150);
        setField(term170844, term170844.getClass(), "stack", term170532);
        term171959 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term171960 = (Object[]) newArray("java.lang.Object", 247);
        Object term171961 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term171962 = newInstance(Class.forName("java.lang.Object"));
        Object term171963 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term171964 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term171965 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term171966 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term171967 = (byte[]) newByteArray(16);
        setField(term171961, term171961.getClass(), "members", null);
        setElement(term171960, 0, term171961);
        setElement(term171960, 1, term171962);
        setField(term171963, term171963.getClass(), "members", null);
        setElement(term171960, 2, term171963);
        setField(term171964, term171964.getClass(), "members", null);
        setElement(term171960, 3, term171964);
        setField(term171965, term171965.getClass(), "stack", null);
        setIntField(term171965, term171965.getClass(), "stackSize", 0);
        setField(term171965, term171965.getClass(), "pathNames", null);
        setField(term171965, term171965.getClass(), "pathIndices", null);
        setField(term171965, term171965.getClass(), "in", null);
        setBooleanField(term171965, term171965.getClass(), "lenient", false);
        setField(term171965, term171965.getClass(), "buffer", null);
        setIntField(term171965, term171965.getClass(), "pos", 0);
        setIntField(term171965, term171965.getClass(), "limit", 0);
        setIntField(term171965, term171965.getClass(), "lineNumber", 0);
        setIntField(term171965, term171965.getClass(), "lineStart", 0);
        setIntField(term171965, term171965.getClass(), "peeked", 0);
        setLongField(term171965, term171965.getClass(), "peekedLong", 0L);
        setIntField(term171965, term171965.getClass(), "peekedNumberLength", 0);
        setField(term171965, term171965.getClass(), "peekedString", null);
        setField(term171965, term171965.getClass(), "stack", null);
        setElement(term171960, 4, term171965);
        setField(term171966, term171966.getClass(), "value", term171967);
        setByteField(term171966, term171966.getClass(), "coder", (byte) 0);
        setIntField(term171966, term171966.getClass(), "count", 0);
        setElement(term171960, 6, term171966);
        setElement(term171960, 64, term171965);
        setField(term171959, term171959.getClass(), "stack", term171960);
        setIntField(term171959, term171959.getClass(), "stackSize", 0);
        setField(term171959, term171959.getClass(), "pathNames", null);
        setField(term171959, term171959.getClass(), "pathIndices", null);
        setField(term171959, term171959.getClass(), "in", null);
        setBooleanField(term171959, term171959.getClass(), "lenient", false);
        setField(term171959, term171959.getClass(), "buffer", null);
        setIntField(term171959, term171959.getClass(), "pos", 0);
        setIntField(term171959, term171959.getClass(), "limit", 0);
        setIntField(term171959, term171959.getClass(), "lineNumber", 0);
        setIntField(term171959, term171959.getClass(), "lineStart", 0);
        setIntField(term171959, term171959.getClass(), "peeked", 0);
        setLongField(term171959, term171959.getClass(), "peekedLong", 0L);
        setIntField(term171959, term171959.getClass(), "peekedNumberLength", 0);
        setField(term171959, term171959.getClass(), "peekedString", null);
        setField(term171959, term171959.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term170844, args);
        assertTrue(recursiveEquals(term170844, term171959));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


