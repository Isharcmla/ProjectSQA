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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243951;
     Object term244043;
     Object term244323;
     Object term244324;
     Object term244274;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243951 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term244043 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term244135 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term244227 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term244227, term244227.getClass(), "type", 42);
        setField(term244135, term244135.getClass(), "next", term244227);
        setIntField(term244135, term244135.getClass(), "type", 42);
        setField(term244043, term244043.getClass(), "first", term244135);
        setIntField(term244043, term244043.getClass(), "type", 14);
        term244323 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term244323, term244323.getClass(), "currentTraversal", null);
        term244324 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term244325 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term244326 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term244324, term244324.getClass(), "str", null);
        setIntField(term244324, term244324.getClass(), "type", 14);
        setField(term244324, term244324.getClass(), "next", null);
        setField(term244325, term244325.getClass(), "str", null);
        setIntField(term244325, term244325.getClass(), "type", 42);
        setDoubleField(term244326, term244326.getClass(), "number", 0.0);
        setIntField(term244326, term244326.getClass(), "type", 42);
        setField(term244326, term244326.getClass(), "next", null);
        setField(term244326, term244326.getClass(), "first", null);
        setField(term244326, term244326.getClass(), "last", null);
        setField(term244326, term244326.getClass(), "propListHead", null);
        setIntField(term244326, term244326.getClass(), "sourcePosition", 0);
        setField(term244326, term244326.getClass(), "jsType", null);
        setField(term244326, term244326.getClass(), "parent", null);
        setField(term244325, term244325.getClass(), "next", term244326);
        setField(term244325, term244325.getClass(), "first", null);
        setField(term244325, term244325.getClass(), "last", null);
        setField(term244325, term244325.getClass(), "propListHead", null);
        setIntField(term244325, term244325.getClass(), "sourcePosition", 0);
        setField(term244325, term244325.getClass(), "jsType", null);
        setField(term244325, term244325.getClass(), "parent", null);
        setField(term244324, term244324.getClass(), "first", term244325);
        setField(term244324, term244324.getClass(), "last", null);
        setField(term244324, term244324.getClass(), "propListHead", null);
        setIntField(term244324, term244324.getClass(), "sourcePosition", 0);
        setField(term244324, term244324.getClass(), "jsType", null);
        setField(term244324, term244324.getClass(), "parent", null);
        term244274 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term244276 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term244278 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term244274, term244274.getClass(), "str", null);
        setIntField(term244274, term244274.getClass(), "type", 14);
        setField(term244274, term244274.getClass(), "next", null);
        setField(term244276, term244276.getClass(), "str", null);
        setIntField(term244276, term244276.getClass(), "type", 42);
        setDoubleField(term244278, term244278.getClass(), "number", 0.0);
        setIntField(term244278, term244278.getClass(), "type", 42);
        setField(term244278, term244278.getClass(), "next", null);
        setField(term244278, term244278.getClass(), "first", null);
        setField(term244278, term244278.getClass(), "last", null);
        setField(term244278, term244278.getClass(), "propListHead", null);
        setIntField(term244278, term244278.getClass(), "sourcePosition", 0);
        setField(term244278, term244278.getClass(), "jsType", null);
        setField(term244278, term244278.getClass(), "parent", null);
        setField(term244276, term244276.getClass(), "next", term244278);
        setField(term244276, term244276.getClass(), "first", null);
        setField(term244276, term244276.getClass(), "last", null);
        setField(term244276, term244276.getClass(), "propListHead", null);
        setIntField(term244276, term244276.getClass(), "sourcePosition", 0);
        setField(term244276, term244276.getClass(), "jsType", null);
        setField(term244276, term244276.getClass(), "parent", null);
        setField(term244274, term244274.getClass(), "first", term244276);
        setField(term244274, term244274.getClass(), "last", null);
        setField(term244274, term244274.getClass(), "propListHead", null);
        setIntField(term244274, term244274.getClass(), "sourcePosition", 0);
        setField(term244274, term244274.getClass(), "jsType", null);
        setField(term244274, term244274.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term244043;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term243951, args);
        assertTrue(recursiveEquals(term243951, term244323));
        assertTrue(recursiveEquals(term244043, term244324));
        assertTrue(recursiveEquals(retValue, term244274));
    }

};


