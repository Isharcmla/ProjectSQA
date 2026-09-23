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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855022;
     Object term855112;
     Object term855898;
     Object term855899;
     Object term855840;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855022 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term855112 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term855198 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term855290 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term855198, term855198.getClass(), "next", term855290);
        setIntField(term855198, term855198.getClass(), "type", 39);
        setField(term855112, term855112.getClass(), "first", term855198);
        setIntField(term855112, term855112.getClass(), "type", 20);
        term855898 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term855898, term855898.getClass(), "currentTraversal", null);
        term855899 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term855900 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term855901 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term855899, term855899.getClass(), "encodedSourceStart", 0);
        setIntField(term855899, term855899.getClass(), "encodedSourceEnd", 0);
        setField(term855899, term855899.getClass(), "sourceName", null);
        setIntField(term855899, term855899.getClass(), "baseLineno", 0);
        setIntField(term855899, term855899.getClass(), "endLineno", 0);
        setField(term855899, term855899.getClass(), "functions", null);
        setField(term855899, term855899.getClass(), "regexps", null);
        setField(term855899, term855899.getClass(), "itsVariables", null);
        setField(term855899, term855899.getClass(), "itsConst", null);
        setField(term855899, term855899.getClass(), "itsVariableNames", null);
        setIntField(term855899, term855899.getClass(), "varStart", 0);
        setField(term855899, term855899.getClass(), "compilerData", null);
        setIntField(term855899, term855899.getClass(), "type", 20);
        setField(term855899, term855899.getClass(), "next", null);
        setField(term855900, term855900.getClass(), "functionName", null);
        setBooleanField(term855900, term855900.getClass(), "itsNeedsActivation", false);
        setIntField(term855900, term855900.getClass(), "itsFunctionType", 0);
        setBooleanField(term855900, term855900.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term855900, term855900.getClass(), "encodedSourceStart", 0);
        setIntField(term855900, term855900.getClass(), "encodedSourceEnd", 0);
        setField(term855900, term855900.getClass(), "sourceName", null);
        setIntField(term855900, term855900.getClass(), "baseLineno", 0);
        setIntField(term855900, term855900.getClass(), "endLineno", 0);
        setField(term855900, term855900.getClass(), "functions", null);
        setField(term855900, term855900.getClass(), "regexps", null);
        setField(term855900, term855900.getClass(), "itsVariables", null);
        setField(term855900, term855900.getClass(), "itsConst", null);
        setField(term855900, term855900.getClass(), "itsVariableNames", null);
        setIntField(term855900, term855900.getClass(), "varStart", 0);
        setField(term855900, term855900.getClass(), "compilerData", null);
        setIntField(term855900, term855900.getClass(), "type", 39);
        setDoubleField(term855901, term855901.getClass(), "number", 0.0);
        setIntField(term855901, term855901.getClass(), "type", 0);
        setField(term855901, term855901.getClass(), "next", null);
        setField(term855901, term855901.getClass(), "first", null);
        setField(term855901, term855901.getClass(), "last", null);
        setField(term855901, term855901.getClass(), "propListHead", null);
        setIntField(term855901, term855901.getClass(), "sourcePosition", 0);
        setField(term855901, term855901.getClass(), "jsType", null);
        setField(term855901, term855901.getClass(), "parent", null);
        setField(term855900, term855900.getClass(), "next", term855901);
        setField(term855900, term855900.getClass(), "first", null);
        setField(term855900, term855900.getClass(), "last", null);
        setField(term855900, term855900.getClass(), "propListHead", null);
        setIntField(term855900, term855900.getClass(), "sourcePosition", 0);
        setField(term855900, term855900.getClass(), "jsType", null);
        setField(term855900, term855900.getClass(), "parent", null);
        setField(term855899, term855899.getClass(), "first", term855900);
        setField(term855899, term855899.getClass(), "last", null);
        setField(term855899, term855899.getClass(), "propListHead", null);
        setIntField(term855899, term855899.getClass(), "sourcePosition", 0);
        setField(term855899, term855899.getClass(), "jsType", null);
        setField(term855899, term855899.getClass(), "parent", null);
        term855840 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term855847 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term855857 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term855840, term855840.getClass(), "encodedSourceStart", 0);
        setIntField(term855840, term855840.getClass(), "encodedSourceEnd", 0);
        setField(term855840, term855840.getClass(), "sourceName", null);
        setIntField(term855840, term855840.getClass(), "baseLineno", 0);
        setIntField(term855840, term855840.getClass(), "endLineno", 0);
        setField(term855840, term855840.getClass(), "functions", null);
        setField(term855840, term855840.getClass(), "regexps", null);
        setField(term855840, term855840.getClass(), "itsVariables", null);
        setField(term855840, term855840.getClass(), "itsConst", null);
        setField(term855840, term855840.getClass(), "itsVariableNames", null);
        setIntField(term855840, term855840.getClass(), "varStart", 0);
        setField(term855840, term855840.getClass(), "compilerData", null);
        setIntField(term855840, term855840.getClass(), "type", 20);
        setField(term855840, term855840.getClass(), "next", null);
        setField(term855847, term855847.getClass(), "functionName", null);
        setBooleanField(term855847, term855847.getClass(), "itsNeedsActivation", false);
        setIntField(term855847, term855847.getClass(), "itsFunctionType", 0);
        setBooleanField(term855847, term855847.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term855847, term855847.getClass(), "encodedSourceStart", 0);
        setIntField(term855847, term855847.getClass(), "encodedSourceEnd", 0);
        setField(term855847, term855847.getClass(), "sourceName", null);
        setIntField(term855847, term855847.getClass(), "baseLineno", 0);
        setIntField(term855847, term855847.getClass(), "endLineno", 0);
        setField(term855847, term855847.getClass(), "functions", null);
        setField(term855847, term855847.getClass(), "regexps", null);
        setField(term855847, term855847.getClass(), "itsVariables", null);
        setField(term855847, term855847.getClass(), "itsConst", null);
        setField(term855847, term855847.getClass(), "itsVariableNames", null);
        setIntField(term855847, term855847.getClass(), "varStart", 0);
        setField(term855847, term855847.getClass(), "compilerData", null);
        setIntField(term855847, term855847.getClass(), "type", 39);
        setDoubleField(term855857, term855857.getClass(), "number", 0.0);
        setIntField(term855857, term855857.getClass(), "type", 0);
        setField(term855857, term855857.getClass(), "next", null);
        setField(term855857, term855857.getClass(), "first", null);
        setField(term855857, term855857.getClass(), "last", null);
        setField(term855857, term855857.getClass(), "propListHead", null);
        setIntField(term855857, term855857.getClass(), "sourcePosition", 0);
        setField(term855857, term855857.getClass(), "jsType", null);
        setField(term855857, term855857.getClass(), "parent", null);
        setField(term855847, term855847.getClass(), "next", term855857);
        setField(term855847, term855847.getClass(), "first", null);
        setField(term855847, term855847.getClass(), "last", null);
        setField(term855847, term855847.getClass(), "propListHead", null);
        setIntField(term855847, term855847.getClass(), "sourcePosition", 0);
        setField(term855847, term855847.getClass(), "jsType", null);
        setField(term855847, term855847.getClass(), "parent", null);
        setField(term855840, term855840.getClass(), "first", term855847);
        setField(term855840, term855840.getClass(), "last", null);
        setField(term855840, term855840.getClass(), "propListHead", null);
        setIntField(term855840, term855840.getClass(), "sourcePosition", 0);
        setField(term855840, term855840.getClass(), "jsType", null);
        setField(term855840, term855840.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term855112;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term855022, args);
        assertTrue(recursiveEquals(term855022, term855898));
        assertTrue(recursiveEquals(term855112, term855899));
        assertTrue(recursiveEquals(retValue, term855840));
    }

};


