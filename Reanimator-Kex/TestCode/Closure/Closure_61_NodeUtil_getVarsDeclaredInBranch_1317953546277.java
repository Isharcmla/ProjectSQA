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
import java.util.LinkedHashMap;

public class NodeUtil_getVarsDeclaredInBranch_1317953546277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2836;
     Object term19251;
     Object term19244;

    public NodeUtil_getVarsDeclaredInBranch_1317953546277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2836, term2836.getClass(), "type", -2025555268);
        setIntField(term2838, term2838.getClass(), "type", 1624820010);
        setIntField(term2840, term2840.getClass(), "type", 0);
        setField(term2840, term2840.getClass(), "next", null);
        setField(term2840, term2840.getClass(), "first", null);
        setField(term2840, term2840.getClass(), "last", null);
        setField(term2840, term2840.getClass(), "propListHead", null);
        setIntField(term2840, term2840.getClass(), "sourcePosition", 0);
        setField(term2840, term2840.getClass(), "jsType", null);
        setField(term2840, term2840.getClass(), "parent", null);
        setField(term2838, term2838.getClass(), "next", term2840);
        setIntField(term2843, term2843.getClass(), "type", 0);
        setField(term2843, term2843.getClass(), "next", null);
        setField(term2843, term2843.getClass(), "first", null);
        setField(term2843, term2843.getClass(), "last", null);
        setField(term2843, term2843.getClass(), "propListHead", null);
        setIntField(term2843, term2843.getClass(), "sourcePosition", 0);
        setField(term2843, term2843.getClass(), "jsType", null);
        setField(term2843, term2843.getClass(), "parent", null);
        setField(term2838, term2838.getClass(), "first", term2843);
        setIntField(term2846, term2846.getClass(), "type", 0);
        setField(term2846, term2846.getClass(), "next", null);
        setField(term2846, term2846.getClass(), "first", null);
        setField(term2846, term2846.getClass(), "last", null);
        setField(term2846, term2846.getClass(), "propListHead", null);
        setIntField(term2846, term2846.getClass(), "sourcePosition", 0);
        setField(term2846, term2846.getClass(), "jsType", null);
        setField(term2846, term2846.getClass(), "parent", null);
        setField(term2838, term2838.getClass(), "last", term2846);
        setField(term2838, term2838.getClass(), "propListHead", null);
        setIntField(term2838, term2838.getClass(), "sourcePosition", 0);
        setField(term2838, term2838.getClass(), "jsType", null);
        setField(term2838, term2838.getClass(), "parent", null);
        setField(term2836, term2836.getClass(), "next", term2838);
        setIntField(term2850, term2850.getClass(), "type", 0);
        setField(term2850, term2850.getClass(), "next", null);
        setField(term2850, term2850.getClass(), "first", null);
        setField(term2850, term2850.getClass(), "last", null);
        setField(term2850, term2850.getClass(), "propListHead", null);
        setIntField(term2850, term2850.getClass(), "sourcePosition", 0);
        setField(term2850, term2850.getClass(), "jsType", null);
        setField(term2850, term2850.getClass(), "parent", null);
        setField(term2836, term2836.getClass(), "first", term2850);
        setIntField(term2853, term2853.getClass(), "type", 0);
        setField(term2853, term2853.getClass(), "next", null);
        setField(term2853, term2853.getClass(), "first", null);
        setField(term2853, term2853.getClass(), "last", null);
        setField(term2853, term2853.getClass(), "propListHead", null);
        setIntField(term2853, term2853.getClass(), "sourcePosition", 0);
        setField(term2853, term2853.getClass(), "jsType", null);
        setField(term2853, term2853.getClass(), "parent", null);
        setField(term2836, term2836.getClass(), "last", term2853);
        setField(term2836, term2836.getClass(), "propListHead", null);
        setIntField(term2836, term2836.getClass(), "sourcePosition", 0);
        setField(term2836, term2836.getClass(), "jsType", null);
        setField(term2836, term2836.getClass(), "parent", null);
        term19251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19251, term19251.getClass(), "type", -2025555268);
        setIntField(term19252, term19252.getClass(), "type", 1624820010);
        setIntField(term19253, term19253.getClass(), "type", 0);
        setField(term19253, term19253.getClass(), "next", null);
        setField(term19253, term19253.getClass(), "first", null);
        setField(term19253, term19253.getClass(), "last", null);
        setField(term19253, term19253.getClass(), "propListHead", null);
        setIntField(term19253, term19253.getClass(), "sourcePosition", 0);
        setField(term19253, term19253.getClass(), "jsType", null);
        setField(term19253, term19253.getClass(), "parent", null);
        setField(term19252, term19252.getClass(), "next", term19253);
        setIntField(term19254, term19254.getClass(), "type", 0);
        setField(term19254, term19254.getClass(), "next", null);
        setField(term19254, term19254.getClass(), "first", null);
        setField(term19254, term19254.getClass(), "last", null);
        setField(term19254, term19254.getClass(), "propListHead", null);
        setIntField(term19254, term19254.getClass(), "sourcePosition", 0);
        setField(term19254, term19254.getClass(), "jsType", null);
        setField(term19254, term19254.getClass(), "parent", null);
        setField(term19252, term19252.getClass(), "first", term19254);
        setIntField(term19255, term19255.getClass(), "type", 0);
        setField(term19255, term19255.getClass(), "next", null);
        setField(term19255, term19255.getClass(), "first", null);
        setField(term19255, term19255.getClass(), "last", null);
        setField(term19255, term19255.getClass(), "propListHead", null);
        setIntField(term19255, term19255.getClass(), "sourcePosition", 0);
        setField(term19255, term19255.getClass(), "jsType", null);
        setField(term19255, term19255.getClass(), "parent", null);
        setField(term19252, term19252.getClass(), "last", term19255);
        setField(term19252, term19252.getClass(), "propListHead", null);
        setIntField(term19252, term19252.getClass(), "sourcePosition", 0);
        setField(term19252, term19252.getClass(), "jsType", null);
        setField(term19252, term19252.getClass(), "parent", null);
        setField(term19251, term19251.getClass(), "next", term19252);
        setIntField(term19256, term19256.getClass(), "type", 0);
        setField(term19256, term19256.getClass(), "next", null);
        setField(term19256, term19256.getClass(), "first", null);
        setField(term19256, term19256.getClass(), "last", null);
        setField(term19256, term19256.getClass(), "propListHead", null);
        setIntField(term19256, term19256.getClass(), "sourcePosition", 0);
        setField(term19256, term19256.getClass(), "jsType", null);
        setField(term19256, term19256.getClass(), "parent", null);
        setField(term19251, term19251.getClass(), "first", term19256);
        setIntField(term19257, term19257.getClass(), "type", 0);
        setField(term19257, term19257.getClass(), "next", null);
        setField(term19257, term19257.getClass(), "first", null);
        setField(term19257, term19257.getClass(), "last", null);
        setField(term19257, term19257.getClass(), "propListHead", null);
        setIntField(term19257, term19257.getClass(), "sourcePosition", 0);
        setField(term19257, term19257.getClass(), "jsType", null);
        setField(term19257, term19257.getClass(), "parent", null);
        setField(term19251, term19251.getClass(), "last", term19257);
        setField(term19251, term19251.getClass(), "propListHead", null);
        setIntField(term19251, term19251.getClass(), "sourcePosition", 0);
        setField(term19251, term19251.getClass(), "jsType", null);
        setField(term19251, term19251.getClass(), "parent", null);
        LinkedHashMap term19245 = new LinkedHashMap();
        term19244 = newInstance(Class.forName("java.util.LinkedHashMap$LinkedValues"));
        setField(term19244, term19244.getClass(), "this$0", term19245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2836;
        Object retValue = callMethod(klass, "getVarsDeclaredInBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term2836, term19251));
        assertTrue(recursiveEquals(retValue, term19244));
    }

};


