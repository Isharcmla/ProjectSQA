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

public class NodeUtil_isFunctionExpression_1470741603243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2432;
     Object term15800;

    public NodeUtil_isFunctionExpression_1470741603243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2445 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2455 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2432, term2432.getClass(), "type", -460657407);
        setIntField(term2434, term2434.getClass(), "type", 355911655);
        setIntField(term2436, term2436.getClass(), "type", 0);
        setField(term2436, term2436.getClass(), "next", null);
        setField(term2436, term2436.getClass(), "first", null);
        setField(term2436, term2436.getClass(), "last", null);
        setField(term2436, term2436.getClass(), "propListHead", null);
        setIntField(term2436, term2436.getClass(), "sourcePosition", 0);
        setField(term2436, term2436.getClass(), "jsType", null);
        setField(term2436, term2436.getClass(), "parent", null);
        setField(term2434, term2434.getClass(), "next", term2436);
        setIntField(term2439, term2439.getClass(), "type", 0);
        setField(term2439, term2439.getClass(), "next", null);
        setField(term2439, term2439.getClass(), "first", null);
        setField(term2439, term2439.getClass(), "last", null);
        setField(term2439, term2439.getClass(), "propListHead", null);
        setIntField(term2439, term2439.getClass(), "sourcePosition", 0);
        setField(term2439, term2439.getClass(), "jsType", null);
        setField(term2439, term2439.getClass(), "parent", null);
        setField(term2434, term2434.getClass(), "first", term2439);
        setIntField(term2442, term2442.getClass(), "type", 0);
        setField(term2442, term2442.getClass(), "next", null);
        setField(term2442, term2442.getClass(), "first", null);
        setField(term2442, term2442.getClass(), "last", null);
        setField(term2442, term2442.getClass(), "propListHead", null);
        setIntField(term2442, term2442.getClass(), "sourcePosition", 0);
        setField(term2442, term2442.getClass(), "jsType", null);
        setField(term2442, term2442.getClass(), "parent", null);
        setField(term2434, term2434.getClass(), "last", term2442);
        setField(term2445, term2445.getClass(), "next", null);
        setIntField(term2445, term2445.getClass(), "type", 0);
        setIntField(term2445, term2445.getClass(), "intValue", 0);
        setField(term2445, term2445.getClass(), "objectValue", null);
        setField(term2434, term2434.getClass(), "propListHead", term2445);
        setIntField(term2434, term2434.getClass(), "sourcePosition", -1784072578);
        setField(term2434, term2434.getClass(), "jsType", null);
        setField(term2434, term2434.getClass(), "parent", null);
        setField(term2432, term2432.getClass(), "next", term2434);
        setIntField(term2449, term2449.getClass(), "type", 0);
        setField(term2449, term2449.getClass(), "next", null);
        setField(term2449, term2449.getClass(), "first", null);
        setField(term2449, term2449.getClass(), "last", null);
        setField(term2449, term2449.getClass(), "propListHead", null);
        setIntField(term2449, term2449.getClass(), "sourcePosition", 0);
        setField(term2449, term2449.getClass(), "jsType", null);
        setField(term2449, term2449.getClass(), "parent", null);
        setField(term2432, term2432.getClass(), "first", term2449);
        setIntField(term2452, term2452.getClass(), "type", 0);
        setField(term2452, term2452.getClass(), "next", null);
        setField(term2452, term2452.getClass(), "first", null);
        setField(term2452, term2452.getClass(), "last", null);
        setField(term2452, term2452.getClass(), "propListHead", null);
        setIntField(term2452, term2452.getClass(), "sourcePosition", 0);
        setField(term2452, term2452.getClass(), "jsType", null);
        setField(term2452, term2452.getClass(), "parent", null);
        setField(term2432, term2432.getClass(), "last", term2452);
        setField(term2455, term2455.getClass(), "next", null);
        setIntField(term2455, term2455.getClass(), "type", 0);
        setIntField(term2455, term2455.getClass(), "intValue", 0);
        setField(term2455, term2455.getClass(), "objectValue", null);
        setField(term2432, term2432.getClass(), "propListHead", term2455);
        setIntField(term2432, term2432.getClass(), "sourcePosition", 2011764585);
        setField(term2432, term2432.getClass(), "jsType", null);
        setField(term2432, term2432.getClass(), "parent", null);
        term15800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15805 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15808 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15800, term15800.getClass(), "type", -460657407);
        setIntField(term15801, term15801.getClass(), "type", 355911655);
        setIntField(term15802, term15802.getClass(), "type", 0);
        setField(term15802, term15802.getClass(), "next", null);
        setField(term15802, term15802.getClass(), "first", null);
        setField(term15802, term15802.getClass(), "last", null);
        setField(term15802, term15802.getClass(), "propListHead", null);
        setIntField(term15802, term15802.getClass(), "sourcePosition", 0);
        setField(term15802, term15802.getClass(), "jsType", null);
        setField(term15802, term15802.getClass(), "parent", null);
        setField(term15801, term15801.getClass(), "next", term15802);
        setIntField(term15803, term15803.getClass(), "type", 0);
        setField(term15803, term15803.getClass(), "next", null);
        setField(term15803, term15803.getClass(), "first", null);
        setField(term15803, term15803.getClass(), "last", null);
        setField(term15803, term15803.getClass(), "propListHead", null);
        setIntField(term15803, term15803.getClass(), "sourcePosition", 0);
        setField(term15803, term15803.getClass(), "jsType", null);
        setField(term15803, term15803.getClass(), "parent", null);
        setField(term15801, term15801.getClass(), "first", term15803);
        setIntField(term15804, term15804.getClass(), "type", 0);
        setField(term15804, term15804.getClass(), "next", null);
        setField(term15804, term15804.getClass(), "first", null);
        setField(term15804, term15804.getClass(), "last", null);
        setField(term15804, term15804.getClass(), "propListHead", null);
        setIntField(term15804, term15804.getClass(), "sourcePosition", 0);
        setField(term15804, term15804.getClass(), "jsType", null);
        setField(term15804, term15804.getClass(), "parent", null);
        setField(term15801, term15801.getClass(), "last", term15804);
        setField(term15805, term15805.getClass(), "next", null);
        setIntField(term15805, term15805.getClass(), "type", 0);
        setIntField(term15805, term15805.getClass(), "intValue", 0);
        setField(term15805, term15805.getClass(), "objectValue", null);
        setField(term15801, term15801.getClass(), "propListHead", term15805);
        setIntField(term15801, term15801.getClass(), "sourcePosition", -1784072578);
        setField(term15801, term15801.getClass(), "jsType", null);
        setField(term15801, term15801.getClass(), "parent", null);
        setField(term15800, term15800.getClass(), "next", term15801);
        setIntField(term15806, term15806.getClass(), "type", 0);
        setField(term15806, term15806.getClass(), "next", null);
        setField(term15806, term15806.getClass(), "first", null);
        setField(term15806, term15806.getClass(), "last", null);
        setField(term15806, term15806.getClass(), "propListHead", null);
        setIntField(term15806, term15806.getClass(), "sourcePosition", 0);
        setField(term15806, term15806.getClass(), "jsType", null);
        setField(term15806, term15806.getClass(), "parent", null);
        setField(term15800, term15800.getClass(), "first", term15806);
        setIntField(term15807, term15807.getClass(), "type", 0);
        setField(term15807, term15807.getClass(), "next", null);
        setField(term15807, term15807.getClass(), "first", null);
        setField(term15807, term15807.getClass(), "last", null);
        setField(term15807, term15807.getClass(), "propListHead", null);
        setIntField(term15807, term15807.getClass(), "sourcePosition", 0);
        setField(term15807, term15807.getClass(), "jsType", null);
        setField(term15807, term15807.getClass(), "parent", null);
        setField(term15800, term15800.getClass(), "last", term15807);
        setField(term15808, term15808.getClass(), "next", null);
        setIntField(term15808, term15808.getClass(), "type", 0);
        setIntField(term15808, term15808.getClass(), "intValue", 0);
        setField(term15808, term15808.getClass(), "objectValue", null);
        setField(term15800, term15800.getClass(), "propListHead", term15808);
        setIntField(term15800, term15800.getClass(), "sourcePosition", 2011764585);
        setField(term15800, term15800.getClass(), "jsType", null);
        setField(term15800, term15800.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2432;
        Object retValue = callMethod(klass, "isFunctionExpression", argTypes, null, args);
        assertTrue(recursiveEquals(term2432, term15800));
        assertTrue(recursiveEquals(retValue, false));
    }

};


