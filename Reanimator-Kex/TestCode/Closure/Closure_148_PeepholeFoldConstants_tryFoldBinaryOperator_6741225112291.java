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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630013;
     Object term630105;
     Object term631164;
     Object term631165;
     Object term631119;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term630013 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term630105 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term630191 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term630283 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term630191, term630191.getClass(), "next", term630283);
        setIntField(term630191, term630191.getClass(), "type", 39);
        setField(term630105, term630105.getClass(), "first", term630191);
        setIntField(term630105, term630105.getClass(), "type", 22);
        term631164 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term631164, term631164.getClass(), "currentTraversal", null);
        term631165 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term631166 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term631167 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term631165, term631165.getClass(), "str", null);
        setIntField(term631165, term631165.getClass(), "type", 22);
        setField(term631165, term631165.getClass(), "next", null);
        setField(term631166, term631166.getClass(), "functionName", null);
        setBooleanField(term631166, term631166.getClass(), "itsNeedsActivation", false);
        setIntField(term631166, term631166.getClass(), "itsFunctionType", 0);
        setBooleanField(term631166, term631166.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term631166, term631166.getClass(), "encodedSourceStart", 0);
        setIntField(term631166, term631166.getClass(), "encodedSourceEnd", 0);
        setField(term631166, term631166.getClass(), "sourceName", null);
        setIntField(term631166, term631166.getClass(), "baseLineno", 0);
        setIntField(term631166, term631166.getClass(), "endLineno", 0);
        setField(term631166, term631166.getClass(), "functions", null);
        setField(term631166, term631166.getClass(), "regexps", null);
        setField(term631166, term631166.getClass(), "itsVariables", null);
        setField(term631166, term631166.getClass(), "itsConst", null);
        setField(term631166, term631166.getClass(), "itsVariableNames", null);
        setIntField(term631166, term631166.getClass(), "varStart", 0);
        setField(term631166, term631166.getClass(), "compilerData", null);
        setIntField(term631166, term631166.getClass(), "type", 39);
        setField(term631167, term631167.getClass(), "str", null);
        setIntField(term631167, term631167.getClass(), "type", 0);
        setField(term631167, term631167.getClass(), "next", null);
        setField(term631167, term631167.getClass(), "first", null);
        setField(term631167, term631167.getClass(), "last", null);
        setField(term631167, term631167.getClass(), "propListHead", null);
        setIntField(term631167, term631167.getClass(), "sourcePosition", 0);
        setField(term631167, term631167.getClass(), "jsType", null);
        setField(term631167, term631167.getClass(), "parent", null);
        setField(term631166, term631166.getClass(), "next", term631167);
        setField(term631166, term631166.getClass(), "first", null);
        setField(term631166, term631166.getClass(), "last", null);
        setField(term631166, term631166.getClass(), "propListHead", null);
        setIntField(term631166, term631166.getClass(), "sourcePosition", 0);
        setField(term631166, term631166.getClass(), "jsType", null);
        setField(term631166, term631166.getClass(), "parent", null);
        setField(term631165, term631165.getClass(), "first", term631166);
        setField(term631165, term631165.getClass(), "last", null);
        setField(term631165, term631165.getClass(), "propListHead", null);
        setIntField(term631165, term631165.getClass(), "sourcePosition", 0);
        setField(term631165, term631165.getClass(), "jsType", null);
        setField(term631165, term631165.getClass(), "parent", null);
        term631119 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term631121 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term631131 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term631119, term631119.getClass(), "str", null);
        setIntField(term631119, term631119.getClass(), "type", 22);
        setField(term631119, term631119.getClass(), "next", null);
        setField(term631121, term631121.getClass(), "functionName", null);
        setBooleanField(term631121, term631121.getClass(), "itsNeedsActivation", false);
        setIntField(term631121, term631121.getClass(), "itsFunctionType", 0);
        setBooleanField(term631121, term631121.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term631121, term631121.getClass(), "encodedSourceStart", 0);
        setIntField(term631121, term631121.getClass(), "encodedSourceEnd", 0);
        setField(term631121, term631121.getClass(), "sourceName", null);
        setIntField(term631121, term631121.getClass(), "baseLineno", 0);
        setIntField(term631121, term631121.getClass(), "endLineno", 0);
        setField(term631121, term631121.getClass(), "functions", null);
        setField(term631121, term631121.getClass(), "regexps", null);
        setField(term631121, term631121.getClass(), "itsVariables", null);
        setField(term631121, term631121.getClass(), "itsConst", null);
        setField(term631121, term631121.getClass(), "itsVariableNames", null);
        setIntField(term631121, term631121.getClass(), "varStart", 0);
        setField(term631121, term631121.getClass(), "compilerData", null);
        setIntField(term631121, term631121.getClass(), "type", 39);
        setField(term631131, term631131.getClass(), "str", null);
        setIntField(term631131, term631131.getClass(), "type", 0);
        setField(term631131, term631131.getClass(), "next", null);
        setField(term631131, term631131.getClass(), "first", null);
        setField(term631131, term631131.getClass(), "last", null);
        setField(term631131, term631131.getClass(), "propListHead", null);
        setIntField(term631131, term631131.getClass(), "sourcePosition", 0);
        setField(term631131, term631131.getClass(), "jsType", null);
        setField(term631131, term631131.getClass(), "parent", null);
        setField(term631121, term631121.getClass(), "next", term631131);
        setField(term631121, term631121.getClass(), "first", null);
        setField(term631121, term631121.getClass(), "last", null);
        setField(term631121, term631121.getClass(), "propListHead", null);
        setIntField(term631121, term631121.getClass(), "sourcePosition", 0);
        setField(term631121, term631121.getClass(), "jsType", null);
        setField(term631121, term631121.getClass(), "parent", null);
        setField(term631119, term631119.getClass(), "first", term631121);
        setField(term631119, term631119.getClass(), "last", null);
        setField(term631119, term631119.getClass(), "propListHead", null);
        setIntField(term631119, term631119.getClass(), "sourcePosition", 0);
        setField(term631119, term631119.getClass(), "jsType", null);
        setField(term631119, term631119.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term630105;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term630013, args);
        assertTrue(recursiveEquals(term630013, term631164));
        assertTrue(recursiveEquals(term630105, term631165));
        assertTrue(recursiveEquals(retValue, term631119));
    }

};


