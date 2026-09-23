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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241657;
     Object term241749;
     Object term242366;
     Object term242367;
     Object term242332;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241657 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term241749 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241841 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241933 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term241841, term241841.getClass(), "next", term241933);
        setField(term241749, term241749.getClass(), "first", term241841);
        setIntField(term241749, term241749.getClass(), "type", 19);
        term242366 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term242366, term242366.getClass(), "currentTraversal", null);
        term242367 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242368 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242369 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term242367, term242367.getClass(), "number", 0.0);
        setIntField(term242367, term242367.getClass(), "type", 19);
        setField(term242367, term242367.getClass(), "next", null);
        setDoubleField(term242368, term242368.getClass(), "number", 0.0);
        setIntField(term242368, term242368.getClass(), "type", 0);
        setDoubleField(term242369, term242369.getClass(), "number", 0.0);
        setIntField(term242369, term242369.getClass(), "type", 0);
        setField(term242369, term242369.getClass(), "next", null);
        setField(term242369, term242369.getClass(), "first", null);
        setField(term242369, term242369.getClass(), "last", null);
        setField(term242369, term242369.getClass(), "propListHead", null);
        setIntField(term242369, term242369.getClass(), "sourcePosition", 0);
        setField(term242369, term242369.getClass(), "jsType", null);
        setField(term242369, term242369.getClass(), "parent", null);
        setField(term242368, term242368.getClass(), "next", term242369);
        setField(term242368, term242368.getClass(), "first", null);
        setField(term242368, term242368.getClass(), "last", null);
        setField(term242368, term242368.getClass(), "propListHead", null);
        setIntField(term242368, term242368.getClass(), "sourcePosition", 0);
        setField(term242368, term242368.getClass(), "jsType", null);
        setField(term242368, term242368.getClass(), "parent", null);
        setField(term242367, term242367.getClass(), "first", term242368);
        setField(term242367, term242367.getClass(), "last", null);
        setField(term242367, term242367.getClass(), "propListHead", null);
        setIntField(term242367, term242367.getClass(), "sourcePosition", 0);
        setField(term242367, term242367.getClass(), "jsType", null);
        setField(term242367, term242367.getClass(), "parent", null);
        term242332 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242335 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242338 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term242332, term242332.getClass(), "number", 0.0);
        setIntField(term242332, term242332.getClass(), "type", 19);
        setField(term242332, term242332.getClass(), "next", null);
        setDoubleField(term242335, term242335.getClass(), "number", 0.0);
        setIntField(term242335, term242335.getClass(), "type", 0);
        setDoubleField(term242338, term242338.getClass(), "number", 0.0);
        setIntField(term242338, term242338.getClass(), "type", 0);
        setField(term242338, term242338.getClass(), "next", null);
        setField(term242338, term242338.getClass(), "first", null);
        setField(term242338, term242338.getClass(), "last", null);
        setField(term242338, term242338.getClass(), "propListHead", null);
        setIntField(term242338, term242338.getClass(), "sourcePosition", 0);
        setField(term242338, term242338.getClass(), "jsType", null);
        setField(term242338, term242338.getClass(), "parent", null);
        setField(term242335, term242335.getClass(), "next", term242338);
        setField(term242335, term242335.getClass(), "first", null);
        setField(term242335, term242335.getClass(), "last", null);
        setField(term242335, term242335.getClass(), "propListHead", null);
        setIntField(term242335, term242335.getClass(), "sourcePosition", 0);
        setField(term242335, term242335.getClass(), "jsType", null);
        setField(term242335, term242335.getClass(), "parent", null);
        setField(term242332, term242332.getClass(), "first", term242335);
        setField(term242332, term242332.getClass(), "last", null);
        setField(term242332, term242332.getClass(), "propListHead", null);
        setIntField(term242332, term242332.getClass(), "sourcePosition", 0);
        setField(term242332, term242332.getClass(), "jsType", null);
        setField(term242332, term242332.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term241749;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term241657, args);
        assertTrue(recursiveEquals(term241657, term242366));
        assertTrue(recursiveEquals(term241749, term242367));
        assertTrue(recursiveEquals(retValue, term242332));
    }

};


