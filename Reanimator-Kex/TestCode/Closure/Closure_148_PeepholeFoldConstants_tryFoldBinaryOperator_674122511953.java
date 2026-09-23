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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222346;
     Object term222432;
     Object term223073;
     Object term223074;
     Object term223014;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222346 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term222432 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term222518 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term222588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term222518, term222518.getClass(), "next", term222588);
        setField(term222432, term222432.getClass(), "first", term222518);
        setIntField(term222432, term222432.getClass(), "type", 22);
        term223073 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term223073, term223073.getClass(), "currentTraversal", null);
        term223074 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term223075 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term223076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term223074, term223074.getClass(), "functionName", null);
        setBooleanField(term223074, term223074.getClass(), "itsNeedsActivation", false);
        setIntField(term223074, term223074.getClass(), "itsFunctionType", 0);
        setBooleanField(term223074, term223074.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term223074, term223074.getClass(), "encodedSourceStart", 0);
        setIntField(term223074, term223074.getClass(), "encodedSourceEnd", 0);
        setField(term223074, term223074.getClass(), "sourceName", null);
        setIntField(term223074, term223074.getClass(), "baseLineno", 0);
        setIntField(term223074, term223074.getClass(), "endLineno", 0);
        setField(term223074, term223074.getClass(), "functions", null);
        setField(term223074, term223074.getClass(), "regexps", null);
        setField(term223074, term223074.getClass(), "itsVariables", null);
        setField(term223074, term223074.getClass(), "itsConst", null);
        setField(term223074, term223074.getClass(), "itsVariableNames", null);
        setIntField(term223074, term223074.getClass(), "varStart", 0);
        setField(term223074, term223074.getClass(), "compilerData", null);
        setIntField(term223074, term223074.getClass(), "type", 22);
        setField(term223074, term223074.getClass(), "next", null);
        setField(term223075, term223075.getClass(), "functionName", null);
        setBooleanField(term223075, term223075.getClass(), "itsNeedsActivation", false);
        setIntField(term223075, term223075.getClass(), "itsFunctionType", 0);
        setBooleanField(term223075, term223075.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term223075, term223075.getClass(), "encodedSourceStart", 0);
        setIntField(term223075, term223075.getClass(), "encodedSourceEnd", 0);
        setField(term223075, term223075.getClass(), "sourceName", null);
        setIntField(term223075, term223075.getClass(), "baseLineno", 0);
        setIntField(term223075, term223075.getClass(), "endLineno", 0);
        setField(term223075, term223075.getClass(), "functions", null);
        setField(term223075, term223075.getClass(), "regexps", null);
        setField(term223075, term223075.getClass(), "itsVariables", null);
        setField(term223075, term223075.getClass(), "itsConst", null);
        setField(term223075, term223075.getClass(), "itsVariableNames", null);
        setIntField(term223075, term223075.getClass(), "varStart", 0);
        setField(term223075, term223075.getClass(), "compilerData", null);
        setIntField(term223075, term223075.getClass(), "type", 0);
        setIntField(term223076, term223076.getClass(), "type", 0);
        setField(term223076, term223076.getClass(), "next", null);
        setField(term223076, term223076.getClass(), "first", null);
        setField(term223076, term223076.getClass(), "last", null);
        setField(term223076, term223076.getClass(), "propListHead", null);
        setIntField(term223076, term223076.getClass(), "sourcePosition", 0);
        setField(term223076, term223076.getClass(), "jsType", null);
        setField(term223076, term223076.getClass(), "parent", null);
        setField(term223075, term223075.getClass(), "next", term223076);
        setField(term223075, term223075.getClass(), "first", null);
        setField(term223075, term223075.getClass(), "last", null);
        setField(term223075, term223075.getClass(), "propListHead", null);
        setIntField(term223075, term223075.getClass(), "sourcePosition", 0);
        setField(term223075, term223075.getClass(), "jsType", null);
        setField(term223075, term223075.getClass(), "parent", null);
        setField(term223074, term223074.getClass(), "first", term223075);
        setField(term223074, term223074.getClass(), "last", null);
        setField(term223074, term223074.getClass(), "propListHead", null);
        setIntField(term223074, term223074.getClass(), "sourcePosition", 0);
        setField(term223074, term223074.getClass(), "jsType", null);
        setField(term223074, term223074.getClass(), "parent", null);
        term223014 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term223024 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term223034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term223014, term223014.getClass(), "functionName", null);
        setBooleanField(term223014, term223014.getClass(), "itsNeedsActivation", false);
        setIntField(term223014, term223014.getClass(), "itsFunctionType", 0);
        setBooleanField(term223014, term223014.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term223014, term223014.getClass(), "encodedSourceStart", 0);
        setIntField(term223014, term223014.getClass(), "encodedSourceEnd", 0);
        setField(term223014, term223014.getClass(), "sourceName", null);
        setIntField(term223014, term223014.getClass(), "baseLineno", 0);
        setIntField(term223014, term223014.getClass(), "endLineno", 0);
        setField(term223014, term223014.getClass(), "functions", null);
        setField(term223014, term223014.getClass(), "regexps", null);
        setField(term223014, term223014.getClass(), "itsVariables", null);
        setField(term223014, term223014.getClass(), "itsConst", null);
        setField(term223014, term223014.getClass(), "itsVariableNames", null);
        setIntField(term223014, term223014.getClass(), "varStart", 0);
        setField(term223014, term223014.getClass(), "compilerData", null);
        setIntField(term223014, term223014.getClass(), "type", 22);
        setField(term223014, term223014.getClass(), "next", null);
        setField(term223024, term223024.getClass(), "functionName", null);
        setBooleanField(term223024, term223024.getClass(), "itsNeedsActivation", false);
        setIntField(term223024, term223024.getClass(), "itsFunctionType", 0);
        setBooleanField(term223024, term223024.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term223024, term223024.getClass(), "encodedSourceStart", 0);
        setIntField(term223024, term223024.getClass(), "encodedSourceEnd", 0);
        setField(term223024, term223024.getClass(), "sourceName", null);
        setIntField(term223024, term223024.getClass(), "baseLineno", 0);
        setIntField(term223024, term223024.getClass(), "endLineno", 0);
        setField(term223024, term223024.getClass(), "functions", null);
        setField(term223024, term223024.getClass(), "regexps", null);
        setField(term223024, term223024.getClass(), "itsVariables", null);
        setField(term223024, term223024.getClass(), "itsConst", null);
        setField(term223024, term223024.getClass(), "itsVariableNames", null);
        setIntField(term223024, term223024.getClass(), "varStart", 0);
        setField(term223024, term223024.getClass(), "compilerData", null);
        setIntField(term223024, term223024.getClass(), "type", 0);
        setIntField(term223034, term223034.getClass(), "type", 0);
        setField(term223034, term223034.getClass(), "next", null);
        setField(term223034, term223034.getClass(), "first", null);
        setField(term223034, term223034.getClass(), "last", null);
        setField(term223034, term223034.getClass(), "propListHead", null);
        setIntField(term223034, term223034.getClass(), "sourcePosition", 0);
        setField(term223034, term223034.getClass(), "jsType", null);
        setField(term223034, term223034.getClass(), "parent", null);
        setField(term223024, term223024.getClass(), "next", term223034);
        setField(term223024, term223024.getClass(), "first", null);
        setField(term223024, term223024.getClass(), "last", null);
        setField(term223024, term223024.getClass(), "propListHead", null);
        setIntField(term223024, term223024.getClass(), "sourcePosition", 0);
        setField(term223024, term223024.getClass(), "jsType", null);
        setField(term223024, term223024.getClass(), "parent", null);
        setField(term223014, term223014.getClass(), "first", term223024);
        setField(term223014, term223014.getClass(), "last", null);
        setField(term223014, term223014.getClass(), "propListHead", null);
        setIntField(term223014, term223014.getClass(), "sourcePosition", 0);
        setField(term223014, term223014.getClass(), "jsType", null);
        setField(term223014, term223014.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term222432;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term222346, args);
        assertTrue(recursiveEquals(term222346, term223073));
        assertTrue(recursiveEquals(term222432, term223074));
        assertTrue(recursiveEquals(retValue, term223014));
    }

};


