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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term632921;
     Object term633013;
     Object term633913;
     Object term633914;
     Object term633841;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term632921 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term633013 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term633105 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term633197 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term633289 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term633197, term633197.getClass(), "type", 63);
        setField(term633105, term633105.getClass(), "next", term633197);
        setIntField(term633105, term633105.getClass(), "type", 0);
        setField(term633013, term633013.getClass(), "first", term633105);
        setIntField(term633013, term633013.getClass(), "type", 101);
        setField(term633013, term633013.getClass(), "parent", term633289);
        term633913 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term633913, term633913.getClass(), "currentTraversal", null);
        term633914 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term633915 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term633916 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term633917 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term633914, term633914.getClass(), "number", 0.0);
        setIntField(term633914, term633914.getClass(), "type", 101);
        setField(term633914, term633914.getClass(), "next", null);
        setDoubleField(term633915, term633915.getClass(), "number", 0.0);
        setIntField(term633915, term633915.getClass(), "type", 0);
        setField(term633916, term633916.getClass(), "str", null);
        setIntField(term633916, term633916.getClass(), "type", 63);
        setField(term633916, term633916.getClass(), "next", null);
        setField(term633916, term633916.getClass(), "first", null);
        setField(term633916, term633916.getClass(), "last", null);
        setField(term633916, term633916.getClass(), "propListHead", null);
        setIntField(term633916, term633916.getClass(), "sourcePosition", 0);
        setField(term633916, term633916.getClass(), "jsType", null);
        setField(term633916, term633916.getClass(), "parent", null);
        setField(term633915, term633915.getClass(), "next", term633916);
        setField(term633915, term633915.getClass(), "first", null);
        setField(term633915, term633915.getClass(), "last", null);
        setField(term633915, term633915.getClass(), "propListHead", null);
        setIntField(term633915, term633915.getClass(), "sourcePosition", 0);
        setField(term633915, term633915.getClass(), "jsType", null);
        setField(term633915, term633915.getClass(), "parent", null);
        setField(term633914, term633914.getClass(), "first", term633915);
        setField(term633914, term633914.getClass(), "last", null);
        setField(term633914, term633914.getClass(), "propListHead", null);
        setIntField(term633914, term633914.getClass(), "sourcePosition", 0);
        setField(term633914, term633914.getClass(), "jsType", null);
        setField(term633917, term633917.getClass(), "str", null);
        setIntField(term633917, term633917.getClass(), "type", 0);
        setField(term633917, term633917.getClass(), "next", null);
        setField(term633917, term633917.getClass(), "first", null);
        setField(term633917, term633917.getClass(), "last", null);
        setField(term633917, term633917.getClass(), "propListHead", null);
        setIntField(term633917, term633917.getClass(), "sourcePosition", 0);
        setField(term633917, term633917.getClass(), "jsType", null);
        setField(term633917, term633917.getClass(), "parent", null);
        setField(term633914, term633914.getClass(), "parent", term633917);
        term633841 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term633844 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term633847 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term633852 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term633841, term633841.getClass(), "number", 0.0);
        setIntField(term633841, term633841.getClass(), "type", 101);
        setField(term633841, term633841.getClass(), "next", null);
        setDoubleField(term633844, term633844.getClass(), "number", 0.0);
        setIntField(term633844, term633844.getClass(), "type", 0);
        setField(term633847, term633847.getClass(), "str", null);
        setIntField(term633847, term633847.getClass(), "type", 63);
        setField(term633847, term633847.getClass(), "next", null);
        setField(term633847, term633847.getClass(), "first", null);
        setField(term633847, term633847.getClass(), "last", null);
        setField(term633847, term633847.getClass(), "propListHead", null);
        setIntField(term633847, term633847.getClass(), "sourcePosition", 0);
        setField(term633847, term633847.getClass(), "jsType", null);
        setField(term633847, term633847.getClass(), "parent", null);
        setField(term633844, term633844.getClass(), "next", term633847);
        setField(term633844, term633844.getClass(), "first", null);
        setField(term633844, term633844.getClass(), "last", null);
        setField(term633844, term633844.getClass(), "propListHead", null);
        setIntField(term633844, term633844.getClass(), "sourcePosition", 0);
        setField(term633844, term633844.getClass(), "jsType", null);
        setField(term633844, term633844.getClass(), "parent", null);
        setField(term633841, term633841.getClass(), "first", term633844);
        setField(term633841, term633841.getClass(), "last", null);
        setField(term633841, term633841.getClass(), "propListHead", null);
        setIntField(term633841, term633841.getClass(), "sourcePosition", 0);
        setField(term633841, term633841.getClass(), "jsType", null);
        setField(term633852, term633852.getClass(), "str", null);
        setIntField(term633852, term633852.getClass(), "type", 0);
        setField(term633852, term633852.getClass(), "next", null);
        setField(term633852, term633852.getClass(), "first", null);
        setField(term633852, term633852.getClass(), "last", null);
        setField(term633852, term633852.getClass(), "propListHead", null);
        setIntField(term633852, term633852.getClass(), "sourcePosition", 0);
        setField(term633852, term633852.getClass(), "jsType", null);
        setField(term633852, term633852.getClass(), "parent", null);
        setField(term633841, term633841.getClass(), "parent", term633852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term633013;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term632921, args);
        assertTrue(recursiveEquals(term632921, term633913));
        assertTrue(recursiveEquals(term633013, term633914));
        assertTrue(recursiveEquals(retValue, term633841));
    }

};


