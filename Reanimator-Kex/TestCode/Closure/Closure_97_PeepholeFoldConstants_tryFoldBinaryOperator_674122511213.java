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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41554;
     Object term41640;
     Object term42598;
     Object term42599;
     Object term42505;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41554 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term41640 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term41710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41796 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term41710, term41710.getClass(), "next", term41796);
        setIntField(term41710, term41710.getClass(), "type", 0);
        setField(term41640, term41640.getClass(), "first", term41710);
        setIntField(term41640, term41640.getClass(), "type", 101);
        setField(term41640, term41640.getClass(), "parent", null);
        term42598 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term42598, term42598.getClass(), "currentTraversal", null);
        term42599 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term42600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42601 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term42599, term42599.getClass(), "functionName", null);
        setBooleanField(term42599, term42599.getClass(), "itsNeedsActivation", false);
        setIntField(term42599, term42599.getClass(), "itsFunctionType", 0);
        setBooleanField(term42599, term42599.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term42599, term42599.getClass(), "encodedSourceStart", 0);
        setIntField(term42599, term42599.getClass(), "encodedSourceEnd", 0);
        setField(term42599, term42599.getClass(), "sourceName", null);
        setIntField(term42599, term42599.getClass(), "baseLineno", 0);
        setIntField(term42599, term42599.getClass(), "endLineno", 0);
        setField(term42599, term42599.getClass(), "functions", null);
        setField(term42599, term42599.getClass(), "regexps", null);
        setField(term42599, term42599.getClass(), "itsVariables", null);
        setField(term42599, term42599.getClass(), "itsConst", null);
        setField(term42599, term42599.getClass(), "itsVariableNames", null);
        setIntField(term42599, term42599.getClass(), "varStart", 0);
        setField(term42599, term42599.getClass(), "compilerData", null);
        setIntField(term42599, term42599.getClass(), "type", 101);
        setField(term42599, term42599.getClass(), "next", null);
        setIntField(term42600, term42600.getClass(), "type", 0);
        setField(term42601, term42601.getClass(), "functionName", null);
        setBooleanField(term42601, term42601.getClass(), "itsNeedsActivation", false);
        setIntField(term42601, term42601.getClass(), "itsFunctionType", 0);
        setBooleanField(term42601, term42601.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term42601, term42601.getClass(), "encodedSourceStart", 0);
        setIntField(term42601, term42601.getClass(), "encodedSourceEnd", 0);
        setField(term42601, term42601.getClass(), "sourceName", null);
        setIntField(term42601, term42601.getClass(), "baseLineno", 0);
        setIntField(term42601, term42601.getClass(), "endLineno", 0);
        setField(term42601, term42601.getClass(), "functions", null);
        setField(term42601, term42601.getClass(), "regexps", null);
        setField(term42601, term42601.getClass(), "itsVariables", null);
        setField(term42601, term42601.getClass(), "itsConst", null);
        setField(term42601, term42601.getClass(), "itsVariableNames", null);
        setIntField(term42601, term42601.getClass(), "varStart", 0);
        setField(term42601, term42601.getClass(), "compilerData", null);
        setIntField(term42601, term42601.getClass(), "type", 0);
        setField(term42601, term42601.getClass(), "next", null);
        setField(term42601, term42601.getClass(), "first", null);
        setField(term42601, term42601.getClass(), "last", null);
        setField(term42601, term42601.getClass(), "propListHead", null);
        setIntField(term42601, term42601.getClass(), "sourcePosition", 0);
        setField(term42601, term42601.getClass(), "jsType", null);
        setField(term42601, term42601.getClass(), "parent", null);
        setField(term42600, term42600.getClass(), "next", term42601);
        setField(term42600, term42600.getClass(), "first", null);
        setField(term42600, term42600.getClass(), "last", null);
        setField(term42600, term42600.getClass(), "propListHead", null);
        setIntField(term42600, term42600.getClass(), "sourcePosition", 0);
        setField(term42600, term42600.getClass(), "jsType", null);
        setField(term42600, term42600.getClass(), "parent", null);
        setField(term42599, term42599.getClass(), "first", term42600);
        setField(term42599, term42599.getClass(), "last", null);
        setField(term42599, term42599.getClass(), "propListHead", null);
        setIntField(term42599, term42599.getClass(), "sourcePosition", 0);
        setField(term42599, term42599.getClass(), "jsType", null);
        setField(term42599, term42599.getClass(), "parent", null);
        term42505 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term42515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42517 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term42505, term42505.getClass(), "functionName", null);
        setBooleanField(term42505, term42505.getClass(), "itsNeedsActivation", false);
        setIntField(term42505, term42505.getClass(), "itsFunctionType", 0);
        setBooleanField(term42505, term42505.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term42505, term42505.getClass(), "encodedSourceStart", 0);
        setIntField(term42505, term42505.getClass(), "encodedSourceEnd", 0);
        setField(term42505, term42505.getClass(), "sourceName", null);
        setIntField(term42505, term42505.getClass(), "baseLineno", 0);
        setIntField(term42505, term42505.getClass(), "endLineno", 0);
        setField(term42505, term42505.getClass(), "functions", null);
        setField(term42505, term42505.getClass(), "regexps", null);
        setField(term42505, term42505.getClass(), "itsVariables", null);
        setField(term42505, term42505.getClass(), "itsConst", null);
        setField(term42505, term42505.getClass(), "itsVariableNames", null);
        setIntField(term42505, term42505.getClass(), "varStart", 0);
        setField(term42505, term42505.getClass(), "compilerData", null);
        setIntField(term42505, term42505.getClass(), "type", 101);
        setField(term42505, term42505.getClass(), "next", null);
        setIntField(term42515, term42515.getClass(), "type", 0);
        setField(term42517, term42517.getClass(), "functionName", null);
        setBooleanField(term42517, term42517.getClass(), "itsNeedsActivation", false);
        setIntField(term42517, term42517.getClass(), "itsFunctionType", 0);
        setBooleanField(term42517, term42517.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term42517, term42517.getClass(), "encodedSourceStart", 0);
        setIntField(term42517, term42517.getClass(), "encodedSourceEnd", 0);
        setField(term42517, term42517.getClass(), "sourceName", null);
        setIntField(term42517, term42517.getClass(), "baseLineno", 0);
        setIntField(term42517, term42517.getClass(), "endLineno", 0);
        setField(term42517, term42517.getClass(), "functions", null);
        setField(term42517, term42517.getClass(), "regexps", null);
        setField(term42517, term42517.getClass(), "itsVariables", null);
        setField(term42517, term42517.getClass(), "itsConst", null);
        setField(term42517, term42517.getClass(), "itsVariableNames", null);
        setIntField(term42517, term42517.getClass(), "varStart", 0);
        setField(term42517, term42517.getClass(), "compilerData", null);
        setIntField(term42517, term42517.getClass(), "type", 0);
        setField(term42517, term42517.getClass(), "next", null);
        setField(term42517, term42517.getClass(), "first", null);
        setField(term42517, term42517.getClass(), "last", null);
        setField(term42517, term42517.getClass(), "propListHead", null);
        setIntField(term42517, term42517.getClass(), "sourcePosition", 0);
        setField(term42517, term42517.getClass(), "jsType", null);
        setField(term42517, term42517.getClass(), "parent", null);
        setField(term42515, term42515.getClass(), "next", term42517);
        setField(term42515, term42515.getClass(), "first", null);
        setField(term42515, term42515.getClass(), "last", null);
        setField(term42515, term42515.getClass(), "propListHead", null);
        setIntField(term42515, term42515.getClass(), "sourcePosition", 0);
        setField(term42515, term42515.getClass(), "jsType", null);
        setField(term42515, term42515.getClass(), "parent", null);
        setField(term42505, term42505.getClass(), "first", term42515);
        setField(term42505, term42505.getClass(), "last", null);
        setField(term42505, term42505.getClass(), "propListHead", null);
        setIntField(term42505, term42505.getClass(), "sourcePosition", 0);
        setField(term42505, term42505.getClass(), "jsType", null);
        setField(term42505, term42505.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41640;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term41554, args);
        assertTrue(recursiveEquals(term41554, term42598));
        assertTrue(recursiveEquals(term41640, term42599));
        assertTrue(recursiveEquals(retValue, term42505));
    }

};


