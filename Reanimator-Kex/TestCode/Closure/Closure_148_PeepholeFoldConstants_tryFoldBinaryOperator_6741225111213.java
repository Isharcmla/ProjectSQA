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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287785;
     Object term287871;
     Object term288556;
     Object term288557;
     Object term288475;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287785 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term287871 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term287957 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term288049 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term288049, term288049.getClass(), "type", 42);
        setField(term287957, term287957.getClass(), "next", term288049);
        setIntField(term287957, term287957.getClass(), "type", 42);
        setField(term287871, term287871.getClass(), "first", term287957);
        setIntField(term287871, term287871.getClass(), "type", 14);
        term288556 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term288556, term288556.getClass(), "currentTraversal", null);
        term288557 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term288558 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term288559 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term288557, term288557.getClass(), "functionName", null);
        setBooleanField(term288557, term288557.getClass(), "itsNeedsActivation", false);
        setIntField(term288557, term288557.getClass(), "itsFunctionType", 0);
        setBooleanField(term288557, term288557.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term288557, term288557.getClass(), "encodedSourceStart", 0);
        setIntField(term288557, term288557.getClass(), "encodedSourceEnd", 0);
        setField(term288557, term288557.getClass(), "sourceName", null);
        setIntField(term288557, term288557.getClass(), "baseLineno", 0);
        setIntField(term288557, term288557.getClass(), "endLineno", 0);
        setField(term288557, term288557.getClass(), "functions", null);
        setField(term288557, term288557.getClass(), "regexps", null);
        setField(term288557, term288557.getClass(), "itsVariables", null);
        setField(term288557, term288557.getClass(), "itsConst", null);
        setField(term288557, term288557.getClass(), "itsVariableNames", null);
        setIntField(term288557, term288557.getClass(), "varStart", 0);
        setField(term288557, term288557.getClass(), "compilerData", null);
        setIntField(term288557, term288557.getClass(), "type", 14);
        setField(term288557, term288557.getClass(), "next", null);
        setField(term288558, term288558.getClass(), "functionName", null);
        setBooleanField(term288558, term288558.getClass(), "itsNeedsActivation", false);
        setIntField(term288558, term288558.getClass(), "itsFunctionType", 0);
        setBooleanField(term288558, term288558.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term288558, term288558.getClass(), "encodedSourceStart", 0);
        setIntField(term288558, term288558.getClass(), "encodedSourceEnd", 0);
        setField(term288558, term288558.getClass(), "sourceName", null);
        setIntField(term288558, term288558.getClass(), "baseLineno", 0);
        setIntField(term288558, term288558.getClass(), "endLineno", 0);
        setField(term288558, term288558.getClass(), "functions", null);
        setField(term288558, term288558.getClass(), "regexps", null);
        setField(term288558, term288558.getClass(), "itsVariables", null);
        setField(term288558, term288558.getClass(), "itsConst", null);
        setField(term288558, term288558.getClass(), "itsVariableNames", null);
        setIntField(term288558, term288558.getClass(), "varStart", 0);
        setField(term288558, term288558.getClass(), "compilerData", null);
        setIntField(term288558, term288558.getClass(), "type", 42);
        setDoubleField(term288559, term288559.getClass(), "number", 0.0);
        setIntField(term288559, term288559.getClass(), "type", 42);
        setField(term288559, term288559.getClass(), "next", null);
        setField(term288559, term288559.getClass(), "first", null);
        setField(term288559, term288559.getClass(), "last", null);
        setField(term288559, term288559.getClass(), "propListHead", null);
        setIntField(term288559, term288559.getClass(), "sourcePosition", 0);
        setField(term288559, term288559.getClass(), "jsType", null);
        setField(term288559, term288559.getClass(), "parent", null);
        setField(term288558, term288558.getClass(), "next", term288559);
        setField(term288558, term288558.getClass(), "first", null);
        setField(term288558, term288558.getClass(), "last", null);
        setField(term288558, term288558.getClass(), "propListHead", null);
        setIntField(term288558, term288558.getClass(), "sourcePosition", 0);
        setField(term288558, term288558.getClass(), "jsType", null);
        setField(term288558, term288558.getClass(), "parent", null);
        setField(term288557, term288557.getClass(), "first", term288558);
        setField(term288557, term288557.getClass(), "last", null);
        setField(term288557, term288557.getClass(), "propListHead", null);
        setIntField(term288557, term288557.getClass(), "sourcePosition", 0);
        setField(term288557, term288557.getClass(), "jsType", null);
        setField(term288557, term288557.getClass(), "parent", null);
        term288475 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term288485 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term288495 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term288475, term288475.getClass(), "functionName", null);
        setBooleanField(term288475, term288475.getClass(), "itsNeedsActivation", false);
        setIntField(term288475, term288475.getClass(), "itsFunctionType", 0);
        setBooleanField(term288475, term288475.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term288475, term288475.getClass(), "encodedSourceStart", 0);
        setIntField(term288475, term288475.getClass(), "encodedSourceEnd", 0);
        setField(term288475, term288475.getClass(), "sourceName", null);
        setIntField(term288475, term288475.getClass(), "baseLineno", 0);
        setIntField(term288475, term288475.getClass(), "endLineno", 0);
        setField(term288475, term288475.getClass(), "functions", null);
        setField(term288475, term288475.getClass(), "regexps", null);
        setField(term288475, term288475.getClass(), "itsVariables", null);
        setField(term288475, term288475.getClass(), "itsConst", null);
        setField(term288475, term288475.getClass(), "itsVariableNames", null);
        setIntField(term288475, term288475.getClass(), "varStart", 0);
        setField(term288475, term288475.getClass(), "compilerData", null);
        setIntField(term288475, term288475.getClass(), "type", 14);
        setField(term288475, term288475.getClass(), "next", null);
        setField(term288485, term288485.getClass(), "functionName", null);
        setBooleanField(term288485, term288485.getClass(), "itsNeedsActivation", false);
        setIntField(term288485, term288485.getClass(), "itsFunctionType", 0);
        setBooleanField(term288485, term288485.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term288485, term288485.getClass(), "encodedSourceStart", 0);
        setIntField(term288485, term288485.getClass(), "encodedSourceEnd", 0);
        setField(term288485, term288485.getClass(), "sourceName", null);
        setIntField(term288485, term288485.getClass(), "baseLineno", 0);
        setIntField(term288485, term288485.getClass(), "endLineno", 0);
        setField(term288485, term288485.getClass(), "functions", null);
        setField(term288485, term288485.getClass(), "regexps", null);
        setField(term288485, term288485.getClass(), "itsVariables", null);
        setField(term288485, term288485.getClass(), "itsConst", null);
        setField(term288485, term288485.getClass(), "itsVariableNames", null);
        setIntField(term288485, term288485.getClass(), "varStart", 0);
        setField(term288485, term288485.getClass(), "compilerData", null);
        setIntField(term288485, term288485.getClass(), "type", 42);
        setDoubleField(term288495, term288495.getClass(), "number", 0.0);
        setIntField(term288495, term288495.getClass(), "type", 42);
        setField(term288495, term288495.getClass(), "next", null);
        setField(term288495, term288495.getClass(), "first", null);
        setField(term288495, term288495.getClass(), "last", null);
        setField(term288495, term288495.getClass(), "propListHead", null);
        setIntField(term288495, term288495.getClass(), "sourcePosition", 0);
        setField(term288495, term288495.getClass(), "jsType", null);
        setField(term288495, term288495.getClass(), "parent", null);
        setField(term288485, term288485.getClass(), "next", term288495);
        setField(term288485, term288485.getClass(), "first", null);
        setField(term288485, term288485.getClass(), "last", null);
        setField(term288485, term288485.getClass(), "propListHead", null);
        setIntField(term288485, term288485.getClass(), "sourcePosition", 0);
        setField(term288485, term288485.getClass(), "jsType", null);
        setField(term288485, term288485.getClass(), "parent", null);
        setField(term288475, term288475.getClass(), "first", term288485);
        setField(term288475, term288475.getClass(), "last", null);
        setField(term288475, term288475.getClass(), "propListHead", null);
        setIntField(term288475, term288475.getClass(), "sourcePosition", 0);
        setField(term288475, term288475.getClass(), "jsType", null);
        setField(term288475, term288475.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term287871;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term287785, args);
        assertTrue(recursiveEquals(term287785, term288556));
        assertTrue(recursiveEquals(term287871, term288557));
        assertTrue(recursiveEquals(retValue, term288475));
    }

};


