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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class NodeUtil_newFunctionNode_885792723267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2422;
     Object term2447;
     Object term2468;
     Object term2470;

    public NodeUtil_newFunctionNode_885792723267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2425, term2425.getClass(), "type", 1407309162);
        setIntField(term2427, term2427.getClass(), "type", -2058884635);
        setIntField(term2429, term2429.getClass(), "type", 0);
        setField(term2429, term2429.getClass(), "next", null);
        setField(term2429, term2429.getClass(), "first", null);
        setField(term2429, term2429.getClass(), "last", null);
        setField(term2429, term2429.getClass(), "propListHead", null);
        setIntField(term2429, term2429.getClass(), "sourcePosition", 0);
        setField(term2429, term2429.getClass(), "jsType", null);
        setField(term2429, term2429.getClass(), "parent", null);
        setField(term2427, term2427.getClass(), "next", term2429);
        setIntField(term2432, term2432.getClass(), "type", 0);
        setField(term2432, term2432.getClass(), "next", null);
        setField(term2432, term2432.getClass(), "first", null);
        setField(term2432, term2432.getClass(), "last", null);
        setField(term2432, term2432.getClass(), "propListHead", null);
        setIntField(term2432, term2432.getClass(), "sourcePosition", 0);
        setField(term2432, term2432.getClass(), "jsType", null);
        setField(term2432, term2432.getClass(), "parent", null);
        setField(term2427, term2427.getClass(), "first", term2432);
        setIntField(term2435, term2435.getClass(), "type", 0);
        setField(term2435, term2435.getClass(), "next", null);
        setField(term2435, term2435.getClass(), "first", null);
        setField(term2435, term2435.getClass(), "last", null);
        setField(term2435, term2435.getClass(), "propListHead", null);
        setIntField(term2435, term2435.getClass(), "sourcePosition", 0);
        setField(term2435, term2435.getClass(), "jsType", null);
        setField(term2435, term2435.getClass(), "parent", null);
        setField(term2427, term2427.getClass(), "last", term2435);
        setField(term2427, term2427.getClass(), "propListHead", null);
        setIntField(term2427, term2427.getClass(), "sourcePosition", 0);
        setField(term2427, term2427.getClass(), "jsType", null);
        setField(term2427, term2427.getClass(), "parent", null);
        setField(term2425, term2425.getClass(), "next", term2427);
        setIntField(term2439, term2439.getClass(), "type", 0);
        setField(term2439, term2439.getClass(), "next", null);
        setField(term2439, term2439.getClass(), "first", null);
        setField(term2439, term2439.getClass(), "last", null);
        setField(term2439, term2439.getClass(), "propListHead", null);
        setIntField(term2439, term2439.getClass(), "sourcePosition", 0);
        setField(term2439, term2439.getClass(), "jsType", null);
        setField(term2439, term2439.getClass(), "parent", null);
        setField(term2425, term2425.getClass(), "first", term2439);
        setIntField(term2442, term2442.getClass(), "type", 0);
        setField(term2442, term2442.getClass(), "next", null);
        setField(term2442, term2442.getClass(), "first", null);
        setField(term2442, term2442.getClass(), "last", null);
        setField(term2442, term2442.getClass(), "propListHead", null);
        setIntField(term2442, term2442.getClass(), "sourcePosition", 0);
        setField(term2442, term2442.getClass(), "jsType", null);
        setField(term2442, term2442.getClass(), "parent", null);
        setField(term2425, term2425.getClass(), "last", term2442);
        setField(term2425, term2425.getClass(), "propListHead", null);
        setIntField(term2425, term2425.getClass(), "sourcePosition", 0);
        setField(term2425, term2425.getClass(), "jsType", null);
        setField(term2425, term2425.getClass(), "parent", null);
        term2422 = new LinkedList();
        ((LinkedList) term2422).add(term2425);
        term2447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2447, term2447.getClass(), "type", -2092117838);
        setIntField(term2449, term2449.getClass(), "type", 919994471);
        setIntField(term2451, term2451.getClass(), "type", 0);
        setField(term2451, term2451.getClass(), "next", null);
        setField(term2451, term2451.getClass(), "first", null);
        setField(term2451, term2451.getClass(), "last", null);
        setField(term2451, term2451.getClass(), "propListHead", null);
        setIntField(term2451, term2451.getClass(), "sourcePosition", 0);
        setField(term2451, term2451.getClass(), "jsType", null);
        setField(term2451, term2451.getClass(), "parent", null);
        setField(term2449, term2449.getClass(), "next", term2451);
        setIntField(term2454, term2454.getClass(), "type", 0);
        setField(term2454, term2454.getClass(), "next", null);
        setField(term2454, term2454.getClass(), "first", null);
        setField(term2454, term2454.getClass(), "last", null);
        setField(term2454, term2454.getClass(), "propListHead", null);
        setIntField(term2454, term2454.getClass(), "sourcePosition", 0);
        setField(term2454, term2454.getClass(), "jsType", null);
        setField(term2454, term2454.getClass(), "parent", null);
        setField(term2449, term2449.getClass(), "first", term2454);
        setIntField(term2457, term2457.getClass(), "type", 0);
        setField(term2457, term2457.getClass(), "next", null);
        setField(term2457, term2457.getClass(), "first", null);
        setField(term2457, term2457.getClass(), "last", null);
        setField(term2457, term2457.getClass(), "propListHead", null);
        setIntField(term2457, term2457.getClass(), "sourcePosition", 0);
        setField(term2457, term2457.getClass(), "jsType", null);
        setField(term2457, term2457.getClass(), "parent", null);
        setField(term2449, term2449.getClass(), "last", term2457);
        setField(term2449, term2449.getClass(), "propListHead", null);
        setIntField(term2449, term2449.getClass(), "sourcePosition", 0);
        setField(term2449, term2449.getClass(), "jsType", null);
        setField(term2449, term2449.getClass(), "parent", null);
        setField(term2447, term2447.getClass(), "next", term2449);
        setIntField(term2461, term2461.getClass(), "type", 0);
        setField(term2461, term2461.getClass(), "next", null);
        setField(term2461, term2461.getClass(), "first", null);
        setField(term2461, term2461.getClass(), "last", null);
        setField(term2461, term2461.getClass(), "propListHead", null);
        setIntField(term2461, term2461.getClass(), "sourcePosition", 0);
        setField(term2461, term2461.getClass(), "jsType", null);
        setField(term2461, term2461.getClass(), "parent", null);
        setField(term2447, term2447.getClass(), "first", term2461);
        setIntField(term2464, term2464.getClass(), "type", 0);
        setField(term2464, term2464.getClass(), "next", null);
        setField(term2464, term2464.getClass(), "first", null);
        setField(term2464, term2464.getClass(), "last", null);
        setField(term2464, term2464.getClass(), "propListHead", null);
        setIntField(term2464, term2464.getClass(), "sourcePosition", 0);
        setField(term2464, term2464.getClass(), "jsType", null);
        setField(term2464, term2464.getClass(), "parent", null);
        setField(term2447, term2447.getClass(), "last", term2464);
        setField(term2447, term2447.getClass(), "propListHead", null);
        setIntField(term2447, term2447.getClass(), "sourcePosition", 0);
        setField(term2447, term2447.getClass(), "jsType", null);
        setField(term2447, term2447.getClass(), "parent", null);
        term2468 = new Integer(1876738932);
        term2470 = new Integer(-1870339027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = "oVcInYnLWB";
        args[1] = term2422;
        args[2] = term2447;
        args[3] = term2468;
        args[4] = term2470;
        try {
            callMethod(klass, "newFunctionNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


