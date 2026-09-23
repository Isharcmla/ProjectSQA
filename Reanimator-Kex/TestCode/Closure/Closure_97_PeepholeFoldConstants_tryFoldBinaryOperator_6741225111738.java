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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683530;
     Object term683616;
     Object term684194;
     Object term684195;
     Object term684128;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term683530 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term683616 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term683702 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term683772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term683702, term683702.getClass(), "next", term683772);
        setField(term683616, term683616.getClass(), "first", term683702);
        setIntField(term683616, term683616.getClass(), "type", 52);
        term684194 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term684194, term684194.getClass(), "currentTraversal", null);
        term684195 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term684196 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term684197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term684195, term684195.getClass(), "functionName", null);
        setBooleanField(term684195, term684195.getClass(), "itsNeedsActivation", false);
        setIntField(term684195, term684195.getClass(), "itsFunctionType", 0);
        setBooleanField(term684195, term684195.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term684195, term684195.getClass(), "encodedSourceStart", 0);
        setIntField(term684195, term684195.getClass(), "encodedSourceEnd", 0);
        setField(term684195, term684195.getClass(), "sourceName", null);
        setIntField(term684195, term684195.getClass(), "baseLineno", 0);
        setIntField(term684195, term684195.getClass(), "endLineno", 0);
        setField(term684195, term684195.getClass(), "functions", null);
        setField(term684195, term684195.getClass(), "regexps", null);
        setField(term684195, term684195.getClass(), "itsVariables", null);
        setField(term684195, term684195.getClass(), "itsConst", null);
        setField(term684195, term684195.getClass(), "itsVariableNames", null);
        setIntField(term684195, term684195.getClass(), "varStart", 0);
        setField(term684195, term684195.getClass(), "compilerData", null);
        setIntField(term684195, term684195.getClass(), "type", 52);
        setField(term684195, term684195.getClass(), "next", null);
        setField(term684196, term684196.getClass(), "functionName", null);
        setBooleanField(term684196, term684196.getClass(), "itsNeedsActivation", false);
        setIntField(term684196, term684196.getClass(), "itsFunctionType", 0);
        setBooleanField(term684196, term684196.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term684196, term684196.getClass(), "encodedSourceStart", 0);
        setIntField(term684196, term684196.getClass(), "encodedSourceEnd", 0);
        setField(term684196, term684196.getClass(), "sourceName", null);
        setIntField(term684196, term684196.getClass(), "baseLineno", 0);
        setIntField(term684196, term684196.getClass(), "endLineno", 0);
        setField(term684196, term684196.getClass(), "functions", null);
        setField(term684196, term684196.getClass(), "regexps", null);
        setField(term684196, term684196.getClass(), "itsVariables", null);
        setField(term684196, term684196.getClass(), "itsConst", null);
        setField(term684196, term684196.getClass(), "itsVariableNames", null);
        setIntField(term684196, term684196.getClass(), "varStart", 0);
        setField(term684196, term684196.getClass(), "compilerData", null);
        setIntField(term684196, term684196.getClass(), "type", 0);
        setIntField(term684197, term684197.getClass(), "type", 0);
        setField(term684197, term684197.getClass(), "next", null);
        setField(term684197, term684197.getClass(), "first", null);
        setField(term684197, term684197.getClass(), "last", null);
        setField(term684197, term684197.getClass(), "propListHead", null);
        setIntField(term684197, term684197.getClass(), "sourcePosition", 0);
        setField(term684197, term684197.getClass(), "jsType", null);
        setField(term684197, term684197.getClass(), "parent", null);
        setField(term684196, term684196.getClass(), "next", term684197);
        setField(term684196, term684196.getClass(), "first", null);
        setField(term684196, term684196.getClass(), "last", null);
        setField(term684196, term684196.getClass(), "propListHead", null);
        setIntField(term684196, term684196.getClass(), "sourcePosition", 0);
        setField(term684196, term684196.getClass(), "jsType", null);
        setField(term684196, term684196.getClass(), "parent", null);
        setField(term684195, term684195.getClass(), "first", term684196);
        setField(term684195, term684195.getClass(), "last", null);
        setField(term684195, term684195.getClass(), "propListHead", null);
        setIntField(term684195, term684195.getClass(), "sourcePosition", 0);
        setField(term684195, term684195.getClass(), "jsType", null);
        setField(term684195, term684195.getClass(), "parent", null);
        term684128 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term684138 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term684148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term684128, term684128.getClass(), "functionName", null);
        setBooleanField(term684128, term684128.getClass(), "itsNeedsActivation", false);
        setIntField(term684128, term684128.getClass(), "itsFunctionType", 0);
        setBooleanField(term684128, term684128.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term684128, term684128.getClass(), "encodedSourceStart", 0);
        setIntField(term684128, term684128.getClass(), "encodedSourceEnd", 0);
        setField(term684128, term684128.getClass(), "sourceName", null);
        setIntField(term684128, term684128.getClass(), "baseLineno", 0);
        setIntField(term684128, term684128.getClass(), "endLineno", 0);
        setField(term684128, term684128.getClass(), "functions", null);
        setField(term684128, term684128.getClass(), "regexps", null);
        setField(term684128, term684128.getClass(), "itsVariables", null);
        setField(term684128, term684128.getClass(), "itsConst", null);
        setField(term684128, term684128.getClass(), "itsVariableNames", null);
        setIntField(term684128, term684128.getClass(), "varStart", 0);
        setField(term684128, term684128.getClass(), "compilerData", null);
        setIntField(term684128, term684128.getClass(), "type", 52);
        setField(term684128, term684128.getClass(), "next", null);
        setField(term684138, term684138.getClass(), "functionName", null);
        setBooleanField(term684138, term684138.getClass(), "itsNeedsActivation", false);
        setIntField(term684138, term684138.getClass(), "itsFunctionType", 0);
        setBooleanField(term684138, term684138.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term684138, term684138.getClass(), "encodedSourceStart", 0);
        setIntField(term684138, term684138.getClass(), "encodedSourceEnd", 0);
        setField(term684138, term684138.getClass(), "sourceName", null);
        setIntField(term684138, term684138.getClass(), "baseLineno", 0);
        setIntField(term684138, term684138.getClass(), "endLineno", 0);
        setField(term684138, term684138.getClass(), "functions", null);
        setField(term684138, term684138.getClass(), "regexps", null);
        setField(term684138, term684138.getClass(), "itsVariables", null);
        setField(term684138, term684138.getClass(), "itsConst", null);
        setField(term684138, term684138.getClass(), "itsVariableNames", null);
        setIntField(term684138, term684138.getClass(), "varStart", 0);
        setField(term684138, term684138.getClass(), "compilerData", null);
        setIntField(term684138, term684138.getClass(), "type", 0);
        setIntField(term684148, term684148.getClass(), "type", 0);
        setField(term684148, term684148.getClass(), "next", null);
        setField(term684148, term684148.getClass(), "first", null);
        setField(term684148, term684148.getClass(), "last", null);
        setField(term684148, term684148.getClass(), "propListHead", null);
        setIntField(term684148, term684148.getClass(), "sourcePosition", 0);
        setField(term684148, term684148.getClass(), "jsType", null);
        setField(term684148, term684148.getClass(), "parent", null);
        setField(term684138, term684138.getClass(), "next", term684148);
        setField(term684138, term684138.getClass(), "first", null);
        setField(term684138, term684138.getClass(), "last", null);
        setField(term684138, term684138.getClass(), "propListHead", null);
        setIntField(term684138, term684138.getClass(), "sourcePosition", 0);
        setField(term684138, term684138.getClass(), "jsType", null);
        setField(term684138, term684138.getClass(), "parent", null);
        setField(term684128, term684128.getClass(), "first", term684138);
        setField(term684128, term684128.getClass(), "last", null);
        setField(term684128, term684128.getClass(), "propListHead", null);
        setIntField(term684128, term684128.getClass(), "sourcePosition", 0);
        setField(term684128, term684128.getClass(), "jsType", null);
        setField(term684128, term684128.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term683616;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term683530, args);
        assertTrue(recursiveEquals(term683530, term684194));
        assertTrue(recursiveEquals(term683616, term684195));
        assertTrue(recursiveEquals(retValue, term684128));
    }

};


