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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652533;
     Object term652625;
     Object term653532;
     Object term653533;
     Object term653482;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term652533 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term652625 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term652711 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term652781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term652711, term652711.getClass(), "next", term652781);
        setField(term652625, term652625.getClass(), "first", term652711);
        setIntField(term652625, term652625.getClass(), "type", 12);
        term653532 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term653532, term653532.getClass(), "currentTraversal", null);
        term653533 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term653534 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term653535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term653533, term653533.getClass(), "str", null);
        setIntField(term653533, term653533.getClass(), "type", 12);
        setField(term653533, term653533.getClass(), "next", null);
        setField(term653534, term653534.getClass(), "functionName", null);
        setBooleanField(term653534, term653534.getClass(), "itsNeedsActivation", false);
        setIntField(term653534, term653534.getClass(), "itsFunctionType", 0);
        setBooleanField(term653534, term653534.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term653534, term653534.getClass(), "encodedSourceStart", 0);
        setIntField(term653534, term653534.getClass(), "encodedSourceEnd", 0);
        setField(term653534, term653534.getClass(), "sourceName", null);
        setIntField(term653534, term653534.getClass(), "baseLineno", 0);
        setIntField(term653534, term653534.getClass(), "endLineno", 0);
        setField(term653534, term653534.getClass(), "functions", null);
        setField(term653534, term653534.getClass(), "regexps", null);
        setField(term653534, term653534.getClass(), "itsVariables", null);
        setField(term653534, term653534.getClass(), "itsConst", null);
        setField(term653534, term653534.getClass(), "itsVariableNames", null);
        setIntField(term653534, term653534.getClass(), "varStart", 0);
        setField(term653534, term653534.getClass(), "compilerData", null);
        setIntField(term653534, term653534.getClass(), "type", 0);
        setIntField(term653535, term653535.getClass(), "type", 0);
        setField(term653535, term653535.getClass(), "next", null);
        setField(term653535, term653535.getClass(), "first", null);
        setField(term653535, term653535.getClass(), "last", null);
        setField(term653535, term653535.getClass(), "propListHead", null);
        setIntField(term653535, term653535.getClass(), "sourcePosition", 0);
        setField(term653535, term653535.getClass(), "jsType", null);
        setField(term653535, term653535.getClass(), "parent", null);
        setField(term653534, term653534.getClass(), "next", term653535);
        setField(term653534, term653534.getClass(), "first", null);
        setField(term653534, term653534.getClass(), "last", null);
        setField(term653534, term653534.getClass(), "propListHead", null);
        setIntField(term653534, term653534.getClass(), "sourcePosition", 0);
        setField(term653534, term653534.getClass(), "jsType", null);
        setField(term653534, term653534.getClass(), "parent", null);
        setField(term653533, term653533.getClass(), "first", term653534);
        setField(term653533, term653533.getClass(), "last", null);
        setField(term653533, term653533.getClass(), "propListHead", null);
        setIntField(term653533, term653533.getClass(), "sourcePosition", 0);
        setField(term653533, term653533.getClass(), "jsType", null);
        setField(term653533, term653533.getClass(), "parent", null);
        term653482 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term653484 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term653494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term653482, term653482.getClass(), "str", null);
        setIntField(term653482, term653482.getClass(), "type", 12);
        setField(term653482, term653482.getClass(), "next", null);
        setField(term653484, term653484.getClass(), "functionName", null);
        setBooleanField(term653484, term653484.getClass(), "itsNeedsActivation", false);
        setIntField(term653484, term653484.getClass(), "itsFunctionType", 0);
        setBooleanField(term653484, term653484.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term653484, term653484.getClass(), "encodedSourceStart", 0);
        setIntField(term653484, term653484.getClass(), "encodedSourceEnd", 0);
        setField(term653484, term653484.getClass(), "sourceName", null);
        setIntField(term653484, term653484.getClass(), "baseLineno", 0);
        setIntField(term653484, term653484.getClass(), "endLineno", 0);
        setField(term653484, term653484.getClass(), "functions", null);
        setField(term653484, term653484.getClass(), "regexps", null);
        setField(term653484, term653484.getClass(), "itsVariables", null);
        setField(term653484, term653484.getClass(), "itsConst", null);
        setField(term653484, term653484.getClass(), "itsVariableNames", null);
        setIntField(term653484, term653484.getClass(), "varStart", 0);
        setField(term653484, term653484.getClass(), "compilerData", null);
        setIntField(term653484, term653484.getClass(), "type", 0);
        setIntField(term653494, term653494.getClass(), "type", 0);
        setField(term653494, term653494.getClass(), "next", null);
        setField(term653494, term653494.getClass(), "first", null);
        setField(term653494, term653494.getClass(), "last", null);
        setField(term653494, term653494.getClass(), "propListHead", null);
        setIntField(term653494, term653494.getClass(), "sourcePosition", 0);
        setField(term653494, term653494.getClass(), "jsType", null);
        setField(term653494, term653494.getClass(), "parent", null);
        setField(term653484, term653484.getClass(), "next", term653494);
        setField(term653484, term653484.getClass(), "first", null);
        setField(term653484, term653484.getClass(), "last", null);
        setField(term653484, term653484.getClass(), "propListHead", null);
        setIntField(term653484, term653484.getClass(), "sourcePosition", 0);
        setField(term653484, term653484.getClass(), "jsType", null);
        setField(term653484, term653484.getClass(), "parent", null);
        setField(term653482, term653482.getClass(), "first", term653484);
        setField(term653482, term653482.getClass(), "last", null);
        setField(term653482, term653482.getClass(), "propListHead", null);
        setIntField(term653482, term653482.getClass(), "sourcePosition", 0);
        setField(term653482, term653482.getClass(), "jsType", null);
        setField(term653482, term653482.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term652625;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term652533, args);
        assertTrue(recursiveEquals(term652533, term653532));
        assertTrue(recursiveEquals(term652625, term653533));
        assertTrue(recursiveEquals(retValue, term653482));
    }

};


