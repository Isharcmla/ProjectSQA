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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92053;
     Object term92145;
     Object term92388;
     Object term92389;
     Object term92340;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92053 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term92145 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92237 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92327 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term92237, term92237.getClass(), "next", term92327);
        setIntField(term92237, term92237.getClass(), "type", 39);
        setField(term92145, term92145.getClass(), "first", term92237);
        setIntField(term92145, term92145.getClass(), "type", 22);
        term92388 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term92388, term92388.getClass(), "currentTraversal", null);
        term92389 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92390 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92391 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term92389, term92389.getClass(), "number", 0.0);
        setIntField(term92389, term92389.getClass(), "type", 22);
        setField(term92389, term92389.getClass(), "next", null);
        setDoubleField(term92390, term92390.getClass(), "number", 0.0);
        setIntField(term92390, term92390.getClass(), "type", 39);
        setIntField(term92391, term92391.getClass(), "encodedSourceStart", 0);
        setIntField(term92391, term92391.getClass(), "encodedSourceEnd", 0);
        setField(term92391, term92391.getClass(), "sourceName", null);
        setIntField(term92391, term92391.getClass(), "baseLineno", 0);
        setIntField(term92391, term92391.getClass(), "endLineno", 0);
        setField(term92391, term92391.getClass(), "functions", null);
        setField(term92391, term92391.getClass(), "regexps", null);
        setField(term92391, term92391.getClass(), "itsVariables", null);
        setField(term92391, term92391.getClass(), "itsConst", null);
        setField(term92391, term92391.getClass(), "itsVariableNames", null);
        setIntField(term92391, term92391.getClass(), "varStart", 0);
        setField(term92391, term92391.getClass(), "compilerData", null);
        setIntField(term92391, term92391.getClass(), "type", 0);
        setField(term92391, term92391.getClass(), "next", null);
        setField(term92391, term92391.getClass(), "first", null);
        setField(term92391, term92391.getClass(), "last", null);
        setField(term92391, term92391.getClass(), "propListHead", null);
        setIntField(term92391, term92391.getClass(), "sourcePosition", 0);
        setField(term92391, term92391.getClass(), "jsType", null);
        setField(term92391, term92391.getClass(), "parent", null);
        setField(term92390, term92390.getClass(), "next", term92391);
        setField(term92390, term92390.getClass(), "first", null);
        setField(term92390, term92390.getClass(), "last", null);
        setField(term92390, term92390.getClass(), "propListHead", null);
        setIntField(term92390, term92390.getClass(), "sourcePosition", 0);
        setField(term92390, term92390.getClass(), "jsType", null);
        setField(term92390, term92390.getClass(), "parent", null);
        setField(term92389, term92389.getClass(), "first", term92390);
        setField(term92389, term92389.getClass(), "last", null);
        setField(term92389, term92389.getClass(), "propListHead", null);
        setIntField(term92389, term92389.getClass(), "sourcePosition", 0);
        setField(term92389, term92389.getClass(), "jsType", null);
        setField(term92389, term92389.getClass(), "parent", null);
        term92340 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92343 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92346 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term92340, term92340.getClass(), "number", 0.0);
        setIntField(term92340, term92340.getClass(), "type", 22);
        setField(term92340, term92340.getClass(), "next", null);
        setDoubleField(term92343, term92343.getClass(), "number", 0.0);
        setIntField(term92343, term92343.getClass(), "type", 39);
        setIntField(term92346, term92346.getClass(), "encodedSourceStart", 0);
        setIntField(term92346, term92346.getClass(), "encodedSourceEnd", 0);
        setField(term92346, term92346.getClass(), "sourceName", null);
        setIntField(term92346, term92346.getClass(), "baseLineno", 0);
        setIntField(term92346, term92346.getClass(), "endLineno", 0);
        setField(term92346, term92346.getClass(), "functions", null);
        setField(term92346, term92346.getClass(), "regexps", null);
        setField(term92346, term92346.getClass(), "itsVariables", null);
        setField(term92346, term92346.getClass(), "itsConst", null);
        setField(term92346, term92346.getClass(), "itsVariableNames", null);
        setIntField(term92346, term92346.getClass(), "varStart", 0);
        setField(term92346, term92346.getClass(), "compilerData", null);
        setIntField(term92346, term92346.getClass(), "type", 0);
        setField(term92346, term92346.getClass(), "next", null);
        setField(term92346, term92346.getClass(), "first", null);
        setField(term92346, term92346.getClass(), "last", null);
        setField(term92346, term92346.getClass(), "propListHead", null);
        setIntField(term92346, term92346.getClass(), "sourcePosition", 0);
        setField(term92346, term92346.getClass(), "jsType", null);
        setField(term92346, term92346.getClass(), "parent", null);
        setField(term92343, term92343.getClass(), "next", term92346);
        setField(term92343, term92343.getClass(), "first", null);
        setField(term92343, term92343.getClass(), "last", null);
        setField(term92343, term92343.getClass(), "propListHead", null);
        setIntField(term92343, term92343.getClass(), "sourcePosition", 0);
        setField(term92343, term92343.getClass(), "jsType", null);
        setField(term92343, term92343.getClass(), "parent", null);
        setField(term92340, term92340.getClass(), "first", term92343);
        setField(term92340, term92340.getClass(), "last", null);
        setField(term92340, term92340.getClass(), "propListHead", null);
        setIntField(term92340, term92340.getClass(), "sourcePosition", 0);
        setField(term92340, term92340.getClass(), "jsType", null);
        setField(term92340, term92340.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term92145;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term92053, args);
        assertTrue(recursiveEquals(term92053, term92388));
        assertTrue(recursiveEquals(term92145, term92389));
        assertTrue(recursiveEquals(retValue, term92340));
    }

};


