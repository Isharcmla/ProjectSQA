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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term722991;
     Object term723083;
     Object term723341;
     Object term723342;
     Object term723276;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term722991 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term723083 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term723169 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term723261 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term723169, term723169.getClass(), "next", term723261);
        setIntField(term723169, term723169.getClass(), "type", 42);
        setField(term723083, term723083.getClass(), "first", term723169);
        setIntField(term723083, term723083.getClass(), "type", 14);
        term723341 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term723341, term723341.getClass(), "currentTraversal", null);
        term723342 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term723343 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term723344 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term723342, term723342.getClass(), "str", null);
        setIntField(term723342, term723342.getClass(), "type", 14);
        setField(term723342, term723342.getClass(), "next", null);
        setField(term723343, term723343.getClass(), "functionName", null);
        setBooleanField(term723343, term723343.getClass(), "itsNeedsActivation", false);
        setIntField(term723343, term723343.getClass(), "itsFunctionType", 0);
        setBooleanField(term723343, term723343.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term723343, term723343.getClass(), "encodedSourceStart", 0);
        setIntField(term723343, term723343.getClass(), "encodedSourceEnd", 0);
        setField(term723343, term723343.getClass(), "sourceName", null);
        setIntField(term723343, term723343.getClass(), "baseLineno", 0);
        setIntField(term723343, term723343.getClass(), "endLineno", 0);
        setField(term723343, term723343.getClass(), "functions", null);
        setField(term723343, term723343.getClass(), "regexps", null);
        setField(term723343, term723343.getClass(), "itsVariables", null);
        setField(term723343, term723343.getClass(), "itsConst", null);
        setField(term723343, term723343.getClass(), "itsVariableNames", null);
        setIntField(term723343, term723343.getClass(), "varStart", 0);
        setField(term723343, term723343.getClass(), "compilerData", null);
        setIntField(term723343, term723343.getClass(), "type", 42);
        setField(term723344, term723344.getClass(), "str", null);
        setIntField(term723344, term723344.getClass(), "type", 0);
        setField(term723344, term723344.getClass(), "next", null);
        setField(term723344, term723344.getClass(), "first", null);
        setField(term723344, term723344.getClass(), "last", null);
        setField(term723344, term723344.getClass(), "propListHead", null);
        setIntField(term723344, term723344.getClass(), "sourcePosition", 0);
        setField(term723344, term723344.getClass(), "jsType", null);
        setField(term723344, term723344.getClass(), "parent", null);
        setField(term723343, term723343.getClass(), "next", term723344);
        setField(term723343, term723343.getClass(), "first", null);
        setField(term723343, term723343.getClass(), "last", null);
        setField(term723343, term723343.getClass(), "propListHead", null);
        setIntField(term723343, term723343.getClass(), "sourcePosition", 0);
        setField(term723343, term723343.getClass(), "jsType", null);
        setField(term723343, term723343.getClass(), "parent", null);
        setField(term723342, term723342.getClass(), "first", term723343);
        setField(term723342, term723342.getClass(), "last", null);
        setField(term723342, term723342.getClass(), "propListHead", null);
        setIntField(term723342, term723342.getClass(), "sourcePosition", 0);
        setField(term723342, term723342.getClass(), "jsType", null);
        setField(term723342, term723342.getClass(), "parent", null);
        term723276 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term723278 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term723288 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term723276, term723276.getClass(), "str", null);
        setIntField(term723276, term723276.getClass(), "type", 14);
        setField(term723276, term723276.getClass(), "next", null);
        setField(term723278, term723278.getClass(), "functionName", null);
        setBooleanField(term723278, term723278.getClass(), "itsNeedsActivation", false);
        setIntField(term723278, term723278.getClass(), "itsFunctionType", 0);
        setBooleanField(term723278, term723278.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term723278, term723278.getClass(), "encodedSourceStart", 0);
        setIntField(term723278, term723278.getClass(), "encodedSourceEnd", 0);
        setField(term723278, term723278.getClass(), "sourceName", null);
        setIntField(term723278, term723278.getClass(), "baseLineno", 0);
        setIntField(term723278, term723278.getClass(), "endLineno", 0);
        setField(term723278, term723278.getClass(), "functions", null);
        setField(term723278, term723278.getClass(), "regexps", null);
        setField(term723278, term723278.getClass(), "itsVariables", null);
        setField(term723278, term723278.getClass(), "itsConst", null);
        setField(term723278, term723278.getClass(), "itsVariableNames", null);
        setIntField(term723278, term723278.getClass(), "varStart", 0);
        setField(term723278, term723278.getClass(), "compilerData", null);
        setIntField(term723278, term723278.getClass(), "type", 42);
        setField(term723288, term723288.getClass(), "str", null);
        setIntField(term723288, term723288.getClass(), "type", 0);
        setField(term723288, term723288.getClass(), "next", null);
        setField(term723288, term723288.getClass(), "first", null);
        setField(term723288, term723288.getClass(), "last", null);
        setField(term723288, term723288.getClass(), "propListHead", null);
        setIntField(term723288, term723288.getClass(), "sourcePosition", 0);
        setField(term723288, term723288.getClass(), "jsType", null);
        setField(term723288, term723288.getClass(), "parent", null);
        setField(term723278, term723278.getClass(), "next", term723288);
        setField(term723278, term723278.getClass(), "first", null);
        setField(term723278, term723278.getClass(), "last", null);
        setField(term723278, term723278.getClass(), "propListHead", null);
        setIntField(term723278, term723278.getClass(), "sourcePosition", 0);
        setField(term723278, term723278.getClass(), "jsType", null);
        setField(term723278, term723278.getClass(), "parent", null);
        setField(term723276, term723276.getClass(), "first", term723278);
        setField(term723276, term723276.getClass(), "last", null);
        setField(term723276, term723276.getClass(), "propListHead", null);
        setIntField(term723276, term723276.getClass(), "sourcePosition", 0);
        setField(term723276, term723276.getClass(), "jsType", null);
        setField(term723276, term723276.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term723083;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term722991, args);
        assertTrue(recursiveEquals(term722991, term723341));
        assertTrue(recursiveEquals(term723083, term723342));
        assertTrue(recursiveEquals(retValue, term723276));
    }

};


