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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term769597;
     Object term769689;
     Object term770524;
     Object term770525;
     Object term770443;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term769597 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term769689 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term769781 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term769867 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term769781, term769781.getClass(), "next", term769867);
        setIntField(term769781, term769781.getClass(), "type", 0);
        setField(term769689, term769689.getClass(), "first", term769781);
        setIntField(term769689, term769689.getClass(), "type", 100);
        setField(term769689, term769689.getClass(), "parent", null);
        term770524 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term770524, term770524.getClass(), "currentTraversal", null);
        term770525 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term770526 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term770527 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term770525, term770525.getClass(), "number", 0.0);
        setIntField(term770525, term770525.getClass(), "type", 100);
        setField(term770525, term770525.getClass(), "next", null);
        setDoubleField(term770526, term770526.getClass(), "number", 0.0);
        setIntField(term770526, term770526.getClass(), "type", 0);
        setField(term770527, term770527.getClass(), "functionName", null);
        setBooleanField(term770527, term770527.getClass(), "itsNeedsActivation", false);
        setIntField(term770527, term770527.getClass(), "itsFunctionType", 0);
        setBooleanField(term770527, term770527.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term770527, term770527.getClass(), "encodedSourceStart", 0);
        setIntField(term770527, term770527.getClass(), "encodedSourceEnd", 0);
        setField(term770527, term770527.getClass(), "sourceName", null);
        setIntField(term770527, term770527.getClass(), "baseLineno", 0);
        setIntField(term770527, term770527.getClass(), "endLineno", 0);
        setField(term770527, term770527.getClass(), "functions", null);
        setField(term770527, term770527.getClass(), "regexps", null);
        setField(term770527, term770527.getClass(), "itsVariables", null);
        setField(term770527, term770527.getClass(), "itsConst", null);
        setField(term770527, term770527.getClass(), "itsVariableNames", null);
        setIntField(term770527, term770527.getClass(), "varStart", 0);
        setField(term770527, term770527.getClass(), "compilerData", null);
        setIntField(term770527, term770527.getClass(), "type", 0);
        setField(term770527, term770527.getClass(), "next", null);
        setField(term770527, term770527.getClass(), "first", null);
        setField(term770527, term770527.getClass(), "last", null);
        setField(term770527, term770527.getClass(), "propListHead", null);
        setIntField(term770527, term770527.getClass(), "sourcePosition", 0);
        setField(term770527, term770527.getClass(), "jsType", null);
        setField(term770527, term770527.getClass(), "parent", null);
        setField(term770526, term770526.getClass(), "next", term770527);
        setField(term770526, term770526.getClass(), "first", null);
        setField(term770526, term770526.getClass(), "last", null);
        setField(term770526, term770526.getClass(), "propListHead", null);
        setIntField(term770526, term770526.getClass(), "sourcePosition", 0);
        setField(term770526, term770526.getClass(), "jsType", null);
        setField(term770526, term770526.getClass(), "parent", null);
        setField(term770525, term770525.getClass(), "first", term770526);
        setField(term770525, term770525.getClass(), "last", null);
        setField(term770525, term770525.getClass(), "propListHead", null);
        setIntField(term770525, term770525.getClass(), "sourcePosition", 0);
        setField(term770525, term770525.getClass(), "jsType", null);
        setField(term770525, term770525.getClass(), "parent", null);
        term770443 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term770446 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term770449 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term770443, term770443.getClass(), "number", 0.0);
        setIntField(term770443, term770443.getClass(), "type", 100);
        setField(term770443, term770443.getClass(), "next", null);
        setDoubleField(term770446, term770446.getClass(), "number", 0.0);
        setIntField(term770446, term770446.getClass(), "type", 0);
        setField(term770449, term770449.getClass(), "functionName", null);
        setBooleanField(term770449, term770449.getClass(), "itsNeedsActivation", false);
        setIntField(term770449, term770449.getClass(), "itsFunctionType", 0);
        setBooleanField(term770449, term770449.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term770449, term770449.getClass(), "encodedSourceStart", 0);
        setIntField(term770449, term770449.getClass(), "encodedSourceEnd", 0);
        setField(term770449, term770449.getClass(), "sourceName", null);
        setIntField(term770449, term770449.getClass(), "baseLineno", 0);
        setIntField(term770449, term770449.getClass(), "endLineno", 0);
        setField(term770449, term770449.getClass(), "functions", null);
        setField(term770449, term770449.getClass(), "regexps", null);
        setField(term770449, term770449.getClass(), "itsVariables", null);
        setField(term770449, term770449.getClass(), "itsConst", null);
        setField(term770449, term770449.getClass(), "itsVariableNames", null);
        setIntField(term770449, term770449.getClass(), "varStart", 0);
        setField(term770449, term770449.getClass(), "compilerData", null);
        setIntField(term770449, term770449.getClass(), "type", 0);
        setField(term770449, term770449.getClass(), "next", null);
        setField(term770449, term770449.getClass(), "first", null);
        setField(term770449, term770449.getClass(), "last", null);
        setField(term770449, term770449.getClass(), "propListHead", null);
        setIntField(term770449, term770449.getClass(), "sourcePosition", 0);
        setField(term770449, term770449.getClass(), "jsType", null);
        setField(term770449, term770449.getClass(), "parent", null);
        setField(term770446, term770446.getClass(), "next", term770449);
        setField(term770446, term770446.getClass(), "first", null);
        setField(term770446, term770446.getClass(), "last", null);
        setField(term770446, term770446.getClass(), "propListHead", null);
        setIntField(term770446, term770446.getClass(), "sourcePosition", 0);
        setField(term770446, term770446.getClass(), "jsType", null);
        setField(term770446, term770446.getClass(), "parent", null);
        setField(term770443, term770443.getClass(), "first", term770446);
        setField(term770443, term770443.getClass(), "last", null);
        setField(term770443, term770443.getClass(), "propListHead", null);
        setIntField(term770443, term770443.getClass(), "sourcePosition", 0);
        setField(term770443, term770443.getClass(), "jsType", null);
        setField(term770443, term770443.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term769689;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term769597, args);
        assertTrue(recursiveEquals(term769597, term770524));
        assertTrue(recursiveEquals(term769689, term770525));
        assertTrue(recursiveEquals(retValue, term770443));
    }

};


