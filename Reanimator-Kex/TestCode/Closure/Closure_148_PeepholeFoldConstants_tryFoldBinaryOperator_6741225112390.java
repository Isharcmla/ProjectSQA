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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term664044;
     Object term664136;
     Object term664382;
     Object term664383;
     Object term664335;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term664044 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term664136 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term664222 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term664314 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term664222, term664222.getClass(), "next", term664314);
        setIntField(term664222, term664222.getClass(), "type", 39);
        setField(term664136, term664136.getClass(), "first", term664222);
        setIntField(term664136, term664136.getClass(), "type", 23);
        term664382 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term664382, term664382.getClass(), "currentTraversal", null);
        term664383 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term664384 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term664385 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term664383, term664383.getClass(), "number", 0.0);
        setIntField(term664383, term664383.getClass(), "type", 23);
        setField(term664383, term664383.getClass(), "next", null);
        setField(term664384, term664384.getClass(), "functionName", null);
        setBooleanField(term664384, term664384.getClass(), "itsNeedsActivation", false);
        setIntField(term664384, term664384.getClass(), "itsFunctionType", 0);
        setBooleanField(term664384, term664384.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term664384, term664384.getClass(), "encodedSourceStart", 0);
        setIntField(term664384, term664384.getClass(), "encodedSourceEnd", 0);
        setField(term664384, term664384.getClass(), "sourceName", null);
        setIntField(term664384, term664384.getClass(), "baseLineno", 0);
        setIntField(term664384, term664384.getClass(), "endLineno", 0);
        setField(term664384, term664384.getClass(), "functions", null);
        setField(term664384, term664384.getClass(), "regexps", null);
        setField(term664384, term664384.getClass(), "itsVariables", null);
        setField(term664384, term664384.getClass(), "itsConst", null);
        setField(term664384, term664384.getClass(), "itsVariableNames", null);
        setIntField(term664384, term664384.getClass(), "varStart", 0);
        setField(term664384, term664384.getClass(), "compilerData", null);
        setIntField(term664384, term664384.getClass(), "type", 39);
        setField(term664385, term664385.getClass(), "str", null);
        setIntField(term664385, term664385.getClass(), "type", 0);
        setField(term664385, term664385.getClass(), "next", null);
        setField(term664385, term664385.getClass(), "first", null);
        setField(term664385, term664385.getClass(), "last", null);
        setField(term664385, term664385.getClass(), "propListHead", null);
        setIntField(term664385, term664385.getClass(), "sourcePosition", 0);
        setField(term664385, term664385.getClass(), "jsType", null);
        setField(term664385, term664385.getClass(), "parent", null);
        setField(term664384, term664384.getClass(), "next", term664385);
        setField(term664384, term664384.getClass(), "first", null);
        setField(term664384, term664384.getClass(), "last", null);
        setField(term664384, term664384.getClass(), "propListHead", null);
        setIntField(term664384, term664384.getClass(), "sourcePosition", 0);
        setField(term664384, term664384.getClass(), "jsType", null);
        setField(term664384, term664384.getClass(), "parent", null);
        setField(term664383, term664383.getClass(), "first", term664384);
        setField(term664383, term664383.getClass(), "last", null);
        setField(term664383, term664383.getClass(), "propListHead", null);
        setIntField(term664383, term664383.getClass(), "sourcePosition", 0);
        setField(term664383, term664383.getClass(), "jsType", null);
        setField(term664383, term664383.getClass(), "parent", null);
        term664335 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term664338 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term664348 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term664335, term664335.getClass(), "number", 0.0);
        setIntField(term664335, term664335.getClass(), "type", 23);
        setField(term664335, term664335.getClass(), "next", null);
        setField(term664338, term664338.getClass(), "functionName", null);
        setBooleanField(term664338, term664338.getClass(), "itsNeedsActivation", false);
        setIntField(term664338, term664338.getClass(), "itsFunctionType", 0);
        setBooleanField(term664338, term664338.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term664338, term664338.getClass(), "encodedSourceStart", 0);
        setIntField(term664338, term664338.getClass(), "encodedSourceEnd", 0);
        setField(term664338, term664338.getClass(), "sourceName", null);
        setIntField(term664338, term664338.getClass(), "baseLineno", 0);
        setIntField(term664338, term664338.getClass(), "endLineno", 0);
        setField(term664338, term664338.getClass(), "functions", null);
        setField(term664338, term664338.getClass(), "regexps", null);
        setField(term664338, term664338.getClass(), "itsVariables", null);
        setField(term664338, term664338.getClass(), "itsConst", null);
        setField(term664338, term664338.getClass(), "itsVariableNames", null);
        setIntField(term664338, term664338.getClass(), "varStart", 0);
        setField(term664338, term664338.getClass(), "compilerData", null);
        setIntField(term664338, term664338.getClass(), "type", 39);
        setField(term664348, term664348.getClass(), "str", null);
        setIntField(term664348, term664348.getClass(), "type", 0);
        setField(term664348, term664348.getClass(), "next", null);
        setField(term664348, term664348.getClass(), "first", null);
        setField(term664348, term664348.getClass(), "last", null);
        setField(term664348, term664348.getClass(), "propListHead", null);
        setIntField(term664348, term664348.getClass(), "sourcePosition", 0);
        setField(term664348, term664348.getClass(), "jsType", null);
        setField(term664348, term664348.getClass(), "parent", null);
        setField(term664338, term664338.getClass(), "next", term664348);
        setField(term664338, term664338.getClass(), "first", null);
        setField(term664338, term664338.getClass(), "last", null);
        setField(term664338, term664338.getClass(), "propListHead", null);
        setIntField(term664338, term664338.getClass(), "sourcePosition", 0);
        setField(term664338, term664338.getClass(), "jsType", null);
        setField(term664338, term664338.getClass(), "parent", null);
        setField(term664335, term664335.getClass(), "first", term664338);
        setField(term664335, term664335.getClass(), "last", null);
        setField(term664335, term664335.getClass(), "propListHead", null);
        setIntField(term664335, term664335.getClass(), "sourcePosition", 0);
        setField(term664335, term664335.getClass(), "jsType", null);
        setField(term664335, term664335.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term664136;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term664044, args);
        assertTrue(recursiveEquals(term664044, term664382));
        assertTrue(recursiveEquals(term664136, term664383));
        assertTrue(recursiveEquals(retValue, term664335));
    }

};


