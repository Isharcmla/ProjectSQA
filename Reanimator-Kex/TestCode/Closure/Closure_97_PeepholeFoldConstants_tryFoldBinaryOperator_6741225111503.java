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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term556211;
     Object term556303;
     Object term556897;
     Object term556898;
     Object term556845;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term556211 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term556303 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term556389 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term556459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term556389, term556389.getClass(), "next", term556459);
        setField(term556303, term556303.getClass(), "first", term556389);
        setIntField(term556303, term556303.getClass(), "type", 52);
        term556897 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term556897, term556897.getClass(), "currentTraversal", null);
        term556898 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term556899 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term556900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term556898, term556898.getClass(), "number", 0.0);
        setIntField(term556898, term556898.getClass(), "type", 52);
        setField(term556898, term556898.getClass(), "next", null);
        setField(term556899, term556899.getClass(), "functionName", null);
        setBooleanField(term556899, term556899.getClass(), "itsNeedsActivation", false);
        setIntField(term556899, term556899.getClass(), "itsFunctionType", 0);
        setBooleanField(term556899, term556899.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term556899, term556899.getClass(), "encodedSourceStart", 0);
        setIntField(term556899, term556899.getClass(), "encodedSourceEnd", 0);
        setField(term556899, term556899.getClass(), "sourceName", null);
        setIntField(term556899, term556899.getClass(), "baseLineno", 0);
        setIntField(term556899, term556899.getClass(), "endLineno", 0);
        setField(term556899, term556899.getClass(), "functions", null);
        setField(term556899, term556899.getClass(), "regexps", null);
        setField(term556899, term556899.getClass(), "itsVariables", null);
        setField(term556899, term556899.getClass(), "itsConst", null);
        setField(term556899, term556899.getClass(), "itsVariableNames", null);
        setIntField(term556899, term556899.getClass(), "varStart", 0);
        setField(term556899, term556899.getClass(), "compilerData", null);
        setIntField(term556899, term556899.getClass(), "type", 0);
        setIntField(term556900, term556900.getClass(), "type", 0);
        setField(term556900, term556900.getClass(), "next", null);
        setField(term556900, term556900.getClass(), "first", null);
        setField(term556900, term556900.getClass(), "last", null);
        setField(term556900, term556900.getClass(), "propListHead", null);
        setIntField(term556900, term556900.getClass(), "sourcePosition", 0);
        setField(term556900, term556900.getClass(), "jsType", null);
        setField(term556900, term556900.getClass(), "parent", null);
        setField(term556899, term556899.getClass(), "next", term556900);
        setField(term556899, term556899.getClass(), "first", null);
        setField(term556899, term556899.getClass(), "last", null);
        setField(term556899, term556899.getClass(), "propListHead", null);
        setIntField(term556899, term556899.getClass(), "sourcePosition", 0);
        setField(term556899, term556899.getClass(), "jsType", null);
        setField(term556899, term556899.getClass(), "parent", null);
        setField(term556898, term556898.getClass(), "first", term556899);
        setField(term556898, term556898.getClass(), "last", null);
        setField(term556898, term556898.getClass(), "propListHead", null);
        setIntField(term556898, term556898.getClass(), "sourcePosition", 0);
        setField(term556898, term556898.getClass(), "jsType", null);
        setField(term556898, term556898.getClass(), "parent", null);
        term556845 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term556848 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term556858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term556845, term556845.getClass(), "number", 0.0);
        setIntField(term556845, term556845.getClass(), "type", 52);
        setField(term556845, term556845.getClass(), "next", null);
        setField(term556848, term556848.getClass(), "functionName", null);
        setBooleanField(term556848, term556848.getClass(), "itsNeedsActivation", false);
        setIntField(term556848, term556848.getClass(), "itsFunctionType", 0);
        setBooleanField(term556848, term556848.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term556848, term556848.getClass(), "encodedSourceStart", 0);
        setIntField(term556848, term556848.getClass(), "encodedSourceEnd", 0);
        setField(term556848, term556848.getClass(), "sourceName", null);
        setIntField(term556848, term556848.getClass(), "baseLineno", 0);
        setIntField(term556848, term556848.getClass(), "endLineno", 0);
        setField(term556848, term556848.getClass(), "functions", null);
        setField(term556848, term556848.getClass(), "regexps", null);
        setField(term556848, term556848.getClass(), "itsVariables", null);
        setField(term556848, term556848.getClass(), "itsConst", null);
        setField(term556848, term556848.getClass(), "itsVariableNames", null);
        setIntField(term556848, term556848.getClass(), "varStart", 0);
        setField(term556848, term556848.getClass(), "compilerData", null);
        setIntField(term556848, term556848.getClass(), "type", 0);
        setIntField(term556858, term556858.getClass(), "type", 0);
        setField(term556858, term556858.getClass(), "next", null);
        setField(term556858, term556858.getClass(), "first", null);
        setField(term556858, term556858.getClass(), "last", null);
        setField(term556858, term556858.getClass(), "propListHead", null);
        setIntField(term556858, term556858.getClass(), "sourcePosition", 0);
        setField(term556858, term556858.getClass(), "jsType", null);
        setField(term556858, term556858.getClass(), "parent", null);
        setField(term556848, term556848.getClass(), "next", term556858);
        setField(term556848, term556848.getClass(), "first", null);
        setField(term556848, term556848.getClass(), "last", null);
        setField(term556848, term556848.getClass(), "propListHead", null);
        setIntField(term556848, term556848.getClass(), "sourcePosition", 0);
        setField(term556848, term556848.getClass(), "jsType", null);
        setField(term556848, term556848.getClass(), "parent", null);
        setField(term556845, term556845.getClass(), "first", term556848);
        setField(term556845, term556845.getClass(), "last", null);
        setField(term556845, term556845.getClass(), "propListHead", null);
        setIntField(term556845, term556845.getClass(), "sourcePosition", 0);
        setField(term556845, term556845.getClass(), "jsType", null);
        setField(term556845, term556845.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term556303;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term556211, args);
        assertTrue(recursiveEquals(term556211, term556897));
        assertTrue(recursiveEquals(term556303, term556898));
        assertTrue(recursiveEquals(retValue, term556845));
    }

};


