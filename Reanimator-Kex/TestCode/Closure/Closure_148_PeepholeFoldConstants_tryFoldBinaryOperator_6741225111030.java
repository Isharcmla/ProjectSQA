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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241032;
     Object term241118;
     Object term241526;
     Object term241527;
     Object term241465;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241032 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term241118 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term241204 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term241296 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term241204, term241204.getClass(), "next", term241296);
        setIntField(term241204, term241204.getClass(), "type", 39);
        setField(term241118, term241118.getClass(), "first", term241204);
        setIntField(term241118, term241118.getClass(), "type", 19);
        term241526 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term241526, term241526.getClass(), "currentTraversal", null);
        term241527 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term241528 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term241529 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term241527, term241527.getClass(), "functionName", null);
        setBooleanField(term241527, term241527.getClass(), "itsNeedsActivation", false);
        setIntField(term241527, term241527.getClass(), "itsFunctionType", 0);
        setBooleanField(term241527, term241527.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term241527, term241527.getClass(), "encodedSourceStart", 0);
        setIntField(term241527, term241527.getClass(), "encodedSourceEnd", 0);
        setField(term241527, term241527.getClass(), "sourceName", null);
        setIntField(term241527, term241527.getClass(), "baseLineno", 0);
        setIntField(term241527, term241527.getClass(), "endLineno", 0);
        setField(term241527, term241527.getClass(), "functions", null);
        setField(term241527, term241527.getClass(), "regexps", null);
        setField(term241527, term241527.getClass(), "itsVariables", null);
        setField(term241527, term241527.getClass(), "itsConst", null);
        setField(term241527, term241527.getClass(), "itsVariableNames", null);
        setIntField(term241527, term241527.getClass(), "varStart", 0);
        setField(term241527, term241527.getClass(), "compilerData", null);
        setIntField(term241527, term241527.getClass(), "type", 19);
        setField(term241527, term241527.getClass(), "next", null);
        setField(term241528, term241528.getClass(), "functionName", null);
        setBooleanField(term241528, term241528.getClass(), "itsNeedsActivation", false);
        setIntField(term241528, term241528.getClass(), "itsFunctionType", 0);
        setBooleanField(term241528, term241528.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term241528, term241528.getClass(), "encodedSourceStart", 0);
        setIntField(term241528, term241528.getClass(), "encodedSourceEnd", 0);
        setField(term241528, term241528.getClass(), "sourceName", null);
        setIntField(term241528, term241528.getClass(), "baseLineno", 0);
        setIntField(term241528, term241528.getClass(), "endLineno", 0);
        setField(term241528, term241528.getClass(), "functions", null);
        setField(term241528, term241528.getClass(), "regexps", null);
        setField(term241528, term241528.getClass(), "itsVariables", null);
        setField(term241528, term241528.getClass(), "itsConst", null);
        setField(term241528, term241528.getClass(), "itsVariableNames", null);
        setIntField(term241528, term241528.getClass(), "varStart", 0);
        setField(term241528, term241528.getClass(), "compilerData", null);
        setIntField(term241528, term241528.getClass(), "type", 39);
        setField(term241529, term241529.getClass(), "str", null);
        setIntField(term241529, term241529.getClass(), "type", 0);
        setField(term241529, term241529.getClass(), "next", null);
        setField(term241529, term241529.getClass(), "first", null);
        setField(term241529, term241529.getClass(), "last", null);
        setField(term241529, term241529.getClass(), "propListHead", null);
        setIntField(term241529, term241529.getClass(), "sourcePosition", 0);
        setField(term241529, term241529.getClass(), "jsType", null);
        setField(term241529, term241529.getClass(), "parent", null);
        setField(term241528, term241528.getClass(), "next", term241529);
        setField(term241528, term241528.getClass(), "first", null);
        setField(term241528, term241528.getClass(), "last", null);
        setField(term241528, term241528.getClass(), "propListHead", null);
        setIntField(term241528, term241528.getClass(), "sourcePosition", 0);
        setField(term241528, term241528.getClass(), "jsType", null);
        setField(term241528, term241528.getClass(), "parent", null);
        setField(term241527, term241527.getClass(), "first", term241528);
        setField(term241527, term241527.getClass(), "last", null);
        setField(term241527, term241527.getClass(), "propListHead", null);
        setIntField(term241527, term241527.getClass(), "sourcePosition", 0);
        setField(term241527, term241527.getClass(), "jsType", null);
        setField(term241527, term241527.getClass(), "parent", null);
        term241465 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term241475 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term241485 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term241465, term241465.getClass(), "functionName", null);
        setBooleanField(term241465, term241465.getClass(), "itsNeedsActivation", false);
        setIntField(term241465, term241465.getClass(), "itsFunctionType", 0);
        setBooleanField(term241465, term241465.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term241465, term241465.getClass(), "encodedSourceStart", 0);
        setIntField(term241465, term241465.getClass(), "encodedSourceEnd", 0);
        setField(term241465, term241465.getClass(), "sourceName", null);
        setIntField(term241465, term241465.getClass(), "baseLineno", 0);
        setIntField(term241465, term241465.getClass(), "endLineno", 0);
        setField(term241465, term241465.getClass(), "functions", null);
        setField(term241465, term241465.getClass(), "regexps", null);
        setField(term241465, term241465.getClass(), "itsVariables", null);
        setField(term241465, term241465.getClass(), "itsConst", null);
        setField(term241465, term241465.getClass(), "itsVariableNames", null);
        setIntField(term241465, term241465.getClass(), "varStart", 0);
        setField(term241465, term241465.getClass(), "compilerData", null);
        setIntField(term241465, term241465.getClass(), "type", 19);
        setField(term241465, term241465.getClass(), "next", null);
        setField(term241475, term241475.getClass(), "functionName", null);
        setBooleanField(term241475, term241475.getClass(), "itsNeedsActivation", false);
        setIntField(term241475, term241475.getClass(), "itsFunctionType", 0);
        setBooleanField(term241475, term241475.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term241475, term241475.getClass(), "encodedSourceStart", 0);
        setIntField(term241475, term241475.getClass(), "encodedSourceEnd", 0);
        setField(term241475, term241475.getClass(), "sourceName", null);
        setIntField(term241475, term241475.getClass(), "baseLineno", 0);
        setIntField(term241475, term241475.getClass(), "endLineno", 0);
        setField(term241475, term241475.getClass(), "functions", null);
        setField(term241475, term241475.getClass(), "regexps", null);
        setField(term241475, term241475.getClass(), "itsVariables", null);
        setField(term241475, term241475.getClass(), "itsConst", null);
        setField(term241475, term241475.getClass(), "itsVariableNames", null);
        setIntField(term241475, term241475.getClass(), "varStart", 0);
        setField(term241475, term241475.getClass(), "compilerData", null);
        setIntField(term241475, term241475.getClass(), "type", 39);
        setField(term241485, term241485.getClass(), "str", null);
        setIntField(term241485, term241485.getClass(), "type", 0);
        setField(term241485, term241485.getClass(), "next", null);
        setField(term241485, term241485.getClass(), "first", null);
        setField(term241485, term241485.getClass(), "last", null);
        setField(term241485, term241485.getClass(), "propListHead", null);
        setIntField(term241485, term241485.getClass(), "sourcePosition", 0);
        setField(term241485, term241485.getClass(), "jsType", null);
        setField(term241485, term241485.getClass(), "parent", null);
        setField(term241475, term241475.getClass(), "next", term241485);
        setField(term241475, term241475.getClass(), "first", null);
        setField(term241475, term241475.getClass(), "last", null);
        setField(term241475, term241475.getClass(), "propListHead", null);
        setIntField(term241475, term241475.getClass(), "sourcePosition", 0);
        setField(term241475, term241475.getClass(), "jsType", null);
        setField(term241475, term241475.getClass(), "parent", null);
        setField(term241465, term241465.getClass(), "first", term241475);
        setField(term241465, term241465.getClass(), "last", null);
        setField(term241465, term241465.getClass(), "propListHead", null);
        setIntField(term241465, term241465.getClass(), "sourcePosition", 0);
        setField(term241465, term241465.getClass(), "jsType", null);
        setField(term241465, term241465.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term241118;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term241032, args);
        assertTrue(recursiveEquals(term241032, term241526));
        assertTrue(recursiveEquals(term241118, term241527));
        assertTrue(recursiveEquals(retValue, term241465));
    }

};


