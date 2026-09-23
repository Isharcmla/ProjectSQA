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

public class PeepholeFoldConstants_optimizeSubtree_16065069931965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term744228;
     Object term744318;
     Object term745025;
     Object term745026;
     Object term744925;

    public PeepholeFoldConstants_optimizeSubtree_16065069931965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term744228 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term744318 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term744404 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term744496 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term744318, term744318.getClass(), "type", 35);
        setField(term744404, term744404.getClass(), "next", term744496);
        setIntField(term744404, term744404.getClass(), "type", 63);
        setField(term744318, term744318.getClass(), "first", term744404);
        term745025 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term745025, term745025.getClass(), "currentTraversal", null);
        term745026 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term745027 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term745028 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term745026, term745026.getClass(), "encodedSourceStart", 0);
        setIntField(term745026, term745026.getClass(), "encodedSourceEnd", 0);
        setField(term745026, term745026.getClass(), "sourceName", null);
        setIntField(term745026, term745026.getClass(), "baseLineno", 0);
        setIntField(term745026, term745026.getClass(), "endLineno", 0);
        setField(term745026, term745026.getClass(), "functions", null);
        setField(term745026, term745026.getClass(), "regexps", null);
        setField(term745026, term745026.getClass(), "itsVariables", null);
        setField(term745026, term745026.getClass(), "itsConst", null);
        setField(term745026, term745026.getClass(), "itsVariableNames", null);
        setIntField(term745026, term745026.getClass(), "varStart", 0);
        setField(term745026, term745026.getClass(), "compilerData", null);
        setIntField(term745026, term745026.getClass(), "type", 35);
        setField(term745026, term745026.getClass(), "next", null);
        setField(term745027, term745027.getClass(), "functionName", null);
        setBooleanField(term745027, term745027.getClass(), "itsNeedsActivation", false);
        setIntField(term745027, term745027.getClass(), "itsFunctionType", 0);
        setBooleanField(term745027, term745027.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term745027, term745027.getClass(), "encodedSourceStart", 0);
        setIntField(term745027, term745027.getClass(), "encodedSourceEnd", 0);
        setField(term745027, term745027.getClass(), "sourceName", null);
        setIntField(term745027, term745027.getClass(), "baseLineno", 0);
        setIntField(term745027, term745027.getClass(), "endLineno", 0);
        setField(term745027, term745027.getClass(), "functions", null);
        setField(term745027, term745027.getClass(), "regexps", null);
        setField(term745027, term745027.getClass(), "itsVariables", null);
        setField(term745027, term745027.getClass(), "itsConst", null);
        setField(term745027, term745027.getClass(), "itsVariableNames", null);
        setIntField(term745027, term745027.getClass(), "varStart", 0);
        setField(term745027, term745027.getClass(), "compilerData", null);
        setIntField(term745027, term745027.getClass(), "type", 63);
        setDoubleField(term745028, term745028.getClass(), "number", 0.0);
        setIntField(term745028, term745028.getClass(), "type", 0);
        setField(term745028, term745028.getClass(), "next", null);
        setField(term745028, term745028.getClass(), "first", null);
        setField(term745028, term745028.getClass(), "last", null);
        setField(term745028, term745028.getClass(), "propListHead", null);
        setIntField(term745028, term745028.getClass(), "sourcePosition", 0);
        setField(term745028, term745028.getClass(), "jsType", null);
        setField(term745028, term745028.getClass(), "parent", null);
        setField(term745027, term745027.getClass(), "next", term745028);
        setField(term745027, term745027.getClass(), "first", null);
        setField(term745027, term745027.getClass(), "last", null);
        setField(term745027, term745027.getClass(), "propListHead", null);
        setIntField(term745027, term745027.getClass(), "sourcePosition", 0);
        setField(term745027, term745027.getClass(), "jsType", null);
        setField(term745027, term745027.getClass(), "parent", null);
        setField(term745026, term745026.getClass(), "first", term745027);
        setField(term745026, term745026.getClass(), "last", null);
        setField(term745026, term745026.getClass(), "propListHead", null);
        setIntField(term745026, term745026.getClass(), "sourcePosition", 0);
        setField(term745026, term745026.getClass(), "jsType", null);
        setField(term745026, term745026.getClass(), "parent", null);
        term744925 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term744932 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term744942 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term744925, term744925.getClass(), "encodedSourceStart", 0);
        setIntField(term744925, term744925.getClass(), "encodedSourceEnd", 0);
        setField(term744925, term744925.getClass(), "sourceName", null);
        setIntField(term744925, term744925.getClass(), "baseLineno", 0);
        setIntField(term744925, term744925.getClass(), "endLineno", 0);
        setField(term744925, term744925.getClass(), "functions", null);
        setField(term744925, term744925.getClass(), "regexps", null);
        setField(term744925, term744925.getClass(), "itsVariables", null);
        setField(term744925, term744925.getClass(), "itsConst", null);
        setField(term744925, term744925.getClass(), "itsVariableNames", null);
        setIntField(term744925, term744925.getClass(), "varStart", 0);
        setField(term744925, term744925.getClass(), "compilerData", null);
        setIntField(term744925, term744925.getClass(), "type", 35);
        setField(term744925, term744925.getClass(), "next", null);
        setField(term744932, term744932.getClass(), "functionName", null);
        setBooleanField(term744932, term744932.getClass(), "itsNeedsActivation", false);
        setIntField(term744932, term744932.getClass(), "itsFunctionType", 0);
        setBooleanField(term744932, term744932.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term744932, term744932.getClass(), "encodedSourceStart", 0);
        setIntField(term744932, term744932.getClass(), "encodedSourceEnd", 0);
        setField(term744932, term744932.getClass(), "sourceName", null);
        setIntField(term744932, term744932.getClass(), "baseLineno", 0);
        setIntField(term744932, term744932.getClass(), "endLineno", 0);
        setField(term744932, term744932.getClass(), "functions", null);
        setField(term744932, term744932.getClass(), "regexps", null);
        setField(term744932, term744932.getClass(), "itsVariables", null);
        setField(term744932, term744932.getClass(), "itsConst", null);
        setField(term744932, term744932.getClass(), "itsVariableNames", null);
        setIntField(term744932, term744932.getClass(), "varStart", 0);
        setField(term744932, term744932.getClass(), "compilerData", null);
        setIntField(term744932, term744932.getClass(), "type", 63);
        setDoubleField(term744942, term744942.getClass(), "number", 0.0);
        setIntField(term744942, term744942.getClass(), "type", 0);
        setField(term744942, term744942.getClass(), "next", null);
        setField(term744942, term744942.getClass(), "first", null);
        setField(term744942, term744942.getClass(), "last", null);
        setField(term744942, term744942.getClass(), "propListHead", null);
        setIntField(term744942, term744942.getClass(), "sourcePosition", 0);
        setField(term744942, term744942.getClass(), "jsType", null);
        setField(term744942, term744942.getClass(), "parent", null);
        setField(term744932, term744932.getClass(), "next", term744942);
        setField(term744932, term744932.getClass(), "first", null);
        setField(term744932, term744932.getClass(), "last", null);
        setField(term744932, term744932.getClass(), "propListHead", null);
        setIntField(term744932, term744932.getClass(), "sourcePosition", 0);
        setField(term744932, term744932.getClass(), "jsType", null);
        setField(term744932, term744932.getClass(), "parent", null);
        setField(term744925, term744925.getClass(), "first", term744932);
        setField(term744925, term744925.getClass(), "last", null);
        setField(term744925, term744925.getClass(), "propListHead", null);
        setIntField(term744925, term744925.getClass(), "sourcePosition", 0);
        setField(term744925, term744925.getClass(), "jsType", null);
        setField(term744925, term744925.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term744318;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term744228, args);
        assertTrue(recursiveEquals(term744228, term745025));
        assertTrue(recursiveEquals(term744318, term745026));
        assertTrue(recursiveEquals(retValue, term744925));
    }

};


