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
     Object term19318;

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
        term19318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19318, term19318.getClass(), "type", -1592307668);
        setIntField(term19319, term19319.getClass(), "type", 1059048043);
        setIntField(term19320, term19320.getClass(), "type", 0);
        setField(term19320, term19320.getClass(), "next", null);
        setField(term19320, term19320.getClass(), "first", null);
        setField(term19320, term19320.getClass(), "last", null);
        setField(term19320, term19320.getClass(), "propListHead", null);
        setIntField(term19320, term19320.getClass(), "sourcePosition", 0);
        setField(term19320, term19320.getClass(), "jsType", null);
        setField(term19320, term19320.getClass(), "parent", null);
        setField(term19319, term19319.getClass(), "next", term19320);
        setIntField(term19321, term19321.getClass(), "type", 0);
        setField(term19321, term19321.getClass(), "next", null);
        setField(term19321, term19321.getClass(), "first", null);
        setField(term19321, term19321.getClass(), "last", null);
        setField(term19321, term19321.getClass(), "propListHead", null);
        setIntField(term19321, term19321.getClass(), "sourcePosition", 0);
        setField(term19321, term19321.getClass(), "jsType", null);
        setField(term19321, term19321.getClass(), "parent", null);
        setField(term19319, term19319.getClass(), "first", term19321);
        setIntField(term19322, term19322.getClass(), "type", 0);
        setField(term19322, term19322.getClass(), "next", null);
        setField(term19322, term19322.getClass(), "first", null);
        setField(term19322, term19322.getClass(), "last", null);
        setField(term19322, term19322.getClass(), "propListHead", null);
        setIntField(term19322, term19322.getClass(), "sourcePosition", 0);
        setField(term19322, term19322.getClass(), "jsType", null);
        setField(term19322, term19322.getClass(), "parent", null);
        setField(term19319, term19319.getClass(), "last", term19322);
        setField(term19319, term19319.getClass(), "propListHead", null);
        setIntField(term19319, term19319.getClass(), "sourcePosition", 0);
        setField(term19319, term19319.getClass(), "jsType", null);
        setField(term19319, term19319.getClass(), "parent", null);
        setField(term19318, term19318.getClass(), "next", term19319);
        setIntField(term19323, term19323.getClass(), "type", 0);
        setField(term19323, term19323.getClass(), "next", null);
        setField(term19323, term19323.getClass(), "first", null);
        setField(term19323, term19323.getClass(), "last", null);
        setField(term19323, term19323.getClass(), "propListHead", null);
        setIntField(term19323, term19323.getClass(), "sourcePosition", 0);
        setField(term19323, term19323.getClass(), "jsType", null);
        setField(term19323, term19323.getClass(), "parent", null);
        setField(term19318, term19318.getClass(), "first", term19323);
        setIntField(term19324, term19324.getClass(), "type", 0);
        setField(term19324, term19324.getClass(), "next", null);
        setField(term19324, term19324.getClass(), "first", null);
        setField(term19324, term19324.getClass(), "last", null);
        setField(term19324, term19324.getClass(), "propListHead", null);
        setIntField(term19324, term19324.getClass(), "sourcePosition", 0);
        setField(term19324, term19324.getClass(), "jsType", null);
        setField(term19324, term19324.getClass(), "parent", null);
        setField(term19318, term19318.getClass(), "last", term19324);
        setField(term19318, term19318.getClass(), "propListHead", null);
        setIntField(term19318, term19318.getClass(), "sourcePosition", 0);
        setField(term19318, term19318.getClass(), "jsType", null);
        setField(term19318, term19318.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2878;
        Object retValue = callMethod(klass, "isPrototypeProperty", argTypes, null, args);
        assertTrue(recursiveEquals(term2878, term19318));
        assertTrue(recursiveEquals(retValue, false));
    }

};


