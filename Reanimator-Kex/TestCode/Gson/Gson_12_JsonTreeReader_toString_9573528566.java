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

public class JsonTreeReader_toString_9573528566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7941;
     Object term13318;

    public JsonTreeReader_toString_9573528566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7941 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term7941, term7941.getClass(), "stack", null);
        setIntField(term7941, term7941.getClass(), "stackSize", 0);
        setField(term7941, term7941.getClass(), "pathNames", null);
        setField(term7941, term7941.getClass(), "pathIndices", null);
        setField(term7941, term7941.getClass(), "in", null);
        setBooleanField(term7941, term7941.getClass(), "lenient", false);
        setField(term7941, term7941.getClass(), "buffer", null);
        setIntField(term7941, term7941.getClass(), "pos", 0);
        setIntField(term7941, term7941.getClass(), "limit", 0);
        setIntField(term7941, term7941.getClass(), "lineNumber", 0);
        setIntField(term7941, term7941.getClass(), "lineStart", 0);
        setIntField(term7941, term7941.getClass(), "peeked", 0);
        setLongField(term7941, term7941.getClass(), "peekedLong", 0L);
        setIntField(term7941, term7941.getClass(), "peekedNumberLength", 0);
        setField(term7941, term7941.getClass(), "peekedString", null);
        setField(term7941, term7941.getClass(), "stack", null);
        term13318 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term13318, term13318.getClass(), "stack", null);
        setIntField(term13318, term13318.getClass(), "stackSize", 0);
        setField(term13318, term13318.getClass(), "pathNames", null);
        setField(term13318, term13318.getClass(), "pathIndices", null);
        setField(term13318, term13318.getClass(), "in", null);
        setBooleanField(term13318, term13318.getClass(), "lenient", false);
        setField(term13318, term13318.getClass(), "buffer", null);
        setIntField(term13318, term13318.getClass(), "pos", 0);
        setIntField(term13318, term13318.getClass(), "limit", 0);
        setIntField(term13318, term13318.getClass(), "lineNumber", 0);
        setIntField(term13318, term13318.getClass(), "lineStart", 0);
        setIntField(term13318, term13318.getClass(), "peeked", 0);
        setLongField(term13318, term13318.getClass(), "peekedLong", 0L);
        setIntField(term13318, term13318.getClass(), "peekedNumberLength", 0);
        setField(term13318, term13318.getClass(), "peekedString", null);
        setField(term13318, term13318.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term7941, args);
        assertTrue(recursiveEquals(term7941, term13318));
        assertTrue(recursiveEquals(retValue, "JsonTreeReader"));
    }

};


