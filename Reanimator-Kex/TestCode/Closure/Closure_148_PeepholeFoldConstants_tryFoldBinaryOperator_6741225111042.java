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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243800;
     Object term243892;
     Object term244912;
     Object term244913;
     Object term244879;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243800 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term243892 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term243984 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term244076 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term243984, term243984.getClass(), "next", term244076);
        setIntField(term243984, term243984.getClass(), "type", 39);
        setField(term243892, term243892.getClass(), "first", term243984);
        setIntField(term243892, term243892.getClass(), "type", 22);
        term244912 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term244912, term244912.getClass(), "currentTraversal", null);
        term244913 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term244914 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term244915 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term244913, term244913.getClass(), "number", 0.0);
        setIntField(term244913, term244913.getClass(), "type", 22);
        setField(term244913, term244913.getClass(), "next", null);
        setDoubleField(term244914, term244914.getClass(), "number", 0.0);
        setIntField(term244914, term244914.getClass(), "type", 39);
        setField(term244915, term244915.getClass(), "str", null);
        setIntField(term244915, term244915.getClass(), "type", 0);
        setField(term244915, term244915.getClass(), "next", null);
        setField(term244915, term244915.getClass(), "first", null);
        setField(term244915, term244915.getClass(), "last", null);
        setField(term244915, term244915.getClass(), "propListHead", null);
        setIntField(term244915, term244915.getClass(), "sourcePosition", 0);
        setField(term244915, term244915.getClass(), "jsType", null);
        setField(term244915, term244915.getClass(), "parent", null);
        setField(term244914, term244914.getClass(), "next", term244915);
        setField(term244914, term244914.getClass(), "first", null);
        setField(term244914, term244914.getClass(), "last", null);
        setField(term244914, term244914.getClass(), "propListHead", null);
        setIntField(term244914, term244914.getClass(), "sourcePosition", 0);
        setField(term244914, term244914.getClass(), "jsType", null);
        setField(term244914, term244914.getClass(), "parent", null);
        setField(term244913, term244913.getClass(), "first", term244914);
        setField(term244913, term244913.getClass(), "last", null);
        setField(term244913, term244913.getClass(), "propListHead", null);
        setIntField(term244913, term244913.getClass(), "sourcePosition", 0);
        setField(term244913, term244913.getClass(), "jsType", null);
        setField(term244913, term244913.getClass(), "parent", null);
        term244879 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term244882 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term244885 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term244879, term244879.getClass(), "number", 0.0);
        setIntField(term244879, term244879.getClass(), "type", 22);
        setField(term244879, term244879.getClass(), "next", null);
        setDoubleField(term244882, term244882.getClass(), "number", 0.0);
        setIntField(term244882, term244882.getClass(), "type", 39);
        setField(term244885, term244885.getClass(), "str", null);
        setIntField(term244885, term244885.getClass(), "type", 0);
        setField(term244885, term244885.getClass(), "next", null);
        setField(term244885, term244885.getClass(), "first", null);
        setField(term244885, term244885.getClass(), "last", null);
        setField(term244885, term244885.getClass(), "propListHead", null);
        setIntField(term244885, term244885.getClass(), "sourcePosition", 0);
        setField(term244885, term244885.getClass(), "jsType", null);
        setField(term244885, term244885.getClass(), "parent", null);
        setField(term244882, term244882.getClass(), "next", term244885);
        setField(term244882, term244882.getClass(), "first", null);
        setField(term244882, term244882.getClass(), "last", null);
        setField(term244882, term244882.getClass(), "propListHead", null);
        setIntField(term244882, term244882.getClass(), "sourcePosition", 0);
        setField(term244882, term244882.getClass(), "jsType", null);
        setField(term244882, term244882.getClass(), "parent", null);
        setField(term244879, term244879.getClass(), "first", term244882);
        setField(term244879, term244879.getClass(), "last", null);
        setField(term244879, term244879.getClass(), "propListHead", null);
        setIntField(term244879, term244879.getClass(), "sourcePosition", 0);
        setField(term244879, term244879.getClass(), "jsType", null);
        setField(term244879, term244879.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term243892;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term243800, args);
        assertTrue(recursiveEquals(term243800, term244912));
        assertTrue(recursiveEquals(term243892, term244913));
        assertTrue(recursiveEquals(retValue, term244879));
    }

};


