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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60316;
     Object term60402;
     Object term60904;
     Object term60905;
     Object term60841;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60316 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term60402 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term60488 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term60558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term60488, term60488.getClass(), "next", term60558);
        setField(term60402, term60402.getClass(), "first", term60488);
        setIntField(term60402, term60402.getClass(), "type", 11);
        term60904 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term60904, term60904.getClass(), "currentTraversal", null);
        term60905 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term60906 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term60907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term60905, term60905.getClass(), "functionName", null);
        setBooleanField(term60905, term60905.getClass(), "itsNeedsActivation", false);
        setIntField(term60905, term60905.getClass(), "itsFunctionType", 0);
        setBooleanField(term60905, term60905.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term60905, term60905.getClass(), "encodedSourceStart", 0);
        setIntField(term60905, term60905.getClass(), "encodedSourceEnd", 0);
        setField(term60905, term60905.getClass(), "sourceName", null);
        setIntField(term60905, term60905.getClass(), "baseLineno", 0);
        setIntField(term60905, term60905.getClass(), "endLineno", 0);
        setField(term60905, term60905.getClass(), "functions", null);
        setField(term60905, term60905.getClass(), "regexps", null);
        setField(term60905, term60905.getClass(), "itsVariables", null);
        setField(term60905, term60905.getClass(), "itsConst", null);
        setField(term60905, term60905.getClass(), "itsVariableNames", null);
        setIntField(term60905, term60905.getClass(), "varStart", 0);
        setField(term60905, term60905.getClass(), "compilerData", null);
        setIntField(term60905, term60905.getClass(), "type", 11);
        setField(term60905, term60905.getClass(), "next", null);
        setField(term60906, term60906.getClass(), "functionName", null);
        setBooleanField(term60906, term60906.getClass(), "itsNeedsActivation", false);
        setIntField(term60906, term60906.getClass(), "itsFunctionType", 0);
        setBooleanField(term60906, term60906.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term60906, term60906.getClass(), "encodedSourceStart", 0);
        setIntField(term60906, term60906.getClass(), "encodedSourceEnd", 0);
        setField(term60906, term60906.getClass(), "sourceName", null);
        setIntField(term60906, term60906.getClass(), "baseLineno", 0);
        setIntField(term60906, term60906.getClass(), "endLineno", 0);
        setField(term60906, term60906.getClass(), "functions", null);
        setField(term60906, term60906.getClass(), "regexps", null);
        setField(term60906, term60906.getClass(), "itsVariables", null);
        setField(term60906, term60906.getClass(), "itsConst", null);
        setField(term60906, term60906.getClass(), "itsVariableNames", null);
        setIntField(term60906, term60906.getClass(), "varStart", 0);
        setField(term60906, term60906.getClass(), "compilerData", null);
        setIntField(term60906, term60906.getClass(), "type", 0);
        setIntField(term60907, term60907.getClass(), "type", 0);
        setField(term60907, term60907.getClass(), "next", null);
        setField(term60907, term60907.getClass(), "first", null);
        setField(term60907, term60907.getClass(), "last", null);
        setField(term60907, term60907.getClass(), "propListHead", null);
        setIntField(term60907, term60907.getClass(), "sourcePosition", 0);
        setField(term60907, term60907.getClass(), "jsType", null);
        setField(term60907, term60907.getClass(), "parent", null);
        setField(term60906, term60906.getClass(), "next", term60907);
        setField(term60906, term60906.getClass(), "first", null);
        setField(term60906, term60906.getClass(), "last", null);
        setField(term60906, term60906.getClass(), "propListHead", null);
        setIntField(term60906, term60906.getClass(), "sourcePosition", 0);
        setField(term60906, term60906.getClass(), "jsType", null);
        setField(term60906, term60906.getClass(), "parent", null);
        setField(term60905, term60905.getClass(), "first", term60906);
        setField(term60905, term60905.getClass(), "last", null);
        setField(term60905, term60905.getClass(), "propListHead", null);
        setIntField(term60905, term60905.getClass(), "sourcePosition", 0);
        setField(term60905, term60905.getClass(), "jsType", null);
        setField(term60905, term60905.getClass(), "parent", null);
        term60841 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term60851 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term60861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term60841, term60841.getClass(), "functionName", null);
        setBooleanField(term60841, term60841.getClass(), "itsNeedsActivation", false);
        setIntField(term60841, term60841.getClass(), "itsFunctionType", 0);
        setBooleanField(term60841, term60841.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term60841, term60841.getClass(), "encodedSourceStart", 0);
        setIntField(term60841, term60841.getClass(), "encodedSourceEnd", 0);
        setField(term60841, term60841.getClass(), "sourceName", null);
        setIntField(term60841, term60841.getClass(), "baseLineno", 0);
        setIntField(term60841, term60841.getClass(), "endLineno", 0);
        setField(term60841, term60841.getClass(), "functions", null);
        setField(term60841, term60841.getClass(), "regexps", null);
        setField(term60841, term60841.getClass(), "itsVariables", null);
        setField(term60841, term60841.getClass(), "itsConst", null);
        setField(term60841, term60841.getClass(), "itsVariableNames", null);
        setIntField(term60841, term60841.getClass(), "varStart", 0);
        setField(term60841, term60841.getClass(), "compilerData", null);
        setIntField(term60841, term60841.getClass(), "type", 11);
        setField(term60841, term60841.getClass(), "next", null);
        setField(term60851, term60851.getClass(), "functionName", null);
        setBooleanField(term60851, term60851.getClass(), "itsNeedsActivation", false);
        setIntField(term60851, term60851.getClass(), "itsFunctionType", 0);
        setBooleanField(term60851, term60851.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term60851, term60851.getClass(), "encodedSourceStart", 0);
        setIntField(term60851, term60851.getClass(), "encodedSourceEnd", 0);
        setField(term60851, term60851.getClass(), "sourceName", null);
        setIntField(term60851, term60851.getClass(), "baseLineno", 0);
        setIntField(term60851, term60851.getClass(), "endLineno", 0);
        setField(term60851, term60851.getClass(), "functions", null);
        setField(term60851, term60851.getClass(), "regexps", null);
        setField(term60851, term60851.getClass(), "itsVariables", null);
        setField(term60851, term60851.getClass(), "itsConst", null);
        setField(term60851, term60851.getClass(), "itsVariableNames", null);
        setIntField(term60851, term60851.getClass(), "varStart", 0);
        setField(term60851, term60851.getClass(), "compilerData", null);
        setIntField(term60851, term60851.getClass(), "type", 0);
        setIntField(term60861, term60861.getClass(), "type", 0);
        setField(term60861, term60861.getClass(), "next", null);
        setField(term60861, term60861.getClass(), "first", null);
        setField(term60861, term60861.getClass(), "last", null);
        setField(term60861, term60861.getClass(), "propListHead", null);
        setIntField(term60861, term60861.getClass(), "sourcePosition", 0);
        setField(term60861, term60861.getClass(), "jsType", null);
        setField(term60861, term60861.getClass(), "parent", null);
        setField(term60851, term60851.getClass(), "next", term60861);
        setField(term60851, term60851.getClass(), "first", null);
        setField(term60851, term60851.getClass(), "last", null);
        setField(term60851, term60851.getClass(), "propListHead", null);
        setIntField(term60851, term60851.getClass(), "sourcePosition", 0);
        setField(term60851, term60851.getClass(), "jsType", null);
        setField(term60851, term60851.getClass(), "parent", null);
        setField(term60841, term60841.getClass(), "first", term60851);
        setField(term60841, term60841.getClass(), "last", null);
        setField(term60841, term60841.getClass(), "propListHead", null);
        setIntField(term60841, term60841.getClass(), "sourcePosition", 0);
        setField(term60841, term60841.getClass(), "jsType", null);
        setField(term60841, term60841.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term60402;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term60316, args);
        assertTrue(recursiveEquals(term60316, term60904));
        assertTrue(recursiveEquals(term60402, term60905));
        assertTrue(recursiveEquals(retValue, term60841));
    }

};


