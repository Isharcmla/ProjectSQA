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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199033;
     Object term199125;
     Object term199353;
     Object term199354;
     Object term199317;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199033 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term199125 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term199217 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term199309 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term199217, term199217.getClass(), "next", term199309);
        setIntField(term199217, term199217.getClass(), "type", 39);
        setField(term199125, term199125.getClass(), "first", term199217);
        setIntField(term199125, term199125.getClass(), "type", 11);
        term199353 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term199353, term199353.getClass(), "currentTraversal", null);
        term199354 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term199355 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term199356 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term199354, term199354.getClass(), "str", null);
        setIntField(term199354, term199354.getClass(), "type", 11);
        setField(term199354, term199354.getClass(), "next", null);
        setField(term199355, term199355.getClass(), "str", null);
        setIntField(term199355, term199355.getClass(), "type", 39);
        setDoubleField(term199356, term199356.getClass(), "number", 0.0);
        setIntField(term199356, term199356.getClass(), "type", 0);
        setField(term199356, term199356.getClass(), "next", null);
        setField(term199356, term199356.getClass(), "first", null);
        setField(term199356, term199356.getClass(), "last", null);
        setField(term199356, term199356.getClass(), "propListHead", null);
        setIntField(term199356, term199356.getClass(), "sourcePosition", 0);
        setField(term199356, term199356.getClass(), "jsType", null);
        setField(term199356, term199356.getClass(), "parent", null);
        setField(term199355, term199355.getClass(), "next", term199356);
        setField(term199355, term199355.getClass(), "first", null);
        setField(term199355, term199355.getClass(), "last", null);
        setField(term199355, term199355.getClass(), "propListHead", null);
        setIntField(term199355, term199355.getClass(), "sourcePosition", 0);
        setField(term199355, term199355.getClass(), "jsType", null);
        setField(term199355, term199355.getClass(), "parent", null);
        setField(term199354, term199354.getClass(), "first", term199355);
        setField(term199354, term199354.getClass(), "last", null);
        setField(term199354, term199354.getClass(), "propListHead", null);
        setIntField(term199354, term199354.getClass(), "sourcePosition", 0);
        setField(term199354, term199354.getClass(), "jsType", null);
        setField(term199354, term199354.getClass(), "parent", null);
        term199317 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term199319 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term199321 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term199317, term199317.getClass(), "str", null);
        setIntField(term199317, term199317.getClass(), "type", 11);
        setField(term199317, term199317.getClass(), "next", null);
        setField(term199319, term199319.getClass(), "str", null);
        setIntField(term199319, term199319.getClass(), "type", 39);
        setDoubleField(term199321, term199321.getClass(), "number", 0.0);
        setIntField(term199321, term199321.getClass(), "type", 0);
        setField(term199321, term199321.getClass(), "next", null);
        setField(term199321, term199321.getClass(), "first", null);
        setField(term199321, term199321.getClass(), "last", null);
        setField(term199321, term199321.getClass(), "propListHead", null);
        setIntField(term199321, term199321.getClass(), "sourcePosition", 0);
        setField(term199321, term199321.getClass(), "jsType", null);
        setField(term199321, term199321.getClass(), "parent", null);
        setField(term199319, term199319.getClass(), "next", term199321);
        setField(term199319, term199319.getClass(), "first", null);
        setField(term199319, term199319.getClass(), "last", null);
        setField(term199319, term199319.getClass(), "propListHead", null);
        setIntField(term199319, term199319.getClass(), "sourcePosition", 0);
        setField(term199319, term199319.getClass(), "jsType", null);
        setField(term199319, term199319.getClass(), "parent", null);
        setField(term199317, term199317.getClass(), "first", term199319);
        setField(term199317, term199317.getClass(), "last", null);
        setField(term199317, term199317.getClass(), "propListHead", null);
        setIntField(term199317, term199317.getClass(), "sourcePosition", 0);
        setField(term199317, term199317.getClass(), "jsType", null);
        setField(term199317, term199317.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term199125;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term199033, args);
        assertTrue(recursiveEquals(term199033, term199353));
        assertTrue(recursiveEquals(term199125, term199354));
        assertTrue(recursiveEquals(retValue, term199317));
    }

};


