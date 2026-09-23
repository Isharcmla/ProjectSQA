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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441272;
     Object term441364;
     Object term441760;
     Object term441761;
     Object term441671;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term441272 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term441364 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term441454 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term441540 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term441454, term441454.getClass(), "next", term441540);
        setIntField(term441454, term441454.getClass(), "type", 0);
        setField(term441364, term441364.getClass(), "first", term441454);
        setIntField(term441364, term441364.getClass(), "type", 101);
        setField(term441364, term441364.getClass(), "parent", null);
        term441760 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term441760, term441760.getClass(), "currentTraversal", null);
        term441761 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term441762 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term441763 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term441761, term441761.getClass(), "number", 0.0);
        setIntField(term441761, term441761.getClass(), "type", 101);
        setField(term441761, term441761.getClass(), "next", null);
        setIntField(term441762, term441762.getClass(), "encodedSourceStart", 0);
        setIntField(term441762, term441762.getClass(), "encodedSourceEnd", 0);
        setField(term441762, term441762.getClass(), "sourceName", null);
        setIntField(term441762, term441762.getClass(), "baseLineno", 0);
        setIntField(term441762, term441762.getClass(), "endLineno", 0);
        setField(term441762, term441762.getClass(), "functions", null);
        setField(term441762, term441762.getClass(), "regexps", null);
        setField(term441762, term441762.getClass(), "itsVariables", null);
        setField(term441762, term441762.getClass(), "itsConst", null);
        setField(term441762, term441762.getClass(), "itsVariableNames", null);
        setIntField(term441762, term441762.getClass(), "varStart", 0);
        setField(term441762, term441762.getClass(), "compilerData", null);
        setIntField(term441762, term441762.getClass(), "type", 0);
        setField(term441763, term441763.getClass(), "functionName", null);
        setBooleanField(term441763, term441763.getClass(), "itsNeedsActivation", false);
        setIntField(term441763, term441763.getClass(), "itsFunctionType", 0);
        setBooleanField(term441763, term441763.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term441763, term441763.getClass(), "encodedSourceStart", 0);
        setIntField(term441763, term441763.getClass(), "encodedSourceEnd", 0);
        setField(term441763, term441763.getClass(), "sourceName", null);
        setIntField(term441763, term441763.getClass(), "baseLineno", 0);
        setIntField(term441763, term441763.getClass(), "endLineno", 0);
        setField(term441763, term441763.getClass(), "functions", null);
        setField(term441763, term441763.getClass(), "regexps", null);
        setField(term441763, term441763.getClass(), "itsVariables", null);
        setField(term441763, term441763.getClass(), "itsConst", null);
        setField(term441763, term441763.getClass(), "itsVariableNames", null);
        setIntField(term441763, term441763.getClass(), "varStart", 0);
        setField(term441763, term441763.getClass(), "compilerData", null);
        setIntField(term441763, term441763.getClass(), "type", 0);
        setField(term441763, term441763.getClass(), "next", null);
        setField(term441763, term441763.getClass(), "first", null);
        setField(term441763, term441763.getClass(), "last", null);
        setField(term441763, term441763.getClass(), "propListHead", null);
        setIntField(term441763, term441763.getClass(), "sourcePosition", 0);
        setField(term441763, term441763.getClass(), "jsType", null);
        setField(term441763, term441763.getClass(), "parent", null);
        setField(term441762, term441762.getClass(), "next", term441763);
        setField(term441762, term441762.getClass(), "first", null);
        setField(term441762, term441762.getClass(), "last", null);
        setField(term441762, term441762.getClass(), "propListHead", null);
        setIntField(term441762, term441762.getClass(), "sourcePosition", 0);
        setField(term441762, term441762.getClass(), "jsType", null);
        setField(term441762, term441762.getClass(), "parent", null);
        setField(term441761, term441761.getClass(), "first", term441762);
        setField(term441761, term441761.getClass(), "last", null);
        setField(term441761, term441761.getClass(), "propListHead", null);
        setIntField(term441761, term441761.getClass(), "sourcePosition", 0);
        setField(term441761, term441761.getClass(), "jsType", null);
        setField(term441761, term441761.getClass(), "parent", null);
        term441671 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term441674 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term441681 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term441671, term441671.getClass(), "number", 0.0);
        setIntField(term441671, term441671.getClass(), "type", 101);
        setField(term441671, term441671.getClass(), "next", null);
        setIntField(term441674, term441674.getClass(), "encodedSourceStart", 0);
        setIntField(term441674, term441674.getClass(), "encodedSourceEnd", 0);
        setField(term441674, term441674.getClass(), "sourceName", null);
        setIntField(term441674, term441674.getClass(), "baseLineno", 0);
        setIntField(term441674, term441674.getClass(), "endLineno", 0);
        setField(term441674, term441674.getClass(), "functions", null);
        setField(term441674, term441674.getClass(), "regexps", null);
        setField(term441674, term441674.getClass(), "itsVariables", null);
        setField(term441674, term441674.getClass(), "itsConst", null);
        setField(term441674, term441674.getClass(), "itsVariableNames", null);
        setIntField(term441674, term441674.getClass(), "varStart", 0);
        setField(term441674, term441674.getClass(), "compilerData", null);
        setIntField(term441674, term441674.getClass(), "type", 0);
        setField(term441681, term441681.getClass(), "functionName", null);
        setBooleanField(term441681, term441681.getClass(), "itsNeedsActivation", false);
        setIntField(term441681, term441681.getClass(), "itsFunctionType", 0);
        setBooleanField(term441681, term441681.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term441681, term441681.getClass(), "encodedSourceStart", 0);
        setIntField(term441681, term441681.getClass(), "encodedSourceEnd", 0);
        setField(term441681, term441681.getClass(), "sourceName", null);
        setIntField(term441681, term441681.getClass(), "baseLineno", 0);
        setIntField(term441681, term441681.getClass(), "endLineno", 0);
        setField(term441681, term441681.getClass(), "functions", null);
        setField(term441681, term441681.getClass(), "regexps", null);
        setField(term441681, term441681.getClass(), "itsVariables", null);
        setField(term441681, term441681.getClass(), "itsConst", null);
        setField(term441681, term441681.getClass(), "itsVariableNames", null);
        setIntField(term441681, term441681.getClass(), "varStart", 0);
        setField(term441681, term441681.getClass(), "compilerData", null);
        setIntField(term441681, term441681.getClass(), "type", 0);
        setField(term441681, term441681.getClass(), "next", null);
        setField(term441681, term441681.getClass(), "first", null);
        setField(term441681, term441681.getClass(), "last", null);
        setField(term441681, term441681.getClass(), "propListHead", null);
        setIntField(term441681, term441681.getClass(), "sourcePosition", 0);
        setField(term441681, term441681.getClass(), "jsType", null);
        setField(term441681, term441681.getClass(), "parent", null);
        setField(term441674, term441674.getClass(), "next", term441681);
        setField(term441674, term441674.getClass(), "first", null);
        setField(term441674, term441674.getClass(), "last", null);
        setField(term441674, term441674.getClass(), "propListHead", null);
        setIntField(term441674, term441674.getClass(), "sourcePosition", 0);
        setField(term441674, term441674.getClass(), "jsType", null);
        setField(term441674, term441674.getClass(), "parent", null);
        setField(term441671, term441671.getClass(), "first", term441674);
        setField(term441671, term441671.getClass(), "last", null);
        setField(term441671, term441671.getClass(), "propListHead", null);
        setIntField(term441671, term441671.getClass(), "sourcePosition", 0);
        setField(term441671, term441671.getClass(), "jsType", null);
        setField(term441671, term441671.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term441364;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term441272, args);
        assertTrue(recursiveEquals(term441272, term441760));
        assertTrue(recursiveEquals(term441364, term441761));
        assertTrue(recursiveEquals(retValue, term441671));
    }

};


