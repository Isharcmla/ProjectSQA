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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653218;
     Object term653304;
     Object term653482;
     Object term653574;
     Object term654124;
     Object term654125;
     Object term654127;
     Object term654128;
     Object term654029;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653218 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term653304 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term653390 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term653390, term653390.getClass(), "type", 114);
        setField(term653304, term653304.getClass(), "parent", term653390);
        setIntField(term653304, term653304.getClass(), "type", 0);
        term653482 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term653482, term653482.getClass(), "type", 112);
        term653574 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term653574, term653574.getClass(), "type", 63);
        term654124 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term654124, term654124.getClass(), "currentTraversal", null);
        term654125 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term654126 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term654125, term654125.getClass(), "functionName", null);
        setBooleanField(term654125, term654125.getClass(), "itsNeedsActivation", false);
        setIntField(term654125, term654125.getClass(), "itsFunctionType", 0);
        setBooleanField(term654125, term654125.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term654125, term654125.getClass(), "encodedSourceStart", 0);
        setIntField(term654125, term654125.getClass(), "encodedSourceEnd", 0);
        setField(term654125, term654125.getClass(), "sourceName", null);
        setIntField(term654125, term654125.getClass(), "baseLineno", 0);
        setIntField(term654125, term654125.getClass(), "endLineno", 0);
        setField(term654125, term654125.getClass(), "functions", null);
        setField(term654125, term654125.getClass(), "regexps", null);
        setField(term654125, term654125.getClass(), "itsVariables", null);
        setField(term654125, term654125.getClass(), "itsConst", null);
        setField(term654125, term654125.getClass(), "itsVariableNames", null);
        setIntField(term654125, term654125.getClass(), "varStart", 0);
        setField(term654125, term654125.getClass(), "compilerData", null);
        setIntField(term654125, term654125.getClass(), "type", 0);
        setField(term654125, term654125.getClass(), "next", null);
        setField(term654125, term654125.getClass(), "first", null);
        setField(term654125, term654125.getClass(), "last", null);
        setField(term654125, term654125.getClass(), "propListHead", null);
        setIntField(term654125, term654125.getClass(), "sourcePosition", 0);
        setField(term654125, term654125.getClass(), "jsType", null);
        setField(term654126, term654126.getClass(), "functionName", null);
        setBooleanField(term654126, term654126.getClass(), "itsNeedsActivation", false);
        setIntField(term654126, term654126.getClass(), "itsFunctionType", 0);
        setBooleanField(term654126, term654126.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term654126, term654126.getClass(), "encodedSourceStart", 0);
        setIntField(term654126, term654126.getClass(), "encodedSourceEnd", 0);
        setField(term654126, term654126.getClass(), "sourceName", null);
        setIntField(term654126, term654126.getClass(), "baseLineno", 0);
        setIntField(term654126, term654126.getClass(), "endLineno", 0);
        setField(term654126, term654126.getClass(), "functions", null);
        setField(term654126, term654126.getClass(), "regexps", null);
        setField(term654126, term654126.getClass(), "itsVariables", null);
        setField(term654126, term654126.getClass(), "itsConst", null);
        setField(term654126, term654126.getClass(), "itsVariableNames", null);
        setIntField(term654126, term654126.getClass(), "varStart", 0);
        setField(term654126, term654126.getClass(), "compilerData", null);
        setIntField(term654126, term654126.getClass(), "type", 114);
        setField(term654126, term654126.getClass(), "next", null);
        setField(term654126, term654126.getClass(), "first", null);
        setField(term654126, term654126.getClass(), "last", null);
        setField(term654126, term654126.getClass(), "propListHead", null);
        setIntField(term654126, term654126.getClass(), "sourcePosition", 0);
        setField(term654126, term654126.getClass(), "jsType", null);
        setField(term654126, term654126.getClass(), "parent", null);
        setField(term654125, term654125.getClass(), "parent", term654126);
        term654127 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term654127, term654127.getClass(), "number", 0.0);
        setIntField(term654127, term654127.getClass(), "type", 112);
        setField(term654127, term654127.getClass(), "next", null);
        setField(term654127, term654127.getClass(), "first", null);
        setField(term654127, term654127.getClass(), "last", null);
        setField(term654127, term654127.getClass(), "propListHead", null);
        setIntField(term654127, term654127.getClass(), "sourcePosition", 0);
        setField(term654127, term654127.getClass(), "jsType", null);
        setField(term654127, term654127.getClass(), "parent", null);
        term654128 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term654128, term654128.getClass(), "number", 0.0);
        setIntField(term654128, term654128.getClass(), "type", 63);
        setField(term654128, term654128.getClass(), "next", null);
        setField(term654128, term654128.getClass(), "first", null);
        setField(term654128, term654128.getClass(), "last", null);
        setField(term654128, term654128.getClass(), "propListHead", null);
        setIntField(term654128, term654128.getClass(), "sourcePosition", 0);
        setField(term654128, term654128.getClass(), "jsType", null);
        setField(term654128, term654128.getClass(), "parent", null);
        term654029 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term654040 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term654029, term654029.getClass(), "functionName", null);
        setBooleanField(term654029, term654029.getClass(), "itsNeedsActivation", false);
        setIntField(term654029, term654029.getClass(), "itsFunctionType", 0);
        setBooleanField(term654029, term654029.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term654029, term654029.getClass(), "encodedSourceStart", 0);
        setIntField(term654029, term654029.getClass(), "encodedSourceEnd", 0);
        setField(term654029, term654029.getClass(), "sourceName", null);
        setIntField(term654029, term654029.getClass(), "baseLineno", 0);
        setIntField(term654029, term654029.getClass(), "endLineno", 0);
        setField(term654029, term654029.getClass(), "functions", null);
        setField(term654029, term654029.getClass(), "regexps", null);
        setField(term654029, term654029.getClass(), "itsVariables", null);
        setField(term654029, term654029.getClass(), "itsConst", null);
        setField(term654029, term654029.getClass(), "itsVariableNames", null);
        setIntField(term654029, term654029.getClass(), "varStart", 0);
        setField(term654029, term654029.getClass(), "compilerData", null);
        setIntField(term654029, term654029.getClass(), "type", 0);
        setField(term654029, term654029.getClass(), "next", null);
        setField(term654029, term654029.getClass(), "first", null);
        setField(term654029, term654029.getClass(), "last", null);
        setField(term654029, term654029.getClass(), "propListHead", null);
        setIntField(term654029, term654029.getClass(), "sourcePosition", 0);
        setField(term654029, term654029.getClass(), "jsType", null);
        setField(term654040, term654040.getClass(), "functionName", null);
        setBooleanField(term654040, term654040.getClass(), "itsNeedsActivation", false);
        setIntField(term654040, term654040.getClass(), "itsFunctionType", 0);
        setBooleanField(term654040, term654040.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term654040, term654040.getClass(), "encodedSourceStart", 0);
        setIntField(term654040, term654040.getClass(), "encodedSourceEnd", 0);
        setField(term654040, term654040.getClass(), "sourceName", null);
        setIntField(term654040, term654040.getClass(), "baseLineno", 0);
        setIntField(term654040, term654040.getClass(), "endLineno", 0);
        setField(term654040, term654040.getClass(), "functions", null);
        setField(term654040, term654040.getClass(), "regexps", null);
        setField(term654040, term654040.getClass(), "itsVariables", null);
        setField(term654040, term654040.getClass(), "itsConst", null);
        setField(term654040, term654040.getClass(), "itsVariableNames", null);
        setIntField(term654040, term654040.getClass(), "varStart", 0);
        setField(term654040, term654040.getClass(), "compilerData", null);
        setIntField(term654040, term654040.getClass(), "type", 114);
        setField(term654040, term654040.getClass(), "next", null);
        setField(term654040, term654040.getClass(), "first", null);
        setField(term654040, term654040.getClass(), "last", null);
        setField(term654040, term654040.getClass(), "propListHead", null);
        setIntField(term654040, term654040.getClass(), "sourcePosition", 0);
        setField(term654040, term654040.getClass(), "jsType", null);
        setField(term654040, term654040.getClass(), "parent", null);
        setField(term654029, term654029.getClass(), "parent", term654040);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term653304;
        args[1] = term653482;
        args[2] = term653574;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term653218, args);
        assertTrue(recursiveEquals(term653218, term654124));
        assertTrue(recursiveEquals(term653304, term654125));
        assertTrue(recursiveEquals(term653482, term654127));
        assertTrue(recursiveEquals(term653574, term654128));
        assertTrue(recursiveEquals(retValue, term654029));
    }

};


