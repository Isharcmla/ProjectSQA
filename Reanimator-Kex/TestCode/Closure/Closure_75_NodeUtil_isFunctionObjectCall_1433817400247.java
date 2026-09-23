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
     Object term16299;

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
        term16299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16304 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16307 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term16299, term16299.getClass(), "type", -1584779593);
        setIntField(term16300, term16300.getClass(), "type", 1407309162);
        setIntField(term16301, term16301.getClass(), "type", 0);
        setField(term16301, term16301.getClass(), "next", null);
        setField(term16301, term16301.getClass(), "first", null);
        setField(term16301, term16301.getClass(), "last", null);
        setField(term16301, term16301.getClass(), "propListHead", null);
        setIntField(term16301, term16301.getClass(), "sourcePosition", 0);
        setField(term16301, term16301.getClass(), "jsType", null);
        setField(term16301, term16301.getClass(), "parent", null);
        setField(term16300, term16300.getClass(), "next", term16301);
        setIntField(term16302, term16302.getClass(), "type", 0);
        setField(term16302, term16302.getClass(), "next", null);
        setField(term16302, term16302.getClass(), "first", null);
        setField(term16302, term16302.getClass(), "last", null);
        setField(term16302, term16302.getClass(), "propListHead", null);
        setIntField(term16302, term16302.getClass(), "sourcePosition", 0);
        setField(term16302, term16302.getClass(), "jsType", null);
        setField(term16302, term16302.getClass(), "parent", null);
        setField(term16300, term16300.getClass(), "first", term16302);
        setIntField(term16303, term16303.getClass(), "type", 0);
        setField(term16303, term16303.getClass(), "next", null);
        setField(term16303, term16303.getClass(), "first", null);
        setField(term16303, term16303.getClass(), "last", null);
        setField(term16303, term16303.getClass(), "propListHead", null);
        setIntField(term16303, term16303.getClass(), "sourcePosition", 0);
        setField(term16303, term16303.getClass(), "jsType", null);
        setField(term16303, term16303.getClass(), "parent", null);
        setField(term16300, term16300.getClass(), "last", term16303);
        setField(term16304, term16304.getClass(), "next", null);
        setIntField(term16304, term16304.getClass(), "type", 0);
        setIntField(term16304, term16304.getClass(), "intValue", 0);
        setField(term16304, term16304.getClass(), "objectValue", null);
        setField(term16300, term16300.getClass(), "propListHead", term16304);
        setIntField(term16300, term16300.getClass(), "sourcePosition", -1264595049);
        setField(term16300, term16300.getClass(), "jsType", null);
        setField(term16300, term16300.getClass(), "parent", null);
        setField(term16299, term16299.getClass(), "next", term16300);
        setIntField(term16305, term16305.getClass(), "type", 0);
        setField(term16305, term16305.getClass(), "next", null);
        setField(term16305, term16305.getClass(), "first", null);
        setField(term16305, term16305.getClass(), "last", null);
        setField(term16305, term16305.getClass(), "propListHead", null);
        setIntField(term16305, term16305.getClass(), "sourcePosition", 0);
        setField(term16305, term16305.getClass(), "jsType", null);
        setField(term16305, term16305.getClass(), "parent", null);
        setField(term16299, term16299.getClass(), "first", term16305);
        setIntField(term16306, term16306.getClass(), "type", 0);
        setField(term16306, term16306.getClass(), "next", null);
        setField(term16306, term16306.getClass(), "first", null);
        setField(term16306, term16306.getClass(), "last", null);
        setField(term16306, term16306.getClass(), "propListHead", null);
        setIntField(term16306, term16306.getClass(), "sourcePosition", 0);
        setField(term16306, term16306.getClass(), "jsType", null);
        setField(term16306, term16306.getClass(), "parent", null);
        setField(term16299, term16299.getClass(), "last", term16306);
        setField(term16307, term16307.getClass(), "next", null);
        setIntField(term16307, term16307.getClass(), "type", 0);
        setIntField(term16307, term16307.getClass(), "intValue", 0);
        setField(term16307, term16307.getClass(), "objectValue", null);
        setField(term16299, term16299.getClass(), "propListHead", term16307);
        setIntField(term16299, term16299.getClass(), "sourcePosition", -2058884635);
        setField(term16299, term16299.getClass(), "jsType", null);
        setField(term16299, term16299.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2562;
        callMethod(klass, "isFunctionObjectCall", argTypes, null, args);
        assertTrue(recursiveEquals(term2562, term16299));
    }

};


