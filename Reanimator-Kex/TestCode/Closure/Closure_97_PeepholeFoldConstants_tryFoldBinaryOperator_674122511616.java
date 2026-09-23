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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160859;
     Object term160945;
     Object term161517;
     Object term161518;
     Object term161454;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160859 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term160945 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term161031 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term161101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term161031, term161031.getClass(), "next", term161101);
        setField(term160945, term160945.getClass(), "first", term161031);
        setIntField(term160945, term160945.getClass(), "type", 35);
        term161517 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term161517, term161517.getClass(), "currentTraversal", null);
        term161518 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term161519 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term161520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term161518, term161518.getClass(), "functionName", null);
        setBooleanField(term161518, term161518.getClass(), "itsNeedsActivation", false);
        setIntField(term161518, term161518.getClass(), "itsFunctionType", 0);
        setBooleanField(term161518, term161518.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term161518, term161518.getClass(), "encodedSourceStart", 0);
        setIntField(term161518, term161518.getClass(), "encodedSourceEnd", 0);
        setField(term161518, term161518.getClass(), "sourceName", null);
        setIntField(term161518, term161518.getClass(), "baseLineno", 0);
        setIntField(term161518, term161518.getClass(), "endLineno", 0);
        setField(term161518, term161518.getClass(), "functions", null);
        setField(term161518, term161518.getClass(), "regexps", null);
        setField(term161518, term161518.getClass(), "itsVariables", null);
        setField(term161518, term161518.getClass(), "itsConst", null);
        setField(term161518, term161518.getClass(), "itsVariableNames", null);
        setIntField(term161518, term161518.getClass(), "varStart", 0);
        setField(term161518, term161518.getClass(), "compilerData", null);
        setIntField(term161518, term161518.getClass(), "type", 35);
        setField(term161518, term161518.getClass(), "next", null);
        setField(term161519, term161519.getClass(), "functionName", null);
        setBooleanField(term161519, term161519.getClass(), "itsNeedsActivation", false);
        setIntField(term161519, term161519.getClass(), "itsFunctionType", 0);
        setBooleanField(term161519, term161519.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term161519, term161519.getClass(), "encodedSourceStart", 0);
        setIntField(term161519, term161519.getClass(), "encodedSourceEnd", 0);
        setField(term161519, term161519.getClass(), "sourceName", null);
        setIntField(term161519, term161519.getClass(), "baseLineno", 0);
        setIntField(term161519, term161519.getClass(), "endLineno", 0);
        setField(term161519, term161519.getClass(), "functions", null);
        setField(term161519, term161519.getClass(), "regexps", null);
        setField(term161519, term161519.getClass(), "itsVariables", null);
        setField(term161519, term161519.getClass(), "itsConst", null);
        setField(term161519, term161519.getClass(), "itsVariableNames", null);
        setIntField(term161519, term161519.getClass(), "varStart", 0);
        setField(term161519, term161519.getClass(), "compilerData", null);
        setIntField(term161519, term161519.getClass(), "type", 0);
        setIntField(term161520, term161520.getClass(), "type", 0);
        setField(term161520, term161520.getClass(), "next", null);
        setField(term161520, term161520.getClass(), "first", null);
        setField(term161520, term161520.getClass(), "last", null);
        setField(term161520, term161520.getClass(), "propListHead", null);
        setIntField(term161520, term161520.getClass(), "sourcePosition", 0);
        setField(term161520, term161520.getClass(), "jsType", null);
        setField(term161520, term161520.getClass(), "parent", null);
        setField(term161519, term161519.getClass(), "next", term161520);
        setField(term161519, term161519.getClass(), "first", null);
        setField(term161519, term161519.getClass(), "last", null);
        setField(term161519, term161519.getClass(), "propListHead", null);
        setIntField(term161519, term161519.getClass(), "sourcePosition", 0);
        setField(term161519, term161519.getClass(), "jsType", null);
        setField(term161519, term161519.getClass(), "parent", null);
        setField(term161518, term161518.getClass(), "first", term161519);
        setField(term161518, term161518.getClass(), "last", null);
        setField(term161518, term161518.getClass(), "propListHead", null);
        setIntField(term161518, term161518.getClass(), "sourcePosition", 0);
        setField(term161518, term161518.getClass(), "jsType", null);
        setField(term161518, term161518.getClass(), "parent", null);
        term161454 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term161464 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term161474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term161454, term161454.getClass(), "functionName", null);
        setBooleanField(term161454, term161454.getClass(), "itsNeedsActivation", false);
        setIntField(term161454, term161454.getClass(), "itsFunctionType", 0);
        setBooleanField(term161454, term161454.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term161454, term161454.getClass(), "encodedSourceStart", 0);
        setIntField(term161454, term161454.getClass(), "encodedSourceEnd", 0);
        setField(term161454, term161454.getClass(), "sourceName", null);
        setIntField(term161454, term161454.getClass(), "baseLineno", 0);
        setIntField(term161454, term161454.getClass(), "endLineno", 0);
        setField(term161454, term161454.getClass(), "functions", null);
        setField(term161454, term161454.getClass(), "regexps", null);
        setField(term161454, term161454.getClass(), "itsVariables", null);
        setField(term161454, term161454.getClass(), "itsConst", null);
        setField(term161454, term161454.getClass(), "itsVariableNames", null);
        setIntField(term161454, term161454.getClass(), "varStart", 0);
        setField(term161454, term161454.getClass(), "compilerData", null);
        setIntField(term161454, term161454.getClass(), "type", 35);
        setField(term161454, term161454.getClass(), "next", null);
        setField(term161464, term161464.getClass(), "functionName", null);
        setBooleanField(term161464, term161464.getClass(), "itsNeedsActivation", false);
        setIntField(term161464, term161464.getClass(), "itsFunctionType", 0);
        setBooleanField(term161464, term161464.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term161464, term161464.getClass(), "encodedSourceStart", 0);
        setIntField(term161464, term161464.getClass(), "encodedSourceEnd", 0);
        setField(term161464, term161464.getClass(), "sourceName", null);
        setIntField(term161464, term161464.getClass(), "baseLineno", 0);
        setIntField(term161464, term161464.getClass(), "endLineno", 0);
        setField(term161464, term161464.getClass(), "functions", null);
        setField(term161464, term161464.getClass(), "regexps", null);
        setField(term161464, term161464.getClass(), "itsVariables", null);
        setField(term161464, term161464.getClass(), "itsConst", null);
        setField(term161464, term161464.getClass(), "itsVariableNames", null);
        setIntField(term161464, term161464.getClass(), "varStart", 0);
        setField(term161464, term161464.getClass(), "compilerData", null);
        setIntField(term161464, term161464.getClass(), "type", 0);
        setIntField(term161474, term161474.getClass(), "type", 0);
        setField(term161474, term161474.getClass(), "next", null);
        setField(term161474, term161474.getClass(), "first", null);
        setField(term161474, term161474.getClass(), "last", null);
        setField(term161474, term161474.getClass(), "propListHead", null);
        setIntField(term161474, term161474.getClass(), "sourcePosition", 0);
        setField(term161474, term161474.getClass(), "jsType", null);
        setField(term161474, term161474.getClass(), "parent", null);
        setField(term161464, term161464.getClass(), "next", term161474);
        setField(term161464, term161464.getClass(), "first", null);
        setField(term161464, term161464.getClass(), "last", null);
        setField(term161464, term161464.getClass(), "propListHead", null);
        setIntField(term161464, term161464.getClass(), "sourcePosition", 0);
        setField(term161464, term161464.getClass(), "jsType", null);
        setField(term161464, term161464.getClass(), "parent", null);
        setField(term161454, term161454.getClass(), "first", term161464);
        setField(term161454, term161454.getClass(), "last", null);
        setField(term161454, term161454.getClass(), "propListHead", null);
        setIntField(term161454, term161454.getClass(), "sourcePosition", 0);
        setField(term161454, term161454.getClass(), "jsType", null);
        setField(term161454, term161454.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term160945;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term160859, args);
        assertTrue(recursiveEquals(term160859, term161517));
        assertTrue(recursiveEquals(term160945, term161518));
        assertTrue(recursiveEquals(retValue, term161454));
    }

};


