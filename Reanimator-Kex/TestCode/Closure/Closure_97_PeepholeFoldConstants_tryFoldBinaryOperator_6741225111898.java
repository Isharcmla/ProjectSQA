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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term725320;
     Object term725412;
     Object term725652;
     Object term725653;
     Object term725603;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term725320 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term725412 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term725498 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term725412, term725412.getClass(), "first", term725412);
        setField(term725412, term725412.getClass(), "next", term725498);
        setIntField(term725412, term725412.getClass(), "type", 33);
        term725652 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term725652, term725652.getClass(), "currentTraversal", null);
        term725653 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term725654 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term725653, term725653.getClass(), "str", null);
        setIntField(term725653, term725653.getClass(), "type", 33);
        setField(term725654, term725654.getClass(), "functionName", null);
        setBooleanField(term725654, term725654.getClass(), "itsNeedsActivation", false);
        setIntField(term725654, term725654.getClass(), "itsFunctionType", 0);
        setBooleanField(term725654, term725654.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term725654, term725654.getClass(), "encodedSourceStart", 0);
        setIntField(term725654, term725654.getClass(), "encodedSourceEnd", 0);
        setField(term725654, term725654.getClass(), "sourceName", null);
        setIntField(term725654, term725654.getClass(), "baseLineno", 0);
        setIntField(term725654, term725654.getClass(), "endLineno", 0);
        setField(term725654, term725654.getClass(), "functions", null);
        setField(term725654, term725654.getClass(), "regexps", null);
        setField(term725654, term725654.getClass(), "itsVariables", null);
        setField(term725654, term725654.getClass(), "itsConst", null);
        setField(term725654, term725654.getClass(), "itsVariableNames", null);
        setIntField(term725654, term725654.getClass(), "varStart", 0);
        setField(term725654, term725654.getClass(), "compilerData", null);
        setIntField(term725654, term725654.getClass(), "type", 0);
        setField(term725654, term725654.getClass(), "next", null);
        setField(term725654, term725654.getClass(), "first", null);
        setField(term725654, term725654.getClass(), "last", null);
        setField(term725654, term725654.getClass(), "propListHead", null);
        setIntField(term725654, term725654.getClass(), "sourcePosition", 0);
        setField(term725654, term725654.getClass(), "jsType", null);
        setField(term725654, term725654.getClass(), "parent", null);
        setField(term725653, term725653.getClass(), "next", term725654);
        setField(term725653, term725653.getClass(), "first", term725653);
        setField(term725653, term725653.getClass(), "last", null);
        setField(term725653, term725653.getClass(), "propListHead", null);
        setIntField(term725653, term725653.getClass(), "sourcePosition", 0);
        setField(term725653, term725653.getClass(), "jsType", null);
        setField(term725653, term725653.getClass(), "parent", null);
        term725603 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term725605 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term725603, term725603.getClass(), "str", null);
        setIntField(term725603, term725603.getClass(), "type", 33);
        setField(term725605, term725605.getClass(), "functionName", null);
        setBooleanField(term725605, term725605.getClass(), "itsNeedsActivation", false);
        setIntField(term725605, term725605.getClass(), "itsFunctionType", 0);
        setBooleanField(term725605, term725605.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term725605, term725605.getClass(), "encodedSourceStart", 0);
        setIntField(term725605, term725605.getClass(), "encodedSourceEnd", 0);
        setField(term725605, term725605.getClass(), "sourceName", null);
        setIntField(term725605, term725605.getClass(), "baseLineno", 0);
        setIntField(term725605, term725605.getClass(), "endLineno", 0);
        setField(term725605, term725605.getClass(), "functions", null);
        setField(term725605, term725605.getClass(), "regexps", null);
        setField(term725605, term725605.getClass(), "itsVariables", null);
        setField(term725605, term725605.getClass(), "itsConst", null);
        setField(term725605, term725605.getClass(), "itsVariableNames", null);
        setIntField(term725605, term725605.getClass(), "varStart", 0);
        setField(term725605, term725605.getClass(), "compilerData", null);
        setIntField(term725605, term725605.getClass(), "type", 0);
        setField(term725605, term725605.getClass(), "next", null);
        setField(term725605, term725605.getClass(), "first", null);
        setField(term725605, term725605.getClass(), "last", null);
        setField(term725605, term725605.getClass(), "propListHead", null);
        setIntField(term725605, term725605.getClass(), "sourcePosition", 0);
        setField(term725605, term725605.getClass(), "jsType", null);
        setField(term725605, term725605.getClass(), "parent", null);
        setField(term725603, term725603.getClass(), "next", term725605);
        setField(term725603, term725603.getClass(), "first", term725603);
        setField(term725603, term725603.getClass(), "last", null);
        setField(term725603, term725603.getClass(), "propListHead", null);
        setIntField(term725603, term725603.getClass(), "sourcePosition", 0);
        setField(term725603, term725603.getClass(), "jsType", null);
        setField(term725603, term725603.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term725412;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term725320, args);
        assertTrue(recursiveEquals(term725320, term725652));
        assertTrue(recursiveEquals(term725412, term725653));
        assertTrue(recursiveEquals(retValue, term725603));
    }

};


