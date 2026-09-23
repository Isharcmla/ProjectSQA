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

public class JsonTreeReader_close_108260688664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7919;
     Object term13012;

    public JsonTreeReader_close_108260688664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7919 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term7919, term7919.getClass(), "stack", null);
        setIntField(term7919, term7919.getClass(), "stackSize", 0);
        setField(term7919, term7919.getClass(), "pathNames", null);
        setField(term7919, term7919.getClass(), "pathIndices", null);
        setField(term7919, term7919.getClass(), "in", null);
        setBooleanField(term7919, term7919.getClass(), "lenient", false);
        setField(term7919, term7919.getClass(), "buffer", null);
        setIntField(term7919, term7919.getClass(), "pos", 0);
        setIntField(term7919, term7919.getClass(), "limit", 0);
        setIntField(term7919, term7919.getClass(), "lineNumber", 0);
        setIntField(term7919, term7919.getClass(), "lineStart", 0);
        setIntField(term7919, term7919.getClass(), "peeked", 0);
        setLongField(term7919, term7919.getClass(), "peekedLong", 0L);
        setIntField(term7919, term7919.getClass(), "peekedNumberLength", 0);
        setField(term7919, term7919.getClass(), "peekedString", null);
        setField(term7919, term7919.getClass(), "stack", null);
        term13012 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term13013 = (Object[]) newArray("java.lang.Object", 1);
        Object term13014 = newInstance(Class.forName("java.lang.Object"));
        setElement(term13013, 0, term13014);
        setField(term13012, term13012.getClass(), "stack", term13013);
        setIntField(term13012, term13012.getClass(), "stackSize", 0);
        setField(term13012, term13012.getClass(), "pathNames", null);
        setField(term13012, term13012.getClass(), "pathIndices", null);
        setField(term13012, term13012.getClass(), "in", null);
        setBooleanField(term13012, term13012.getClass(), "lenient", false);
        setField(term13012, term13012.getClass(), "buffer", null);
        setIntField(term13012, term13012.getClass(), "pos", 0);
        setIntField(term13012, term13012.getClass(), "limit", 0);
        setIntField(term13012, term13012.getClass(), "lineNumber", 0);
        setIntField(term13012, term13012.getClass(), "lineStart", 0);
        setIntField(term13012, term13012.getClass(), "peeked", 0);
        setLongField(term13012, term13012.getClass(), "peekedLong", 0L);
        setIntField(term13012, term13012.getClass(), "peekedNumberLength", 0);
        setField(term13012, term13012.getClass(), "peekedString", null);
        setField(term13012, term13012.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term7919, args);
        assertTrue(recursiveEquals(term7919, term13012));
    }

};


