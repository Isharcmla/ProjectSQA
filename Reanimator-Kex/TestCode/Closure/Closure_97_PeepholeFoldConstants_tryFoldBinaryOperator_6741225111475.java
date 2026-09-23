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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548805;
     Object term548897;
     Object term549516;
     Object term549517;
     Object term549467;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term548805 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term548897 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term548989 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term549081 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term548989, term548989.getClass(), "next", term549081);
        setField(term548897, term548897.getClass(), "first", term548989);
        setIntField(term548897, term548897.getClass(), "type", 16);
        term549516 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term549516, term549516.getClass(), "currentTraversal", null);
        term549517 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term549518 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term549519 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term549517, term549517.getClass(), "number", 0.0);
        setIntField(term549517, term549517.getClass(), "type", 16);
        setField(term549517, term549517.getClass(), "next", null);
        setDoubleField(term549518, term549518.getClass(), "number", 0.0);
        setIntField(term549518, term549518.getClass(), "type", 0);
        setDoubleField(term549519, term549519.getClass(), "number", 0.0);
        setIntField(term549519, term549519.getClass(), "type", 0);
        setField(term549519, term549519.getClass(), "next", null);
        setField(term549519, term549519.getClass(), "first", null);
        setField(term549519, term549519.getClass(), "last", null);
        setField(term549519, term549519.getClass(), "propListHead", null);
        setIntField(term549519, term549519.getClass(), "sourcePosition", 0);
        setField(term549519, term549519.getClass(), "jsType", null);
        setField(term549519, term549519.getClass(), "parent", null);
        setField(term549518, term549518.getClass(), "next", term549519);
        setField(term549518, term549518.getClass(), "first", null);
        setField(term549518, term549518.getClass(), "last", null);
        setField(term549518, term549518.getClass(), "propListHead", null);
        setIntField(term549518, term549518.getClass(), "sourcePosition", 0);
        setField(term549518, term549518.getClass(), "jsType", null);
        setField(term549518, term549518.getClass(), "parent", null);
        setField(term549517, term549517.getClass(), "first", term549518);
        setField(term549517, term549517.getClass(), "last", null);
        setField(term549517, term549517.getClass(), "propListHead", null);
        setIntField(term549517, term549517.getClass(), "sourcePosition", 0);
        setField(term549517, term549517.getClass(), "jsType", null);
        setField(term549517, term549517.getClass(), "parent", null);
        term549467 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term549470 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term549473 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term549467, term549467.getClass(), "number", 0.0);
        setIntField(term549467, term549467.getClass(), "type", 16);
        setField(term549467, term549467.getClass(), "next", null);
        setDoubleField(term549470, term549470.getClass(), "number", 0.0);
        setIntField(term549470, term549470.getClass(), "type", 0);
        setDoubleField(term549473, term549473.getClass(), "number", 0.0);
        setIntField(term549473, term549473.getClass(), "type", 0);
        setField(term549473, term549473.getClass(), "next", null);
        setField(term549473, term549473.getClass(), "first", null);
        setField(term549473, term549473.getClass(), "last", null);
        setField(term549473, term549473.getClass(), "propListHead", null);
        setIntField(term549473, term549473.getClass(), "sourcePosition", 0);
        setField(term549473, term549473.getClass(), "jsType", null);
        setField(term549473, term549473.getClass(), "parent", null);
        setField(term549470, term549470.getClass(), "next", term549473);
        setField(term549470, term549470.getClass(), "first", null);
        setField(term549470, term549470.getClass(), "last", null);
        setField(term549470, term549470.getClass(), "propListHead", null);
        setIntField(term549470, term549470.getClass(), "sourcePosition", 0);
        setField(term549470, term549470.getClass(), "jsType", null);
        setField(term549470, term549470.getClass(), "parent", null);
        setField(term549467, term549467.getClass(), "first", term549470);
        setField(term549467, term549467.getClass(), "last", null);
        setField(term549467, term549467.getClass(), "propListHead", null);
        setIntField(term549467, term549467.getClass(), "sourcePosition", 0);
        setField(term549467, term549467.getClass(), "jsType", null);
        setField(term549467, term549467.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term548897;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term548805, args);
        assertTrue(recursiveEquals(term548805, term549516));
        assertTrue(recursiveEquals(term548897, term549517));
        assertTrue(recursiveEquals(retValue, term549467));
    }

};


