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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747838;
     Object term747930;
     Object term748492;
     Object term748493;
     Object term748440;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term747838 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term747930 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term748016 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term748108 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term748016, term748016.getClass(), "next", term748108);
        setField(term747930, term747930.getClass(), "first", term748016);
        setIntField(term747930, term747930.getClass(), "type", 33);
        term748492 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term748492, term748492.getClass(), "currentTraversal", null);
        term748493 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term748494 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term748495 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term748493, term748493.getClass(), "number", 0.0);
        setIntField(term748493, term748493.getClass(), "type", 33);
        setField(term748493, term748493.getClass(), "next", null);
        setField(term748494, term748494.getClass(), "functionName", null);
        setBooleanField(term748494, term748494.getClass(), "itsNeedsActivation", false);
        setIntField(term748494, term748494.getClass(), "itsFunctionType", 0);
        setBooleanField(term748494, term748494.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term748494, term748494.getClass(), "encodedSourceStart", 0);
        setIntField(term748494, term748494.getClass(), "encodedSourceEnd", 0);
        setField(term748494, term748494.getClass(), "sourceName", null);
        setIntField(term748494, term748494.getClass(), "baseLineno", 0);
        setIntField(term748494, term748494.getClass(), "endLineno", 0);
        setField(term748494, term748494.getClass(), "functions", null);
        setField(term748494, term748494.getClass(), "regexps", null);
        setField(term748494, term748494.getClass(), "itsVariables", null);
        setField(term748494, term748494.getClass(), "itsConst", null);
        setField(term748494, term748494.getClass(), "itsVariableNames", null);
        setIntField(term748494, term748494.getClass(), "varStart", 0);
        setField(term748494, term748494.getClass(), "compilerData", null);
        setIntField(term748494, term748494.getClass(), "type", 0);
        setDoubleField(term748495, term748495.getClass(), "number", 0.0);
        setIntField(term748495, term748495.getClass(), "type", 0);
        setField(term748495, term748495.getClass(), "next", null);
        setField(term748495, term748495.getClass(), "first", null);
        setField(term748495, term748495.getClass(), "last", null);
        setField(term748495, term748495.getClass(), "propListHead", null);
        setIntField(term748495, term748495.getClass(), "sourcePosition", 0);
        setField(term748495, term748495.getClass(), "jsType", null);
        setField(term748495, term748495.getClass(), "parent", null);
        setField(term748494, term748494.getClass(), "next", term748495);
        setField(term748494, term748494.getClass(), "first", null);
        setField(term748494, term748494.getClass(), "last", null);
        setField(term748494, term748494.getClass(), "propListHead", null);
        setIntField(term748494, term748494.getClass(), "sourcePosition", 0);
        setField(term748494, term748494.getClass(), "jsType", null);
        setField(term748494, term748494.getClass(), "parent", null);
        setField(term748493, term748493.getClass(), "first", term748494);
        setField(term748493, term748493.getClass(), "last", null);
        setField(term748493, term748493.getClass(), "propListHead", null);
        setIntField(term748493, term748493.getClass(), "sourcePosition", 0);
        setField(term748493, term748493.getClass(), "jsType", null);
        setField(term748493, term748493.getClass(), "parent", null);
        term748440 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term748443 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term748453 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term748440, term748440.getClass(), "number", 0.0);
        setIntField(term748440, term748440.getClass(), "type", 33);
        setField(term748440, term748440.getClass(), "next", null);
        setField(term748443, term748443.getClass(), "functionName", null);
        setBooleanField(term748443, term748443.getClass(), "itsNeedsActivation", false);
        setIntField(term748443, term748443.getClass(), "itsFunctionType", 0);
        setBooleanField(term748443, term748443.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term748443, term748443.getClass(), "encodedSourceStart", 0);
        setIntField(term748443, term748443.getClass(), "encodedSourceEnd", 0);
        setField(term748443, term748443.getClass(), "sourceName", null);
        setIntField(term748443, term748443.getClass(), "baseLineno", 0);
        setIntField(term748443, term748443.getClass(), "endLineno", 0);
        setField(term748443, term748443.getClass(), "functions", null);
        setField(term748443, term748443.getClass(), "regexps", null);
        setField(term748443, term748443.getClass(), "itsVariables", null);
        setField(term748443, term748443.getClass(), "itsConst", null);
        setField(term748443, term748443.getClass(), "itsVariableNames", null);
        setIntField(term748443, term748443.getClass(), "varStart", 0);
        setField(term748443, term748443.getClass(), "compilerData", null);
        setIntField(term748443, term748443.getClass(), "type", 0);
        setDoubleField(term748453, term748453.getClass(), "number", 0.0);
        setIntField(term748453, term748453.getClass(), "type", 0);
        setField(term748453, term748453.getClass(), "next", null);
        setField(term748453, term748453.getClass(), "first", null);
        setField(term748453, term748453.getClass(), "last", null);
        setField(term748453, term748453.getClass(), "propListHead", null);
        setIntField(term748453, term748453.getClass(), "sourcePosition", 0);
        setField(term748453, term748453.getClass(), "jsType", null);
        setField(term748453, term748453.getClass(), "parent", null);
        setField(term748443, term748443.getClass(), "next", term748453);
        setField(term748443, term748443.getClass(), "first", null);
        setField(term748443, term748443.getClass(), "last", null);
        setField(term748443, term748443.getClass(), "propListHead", null);
        setIntField(term748443, term748443.getClass(), "sourcePosition", 0);
        setField(term748443, term748443.getClass(), "jsType", null);
        setField(term748443, term748443.getClass(), "parent", null);
        setField(term748440, term748440.getClass(), "first", term748443);
        setField(term748440, term748440.getClass(), "last", null);
        setField(term748440, term748440.getClass(), "propListHead", null);
        setIntField(term748440, term748440.getClass(), "sourcePosition", 0);
        setField(term748440, term748440.getClass(), "jsType", null);
        setField(term748440, term748440.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term747930;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term747838, args);
        assertTrue(recursiveEquals(term747838, term748492));
        assertTrue(recursiveEquals(term747930, term748493));
        assertTrue(recursiveEquals(retValue, term748440));
    }

};


