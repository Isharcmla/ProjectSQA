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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574149;
     Object term574241;
     Object term574472;
     Object term574473;
     Object term574412;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term574149 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term574241 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term574327 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term574397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term574327, term574327.getClass(), "next", term574397);
        setField(term574241, term574241.getClass(), "first", term574327);
        setIntField(term574241, term574241.getClass(), "type", 16);
        term574472 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term574472, term574472.getClass(), "currentTraversal", null);
        term574473 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term574474 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term574475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term574473, term574473.getClass(), "number", 0.0);
        setIntField(term574473, term574473.getClass(), "type", 16);
        setField(term574473, term574473.getClass(), "next", null);
        setField(term574474, term574474.getClass(), "functionName", null);
        setBooleanField(term574474, term574474.getClass(), "itsNeedsActivation", false);
        setIntField(term574474, term574474.getClass(), "itsFunctionType", 0);
        setBooleanField(term574474, term574474.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term574474, term574474.getClass(), "encodedSourceStart", 0);
        setIntField(term574474, term574474.getClass(), "encodedSourceEnd", 0);
        setField(term574474, term574474.getClass(), "sourceName", null);
        setIntField(term574474, term574474.getClass(), "baseLineno", 0);
        setIntField(term574474, term574474.getClass(), "endLineno", 0);
        setField(term574474, term574474.getClass(), "functions", null);
        setField(term574474, term574474.getClass(), "regexps", null);
        setField(term574474, term574474.getClass(), "itsVariables", null);
        setField(term574474, term574474.getClass(), "itsConst", null);
        setField(term574474, term574474.getClass(), "itsVariableNames", null);
        setIntField(term574474, term574474.getClass(), "varStart", 0);
        setField(term574474, term574474.getClass(), "compilerData", null);
        setIntField(term574474, term574474.getClass(), "type", 0);
        setIntField(term574475, term574475.getClass(), "type", 0);
        setField(term574475, term574475.getClass(), "next", null);
        setField(term574475, term574475.getClass(), "first", null);
        setField(term574475, term574475.getClass(), "last", null);
        setField(term574475, term574475.getClass(), "propListHead", null);
        setIntField(term574475, term574475.getClass(), "sourcePosition", 0);
        setField(term574475, term574475.getClass(), "jsType", null);
        setField(term574475, term574475.getClass(), "parent", null);
        setField(term574474, term574474.getClass(), "next", term574475);
        setField(term574474, term574474.getClass(), "first", null);
        setField(term574474, term574474.getClass(), "last", null);
        setField(term574474, term574474.getClass(), "propListHead", null);
        setIntField(term574474, term574474.getClass(), "sourcePosition", 0);
        setField(term574474, term574474.getClass(), "jsType", null);
        setField(term574474, term574474.getClass(), "parent", null);
        setField(term574473, term574473.getClass(), "first", term574474);
        setField(term574473, term574473.getClass(), "last", null);
        setField(term574473, term574473.getClass(), "propListHead", null);
        setIntField(term574473, term574473.getClass(), "sourcePosition", 0);
        setField(term574473, term574473.getClass(), "jsType", null);
        setField(term574473, term574473.getClass(), "parent", null);
        term574412 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term574415 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term574425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term574412, term574412.getClass(), "number", 0.0);
        setIntField(term574412, term574412.getClass(), "type", 16);
        setField(term574412, term574412.getClass(), "next", null);
        setField(term574415, term574415.getClass(), "functionName", null);
        setBooleanField(term574415, term574415.getClass(), "itsNeedsActivation", false);
        setIntField(term574415, term574415.getClass(), "itsFunctionType", 0);
        setBooleanField(term574415, term574415.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term574415, term574415.getClass(), "encodedSourceStart", 0);
        setIntField(term574415, term574415.getClass(), "encodedSourceEnd", 0);
        setField(term574415, term574415.getClass(), "sourceName", null);
        setIntField(term574415, term574415.getClass(), "baseLineno", 0);
        setIntField(term574415, term574415.getClass(), "endLineno", 0);
        setField(term574415, term574415.getClass(), "functions", null);
        setField(term574415, term574415.getClass(), "regexps", null);
        setField(term574415, term574415.getClass(), "itsVariables", null);
        setField(term574415, term574415.getClass(), "itsConst", null);
        setField(term574415, term574415.getClass(), "itsVariableNames", null);
        setIntField(term574415, term574415.getClass(), "varStart", 0);
        setField(term574415, term574415.getClass(), "compilerData", null);
        setIntField(term574415, term574415.getClass(), "type", 0);
        setIntField(term574425, term574425.getClass(), "type", 0);
        setField(term574425, term574425.getClass(), "next", null);
        setField(term574425, term574425.getClass(), "first", null);
        setField(term574425, term574425.getClass(), "last", null);
        setField(term574425, term574425.getClass(), "propListHead", null);
        setIntField(term574425, term574425.getClass(), "sourcePosition", 0);
        setField(term574425, term574425.getClass(), "jsType", null);
        setField(term574425, term574425.getClass(), "parent", null);
        setField(term574415, term574415.getClass(), "next", term574425);
        setField(term574415, term574415.getClass(), "first", null);
        setField(term574415, term574415.getClass(), "last", null);
        setField(term574415, term574415.getClass(), "propListHead", null);
        setIntField(term574415, term574415.getClass(), "sourcePosition", 0);
        setField(term574415, term574415.getClass(), "jsType", null);
        setField(term574415, term574415.getClass(), "parent", null);
        setField(term574412, term574412.getClass(), "first", term574415);
        setField(term574412, term574412.getClass(), "last", null);
        setField(term574412, term574412.getClass(), "propListHead", null);
        setIntField(term574412, term574412.getClass(), "sourcePosition", 0);
        setField(term574412, term574412.getClass(), "jsType", null);
        setField(term574412, term574412.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term574241;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term574149, args);
        assertTrue(recursiveEquals(term574149, term574472));
        assertTrue(recursiveEquals(term574241, term574473));
        assertTrue(recursiveEquals(retValue, term574412));
    }

};


