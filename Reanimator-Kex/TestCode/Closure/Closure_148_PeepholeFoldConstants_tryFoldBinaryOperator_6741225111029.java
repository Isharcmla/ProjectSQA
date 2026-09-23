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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240630;
     Object term240720;
     Object term241447;
     Object term241448;
     Object term241389;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240630 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term240720 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term240806 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term240898 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term240806, term240806.getClass(), "next", term240898);
        setIntField(term240806, term240806.getClass(), "type", 39);
        setField(term240720, term240720.getClass(), "first", term240806);
        setIntField(term240720, term240720.getClass(), "type", 22);
        term241447 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term241447, term241447.getClass(), "currentTraversal", null);
        term241448 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term241449 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term241450 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term241448, term241448.getClass(), "encodedSourceStart", 0);
        setIntField(term241448, term241448.getClass(), "encodedSourceEnd", 0);
        setField(term241448, term241448.getClass(), "sourceName", null);
        setIntField(term241448, term241448.getClass(), "baseLineno", 0);
        setIntField(term241448, term241448.getClass(), "endLineno", 0);
        setField(term241448, term241448.getClass(), "functions", null);
        setField(term241448, term241448.getClass(), "regexps", null);
        setField(term241448, term241448.getClass(), "itsVariables", null);
        setField(term241448, term241448.getClass(), "itsConst", null);
        setField(term241448, term241448.getClass(), "itsVariableNames", null);
        setIntField(term241448, term241448.getClass(), "varStart", 0);
        setField(term241448, term241448.getClass(), "compilerData", null);
        setIntField(term241448, term241448.getClass(), "type", 22);
        setField(term241448, term241448.getClass(), "next", null);
        setField(term241449, term241449.getClass(), "functionName", null);
        setBooleanField(term241449, term241449.getClass(), "itsNeedsActivation", false);
        setIntField(term241449, term241449.getClass(), "itsFunctionType", 0);
        setBooleanField(term241449, term241449.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term241449, term241449.getClass(), "encodedSourceStart", 0);
        setIntField(term241449, term241449.getClass(), "encodedSourceEnd", 0);
        setField(term241449, term241449.getClass(), "sourceName", null);
        setIntField(term241449, term241449.getClass(), "baseLineno", 0);
        setIntField(term241449, term241449.getClass(), "endLineno", 0);
        setField(term241449, term241449.getClass(), "functions", null);
        setField(term241449, term241449.getClass(), "regexps", null);
        setField(term241449, term241449.getClass(), "itsVariables", null);
        setField(term241449, term241449.getClass(), "itsConst", null);
        setField(term241449, term241449.getClass(), "itsVariableNames", null);
        setIntField(term241449, term241449.getClass(), "varStart", 0);
        setField(term241449, term241449.getClass(), "compilerData", null);
        setIntField(term241449, term241449.getClass(), "type", 39);
        setDoubleField(term241450, term241450.getClass(), "number", 0.0);
        setIntField(term241450, term241450.getClass(), "type", 0);
        setField(term241450, term241450.getClass(), "next", null);
        setField(term241450, term241450.getClass(), "first", null);
        setField(term241450, term241450.getClass(), "last", null);
        setField(term241450, term241450.getClass(), "propListHead", null);
        setIntField(term241450, term241450.getClass(), "sourcePosition", 0);
        setField(term241450, term241450.getClass(), "jsType", null);
        setField(term241450, term241450.getClass(), "parent", null);
        setField(term241449, term241449.getClass(), "next", term241450);
        setField(term241449, term241449.getClass(), "first", null);
        setField(term241449, term241449.getClass(), "last", null);
        setField(term241449, term241449.getClass(), "propListHead", null);
        setIntField(term241449, term241449.getClass(), "sourcePosition", 0);
        setField(term241449, term241449.getClass(), "jsType", null);
        setField(term241449, term241449.getClass(), "parent", null);
        setField(term241448, term241448.getClass(), "first", term241449);
        setField(term241448, term241448.getClass(), "last", null);
        setField(term241448, term241448.getClass(), "propListHead", null);
        setIntField(term241448, term241448.getClass(), "sourcePosition", 0);
        setField(term241448, term241448.getClass(), "jsType", null);
        setField(term241448, term241448.getClass(), "parent", null);
        term241389 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term241396 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term241406 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term241389, term241389.getClass(), "encodedSourceStart", 0);
        setIntField(term241389, term241389.getClass(), "encodedSourceEnd", 0);
        setField(term241389, term241389.getClass(), "sourceName", null);
        setIntField(term241389, term241389.getClass(), "baseLineno", 0);
        setIntField(term241389, term241389.getClass(), "endLineno", 0);
        setField(term241389, term241389.getClass(), "functions", null);
        setField(term241389, term241389.getClass(), "regexps", null);
        setField(term241389, term241389.getClass(), "itsVariables", null);
        setField(term241389, term241389.getClass(), "itsConst", null);
        setField(term241389, term241389.getClass(), "itsVariableNames", null);
        setIntField(term241389, term241389.getClass(), "varStart", 0);
        setField(term241389, term241389.getClass(), "compilerData", null);
        setIntField(term241389, term241389.getClass(), "type", 22);
        setField(term241389, term241389.getClass(), "next", null);
        setField(term241396, term241396.getClass(), "functionName", null);
        setBooleanField(term241396, term241396.getClass(), "itsNeedsActivation", false);
        setIntField(term241396, term241396.getClass(), "itsFunctionType", 0);
        setBooleanField(term241396, term241396.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term241396, term241396.getClass(), "encodedSourceStart", 0);
        setIntField(term241396, term241396.getClass(), "encodedSourceEnd", 0);
        setField(term241396, term241396.getClass(), "sourceName", null);
        setIntField(term241396, term241396.getClass(), "baseLineno", 0);
        setIntField(term241396, term241396.getClass(), "endLineno", 0);
        setField(term241396, term241396.getClass(), "functions", null);
        setField(term241396, term241396.getClass(), "regexps", null);
        setField(term241396, term241396.getClass(), "itsVariables", null);
        setField(term241396, term241396.getClass(), "itsConst", null);
        setField(term241396, term241396.getClass(), "itsVariableNames", null);
        setIntField(term241396, term241396.getClass(), "varStart", 0);
        setField(term241396, term241396.getClass(), "compilerData", null);
        setIntField(term241396, term241396.getClass(), "type", 39);
        setDoubleField(term241406, term241406.getClass(), "number", 0.0);
        setIntField(term241406, term241406.getClass(), "type", 0);
        setField(term241406, term241406.getClass(), "next", null);
        setField(term241406, term241406.getClass(), "first", null);
        setField(term241406, term241406.getClass(), "last", null);
        setField(term241406, term241406.getClass(), "propListHead", null);
        setIntField(term241406, term241406.getClass(), "sourcePosition", 0);
        setField(term241406, term241406.getClass(), "jsType", null);
        setField(term241406, term241406.getClass(), "parent", null);
        setField(term241396, term241396.getClass(), "next", term241406);
        setField(term241396, term241396.getClass(), "first", null);
        setField(term241396, term241396.getClass(), "last", null);
        setField(term241396, term241396.getClass(), "propListHead", null);
        setIntField(term241396, term241396.getClass(), "sourcePosition", 0);
        setField(term241396, term241396.getClass(), "jsType", null);
        setField(term241396, term241396.getClass(), "parent", null);
        setField(term241389, term241389.getClass(), "first", term241396);
        setField(term241389, term241389.getClass(), "last", null);
        setField(term241389, term241389.getClass(), "propListHead", null);
        setIntField(term241389, term241389.getClass(), "sourcePosition", 0);
        setField(term241389, term241389.getClass(), "jsType", null);
        setField(term241389, term241389.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term240720;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term240630, args);
        assertTrue(recursiveEquals(term240630, term241447));
        assertTrue(recursiveEquals(term240720, term241448));
        assertTrue(recursiveEquals(retValue, term241389));
    }

};


