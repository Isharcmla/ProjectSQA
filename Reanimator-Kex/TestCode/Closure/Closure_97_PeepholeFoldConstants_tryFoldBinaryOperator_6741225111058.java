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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329166;
     Object term329252;
     Object term329519;
     Object term329520;
     Object term329423;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329166 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term329252 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term329338 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term329408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term329338, term329338.getClass(), "next", term329408);
        setField(term329252, term329252.getClass(), "first", term329338);
        setIntField(term329252, term329252.getClass(), "type", 21);
        term329519 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term329519, term329519.getClass(), "currentTraversal", null);
        term329520 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term329521 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term329522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term329520, term329520.getClass(), "functionName", null);
        setBooleanField(term329520, term329520.getClass(), "itsNeedsActivation", false);
        setIntField(term329520, term329520.getClass(), "itsFunctionType", 0);
        setBooleanField(term329520, term329520.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term329520, term329520.getClass(), "encodedSourceStart", 0);
        setIntField(term329520, term329520.getClass(), "encodedSourceEnd", 0);
        setField(term329520, term329520.getClass(), "sourceName", null);
        setIntField(term329520, term329520.getClass(), "baseLineno", 0);
        setIntField(term329520, term329520.getClass(), "endLineno", 0);
        setField(term329520, term329520.getClass(), "functions", null);
        setField(term329520, term329520.getClass(), "regexps", null);
        setField(term329520, term329520.getClass(), "itsVariables", null);
        setField(term329520, term329520.getClass(), "itsConst", null);
        setField(term329520, term329520.getClass(), "itsVariableNames", null);
        setIntField(term329520, term329520.getClass(), "varStart", 0);
        setField(term329520, term329520.getClass(), "compilerData", null);
        setIntField(term329520, term329520.getClass(), "type", 21);
        setField(term329520, term329520.getClass(), "next", null);
        setField(term329521, term329521.getClass(), "functionName", null);
        setBooleanField(term329521, term329521.getClass(), "itsNeedsActivation", false);
        setIntField(term329521, term329521.getClass(), "itsFunctionType", 0);
        setBooleanField(term329521, term329521.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term329521, term329521.getClass(), "encodedSourceStart", 0);
        setIntField(term329521, term329521.getClass(), "encodedSourceEnd", 0);
        setField(term329521, term329521.getClass(), "sourceName", null);
        setIntField(term329521, term329521.getClass(), "baseLineno", 0);
        setIntField(term329521, term329521.getClass(), "endLineno", 0);
        setField(term329521, term329521.getClass(), "functions", null);
        setField(term329521, term329521.getClass(), "regexps", null);
        setField(term329521, term329521.getClass(), "itsVariables", null);
        setField(term329521, term329521.getClass(), "itsConst", null);
        setField(term329521, term329521.getClass(), "itsVariableNames", null);
        setIntField(term329521, term329521.getClass(), "varStart", 0);
        setField(term329521, term329521.getClass(), "compilerData", null);
        setIntField(term329521, term329521.getClass(), "type", 0);
        setIntField(term329522, term329522.getClass(), "type", 0);
        setField(term329522, term329522.getClass(), "next", null);
        setField(term329522, term329522.getClass(), "first", null);
        setField(term329522, term329522.getClass(), "last", null);
        setField(term329522, term329522.getClass(), "propListHead", null);
        setIntField(term329522, term329522.getClass(), "sourcePosition", 0);
        setField(term329522, term329522.getClass(), "jsType", null);
        setField(term329522, term329522.getClass(), "parent", null);
        setField(term329521, term329521.getClass(), "next", term329522);
        setField(term329521, term329521.getClass(), "first", null);
        setField(term329521, term329521.getClass(), "last", null);
        setField(term329521, term329521.getClass(), "propListHead", null);
        setIntField(term329521, term329521.getClass(), "sourcePosition", 0);
        setField(term329521, term329521.getClass(), "jsType", null);
        setField(term329521, term329521.getClass(), "parent", null);
        setField(term329520, term329520.getClass(), "first", term329521);
        setField(term329520, term329520.getClass(), "last", null);
        setField(term329520, term329520.getClass(), "propListHead", null);
        setIntField(term329520, term329520.getClass(), "sourcePosition", 0);
        setField(term329520, term329520.getClass(), "jsType", null);
        setField(term329520, term329520.getClass(), "parent", null);
        term329423 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term329433 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term329443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term329423, term329423.getClass(), "functionName", null);
        setBooleanField(term329423, term329423.getClass(), "itsNeedsActivation", false);
        setIntField(term329423, term329423.getClass(), "itsFunctionType", 0);
        setBooleanField(term329423, term329423.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term329423, term329423.getClass(), "encodedSourceStart", 0);
        setIntField(term329423, term329423.getClass(), "encodedSourceEnd", 0);
        setField(term329423, term329423.getClass(), "sourceName", null);
        setIntField(term329423, term329423.getClass(), "baseLineno", 0);
        setIntField(term329423, term329423.getClass(), "endLineno", 0);
        setField(term329423, term329423.getClass(), "functions", null);
        setField(term329423, term329423.getClass(), "regexps", null);
        setField(term329423, term329423.getClass(), "itsVariables", null);
        setField(term329423, term329423.getClass(), "itsConst", null);
        setField(term329423, term329423.getClass(), "itsVariableNames", null);
        setIntField(term329423, term329423.getClass(), "varStart", 0);
        setField(term329423, term329423.getClass(), "compilerData", null);
        setIntField(term329423, term329423.getClass(), "type", 21);
        setField(term329423, term329423.getClass(), "next", null);
        setField(term329433, term329433.getClass(), "functionName", null);
        setBooleanField(term329433, term329433.getClass(), "itsNeedsActivation", false);
        setIntField(term329433, term329433.getClass(), "itsFunctionType", 0);
        setBooleanField(term329433, term329433.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term329433, term329433.getClass(), "encodedSourceStart", 0);
        setIntField(term329433, term329433.getClass(), "encodedSourceEnd", 0);
        setField(term329433, term329433.getClass(), "sourceName", null);
        setIntField(term329433, term329433.getClass(), "baseLineno", 0);
        setIntField(term329433, term329433.getClass(), "endLineno", 0);
        setField(term329433, term329433.getClass(), "functions", null);
        setField(term329433, term329433.getClass(), "regexps", null);
        setField(term329433, term329433.getClass(), "itsVariables", null);
        setField(term329433, term329433.getClass(), "itsConst", null);
        setField(term329433, term329433.getClass(), "itsVariableNames", null);
        setIntField(term329433, term329433.getClass(), "varStart", 0);
        setField(term329433, term329433.getClass(), "compilerData", null);
        setIntField(term329433, term329433.getClass(), "type", 0);
        setIntField(term329443, term329443.getClass(), "type", 0);
        setField(term329443, term329443.getClass(), "next", null);
        setField(term329443, term329443.getClass(), "first", null);
        setField(term329443, term329443.getClass(), "last", null);
        setField(term329443, term329443.getClass(), "propListHead", null);
        setIntField(term329443, term329443.getClass(), "sourcePosition", 0);
        setField(term329443, term329443.getClass(), "jsType", null);
        setField(term329443, term329443.getClass(), "parent", null);
        setField(term329433, term329433.getClass(), "next", term329443);
        setField(term329433, term329433.getClass(), "first", null);
        setField(term329433, term329433.getClass(), "last", null);
        setField(term329433, term329433.getClass(), "propListHead", null);
        setIntField(term329433, term329433.getClass(), "sourcePosition", 0);
        setField(term329433, term329433.getClass(), "jsType", null);
        setField(term329433, term329433.getClass(), "parent", null);
        setField(term329423, term329423.getClass(), "first", term329433);
        setField(term329423, term329423.getClass(), "last", null);
        setField(term329423, term329423.getClass(), "propListHead", null);
        setIntField(term329423, term329423.getClass(), "sourcePosition", 0);
        setField(term329423, term329423.getClass(), "jsType", null);
        setField(term329423, term329423.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term329252;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term329166, args);
        assertTrue(recursiveEquals(term329166, term329519));
        assertTrue(recursiveEquals(term329252, term329520));
        assertTrue(recursiveEquals(retValue, term329423));
    }

};


