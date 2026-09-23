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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559620;
     Object term559712;
     Object term560345;
     Object term560346;
     Object term560296;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term559620 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term559712 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term559798 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term559868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term559798, term559798.getClass(), "next", term559868);
        setField(term559712, term559712.getClass(), "first", term559798);
        setIntField(term559712, term559712.getClass(), "type", 35);
        term560345 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term560345, term560345.getClass(), "currentTraversal", null);
        term560346 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term560347 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term560348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term560346, term560346.getClass(), "number", 0.0);
        setIntField(term560346, term560346.getClass(), "type", 35);
        setField(term560346, term560346.getClass(), "next", null);
        setField(term560347, term560347.getClass(), "functionName", null);
        setBooleanField(term560347, term560347.getClass(), "itsNeedsActivation", false);
        setIntField(term560347, term560347.getClass(), "itsFunctionType", 0);
        setBooleanField(term560347, term560347.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term560347, term560347.getClass(), "encodedSourceStart", 0);
        setIntField(term560347, term560347.getClass(), "encodedSourceEnd", 0);
        setField(term560347, term560347.getClass(), "sourceName", null);
        setIntField(term560347, term560347.getClass(), "baseLineno", 0);
        setIntField(term560347, term560347.getClass(), "endLineno", 0);
        setField(term560347, term560347.getClass(), "functions", null);
        setField(term560347, term560347.getClass(), "regexps", null);
        setField(term560347, term560347.getClass(), "itsVariables", null);
        setField(term560347, term560347.getClass(), "itsConst", null);
        setField(term560347, term560347.getClass(), "itsVariableNames", null);
        setIntField(term560347, term560347.getClass(), "varStart", 0);
        setField(term560347, term560347.getClass(), "compilerData", null);
        setIntField(term560347, term560347.getClass(), "type", 0);
        setIntField(term560348, term560348.getClass(), "type", 0);
        setField(term560348, term560348.getClass(), "next", null);
        setField(term560348, term560348.getClass(), "first", null);
        setField(term560348, term560348.getClass(), "last", null);
        setField(term560348, term560348.getClass(), "propListHead", null);
        setIntField(term560348, term560348.getClass(), "sourcePosition", 0);
        setField(term560348, term560348.getClass(), "jsType", null);
        setField(term560348, term560348.getClass(), "parent", null);
        setField(term560347, term560347.getClass(), "next", term560348);
        setField(term560347, term560347.getClass(), "first", null);
        setField(term560347, term560347.getClass(), "last", null);
        setField(term560347, term560347.getClass(), "propListHead", null);
        setIntField(term560347, term560347.getClass(), "sourcePosition", 0);
        setField(term560347, term560347.getClass(), "jsType", null);
        setField(term560347, term560347.getClass(), "parent", null);
        setField(term560346, term560346.getClass(), "first", term560347);
        setField(term560346, term560346.getClass(), "last", null);
        setField(term560346, term560346.getClass(), "propListHead", null);
        setIntField(term560346, term560346.getClass(), "sourcePosition", 0);
        setField(term560346, term560346.getClass(), "jsType", null);
        setField(term560346, term560346.getClass(), "parent", null);
        term560296 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term560299 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term560309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term560296, term560296.getClass(), "number", 0.0);
        setIntField(term560296, term560296.getClass(), "type", 35);
        setField(term560296, term560296.getClass(), "next", null);
        setField(term560299, term560299.getClass(), "functionName", null);
        setBooleanField(term560299, term560299.getClass(), "itsNeedsActivation", false);
        setIntField(term560299, term560299.getClass(), "itsFunctionType", 0);
        setBooleanField(term560299, term560299.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term560299, term560299.getClass(), "encodedSourceStart", 0);
        setIntField(term560299, term560299.getClass(), "encodedSourceEnd", 0);
        setField(term560299, term560299.getClass(), "sourceName", null);
        setIntField(term560299, term560299.getClass(), "baseLineno", 0);
        setIntField(term560299, term560299.getClass(), "endLineno", 0);
        setField(term560299, term560299.getClass(), "functions", null);
        setField(term560299, term560299.getClass(), "regexps", null);
        setField(term560299, term560299.getClass(), "itsVariables", null);
        setField(term560299, term560299.getClass(), "itsConst", null);
        setField(term560299, term560299.getClass(), "itsVariableNames", null);
        setIntField(term560299, term560299.getClass(), "varStart", 0);
        setField(term560299, term560299.getClass(), "compilerData", null);
        setIntField(term560299, term560299.getClass(), "type", 0);
        setIntField(term560309, term560309.getClass(), "type", 0);
        setField(term560309, term560309.getClass(), "next", null);
        setField(term560309, term560309.getClass(), "first", null);
        setField(term560309, term560309.getClass(), "last", null);
        setField(term560309, term560309.getClass(), "propListHead", null);
        setIntField(term560309, term560309.getClass(), "sourcePosition", 0);
        setField(term560309, term560309.getClass(), "jsType", null);
        setField(term560309, term560309.getClass(), "parent", null);
        setField(term560299, term560299.getClass(), "next", term560309);
        setField(term560299, term560299.getClass(), "first", null);
        setField(term560299, term560299.getClass(), "last", null);
        setField(term560299, term560299.getClass(), "propListHead", null);
        setIntField(term560299, term560299.getClass(), "sourcePosition", 0);
        setField(term560299, term560299.getClass(), "jsType", null);
        setField(term560299, term560299.getClass(), "parent", null);
        setField(term560296, term560296.getClass(), "first", term560299);
        setField(term560296, term560296.getClass(), "last", null);
        setField(term560296, term560296.getClass(), "propListHead", null);
        setIntField(term560296, term560296.getClass(), "sourcePosition", 0);
        setField(term560296, term560296.getClass(), "jsType", null);
        setField(term560296, term560296.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term559712;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term559620, args);
        assertTrue(recursiveEquals(term559620, term560345));
        assertTrue(recursiveEquals(term559712, term560346));
        assertTrue(recursiveEquals(retValue, term560296));
    }

};


