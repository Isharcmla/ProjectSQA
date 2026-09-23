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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423636;
     Object term423722;
     Object term423976;
     Object term423977;
     Object term423915;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423636 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term423722 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423808 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423900 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term423808, term423808.getClass(), "next", term423900);
        setIntField(term423808, term423808.getClass(), "type", 39);
        setField(term423722, term423722.getClass(), "first", term423808);
        setIntField(term423722, term423722.getClass(), "type", 24);
        term423976 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term423976, term423976.getClass(), "currentTraversal", null);
        term423977 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423978 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423979 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term423977, term423977.getClass(), "functionName", null);
        setBooleanField(term423977, term423977.getClass(), "itsNeedsActivation", false);
        setIntField(term423977, term423977.getClass(), "itsFunctionType", 0);
        setBooleanField(term423977, term423977.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423977, term423977.getClass(), "encodedSourceStart", 0);
        setIntField(term423977, term423977.getClass(), "encodedSourceEnd", 0);
        setField(term423977, term423977.getClass(), "sourceName", null);
        setIntField(term423977, term423977.getClass(), "baseLineno", 0);
        setIntField(term423977, term423977.getClass(), "endLineno", 0);
        setField(term423977, term423977.getClass(), "functions", null);
        setField(term423977, term423977.getClass(), "regexps", null);
        setField(term423977, term423977.getClass(), "itsVariables", null);
        setField(term423977, term423977.getClass(), "itsConst", null);
        setField(term423977, term423977.getClass(), "itsVariableNames", null);
        setIntField(term423977, term423977.getClass(), "varStart", 0);
        setField(term423977, term423977.getClass(), "compilerData", null);
        setIntField(term423977, term423977.getClass(), "type", 24);
        setField(term423977, term423977.getClass(), "next", null);
        setField(term423978, term423978.getClass(), "functionName", null);
        setBooleanField(term423978, term423978.getClass(), "itsNeedsActivation", false);
        setIntField(term423978, term423978.getClass(), "itsFunctionType", 0);
        setBooleanField(term423978, term423978.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423978, term423978.getClass(), "encodedSourceStart", 0);
        setIntField(term423978, term423978.getClass(), "encodedSourceEnd", 0);
        setField(term423978, term423978.getClass(), "sourceName", null);
        setIntField(term423978, term423978.getClass(), "baseLineno", 0);
        setIntField(term423978, term423978.getClass(), "endLineno", 0);
        setField(term423978, term423978.getClass(), "functions", null);
        setField(term423978, term423978.getClass(), "regexps", null);
        setField(term423978, term423978.getClass(), "itsVariables", null);
        setField(term423978, term423978.getClass(), "itsConst", null);
        setField(term423978, term423978.getClass(), "itsVariableNames", null);
        setIntField(term423978, term423978.getClass(), "varStart", 0);
        setField(term423978, term423978.getClass(), "compilerData", null);
        setIntField(term423978, term423978.getClass(), "type", 39);
        setField(term423979, term423979.getClass(), "str", null);
        setIntField(term423979, term423979.getClass(), "type", 0);
        setField(term423979, term423979.getClass(), "next", null);
        setField(term423979, term423979.getClass(), "first", null);
        setField(term423979, term423979.getClass(), "last", null);
        setField(term423979, term423979.getClass(), "propListHead", null);
        setIntField(term423979, term423979.getClass(), "sourcePosition", 0);
        setField(term423979, term423979.getClass(), "jsType", null);
        setField(term423979, term423979.getClass(), "parent", null);
        setField(term423978, term423978.getClass(), "next", term423979);
        setField(term423978, term423978.getClass(), "first", null);
        setField(term423978, term423978.getClass(), "last", null);
        setField(term423978, term423978.getClass(), "propListHead", null);
        setIntField(term423978, term423978.getClass(), "sourcePosition", 0);
        setField(term423978, term423978.getClass(), "jsType", null);
        setField(term423978, term423978.getClass(), "parent", null);
        setField(term423977, term423977.getClass(), "first", term423978);
        setField(term423977, term423977.getClass(), "last", null);
        setField(term423977, term423977.getClass(), "propListHead", null);
        setIntField(term423977, term423977.getClass(), "sourcePosition", 0);
        setField(term423977, term423977.getClass(), "jsType", null);
        setField(term423977, term423977.getClass(), "parent", null);
        term423915 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423925 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423935 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term423915, term423915.getClass(), "functionName", null);
        setBooleanField(term423915, term423915.getClass(), "itsNeedsActivation", false);
        setIntField(term423915, term423915.getClass(), "itsFunctionType", 0);
        setBooleanField(term423915, term423915.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423915, term423915.getClass(), "encodedSourceStart", 0);
        setIntField(term423915, term423915.getClass(), "encodedSourceEnd", 0);
        setField(term423915, term423915.getClass(), "sourceName", null);
        setIntField(term423915, term423915.getClass(), "baseLineno", 0);
        setIntField(term423915, term423915.getClass(), "endLineno", 0);
        setField(term423915, term423915.getClass(), "functions", null);
        setField(term423915, term423915.getClass(), "regexps", null);
        setField(term423915, term423915.getClass(), "itsVariables", null);
        setField(term423915, term423915.getClass(), "itsConst", null);
        setField(term423915, term423915.getClass(), "itsVariableNames", null);
        setIntField(term423915, term423915.getClass(), "varStart", 0);
        setField(term423915, term423915.getClass(), "compilerData", null);
        setIntField(term423915, term423915.getClass(), "type", 24);
        setField(term423915, term423915.getClass(), "next", null);
        setField(term423925, term423925.getClass(), "functionName", null);
        setBooleanField(term423925, term423925.getClass(), "itsNeedsActivation", false);
        setIntField(term423925, term423925.getClass(), "itsFunctionType", 0);
        setBooleanField(term423925, term423925.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423925, term423925.getClass(), "encodedSourceStart", 0);
        setIntField(term423925, term423925.getClass(), "encodedSourceEnd", 0);
        setField(term423925, term423925.getClass(), "sourceName", null);
        setIntField(term423925, term423925.getClass(), "baseLineno", 0);
        setIntField(term423925, term423925.getClass(), "endLineno", 0);
        setField(term423925, term423925.getClass(), "functions", null);
        setField(term423925, term423925.getClass(), "regexps", null);
        setField(term423925, term423925.getClass(), "itsVariables", null);
        setField(term423925, term423925.getClass(), "itsConst", null);
        setField(term423925, term423925.getClass(), "itsVariableNames", null);
        setIntField(term423925, term423925.getClass(), "varStart", 0);
        setField(term423925, term423925.getClass(), "compilerData", null);
        setIntField(term423925, term423925.getClass(), "type", 39);
        setField(term423935, term423935.getClass(), "str", null);
        setIntField(term423935, term423935.getClass(), "type", 0);
        setField(term423935, term423935.getClass(), "next", null);
        setField(term423935, term423935.getClass(), "first", null);
        setField(term423935, term423935.getClass(), "last", null);
        setField(term423935, term423935.getClass(), "propListHead", null);
        setIntField(term423935, term423935.getClass(), "sourcePosition", 0);
        setField(term423935, term423935.getClass(), "jsType", null);
        setField(term423935, term423935.getClass(), "parent", null);
        setField(term423925, term423925.getClass(), "next", term423935);
        setField(term423925, term423925.getClass(), "first", null);
        setField(term423925, term423925.getClass(), "last", null);
        setField(term423925, term423925.getClass(), "propListHead", null);
        setIntField(term423925, term423925.getClass(), "sourcePosition", 0);
        setField(term423925, term423925.getClass(), "jsType", null);
        setField(term423925, term423925.getClass(), "parent", null);
        setField(term423915, term423915.getClass(), "first", term423925);
        setField(term423915, term423915.getClass(), "last", null);
        setField(term423915, term423915.getClass(), "propListHead", null);
        setIntField(term423915, term423915.getClass(), "sourcePosition", 0);
        setField(term423915, term423915.getClass(), "jsType", null);
        setField(term423915, term423915.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term423722;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term423636, args);
        assertTrue(recursiveEquals(term423636, term423976));
        assertTrue(recursiveEquals(term423722, term423977));
        assertTrue(recursiveEquals(retValue, term423915));
    }

};


