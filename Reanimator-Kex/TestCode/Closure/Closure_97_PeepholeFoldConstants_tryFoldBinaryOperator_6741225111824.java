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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term707234;
     Object term707326;
     Object term707686;
     Object term707687;
     Object term707620;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term707234 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term707326 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term707418 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term707504 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term707418, term707418.getClass(), "next", term707504);
        setIntField(term707418, term707418.getClass(), "type", 16);
        setField(term707326, term707326.getClass(), "first", term707418);
        setIntField(term707326, term707326.getClass(), "type", 16);
        term707686 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term707686, term707686.getClass(), "currentTraversal", null);
        term707687 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term707688 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term707689 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term707687, term707687.getClass(), "str", null);
        setIntField(term707687, term707687.getClass(), "type", 16);
        setField(term707687, term707687.getClass(), "next", null);
        setField(term707688, term707688.getClass(), "str", null);
        setIntField(term707688, term707688.getClass(), "type", 16);
        setField(term707689, term707689.getClass(), "functionName", null);
        setBooleanField(term707689, term707689.getClass(), "itsNeedsActivation", false);
        setIntField(term707689, term707689.getClass(), "itsFunctionType", 0);
        setBooleanField(term707689, term707689.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term707689, term707689.getClass(), "encodedSourceStart", 0);
        setIntField(term707689, term707689.getClass(), "encodedSourceEnd", 0);
        setField(term707689, term707689.getClass(), "sourceName", null);
        setIntField(term707689, term707689.getClass(), "baseLineno", 0);
        setIntField(term707689, term707689.getClass(), "endLineno", 0);
        setField(term707689, term707689.getClass(), "functions", null);
        setField(term707689, term707689.getClass(), "regexps", null);
        setField(term707689, term707689.getClass(), "itsVariables", null);
        setField(term707689, term707689.getClass(), "itsConst", null);
        setField(term707689, term707689.getClass(), "itsVariableNames", null);
        setIntField(term707689, term707689.getClass(), "varStart", 0);
        setField(term707689, term707689.getClass(), "compilerData", null);
        setIntField(term707689, term707689.getClass(), "type", 0);
        setField(term707689, term707689.getClass(), "next", null);
        setField(term707689, term707689.getClass(), "first", null);
        setField(term707689, term707689.getClass(), "last", null);
        setField(term707689, term707689.getClass(), "propListHead", null);
        setIntField(term707689, term707689.getClass(), "sourcePosition", 0);
        setField(term707689, term707689.getClass(), "jsType", null);
        setField(term707689, term707689.getClass(), "parent", null);
        setField(term707688, term707688.getClass(), "next", term707689);
        setField(term707688, term707688.getClass(), "first", null);
        setField(term707688, term707688.getClass(), "last", null);
        setField(term707688, term707688.getClass(), "propListHead", null);
        setIntField(term707688, term707688.getClass(), "sourcePosition", 0);
        setField(term707688, term707688.getClass(), "jsType", null);
        setField(term707688, term707688.getClass(), "parent", null);
        setField(term707687, term707687.getClass(), "first", term707688);
        setField(term707687, term707687.getClass(), "last", null);
        setField(term707687, term707687.getClass(), "propListHead", null);
        setIntField(term707687, term707687.getClass(), "sourcePosition", 0);
        setField(term707687, term707687.getClass(), "jsType", null);
        setField(term707687, term707687.getClass(), "parent", null);
        term707620 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term707622 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term707624 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term707620, term707620.getClass(), "str", null);
        setIntField(term707620, term707620.getClass(), "type", 16);
        setField(term707620, term707620.getClass(), "next", null);
        setField(term707622, term707622.getClass(), "str", null);
        setIntField(term707622, term707622.getClass(), "type", 16);
        setField(term707624, term707624.getClass(), "functionName", null);
        setBooleanField(term707624, term707624.getClass(), "itsNeedsActivation", false);
        setIntField(term707624, term707624.getClass(), "itsFunctionType", 0);
        setBooleanField(term707624, term707624.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term707624, term707624.getClass(), "encodedSourceStart", 0);
        setIntField(term707624, term707624.getClass(), "encodedSourceEnd", 0);
        setField(term707624, term707624.getClass(), "sourceName", null);
        setIntField(term707624, term707624.getClass(), "baseLineno", 0);
        setIntField(term707624, term707624.getClass(), "endLineno", 0);
        setField(term707624, term707624.getClass(), "functions", null);
        setField(term707624, term707624.getClass(), "regexps", null);
        setField(term707624, term707624.getClass(), "itsVariables", null);
        setField(term707624, term707624.getClass(), "itsConst", null);
        setField(term707624, term707624.getClass(), "itsVariableNames", null);
        setIntField(term707624, term707624.getClass(), "varStart", 0);
        setField(term707624, term707624.getClass(), "compilerData", null);
        setIntField(term707624, term707624.getClass(), "type", 0);
        setField(term707624, term707624.getClass(), "next", null);
        setField(term707624, term707624.getClass(), "first", null);
        setField(term707624, term707624.getClass(), "last", null);
        setField(term707624, term707624.getClass(), "propListHead", null);
        setIntField(term707624, term707624.getClass(), "sourcePosition", 0);
        setField(term707624, term707624.getClass(), "jsType", null);
        setField(term707624, term707624.getClass(), "parent", null);
        setField(term707622, term707622.getClass(), "next", term707624);
        setField(term707622, term707622.getClass(), "first", null);
        setField(term707622, term707622.getClass(), "last", null);
        setField(term707622, term707622.getClass(), "propListHead", null);
        setIntField(term707622, term707622.getClass(), "sourcePosition", 0);
        setField(term707622, term707622.getClass(), "jsType", null);
        setField(term707622, term707622.getClass(), "parent", null);
        setField(term707620, term707620.getClass(), "first", term707622);
        setField(term707620, term707620.getClass(), "last", null);
        setField(term707620, term707620.getClass(), "propListHead", null);
        setIntField(term707620, term707620.getClass(), "sourcePosition", 0);
        setField(term707620, term707620.getClass(), "jsType", null);
        setField(term707620, term707620.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term707326;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term707234, args);
        assertTrue(recursiveEquals(term707234, term707686));
        assertTrue(recursiveEquals(term707326, term707687));
        assertTrue(recursiveEquals(retValue, term707620));
    }

};


