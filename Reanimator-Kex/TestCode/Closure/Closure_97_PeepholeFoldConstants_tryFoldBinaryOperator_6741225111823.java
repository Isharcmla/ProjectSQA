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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term706924;
     Object term707010;
     Object term707603;
     Object term707604;
     Object term707527;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term706924 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term707010 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term707096 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term707010, term707010.getClass(), "first", term707010);
        setField(term707010, term707010.getClass(), "next", term707096);
        setIntField(term707010, term707010.getClass(), "type", 16);
        term707603 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term707603, term707603.getClass(), "currentTraversal", null);
        term707604 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term707605 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term707604, term707604.getClass(), "functionName", null);
        setBooleanField(term707604, term707604.getClass(), "itsNeedsActivation", false);
        setIntField(term707604, term707604.getClass(), "itsFunctionType", 0);
        setBooleanField(term707604, term707604.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term707604, term707604.getClass(), "encodedSourceStart", 0);
        setIntField(term707604, term707604.getClass(), "encodedSourceEnd", 0);
        setField(term707604, term707604.getClass(), "sourceName", null);
        setIntField(term707604, term707604.getClass(), "baseLineno", 0);
        setIntField(term707604, term707604.getClass(), "endLineno", 0);
        setField(term707604, term707604.getClass(), "functions", null);
        setField(term707604, term707604.getClass(), "regexps", null);
        setField(term707604, term707604.getClass(), "itsVariables", null);
        setField(term707604, term707604.getClass(), "itsConst", null);
        setField(term707604, term707604.getClass(), "itsVariableNames", null);
        setIntField(term707604, term707604.getClass(), "varStart", 0);
        setField(term707604, term707604.getClass(), "compilerData", null);
        setIntField(term707604, term707604.getClass(), "type", 16);
        setField(term707605, term707605.getClass(), "functionName", null);
        setBooleanField(term707605, term707605.getClass(), "itsNeedsActivation", false);
        setIntField(term707605, term707605.getClass(), "itsFunctionType", 0);
        setBooleanField(term707605, term707605.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term707605, term707605.getClass(), "encodedSourceStart", 0);
        setIntField(term707605, term707605.getClass(), "encodedSourceEnd", 0);
        setField(term707605, term707605.getClass(), "sourceName", null);
        setIntField(term707605, term707605.getClass(), "baseLineno", 0);
        setIntField(term707605, term707605.getClass(), "endLineno", 0);
        setField(term707605, term707605.getClass(), "functions", null);
        setField(term707605, term707605.getClass(), "regexps", null);
        setField(term707605, term707605.getClass(), "itsVariables", null);
        setField(term707605, term707605.getClass(), "itsConst", null);
        setField(term707605, term707605.getClass(), "itsVariableNames", null);
        setIntField(term707605, term707605.getClass(), "varStart", 0);
        setField(term707605, term707605.getClass(), "compilerData", null);
        setIntField(term707605, term707605.getClass(), "type", 0);
        setField(term707605, term707605.getClass(), "next", null);
        setField(term707605, term707605.getClass(), "first", null);
        setField(term707605, term707605.getClass(), "last", null);
        setField(term707605, term707605.getClass(), "propListHead", null);
        setIntField(term707605, term707605.getClass(), "sourcePosition", 0);
        setField(term707605, term707605.getClass(), "jsType", null);
        setField(term707605, term707605.getClass(), "parent", null);
        setField(term707604, term707604.getClass(), "next", term707605);
        setField(term707604, term707604.getClass(), "first", term707604);
        setField(term707604, term707604.getClass(), "last", null);
        setField(term707604, term707604.getClass(), "propListHead", null);
        setIntField(term707604, term707604.getClass(), "sourcePosition", 0);
        setField(term707604, term707604.getClass(), "jsType", null);
        setField(term707604, term707604.getClass(), "parent", null);
        term707527 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term707537 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term707527, term707527.getClass(), "functionName", null);
        setBooleanField(term707527, term707527.getClass(), "itsNeedsActivation", false);
        setIntField(term707527, term707527.getClass(), "itsFunctionType", 0);
        setBooleanField(term707527, term707527.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term707527, term707527.getClass(), "encodedSourceStart", 0);
        setIntField(term707527, term707527.getClass(), "encodedSourceEnd", 0);
        setField(term707527, term707527.getClass(), "sourceName", null);
        setIntField(term707527, term707527.getClass(), "baseLineno", 0);
        setIntField(term707527, term707527.getClass(), "endLineno", 0);
        setField(term707527, term707527.getClass(), "functions", null);
        setField(term707527, term707527.getClass(), "regexps", null);
        setField(term707527, term707527.getClass(), "itsVariables", null);
        setField(term707527, term707527.getClass(), "itsConst", null);
        setField(term707527, term707527.getClass(), "itsVariableNames", null);
        setIntField(term707527, term707527.getClass(), "varStart", 0);
        setField(term707527, term707527.getClass(), "compilerData", null);
        setIntField(term707527, term707527.getClass(), "type", 16);
        setField(term707537, term707537.getClass(), "functionName", null);
        setBooleanField(term707537, term707537.getClass(), "itsNeedsActivation", false);
        setIntField(term707537, term707537.getClass(), "itsFunctionType", 0);
        setBooleanField(term707537, term707537.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term707537, term707537.getClass(), "encodedSourceStart", 0);
        setIntField(term707537, term707537.getClass(), "encodedSourceEnd", 0);
        setField(term707537, term707537.getClass(), "sourceName", null);
        setIntField(term707537, term707537.getClass(), "baseLineno", 0);
        setIntField(term707537, term707537.getClass(), "endLineno", 0);
        setField(term707537, term707537.getClass(), "functions", null);
        setField(term707537, term707537.getClass(), "regexps", null);
        setField(term707537, term707537.getClass(), "itsVariables", null);
        setField(term707537, term707537.getClass(), "itsConst", null);
        setField(term707537, term707537.getClass(), "itsVariableNames", null);
        setIntField(term707537, term707537.getClass(), "varStart", 0);
        setField(term707537, term707537.getClass(), "compilerData", null);
        setIntField(term707537, term707537.getClass(), "type", 0);
        setField(term707537, term707537.getClass(), "next", null);
        setField(term707537, term707537.getClass(), "first", null);
        setField(term707537, term707537.getClass(), "last", null);
        setField(term707537, term707537.getClass(), "propListHead", null);
        setIntField(term707537, term707537.getClass(), "sourcePosition", 0);
        setField(term707537, term707537.getClass(), "jsType", null);
        setField(term707537, term707537.getClass(), "parent", null);
        setField(term707527, term707527.getClass(), "next", term707537);
        setField(term707527, term707527.getClass(), "first", term707527);
        setField(term707527, term707527.getClass(), "last", null);
        setField(term707527, term707527.getClass(), "propListHead", null);
        setIntField(term707527, term707527.getClass(), "sourcePosition", 0);
        setField(term707527, term707527.getClass(), "jsType", null);
        setField(term707527, term707527.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term707010;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term706924, args);
        assertTrue(recursiveEquals(term706924, term707603));
        assertTrue(recursiveEquals(term707010, term707604));
        assertTrue(recursiveEquals(retValue, term707527));
    }

};


