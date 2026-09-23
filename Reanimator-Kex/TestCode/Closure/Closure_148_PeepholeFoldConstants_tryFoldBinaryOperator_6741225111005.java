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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234955;
     Object term235047;
     Object term235693;
     Object term235694;
     Object term235664;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234955 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term235047 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term235139 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term235231 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term235139, term235139.getClass(), "next", term235231);
        setIntField(term235139, term235139.getClass(), "type", 39);
        setField(term235047, term235047.getClass(), "first", term235139);
        setIntField(term235047, term235047.getClass(), "type", 24);
        term235693 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term235693, term235693.getClass(), "currentTraversal", null);
        term235694 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term235695 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term235696 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term235694, term235694.getClass(), "str", null);
        setIntField(term235694, term235694.getClass(), "type", 24);
        setField(term235694, term235694.getClass(), "next", null);
        setField(term235695, term235695.getClass(), "str", null);
        setIntField(term235695, term235695.getClass(), "type", 39);
        setField(term235696, term235696.getClass(), "str", null);
        setIntField(term235696, term235696.getClass(), "type", 0);
        setField(term235696, term235696.getClass(), "next", null);
        setField(term235696, term235696.getClass(), "first", null);
        setField(term235696, term235696.getClass(), "last", null);
        setField(term235696, term235696.getClass(), "propListHead", null);
        setIntField(term235696, term235696.getClass(), "sourcePosition", 0);
        setField(term235696, term235696.getClass(), "jsType", null);
        setField(term235696, term235696.getClass(), "parent", null);
        setField(term235695, term235695.getClass(), "next", term235696);
        setField(term235695, term235695.getClass(), "first", null);
        setField(term235695, term235695.getClass(), "last", null);
        setField(term235695, term235695.getClass(), "propListHead", null);
        setIntField(term235695, term235695.getClass(), "sourcePosition", 0);
        setField(term235695, term235695.getClass(), "jsType", null);
        setField(term235695, term235695.getClass(), "parent", null);
        setField(term235694, term235694.getClass(), "first", term235695);
        setField(term235694, term235694.getClass(), "last", null);
        setField(term235694, term235694.getClass(), "propListHead", null);
        setIntField(term235694, term235694.getClass(), "sourcePosition", 0);
        setField(term235694, term235694.getClass(), "jsType", null);
        setField(term235694, term235694.getClass(), "parent", null);
        term235664 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term235666 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term235668 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term235664, term235664.getClass(), "str", null);
        setIntField(term235664, term235664.getClass(), "type", 24);
        setField(term235664, term235664.getClass(), "next", null);
        setField(term235666, term235666.getClass(), "str", null);
        setIntField(term235666, term235666.getClass(), "type", 39);
        setField(term235668, term235668.getClass(), "str", null);
        setIntField(term235668, term235668.getClass(), "type", 0);
        setField(term235668, term235668.getClass(), "next", null);
        setField(term235668, term235668.getClass(), "first", null);
        setField(term235668, term235668.getClass(), "last", null);
        setField(term235668, term235668.getClass(), "propListHead", null);
        setIntField(term235668, term235668.getClass(), "sourcePosition", 0);
        setField(term235668, term235668.getClass(), "jsType", null);
        setField(term235668, term235668.getClass(), "parent", null);
        setField(term235666, term235666.getClass(), "next", term235668);
        setField(term235666, term235666.getClass(), "first", null);
        setField(term235666, term235666.getClass(), "last", null);
        setField(term235666, term235666.getClass(), "propListHead", null);
        setIntField(term235666, term235666.getClass(), "sourcePosition", 0);
        setField(term235666, term235666.getClass(), "jsType", null);
        setField(term235666, term235666.getClass(), "parent", null);
        setField(term235664, term235664.getClass(), "first", term235666);
        setField(term235664, term235664.getClass(), "last", null);
        setField(term235664, term235664.getClass(), "propListHead", null);
        setIntField(term235664, term235664.getClass(), "sourcePosition", 0);
        setField(term235664, term235664.getClass(), "jsType", null);
        setField(term235664, term235664.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term235047;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term234955, args);
        assertTrue(recursiveEquals(term234955, term235693));
        assertTrue(recursiveEquals(term235047, term235694));
        assertTrue(recursiveEquals(retValue, term235664));
    }

};


