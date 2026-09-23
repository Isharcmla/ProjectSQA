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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term718421;
     Object term718513;
     Object term719158;
     Object term719159;
     Object term719091;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term718421 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term718513 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term718599 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term718691 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term718691, term718691.getClass(), "type", 106);
        setField(term718599, term718599.getClass(), "next", term718691);
        setIntField(term718599, term718599.getClass(), "type", 42);
        setField(term718513, term718513.getClass(), "first", term718599);
        setIntField(term718513, term718513.getClass(), "type", 14);
        term719158 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term719158, term719158.getClass(), "currentTraversal", null);
        term719159 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term719160 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term719161 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term719159, term719159.getClass(), "number", 0.0);
        setIntField(term719159, term719159.getClass(), "type", 14);
        setField(term719159, term719159.getClass(), "next", null);
        setField(term719160, term719160.getClass(), "functionName", null);
        setBooleanField(term719160, term719160.getClass(), "itsNeedsActivation", false);
        setIntField(term719160, term719160.getClass(), "itsFunctionType", 0);
        setBooleanField(term719160, term719160.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term719160, term719160.getClass(), "encodedSourceStart", 0);
        setIntField(term719160, term719160.getClass(), "encodedSourceEnd", 0);
        setField(term719160, term719160.getClass(), "sourceName", null);
        setIntField(term719160, term719160.getClass(), "baseLineno", 0);
        setIntField(term719160, term719160.getClass(), "endLineno", 0);
        setField(term719160, term719160.getClass(), "functions", null);
        setField(term719160, term719160.getClass(), "regexps", null);
        setField(term719160, term719160.getClass(), "itsVariables", null);
        setField(term719160, term719160.getClass(), "itsConst", null);
        setField(term719160, term719160.getClass(), "itsVariableNames", null);
        setIntField(term719160, term719160.getClass(), "varStart", 0);
        setField(term719160, term719160.getClass(), "compilerData", null);
        setIntField(term719160, term719160.getClass(), "type", 42);
        setField(term719161, term719161.getClass(), "str", null);
        setIntField(term719161, term719161.getClass(), "type", 106);
        setField(term719161, term719161.getClass(), "next", null);
        setField(term719161, term719161.getClass(), "first", null);
        setField(term719161, term719161.getClass(), "last", null);
        setField(term719161, term719161.getClass(), "propListHead", null);
        setIntField(term719161, term719161.getClass(), "sourcePosition", 0);
        setField(term719161, term719161.getClass(), "jsType", null);
        setField(term719161, term719161.getClass(), "parent", null);
        setField(term719160, term719160.getClass(), "next", term719161);
        setField(term719160, term719160.getClass(), "first", null);
        setField(term719160, term719160.getClass(), "last", null);
        setField(term719160, term719160.getClass(), "propListHead", null);
        setIntField(term719160, term719160.getClass(), "sourcePosition", 0);
        setField(term719160, term719160.getClass(), "jsType", null);
        setField(term719160, term719160.getClass(), "parent", null);
        setField(term719159, term719159.getClass(), "first", term719160);
        setField(term719159, term719159.getClass(), "last", null);
        setField(term719159, term719159.getClass(), "propListHead", null);
        setIntField(term719159, term719159.getClass(), "sourcePosition", 0);
        setField(term719159, term719159.getClass(), "jsType", null);
        setField(term719159, term719159.getClass(), "parent", null);
        term719091 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term719094 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term719104 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term719091, term719091.getClass(), "number", 0.0);
        setIntField(term719091, term719091.getClass(), "type", 14);
        setField(term719091, term719091.getClass(), "next", null);
        setField(term719094, term719094.getClass(), "functionName", null);
        setBooleanField(term719094, term719094.getClass(), "itsNeedsActivation", false);
        setIntField(term719094, term719094.getClass(), "itsFunctionType", 0);
        setBooleanField(term719094, term719094.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term719094, term719094.getClass(), "encodedSourceStart", 0);
        setIntField(term719094, term719094.getClass(), "encodedSourceEnd", 0);
        setField(term719094, term719094.getClass(), "sourceName", null);
        setIntField(term719094, term719094.getClass(), "baseLineno", 0);
        setIntField(term719094, term719094.getClass(), "endLineno", 0);
        setField(term719094, term719094.getClass(), "functions", null);
        setField(term719094, term719094.getClass(), "regexps", null);
        setField(term719094, term719094.getClass(), "itsVariables", null);
        setField(term719094, term719094.getClass(), "itsConst", null);
        setField(term719094, term719094.getClass(), "itsVariableNames", null);
        setIntField(term719094, term719094.getClass(), "varStart", 0);
        setField(term719094, term719094.getClass(), "compilerData", null);
        setIntField(term719094, term719094.getClass(), "type", 42);
        setField(term719104, term719104.getClass(), "str", null);
        setIntField(term719104, term719104.getClass(), "type", 106);
        setField(term719104, term719104.getClass(), "next", null);
        setField(term719104, term719104.getClass(), "first", null);
        setField(term719104, term719104.getClass(), "last", null);
        setField(term719104, term719104.getClass(), "propListHead", null);
        setIntField(term719104, term719104.getClass(), "sourcePosition", 0);
        setField(term719104, term719104.getClass(), "jsType", null);
        setField(term719104, term719104.getClass(), "parent", null);
        setField(term719094, term719094.getClass(), "next", term719104);
        setField(term719094, term719094.getClass(), "first", null);
        setField(term719094, term719094.getClass(), "last", null);
        setField(term719094, term719094.getClass(), "propListHead", null);
        setIntField(term719094, term719094.getClass(), "sourcePosition", 0);
        setField(term719094, term719094.getClass(), "jsType", null);
        setField(term719094, term719094.getClass(), "parent", null);
        setField(term719091, term719091.getClass(), "first", term719094);
        setField(term719091, term719091.getClass(), "last", null);
        setField(term719091, term719091.getClass(), "propListHead", null);
        setIntField(term719091, term719091.getClass(), "sourcePosition", 0);
        setField(term719091, term719091.getClass(), "jsType", null);
        setField(term719091, term719091.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term718513;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term718421, args);
        assertTrue(recursiveEquals(term718421, term719158));
        assertTrue(recursiveEquals(term718513, term719159));
        assertTrue(recursiveEquals(retValue, term719091));
    }

};


