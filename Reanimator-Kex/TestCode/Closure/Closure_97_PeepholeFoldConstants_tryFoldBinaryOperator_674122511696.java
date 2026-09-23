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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179078;
     Object term179164;
     Object term179431;
     Object term179432;
     Object term179357;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179078 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term179164 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term179250 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term179342 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term179250, term179250.getClass(), "next", term179342);
        setIntField(term179250, term179250.getClass(), "type", 16);
        setField(term179164, term179164.getClass(), "first", term179250);
        setIntField(term179164, term179164.getClass(), "type", 16);
        term179431 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term179431, term179431.getClass(), "currentTraversal", null);
        term179432 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term179433 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term179434 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term179432, term179432.getClass(), "functionName", null);
        setBooleanField(term179432, term179432.getClass(), "itsNeedsActivation", false);
        setIntField(term179432, term179432.getClass(), "itsFunctionType", 0);
        setBooleanField(term179432, term179432.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term179432, term179432.getClass(), "encodedSourceStart", 0);
        setIntField(term179432, term179432.getClass(), "encodedSourceEnd", 0);
        setField(term179432, term179432.getClass(), "sourceName", null);
        setIntField(term179432, term179432.getClass(), "baseLineno", 0);
        setIntField(term179432, term179432.getClass(), "endLineno", 0);
        setField(term179432, term179432.getClass(), "functions", null);
        setField(term179432, term179432.getClass(), "regexps", null);
        setField(term179432, term179432.getClass(), "itsVariables", null);
        setField(term179432, term179432.getClass(), "itsConst", null);
        setField(term179432, term179432.getClass(), "itsVariableNames", null);
        setIntField(term179432, term179432.getClass(), "varStart", 0);
        setField(term179432, term179432.getClass(), "compilerData", null);
        setIntField(term179432, term179432.getClass(), "type", 16);
        setField(term179432, term179432.getClass(), "next", null);
        setField(term179433, term179433.getClass(), "functionName", null);
        setBooleanField(term179433, term179433.getClass(), "itsNeedsActivation", false);
        setIntField(term179433, term179433.getClass(), "itsFunctionType", 0);
        setBooleanField(term179433, term179433.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term179433, term179433.getClass(), "encodedSourceStart", 0);
        setIntField(term179433, term179433.getClass(), "encodedSourceEnd", 0);
        setField(term179433, term179433.getClass(), "sourceName", null);
        setIntField(term179433, term179433.getClass(), "baseLineno", 0);
        setIntField(term179433, term179433.getClass(), "endLineno", 0);
        setField(term179433, term179433.getClass(), "functions", null);
        setField(term179433, term179433.getClass(), "regexps", null);
        setField(term179433, term179433.getClass(), "itsVariables", null);
        setField(term179433, term179433.getClass(), "itsConst", null);
        setField(term179433, term179433.getClass(), "itsVariableNames", null);
        setIntField(term179433, term179433.getClass(), "varStart", 0);
        setField(term179433, term179433.getClass(), "compilerData", null);
        setIntField(term179433, term179433.getClass(), "type", 16);
        setField(term179434, term179434.getClass(), "str", null);
        setIntField(term179434, term179434.getClass(), "type", 0);
        setField(term179434, term179434.getClass(), "next", null);
        setField(term179434, term179434.getClass(), "first", null);
        setField(term179434, term179434.getClass(), "last", null);
        setField(term179434, term179434.getClass(), "propListHead", null);
        setIntField(term179434, term179434.getClass(), "sourcePosition", 0);
        setField(term179434, term179434.getClass(), "jsType", null);
        setField(term179434, term179434.getClass(), "parent", null);
        setField(term179433, term179433.getClass(), "next", term179434);
        setField(term179433, term179433.getClass(), "first", null);
        setField(term179433, term179433.getClass(), "last", null);
        setField(term179433, term179433.getClass(), "propListHead", null);
        setIntField(term179433, term179433.getClass(), "sourcePosition", 0);
        setField(term179433, term179433.getClass(), "jsType", null);
        setField(term179433, term179433.getClass(), "parent", null);
        setField(term179432, term179432.getClass(), "first", term179433);
        setField(term179432, term179432.getClass(), "last", null);
        setField(term179432, term179432.getClass(), "propListHead", null);
        setIntField(term179432, term179432.getClass(), "sourcePosition", 0);
        setField(term179432, term179432.getClass(), "jsType", null);
        setField(term179432, term179432.getClass(), "parent", null);
        term179357 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term179367 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term179377 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term179357, term179357.getClass(), "functionName", null);
        setBooleanField(term179357, term179357.getClass(), "itsNeedsActivation", false);
        setIntField(term179357, term179357.getClass(), "itsFunctionType", 0);
        setBooleanField(term179357, term179357.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term179357, term179357.getClass(), "encodedSourceStart", 0);
        setIntField(term179357, term179357.getClass(), "encodedSourceEnd", 0);
        setField(term179357, term179357.getClass(), "sourceName", null);
        setIntField(term179357, term179357.getClass(), "baseLineno", 0);
        setIntField(term179357, term179357.getClass(), "endLineno", 0);
        setField(term179357, term179357.getClass(), "functions", null);
        setField(term179357, term179357.getClass(), "regexps", null);
        setField(term179357, term179357.getClass(), "itsVariables", null);
        setField(term179357, term179357.getClass(), "itsConst", null);
        setField(term179357, term179357.getClass(), "itsVariableNames", null);
        setIntField(term179357, term179357.getClass(), "varStart", 0);
        setField(term179357, term179357.getClass(), "compilerData", null);
        setIntField(term179357, term179357.getClass(), "type", 16);
        setField(term179357, term179357.getClass(), "next", null);
        setField(term179367, term179367.getClass(), "functionName", null);
        setBooleanField(term179367, term179367.getClass(), "itsNeedsActivation", false);
        setIntField(term179367, term179367.getClass(), "itsFunctionType", 0);
        setBooleanField(term179367, term179367.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term179367, term179367.getClass(), "encodedSourceStart", 0);
        setIntField(term179367, term179367.getClass(), "encodedSourceEnd", 0);
        setField(term179367, term179367.getClass(), "sourceName", null);
        setIntField(term179367, term179367.getClass(), "baseLineno", 0);
        setIntField(term179367, term179367.getClass(), "endLineno", 0);
        setField(term179367, term179367.getClass(), "functions", null);
        setField(term179367, term179367.getClass(), "regexps", null);
        setField(term179367, term179367.getClass(), "itsVariables", null);
        setField(term179367, term179367.getClass(), "itsConst", null);
        setField(term179367, term179367.getClass(), "itsVariableNames", null);
        setIntField(term179367, term179367.getClass(), "varStart", 0);
        setField(term179367, term179367.getClass(), "compilerData", null);
        setIntField(term179367, term179367.getClass(), "type", 16);
        setField(term179377, term179377.getClass(), "str", null);
        setIntField(term179377, term179377.getClass(), "type", 0);
        setField(term179377, term179377.getClass(), "next", null);
        setField(term179377, term179377.getClass(), "first", null);
        setField(term179377, term179377.getClass(), "last", null);
        setField(term179377, term179377.getClass(), "propListHead", null);
        setIntField(term179377, term179377.getClass(), "sourcePosition", 0);
        setField(term179377, term179377.getClass(), "jsType", null);
        setField(term179377, term179377.getClass(), "parent", null);
        setField(term179367, term179367.getClass(), "next", term179377);
        setField(term179367, term179367.getClass(), "first", null);
        setField(term179367, term179367.getClass(), "last", null);
        setField(term179367, term179367.getClass(), "propListHead", null);
        setIntField(term179367, term179367.getClass(), "sourcePosition", 0);
        setField(term179367, term179367.getClass(), "jsType", null);
        setField(term179367, term179367.getClass(), "parent", null);
        setField(term179357, term179357.getClass(), "first", term179367);
        setField(term179357, term179357.getClass(), "last", null);
        setField(term179357, term179357.getClass(), "propListHead", null);
        setIntField(term179357, term179357.getClass(), "sourcePosition", 0);
        setField(term179357, term179357.getClass(), "jsType", null);
        setField(term179357, term179357.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term179164;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term179078, args);
        assertTrue(recursiveEquals(term179078, term179431));
        assertTrue(recursiveEquals(term179164, term179432));
        assertTrue(recursiveEquals(retValue, term179357));
    }

};


