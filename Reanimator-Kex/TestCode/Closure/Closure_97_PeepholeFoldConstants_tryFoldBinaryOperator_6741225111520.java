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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560906;
     Object term560998;
     Object term561348;
     Object term561349;
     Object term561284;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560906 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term560998 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term561084 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term561154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term561154, term561154.getClass(), "type", 42);
        setField(term561084, term561084.getClass(), "next", term561154);
        setIntField(term561084, term561084.getClass(), "type", 42);
        setField(term560998, term560998.getClass(), "first", term561084);
        setIntField(term560998, term560998.getClass(), "type", 14);
        term561348 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term561348, term561348.getClass(), "currentTraversal", null);
        term561349 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term561350 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term561351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term561349, term561349.getClass(), "number", 0.0);
        setIntField(term561349, term561349.getClass(), "type", 14);
        setField(term561349, term561349.getClass(), "next", null);
        setField(term561350, term561350.getClass(), "functionName", null);
        setBooleanField(term561350, term561350.getClass(), "itsNeedsActivation", false);
        setIntField(term561350, term561350.getClass(), "itsFunctionType", 0);
        setBooleanField(term561350, term561350.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term561350, term561350.getClass(), "encodedSourceStart", 0);
        setIntField(term561350, term561350.getClass(), "encodedSourceEnd", 0);
        setField(term561350, term561350.getClass(), "sourceName", null);
        setIntField(term561350, term561350.getClass(), "baseLineno", 0);
        setIntField(term561350, term561350.getClass(), "endLineno", 0);
        setField(term561350, term561350.getClass(), "functions", null);
        setField(term561350, term561350.getClass(), "regexps", null);
        setField(term561350, term561350.getClass(), "itsVariables", null);
        setField(term561350, term561350.getClass(), "itsConst", null);
        setField(term561350, term561350.getClass(), "itsVariableNames", null);
        setIntField(term561350, term561350.getClass(), "varStart", 0);
        setField(term561350, term561350.getClass(), "compilerData", null);
        setIntField(term561350, term561350.getClass(), "type", 42);
        setIntField(term561351, term561351.getClass(), "type", 42);
        setField(term561351, term561351.getClass(), "next", null);
        setField(term561351, term561351.getClass(), "first", null);
        setField(term561351, term561351.getClass(), "last", null);
        setField(term561351, term561351.getClass(), "propListHead", null);
        setIntField(term561351, term561351.getClass(), "sourcePosition", 0);
        setField(term561351, term561351.getClass(), "jsType", null);
        setField(term561351, term561351.getClass(), "parent", null);
        setField(term561350, term561350.getClass(), "next", term561351);
        setField(term561350, term561350.getClass(), "first", null);
        setField(term561350, term561350.getClass(), "last", null);
        setField(term561350, term561350.getClass(), "propListHead", null);
        setIntField(term561350, term561350.getClass(), "sourcePosition", 0);
        setField(term561350, term561350.getClass(), "jsType", null);
        setField(term561350, term561350.getClass(), "parent", null);
        setField(term561349, term561349.getClass(), "first", term561350);
        setField(term561349, term561349.getClass(), "last", null);
        setField(term561349, term561349.getClass(), "propListHead", null);
        setIntField(term561349, term561349.getClass(), "sourcePosition", 0);
        setField(term561349, term561349.getClass(), "jsType", null);
        setField(term561349, term561349.getClass(), "parent", null);
        term561284 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term561287 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term561297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term561284, term561284.getClass(), "number", 0.0);
        setIntField(term561284, term561284.getClass(), "type", 14);
        setField(term561284, term561284.getClass(), "next", null);
        setField(term561287, term561287.getClass(), "functionName", null);
        setBooleanField(term561287, term561287.getClass(), "itsNeedsActivation", false);
        setIntField(term561287, term561287.getClass(), "itsFunctionType", 0);
        setBooleanField(term561287, term561287.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term561287, term561287.getClass(), "encodedSourceStart", 0);
        setIntField(term561287, term561287.getClass(), "encodedSourceEnd", 0);
        setField(term561287, term561287.getClass(), "sourceName", null);
        setIntField(term561287, term561287.getClass(), "baseLineno", 0);
        setIntField(term561287, term561287.getClass(), "endLineno", 0);
        setField(term561287, term561287.getClass(), "functions", null);
        setField(term561287, term561287.getClass(), "regexps", null);
        setField(term561287, term561287.getClass(), "itsVariables", null);
        setField(term561287, term561287.getClass(), "itsConst", null);
        setField(term561287, term561287.getClass(), "itsVariableNames", null);
        setIntField(term561287, term561287.getClass(), "varStart", 0);
        setField(term561287, term561287.getClass(), "compilerData", null);
        setIntField(term561287, term561287.getClass(), "type", 42);
        setIntField(term561297, term561297.getClass(), "type", 42);
        setField(term561297, term561297.getClass(), "next", null);
        setField(term561297, term561297.getClass(), "first", null);
        setField(term561297, term561297.getClass(), "last", null);
        setField(term561297, term561297.getClass(), "propListHead", null);
        setIntField(term561297, term561297.getClass(), "sourcePosition", 0);
        setField(term561297, term561297.getClass(), "jsType", null);
        setField(term561297, term561297.getClass(), "parent", null);
        setField(term561287, term561287.getClass(), "next", term561297);
        setField(term561287, term561287.getClass(), "first", null);
        setField(term561287, term561287.getClass(), "last", null);
        setField(term561287, term561287.getClass(), "propListHead", null);
        setIntField(term561287, term561287.getClass(), "sourcePosition", 0);
        setField(term561287, term561287.getClass(), "jsType", null);
        setField(term561287, term561287.getClass(), "parent", null);
        setField(term561284, term561284.getClass(), "first", term561287);
        setField(term561284, term561284.getClass(), "last", null);
        setField(term561284, term561284.getClass(), "propListHead", null);
        setIntField(term561284, term561284.getClass(), "sourcePosition", 0);
        setField(term561284, term561284.getClass(), "jsType", null);
        setField(term561284, term561284.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term560998;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term560906, args);
        assertTrue(recursiveEquals(term560906, term561348));
        assertTrue(recursiveEquals(term560998, term561349));
        assertTrue(recursiveEquals(retValue, term561284));
    }

};


