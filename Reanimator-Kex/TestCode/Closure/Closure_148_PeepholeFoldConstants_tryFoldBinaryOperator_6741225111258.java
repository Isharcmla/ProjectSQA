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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300462;
     Object term300548;
     Object term300804;
     Object term300805;
     Object term300719;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300462 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term300548 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term300634 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term300704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term300634, term300634.getClass(), "next", term300704);
        setField(term300548, term300548.getClass(), "first", term300634);
        setIntField(term300548, term300548.getClass(), "type", 101);
        term300804 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term300804, term300804.getClass(), "currentTraversal", null);
        term300805 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term300806 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term300807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term300805, term300805.getClass(), "functionName", null);
        setBooleanField(term300805, term300805.getClass(), "itsNeedsActivation", false);
        setIntField(term300805, term300805.getClass(), "itsFunctionType", 0);
        setBooleanField(term300805, term300805.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term300805, term300805.getClass(), "encodedSourceStart", 0);
        setIntField(term300805, term300805.getClass(), "encodedSourceEnd", 0);
        setField(term300805, term300805.getClass(), "sourceName", null);
        setIntField(term300805, term300805.getClass(), "baseLineno", 0);
        setIntField(term300805, term300805.getClass(), "endLineno", 0);
        setField(term300805, term300805.getClass(), "functions", null);
        setField(term300805, term300805.getClass(), "regexps", null);
        setField(term300805, term300805.getClass(), "itsVariables", null);
        setField(term300805, term300805.getClass(), "itsConst", null);
        setField(term300805, term300805.getClass(), "itsVariableNames", null);
        setIntField(term300805, term300805.getClass(), "varStart", 0);
        setField(term300805, term300805.getClass(), "compilerData", null);
        setIntField(term300805, term300805.getClass(), "type", 101);
        setField(term300805, term300805.getClass(), "next", null);
        setField(term300806, term300806.getClass(), "functionName", null);
        setBooleanField(term300806, term300806.getClass(), "itsNeedsActivation", false);
        setIntField(term300806, term300806.getClass(), "itsFunctionType", 0);
        setBooleanField(term300806, term300806.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term300806, term300806.getClass(), "encodedSourceStart", 0);
        setIntField(term300806, term300806.getClass(), "encodedSourceEnd", 0);
        setField(term300806, term300806.getClass(), "sourceName", null);
        setIntField(term300806, term300806.getClass(), "baseLineno", 0);
        setIntField(term300806, term300806.getClass(), "endLineno", 0);
        setField(term300806, term300806.getClass(), "functions", null);
        setField(term300806, term300806.getClass(), "regexps", null);
        setField(term300806, term300806.getClass(), "itsVariables", null);
        setField(term300806, term300806.getClass(), "itsConst", null);
        setField(term300806, term300806.getClass(), "itsVariableNames", null);
        setIntField(term300806, term300806.getClass(), "varStart", 0);
        setField(term300806, term300806.getClass(), "compilerData", null);
        setIntField(term300806, term300806.getClass(), "type", 0);
        setIntField(term300807, term300807.getClass(), "type", 0);
        setField(term300807, term300807.getClass(), "next", null);
        setField(term300807, term300807.getClass(), "first", null);
        setField(term300807, term300807.getClass(), "last", null);
        setField(term300807, term300807.getClass(), "propListHead", null);
        setIntField(term300807, term300807.getClass(), "sourcePosition", 0);
        setField(term300807, term300807.getClass(), "jsType", null);
        setField(term300807, term300807.getClass(), "parent", null);
        setField(term300806, term300806.getClass(), "next", term300807);
        setField(term300806, term300806.getClass(), "first", null);
        setField(term300806, term300806.getClass(), "last", null);
        setField(term300806, term300806.getClass(), "propListHead", null);
        setIntField(term300806, term300806.getClass(), "sourcePosition", 0);
        setField(term300806, term300806.getClass(), "jsType", null);
        setField(term300806, term300806.getClass(), "parent", null);
        setField(term300805, term300805.getClass(), "first", term300806);
        setField(term300805, term300805.getClass(), "last", null);
        setField(term300805, term300805.getClass(), "propListHead", null);
        setIntField(term300805, term300805.getClass(), "sourcePosition", 0);
        setField(term300805, term300805.getClass(), "jsType", null);
        setField(term300805, term300805.getClass(), "parent", null);
        term300719 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term300729 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term300739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term300719, term300719.getClass(), "functionName", null);
        setBooleanField(term300719, term300719.getClass(), "itsNeedsActivation", false);
        setIntField(term300719, term300719.getClass(), "itsFunctionType", 0);
        setBooleanField(term300719, term300719.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term300719, term300719.getClass(), "encodedSourceStart", 0);
        setIntField(term300719, term300719.getClass(), "encodedSourceEnd", 0);
        setField(term300719, term300719.getClass(), "sourceName", null);
        setIntField(term300719, term300719.getClass(), "baseLineno", 0);
        setIntField(term300719, term300719.getClass(), "endLineno", 0);
        setField(term300719, term300719.getClass(), "functions", null);
        setField(term300719, term300719.getClass(), "regexps", null);
        setField(term300719, term300719.getClass(), "itsVariables", null);
        setField(term300719, term300719.getClass(), "itsConst", null);
        setField(term300719, term300719.getClass(), "itsVariableNames", null);
        setIntField(term300719, term300719.getClass(), "varStart", 0);
        setField(term300719, term300719.getClass(), "compilerData", null);
        setIntField(term300719, term300719.getClass(), "type", 101);
        setField(term300719, term300719.getClass(), "next", null);
        setField(term300729, term300729.getClass(), "functionName", null);
        setBooleanField(term300729, term300729.getClass(), "itsNeedsActivation", false);
        setIntField(term300729, term300729.getClass(), "itsFunctionType", 0);
        setBooleanField(term300729, term300729.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term300729, term300729.getClass(), "encodedSourceStart", 0);
        setIntField(term300729, term300729.getClass(), "encodedSourceEnd", 0);
        setField(term300729, term300729.getClass(), "sourceName", null);
        setIntField(term300729, term300729.getClass(), "baseLineno", 0);
        setIntField(term300729, term300729.getClass(), "endLineno", 0);
        setField(term300729, term300729.getClass(), "functions", null);
        setField(term300729, term300729.getClass(), "regexps", null);
        setField(term300729, term300729.getClass(), "itsVariables", null);
        setField(term300729, term300729.getClass(), "itsConst", null);
        setField(term300729, term300729.getClass(), "itsVariableNames", null);
        setIntField(term300729, term300729.getClass(), "varStart", 0);
        setField(term300729, term300729.getClass(), "compilerData", null);
        setIntField(term300729, term300729.getClass(), "type", 0);
        setIntField(term300739, term300739.getClass(), "type", 0);
        setField(term300739, term300739.getClass(), "next", null);
        setField(term300739, term300739.getClass(), "first", null);
        setField(term300739, term300739.getClass(), "last", null);
        setField(term300739, term300739.getClass(), "propListHead", null);
        setIntField(term300739, term300739.getClass(), "sourcePosition", 0);
        setField(term300739, term300739.getClass(), "jsType", null);
        setField(term300739, term300739.getClass(), "parent", null);
        setField(term300729, term300729.getClass(), "next", term300739);
        setField(term300729, term300729.getClass(), "first", null);
        setField(term300729, term300729.getClass(), "last", null);
        setField(term300729, term300729.getClass(), "propListHead", null);
        setIntField(term300729, term300729.getClass(), "sourcePosition", 0);
        setField(term300729, term300729.getClass(), "jsType", null);
        setField(term300729, term300729.getClass(), "parent", null);
        setField(term300719, term300719.getClass(), "first", term300729);
        setField(term300719, term300719.getClass(), "last", null);
        setField(term300719, term300719.getClass(), "propListHead", null);
        setIntField(term300719, term300719.getClass(), "sourcePosition", 0);
        setField(term300719, term300719.getClass(), "jsType", null);
        setField(term300719, term300719.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term300548;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term300462, args);
        assertTrue(recursiveEquals(term300462, term300804));
        assertTrue(recursiveEquals(term300548, term300805));
        assertTrue(recursiveEquals(retValue, term300719));
    }

};


