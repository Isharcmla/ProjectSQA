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

public class PeepholeFoldConstants_optimizeSubtree_16065069933121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term923435;
     Object term923521;
     Object term924137;
     Object term924138;
     Object term924060;

    public PeepholeFoldConstants_optimizeSubtree_16065069933121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term923435 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term923521 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term923607 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term923521, term923521.getClass(), "type", 32);
        setField(term923521, term923521.getClass(), "first", term923607);
        term924137 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term924137, term924137.getClass(), "currentTraversal", null);
        term924138 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term924139 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term924138, term924138.getClass(), "functionName", null);
        setBooleanField(term924138, term924138.getClass(), "itsNeedsActivation", false);
        setIntField(term924138, term924138.getClass(), "itsFunctionType", 0);
        setBooleanField(term924138, term924138.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term924138, term924138.getClass(), "encodedSourceStart", 0);
        setIntField(term924138, term924138.getClass(), "encodedSourceEnd", 0);
        setField(term924138, term924138.getClass(), "sourceName", null);
        setIntField(term924138, term924138.getClass(), "baseLineno", 0);
        setIntField(term924138, term924138.getClass(), "endLineno", 0);
        setField(term924138, term924138.getClass(), "functions", null);
        setField(term924138, term924138.getClass(), "regexps", null);
        setField(term924138, term924138.getClass(), "itsVariables", null);
        setField(term924138, term924138.getClass(), "itsConst", null);
        setField(term924138, term924138.getClass(), "itsVariableNames", null);
        setIntField(term924138, term924138.getClass(), "varStart", 0);
        setField(term924138, term924138.getClass(), "compilerData", null);
        setIntField(term924138, term924138.getClass(), "type", 32);
        setField(term924138, term924138.getClass(), "next", null);
        setField(term924139, term924139.getClass(), "functionName", null);
        setBooleanField(term924139, term924139.getClass(), "itsNeedsActivation", false);
        setIntField(term924139, term924139.getClass(), "itsFunctionType", 0);
        setBooleanField(term924139, term924139.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term924139, term924139.getClass(), "encodedSourceStart", 0);
        setIntField(term924139, term924139.getClass(), "encodedSourceEnd", 0);
        setField(term924139, term924139.getClass(), "sourceName", null);
        setIntField(term924139, term924139.getClass(), "baseLineno", 0);
        setIntField(term924139, term924139.getClass(), "endLineno", 0);
        setField(term924139, term924139.getClass(), "functions", null);
        setField(term924139, term924139.getClass(), "regexps", null);
        setField(term924139, term924139.getClass(), "itsVariables", null);
        setField(term924139, term924139.getClass(), "itsConst", null);
        setField(term924139, term924139.getClass(), "itsVariableNames", null);
        setIntField(term924139, term924139.getClass(), "varStart", 0);
        setField(term924139, term924139.getClass(), "compilerData", null);
        setIntField(term924139, term924139.getClass(), "type", 0);
        setField(term924139, term924139.getClass(), "next", null);
        setField(term924139, term924139.getClass(), "first", null);
        setField(term924139, term924139.getClass(), "last", null);
        setField(term924139, term924139.getClass(), "propListHead", null);
        setIntField(term924139, term924139.getClass(), "sourcePosition", 0);
        setField(term924139, term924139.getClass(), "jsType", null);
        setField(term924139, term924139.getClass(), "parent", null);
        setField(term924138, term924138.getClass(), "first", term924139);
        setField(term924138, term924138.getClass(), "last", null);
        setField(term924138, term924138.getClass(), "propListHead", null);
        setIntField(term924138, term924138.getClass(), "sourcePosition", 0);
        setField(term924138, term924138.getClass(), "jsType", null);
        setField(term924138, term924138.getClass(), "parent", null);
        term924060 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term924070 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term924060, term924060.getClass(), "functionName", null);
        setBooleanField(term924060, term924060.getClass(), "itsNeedsActivation", false);
        setIntField(term924060, term924060.getClass(), "itsFunctionType", 0);
        setBooleanField(term924060, term924060.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term924060, term924060.getClass(), "encodedSourceStart", 0);
        setIntField(term924060, term924060.getClass(), "encodedSourceEnd", 0);
        setField(term924060, term924060.getClass(), "sourceName", null);
        setIntField(term924060, term924060.getClass(), "baseLineno", 0);
        setIntField(term924060, term924060.getClass(), "endLineno", 0);
        setField(term924060, term924060.getClass(), "functions", null);
        setField(term924060, term924060.getClass(), "regexps", null);
        setField(term924060, term924060.getClass(), "itsVariables", null);
        setField(term924060, term924060.getClass(), "itsConst", null);
        setField(term924060, term924060.getClass(), "itsVariableNames", null);
        setIntField(term924060, term924060.getClass(), "varStart", 0);
        setField(term924060, term924060.getClass(), "compilerData", null);
        setIntField(term924060, term924060.getClass(), "type", 32);
        setField(term924060, term924060.getClass(), "next", null);
        setField(term924070, term924070.getClass(), "functionName", null);
        setBooleanField(term924070, term924070.getClass(), "itsNeedsActivation", false);
        setIntField(term924070, term924070.getClass(), "itsFunctionType", 0);
        setBooleanField(term924070, term924070.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term924070, term924070.getClass(), "encodedSourceStart", 0);
        setIntField(term924070, term924070.getClass(), "encodedSourceEnd", 0);
        setField(term924070, term924070.getClass(), "sourceName", null);
        setIntField(term924070, term924070.getClass(), "baseLineno", 0);
        setIntField(term924070, term924070.getClass(), "endLineno", 0);
        setField(term924070, term924070.getClass(), "functions", null);
        setField(term924070, term924070.getClass(), "regexps", null);
        setField(term924070, term924070.getClass(), "itsVariables", null);
        setField(term924070, term924070.getClass(), "itsConst", null);
        setField(term924070, term924070.getClass(), "itsVariableNames", null);
        setIntField(term924070, term924070.getClass(), "varStart", 0);
        setField(term924070, term924070.getClass(), "compilerData", null);
        setIntField(term924070, term924070.getClass(), "type", 0);
        setField(term924070, term924070.getClass(), "next", null);
        setField(term924070, term924070.getClass(), "first", null);
        setField(term924070, term924070.getClass(), "last", null);
        setField(term924070, term924070.getClass(), "propListHead", null);
        setIntField(term924070, term924070.getClass(), "sourcePosition", 0);
        setField(term924070, term924070.getClass(), "jsType", null);
        setField(term924070, term924070.getClass(), "parent", null);
        setField(term924060, term924060.getClass(), "first", term924070);
        setField(term924060, term924060.getClass(), "last", null);
        setField(term924060, term924060.getClass(), "propListHead", null);
        setIntField(term924060, term924060.getClass(), "sourcePosition", 0);
        setField(term924060, term924060.getClass(), "jsType", null);
        setField(term924060, term924060.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term923521;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term923435, args);
        assertTrue(recursiveEquals(term923435, term924137));
        assertTrue(recursiveEquals(term923521, term924138));
        assertTrue(recursiveEquals(retValue, term924060));
    }

};


