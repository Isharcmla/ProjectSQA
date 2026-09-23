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
     Object term16346;

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
        term16346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16351 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16354 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term16346, term16346.getClass(), "type", -1823255084);
        setIntField(term16347, term16347.getClass(), "type", 1523896653);
        setIntField(term16348, term16348.getClass(), "type", 0);
        setField(term16348, term16348.getClass(), "next", null);
        setField(term16348, term16348.getClass(), "first", null);
        setField(term16348, term16348.getClass(), "last", null);
        setField(term16348, term16348.getClass(), "propListHead", null);
        setIntField(term16348, term16348.getClass(), "sourcePosition", 0);
        setField(term16348, term16348.getClass(), "jsType", null);
        setField(term16348, term16348.getClass(), "parent", null);
        setField(term16347, term16347.getClass(), "next", term16348);
        setIntField(term16349, term16349.getClass(), "type", 0);
        setField(term16349, term16349.getClass(), "next", null);
        setField(term16349, term16349.getClass(), "first", null);
        setField(term16349, term16349.getClass(), "last", null);
        setField(term16349, term16349.getClass(), "propListHead", null);
        setIntField(term16349, term16349.getClass(), "sourcePosition", 0);
        setField(term16349, term16349.getClass(), "jsType", null);
        setField(term16349, term16349.getClass(), "parent", null);
        setField(term16347, term16347.getClass(), "first", term16349);
        setIntField(term16350, term16350.getClass(), "type", 0);
        setField(term16350, term16350.getClass(), "next", null);
        setField(term16350, term16350.getClass(), "first", null);
        setField(term16350, term16350.getClass(), "last", null);
        setField(term16350, term16350.getClass(), "propListHead", null);
        setIntField(term16350, term16350.getClass(), "sourcePosition", 0);
        setField(term16350, term16350.getClass(), "jsType", null);
        setField(term16350, term16350.getClass(), "parent", null);
        setField(term16347, term16347.getClass(), "last", term16350);
        setField(term16351, term16351.getClass(), "next", null);
        setIntField(term16351, term16351.getClass(), "type", 0);
        setIntField(term16351, term16351.getClass(), "intValue", 0);
        setField(term16351, term16351.getClass(), "objectValue", null);
        setField(term16347, term16347.getClass(), "propListHead", term16351);
        setIntField(term16347, term16347.getClass(), "sourcePosition", 183531701);
        setField(term16347, term16347.getClass(), "jsType", null);
        setField(term16347, term16347.getClass(), "parent", null);
        setField(term16346, term16346.getClass(), "next", term16347);
        setIntField(term16352, term16352.getClass(), "type", 0);
        setField(term16352, term16352.getClass(), "next", null);
        setField(term16352, term16352.getClass(), "first", null);
        setField(term16352, term16352.getClass(), "last", null);
        setField(term16352, term16352.getClass(), "propListHead", null);
        setIntField(term16352, term16352.getClass(), "sourcePosition", 0);
        setField(term16352, term16352.getClass(), "jsType", null);
        setField(term16352, term16352.getClass(), "parent", null);
        setField(term16346, term16346.getClass(), "first", term16352);
        setIntField(term16353, term16353.getClass(), "type", 0);
        setField(term16353, term16353.getClass(), "next", null);
        setField(term16353, term16353.getClass(), "first", null);
        setField(term16353, term16353.getClass(), "last", null);
        setField(term16353, term16353.getClass(), "propListHead", null);
        setIntField(term16353, term16353.getClass(), "sourcePosition", 0);
        setField(term16353, term16353.getClass(), "jsType", null);
        setField(term16353, term16353.getClass(), "parent", null);
        setField(term16346, term16346.getClass(), "last", term16353);
        setField(term16354, term16354.getClass(), "next", null);
        setIntField(term16354, term16354.getClass(), "type", 0);
        setIntField(term16354, term16354.getClass(), "intValue", 0);
        setField(term16354, term16354.getClass(), "objectValue", null);
        setField(term16346, term16346.getClass(), "propListHead", term16354);
        setIntField(term16346, term16346.getClass(), "sourcePosition", -974923743);
        setField(term16346, term16346.getClass(), "jsType", null);
        setField(term16346, term16346.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2589;
        callMethod(klass, "isFunctionObjectApply", argTypes, null, args);
        assertTrue(recursiveEquals(term2589, term16346));
    }

};


