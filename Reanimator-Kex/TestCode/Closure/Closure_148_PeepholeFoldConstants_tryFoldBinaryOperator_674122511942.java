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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219963;
     Object term220055;
     Object term220379;
     Object term220380;
     Object term220332;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219963 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term220055 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term220147 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term220239 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term220239, term220239.getClass(), "type", 42);
        setField(term220147, term220147.getClass(), "next", term220239);
        setIntField(term220147, term220147.getClass(), "type", 42);
        setField(term220055, term220055.getClass(), "first", term220147);
        setIntField(term220055, term220055.getClass(), "type", 16);
        term220379 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term220379, term220379.getClass(), "currentTraversal", null);
        term220380 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term220381 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term220382 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term220380, term220380.getClass(), "str", null);
        setIntField(term220380, term220380.getClass(), "type", 16);
        setField(term220380, term220380.getClass(), "next", null);
        setField(term220381, term220381.getClass(), "str", null);
        setIntField(term220381, term220381.getClass(), "type", 42);
        setDoubleField(term220382, term220382.getClass(), "number", 0.0);
        setIntField(term220382, term220382.getClass(), "type", 42);
        setField(term220382, term220382.getClass(), "next", null);
        setField(term220382, term220382.getClass(), "first", null);
        setField(term220382, term220382.getClass(), "last", null);
        setField(term220382, term220382.getClass(), "propListHead", null);
        setIntField(term220382, term220382.getClass(), "sourcePosition", 0);
        setField(term220382, term220382.getClass(), "jsType", null);
        setField(term220382, term220382.getClass(), "parent", null);
        setField(term220381, term220381.getClass(), "next", term220382);
        setField(term220381, term220381.getClass(), "first", null);
        setField(term220381, term220381.getClass(), "last", null);
        setField(term220381, term220381.getClass(), "propListHead", null);
        setIntField(term220381, term220381.getClass(), "sourcePosition", 0);
        setField(term220381, term220381.getClass(), "jsType", null);
        setField(term220381, term220381.getClass(), "parent", null);
        setField(term220380, term220380.getClass(), "first", term220381);
        setField(term220380, term220380.getClass(), "last", null);
        setField(term220380, term220380.getClass(), "propListHead", null);
        setIntField(term220380, term220380.getClass(), "sourcePosition", 0);
        setField(term220380, term220380.getClass(), "jsType", null);
        setField(term220380, term220380.getClass(), "parent", null);
        term220332 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term220334 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term220336 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term220332, term220332.getClass(), "str", null);
        setIntField(term220332, term220332.getClass(), "type", 16);
        setField(term220332, term220332.getClass(), "next", null);
        setField(term220334, term220334.getClass(), "str", null);
        setIntField(term220334, term220334.getClass(), "type", 42);
        setDoubleField(term220336, term220336.getClass(), "number", 0.0);
        setIntField(term220336, term220336.getClass(), "type", 42);
        setField(term220336, term220336.getClass(), "next", null);
        setField(term220336, term220336.getClass(), "first", null);
        setField(term220336, term220336.getClass(), "last", null);
        setField(term220336, term220336.getClass(), "propListHead", null);
        setIntField(term220336, term220336.getClass(), "sourcePosition", 0);
        setField(term220336, term220336.getClass(), "jsType", null);
        setField(term220336, term220336.getClass(), "parent", null);
        setField(term220334, term220334.getClass(), "next", term220336);
        setField(term220334, term220334.getClass(), "first", null);
        setField(term220334, term220334.getClass(), "last", null);
        setField(term220334, term220334.getClass(), "propListHead", null);
        setIntField(term220334, term220334.getClass(), "sourcePosition", 0);
        setField(term220334, term220334.getClass(), "jsType", null);
        setField(term220334, term220334.getClass(), "parent", null);
        setField(term220332, term220332.getClass(), "first", term220334);
        setField(term220332, term220332.getClass(), "last", null);
        setField(term220332, term220332.getClass(), "propListHead", null);
        setIntField(term220332, term220332.getClass(), "sourcePosition", 0);
        setField(term220332, term220332.getClass(), "jsType", null);
        setField(term220332, term220332.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term220055;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term219963, args);
        assertTrue(recursiveEquals(term219963, term220379));
        assertTrue(recursiveEquals(term220055, term220380));
        assertTrue(recursiveEquals(retValue, term220332));
    }

};


