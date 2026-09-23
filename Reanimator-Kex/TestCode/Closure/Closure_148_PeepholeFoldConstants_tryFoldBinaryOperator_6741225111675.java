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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430371;
     Object term430463;
     Object term431204;
     Object term431205;
     Object term431154;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term430371 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term430463 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term430549 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term430619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term430549, term430549.getClass(), "next", term430619);
        setField(term430463, term430463.getClass(), "first", term430549);
        setIntField(term430463, term430463.getClass(), "type", 12);
        term431204 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term431204, term431204.getClass(), "currentTraversal", null);
        term431205 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term431206 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term431207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term431205, term431205.getClass(), "str", null);
        setIntField(term431205, term431205.getClass(), "type", 12);
        setField(term431205, term431205.getClass(), "next", null);
        setField(term431206, term431206.getClass(), "functionName", null);
        setBooleanField(term431206, term431206.getClass(), "itsNeedsActivation", false);
        setIntField(term431206, term431206.getClass(), "itsFunctionType", 0);
        setBooleanField(term431206, term431206.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term431206, term431206.getClass(), "encodedSourceStart", 0);
        setIntField(term431206, term431206.getClass(), "encodedSourceEnd", 0);
        setField(term431206, term431206.getClass(), "sourceName", null);
        setIntField(term431206, term431206.getClass(), "baseLineno", 0);
        setIntField(term431206, term431206.getClass(), "endLineno", 0);
        setField(term431206, term431206.getClass(), "functions", null);
        setField(term431206, term431206.getClass(), "regexps", null);
        setField(term431206, term431206.getClass(), "itsVariables", null);
        setField(term431206, term431206.getClass(), "itsConst", null);
        setField(term431206, term431206.getClass(), "itsVariableNames", null);
        setIntField(term431206, term431206.getClass(), "varStart", 0);
        setField(term431206, term431206.getClass(), "compilerData", null);
        setIntField(term431206, term431206.getClass(), "type", 0);
        setIntField(term431207, term431207.getClass(), "type", 0);
        setField(term431207, term431207.getClass(), "next", null);
        setField(term431207, term431207.getClass(), "first", null);
        setField(term431207, term431207.getClass(), "last", null);
        setField(term431207, term431207.getClass(), "propListHead", null);
        setIntField(term431207, term431207.getClass(), "sourcePosition", 0);
        setField(term431207, term431207.getClass(), "jsType", null);
        setField(term431207, term431207.getClass(), "parent", null);
        setField(term431206, term431206.getClass(), "next", term431207);
        setField(term431206, term431206.getClass(), "first", null);
        setField(term431206, term431206.getClass(), "last", null);
        setField(term431206, term431206.getClass(), "propListHead", null);
        setIntField(term431206, term431206.getClass(), "sourcePosition", 0);
        setField(term431206, term431206.getClass(), "jsType", null);
        setField(term431206, term431206.getClass(), "parent", null);
        setField(term431205, term431205.getClass(), "first", term431206);
        setField(term431205, term431205.getClass(), "last", null);
        setField(term431205, term431205.getClass(), "propListHead", null);
        setIntField(term431205, term431205.getClass(), "sourcePosition", 0);
        setField(term431205, term431205.getClass(), "jsType", null);
        setField(term431205, term431205.getClass(), "parent", null);
        term431154 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term431156 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term431166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term431154, term431154.getClass(), "str", null);
        setIntField(term431154, term431154.getClass(), "type", 12);
        setField(term431154, term431154.getClass(), "next", null);
        setField(term431156, term431156.getClass(), "functionName", null);
        setBooleanField(term431156, term431156.getClass(), "itsNeedsActivation", false);
        setIntField(term431156, term431156.getClass(), "itsFunctionType", 0);
        setBooleanField(term431156, term431156.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term431156, term431156.getClass(), "encodedSourceStart", 0);
        setIntField(term431156, term431156.getClass(), "encodedSourceEnd", 0);
        setField(term431156, term431156.getClass(), "sourceName", null);
        setIntField(term431156, term431156.getClass(), "baseLineno", 0);
        setIntField(term431156, term431156.getClass(), "endLineno", 0);
        setField(term431156, term431156.getClass(), "functions", null);
        setField(term431156, term431156.getClass(), "regexps", null);
        setField(term431156, term431156.getClass(), "itsVariables", null);
        setField(term431156, term431156.getClass(), "itsConst", null);
        setField(term431156, term431156.getClass(), "itsVariableNames", null);
        setIntField(term431156, term431156.getClass(), "varStart", 0);
        setField(term431156, term431156.getClass(), "compilerData", null);
        setIntField(term431156, term431156.getClass(), "type", 0);
        setIntField(term431166, term431166.getClass(), "type", 0);
        setField(term431166, term431166.getClass(), "next", null);
        setField(term431166, term431166.getClass(), "first", null);
        setField(term431166, term431166.getClass(), "last", null);
        setField(term431166, term431166.getClass(), "propListHead", null);
        setIntField(term431166, term431166.getClass(), "sourcePosition", 0);
        setField(term431166, term431166.getClass(), "jsType", null);
        setField(term431166, term431166.getClass(), "parent", null);
        setField(term431156, term431156.getClass(), "next", term431166);
        setField(term431156, term431156.getClass(), "first", null);
        setField(term431156, term431156.getClass(), "last", null);
        setField(term431156, term431156.getClass(), "propListHead", null);
        setIntField(term431156, term431156.getClass(), "sourcePosition", 0);
        setField(term431156, term431156.getClass(), "jsType", null);
        setField(term431156, term431156.getClass(), "parent", null);
        setField(term431154, term431154.getClass(), "first", term431156);
        setField(term431154, term431154.getClass(), "last", null);
        setField(term431154, term431154.getClass(), "propListHead", null);
        setIntField(term431154, term431154.getClass(), "sourcePosition", 0);
        setField(term431154, term431154.getClass(), "jsType", null);
        setField(term431154, term431154.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term430463;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term430371, args);
        assertTrue(recursiveEquals(term430371, term431204));
        assertTrue(recursiveEquals(term430463, term431205));
        assertTrue(recursiveEquals(retValue, term431154));
    }

};


