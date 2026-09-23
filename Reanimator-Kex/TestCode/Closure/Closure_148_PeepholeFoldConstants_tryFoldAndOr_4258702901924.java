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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511265;
     Object term511351;
     Object term511529;
     Object term511621;
     Object term511728;
     Object term511729;
     Object term511731;
     Object term511732;
     Object term511633;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term511265 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term511351 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term511437 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term511437, term511437.getClass(), "type", 114);
        setField(term511351, term511351.getClass(), "parent", term511437);
        setIntField(term511351, term511351.getClass(), "type", 0);
        term511529 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term511529, term511529.getClass(), "type", 119);
        term511621 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term511621, term511621.getClass(), "type", 63);
        term511728 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term511728, term511728.getClass(), "currentTraversal", null);
        term511729 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term511730 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term511729, term511729.getClass(), "functionName", null);
        setBooleanField(term511729, term511729.getClass(), "itsNeedsActivation", false);
        setIntField(term511729, term511729.getClass(), "itsFunctionType", 0);
        setBooleanField(term511729, term511729.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term511729, term511729.getClass(), "encodedSourceStart", 0);
        setIntField(term511729, term511729.getClass(), "encodedSourceEnd", 0);
        setField(term511729, term511729.getClass(), "sourceName", null);
        setIntField(term511729, term511729.getClass(), "baseLineno", 0);
        setIntField(term511729, term511729.getClass(), "endLineno", 0);
        setField(term511729, term511729.getClass(), "functions", null);
        setField(term511729, term511729.getClass(), "regexps", null);
        setField(term511729, term511729.getClass(), "itsVariables", null);
        setField(term511729, term511729.getClass(), "itsConst", null);
        setField(term511729, term511729.getClass(), "itsVariableNames", null);
        setIntField(term511729, term511729.getClass(), "varStart", 0);
        setField(term511729, term511729.getClass(), "compilerData", null);
        setIntField(term511729, term511729.getClass(), "type", 0);
        setField(term511729, term511729.getClass(), "next", null);
        setField(term511729, term511729.getClass(), "first", null);
        setField(term511729, term511729.getClass(), "last", null);
        setField(term511729, term511729.getClass(), "propListHead", null);
        setIntField(term511729, term511729.getClass(), "sourcePosition", 0);
        setField(term511729, term511729.getClass(), "jsType", null);
        setField(term511730, term511730.getClass(), "functionName", null);
        setBooleanField(term511730, term511730.getClass(), "itsNeedsActivation", false);
        setIntField(term511730, term511730.getClass(), "itsFunctionType", 0);
        setBooleanField(term511730, term511730.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term511730, term511730.getClass(), "encodedSourceStart", 0);
        setIntField(term511730, term511730.getClass(), "encodedSourceEnd", 0);
        setField(term511730, term511730.getClass(), "sourceName", null);
        setIntField(term511730, term511730.getClass(), "baseLineno", 0);
        setIntField(term511730, term511730.getClass(), "endLineno", 0);
        setField(term511730, term511730.getClass(), "functions", null);
        setField(term511730, term511730.getClass(), "regexps", null);
        setField(term511730, term511730.getClass(), "itsVariables", null);
        setField(term511730, term511730.getClass(), "itsConst", null);
        setField(term511730, term511730.getClass(), "itsVariableNames", null);
        setIntField(term511730, term511730.getClass(), "varStart", 0);
        setField(term511730, term511730.getClass(), "compilerData", null);
        setIntField(term511730, term511730.getClass(), "type", 114);
        setField(term511730, term511730.getClass(), "next", null);
        setField(term511730, term511730.getClass(), "first", null);
        setField(term511730, term511730.getClass(), "last", null);
        setField(term511730, term511730.getClass(), "propListHead", null);
        setIntField(term511730, term511730.getClass(), "sourcePosition", 0);
        setField(term511730, term511730.getClass(), "jsType", null);
        setField(term511730, term511730.getClass(), "parent", null);
        setField(term511729, term511729.getClass(), "parent", term511730);
        term511731 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term511731, term511731.getClass(), "number", 0.0);
        setIntField(term511731, term511731.getClass(), "type", 119);
        setField(term511731, term511731.getClass(), "next", null);
        setField(term511731, term511731.getClass(), "first", null);
        setField(term511731, term511731.getClass(), "last", null);
        setField(term511731, term511731.getClass(), "propListHead", null);
        setIntField(term511731, term511731.getClass(), "sourcePosition", 0);
        setField(term511731, term511731.getClass(), "jsType", null);
        setField(term511731, term511731.getClass(), "parent", null);
        term511732 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term511732, term511732.getClass(), "number", 0.0);
        setIntField(term511732, term511732.getClass(), "type", 63);
        setField(term511732, term511732.getClass(), "next", null);
        setField(term511732, term511732.getClass(), "first", null);
        setField(term511732, term511732.getClass(), "last", null);
        setField(term511732, term511732.getClass(), "propListHead", null);
        setIntField(term511732, term511732.getClass(), "sourcePosition", 0);
        setField(term511732, term511732.getClass(), "jsType", null);
        setField(term511732, term511732.getClass(), "parent", null);
        term511633 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term511644 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term511633, term511633.getClass(), "functionName", null);
        setBooleanField(term511633, term511633.getClass(), "itsNeedsActivation", false);
        setIntField(term511633, term511633.getClass(), "itsFunctionType", 0);
        setBooleanField(term511633, term511633.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term511633, term511633.getClass(), "encodedSourceStart", 0);
        setIntField(term511633, term511633.getClass(), "encodedSourceEnd", 0);
        setField(term511633, term511633.getClass(), "sourceName", null);
        setIntField(term511633, term511633.getClass(), "baseLineno", 0);
        setIntField(term511633, term511633.getClass(), "endLineno", 0);
        setField(term511633, term511633.getClass(), "functions", null);
        setField(term511633, term511633.getClass(), "regexps", null);
        setField(term511633, term511633.getClass(), "itsVariables", null);
        setField(term511633, term511633.getClass(), "itsConst", null);
        setField(term511633, term511633.getClass(), "itsVariableNames", null);
        setIntField(term511633, term511633.getClass(), "varStart", 0);
        setField(term511633, term511633.getClass(), "compilerData", null);
        setIntField(term511633, term511633.getClass(), "type", 0);
        setField(term511633, term511633.getClass(), "next", null);
        setField(term511633, term511633.getClass(), "first", null);
        setField(term511633, term511633.getClass(), "last", null);
        setField(term511633, term511633.getClass(), "propListHead", null);
        setIntField(term511633, term511633.getClass(), "sourcePosition", 0);
        setField(term511633, term511633.getClass(), "jsType", null);
        setField(term511644, term511644.getClass(), "functionName", null);
        setBooleanField(term511644, term511644.getClass(), "itsNeedsActivation", false);
        setIntField(term511644, term511644.getClass(), "itsFunctionType", 0);
        setBooleanField(term511644, term511644.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term511644, term511644.getClass(), "encodedSourceStart", 0);
        setIntField(term511644, term511644.getClass(), "encodedSourceEnd", 0);
        setField(term511644, term511644.getClass(), "sourceName", null);
        setIntField(term511644, term511644.getClass(), "baseLineno", 0);
        setIntField(term511644, term511644.getClass(), "endLineno", 0);
        setField(term511644, term511644.getClass(), "functions", null);
        setField(term511644, term511644.getClass(), "regexps", null);
        setField(term511644, term511644.getClass(), "itsVariables", null);
        setField(term511644, term511644.getClass(), "itsConst", null);
        setField(term511644, term511644.getClass(), "itsVariableNames", null);
        setIntField(term511644, term511644.getClass(), "varStart", 0);
        setField(term511644, term511644.getClass(), "compilerData", null);
        setIntField(term511644, term511644.getClass(), "type", 114);
        setField(term511644, term511644.getClass(), "next", null);
        setField(term511644, term511644.getClass(), "first", null);
        setField(term511644, term511644.getClass(), "last", null);
        setField(term511644, term511644.getClass(), "propListHead", null);
        setIntField(term511644, term511644.getClass(), "sourcePosition", 0);
        setField(term511644, term511644.getClass(), "jsType", null);
        setField(term511644, term511644.getClass(), "parent", null);
        setField(term511633, term511633.getClass(), "parent", term511644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term511351;
        args[1] = term511529;
        args[2] = term511621;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term511265, args);
        assertTrue(recursiveEquals(term511265, term511728));
        assertTrue(recursiveEquals(term511351, term511729));
        assertTrue(recursiveEquals(term511529, term511731));
        assertTrue(recursiveEquals(term511621, term511732));
        assertTrue(recursiveEquals(retValue, term511633));
    }

};


