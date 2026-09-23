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

public class PeepholeFoldConstants_optimizeSubtree_16065069931182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362046;
     Object term362138;
     Object term362378;
     Object term362379;
     Object term362330;

    public PeepholeFoldConstants_optimizeSubtree_16065069931182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term362046 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term362138 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term362230 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term362322 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term362138, term362138.getClass(), "type", 35);
        setField(term362230, term362230.getClass(), "next", term362322);
        setIntField(term362230, term362230.getClass(), "type", 63);
        setField(term362138, term362138.getClass(), "first", term362230);
        term362378 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term362378, term362378.getClass(), "currentTraversal", null);
        term362379 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term362380 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term362381 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term362379, term362379.getClass(), "str", null);
        setIntField(term362379, term362379.getClass(), "type", 35);
        setField(term362379, term362379.getClass(), "next", null);
        setField(term362380, term362380.getClass(), "str", null);
        setIntField(term362380, term362380.getClass(), "type", 63);
        setField(term362381, term362381.getClass(), "str", null);
        setIntField(term362381, term362381.getClass(), "type", 0);
        setField(term362381, term362381.getClass(), "next", null);
        setField(term362381, term362381.getClass(), "first", null);
        setField(term362381, term362381.getClass(), "last", null);
        setField(term362381, term362381.getClass(), "propListHead", null);
        setIntField(term362381, term362381.getClass(), "sourcePosition", 0);
        setField(term362381, term362381.getClass(), "jsType", null);
        setField(term362381, term362381.getClass(), "parent", null);
        setField(term362380, term362380.getClass(), "next", term362381);
        setField(term362380, term362380.getClass(), "first", null);
        setField(term362380, term362380.getClass(), "last", null);
        setField(term362380, term362380.getClass(), "propListHead", null);
        setIntField(term362380, term362380.getClass(), "sourcePosition", 0);
        setField(term362380, term362380.getClass(), "jsType", null);
        setField(term362380, term362380.getClass(), "parent", null);
        setField(term362379, term362379.getClass(), "first", term362380);
        setField(term362379, term362379.getClass(), "last", null);
        setField(term362379, term362379.getClass(), "propListHead", null);
        setIntField(term362379, term362379.getClass(), "sourcePosition", 0);
        setField(term362379, term362379.getClass(), "jsType", null);
        setField(term362379, term362379.getClass(), "parent", null);
        term362330 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term362332 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term362334 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term362330, term362330.getClass(), "str", null);
        setIntField(term362330, term362330.getClass(), "type", 35);
        setField(term362330, term362330.getClass(), "next", null);
        setField(term362332, term362332.getClass(), "str", null);
        setIntField(term362332, term362332.getClass(), "type", 63);
        setField(term362334, term362334.getClass(), "str", null);
        setIntField(term362334, term362334.getClass(), "type", 0);
        setField(term362334, term362334.getClass(), "next", null);
        setField(term362334, term362334.getClass(), "first", null);
        setField(term362334, term362334.getClass(), "last", null);
        setField(term362334, term362334.getClass(), "propListHead", null);
        setIntField(term362334, term362334.getClass(), "sourcePosition", 0);
        setField(term362334, term362334.getClass(), "jsType", null);
        setField(term362334, term362334.getClass(), "parent", null);
        setField(term362332, term362332.getClass(), "next", term362334);
        setField(term362332, term362332.getClass(), "first", null);
        setField(term362332, term362332.getClass(), "last", null);
        setField(term362332, term362332.getClass(), "propListHead", null);
        setIntField(term362332, term362332.getClass(), "sourcePosition", 0);
        setField(term362332, term362332.getClass(), "jsType", null);
        setField(term362332, term362332.getClass(), "parent", null);
        setField(term362330, term362330.getClass(), "first", term362332);
        setField(term362330, term362330.getClass(), "last", null);
        setField(term362330, term362330.getClass(), "propListHead", null);
        setIntField(term362330, term362330.getClass(), "sourcePosition", 0);
        setField(term362330, term362330.getClass(), "jsType", null);
        setField(term362330, term362330.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term362138;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term362046, args);
        assertTrue(recursiveEquals(term362046, term362378));
        assertTrue(recursiveEquals(term362138, term362379));
        assertTrue(recursiveEquals(retValue, term362330));
    }

};


