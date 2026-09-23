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

public class NodeUtil_containsCall_2124673690160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1516;
     Object term9477;

    public NodeUtil_containsCall_2124673690160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1529 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1539 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1516, term1516.getClass(), "type", 1505480070);
        setIntField(term1518, term1518.getClass(), "type", -1777140369);
        setIntField(term1520, term1520.getClass(), "type", 0);
        setField(term1520, term1520.getClass(), "next", null);
        setField(term1520, term1520.getClass(), "first", null);
        setField(term1520, term1520.getClass(), "last", null);
        setField(term1520, term1520.getClass(), "propListHead", null);
        setIntField(term1520, term1520.getClass(), "sourcePosition", 0);
        setField(term1520, term1520.getClass(), "jsType", null);
        setField(term1520, term1520.getClass(), "parent", null);
        setField(term1518, term1518.getClass(), "next", term1520);
        setIntField(term1523, term1523.getClass(), "type", 0);
        setField(term1523, term1523.getClass(), "next", null);
        setField(term1523, term1523.getClass(), "first", null);
        setField(term1523, term1523.getClass(), "last", null);
        setField(term1523, term1523.getClass(), "propListHead", null);
        setIntField(term1523, term1523.getClass(), "sourcePosition", 0);
        setField(term1523, term1523.getClass(), "jsType", null);
        setField(term1523, term1523.getClass(), "parent", null);
        setField(term1518, term1518.getClass(), "first", term1523);
        setIntField(term1526, term1526.getClass(), "type", 0);
        setField(term1526, term1526.getClass(), "next", null);
        setField(term1526, term1526.getClass(), "first", null);
        setField(term1526, term1526.getClass(), "last", null);
        setField(term1526, term1526.getClass(), "propListHead", null);
        setIntField(term1526, term1526.getClass(), "sourcePosition", 0);
        setField(term1526, term1526.getClass(), "jsType", null);
        setField(term1526, term1526.getClass(), "parent", null);
        setField(term1518, term1518.getClass(), "last", term1526);
        setField(term1529, term1529.getClass(), "next", null);
        setIntField(term1529, term1529.getClass(), "type", 0);
        setIntField(term1529, term1529.getClass(), "intValue", 0);
        setField(term1529, term1529.getClass(), "objectValue", null);
        setField(term1518, term1518.getClass(), "propListHead", term1529);
        setIntField(term1518, term1518.getClass(), "sourcePosition", 86041387);
        setField(term1518, term1518.getClass(), "jsType", null);
        setField(term1518, term1518.getClass(), "parent", null);
        setField(term1516, term1516.getClass(), "next", term1518);
        setIntField(term1533, term1533.getClass(), "type", 0);
        setField(term1533, term1533.getClass(), "next", null);
        setField(term1533, term1533.getClass(), "first", null);
        setField(term1533, term1533.getClass(), "last", null);
        setField(term1533, term1533.getClass(), "propListHead", null);
        setIntField(term1533, term1533.getClass(), "sourcePosition", 0);
        setField(term1533, term1533.getClass(), "jsType", null);
        setField(term1533, term1533.getClass(), "parent", null);
        setField(term1516, term1516.getClass(), "first", term1533);
        setIntField(term1536, term1536.getClass(), "type", 0);
        setField(term1536, term1536.getClass(), "next", null);
        setField(term1536, term1536.getClass(), "first", null);
        setField(term1536, term1536.getClass(), "last", null);
        setField(term1536, term1536.getClass(), "propListHead", null);
        setIntField(term1536, term1536.getClass(), "sourcePosition", 0);
        setField(term1536, term1536.getClass(), "jsType", null);
        setField(term1536, term1536.getClass(), "parent", null);
        setField(term1516, term1516.getClass(), "last", term1536);
        setField(term1539, term1539.getClass(), "next", null);
        setIntField(term1539, term1539.getClass(), "type", 0);
        setIntField(term1539, term1539.getClass(), "intValue", 0);
        setField(term1539, term1539.getClass(), "objectValue", null);
        setField(term1516, term1516.getClass(), "propListHead", term1539);
        setIntField(term1516, term1516.getClass(), "sourcePosition", 1010721666);
        setField(term1516, term1516.getClass(), "jsType", null);
        setField(term1516, term1516.getClass(), "parent", null);
        term9477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9482 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9485 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9477, term9477.getClass(), "type", 1505480070);
        setIntField(term9478, term9478.getClass(), "type", -1777140369);
        setIntField(term9479, term9479.getClass(), "type", 0);
        setField(term9479, term9479.getClass(), "next", null);
        setField(term9479, term9479.getClass(), "first", null);
        setField(term9479, term9479.getClass(), "last", null);
        setField(term9479, term9479.getClass(), "propListHead", null);
        setIntField(term9479, term9479.getClass(), "sourcePosition", 0);
        setField(term9479, term9479.getClass(), "jsType", null);
        setField(term9479, term9479.getClass(), "parent", null);
        setField(term9478, term9478.getClass(), "next", term9479);
        setIntField(term9480, term9480.getClass(), "type", 0);
        setField(term9480, term9480.getClass(), "next", null);
        setField(term9480, term9480.getClass(), "first", null);
        setField(term9480, term9480.getClass(), "last", null);
        setField(term9480, term9480.getClass(), "propListHead", null);
        setIntField(term9480, term9480.getClass(), "sourcePosition", 0);
        setField(term9480, term9480.getClass(), "jsType", null);
        setField(term9480, term9480.getClass(), "parent", null);
        setField(term9478, term9478.getClass(), "first", term9480);
        setIntField(term9481, term9481.getClass(), "type", 0);
        setField(term9481, term9481.getClass(), "next", null);
        setField(term9481, term9481.getClass(), "first", null);
        setField(term9481, term9481.getClass(), "last", null);
        setField(term9481, term9481.getClass(), "propListHead", null);
        setIntField(term9481, term9481.getClass(), "sourcePosition", 0);
        setField(term9481, term9481.getClass(), "jsType", null);
        setField(term9481, term9481.getClass(), "parent", null);
        setField(term9478, term9478.getClass(), "last", term9481);
        setField(term9482, term9482.getClass(), "next", null);
        setIntField(term9482, term9482.getClass(), "type", 0);
        setIntField(term9482, term9482.getClass(), "intValue", 0);
        setField(term9482, term9482.getClass(), "objectValue", null);
        setField(term9478, term9478.getClass(), "propListHead", term9482);
        setIntField(term9478, term9478.getClass(), "sourcePosition", 86041387);
        setField(term9478, term9478.getClass(), "jsType", null);
        setField(term9478, term9478.getClass(), "parent", null);
        setField(term9477, term9477.getClass(), "next", term9478);
        setIntField(term9483, term9483.getClass(), "type", 0);
        setField(term9483, term9483.getClass(), "next", null);
        setField(term9483, term9483.getClass(), "first", null);
        setField(term9483, term9483.getClass(), "last", null);
        setField(term9483, term9483.getClass(), "propListHead", null);
        setIntField(term9483, term9483.getClass(), "sourcePosition", 0);
        setField(term9483, term9483.getClass(), "jsType", null);
        setField(term9483, term9483.getClass(), "parent", null);
        setField(term9477, term9477.getClass(), "first", term9483);
        setIntField(term9484, term9484.getClass(), "type", 0);
        setField(term9484, term9484.getClass(), "next", null);
        setField(term9484, term9484.getClass(), "first", null);
        setField(term9484, term9484.getClass(), "last", null);
        setField(term9484, term9484.getClass(), "propListHead", null);
        setIntField(term9484, term9484.getClass(), "sourcePosition", 0);
        setField(term9484, term9484.getClass(), "jsType", null);
        setField(term9484, term9484.getClass(), "parent", null);
        setField(term9477, term9477.getClass(), "last", term9484);
        setField(term9485, term9485.getClass(), "next", null);
        setIntField(term9485, term9485.getClass(), "type", 0);
        setIntField(term9485, term9485.getClass(), "intValue", 0);
        setField(term9485, term9485.getClass(), "objectValue", null);
        setField(term9477, term9477.getClass(), "propListHead", term9485);
        setIntField(term9477, term9477.getClass(), "sourcePosition", 1010721666);
        setField(term9477, term9477.getClass(), "jsType", null);
        setField(term9477, term9477.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1516;
        callMethod(klass, "containsCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1516, term9477));
    }

};


