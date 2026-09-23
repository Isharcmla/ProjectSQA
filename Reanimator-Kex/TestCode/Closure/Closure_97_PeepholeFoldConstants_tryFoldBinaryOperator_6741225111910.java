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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729162;
     Object term729254;
     Object term729478;
     Object term729479;
     Object term729425;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term729162 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term729254 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term729340 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term729410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term729340, term729340.getClass(), "next", term729410);
        setIntField(term729340, term729340.getClass(), "type", 39);
        setField(term729254, term729254.getClass(), "first", term729340);
        setIntField(term729254, term729254.getClass(), "type", 9);
        term729478 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term729478, term729478.getClass(), "currentTraversal", null);
        term729479 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term729480 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term729481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term729479, term729479.getClass(), "number", 0.0);
        setIntField(term729479, term729479.getClass(), "type", 9);
        setField(term729479, term729479.getClass(), "next", null);
        setField(term729480, term729480.getClass(), "functionName", null);
        setBooleanField(term729480, term729480.getClass(), "itsNeedsActivation", false);
        setIntField(term729480, term729480.getClass(), "itsFunctionType", 0);
        setBooleanField(term729480, term729480.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term729480, term729480.getClass(), "encodedSourceStart", 0);
        setIntField(term729480, term729480.getClass(), "encodedSourceEnd", 0);
        setField(term729480, term729480.getClass(), "sourceName", null);
        setIntField(term729480, term729480.getClass(), "baseLineno", 0);
        setIntField(term729480, term729480.getClass(), "endLineno", 0);
        setField(term729480, term729480.getClass(), "functions", null);
        setField(term729480, term729480.getClass(), "regexps", null);
        setField(term729480, term729480.getClass(), "itsVariables", null);
        setField(term729480, term729480.getClass(), "itsConst", null);
        setField(term729480, term729480.getClass(), "itsVariableNames", null);
        setIntField(term729480, term729480.getClass(), "varStart", 0);
        setField(term729480, term729480.getClass(), "compilerData", null);
        setIntField(term729480, term729480.getClass(), "type", 39);
        setIntField(term729481, term729481.getClass(), "type", 0);
        setField(term729481, term729481.getClass(), "next", null);
        setField(term729481, term729481.getClass(), "first", null);
        setField(term729481, term729481.getClass(), "last", null);
        setField(term729481, term729481.getClass(), "propListHead", null);
        setIntField(term729481, term729481.getClass(), "sourcePosition", 0);
        setField(term729481, term729481.getClass(), "jsType", null);
        setField(term729481, term729481.getClass(), "parent", null);
        setField(term729480, term729480.getClass(), "next", term729481);
        setField(term729480, term729480.getClass(), "first", null);
        setField(term729480, term729480.getClass(), "last", null);
        setField(term729480, term729480.getClass(), "propListHead", null);
        setIntField(term729480, term729480.getClass(), "sourcePosition", 0);
        setField(term729480, term729480.getClass(), "jsType", null);
        setField(term729480, term729480.getClass(), "parent", null);
        setField(term729479, term729479.getClass(), "first", term729480);
        setField(term729479, term729479.getClass(), "last", null);
        setField(term729479, term729479.getClass(), "propListHead", null);
        setIntField(term729479, term729479.getClass(), "sourcePosition", 0);
        setField(term729479, term729479.getClass(), "jsType", null);
        setField(term729479, term729479.getClass(), "parent", null);
        term729425 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term729428 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term729438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term729425, term729425.getClass(), "number", 0.0);
        setIntField(term729425, term729425.getClass(), "type", 9);
        setField(term729425, term729425.getClass(), "next", null);
        setField(term729428, term729428.getClass(), "functionName", null);
        setBooleanField(term729428, term729428.getClass(), "itsNeedsActivation", false);
        setIntField(term729428, term729428.getClass(), "itsFunctionType", 0);
        setBooleanField(term729428, term729428.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term729428, term729428.getClass(), "encodedSourceStart", 0);
        setIntField(term729428, term729428.getClass(), "encodedSourceEnd", 0);
        setField(term729428, term729428.getClass(), "sourceName", null);
        setIntField(term729428, term729428.getClass(), "baseLineno", 0);
        setIntField(term729428, term729428.getClass(), "endLineno", 0);
        setField(term729428, term729428.getClass(), "functions", null);
        setField(term729428, term729428.getClass(), "regexps", null);
        setField(term729428, term729428.getClass(), "itsVariables", null);
        setField(term729428, term729428.getClass(), "itsConst", null);
        setField(term729428, term729428.getClass(), "itsVariableNames", null);
        setIntField(term729428, term729428.getClass(), "varStart", 0);
        setField(term729428, term729428.getClass(), "compilerData", null);
        setIntField(term729428, term729428.getClass(), "type", 39);
        setIntField(term729438, term729438.getClass(), "type", 0);
        setField(term729438, term729438.getClass(), "next", null);
        setField(term729438, term729438.getClass(), "first", null);
        setField(term729438, term729438.getClass(), "last", null);
        setField(term729438, term729438.getClass(), "propListHead", null);
        setIntField(term729438, term729438.getClass(), "sourcePosition", 0);
        setField(term729438, term729438.getClass(), "jsType", null);
        setField(term729438, term729438.getClass(), "parent", null);
        setField(term729428, term729428.getClass(), "next", term729438);
        setField(term729428, term729428.getClass(), "first", null);
        setField(term729428, term729428.getClass(), "last", null);
        setField(term729428, term729428.getClass(), "propListHead", null);
        setIntField(term729428, term729428.getClass(), "sourcePosition", 0);
        setField(term729428, term729428.getClass(), "jsType", null);
        setField(term729428, term729428.getClass(), "parent", null);
        setField(term729425, term729425.getClass(), "first", term729428);
        setField(term729425, term729425.getClass(), "last", null);
        setField(term729425, term729425.getClass(), "propListHead", null);
        setIntField(term729425, term729425.getClass(), "sourcePosition", 0);
        setField(term729425, term729425.getClass(), "jsType", null);
        setField(term729425, term729425.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term729254;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term729162, args);
        assertTrue(recursiveEquals(term729162, term729478));
        assertTrue(recursiveEquals(term729254, term729479));
        assertTrue(recursiveEquals(retValue, term729425));
    }

};


