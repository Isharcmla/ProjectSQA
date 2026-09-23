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

public class NodeUtil_canBeSideEffected_1382575805144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term651;
     Object term7491;

    public NodeUtil_canBeSideEffected_1382575805144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term664 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term674 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term651, term651.getClass(), "type", -1656687479);
        setIntField(term653, term653.getClass(), "type", -680920524);
        setIntField(term655, term655.getClass(), "type", 0);
        setField(term655, term655.getClass(), "next", null);
        setField(term655, term655.getClass(), "first", null);
        setField(term655, term655.getClass(), "last", null);
        setField(term655, term655.getClass(), "propListHead", null);
        setIntField(term655, term655.getClass(), "sourcePosition", 0);
        setField(term655, term655.getClass(), "jsType", null);
        setField(term655, term655.getClass(), "parent", null);
        setField(term653, term653.getClass(), "next", term655);
        setIntField(term658, term658.getClass(), "type", 0);
        setField(term658, term658.getClass(), "next", null);
        setField(term658, term658.getClass(), "first", null);
        setField(term658, term658.getClass(), "last", null);
        setField(term658, term658.getClass(), "propListHead", null);
        setIntField(term658, term658.getClass(), "sourcePosition", 0);
        setField(term658, term658.getClass(), "jsType", null);
        setField(term658, term658.getClass(), "parent", null);
        setField(term653, term653.getClass(), "first", term658);
        setIntField(term661, term661.getClass(), "type", 0);
        setField(term661, term661.getClass(), "next", null);
        setField(term661, term661.getClass(), "first", null);
        setField(term661, term661.getClass(), "last", null);
        setField(term661, term661.getClass(), "propListHead", null);
        setIntField(term661, term661.getClass(), "sourcePosition", 0);
        setField(term661, term661.getClass(), "jsType", null);
        setField(term661, term661.getClass(), "parent", null);
        setField(term653, term653.getClass(), "last", term661);
        setField(term664, term664.getClass(), "next", null);
        setIntField(term664, term664.getClass(), "type", 0);
        setIntField(term664, term664.getClass(), "intValue", 0);
        setField(term664, term664.getClass(), "objectValue", null);
        setField(term653, term653.getClass(), "propListHead", term664);
        setIntField(term653, term653.getClass(), "sourcePosition", -43417861);
        setField(term653, term653.getClass(), "jsType", null);
        setField(term653, term653.getClass(), "parent", null);
        setField(term651, term651.getClass(), "next", term653);
        setIntField(term668, term668.getClass(), "type", 0);
        setField(term668, term668.getClass(), "next", null);
        setField(term668, term668.getClass(), "first", null);
        setField(term668, term668.getClass(), "last", null);
        setField(term668, term668.getClass(), "propListHead", null);
        setIntField(term668, term668.getClass(), "sourcePosition", 0);
        setField(term668, term668.getClass(), "jsType", null);
        setField(term668, term668.getClass(), "parent", null);
        setField(term651, term651.getClass(), "first", term668);
        setIntField(term671, term671.getClass(), "type", 0);
        setField(term671, term671.getClass(), "next", null);
        setField(term671, term671.getClass(), "first", null);
        setField(term671, term671.getClass(), "last", null);
        setField(term671, term671.getClass(), "propListHead", null);
        setIntField(term671, term671.getClass(), "sourcePosition", 0);
        setField(term671, term671.getClass(), "jsType", null);
        setField(term671, term671.getClass(), "parent", null);
        setField(term651, term651.getClass(), "last", term671);
        setField(term674, term674.getClass(), "next", null);
        setIntField(term674, term674.getClass(), "type", 0);
        setIntField(term674, term674.getClass(), "intValue", 0);
        setField(term674, term674.getClass(), "objectValue", null);
        setField(term651, term651.getClass(), "propListHead", term674);
        setIntField(term651, term651.getClass(), "sourcePosition", -1533843432);
        setField(term651, term651.getClass(), "jsType", null);
        setField(term651, term651.getClass(), "parent", null);
        term7491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7496 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7499 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7491, term7491.getClass(), "type", -1656687479);
        setIntField(term7492, term7492.getClass(), "type", -680920524);
        setIntField(term7493, term7493.getClass(), "type", 0);
        setField(term7493, term7493.getClass(), "next", null);
        setField(term7493, term7493.getClass(), "first", null);
        setField(term7493, term7493.getClass(), "last", null);
        setField(term7493, term7493.getClass(), "propListHead", null);
        setIntField(term7493, term7493.getClass(), "sourcePosition", 0);
        setField(term7493, term7493.getClass(), "jsType", null);
        setField(term7493, term7493.getClass(), "parent", null);
        setField(term7492, term7492.getClass(), "next", term7493);
        setIntField(term7494, term7494.getClass(), "type", 0);
        setField(term7494, term7494.getClass(), "next", null);
        setField(term7494, term7494.getClass(), "first", null);
        setField(term7494, term7494.getClass(), "last", null);
        setField(term7494, term7494.getClass(), "propListHead", null);
        setIntField(term7494, term7494.getClass(), "sourcePosition", 0);
        setField(term7494, term7494.getClass(), "jsType", null);
        setField(term7494, term7494.getClass(), "parent", null);
        setField(term7492, term7492.getClass(), "first", term7494);
        setIntField(term7495, term7495.getClass(), "type", 0);
        setField(term7495, term7495.getClass(), "next", null);
        setField(term7495, term7495.getClass(), "first", null);
        setField(term7495, term7495.getClass(), "last", null);
        setField(term7495, term7495.getClass(), "propListHead", null);
        setIntField(term7495, term7495.getClass(), "sourcePosition", 0);
        setField(term7495, term7495.getClass(), "jsType", null);
        setField(term7495, term7495.getClass(), "parent", null);
        setField(term7492, term7492.getClass(), "last", term7495);
        setField(term7496, term7496.getClass(), "next", null);
        setIntField(term7496, term7496.getClass(), "type", 0);
        setIntField(term7496, term7496.getClass(), "intValue", 0);
        setField(term7496, term7496.getClass(), "objectValue", null);
        setField(term7492, term7492.getClass(), "propListHead", term7496);
        setIntField(term7492, term7492.getClass(), "sourcePosition", -43417861);
        setField(term7492, term7492.getClass(), "jsType", null);
        setField(term7492, term7492.getClass(), "parent", null);
        setField(term7491, term7491.getClass(), "next", term7492);
        setIntField(term7497, term7497.getClass(), "type", 0);
        setField(term7497, term7497.getClass(), "next", null);
        setField(term7497, term7497.getClass(), "first", null);
        setField(term7497, term7497.getClass(), "last", null);
        setField(term7497, term7497.getClass(), "propListHead", null);
        setIntField(term7497, term7497.getClass(), "sourcePosition", 0);
        setField(term7497, term7497.getClass(), "jsType", null);
        setField(term7497, term7497.getClass(), "parent", null);
        setField(term7491, term7491.getClass(), "first", term7497);
        setIntField(term7498, term7498.getClass(), "type", 0);
        setField(term7498, term7498.getClass(), "next", null);
        setField(term7498, term7498.getClass(), "first", null);
        setField(term7498, term7498.getClass(), "last", null);
        setField(term7498, term7498.getClass(), "propListHead", null);
        setIntField(term7498, term7498.getClass(), "sourcePosition", 0);
        setField(term7498, term7498.getClass(), "jsType", null);
        setField(term7498, term7498.getClass(), "parent", null);
        setField(term7491, term7491.getClass(), "last", term7498);
        setField(term7499, term7499.getClass(), "next", null);
        setIntField(term7499, term7499.getClass(), "type", 0);
        setIntField(term7499, term7499.getClass(), "intValue", 0);
        setField(term7499, term7499.getClass(), "objectValue", null);
        setField(term7491, term7491.getClass(), "propListHead", term7499);
        setIntField(term7491, term7491.getClass(), "sourcePosition", -1533843432);
        setField(term7491, term7491.getClass(), "jsType", null);
        setField(term7491, term7491.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term651;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term651, term7491));
    }

};


