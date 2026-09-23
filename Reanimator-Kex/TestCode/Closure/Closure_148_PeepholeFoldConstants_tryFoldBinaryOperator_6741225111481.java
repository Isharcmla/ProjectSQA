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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368110;
     Object term368202;
     Object term368789;
     Object term368790;
     Object term368744;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368110 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term368202 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term368288 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term368358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term368288, term368288.getClass(), "next", term368358);
        setIntField(term368288, term368288.getClass(), "type", 39);
        setField(term368202, term368202.getClass(), "first", term368288);
        setIntField(term368202, term368202.getClass(), "type", 20);
        term368789 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term368789, term368789.getClass(), "currentTraversal", null);
        term368790 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term368791 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term368792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term368790, term368790.getClass(), "str", null);
        setIntField(term368790, term368790.getClass(), "type", 20);
        setField(term368790, term368790.getClass(), "next", null);
        setField(term368791, term368791.getClass(), "functionName", null);
        setBooleanField(term368791, term368791.getClass(), "itsNeedsActivation", false);
        setIntField(term368791, term368791.getClass(), "itsFunctionType", 0);
        setBooleanField(term368791, term368791.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term368791, term368791.getClass(), "encodedSourceStart", 0);
        setIntField(term368791, term368791.getClass(), "encodedSourceEnd", 0);
        setField(term368791, term368791.getClass(), "sourceName", null);
        setIntField(term368791, term368791.getClass(), "baseLineno", 0);
        setIntField(term368791, term368791.getClass(), "endLineno", 0);
        setField(term368791, term368791.getClass(), "functions", null);
        setField(term368791, term368791.getClass(), "regexps", null);
        setField(term368791, term368791.getClass(), "itsVariables", null);
        setField(term368791, term368791.getClass(), "itsConst", null);
        setField(term368791, term368791.getClass(), "itsVariableNames", null);
        setIntField(term368791, term368791.getClass(), "varStart", 0);
        setField(term368791, term368791.getClass(), "compilerData", null);
        setIntField(term368791, term368791.getClass(), "type", 39);
        setIntField(term368792, term368792.getClass(), "type", 0);
        setField(term368792, term368792.getClass(), "next", null);
        setField(term368792, term368792.getClass(), "first", null);
        setField(term368792, term368792.getClass(), "last", null);
        setField(term368792, term368792.getClass(), "propListHead", null);
        setIntField(term368792, term368792.getClass(), "sourcePosition", 0);
        setField(term368792, term368792.getClass(), "jsType", null);
        setField(term368792, term368792.getClass(), "parent", null);
        setField(term368791, term368791.getClass(), "next", term368792);
        setField(term368791, term368791.getClass(), "first", null);
        setField(term368791, term368791.getClass(), "last", null);
        setField(term368791, term368791.getClass(), "propListHead", null);
        setIntField(term368791, term368791.getClass(), "sourcePosition", 0);
        setField(term368791, term368791.getClass(), "jsType", null);
        setField(term368791, term368791.getClass(), "parent", null);
        setField(term368790, term368790.getClass(), "first", term368791);
        setField(term368790, term368790.getClass(), "last", null);
        setField(term368790, term368790.getClass(), "propListHead", null);
        setIntField(term368790, term368790.getClass(), "sourcePosition", 0);
        setField(term368790, term368790.getClass(), "jsType", null);
        setField(term368790, term368790.getClass(), "parent", null);
        term368744 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term368746 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term368756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term368744, term368744.getClass(), "str", null);
        setIntField(term368744, term368744.getClass(), "type", 20);
        setField(term368744, term368744.getClass(), "next", null);
        setField(term368746, term368746.getClass(), "functionName", null);
        setBooleanField(term368746, term368746.getClass(), "itsNeedsActivation", false);
        setIntField(term368746, term368746.getClass(), "itsFunctionType", 0);
        setBooleanField(term368746, term368746.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term368746, term368746.getClass(), "encodedSourceStart", 0);
        setIntField(term368746, term368746.getClass(), "encodedSourceEnd", 0);
        setField(term368746, term368746.getClass(), "sourceName", null);
        setIntField(term368746, term368746.getClass(), "baseLineno", 0);
        setIntField(term368746, term368746.getClass(), "endLineno", 0);
        setField(term368746, term368746.getClass(), "functions", null);
        setField(term368746, term368746.getClass(), "regexps", null);
        setField(term368746, term368746.getClass(), "itsVariables", null);
        setField(term368746, term368746.getClass(), "itsConst", null);
        setField(term368746, term368746.getClass(), "itsVariableNames", null);
        setIntField(term368746, term368746.getClass(), "varStart", 0);
        setField(term368746, term368746.getClass(), "compilerData", null);
        setIntField(term368746, term368746.getClass(), "type", 39);
        setIntField(term368756, term368756.getClass(), "type", 0);
        setField(term368756, term368756.getClass(), "next", null);
        setField(term368756, term368756.getClass(), "first", null);
        setField(term368756, term368756.getClass(), "last", null);
        setField(term368756, term368756.getClass(), "propListHead", null);
        setIntField(term368756, term368756.getClass(), "sourcePosition", 0);
        setField(term368756, term368756.getClass(), "jsType", null);
        setField(term368756, term368756.getClass(), "parent", null);
        setField(term368746, term368746.getClass(), "next", term368756);
        setField(term368746, term368746.getClass(), "first", null);
        setField(term368746, term368746.getClass(), "last", null);
        setField(term368746, term368746.getClass(), "propListHead", null);
        setIntField(term368746, term368746.getClass(), "sourcePosition", 0);
        setField(term368746, term368746.getClass(), "jsType", null);
        setField(term368746, term368746.getClass(), "parent", null);
        setField(term368744, term368744.getClass(), "first", term368746);
        setField(term368744, term368744.getClass(), "last", null);
        setField(term368744, term368744.getClass(), "propListHead", null);
        setIntField(term368744, term368744.getClass(), "sourcePosition", 0);
        setField(term368744, term368744.getClass(), "jsType", null);
        setField(term368744, term368744.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term368202;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term368110, args);
        assertTrue(recursiveEquals(term368110, term368789));
        assertTrue(recursiveEquals(term368202, term368790));
        assertTrue(recursiveEquals(retValue, term368744));
    }

};


