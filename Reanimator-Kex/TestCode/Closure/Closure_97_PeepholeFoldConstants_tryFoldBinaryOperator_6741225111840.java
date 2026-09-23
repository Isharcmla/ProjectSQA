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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term711396;
     Object term711488;
     Object term711702;
     Object term711703;
     Object term711659;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term711396 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term711488 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term711574 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term711644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term711574, term711574.getClass(), "next", term711644);
        setField(term711488, term711488.getClass(), "first", term711574);
        setIntField(term711488, term711488.getClass(), "type", 24);
        term711702 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term711702, term711702.getClass(), "currentTraversal", null);
        term711703 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term711704 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term711705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term711703, term711703.getClass(), "str", null);
        setIntField(term711703, term711703.getClass(), "type", 24);
        setField(term711703, term711703.getClass(), "next", null);
        setField(term711704, term711704.getClass(), "functionName", null);
        setBooleanField(term711704, term711704.getClass(), "itsNeedsActivation", false);
        setIntField(term711704, term711704.getClass(), "itsFunctionType", 0);
        setBooleanField(term711704, term711704.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term711704, term711704.getClass(), "encodedSourceStart", 0);
        setIntField(term711704, term711704.getClass(), "encodedSourceEnd", 0);
        setField(term711704, term711704.getClass(), "sourceName", null);
        setIntField(term711704, term711704.getClass(), "baseLineno", 0);
        setIntField(term711704, term711704.getClass(), "endLineno", 0);
        setField(term711704, term711704.getClass(), "functions", null);
        setField(term711704, term711704.getClass(), "regexps", null);
        setField(term711704, term711704.getClass(), "itsVariables", null);
        setField(term711704, term711704.getClass(), "itsConst", null);
        setField(term711704, term711704.getClass(), "itsVariableNames", null);
        setIntField(term711704, term711704.getClass(), "varStart", 0);
        setField(term711704, term711704.getClass(), "compilerData", null);
        setIntField(term711704, term711704.getClass(), "type", 0);
        setIntField(term711705, term711705.getClass(), "type", 0);
        setField(term711705, term711705.getClass(), "next", null);
        setField(term711705, term711705.getClass(), "first", null);
        setField(term711705, term711705.getClass(), "last", null);
        setField(term711705, term711705.getClass(), "propListHead", null);
        setIntField(term711705, term711705.getClass(), "sourcePosition", 0);
        setField(term711705, term711705.getClass(), "jsType", null);
        setField(term711705, term711705.getClass(), "parent", null);
        setField(term711704, term711704.getClass(), "next", term711705);
        setField(term711704, term711704.getClass(), "first", null);
        setField(term711704, term711704.getClass(), "last", null);
        setField(term711704, term711704.getClass(), "propListHead", null);
        setIntField(term711704, term711704.getClass(), "sourcePosition", 0);
        setField(term711704, term711704.getClass(), "jsType", null);
        setField(term711704, term711704.getClass(), "parent", null);
        setField(term711703, term711703.getClass(), "first", term711704);
        setField(term711703, term711703.getClass(), "last", null);
        setField(term711703, term711703.getClass(), "propListHead", null);
        setIntField(term711703, term711703.getClass(), "sourcePosition", 0);
        setField(term711703, term711703.getClass(), "jsType", null);
        setField(term711703, term711703.getClass(), "parent", null);
        term711659 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term711661 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term711671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term711659, term711659.getClass(), "str", null);
        setIntField(term711659, term711659.getClass(), "type", 24);
        setField(term711659, term711659.getClass(), "next", null);
        setField(term711661, term711661.getClass(), "functionName", null);
        setBooleanField(term711661, term711661.getClass(), "itsNeedsActivation", false);
        setIntField(term711661, term711661.getClass(), "itsFunctionType", 0);
        setBooleanField(term711661, term711661.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term711661, term711661.getClass(), "encodedSourceStart", 0);
        setIntField(term711661, term711661.getClass(), "encodedSourceEnd", 0);
        setField(term711661, term711661.getClass(), "sourceName", null);
        setIntField(term711661, term711661.getClass(), "baseLineno", 0);
        setIntField(term711661, term711661.getClass(), "endLineno", 0);
        setField(term711661, term711661.getClass(), "functions", null);
        setField(term711661, term711661.getClass(), "regexps", null);
        setField(term711661, term711661.getClass(), "itsVariables", null);
        setField(term711661, term711661.getClass(), "itsConst", null);
        setField(term711661, term711661.getClass(), "itsVariableNames", null);
        setIntField(term711661, term711661.getClass(), "varStart", 0);
        setField(term711661, term711661.getClass(), "compilerData", null);
        setIntField(term711661, term711661.getClass(), "type", 0);
        setIntField(term711671, term711671.getClass(), "type", 0);
        setField(term711671, term711671.getClass(), "next", null);
        setField(term711671, term711671.getClass(), "first", null);
        setField(term711671, term711671.getClass(), "last", null);
        setField(term711671, term711671.getClass(), "propListHead", null);
        setIntField(term711671, term711671.getClass(), "sourcePosition", 0);
        setField(term711671, term711671.getClass(), "jsType", null);
        setField(term711671, term711671.getClass(), "parent", null);
        setField(term711661, term711661.getClass(), "next", term711671);
        setField(term711661, term711661.getClass(), "first", null);
        setField(term711661, term711661.getClass(), "last", null);
        setField(term711661, term711661.getClass(), "propListHead", null);
        setIntField(term711661, term711661.getClass(), "sourcePosition", 0);
        setField(term711661, term711661.getClass(), "jsType", null);
        setField(term711661, term711661.getClass(), "parent", null);
        setField(term711659, term711659.getClass(), "first", term711661);
        setField(term711659, term711659.getClass(), "last", null);
        setField(term711659, term711659.getClass(), "propListHead", null);
        setIntField(term711659, term711659.getClass(), "sourcePosition", 0);
        setField(term711659, term711659.getClass(), "jsType", null);
        setField(term711659, term711659.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term711488;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term711396, args);
        assertTrue(recursiveEquals(term711396, term711702));
        assertTrue(recursiveEquals(term711488, term711703));
        assertTrue(recursiveEquals(retValue, term711659));
    }

};


