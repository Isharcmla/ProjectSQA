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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377325;
     Object term377417;
     Object term377943;
     Object term377944;
     Object term377892;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377325 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term377417 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term377503 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term377573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term377503, term377503.getClass(), "next", term377573);
        setField(term377417, term377417.getClass(), "first", term377503);
        setIntField(term377417, term377417.getClass(), "type", 9);
        term377943 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term377943, term377943.getClass(), "currentTraversal", null);
        term377944 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term377945 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term377946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term377944, term377944.getClass(), "number", 0.0);
        setIntField(term377944, term377944.getClass(), "type", 9);
        setField(term377944, term377944.getClass(), "next", null);
        setField(term377945, term377945.getClass(), "functionName", null);
        setBooleanField(term377945, term377945.getClass(), "itsNeedsActivation", false);
        setIntField(term377945, term377945.getClass(), "itsFunctionType", 0);
        setBooleanField(term377945, term377945.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term377945, term377945.getClass(), "encodedSourceStart", 0);
        setIntField(term377945, term377945.getClass(), "encodedSourceEnd", 0);
        setField(term377945, term377945.getClass(), "sourceName", null);
        setIntField(term377945, term377945.getClass(), "baseLineno", 0);
        setIntField(term377945, term377945.getClass(), "endLineno", 0);
        setField(term377945, term377945.getClass(), "functions", null);
        setField(term377945, term377945.getClass(), "regexps", null);
        setField(term377945, term377945.getClass(), "itsVariables", null);
        setField(term377945, term377945.getClass(), "itsConst", null);
        setField(term377945, term377945.getClass(), "itsVariableNames", null);
        setIntField(term377945, term377945.getClass(), "varStart", 0);
        setField(term377945, term377945.getClass(), "compilerData", null);
        setIntField(term377945, term377945.getClass(), "type", 0);
        setIntField(term377946, term377946.getClass(), "type", 0);
        setField(term377946, term377946.getClass(), "next", null);
        setField(term377946, term377946.getClass(), "first", null);
        setField(term377946, term377946.getClass(), "last", null);
        setField(term377946, term377946.getClass(), "propListHead", null);
        setIntField(term377946, term377946.getClass(), "sourcePosition", 0);
        setField(term377946, term377946.getClass(), "jsType", null);
        setField(term377946, term377946.getClass(), "parent", null);
        setField(term377945, term377945.getClass(), "next", term377946);
        setField(term377945, term377945.getClass(), "first", null);
        setField(term377945, term377945.getClass(), "last", null);
        setField(term377945, term377945.getClass(), "propListHead", null);
        setIntField(term377945, term377945.getClass(), "sourcePosition", 0);
        setField(term377945, term377945.getClass(), "jsType", null);
        setField(term377945, term377945.getClass(), "parent", null);
        setField(term377944, term377944.getClass(), "first", term377945);
        setField(term377944, term377944.getClass(), "last", null);
        setField(term377944, term377944.getClass(), "propListHead", null);
        setIntField(term377944, term377944.getClass(), "sourcePosition", 0);
        setField(term377944, term377944.getClass(), "jsType", null);
        setField(term377944, term377944.getClass(), "parent", null);
        term377892 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term377895 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term377905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term377892, term377892.getClass(), "number", 0.0);
        setIntField(term377892, term377892.getClass(), "type", 9);
        setField(term377892, term377892.getClass(), "next", null);
        setField(term377895, term377895.getClass(), "functionName", null);
        setBooleanField(term377895, term377895.getClass(), "itsNeedsActivation", false);
        setIntField(term377895, term377895.getClass(), "itsFunctionType", 0);
        setBooleanField(term377895, term377895.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term377895, term377895.getClass(), "encodedSourceStart", 0);
        setIntField(term377895, term377895.getClass(), "encodedSourceEnd", 0);
        setField(term377895, term377895.getClass(), "sourceName", null);
        setIntField(term377895, term377895.getClass(), "baseLineno", 0);
        setIntField(term377895, term377895.getClass(), "endLineno", 0);
        setField(term377895, term377895.getClass(), "functions", null);
        setField(term377895, term377895.getClass(), "regexps", null);
        setField(term377895, term377895.getClass(), "itsVariables", null);
        setField(term377895, term377895.getClass(), "itsConst", null);
        setField(term377895, term377895.getClass(), "itsVariableNames", null);
        setIntField(term377895, term377895.getClass(), "varStart", 0);
        setField(term377895, term377895.getClass(), "compilerData", null);
        setIntField(term377895, term377895.getClass(), "type", 0);
        setIntField(term377905, term377905.getClass(), "type", 0);
        setField(term377905, term377905.getClass(), "next", null);
        setField(term377905, term377905.getClass(), "first", null);
        setField(term377905, term377905.getClass(), "last", null);
        setField(term377905, term377905.getClass(), "propListHead", null);
        setIntField(term377905, term377905.getClass(), "sourcePosition", 0);
        setField(term377905, term377905.getClass(), "jsType", null);
        setField(term377905, term377905.getClass(), "parent", null);
        setField(term377895, term377895.getClass(), "next", term377905);
        setField(term377895, term377895.getClass(), "first", null);
        setField(term377895, term377895.getClass(), "last", null);
        setField(term377895, term377895.getClass(), "propListHead", null);
        setIntField(term377895, term377895.getClass(), "sourcePosition", 0);
        setField(term377895, term377895.getClass(), "jsType", null);
        setField(term377895, term377895.getClass(), "parent", null);
        setField(term377892, term377892.getClass(), "first", term377895);
        setField(term377892, term377892.getClass(), "last", null);
        setField(term377892, term377892.getClass(), "propListHead", null);
        setIntField(term377892, term377892.getClass(), "sourcePosition", 0);
        setField(term377892, term377892.getClass(), "jsType", null);
        setField(term377892, term377892.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term377417;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term377325, args);
        assertTrue(recursiveEquals(term377325, term377943));
        assertTrue(recursiveEquals(term377417, term377944));
        assertTrue(recursiveEquals(retValue, term377892));
    }

};


