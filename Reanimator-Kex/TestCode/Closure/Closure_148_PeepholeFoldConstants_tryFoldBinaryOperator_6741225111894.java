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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term500737;
     Object term500829;
     Object term501179;
     Object term501180;
     Object term501095;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term500737 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term500829 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term500915 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term501005 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term500915, term500915.getClass(), "next", term501005);
        setIntField(term500915, term500915.getClass(), "type", 0);
        setField(term500829, term500829.getClass(), "first", term500915);
        setIntField(term500829, term500829.getClass(), "type", 101);
        setField(term500829, term500829.getClass(), "parent", null);
        term501179 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term501179, term501179.getClass(), "currentTraversal", null);
        term501180 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term501181 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term501182 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term501180, term501180.getClass(), "str", null);
        setIntField(term501180, term501180.getClass(), "type", 101);
        setField(term501180, term501180.getClass(), "next", null);
        setField(term501181, term501181.getClass(), "functionName", null);
        setBooleanField(term501181, term501181.getClass(), "itsNeedsActivation", false);
        setIntField(term501181, term501181.getClass(), "itsFunctionType", 0);
        setBooleanField(term501181, term501181.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term501181, term501181.getClass(), "encodedSourceStart", 0);
        setIntField(term501181, term501181.getClass(), "encodedSourceEnd", 0);
        setField(term501181, term501181.getClass(), "sourceName", null);
        setIntField(term501181, term501181.getClass(), "baseLineno", 0);
        setIntField(term501181, term501181.getClass(), "endLineno", 0);
        setField(term501181, term501181.getClass(), "functions", null);
        setField(term501181, term501181.getClass(), "regexps", null);
        setField(term501181, term501181.getClass(), "itsVariables", null);
        setField(term501181, term501181.getClass(), "itsConst", null);
        setField(term501181, term501181.getClass(), "itsVariableNames", null);
        setIntField(term501181, term501181.getClass(), "varStart", 0);
        setField(term501181, term501181.getClass(), "compilerData", null);
        setIntField(term501181, term501181.getClass(), "type", 0);
        setIntField(term501182, term501182.getClass(), "encodedSourceStart", 0);
        setIntField(term501182, term501182.getClass(), "encodedSourceEnd", 0);
        setField(term501182, term501182.getClass(), "sourceName", null);
        setIntField(term501182, term501182.getClass(), "baseLineno", 0);
        setIntField(term501182, term501182.getClass(), "endLineno", 0);
        setField(term501182, term501182.getClass(), "functions", null);
        setField(term501182, term501182.getClass(), "regexps", null);
        setField(term501182, term501182.getClass(), "itsVariables", null);
        setField(term501182, term501182.getClass(), "itsConst", null);
        setField(term501182, term501182.getClass(), "itsVariableNames", null);
        setIntField(term501182, term501182.getClass(), "varStart", 0);
        setField(term501182, term501182.getClass(), "compilerData", null);
        setIntField(term501182, term501182.getClass(), "type", 0);
        setField(term501182, term501182.getClass(), "next", null);
        setField(term501182, term501182.getClass(), "first", null);
        setField(term501182, term501182.getClass(), "last", null);
        setField(term501182, term501182.getClass(), "propListHead", null);
        setIntField(term501182, term501182.getClass(), "sourcePosition", 0);
        setField(term501182, term501182.getClass(), "jsType", null);
        setField(term501182, term501182.getClass(), "parent", null);
        setField(term501181, term501181.getClass(), "next", term501182);
        setField(term501181, term501181.getClass(), "first", null);
        setField(term501181, term501181.getClass(), "last", null);
        setField(term501181, term501181.getClass(), "propListHead", null);
        setIntField(term501181, term501181.getClass(), "sourcePosition", 0);
        setField(term501181, term501181.getClass(), "jsType", null);
        setField(term501181, term501181.getClass(), "parent", null);
        setField(term501180, term501180.getClass(), "first", term501181);
        setField(term501180, term501180.getClass(), "last", null);
        setField(term501180, term501180.getClass(), "propListHead", null);
        setIntField(term501180, term501180.getClass(), "sourcePosition", 0);
        setField(term501180, term501180.getClass(), "jsType", null);
        setField(term501180, term501180.getClass(), "parent", null);
        term501095 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term501097 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term501107 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term501095, term501095.getClass(), "str", null);
        setIntField(term501095, term501095.getClass(), "type", 101);
        setField(term501095, term501095.getClass(), "next", null);
        setField(term501097, term501097.getClass(), "functionName", null);
        setBooleanField(term501097, term501097.getClass(), "itsNeedsActivation", false);
        setIntField(term501097, term501097.getClass(), "itsFunctionType", 0);
        setBooleanField(term501097, term501097.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term501097, term501097.getClass(), "encodedSourceStart", 0);
        setIntField(term501097, term501097.getClass(), "encodedSourceEnd", 0);
        setField(term501097, term501097.getClass(), "sourceName", null);
        setIntField(term501097, term501097.getClass(), "baseLineno", 0);
        setIntField(term501097, term501097.getClass(), "endLineno", 0);
        setField(term501097, term501097.getClass(), "functions", null);
        setField(term501097, term501097.getClass(), "regexps", null);
        setField(term501097, term501097.getClass(), "itsVariables", null);
        setField(term501097, term501097.getClass(), "itsConst", null);
        setField(term501097, term501097.getClass(), "itsVariableNames", null);
        setIntField(term501097, term501097.getClass(), "varStart", 0);
        setField(term501097, term501097.getClass(), "compilerData", null);
        setIntField(term501097, term501097.getClass(), "type", 0);
        setIntField(term501107, term501107.getClass(), "encodedSourceStart", 0);
        setIntField(term501107, term501107.getClass(), "encodedSourceEnd", 0);
        setField(term501107, term501107.getClass(), "sourceName", null);
        setIntField(term501107, term501107.getClass(), "baseLineno", 0);
        setIntField(term501107, term501107.getClass(), "endLineno", 0);
        setField(term501107, term501107.getClass(), "functions", null);
        setField(term501107, term501107.getClass(), "regexps", null);
        setField(term501107, term501107.getClass(), "itsVariables", null);
        setField(term501107, term501107.getClass(), "itsConst", null);
        setField(term501107, term501107.getClass(), "itsVariableNames", null);
        setIntField(term501107, term501107.getClass(), "varStart", 0);
        setField(term501107, term501107.getClass(), "compilerData", null);
        setIntField(term501107, term501107.getClass(), "type", 0);
        setField(term501107, term501107.getClass(), "next", null);
        setField(term501107, term501107.getClass(), "first", null);
        setField(term501107, term501107.getClass(), "last", null);
        setField(term501107, term501107.getClass(), "propListHead", null);
        setIntField(term501107, term501107.getClass(), "sourcePosition", 0);
        setField(term501107, term501107.getClass(), "jsType", null);
        setField(term501107, term501107.getClass(), "parent", null);
        setField(term501097, term501097.getClass(), "next", term501107);
        setField(term501097, term501097.getClass(), "first", null);
        setField(term501097, term501097.getClass(), "last", null);
        setField(term501097, term501097.getClass(), "propListHead", null);
        setIntField(term501097, term501097.getClass(), "sourcePosition", 0);
        setField(term501097, term501097.getClass(), "jsType", null);
        setField(term501097, term501097.getClass(), "parent", null);
        setField(term501095, term501095.getClass(), "first", term501097);
        setField(term501095, term501095.getClass(), "last", null);
        setField(term501095, term501095.getClass(), "propListHead", null);
        setIntField(term501095, term501095.getClass(), "sourcePosition", 0);
        setField(term501095, term501095.getClass(), "jsType", null);
        setField(term501095, term501095.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term500829;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term500737, args);
        assertTrue(recursiveEquals(term500737, term501179));
        assertTrue(recursiveEquals(term500829, term501180));
        assertTrue(recursiveEquals(retValue, term501095));
    }

};


