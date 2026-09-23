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

public class NodeUtil_isStatement_664352338236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1790;

    public NodeUtil_isStatement_664352338236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1790, term1790.getClass(), "type", -270592367);
        setIntField(term1792, term1792.getClass(), "type", 178847646);
        setIntField(term1794, term1794.getClass(), "type", 273590437);
        setIntField(term1796, term1796.getClass(), "type", -348612876);
        setIntField(term1798, term1798.getClass(), "type", 1302807565);
        setField(term1798, term1798.getClass(), "next", null);
        setField(term1798, term1798.getClass(), "first", null);
        setField(term1798, term1798.getClass(), "last", null);
        setField(term1798, term1798.getClass(), "propListHead", null);
        setIntField(term1798, term1798.getClass(), "sourcePosition", 0);
        setField(term1798, term1798.getClass(), "jsType", null);
        setField(term1798, term1798.getClass(), "parent", null);
        setField(term1796, term1796.getClass(), "next", term1798);
        setIntField(term1801, term1801.getClass(), "type", -838848221);
        setField(term1801, term1801.getClass(), "next", null);
        setField(term1801, term1801.getClass(), "first", null);
        setField(term1801, term1801.getClass(), "last", term1798);
        setField(term1801, term1801.getClass(), "propListHead", null);
        setIntField(term1801, term1801.getClass(), "sourcePosition", 0);
        setField(term1801, term1801.getClass(), "jsType", null);
        setField(term1801, term1801.getClass(), "parent", null);
        setField(term1796, term1796.getClass(), "first", term1801);
        setField(term1796, term1796.getClass(), "last", term1794);
        setField(term1796, term1796.getClass(), "propListHead", null);
        setIntField(term1796, term1796.getClass(), "sourcePosition", 0);
        setField(term1796, term1796.getClass(), "jsType", null);
        setField(term1796, term1796.getClass(), "parent", null);
        setField(term1794, term1794.getClass(), "next", term1796);
        setField(term1794, term1794.getClass(), "first", term1798);
        setIntField(term1805, term1805.getClass(), "type", 718742281);
        setIntField(term1807, term1807.getClass(), "type", 1532723756);
        setField(term1807, term1807.getClass(), "next", null);
        setField(term1807, term1807.getClass(), "first", term1801);
        setField(term1807, term1807.getClass(), "last", term1796);
        setField(term1807, term1807.getClass(), "propListHead", null);
        setIntField(term1807, term1807.getClass(), "sourcePosition", 0);
        setField(term1807, term1807.getClass(), "jsType", null);
        setField(term1807, term1807.getClass(), "parent", null);
        setField(term1805, term1805.getClass(), "next", term1807);
        setField(term1805, term1805.getClass(), "first", term1792);
        setField(term1805, term1805.getClass(), "last", term1792);
        setField(term1805, term1805.getClass(), "propListHead", null);
        setIntField(term1805, term1805.getClass(), "sourcePosition", 0);
        setField(term1805, term1805.getClass(), "jsType", null);
        setField(term1805, term1805.getClass(), "parent", null);
        setField(term1794, term1794.getClass(), "last", term1805);
        setField(term1794, term1794.getClass(), "propListHead", null);
        setIntField(term1794, term1794.getClass(), "sourcePosition", 0);
        setField(term1794, term1794.getClass(), "jsType", null);
        setField(term1794, term1794.getClass(), "parent", null);
        setField(term1792, term1792.getClass(), "next", term1794);
        setIntField(term1812, term1812.getClass(), "type", -124088550);
        setField(term1812, term1812.getClass(), "next", term1805);
        setField(term1812, term1812.getClass(), "first", term1807);
        setField(term1812, term1812.getClass(), "last", term1790);
        setField(term1812, term1812.getClass(), "propListHead", null);
        setIntField(term1812, term1812.getClass(), "sourcePosition", 0);
        setField(term1812, term1812.getClass(), "jsType", null);
        setField(term1812, term1812.getClass(), "parent", null);
        setField(term1792, term1792.getClass(), "first", term1812);
        setField(term1792, term1792.getClass(), "last", term1812);
        setField(term1792, term1792.getClass(), "propListHead", null);
        setIntField(term1792, term1792.getClass(), "sourcePosition", 0);
        setField(term1792, term1792.getClass(), "jsType", null);
        setField(term1792, term1792.getClass(), "parent", null);
        setField(term1790, term1790.getClass(), "next", term1792);
        setField(term1790, term1790.getClass(), "first", term1796);
        setField(term1790, term1790.getClass(), "last", term1798);
        setField(term1790, term1790.getClass(), "propListHead", null);
        setIntField(term1790, term1790.getClass(), "sourcePosition", 0);
        setField(term1790, term1790.getClass(), "jsType", null);
        setField(term1790, term1790.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1790;
        try {
            callMethod(klass, "isStatement", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


