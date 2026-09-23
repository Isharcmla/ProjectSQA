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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729367;
     Object term729459;
     Object term730063;
     Object term730064;
     Object term729986;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term729367 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term729459 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term729551 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term729637 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term729551, term729551.getClass(), "next", term729637);
        setIntField(term729551, term729551.getClass(), "type", 0);
        setField(term729459, term729459.getClass(), "first", term729551);
        setIntField(term729459, term729459.getClass(), "type", 100);
        setField(term729459, term729459.getClass(), "parent", null);
        term730063 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term730063, term730063.getClass(), "currentTraversal", null);
        term730064 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term730065 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term730066 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term730064, term730064.getClass(), "str", null);
        setIntField(term730064, term730064.getClass(), "type", 100);
        setField(term730064, term730064.getClass(), "next", null);
        setField(term730065, term730065.getClass(), "str", null);
        setIntField(term730065, term730065.getClass(), "type", 0);
        setField(term730066, term730066.getClass(), "functionName", null);
        setBooleanField(term730066, term730066.getClass(), "itsNeedsActivation", false);
        setIntField(term730066, term730066.getClass(), "itsFunctionType", 0);
        setBooleanField(term730066, term730066.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term730066, term730066.getClass(), "encodedSourceStart", 0);
        setIntField(term730066, term730066.getClass(), "encodedSourceEnd", 0);
        setField(term730066, term730066.getClass(), "sourceName", null);
        setIntField(term730066, term730066.getClass(), "baseLineno", 0);
        setIntField(term730066, term730066.getClass(), "endLineno", 0);
        setField(term730066, term730066.getClass(), "functions", null);
        setField(term730066, term730066.getClass(), "regexps", null);
        setField(term730066, term730066.getClass(), "itsVariables", null);
        setField(term730066, term730066.getClass(), "itsConst", null);
        setField(term730066, term730066.getClass(), "itsVariableNames", null);
        setIntField(term730066, term730066.getClass(), "varStart", 0);
        setField(term730066, term730066.getClass(), "compilerData", null);
        setIntField(term730066, term730066.getClass(), "type", 0);
        setField(term730066, term730066.getClass(), "next", null);
        setField(term730066, term730066.getClass(), "first", null);
        setField(term730066, term730066.getClass(), "last", null);
        setField(term730066, term730066.getClass(), "propListHead", null);
        setIntField(term730066, term730066.getClass(), "sourcePosition", 0);
        setField(term730066, term730066.getClass(), "jsType", null);
        setField(term730066, term730066.getClass(), "parent", null);
        setField(term730065, term730065.getClass(), "next", term730066);
        setField(term730065, term730065.getClass(), "first", null);
        setField(term730065, term730065.getClass(), "last", null);
        setField(term730065, term730065.getClass(), "propListHead", null);
        setIntField(term730065, term730065.getClass(), "sourcePosition", 0);
        setField(term730065, term730065.getClass(), "jsType", null);
        setField(term730065, term730065.getClass(), "parent", null);
        setField(term730064, term730064.getClass(), "first", term730065);
        setField(term730064, term730064.getClass(), "last", null);
        setField(term730064, term730064.getClass(), "propListHead", null);
        setIntField(term730064, term730064.getClass(), "sourcePosition", 0);
        setField(term730064, term730064.getClass(), "jsType", null);
        setField(term730064, term730064.getClass(), "parent", null);
        term729986 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term729988 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term729990 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term729986, term729986.getClass(), "str", null);
        setIntField(term729986, term729986.getClass(), "type", 100);
        setField(term729986, term729986.getClass(), "next", null);
        setField(term729988, term729988.getClass(), "str", null);
        setIntField(term729988, term729988.getClass(), "type", 0);
        setField(term729990, term729990.getClass(), "functionName", null);
        setBooleanField(term729990, term729990.getClass(), "itsNeedsActivation", false);
        setIntField(term729990, term729990.getClass(), "itsFunctionType", 0);
        setBooleanField(term729990, term729990.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term729990, term729990.getClass(), "encodedSourceStart", 0);
        setIntField(term729990, term729990.getClass(), "encodedSourceEnd", 0);
        setField(term729990, term729990.getClass(), "sourceName", null);
        setIntField(term729990, term729990.getClass(), "baseLineno", 0);
        setIntField(term729990, term729990.getClass(), "endLineno", 0);
        setField(term729990, term729990.getClass(), "functions", null);
        setField(term729990, term729990.getClass(), "regexps", null);
        setField(term729990, term729990.getClass(), "itsVariables", null);
        setField(term729990, term729990.getClass(), "itsConst", null);
        setField(term729990, term729990.getClass(), "itsVariableNames", null);
        setIntField(term729990, term729990.getClass(), "varStart", 0);
        setField(term729990, term729990.getClass(), "compilerData", null);
        setIntField(term729990, term729990.getClass(), "type", 0);
        setField(term729990, term729990.getClass(), "next", null);
        setField(term729990, term729990.getClass(), "first", null);
        setField(term729990, term729990.getClass(), "last", null);
        setField(term729990, term729990.getClass(), "propListHead", null);
        setIntField(term729990, term729990.getClass(), "sourcePosition", 0);
        setField(term729990, term729990.getClass(), "jsType", null);
        setField(term729990, term729990.getClass(), "parent", null);
        setField(term729988, term729988.getClass(), "next", term729990);
        setField(term729988, term729988.getClass(), "first", null);
        setField(term729988, term729988.getClass(), "last", null);
        setField(term729988, term729988.getClass(), "propListHead", null);
        setIntField(term729988, term729988.getClass(), "sourcePosition", 0);
        setField(term729988, term729988.getClass(), "jsType", null);
        setField(term729988, term729988.getClass(), "parent", null);
        setField(term729986, term729986.getClass(), "first", term729988);
        setField(term729986, term729986.getClass(), "last", null);
        setField(term729986, term729986.getClass(), "propListHead", null);
        setIntField(term729986, term729986.getClass(), "sourcePosition", 0);
        setField(term729986, term729986.getClass(), "jsType", null);
        setField(term729986, term729986.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term729459;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term729367, args);
        assertTrue(recursiveEquals(term729367, term730063));
        assertTrue(recursiveEquals(term729459, term730064));
        assertTrue(recursiveEquals(retValue, term729986));
    }

};


