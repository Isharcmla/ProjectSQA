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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267356;
     Object term267448;
     Object term267688;
     Object term267689;
     Object term267619;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267356 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term267448 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term267534 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term267604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term267534, term267534.getClass(), "next", term267604);
        setField(term267448, term267448.getClass(), "first", term267534);
        setIntField(term267448, term267448.getClass(), "type", 101);
        term267688 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term267688, term267688.getClass(), "currentTraversal", null);
        term267689 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term267690 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term267691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term267689, term267689.getClass(), "str", null);
        setIntField(term267689, term267689.getClass(), "type", 101);
        setField(term267689, term267689.getClass(), "next", null);
        setField(term267690, term267690.getClass(), "functionName", null);
        setBooleanField(term267690, term267690.getClass(), "itsNeedsActivation", false);
        setIntField(term267690, term267690.getClass(), "itsFunctionType", 0);
        setBooleanField(term267690, term267690.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term267690, term267690.getClass(), "encodedSourceStart", 0);
        setIntField(term267690, term267690.getClass(), "encodedSourceEnd", 0);
        setField(term267690, term267690.getClass(), "sourceName", null);
        setIntField(term267690, term267690.getClass(), "baseLineno", 0);
        setIntField(term267690, term267690.getClass(), "endLineno", 0);
        setField(term267690, term267690.getClass(), "functions", null);
        setField(term267690, term267690.getClass(), "regexps", null);
        setField(term267690, term267690.getClass(), "itsVariables", null);
        setField(term267690, term267690.getClass(), "itsConst", null);
        setField(term267690, term267690.getClass(), "itsVariableNames", null);
        setIntField(term267690, term267690.getClass(), "varStart", 0);
        setField(term267690, term267690.getClass(), "compilerData", null);
        setIntField(term267690, term267690.getClass(), "type", 0);
        setIntField(term267691, term267691.getClass(), "type", 0);
        setField(term267691, term267691.getClass(), "next", null);
        setField(term267691, term267691.getClass(), "first", null);
        setField(term267691, term267691.getClass(), "last", null);
        setField(term267691, term267691.getClass(), "propListHead", null);
        setIntField(term267691, term267691.getClass(), "sourcePosition", 0);
        setField(term267691, term267691.getClass(), "jsType", null);
        setField(term267691, term267691.getClass(), "parent", null);
        setField(term267690, term267690.getClass(), "next", term267691);
        setField(term267690, term267690.getClass(), "first", null);
        setField(term267690, term267690.getClass(), "last", null);
        setField(term267690, term267690.getClass(), "propListHead", null);
        setIntField(term267690, term267690.getClass(), "sourcePosition", 0);
        setField(term267690, term267690.getClass(), "jsType", null);
        setField(term267690, term267690.getClass(), "parent", null);
        setField(term267689, term267689.getClass(), "first", term267690);
        setField(term267689, term267689.getClass(), "last", null);
        setField(term267689, term267689.getClass(), "propListHead", null);
        setIntField(term267689, term267689.getClass(), "sourcePosition", 0);
        setField(term267689, term267689.getClass(), "jsType", null);
        setField(term267689, term267689.getClass(), "parent", null);
        term267619 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term267621 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term267631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term267619, term267619.getClass(), "str", null);
        setIntField(term267619, term267619.getClass(), "type", 101);
        setField(term267619, term267619.getClass(), "next", null);
        setField(term267621, term267621.getClass(), "functionName", null);
        setBooleanField(term267621, term267621.getClass(), "itsNeedsActivation", false);
        setIntField(term267621, term267621.getClass(), "itsFunctionType", 0);
        setBooleanField(term267621, term267621.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term267621, term267621.getClass(), "encodedSourceStart", 0);
        setIntField(term267621, term267621.getClass(), "encodedSourceEnd", 0);
        setField(term267621, term267621.getClass(), "sourceName", null);
        setIntField(term267621, term267621.getClass(), "baseLineno", 0);
        setIntField(term267621, term267621.getClass(), "endLineno", 0);
        setField(term267621, term267621.getClass(), "functions", null);
        setField(term267621, term267621.getClass(), "regexps", null);
        setField(term267621, term267621.getClass(), "itsVariables", null);
        setField(term267621, term267621.getClass(), "itsConst", null);
        setField(term267621, term267621.getClass(), "itsVariableNames", null);
        setIntField(term267621, term267621.getClass(), "varStart", 0);
        setField(term267621, term267621.getClass(), "compilerData", null);
        setIntField(term267621, term267621.getClass(), "type", 0);
        setIntField(term267631, term267631.getClass(), "type", 0);
        setField(term267631, term267631.getClass(), "next", null);
        setField(term267631, term267631.getClass(), "first", null);
        setField(term267631, term267631.getClass(), "last", null);
        setField(term267631, term267631.getClass(), "propListHead", null);
        setIntField(term267631, term267631.getClass(), "sourcePosition", 0);
        setField(term267631, term267631.getClass(), "jsType", null);
        setField(term267631, term267631.getClass(), "parent", null);
        setField(term267621, term267621.getClass(), "next", term267631);
        setField(term267621, term267621.getClass(), "first", null);
        setField(term267621, term267621.getClass(), "last", null);
        setField(term267621, term267621.getClass(), "propListHead", null);
        setIntField(term267621, term267621.getClass(), "sourcePosition", 0);
        setField(term267621, term267621.getClass(), "jsType", null);
        setField(term267621, term267621.getClass(), "parent", null);
        setField(term267619, term267619.getClass(), "first", term267621);
        setField(term267619, term267619.getClass(), "last", null);
        setField(term267619, term267619.getClass(), "propListHead", null);
        setIntField(term267619, term267619.getClass(), "sourcePosition", 0);
        setField(term267619, term267619.getClass(), "jsType", null);
        setField(term267619, term267619.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term267448;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term267356, args);
        assertTrue(recursiveEquals(term267356, term267688));
        assertTrue(recursiveEquals(term267448, term267689));
        assertTrue(recursiveEquals(retValue, term267619));
    }

};


