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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3505346;
     Object term3505438;
     Object term3506912;
     Object term3506913;
     Object term3506582;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3505346 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3505438 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3505530 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3505622 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3505714 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3505838 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3505530, term3505530.getClass(), "type", 35);
        setIntField(term3505714, term3505714.getClass(), "type", 40);
        setField(term3505714, term3505714.getClass(), "str", "charAt");
        setField(term3505622, term3505622.getClass(), "next", term3505714);
        setIntField(term3505622, term3505622.getClass(), "type", 40);
        setField(term3505530, term3505530.getClass(), "first", term3505622);
        setIntField(term3505838, term3505838.getClass(), "type", 40);
        setField(term3505530, term3505530.getClass(), "next", term3505838);
        setField(term3505438, term3505438.getClass(), "first", term3505530);
        setIntField(term3505438, term3505438.getClass(), "type", 37);
        term3506912 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3506912, term3506912.getClass(), "currentTraversal", null);
        term3506913 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3506914 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3506915 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3506916 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3506917 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3506913, term3506913.getClass(), "str", null);
        setIntField(term3506913, term3506913.getClass(), "type", 37);
        setField(term3506913, term3506913.getClass(), "next", null);
        setField(term3506914, term3506914.getClass(), "str", null);
        setIntField(term3506914, term3506914.getClass(), "type", 35);
        setField(term3506915, term3506915.getClass(), "functionName", null);
        setBooleanField(term3506915, term3506915.getClass(), "itsNeedsActivation", false);
        setIntField(term3506915, term3506915.getClass(), "itsFunctionType", 0);
        setBooleanField(term3506915, term3506915.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3506915, term3506915.getClass(), "encodedSourceStart", 0);
        setIntField(term3506915, term3506915.getClass(), "encodedSourceEnd", 0);
        setField(term3506915, term3506915.getClass(), "sourceName", null);
        setIntField(term3506915, term3506915.getClass(), "baseLineno", 0);
        setIntField(term3506915, term3506915.getClass(), "endLineno", 0);
        setField(term3506915, term3506915.getClass(), "functions", null);
        setField(term3506915, term3506915.getClass(), "regexps", null);
        setField(term3506915, term3506915.getClass(), "itsVariables", null);
        setField(term3506915, term3506915.getClass(), "itsConst", null);
        setField(term3506915, term3506915.getClass(), "itsVariableNames", null);
        setIntField(term3506915, term3506915.getClass(), "varStart", 0);
        setField(term3506915, term3506915.getClass(), "compilerData", null);
        setIntField(term3506915, term3506915.getClass(), "type", 40);
        setField(term3506915, term3506915.getClass(), "next", null);
        setField(term3506915, term3506915.getClass(), "first", null);
        setField(term3506915, term3506915.getClass(), "last", null);
        setField(term3506915, term3506915.getClass(), "propListHead", null);
        setIntField(term3506915, term3506915.getClass(), "sourcePosition", 0);
        setField(term3506915, term3506915.getClass(), "jsType", null);
        setField(term3506915, term3506915.getClass(), "parent", null);
        setField(term3506914, term3506914.getClass(), "next", term3506915);
        setField(term3506916, term3506916.getClass(), "str", null);
        setIntField(term3506916, term3506916.getClass(), "type", 40);
        setField(term3506917, term3506917.getClass(), "str", "");
        setIntField(term3506917, term3506917.getClass(), "type", 40);
        setField(term3506917, term3506917.getClass(), "next", null);
        setField(term3506917, term3506917.getClass(), "first", null);
        setField(term3506917, term3506917.getClass(), "last", null);
        setField(term3506917, term3506917.getClass(), "propListHead", null);
        setIntField(term3506917, term3506917.getClass(), "sourcePosition", 0);
        setField(term3506917, term3506917.getClass(), "jsType", null);
        setField(term3506917, term3506917.getClass(), "parent", null);
        setField(term3506916, term3506916.getClass(), "next", term3506917);
        setField(term3506916, term3506916.getClass(), "first", null);
        setField(term3506916, term3506916.getClass(), "last", null);
        setField(term3506916, term3506916.getClass(), "propListHead", null);
        setIntField(term3506916, term3506916.getClass(), "sourcePosition", 0);
        setField(term3506916, term3506916.getClass(), "jsType", null);
        setField(term3506916, term3506916.getClass(), "parent", null);
        setField(term3506914, term3506914.getClass(), "first", term3506916);
        setField(term3506914, term3506914.getClass(), "last", null);
        setField(term3506914, term3506914.getClass(), "propListHead", null);
        setIntField(term3506914, term3506914.getClass(), "sourcePosition", 0);
        setField(term3506914, term3506914.getClass(), "jsType", null);
        setField(term3506914, term3506914.getClass(), "parent", null);
        setField(term3506913, term3506913.getClass(), "first", term3506914);
        setField(term3506913, term3506913.getClass(), "last", null);
        setField(term3506913, term3506913.getClass(), "propListHead", null);
        setIntField(term3506913, term3506913.getClass(), "sourcePosition", 0);
        setField(term3506913, term3506913.getClass(), "jsType", null);
        setField(term3506913, term3506913.getClass(), "parent", null);
        term3506582 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3506584 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3506586 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3506597 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3506599 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3506582, term3506582.getClass(), "str", null);
        setIntField(term3506582, term3506582.getClass(), "type", 37);
        setField(term3506582, term3506582.getClass(), "next", null);
        setField(term3506584, term3506584.getClass(), "str", null);
        setIntField(term3506584, term3506584.getClass(), "type", 35);
        setField(term3506586, term3506586.getClass(), "functionName", null);
        setBooleanField(term3506586, term3506586.getClass(), "itsNeedsActivation", false);
        setIntField(term3506586, term3506586.getClass(), "itsFunctionType", 0);
        setBooleanField(term3506586, term3506586.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3506586, term3506586.getClass(), "encodedSourceStart", 0);
        setIntField(term3506586, term3506586.getClass(), "encodedSourceEnd", 0);
        setField(term3506586, term3506586.getClass(), "sourceName", null);
        setIntField(term3506586, term3506586.getClass(), "baseLineno", 0);
        setIntField(term3506586, term3506586.getClass(), "endLineno", 0);
        setField(term3506586, term3506586.getClass(), "functions", null);
        setField(term3506586, term3506586.getClass(), "regexps", null);
        setField(term3506586, term3506586.getClass(), "itsVariables", null);
        setField(term3506586, term3506586.getClass(), "itsConst", null);
        setField(term3506586, term3506586.getClass(), "itsVariableNames", null);
        setIntField(term3506586, term3506586.getClass(), "varStart", 0);
        setField(term3506586, term3506586.getClass(), "compilerData", null);
        setIntField(term3506586, term3506586.getClass(), "type", 40);
        setField(term3506586, term3506586.getClass(), "next", null);
        setField(term3506586, term3506586.getClass(), "first", null);
        setField(term3506586, term3506586.getClass(), "last", null);
        setField(term3506586, term3506586.getClass(), "propListHead", null);
        setIntField(term3506586, term3506586.getClass(), "sourcePosition", 0);
        setField(term3506586, term3506586.getClass(), "jsType", null);
        setField(term3506586, term3506586.getClass(), "parent", null);
        setField(term3506584, term3506584.getClass(), "next", term3506586);
        setField(term3506597, term3506597.getClass(), "str", null);
        setIntField(term3506597, term3506597.getClass(), "type", 40);
        setField(term3506599, term3506599.getClass(), "str", "");
        setIntField(term3506599, term3506599.getClass(), "type", 40);
        setField(term3506599, term3506599.getClass(), "next", null);
        setField(term3506599, term3506599.getClass(), "first", null);
        setField(term3506599, term3506599.getClass(), "last", null);
        setField(term3506599, term3506599.getClass(), "propListHead", null);
        setIntField(term3506599, term3506599.getClass(), "sourcePosition", 0);
        setField(term3506599, term3506599.getClass(), "jsType", null);
        setField(term3506599, term3506599.getClass(), "parent", null);
        setField(term3506597, term3506597.getClass(), "next", term3506599);
        setField(term3506597, term3506597.getClass(), "first", null);
        setField(term3506597, term3506597.getClass(), "last", null);
        setField(term3506597, term3506597.getClass(), "propListHead", null);
        setIntField(term3506597, term3506597.getClass(), "sourcePosition", 0);
        setField(term3506597, term3506597.getClass(), "jsType", null);
        setField(term3506597, term3506597.getClass(), "parent", null);
        setField(term3506584, term3506584.getClass(), "first", term3506597);
        setField(term3506584, term3506584.getClass(), "last", null);
        setField(term3506584, term3506584.getClass(), "propListHead", null);
        setIntField(term3506584, term3506584.getClass(), "sourcePosition", 0);
        setField(term3506584, term3506584.getClass(), "jsType", null);
        setField(term3506584, term3506584.getClass(), "parent", null);
        setField(term3506582, term3506582.getClass(), "first", term3506584);
        setField(term3506582, term3506582.getClass(), "last", null);
        setField(term3506582, term3506582.getClass(), "propListHead", null);
        setIntField(term3506582, term3506582.getClass(), "sourcePosition", 0);
        setField(term3506582, term3506582.getClass(), "jsType", null);
        setField(term3506582, term3506582.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3505438;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3505346, args);
        assertTrue(recursiveEquals(term3505346, term3506912));
        assertTrue(recursiveEquals(term3505438, term3506913));
        assertTrue(recursiveEquals(retValue, term3506582));
    }

};


