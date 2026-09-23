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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86545;
     Object term86631;
     Object term87169;
     Object term87170;
     Object term87110;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86545 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term86631 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term86717 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term86787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term86717, term86717.getClass(), "next", term86787);
        setField(term86631, term86631.getClass(), "first", term86717);
        setIntField(term86631, term86631.getClass(), "type", 24);
        term87169 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term87169, term87169.getClass(), "currentTraversal", null);
        term87170 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term87171 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term87172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term87170, term87170.getClass(), "functionName", null);
        setBooleanField(term87170, term87170.getClass(), "itsNeedsActivation", false);
        setIntField(term87170, term87170.getClass(), "itsFunctionType", 0);
        setBooleanField(term87170, term87170.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term87170, term87170.getClass(), "encodedSourceStart", 0);
        setIntField(term87170, term87170.getClass(), "encodedSourceEnd", 0);
        setField(term87170, term87170.getClass(), "sourceName", null);
        setIntField(term87170, term87170.getClass(), "baseLineno", 0);
        setIntField(term87170, term87170.getClass(), "endLineno", 0);
        setField(term87170, term87170.getClass(), "functions", null);
        setField(term87170, term87170.getClass(), "regexps", null);
        setField(term87170, term87170.getClass(), "itsVariables", null);
        setField(term87170, term87170.getClass(), "itsConst", null);
        setField(term87170, term87170.getClass(), "itsVariableNames", null);
        setIntField(term87170, term87170.getClass(), "varStart", 0);
        setField(term87170, term87170.getClass(), "compilerData", null);
        setIntField(term87170, term87170.getClass(), "type", 24);
        setField(term87170, term87170.getClass(), "next", null);
        setField(term87171, term87171.getClass(), "functionName", null);
        setBooleanField(term87171, term87171.getClass(), "itsNeedsActivation", false);
        setIntField(term87171, term87171.getClass(), "itsFunctionType", 0);
        setBooleanField(term87171, term87171.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term87171, term87171.getClass(), "encodedSourceStart", 0);
        setIntField(term87171, term87171.getClass(), "encodedSourceEnd", 0);
        setField(term87171, term87171.getClass(), "sourceName", null);
        setIntField(term87171, term87171.getClass(), "baseLineno", 0);
        setIntField(term87171, term87171.getClass(), "endLineno", 0);
        setField(term87171, term87171.getClass(), "functions", null);
        setField(term87171, term87171.getClass(), "regexps", null);
        setField(term87171, term87171.getClass(), "itsVariables", null);
        setField(term87171, term87171.getClass(), "itsConst", null);
        setField(term87171, term87171.getClass(), "itsVariableNames", null);
        setIntField(term87171, term87171.getClass(), "varStart", 0);
        setField(term87171, term87171.getClass(), "compilerData", null);
        setIntField(term87171, term87171.getClass(), "type", 0);
        setIntField(term87172, term87172.getClass(), "type", 0);
        setField(term87172, term87172.getClass(), "next", null);
        setField(term87172, term87172.getClass(), "first", null);
        setField(term87172, term87172.getClass(), "last", null);
        setField(term87172, term87172.getClass(), "propListHead", null);
        setIntField(term87172, term87172.getClass(), "sourcePosition", 0);
        setField(term87172, term87172.getClass(), "jsType", null);
        setField(term87172, term87172.getClass(), "parent", null);
        setField(term87171, term87171.getClass(), "next", term87172);
        setField(term87171, term87171.getClass(), "first", null);
        setField(term87171, term87171.getClass(), "last", null);
        setField(term87171, term87171.getClass(), "propListHead", null);
        setIntField(term87171, term87171.getClass(), "sourcePosition", 0);
        setField(term87171, term87171.getClass(), "jsType", null);
        setField(term87171, term87171.getClass(), "parent", null);
        setField(term87170, term87170.getClass(), "first", term87171);
        setField(term87170, term87170.getClass(), "last", null);
        setField(term87170, term87170.getClass(), "propListHead", null);
        setIntField(term87170, term87170.getClass(), "sourcePosition", 0);
        setField(term87170, term87170.getClass(), "jsType", null);
        setField(term87170, term87170.getClass(), "parent", null);
        term87110 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term87120 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term87130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term87110, term87110.getClass(), "functionName", null);
        setBooleanField(term87110, term87110.getClass(), "itsNeedsActivation", false);
        setIntField(term87110, term87110.getClass(), "itsFunctionType", 0);
        setBooleanField(term87110, term87110.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term87110, term87110.getClass(), "encodedSourceStart", 0);
        setIntField(term87110, term87110.getClass(), "encodedSourceEnd", 0);
        setField(term87110, term87110.getClass(), "sourceName", null);
        setIntField(term87110, term87110.getClass(), "baseLineno", 0);
        setIntField(term87110, term87110.getClass(), "endLineno", 0);
        setField(term87110, term87110.getClass(), "functions", null);
        setField(term87110, term87110.getClass(), "regexps", null);
        setField(term87110, term87110.getClass(), "itsVariables", null);
        setField(term87110, term87110.getClass(), "itsConst", null);
        setField(term87110, term87110.getClass(), "itsVariableNames", null);
        setIntField(term87110, term87110.getClass(), "varStart", 0);
        setField(term87110, term87110.getClass(), "compilerData", null);
        setIntField(term87110, term87110.getClass(), "type", 24);
        setField(term87110, term87110.getClass(), "next", null);
        setField(term87120, term87120.getClass(), "functionName", null);
        setBooleanField(term87120, term87120.getClass(), "itsNeedsActivation", false);
        setIntField(term87120, term87120.getClass(), "itsFunctionType", 0);
        setBooleanField(term87120, term87120.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term87120, term87120.getClass(), "encodedSourceStart", 0);
        setIntField(term87120, term87120.getClass(), "encodedSourceEnd", 0);
        setField(term87120, term87120.getClass(), "sourceName", null);
        setIntField(term87120, term87120.getClass(), "baseLineno", 0);
        setIntField(term87120, term87120.getClass(), "endLineno", 0);
        setField(term87120, term87120.getClass(), "functions", null);
        setField(term87120, term87120.getClass(), "regexps", null);
        setField(term87120, term87120.getClass(), "itsVariables", null);
        setField(term87120, term87120.getClass(), "itsConst", null);
        setField(term87120, term87120.getClass(), "itsVariableNames", null);
        setIntField(term87120, term87120.getClass(), "varStart", 0);
        setField(term87120, term87120.getClass(), "compilerData", null);
        setIntField(term87120, term87120.getClass(), "type", 0);
        setIntField(term87130, term87130.getClass(), "type", 0);
        setField(term87130, term87130.getClass(), "next", null);
        setField(term87130, term87130.getClass(), "first", null);
        setField(term87130, term87130.getClass(), "last", null);
        setField(term87130, term87130.getClass(), "propListHead", null);
        setIntField(term87130, term87130.getClass(), "sourcePosition", 0);
        setField(term87130, term87130.getClass(), "jsType", null);
        setField(term87130, term87130.getClass(), "parent", null);
        setField(term87120, term87120.getClass(), "next", term87130);
        setField(term87120, term87120.getClass(), "first", null);
        setField(term87120, term87120.getClass(), "last", null);
        setField(term87120, term87120.getClass(), "propListHead", null);
        setIntField(term87120, term87120.getClass(), "sourcePosition", 0);
        setField(term87120, term87120.getClass(), "jsType", null);
        setField(term87120, term87120.getClass(), "parent", null);
        setField(term87110, term87110.getClass(), "first", term87120);
        setField(term87110, term87110.getClass(), "last", null);
        setField(term87110, term87110.getClass(), "propListHead", null);
        setIntField(term87110, term87110.getClass(), "sourcePosition", 0);
        setField(term87110, term87110.getClass(), "jsType", null);
        setField(term87110, term87110.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term86631;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term86545, args);
        assertTrue(recursiveEquals(term86545, term87169));
        assertTrue(recursiveEquals(term86631, term87170));
        assertTrue(recursiveEquals(retValue, term87110));
    }

};


