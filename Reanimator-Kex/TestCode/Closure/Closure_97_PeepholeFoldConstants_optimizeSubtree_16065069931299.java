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

public class PeepholeFoldConstants_optimizeSubtree_16065069931299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432290;
     Object term432376;
     Object term433054;
     Object term433055;
     Object term432950;

    public PeepholeFoldConstants_optimizeSubtree_16065069931299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term432290 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term432376 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term432462 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term432554 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term432376, term432376.getClass(), "type", 35);
        setField(term432462, term432462.getClass(), "next", term432554);
        setIntField(term432462, term432462.getClass(), "type", 63);
        setField(term432376, term432376.getClass(), "first", term432462);
        term433054 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term433054, term433054.getClass(), "currentTraversal", null);
        term433055 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term433056 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term433057 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term433055, term433055.getClass(), "functionName", null);
        setBooleanField(term433055, term433055.getClass(), "itsNeedsActivation", false);
        setIntField(term433055, term433055.getClass(), "itsFunctionType", 0);
        setBooleanField(term433055, term433055.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term433055, term433055.getClass(), "encodedSourceStart", 0);
        setIntField(term433055, term433055.getClass(), "encodedSourceEnd", 0);
        setField(term433055, term433055.getClass(), "sourceName", null);
        setIntField(term433055, term433055.getClass(), "baseLineno", 0);
        setIntField(term433055, term433055.getClass(), "endLineno", 0);
        setField(term433055, term433055.getClass(), "functions", null);
        setField(term433055, term433055.getClass(), "regexps", null);
        setField(term433055, term433055.getClass(), "itsVariables", null);
        setField(term433055, term433055.getClass(), "itsConst", null);
        setField(term433055, term433055.getClass(), "itsVariableNames", null);
        setIntField(term433055, term433055.getClass(), "varStart", 0);
        setField(term433055, term433055.getClass(), "compilerData", null);
        setIntField(term433055, term433055.getClass(), "type", 35);
        setField(term433055, term433055.getClass(), "next", null);
        setField(term433056, term433056.getClass(), "functionName", null);
        setBooleanField(term433056, term433056.getClass(), "itsNeedsActivation", false);
        setIntField(term433056, term433056.getClass(), "itsFunctionType", 0);
        setBooleanField(term433056, term433056.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term433056, term433056.getClass(), "encodedSourceStart", 0);
        setIntField(term433056, term433056.getClass(), "encodedSourceEnd", 0);
        setField(term433056, term433056.getClass(), "sourceName", null);
        setIntField(term433056, term433056.getClass(), "baseLineno", 0);
        setIntField(term433056, term433056.getClass(), "endLineno", 0);
        setField(term433056, term433056.getClass(), "functions", null);
        setField(term433056, term433056.getClass(), "regexps", null);
        setField(term433056, term433056.getClass(), "itsVariables", null);
        setField(term433056, term433056.getClass(), "itsConst", null);
        setField(term433056, term433056.getClass(), "itsVariableNames", null);
        setIntField(term433056, term433056.getClass(), "varStart", 0);
        setField(term433056, term433056.getClass(), "compilerData", null);
        setIntField(term433056, term433056.getClass(), "type", 63);
        setField(term433057, term433057.getClass(), "str", null);
        setIntField(term433057, term433057.getClass(), "type", 0);
        setField(term433057, term433057.getClass(), "next", null);
        setField(term433057, term433057.getClass(), "first", null);
        setField(term433057, term433057.getClass(), "last", null);
        setField(term433057, term433057.getClass(), "propListHead", null);
        setIntField(term433057, term433057.getClass(), "sourcePosition", 0);
        setField(term433057, term433057.getClass(), "jsType", null);
        setField(term433057, term433057.getClass(), "parent", null);
        setField(term433056, term433056.getClass(), "next", term433057);
        setField(term433056, term433056.getClass(), "first", null);
        setField(term433056, term433056.getClass(), "last", null);
        setField(term433056, term433056.getClass(), "propListHead", null);
        setIntField(term433056, term433056.getClass(), "sourcePosition", 0);
        setField(term433056, term433056.getClass(), "jsType", null);
        setField(term433056, term433056.getClass(), "parent", null);
        setField(term433055, term433055.getClass(), "first", term433056);
        setField(term433055, term433055.getClass(), "last", null);
        setField(term433055, term433055.getClass(), "propListHead", null);
        setIntField(term433055, term433055.getClass(), "sourcePosition", 0);
        setField(term433055, term433055.getClass(), "jsType", null);
        setField(term433055, term433055.getClass(), "parent", null);
        term432950 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term432960 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term432970 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term432950, term432950.getClass(), "functionName", null);
        setBooleanField(term432950, term432950.getClass(), "itsNeedsActivation", false);
        setIntField(term432950, term432950.getClass(), "itsFunctionType", 0);
        setBooleanField(term432950, term432950.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term432950, term432950.getClass(), "encodedSourceStart", 0);
        setIntField(term432950, term432950.getClass(), "encodedSourceEnd", 0);
        setField(term432950, term432950.getClass(), "sourceName", null);
        setIntField(term432950, term432950.getClass(), "baseLineno", 0);
        setIntField(term432950, term432950.getClass(), "endLineno", 0);
        setField(term432950, term432950.getClass(), "functions", null);
        setField(term432950, term432950.getClass(), "regexps", null);
        setField(term432950, term432950.getClass(), "itsVariables", null);
        setField(term432950, term432950.getClass(), "itsConst", null);
        setField(term432950, term432950.getClass(), "itsVariableNames", null);
        setIntField(term432950, term432950.getClass(), "varStart", 0);
        setField(term432950, term432950.getClass(), "compilerData", null);
        setIntField(term432950, term432950.getClass(), "type", 35);
        setField(term432950, term432950.getClass(), "next", null);
        setField(term432960, term432960.getClass(), "functionName", null);
        setBooleanField(term432960, term432960.getClass(), "itsNeedsActivation", false);
        setIntField(term432960, term432960.getClass(), "itsFunctionType", 0);
        setBooleanField(term432960, term432960.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term432960, term432960.getClass(), "encodedSourceStart", 0);
        setIntField(term432960, term432960.getClass(), "encodedSourceEnd", 0);
        setField(term432960, term432960.getClass(), "sourceName", null);
        setIntField(term432960, term432960.getClass(), "baseLineno", 0);
        setIntField(term432960, term432960.getClass(), "endLineno", 0);
        setField(term432960, term432960.getClass(), "functions", null);
        setField(term432960, term432960.getClass(), "regexps", null);
        setField(term432960, term432960.getClass(), "itsVariables", null);
        setField(term432960, term432960.getClass(), "itsConst", null);
        setField(term432960, term432960.getClass(), "itsVariableNames", null);
        setIntField(term432960, term432960.getClass(), "varStart", 0);
        setField(term432960, term432960.getClass(), "compilerData", null);
        setIntField(term432960, term432960.getClass(), "type", 63);
        setField(term432970, term432970.getClass(), "str", null);
        setIntField(term432970, term432970.getClass(), "type", 0);
        setField(term432970, term432970.getClass(), "next", null);
        setField(term432970, term432970.getClass(), "first", null);
        setField(term432970, term432970.getClass(), "last", null);
        setField(term432970, term432970.getClass(), "propListHead", null);
        setIntField(term432970, term432970.getClass(), "sourcePosition", 0);
        setField(term432970, term432970.getClass(), "jsType", null);
        setField(term432970, term432970.getClass(), "parent", null);
        setField(term432960, term432960.getClass(), "next", term432970);
        setField(term432960, term432960.getClass(), "first", null);
        setField(term432960, term432960.getClass(), "last", null);
        setField(term432960, term432960.getClass(), "propListHead", null);
        setIntField(term432960, term432960.getClass(), "sourcePosition", 0);
        setField(term432960, term432960.getClass(), "jsType", null);
        setField(term432960, term432960.getClass(), "parent", null);
        setField(term432950, term432950.getClass(), "first", term432960);
        setField(term432950, term432950.getClass(), "last", null);
        setField(term432950, term432950.getClass(), "propListHead", null);
        setIntField(term432950, term432950.getClass(), "sourcePosition", 0);
        setField(term432950, term432950.getClass(), "jsType", null);
        setField(term432950, term432950.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term432376;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term432290, args);
        assertTrue(recursiveEquals(term432290, term433054));
        assertTrue(recursiveEquals(term432376, term433055));
        assertTrue(recursiveEquals(retValue, term432950));
    }

};


