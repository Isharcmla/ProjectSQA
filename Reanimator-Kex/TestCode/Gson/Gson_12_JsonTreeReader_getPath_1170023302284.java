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

public class JsonTreeReader_getPath_1170023302284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98289;
     Object term98463;

    public JsonTreeReader_getPath_1170023302284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term98349 = new StringBuilder();
        term98289 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term97992 = (Object[]) newArray("java.lang.Object", 495);
        Object term98407 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term98289, term98289.getClass(), "stackSize", 7);
        setElement(term97992, 0, term98349);
        setElement(term97992, 1, term98407);
        setField(term98289, term98289.getClass(), "stack", term97992);
        term98463 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term98464 = (Object[]) newArray("java.lang.Object", 495);
        Object term98465 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term98466 = (byte[]) newByteArray(16);
        Object term98467 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setField(term98465, term98465.getClass(), "value", term98466);
        setByteField(term98465, term98465.getClass(), "coder", (byte) 0);
        setIntField(term98465, term98465.getClass(), "count", 0);
        setElement(term98464, 0, term98465);
        setField(term98467, term98467.getClass(), "members", null);
        setElement(term98464, 1, term98467);
        setField(term98463, term98463.getClass(), "stack", term98464);
        setIntField(term98463, term98463.getClass(), "stackSize", 0);
        setField(term98463, term98463.getClass(), "pathNames", null);
        setField(term98463, term98463.getClass(), "pathIndices", null);
        setField(term98463, term98463.getClass(), "in", null);
        setBooleanField(term98463, term98463.getClass(), "lenient", false);
        setField(term98463, term98463.getClass(), "buffer", null);
        setIntField(term98463, term98463.getClass(), "pos", 0);
        setIntField(term98463, term98463.getClass(), "limit", 0);
        setIntField(term98463, term98463.getClass(), "lineNumber", 0);
        setIntField(term98463, term98463.getClass(), "lineStart", 0);
        setIntField(term98463, term98463.getClass(), "peeked", 0);
        setLongField(term98463, term98463.getClass(), "peekedLong", 0L);
        setIntField(term98463, term98463.getClass(), "peekedNumberLength", 0);
        setField(term98463, term98463.getClass(), "peekedString", null);
        setField(term98463, term98463.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term98289, args);
        assertTrue(recursiveEquals(term98289, term98463));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


