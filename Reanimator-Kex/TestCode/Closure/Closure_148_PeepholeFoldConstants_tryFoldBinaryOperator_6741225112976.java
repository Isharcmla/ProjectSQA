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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term873823;
     Object term873915;
     Object term874386;
     Object term874387;
     Object term874279;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term873823 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term873915 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term874007 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term874099 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term874185 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term874099, term874099.getClass(), "type", 63);
        setField(term874007, term874007.getClass(), "next", term874099);
        setIntField(term874007, term874007.getClass(), "type", 0);
        setField(term873915, term873915.getClass(), "first", term874007);
        setIntField(term873915, term873915.getClass(), "type", 101);
        setField(term873915, term873915.getClass(), "parent", term874185);
        term874386 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term874386, term874386.getClass(), "currentTraversal", null);
        term874387 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term874388 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term874389 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term874390 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term874387, term874387.getClass(), "number", 0.0);
        setIntField(term874387, term874387.getClass(), "type", 101);
        setField(term874387, term874387.getClass(), "next", null);
        setDoubleField(term874388, term874388.getClass(), "number", 0.0);
        setIntField(term874388, term874388.getClass(), "type", 0);
        setDoubleField(term874389, term874389.getClass(), "number", 0.0);
        setIntField(term874389, term874389.getClass(), "type", 63);
        setField(term874389, term874389.getClass(), "next", null);
        setField(term874389, term874389.getClass(), "first", null);
        setField(term874389, term874389.getClass(), "last", null);
        setField(term874389, term874389.getClass(), "propListHead", null);
        setIntField(term874389, term874389.getClass(), "sourcePosition", 0);
        setField(term874389, term874389.getClass(), "jsType", null);
        setField(term874389, term874389.getClass(), "parent", null);
        setField(term874388, term874388.getClass(), "next", term874389);
        setField(term874388, term874388.getClass(), "first", null);
        setField(term874388, term874388.getClass(), "last", null);
        setField(term874388, term874388.getClass(), "propListHead", null);
        setIntField(term874388, term874388.getClass(), "sourcePosition", 0);
        setField(term874388, term874388.getClass(), "jsType", null);
        setField(term874388, term874388.getClass(), "parent", null);
        setField(term874387, term874387.getClass(), "first", term874388);
        setField(term874387, term874387.getClass(), "last", null);
        setField(term874387, term874387.getClass(), "propListHead", null);
        setIntField(term874387, term874387.getClass(), "sourcePosition", 0);
        setField(term874387, term874387.getClass(), "jsType", null);
        setField(term874390, term874390.getClass(), "functionName", null);
        setBooleanField(term874390, term874390.getClass(), "itsNeedsActivation", false);
        setIntField(term874390, term874390.getClass(), "itsFunctionType", 0);
        setBooleanField(term874390, term874390.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term874390, term874390.getClass(), "encodedSourceStart", 0);
        setIntField(term874390, term874390.getClass(), "encodedSourceEnd", 0);
        setField(term874390, term874390.getClass(), "sourceName", null);
        setIntField(term874390, term874390.getClass(), "baseLineno", 0);
        setIntField(term874390, term874390.getClass(), "endLineno", 0);
        setField(term874390, term874390.getClass(), "functions", null);
        setField(term874390, term874390.getClass(), "regexps", null);
        setField(term874390, term874390.getClass(), "itsVariables", null);
        setField(term874390, term874390.getClass(), "itsConst", null);
        setField(term874390, term874390.getClass(), "itsVariableNames", null);
        setIntField(term874390, term874390.getClass(), "varStart", 0);
        setField(term874390, term874390.getClass(), "compilerData", null);
        setIntField(term874390, term874390.getClass(), "type", 0);
        setField(term874390, term874390.getClass(), "next", null);
        setField(term874390, term874390.getClass(), "first", null);
        setField(term874390, term874390.getClass(), "last", null);
        setField(term874390, term874390.getClass(), "propListHead", null);
        setIntField(term874390, term874390.getClass(), "sourcePosition", 0);
        setField(term874390, term874390.getClass(), "jsType", null);
        setField(term874390, term874390.getClass(), "parent", null);
        setField(term874387, term874387.getClass(), "parent", term874390);
        term874279 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term874282 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term874285 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term874291 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term874279, term874279.getClass(), "number", 0.0);
        setIntField(term874279, term874279.getClass(), "type", 101);
        setField(term874279, term874279.getClass(), "next", null);
        setDoubleField(term874282, term874282.getClass(), "number", 0.0);
        setIntField(term874282, term874282.getClass(), "type", 0);
        setDoubleField(term874285, term874285.getClass(), "number", 0.0);
        setIntField(term874285, term874285.getClass(), "type", 63);
        setField(term874285, term874285.getClass(), "next", null);
        setField(term874285, term874285.getClass(), "first", null);
        setField(term874285, term874285.getClass(), "last", null);
        setField(term874285, term874285.getClass(), "propListHead", null);
        setIntField(term874285, term874285.getClass(), "sourcePosition", 0);
        setField(term874285, term874285.getClass(), "jsType", null);
        setField(term874285, term874285.getClass(), "parent", null);
        setField(term874282, term874282.getClass(), "next", term874285);
        setField(term874282, term874282.getClass(), "first", null);
        setField(term874282, term874282.getClass(), "last", null);
        setField(term874282, term874282.getClass(), "propListHead", null);
        setIntField(term874282, term874282.getClass(), "sourcePosition", 0);
        setField(term874282, term874282.getClass(), "jsType", null);
        setField(term874282, term874282.getClass(), "parent", null);
        setField(term874279, term874279.getClass(), "first", term874282);
        setField(term874279, term874279.getClass(), "last", null);
        setField(term874279, term874279.getClass(), "propListHead", null);
        setIntField(term874279, term874279.getClass(), "sourcePosition", 0);
        setField(term874279, term874279.getClass(), "jsType", null);
        setField(term874291, term874291.getClass(), "functionName", null);
        setBooleanField(term874291, term874291.getClass(), "itsNeedsActivation", false);
        setIntField(term874291, term874291.getClass(), "itsFunctionType", 0);
        setBooleanField(term874291, term874291.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term874291, term874291.getClass(), "encodedSourceStart", 0);
        setIntField(term874291, term874291.getClass(), "encodedSourceEnd", 0);
        setField(term874291, term874291.getClass(), "sourceName", null);
        setIntField(term874291, term874291.getClass(), "baseLineno", 0);
        setIntField(term874291, term874291.getClass(), "endLineno", 0);
        setField(term874291, term874291.getClass(), "functions", null);
        setField(term874291, term874291.getClass(), "regexps", null);
        setField(term874291, term874291.getClass(), "itsVariables", null);
        setField(term874291, term874291.getClass(), "itsConst", null);
        setField(term874291, term874291.getClass(), "itsVariableNames", null);
        setIntField(term874291, term874291.getClass(), "varStart", 0);
        setField(term874291, term874291.getClass(), "compilerData", null);
        setIntField(term874291, term874291.getClass(), "type", 0);
        setField(term874291, term874291.getClass(), "next", null);
        setField(term874291, term874291.getClass(), "first", null);
        setField(term874291, term874291.getClass(), "last", null);
        setField(term874291, term874291.getClass(), "propListHead", null);
        setIntField(term874291, term874291.getClass(), "sourcePosition", 0);
        setField(term874291, term874291.getClass(), "jsType", null);
        setField(term874291, term874291.getClass(), "parent", null);
        setField(term874279, term874279.getClass(), "parent", term874291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term873915;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term873823, args);
        assertTrue(recursiveEquals(term873823, term874386));
        assertTrue(recursiveEquals(term873915, term874387));
        assertTrue(recursiveEquals(retValue, term874279));
    }

};


