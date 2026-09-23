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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143146;
     Object term143232;
     Object term143748;
     Object term143749;
     Object term143689;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143146 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term143232 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term143318 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term143388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term143318, term143318.getClass(), "next", term143388);
        setField(term143232, term143232.getClass(), "first", term143318);
        setIntField(term143232, term143232.getClass(), "type", 18);
        term143748 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term143748, term143748.getClass(), "currentTraversal", null);
        term143749 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term143750 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term143751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term143749, term143749.getClass(), "functionName", null);
        setBooleanField(term143749, term143749.getClass(), "itsNeedsActivation", false);
        setIntField(term143749, term143749.getClass(), "itsFunctionType", 0);
        setBooleanField(term143749, term143749.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term143749, term143749.getClass(), "encodedSourceStart", 0);
        setIntField(term143749, term143749.getClass(), "encodedSourceEnd", 0);
        setField(term143749, term143749.getClass(), "sourceName", null);
        setIntField(term143749, term143749.getClass(), "baseLineno", 0);
        setIntField(term143749, term143749.getClass(), "endLineno", 0);
        setField(term143749, term143749.getClass(), "functions", null);
        setField(term143749, term143749.getClass(), "regexps", null);
        setField(term143749, term143749.getClass(), "itsVariables", null);
        setField(term143749, term143749.getClass(), "itsConst", null);
        setField(term143749, term143749.getClass(), "itsVariableNames", null);
        setIntField(term143749, term143749.getClass(), "varStart", 0);
        setField(term143749, term143749.getClass(), "compilerData", null);
        setIntField(term143749, term143749.getClass(), "type", 18);
        setField(term143749, term143749.getClass(), "next", null);
        setField(term143750, term143750.getClass(), "functionName", null);
        setBooleanField(term143750, term143750.getClass(), "itsNeedsActivation", false);
        setIntField(term143750, term143750.getClass(), "itsFunctionType", 0);
        setBooleanField(term143750, term143750.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term143750, term143750.getClass(), "encodedSourceStart", 0);
        setIntField(term143750, term143750.getClass(), "encodedSourceEnd", 0);
        setField(term143750, term143750.getClass(), "sourceName", null);
        setIntField(term143750, term143750.getClass(), "baseLineno", 0);
        setIntField(term143750, term143750.getClass(), "endLineno", 0);
        setField(term143750, term143750.getClass(), "functions", null);
        setField(term143750, term143750.getClass(), "regexps", null);
        setField(term143750, term143750.getClass(), "itsVariables", null);
        setField(term143750, term143750.getClass(), "itsConst", null);
        setField(term143750, term143750.getClass(), "itsVariableNames", null);
        setIntField(term143750, term143750.getClass(), "varStart", 0);
        setField(term143750, term143750.getClass(), "compilerData", null);
        setIntField(term143750, term143750.getClass(), "type", 0);
        setIntField(term143751, term143751.getClass(), "type", 0);
        setField(term143751, term143751.getClass(), "next", null);
        setField(term143751, term143751.getClass(), "first", null);
        setField(term143751, term143751.getClass(), "last", null);
        setField(term143751, term143751.getClass(), "propListHead", null);
        setIntField(term143751, term143751.getClass(), "sourcePosition", 0);
        setField(term143751, term143751.getClass(), "jsType", null);
        setField(term143751, term143751.getClass(), "parent", null);
        setField(term143750, term143750.getClass(), "next", term143751);
        setField(term143750, term143750.getClass(), "first", null);
        setField(term143750, term143750.getClass(), "last", null);
        setField(term143750, term143750.getClass(), "propListHead", null);
        setIntField(term143750, term143750.getClass(), "sourcePosition", 0);
        setField(term143750, term143750.getClass(), "jsType", null);
        setField(term143750, term143750.getClass(), "parent", null);
        setField(term143749, term143749.getClass(), "first", term143750);
        setField(term143749, term143749.getClass(), "last", null);
        setField(term143749, term143749.getClass(), "propListHead", null);
        setIntField(term143749, term143749.getClass(), "sourcePosition", 0);
        setField(term143749, term143749.getClass(), "jsType", null);
        setField(term143749, term143749.getClass(), "parent", null);
        term143689 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term143699 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term143709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term143689, term143689.getClass(), "functionName", null);
        setBooleanField(term143689, term143689.getClass(), "itsNeedsActivation", false);
        setIntField(term143689, term143689.getClass(), "itsFunctionType", 0);
        setBooleanField(term143689, term143689.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term143689, term143689.getClass(), "encodedSourceStart", 0);
        setIntField(term143689, term143689.getClass(), "encodedSourceEnd", 0);
        setField(term143689, term143689.getClass(), "sourceName", null);
        setIntField(term143689, term143689.getClass(), "baseLineno", 0);
        setIntField(term143689, term143689.getClass(), "endLineno", 0);
        setField(term143689, term143689.getClass(), "functions", null);
        setField(term143689, term143689.getClass(), "regexps", null);
        setField(term143689, term143689.getClass(), "itsVariables", null);
        setField(term143689, term143689.getClass(), "itsConst", null);
        setField(term143689, term143689.getClass(), "itsVariableNames", null);
        setIntField(term143689, term143689.getClass(), "varStart", 0);
        setField(term143689, term143689.getClass(), "compilerData", null);
        setIntField(term143689, term143689.getClass(), "type", 18);
        setField(term143689, term143689.getClass(), "next", null);
        setField(term143699, term143699.getClass(), "functionName", null);
        setBooleanField(term143699, term143699.getClass(), "itsNeedsActivation", false);
        setIntField(term143699, term143699.getClass(), "itsFunctionType", 0);
        setBooleanField(term143699, term143699.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term143699, term143699.getClass(), "encodedSourceStart", 0);
        setIntField(term143699, term143699.getClass(), "encodedSourceEnd", 0);
        setField(term143699, term143699.getClass(), "sourceName", null);
        setIntField(term143699, term143699.getClass(), "baseLineno", 0);
        setIntField(term143699, term143699.getClass(), "endLineno", 0);
        setField(term143699, term143699.getClass(), "functions", null);
        setField(term143699, term143699.getClass(), "regexps", null);
        setField(term143699, term143699.getClass(), "itsVariables", null);
        setField(term143699, term143699.getClass(), "itsConst", null);
        setField(term143699, term143699.getClass(), "itsVariableNames", null);
        setIntField(term143699, term143699.getClass(), "varStart", 0);
        setField(term143699, term143699.getClass(), "compilerData", null);
        setIntField(term143699, term143699.getClass(), "type", 0);
        setIntField(term143709, term143709.getClass(), "type", 0);
        setField(term143709, term143709.getClass(), "next", null);
        setField(term143709, term143709.getClass(), "first", null);
        setField(term143709, term143709.getClass(), "last", null);
        setField(term143709, term143709.getClass(), "propListHead", null);
        setIntField(term143709, term143709.getClass(), "sourcePosition", 0);
        setField(term143709, term143709.getClass(), "jsType", null);
        setField(term143709, term143709.getClass(), "parent", null);
        setField(term143699, term143699.getClass(), "next", term143709);
        setField(term143699, term143699.getClass(), "first", null);
        setField(term143699, term143699.getClass(), "last", null);
        setField(term143699, term143699.getClass(), "propListHead", null);
        setIntField(term143699, term143699.getClass(), "sourcePosition", 0);
        setField(term143699, term143699.getClass(), "jsType", null);
        setField(term143699, term143699.getClass(), "parent", null);
        setField(term143689, term143689.getClass(), "first", term143699);
        setField(term143689, term143689.getClass(), "last", null);
        setField(term143689, term143689.getClass(), "propListHead", null);
        setIntField(term143689, term143689.getClass(), "sourcePosition", 0);
        setField(term143689, term143689.getClass(), "jsType", null);
        setField(term143689, term143689.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term143232;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term143146, args);
        assertTrue(recursiveEquals(term143146, term143748));
        assertTrue(recursiveEquals(term143232, term143749));
        assertTrue(recursiveEquals(retValue, term143689));
    }

};


