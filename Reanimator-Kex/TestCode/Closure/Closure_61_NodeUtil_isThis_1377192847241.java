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

public class NodeUtil_isThis_1377192847241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1813;
     Object term14044;

    public NodeUtil_isThis_1377192847241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1813, term1813.getClass(), "type", -1911972560);
        setIntField(term1815, term1815.getClass(), "type", 1632177303);
        setIntField(term1817, term1817.getClass(), "type", 0);
        setField(term1817, term1817.getClass(), "next", null);
        setField(term1817, term1817.getClass(), "first", null);
        setField(term1817, term1817.getClass(), "last", null);
        setField(term1817, term1817.getClass(), "propListHead", null);
        setIntField(term1817, term1817.getClass(), "sourcePosition", 0);
        setField(term1817, term1817.getClass(), "jsType", null);
        setField(term1817, term1817.getClass(), "parent", null);
        setField(term1815, term1815.getClass(), "next", term1817);
        setIntField(term1820, term1820.getClass(), "type", 0);
        setField(term1820, term1820.getClass(), "next", null);
        setField(term1820, term1820.getClass(), "first", null);
        setField(term1820, term1820.getClass(), "last", null);
        setField(term1820, term1820.getClass(), "propListHead", null);
        setIntField(term1820, term1820.getClass(), "sourcePosition", 0);
        setField(term1820, term1820.getClass(), "jsType", null);
        setField(term1820, term1820.getClass(), "parent", null);
        setField(term1815, term1815.getClass(), "first", term1820);
        setIntField(term1823, term1823.getClass(), "type", 0);
        setField(term1823, term1823.getClass(), "next", null);
        setField(term1823, term1823.getClass(), "first", null);
        setField(term1823, term1823.getClass(), "last", null);
        setField(term1823, term1823.getClass(), "propListHead", null);
        setIntField(term1823, term1823.getClass(), "sourcePosition", 0);
        setField(term1823, term1823.getClass(), "jsType", null);
        setField(term1823, term1823.getClass(), "parent", null);
        setField(term1815, term1815.getClass(), "last", term1823);
        setField(term1815, term1815.getClass(), "propListHead", null);
        setIntField(term1815, term1815.getClass(), "sourcePosition", 0);
        setField(term1815, term1815.getClass(), "jsType", null);
        setField(term1815, term1815.getClass(), "parent", null);
        setField(term1813, term1813.getClass(), "next", term1815);
        setIntField(term1827, term1827.getClass(), "type", 0);
        setField(term1827, term1827.getClass(), "next", null);
        setField(term1827, term1827.getClass(), "first", null);
        setField(term1827, term1827.getClass(), "last", null);
        setField(term1827, term1827.getClass(), "propListHead", null);
        setIntField(term1827, term1827.getClass(), "sourcePosition", 0);
        setField(term1827, term1827.getClass(), "jsType", null);
        setField(term1827, term1827.getClass(), "parent", null);
        setField(term1813, term1813.getClass(), "first", term1827);
        setIntField(term1830, term1830.getClass(), "type", 0);
        setField(term1830, term1830.getClass(), "next", null);
        setField(term1830, term1830.getClass(), "first", null);
        setField(term1830, term1830.getClass(), "last", null);
        setField(term1830, term1830.getClass(), "propListHead", null);
        setIntField(term1830, term1830.getClass(), "sourcePosition", 0);
        setField(term1830, term1830.getClass(), "jsType", null);
        setField(term1830, term1830.getClass(), "parent", null);
        setField(term1813, term1813.getClass(), "last", term1830);
        setField(term1813, term1813.getClass(), "propListHead", null);
        setIntField(term1813, term1813.getClass(), "sourcePosition", 0);
        setField(term1813, term1813.getClass(), "jsType", null);
        setField(term1813, term1813.getClass(), "parent", null);
        term14044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14044, term14044.getClass(), "type", -1911972560);
        setIntField(term14045, term14045.getClass(), "type", 1632177303);
        setIntField(term14046, term14046.getClass(), "type", 0);
        setField(term14046, term14046.getClass(), "next", null);
        setField(term14046, term14046.getClass(), "first", null);
        setField(term14046, term14046.getClass(), "last", null);
        setField(term14046, term14046.getClass(), "propListHead", null);
        setIntField(term14046, term14046.getClass(), "sourcePosition", 0);
        setField(term14046, term14046.getClass(), "jsType", null);
        setField(term14046, term14046.getClass(), "parent", null);
        setField(term14045, term14045.getClass(), "next", term14046);
        setIntField(term14047, term14047.getClass(), "type", 0);
        setField(term14047, term14047.getClass(), "next", null);
        setField(term14047, term14047.getClass(), "first", null);
        setField(term14047, term14047.getClass(), "last", null);
        setField(term14047, term14047.getClass(), "propListHead", null);
        setIntField(term14047, term14047.getClass(), "sourcePosition", 0);
        setField(term14047, term14047.getClass(), "jsType", null);
        setField(term14047, term14047.getClass(), "parent", null);
        setField(term14045, term14045.getClass(), "first", term14047);
        setIntField(term14048, term14048.getClass(), "type", 0);
        setField(term14048, term14048.getClass(), "next", null);
        setField(term14048, term14048.getClass(), "first", null);
        setField(term14048, term14048.getClass(), "last", null);
        setField(term14048, term14048.getClass(), "propListHead", null);
        setIntField(term14048, term14048.getClass(), "sourcePosition", 0);
        setField(term14048, term14048.getClass(), "jsType", null);
        setField(term14048, term14048.getClass(), "parent", null);
        setField(term14045, term14045.getClass(), "last", term14048);
        setField(term14045, term14045.getClass(), "propListHead", null);
        setIntField(term14045, term14045.getClass(), "sourcePosition", 0);
        setField(term14045, term14045.getClass(), "jsType", null);
        setField(term14045, term14045.getClass(), "parent", null);
        setField(term14044, term14044.getClass(), "next", term14045);
        setIntField(term14049, term14049.getClass(), "type", 0);
        setField(term14049, term14049.getClass(), "next", null);
        setField(term14049, term14049.getClass(), "first", null);
        setField(term14049, term14049.getClass(), "last", null);
        setField(term14049, term14049.getClass(), "propListHead", null);
        setIntField(term14049, term14049.getClass(), "sourcePosition", 0);
        setField(term14049, term14049.getClass(), "jsType", null);
        setField(term14049, term14049.getClass(), "parent", null);
        setField(term14044, term14044.getClass(), "first", term14049);
        setIntField(term14050, term14050.getClass(), "type", 0);
        setField(term14050, term14050.getClass(), "next", null);
        setField(term14050, term14050.getClass(), "first", null);
        setField(term14050, term14050.getClass(), "last", null);
        setField(term14050, term14050.getClass(), "propListHead", null);
        setIntField(term14050, term14050.getClass(), "sourcePosition", 0);
        setField(term14050, term14050.getClass(), "jsType", null);
        setField(term14050, term14050.getClass(), "parent", null);
        setField(term14044, term14044.getClass(), "last", term14050);
        setField(term14044, term14044.getClass(), "propListHead", null);
        setIntField(term14044, term14044.getClass(), "sourcePosition", 0);
        setField(term14044, term14044.getClass(), "jsType", null);
        setField(term14044, term14044.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1813;
        Object retValue = callMethod(klass, "isThis", argTypes, null, args);
        assertTrue(recursiveEquals(term1813, term14044));
        assertTrue(recursiveEquals(retValue, false));
    }

};


