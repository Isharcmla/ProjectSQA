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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458708;
     Object term458800;
     Object term459372;
     Object term459373;
     Object term459325;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term458708 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term458800 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term458886 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term458956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term458886, term458886.getClass(), "next", term458956);
        setIntField(term458886, term458886.getClass(), "type", 39);
        setField(term458800, term458800.getClass(), "first", term458886);
        setIntField(term458800, term458800.getClass(), "type", 23);
        term459372 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term459372, term459372.getClass(), "currentTraversal", null);
        term459373 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term459374 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term459375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term459373, term459373.getClass(), "number", 0.0);
        setIntField(term459373, term459373.getClass(), "type", 23);
        setField(term459373, term459373.getClass(), "next", null);
        setField(term459374, term459374.getClass(), "functionName", null);
        setBooleanField(term459374, term459374.getClass(), "itsNeedsActivation", false);
        setIntField(term459374, term459374.getClass(), "itsFunctionType", 0);
        setBooleanField(term459374, term459374.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term459374, term459374.getClass(), "encodedSourceStart", 0);
        setIntField(term459374, term459374.getClass(), "encodedSourceEnd", 0);
        setField(term459374, term459374.getClass(), "sourceName", null);
        setIntField(term459374, term459374.getClass(), "baseLineno", 0);
        setIntField(term459374, term459374.getClass(), "endLineno", 0);
        setField(term459374, term459374.getClass(), "functions", null);
        setField(term459374, term459374.getClass(), "regexps", null);
        setField(term459374, term459374.getClass(), "itsVariables", null);
        setField(term459374, term459374.getClass(), "itsConst", null);
        setField(term459374, term459374.getClass(), "itsVariableNames", null);
        setIntField(term459374, term459374.getClass(), "varStart", 0);
        setField(term459374, term459374.getClass(), "compilerData", null);
        setIntField(term459374, term459374.getClass(), "type", 39);
        setIntField(term459375, term459375.getClass(), "type", 0);
        setField(term459375, term459375.getClass(), "next", null);
        setField(term459375, term459375.getClass(), "first", null);
        setField(term459375, term459375.getClass(), "last", null);
        setField(term459375, term459375.getClass(), "propListHead", null);
        setIntField(term459375, term459375.getClass(), "sourcePosition", 0);
        setField(term459375, term459375.getClass(), "jsType", null);
        setField(term459375, term459375.getClass(), "parent", null);
        setField(term459374, term459374.getClass(), "next", term459375);
        setField(term459374, term459374.getClass(), "first", null);
        setField(term459374, term459374.getClass(), "last", null);
        setField(term459374, term459374.getClass(), "propListHead", null);
        setIntField(term459374, term459374.getClass(), "sourcePosition", 0);
        setField(term459374, term459374.getClass(), "jsType", null);
        setField(term459374, term459374.getClass(), "parent", null);
        setField(term459373, term459373.getClass(), "first", term459374);
        setField(term459373, term459373.getClass(), "last", null);
        setField(term459373, term459373.getClass(), "propListHead", null);
        setIntField(term459373, term459373.getClass(), "sourcePosition", 0);
        setField(term459373, term459373.getClass(), "jsType", null);
        setField(term459373, term459373.getClass(), "parent", null);
        term459325 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term459328 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term459338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term459325, term459325.getClass(), "number", 0.0);
        setIntField(term459325, term459325.getClass(), "type", 23);
        setField(term459325, term459325.getClass(), "next", null);
        setField(term459328, term459328.getClass(), "functionName", null);
        setBooleanField(term459328, term459328.getClass(), "itsNeedsActivation", false);
        setIntField(term459328, term459328.getClass(), "itsFunctionType", 0);
        setBooleanField(term459328, term459328.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term459328, term459328.getClass(), "encodedSourceStart", 0);
        setIntField(term459328, term459328.getClass(), "encodedSourceEnd", 0);
        setField(term459328, term459328.getClass(), "sourceName", null);
        setIntField(term459328, term459328.getClass(), "baseLineno", 0);
        setIntField(term459328, term459328.getClass(), "endLineno", 0);
        setField(term459328, term459328.getClass(), "functions", null);
        setField(term459328, term459328.getClass(), "regexps", null);
        setField(term459328, term459328.getClass(), "itsVariables", null);
        setField(term459328, term459328.getClass(), "itsConst", null);
        setField(term459328, term459328.getClass(), "itsVariableNames", null);
        setIntField(term459328, term459328.getClass(), "varStart", 0);
        setField(term459328, term459328.getClass(), "compilerData", null);
        setIntField(term459328, term459328.getClass(), "type", 39);
        setIntField(term459338, term459338.getClass(), "type", 0);
        setField(term459338, term459338.getClass(), "next", null);
        setField(term459338, term459338.getClass(), "first", null);
        setField(term459338, term459338.getClass(), "last", null);
        setField(term459338, term459338.getClass(), "propListHead", null);
        setIntField(term459338, term459338.getClass(), "sourcePosition", 0);
        setField(term459338, term459338.getClass(), "jsType", null);
        setField(term459338, term459338.getClass(), "parent", null);
        setField(term459328, term459328.getClass(), "next", term459338);
        setField(term459328, term459328.getClass(), "first", null);
        setField(term459328, term459328.getClass(), "last", null);
        setField(term459328, term459328.getClass(), "propListHead", null);
        setIntField(term459328, term459328.getClass(), "sourcePosition", 0);
        setField(term459328, term459328.getClass(), "jsType", null);
        setField(term459328, term459328.getClass(), "parent", null);
        setField(term459325, term459325.getClass(), "first", term459328);
        setField(term459325, term459325.getClass(), "last", null);
        setField(term459325, term459325.getClass(), "propListHead", null);
        setIntField(term459325, term459325.getClass(), "sourcePosition", 0);
        setField(term459325, term459325.getClass(), "jsType", null);
        setField(term459325, term459325.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term458800;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term458708, args);
        assertTrue(recursiveEquals(term458708, term459372));
        assertTrue(recursiveEquals(term458800, term459373));
        assertTrue(recursiveEquals(retValue, term459325));
    }

};


