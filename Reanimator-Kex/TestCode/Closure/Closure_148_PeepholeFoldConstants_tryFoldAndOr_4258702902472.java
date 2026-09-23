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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693084;
     Object term693170;
     Object term693354;
     Object term693446;
     Object term693526;
     Object term693527;
     Object term693529;
     Object term693530;
     Object term693450;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term693084 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term693170 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term693262 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term693262, term693262.getClass(), "type", 108);
        setField(term693170, term693170.getClass(), "parent", term693262);
        setIntField(term693170, term693170.getClass(), "type", 0);
        term693354 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term693354, term693354.getClass(), "type", 75);
        term693446 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term693446, term693446.getClass(), "type", 63);
        term693526 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term693526, term693526.getClass(), "currentTraversal", null);
        term693527 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term693528 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term693527, term693527.getClass(), "functionName", null);
        setBooleanField(term693527, term693527.getClass(), "itsNeedsActivation", false);
        setIntField(term693527, term693527.getClass(), "itsFunctionType", 0);
        setBooleanField(term693527, term693527.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term693527, term693527.getClass(), "encodedSourceStart", 0);
        setIntField(term693527, term693527.getClass(), "encodedSourceEnd", 0);
        setField(term693527, term693527.getClass(), "sourceName", null);
        setIntField(term693527, term693527.getClass(), "baseLineno", 0);
        setIntField(term693527, term693527.getClass(), "endLineno", 0);
        setField(term693527, term693527.getClass(), "functions", null);
        setField(term693527, term693527.getClass(), "regexps", null);
        setField(term693527, term693527.getClass(), "itsVariables", null);
        setField(term693527, term693527.getClass(), "itsConst", null);
        setField(term693527, term693527.getClass(), "itsVariableNames", null);
        setIntField(term693527, term693527.getClass(), "varStart", 0);
        setField(term693527, term693527.getClass(), "compilerData", null);
        setIntField(term693527, term693527.getClass(), "type", 0);
        setField(term693527, term693527.getClass(), "next", null);
        setField(term693527, term693527.getClass(), "first", null);
        setField(term693527, term693527.getClass(), "last", null);
        setField(term693527, term693527.getClass(), "propListHead", null);
        setIntField(term693527, term693527.getClass(), "sourcePosition", 0);
        setField(term693527, term693527.getClass(), "jsType", null);
        setField(term693528, term693528.getClass(), "str", null);
        setIntField(term693528, term693528.getClass(), "type", 108);
        setField(term693528, term693528.getClass(), "next", null);
        setField(term693528, term693528.getClass(), "first", null);
        setField(term693528, term693528.getClass(), "last", null);
        setField(term693528, term693528.getClass(), "propListHead", null);
        setIntField(term693528, term693528.getClass(), "sourcePosition", 0);
        setField(term693528, term693528.getClass(), "jsType", null);
        setField(term693528, term693528.getClass(), "parent", null);
        setField(term693527, term693527.getClass(), "parent", term693528);
        term693529 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term693529, term693529.getClass(), "str", null);
        setIntField(term693529, term693529.getClass(), "type", 75);
        setField(term693529, term693529.getClass(), "next", null);
        setField(term693529, term693529.getClass(), "first", null);
        setField(term693529, term693529.getClass(), "last", null);
        setField(term693529, term693529.getClass(), "propListHead", null);
        setIntField(term693529, term693529.getClass(), "sourcePosition", 0);
        setField(term693529, term693529.getClass(), "jsType", null);
        setField(term693529, term693529.getClass(), "parent", null);
        term693530 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term693530, term693530.getClass(), "number", 0.0);
        setIntField(term693530, term693530.getClass(), "type", 63);
        setField(term693530, term693530.getClass(), "next", null);
        setField(term693530, term693530.getClass(), "first", null);
        setField(term693530, term693530.getClass(), "last", null);
        setField(term693530, term693530.getClass(), "propListHead", null);
        setIntField(term693530, term693530.getClass(), "sourcePosition", 0);
        setField(term693530, term693530.getClass(), "jsType", null);
        setField(term693530, term693530.getClass(), "parent", null);
        term693450 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term693461 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term693450, term693450.getClass(), "functionName", null);
        setBooleanField(term693450, term693450.getClass(), "itsNeedsActivation", false);
        setIntField(term693450, term693450.getClass(), "itsFunctionType", 0);
        setBooleanField(term693450, term693450.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term693450, term693450.getClass(), "encodedSourceStart", 0);
        setIntField(term693450, term693450.getClass(), "encodedSourceEnd", 0);
        setField(term693450, term693450.getClass(), "sourceName", null);
        setIntField(term693450, term693450.getClass(), "baseLineno", 0);
        setIntField(term693450, term693450.getClass(), "endLineno", 0);
        setField(term693450, term693450.getClass(), "functions", null);
        setField(term693450, term693450.getClass(), "regexps", null);
        setField(term693450, term693450.getClass(), "itsVariables", null);
        setField(term693450, term693450.getClass(), "itsConst", null);
        setField(term693450, term693450.getClass(), "itsVariableNames", null);
        setIntField(term693450, term693450.getClass(), "varStart", 0);
        setField(term693450, term693450.getClass(), "compilerData", null);
        setIntField(term693450, term693450.getClass(), "type", 0);
        setField(term693450, term693450.getClass(), "next", null);
        setField(term693450, term693450.getClass(), "first", null);
        setField(term693450, term693450.getClass(), "last", null);
        setField(term693450, term693450.getClass(), "propListHead", null);
        setIntField(term693450, term693450.getClass(), "sourcePosition", 0);
        setField(term693450, term693450.getClass(), "jsType", null);
        setField(term693461, term693461.getClass(), "str", null);
        setIntField(term693461, term693461.getClass(), "type", 108);
        setField(term693461, term693461.getClass(), "next", null);
        setField(term693461, term693461.getClass(), "first", null);
        setField(term693461, term693461.getClass(), "last", null);
        setField(term693461, term693461.getClass(), "propListHead", null);
        setIntField(term693461, term693461.getClass(), "sourcePosition", 0);
        setField(term693461, term693461.getClass(), "jsType", null);
        setField(term693461, term693461.getClass(), "parent", null);
        setField(term693450, term693450.getClass(), "parent", term693461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term693170;
        args[1] = term693354;
        args[2] = term693446;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term693084, args);
        assertTrue(recursiveEquals(term693084, term693526));
        assertTrue(recursiveEquals(term693170, term693527));
        assertTrue(recursiveEquals(term693354, term693529));
        assertTrue(recursiveEquals(term693446, term693530));
        assertTrue(recursiveEquals(retValue, term693450));
    }

};


