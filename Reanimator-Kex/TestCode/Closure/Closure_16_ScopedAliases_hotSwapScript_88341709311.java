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

public class ScopedAliases_hotSwapScript_88341709311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204502;
     Object term204594;
     Object term205913;
     Object term205914;

    public ScopedAliases_hotSwapScript_88341709311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204502 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term204502, term204502.getClass(), "compiler", null);
        term204594 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204686 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204778 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204870 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204962 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term205054 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term204594, term204594.getClass(), "type", 0);
        setField(term204594, term204594.getClass(), "parent", null);
        setField(term204870, term204870.getClass(), "next", null);
        setIntField(term204870, term204870.getClass(), "type", 0);
        setField(term204870, term204870.getClass(), "first", null);
        setField(term204778, term204778.getClass(), "next", term204870);
        setIntField(term204778, term204778.getClass(), "type", 37);
        setField(term204962, term204962.getClass(), "next", null);
        setIntField(term204962, term204962.getClass(), "type", 0);
        setField(term204962, term204962.getClass(), "first", null);
        setField(term204778, term204778.getClass(), "first", term204962);
        setField(term204686, term204686.getClass(), "next", term204778);
        setIntField(term204686, term204686.getClass(), "type", 0);
        setField(term205054, term205054.getClass(), "next", null);
        setIntField(term205054, term205054.getClass(), "type", 0);
        setField(term205054, term205054.getClass(), "first", null);
        setField(term204686, term204686.getClass(), "first", term205054);
        setField(term204594, term204594.getClass(), "first", term204686);
        term205913 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term205913, term205913.getClass(), "compiler", null);
        setField(term205913, term205913.getClass(), "preprocessorSymbolTable", null);
        setField(term205913, term205913.getClass(), "transformationHandler", null);
        term205914 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term205915 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term205916 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term205917 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term205918 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term205919 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term205914, term205914.getClass(), "number", 0.0);
        setIntField(term205914, term205914.getClass(), "type", 0);
        setField(term205914, term205914.getClass(), "next", null);
        setDoubleField(term205915, term205915.getClass(), "number", 0.0);
        setIntField(term205915, term205915.getClass(), "type", 0);
        setDoubleField(term205916, term205916.getClass(), "number", 0.0);
        setIntField(term205916, term205916.getClass(), "type", 37);
        setDoubleField(term205917, term205917.getClass(), "number", 0.0);
        setIntField(term205917, term205917.getClass(), "type", 0);
        setField(term205917, term205917.getClass(), "next", null);
        setField(term205917, term205917.getClass(), "first", null);
        setField(term205917, term205917.getClass(), "last", null);
        setField(term205917, term205917.getClass(), "propListHead", null);
        setIntField(term205917, term205917.getClass(), "sourcePosition", 0);
        setField(term205917, term205917.getClass(), "jsType", null);
        setField(term205917, term205917.getClass(), "parent", null);
        setField(term205916, term205916.getClass(), "next", term205917);
        setDoubleField(term205918, term205918.getClass(), "number", 0.0);
        setIntField(term205918, term205918.getClass(), "type", 0);
        setField(term205918, term205918.getClass(), "next", null);
        setField(term205918, term205918.getClass(), "first", null);
        setField(term205918, term205918.getClass(), "last", null);
        setField(term205918, term205918.getClass(), "propListHead", null);
        setIntField(term205918, term205918.getClass(), "sourcePosition", 0);
        setField(term205918, term205918.getClass(), "jsType", null);
        setField(term205918, term205918.getClass(), "parent", null);
        setField(term205916, term205916.getClass(), "first", term205918);
        setField(term205916, term205916.getClass(), "last", null);
        setField(term205916, term205916.getClass(), "propListHead", null);
        setIntField(term205916, term205916.getClass(), "sourcePosition", 0);
        setField(term205916, term205916.getClass(), "jsType", null);
        setField(term205916, term205916.getClass(), "parent", null);
        setField(term205915, term205915.getClass(), "next", term205916);
        setDoubleField(term205919, term205919.getClass(), "number", 0.0);
        setIntField(term205919, term205919.getClass(), "type", 0);
        setField(term205919, term205919.getClass(), "next", null);
        setField(term205919, term205919.getClass(), "first", null);
        setField(term205919, term205919.getClass(), "last", null);
        setField(term205919, term205919.getClass(), "propListHead", null);
        setIntField(term205919, term205919.getClass(), "sourcePosition", 0);
        setField(term205919, term205919.getClass(), "jsType", null);
        setField(term205919, term205919.getClass(), "parent", null);
        setField(term205915, term205915.getClass(), "first", term205919);
        setField(term205915, term205915.getClass(), "last", null);
        setField(term205915, term205915.getClass(), "propListHead", null);
        setIntField(term205915, term205915.getClass(), "sourcePosition", 0);
        setField(term205915, term205915.getClass(), "jsType", null);
        setField(term205915, term205915.getClass(), "parent", null);
        setField(term205914, term205914.getClass(), "first", term205915);
        setField(term205914, term205914.getClass(), "last", null);
        setField(term205914, term205914.getClass(), "propListHead", null);
        setIntField(term205914, term205914.getClass(), "sourcePosition", 0);
        setField(term205914, term205914.getClass(), "jsType", null);
        setField(term205914, term205914.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term204594;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term204502, args);
        assertTrue(recursiveEquals(term204502, term205913));
        assertTrue(recursiveEquals(term204594, term205914));
    }

};


