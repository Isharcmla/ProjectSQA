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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term554093;
     Object term554185;
     Object term554874;
     Object term554875;
     Object term554811;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term554093 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term554185 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term554275 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term554367 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term554275, term554275.getClass(), "next", term554367);
        setIntField(term554275, term554275.getClass(), "type", 0);
        setField(term554185, term554185.getClass(), "first", term554275);
        setIntField(term554185, term554185.getClass(), "type", 101);
        setField(term554185, term554185.getClass(), "parent", null);
        term554874 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term554874, term554874.getClass(), "currentTraversal", null);
        term554875 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term554876 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term554877 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term554875, term554875.getClass(), "str", null);
        setIntField(term554875, term554875.getClass(), "type", 101);
        setField(term554875, term554875.getClass(), "next", null);
        setIntField(term554876, term554876.getClass(), "encodedSourceStart", 0);
        setIntField(term554876, term554876.getClass(), "encodedSourceEnd", 0);
        setField(term554876, term554876.getClass(), "sourceName", null);
        setIntField(term554876, term554876.getClass(), "baseLineno", 0);
        setIntField(term554876, term554876.getClass(), "endLineno", 0);
        setField(term554876, term554876.getClass(), "functions", null);
        setField(term554876, term554876.getClass(), "regexps", null);
        setField(term554876, term554876.getClass(), "itsVariables", null);
        setField(term554876, term554876.getClass(), "itsConst", null);
        setField(term554876, term554876.getClass(), "itsVariableNames", null);
        setIntField(term554876, term554876.getClass(), "varStart", 0);
        setField(term554876, term554876.getClass(), "compilerData", null);
        setIntField(term554876, term554876.getClass(), "type", 0);
        setField(term554877, term554877.getClass(), "str", null);
        setIntField(term554877, term554877.getClass(), "type", 0);
        setField(term554877, term554877.getClass(), "next", null);
        setField(term554877, term554877.getClass(), "first", null);
        setField(term554877, term554877.getClass(), "last", null);
        setField(term554877, term554877.getClass(), "propListHead", null);
        setIntField(term554877, term554877.getClass(), "sourcePosition", 0);
        setField(term554877, term554877.getClass(), "jsType", null);
        setField(term554877, term554877.getClass(), "parent", null);
        setField(term554876, term554876.getClass(), "next", term554877);
        setField(term554876, term554876.getClass(), "first", null);
        setField(term554876, term554876.getClass(), "last", null);
        setField(term554876, term554876.getClass(), "propListHead", null);
        setIntField(term554876, term554876.getClass(), "sourcePosition", 0);
        setField(term554876, term554876.getClass(), "jsType", null);
        setField(term554876, term554876.getClass(), "parent", null);
        setField(term554875, term554875.getClass(), "first", term554876);
        setField(term554875, term554875.getClass(), "last", null);
        setField(term554875, term554875.getClass(), "propListHead", null);
        setIntField(term554875, term554875.getClass(), "sourcePosition", 0);
        setField(term554875, term554875.getClass(), "jsType", null);
        setField(term554875, term554875.getClass(), "parent", null);
        term554811 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term554813 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term554820 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term554811, term554811.getClass(), "str", null);
        setIntField(term554811, term554811.getClass(), "type", 101);
        setField(term554811, term554811.getClass(), "next", null);
        setIntField(term554813, term554813.getClass(), "encodedSourceStart", 0);
        setIntField(term554813, term554813.getClass(), "encodedSourceEnd", 0);
        setField(term554813, term554813.getClass(), "sourceName", null);
        setIntField(term554813, term554813.getClass(), "baseLineno", 0);
        setIntField(term554813, term554813.getClass(), "endLineno", 0);
        setField(term554813, term554813.getClass(), "functions", null);
        setField(term554813, term554813.getClass(), "regexps", null);
        setField(term554813, term554813.getClass(), "itsVariables", null);
        setField(term554813, term554813.getClass(), "itsConst", null);
        setField(term554813, term554813.getClass(), "itsVariableNames", null);
        setIntField(term554813, term554813.getClass(), "varStart", 0);
        setField(term554813, term554813.getClass(), "compilerData", null);
        setIntField(term554813, term554813.getClass(), "type", 0);
        setField(term554820, term554820.getClass(), "str", null);
        setIntField(term554820, term554820.getClass(), "type", 0);
        setField(term554820, term554820.getClass(), "next", null);
        setField(term554820, term554820.getClass(), "first", null);
        setField(term554820, term554820.getClass(), "last", null);
        setField(term554820, term554820.getClass(), "propListHead", null);
        setIntField(term554820, term554820.getClass(), "sourcePosition", 0);
        setField(term554820, term554820.getClass(), "jsType", null);
        setField(term554820, term554820.getClass(), "parent", null);
        setField(term554813, term554813.getClass(), "next", term554820);
        setField(term554813, term554813.getClass(), "first", null);
        setField(term554813, term554813.getClass(), "last", null);
        setField(term554813, term554813.getClass(), "propListHead", null);
        setIntField(term554813, term554813.getClass(), "sourcePosition", 0);
        setField(term554813, term554813.getClass(), "jsType", null);
        setField(term554813, term554813.getClass(), "parent", null);
        setField(term554811, term554811.getClass(), "first", term554813);
        setField(term554811, term554811.getClass(), "last", null);
        setField(term554811, term554811.getClass(), "propListHead", null);
        setIntField(term554811, term554811.getClass(), "sourcePosition", 0);
        setField(term554811, term554811.getClass(), "jsType", null);
        setField(term554811, term554811.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term554185;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term554093, args);
        assertTrue(recursiveEquals(term554093, term554874));
        assertTrue(recursiveEquals(term554185, term554875));
        assertTrue(recursiveEquals(retValue, term554811));
    }

};


