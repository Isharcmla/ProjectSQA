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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293007;
     Object term293099;
     Object term293350;
     Object term293351;
     Object term293293;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293007 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term293099 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term293191 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term293277 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term293191, term293191.getClass(), "next", term293277);
        setIntField(term293191, term293191.getClass(), "type", 39);
        setField(term293099, term293099.getClass(), "first", term293191);
        setIntField(term293099, term293099.getClass(), "type", 22);
        term293350 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term293350, term293350.getClass(), "currentTraversal", null);
        term293351 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term293352 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term293353 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term293351, term293351.getClass(), "number", 0.0);
        setIntField(term293351, term293351.getClass(), "type", 22);
        setField(term293351, term293351.getClass(), "next", null);
        setDoubleField(term293352, term293352.getClass(), "number", 0.0);
        setIntField(term293352, term293352.getClass(), "type", 39);
        setField(term293353, term293353.getClass(), "functionName", null);
        setBooleanField(term293353, term293353.getClass(), "itsNeedsActivation", false);
        setIntField(term293353, term293353.getClass(), "itsFunctionType", 0);
        setBooleanField(term293353, term293353.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term293353, term293353.getClass(), "encodedSourceStart", 0);
        setIntField(term293353, term293353.getClass(), "encodedSourceEnd", 0);
        setField(term293353, term293353.getClass(), "sourceName", null);
        setIntField(term293353, term293353.getClass(), "baseLineno", 0);
        setIntField(term293353, term293353.getClass(), "endLineno", 0);
        setField(term293353, term293353.getClass(), "functions", null);
        setField(term293353, term293353.getClass(), "regexps", null);
        setField(term293353, term293353.getClass(), "itsVariables", null);
        setField(term293353, term293353.getClass(), "itsConst", null);
        setField(term293353, term293353.getClass(), "itsVariableNames", null);
        setIntField(term293353, term293353.getClass(), "varStart", 0);
        setField(term293353, term293353.getClass(), "compilerData", null);
        setIntField(term293353, term293353.getClass(), "type", 0);
        setField(term293353, term293353.getClass(), "next", null);
        setField(term293353, term293353.getClass(), "first", null);
        setField(term293353, term293353.getClass(), "last", null);
        setField(term293353, term293353.getClass(), "propListHead", null);
        setIntField(term293353, term293353.getClass(), "sourcePosition", 0);
        setField(term293353, term293353.getClass(), "jsType", null);
        setField(term293353, term293353.getClass(), "parent", null);
        setField(term293352, term293352.getClass(), "next", term293353);
        setField(term293352, term293352.getClass(), "first", null);
        setField(term293352, term293352.getClass(), "last", null);
        setField(term293352, term293352.getClass(), "propListHead", null);
        setIntField(term293352, term293352.getClass(), "sourcePosition", 0);
        setField(term293352, term293352.getClass(), "jsType", null);
        setField(term293352, term293352.getClass(), "parent", null);
        setField(term293351, term293351.getClass(), "first", term293352);
        setField(term293351, term293351.getClass(), "last", null);
        setField(term293351, term293351.getClass(), "propListHead", null);
        setIntField(term293351, term293351.getClass(), "sourcePosition", 0);
        setField(term293351, term293351.getClass(), "jsType", null);
        setField(term293351, term293351.getClass(), "parent", null);
        term293293 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term293296 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term293299 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term293293, term293293.getClass(), "number", 0.0);
        setIntField(term293293, term293293.getClass(), "type", 22);
        setField(term293293, term293293.getClass(), "next", null);
        setDoubleField(term293296, term293296.getClass(), "number", 0.0);
        setIntField(term293296, term293296.getClass(), "type", 39);
        setField(term293299, term293299.getClass(), "functionName", null);
        setBooleanField(term293299, term293299.getClass(), "itsNeedsActivation", false);
        setIntField(term293299, term293299.getClass(), "itsFunctionType", 0);
        setBooleanField(term293299, term293299.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term293299, term293299.getClass(), "encodedSourceStart", 0);
        setIntField(term293299, term293299.getClass(), "encodedSourceEnd", 0);
        setField(term293299, term293299.getClass(), "sourceName", null);
        setIntField(term293299, term293299.getClass(), "baseLineno", 0);
        setIntField(term293299, term293299.getClass(), "endLineno", 0);
        setField(term293299, term293299.getClass(), "functions", null);
        setField(term293299, term293299.getClass(), "regexps", null);
        setField(term293299, term293299.getClass(), "itsVariables", null);
        setField(term293299, term293299.getClass(), "itsConst", null);
        setField(term293299, term293299.getClass(), "itsVariableNames", null);
        setIntField(term293299, term293299.getClass(), "varStart", 0);
        setField(term293299, term293299.getClass(), "compilerData", null);
        setIntField(term293299, term293299.getClass(), "type", 0);
        setField(term293299, term293299.getClass(), "next", null);
        setField(term293299, term293299.getClass(), "first", null);
        setField(term293299, term293299.getClass(), "last", null);
        setField(term293299, term293299.getClass(), "propListHead", null);
        setIntField(term293299, term293299.getClass(), "sourcePosition", 0);
        setField(term293299, term293299.getClass(), "jsType", null);
        setField(term293299, term293299.getClass(), "parent", null);
        setField(term293296, term293296.getClass(), "next", term293299);
        setField(term293296, term293296.getClass(), "first", null);
        setField(term293296, term293296.getClass(), "last", null);
        setField(term293296, term293296.getClass(), "propListHead", null);
        setIntField(term293296, term293296.getClass(), "sourcePosition", 0);
        setField(term293296, term293296.getClass(), "jsType", null);
        setField(term293296, term293296.getClass(), "parent", null);
        setField(term293293, term293293.getClass(), "first", term293296);
        setField(term293293, term293293.getClass(), "last", null);
        setField(term293293, term293293.getClass(), "propListHead", null);
        setIntField(term293293, term293293.getClass(), "sourcePosition", 0);
        setField(term293293, term293293.getClass(), "jsType", null);
        setField(term293293, term293293.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term293099;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term293007, args);
        assertTrue(recursiveEquals(term293007, term293350));
        assertTrue(recursiveEquals(term293099, term293351));
        assertTrue(recursiveEquals(retValue, term293293));
    }

};


