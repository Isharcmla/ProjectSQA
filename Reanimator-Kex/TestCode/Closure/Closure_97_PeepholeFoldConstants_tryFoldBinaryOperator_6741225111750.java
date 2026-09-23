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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term687250;
     Object term687342;
     Object term687916;
     Object term687917;
     Object term687873;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term687250 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term687342 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term687428 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term687498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term687428, term687428.getClass(), "next", term687498);
        setField(term687342, term687342.getClass(), "first", term687428);
        setIntField(term687342, term687342.getClass(), "type", 18);
        term687916 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term687916, term687916.getClass(), "currentTraversal", null);
        term687917 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term687918 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term687919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term687917, term687917.getClass(), "str", null);
        setIntField(term687917, term687917.getClass(), "type", 18);
        setField(term687917, term687917.getClass(), "next", null);
        setField(term687918, term687918.getClass(), "functionName", null);
        setBooleanField(term687918, term687918.getClass(), "itsNeedsActivation", false);
        setIntField(term687918, term687918.getClass(), "itsFunctionType", 0);
        setBooleanField(term687918, term687918.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term687918, term687918.getClass(), "encodedSourceStart", 0);
        setIntField(term687918, term687918.getClass(), "encodedSourceEnd", 0);
        setField(term687918, term687918.getClass(), "sourceName", null);
        setIntField(term687918, term687918.getClass(), "baseLineno", 0);
        setIntField(term687918, term687918.getClass(), "endLineno", 0);
        setField(term687918, term687918.getClass(), "functions", null);
        setField(term687918, term687918.getClass(), "regexps", null);
        setField(term687918, term687918.getClass(), "itsVariables", null);
        setField(term687918, term687918.getClass(), "itsConst", null);
        setField(term687918, term687918.getClass(), "itsVariableNames", null);
        setIntField(term687918, term687918.getClass(), "varStart", 0);
        setField(term687918, term687918.getClass(), "compilerData", null);
        setIntField(term687918, term687918.getClass(), "type", 0);
        setIntField(term687919, term687919.getClass(), "type", 0);
        setField(term687919, term687919.getClass(), "next", null);
        setField(term687919, term687919.getClass(), "first", null);
        setField(term687919, term687919.getClass(), "last", null);
        setField(term687919, term687919.getClass(), "propListHead", null);
        setIntField(term687919, term687919.getClass(), "sourcePosition", 0);
        setField(term687919, term687919.getClass(), "jsType", null);
        setField(term687919, term687919.getClass(), "parent", null);
        setField(term687918, term687918.getClass(), "next", term687919);
        setField(term687918, term687918.getClass(), "first", null);
        setField(term687918, term687918.getClass(), "last", null);
        setField(term687918, term687918.getClass(), "propListHead", null);
        setIntField(term687918, term687918.getClass(), "sourcePosition", 0);
        setField(term687918, term687918.getClass(), "jsType", null);
        setField(term687918, term687918.getClass(), "parent", null);
        setField(term687917, term687917.getClass(), "first", term687918);
        setField(term687917, term687917.getClass(), "last", null);
        setField(term687917, term687917.getClass(), "propListHead", null);
        setIntField(term687917, term687917.getClass(), "sourcePosition", 0);
        setField(term687917, term687917.getClass(), "jsType", null);
        setField(term687917, term687917.getClass(), "parent", null);
        term687873 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term687875 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term687885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term687873, term687873.getClass(), "str", null);
        setIntField(term687873, term687873.getClass(), "type", 18);
        setField(term687873, term687873.getClass(), "next", null);
        setField(term687875, term687875.getClass(), "functionName", null);
        setBooleanField(term687875, term687875.getClass(), "itsNeedsActivation", false);
        setIntField(term687875, term687875.getClass(), "itsFunctionType", 0);
        setBooleanField(term687875, term687875.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term687875, term687875.getClass(), "encodedSourceStart", 0);
        setIntField(term687875, term687875.getClass(), "encodedSourceEnd", 0);
        setField(term687875, term687875.getClass(), "sourceName", null);
        setIntField(term687875, term687875.getClass(), "baseLineno", 0);
        setIntField(term687875, term687875.getClass(), "endLineno", 0);
        setField(term687875, term687875.getClass(), "functions", null);
        setField(term687875, term687875.getClass(), "regexps", null);
        setField(term687875, term687875.getClass(), "itsVariables", null);
        setField(term687875, term687875.getClass(), "itsConst", null);
        setField(term687875, term687875.getClass(), "itsVariableNames", null);
        setIntField(term687875, term687875.getClass(), "varStart", 0);
        setField(term687875, term687875.getClass(), "compilerData", null);
        setIntField(term687875, term687875.getClass(), "type", 0);
        setIntField(term687885, term687885.getClass(), "type", 0);
        setField(term687885, term687885.getClass(), "next", null);
        setField(term687885, term687885.getClass(), "first", null);
        setField(term687885, term687885.getClass(), "last", null);
        setField(term687885, term687885.getClass(), "propListHead", null);
        setIntField(term687885, term687885.getClass(), "sourcePosition", 0);
        setField(term687885, term687885.getClass(), "jsType", null);
        setField(term687885, term687885.getClass(), "parent", null);
        setField(term687875, term687875.getClass(), "next", term687885);
        setField(term687875, term687875.getClass(), "first", null);
        setField(term687875, term687875.getClass(), "last", null);
        setField(term687875, term687875.getClass(), "propListHead", null);
        setIntField(term687875, term687875.getClass(), "sourcePosition", 0);
        setField(term687875, term687875.getClass(), "jsType", null);
        setField(term687875, term687875.getClass(), "parent", null);
        setField(term687873, term687873.getClass(), "first", term687875);
        setField(term687873, term687873.getClass(), "last", null);
        setField(term687873, term687873.getClass(), "propListHead", null);
        setIntField(term687873, term687873.getClass(), "sourcePosition", 0);
        setField(term687873, term687873.getClass(), "jsType", null);
        setField(term687873, term687873.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term687342;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term687250, args);
        assertTrue(recursiveEquals(term687250, term687916));
        assertTrue(recursiveEquals(term687342, term687917));
        assertTrue(recursiveEquals(retValue, term687873));
    }

};


