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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569463;
     Object term569555;
     Object term569798;
     Object term569799;
     Object term569753;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term569463 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term569555 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term569647 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term569739 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term569647, term569647.getClass(), "next", term569739);
        setIntField(term569647, term569647.getClass(), "type", 16);
        setField(term569555, term569555.getClass(), "first", term569647);
        setIntField(term569555, term569555.getClass(), "type", 16);
        term569798 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term569798, term569798.getClass(), "currentTraversal", null);
        term569799 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term569800 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term569801 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term569799, term569799.getClass(), "str", null);
        setIntField(term569799, term569799.getClass(), "type", 16);
        setField(term569799, term569799.getClass(), "next", null);
        setField(term569800, term569800.getClass(), "str", null);
        setIntField(term569800, term569800.getClass(), "type", 16);
        setDoubleField(term569801, term569801.getClass(), "number", 0.0);
        setIntField(term569801, term569801.getClass(), "type", 0);
        setField(term569801, term569801.getClass(), "next", null);
        setField(term569801, term569801.getClass(), "first", null);
        setField(term569801, term569801.getClass(), "last", null);
        setField(term569801, term569801.getClass(), "propListHead", null);
        setIntField(term569801, term569801.getClass(), "sourcePosition", 0);
        setField(term569801, term569801.getClass(), "jsType", null);
        setField(term569801, term569801.getClass(), "parent", null);
        setField(term569800, term569800.getClass(), "next", term569801);
        setField(term569800, term569800.getClass(), "first", null);
        setField(term569800, term569800.getClass(), "last", null);
        setField(term569800, term569800.getClass(), "propListHead", null);
        setIntField(term569800, term569800.getClass(), "sourcePosition", 0);
        setField(term569800, term569800.getClass(), "jsType", null);
        setField(term569800, term569800.getClass(), "parent", null);
        setField(term569799, term569799.getClass(), "first", term569800);
        setField(term569799, term569799.getClass(), "last", null);
        setField(term569799, term569799.getClass(), "propListHead", null);
        setIntField(term569799, term569799.getClass(), "sourcePosition", 0);
        setField(term569799, term569799.getClass(), "jsType", null);
        setField(term569799, term569799.getClass(), "parent", null);
        term569753 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term569755 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term569757 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term569753, term569753.getClass(), "str", null);
        setIntField(term569753, term569753.getClass(), "type", 16);
        setField(term569753, term569753.getClass(), "next", null);
        setField(term569755, term569755.getClass(), "str", null);
        setIntField(term569755, term569755.getClass(), "type", 16);
        setDoubleField(term569757, term569757.getClass(), "number", 0.0);
        setIntField(term569757, term569757.getClass(), "type", 0);
        setField(term569757, term569757.getClass(), "next", null);
        setField(term569757, term569757.getClass(), "first", null);
        setField(term569757, term569757.getClass(), "last", null);
        setField(term569757, term569757.getClass(), "propListHead", null);
        setIntField(term569757, term569757.getClass(), "sourcePosition", 0);
        setField(term569757, term569757.getClass(), "jsType", null);
        setField(term569757, term569757.getClass(), "parent", null);
        setField(term569755, term569755.getClass(), "next", term569757);
        setField(term569755, term569755.getClass(), "first", null);
        setField(term569755, term569755.getClass(), "last", null);
        setField(term569755, term569755.getClass(), "propListHead", null);
        setIntField(term569755, term569755.getClass(), "sourcePosition", 0);
        setField(term569755, term569755.getClass(), "jsType", null);
        setField(term569755, term569755.getClass(), "parent", null);
        setField(term569753, term569753.getClass(), "first", term569755);
        setField(term569753, term569753.getClass(), "last", null);
        setField(term569753, term569753.getClass(), "propListHead", null);
        setIntField(term569753, term569753.getClass(), "sourcePosition", 0);
        setField(term569753, term569753.getClass(), "jsType", null);
        setField(term569753, term569753.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term569555;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term569463, args);
        assertTrue(recursiveEquals(term569463, term569798));
        assertTrue(recursiveEquals(term569555, term569799));
        assertTrue(recursiveEquals(retValue, term569753));
    }

};


