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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429904;
     Object term429990;
     Object term430279;
     Object term430280;
     Object term430218;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term429904 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term429990 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term430076 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term430168 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term430076, term430076.getClass(), "next", term430168);
        setIntField(term430076, term430076.getClass(), "type", 39);
        setField(term429990, term429990.getClass(), "first", term430076);
        setIntField(term429990, term429990.getClass(), "type", 23);
        term430279 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term430279, term430279.getClass(), "currentTraversal", null);
        term430280 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term430281 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term430282 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term430280, term430280.getClass(), "functionName", null);
        setBooleanField(term430280, term430280.getClass(), "itsNeedsActivation", false);
        setIntField(term430280, term430280.getClass(), "itsFunctionType", 0);
        setBooleanField(term430280, term430280.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term430280, term430280.getClass(), "encodedSourceStart", 0);
        setIntField(term430280, term430280.getClass(), "encodedSourceEnd", 0);
        setField(term430280, term430280.getClass(), "sourceName", null);
        setIntField(term430280, term430280.getClass(), "baseLineno", 0);
        setIntField(term430280, term430280.getClass(), "endLineno", 0);
        setField(term430280, term430280.getClass(), "functions", null);
        setField(term430280, term430280.getClass(), "regexps", null);
        setField(term430280, term430280.getClass(), "itsVariables", null);
        setField(term430280, term430280.getClass(), "itsConst", null);
        setField(term430280, term430280.getClass(), "itsVariableNames", null);
        setIntField(term430280, term430280.getClass(), "varStart", 0);
        setField(term430280, term430280.getClass(), "compilerData", null);
        setIntField(term430280, term430280.getClass(), "type", 23);
        setField(term430280, term430280.getClass(), "next", null);
        setField(term430281, term430281.getClass(), "functionName", null);
        setBooleanField(term430281, term430281.getClass(), "itsNeedsActivation", false);
        setIntField(term430281, term430281.getClass(), "itsFunctionType", 0);
        setBooleanField(term430281, term430281.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term430281, term430281.getClass(), "encodedSourceStart", 0);
        setIntField(term430281, term430281.getClass(), "encodedSourceEnd", 0);
        setField(term430281, term430281.getClass(), "sourceName", null);
        setIntField(term430281, term430281.getClass(), "baseLineno", 0);
        setIntField(term430281, term430281.getClass(), "endLineno", 0);
        setField(term430281, term430281.getClass(), "functions", null);
        setField(term430281, term430281.getClass(), "regexps", null);
        setField(term430281, term430281.getClass(), "itsVariables", null);
        setField(term430281, term430281.getClass(), "itsConst", null);
        setField(term430281, term430281.getClass(), "itsVariableNames", null);
        setIntField(term430281, term430281.getClass(), "varStart", 0);
        setField(term430281, term430281.getClass(), "compilerData", null);
        setIntField(term430281, term430281.getClass(), "type", 39);
        setField(term430282, term430282.getClass(), "str", null);
        setIntField(term430282, term430282.getClass(), "type", 0);
        setField(term430282, term430282.getClass(), "next", null);
        setField(term430282, term430282.getClass(), "first", null);
        setField(term430282, term430282.getClass(), "last", null);
        setField(term430282, term430282.getClass(), "propListHead", null);
        setIntField(term430282, term430282.getClass(), "sourcePosition", 0);
        setField(term430282, term430282.getClass(), "jsType", null);
        setField(term430282, term430282.getClass(), "parent", null);
        setField(term430281, term430281.getClass(), "next", term430282);
        setField(term430281, term430281.getClass(), "first", null);
        setField(term430281, term430281.getClass(), "last", null);
        setField(term430281, term430281.getClass(), "propListHead", null);
        setIntField(term430281, term430281.getClass(), "sourcePosition", 0);
        setField(term430281, term430281.getClass(), "jsType", null);
        setField(term430281, term430281.getClass(), "parent", null);
        setField(term430280, term430280.getClass(), "first", term430281);
        setField(term430280, term430280.getClass(), "last", null);
        setField(term430280, term430280.getClass(), "propListHead", null);
        setIntField(term430280, term430280.getClass(), "sourcePosition", 0);
        setField(term430280, term430280.getClass(), "jsType", null);
        setField(term430280, term430280.getClass(), "parent", null);
        term430218 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term430228 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term430238 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term430218, term430218.getClass(), "functionName", null);
        setBooleanField(term430218, term430218.getClass(), "itsNeedsActivation", false);
        setIntField(term430218, term430218.getClass(), "itsFunctionType", 0);
        setBooleanField(term430218, term430218.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term430218, term430218.getClass(), "encodedSourceStart", 0);
        setIntField(term430218, term430218.getClass(), "encodedSourceEnd", 0);
        setField(term430218, term430218.getClass(), "sourceName", null);
        setIntField(term430218, term430218.getClass(), "baseLineno", 0);
        setIntField(term430218, term430218.getClass(), "endLineno", 0);
        setField(term430218, term430218.getClass(), "functions", null);
        setField(term430218, term430218.getClass(), "regexps", null);
        setField(term430218, term430218.getClass(), "itsVariables", null);
        setField(term430218, term430218.getClass(), "itsConst", null);
        setField(term430218, term430218.getClass(), "itsVariableNames", null);
        setIntField(term430218, term430218.getClass(), "varStart", 0);
        setField(term430218, term430218.getClass(), "compilerData", null);
        setIntField(term430218, term430218.getClass(), "type", 23);
        setField(term430218, term430218.getClass(), "next", null);
        setField(term430228, term430228.getClass(), "functionName", null);
        setBooleanField(term430228, term430228.getClass(), "itsNeedsActivation", false);
        setIntField(term430228, term430228.getClass(), "itsFunctionType", 0);
        setBooleanField(term430228, term430228.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term430228, term430228.getClass(), "encodedSourceStart", 0);
        setIntField(term430228, term430228.getClass(), "encodedSourceEnd", 0);
        setField(term430228, term430228.getClass(), "sourceName", null);
        setIntField(term430228, term430228.getClass(), "baseLineno", 0);
        setIntField(term430228, term430228.getClass(), "endLineno", 0);
        setField(term430228, term430228.getClass(), "functions", null);
        setField(term430228, term430228.getClass(), "regexps", null);
        setField(term430228, term430228.getClass(), "itsVariables", null);
        setField(term430228, term430228.getClass(), "itsConst", null);
        setField(term430228, term430228.getClass(), "itsVariableNames", null);
        setIntField(term430228, term430228.getClass(), "varStart", 0);
        setField(term430228, term430228.getClass(), "compilerData", null);
        setIntField(term430228, term430228.getClass(), "type", 39);
        setField(term430238, term430238.getClass(), "str", null);
        setIntField(term430238, term430238.getClass(), "type", 0);
        setField(term430238, term430238.getClass(), "next", null);
        setField(term430238, term430238.getClass(), "first", null);
        setField(term430238, term430238.getClass(), "last", null);
        setField(term430238, term430238.getClass(), "propListHead", null);
        setIntField(term430238, term430238.getClass(), "sourcePosition", 0);
        setField(term430238, term430238.getClass(), "jsType", null);
        setField(term430238, term430238.getClass(), "parent", null);
        setField(term430228, term430228.getClass(), "next", term430238);
        setField(term430228, term430228.getClass(), "first", null);
        setField(term430228, term430228.getClass(), "last", null);
        setField(term430228, term430228.getClass(), "propListHead", null);
        setIntField(term430228, term430228.getClass(), "sourcePosition", 0);
        setField(term430228, term430228.getClass(), "jsType", null);
        setField(term430228, term430228.getClass(), "parent", null);
        setField(term430218, term430218.getClass(), "first", term430228);
        setField(term430218, term430218.getClass(), "last", null);
        setField(term430218, term430218.getClass(), "propListHead", null);
        setIntField(term430218, term430218.getClass(), "sourcePosition", 0);
        setField(term430218, term430218.getClass(), "jsType", null);
        setField(term430218, term430218.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term429990;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term429904, args);
        assertTrue(recursiveEquals(term429904, term430279));
        assertTrue(recursiveEquals(term429990, term430280));
        assertTrue(recursiveEquals(retValue, term430218));
    }

};


