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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544867;
     Object term544953;
     Object term545314;
     Object term545315;
     Object term545197;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term544867 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term544953 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term545023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term545093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term545179 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term545093, term545093.getClass(), "first", term545179);
        setField(term545023, term545023.getClass(), "next", term545093);
        setField(term544953, term544953.getClass(), "first", term545023);
        setIntField(term544953, term544953.getClass(), "type", 86);
        term545314 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term545314, term545314.getClass(), "currentTraversal", null);
        term545315 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term545316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term545317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term545318 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term545315, term545315.getClass(), "functionName", null);
        setBooleanField(term545315, term545315.getClass(), "itsNeedsActivation", false);
        setIntField(term545315, term545315.getClass(), "itsFunctionType", 0);
        setBooleanField(term545315, term545315.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term545315, term545315.getClass(), "encodedSourceStart", 0);
        setIntField(term545315, term545315.getClass(), "encodedSourceEnd", 0);
        setField(term545315, term545315.getClass(), "sourceName", null);
        setIntField(term545315, term545315.getClass(), "baseLineno", 0);
        setIntField(term545315, term545315.getClass(), "endLineno", 0);
        setField(term545315, term545315.getClass(), "functions", null);
        setField(term545315, term545315.getClass(), "regexps", null);
        setField(term545315, term545315.getClass(), "itsVariables", null);
        setField(term545315, term545315.getClass(), "itsConst", null);
        setField(term545315, term545315.getClass(), "itsVariableNames", null);
        setIntField(term545315, term545315.getClass(), "varStart", 0);
        setField(term545315, term545315.getClass(), "compilerData", null);
        setIntField(term545315, term545315.getClass(), "type", 86);
        setField(term545315, term545315.getClass(), "next", null);
        setIntField(term545316, term545316.getClass(), "type", 0);
        setIntField(term545317, term545317.getClass(), "type", 0);
        setField(term545317, term545317.getClass(), "next", null);
        setField(term545318, term545318.getClass(), "functionName", null);
        setBooleanField(term545318, term545318.getClass(), "itsNeedsActivation", false);
        setIntField(term545318, term545318.getClass(), "itsFunctionType", 0);
        setBooleanField(term545318, term545318.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term545318, term545318.getClass(), "encodedSourceStart", 0);
        setIntField(term545318, term545318.getClass(), "encodedSourceEnd", 0);
        setField(term545318, term545318.getClass(), "sourceName", null);
        setIntField(term545318, term545318.getClass(), "baseLineno", 0);
        setIntField(term545318, term545318.getClass(), "endLineno", 0);
        setField(term545318, term545318.getClass(), "functions", null);
        setField(term545318, term545318.getClass(), "regexps", null);
        setField(term545318, term545318.getClass(), "itsVariables", null);
        setField(term545318, term545318.getClass(), "itsConst", null);
        setField(term545318, term545318.getClass(), "itsVariableNames", null);
        setIntField(term545318, term545318.getClass(), "varStart", 0);
        setField(term545318, term545318.getClass(), "compilerData", null);
        setIntField(term545318, term545318.getClass(), "type", 0);
        setField(term545318, term545318.getClass(), "next", null);
        setField(term545318, term545318.getClass(), "first", null);
        setField(term545318, term545318.getClass(), "last", null);
        setField(term545318, term545318.getClass(), "propListHead", null);
        setIntField(term545318, term545318.getClass(), "sourcePosition", 0);
        setField(term545318, term545318.getClass(), "jsType", null);
        setField(term545318, term545318.getClass(), "parent", null);
        setField(term545317, term545317.getClass(), "first", term545318);
        setField(term545317, term545317.getClass(), "last", null);
        setField(term545317, term545317.getClass(), "propListHead", null);
        setIntField(term545317, term545317.getClass(), "sourcePosition", 0);
        setField(term545317, term545317.getClass(), "jsType", null);
        setField(term545317, term545317.getClass(), "parent", null);
        setField(term545316, term545316.getClass(), "next", term545317);
        setField(term545316, term545316.getClass(), "first", null);
        setField(term545316, term545316.getClass(), "last", null);
        setField(term545316, term545316.getClass(), "propListHead", null);
        setIntField(term545316, term545316.getClass(), "sourcePosition", 0);
        setField(term545316, term545316.getClass(), "jsType", null);
        setField(term545316, term545316.getClass(), "parent", null);
        setField(term545315, term545315.getClass(), "first", term545316);
        setField(term545315, term545315.getClass(), "last", null);
        setField(term545315, term545315.getClass(), "propListHead", null);
        setIntField(term545315, term545315.getClass(), "sourcePosition", 0);
        setField(term545315, term545315.getClass(), "jsType", null);
        setField(term545315, term545315.getClass(), "parent", null);
        term545197 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term545207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term545209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term545211 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term545197, term545197.getClass(), "functionName", null);
        setBooleanField(term545197, term545197.getClass(), "itsNeedsActivation", false);
        setIntField(term545197, term545197.getClass(), "itsFunctionType", 0);
        setBooleanField(term545197, term545197.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term545197, term545197.getClass(), "encodedSourceStart", 0);
        setIntField(term545197, term545197.getClass(), "encodedSourceEnd", 0);
        setField(term545197, term545197.getClass(), "sourceName", null);
        setIntField(term545197, term545197.getClass(), "baseLineno", 0);
        setIntField(term545197, term545197.getClass(), "endLineno", 0);
        setField(term545197, term545197.getClass(), "functions", null);
        setField(term545197, term545197.getClass(), "regexps", null);
        setField(term545197, term545197.getClass(), "itsVariables", null);
        setField(term545197, term545197.getClass(), "itsConst", null);
        setField(term545197, term545197.getClass(), "itsVariableNames", null);
        setIntField(term545197, term545197.getClass(), "varStart", 0);
        setField(term545197, term545197.getClass(), "compilerData", null);
        setIntField(term545197, term545197.getClass(), "type", 86);
        setField(term545197, term545197.getClass(), "next", null);
        setIntField(term545207, term545207.getClass(), "type", 0);
        setIntField(term545209, term545209.getClass(), "type", 0);
        setField(term545209, term545209.getClass(), "next", null);
        setField(term545211, term545211.getClass(), "functionName", null);
        setBooleanField(term545211, term545211.getClass(), "itsNeedsActivation", false);
        setIntField(term545211, term545211.getClass(), "itsFunctionType", 0);
        setBooleanField(term545211, term545211.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term545211, term545211.getClass(), "encodedSourceStart", 0);
        setIntField(term545211, term545211.getClass(), "encodedSourceEnd", 0);
        setField(term545211, term545211.getClass(), "sourceName", null);
        setIntField(term545211, term545211.getClass(), "baseLineno", 0);
        setIntField(term545211, term545211.getClass(), "endLineno", 0);
        setField(term545211, term545211.getClass(), "functions", null);
        setField(term545211, term545211.getClass(), "regexps", null);
        setField(term545211, term545211.getClass(), "itsVariables", null);
        setField(term545211, term545211.getClass(), "itsConst", null);
        setField(term545211, term545211.getClass(), "itsVariableNames", null);
        setIntField(term545211, term545211.getClass(), "varStart", 0);
        setField(term545211, term545211.getClass(), "compilerData", null);
        setIntField(term545211, term545211.getClass(), "type", 0);
        setField(term545211, term545211.getClass(), "next", null);
        setField(term545211, term545211.getClass(), "first", null);
        setField(term545211, term545211.getClass(), "last", null);
        setField(term545211, term545211.getClass(), "propListHead", null);
        setIntField(term545211, term545211.getClass(), "sourcePosition", 0);
        setField(term545211, term545211.getClass(), "jsType", null);
        setField(term545211, term545211.getClass(), "parent", null);
        setField(term545209, term545209.getClass(), "first", term545211);
        setField(term545209, term545209.getClass(), "last", null);
        setField(term545209, term545209.getClass(), "propListHead", null);
        setIntField(term545209, term545209.getClass(), "sourcePosition", 0);
        setField(term545209, term545209.getClass(), "jsType", null);
        setField(term545209, term545209.getClass(), "parent", null);
        setField(term545207, term545207.getClass(), "next", term545209);
        setField(term545207, term545207.getClass(), "first", null);
        setField(term545207, term545207.getClass(), "last", null);
        setField(term545207, term545207.getClass(), "propListHead", null);
        setIntField(term545207, term545207.getClass(), "sourcePosition", 0);
        setField(term545207, term545207.getClass(), "jsType", null);
        setField(term545207, term545207.getClass(), "parent", null);
        setField(term545197, term545197.getClass(), "first", term545207);
        setField(term545197, term545197.getClass(), "last", null);
        setField(term545197, term545197.getClass(), "propListHead", null);
        setIntField(term545197, term545197.getClass(), "sourcePosition", 0);
        setField(term545197, term545197.getClass(), "jsType", null);
        setField(term545197, term545197.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term544953;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term544867, args);
        assertTrue(recursiveEquals(term544867, term545314));
        assertTrue(recursiveEquals(term544953, term545315));
        assertTrue(recursiveEquals(retValue, term545197));
    }

};


