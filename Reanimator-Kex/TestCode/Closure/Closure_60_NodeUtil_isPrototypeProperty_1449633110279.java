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

public class NodeUtil_isPrototypeProperty_1449633110279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2878;
     Object term19415;

    public NodeUtil_isPrototypeProperty_1449633110279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2878, term2878.getClass(), "type", -1592307668);
        setIntField(term2880, term2880.getClass(), "type", 1059048043);
        setIntField(term2882, term2882.getClass(), "type", 0);
        setField(term2882, term2882.getClass(), "next", null);
        setField(term2882, term2882.getClass(), "first", null);
        setField(term2882, term2882.getClass(), "last", null);
        setField(term2882, term2882.getClass(), "propListHead", null);
        setIntField(term2882, term2882.getClass(), "sourcePosition", 0);
        setField(term2882, term2882.getClass(), "jsType", null);
        setField(term2882, term2882.getClass(), "parent", null);
        setField(term2880, term2880.getClass(), "next", term2882);
        setIntField(term2885, term2885.getClass(), "type", 0);
        setField(term2885, term2885.getClass(), "next", null);
        setField(term2885, term2885.getClass(), "first", null);
        setField(term2885, term2885.getClass(), "last", null);
        setField(term2885, term2885.getClass(), "propListHead", null);
        setIntField(term2885, term2885.getClass(), "sourcePosition", 0);
        setField(term2885, term2885.getClass(), "jsType", null);
        setField(term2885, term2885.getClass(), "parent", null);
        setField(term2880, term2880.getClass(), "first", term2885);
        setIntField(term2888, term2888.getClass(), "type", 0);
        setField(term2888, term2888.getClass(), "next", null);
        setField(term2888, term2888.getClass(), "first", null);
        setField(term2888, term2888.getClass(), "last", null);
        setField(term2888, term2888.getClass(), "propListHead", null);
        setIntField(term2888, term2888.getClass(), "sourcePosition", 0);
        setField(term2888, term2888.getClass(), "jsType", null);
        setField(term2888, term2888.getClass(), "parent", null);
        setField(term2880, term2880.getClass(), "last", term2888);
        setField(term2880, term2880.getClass(), "propListHead", null);
        setIntField(term2880, term2880.getClass(), "sourcePosition", 0);
        setField(term2880, term2880.getClass(), "jsType", null);
        setField(term2880, term2880.getClass(), "parent", null);
        setField(term2878, term2878.getClass(), "next", term2880);
        setIntField(term2892, term2892.getClass(), "type", 0);
        setField(term2892, term2892.getClass(), "next", null);
        setField(term2892, term2892.getClass(), "first", null);
        setField(term2892, term2892.getClass(), "last", null);
        setField(term2892, term2892.getClass(), "propListHead", null);
        setIntField(term2892, term2892.getClass(), "sourcePosition", 0);
        setField(term2892, term2892.getClass(), "jsType", null);
        setField(term2892, term2892.getClass(), "parent", null);
        setField(term2878, term2878.getClass(), "first", term2892);
        setIntField(term2895, term2895.getClass(), "type", 0);
        setField(term2895, term2895.getClass(), "next", null);
        setField(term2895, term2895.getClass(), "first", null);
        setField(term2895, term2895.getClass(), "last", null);
        setField(term2895, term2895.getClass(), "propListHead", null);
        setIntField(term2895, term2895.getClass(), "sourcePosition", 0);
        setField(term2895, term2895.getClass(), "jsType", null);
        setField(term2895, term2895.getClass(), "parent", null);
        setField(term2878, term2878.getClass(), "last", term2895);
        setField(term2878, term2878.getClass(), "propListHead", null);
        setIntField(term2878, term2878.getClass(), "sourcePosition", 0);
        setField(term2878, term2878.getClass(), "jsType", null);
        setField(term2878, term2878.getClass(), "parent", null);
        term19415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19415, term19415.getClass(), "type", -1592307668);
        setIntField(term19416, term19416.getClass(), "type", 1059048043);
        setIntField(term19417, term19417.getClass(), "type", 0);
        setField(term19417, term19417.getClass(), "next", null);
        setField(term19417, term19417.getClass(), "first", null);
        setField(term19417, term19417.getClass(), "last", null);
        setField(term19417, term19417.getClass(), "propListHead", null);
        setIntField(term19417, term19417.getClass(), "sourcePosition", 0);
        setField(term19417, term19417.getClass(), "jsType", null);
        setField(term19417, term19417.getClass(), "parent", null);
        setField(term19416, term19416.getClass(), "next", term19417);
        setIntField(term19418, term19418.getClass(), "type", 0);
        setField(term19418, term19418.getClass(), "next", null);
        setField(term19418, term19418.getClass(), "first", null);
        setField(term19418, term19418.getClass(), "last", null);
        setField(term19418, term19418.getClass(), "propListHead", null);
        setIntField(term19418, term19418.getClass(), "sourcePosition", 0);
        setField(term19418, term19418.getClass(), "jsType", null);
        setField(term19418, term19418.getClass(), "parent", null);
        setField(term19416, term19416.getClass(), "first", term19418);
        setIntField(term19419, term19419.getClass(), "type", 0);
        setField(term19419, term19419.getClass(), "next", null);
        setField(term19419, term19419.getClass(), "first", null);
        setField(term19419, term19419.getClass(), "last", null);
        setField(term19419, term19419.getClass(), "propListHead", null);
        setIntField(term19419, term19419.getClass(), "sourcePosition", 0);
        setField(term19419, term19419.getClass(), "jsType", null);
        setField(term19419, term19419.getClass(), "parent", null);
        setField(term19416, term19416.getClass(), "last", term19419);
        setField(term19416, term19416.getClass(), "propListHead", null);
        setIntField(term19416, term19416.getClass(), "sourcePosition", 0);
        setField(term19416, term19416.getClass(), "jsType", null);
        setField(term19416, term19416.getClass(), "parent", null);
        setField(term19415, term19415.getClass(), "next", term19416);
        setIntField(term19420, term19420.getClass(), "type", 0);
        setField(term19420, term19420.getClass(), "next", null);
        setField(term19420, term19420.getClass(), "first", null);
        setField(term19420, term19420.getClass(), "last", null);
        setField(term19420, term19420.getClass(), "propListHead", null);
        setIntField(term19420, term19420.getClass(), "sourcePosition", 0);
        setField(term19420, term19420.getClass(), "jsType", null);
        setField(term19420, term19420.getClass(), "parent", null);
        setField(term19415, term19415.getClass(), "first", term19420);
        setIntField(term19421, term19421.getClass(), "type", 0);
        setField(term19421, term19421.getClass(), "next", null);
        setField(term19421, term19421.getClass(), "first", null);
        setField(term19421, term19421.getClass(), "last", null);
        setField(term19421, term19421.getClass(), "propListHead", null);
        setIntField(term19421, term19421.getClass(), "sourcePosition", 0);
        setField(term19421, term19421.getClass(), "jsType", null);
        setField(term19421, term19421.getClass(), "parent", null);
        setField(term19415, term19415.getClass(), "last", term19421);
        setField(term19415, term19415.getClass(), "propListHead", null);
        setIntField(term19415, term19415.getClass(), "sourcePosition", 0);
        setField(term19415, term19415.getClass(), "jsType", null);
        setField(term19415, term19415.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2878;
        Object retValue = callMethod(klass, "isPrototypeProperty", argTypes, null, args);
        assertTrue(recursiveEquals(term2878, term19415));
        assertTrue(recursiveEquals(retValue, false));
    }

};


