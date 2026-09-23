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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714933;
     Object term715025;
     Object term715253;
     Object term715254;
     Object term715208;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term714933 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term715025 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term715111 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term715181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term715111, term715111.getClass(), "next", term715181);
        setField(term715025, term715025.getClass(), "first", term715111);
        setIntField(term715025, term715025.getClass(), "type", 23);
        term715253 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term715253, term715253.getClass(), "currentTraversal", null);
        term715254 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term715255 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term715256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term715254, term715254.getClass(), "number", 0.0);
        setIntField(term715254, term715254.getClass(), "type", 23);
        setField(term715254, term715254.getClass(), "next", null);
        setField(term715255, term715255.getClass(), "functionName", null);
        setBooleanField(term715255, term715255.getClass(), "itsNeedsActivation", false);
        setIntField(term715255, term715255.getClass(), "itsFunctionType", 0);
        setBooleanField(term715255, term715255.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term715255, term715255.getClass(), "encodedSourceStart", 0);
        setIntField(term715255, term715255.getClass(), "encodedSourceEnd", 0);
        setField(term715255, term715255.getClass(), "sourceName", null);
        setIntField(term715255, term715255.getClass(), "baseLineno", 0);
        setIntField(term715255, term715255.getClass(), "endLineno", 0);
        setField(term715255, term715255.getClass(), "functions", null);
        setField(term715255, term715255.getClass(), "regexps", null);
        setField(term715255, term715255.getClass(), "itsVariables", null);
        setField(term715255, term715255.getClass(), "itsConst", null);
        setField(term715255, term715255.getClass(), "itsVariableNames", null);
        setIntField(term715255, term715255.getClass(), "varStart", 0);
        setField(term715255, term715255.getClass(), "compilerData", null);
        setIntField(term715255, term715255.getClass(), "type", 0);
        setIntField(term715256, term715256.getClass(), "type", 0);
        setField(term715256, term715256.getClass(), "next", null);
        setField(term715256, term715256.getClass(), "first", null);
        setField(term715256, term715256.getClass(), "last", null);
        setField(term715256, term715256.getClass(), "propListHead", null);
        setIntField(term715256, term715256.getClass(), "sourcePosition", 0);
        setField(term715256, term715256.getClass(), "jsType", null);
        setField(term715256, term715256.getClass(), "parent", null);
        setField(term715255, term715255.getClass(), "next", term715256);
        setField(term715255, term715255.getClass(), "first", null);
        setField(term715255, term715255.getClass(), "last", null);
        setField(term715255, term715255.getClass(), "propListHead", null);
        setIntField(term715255, term715255.getClass(), "sourcePosition", 0);
        setField(term715255, term715255.getClass(), "jsType", null);
        setField(term715255, term715255.getClass(), "parent", null);
        setField(term715254, term715254.getClass(), "first", term715255);
        setField(term715254, term715254.getClass(), "last", null);
        setField(term715254, term715254.getClass(), "propListHead", null);
        setIntField(term715254, term715254.getClass(), "sourcePosition", 0);
        setField(term715254, term715254.getClass(), "jsType", null);
        setField(term715254, term715254.getClass(), "parent", null);
        term715208 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term715211 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term715221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term715208, term715208.getClass(), "number", 0.0);
        setIntField(term715208, term715208.getClass(), "type", 23);
        setField(term715208, term715208.getClass(), "next", null);
        setField(term715211, term715211.getClass(), "functionName", null);
        setBooleanField(term715211, term715211.getClass(), "itsNeedsActivation", false);
        setIntField(term715211, term715211.getClass(), "itsFunctionType", 0);
        setBooleanField(term715211, term715211.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term715211, term715211.getClass(), "encodedSourceStart", 0);
        setIntField(term715211, term715211.getClass(), "encodedSourceEnd", 0);
        setField(term715211, term715211.getClass(), "sourceName", null);
        setIntField(term715211, term715211.getClass(), "baseLineno", 0);
        setIntField(term715211, term715211.getClass(), "endLineno", 0);
        setField(term715211, term715211.getClass(), "functions", null);
        setField(term715211, term715211.getClass(), "regexps", null);
        setField(term715211, term715211.getClass(), "itsVariables", null);
        setField(term715211, term715211.getClass(), "itsConst", null);
        setField(term715211, term715211.getClass(), "itsVariableNames", null);
        setIntField(term715211, term715211.getClass(), "varStart", 0);
        setField(term715211, term715211.getClass(), "compilerData", null);
        setIntField(term715211, term715211.getClass(), "type", 0);
        setIntField(term715221, term715221.getClass(), "type", 0);
        setField(term715221, term715221.getClass(), "next", null);
        setField(term715221, term715221.getClass(), "first", null);
        setField(term715221, term715221.getClass(), "last", null);
        setField(term715221, term715221.getClass(), "propListHead", null);
        setIntField(term715221, term715221.getClass(), "sourcePosition", 0);
        setField(term715221, term715221.getClass(), "jsType", null);
        setField(term715221, term715221.getClass(), "parent", null);
        setField(term715211, term715211.getClass(), "next", term715221);
        setField(term715211, term715211.getClass(), "first", null);
        setField(term715211, term715211.getClass(), "last", null);
        setField(term715211, term715211.getClass(), "propListHead", null);
        setIntField(term715211, term715211.getClass(), "sourcePosition", 0);
        setField(term715211, term715211.getClass(), "jsType", null);
        setField(term715211, term715211.getClass(), "parent", null);
        setField(term715208, term715208.getClass(), "first", term715211);
        setField(term715208, term715208.getClass(), "last", null);
        setField(term715208, term715208.getClass(), "propListHead", null);
        setIntField(term715208, term715208.getClass(), "sourcePosition", 0);
        setField(term715208, term715208.getClass(), "jsType", null);
        setField(term715208, term715208.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term715025;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term714933, args);
        assertTrue(recursiveEquals(term714933, term715253));
        assertTrue(recursiveEquals(term715025, term715254));
        assertTrue(recursiveEquals(retValue, term715208));
    }

};


