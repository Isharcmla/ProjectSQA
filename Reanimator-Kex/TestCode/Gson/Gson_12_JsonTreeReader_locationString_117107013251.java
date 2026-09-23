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

public class JsonTreeReader_locationString_117107013251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76154;
     Object term76600;

    public JsonTreeReader_locationString_117107013251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76154 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term76002 = (Object[]) newArray("java.lang.Object", 18);
        byte[] term76003 = (byte[]) newByteArray(0);
        setIntField(term76154, term76154.getClass(), "stackSize", 6);
        setElement(term76002, 0, term76003);
        setField(term76154, term76154.getClass(), "stack", term76002);
        term76600 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term76601 = (Object[]) newArray("java.lang.Object", 18);
        byte[] term76602 = (byte[]) newByteArray(0);
        setElement(term76601, 0, term76602);
        setField(term76600, term76600.getClass(), "stack", term76601);
        setIntField(term76600, term76600.getClass(), "stackSize", 0);
        setField(term76600, term76600.getClass(), "pathNames", null);
        setField(term76600, term76600.getClass(), "pathIndices", null);
        setField(term76600, term76600.getClass(), "in", null);
        setBooleanField(term76600, term76600.getClass(), "lenient", false);
        setField(term76600, term76600.getClass(), "buffer", null);
        setIntField(term76600, term76600.getClass(), "pos", 0);
        setIntField(term76600, term76600.getClass(), "limit", 0);
        setIntField(term76600, term76600.getClass(), "lineNumber", 0);
        setIntField(term76600, term76600.getClass(), "lineStart", 0);
        setIntField(term76600, term76600.getClass(), "peeked", 0);
        setLongField(term76600, term76600.getClass(), "peekedLong", 0L);
        setIntField(term76600, term76600.getClass(), "peekedNumberLength", 0);
        setField(term76600, term76600.getClass(), "peekedString", null);
        setField(term76600, term76600.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term76154, args);
        assertTrue(recursiveEquals(term76154, term76600));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


