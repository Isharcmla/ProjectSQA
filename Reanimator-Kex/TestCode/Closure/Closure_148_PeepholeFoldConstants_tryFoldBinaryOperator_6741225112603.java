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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term739312;
     Object term739404;
     Object term740286;
     Object term740287;
     Object term740216;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term739312 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term739404 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term739496 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term739582 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term739582, term739582.getClass(), "type", 42);
        setField(term739496, term739496.getClass(), "next", term739582);
        setIntField(term739496, term739496.getClass(), "type", 42);
        setField(term739404, term739404.getClass(), "first", term739496);
        setIntField(term739404, term739404.getClass(), "type", 14);
        term740286 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term740286, term740286.getClass(), "currentTraversal", null);
        term740287 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term740288 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term740289 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term740287, term740287.getClass(), "str", null);
        setIntField(term740287, term740287.getClass(), "type", 14);
        setField(term740287, term740287.getClass(), "next", null);
        setField(term740288, term740288.getClass(), "str", null);
        setIntField(term740288, term740288.getClass(), "type", 42);
        setField(term740289, term740289.getClass(), "functionName", null);
        setBooleanField(term740289, term740289.getClass(), "itsNeedsActivation", false);
        setIntField(term740289, term740289.getClass(), "itsFunctionType", 0);
        setBooleanField(term740289, term740289.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term740289, term740289.getClass(), "encodedSourceStart", 0);
        setIntField(term740289, term740289.getClass(), "encodedSourceEnd", 0);
        setField(term740289, term740289.getClass(), "sourceName", null);
        setIntField(term740289, term740289.getClass(), "baseLineno", 0);
        setIntField(term740289, term740289.getClass(), "endLineno", 0);
        setField(term740289, term740289.getClass(), "functions", null);
        setField(term740289, term740289.getClass(), "regexps", null);
        setField(term740289, term740289.getClass(), "itsVariables", null);
        setField(term740289, term740289.getClass(), "itsConst", null);
        setField(term740289, term740289.getClass(), "itsVariableNames", null);
        setIntField(term740289, term740289.getClass(), "varStart", 0);
        setField(term740289, term740289.getClass(), "compilerData", null);
        setIntField(term740289, term740289.getClass(), "type", 42);
        setField(term740289, term740289.getClass(), "next", null);
        setField(term740289, term740289.getClass(), "first", null);
        setField(term740289, term740289.getClass(), "last", null);
        setField(term740289, term740289.getClass(), "propListHead", null);
        setIntField(term740289, term740289.getClass(), "sourcePosition", 0);
        setField(term740289, term740289.getClass(), "jsType", null);
        setField(term740289, term740289.getClass(), "parent", null);
        setField(term740288, term740288.getClass(), "next", term740289);
        setField(term740288, term740288.getClass(), "first", null);
        setField(term740288, term740288.getClass(), "last", null);
        setField(term740288, term740288.getClass(), "propListHead", null);
        setIntField(term740288, term740288.getClass(), "sourcePosition", 0);
        setField(term740288, term740288.getClass(), "jsType", null);
        setField(term740288, term740288.getClass(), "parent", null);
        setField(term740287, term740287.getClass(), "first", term740288);
        setField(term740287, term740287.getClass(), "last", null);
        setField(term740287, term740287.getClass(), "propListHead", null);
        setIntField(term740287, term740287.getClass(), "sourcePosition", 0);
        setField(term740287, term740287.getClass(), "jsType", null);
        setField(term740287, term740287.getClass(), "parent", null);
        term740216 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term740218 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term740220 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term740216, term740216.getClass(), "str", null);
        setIntField(term740216, term740216.getClass(), "type", 14);
        setField(term740216, term740216.getClass(), "next", null);
        setField(term740218, term740218.getClass(), "str", null);
        setIntField(term740218, term740218.getClass(), "type", 42);
        setField(term740220, term740220.getClass(), "functionName", null);
        setBooleanField(term740220, term740220.getClass(), "itsNeedsActivation", false);
        setIntField(term740220, term740220.getClass(), "itsFunctionType", 0);
        setBooleanField(term740220, term740220.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term740220, term740220.getClass(), "encodedSourceStart", 0);
        setIntField(term740220, term740220.getClass(), "encodedSourceEnd", 0);
        setField(term740220, term740220.getClass(), "sourceName", null);
        setIntField(term740220, term740220.getClass(), "baseLineno", 0);
        setIntField(term740220, term740220.getClass(), "endLineno", 0);
        setField(term740220, term740220.getClass(), "functions", null);
        setField(term740220, term740220.getClass(), "regexps", null);
        setField(term740220, term740220.getClass(), "itsVariables", null);
        setField(term740220, term740220.getClass(), "itsConst", null);
        setField(term740220, term740220.getClass(), "itsVariableNames", null);
        setIntField(term740220, term740220.getClass(), "varStart", 0);
        setField(term740220, term740220.getClass(), "compilerData", null);
        setIntField(term740220, term740220.getClass(), "type", 42);
        setField(term740220, term740220.getClass(), "next", null);
        setField(term740220, term740220.getClass(), "first", null);
        setField(term740220, term740220.getClass(), "last", null);
        setField(term740220, term740220.getClass(), "propListHead", null);
        setIntField(term740220, term740220.getClass(), "sourcePosition", 0);
        setField(term740220, term740220.getClass(), "jsType", null);
        setField(term740220, term740220.getClass(), "parent", null);
        setField(term740218, term740218.getClass(), "next", term740220);
        setField(term740218, term740218.getClass(), "first", null);
        setField(term740218, term740218.getClass(), "last", null);
        setField(term740218, term740218.getClass(), "propListHead", null);
        setIntField(term740218, term740218.getClass(), "sourcePosition", 0);
        setField(term740218, term740218.getClass(), "jsType", null);
        setField(term740218, term740218.getClass(), "parent", null);
        setField(term740216, term740216.getClass(), "first", term740218);
        setField(term740216, term740216.getClass(), "last", null);
        setField(term740216, term740216.getClass(), "propListHead", null);
        setIntField(term740216, term740216.getClass(), "sourcePosition", 0);
        setField(term740216, term740216.getClass(), "jsType", null);
        setField(term740216, term740216.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term739404;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term739312, args);
        assertTrue(recursiveEquals(term739312, term740286));
        assertTrue(recursiveEquals(term739404, term740287));
        assertTrue(recursiveEquals(retValue, term740216));
    }

};


