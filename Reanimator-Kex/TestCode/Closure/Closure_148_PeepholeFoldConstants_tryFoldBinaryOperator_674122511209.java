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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39919;
     Object term40005;
     Object term40444;
     Object term40445;
     Object term40407;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39919 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term40005 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term40075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40005, term40005.getClass(), "first", term40005);
        setField(term40005, term40005.getClass(), "next", term40075);
        setIntField(term40005, term40005.getClass(), "type", 22);
        term40444 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term40444, term40444.getClass(), "currentTraversal", null);
        term40445 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term40446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40445, term40445.getClass(), "functionName", null);
        setBooleanField(term40445, term40445.getClass(), "itsNeedsActivation", false);
        setIntField(term40445, term40445.getClass(), "itsFunctionType", 0);
        setBooleanField(term40445, term40445.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term40445, term40445.getClass(), "encodedSourceStart", 0);
        setIntField(term40445, term40445.getClass(), "encodedSourceEnd", 0);
        setField(term40445, term40445.getClass(), "sourceName", null);
        setIntField(term40445, term40445.getClass(), "baseLineno", 0);
        setIntField(term40445, term40445.getClass(), "endLineno", 0);
        setField(term40445, term40445.getClass(), "functions", null);
        setField(term40445, term40445.getClass(), "regexps", null);
        setField(term40445, term40445.getClass(), "itsVariables", null);
        setField(term40445, term40445.getClass(), "itsConst", null);
        setField(term40445, term40445.getClass(), "itsVariableNames", null);
        setIntField(term40445, term40445.getClass(), "varStart", 0);
        setField(term40445, term40445.getClass(), "compilerData", null);
        setIntField(term40445, term40445.getClass(), "type", 22);
        setIntField(term40446, term40446.getClass(), "type", 0);
        setField(term40446, term40446.getClass(), "next", null);
        setField(term40446, term40446.getClass(), "first", null);
        setField(term40446, term40446.getClass(), "last", null);
        setField(term40446, term40446.getClass(), "propListHead", null);
        setIntField(term40446, term40446.getClass(), "sourcePosition", 0);
        setField(term40446, term40446.getClass(), "jsType", null);
        setField(term40446, term40446.getClass(), "parent", null);
        setField(term40445, term40445.getClass(), "next", term40446);
        setField(term40445, term40445.getClass(), "first", term40445);
        setField(term40445, term40445.getClass(), "last", null);
        setField(term40445, term40445.getClass(), "propListHead", null);
        setIntField(term40445, term40445.getClass(), "sourcePosition", 0);
        setField(term40445, term40445.getClass(), "jsType", null);
        setField(term40445, term40445.getClass(), "parent", null);
        term40407 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term40417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40407, term40407.getClass(), "functionName", null);
        setBooleanField(term40407, term40407.getClass(), "itsNeedsActivation", false);
        setIntField(term40407, term40407.getClass(), "itsFunctionType", 0);
        setBooleanField(term40407, term40407.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term40407, term40407.getClass(), "encodedSourceStart", 0);
        setIntField(term40407, term40407.getClass(), "encodedSourceEnd", 0);
        setField(term40407, term40407.getClass(), "sourceName", null);
        setIntField(term40407, term40407.getClass(), "baseLineno", 0);
        setIntField(term40407, term40407.getClass(), "endLineno", 0);
        setField(term40407, term40407.getClass(), "functions", null);
        setField(term40407, term40407.getClass(), "regexps", null);
        setField(term40407, term40407.getClass(), "itsVariables", null);
        setField(term40407, term40407.getClass(), "itsConst", null);
        setField(term40407, term40407.getClass(), "itsVariableNames", null);
        setIntField(term40407, term40407.getClass(), "varStart", 0);
        setField(term40407, term40407.getClass(), "compilerData", null);
        setIntField(term40407, term40407.getClass(), "type", 22);
        setIntField(term40417, term40417.getClass(), "type", 0);
        setField(term40417, term40417.getClass(), "next", null);
        setField(term40417, term40417.getClass(), "first", null);
        setField(term40417, term40417.getClass(), "last", null);
        setField(term40417, term40417.getClass(), "propListHead", null);
        setIntField(term40417, term40417.getClass(), "sourcePosition", 0);
        setField(term40417, term40417.getClass(), "jsType", null);
        setField(term40417, term40417.getClass(), "parent", null);
        setField(term40407, term40407.getClass(), "next", term40417);
        setField(term40407, term40407.getClass(), "first", term40407);
        setField(term40407, term40407.getClass(), "last", null);
        setField(term40407, term40407.getClass(), "propListHead", null);
        setIntField(term40407, term40407.getClass(), "sourcePosition", 0);
        setField(term40407, term40407.getClass(), "jsType", null);
        setField(term40407, term40407.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40005;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term39919, args);
        assertTrue(recursiveEquals(term39919, term40444));
        assertTrue(recursiveEquals(term40005, term40445));
        assertTrue(recursiveEquals(retValue, term40407));
    }

};


