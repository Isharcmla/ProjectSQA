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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term721606;
     Object term721698;
     Object term722435;
     Object term722436;
     Object term722347;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term721606 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term721698 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term721784 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term721870 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term721870, term721870.getClass(), "type", 42);
        setField(term721784, term721784.getClass(), "next", term721870);
        setIntField(term721784, term721784.getClass(), "type", 42);
        setField(term721698, term721698.getClass(), "first", term721784);
        setIntField(term721698, term721698.getClass(), "type", 14);
        term722435 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term722435, term722435.getClass(), "currentTraversal", null);
        term722436 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term722437 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term722438 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term722436, term722436.getClass(), "number", 0.0);
        setIntField(term722436, term722436.getClass(), "type", 14);
        setField(term722436, term722436.getClass(), "next", null);
        setField(term722437, term722437.getClass(), "functionName", null);
        setBooleanField(term722437, term722437.getClass(), "itsNeedsActivation", false);
        setIntField(term722437, term722437.getClass(), "itsFunctionType", 0);
        setBooleanField(term722437, term722437.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term722437, term722437.getClass(), "encodedSourceStart", 0);
        setIntField(term722437, term722437.getClass(), "encodedSourceEnd", 0);
        setField(term722437, term722437.getClass(), "sourceName", null);
        setIntField(term722437, term722437.getClass(), "baseLineno", 0);
        setIntField(term722437, term722437.getClass(), "endLineno", 0);
        setField(term722437, term722437.getClass(), "functions", null);
        setField(term722437, term722437.getClass(), "regexps", null);
        setField(term722437, term722437.getClass(), "itsVariables", null);
        setField(term722437, term722437.getClass(), "itsConst", null);
        setField(term722437, term722437.getClass(), "itsVariableNames", null);
        setIntField(term722437, term722437.getClass(), "varStart", 0);
        setField(term722437, term722437.getClass(), "compilerData", null);
        setIntField(term722437, term722437.getClass(), "type", 42);
        setField(term722438, term722438.getClass(), "functionName", null);
        setBooleanField(term722438, term722438.getClass(), "itsNeedsActivation", false);
        setIntField(term722438, term722438.getClass(), "itsFunctionType", 0);
        setBooleanField(term722438, term722438.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term722438, term722438.getClass(), "encodedSourceStart", 0);
        setIntField(term722438, term722438.getClass(), "encodedSourceEnd", 0);
        setField(term722438, term722438.getClass(), "sourceName", null);
        setIntField(term722438, term722438.getClass(), "baseLineno", 0);
        setIntField(term722438, term722438.getClass(), "endLineno", 0);
        setField(term722438, term722438.getClass(), "functions", null);
        setField(term722438, term722438.getClass(), "regexps", null);
        setField(term722438, term722438.getClass(), "itsVariables", null);
        setField(term722438, term722438.getClass(), "itsConst", null);
        setField(term722438, term722438.getClass(), "itsVariableNames", null);
        setIntField(term722438, term722438.getClass(), "varStart", 0);
        setField(term722438, term722438.getClass(), "compilerData", null);
        setIntField(term722438, term722438.getClass(), "type", 42);
        setField(term722438, term722438.getClass(), "next", null);
        setField(term722438, term722438.getClass(), "first", null);
        setField(term722438, term722438.getClass(), "last", null);
        setField(term722438, term722438.getClass(), "propListHead", null);
        setIntField(term722438, term722438.getClass(), "sourcePosition", 0);
        setField(term722438, term722438.getClass(), "jsType", null);
        setField(term722438, term722438.getClass(), "parent", null);
        setField(term722437, term722437.getClass(), "next", term722438);
        setField(term722437, term722437.getClass(), "first", null);
        setField(term722437, term722437.getClass(), "last", null);
        setField(term722437, term722437.getClass(), "propListHead", null);
        setIntField(term722437, term722437.getClass(), "sourcePosition", 0);
        setField(term722437, term722437.getClass(), "jsType", null);
        setField(term722437, term722437.getClass(), "parent", null);
        setField(term722436, term722436.getClass(), "first", term722437);
        setField(term722436, term722436.getClass(), "last", null);
        setField(term722436, term722436.getClass(), "propListHead", null);
        setIntField(term722436, term722436.getClass(), "sourcePosition", 0);
        setField(term722436, term722436.getClass(), "jsType", null);
        setField(term722436, term722436.getClass(), "parent", null);
        term722347 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term722350 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term722360 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term722347, term722347.getClass(), "number", 0.0);
        setIntField(term722347, term722347.getClass(), "type", 14);
        setField(term722347, term722347.getClass(), "next", null);
        setField(term722350, term722350.getClass(), "functionName", null);
        setBooleanField(term722350, term722350.getClass(), "itsNeedsActivation", false);
        setIntField(term722350, term722350.getClass(), "itsFunctionType", 0);
        setBooleanField(term722350, term722350.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term722350, term722350.getClass(), "encodedSourceStart", 0);
        setIntField(term722350, term722350.getClass(), "encodedSourceEnd", 0);
        setField(term722350, term722350.getClass(), "sourceName", null);
        setIntField(term722350, term722350.getClass(), "baseLineno", 0);
        setIntField(term722350, term722350.getClass(), "endLineno", 0);
        setField(term722350, term722350.getClass(), "functions", null);
        setField(term722350, term722350.getClass(), "regexps", null);
        setField(term722350, term722350.getClass(), "itsVariables", null);
        setField(term722350, term722350.getClass(), "itsConst", null);
        setField(term722350, term722350.getClass(), "itsVariableNames", null);
        setIntField(term722350, term722350.getClass(), "varStart", 0);
        setField(term722350, term722350.getClass(), "compilerData", null);
        setIntField(term722350, term722350.getClass(), "type", 42);
        setField(term722360, term722360.getClass(), "functionName", null);
        setBooleanField(term722360, term722360.getClass(), "itsNeedsActivation", false);
        setIntField(term722360, term722360.getClass(), "itsFunctionType", 0);
        setBooleanField(term722360, term722360.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term722360, term722360.getClass(), "encodedSourceStart", 0);
        setIntField(term722360, term722360.getClass(), "encodedSourceEnd", 0);
        setField(term722360, term722360.getClass(), "sourceName", null);
        setIntField(term722360, term722360.getClass(), "baseLineno", 0);
        setIntField(term722360, term722360.getClass(), "endLineno", 0);
        setField(term722360, term722360.getClass(), "functions", null);
        setField(term722360, term722360.getClass(), "regexps", null);
        setField(term722360, term722360.getClass(), "itsVariables", null);
        setField(term722360, term722360.getClass(), "itsConst", null);
        setField(term722360, term722360.getClass(), "itsVariableNames", null);
        setIntField(term722360, term722360.getClass(), "varStart", 0);
        setField(term722360, term722360.getClass(), "compilerData", null);
        setIntField(term722360, term722360.getClass(), "type", 42);
        setField(term722360, term722360.getClass(), "next", null);
        setField(term722360, term722360.getClass(), "first", null);
        setField(term722360, term722360.getClass(), "last", null);
        setField(term722360, term722360.getClass(), "propListHead", null);
        setIntField(term722360, term722360.getClass(), "sourcePosition", 0);
        setField(term722360, term722360.getClass(), "jsType", null);
        setField(term722360, term722360.getClass(), "parent", null);
        setField(term722350, term722350.getClass(), "next", term722360);
        setField(term722350, term722350.getClass(), "first", null);
        setField(term722350, term722350.getClass(), "last", null);
        setField(term722350, term722350.getClass(), "propListHead", null);
        setIntField(term722350, term722350.getClass(), "sourcePosition", 0);
        setField(term722350, term722350.getClass(), "jsType", null);
        setField(term722350, term722350.getClass(), "parent", null);
        setField(term722347, term722347.getClass(), "first", term722350);
        setField(term722347, term722347.getClass(), "last", null);
        setField(term722347, term722347.getClass(), "propListHead", null);
        setIntField(term722347, term722347.getClass(), "sourcePosition", 0);
        setField(term722347, term722347.getClass(), "jsType", null);
        setField(term722347, term722347.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term721698;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term721606, args);
        assertTrue(recursiveEquals(term721606, term722435));
        assertTrue(recursiveEquals(term721698, term722436));
        assertTrue(recursiveEquals(retValue, term722347));
    }

};


