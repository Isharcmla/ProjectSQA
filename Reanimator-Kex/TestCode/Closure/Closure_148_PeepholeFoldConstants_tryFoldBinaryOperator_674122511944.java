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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220520;
     Object term220612;
     Object term220847;
     Object term220848;
     Object term220805;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220520 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term220612 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term220704 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term220796 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term220704, term220704.getClass(), "next", term220796);
        setIntField(term220704, term220704.getClass(), "type", 39);
        setField(term220612, term220612.getClass(), "first", term220704);
        setIntField(term220612, term220612.getClass(), "type", 9);
        term220847 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term220847, term220847.getClass(), "currentTraversal", null);
        term220848 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term220849 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term220850 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term220848, term220848.getClass(), "number", 0.0);
        setIntField(term220848, term220848.getClass(), "type", 9);
        setField(term220848, term220848.getClass(), "next", null);
        setDoubleField(term220849, term220849.getClass(), "number", 0.0);
        setIntField(term220849, term220849.getClass(), "type", 39);
        setDoubleField(term220850, term220850.getClass(), "number", 0.0);
        setIntField(term220850, term220850.getClass(), "type", 0);
        setField(term220850, term220850.getClass(), "next", null);
        setField(term220850, term220850.getClass(), "first", null);
        setField(term220850, term220850.getClass(), "last", null);
        setField(term220850, term220850.getClass(), "propListHead", null);
        setIntField(term220850, term220850.getClass(), "sourcePosition", 0);
        setField(term220850, term220850.getClass(), "jsType", null);
        setField(term220850, term220850.getClass(), "parent", null);
        setField(term220849, term220849.getClass(), "next", term220850);
        setField(term220849, term220849.getClass(), "first", null);
        setField(term220849, term220849.getClass(), "last", null);
        setField(term220849, term220849.getClass(), "propListHead", null);
        setIntField(term220849, term220849.getClass(), "sourcePosition", 0);
        setField(term220849, term220849.getClass(), "jsType", null);
        setField(term220849, term220849.getClass(), "parent", null);
        setField(term220848, term220848.getClass(), "first", term220849);
        setField(term220848, term220848.getClass(), "last", null);
        setField(term220848, term220848.getClass(), "propListHead", null);
        setIntField(term220848, term220848.getClass(), "sourcePosition", 0);
        setField(term220848, term220848.getClass(), "jsType", null);
        setField(term220848, term220848.getClass(), "parent", null);
        term220805 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term220808 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term220811 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term220805, term220805.getClass(), "number", 0.0);
        setIntField(term220805, term220805.getClass(), "type", 9);
        setField(term220805, term220805.getClass(), "next", null);
        setDoubleField(term220808, term220808.getClass(), "number", 0.0);
        setIntField(term220808, term220808.getClass(), "type", 39);
        setDoubleField(term220811, term220811.getClass(), "number", 0.0);
        setIntField(term220811, term220811.getClass(), "type", 0);
        setField(term220811, term220811.getClass(), "next", null);
        setField(term220811, term220811.getClass(), "first", null);
        setField(term220811, term220811.getClass(), "last", null);
        setField(term220811, term220811.getClass(), "propListHead", null);
        setIntField(term220811, term220811.getClass(), "sourcePosition", 0);
        setField(term220811, term220811.getClass(), "jsType", null);
        setField(term220811, term220811.getClass(), "parent", null);
        setField(term220808, term220808.getClass(), "next", term220811);
        setField(term220808, term220808.getClass(), "first", null);
        setField(term220808, term220808.getClass(), "last", null);
        setField(term220808, term220808.getClass(), "propListHead", null);
        setIntField(term220808, term220808.getClass(), "sourcePosition", 0);
        setField(term220808, term220808.getClass(), "jsType", null);
        setField(term220808, term220808.getClass(), "parent", null);
        setField(term220805, term220805.getClass(), "first", term220808);
        setField(term220805, term220805.getClass(), "last", null);
        setField(term220805, term220805.getClass(), "propListHead", null);
        setIntField(term220805, term220805.getClass(), "sourcePosition", 0);
        setField(term220805, term220805.getClass(), "jsType", null);
        setField(term220805, term220805.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term220612;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term220520, args);
        assertTrue(recursiveEquals(term220520, term220847));
        assertTrue(recursiveEquals(term220612, term220848));
        assertTrue(recursiveEquals(retValue, term220805));
    }

};


