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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term528474;
     Object term528566;
     Object term528750;
     Object term528836;
     Object term529341;
     Object term529342;
     Object term529344;
     Object term529345;
     Object term529285;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term528474 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term528566 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term528658 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term528566, term528566.getClass(), "parent", term528658);
        setIntField(term528566, term528566.getClass(), "type", 0);
        term528750 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term528750, term528750.getClass(), "type", 0);
        term528836 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term528836, term528836.getClass(), "type", 44);
        term529341 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term529341, term529341.getClass(), "currentTraversal", null);
        term529342 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term529343 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term529342, term529342.getClass(), "number", 0.0);
        setIntField(term529342, term529342.getClass(), "type", 0);
        setField(term529342, term529342.getClass(), "next", null);
        setField(term529342, term529342.getClass(), "first", null);
        setField(term529342, term529342.getClass(), "last", null);
        setField(term529342, term529342.getClass(), "propListHead", null);
        setIntField(term529342, term529342.getClass(), "sourcePosition", 0);
        setField(term529342, term529342.getClass(), "jsType", null);
        setField(term529343, term529343.getClass(), "str", null);
        setIntField(term529343, term529343.getClass(), "type", 0);
        setField(term529343, term529343.getClass(), "next", null);
        setField(term529343, term529343.getClass(), "first", null);
        setField(term529343, term529343.getClass(), "last", null);
        setField(term529343, term529343.getClass(), "propListHead", null);
        setIntField(term529343, term529343.getClass(), "sourcePosition", 0);
        setField(term529343, term529343.getClass(), "jsType", null);
        setField(term529343, term529343.getClass(), "parent", null);
        setField(term529342, term529342.getClass(), "parent", term529343);
        term529344 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term529344, term529344.getClass(), "str", null);
        setIntField(term529344, term529344.getClass(), "type", 0);
        setField(term529344, term529344.getClass(), "next", null);
        setField(term529344, term529344.getClass(), "first", null);
        setField(term529344, term529344.getClass(), "last", null);
        setField(term529344, term529344.getClass(), "propListHead", null);
        setIntField(term529344, term529344.getClass(), "sourcePosition", 0);
        setField(term529344, term529344.getClass(), "jsType", null);
        setField(term529344, term529344.getClass(), "parent", null);
        term529345 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term529345, term529345.getClass(), "functionName", null);
        setBooleanField(term529345, term529345.getClass(), "itsNeedsActivation", false);
        setIntField(term529345, term529345.getClass(), "itsFunctionType", 0);
        setBooleanField(term529345, term529345.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term529345, term529345.getClass(), "encodedSourceStart", 0);
        setIntField(term529345, term529345.getClass(), "encodedSourceEnd", 0);
        setField(term529345, term529345.getClass(), "sourceName", null);
        setIntField(term529345, term529345.getClass(), "baseLineno", 0);
        setIntField(term529345, term529345.getClass(), "endLineno", 0);
        setField(term529345, term529345.getClass(), "functions", null);
        setField(term529345, term529345.getClass(), "regexps", null);
        setField(term529345, term529345.getClass(), "itsVariables", null);
        setField(term529345, term529345.getClass(), "itsConst", null);
        setField(term529345, term529345.getClass(), "itsVariableNames", null);
        setIntField(term529345, term529345.getClass(), "varStart", 0);
        setField(term529345, term529345.getClass(), "compilerData", null);
        setIntField(term529345, term529345.getClass(), "type", 44);
        setField(term529345, term529345.getClass(), "next", null);
        setField(term529345, term529345.getClass(), "first", null);
        setField(term529345, term529345.getClass(), "last", null);
        setField(term529345, term529345.getClass(), "propListHead", null);
        setIntField(term529345, term529345.getClass(), "sourcePosition", 0);
        setField(term529345, term529345.getClass(), "jsType", null);
        setField(term529345, term529345.getClass(), "parent", null);
        term529285 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term529289 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term529285, term529285.getClass(), "number", 0.0);
        setIntField(term529285, term529285.getClass(), "type", 0);
        setField(term529285, term529285.getClass(), "next", null);
        setField(term529285, term529285.getClass(), "first", null);
        setField(term529285, term529285.getClass(), "last", null);
        setField(term529285, term529285.getClass(), "propListHead", null);
        setIntField(term529285, term529285.getClass(), "sourcePosition", 0);
        setField(term529285, term529285.getClass(), "jsType", null);
        setField(term529289, term529289.getClass(), "str", null);
        setIntField(term529289, term529289.getClass(), "type", 0);
        setField(term529289, term529289.getClass(), "next", null);
        setField(term529289, term529289.getClass(), "first", null);
        setField(term529289, term529289.getClass(), "last", null);
        setField(term529289, term529289.getClass(), "propListHead", null);
        setIntField(term529289, term529289.getClass(), "sourcePosition", 0);
        setField(term529289, term529289.getClass(), "jsType", null);
        setField(term529289, term529289.getClass(), "parent", null);
        setField(term529285, term529285.getClass(), "parent", term529289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term528566;
        args[1] = term528750;
        args[2] = term528836;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term528474, args);
        assertTrue(recursiveEquals(term528474, term529341));
        assertTrue(recursiveEquals(term528566, term529342));
        assertTrue(recursiveEquals(term528750, term529344));
        assertTrue(recursiveEquals(term528836, term529345));
        assertTrue(recursiveEquals(retValue, term529285));
    }

};


