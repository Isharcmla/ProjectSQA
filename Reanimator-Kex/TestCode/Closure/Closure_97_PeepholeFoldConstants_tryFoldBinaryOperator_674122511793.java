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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228694;
     Object term228786;
     Object term229308;
     Object term229309;
     Object term229279;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228694 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term228786 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term228878 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term228970 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term228878, term228878.getClass(), "next", term228970);
        setIntField(term228878, term228878.getClass(), "type", 39);
        setField(term228786, term228786.getClass(), "first", term228878);
        setIntField(term228786, term228786.getClass(), "type", 22);
        term229308 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term229308, term229308.getClass(), "currentTraversal", null);
        term229309 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term229310 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term229311 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term229309, term229309.getClass(), "str", null);
        setIntField(term229309, term229309.getClass(), "type", 22);
        setField(term229309, term229309.getClass(), "next", null);
        setField(term229310, term229310.getClass(), "str", null);
        setIntField(term229310, term229310.getClass(), "type", 39);
        setField(term229311, term229311.getClass(), "str", null);
        setIntField(term229311, term229311.getClass(), "type", 0);
        setField(term229311, term229311.getClass(), "next", null);
        setField(term229311, term229311.getClass(), "first", null);
        setField(term229311, term229311.getClass(), "last", null);
        setField(term229311, term229311.getClass(), "propListHead", null);
        setIntField(term229311, term229311.getClass(), "sourcePosition", 0);
        setField(term229311, term229311.getClass(), "jsType", null);
        setField(term229311, term229311.getClass(), "parent", null);
        setField(term229310, term229310.getClass(), "next", term229311);
        setField(term229310, term229310.getClass(), "first", null);
        setField(term229310, term229310.getClass(), "last", null);
        setField(term229310, term229310.getClass(), "propListHead", null);
        setIntField(term229310, term229310.getClass(), "sourcePosition", 0);
        setField(term229310, term229310.getClass(), "jsType", null);
        setField(term229310, term229310.getClass(), "parent", null);
        setField(term229309, term229309.getClass(), "first", term229310);
        setField(term229309, term229309.getClass(), "last", null);
        setField(term229309, term229309.getClass(), "propListHead", null);
        setIntField(term229309, term229309.getClass(), "sourcePosition", 0);
        setField(term229309, term229309.getClass(), "jsType", null);
        setField(term229309, term229309.getClass(), "parent", null);
        term229279 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term229281 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term229283 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term229279, term229279.getClass(), "str", null);
        setIntField(term229279, term229279.getClass(), "type", 22);
        setField(term229279, term229279.getClass(), "next", null);
        setField(term229281, term229281.getClass(), "str", null);
        setIntField(term229281, term229281.getClass(), "type", 39);
        setField(term229283, term229283.getClass(), "str", null);
        setIntField(term229283, term229283.getClass(), "type", 0);
        setField(term229283, term229283.getClass(), "next", null);
        setField(term229283, term229283.getClass(), "first", null);
        setField(term229283, term229283.getClass(), "last", null);
        setField(term229283, term229283.getClass(), "propListHead", null);
        setIntField(term229283, term229283.getClass(), "sourcePosition", 0);
        setField(term229283, term229283.getClass(), "jsType", null);
        setField(term229283, term229283.getClass(), "parent", null);
        setField(term229281, term229281.getClass(), "next", term229283);
        setField(term229281, term229281.getClass(), "first", null);
        setField(term229281, term229281.getClass(), "last", null);
        setField(term229281, term229281.getClass(), "propListHead", null);
        setIntField(term229281, term229281.getClass(), "sourcePosition", 0);
        setField(term229281, term229281.getClass(), "jsType", null);
        setField(term229281, term229281.getClass(), "parent", null);
        setField(term229279, term229279.getClass(), "first", term229281);
        setField(term229279, term229279.getClass(), "last", null);
        setField(term229279, term229279.getClass(), "propListHead", null);
        setIntField(term229279, term229279.getClass(), "sourcePosition", 0);
        setField(term229279, term229279.getClass(), "jsType", null);
        setField(term229279, term229279.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term228786;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term228694, args);
        assertTrue(recursiveEquals(term228694, term229308));
        assertTrue(recursiveEquals(term228786, term229309));
        assertTrue(recursiveEquals(retValue, term229279));
    }

};


