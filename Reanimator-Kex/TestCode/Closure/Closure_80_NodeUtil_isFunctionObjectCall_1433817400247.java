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

public class NodeUtil_isFunctionObjectCall_1433817400247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2562;
     Object term16252;

    public NodeUtil_isFunctionObjectCall_1433817400247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2575 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2585 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2562, term2562.getClass(), "type", -1584779593);
        setIntField(term2564, term2564.getClass(), "type", 1407309162);
        setIntField(term2566, term2566.getClass(), "type", 0);
        setField(term2566, term2566.getClass(), "next", null);
        setField(term2566, term2566.getClass(), "first", null);
        setField(term2566, term2566.getClass(), "last", null);
        setField(term2566, term2566.getClass(), "propListHead", null);
        setIntField(term2566, term2566.getClass(), "sourcePosition", 0);
        setField(term2566, term2566.getClass(), "jsType", null);
        setField(term2566, term2566.getClass(), "parent", null);
        setField(term2564, term2564.getClass(), "next", term2566);
        setIntField(term2569, term2569.getClass(), "type", 0);
        setField(term2569, term2569.getClass(), "next", null);
        setField(term2569, term2569.getClass(), "first", null);
        setField(term2569, term2569.getClass(), "last", null);
        setField(term2569, term2569.getClass(), "propListHead", null);
        setIntField(term2569, term2569.getClass(), "sourcePosition", 0);
        setField(term2569, term2569.getClass(), "jsType", null);
        setField(term2569, term2569.getClass(), "parent", null);
        setField(term2564, term2564.getClass(), "first", term2569);
        setIntField(term2572, term2572.getClass(), "type", 0);
        setField(term2572, term2572.getClass(), "next", null);
        setField(term2572, term2572.getClass(), "first", null);
        setField(term2572, term2572.getClass(), "last", null);
        setField(term2572, term2572.getClass(), "propListHead", null);
        setIntField(term2572, term2572.getClass(), "sourcePosition", 0);
        setField(term2572, term2572.getClass(), "jsType", null);
        setField(term2572, term2572.getClass(), "parent", null);
        setField(term2564, term2564.getClass(), "last", term2572);
        setField(term2575, term2575.getClass(), "next", null);
        setIntField(term2575, term2575.getClass(), "type", 0);
        setIntField(term2575, term2575.getClass(), "intValue", 0);
        setField(term2575, term2575.getClass(), "objectValue", null);
        setField(term2564, term2564.getClass(), "propListHead", term2575);
        setIntField(term2564, term2564.getClass(), "sourcePosition", -1264595049);
        setField(term2564, term2564.getClass(), "jsType", null);
        setField(term2564, term2564.getClass(), "parent", null);
        setField(term2562, term2562.getClass(), "next", term2564);
        setIntField(term2579, term2579.getClass(), "type", 0);
        setField(term2579, term2579.getClass(), "next", null);
        setField(term2579, term2579.getClass(), "first", null);
        setField(term2579, term2579.getClass(), "last", null);
        setField(term2579, term2579.getClass(), "propListHead", null);
        setIntField(term2579, term2579.getClass(), "sourcePosition", 0);
        setField(term2579, term2579.getClass(), "jsType", null);
        setField(term2579, term2579.getClass(), "parent", null);
        setField(term2562, term2562.getClass(), "first", term2579);
        setIntField(term2582, term2582.getClass(), "type", 0);
        setField(term2582, term2582.getClass(), "next", null);
        setField(term2582, term2582.getClass(), "first", null);
        setField(term2582, term2582.getClass(), "last", null);
        setField(term2582, term2582.getClass(), "propListHead", null);
        setIntField(term2582, term2582.getClass(), "sourcePosition", 0);
        setField(term2582, term2582.getClass(), "jsType", null);
        setField(term2582, term2582.getClass(), "parent", null);
        setField(term2562, term2562.getClass(), "last", term2582);
        setField(term2585, term2585.getClass(), "next", null);
        setIntField(term2585, term2585.getClass(), "type", 0);
        setIntField(term2585, term2585.getClass(), "intValue", 0);
        setField(term2585, term2585.getClass(), "objectValue", null);
        setField(term2562, term2562.getClass(), "propListHead", term2585);
        setIntField(term2562, term2562.getClass(), "sourcePosition", -2058884635);
        setField(term2562, term2562.getClass(), "jsType", null);
        setField(term2562, term2562.getClass(), "parent", null);
        term16252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16257 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16260 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term16252, term16252.getClass(), "type", -1584779593);
        setIntField(term16253, term16253.getClass(), "type", 1407309162);
        setIntField(term16254, term16254.getClass(), "type", 0);
        setField(term16254, term16254.getClass(), "next", null);
        setField(term16254, term16254.getClass(), "first", null);
        setField(term16254, term16254.getClass(), "last", null);
        setField(term16254, term16254.getClass(), "propListHead", null);
        setIntField(term16254, term16254.getClass(), "sourcePosition", 0);
        setField(term16254, term16254.getClass(), "jsType", null);
        setField(term16254, term16254.getClass(), "parent", null);
        setField(term16253, term16253.getClass(), "next", term16254);
        setIntField(term16255, term16255.getClass(), "type", 0);
        setField(term16255, term16255.getClass(), "next", null);
        setField(term16255, term16255.getClass(), "first", null);
        setField(term16255, term16255.getClass(), "last", null);
        setField(term16255, term16255.getClass(), "propListHead", null);
        setIntField(term16255, term16255.getClass(), "sourcePosition", 0);
        setField(term16255, term16255.getClass(), "jsType", null);
        setField(term16255, term16255.getClass(), "parent", null);
        setField(term16253, term16253.getClass(), "first", term16255);
        setIntField(term16256, term16256.getClass(), "type", 0);
        setField(term16256, term16256.getClass(), "next", null);
        setField(term16256, term16256.getClass(), "first", null);
        setField(term16256, term16256.getClass(), "last", null);
        setField(term16256, term16256.getClass(), "propListHead", null);
        setIntField(term16256, term16256.getClass(), "sourcePosition", 0);
        setField(term16256, term16256.getClass(), "jsType", null);
        setField(term16256, term16256.getClass(), "parent", null);
        setField(term16253, term16253.getClass(), "last", term16256);
        setField(term16257, term16257.getClass(), "next", null);
        setIntField(term16257, term16257.getClass(), "type", 0);
        setIntField(term16257, term16257.getClass(), "intValue", 0);
        setField(term16257, term16257.getClass(), "objectValue", null);
        setField(term16253, term16253.getClass(), "propListHead", term16257);
        setIntField(term16253, term16253.getClass(), "sourcePosition", -1264595049);
        setField(term16253, term16253.getClass(), "jsType", null);
        setField(term16253, term16253.getClass(), "parent", null);
        setField(term16252, term16252.getClass(), "next", term16253);
        setIntField(term16258, term16258.getClass(), "type", 0);
        setField(term16258, term16258.getClass(), "next", null);
        setField(term16258, term16258.getClass(), "first", null);
        setField(term16258, term16258.getClass(), "last", null);
        setField(term16258, term16258.getClass(), "propListHead", null);
        setIntField(term16258, term16258.getClass(), "sourcePosition", 0);
        setField(term16258, term16258.getClass(), "jsType", null);
        setField(term16258, term16258.getClass(), "parent", null);
        setField(term16252, term16252.getClass(), "first", term16258);
        setIntField(term16259, term16259.getClass(), "type", 0);
        setField(term16259, term16259.getClass(), "next", null);
        setField(term16259, term16259.getClass(), "first", null);
        setField(term16259, term16259.getClass(), "last", null);
        setField(term16259, term16259.getClass(), "propListHead", null);
        setIntField(term16259, term16259.getClass(), "sourcePosition", 0);
        setField(term16259, term16259.getClass(), "jsType", null);
        setField(term16259, term16259.getClass(), "parent", null);
        setField(term16252, term16252.getClass(), "last", term16259);
        setField(term16260, term16260.getClass(), "next", null);
        setIntField(term16260, term16260.getClass(), "type", 0);
        setIntField(term16260, term16260.getClass(), "intValue", 0);
        setField(term16260, term16260.getClass(), "objectValue", null);
        setField(term16252, term16252.getClass(), "propListHead", term16260);
        setIntField(term16252, term16252.getClass(), "sourcePosition", -2058884635);
        setField(term16252, term16252.getClass(), "jsType", null);
        setField(term16252, term16252.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2562;
        callMethod(klass, "isFunctionObjectCall", argTypes, null, args);
        assertTrue(recursiveEquals(term2562, term16252));
    }

};


