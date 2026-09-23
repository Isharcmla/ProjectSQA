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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term903140;
     Object term903232;
     Object term904279;
     Object term904280;
     Object term904197;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term903140 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term903232 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term903322 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term903414 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term903506 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term903414, term903414.getClass(), "type", 63);
        setField(term903322, term903322.getClass(), "next", term903414);
        setIntField(term903322, term903322.getClass(), "type", 0);
        setField(term903232, term903232.getClass(), "first", term903322);
        setIntField(term903232, term903232.getClass(), "type", 101);
        setField(term903232, term903232.getClass(), "parent", term903506);
        term904279 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term904279, term904279.getClass(), "currentTraversal", null);
        term904280 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term904281 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term904282 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term904283 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term904280, term904280.getClass(), "str", null);
        setIntField(term904280, term904280.getClass(), "type", 101);
        setField(term904280, term904280.getClass(), "next", null);
        setIntField(term904281, term904281.getClass(), "encodedSourceStart", 0);
        setIntField(term904281, term904281.getClass(), "encodedSourceEnd", 0);
        setField(term904281, term904281.getClass(), "sourceName", null);
        setIntField(term904281, term904281.getClass(), "baseLineno", 0);
        setIntField(term904281, term904281.getClass(), "endLineno", 0);
        setField(term904281, term904281.getClass(), "functions", null);
        setField(term904281, term904281.getClass(), "regexps", null);
        setField(term904281, term904281.getClass(), "itsVariables", null);
        setField(term904281, term904281.getClass(), "itsConst", null);
        setField(term904281, term904281.getClass(), "itsVariableNames", null);
        setIntField(term904281, term904281.getClass(), "varStart", 0);
        setField(term904281, term904281.getClass(), "compilerData", null);
        setIntField(term904281, term904281.getClass(), "type", 0);
        setField(term904282, term904282.getClass(), "str", null);
        setIntField(term904282, term904282.getClass(), "type", 63);
        setField(term904282, term904282.getClass(), "next", null);
        setField(term904282, term904282.getClass(), "first", null);
        setField(term904282, term904282.getClass(), "last", null);
        setField(term904282, term904282.getClass(), "propListHead", null);
        setIntField(term904282, term904282.getClass(), "sourcePosition", 0);
        setField(term904282, term904282.getClass(), "jsType", null);
        setField(term904282, term904282.getClass(), "parent", null);
        setField(term904281, term904281.getClass(), "next", term904282);
        setField(term904281, term904281.getClass(), "first", null);
        setField(term904281, term904281.getClass(), "last", null);
        setField(term904281, term904281.getClass(), "propListHead", null);
        setIntField(term904281, term904281.getClass(), "sourcePosition", 0);
        setField(term904281, term904281.getClass(), "jsType", null);
        setField(term904281, term904281.getClass(), "parent", null);
        setField(term904280, term904280.getClass(), "first", term904281);
        setField(term904280, term904280.getClass(), "last", null);
        setField(term904280, term904280.getClass(), "propListHead", null);
        setIntField(term904280, term904280.getClass(), "sourcePosition", 0);
        setField(term904280, term904280.getClass(), "jsType", null);
        setDoubleField(term904283, term904283.getClass(), "number", 0.0);
        setIntField(term904283, term904283.getClass(), "type", 0);
        setField(term904283, term904283.getClass(), "next", null);
        setField(term904283, term904283.getClass(), "first", null);
        setField(term904283, term904283.getClass(), "last", null);
        setField(term904283, term904283.getClass(), "propListHead", null);
        setIntField(term904283, term904283.getClass(), "sourcePosition", 0);
        setField(term904283, term904283.getClass(), "jsType", null);
        setField(term904283, term904283.getClass(), "parent", null);
        setField(term904280, term904280.getClass(), "parent", term904283);
        term904197 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term904199 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term904206 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term904211 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term904197, term904197.getClass(), "str", null);
        setIntField(term904197, term904197.getClass(), "type", 101);
        setField(term904197, term904197.getClass(), "next", null);
        setIntField(term904199, term904199.getClass(), "encodedSourceStart", 0);
        setIntField(term904199, term904199.getClass(), "encodedSourceEnd", 0);
        setField(term904199, term904199.getClass(), "sourceName", null);
        setIntField(term904199, term904199.getClass(), "baseLineno", 0);
        setIntField(term904199, term904199.getClass(), "endLineno", 0);
        setField(term904199, term904199.getClass(), "functions", null);
        setField(term904199, term904199.getClass(), "regexps", null);
        setField(term904199, term904199.getClass(), "itsVariables", null);
        setField(term904199, term904199.getClass(), "itsConst", null);
        setField(term904199, term904199.getClass(), "itsVariableNames", null);
        setIntField(term904199, term904199.getClass(), "varStart", 0);
        setField(term904199, term904199.getClass(), "compilerData", null);
        setIntField(term904199, term904199.getClass(), "type", 0);
        setField(term904206, term904206.getClass(), "str", null);
        setIntField(term904206, term904206.getClass(), "type", 63);
        setField(term904206, term904206.getClass(), "next", null);
        setField(term904206, term904206.getClass(), "first", null);
        setField(term904206, term904206.getClass(), "last", null);
        setField(term904206, term904206.getClass(), "propListHead", null);
        setIntField(term904206, term904206.getClass(), "sourcePosition", 0);
        setField(term904206, term904206.getClass(), "jsType", null);
        setField(term904206, term904206.getClass(), "parent", null);
        setField(term904199, term904199.getClass(), "next", term904206);
        setField(term904199, term904199.getClass(), "first", null);
        setField(term904199, term904199.getClass(), "last", null);
        setField(term904199, term904199.getClass(), "propListHead", null);
        setIntField(term904199, term904199.getClass(), "sourcePosition", 0);
        setField(term904199, term904199.getClass(), "jsType", null);
        setField(term904199, term904199.getClass(), "parent", null);
        setField(term904197, term904197.getClass(), "first", term904199);
        setField(term904197, term904197.getClass(), "last", null);
        setField(term904197, term904197.getClass(), "propListHead", null);
        setIntField(term904197, term904197.getClass(), "sourcePosition", 0);
        setField(term904197, term904197.getClass(), "jsType", null);
        setDoubleField(term904211, term904211.getClass(), "number", 0.0);
        setIntField(term904211, term904211.getClass(), "type", 0);
        setField(term904211, term904211.getClass(), "next", null);
        setField(term904211, term904211.getClass(), "first", null);
        setField(term904211, term904211.getClass(), "last", null);
        setField(term904211, term904211.getClass(), "propListHead", null);
        setIntField(term904211, term904211.getClass(), "sourcePosition", 0);
        setField(term904211, term904211.getClass(), "jsType", null);
        setField(term904211, term904211.getClass(), "parent", null);
        setField(term904197, term904197.getClass(), "parent", term904211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term903232;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term903140, args);
        assertTrue(recursiveEquals(term903140, term904279));
        assertTrue(recursiveEquals(term903232, term904280));
        assertTrue(recursiveEquals(retValue, term904197));
    }

};


