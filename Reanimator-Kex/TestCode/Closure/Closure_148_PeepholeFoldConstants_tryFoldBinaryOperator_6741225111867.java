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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492020;
     Object term492112;
     Object term492914;
     Object term492915;
     Object term492806;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492020 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term492112 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term492198 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term492284 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term492354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term492284, term492284.getClass(), "type", 64);
        setField(term492198, term492198.getClass(), "next", term492284);
        setIntField(term492198, term492198.getClass(), "type", 0);
        setField(term492112, term492112.getClass(), "first", term492198);
        setIntField(term492112, term492112.getClass(), "type", 101);
        setField(term492112, term492112.getClass(), "parent", term492354);
        term492914 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term492914, term492914.getClass(), "currentTraversal", null);
        term492915 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term492916 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term492917 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term492918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term492915, term492915.getClass(), "str", null);
        setIntField(term492915, term492915.getClass(), "type", 101);
        setField(term492915, term492915.getClass(), "next", null);
        setField(term492916, term492916.getClass(), "functionName", null);
        setBooleanField(term492916, term492916.getClass(), "itsNeedsActivation", false);
        setIntField(term492916, term492916.getClass(), "itsFunctionType", 0);
        setBooleanField(term492916, term492916.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term492916, term492916.getClass(), "encodedSourceStart", 0);
        setIntField(term492916, term492916.getClass(), "encodedSourceEnd", 0);
        setField(term492916, term492916.getClass(), "sourceName", null);
        setIntField(term492916, term492916.getClass(), "baseLineno", 0);
        setIntField(term492916, term492916.getClass(), "endLineno", 0);
        setField(term492916, term492916.getClass(), "functions", null);
        setField(term492916, term492916.getClass(), "regexps", null);
        setField(term492916, term492916.getClass(), "itsVariables", null);
        setField(term492916, term492916.getClass(), "itsConst", null);
        setField(term492916, term492916.getClass(), "itsVariableNames", null);
        setIntField(term492916, term492916.getClass(), "varStart", 0);
        setField(term492916, term492916.getClass(), "compilerData", null);
        setIntField(term492916, term492916.getClass(), "type", 0);
        setField(term492917, term492917.getClass(), "functionName", null);
        setBooleanField(term492917, term492917.getClass(), "itsNeedsActivation", false);
        setIntField(term492917, term492917.getClass(), "itsFunctionType", 0);
        setBooleanField(term492917, term492917.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term492917, term492917.getClass(), "encodedSourceStart", 0);
        setIntField(term492917, term492917.getClass(), "encodedSourceEnd", 0);
        setField(term492917, term492917.getClass(), "sourceName", null);
        setIntField(term492917, term492917.getClass(), "baseLineno", 0);
        setIntField(term492917, term492917.getClass(), "endLineno", 0);
        setField(term492917, term492917.getClass(), "functions", null);
        setField(term492917, term492917.getClass(), "regexps", null);
        setField(term492917, term492917.getClass(), "itsVariables", null);
        setField(term492917, term492917.getClass(), "itsConst", null);
        setField(term492917, term492917.getClass(), "itsVariableNames", null);
        setIntField(term492917, term492917.getClass(), "varStart", 0);
        setField(term492917, term492917.getClass(), "compilerData", null);
        setIntField(term492917, term492917.getClass(), "type", 64);
        setField(term492917, term492917.getClass(), "next", null);
        setField(term492917, term492917.getClass(), "first", null);
        setField(term492917, term492917.getClass(), "last", null);
        setField(term492917, term492917.getClass(), "propListHead", null);
        setIntField(term492917, term492917.getClass(), "sourcePosition", 0);
        setField(term492917, term492917.getClass(), "jsType", null);
        setField(term492917, term492917.getClass(), "parent", null);
        setField(term492916, term492916.getClass(), "next", term492917);
        setField(term492916, term492916.getClass(), "first", null);
        setField(term492916, term492916.getClass(), "last", null);
        setField(term492916, term492916.getClass(), "propListHead", null);
        setIntField(term492916, term492916.getClass(), "sourcePosition", 0);
        setField(term492916, term492916.getClass(), "jsType", null);
        setField(term492916, term492916.getClass(), "parent", null);
        setField(term492915, term492915.getClass(), "first", term492916);
        setField(term492915, term492915.getClass(), "last", null);
        setField(term492915, term492915.getClass(), "propListHead", null);
        setIntField(term492915, term492915.getClass(), "sourcePosition", 0);
        setField(term492915, term492915.getClass(), "jsType", null);
        setIntField(term492918, term492918.getClass(), "type", 0);
        setField(term492918, term492918.getClass(), "next", null);
        setField(term492918, term492918.getClass(), "first", null);
        setField(term492918, term492918.getClass(), "last", null);
        setField(term492918, term492918.getClass(), "propListHead", null);
        setIntField(term492918, term492918.getClass(), "sourcePosition", 0);
        setField(term492918, term492918.getClass(), "jsType", null);
        setField(term492918, term492918.getClass(), "parent", null);
        setField(term492915, term492915.getClass(), "parent", term492918);
        term492806 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term492808 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term492818 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term492831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term492806, term492806.getClass(), "str", null);
        setIntField(term492806, term492806.getClass(), "type", 101);
        setField(term492806, term492806.getClass(), "next", null);
        setField(term492808, term492808.getClass(), "functionName", null);
        setBooleanField(term492808, term492808.getClass(), "itsNeedsActivation", false);
        setIntField(term492808, term492808.getClass(), "itsFunctionType", 0);
        setBooleanField(term492808, term492808.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term492808, term492808.getClass(), "encodedSourceStart", 0);
        setIntField(term492808, term492808.getClass(), "encodedSourceEnd", 0);
        setField(term492808, term492808.getClass(), "sourceName", null);
        setIntField(term492808, term492808.getClass(), "baseLineno", 0);
        setIntField(term492808, term492808.getClass(), "endLineno", 0);
        setField(term492808, term492808.getClass(), "functions", null);
        setField(term492808, term492808.getClass(), "regexps", null);
        setField(term492808, term492808.getClass(), "itsVariables", null);
        setField(term492808, term492808.getClass(), "itsConst", null);
        setField(term492808, term492808.getClass(), "itsVariableNames", null);
        setIntField(term492808, term492808.getClass(), "varStart", 0);
        setField(term492808, term492808.getClass(), "compilerData", null);
        setIntField(term492808, term492808.getClass(), "type", 0);
        setField(term492818, term492818.getClass(), "functionName", null);
        setBooleanField(term492818, term492818.getClass(), "itsNeedsActivation", false);
        setIntField(term492818, term492818.getClass(), "itsFunctionType", 0);
        setBooleanField(term492818, term492818.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term492818, term492818.getClass(), "encodedSourceStart", 0);
        setIntField(term492818, term492818.getClass(), "encodedSourceEnd", 0);
        setField(term492818, term492818.getClass(), "sourceName", null);
        setIntField(term492818, term492818.getClass(), "baseLineno", 0);
        setIntField(term492818, term492818.getClass(), "endLineno", 0);
        setField(term492818, term492818.getClass(), "functions", null);
        setField(term492818, term492818.getClass(), "regexps", null);
        setField(term492818, term492818.getClass(), "itsVariables", null);
        setField(term492818, term492818.getClass(), "itsConst", null);
        setField(term492818, term492818.getClass(), "itsVariableNames", null);
        setIntField(term492818, term492818.getClass(), "varStart", 0);
        setField(term492818, term492818.getClass(), "compilerData", null);
        setIntField(term492818, term492818.getClass(), "type", 64);
        setField(term492818, term492818.getClass(), "next", null);
        setField(term492818, term492818.getClass(), "first", null);
        setField(term492818, term492818.getClass(), "last", null);
        setField(term492818, term492818.getClass(), "propListHead", null);
        setIntField(term492818, term492818.getClass(), "sourcePosition", 0);
        setField(term492818, term492818.getClass(), "jsType", null);
        setField(term492818, term492818.getClass(), "parent", null);
        setField(term492808, term492808.getClass(), "next", term492818);
        setField(term492808, term492808.getClass(), "first", null);
        setField(term492808, term492808.getClass(), "last", null);
        setField(term492808, term492808.getClass(), "propListHead", null);
        setIntField(term492808, term492808.getClass(), "sourcePosition", 0);
        setField(term492808, term492808.getClass(), "jsType", null);
        setField(term492808, term492808.getClass(), "parent", null);
        setField(term492806, term492806.getClass(), "first", term492808);
        setField(term492806, term492806.getClass(), "last", null);
        setField(term492806, term492806.getClass(), "propListHead", null);
        setIntField(term492806, term492806.getClass(), "sourcePosition", 0);
        setField(term492806, term492806.getClass(), "jsType", null);
        setIntField(term492831, term492831.getClass(), "type", 0);
        setField(term492831, term492831.getClass(), "next", null);
        setField(term492831, term492831.getClass(), "first", null);
        setField(term492831, term492831.getClass(), "last", null);
        setField(term492831, term492831.getClass(), "propListHead", null);
        setIntField(term492831, term492831.getClass(), "sourcePosition", 0);
        setField(term492831, term492831.getClass(), "jsType", null);
        setField(term492831, term492831.getClass(), "parent", null);
        setField(term492806, term492806.getClass(), "parent", term492831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term492112;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term492020, args);
        assertTrue(recursiveEquals(term492020, term492914));
        assertTrue(recursiveEquals(term492112, term492915));
        assertTrue(recursiveEquals(retValue, term492806));
    }

};


