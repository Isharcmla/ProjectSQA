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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344108;
     Object term344200;
     Object term345274;
     Object term345275;
     Object term345245;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344108 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term344200 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term344292 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term344384 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term344292, term344292.getClass(), "next", term344384);
        setIntField(term344292, term344292.getClass(), "type", 39);
        setField(term344200, term344200.getClass(), "first", term344292);
        setIntField(term344200, term344200.getClass(), "type", 19);
        term345274 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term345274, term345274.getClass(), "currentTraversal", null);
        term345275 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term345276 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term345277 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term345275, term345275.getClass(), "str", null);
        setIntField(term345275, term345275.getClass(), "type", 19);
        setField(term345275, term345275.getClass(), "next", null);
        setField(term345276, term345276.getClass(), "str", null);
        setIntField(term345276, term345276.getClass(), "type", 39);
        setField(term345277, term345277.getClass(), "str", null);
        setIntField(term345277, term345277.getClass(), "type", 0);
        setField(term345277, term345277.getClass(), "next", null);
        setField(term345277, term345277.getClass(), "first", null);
        setField(term345277, term345277.getClass(), "last", null);
        setField(term345277, term345277.getClass(), "propListHead", null);
        setIntField(term345277, term345277.getClass(), "sourcePosition", 0);
        setField(term345277, term345277.getClass(), "jsType", null);
        setField(term345277, term345277.getClass(), "parent", null);
        setField(term345276, term345276.getClass(), "next", term345277);
        setField(term345276, term345276.getClass(), "first", null);
        setField(term345276, term345276.getClass(), "last", null);
        setField(term345276, term345276.getClass(), "propListHead", null);
        setIntField(term345276, term345276.getClass(), "sourcePosition", 0);
        setField(term345276, term345276.getClass(), "jsType", null);
        setField(term345276, term345276.getClass(), "parent", null);
        setField(term345275, term345275.getClass(), "first", term345276);
        setField(term345275, term345275.getClass(), "last", null);
        setField(term345275, term345275.getClass(), "propListHead", null);
        setIntField(term345275, term345275.getClass(), "sourcePosition", 0);
        setField(term345275, term345275.getClass(), "jsType", null);
        setField(term345275, term345275.getClass(), "parent", null);
        term345245 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term345247 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term345249 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term345245, term345245.getClass(), "str", null);
        setIntField(term345245, term345245.getClass(), "type", 19);
        setField(term345245, term345245.getClass(), "next", null);
        setField(term345247, term345247.getClass(), "str", null);
        setIntField(term345247, term345247.getClass(), "type", 39);
        setField(term345249, term345249.getClass(), "str", null);
        setIntField(term345249, term345249.getClass(), "type", 0);
        setField(term345249, term345249.getClass(), "next", null);
        setField(term345249, term345249.getClass(), "first", null);
        setField(term345249, term345249.getClass(), "last", null);
        setField(term345249, term345249.getClass(), "propListHead", null);
        setIntField(term345249, term345249.getClass(), "sourcePosition", 0);
        setField(term345249, term345249.getClass(), "jsType", null);
        setField(term345249, term345249.getClass(), "parent", null);
        setField(term345247, term345247.getClass(), "next", term345249);
        setField(term345247, term345247.getClass(), "first", null);
        setField(term345247, term345247.getClass(), "last", null);
        setField(term345247, term345247.getClass(), "propListHead", null);
        setIntField(term345247, term345247.getClass(), "sourcePosition", 0);
        setField(term345247, term345247.getClass(), "jsType", null);
        setField(term345247, term345247.getClass(), "parent", null);
        setField(term345245, term345245.getClass(), "first", term345247);
        setField(term345245, term345245.getClass(), "last", null);
        setField(term345245, term345245.getClass(), "propListHead", null);
        setIntField(term345245, term345245.getClass(), "sourcePosition", 0);
        setField(term345245, term345245.getClass(), "jsType", null);
        setField(term345245, term345245.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term344200;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term344108, args);
        assertTrue(recursiveEquals(term344108, term345274));
        assertTrue(recursiveEquals(term344200, term345275));
        assertTrue(recursiveEquals(retValue, term345245));
    }

};


