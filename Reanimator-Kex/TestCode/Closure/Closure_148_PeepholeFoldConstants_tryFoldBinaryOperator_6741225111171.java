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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276388;
     Object term276480;
     Object term277168;
     Object term277169;
     Object term277118;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276388 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term276480 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term276566 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term276636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term276566, term276566.getClass(), "next", term276636);
        setField(term276480, term276480.getClass(), "first", term276566);
        setIntField(term276480, term276480.getClass(), "type", 45);
        term277168 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term277168, term277168.getClass(), "currentTraversal", null);
        term277169 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term277170 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term277171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term277169, term277169.getClass(), "str", null);
        setIntField(term277169, term277169.getClass(), "type", 45);
        setField(term277169, term277169.getClass(), "next", null);
        setField(term277170, term277170.getClass(), "functionName", null);
        setBooleanField(term277170, term277170.getClass(), "itsNeedsActivation", false);
        setIntField(term277170, term277170.getClass(), "itsFunctionType", 0);
        setBooleanField(term277170, term277170.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term277170, term277170.getClass(), "encodedSourceStart", 0);
        setIntField(term277170, term277170.getClass(), "encodedSourceEnd", 0);
        setField(term277170, term277170.getClass(), "sourceName", null);
        setIntField(term277170, term277170.getClass(), "baseLineno", 0);
        setIntField(term277170, term277170.getClass(), "endLineno", 0);
        setField(term277170, term277170.getClass(), "functions", null);
        setField(term277170, term277170.getClass(), "regexps", null);
        setField(term277170, term277170.getClass(), "itsVariables", null);
        setField(term277170, term277170.getClass(), "itsConst", null);
        setField(term277170, term277170.getClass(), "itsVariableNames", null);
        setIntField(term277170, term277170.getClass(), "varStart", 0);
        setField(term277170, term277170.getClass(), "compilerData", null);
        setIntField(term277170, term277170.getClass(), "type", 0);
        setIntField(term277171, term277171.getClass(), "type", 0);
        setField(term277171, term277171.getClass(), "next", null);
        setField(term277171, term277171.getClass(), "first", null);
        setField(term277171, term277171.getClass(), "last", null);
        setField(term277171, term277171.getClass(), "propListHead", null);
        setIntField(term277171, term277171.getClass(), "sourcePosition", 0);
        setField(term277171, term277171.getClass(), "jsType", null);
        setField(term277171, term277171.getClass(), "parent", null);
        setField(term277170, term277170.getClass(), "next", term277171);
        setField(term277170, term277170.getClass(), "first", null);
        setField(term277170, term277170.getClass(), "last", null);
        setField(term277170, term277170.getClass(), "propListHead", null);
        setIntField(term277170, term277170.getClass(), "sourcePosition", 0);
        setField(term277170, term277170.getClass(), "jsType", null);
        setField(term277170, term277170.getClass(), "parent", null);
        setField(term277169, term277169.getClass(), "first", term277170);
        setField(term277169, term277169.getClass(), "last", null);
        setField(term277169, term277169.getClass(), "propListHead", null);
        setIntField(term277169, term277169.getClass(), "sourcePosition", 0);
        setField(term277169, term277169.getClass(), "jsType", null);
        setField(term277169, term277169.getClass(), "parent", null);
        term277118 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term277120 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term277130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term277118, term277118.getClass(), "str", null);
        setIntField(term277118, term277118.getClass(), "type", 45);
        setField(term277118, term277118.getClass(), "next", null);
        setField(term277120, term277120.getClass(), "functionName", null);
        setBooleanField(term277120, term277120.getClass(), "itsNeedsActivation", false);
        setIntField(term277120, term277120.getClass(), "itsFunctionType", 0);
        setBooleanField(term277120, term277120.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term277120, term277120.getClass(), "encodedSourceStart", 0);
        setIntField(term277120, term277120.getClass(), "encodedSourceEnd", 0);
        setField(term277120, term277120.getClass(), "sourceName", null);
        setIntField(term277120, term277120.getClass(), "baseLineno", 0);
        setIntField(term277120, term277120.getClass(), "endLineno", 0);
        setField(term277120, term277120.getClass(), "functions", null);
        setField(term277120, term277120.getClass(), "regexps", null);
        setField(term277120, term277120.getClass(), "itsVariables", null);
        setField(term277120, term277120.getClass(), "itsConst", null);
        setField(term277120, term277120.getClass(), "itsVariableNames", null);
        setIntField(term277120, term277120.getClass(), "varStart", 0);
        setField(term277120, term277120.getClass(), "compilerData", null);
        setIntField(term277120, term277120.getClass(), "type", 0);
        setIntField(term277130, term277130.getClass(), "type", 0);
        setField(term277130, term277130.getClass(), "next", null);
        setField(term277130, term277130.getClass(), "first", null);
        setField(term277130, term277130.getClass(), "last", null);
        setField(term277130, term277130.getClass(), "propListHead", null);
        setIntField(term277130, term277130.getClass(), "sourcePosition", 0);
        setField(term277130, term277130.getClass(), "jsType", null);
        setField(term277130, term277130.getClass(), "parent", null);
        setField(term277120, term277120.getClass(), "next", term277130);
        setField(term277120, term277120.getClass(), "first", null);
        setField(term277120, term277120.getClass(), "last", null);
        setField(term277120, term277120.getClass(), "propListHead", null);
        setIntField(term277120, term277120.getClass(), "sourcePosition", 0);
        setField(term277120, term277120.getClass(), "jsType", null);
        setField(term277120, term277120.getClass(), "parent", null);
        setField(term277118, term277118.getClass(), "first", term277120);
        setField(term277118, term277118.getClass(), "last", null);
        setField(term277118, term277118.getClass(), "propListHead", null);
        setIntField(term277118, term277118.getClass(), "sourcePosition", 0);
        setField(term277118, term277118.getClass(), "jsType", null);
        setField(term277118, term277118.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term276480;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term276388, args);
        assertTrue(recursiveEquals(term276388, term277168));
        assertTrue(recursiveEquals(term276480, term277169));
        assertTrue(recursiveEquals(retValue, term277118));
    }

};


