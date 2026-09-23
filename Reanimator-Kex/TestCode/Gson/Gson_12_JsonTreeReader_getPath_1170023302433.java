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

public class JsonTreeReader_getPath_1170023302433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182438;
     Object term183701;

    public JsonTreeReader_getPath_1170023302433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term182556 = new StringBuilder();
        term182438 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term182121 = (Object[]) newArray("java.lang.Object", 495);
        Object term182496 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term182594 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term182438, term182438.getClass(), "stackSize", 8);
        setElement(term182121, 0, term182496);
        setElement(term182121, 2, term182496);
        setElement(term182121, 6, term182556);
        setElement(term182121, 8, term182594);
        setField(term182438, term182438.getClass(), "stack", term182121);
        term183701 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term183702 = (Object[]) newArray("java.lang.Object", 495);
        Object term183703 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term183704 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term183705 = (byte[]) newByteArray(16);
        Object term183706 = newInstance(Class.forName("java.lang.Object"));
        setField(term183703, term183703.getClass(), "members", null);
        setElement(term183702, 0, term183703);
        setElement(term183702, 2, term183703);
        setField(term183704, term183704.getClass(), "value", term183705);
        setByteField(term183704, term183704.getClass(), "coder", (byte) 0);
        setIntField(term183704, term183704.getClass(), "count", 0);
        setElement(term183702, 6, term183704);
        setElement(term183702, 8, term183706);
        setField(term183701, term183701.getClass(), "stack", term183702);
        setIntField(term183701, term183701.getClass(), "stackSize", 0);
        setField(term183701, term183701.getClass(), "pathNames", null);
        setField(term183701, term183701.getClass(), "pathIndices", null);
        setField(term183701, term183701.getClass(), "in", null);
        setBooleanField(term183701, term183701.getClass(), "lenient", false);
        setField(term183701, term183701.getClass(), "buffer", null);
        setIntField(term183701, term183701.getClass(), "pos", 0);
        setIntField(term183701, term183701.getClass(), "limit", 0);
        setIntField(term183701, term183701.getClass(), "lineNumber", 0);
        setIntField(term183701, term183701.getClass(), "lineStart", 0);
        setIntField(term183701, term183701.getClass(), "peeked", 0);
        setLongField(term183701, term183701.getClass(), "peekedLong", 0L);
        setIntField(term183701, term183701.getClass(), "peekedNumberLength", 0);
        setField(term183701, term183701.getClass(), "peekedString", null);
        setField(term183701, term183701.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term182438, args);
        assertTrue(recursiveEquals(term182438, term183701));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


