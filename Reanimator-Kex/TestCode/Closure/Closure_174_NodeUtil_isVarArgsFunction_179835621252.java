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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_isVarArgsFunction_179835621252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2276;

    public NodeUtil_isVarArgsFunction_179835621252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2276, term2276.getClass(), "type", -2009613557);
        setIntField(term2278, term2278.getClass(), "type", 654195547);
        setIntField(term2280, term2280.getClass(), "type", 1622857008);
        setIntField(term2282, term2282.getClass(), "type", 934338954);
        setIntField(term2284, term2284.getClass(), "type", 598635505);
        setField(term2284, term2284.getClass(), "next", null);
        setField(term2284, term2284.getClass(), "first", null);
        setField(term2284, term2284.getClass(), "last", null);
        setField(term2284, term2284.getClass(), "propListHead", null);
        setIntField(term2284, term2284.getClass(), "sourcePosition", 0);
        setField(term2284, term2284.getClass(), "jsType", null);
        setField(term2284, term2284.getClass(), "parent", null);
        setField(term2282, term2282.getClass(), "next", term2284);
        setIntField(term2287, term2287.getClass(), "type", -944986533);
        setField(term2287, term2287.getClass(), "next", null);
        setField(term2287, term2287.getClass(), "first", null);
        setField(term2287, term2287.getClass(), "last", term2284);
        setField(term2287, term2287.getClass(), "propListHead", null);
        setIntField(term2287, term2287.getClass(), "sourcePosition", 0);
        setField(term2287, term2287.getClass(), "jsType", null);
        setField(term2287, term2287.getClass(), "parent", null);
        setField(term2282, term2282.getClass(), "first", term2287);
        setField(term2282, term2282.getClass(), "last", term2280);
        setField(term2282, term2282.getClass(), "propListHead", null);
        setIntField(term2282, term2282.getClass(), "sourcePosition", 0);
        setField(term2282, term2282.getClass(), "jsType", null);
        setField(term2282, term2282.getClass(), "parent", null);
        setField(term2280, term2280.getClass(), "next", term2282);
        setField(term2280, term2280.getClass(), "first", term2284);
        setIntField(term2291, term2291.getClass(), "type", 1415142780);
        setIntField(term2293, term2293.getClass(), "type", -574105759);
        setField(term2293, term2293.getClass(), "next", null);
        setField(term2293, term2293.getClass(), "first", term2287);
        setField(term2293, term2293.getClass(), "last", term2282);
        setField(term2293, term2293.getClass(), "propListHead", null);
        setIntField(term2293, term2293.getClass(), "sourcePosition", 0);
        setField(term2293, term2293.getClass(), "jsType", null);
        setField(term2293, term2293.getClass(), "parent", null);
        setField(term2291, term2291.getClass(), "next", term2293);
        setField(term2291, term2291.getClass(), "first", term2278);
        setField(term2291, term2291.getClass(), "last", term2278);
        setField(term2291, term2291.getClass(), "propListHead", null);
        setIntField(term2291, term2291.getClass(), "sourcePosition", 0);
        setField(term2291, term2291.getClass(), "jsType", null);
        setField(term2291, term2291.getClass(), "parent", null);
        setField(term2280, term2280.getClass(), "last", term2291);
        setField(term2280, term2280.getClass(), "propListHead", null);
        setIntField(term2280, term2280.getClass(), "sourcePosition", 0);
        setField(term2280, term2280.getClass(), "jsType", null);
        setField(term2280, term2280.getClass(), "parent", null);
        setField(term2278, term2278.getClass(), "next", term2280);
        setIntField(term2298, term2298.getClass(), "type", -1165271567);
        setField(term2298, term2298.getClass(), "next", term2291);
        setField(term2298, term2298.getClass(), "first", term2293);
        setField(term2298, term2298.getClass(), "last", term2276);
        setField(term2298, term2298.getClass(), "propListHead", null);
        setIntField(term2298, term2298.getClass(), "sourcePosition", 0);
        setField(term2298, term2298.getClass(), "jsType", null);
        setField(term2298, term2298.getClass(), "parent", null);
        setField(term2278, term2278.getClass(), "first", term2298);
        setField(term2278, term2278.getClass(), "last", term2298);
        setField(term2278, term2278.getClass(), "propListHead", null);
        setIntField(term2278, term2278.getClass(), "sourcePosition", 0);
        setField(term2278, term2278.getClass(), "jsType", null);
        setField(term2278, term2278.getClass(), "parent", null);
        setField(term2276, term2276.getClass(), "next", term2278);
        setField(term2276, term2276.getClass(), "first", term2282);
        setField(term2276, term2276.getClass(), "last", term2284);
        setField(term2276, term2276.getClass(), "propListHead", null);
        setIntField(term2276, term2276.getClass(), "sourcePosition", 0);
        setField(term2276, term2276.getClass(), "jsType", null);
        setField(term2276, term2276.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2276;
        try {
            callMethod(klass, "isVarArgsFunction", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


