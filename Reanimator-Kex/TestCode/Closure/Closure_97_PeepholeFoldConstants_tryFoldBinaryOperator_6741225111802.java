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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700658;
     Object term700750;
     Object term700981;
     Object term700982;
     Object term700921;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term700658 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term700750 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term700836 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term700906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term700836, term700836.getClass(), "next", term700906);
        setField(term700750, term700750.getClass(), "first", term700836);
        setIntField(term700750, term700750.getClass(), "type", 14);
        term700981 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term700981, term700981.getClass(), "currentTraversal", null);
        term700982 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term700983 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term700984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term700982, term700982.getClass(), "str", null);
        setIntField(term700982, term700982.getClass(), "type", 14);
        setField(term700982, term700982.getClass(), "next", null);
        setField(term700983, term700983.getClass(), "functionName", null);
        setBooleanField(term700983, term700983.getClass(), "itsNeedsActivation", false);
        setIntField(term700983, term700983.getClass(), "itsFunctionType", 0);
        setBooleanField(term700983, term700983.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term700983, term700983.getClass(), "encodedSourceStart", 0);
        setIntField(term700983, term700983.getClass(), "encodedSourceEnd", 0);
        setField(term700983, term700983.getClass(), "sourceName", null);
        setIntField(term700983, term700983.getClass(), "baseLineno", 0);
        setIntField(term700983, term700983.getClass(), "endLineno", 0);
        setField(term700983, term700983.getClass(), "functions", null);
        setField(term700983, term700983.getClass(), "regexps", null);
        setField(term700983, term700983.getClass(), "itsVariables", null);
        setField(term700983, term700983.getClass(), "itsConst", null);
        setField(term700983, term700983.getClass(), "itsVariableNames", null);
        setIntField(term700983, term700983.getClass(), "varStart", 0);
        setField(term700983, term700983.getClass(), "compilerData", null);
        setIntField(term700983, term700983.getClass(), "type", 0);
        setIntField(term700984, term700984.getClass(), "type", 0);
        setField(term700984, term700984.getClass(), "next", null);
        setField(term700984, term700984.getClass(), "first", null);
        setField(term700984, term700984.getClass(), "last", null);
        setField(term700984, term700984.getClass(), "propListHead", null);
        setIntField(term700984, term700984.getClass(), "sourcePosition", 0);
        setField(term700984, term700984.getClass(), "jsType", null);
        setField(term700984, term700984.getClass(), "parent", null);
        setField(term700983, term700983.getClass(), "next", term700984);
        setField(term700983, term700983.getClass(), "first", null);
        setField(term700983, term700983.getClass(), "last", null);
        setField(term700983, term700983.getClass(), "propListHead", null);
        setIntField(term700983, term700983.getClass(), "sourcePosition", 0);
        setField(term700983, term700983.getClass(), "jsType", null);
        setField(term700983, term700983.getClass(), "parent", null);
        setField(term700982, term700982.getClass(), "first", term700983);
        setField(term700982, term700982.getClass(), "last", null);
        setField(term700982, term700982.getClass(), "propListHead", null);
        setIntField(term700982, term700982.getClass(), "sourcePosition", 0);
        setField(term700982, term700982.getClass(), "jsType", null);
        setField(term700982, term700982.getClass(), "parent", null);
        term700921 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term700923 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term700933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term700921, term700921.getClass(), "str", null);
        setIntField(term700921, term700921.getClass(), "type", 14);
        setField(term700921, term700921.getClass(), "next", null);
        setField(term700923, term700923.getClass(), "functionName", null);
        setBooleanField(term700923, term700923.getClass(), "itsNeedsActivation", false);
        setIntField(term700923, term700923.getClass(), "itsFunctionType", 0);
        setBooleanField(term700923, term700923.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term700923, term700923.getClass(), "encodedSourceStart", 0);
        setIntField(term700923, term700923.getClass(), "encodedSourceEnd", 0);
        setField(term700923, term700923.getClass(), "sourceName", null);
        setIntField(term700923, term700923.getClass(), "baseLineno", 0);
        setIntField(term700923, term700923.getClass(), "endLineno", 0);
        setField(term700923, term700923.getClass(), "functions", null);
        setField(term700923, term700923.getClass(), "regexps", null);
        setField(term700923, term700923.getClass(), "itsVariables", null);
        setField(term700923, term700923.getClass(), "itsConst", null);
        setField(term700923, term700923.getClass(), "itsVariableNames", null);
        setIntField(term700923, term700923.getClass(), "varStart", 0);
        setField(term700923, term700923.getClass(), "compilerData", null);
        setIntField(term700923, term700923.getClass(), "type", 0);
        setIntField(term700933, term700933.getClass(), "type", 0);
        setField(term700933, term700933.getClass(), "next", null);
        setField(term700933, term700933.getClass(), "first", null);
        setField(term700933, term700933.getClass(), "last", null);
        setField(term700933, term700933.getClass(), "propListHead", null);
        setIntField(term700933, term700933.getClass(), "sourcePosition", 0);
        setField(term700933, term700933.getClass(), "jsType", null);
        setField(term700933, term700933.getClass(), "parent", null);
        setField(term700923, term700923.getClass(), "next", term700933);
        setField(term700923, term700923.getClass(), "first", null);
        setField(term700923, term700923.getClass(), "last", null);
        setField(term700923, term700923.getClass(), "propListHead", null);
        setIntField(term700923, term700923.getClass(), "sourcePosition", 0);
        setField(term700923, term700923.getClass(), "jsType", null);
        setField(term700923, term700923.getClass(), "parent", null);
        setField(term700921, term700921.getClass(), "first", term700923);
        setField(term700921, term700921.getClass(), "last", null);
        setField(term700921, term700921.getClass(), "propListHead", null);
        setIntField(term700921, term700921.getClass(), "sourcePosition", 0);
        setField(term700921, term700921.getClass(), "jsType", null);
        setField(term700921, term700921.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term700750;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term700658, args);
        assertTrue(recursiveEquals(term700658, term700981));
        assertTrue(recursiveEquals(term700750, term700982));
        assertTrue(recursiveEquals(retValue, term700921));
    }

};


