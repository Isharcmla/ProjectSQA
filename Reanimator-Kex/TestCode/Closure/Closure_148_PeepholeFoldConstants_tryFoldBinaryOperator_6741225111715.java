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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443450;
     Object term443536;
     Object term444104;
     Object term444105;
     Object term444043;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443450 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term443536 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term443622 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term443714 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term443622, term443622.getClass(), "next", term443714);
        setIntField(term443622, term443622.getClass(), "type", 39);
        setField(term443536, term443536.getClass(), "first", term443622);
        setIntField(term443536, term443536.getClass(), "type", 18);
        term444104 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term444104, term444104.getClass(), "currentTraversal", null);
        term444105 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term444106 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term444107 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term444105, term444105.getClass(), "functionName", null);
        setBooleanField(term444105, term444105.getClass(), "itsNeedsActivation", false);
        setIntField(term444105, term444105.getClass(), "itsFunctionType", 0);
        setBooleanField(term444105, term444105.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term444105, term444105.getClass(), "encodedSourceStart", 0);
        setIntField(term444105, term444105.getClass(), "encodedSourceEnd", 0);
        setField(term444105, term444105.getClass(), "sourceName", null);
        setIntField(term444105, term444105.getClass(), "baseLineno", 0);
        setIntField(term444105, term444105.getClass(), "endLineno", 0);
        setField(term444105, term444105.getClass(), "functions", null);
        setField(term444105, term444105.getClass(), "regexps", null);
        setField(term444105, term444105.getClass(), "itsVariables", null);
        setField(term444105, term444105.getClass(), "itsConst", null);
        setField(term444105, term444105.getClass(), "itsVariableNames", null);
        setIntField(term444105, term444105.getClass(), "varStart", 0);
        setField(term444105, term444105.getClass(), "compilerData", null);
        setIntField(term444105, term444105.getClass(), "type", 18);
        setField(term444105, term444105.getClass(), "next", null);
        setField(term444106, term444106.getClass(), "functionName", null);
        setBooleanField(term444106, term444106.getClass(), "itsNeedsActivation", false);
        setIntField(term444106, term444106.getClass(), "itsFunctionType", 0);
        setBooleanField(term444106, term444106.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term444106, term444106.getClass(), "encodedSourceStart", 0);
        setIntField(term444106, term444106.getClass(), "encodedSourceEnd", 0);
        setField(term444106, term444106.getClass(), "sourceName", null);
        setIntField(term444106, term444106.getClass(), "baseLineno", 0);
        setIntField(term444106, term444106.getClass(), "endLineno", 0);
        setField(term444106, term444106.getClass(), "functions", null);
        setField(term444106, term444106.getClass(), "regexps", null);
        setField(term444106, term444106.getClass(), "itsVariables", null);
        setField(term444106, term444106.getClass(), "itsConst", null);
        setField(term444106, term444106.getClass(), "itsVariableNames", null);
        setIntField(term444106, term444106.getClass(), "varStart", 0);
        setField(term444106, term444106.getClass(), "compilerData", null);
        setIntField(term444106, term444106.getClass(), "type", 39);
        setField(term444107, term444107.getClass(), "str", null);
        setIntField(term444107, term444107.getClass(), "type", 0);
        setField(term444107, term444107.getClass(), "next", null);
        setField(term444107, term444107.getClass(), "first", null);
        setField(term444107, term444107.getClass(), "last", null);
        setField(term444107, term444107.getClass(), "propListHead", null);
        setIntField(term444107, term444107.getClass(), "sourcePosition", 0);
        setField(term444107, term444107.getClass(), "jsType", null);
        setField(term444107, term444107.getClass(), "parent", null);
        setField(term444106, term444106.getClass(), "next", term444107);
        setField(term444106, term444106.getClass(), "first", null);
        setField(term444106, term444106.getClass(), "last", null);
        setField(term444106, term444106.getClass(), "propListHead", null);
        setIntField(term444106, term444106.getClass(), "sourcePosition", 0);
        setField(term444106, term444106.getClass(), "jsType", null);
        setField(term444106, term444106.getClass(), "parent", null);
        setField(term444105, term444105.getClass(), "first", term444106);
        setField(term444105, term444105.getClass(), "last", null);
        setField(term444105, term444105.getClass(), "propListHead", null);
        setIntField(term444105, term444105.getClass(), "sourcePosition", 0);
        setField(term444105, term444105.getClass(), "jsType", null);
        setField(term444105, term444105.getClass(), "parent", null);
        term444043 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term444053 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term444063 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term444043, term444043.getClass(), "functionName", null);
        setBooleanField(term444043, term444043.getClass(), "itsNeedsActivation", false);
        setIntField(term444043, term444043.getClass(), "itsFunctionType", 0);
        setBooleanField(term444043, term444043.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term444043, term444043.getClass(), "encodedSourceStart", 0);
        setIntField(term444043, term444043.getClass(), "encodedSourceEnd", 0);
        setField(term444043, term444043.getClass(), "sourceName", null);
        setIntField(term444043, term444043.getClass(), "baseLineno", 0);
        setIntField(term444043, term444043.getClass(), "endLineno", 0);
        setField(term444043, term444043.getClass(), "functions", null);
        setField(term444043, term444043.getClass(), "regexps", null);
        setField(term444043, term444043.getClass(), "itsVariables", null);
        setField(term444043, term444043.getClass(), "itsConst", null);
        setField(term444043, term444043.getClass(), "itsVariableNames", null);
        setIntField(term444043, term444043.getClass(), "varStart", 0);
        setField(term444043, term444043.getClass(), "compilerData", null);
        setIntField(term444043, term444043.getClass(), "type", 18);
        setField(term444043, term444043.getClass(), "next", null);
        setField(term444053, term444053.getClass(), "functionName", null);
        setBooleanField(term444053, term444053.getClass(), "itsNeedsActivation", false);
        setIntField(term444053, term444053.getClass(), "itsFunctionType", 0);
        setBooleanField(term444053, term444053.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term444053, term444053.getClass(), "encodedSourceStart", 0);
        setIntField(term444053, term444053.getClass(), "encodedSourceEnd", 0);
        setField(term444053, term444053.getClass(), "sourceName", null);
        setIntField(term444053, term444053.getClass(), "baseLineno", 0);
        setIntField(term444053, term444053.getClass(), "endLineno", 0);
        setField(term444053, term444053.getClass(), "functions", null);
        setField(term444053, term444053.getClass(), "regexps", null);
        setField(term444053, term444053.getClass(), "itsVariables", null);
        setField(term444053, term444053.getClass(), "itsConst", null);
        setField(term444053, term444053.getClass(), "itsVariableNames", null);
        setIntField(term444053, term444053.getClass(), "varStart", 0);
        setField(term444053, term444053.getClass(), "compilerData", null);
        setIntField(term444053, term444053.getClass(), "type", 39);
        setField(term444063, term444063.getClass(), "str", null);
        setIntField(term444063, term444063.getClass(), "type", 0);
        setField(term444063, term444063.getClass(), "next", null);
        setField(term444063, term444063.getClass(), "first", null);
        setField(term444063, term444063.getClass(), "last", null);
        setField(term444063, term444063.getClass(), "propListHead", null);
        setIntField(term444063, term444063.getClass(), "sourcePosition", 0);
        setField(term444063, term444063.getClass(), "jsType", null);
        setField(term444063, term444063.getClass(), "parent", null);
        setField(term444053, term444053.getClass(), "next", term444063);
        setField(term444053, term444053.getClass(), "first", null);
        setField(term444053, term444053.getClass(), "last", null);
        setField(term444053, term444053.getClass(), "propListHead", null);
        setIntField(term444053, term444053.getClass(), "sourcePosition", 0);
        setField(term444053, term444053.getClass(), "jsType", null);
        setField(term444053, term444053.getClass(), "parent", null);
        setField(term444043, term444043.getClass(), "first", term444053);
        setField(term444043, term444043.getClass(), "last", null);
        setField(term444043, term444043.getClass(), "propListHead", null);
        setIntField(term444043, term444043.getClass(), "sourcePosition", 0);
        setField(term444043, term444043.getClass(), "jsType", null);
        setField(term444043, term444043.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term443536;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term443450, args);
        assertTrue(recursiveEquals(term443450, term444104));
        assertTrue(recursiveEquals(term443536, term444105));
        assertTrue(recursiveEquals(retValue, term444043));
    }

};


