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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term734479;
     Object term734571;
     Object term735489;
     Object term735490;
     Object term735380;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term734479 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term734571 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term734657 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term734743 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term734813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term734743, term734743.getClass(), "type", 47);
        setField(term734657, term734657.getClass(), "next", term734743);
        setIntField(term734657, term734657.getClass(), "type", 0);
        setField(term734571, term734571.getClass(), "first", term734657);
        setIntField(term734571, term734571.getClass(), "type", 101);
        setIntField(term734813, term734813.getClass(), "type", 98);
        setField(term734571, term734571.getClass(), "parent", term734813);
        term735489 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term735489, term735489.getClass(), "currentTraversal", null);
        term735490 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term735491 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term735492 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term735493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term735490, term735490.getClass(), "str", null);
        setIntField(term735490, term735490.getClass(), "type", 101);
        setField(term735490, term735490.getClass(), "next", null);
        setField(term735491, term735491.getClass(), "functionName", null);
        setBooleanField(term735491, term735491.getClass(), "itsNeedsActivation", false);
        setIntField(term735491, term735491.getClass(), "itsFunctionType", 0);
        setBooleanField(term735491, term735491.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term735491, term735491.getClass(), "encodedSourceStart", 0);
        setIntField(term735491, term735491.getClass(), "encodedSourceEnd", 0);
        setField(term735491, term735491.getClass(), "sourceName", null);
        setIntField(term735491, term735491.getClass(), "baseLineno", 0);
        setIntField(term735491, term735491.getClass(), "endLineno", 0);
        setField(term735491, term735491.getClass(), "functions", null);
        setField(term735491, term735491.getClass(), "regexps", null);
        setField(term735491, term735491.getClass(), "itsVariables", null);
        setField(term735491, term735491.getClass(), "itsConst", null);
        setField(term735491, term735491.getClass(), "itsVariableNames", null);
        setIntField(term735491, term735491.getClass(), "varStart", 0);
        setField(term735491, term735491.getClass(), "compilerData", null);
        setIntField(term735491, term735491.getClass(), "type", 0);
        setField(term735492, term735492.getClass(), "functionName", null);
        setBooleanField(term735492, term735492.getClass(), "itsNeedsActivation", false);
        setIntField(term735492, term735492.getClass(), "itsFunctionType", 0);
        setBooleanField(term735492, term735492.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term735492, term735492.getClass(), "encodedSourceStart", 0);
        setIntField(term735492, term735492.getClass(), "encodedSourceEnd", 0);
        setField(term735492, term735492.getClass(), "sourceName", null);
        setIntField(term735492, term735492.getClass(), "baseLineno", 0);
        setIntField(term735492, term735492.getClass(), "endLineno", 0);
        setField(term735492, term735492.getClass(), "functions", null);
        setField(term735492, term735492.getClass(), "regexps", null);
        setField(term735492, term735492.getClass(), "itsVariables", null);
        setField(term735492, term735492.getClass(), "itsConst", null);
        setField(term735492, term735492.getClass(), "itsVariableNames", null);
        setIntField(term735492, term735492.getClass(), "varStart", 0);
        setField(term735492, term735492.getClass(), "compilerData", null);
        setIntField(term735492, term735492.getClass(), "type", 47);
        setField(term735492, term735492.getClass(), "next", null);
        setField(term735492, term735492.getClass(), "first", null);
        setField(term735492, term735492.getClass(), "last", null);
        setField(term735492, term735492.getClass(), "propListHead", null);
        setIntField(term735492, term735492.getClass(), "sourcePosition", 0);
        setField(term735492, term735492.getClass(), "jsType", null);
        setField(term735492, term735492.getClass(), "parent", null);
        setField(term735491, term735491.getClass(), "next", term735492);
        setField(term735491, term735491.getClass(), "first", null);
        setField(term735491, term735491.getClass(), "last", null);
        setField(term735491, term735491.getClass(), "propListHead", null);
        setIntField(term735491, term735491.getClass(), "sourcePosition", 0);
        setField(term735491, term735491.getClass(), "jsType", null);
        setField(term735491, term735491.getClass(), "parent", null);
        setField(term735490, term735490.getClass(), "first", term735491);
        setField(term735490, term735490.getClass(), "last", null);
        setField(term735490, term735490.getClass(), "propListHead", null);
        setIntField(term735490, term735490.getClass(), "sourcePosition", 0);
        setField(term735490, term735490.getClass(), "jsType", null);
        setIntField(term735493, term735493.getClass(), "type", 98);
        setField(term735493, term735493.getClass(), "next", null);
        setField(term735493, term735493.getClass(), "first", null);
        setField(term735493, term735493.getClass(), "last", null);
        setField(term735493, term735493.getClass(), "propListHead", null);
        setIntField(term735493, term735493.getClass(), "sourcePosition", 0);
        setField(term735493, term735493.getClass(), "jsType", null);
        setField(term735493, term735493.getClass(), "parent", null);
        setField(term735490, term735490.getClass(), "parent", term735493);
        term735380 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term735382 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term735392 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term735405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term735380, term735380.getClass(), "str", null);
        setIntField(term735380, term735380.getClass(), "type", 101);
        setField(term735380, term735380.getClass(), "next", null);
        setField(term735382, term735382.getClass(), "functionName", null);
        setBooleanField(term735382, term735382.getClass(), "itsNeedsActivation", false);
        setIntField(term735382, term735382.getClass(), "itsFunctionType", 0);
        setBooleanField(term735382, term735382.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term735382, term735382.getClass(), "encodedSourceStart", 0);
        setIntField(term735382, term735382.getClass(), "encodedSourceEnd", 0);
        setField(term735382, term735382.getClass(), "sourceName", null);
        setIntField(term735382, term735382.getClass(), "baseLineno", 0);
        setIntField(term735382, term735382.getClass(), "endLineno", 0);
        setField(term735382, term735382.getClass(), "functions", null);
        setField(term735382, term735382.getClass(), "regexps", null);
        setField(term735382, term735382.getClass(), "itsVariables", null);
        setField(term735382, term735382.getClass(), "itsConst", null);
        setField(term735382, term735382.getClass(), "itsVariableNames", null);
        setIntField(term735382, term735382.getClass(), "varStart", 0);
        setField(term735382, term735382.getClass(), "compilerData", null);
        setIntField(term735382, term735382.getClass(), "type", 0);
        setField(term735392, term735392.getClass(), "functionName", null);
        setBooleanField(term735392, term735392.getClass(), "itsNeedsActivation", false);
        setIntField(term735392, term735392.getClass(), "itsFunctionType", 0);
        setBooleanField(term735392, term735392.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term735392, term735392.getClass(), "encodedSourceStart", 0);
        setIntField(term735392, term735392.getClass(), "encodedSourceEnd", 0);
        setField(term735392, term735392.getClass(), "sourceName", null);
        setIntField(term735392, term735392.getClass(), "baseLineno", 0);
        setIntField(term735392, term735392.getClass(), "endLineno", 0);
        setField(term735392, term735392.getClass(), "functions", null);
        setField(term735392, term735392.getClass(), "regexps", null);
        setField(term735392, term735392.getClass(), "itsVariables", null);
        setField(term735392, term735392.getClass(), "itsConst", null);
        setField(term735392, term735392.getClass(), "itsVariableNames", null);
        setIntField(term735392, term735392.getClass(), "varStart", 0);
        setField(term735392, term735392.getClass(), "compilerData", null);
        setIntField(term735392, term735392.getClass(), "type", 47);
        setField(term735392, term735392.getClass(), "next", null);
        setField(term735392, term735392.getClass(), "first", null);
        setField(term735392, term735392.getClass(), "last", null);
        setField(term735392, term735392.getClass(), "propListHead", null);
        setIntField(term735392, term735392.getClass(), "sourcePosition", 0);
        setField(term735392, term735392.getClass(), "jsType", null);
        setField(term735392, term735392.getClass(), "parent", null);
        setField(term735382, term735382.getClass(), "next", term735392);
        setField(term735382, term735382.getClass(), "first", null);
        setField(term735382, term735382.getClass(), "last", null);
        setField(term735382, term735382.getClass(), "propListHead", null);
        setIntField(term735382, term735382.getClass(), "sourcePosition", 0);
        setField(term735382, term735382.getClass(), "jsType", null);
        setField(term735382, term735382.getClass(), "parent", null);
        setField(term735380, term735380.getClass(), "first", term735382);
        setField(term735380, term735380.getClass(), "last", null);
        setField(term735380, term735380.getClass(), "propListHead", null);
        setIntField(term735380, term735380.getClass(), "sourcePosition", 0);
        setField(term735380, term735380.getClass(), "jsType", null);
        setIntField(term735405, term735405.getClass(), "type", 98);
        setField(term735405, term735405.getClass(), "next", null);
        setField(term735405, term735405.getClass(), "first", null);
        setField(term735405, term735405.getClass(), "last", null);
        setField(term735405, term735405.getClass(), "propListHead", null);
        setIntField(term735405, term735405.getClass(), "sourcePosition", 0);
        setField(term735405, term735405.getClass(), "jsType", null);
        setField(term735405, term735405.getClass(), "parent", null);
        setField(term735380, term735380.getClass(), "parent", term735405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term734571;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term734479, args);
        assertTrue(recursiveEquals(term734479, term735489));
        assertTrue(recursiveEquals(term734571, term735490));
        assertTrue(recursiveEquals(retValue, term735380));
    }

};


