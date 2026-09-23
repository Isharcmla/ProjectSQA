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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2690961;
     Object term2691053;
     Object term2692385;
     Object term2692386;
     Object term2692303;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2690961 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2691053 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2691145 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2691237 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2691329 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2691053, term2691053.getClass(), "type", 37);
        setIntField(term2691145, term2691145.getClass(), "type", 35);
        setIntField(term2691329, term2691329.getClass(), "type", 40);
        setField(term2691329, term2691329.getClass(), "str", "");
        setField(term2691237, term2691237.getClass(), "next", term2691329);
        setIntField(term2691237, term2691237.getClass(), "type", 40);
        setField(term2691145, term2691145.getClass(), "first", term2691237);
        setField(term2691145, term2691145.getClass(), "next", null);
        setField(term2691053, term2691053.getClass(), "first", term2691145);
        term2692385 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2692385, term2692385.getClass(), "currentTraversal", null);
        term2692386 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2692387 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2692388 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2692389 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term2692386, term2692386.getClass(), "number", 0.0);
        setIntField(term2692386, term2692386.getClass(), "type", 37);
        setField(term2692386, term2692386.getClass(), "next", null);
        setField(term2692387, term2692387.getClass(), "str", null);
        setIntField(term2692387, term2692387.getClass(), "type", 35);
        setField(term2692387, term2692387.getClass(), "next", null);
        setField(term2692388, term2692388.getClass(), "str", null);
        setIntField(term2692388, term2692388.getClass(), "type", 40);
        setField(term2692389, term2692389.getClass(), "str", "");
        setIntField(term2692389, term2692389.getClass(), "type", 40);
        setField(term2692389, term2692389.getClass(), "next", null);
        setField(term2692389, term2692389.getClass(), "first", null);
        setField(term2692389, term2692389.getClass(), "last", null);
        setField(term2692389, term2692389.getClass(), "propListHead", null);
        setIntField(term2692389, term2692389.getClass(), "sourcePosition", 0);
        setField(term2692389, term2692389.getClass(), "jsType", null);
        setField(term2692389, term2692389.getClass(), "parent", null);
        setField(term2692388, term2692388.getClass(), "next", term2692389);
        setField(term2692388, term2692388.getClass(), "first", null);
        setField(term2692388, term2692388.getClass(), "last", null);
        setField(term2692388, term2692388.getClass(), "propListHead", null);
        setIntField(term2692388, term2692388.getClass(), "sourcePosition", 0);
        setField(term2692388, term2692388.getClass(), "jsType", null);
        setField(term2692388, term2692388.getClass(), "parent", null);
        setField(term2692387, term2692387.getClass(), "first", term2692388);
        setField(term2692387, term2692387.getClass(), "last", null);
        setField(term2692387, term2692387.getClass(), "propListHead", null);
        setIntField(term2692387, term2692387.getClass(), "sourcePosition", 0);
        setField(term2692387, term2692387.getClass(), "jsType", null);
        setField(term2692387, term2692387.getClass(), "parent", null);
        setField(term2692386, term2692386.getClass(), "first", term2692387);
        setField(term2692386, term2692386.getClass(), "last", null);
        setField(term2692386, term2692386.getClass(), "propListHead", null);
        setIntField(term2692386, term2692386.getClass(), "sourcePosition", 0);
        setField(term2692386, term2692386.getClass(), "jsType", null);
        setField(term2692386, term2692386.getClass(), "parent", null);
        term2692303 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2692306 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2692308 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2692310 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term2692303, term2692303.getClass(), "number", 0.0);
        setIntField(term2692303, term2692303.getClass(), "type", 37);
        setField(term2692303, term2692303.getClass(), "next", null);
        setField(term2692306, term2692306.getClass(), "str", null);
        setIntField(term2692306, term2692306.getClass(), "type", 35);
        setField(term2692306, term2692306.getClass(), "next", null);
        setField(term2692308, term2692308.getClass(), "str", null);
        setIntField(term2692308, term2692308.getClass(), "type", 40);
        setField(term2692310, term2692310.getClass(), "str", "");
        setIntField(term2692310, term2692310.getClass(), "type", 40);
        setField(term2692310, term2692310.getClass(), "next", null);
        setField(term2692310, term2692310.getClass(), "first", null);
        setField(term2692310, term2692310.getClass(), "last", null);
        setField(term2692310, term2692310.getClass(), "propListHead", null);
        setIntField(term2692310, term2692310.getClass(), "sourcePosition", 0);
        setField(term2692310, term2692310.getClass(), "jsType", null);
        setField(term2692310, term2692310.getClass(), "parent", null);
        setField(term2692308, term2692308.getClass(), "next", term2692310);
        setField(term2692308, term2692308.getClass(), "first", null);
        setField(term2692308, term2692308.getClass(), "last", null);
        setField(term2692308, term2692308.getClass(), "propListHead", null);
        setIntField(term2692308, term2692308.getClass(), "sourcePosition", 0);
        setField(term2692308, term2692308.getClass(), "jsType", null);
        setField(term2692308, term2692308.getClass(), "parent", null);
        setField(term2692306, term2692306.getClass(), "first", term2692308);
        setField(term2692306, term2692306.getClass(), "last", null);
        setField(term2692306, term2692306.getClass(), "propListHead", null);
        setIntField(term2692306, term2692306.getClass(), "sourcePosition", 0);
        setField(term2692306, term2692306.getClass(), "jsType", null);
        setField(term2692306, term2692306.getClass(), "parent", null);
        setField(term2692303, term2692303.getClass(), "first", term2692306);
        setField(term2692303, term2692303.getClass(), "last", null);
        setField(term2692303, term2692303.getClass(), "propListHead", null);
        setIntField(term2692303, term2692303.getClass(), "sourcePosition", 0);
        setField(term2692303, term2692303.getClass(), "jsType", null);
        setField(term2692303, term2692303.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2691053;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2690961, args);
        assertTrue(recursiveEquals(term2690961, term2692385));
        assertTrue(recursiveEquals(term2691053, term2692386));
        assertTrue(recursiveEquals(retValue, term2692303));
    }

};


