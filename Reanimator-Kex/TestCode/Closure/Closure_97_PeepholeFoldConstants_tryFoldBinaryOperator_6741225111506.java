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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557111;
     Object term557203;
     Object term557423;
     Object term557424;
     Object term557374;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term557111 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term557203 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term557289 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term557359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term557289, term557289.getClass(), "next", term557359);
        setField(term557203, term557203.getClass(), "first", term557289);
        setIntField(term557203, term557203.getClass(), "type", 9);
        term557423 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term557423, term557423.getClass(), "currentTraversal", null);
        term557424 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term557425 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term557426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term557424, term557424.getClass(), "str", null);
        setIntField(term557424, term557424.getClass(), "type", 9);
        setField(term557424, term557424.getClass(), "next", null);
        setField(term557425, term557425.getClass(), "functionName", null);
        setBooleanField(term557425, term557425.getClass(), "itsNeedsActivation", false);
        setIntField(term557425, term557425.getClass(), "itsFunctionType", 0);
        setBooleanField(term557425, term557425.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term557425, term557425.getClass(), "encodedSourceStart", 0);
        setIntField(term557425, term557425.getClass(), "encodedSourceEnd", 0);
        setField(term557425, term557425.getClass(), "sourceName", null);
        setIntField(term557425, term557425.getClass(), "baseLineno", 0);
        setIntField(term557425, term557425.getClass(), "endLineno", 0);
        setField(term557425, term557425.getClass(), "functions", null);
        setField(term557425, term557425.getClass(), "regexps", null);
        setField(term557425, term557425.getClass(), "itsVariables", null);
        setField(term557425, term557425.getClass(), "itsConst", null);
        setField(term557425, term557425.getClass(), "itsVariableNames", null);
        setIntField(term557425, term557425.getClass(), "varStart", 0);
        setField(term557425, term557425.getClass(), "compilerData", null);
        setIntField(term557425, term557425.getClass(), "type", 0);
        setIntField(term557426, term557426.getClass(), "type", 0);
        setField(term557426, term557426.getClass(), "next", null);
        setField(term557426, term557426.getClass(), "first", null);
        setField(term557426, term557426.getClass(), "last", null);
        setField(term557426, term557426.getClass(), "propListHead", null);
        setIntField(term557426, term557426.getClass(), "sourcePosition", 0);
        setField(term557426, term557426.getClass(), "jsType", null);
        setField(term557426, term557426.getClass(), "parent", null);
        setField(term557425, term557425.getClass(), "next", term557426);
        setField(term557425, term557425.getClass(), "first", null);
        setField(term557425, term557425.getClass(), "last", null);
        setField(term557425, term557425.getClass(), "propListHead", null);
        setIntField(term557425, term557425.getClass(), "sourcePosition", 0);
        setField(term557425, term557425.getClass(), "jsType", null);
        setField(term557425, term557425.getClass(), "parent", null);
        setField(term557424, term557424.getClass(), "first", term557425);
        setField(term557424, term557424.getClass(), "last", null);
        setField(term557424, term557424.getClass(), "propListHead", null);
        setIntField(term557424, term557424.getClass(), "sourcePosition", 0);
        setField(term557424, term557424.getClass(), "jsType", null);
        setField(term557424, term557424.getClass(), "parent", null);
        term557374 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term557376 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term557386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term557374, term557374.getClass(), "str", null);
        setIntField(term557374, term557374.getClass(), "type", 9);
        setField(term557374, term557374.getClass(), "next", null);
        setField(term557376, term557376.getClass(), "functionName", null);
        setBooleanField(term557376, term557376.getClass(), "itsNeedsActivation", false);
        setIntField(term557376, term557376.getClass(), "itsFunctionType", 0);
        setBooleanField(term557376, term557376.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term557376, term557376.getClass(), "encodedSourceStart", 0);
        setIntField(term557376, term557376.getClass(), "encodedSourceEnd", 0);
        setField(term557376, term557376.getClass(), "sourceName", null);
        setIntField(term557376, term557376.getClass(), "baseLineno", 0);
        setIntField(term557376, term557376.getClass(), "endLineno", 0);
        setField(term557376, term557376.getClass(), "functions", null);
        setField(term557376, term557376.getClass(), "regexps", null);
        setField(term557376, term557376.getClass(), "itsVariables", null);
        setField(term557376, term557376.getClass(), "itsConst", null);
        setField(term557376, term557376.getClass(), "itsVariableNames", null);
        setIntField(term557376, term557376.getClass(), "varStart", 0);
        setField(term557376, term557376.getClass(), "compilerData", null);
        setIntField(term557376, term557376.getClass(), "type", 0);
        setIntField(term557386, term557386.getClass(), "type", 0);
        setField(term557386, term557386.getClass(), "next", null);
        setField(term557386, term557386.getClass(), "first", null);
        setField(term557386, term557386.getClass(), "last", null);
        setField(term557386, term557386.getClass(), "propListHead", null);
        setIntField(term557386, term557386.getClass(), "sourcePosition", 0);
        setField(term557386, term557386.getClass(), "jsType", null);
        setField(term557386, term557386.getClass(), "parent", null);
        setField(term557376, term557376.getClass(), "next", term557386);
        setField(term557376, term557376.getClass(), "first", null);
        setField(term557376, term557376.getClass(), "last", null);
        setField(term557376, term557376.getClass(), "propListHead", null);
        setIntField(term557376, term557376.getClass(), "sourcePosition", 0);
        setField(term557376, term557376.getClass(), "jsType", null);
        setField(term557376, term557376.getClass(), "parent", null);
        setField(term557374, term557374.getClass(), "first", term557376);
        setField(term557374, term557374.getClass(), "last", null);
        setField(term557374, term557374.getClass(), "propListHead", null);
        setIntField(term557374, term557374.getClass(), "sourcePosition", 0);
        setField(term557374, term557374.getClass(), "jsType", null);
        setField(term557374, term557374.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term557203;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term557111, args);
        assertTrue(recursiveEquals(term557111, term557423));
        assertTrue(recursiveEquals(term557203, term557424));
        assertTrue(recursiveEquals(retValue, term557374));
    }

};


