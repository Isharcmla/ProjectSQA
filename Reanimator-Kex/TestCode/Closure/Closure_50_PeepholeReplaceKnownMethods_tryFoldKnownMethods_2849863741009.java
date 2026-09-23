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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4211609;
     Object term4211701;
     Object term4213356;
     Object term4213357;
     Object term4213091;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4211609 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4211701 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4211793 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4211885 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4211977 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4212107 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4211793, term4211793.getClass(), "type", 35);
        setIntField(term4211977, term4211977.getClass(), "type", 40);
        setField(term4211977, term4211977.getClass(), "str", "substr");
        setField(term4211885, term4211885.getClass(), "next", term4211977);
        setIntField(term4211885, term4211885.getClass(), "type", 40);
        setField(term4211793, term4211793.getClass(), "first", term4211885);
        setIntField(term4212107, term4212107.getClass(), "type", 43);
        setField(term4211793, term4211793.getClass(), "next", term4212107);
        setField(term4211701, term4211701.getClass(), "first", term4211793);
        setIntField(term4211701, term4211701.getClass(), "type", 37);
        term4213356 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4213356, term4213356.getClass(), "currentTraversal", null);
        term4213357 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4213358 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4213359 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4213360 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4213361 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4213357, term4213357.getClass(), "str", null);
        setIntField(term4213357, term4213357.getClass(), "type", 37);
        setField(term4213357, term4213357.getClass(), "next", null);
        setField(term4213358, term4213358.getClass(), "str", null);
        setIntField(term4213358, term4213358.getClass(), "type", 35);
        setDoubleField(term4213359, term4213359.getClass(), "number", 0.0);
        setIntField(term4213359, term4213359.getClass(), "type", 43);
        setField(term4213359, term4213359.getClass(), "next", null);
        setField(term4213359, term4213359.getClass(), "first", null);
        setField(term4213359, term4213359.getClass(), "last", null);
        setField(term4213359, term4213359.getClass(), "propListHead", null);
        setIntField(term4213359, term4213359.getClass(), "sourcePosition", 0);
        setField(term4213359, term4213359.getClass(), "jsType", null);
        setField(term4213359, term4213359.getClass(), "parent", null);
        setField(term4213358, term4213358.getClass(), "next", term4213359);
        setField(term4213360, term4213360.getClass(), "str", null);
        setIntField(term4213360, term4213360.getClass(), "type", 40);
        setField(term4213361, term4213361.getClass(), "str", "");
        setIntField(term4213361, term4213361.getClass(), "type", 40);
        setField(term4213361, term4213361.getClass(), "next", null);
        setField(term4213361, term4213361.getClass(), "first", null);
        setField(term4213361, term4213361.getClass(), "last", null);
        setField(term4213361, term4213361.getClass(), "propListHead", null);
        setIntField(term4213361, term4213361.getClass(), "sourcePosition", 0);
        setField(term4213361, term4213361.getClass(), "jsType", null);
        setField(term4213361, term4213361.getClass(), "parent", null);
        setField(term4213360, term4213360.getClass(), "next", term4213361);
        setField(term4213360, term4213360.getClass(), "first", null);
        setField(term4213360, term4213360.getClass(), "last", null);
        setField(term4213360, term4213360.getClass(), "propListHead", null);
        setIntField(term4213360, term4213360.getClass(), "sourcePosition", 0);
        setField(term4213360, term4213360.getClass(), "jsType", null);
        setField(term4213360, term4213360.getClass(), "parent", null);
        setField(term4213358, term4213358.getClass(), "first", term4213360);
        setField(term4213358, term4213358.getClass(), "last", null);
        setField(term4213358, term4213358.getClass(), "propListHead", null);
        setIntField(term4213358, term4213358.getClass(), "sourcePosition", 0);
        setField(term4213358, term4213358.getClass(), "jsType", null);
        setField(term4213358, term4213358.getClass(), "parent", null);
        setField(term4213357, term4213357.getClass(), "first", term4213358);
        setField(term4213357, term4213357.getClass(), "last", null);
        setField(term4213357, term4213357.getClass(), "propListHead", null);
        setIntField(term4213357, term4213357.getClass(), "sourcePosition", 0);
        setField(term4213357, term4213357.getClass(), "jsType", null);
        setField(term4213357, term4213357.getClass(), "parent", null);
        term4213091 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4213093 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4213095 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4213099 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4213101 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4213091, term4213091.getClass(), "str", null);
        setIntField(term4213091, term4213091.getClass(), "type", 37);
        setField(term4213091, term4213091.getClass(), "next", null);
        setField(term4213093, term4213093.getClass(), "str", null);
        setIntField(term4213093, term4213093.getClass(), "type", 35);
        setDoubleField(term4213095, term4213095.getClass(), "number", 0.0);
        setIntField(term4213095, term4213095.getClass(), "type", 43);
        setField(term4213095, term4213095.getClass(), "next", null);
        setField(term4213095, term4213095.getClass(), "first", null);
        setField(term4213095, term4213095.getClass(), "last", null);
        setField(term4213095, term4213095.getClass(), "propListHead", null);
        setIntField(term4213095, term4213095.getClass(), "sourcePosition", 0);
        setField(term4213095, term4213095.getClass(), "jsType", null);
        setField(term4213095, term4213095.getClass(), "parent", null);
        setField(term4213093, term4213093.getClass(), "next", term4213095);
        setField(term4213099, term4213099.getClass(), "str", null);
        setIntField(term4213099, term4213099.getClass(), "type", 40);
        setField(term4213101, term4213101.getClass(), "str", "");
        setIntField(term4213101, term4213101.getClass(), "type", 40);
        setField(term4213101, term4213101.getClass(), "next", null);
        setField(term4213101, term4213101.getClass(), "first", null);
        setField(term4213101, term4213101.getClass(), "last", null);
        setField(term4213101, term4213101.getClass(), "propListHead", null);
        setIntField(term4213101, term4213101.getClass(), "sourcePosition", 0);
        setField(term4213101, term4213101.getClass(), "jsType", null);
        setField(term4213101, term4213101.getClass(), "parent", null);
        setField(term4213099, term4213099.getClass(), "next", term4213101);
        setField(term4213099, term4213099.getClass(), "first", null);
        setField(term4213099, term4213099.getClass(), "last", null);
        setField(term4213099, term4213099.getClass(), "propListHead", null);
        setIntField(term4213099, term4213099.getClass(), "sourcePosition", 0);
        setField(term4213099, term4213099.getClass(), "jsType", null);
        setField(term4213099, term4213099.getClass(), "parent", null);
        setField(term4213093, term4213093.getClass(), "first", term4213099);
        setField(term4213093, term4213093.getClass(), "last", null);
        setField(term4213093, term4213093.getClass(), "propListHead", null);
        setIntField(term4213093, term4213093.getClass(), "sourcePosition", 0);
        setField(term4213093, term4213093.getClass(), "jsType", null);
        setField(term4213093, term4213093.getClass(), "parent", null);
        setField(term4213091, term4213091.getClass(), "first", term4213093);
        setField(term4213091, term4213091.getClass(), "last", null);
        setField(term4213091, term4213091.getClass(), "propListHead", null);
        setIntField(term4213091, term4213091.getClass(), "sourcePosition", 0);
        setField(term4213091, term4213091.getClass(), "jsType", null);
        setField(term4213091, term4213091.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4211701;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4211609, args);
        assertTrue(recursiveEquals(term4211609, term4213356));
        assertTrue(recursiveEquals(term4211701, term4213357));
        assertTrue(recursiveEquals(retValue, term4213091));
    }

};


