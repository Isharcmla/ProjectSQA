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

public class NodeUtil_canBeSideEffected_2078426861469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40249;
     Object term40633;

    public NodeUtil_canBeSideEffected_2078426861469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40249 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term40341 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term40249, term40249.getClass(), "type", 4);
        setField(term40249, term40249.getClass(), "first", term40341);
        term40633 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term40634 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term40633, term40633.getClass(), "str", null);
        setIntField(term40633, term40633.getClass(), "type", 4);
        setField(term40633, term40633.getClass(), "next", null);
        setField(term40634, term40634.getClass(), "str", null);
        setIntField(term40634, term40634.getClass(), "type", 0);
        setField(term40634, term40634.getClass(), "next", null);
        setField(term40634, term40634.getClass(), "first", null);
        setField(term40634, term40634.getClass(), "last", null);
        setField(term40634, term40634.getClass(), "propListHead", null);
        setIntField(term40634, term40634.getClass(), "sourcePosition", 0);
        setField(term40634, term40634.getClass(), "jsType", null);
        setField(term40634, term40634.getClass(), "parent", null);
        setField(term40633, term40633.getClass(), "first", term40634);
        setField(term40633, term40633.getClass(), "last", null);
        setField(term40633, term40633.getClass(), "propListHead", null);
        setIntField(term40633, term40633.getClass(), "sourcePosition", 0);
        setField(term40633, term40633.getClass(), "jsType", null);
        setField(term40633, term40633.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term40249;
        args[1] = null;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term40249, term40633));
        assertTrue(recursiveEquals(retValue, false));
    }

};


