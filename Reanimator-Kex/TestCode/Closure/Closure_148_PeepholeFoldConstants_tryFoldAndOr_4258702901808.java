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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471274;
     Object term471360;
     Object term471544;
     Object term471636;
     Object term472091;
     Object term472092;
     Object term472094;
     Object term472095;
     Object term472013;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471274 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term471360 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term471452 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term471452, term471452.getClass(), "type", 108);
        setField(term471360, term471360.getClass(), "parent", term471452);
        setIntField(term471360, term471360.getClass(), "type", 0);
        term471544 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term471544, term471544.getClass(), "type", 120);
        term471636 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term471636, term471636.getClass(), "type", 44);
        term472091 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term472091, term472091.getClass(), "currentTraversal", null);
        term472092 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term472093 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term472092, term472092.getClass(), "functionName", null);
        setBooleanField(term472092, term472092.getClass(), "itsNeedsActivation", false);
        setIntField(term472092, term472092.getClass(), "itsFunctionType", 0);
        setBooleanField(term472092, term472092.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term472092, term472092.getClass(), "encodedSourceStart", 0);
        setIntField(term472092, term472092.getClass(), "encodedSourceEnd", 0);
        setField(term472092, term472092.getClass(), "sourceName", null);
        setIntField(term472092, term472092.getClass(), "baseLineno", 0);
        setIntField(term472092, term472092.getClass(), "endLineno", 0);
        setField(term472092, term472092.getClass(), "functions", null);
        setField(term472092, term472092.getClass(), "regexps", null);
        setField(term472092, term472092.getClass(), "itsVariables", null);
        setField(term472092, term472092.getClass(), "itsConst", null);
        setField(term472092, term472092.getClass(), "itsVariableNames", null);
        setIntField(term472092, term472092.getClass(), "varStart", 0);
        setField(term472092, term472092.getClass(), "compilerData", null);
        setIntField(term472092, term472092.getClass(), "type", 0);
        setField(term472092, term472092.getClass(), "next", null);
        setField(term472092, term472092.getClass(), "first", null);
        setField(term472092, term472092.getClass(), "last", null);
        setField(term472092, term472092.getClass(), "propListHead", null);
        setIntField(term472092, term472092.getClass(), "sourcePosition", 0);
        setField(term472092, term472092.getClass(), "jsType", null);
        setDoubleField(term472093, term472093.getClass(), "number", 0.0);
        setIntField(term472093, term472093.getClass(), "type", 108);
        setField(term472093, term472093.getClass(), "next", null);
        setField(term472093, term472093.getClass(), "first", null);
        setField(term472093, term472093.getClass(), "last", null);
        setField(term472093, term472093.getClass(), "propListHead", null);
        setIntField(term472093, term472093.getClass(), "sourcePosition", 0);
        setField(term472093, term472093.getClass(), "jsType", null);
        setField(term472093, term472093.getClass(), "parent", null);
        setField(term472092, term472092.getClass(), "parent", term472093);
        term472094 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term472094, term472094.getClass(), "number", 0.0);
        setIntField(term472094, term472094.getClass(), "type", 120);
        setField(term472094, term472094.getClass(), "next", null);
        setField(term472094, term472094.getClass(), "first", null);
        setField(term472094, term472094.getClass(), "last", null);
        setField(term472094, term472094.getClass(), "propListHead", null);
        setIntField(term472094, term472094.getClass(), "sourcePosition", 0);
        setField(term472094, term472094.getClass(), "jsType", null);
        setField(term472094, term472094.getClass(), "parent", null);
        term472095 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term472095, term472095.getClass(), "str", null);
        setIntField(term472095, term472095.getClass(), "type", 44);
        setField(term472095, term472095.getClass(), "next", null);
        setField(term472095, term472095.getClass(), "first", null);
        setField(term472095, term472095.getClass(), "last", null);
        setField(term472095, term472095.getClass(), "propListHead", null);
        setIntField(term472095, term472095.getClass(), "sourcePosition", 0);
        setField(term472095, term472095.getClass(), "jsType", null);
        setField(term472095, term472095.getClass(), "parent", null);
        term472013 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term472024 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term472013, term472013.getClass(), "functionName", null);
        setBooleanField(term472013, term472013.getClass(), "itsNeedsActivation", false);
        setIntField(term472013, term472013.getClass(), "itsFunctionType", 0);
        setBooleanField(term472013, term472013.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term472013, term472013.getClass(), "encodedSourceStart", 0);
        setIntField(term472013, term472013.getClass(), "encodedSourceEnd", 0);
        setField(term472013, term472013.getClass(), "sourceName", null);
        setIntField(term472013, term472013.getClass(), "baseLineno", 0);
        setIntField(term472013, term472013.getClass(), "endLineno", 0);
        setField(term472013, term472013.getClass(), "functions", null);
        setField(term472013, term472013.getClass(), "regexps", null);
        setField(term472013, term472013.getClass(), "itsVariables", null);
        setField(term472013, term472013.getClass(), "itsConst", null);
        setField(term472013, term472013.getClass(), "itsVariableNames", null);
        setIntField(term472013, term472013.getClass(), "varStart", 0);
        setField(term472013, term472013.getClass(), "compilerData", null);
        setIntField(term472013, term472013.getClass(), "type", 0);
        setField(term472013, term472013.getClass(), "next", null);
        setField(term472013, term472013.getClass(), "first", null);
        setField(term472013, term472013.getClass(), "last", null);
        setField(term472013, term472013.getClass(), "propListHead", null);
        setIntField(term472013, term472013.getClass(), "sourcePosition", 0);
        setField(term472013, term472013.getClass(), "jsType", null);
        setDoubleField(term472024, term472024.getClass(), "number", 0.0);
        setIntField(term472024, term472024.getClass(), "type", 108);
        setField(term472024, term472024.getClass(), "next", null);
        setField(term472024, term472024.getClass(), "first", null);
        setField(term472024, term472024.getClass(), "last", null);
        setField(term472024, term472024.getClass(), "propListHead", null);
        setIntField(term472024, term472024.getClass(), "sourcePosition", 0);
        setField(term472024, term472024.getClass(), "jsType", null);
        setField(term472024, term472024.getClass(), "parent", null);
        setField(term472013, term472013.getClass(), "parent", term472024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term471360;
        args[1] = term471544;
        args[2] = term471636;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term471274, args);
        assertTrue(recursiveEquals(term471274, term472091));
        assertTrue(recursiveEquals(term471360, term472092));
        assertTrue(recursiveEquals(term471544, term472094));
        assertTrue(recursiveEquals(term471636, term472095));
        assertTrue(recursiveEquals(retValue, term472013));
    }

};


