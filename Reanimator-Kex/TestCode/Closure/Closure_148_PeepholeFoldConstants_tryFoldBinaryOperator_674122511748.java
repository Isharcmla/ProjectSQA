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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168222;
     Object term168314;
     Object term168833;
     Object term168834;
     Object term168793;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168222 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term168314 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term168406 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term168498 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term168406, term168406.getClass(), "next", term168498);
        setField(term168314, term168314.getClass(), "first", term168406);
        setIntField(term168314, term168314.getClass(), "type", 9);
        term168833 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term168833, term168833.getClass(), "currentTraversal", null);
        term168834 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term168835 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term168836 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term168834, term168834.getClass(), "number", 0.0);
        setIntField(term168834, term168834.getClass(), "type", 9);
        setField(term168834, term168834.getClass(), "next", null);
        setDoubleField(term168835, term168835.getClass(), "number", 0.0);
        setIntField(term168835, term168835.getClass(), "type", 0);
        setDoubleField(term168836, term168836.getClass(), "number", 0.0);
        setIntField(term168836, term168836.getClass(), "type", 0);
        setField(term168836, term168836.getClass(), "next", null);
        setField(term168836, term168836.getClass(), "first", null);
        setField(term168836, term168836.getClass(), "last", null);
        setField(term168836, term168836.getClass(), "propListHead", null);
        setIntField(term168836, term168836.getClass(), "sourcePosition", 0);
        setField(term168836, term168836.getClass(), "jsType", null);
        setField(term168836, term168836.getClass(), "parent", null);
        setField(term168835, term168835.getClass(), "next", term168836);
        setField(term168835, term168835.getClass(), "first", null);
        setField(term168835, term168835.getClass(), "last", null);
        setField(term168835, term168835.getClass(), "propListHead", null);
        setIntField(term168835, term168835.getClass(), "sourcePosition", 0);
        setField(term168835, term168835.getClass(), "jsType", null);
        setField(term168835, term168835.getClass(), "parent", null);
        setField(term168834, term168834.getClass(), "first", term168835);
        setField(term168834, term168834.getClass(), "last", null);
        setField(term168834, term168834.getClass(), "propListHead", null);
        setIntField(term168834, term168834.getClass(), "sourcePosition", 0);
        setField(term168834, term168834.getClass(), "jsType", null);
        setField(term168834, term168834.getClass(), "parent", null);
        term168793 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term168796 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term168799 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term168793, term168793.getClass(), "number", 0.0);
        setIntField(term168793, term168793.getClass(), "type", 9);
        setField(term168793, term168793.getClass(), "next", null);
        setDoubleField(term168796, term168796.getClass(), "number", 0.0);
        setIntField(term168796, term168796.getClass(), "type", 0);
        setDoubleField(term168799, term168799.getClass(), "number", 0.0);
        setIntField(term168799, term168799.getClass(), "type", 0);
        setField(term168799, term168799.getClass(), "next", null);
        setField(term168799, term168799.getClass(), "first", null);
        setField(term168799, term168799.getClass(), "last", null);
        setField(term168799, term168799.getClass(), "propListHead", null);
        setIntField(term168799, term168799.getClass(), "sourcePosition", 0);
        setField(term168799, term168799.getClass(), "jsType", null);
        setField(term168799, term168799.getClass(), "parent", null);
        setField(term168796, term168796.getClass(), "next", term168799);
        setField(term168796, term168796.getClass(), "first", null);
        setField(term168796, term168796.getClass(), "last", null);
        setField(term168796, term168796.getClass(), "propListHead", null);
        setIntField(term168796, term168796.getClass(), "sourcePosition", 0);
        setField(term168796, term168796.getClass(), "jsType", null);
        setField(term168796, term168796.getClass(), "parent", null);
        setField(term168793, term168793.getClass(), "first", term168796);
        setField(term168793, term168793.getClass(), "last", null);
        setField(term168793, term168793.getClass(), "propListHead", null);
        setIntField(term168793, term168793.getClass(), "sourcePosition", 0);
        setField(term168793, term168793.getClass(), "jsType", null);
        setField(term168793, term168793.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term168314;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term168222, args);
        assertTrue(recursiveEquals(term168222, term168833));
        assertTrue(recursiveEquals(term168314, term168834));
        assertTrue(recursiveEquals(retValue, term168793));
    }

};


