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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621067;
     Object term621159;
     Object term650303;
     Object term650304;
     Object term650256;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term621067 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term621159 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term621245 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term621315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term621245, term621245.getClass(), "next", term621315);
        setIntField(term621245, term621245.getClass(), "type", 39);
        setField(term621159, term621159.getClass(), "first", term621245);
        setIntField(term621159, term621159.getClass(), "type", 18);
        term650303 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term650303, term650303.getClass(), "currentTraversal", null);
        term650304 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term650305 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term650306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term650304, term650304.getClass(), "number", 0.0);
        setIntField(term650304, term650304.getClass(), "type", 18);
        setField(term650304, term650304.getClass(), "next", null);
        setField(term650305, term650305.getClass(), "functionName", null);
        setBooleanField(term650305, term650305.getClass(), "itsNeedsActivation", false);
        setIntField(term650305, term650305.getClass(), "itsFunctionType", 0);
        setBooleanField(term650305, term650305.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term650305, term650305.getClass(), "encodedSourceStart", 0);
        setIntField(term650305, term650305.getClass(), "encodedSourceEnd", 0);
        setField(term650305, term650305.getClass(), "sourceName", null);
        setIntField(term650305, term650305.getClass(), "baseLineno", 0);
        setIntField(term650305, term650305.getClass(), "endLineno", 0);
        setField(term650305, term650305.getClass(), "functions", null);
        setField(term650305, term650305.getClass(), "regexps", null);
        setField(term650305, term650305.getClass(), "itsVariables", null);
        setField(term650305, term650305.getClass(), "itsConst", null);
        setField(term650305, term650305.getClass(), "itsVariableNames", null);
        setIntField(term650305, term650305.getClass(), "varStart", 0);
        setField(term650305, term650305.getClass(), "compilerData", null);
        setIntField(term650305, term650305.getClass(), "type", 39);
        setIntField(term650306, term650306.getClass(), "type", 0);
        setField(term650306, term650306.getClass(), "next", null);
        setField(term650306, term650306.getClass(), "first", null);
        setField(term650306, term650306.getClass(), "last", null);
        setField(term650306, term650306.getClass(), "propListHead", null);
        setIntField(term650306, term650306.getClass(), "sourcePosition", 0);
        setField(term650306, term650306.getClass(), "jsType", null);
        setField(term650306, term650306.getClass(), "parent", null);
        setField(term650305, term650305.getClass(), "next", term650306);
        setField(term650305, term650305.getClass(), "first", null);
        setField(term650305, term650305.getClass(), "last", null);
        setField(term650305, term650305.getClass(), "propListHead", null);
        setIntField(term650305, term650305.getClass(), "sourcePosition", 0);
        setField(term650305, term650305.getClass(), "jsType", null);
        setField(term650305, term650305.getClass(), "parent", null);
        setField(term650304, term650304.getClass(), "first", term650305);
        setField(term650304, term650304.getClass(), "last", null);
        setField(term650304, term650304.getClass(), "propListHead", null);
        setIntField(term650304, term650304.getClass(), "sourcePosition", 0);
        setField(term650304, term650304.getClass(), "jsType", null);
        setField(term650304, term650304.getClass(), "parent", null);
        term650256 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term650259 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term650269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term650256, term650256.getClass(), "number", 0.0);
        setIntField(term650256, term650256.getClass(), "type", 18);
        setField(term650256, term650256.getClass(), "next", null);
        setField(term650259, term650259.getClass(), "functionName", null);
        setBooleanField(term650259, term650259.getClass(), "itsNeedsActivation", false);
        setIntField(term650259, term650259.getClass(), "itsFunctionType", 0);
        setBooleanField(term650259, term650259.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term650259, term650259.getClass(), "encodedSourceStart", 0);
        setIntField(term650259, term650259.getClass(), "encodedSourceEnd", 0);
        setField(term650259, term650259.getClass(), "sourceName", null);
        setIntField(term650259, term650259.getClass(), "baseLineno", 0);
        setIntField(term650259, term650259.getClass(), "endLineno", 0);
        setField(term650259, term650259.getClass(), "functions", null);
        setField(term650259, term650259.getClass(), "regexps", null);
        setField(term650259, term650259.getClass(), "itsVariables", null);
        setField(term650259, term650259.getClass(), "itsConst", null);
        setField(term650259, term650259.getClass(), "itsVariableNames", null);
        setIntField(term650259, term650259.getClass(), "varStart", 0);
        setField(term650259, term650259.getClass(), "compilerData", null);
        setIntField(term650259, term650259.getClass(), "type", 39);
        setIntField(term650269, term650269.getClass(), "type", 0);
        setField(term650269, term650269.getClass(), "next", null);
        setField(term650269, term650269.getClass(), "first", null);
        setField(term650269, term650269.getClass(), "last", null);
        setField(term650269, term650269.getClass(), "propListHead", null);
        setIntField(term650269, term650269.getClass(), "sourcePosition", 0);
        setField(term650269, term650269.getClass(), "jsType", null);
        setField(term650269, term650269.getClass(), "parent", null);
        setField(term650259, term650259.getClass(), "next", term650269);
        setField(term650259, term650259.getClass(), "first", null);
        setField(term650259, term650259.getClass(), "last", null);
        setField(term650259, term650259.getClass(), "propListHead", null);
        setIntField(term650259, term650259.getClass(), "sourcePosition", 0);
        setField(term650259, term650259.getClass(), "jsType", null);
        setField(term650259, term650259.getClass(), "parent", null);
        setField(term650256, term650256.getClass(), "first", term650259);
        setField(term650256, term650256.getClass(), "last", null);
        setField(term650256, term650256.getClass(), "propListHead", null);
        setIntField(term650256, term650256.getClass(), "sourcePosition", 0);
        setField(term650256, term650256.getClass(), "jsType", null);
        setField(term650256, term650256.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term621159;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term621067, args);
        assertTrue(recursiveEquals(term621067, term650303));
        assertTrue(recursiveEquals(term621159, term650304));
        assertTrue(recursiveEquals(retValue, term650256));
    }

};


