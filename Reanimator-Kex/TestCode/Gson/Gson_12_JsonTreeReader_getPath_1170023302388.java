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

public class JsonTreeReader_getPath_1170023302388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161923;
     Object term162172;

    public JsonTreeReader_getPath_1170023302388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161923 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term161636 = (Object[]) newArray("java.lang.Object", 495);
        Object term161979 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term162073 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term162129 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term161923, term161923.getClass(), "stackSize", 7);
        setElement(term161636, 0, term161979);
        setElement(term161636, 1, term162073);
        setElement(term161636, 3, term162129);
        setField(term161923, term161923.getClass(), "stack", term161636);
        term162172 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term162173 = (Object[]) newArray("java.lang.Object", 495);
        Object term162174 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term162175 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term162176 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term162174, term162174.getClass(), "elements", null);
        setElement(term162173, 0, term162174);
        setField(term162175, term162175.getClass(), "stack", null);
        setIntField(term162175, term162175.getClass(), "stackSize", 0);
        setField(term162175, term162175.getClass(), "pathNames", null);
        setField(term162175, term162175.getClass(), "pathIndices", null);
        setField(term162175, term162175.getClass(), "in", null);
        setBooleanField(term162175, term162175.getClass(), "lenient", false);
        setField(term162175, term162175.getClass(), "buffer", null);
        setIntField(term162175, term162175.getClass(), "pos", 0);
        setIntField(term162175, term162175.getClass(), "limit", 0);
        setIntField(term162175, term162175.getClass(), "lineNumber", 0);
        setIntField(term162175, term162175.getClass(), "lineStart", 0);
        setIntField(term162175, term162175.getClass(), "peeked", 0);
        setLongField(term162175, term162175.getClass(), "peekedLong", 0L);
        setIntField(term162175, term162175.getClass(), "peekedNumberLength", 0);
        setField(term162175, term162175.getClass(), "peekedString", null);
        setField(term162175, term162175.getClass(), "stack", null);
        setElement(term162173, 1, term162175);
        setField(term162176, term162176.getClass(), "elements", null);
        setElement(term162173, 3, term162176);
        setField(term162172, term162172.getClass(), "stack", term162173);
        setIntField(term162172, term162172.getClass(), "stackSize", 0);
        setField(term162172, term162172.getClass(), "pathNames", null);
        setField(term162172, term162172.getClass(), "pathIndices", null);
        setField(term162172, term162172.getClass(), "in", null);
        setBooleanField(term162172, term162172.getClass(), "lenient", false);
        setField(term162172, term162172.getClass(), "buffer", null);
        setIntField(term162172, term162172.getClass(), "pos", 0);
        setIntField(term162172, term162172.getClass(), "limit", 0);
        setIntField(term162172, term162172.getClass(), "lineNumber", 0);
        setIntField(term162172, term162172.getClass(), "lineStart", 0);
        setIntField(term162172, term162172.getClass(), "peeked", 0);
        setLongField(term162172, term162172.getClass(), "peekedLong", 0L);
        setIntField(term162172, term162172.getClass(), "peekedNumberLength", 0);
        setField(term162172, term162172.getClass(), "peekedString", null);
        setField(term162172, term162172.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term161923, args);
        assertTrue(recursiveEquals(term161923, term162172));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


