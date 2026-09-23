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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term709176;
     Object term709262;
     Object term709492;
     Object term709493;
     Object term709433;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term709176 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term709262 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term709348 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term709418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term709348, term709348.getClass(), "next", term709418);
        setField(term709262, term709262.getClass(), "first", term709348);
        setIntField(term709262, term709262.getClass(), "type", 19);
        term709492 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term709492, term709492.getClass(), "currentTraversal", null);
        term709493 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term709494 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term709495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term709493, term709493.getClass(), "functionName", null);
        setBooleanField(term709493, term709493.getClass(), "itsNeedsActivation", false);
        setIntField(term709493, term709493.getClass(), "itsFunctionType", 0);
        setBooleanField(term709493, term709493.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term709493, term709493.getClass(), "encodedSourceStart", 0);
        setIntField(term709493, term709493.getClass(), "encodedSourceEnd", 0);
        setField(term709493, term709493.getClass(), "sourceName", null);
        setIntField(term709493, term709493.getClass(), "baseLineno", 0);
        setIntField(term709493, term709493.getClass(), "endLineno", 0);
        setField(term709493, term709493.getClass(), "functions", null);
        setField(term709493, term709493.getClass(), "regexps", null);
        setField(term709493, term709493.getClass(), "itsVariables", null);
        setField(term709493, term709493.getClass(), "itsConst", null);
        setField(term709493, term709493.getClass(), "itsVariableNames", null);
        setIntField(term709493, term709493.getClass(), "varStart", 0);
        setField(term709493, term709493.getClass(), "compilerData", null);
        setIntField(term709493, term709493.getClass(), "type", 19);
        setField(term709493, term709493.getClass(), "next", null);
        setField(term709494, term709494.getClass(), "functionName", null);
        setBooleanField(term709494, term709494.getClass(), "itsNeedsActivation", false);
        setIntField(term709494, term709494.getClass(), "itsFunctionType", 0);
        setBooleanField(term709494, term709494.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term709494, term709494.getClass(), "encodedSourceStart", 0);
        setIntField(term709494, term709494.getClass(), "encodedSourceEnd", 0);
        setField(term709494, term709494.getClass(), "sourceName", null);
        setIntField(term709494, term709494.getClass(), "baseLineno", 0);
        setIntField(term709494, term709494.getClass(), "endLineno", 0);
        setField(term709494, term709494.getClass(), "functions", null);
        setField(term709494, term709494.getClass(), "regexps", null);
        setField(term709494, term709494.getClass(), "itsVariables", null);
        setField(term709494, term709494.getClass(), "itsConst", null);
        setField(term709494, term709494.getClass(), "itsVariableNames", null);
        setIntField(term709494, term709494.getClass(), "varStart", 0);
        setField(term709494, term709494.getClass(), "compilerData", null);
        setIntField(term709494, term709494.getClass(), "type", 0);
        setIntField(term709495, term709495.getClass(), "type", 0);
        setField(term709495, term709495.getClass(), "next", null);
        setField(term709495, term709495.getClass(), "first", null);
        setField(term709495, term709495.getClass(), "last", null);
        setField(term709495, term709495.getClass(), "propListHead", null);
        setIntField(term709495, term709495.getClass(), "sourcePosition", 0);
        setField(term709495, term709495.getClass(), "jsType", null);
        setField(term709495, term709495.getClass(), "parent", null);
        setField(term709494, term709494.getClass(), "next", term709495);
        setField(term709494, term709494.getClass(), "first", null);
        setField(term709494, term709494.getClass(), "last", null);
        setField(term709494, term709494.getClass(), "propListHead", null);
        setIntField(term709494, term709494.getClass(), "sourcePosition", 0);
        setField(term709494, term709494.getClass(), "jsType", null);
        setField(term709494, term709494.getClass(), "parent", null);
        setField(term709493, term709493.getClass(), "first", term709494);
        setField(term709493, term709493.getClass(), "last", null);
        setField(term709493, term709493.getClass(), "propListHead", null);
        setIntField(term709493, term709493.getClass(), "sourcePosition", 0);
        setField(term709493, term709493.getClass(), "jsType", null);
        setField(term709493, term709493.getClass(), "parent", null);
        term709433 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term709443 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term709453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term709433, term709433.getClass(), "functionName", null);
        setBooleanField(term709433, term709433.getClass(), "itsNeedsActivation", false);
        setIntField(term709433, term709433.getClass(), "itsFunctionType", 0);
        setBooleanField(term709433, term709433.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term709433, term709433.getClass(), "encodedSourceStart", 0);
        setIntField(term709433, term709433.getClass(), "encodedSourceEnd", 0);
        setField(term709433, term709433.getClass(), "sourceName", null);
        setIntField(term709433, term709433.getClass(), "baseLineno", 0);
        setIntField(term709433, term709433.getClass(), "endLineno", 0);
        setField(term709433, term709433.getClass(), "functions", null);
        setField(term709433, term709433.getClass(), "regexps", null);
        setField(term709433, term709433.getClass(), "itsVariables", null);
        setField(term709433, term709433.getClass(), "itsConst", null);
        setField(term709433, term709433.getClass(), "itsVariableNames", null);
        setIntField(term709433, term709433.getClass(), "varStart", 0);
        setField(term709433, term709433.getClass(), "compilerData", null);
        setIntField(term709433, term709433.getClass(), "type", 19);
        setField(term709433, term709433.getClass(), "next", null);
        setField(term709443, term709443.getClass(), "functionName", null);
        setBooleanField(term709443, term709443.getClass(), "itsNeedsActivation", false);
        setIntField(term709443, term709443.getClass(), "itsFunctionType", 0);
        setBooleanField(term709443, term709443.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term709443, term709443.getClass(), "encodedSourceStart", 0);
        setIntField(term709443, term709443.getClass(), "encodedSourceEnd", 0);
        setField(term709443, term709443.getClass(), "sourceName", null);
        setIntField(term709443, term709443.getClass(), "baseLineno", 0);
        setIntField(term709443, term709443.getClass(), "endLineno", 0);
        setField(term709443, term709443.getClass(), "functions", null);
        setField(term709443, term709443.getClass(), "regexps", null);
        setField(term709443, term709443.getClass(), "itsVariables", null);
        setField(term709443, term709443.getClass(), "itsConst", null);
        setField(term709443, term709443.getClass(), "itsVariableNames", null);
        setIntField(term709443, term709443.getClass(), "varStart", 0);
        setField(term709443, term709443.getClass(), "compilerData", null);
        setIntField(term709443, term709443.getClass(), "type", 0);
        setIntField(term709453, term709453.getClass(), "type", 0);
        setField(term709453, term709453.getClass(), "next", null);
        setField(term709453, term709453.getClass(), "first", null);
        setField(term709453, term709453.getClass(), "last", null);
        setField(term709453, term709453.getClass(), "propListHead", null);
        setIntField(term709453, term709453.getClass(), "sourcePosition", 0);
        setField(term709453, term709453.getClass(), "jsType", null);
        setField(term709453, term709453.getClass(), "parent", null);
        setField(term709443, term709443.getClass(), "next", term709453);
        setField(term709443, term709443.getClass(), "first", null);
        setField(term709443, term709443.getClass(), "last", null);
        setField(term709443, term709443.getClass(), "propListHead", null);
        setIntField(term709443, term709443.getClass(), "sourcePosition", 0);
        setField(term709443, term709443.getClass(), "jsType", null);
        setField(term709443, term709443.getClass(), "parent", null);
        setField(term709433, term709433.getClass(), "first", term709443);
        setField(term709433, term709433.getClass(), "last", null);
        setField(term709433, term709433.getClass(), "propListHead", null);
        setIntField(term709433, term709433.getClass(), "sourcePosition", 0);
        setField(term709433, term709433.getClass(), "jsType", null);
        setField(term709433, term709433.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term709262;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term709176, args);
        assertTrue(recursiveEquals(term709176, term709492));
        assertTrue(recursiveEquals(term709262, term709493));
        assertTrue(recursiveEquals(retValue, term709433));
    }

};


