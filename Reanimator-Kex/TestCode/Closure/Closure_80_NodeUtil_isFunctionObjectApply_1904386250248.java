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

public class NodeUtil_isFunctionObjectApply_1904386250248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2589;
     Object term16299;

    public NodeUtil_isFunctionObjectApply_1904386250248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2602 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2612 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2589, term2589.getClass(), "type", -1823255084);
        setIntField(term2591, term2591.getClass(), "type", 1523896653);
        setIntField(term2593, term2593.getClass(), "type", 0);
        setField(term2593, term2593.getClass(), "next", null);
        setField(term2593, term2593.getClass(), "first", null);
        setField(term2593, term2593.getClass(), "last", null);
        setField(term2593, term2593.getClass(), "propListHead", null);
        setIntField(term2593, term2593.getClass(), "sourcePosition", 0);
        setField(term2593, term2593.getClass(), "jsType", null);
        setField(term2593, term2593.getClass(), "parent", null);
        setField(term2591, term2591.getClass(), "next", term2593);
        setIntField(term2596, term2596.getClass(), "type", 0);
        setField(term2596, term2596.getClass(), "next", null);
        setField(term2596, term2596.getClass(), "first", null);
        setField(term2596, term2596.getClass(), "last", null);
        setField(term2596, term2596.getClass(), "propListHead", null);
        setIntField(term2596, term2596.getClass(), "sourcePosition", 0);
        setField(term2596, term2596.getClass(), "jsType", null);
        setField(term2596, term2596.getClass(), "parent", null);
        setField(term2591, term2591.getClass(), "first", term2596);
        setIntField(term2599, term2599.getClass(), "type", 0);
        setField(term2599, term2599.getClass(), "next", null);
        setField(term2599, term2599.getClass(), "first", null);
        setField(term2599, term2599.getClass(), "last", null);
        setField(term2599, term2599.getClass(), "propListHead", null);
        setIntField(term2599, term2599.getClass(), "sourcePosition", 0);
        setField(term2599, term2599.getClass(), "jsType", null);
        setField(term2599, term2599.getClass(), "parent", null);
        setField(term2591, term2591.getClass(), "last", term2599);
        setField(term2602, term2602.getClass(), "next", null);
        setIntField(term2602, term2602.getClass(), "type", 0);
        setIntField(term2602, term2602.getClass(), "intValue", 0);
        setField(term2602, term2602.getClass(), "objectValue", null);
        setField(term2591, term2591.getClass(), "propListHead", term2602);
        setIntField(term2591, term2591.getClass(), "sourcePosition", 183531701);
        setField(term2591, term2591.getClass(), "jsType", null);
        setField(term2591, term2591.getClass(), "parent", null);
        setField(term2589, term2589.getClass(), "next", term2591);
        setIntField(term2606, term2606.getClass(), "type", 0);
        setField(term2606, term2606.getClass(), "next", null);
        setField(term2606, term2606.getClass(), "first", null);
        setField(term2606, term2606.getClass(), "last", null);
        setField(term2606, term2606.getClass(), "propListHead", null);
        setIntField(term2606, term2606.getClass(), "sourcePosition", 0);
        setField(term2606, term2606.getClass(), "jsType", null);
        setField(term2606, term2606.getClass(), "parent", null);
        setField(term2589, term2589.getClass(), "first", term2606);
        setIntField(term2609, term2609.getClass(), "type", 0);
        setField(term2609, term2609.getClass(), "next", null);
        setField(term2609, term2609.getClass(), "first", null);
        setField(term2609, term2609.getClass(), "last", null);
        setField(term2609, term2609.getClass(), "propListHead", null);
        setIntField(term2609, term2609.getClass(), "sourcePosition", 0);
        setField(term2609, term2609.getClass(), "jsType", null);
        setField(term2609, term2609.getClass(), "parent", null);
        setField(term2589, term2589.getClass(), "last", term2609);
        setField(term2612, term2612.getClass(), "next", null);
        setIntField(term2612, term2612.getClass(), "type", 0);
        setIntField(term2612, term2612.getClass(), "intValue", 0);
        setField(term2612, term2612.getClass(), "objectValue", null);
        setField(term2589, term2589.getClass(), "propListHead", term2612);
        setIntField(term2589, term2589.getClass(), "sourcePosition", -974923743);
        setField(term2589, term2589.getClass(), "jsType", null);
        setField(term2589, term2589.getClass(), "parent", null);
        term16299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16304 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16307 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term16299, term16299.getClass(), "type", -1823255084);
        setIntField(term16300, term16300.getClass(), "type", 1523896653);
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
        setIntField(term16300, term16300.getClass(), "sourcePosition", 183531701);
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
        setIntField(term16299, term16299.getClass(), "sourcePosition", -974923743);
        setField(term16299, term16299.getClass(), "jsType", null);
        setField(term16299, term16299.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2589;
        callMethod(klass, "isFunctionObjectApply", argTypes, null, args);
        assertTrue(recursiveEquals(term2589, term16299));
    }

};


