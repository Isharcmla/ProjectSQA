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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term688452;
     Object term688544;
     Object term688839;
     Object term688840;
     Object term688794;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term688452 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term688544 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term688630 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term688700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term688630, term688630.getClass(), "next", term688700);
        setField(term688544, term688544.getClass(), "first", term688630);
        setIntField(term688544, term688544.getClass(), "type", 19);
        term688839 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term688839, term688839.getClass(), "currentTraversal", null);
        term688840 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term688841 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term688842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term688840, term688840.getClass(), "number", 0.0);
        setIntField(term688840, term688840.getClass(), "type", 19);
        setField(term688840, term688840.getClass(), "next", null);
        setField(term688841, term688841.getClass(), "functionName", null);
        setBooleanField(term688841, term688841.getClass(), "itsNeedsActivation", false);
        setIntField(term688841, term688841.getClass(), "itsFunctionType", 0);
        setBooleanField(term688841, term688841.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term688841, term688841.getClass(), "encodedSourceStart", 0);
        setIntField(term688841, term688841.getClass(), "encodedSourceEnd", 0);
        setField(term688841, term688841.getClass(), "sourceName", null);
        setIntField(term688841, term688841.getClass(), "baseLineno", 0);
        setIntField(term688841, term688841.getClass(), "endLineno", 0);
        setField(term688841, term688841.getClass(), "functions", null);
        setField(term688841, term688841.getClass(), "regexps", null);
        setField(term688841, term688841.getClass(), "itsVariables", null);
        setField(term688841, term688841.getClass(), "itsConst", null);
        setField(term688841, term688841.getClass(), "itsVariableNames", null);
        setIntField(term688841, term688841.getClass(), "varStart", 0);
        setField(term688841, term688841.getClass(), "compilerData", null);
        setIntField(term688841, term688841.getClass(), "type", 0);
        setIntField(term688842, term688842.getClass(), "type", 0);
        setField(term688842, term688842.getClass(), "next", null);
        setField(term688842, term688842.getClass(), "first", null);
        setField(term688842, term688842.getClass(), "last", null);
        setField(term688842, term688842.getClass(), "propListHead", null);
        setIntField(term688842, term688842.getClass(), "sourcePosition", 0);
        setField(term688842, term688842.getClass(), "jsType", null);
        setField(term688842, term688842.getClass(), "parent", null);
        setField(term688841, term688841.getClass(), "next", term688842);
        setField(term688841, term688841.getClass(), "first", null);
        setField(term688841, term688841.getClass(), "last", null);
        setField(term688841, term688841.getClass(), "propListHead", null);
        setIntField(term688841, term688841.getClass(), "sourcePosition", 0);
        setField(term688841, term688841.getClass(), "jsType", null);
        setField(term688841, term688841.getClass(), "parent", null);
        setField(term688840, term688840.getClass(), "first", term688841);
        setField(term688840, term688840.getClass(), "last", null);
        setField(term688840, term688840.getClass(), "propListHead", null);
        setIntField(term688840, term688840.getClass(), "sourcePosition", 0);
        setField(term688840, term688840.getClass(), "jsType", null);
        setField(term688840, term688840.getClass(), "parent", null);
        term688794 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term688797 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term688807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term688794, term688794.getClass(), "number", 0.0);
        setIntField(term688794, term688794.getClass(), "type", 19);
        setField(term688794, term688794.getClass(), "next", null);
        setField(term688797, term688797.getClass(), "functionName", null);
        setBooleanField(term688797, term688797.getClass(), "itsNeedsActivation", false);
        setIntField(term688797, term688797.getClass(), "itsFunctionType", 0);
        setBooleanField(term688797, term688797.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term688797, term688797.getClass(), "encodedSourceStart", 0);
        setIntField(term688797, term688797.getClass(), "encodedSourceEnd", 0);
        setField(term688797, term688797.getClass(), "sourceName", null);
        setIntField(term688797, term688797.getClass(), "baseLineno", 0);
        setIntField(term688797, term688797.getClass(), "endLineno", 0);
        setField(term688797, term688797.getClass(), "functions", null);
        setField(term688797, term688797.getClass(), "regexps", null);
        setField(term688797, term688797.getClass(), "itsVariables", null);
        setField(term688797, term688797.getClass(), "itsConst", null);
        setField(term688797, term688797.getClass(), "itsVariableNames", null);
        setIntField(term688797, term688797.getClass(), "varStart", 0);
        setField(term688797, term688797.getClass(), "compilerData", null);
        setIntField(term688797, term688797.getClass(), "type", 0);
        setIntField(term688807, term688807.getClass(), "type", 0);
        setField(term688807, term688807.getClass(), "next", null);
        setField(term688807, term688807.getClass(), "first", null);
        setField(term688807, term688807.getClass(), "last", null);
        setField(term688807, term688807.getClass(), "propListHead", null);
        setIntField(term688807, term688807.getClass(), "sourcePosition", 0);
        setField(term688807, term688807.getClass(), "jsType", null);
        setField(term688807, term688807.getClass(), "parent", null);
        setField(term688797, term688797.getClass(), "next", term688807);
        setField(term688797, term688797.getClass(), "first", null);
        setField(term688797, term688797.getClass(), "last", null);
        setField(term688797, term688797.getClass(), "propListHead", null);
        setIntField(term688797, term688797.getClass(), "sourcePosition", 0);
        setField(term688797, term688797.getClass(), "jsType", null);
        setField(term688797, term688797.getClass(), "parent", null);
        setField(term688794, term688794.getClass(), "first", term688797);
        setField(term688794, term688794.getClass(), "last", null);
        setField(term688794, term688794.getClass(), "propListHead", null);
        setIntField(term688794, term688794.getClass(), "sourcePosition", 0);
        setField(term688794, term688794.getClass(), "jsType", null);
        setField(term688794, term688794.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term688544;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term688452, args);
        assertTrue(recursiveEquals(term688452, term688839));
        assertTrue(recursiveEquals(term688544, term688840));
        assertTrue(recursiveEquals(retValue, term688794));
    }

};


