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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400740;
     Object term400810;
     Object term420323;
     Object term420324;
     Object term420255;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400740 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term400810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term400900 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term400992 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term400900, term400900.getClass(), "next", term400992);
        setIntField(term400900, term400900.getClass(), "type", 0);
        setField(term400810, term400810.getClass(), "first", term400900);
        setIntField(term400810, term400810.getClass(), "type", 101);
        setField(term400810, term400810.getClass(), "parent", null);
        term420323 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term420323, term420323.getClass(), "currentTraversal", null);
        term420324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term420325 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term420326 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term420324, term420324.getClass(), "type", 101);
        setField(term420324, term420324.getClass(), "next", null);
        setIntField(term420325, term420325.getClass(), "encodedSourceStart", 0);
        setIntField(term420325, term420325.getClass(), "encodedSourceEnd", 0);
        setField(term420325, term420325.getClass(), "sourceName", null);
        setIntField(term420325, term420325.getClass(), "baseLineno", 0);
        setIntField(term420325, term420325.getClass(), "endLineno", 0);
        setField(term420325, term420325.getClass(), "functions", null);
        setField(term420325, term420325.getClass(), "regexps", null);
        setField(term420325, term420325.getClass(), "itsVariables", null);
        setField(term420325, term420325.getClass(), "itsConst", null);
        setField(term420325, term420325.getClass(), "itsVariableNames", null);
        setIntField(term420325, term420325.getClass(), "varStart", 0);
        setField(term420325, term420325.getClass(), "compilerData", null);
        setIntField(term420325, term420325.getClass(), "type", 0);
        setField(term420326, term420326.getClass(), "str", null);
        setIntField(term420326, term420326.getClass(), "type", 0);
        setField(term420326, term420326.getClass(), "next", null);
        setField(term420326, term420326.getClass(), "first", null);
        setField(term420326, term420326.getClass(), "last", null);
        setField(term420326, term420326.getClass(), "propListHead", null);
        setIntField(term420326, term420326.getClass(), "sourcePosition", 0);
        setField(term420326, term420326.getClass(), "jsType", null);
        setField(term420326, term420326.getClass(), "parent", null);
        setField(term420325, term420325.getClass(), "next", term420326);
        setField(term420325, term420325.getClass(), "first", null);
        setField(term420325, term420325.getClass(), "last", null);
        setField(term420325, term420325.getClass(), "propListHead", null);
        setIntField(term420325, term420325.getClass(), "sourcePosition", 0);
        setField(term420325, term420325.getClass(), "jsType", null);
        setField(term420325, term420325.getClass(), "parent", null);
        setField(term420324, term420324.getClass(), "first", term420325);
        setField(term420324, term420324.getClass(), "last", null);
        setField(term420324, term420324.getClass(), "propListHead", null);
        setIntField(term420324, term420324.getClass(), "sourcePosition", 0);
        setField(term420324, term420324.getClass(), "jsType", null);
        setField(term420324, term420324.getClass(), "parent", null);
        term420255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term420257 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term420264 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term420255, term420255.getClass(), "type", 101);
        setField(term420255, term420255.getClass(), "next", null);
        setIntField(term420257, term420257.getClass(), "encodedSourceStart", 0);
        setIntField(term420257, term420257.getClass(), "encodedSourceEnd", 0);
        setField(term420257, term420257.getClass(), "sourceName", null);
        setIntField(term420257, term420257.getClass(), "baseLineno", 0);
        setIntField(term420257, term420257.getClass(), "endLineno", 0);
        setField(term420257, term420257.getClass(), "functions", null);
        setField(term420257, term420257.getClass(), "regexps", null);
        setField(term420257, term420257.getClass(), "itsVariables", null);
        setField(term420257, term420257.getClass(), "itsConst", null);
        setField(term420257, term420257.getClass(), "itsVariableNames", null);
        setIntField(term420257, term420257.getClass(), "varStart", 0);
        setField(term420257, term420257.getClass(), "compilerData", null);
        setIntField(term420257, term420257.getClass(), "type", 0);
        setField(term420264, term420264.getClass(), "str", null);
        setIntField(term420264, term420264.getClass(), "type", 0);
        setField(term420264, term420264.getClass(), "next", null);
        setField(term420264, term420264.getClass(), "first", null);
        setField(term420264, term420264.getClass(), "last", null);
        setField(term420264, term420264.getClass(), "propListHead", null);
        setIntField(term420264, term420264.getClass(), "sourcePosition", 0);
        setField(term420264, term420264.getClass(), "jsType", null);
        setField(term420264, term420264.getClass(), "parent", null);
        setField(term420257, term420257.getClass(), "next", term420264);
        setField(term420257, term420257.getClass(), "first", null);
        setField(term420257, term420257.getClass(), "last", null);
        setField(term420257, term420257.getClass(), "propListHead", null);
        setIntField(term420257, term420257.getClass(), "sourcePosition", 0);
        setField(term420257, term420257.getClass(), "jsType", null);
        setField(term420257, term420257.getClass(), "parent", null);
        setField(term420255, term420255.getClass(), "first", term420257);
        setField(term420255, term420255.getClass(), "last", null);
        setField(term420255, term420255.getClass(), "propListHead", null);
        setIntField(term420255, term420255.getClass(), "sourcePosition", 0);
        setField(term420255, term420255.getClass(), "jsType", null);
        setField(term420255, term420255.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term400810;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term400740, args);
        assertTrue(recursiveEquals(term400740, term420323));
        assertTrue(recursiveEquals(term400810, term420324));
        assertTrue(recursiveEquals(retValue, term420255));
    }

};


