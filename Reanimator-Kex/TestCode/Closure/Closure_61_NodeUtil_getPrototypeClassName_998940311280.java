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

public class NodeUtil_getPrototypeClassName_998940311280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2899;
     Object term19372;

    public NodeUtil_getPrototypeClassName_998940311280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2899, term2899.getClass(), "type", 1504698817);
        setIntField(term2901, term2901.getClass(), "type", -1573760035);
        setIntField(term2903, term2903.getClass(), "type", 0);
        setField(term2903, term2903.getClass(), "next", null);
        setField(term2903, term2903.getClass(), "first", null);
        setField(term2903, term2903.getClass(), "last", null);
        setField(term2903, term2903.getClass(), "propListHead", null);
        setIntField(term2903, term2903.getClass(), "sourcePosition", 0);
        setField(term2903, term2903.getClass(), "jsType", null);
        setField(term2903, term2903.getClass(), "parent", null);
        setField(term2901, term2901.getClass(), "next", term2903);
        setIntField(term2906, term2906.getClass(), "type", 0);
        setField(term2906, term2906.getClass(), "next", null);
        setField(term2906, term2906.getClass(), "first", null);
        setField(term2906, term2906.getClass(), "last", null);
        setField(term2906, term2906.getClass(), "propListHead", null);
        setIntField(term2906, term2906.getClass(), "sourcePosition", 0);
        setField(term2906, term2906.getClass(), "jsType", null);
        setField(term2906, term2906.getClass(), "parent", null);
        setField(term2901, term2901.getClass(), "first", term2906);
        setIntField(term2909, term2909.getClass(), "type", 0);
        setField(term2909, term2909.getClass(), "next", null);
        setField(term2909, term2909.getClass(), "first", null);
        setField(term2909, term2909.getClass(), "last", null);
        setField(term2909, term2909.getClass(), "propListHead", null);
        setIntField(term2909, term2909.getClass(), "sourcePosition", 0);
        setField(term2909, term2909.getClass(), "jsType", null);
        setField(term2909, term2909.getClass(), "parent", null);
        setField(term2901, term2901.getClass(), "last", term2909);
        setField(term2901, term2901.getClass(), "propListHead", null);
        setIntField(term2901, term2901.getClass(), "sourcePosition", 0);
        setField(term2901, term2901.getClass(), "jsType", null);
        setField(term2901, term2901.getClass(), "parent", null);
        setField(term2899, term2899.getClass(), "next", term2901);
        setIntField(term2913, term2913.getClass(), "type", 0);
        setField(term2913, term2913.getClass(), "next", null);
        setField(term2913, term2913.getClass(), "first", null);
        setField(term2913, term2913.getClass(), "last", null);
        setField(term2913, term2913.getClass(), "propListHead", null);
        setIntField(term2913, term2913.getClass(), "sourcePosition", 0);
        setField(term2913, term2913.getClass(), "jsType", null);
        setField(term2913, term2913.getClass(), "parent", null);
        setField(term2899, term2899.getClass(), "first", term2913);
        setIntField(term2916, term2916.getClass(), "type", 0);
        setField(term2916, term2916.getClass(), "next", null);
        setField(term2916, term2916.getClass(), "first", null);
        setField(term2916, term2916.getClass(), "last", null);
        setField(term2916, term2916.getClass(), "propListHead", null);
        setIntField(term2916, term2916.getClass(), "sourcePosition", 0);
        setField(term2916, term2916.getClass(), "jsType", null);
        setField(term2916, term2916.getClass(), "parent", null);
        setField(term2899, term2899.getClass(), "last", term2916);
        setField(term2899, term2899.getClass(), "propListHead", null);
        setIntField(term2899, term2899.getClass(), "sourcePosition", 0);
        setField(term2899, term2899.getClass(), "jsType", null);
        setField(term2899, term2899.getClass(), "parent", null);
        term19372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19372, term19372.getClass(), "type", 1504698817);
        setIntField(term19373, term19373.getClass(), "type", -1573760035);
        setIntField(term19374, term19374.getClass(), "type", 0);
        setField(term19374, term19374.getClass(), "next", null);
        setField(term19374, term19374.getClass(), "first", null);
        setField(term19374, term19374.getClass(), "last", null);
        setField(term19374, term19374.getClass(), "propListHead", null);
        setIntField(term19374, term19374.getClass(), "sourcePosition", 0);
        setField(term19374, term19374.getClass(), "jsType", null);
        setField(term19374, term19374.getClass(), "parent", null);
        setField(term19373, term19373.getClass(), "next", term19374);
        setIntField(term19375, term19375.getClass(), "type", 0);
        setField(term19375, term19375.getClass(), "next", null);
        setField(term19375, term19375.getClass(), "first", null);
        setField(term19375, term19375.getClass(), "last", null);
        setField(term19375, term19375.getClass(), "propListHead", null);
        setIntField(term19375, term19375.getClass(), "sourcePosition", 0);
        setField(term19375, term19375.getClass(), "jsType", null);
        setField(term19375, term19375.getClass(), "parent", null);
        setField(term19373, term19373.getClass(), "first", term19375);
        setIntField(term19376, term19376.getClass(), "type", 0);
        setField(term19376, term19376.getClass(), "next", null);
        setField(term19376, term19376.getClass(), "first", null);
        setField(term19376, term19376.getClass(), "last", null);
        setField(term19376, term19376.getClass(), "propListHead", null);
        setIntField(term19376, term19376.getClass(), "sourcePosition", 0);
        setField(term19376, term19376.getClass(), "jsType", null);
        setField(term19376, term19376.getClass(), "parent", null);
        setField(term19373, term19373.getClass(), "last", term19376);
        setField(term19373, term19373.getClass(), "propListHead", null);
        setIntField(term19373, term19373.getClass(), "sourcePosition", 0);
        setField(term19373, term19373.getClass(), "jsType", null);
        setField(term19373, term19373.getClass(), "parent", null);
        setField(term19372, term19372.getClass(), "next", term19373);
        setIntField(term19377, term19377.getClass(), "type", 0);
        setField(term19377, term19377.getClass(), "next", null);
        setField(term19377, term19377.getClass(), "first", null);
        setField(term19377, term19377.getClass(), "last", null);
        setField(term19377, term19377.getClass(), "propListHead", null);
        setIntField(term19377, term19377.getClass(), "sourcePosition", 0);
        setField(term19377, term19377.getClass(), "jsType", null);
        setField(term19377, term19377.getClass(), "parent", null);
        setField(term19372, term19372.getClass(), "first", term19377);
        setIntField(term19378, term19378.getClass(), "type", 0);
        setField(term19378, term19378.getClass(), "next", null);
        setField(term19378, term19378.getClass(), "first", null);
        setField(term19378, term19378.getClass(), "last", null);
        setField(term19378, term19378.getClass(), "propListHead", null);
        setIntField(term19378, term19378.getClass(), "sourcePosition", 0);
        setField(term19378, term19378.getClass(), "jsType", null);
        setField(term19378, term19378.getClass(), "parent", null);
        setField(term19372, term19372.getClass(), "last", term19378);
        setField(term19372, term19372.getClass(), "propListHead", null);
        setIntField(term19372, term19372.getClass(), "sourcePosition", 0);
        setField(term19372, term19372.getClass(), "jsType", null);
        setField(term19372, term19372.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2899;
        Object retValue = callMethod(klass, "getPrototypeClassName", argTypes, null, args);
        assertTrue(recursiveEquals(term2899, term19372));
        assertTrue(recursiveEquals(retValue, null));
    }

};


