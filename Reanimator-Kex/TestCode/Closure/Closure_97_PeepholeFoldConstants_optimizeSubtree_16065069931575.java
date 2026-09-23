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

public class PeepholeFoldConstants_optimizeSubtree_16065069931575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574605;
     Object term574695;
     Object term575297;
     Object term575298;
     Object term575238;

    public PeepholeFoldConstants_optimizeSubtree_16065069931575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term574605 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term574695 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term574785 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term574695, term574695.getClass(), "type", 32);
        setField(term574695, term574695.getClass(), "first", term574785);
        term575297 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term575297, term575297.getClass(), "currentTraversal", null);
        term575298 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term575299 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term575298, term575298.getClass(), "encodedSourceStart", 0);
        setIntField(term575298, term575298.getClass(), "encodedSourceEnd", 0);
        setField(term575298, term575298.getClass(), "sourceName", null);
        setIntField(term575298, term575298.getClass(), "baseLineno", 0);
        setIntField(term575298, term575298.getClass(), "endLineno", 0);
        setField(term575298, term575298.getClass(), "functions", null);
        setField(term575298, term575298.getClass(), "regexps", null);
        setField(term575298, term575298.getClass(), "itsVariables", null);
        setField(term575298, term575298.getClass(), "itsConst", null);
        setField(term575298, term575298.getClass(), "itsVariableNames", null);
        setIntField(term575298, term575298.getClass(), "varStart", 0);
        setField(term575298, term575298.getClass(), "compilerData", null);
        setIntField(term575298, term575298.getClass(), "type", 32);
        setField(term575298, term575298.getClass(), "next", null);
        setIntField(term575299, term575299.getClass(), "encodedSourceStart", 0);
        setIntField(term575299, term575299.getClass(), "encodedSourceEnd", 0);
        setField(term575299, term575299.getClass(), "sourceName", null);
        setIntField(term575299, term575299.getClass(), "baseLineno", 0);
        setIntField(term575299, term575299.getClass(), "endLineno", 0);
        setField(term575299, term575299.getClass(), "functions", null);
        setField(term575299, term575299.getClass(), "regexps", null);
        setField(term575299, term575299.getClass(), "itsVariables", null);
        setField(term575299, term575299.getClass(), "itsConst", null);
        setField(term575299, term575299.getClass(), "itsVariableNames", null);
        setIntField(term575299, term575299.getClass(), "varStart", 0);
        setField(term575299, term575299.getClass(), "compilerData", null);
        setIntField(term575299, term575299.getClass(), "type", 0);
        setField(term575299, term575299.getClass(), "next", null);
        setField(term575299, term575299.getClass(), "first", null);
        setField(term575299, term575299.getClass(), "last", null);
        setField(term575299, term575299.getClass(), "propListHead", null);
        setIntField(term575299, term575299.getClass(), "sourcePosition", 0);
        setField(term575299, term575299.getClass(), "jsType", null);
        setField(term575299, term575299.getClass(), "parent", null);
        setField(term575298, term575298.getClass(), "first", term575299);
        setField(term575298, term575298.getClass(), "last", null);
        setField(term575298, term575298.getClass(), "propListHead", null);
        setIntField(term575298, term575298.getClass(), "sourcePosition", 0);
        setField(term575298, term575298.getClass(), "jsType", null);
        setField(term575298, term575298.getClass(), "parent", null);
        term575238 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term575245 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term575238, term575238.getClass(), "encodedSourceStart", 0);
        setIntField(term575238, term575238.getClass(), "encodedSourceEnd", 0);
        setField(term575238, term575238.getClass(), "sourceName", null);
        setIntField(term575238, term575238.getClass(), "baseLineno", 0);
        setIntField(term575238, term575238.getClass(), "endLineno", 0);
        setField(term575238, term575238.getClass(), "functions", null);
        setField(term575238, term575238.getClass(), "regexps", null);
        setField(term575238, term575238.getClass(), "itsVariables", null);
        setField(term575238, term575238.getClass(), "itsConst", null);
        setField(term575238, term575238.getClass(), "itsVariableNames", null);
        setIntField(term575238, term575238.getClass(), "varStart", 0);
        setField(term575238, term575238.getClass(), "compilerData", null);
        setIntField(term575238, term575238.getClass(), "type", 32);
        setField(term575238, term575238.getClass(), "next", null);
        setIntField(term575245, term575245.getClass(), "encodedSourceStart", 0);
        setIntField(term575245, term575245.getClass(), "encodedSourceEnd", 0);
        setField(term575245, term575245.getClass(), "sourceName", null);
        setIntField(term575245, term575245.getClass(), "baseLineno", 0);
        setIntField(term575245, term575245.getClass(), "endLineno", 0);
        setField(term575245, term575245.getClass(), "functions", null);
        setField(term575245, term575245.getClass(), "regexps", null);
        setField(term575245, term575245.getClass(), "itsVariables", null);
        setField(term575245, term575245.getClass(), "itsConst", null);
        setField(term575245, term575245.getClass(), "itsVariableNames", null);
        setIntField(term575245, term575245.getClass(), "varStart", 0);
        setField(term575245, term575245.getClass(), "compilerData", null);
        setIntField(term575245, term575245.getClass(), "type", 0);
        setField(term575245, term575245.getClass(), "next", null);
        setField(term575245, term575245.getClass(), "first", null);
        setField(term575245, term575245.getClass(), "last", null);
        setField(term575245, term575245.getClass(), "propListHead", null);
        setIntField(term575245, term575245.getClass(), "sourcePosition", 0);
        setField(term575245, term575245.getClass(), "jsType", null);
        setField(term575245, term575245.getClass(), "parent", null);
        setField(term575238, term575238.getClass(), "first", term575245);
        setField(term575238, term575238.getClass(), "last", null);
        setField(term575238, term575238.getClass(), "propListHead", null);
        setIntField(term575238, term575238.getClass(), "sourcePosition", 0);
        setField(term575238, term575238.getClass(), "jsType", null);
        setField(term575238, term575238.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term574695;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term574605, args);
        assertTrue(recursiveEquals(term574605, term575297));
        assertTrue(recursiveEquals(term574695, term575298));
        assertTrue(recursiveEquals(retValue, term575238));
    }

};


