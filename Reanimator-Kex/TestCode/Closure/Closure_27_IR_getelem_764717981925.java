package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class IR_getelem_764717981925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146220;
     Object term146560;
     Object term146562;
     Object term146385;

    public IR_getelem_764717981925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term146220, term146220.getClass(), "type", 105);
        term146560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term146560, term146560.getClass(), "type", 105);
        setField(term146560, term146560.getClass(), "next", null);
        setField(term146560, term146560.getClass(), "first", null);
        setField(term146560, term146560.getClass(), "last", null);
        setField(term146560, term146560.getClass(), "propListHead", null);
        setIntField(term146560, term146560.getClass(), "sourcePosition", 0);
        setField(term146560, term146560.getClass(), "jsType", null);
        setIntField(term146561, term146561.getClass(), "type", 35);
        setField(term146561, term146561.getClass(), "next", null);
        setField(term146561, term146561.getClass(), "first", term146560);
        setField(term146561, term146561.getClass(), "last", term146560);
        setField(term146561, term146561.getClass(), "propListHead", null);
        setIntField(term146561, term146561.getClass(), "sourcePosition", -1);
        setField(term146561, term146561.getClass(), "jsType", null);
        setField(term146561, term146561.getClass(), "parent", null);
        setField(term146560, term146560.getClass(), "parent", term146561);
        term146562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term146562, term146562.getClass(), "type", 105);
        setField(term146562, term146562.getClass(), "next", null);
        setField(term146562, term146562.getClass(), "first", null);
        setField(term146562, term146562.getClass(), "last", null);
        setField(term146562, term146562.getClass(), "propListHead", null);
        setIntField(term146562, term146562.getClass(), "sourcePosition", 0);
        setField(term146562, term146562.getClass(), "jsType", null);
        setIntField(term146563, term146563.getClass(), "type", 35);
        setField(term146563, term146563.getClass(), "next", null);
        setField(term146563, term146563.getClass(), "first", term146562);
        setField(term146563, term146563.getClass(), "last", term146562);
        setField(term146563, term146563.getClass(), "propListHead", null);
        setIntField(term146563, term146563.getClass(), "sourcePosition", -1);
        setField(term146563, term146563.getClass(), "jsType", null);
        setField(term146563, term146563.getClass(), "parent", null);
        setField(term146562, term146562.getClass(), "parent", term146563);
        term146385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term146385, term146385.getClass(), "type", 35);
        setField(term146385, term146385.getClass(), "next", null);
        setIntField(term146382, term146382.getClass(), "type", 105);
        setField(term146382, term146382.getClass(), "next", null);
        setField(term146382, term146382.getClass(), "first", null);
        setField(term146382, term146382.getClass(), "last", null);
        setField(term146382, term146382.getClass(), "propListHead", null);
        setIntField(term146382, term146382.getClass(), "sourcePosition", 0);
        setField(term146382, term146382.getClass(), "jsType", null);
        setField(term146382, term146382.getClass(), "parent", term146385);
        setField(term146385, term146385.getClass(), "first", term146382);
        setField(term146385, term146385.getClass(), "last", term146382);
        setField(term146385, term146385.getClass(), "propListHead", null);
        setIntField(term146385, term146385.getClass(), "sourcePosition", -1);
        setField(term146385, term146385.getClass(), "jsType", null);
        setField(term146385, term146385.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term146220;
        args[1] = term146220;
        Object retValue = callMethod(klass, "getelem", argTypes, null, args);
        assertTrue(recursiveEquals(term146220, term146560));
        assertTrue(recursiveEquals(term146220, term146562));
        assertTrue(recursiveEquals(retValue, term146385));
    }

};


