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

public class NodeUtil_isObjectCallMethod_1353612968164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1651;
     Object term10163;

    public NodeUtil_isObjectCallMethod_1353612968164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1664 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1674 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1651, term1651.getClass(), "type", 1059930704);
        setIntField(term1653, term1653.getClass(), "type", 405295896);
        setIntField(term1655, term1655.getClass(), "type", 0);
        setField(term1655, term1655.getClass(), "next", null);
        setField(term1655, term1655.getClass(), "first", null);
        setField(term1655, term1655.getClass(), "last", null);
        setField(term1655, term1655.getClass(), "propListHead", null);
        setIntField(term1655, term1655.getClass(), "sourcePosition", 0);
        setField(term1655, term1655.getClass(), "jsType", null);
        setField(term1655, term1655.getClass(), "parent", null);
        setField(term1653, term1653.getClass(), "next", term1655);
        setIntField(term1658, term1658.getClass(), "type", 0);
        setField(term1658, term1658.getClass(), "next", null);
        setField(term1658, term1658.getClass(), "first", null);
        setField(term1658, term1658.getClass(), "last", null);
        setField(term1658, term1658.getClass(), "propListHead", null);
        setIntField(term1658, term1658.getClass(), "sourcePosition", 0);
        setField(term1658, term1658.getClass(), "jsType", null);
        setField(term1658, term1658.getClass(), "parent", null);
        setField(term1653, term1653.getClass(), "first", term1658);
        setIntField(term1661, term1661.getClass(), "type", 0);
        setField(term1661, term1661.getClass(), "next", null);
        setField(term1661, term1661.getClass(), "first", null);
        setField(term1661, term1661.getClass(), "last", null);
        setField(term1661, term1661.getClass(), "propListHead", null);
        setIntField(term1661, term1661.getClass(), "sourcePosition", 0);
        setField(term1661, term1661.getClass(), "jsType", null);
        setField(term1661, term1661.getClass(), "parent", null);
        setField(term1653, term1653.getClass(), "last", term1661);
        setField(term1664, term1664.getClass(), "next", null);
        setIntField(term1664, term1664.getClass(), "type", 0);
        setIntField(term1664, term1664.getClass(), "intValue", 0);
        setField(term1664, term1664.getClass(), "objectValue", null);
        setField(term1653, term1653.getClass(), "propListHead", term1664);
        setIntField(term1653, term1653.getClass(), "sourcePosition", 1611734632);
        setField(term1653, term1653.getClass(), "jsType", null);
        setField(term1653, term1653.getClass(), "parent", null);
        setField(term1651, term1651.getClass(), "next", term1653);
        setIntField(term1668, term1668.getClass(), "type", 0);
        setField(term1668, term1668.getClass(), "next", null);
        setField(term1668, term1668.getClass(), "first", null);
        setField(term1668, term1668.getClass(), "last", null);
        setField(term1668, term1668.getClass(), "propListHead", null);
        setIntField(term1668, term1668.getClass(), "sourcePosition", 0);
        setField(term1668, term1668.getClass(), "jsType", null);
        setField(term1668, term1668.getClass(), "parent", null);
        setField(term1651, term1651.getClass(), "first", term1668);
        setIntField(term1671, term1671.getClass(), "type", 0);
        setField(term1671, term1671.getClass(), "next", null);
        setField(term1671, term1671.getClass(), "first", null);
        setField(term1671, term1671.getClass(), "last", null);
        setField(term1671, term1671.getClass(), "propListHead", null);
        setIntField(term1671, term1671.getClass(), "sourcePosition", 0);
        setField(term1671, term1671.getClass(), "jsType", null);
        setField(term1671, term1671.getClass(), "parent", null);
        setField(term1651, term1651.getClass(), "last", term1671);
        setField(term1674, term1674.getClass(), "next", null);
        setIntField(term1674, term1674.getClass(), "type", 0);
        setIntField(term1674, term1674.getClass(), "intValue", 0);
        setField(term1674, term1674.getClass(), "objectValue", null);
        setField(term1651, term1651.getClass(), "propListHead", term1674);
        setIntField(term1651, term1651.getClass(), "sourcePosition", 868908117);
        setField(term1651, term1651.getClass(), "jsType", null);
        setField(term1651, term1651.getClass(), "parent", null);
        term10163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10168 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10171 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10163, term10163.getClass(), "type", 1059930704);
        setIntField(term10164, term10164.getClass(), "type", 405295896);
        setIntField(term10165, term10165.getClass(), "type", 0);
        setField(term10165, term10165.getClass(), "next", null);
        setField(term10165, term10165.getClass(), "first", null);
        setField(term10165, term10165.getClass(), "last", null);
        setField(term10165, term10165.getClass(), "propListHead", null);
        setIntField(term10165, term10165.getClass(), "sourcePosition", 0);
        setField(term10165, term10165.getClass(), "jsType", null);
        setField(term10165, term10165.getClass(), "parent", null);
        setField(term10164, term10164.getClass(), "next", term10165);
        setIntField(term10166, term10166.getClass(), "type", 0);
        setField(term10166, term10166.getClass(), "next", null);
        setField(term10166, term10166.getClass(), "first", null);
        setField(term10166, term10166.getClass(), "last", null);
        setField(term10166, term10166.getClass(), "propListHead", null);
        setIntField(term10166, term10166.getClass(), "sourcePosition", 0);
        setField(term10166, term10166.getClass(), "jsType", null);
        setField(term10166, term10166.getClass(), "parent", null);
        setField(term10164, term10164.getClass(), "first", term10166);
        setIntField(term10167, term10167.getClass(), "type", 0);
        setField(term10167, term10167.getClass(), "next", null);
        setField(term10167, term10167.getClass(), "first", null);
        setField(term10167, term10167.getClass(), "last", null);
        setField(term10167, term10167.getClass(), "propListHead", null);
        setIntField(term10167, term10167.getClass(), "sourcePosition", 0);
        setField(term10167, term10167.getClass(), "jsType", null);
        setField(term10167, term10167.getClass(), "parent", null);
        setField(term10164, term10164.getClass(), "last", term10167);
        setField(term10168, term10168.getClass(), "next", null);
        setIntField(term10168, term10168.getClass(), "type", 0);
        setIntField(term10168, term10168.getClass(), "intValue", 0);
        setField(term10168, term10168.getClass(), "objectValue", null);
        setField(term10164, term10164.getClass(), "propListHead", term10168);
        setIntField(term10164, term10164.getClass(), "sourcePosition", 1611734632);
        setField(term10164, term10164.getClass(), "jsType", null);
        setField(term10164, term10164.getClass(), "parent", null);
        setField(term10163, term10163.getClass(), "next", term10164);
        setIntField(term10169, term10169.getClass(), "type", 0);
        setField(term10169, term10169.getClass(), "next", null);
        setField(term10169, term10169.getClass(), "first", null);
        setField(term10169, term10169.getClass(), "last", null);
        setField(term10169, term10169.getClass(), "propListHead", null);
        setIntField(term10169, term10169.getClass(), "sourcePosition", 0);
        setField(term10169, term10169.getClass(), "jsType", null);
        setField(term10169, term10169.getClass(), "parent", null);
        setField(term10163, term10163.getClass(), "first", term10169);
        setIntField(term10170, term10170.getClass(), "type", 0);
        setField(term10170, term10170.getClass(), "next", null);
        setField(term10170, term10170.getClass(), "first", null);
        setField(term10170, term10170.getClass(), "last", null);
        setField(term10170, term10170.getClass(), "propListHead", null);
        setIntField(term10170, term10170.getClass(), "sourcePosition", 0);
        setField(term10170, term10170.getClass(), "jsType", null);
        setField(term10170, term10170.getClass(), "parent", null);
        setField(term10163, term10163.getClass(), "last", term10170);
        setField(term10171, term10171.getClass(), "next", null);
        setIntField(term10171, term10171.getClass(), "type", 0);
        setIntField(term10171, term10171.getClass(), "intValue", 0);
        setField(term10171, term10171.getClass(), "objectValue", null);
        setField(term10163, term10163.getClass(), "propListHead", term10171);
        setIntField(term10163, term10163.getClass(), "sourcePosition", 868908117);
        setField(term10163, term10163.getClass(), "jsType", null);
        setField(term10163, term10163.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1651;
        args[1] = "uuaPigETmJ";
        callMethod(klass, "isObjectCallMethod", argTypes, null, args);
        assertTrue(recursiveEquals(term1651, term10163));
    }

};


