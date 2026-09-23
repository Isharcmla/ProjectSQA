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
import java.lang.Object;

public class NodeUtil_getConditionExpression_1686829277222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1811;

    public NodeUtil_getConditionExpression_1686829277222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1824 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1834 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1811, term1811.getClass(), "type", 1879729823);
        setIntField(term1813, term1813.getClass(), "type", 1595814906);
        setIntField(term1815, term1815.getClass(), "type", 0);
        setField(term1815, term1815.getClass(), "next", null);
        setField(term1815, term1815.getClass(), "first", null);
        setField(term1815, term1815.getClass(), "last", null);
        setField(term1815, term1815.getClass(), "propListHead", null);
        setIntField(term1815, term1815.getClass(), "sourcePosition", 0);
        setField(term1815, term1815.getClass(), "jsType", null);
        setField(term1815, term1815.getClass(), "parent", null);
        setField(term1813, term1813.getClass(), "next", term1815);
        setIntField(term1818, term1818.getClass(), "type", 0);
        setField(term1818, term1818.getClass(), "next", null);
        setField(term1818, term1818.getClass(), "first", null);
        setField(term1818, term1818.getClass(), "last", null);
        setField(term1818, term1818.getClass(), "propListHead", null);
        setIntField(term1818, term1818.getClass(), "sourcePosition", 0);
        setField(term1818, term1818.getClass(), "jsType", null);
        setField(term1818, term1818.getClass(), "parent", null);
        setField(term1813, term1813.getClass(), "first", term1818);
        setIntField(term1821, term1821.getClass(), "type", 0);
        setField(term1821, term1821.getClass(), "next", null);
        setField(term1821, term1821.getClass(), "first", null);
        setField(term1821, term1821.getClass(), "last", null);
        setField(term1821, term1821.getClass(), "propListHead", null);
        setIntField(term1821, term1821.getClass(), "sourcePosition", 0);
        setField(term1821, term1821.getClass(), "jsType", null);
        setField(term1821, term1821.getClass(), "parent", null);
        setField(term1813, term1813.getClass(), "last", term1821);
        setField(term1824, term1824.getClass(), "next", null);
        setIntField(term1824, term1824.getClass(), "type", 0);
        setIntField(term1824, term1824.getClass(), "intValue", 0);
        setField(term1824, term1824.getClass(), "objectValue", null);
        setField(term1813, term1813.getClass(), "propListHead", term1824);
        setIntField(term1813, term1813.getClass(), "sourcePosition", -1541981599);
        setField(term1813, term1813.getClass(), "jsType", null);
        setField(term1813, term1813.getClass(), "parent", null);
        setField(term1811, term1811.getClass(), "next", term1813);
        setIntField(term1828, term1828.getClass(), "type", 0);
        setField(term1828, term1828.getClass(), "next", null);
        setField(term1828, term1828.getClass(), "first", null);
        setField(term1828, term1828.getClass(), "last", null);
        setField(term1828, term1828.getClass(), "propListHead", null);
        setIntField(term1828, term1828.getClass(), "sourcePosition", 0);
        setField(term1828, term1828.getClass(), "jsType", null);
        setField(term1828, term1828.getClass(), "parent", null);
        setField(term1811, term1811.getClass(), "first", term1828);
        setIntField(term1831, term1831.getClass(), "type", 0);
        setField(term1831, term1831.getClass(), "next", null);
        setField(term1831, term1831.getClass(), "first", null);
        setField(term1831, term1831.getClass(), "last", null);
        setField(term1831, term1831.getClass(), "propListHead", null);
        setIntField(term1831, term1831.getClass(), "sourcePosition", 0);
        setField(term1831, term1831.getClass(), "jsType", null);
        setField(term1831, term1831.getClass(), "parent", null);
        setField(term1811, term1811.getClass(), "last", term1831);
        setField(term1834, term1834.getClass(), "next", null);
        setIntField(term1834, term1834.getClass(), "type", 0);
        setIntField(term1834, term1834.getClass(), "intValue", 0);
        setField(term1834, term1834.getClass(), "objectValue", null);
        setField(term1811, term1811.getClass(), "propListHead", term1834);
        setIntField(term1811, term1811.getClass(), "sourcePosition", 1605456363);
        setField(term1811, term1811.getClass(), "jsType", null);
        setField(term1811, term1811.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1811;
        try {
            callMethod(klass, "getConditionExpression", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


