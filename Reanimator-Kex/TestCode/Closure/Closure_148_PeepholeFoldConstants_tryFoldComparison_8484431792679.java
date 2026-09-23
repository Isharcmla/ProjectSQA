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

public class PeepholeFoldConstants_tryFoldComparison_8484431792679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term766150;
     Object term766236;
     Object term766322;
     Object term766414;
     Object term766917;
     Object term766918;
     Object term766919;
     Object term766920;
     Object term766889;

    public PeepholeFoldConstants_tryFoldComparison_8484431792679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term766150 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term766236 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term766236, term766236.getClass(), "type", 16);
        term766322 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term766322, term766322.getClass(), "type", 42);
        term766414 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term766414, term766414.getClass(), "type", 42);
        term766917 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term766917, term766917.getClass(), "currentTraversal", null);
        term766918 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term766918, term766918.getClass(), "functionName", null);
        setBooleanField(term766918, term766918.getClass(), "itsNeedsActivation", false);
        setIntField(term766918, term766918.getClass(), "itsFunctionType", 0);
        setBooleanField(term766918, term766918.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term766918, term766918.getClass(), "encodedSourceStart", 0);
        setIntField(term766918, term766918.getClass(), "encodedSourceEnd", 0);
        setField(term766918, term766918.getClass(), "sourceName", null);
        setIntField(term766918, term766918.getClass(), "baseLineno", 0);
        setIntField(term766918, term766918.getClass(), "endLineno", 0);
        setField(term766918, term766918.getClass(), "functions", null);
        setField(term766918, term766918.getClass(), "regexps", null);
        setField(term766918, term766918.getClass(), "itsVariables", null);
        setField(term766918, term766918.getClass(), "itsConst", null);
        setField(term766918, term766918.getClass(), "itsVariableNames", null);
        setIntField(term766918, term766918.getClass(), "varStart", 0);
        setField(term766918, term766918.getClass(), "compilerData", null);
        setIntField(term766918, term766918.getClass(), "type", 42);
        setField(term766918, term766918.getClass(), "next", null);
        setField(term766918, term766918.getClass(), "first", null);
        setField(term766918, term766918.getClass(), "last", null);
        setField(term766918, term766918.getClass(), "propListHead", null);
        setIntField(term766918, term766918.getClass(), "sourcePosition", 0);
        setField(term766918, term766918.getClass(), "jsType", null);
        setField(term766918, term766918.getClass(), "parent", null);
        term766919 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term766919, term766919.getClass(), "functionName", null);
        setBooleanField(term766919, term766919.getClass(), "itsNeedsActivation", false);
        setIntField(term766919, term766919.getClass(), "itsFunctionType", 0);
        setBooleanField(term766919, term766919.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term766919, term766919.getClass(), "encodedSourceStart", 0);
        setIntField(term766919, term766919.getClass(), "encodedSourceEnd", 0);
        setField(term766919, term766919.getClass(), "sourceName", null);
        setIntField(term766919, term766919.getClass(), "baseLineno", 0);
        setIntField(term766919, term766919.getClass(), "endLineno", 0);
        setField(term766919, term766919.getClass(), "functions", null);
        setField(term766919, term766919.getClass(), "regexps", null);
        setField(term766919, term766919.getClass(), "itsVariables", null);
        setField(term766919, term766919.getClass(), "itsConst", null);
        setField(term766919, term766919.getClass(), "itsVariableNames", null);
        setIntField(term766919, term766919.getClass(), "varStart", 0);
        setField(term766919, term766919.getClass(), "compilerData", null);
        setIntField(term766919, term766919.getClass(), "type", 16);
        setField(term766919, term766919.getClass(), "next", null);
        setField(term766919, term766919.getClass(), "first", null);
        setField(term766919, term766919.getClass(), "last", null);
        setField(term766919, term766919.getClass(), "propListHead", null);
        setIntField(term766919, term766919.getClass(), "sourcePosition", 0);
        setField(term766919, term766919.getClass(), "jsType", null);
        setField(term766919, term766919.getClass(), "parent", null);
        term766920 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term766920, term766920.getClass(), "str", null);
        setIntField(term766920, term766920.getClass(), "type", 42);
        setField(term766920, term766920.getClass(), "next", null);
        setField(term766920, term766920.getClass(), "first", null);
        setField(term766920, term766920.getClass(), "last", null);
        setField(term766920, term766920.getClass(), "propListHead", null);
        setIntField(term766920, term766920.getClass(), "sourcePosition", 0);
        setField(term766920, term766920.getClass(), "jsType", null);
        setField(term766920, term766920.getClass(), "parent", null);
        term766889 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term766889, term766889.getClass(), "functionName", null);
        setBooleanField(term766889, term766889.getClass(), "itsNeedsActivation", false);
        setIntField(term766889, term766889.getClass(), "itsFunctionType", 0);
        setBooleanField(term766889, term766889.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term766889, term766889.getClass(), "encodedSourceStart", 0);
        setIntField(term766889, term766889.getClass(), "encodedSourceEnd", 0);
        setField(term766889, term766889.getClass(), "sourceName", null);
        setIntField(term766889, term766889.getClass(), "baseLineno", 0);
        setIntField(term766889, term766889.getClass(), "endLineno", 0);
        setField(term766889, term766889.getClass(), "functions", null);
        setField(term766889, term766889.getClass(), "regexps", null);
        setField(term766889, term766889.getClass(), "itsVariables", null);
        setField(term766889, term766889.getClass(), "itsConst", null);
        setField(term766889, term766889.getClass(), "itsVariableNames", null);
        setIntField(term766889, term766889.getClass(), "varStart", 0);
        setField(term766889, term766889.getClass(), "compilerData", null);
        setIntField(term766889, term766889.getClass(), "type", 16);
        setField(term766889, term766889.getClass(), "next", null);
        setField(term766889, term766889.getClass(), "first", null);
        setField(term766889, term766889.getClass(), "last", null);
        setField(term766889, term766889.getClass(), "propListHead", null);
        setIntField(term766889, term766889.getClass(), "sourcePosition", 0);
        setField(term766889, term766889.getClass(), "jsType", null);
        setField(term766889, term766889.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term766236;
        args[1] = term766322;
        args[2] = term766414;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term766150, args);
        assertTrue(recursiveEquals(term766150, term766917));
        assertTrue(recursiveEquals(term766236, term766918));
        assertTrue(recursiveEquals(term766322, term766919));
        assertTrue(recursiveEquals(term766414, term766920));
        assertTrue(recursiveEquals(retValue, term766889));
    }

};


