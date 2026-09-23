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

public class NodeUtil_newFunctionNode_885792723202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2343;
     Object term2374;
     Object term2401;
     Object term2403;

    public NodeUtil_newFunctionNode_885792723202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2359 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2369 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2346, term2346.getClass(), "type", -1389314671);
        setIntField(term2348, term2348.getClass(), "type", 1054887169);
        setIntField(term2350, term2350.getClass(), "type", 0);
        setField(term2350, term2350.getClass(), "next", null);
        setField(term2350, term2350.getClass(), "first", null);
        setField(term2350, term2350.getClass(), "last", null);
        setField(term2350, term2350.getClass(), "propListHead", null);
        setIntField(term2350, term2350.getClass(), "sourcePosition", 0);
        setField(term2350, term2350.getClass(), "jsType", null);
        setField(term2350, term2350.getClass(), "parent", null);
        setField(term2348, term2348.getClass(), "next", term2350);
        setIntField(term2353, term2353.getClass(), "type", 0);
        setField(term2353, term2353.getClass(), "next", null);
        setField(term2353, term2353.getClass(), "first", null);
        setField(term2353, term2353.getClass(), "last", null);
        setField(term2353, term2353.getClass(), "propListHead", null);
        setIntField(term2353, term2353.getClass(), "sourcePosition", 0);
        setField(term2353, term2353.getClass(), "jsType", null);
        setField(term2353, term2353.getClass(), "parent", null);
        setField(term2348, term2348.getClass(), "first", term2353);
        setIntField(term2356, term2356.getClass(), "type", 0);
        setField(term2356, term2356.getClass(), "next", null);
        setField(term2356, term2356.getClass(), "first", null);
        setField(term2356, term2356.getClass(), "last", null);
        setField(term2356, term2356.getClass(), "propListHead", null);
        setIntField(term2356, term2356.getClass(), "sourcePosition", 0);
        setField(term2356, term2356.getClass(), "jsType", null);
        setField(term2356, term2356.getClass(), "parent", null);
        setField(term2348, term2348.getClass(), "last", term2356);
        setField(term2359, term2359.getClass(), "next", null);
        setIntField(term2359, term2359.getClass(), "type", 0);
        setIntField(term2359, term2359.getClass(), "intValue", 0);
        setField(term2359, term2359.getClass(), "objectValue", null);
        setField(term2348, term2348.getClass(), "propListHead", term2359);
        setIntField(term2348, term2348.getClass(), "sourcePosition", 1841493736);
        setField(term2348, term2348.getClass(), "jsType", null);
        setField(term2348, term2348.getClass(), "parent", null);
        setField(term2346, term2346.getClass(), "next", term2348);
        setIntField(term2363, term2363.getClass(), "type", 0);
        setField(term2363, term2363.getClass(), "next", null);
        setField(term2363, term2363.getClass(), "first", null);
        setField(term2363, term2363.getClass(), "last", null);
        setField(term2363, term2363.getClass(), "propListHead", null);
        setIntField(term2363, term2363.getClass(), "sourcePosition", 0);
        setField(term2363, term2363.getClass(), "jsType", null);
        setField(term2363, term2363.getClass(), "parent", null);
        setField(term2346, term2346.getClass(), "first", term2363);
        setIntField(term2366, term2366.getClass(), "type", 0);
        setField(term2366, term2366.getClass(), "next", null);
        setField(term2366, term2366.getClass(), "first", null);
        setField(term2366, term2366.getClass(), "last", null);
        setField(term2366, term2366.getClass(), "propListHead", null);
        setIntField(term2366, term2366.getClass(), "sourcePosition", 0);
        setField(term2366, term2366.getClass(), "jsType", null);
        setField(term2366, term2366.getClass(), "parent", null);
        setField(term2346, term2346.getClass(), "last", term2366);
        setField(term2369, term2369.getClass(), "next", null);
        setIntField(term2369, term2369.getClass(), "type", 0);
        setIntField(term2369, term2369.getClass(), "intValue", 0);
        setField(term2369, term2369.getClass(), "objectValue", null);
        setField(term2346, term2346.getClass(), "propListHead", term2369);
        setIntField(term2346, term2346.getClass(), "sourcePosition", 320739944);
        setField(term2346, term2346.getClass(), "jsType", null);
        setField(term2346, term2346.getClass(), "parent", null);
        term2343 = new LinkedList();
        ((LinkedList) term2343).add(term2346);
        term2374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2387 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2397 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2374, term2374.getClass(), "type", -709868952);
        setIntField(term2376, term2376.getClass(), "type", -975856245);
        setIntField(term2378, term2378.getClass(), "type", 0);
        setField(term2378, term2378.getClass(), "next", null);
        setField(term2378, term2378.getClass(), "first", null);
        setField(term2378, term2378.getClass(), "last", null);
        setField(term2378, term2378.getClass(), "propListHead", null);
        setIntField(term2378, term2378.getClass(), "sourcePosition", 0);
        setField(term2378, term2378.getClass(), "jsType", null);
        setField(term2378, term2378.getClass(), "parent", null);
        setField(term2376, term2376.getClass(), "next", term2378);
        setIntField(term2381, term2381.getClass(), "type", 0);
        setField(term2381, term2381.getClass(), "next", null);
        setField(term2381, term2381.getClass(), "first", null);
        setField(term2381, term2381.getClass(), "last", null);
        setField(term2381, term2381.getClass(), "propListHead", null);
        setIntField(term2381, term2381.getClass(), "sourcePosition", 0);
        setField(term2381, term2381.getClass(), "jsType", null);
        setField(term2381, term2381.getClass(), "parent", null);
        setField(term2376, term2376.getClass(), "first", term2381);
        setIntField(term2384, term2384.getClass(), "type", 0);
        setField(term2384, term2384.getClass(), "next", null);
        setField(term2384, term2384.getClass(), "first", null);
        setField(term2384, term2384.getClass(), "last", null);
        setField(term2384, term2384.getClass(), "propListHead", null);
        setIntField(term2384, term2384.getClass(), "sourcePosition", 0);
        setField(term2384, term2384.getClass(), "jsType", null);
        setField(term2384, term2384.getClass(), "parent", null);
        setField(term2376, term2376.getClass(), "last", term2384);
        setField(term2387, term2387.getClass(), "next", null);
        setIntField(term2387, term2387.getClass(), "type", 0);
        setIntField(term2387, term2387.getClass(), "intValue", 0);
        setField(term2387, term2387.getClass(), "objectValue", null);
        setField(term2376, term2376.getClass(), "propListHead", term2387);
        setIntField(term2376, term2376.getClass(), "sourcePosition", 755951489);
        setField(term2376, term2376.getClass(), "jsType", null);
        setField(term2376, term2376.getClass(), "parent", null);
        setField(term2374, term2374.getClass(), "next", term2376);
        setIntField(term2391, term2391.getClass(), "type", 0);
        setField(term2391, term2391.getClass(), "next", null);
        setField(term2391, term2391.getClass(), "first", null);
        setField(term2391, term2391.getClass(), "last", null);
        setField(term2391, term2391.getClass(), "propListHead", null);
        setIntField(term2391, term2391.getClass(), "sourcePosition", 0);
        setField(term2391, term2391.getClass(), "jsType", null);
        setField(term2391, term2391.getClass(), "parent", null);
        setField(term2374, term2374.getClass(), "first", term2391);
        setIntField(term2394, term2394.getClass(), "type", 0);
        setField(term2394, term2394.getClass(), "next", null);
        setField(term2394, term2394.getClass(), "first", null);
        setField(term2394, term2394.getClass(), "last", null);
        setField(term2394, term2394.getClass(), "propListHead", null);
        setIntField(term2394, term2394.getClass(), "sourcePosition", 0);
        setField(term2394, term2394.getClass(), "jsType", null);
        setField(term2394, term2394.getClass(), "parent", null);
        setField(term2374, term2374.getClass(), "last", term2394);
        setField(term2397, term2397.getClass(), "next", null);
        setIntField(term2397, term2397.getClass(), "type", 0);
        setIntField(term2397, term2397.getClass(), "intValue", 0);
        setField(term2397, term2397.getClass(), "objectValue", null);
        setField(term2374, term2374.getClass(), "propListHead", term2397);
        setIntField(term2374, term2374.getClass(), "sourcePosition", 1175146356);
        setField(term2374, term2374.getClass(), "jsType", null);
        setField(term2374, term2374.getClass(), "parent", null);
        term2401 = new Integer(-2137419728);
        term2403 = new Integer(1558810715);
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
        args[0] = "MxlszYVzRf";
        args[1] = term2343;
        args[2] = term2374;
        args[3] = term2401;
        args[4] = term2403;
        try {
            callMethod(klass, "newFunctionNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


