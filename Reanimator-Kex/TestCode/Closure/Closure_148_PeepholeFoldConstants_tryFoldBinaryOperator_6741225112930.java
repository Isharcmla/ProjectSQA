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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term857958;
     Object term858044;
     Object term858312;
     Object term858313;
     Object term858244;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term857958 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term858044 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term858130 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term858222 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term858130, term858130.getClass(), "next", term858222);
        setIntField(term858130, term858130.getClass(), "type", 39);
        setField(term858044, term858044.getClass(), "first", term858130);
        setIntField(term858044, term858044.getClass(), "type", 11);
        term858312 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term858312, term858312.getClass(), "currentTraversal", null);
        term858313 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term858314 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term858315 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term858313, term858313.getClass(), "functionName", null);
        setBooleanField(term858313, term858313.getClass(), "itsNeedsActivation", false);
        setIntField(term858313, term858313.getClass(), "itsFunctionType", 0);
        setBooleanField(term858313, term858313.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term858313, term858313.getClass(), "encodedSourceStart", 0);
        setIntField(term858313, term858313.getClass(), "encodedSourceEnd", 0);
        setField(term858313, term858313.getClass(), "sourceName", null);
        setIntField(term858313, term858313.getClass(), "baseLineno", 0);
        setIntField(term858313, term858313.getClass(), "endLineno", 0);
        setField(term858313, term858313.getClass(), "functions", null);
        setField(term858313, term858313.getClass(), "regexps", null);
        setField(term858313, term858313.getClass(), "itsVariables", null);
        setField(term858313, term858313.getClass(), "itsConst", null);
        setField(term858313, term858313.getClass(), "itsVariableNames", null);
        setIntField(term858313, term858313.getClass(), "varStart", 0);
        setField(term858313, term858313.getClass(), "compilerData", null);
        setIntField(term858313, term858313.getClass(), "type", 11);
        setField(term858313, term858313.getClass(), "next", null);
        setField(term858314, term858314.getClass(), "functionName", null);
        setBooleanField(term858314, term858314.getClass(), "itsNeedsActivation", false);
        setIntField(term858314, term858314.getClass(), "itsFunctionType", 0);
        setBooleanField(term858314, term858314.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term858314, term858314.getClass(), "encodedSourceStart", 0);
        setIntField(term858314, term858314.getClass(), "encodedSourceEnd", 0);
        setField(term858314, term858314.getClass(), "sourceName", null);
        setIntField(term858314, term858314.getClass(), "baseLineno", 0);
        setIntField(term858314, term858314.getClass(), "endLineno", 0);
        setField(term858314, term858314.getClass(), "functions", null);
        setField(term858314, term858314.getClass(), "regexps", null);
        setField(term858314, term858314.getClass(), "itsVariables", null);
        setField(term858314, term858314.getClass(), "itsConst", null);
        setField(term858314, term858314.getClass(), "itsVariableNames", null);
        setIntField(term858314, term858314.getClass(), "varStart", 0);
        setField(term858314, term858314.getClass(), "compilerData", null);
        setIntField(term858314, term858314.getClass(), "type", 39);
        setDoubleField(term858315, term858315.getClass(), "number", 0.0);
        setIntField(term858315, term858315.getClass(), "type", 0);
        setField(term858315, term858315.getClass(), "next", null);
        setField(term858315, term858315.getClass(), "first", null);
        setField(term858315, term858315.getClass(), "last", null);
        setField(term858315, term858315.getClass(), "propListHead", null);
        setIntField(term858315, term858315.getClass(), "sourcePosition", 0);
        setField(term858315, term858315.getClass(), "jsType", null);
        setField(term858315, term858315.getClass(), "parent", null);
        setField(term858314, term858314.getClass(), "next", term858315);
        setField(term858314, term858314.getClass(), "first", null);
        setField(term858314, term858314.getClass(), "last", null);
        setField(term858314, term858314.getClass(), "propListHead", null);
        setIntField(term858314, term858314.getClass(), "sourcePosition", 0);
        setField(term858314, term858314.getClass(), "jsType", null);
        setField(term858314, term858314.getClass(), "parent", null);
        setField(term858313, term858313.getClass(), "first", term858314);
        setField(term858313, term858313.getClass(), "last", null);
        setField(term858313, term858313.getClass(), "propListHead", null);
        setIntField(term858313, term858313.getClass(), "sourcePosition", 0);
        setField(term858313, term858313.getClass(), "jsType", null);
        setField(term858313, term858313.getClass(), "parent", null);
        term858244 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term858254 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term858264 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term858244, term858244.getClass(), "functionName", null);
        setBooleanField(term858244, term858244.getClass(), "itsNeedsActivation", false);
        setIntField(term858244, term858244.getClass(), "itsFunctionType", 0);
        setBooleanField(term858244, term858244.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term858244, term858244.getClass(), "encodedSourceStart", 0);
        setIntField(term858244, term858244.getClass(), "encodedSourceEnd", 0);
        setField(term858244, term858244.getClass(), "sourceName", null);
        setIntField(term858244, term858244.getClass(), "baseLineno", 0);
        setIntField(term858244, term858244.getClass(), "endLineno", 0);
        setField(term858244, term858244.getClass(), "functions", null);
        setField(term858244, term858244.getClass(), "regexps", null);
        setField(term858244, term858244.getClass(), "itsVariables", null);
        setField(term858244, term858244.getClass(), "itsConst", null);
        setField(term858244, term858244.getClass(), "itsVariableNames", null);
        setIntField(term858244, term858244.getClass(), "varStart", 0);
        setField(term858244, term858244.getClass(), "compilerData", null);
        setIntField(term858244, term858244.getClass(), "type", 11);
        setField(term858244, term858244.getClass(), "next", null);
        setField(term858254, term858254.getClass(), "functionName", null);
        setBooleanField(term858254, term858254.getClass(), "itsNeedsActivation", false);
        setIntField(term858254, term858254.getClass(), "itsFunctionType", 0);
        setBooleanField(term858254, term858254.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term858254, term858254.getClass(), "encodedSourceStart", 0);
        setIntField(term858254, term858254.getClass(), "encodedSourceEnd", 0);
        setField(term858254, term858254.getClass(), "sourceName", null);
        setIntField(term858254, term858254.getClass(), "baseLineno", 0);
        setIntField(term858254, term858254.getClass(), "endLineno", 0);
        setField(term858254, term858254.getClass(), "functions", null);
        setField(term858254, term858254.getClass(), "regexps", null);
        setField(term858254, term858254.getClass(), "itsVariables", null);
        setField(term858254, term858254.getClass(), "itsConst", null);
        setField(term858254, term858254.getClass(), "itsVariableNames", null);
        setIntField(term858254, term858254.getClass(), "varStart", 0);
        setField(term858254, term858254.getClass(), "compilerData", null);
        setIntField(term858254, term858254.getClass(), "type", 39);
        setDoubleField(term858264, term858264.getClass(), "number", 0.0);
        setIntField(term858264, term858264.getClass(), "type", 0);
        setField(term858264, term858264.getClass(), "next", null);
        setField(term858264, term858264.getClass(), "first", null);
        setField(term858264, term858264.getClass(), "last", null);
        setField(term858264, term858264.getClass(), "propListHead", null);
        setIntField(term858264, term858264.getClass(), "sourcePosition", 0);
        setField(term858264, term858264.getClass(), "jsType", null);
        setField(term858264, term858264.getClass(), "parent", null);
        setField(term858254, term858254.getClass(), "next", term858264);
        setField(term858254, term858254.getClass(), "first", null);
        setField(term858254, term858254.getClass(), "last", null);
        setField(term858254, term858254.getClass(), "propListHead", null);
        setIntField(term858254, term858254.getClass(), "sourcePosition", 0);
        setField(term858254, term858254.getClass(), "jsType", null);
        setField(term858254, term858254.getClass(), "parent", null);
        setField(term858244, term858244.getClass(), "first", term858254);
        setField(term858244, term858244.getClass(), "last", null);
        setField(term858244, term858244.getClass(), "propListHead", null);
        setIntField(term858244, term858244.getClass(), "sourcePosition", 0);
        setField(term858244, term858244.getClass(), "jsType", null);
        setField(term858244, term858244.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term858044;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term857958, args);
        assertTrue(recursiveEquals(term857958, term858312));
        assertTrue(recursiveEquals(term858044, term858313));
        assertTrue(recursiveEquals(retValue, term858244));
    }

};


