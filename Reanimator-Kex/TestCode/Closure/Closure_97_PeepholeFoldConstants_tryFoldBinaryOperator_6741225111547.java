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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567591;
     Object term567683;
     Object term568354;
     Object term568355;
     Object term568307;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term567591 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term567683 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term567769 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term567839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term567769, term567769.getClass(), "next", term567839);
        setField(term567683, term567683.getClass(), "first", term567769);
        setIntField(term567683, term567683.getClass(), "type", 35);
        term568354 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term568354, term568354.getClass(), "currentTraversal", null);
        term568355 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term568356 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term568357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term568355, term568355.getClass(), "str", null);
        setIntField(term568355, term568355.getClass(), "type", 35);
        setField(term568355, term568355.getClass(), "next", null);
        setField(term568356, term568356.getClass(), "functionName", null);
        setBooleanField(term568356, term568356.getClass(), "itsNeedsActivation", false);
        setIntField(term568356, term568356.getClass(), "itsFunctionType", 0);
        setBooleanField(term568356, term568356.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term568356, term568356.getClass(), "encodedSourceStart", 0);
        setIntField(term568356, term568356.getClass(), "encodedSourceEnd", 0);
        setField(term568356, term568356.getClass(), "sourceName", null);
        setIntField(term568356, term568356.getClass(), "baseLineno", 0);
        setIntField(term568356, term568356.getClass(), "endLineno", 0);
        setField(term568356, term568356.getClass(), "functions", null);
        setField(term568356, term568356.getClass(), "regexps", null);
        setField(term568356, term568356.getClass(), "itsVariables", null);
        setField(term568356, term568356.getClass(), "itsConst", null);
        setField(term568356, term568356.getClass(), "itsVariableNames", null);
        setIntField(term568356, term568356.getClass(), "varStart", 0);
        setField(term568356, term568356.getClass(), "compilerData", null);
        setIntField(term568356, term568356.getClass(), "type", 0);
        setIntField(term568357, term568357.getClass(), "type", 0);
        setField(term568357, term568357.getClass(), "next", null);
        setField(term568357, term568357.getClass(), "first", null);
        setField(term568357, term568357.getClass(), "last", null);
        setField(term568357, term568357.getClass(), "propListHead", null);
        setIntField(term568357, term568357.getClass(), "sourcePosition", 0);
        setField(term568357, term568357.getClass(), "jsType", null);
        setField(term568357, term568357.getClass(), "parent", null);
        setField(term568356, term568356.getClass(), "next", term568357);
        setField(term568356, term568356.getClass(), "first", null);
        setField(term568356, term568356.getClass(), "last", null);
        setField(term568356, term568356.getClass(), "propListHead", null);
        setIntField(term568356, term568356.getClass(), "sourcePosition", 0);
        setField(term568356, term568356.getClass(), "jsType", null);
        setField(term568356, term568356.getClass(), "parent", null);
        setField(term568355, term568355.getClass(), "first", term568356);
        setField(term568355, term568355.getClass(), "last", null);
        setField(term568355, term568355.getClass(), "propListHead", null);
        setIntField(term568355, term568355.getClass(), "sourcePosition", 0);
        setField(term568355, term568355.getClass(), "jsType", null);
        setField(term568355, term568355.getClass(), "parent", null);
        term568307 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term568309 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term568319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term568307, term568307.getClass(), "str", null);
        setIntField(term568307, term568307.getClass(), "type", 35);
        setField(term568307, term568307.getClass(), "next", null);
        setField(term568309, term568309.getClass(), "functionName", null);
        setBooleanField(term568309, term568309.getClass(), "itsNeedsActivation", false);
        setIntField(term568309, term568309.getClass(), "itsFunctionType", 0);
        setBooleanField(term568309, term568309.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term568309, term568309.getClass(), "encodedSourceStart", 0);
        setIntField(term568309, term568309.getClass(), "encodedSourceEnd", 0);
        setField(term568309, term568309.getClass(), "sourceName", null);
        setIntField(term568309, term568309.getClass(), "baseLineno", 0);
        setIntField(term568309, term568309.getClass(), "endLineno", 0);
        setField(term568309, term568309.getClass(), "functions", null);
        setField(term568309, term568309.getClass(), "regexps", null);
        setField(term568309, term568309.getClass(), "itsVariables", null);
        setField(term568309, term568309.getClass(), "itsConst", null);
        setField(term568309, term568309.getClass(), "itsVariableNames", null);
        setIntField(term568309, term568309.getClass(), "varStart", 0);
        setField(term568309, term568309.getClass(), "compilerData", null);
        setIntField(term568309, term568309.getClass(), "type", 0);
        setIntField(term568319, term568319.getClass(), "type", 0);
        setField(term568319, term568319.getClass(), "next", null);
        setField(term568319, term568319.getClass(), "first", null);
        setField(term568319, term568319.getClass(), "last", null);
        setField(term568319, term568319.getClass(), "propListHead", null);
        setIntField(term568319, term568319.getClass(), "sourcePosition", 0);
        setField(term568319, term568319.getClass(), "jsType", null);
        setField(term568319, term568319.getClass(), "parent", null);
        setField(term568309, term568309.getClass(), "next", term568319);
        setField(term568309, term568309.getClass(), "first", null);
        setField(term568309, term568309.getClass(), "last", null);
        setField(term568309, term568309.getClass(), "propListHead", null);
        setIntField(term568309, term568309.getClass(), "sourcePosition", 0);
        setField(term568309, term568309.getClass(), "jsType", null);
        setField(term568309, term568309.getClass(), "parent", null);
        setField(term568307, term568307.getClass(), "first", term568309);
        setField(term568307, term568307.getClass(), "last", null);
        setField(term568307, term568307.getClass(), "propListHead", null);
        setIntField(term568307, term568307.getClass(), "sourcePosition", 0);
        setField(term568307, term568307.getClass(), "jsType", null);
        setField(term568307, term568307.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term567683;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term567591, args);
        assertTrue(recursiveEquals(term567591, term568354));
        assertTrue(recursiveEquals(term567683, term568355));
        assertTrue(recursiveEquals(retValue, term568307));
    }

};


