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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term556588;
     Object term556674;
     Object term556978;
     Object term556979;
     Object term556915;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term556588 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term556674 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term556760 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term556830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term556760, term556760.getClass(), "next", term556830);
        setField(term556674, term556674.getClass(), "first", term556760);
        setIntField(term556674, term556674.getClass(), "type", 11);
        term556978 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term556978, term556978.getClass(), "currentTraversal", null);
        term556979 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term556980 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term556981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term556979, term556979.getClass(), "functionName", null);
        setBooleanField(term556979, term556979.getClass(), "itsNeedsActivation", false);
        setIntField(term556979, term556979.getClass(), "itsFunctionType", 0);
        setBooleanField(term556979, term556979.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term556979, term556979.getClass(), "encodedSourceStart", 0);
        setIntField(term556979, term556979.getClass(), "encodedSourceEnd", 0);
        setField(term556979, term556979.getClass(), "sourceName", null);
        setIntField(term556979, term556979.getClass(), "baseLineno", 0);
        setIntField(term556979, term556979.getClass(), "endLineno", 0);
        setField(term556979, term556979.getClass(), "functions", null);
        setField(term556979, term556979.getClass(), "regexps", null);
        setField(term556979, term556979.getClass(), "itsVariables", null);
        setField(term556979, term556979.getClass(), "itsConst", null);
        setField(term556979, term556979.getClass(), "itsVariableNames", null);
        setIntField(term556979, term556979.getClass(), "varStart", 0);
        setField(term556979, term556979.getClass(), "compilerData", null);
        setIntField(term556979, term556979.getClass(), "type", 11);
        setField(term556979, term556979.getClass(), "next", null);
        setField(term556980, term556980.getClass(), "functionName", null);
        setBooleanField(term556980, term556980.getClass(), "itsNeedsActivation", false);
        setIntField(term556980, term556980.getClass(), "itsFunctionType", 0);
        setBooleanField(term556980, term556980.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term556980, term556980.getClass(), "encodedSourceStart", 0);
        setIntField(term556980, term556980.getClass(), "encodedSourceEnd", 0);
        setField(term556980, term556980.getClass(), "sourceName", null);
        setIntField(term556980, term556980.getClass(), "baseLineno", 0);
        setIntField(term556980, term556980.getClass(), "endLineno", 0);
        setField(term556980, term556980.getClass(), "functions", null);
        setField(term556980, term556980.getClass(), "regexps", null);
        setField(term556980, term556980.getClass(), "itsVariables", null);
        setField(term556980, term556980.getClass(), "itsConst", null);
        setField(term556980, term556980.getClass(), "itsVariableNames", null);
        setIntField(term556980, term556980.getClass(), "varStart", 0);
        setField(term556980, term556980.getClass(), "compilerData", null);
        setIntField(term556980, term556980.getClass(), "type", 0);
        setIntField(term556981, term556981.getClass(), "type", 0);
        setField(term556981, term556981.getClass(), "next", null);
        setField(term556981, term556981.getClass(), "first", null);
        setField(term556981, term556981.getClass(), "last", null);
        setField(term556981, term556981.getClass(), "propListHead", null);
        setIntField(term556981, term556981.getClass(), "sourcePosition", 0);
        setField(term556981, term556981.getClass(), "jsType", null);
        setField(term556981, term556981.getClass(), "parent", null);
        setField(term556980, term556980.getClass(), "next", term556981);
        setField(term556980, term556980.getClass(), "first", null);
        setField(term556980, term556980.getClass(), "last", null);
        setField(term556980, term556980.getClass(), "propListHead", null);
        setIntField(term556980, term556980.getClass(), "sourcePosition", 0);
        setField(term556980, term556980.getClass(), "jsType", null);
        setField(term556980, term556980.getClass(), "parent", null);
        setField(term556979, term556979.getClass(), "first", term556980);
        setField(term556979, term556979.getClass(), "last", null);
        setField(term556979, term556979.getClass(), "propListHead", null);
        setIntField(term556979, term556979.getClass(), "sourcePosition", 0);
        setField(term556979, term556979.getClass(), "jsType", null);
        setField(term556979, term556979.getClass(), "parent", null);
        term556915 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term556925 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term556935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term556915, term556915.getClass(), "functionName", null);
        setBooleanField(term556915, term556915.getClass(), "itsNeedsActivation", false);
        setIntField(term556915, term556915.getClass(), "itsFunctionType", 0);
        setBooleanField(term556915, term556915.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term556915, term556915.getClass(), "encodedSourceStart", 0);
        setIntField(term556915, term556915.getClass(), "encodedSourceEnd", 0);
        setField(term556915, term556915.getClass(), "sourceName", null);
        setIntField(term556915, term556915.getClass(), "baseLineno", 0);
        setIntField(term556915, term556915.getClass(), "endLineno", 0);
        setField(term556915, term556915.getClass(), "functions", null);
        setField(term556915, term556915.getClass(), "regexps", null);
        setField(term556915, term556915.getClass(), "itsVariables", null);
        setField(term556915, term556915.getClass(), "itsConst", null);
        setField(term556915, term556915.getClass(), "itsVariableNames", null);
        setIntField(term556915, term556915.getClass(), "varStart", 0);
        setField(term556915, term556915.getClass(), "compilerData", null);
        setIntField(term556915, term556915.getClass(), "type", 11);
        setField(term556915, term556915.getClass(), "next", null);
        setField(term556925, term556925.getClass(), "functionName", null);
        setBooleanField(term556925, term556925.getClass(), "itsNeedsActivation", false);
        setIntField(term556925, term556925.getClass(), "itsFunctionType", 0);
        setBooleanField(term556925, term556925.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term556925, term556925.getClass(), "encodedSourceStart", 0);
        setIntField(term556925, term556925.getClass(), "encodedSourceEnd", 0);
        setField(term556925, term556925.getClass(), "sourceName", null);
        setIntField(term556925, term556925.getClass(), "baseLineno", 0);
        setIntField(term556925, term556925.getClass(), "endLineno", 0);
        setField(term556925, term556925.getClass(), "functions", null);
        setField(term556925, term556925.getClass(), "regexps", null);
        setField(term556925, term556925.getClass(), "itsVariables", null);
        setField(term556925, term556925.getClass(), "itsConst", null);
        setField(term556925, term556925.getClass(), "itsVariableNames", null);
        setIntField(term556925, term556925.getClass(), "varStart", 0);
        setField(term556925, term556925.getClass(), "compilerData", null);
        setIntField(term556925, term556925.getClass(), "type", 0);
        setIntField(term556935, term556935.getClass(), "type", 0);
        setField(term556935, term556935.getClass(), "next", null);
        setField(term556935, term556935.getClass(), "first", null);
        setField(term556935, term556935.getClass(), "last", null);
        setField(term556935, term556935.getClass(), "propListHead", null);
        setIntField(term556935, term556935.getClass(), "sourcePosition", 0);
        setField(term556935, term556935.getClass(), "jsType", null);
        setField(term556935, term556935.getClass(), "parent", null);
        setField(term556925, term556925.getClass(), "next", term556935);
        setField(term556925, term556925.getClass(), "first", null);
        setField(term556925, term556925.getClass(), "last", null);
        setField(term556925, term556925.getClass(), "propListHead", null);
        setIntField(term556925, term556925.getClass(), "sourcePosition", 0);
        setField(term556925, term556925.getClass(), "jsType", null);
        setField(term556925, term556925.getClass(), "parent", null);
        setField(term556915, term556915.getClass(), "first", term556925);
        setField(term556915, term556915.getClass(), "last", null);
        setField(term556915, term556915.getClass(), "propListHead", null);
        setIntField(term556915, term556915.getClass(), "sourcePosition", 0);
        setField(term556915, term556915.getClass(), "jsType", null);
        setField(term556915, term556915.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term556674;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term556588, args);
        assertTrue(recursiveEquals(term556588, term556978));
        assertTrue(recursiveEquals(term556674, term556979));
        assertTrue(recursiveEquals(retValue, term556915));
    }

};


