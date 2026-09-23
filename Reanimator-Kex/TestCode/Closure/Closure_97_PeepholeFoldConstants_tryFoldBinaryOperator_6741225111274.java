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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426337;
     Object term426429;
     Object term426695;
     Object term426696;
     Object term426623;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term426337 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term426429 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term426521 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term426607 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term426521, term426521.getClass(), "next", term426607);
        setIntField(term426521, term426521.getClass(), "type", 14);
        setField(term426429, term426429.getClass(), "first", term426521);
        setIntField(term426429, term426429.getClass(), "type", 14);
        term426695 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term426695, term426695.getClass(), "currentTraversal", null);
        term426696 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term426697 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term426698 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term426696, term426696.getClass(), "number", 0.0);
        setIntField(term426696, term426696.getClass(), "type", 14);
        setField(term426696, term426696.getClass(), "next", null);
        setDoubleField(term426697, term426697.getClass(), "number", 0.0);
        setIntField(term426697, term426697.getClass(), "type", 14);
        setField(term426698, term426698.getClass(), "functionName", null);
        setBooleanField(term426698, term426698.getClass(), "itsNeedsActivation", false);
        setIntField(term426698, term426698.getClass(), "itsFunctionType", 0);
        setBooleanField(term426698, term426698.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term426698, term426698.getClass(), "encodedSourceStart", 0);
        setIntField(term426698, term426698.getClass(), "encodedSourceEnd", 0);
        setField(term426698, term426698.getClass(), "sourceName", null);
        setIntField(term426698, term426698.getClass(), "baseLineno", 0);
        setIntField(term426698, term426698.getClass(), "endLineno", 0);
        setField(term426698, term426698.getClass(), "functions", null);
        setField(term426698, term426698.getClass(), "regexps", null);
        setField(term426698, term426698.getClass(), "itsVariables", null);
        setField(term426698, term426698.getClass(), "itsConst", null);
        setField(term426698, term426698.getClass(), "itsVariableNames", null);
        setIntField(term426698, term426698.getClass(), "varStart", 0);
        setField(term426698, term426698.getClass(), "compilerData", null);
        setIntField(term426698, term426698.getClass(), "type", 0);
        setField(term426698, term426698.getClass(), "next", null);
        setField(term426698, term426698.getClass(), "first", null);
        setField(term426698, term426698.getClass(), "last", null);
        setField(term426698, term426698.getClass(), "propListHead", null);
        setIntField(term426698, term426698.getClass(), "sourcePosition", 0);
        setField(term426698, term426698.getClass(), "jsType", null);
        setField(term426698, term426698.getClass(), "parent", null);
        setField(term426697, term426697.getClass(), "next", term426698);
        setField(term426697, term426697.getClass(), "first", null);
        setField(term426697, term426697.getClass(), "last", null);
        setField(term426697, term426697.getClass(), "propListHead", null);
        setIntField(term426697, term426697.getClass(), "sourcePosition", 0);
        setField(term426697, term426697.getClass(), "jsType", null);
        setField(term426697, term426697.getClass(), "parent", null);
        setField(term426696, term426696.getClass(), "first", term426697);
        setField(term426696, term426696.getClass(), "last", null);
        setField(term426696, term426696.getClass(), "propListHead", null);
        setIntField(term426696, term426696.getClass(), "sourcePosition", 0);
        setField(term426696, term426696.getClass(), "jsType", null);
        setField(term426696, term426696.getClass(), "parent", null);
        term426623 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term426626 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term426629 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term426623, term426623.getClass(), "number", 0.0);
        setIntField(term426623, term426623.getClass(), "type", 14);
        setField(term426623, term426623.getClass(), "next", null);
        setDoubleField(term426626, term426626.getClass(), "number", 0.0);
        setIntField(term426626, term426626.getClass(), "type", 14);
        setField(term426629, term426629.getClass(), "functionName", null);
        setBooleanField(term426629, term426629.getClass(), "itsNeedsActivation", false);
        setIntField(term426629, term426629.getClass(), "itsFunctionType", 0);
        setBooleanField(term426629, term426629.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term426629, term426629.getClass(), "encodedSourceStart", 0);
        setIntField(term426629, term426629.getClass(), "encodedSourceEnd", 0);
        setField(term426629, term426629.getClass(), "sourceName", null);
        setIntField(term426629, term426629.getClass(), "baseLineno", 0);
        setIntField(term426629, term426629.getClass(), "endLineno", 0);
        setField(term426629, term426629.getClass(), "functions", null);
        setField(term426629, term426629.getClass(), "regexps", null);
        setField(term426629, term426629.getClass(), "itsVariables", null);
        setField(term426629, term426629.getClass(), "itsConst", null);
        setField(term426629, term426629.getClass(), "itsVariableNames", null);
        setIntField(term426629, term426629.getClass(), "varStart", 0);
        setField(term426629, term426629.getClass(), "compilerData", null);
        setIntField(term426629, term426629.getClass(), "type", 0);
        setField(term426629, term426629.getClass(), "next", null);
        setField(term426629, term426629.getClass(), "first", null);
        setField(term426629, term426629.getClass(), "last", null);
        setField(term426629, term426629.getClass(), "propListHead", null);
        setIntField(term426629, term426629.getClass(), "sourcePosition", 0);
        setField(term426629, term426629.getClass(), "jsType", null);
        setField(term426629, term426629.getClass(), "parent", null);
        setField(term426626, term426626.getClass(), "next", term426629);
        setField(term426626, term426626.getClass(), "first", null);
        setField(term426626, term426626.getClass(), "last", null);
        setField(term426626, term426626.getClass(), "propListHead", null);
        setIntField(term426626, term426626.getClass(), "sourcePosition", 0);
        setField(term426626, term426626.getClass(), "jsType", null);
        setField(term426626, term426626.getClass(), "parent", null);
        setField(term426623, term426623.getClass(), "first", term426626);
        setField(term426623, term426623.getClass(), "last", null);
        setField(term426623, term426623.getClass(), "propListHead", null);
        setIntField(term426623, term426623.getClass(), "sourcePosition", 0);
        setField(term426623, term426623.getClass(), "jsType", null);
        setField(term426623, term426623.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term426429;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term426337, args);
        assertTrue(recursiveEquals(term426337, term426695));
        assertTrue(recursiveEquals(term426429, term426696));
        assertTrue(recursiveEquals(retValue, term426623));
    }

};


