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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557794;
     Object term557886;
     Object term558106;
     Object term558107;
     Object term558063;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term557794 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term557886 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term557972 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term558042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term557972, term557972.getClass(), "next", term558042);
        setField(term557886, term557886.getClass(), "first", term557972);
        setIntField(term557886, term557886.getClass(), "type", 24);
        term558106 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term558106, term558106.getClass(), "currentTraversal", null);
        term558107 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term558108 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term558109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term558107, term558107.getClass(), "str", null);
        setIntField(term558107, term558107.getClass(), "type", 24);
        setField(term558107, term558107.getClass(), "next", null);
        setField(term558108, term558108.getClass(), "functionName", null);
        setBooleanField(term558108, term558108.getClass(), "itsNeedsActivation", false);
        setIntField(term558108, term558108.getClass(), "itsFunctionType", 0);
        setBooleanField(term558108, term558108.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term558108, term558108.getClass(), "encodedSourceStart", 0);
        setIntField(term558108, term558108.getClass(), "encodedSourceEnd", 0);
        setField(term558108, term558108.getClass(), "sourceName", null);
        setIntField(term558108, term558108.getClass(), "baseLineno", 0);
        setIntField(term558108, term558108.getClass(), "endLineno", 0);
        setField(term558108, term558108.getClass(), "functions", null);
        setField(term558108, term558108.getClass(), "regexps", null);
        setField(term558108, term558108.getClass(), "itsVariables", null);
        setField(term558108, term558108.getClass(), "itsConst", null);
        setField(term558108, term558108.getClass(), "itsVariableNames", null);
        setIntField(term558108, term558108.getClass(), "varStart", 0);
        setField(term558108, term558108.getClass(), "compilerData", null);
        setIntField(term558108, term558108.getClass(), "type", 0);
        setIntField(term558109, term558109.getClass(), "type", 0);
        setField(term558109, term558109.getClass(), "next", null);
        setField(term558109, term558109.getClass(), "first", null);
        setField(term558109, term558109.getClass(), "last", null);
        setField(term558109, term558109.getClass(), "propListHead", null);
        setIntField(term558109, term558109.getClass(), "sourcePosition", 0);
        setField(term558109, term558109.getClass(), "jsType", null);
        setField(term558109, term558109.getClass(), "parent", null);
        setField(term558108, term558108.getClass(), "next", term558109);
        setField(term558108, term558108.getClass(), "first", null);
        setField(term558108, term558108.getClass(), "last", null);
        setField(term558108, term558108.getClass(), "propListHead", null);
        setIntField(term558108, term558108.getClass(), "sourcePosition", 0);
        setField(term558108, term558108.getClass(), "jsType", null);
        setField(term558108, term558108.getClass(), "parent", null);
        setField(term558107, term558107.getClass(), "first", term558108);
        setField(term558107, term558107.getClass(), "last", null);
        setField(term558107, term558107.getClass(), "propListHead", null);
        setIntField(term558107, term558107.getClass(), "sourcePosition", 0);
        setField(term558107, term558107.getClass(), "jsType", null);
        setField(term558107, term558107.getClass(), "parent", null);
        term558063 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term558065 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term558075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term558063, term558063.getClass(), "str", null);
        setIntField(term558063, term558063.getClass(), "type", 24);
        setField(term558063, term558063.getClass(), "next", null);
        setField(term558065, term558065.getClass(), "functionName", null);
        setBooleanField(term558065, term558065.getClass(), "itsNeedsActivation", false);
        setIntField(term558065, term558065.getClass(), "itsFunctionType", 0);
        setBooleanField(term558065, term558065.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term558065, term558065.getClass(), "encodedSourceStart", 0);
        setIntField(term558065, term558065.getClass(), "encodedSourceEnd", 0);
        setField(term558065, term558065.getClass(), "sourceName", null);
        setIntField(term558065, term558065.getClass(), "baseLineno", 0);
        setIntField(term558065, term558065.getClass(), "endLineno", 0);
        setField(term558065, term558065.getClass(), "functions", null);
        setField(term558065, term558065.getClass(), "regexps", null);
        setField(term558065, term558065.getClass(), "itsVariables", null);
        setField(term558065, term558065.getClass(), "itsConst", null);
        setField(term558065, term558065.getClass(), "itsVariableNames", null);
        setIntField(term558065, term558065.getClass(), "varStart", 0);
        setField(term558065, term558065.getClass(), "compilerData", null);
        setIntField(term558065, term558065.getClass(), "type", 0);
        setIntField(term558075, term558075.getClass(), "type", 0);
        setField(term558075, term558075.getClass(), "next", null);
        setField(term558075, term558075.getClass(), "first", null);
        setField(term558075, term558075.getClass(), "last", null);
        setField(term558075, term558075.getClass(), "propListHead", null);
        setIntField(term558075, term558075.getClass(), "sourcePosition", 0);
        setField(term558075, term558075.getClass(), "jsType", null);
        setField(term558075, term558075.getClass(), "parent", null);
        setField(term558065, term558065.getClass(), "next", term558075);
        setField(term558065, term558065.getClass(), "first", null);
        setField(term558065, term558065.getClass(), "last", null);
        setField(term558065, term558065.getClass(), "propListHead", null);
        setIntField(term558065, term558065.getClass(), "sourcePosition", 0);
        setField(term558065, term558065.getClass(), "jsType", null);
        setField(term558065, term558065.getClass(), "parent", null);
        setField(term558063, term558063.getClass(), "first", term558065);
        setField(term558063, term558063.getClass(), "last", null);
        setField(term558063, term558063.getClass(), "propListHead", null);
        setIntField(term558063, term558063.getClass(), "sourcePosition", 0);
        setField(term558063, term558063.getClass(), "jsType", null);
        setField(term558063, term558063.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term557886;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term557794, args);
        assertTrue(recursiveEquals(term557794, term558106));
        assertTrue(recursiveEquals(term557886, term558107));
        assertTrue(recursiveEquals(retValue, term558063));
    }

};


