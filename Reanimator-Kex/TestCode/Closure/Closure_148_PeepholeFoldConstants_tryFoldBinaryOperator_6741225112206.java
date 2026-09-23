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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604012;
     Object term604098;
     Object term604488;
     Object term604489;
     Object term604394;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term604012 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term604098 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term604184 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term604276 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term604184, term604184.getClass(), "next", term604276);
        setIntField(term604184, term604184.getClass(), "type", 0);
        setField(term604098, term604098.getClass(), "first", term604184);
        setIntField(term604098, term604098.getClass(), "type", 100);
        setField(term604098, term604098.getClass(), "parent", null);
        term604488 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term604488, term604488.getClass(), "currentTraversal", null);
        term604489 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term604490 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term604491 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term604489, term604489.getClass(), "functionName", null);
        setBooleanField(term604489, term604489.getClass(), "itsNeedsActivation", false);
        setIntField(term604489, term604489.getClass(), "itsFunctionType", 0);
        setBooleanField(term604489, term604489.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term604489, term604489.getClass(), "encodedSourceStart", 0);
        setIntField(term604489, term604489.getClass(), "encodedSourceEnd", 0);
        setField(term604489, term604489.getClass(), "sourceName", null);
        setIntField(term604489, term604489.getClass(), "baseLineno", 0);
        setIntField(term604489, term604489.getClass(), "endLineno", 0);
        setField(term604489, term604489.getClass(), "functions", null);
        setField(term604489, term604489.getClass(), "regexps", null);
        setField(term604489, term604489.getClass(), "itsVariables", null);
        setField(term604489, term604489.getClass(), "itsConst", null);
        setField(term604489, term604489.getClass(), "itsVariableNames", null);
        setIntField(term604489, term604489.getClass(), "varStart", 0);
        setField(term604489, term604489.getClass(), "compilerData", null);
        setIntField(term604489, term604489.getClass(), "type", 100);
        setField(term604489, term604489.getClass(), "next", null);
        setField(term604490, term604490.getClass(), "functionName", null);
        setBooleanField(term604490, term604490.getClass(), "itsNeedsActivation", false);
        setIntField(term604490, term604490.getClass(), "itsFunctionType", 0);
        setBooleanField(term604490, term604490.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term604490, term604490.getClass(), "encodedSourceStart", 0);
        setIntField(term604490, term604490.getClass(), "encodedSourceEnd", 0);
        setField(term604490, term604490.getClass(), "sourceName", null);
        setIntField(term604490, term604490.getClass(), "baseLineno", 0);
        setIntField(term604490, term604490.getClass(), "endLineno", 0);
        setField(term604490, term604490.getClass(), "functions", null);
        setField(term604490, term604490.getClass(), "regexps", null);
        setField(term604490, term604490.getClass(), "itsVariables", null);
        setField(term604490, term604490.getClass(), "itsConst", null);
        setField(term604490, term604490.getClass(), "itsVariableNames", null);
        setIntField(term604490, term604490.getClass(), "varStart", 0);
        setField(term604490, term604490.getClass(), "compilerData", null);
        setIntField(term604490, term604490.getClass(), "type", 0);
        setDoubleField(term604491, term604491.getClass(), "number", 0.0);
        setIntField(term604491, term604491.getClass(), "type", 0);
        setField(term604491, term604491.getClass(), "next", null);
        setField(term604491, term604491.getClass(), "first", null);
        setField(term604491, term604491.getClass(), "last", null);
        setField(term604491, term604491.getClass(), "propListHead", null);
        setIntField(term604491, term604491.getClass(), "sourcePosition", 0);
        setField(term604491, term604491.getClass(), "jsType", null);
        setField(term604491, term604491.getClass(), "parent", null);
        setField(term604490, term604490.getClass(), "next", term604491);
        setField(term604490, term604490.getClass(), "first", null);
        setField(term604490, term604490.getClass(), "last", null);
        setField(term604490, term604490.getClass(), "propListHead", null);
        setIntField(term604490, term604490.getClass(), "sourcePosition", 0);
        setField(term604490, term604490.getClass(), "jsType", null);
        setField(term604490, term604490.getClass(), "parent", null);
        setField(term604489, term604489.getClass(), "first", term604490);
        setField(term604489, term604489.getClass(), "last", null);
        setField(term604489, term604489.getClass(), "propListHead", null);
        setIntField(term604489, term604489.getClass(), "sourcePosition", 0);
        setField(term604489, term604489.getClass(), "jsType", null);
        setField(term604489, term604489.getClass(), "parent", null);
        term604394 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term604404 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term604414 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term604394, term604394.getClass(), "functionName", null);
        setBooleanField(term604394, term604394.getClass(), "itsNeedsActivation", false);
        setIntField(term604394, term604394.getClass(), "itsFunctionType", 0);
        setBooleanField(term604394, term604394.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term604394, term604394.getClass(), "encodedSourceStart", 0);
        setIntField(term604394, term604394.getClass(), "encodedSourceEnd", 0);
        setField(term604394, term604394.getClass(), "sourceName", null);
        setIntField(term604394, term604394.getClass(), "baseLineno", 0);
        setIntField(term604394, term604394.getClass(), "endLineno", 0);
        setField(term604394, term604394.getClass(), "functions", null);
        setField(term604394, term604394.getClass(), "regexps", null);
        setField(term604394, term604394.getClass(), "itsVariables", null);
        setField(term604394, term604394.getClass(), "itsConst", null);
        setField(term604394, term604394.getClass(), "itsVariableNames", null);
        setIntField(term604394, term604394.getClass(), "varStart", 0);
        setField(term604394, term604394.getClass(), "compilerData", null);
        setIntField(term604394, term604394.getClass(), "type", 100);
        setField(term604394, term604394.getClass(), "next", null);
        setField(term604404, term604404.getClass(), "functionName", null);
        setBooleanField(term604404, term604404.getClass(), "itsNeedsActivation", false);
        setIntField(term604404, term604404.getClass(), "itsFunctionType", 0);
        setBooleanField(term604404, term604404.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term604404, term604404.getClass(), "encodedSourceStart", 0);
        setIntField(term604404, term604404.getClass(), "encodedSourceEnd", 0);
        setField(term604404, term604404.getClass(), "sourceName", null);
        setIntField(term604404, term604404.getClass(), "baseLineno", 0);
        setIntField(term604404, term604404.getClass(), "endLineno", 0);
        setField(term604404, term604404.getClass(), "functions", null);
        setField(term604404, term604404.getClass(), "regexps", null);
        setField(term604404, term604404.getClass(), "itsVariables", null);
        setField(term604404, term604404.getClass(), "itsConst", null);
        setField(term604404, term604404.getClass(), "itsVariableNames", null);
        setIntField(term604404, term604404.getClass(), "varStart", 0);
        setField(term604404, term604404.getClass(), "compilerData", null);
        setIntField(term604404, term604404.getClass(), "type", 0);
        setDoubleField(term604414, term604414.getClass(), "number", 0.0);
        setIntField(term604414, term604414.getClass(), "type", 0);
        setField(term604414, term604414.getClass(), "next", null);
        setField(term604414, term604414.getClass(), "first", null);
        setField(term604414, term604414.getClass(), "last", null);
        setField(term604414, term604414.getClass(), "propListHead", null);
        setIntField(term604414, term604414.getClass(), "sourcePosition", 0);
        setField(term604414, term604414.getClass(), "jsType", null);
        setField(term604414, term604414.getClass(), "parent", null);
        setField(term604404, term604404.getClass(), "next", term604414);
        setField(term604404, term604404.getClass(), "first", null);
        setField(term604404, term604404.getClass(), "last", null);
        setField(term604404, term604404.getClass(), "propListHead", null);
        setIntField(term604404, term604404.getClass(), "sourcePosition", 0);
        setField(term604404, term604404.getClass(), "jsType", null);
        setField(term604404, term604404.getClass(), "parent", null);
        setField(term604394, term604394.getClass(), "first", term604404);
        setField(term604394, term604394.getClass(), "last", null);
        setField(term604394, term604394.getClass(), "propListHead", null);
        setIntField(term604394, term604394.getClass(), "sourcePosition", 0);
        setField(term604394, term604394.getClass(), "jsType", null);
        setField(term604394, term604394.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term604098;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term604012, args);
        assertTrue(recursiveEquals(term604012, term604488));
        assertTrue(recursiveEquals(term604098, term604489));
        assertTrue(recursiveEquals(retValue, term604394));
    }

};


