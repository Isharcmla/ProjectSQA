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

public class NodeUtil_isFunctionObjectCallOrApply_178419669252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2066;
     Object term14813;

    public NodeUtil_isFunctionObjectCallOrApply_178419669252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2066, term2066.getClass(), "type", -383508597);
        setIntField(term2068, term2068.getClass(), "type", 1985432430);
        setIntField(term2070, term2070.getClass(), "type", 0);
        setField(term2070, term2070.getClass(), "next", null);
        setField(term2070, term2070.getClass(), "first", null);
        setField(term2070, term2070.getClass(), "last", null);
        setField(term2070, term2070.getClass(), "propListHead", null);
        setIntField(term2070, term2070.getClass(), "sourcePosition", 0);
        setField(term2070, term2070.getClass(), "jsType", null);
        setField(term2070, term2070.getClass(), "parent", null);
        setField(term2068, term2068.getClass(), "next", term2070);
        setIntField(term2073, term2073.getClass(), "type", 0);
        setField(term2073, term2073.getClass(), "next", null);
        setField(term2073, term2073.getClass(), "first", null);
        setField(term2073, term2073.getClass(), "last", null);
        setField(term2073, term2073.getClass(), "propListHead", null);
        setIntField(term2073, term2073.getClass(), "sourcePosition", 0);
        setField(term2073, term2073.getClass(), "jsType", null);
        setField(term2073, term2073.getClass(), "parent", null);
        setField(term2068, term2068.getClass(), "first", term2073);
        setIntField(term2076, term2076.getClass(), "type", 0);
        setField(term2076, term2076.getClass(), "next", null);
        setField(term2076, term2076.getClass(), "first", null);
        setField(term2076, term2076.getClass(), "last", null);
        setField(term2076, term2076.getClass(), "propListHead", null);
        setIntField(term2076, term2076.getClass(), "sourcePosition", 0);
        setField(term2076, term2076.getClass(), "jsType", null);
        setField(term2076, term2076.getClass(), "parent", null);
        setField(term2068, term2068.getClass(), "last", term2076);
        setField(term2068, term2068.getClass(), "propListHead", null);
        setIntField(term2068, term2068.getClass(), "sourcePosition", 0);
        setField(term2068, term2068.getClass(), "jsType", null);
        setField(term2068, term2068.getClass(), "parent", null);
        setField(term2066, term2066.getClass(), "next", term2068);
        setIntField(term2080, term2080.getClass(), "type", 0);
        setField(term2080, term2080.getClass(), "next", null);
        setField(term2080, term2080.getClass(), "first", null);
        setField(term2080, term2080.getClass(), "last", null);
        setField(term2080, term2080.getClass(), "propListHead", null);
        setIntField(term2080, term2080.getClass(), "sourcePosition", 0);
        setField(term2080, term2080.getClass(), "jsType", null);
        setField(term2080, term2080.getClass(), "parent", null);
        setField(term2066, term2066.getClass(), "first", term2080);
        setIntField(term2083, term2083.getClass(), "type", 0);
        setField(term2083, term2083.getClass(), "next", null);
        setField(term2083, term2083.getClass(), "first", null);
        setField(term2083, term2083.getClass(), "last", null);
        setField(term2083, term2083.getClass(), "propListHead", null);
        setIntField(term2083, term2083.getClass(), "sourcePosition", 0);
        setField(term2083, term2083.getClass(), "jsType", null);
        setField(term2083, term2083.getClass(), "parent", null);
        setField(term2066, term2066.getClass(), "last", term2083);
        setField(term2066, term2066.getClass(), "propListHead", null);
        setIntField(term2066, term2066.getClass(), "sourcePosition", 0);
        setField(term2066, term2066.getClass(), "jsType", null);
        setField(term2066, term2066.getClass(), "parent", null);
        term14813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14813, term14813.getClass(), "type", -383508597);
        setIntField(term14814, term14814.getClass(), "type", 1985432430);
        setIntField(term14815, term14815.getClass(), "type", 0);
        setField(term14815, term14815.getClass(), "next", null);
        setField(term14815, term14815.getClass(), "first", null);
        setField(term14815, term14815.getClass(), "last", null);
        setField(term14815, term14815.getClass(), "propListHead", null);
        setIntField(term14815, term14815.getClass(), "sourcePosition", 0);
        setField(term14815, term14815.getClass(), "jsType", null);
        setField(term14815, term14815.getClass(), "parent", null);
        setField(term14814, term14814.getClass(), "next", term14815);
        setIntField(term14816, term14816.getClass(), "type", 0);
        setField(term14816, term14816.getClass(), "next", null);
        setField(term14816, term14816.getClass(), "first", null);
        setField(term14816, term14816.getClass(), "last", null);
        setField(term14816, term14816.getClass(), "propListHead", null);
        setIntField(term14816, term14816.getClass(), "sourcePosition", 0);
        setField(term14816, term14816.getClass(), "jsType", null);
        setField(term14816, term14816.getClass(), "parent", null);
        setField(term14814, term14814.getClass(), "first", term14816);
        setIntField(term14817, term14817.getClass(), "type", 0);
        setField(term14817, term14817.getClass(), "next", null);
        setField(term14817, term14817.getClass(), "first", null);
        setField(term14817, term14817.getClass(), "last", null);
        setField(term14817, term14817.getClass(), "propListHead", null);
        setIntField(term14817, term14817.getClass(), "sourcePosition", 0);
        setField(term14817, term14817.getClass(), "jsType", null);
        setField(term14817, term14817.getClass(), "parent", null);
        setField(term14814, term14814.getClass(), "last", term14817);
        setField(term14814, term14814.getClass(), "propListHead", null);
        setIntField(term14814, term14814.getClass(), "sourcePosition", 0);
        setField(term14814, term14814.getClass(), "jsType", null);
        setField(term14814, term14814.getClass(), "parent", null);
        setField(term14813, term14813.getClass(), "next", term14814);
        setIntField(term14818, term14818.getClass(), "type", 0);
        setField(term14818, term14818.getClass(), "next", null);
        setField(term14818, term14818.getClass(), "first", null);
        setField(term14818, term14818.getClass(), "last", null);
        setField(term14818, term14818.getClass(), "propListHead", null);
        setIntField(term14818, term14818.getClass(), "sourcePosition", 0);
        setField(term14818, term14818.getClass(), "jsType", null);
        setField(term14818, term14818.getClass(), "parent", null);
        setField(term14813, term14813.getClass(), "first", term14818);
        setIntField(term14819, term14819.getClass(), "type", 0);
        setField(term14819, term14819.getClass(), "next", null);
        setField(term14819, term14819.getClass(), "first", null);
        setField(term14819, term14819.getClass(), "last", null);
        setField(term14819, term14819.getClass(), "propListHead", null);
        setIntField(term14819, term14819.getClass(), "sourcePosition", 0);
        setField(term14819, term14819.getClass(), "jsType", null);
        setField(term14819, term14819.getClass(), "parent", null);
        setField(term14813, term14813.getClass(), "last", term14819);
        setField(term14813, term14813.getClass(), "propListHead", null);
        setIntField(term14813, term14813.getClass(), "sourcePosition", 0);
        setField(term14813, term14813.getClass(), "jsType", null);
        setField(term14813, term14813.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2066;
        Object retValue = callMethod(klass, "isFunctionObjectCallOrApply", argTypes, null, args);
        assertTrue(recursiveEquals(term2066, term14813));
        assertTrue(recursiveEquals(retValue, false));
    }

};


