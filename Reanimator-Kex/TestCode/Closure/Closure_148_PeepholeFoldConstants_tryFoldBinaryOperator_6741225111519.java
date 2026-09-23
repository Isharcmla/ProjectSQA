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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379283;
     Object term379373;
     Object term380085;
     Object term380086;
     Object term380027;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379283 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term379373 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term379459 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term379551 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term379459, term379459.getClass(), "next", term379551);
        setIntField(term379459, term379459.getClass(), "type", 39);
        setField(term379373, term379373.getClass(), "first", term379459);
        setIntField(term379373, term379373.getClass(), "type", 19);
        term380085 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term380085, term380085.getClass(), "currentTraversal", null);
        term380086 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term380087 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term380088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term380086, term380086.getClass(), "encodedSourceStart", 0);
        setIntField(term380086, term380086.getClass(), "encodedSourceEnd", 0);
        setField(term380086, term380086.getClass(), "sourceName", null);
        setIntField(term380086, term380086.getClass(), "baseLineno", 0);
        setIntField(term380086, term380086.getClass(), "endLineno", 0);
        setField(term380086, term380086.getClass(), "functions", null);
        setField(term380086, term380086.getClass(), "regexps", null);
        setField(term380086, term380086.getClass(), "itsVariables", null);
        setField(term380086, term380086.getClass(), "itsConst", null);
        setField(term380086, term380086.getClass(), "itsVariableNames", null);
        setIntField(term380086, term380086.getClass(), "varStart", 0);
        setField(term380086, term380086.getClass(), "compilerData", null);
        setIntField(term380086, term380086.getClass(), "type", 19);
        setField(term380086, term380086.getClass(), "next", null);
        setField(term380087, term380087.getClass(), "functionName", null);
        setBooleanField(term380087, term380087.getClass(), "itsNeedsActivation", false);
        setIntField(term380087, term380087.getClass(), "itsFunctionType", 0);
        setBooleanField(term380087, term380087.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term380087, term380087.getClass(), "encodedSourceStart", 0);
        setIntField(term380087, term380087.getClass(), "encodedSourceEnd", 0);
        setField(term380087, term380087.getClass(), "sourceName", null);
        setIntField(term380087, term380087.getClass(), "baseLineno", 0);
        setIntField(term380087, term380087.getClass(), "endLineno", 0);
        setField(term380087, term380087.getClass(), "functions", null);
        setField(term380087, term380087.getClass(), "regexps", null);
        setField(term380087, term380087.getClass(), "itsVariables", null);
        setField(term380087, term380087.getClass(), "itsConst", null);
        setField(term380087, term380087.getClass(), "itsVariableNames", null);
        setIntField(term380087, term380087.getClass(), "varStart", 0);
        setField(term380087, term380087.getClass(), "compilerData", null);
        setIntField(term380087, term380087.getClass(), "type", 39);
        setDoubleField(term380088, term380088.getClass(), "number", 0.0);
        setIntField(term380088, term380088.getClass(), "type", 0);
        setField(term380088, term380088.getClass(), "next", null);
        setField(term380088, term380088.getClass(), "first", null);
        setField(term380088, term380088.getClass(), "last", null);
        setField(term380088, term380088.getClass(), "propListHead", null);
        setIntField(term380088, term380088.getClass(), "sourcePosition", 0);
        setField(term380088, term380088.getClass(), "jsType", null);
        setField(term380088, term380088.getClass(), "parent", null);
        setField(term380087, term380087.getClass(), "next", term380088);
        setField(term380087, term380087.getClass(), "first", null);
        setField(term380087, term380087.getClass(), "last", null);
        setField(term380087, term380087.getClass(), "propListHead", null);
        setIntField(term380087, term380087.getClass(), "sourcePosition", 0);
        setField(term380087, term380087.getClass(), "jsType", null);
        setField(term380087, term380087.getClass(), "parent", null);
        setField(term380086, term380086.getClass(), "first", term380087);
        setField(term380086, term380086.getClass(), "last", null);
        setField(term380086, term380086.getClass(), "propListHead", null);
        setIntField(term380086, term380086.getClass(), "sourcePosition", 0);
        setField(term380086, term380086.getClass(), "jsType", null);
        setField(term380086, term380086.getClass(), "parent", null);
        term380027 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term380034 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term380044 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term380027, term380027.getClass(), "encodedSourceStart", 0);
        setIntField(term380027, term380027.getClass(), "encodedSourceEnd", 0);
        setField(term380027, term380027.getClass(), "sourceName", null);
        setIntField(term380027, term380027.getClass(), "baseLineno", 0);
        setIntField(term380027, term380027.getClass(), "endLineno", 0);
        setField(term380027, term380027.getClass(), "functions", null);
        setField(term380027, term380027.getClass(), "regexps", null);
        setField(term380027, term380027.getClass(), "itsVariables", null);
        setField(term380027, term380027.getClass(), "itsConst", null);
        setField(term380027, term380027.getClass(), "itsVariableNames", null);
        setIntField(term380027, term380027.getClass(), "varStart", 0);
        setField(term380027, term380027.getClass(), "compilerData", null);
        setIntField(term380027, term380027.getClass(), "type", 19);
        setField(term380027, term380027.getClass(), "next", null);
        setField(term380034, term380034.getClass(), "functionName", null);
        setBooleanField(term380034, term380034.getClass(), "itsNeedsActivation", false);
        setIntField(term380034, term380034.getClass(), "itsFunctionType", 0);
        setBooleanField(term380034, term380034.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term380034, term380034.getClass(), "encodedSourceStart", 0);
        setIntField(term380034, term380034.getClass(), "encodedSourceEnd", 0);
        setField(term380034, term380034.getClass(), "sourceName", null);
        setIntField(term380034, term380034.getClass(), "baseLineno", 0);
        setIntField(term380034, term380034.getClass(), "endLineno", 0);
        setField(term380034, term380034.getClass(), "functions", null);
        setField(term380034, term380034.getClass(), "regexps", null);
        setField(term380034, term380034.getClass(), "itsVariables", null);
        setField(term380034, term380034.getClass(), "itsConst", null);
        setField(term380034, term380034.getClass(), "itsVariableNames", null);
        setIntField(term380034, term380034.getClass(), "varStart", 0);
        setField(term380034, term380034.getClass(), "compilerData", null);
        setIntField(term380034, term380034.getClass(), "type", 39);
        setDoubleField(term380044, term380044.getClass(), "number", 0.0);
        setIntField(term380044, term380044.getClass(), "type", 0);
        setField(term380044, term380044.getClass(), "next", null);
        setField(term380044, term380044.getClass(), "first", null);
        setField(term380044, term380044.getClass(), "last", null);
        setField(term380044, term380044.getClass(), "propListHead", null);
        setIntField(term380044, term380044.getClass(), "sourcePosition", 0);
        setField(term380044, term380044.getClass(), "jsType", null);
        setField(term380044, term380044.getClass(), "parent", null);
        setField(term380034, term380034.getClass(), "next", term380044);
        setField(term380034, term380034.getClass(), "first", null);
        setField(term380034, term380034.getClass(), "last", null);
        setField(term380034, term380034.getClass(), "propListHead", null);
        setIntField(term380034, term380034.getClass(), "sourcePosition", 0);
        setField(term380034, term380034.getClass(), "jsType", null);
        setField(term380034, term380034.getClass(), "parent", null);
        setField(term380027, term380027.getClass(), "first", term380034);
        setField(term380027, term380027.getClass(), "last", null);
        setField(term380027, term380027.getClass(), "propListHead", null);
        setIntField(term380027, term380027.getClass(), "sourcePosition", 0);
        setField(term380027, term380027.getClass(), "jsType", null);
        setField(term380027, term380027.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term379373;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term379283, args);
        assertTrue(recursiveEquals(term379283, term380085));
        assertTrue(recursiveEquals(term379373, term380086));
        assertTrue(recursiveEquals(retValue, term380027));
    }

};


