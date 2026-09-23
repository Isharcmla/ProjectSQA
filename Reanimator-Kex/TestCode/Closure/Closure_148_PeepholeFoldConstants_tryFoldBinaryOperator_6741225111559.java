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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392265;
     Object term392357;
     Object term393095;
     Object term393096;
     Object term393052;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392265 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term392357 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term392443 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term392513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term392443, term392443.getClass(), "next", term392513);
        setField(term392357, term392357.getClass(), "first", term392443);
        setIntField(term392357, term392357.getClass(), "type", 18);
        term393095 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term393095, term393095.getClass(), "currentTraversal", null);
        term393096 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term393097 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term393098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term393096, term393096.getClass(), "str", null);
        setIntField(term393096, term393096.getClass(), "type", 18);
        setField(term393096, term393096.getClass(), "next", null);
        setField(term393097, term393097.getClass(), "functionName", null);
        setBooleanField(term393097, term393097.getClass(), "itsNeedsActivation", false);
        setIntField(term393097, term393097.getClass(), "itsFunctionType", 0);
        setBooleanField(term393097, term393097.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term393097, term393097.getClass(), "encodedSourceStart", 0);
        setIntField(term393097, term393097.getClass(), "encodedSourceEnd", 0);
        setField(term393097, term393097.getClass(), "sourceName", null);
        setIntField(term393097, term393097.getClass(), "baseLineno", 0);
        setIntField(term393097, term393097.getClass(), "endLineno", 0);
        setField(term393097, term393097.getClass(), "functions", null);
        setField(term393097, term393097.getClass(), "regexps", null);
        setField(term393097, term393097.getClass(), "itsVariables", null);
        setField(term393097, term393097.getClass(), "itsConst", null);
        setField(term393097, term393097.getClass(), "itsVariableNames", null);
        setIntField(term393097, term393097.getClass(), "varStart", 0);
        setField(term393097, term393097.getClass(), "compilerData", null);
        setIntField(term393097, term393097.getClass(), "type", 0);
        setIntField(term393098, term393098.getClass(), "type", 0);
        setField(term393098, term393098.getClass(), "next", null);
        setField(term393098, term393098.getClass(), "first", null);
        setField(term393098, term393098.getClass(), "last", null);
        setField(term393098, term393098.getClass(), "propListHead", null);
        setIntField(term393098, term393098.getClass(), "sourcePosition", 0);
        setField(term393098, term393098.getClass(), "jsType", null);
        setField(term393098, term393098.getClass(), "parent", null);
        setField(term393097, term393097.getClass(), "next", term393098);
        setField(term393097, term393097.getClass(), "first", null);
        setField(term393097, term393097.getClass(), "last", null);
        setField(term393097, term393097.getClass(), "propListHead", null);
        setIntField(term393097, term393097.getClass(), "sourcePosition", 0);
        setField(term393097, term393097.getClass(), "jsType", null);
        setField(term393097, term393097.getClass(), "parent", null);
        setField(term393096, term393096.getClass(), "first", term393097);
        setField(term393096, term393096.getClass(), "last", null);
        setField(term393096, term393096.getClass(), "propListHead", null);
        setIntField(term393096, term393096.getClass(), "sourcePosition", 0);
        setField(term393096, term393096.getClass(), "jsType", null);
        setField(term393096, term393096.getClass(), "parent", null);
        term393052 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term393054 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term393064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term393052, term393052.getClass(), "str", null);
        setIntField(term393052, term393052.getClass(), "type", 18);
        setField(term393052, term393052.getClass(), "next", null);
        setField(term393054, term393054.getClass(), "functionName", null);
        setBooleanField(term393054, term393054.getClass(), "itsNeedsActivation", false);
        setIntField(term393054, term393054.getClass(), "itsFunctionType", 0);
        setBooleanField(term393054, term393054.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term393054, term393054.getClass(), "encodedSourceStart", 0);
        setIntField(term393054, term393054.getClass(), "encodedSourceEnd", 0);
        setField(term393054, term393054.getClass(), "sourceName", null);
        setIntField(term393054, term393054.getClass(), "baseLineno", 0);
        setIntField(term393054, term393054.getClass(), "endLineno", 0);
        setField(term393054, term393054.getClass(), "functions", null);
        setField(term393054, term393054.getClass(), "regexps", null);
        setField(term393054, term393054.getClass(), "itsVariables", null);
        setField(term393054, term393054.getClass(), "itsConst", null);
        setField(term393054, term393054.getClass(), "itsVariableNames", null);
        setIntField(term393054, term393054.getClass(), "varStart", 0);
        setField(term393054, term393054.getClass(), "compilerData", null);
        setIntField(term393054, term393054.getClass(), "type", 0);
        setIntField(term393064, term393064.getClass(), "type", 0);
        setField(term393064, term393064.getClass(), "next", null);
        setField(term393064, term393064.getClass(), "first", null);
        setField(term393064, term393064.getClass(), "last", null);
        setField(term393064, term393064.getClass(), "propListHead", null);
        setIntField(term393064, term393064.getClass(), "sourcePosition", 0);
        setField(term393064, term393064.getClass(), "jsType", null);
        setField(term393064, term393064.getClass(), "parent", null);
        setField(term393054, term393054.getClass(), "next", term393064);
        setField(term393054, term393054.getClass(), "first", null);
        setField(term393054, term393054.getClass(), "last", null);
        setField(term393054, term393054.getClass(), "propListHead", null);
        setIntField(term393054, term393054.getClass(), "sourcePosition", 0);
        setField(term393054, term393054.getClass(), "jsType", null);
        setField(term393054, term393054.getClass(), "parent", null);
        setField(term393052, term393052.getClass(), "first", term393054);
        setField(term393052, term393052.getClass(), "last", null);
        setField(term393052, term393052.getClass(), "propListHead", null);
        setIntField(term393052, term393052.getClass(), "sourcePosition", 0);
        setField(term393052, term393052.getClass(), "jsType", null);
        setField(term393052, term393052.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term392357;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term392265, args);
        assertTrue(recursiveEquals(term392265, term393095));
        assertTrue(recursiveEquals(term392357, term393096));
        assertTrue(recursiveEquals(retValue, term393052));
    }

};


