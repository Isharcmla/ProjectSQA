package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class NodeUtil_canBeSideEffected_2078426861499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65252;
     Object term73559;

    public NodeUtil_canBeSideEffected_2078426861499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65252 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term65344 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term65436 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term65528 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term65252, term65252.getClass(), "type", 0);
        setIntField(term65344, term65344.getClass(), "type", 0);
        setIntField(term65436, term65436.getClass(), "type", 0);
        setField(term65436, term65436.getClass(), "first", null);
        setField(term65436, term65436.getClass(), "next", null);
        setField(term65344, term65344.getClass(), "first", term65436);
        setField(term65344, term65344.getClass(), "next", term65528);
        setField(term65252, term65252.getClass(), "first", term65344);
        term73559 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term73560 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term73561 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term73562 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term73559, term73559.getClass(), "str", null);
        setIntField(term73559, term73559.getClass(), "type", 0);
        setField(term73559, term73559.getClass(), "next", null);
        setField(term73560, term73560.getClass(), "str", null);
        setIntField(term73560, term73560.getClass(), "type", 0);
        setField(term73561, term73561.getClass(), "str", null);
        setIntField(term73561, term73561.getClass(), "type", 0);
        setField(term73561, term73561.getClass(), "next", null);
        setField(term73561, term73561.getClass(), "first", null);
        setField(term73561, term73561.getClass(), "last", null);
        setField(term73561, term73561.getClass(), "propListHead", null);
        setIntField(term73561, term73561.getClass(), "sourcePosition", 0);
        setField(term73561, term73561.getClass(), "jsType", null);
        setField(term73561, term73561.getClass(), "parent", null);
        setField(term73560, term73560.getClass(), "next", term73561);
        setField(term73562, term73562.getClass(), "str", null);
        setIntField(term73562, term73562.getClass(), "type", 0);
        setField(term73562, term73562.getClass(), "next", null);
        setField(term73562, term73562.getClass(), "first", null);
        setField(term73562, term73562.getClass(), "last", null);
        setField(term73562, term73562.getClass(), "propListHead", null);
        setIntField(term73562, term73562.getClass(), "sourcePosition", 0);
        setField(term73562, term73562.getClass(), "jsType", null);
        setField(term73562, term73562.getClass(), "parent", null);
        setField(term73560, term73560.getClass(), "first", term73562);
        setField(term73560, term73560.getClass(), "last", null);
        setField(term73560, term73560.getClass(), "propListHead", null);
        setIntField(term73560, term73560.getClass(), "sourcePosition", 0);
        setField(term73560, term73560.getClass(), "jsType", null);
        setField(term73560, term73560.getClass(), "parent", null);
        setField(term73559, term73559.getClass(), "first", term73560);
        setField(term73559, term73559.getClass(), "last", null);
        setField(term73559, term73559.getClass(), "propListHead", null);
        setIntField(term73559, term73559.getClass(), "sourcePosition", 0);
        setField(term73559, term73559.getClass(), "jsType", null);
        setField(term73559, term73559.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term65252;
        args[1] = null;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term65252, term73559));
        assertTrue(recursiveEquals(retValue, false));
    }

};


