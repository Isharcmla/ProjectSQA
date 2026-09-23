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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term518870;
     Object term518962;
     Object term519348;
     Object term519349;
     Object term519231;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term518870 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term518962 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term519048 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term519118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term519204 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term519118, term519118.getClass(), "type", 47);
        setField(term519048, term519048.getClass(), "next", term519118);
        setIntField(term519048, term519048.getClass(), "type", 0);
        setField(term518962, term518962.getClass(), "first", term519048);
        setIntField(term518962, term518962.getClass(), "type", 101);
        setIntField(term519204, term519204.getClass(), "type", 98);
        setField(term518962, term518962.getClass(), "parent", term519204);
        term519348 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term519348, term519348.getClass(), "currentTraversal", null);
        term519349 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term519350 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term519351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term519352 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term519349, term519349.getClass(), "str", null);
        setIntField(term519349, term519349.getClass(), "type", 101);
        setField(term519349, term519349.getClass(), "next", null);
        setField(term519350, term519350.getClass(), "functionName", null);
        setBooleanField(term519350, term519350.getClass(), "itsNeedsActivation", false);
        setIntField(term519350, term519350.getClass(), "itsFunctionType", 0);
        setBooleanField(term519350, term519350.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term519350, term519350.getClass(), "encodedSourceStart", 0);
        setIntField(term519350, term519350.getClass(), "encodedSourceEnd", 0);
        setField(term519350, term519350.getClass(), "sourceName", null);
        setIntField(term519350, term519350.getClass(), "baseLineno", 0);
        setIntField(term519350, term519350.getClass(), "endLineno", 0);
        setField(term519350, term519350.getClass(), "functions", null);
        setField(term519350, term519350.getClass(), "regexps", null);
        setField(term519350, term519350.getClass(), "itsVariables", null);
        setField(term519350, term519350.getClass(), "itsConst", null);
        setField(term519350, term519350.getClass(), "itsVariableNames", null);
        setIntField(term519350, term519350.getClass(), "varStart", 0);
        setField(term519350, term519350.getClass(), "compilerData", null);
        setIntField(term519350, term519350.getClass(), "type", 0);
        setIntField(term519351, term519351.getClass(), "type", 47);
        setField(term519351, term519351.getClass(), "next", null);
        setField(term519351, term519351.getClass(), "first", null);
        setField(term519351, term519351.getClass(), "last", null);
        setField(term519351, term519351.getClass(), "propListHead", null);
        setIntField(term519351, term519351.getClass(), "sourcePosition", 0);
        setField(term519351, term519351.getClass(), "jsType", null);
        setField(term519351, term519351.getClass(), "parent", null);
        setField(term519350, term519350.getClass(), "next", term519351);
        setField(term519350, term519350.getClass(), "first", null);
        setField(term519350, term519350.getClass(), "last", null);
        setField(term519350, term519350.getClass(), "propListHead", null);
        setIntField(term519350, term519350.getClass(), "sourcePosition", 0);
        setField(term519350, term519350.getClass(), "jsType", null);
        setField(term519350, term519350.getClass(), "parent", null);
        setField(term519349, term519349.getClass(), "first", term519350);
        setField(term519349, term519349.getClass(), "last", null);
        setField(term519349, term519349.getClass(), "propListHead", null);
        setIntField(term519349, term519349.getClass(), "sourcePosition", 0);
        setField(term519349, term519349.getClass(), "jsType", null);
        setField(term519352, term519352.getClass(), "functionName", null);
        setBooleanField(term519352, term519352.getClass(), "itsNeedsActivation", false);
        setIntField(term519352, term519352.getClass(), "itsFunctionType", 0);
        setBooleanField(term519352, term519352.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term519352, term519352.getClass(), "encodedSourceStart", 0);
        setIntField(term519352, term519352.getClass(), "encodedSourceEnd", 0);
        setField(term519352, term519352.getClass(), "sourceName", null);
        setIntField(term519352, term519352.getClass(), "baseLineno", 0);
        setIntField(term519352, term519352.getClass(), "endLineno", 0);
        setField(term519352, term519352.getClass(), "functions", null);
        setField(term519352, term519352.getClass(), "regexps", null);
        setField(term519352, term519352.getClass(), "itsVariables", null);
        setField(term519352, term519352.getClass(), "itsConst", null);
        setField(term519352, term519352.getClass(), "itsVariableNames", null);
        setIntField(term519352, term519352.getClass(), "varStart", 0);
        setField(term519352, term519352.getClass(), "compilerData", null);
        setIntField(term519352, term519352.getClass(), "type", 98);
        setField(term519352, term519352.getClass(), "next", null);
        setField(term519352, term519352.getClass(), "first", null);
        setField(term519352, term519352.getClass(), "last", null);
        setField(term519352, term519352.getClass(), "propListHead", null);
        setIntField(term519352, term519352.getClass(), "sourcePosition", 0);
        setField(term519352, term519352.getClass(), "jsType", null);
        setField(term519352, term519352.getClass(), "parent", null);
        setField(term519349, term519349.getClass(), "parent", term519352);
        term519231 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term519233 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term519243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term519248 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term519231, term519231.getClass(), "str", null);
        setIntField(term519231, term519231.getClass(), "type", 101);
        setField(term519231, term519231.getClass(), "next", null);
        setField(term519233, term519233.getClass(), "functionName", null);
        setBooleanField(term519233, term519233.getClass(), "itsNeedsActivation", false);
        setIntField(term519233, term519233.getClass(), "itsFunctionType", 0);
        setBooleanField(term519233, term519233.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term519233, term519233.getClass(), "encodedSourceStart", 0);
        setIntField(term519233, term519233.getClass(), "encodedSourceEnd", 0);
        setField(term519233, term519233.getClass(), "sourceName", null);
        setIntField(term519233, term519233.getClass(), "baseLineno", 0);
        setIntField(term519233, term519233.getClass(), "endLineno", 0);
        setField(term519233, term519233.getClass(), "functions", null);
        setField(term519233, term519233.getClass(), "regexps", null);
        setField(term519233, term519233.getClass(), "itsVariables", null);
        setField(term519233, term519233.getClass(), "itsConst", null);
        setField(term519233, term519233.getClass(), "itsVariableNames", null);
        setIntField(term519233, term519233.getClass(), "varStart", 0);
        setField(term519233, term519233.getClass(), "compilerData", null);
        setIntField(term519233, term519233.getClass(), "type", 0);
        setIntField(term519243, term519243.getClass(), "type", 47);
        setField(term519243, term519243.getClass(), "next", null);
        setField(term519243, term519243.getClass(), "first", null);
        setField(term519243, term519243.getClass(), "last", null);
        setField(term519243, term519243.getClass(), "propListHead", null);
        setIntField(term519243, term519243.getClass(), "sourcePosition", 0);
        setField(term519243, term519243.getClass(), "jsType", null);
        setField(term519243, term519243.getClass(), "parent", null);
        setField(term519233, term519233.getClass(), "next", term519243);
        setField(term519233, term519233.getClass(), "first", null);
        setField(term519233, term519233.getClass(), "last", null);
        setField(term519233, term519233.getClass(), "propListHead", null);
        setIntField(term519233, term519233.getClass(), "sourcePosition", 0);
        setField(term519233, term519233.getClass(), "jsType", null);
        setField(term519233, term519233.getClass(), "parent", null);
        setField(term519231, term519231.getClass(), "first", term519233);
        setField(term519231, term519231.getClass(), "last", null);
        setField(term519231, term519231.getClass(), "propListHead", null);
        setIntField(term519231, term519231.getClass(), "sourcePosition", 0);
        setField(term519231, term519231.getClass(), "jsType", null);
        setField(term519248, term519248.getClass(), "functionName", null);
        setBooleanField(term519248, term519248.getClass(), "itsNeedsActivation", false);
        setIntField(term519248, term519248.getClass(), "itsFunctionType", 0);
        setBooleanField(term519248, term519248.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term519248, term519248.getClass(), "encodedSourceStart", 0);
        setIntField(term519248, term519248.getClass(), "encodedSourceEnd", 0);
        setField(term519248, term519248.getClass(), "sourceName", null);
        setIntField(term519248, term519248.getClass(), "baseLineno", 0);
        setIntField(term519248, term519248.getClass(), "endLineno", 0);
        setField(term519248, term519248.getClass(), "functions", null);
        setField(term519248, term519248.getClass(), "regexps", null);
        setField(term519248, term519248.getClass(), "itsVariables", null);
        setField(term519248, term519248.getClass(), "itsConst", null);
        setField(term519248, term519248.getClass(), "itsVariableNames", null);
        setIntField(term519248, term519248.getClass(), "varStart", 0);
        setField(term519248, term519248.getClass(), "compilerData", null);
        setIntField(term519248, term519248.getClass(), "type", 98);
        setField(term519248, term519248.getClass(), "next", null);
        setField(term519248, term519248.getClass(), "first", null);
        setField(term519248, term519248.getClass(), "last", null);
        setField(term519248, term519248.getClass(), "propListHead", null);
        setIntField(term519248, term519248.getClass(), "sourcePosition", 0);
        setField(term519248, term519248.getClass(), "jsType", null);
        setField(term519248, term519248.getClass(), "parent", null);
        setField(term519231, term519231.getClass(), "parent", term519248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term518962;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term518870, args);
        assertTrue(recursiveEquals(term518870, term519348));
        assertTrue(recursiveEquals(term518962, term519349));
        assertTrue(recursiveEquals(retValue, term519231));
    }

};


