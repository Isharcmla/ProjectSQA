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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133030;
     Object term133122;
     Object term133366;
     Object term133367;
     Object term133315;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133030 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term133122 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133214 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133306 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term133306, term133306.getClass(), "type", 42);
        setField(term133214, term133214.getClass(), "next", term133306);
        setIntField(term133214, term133214.getClass(), "type", 42);
        setField(term133122, term133122.getClass(), "first", term133214);
        setIntField(term133122, term133122.getClass(), "type", 16);
        term133366 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term133366, term133366.getClass(), "currentTraversal", null);
        term133367 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133368 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133369 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term133367, term133367.getClass(), "number", 0.0);
        setIntField(term133367, term133367.getClass(), "type", 16);
        setField(term133367, term133367.getClass(), "next", null);
        setDoubleField(term133368, term133368.getClass(), "number", 0.0);
        setIntField(term133368, term133368.getClass(), "type", 42);
        setDoubleField(term133369, term133369.getClass(), "number", 0.0);
        setIntField(term133369, term133369.getClass(), "type", 42);
        setField(term133369, term133369.getClass(), "next", null);
        setField(term133369, term133369.getClass(), "first", null);
        setField(term133369, term133369.getClass(), "last", null);
        setField(term133369, term133369.getClass(), "propListHead", null);
        setIntField(term133369, term133369.getClass(), "sourcePosition", 0);
        setField(term133369, term133369.getClass(), "jsType", null);
        setField(term133369, term133369.getClass(), "parent", null);
        setField(term133368, term133368.getClass(), "next", term133369);
        setField(term133368, term133368.getClass(), "first", null);
        setField(term133368, term133368.getClass(), "last", null);
        setField(term133368, term133368.getClass(), "propListHead", null);
        setIntField(term133368, term133368.getClass(), "sourcePosition", 0);
        setField(term133368, term133368.getClass(), "jsType", null);
        setField(term133368, term133368.getClass(), "parent", null);
        setField(term133367, term133367.getClass(), "first", term133368);
        setField(term133367, term133367.getClass(), "last", null);
        setField(term133367, term133367.getClass(), "propListHead", null);
        setIntField(term133367, term133367.getClass(), "sourcePosition", 0);
        setField(term133367, term133367.getClass(), "jsType", null);
        setField(term133367, term133367.getClass(), "parent", null);
        term133315 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133318 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133321 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term133315, term133315.getClass(), "number", 0.0);
        setIntField(term133315, term133315.getClass(), "type", 16);
        setField(term133315, term133315.getClass(), "next", null);
        setDoubleField(term133318, term133318.getClass(), "number", 0.0);
        setIntField(term133318, term133318.getClass(), "type", 42);
        setDoubleField(term133321, term133321.getClass(), "number", 0.0);
        setIntField(term133321, term133321.getClass(), "type", 42);
        setField(term133321, term133321.getClass(), "next", null);
        setField(term133321, term133321.getClass(), "first", null);
        setField(term133321, term133321.getClass(), "last", null);
        setField(term133321, term133321.getClass(), "propListHead", null);
        setIntField(term133321, term133321.getClass(), "sourcePosition", 0);
        setField(term133321, term133321.getClass(), "jsType", null);
        setField(term133321, term133321.getClass(), "parent", null);
        setField(term133318, term133318.getClass(), "next", term133321);
        setField(term133318, term133318.getClass(), "first", null);
        setField(term133318, term133318.getClass(), "last", null);
        setField(term133318, term133318.getClass(), "propListHead", null);
        setIntField(term133318, term133318.getClass(), "sourcePosition", 0);
        setField(term133318, term133318.getClass(), "jsType", null);
        setField(term133318, term133318.getClass(), "parent", null);
        setField(term133315, term133315.getClass(), "first", term133318);
        setField(term133315, term133315.getClass(), "last", null);
        setField(term133315, term133315.getClass(), "propListHead", null);
        setIntField(term133315, term133315.getClass(), "sourcePosition", 0);
        setField(term133315, term133315.getClass(), "jsType", null);
        setField(term133315, term133315.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term133122;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term133030, args);
        assertTrue(recursiveEquals(term133030, term133366));
        assertTrue(recursiveEquals(term133122, term133367));
        assertTrue(recursiveEquals(retValue, term133315));
    }

};


