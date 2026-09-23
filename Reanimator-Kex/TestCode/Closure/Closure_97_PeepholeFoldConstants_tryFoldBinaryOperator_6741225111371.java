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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465403;
     Object term465473;
     Object term516918;
     Object term516919;
     Object term516817;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term465403 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term465473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term465543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term465613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term465699 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term465613, term465613.getClass(), "first", term465699);
        setField(term465543, term465543.getClass(), "next", term465613);
        setField(term465473, term465473.getClass(), "first", term465543);
        setIntField(term465473, term465473.getClass(), "type", 86);
        term516918 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term516918, term516918.getClass(), "currentTraversal", null);
        term516919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term516920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term516921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term516922 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term516919, term516919.getClass(), "type", 86);
        setField(term516919, term516919.getClass(), "next", null);
        setIntField(term516920, term516920.getClass(), "type", 0);
        setIntField(term516921, term516921.getClass(), "type", 0);
        setField(term516921, term516921.getClass(), "next", null);
        setField(term516922, term516922.getClass(), "functionName", null);
        setBooleanField(term516922, term516922.getClass(), "itsNeedsActivation", false);
        setIntField(term516922, term516922.getClass(), "itsFunctionType", 0);
        setBooleanField(term516922, term516922.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term516922, term516922.getClass(), "encodedSourceStart", 0);
        setIntField(term516922, term516922.getClass(), "encodedSourceEnd", 0);
        setField(term516922, term516922.getClass(), "sourceName", null);
        setIntField(term516922, term516922.getClass(), "baseLineno", 0);
        setIntField(term516922, term516922.getClass(), "endLineno", 0);
        setField(term516922, term516922.getClass(), "functions", null);
        setField(term516922, term516922.getClass(), "regexps", null);
        setField(term516922, term516922.getClass(), "itsVariables", null);
        setField(term516922, term516922.getClass(), "itsConst", null);
        setField(term516922, term516922.getClass(), "itsVariableNames", null);
        setIntField(term516922, term516922.getClass(), "varStart", 0);
        setField(term516922, term516922.getClass(), "compilerData", null);
        setIntField(term516922, term516922.getClass(), "type", 0);
        setField(term516922, term516922.getClass(), "next", null);
        setField(term516922, term516922.getClass(), "first", null);
        setField(term516922, term516922.getClass(), "last", null);
        setField(term516922, term516922.getClass(), "propListHead", null);
        setIntField(term516922, term516922.getClass(), "sourcePosition", 0);
        setField(term516922, term516922.getClass(), "jsType", null);
        setField(term516922, term516922.getClass(), "parent", null);
        setField(term516921, term516921.getClass(), "first", term516922);
        setField(term516921, term516921.getClass(), "last", null);
        setField(term516921, term516921.getClass(), "propListHead", null);
        setIntField(term516921, term516921.getClass(), "sourcePosition", 0);
        setField(term516921, term516921.getClass(), "jsType", null);
        setField(term516921, term516921.getClass(), "parent", null);
        setField(term516920, term516920.getClass(), "next", term516921);
        setField(term516920, term516920.getClass(), "first", null);
        setField(term516920, term516920.getClass(), "last", null);
        setField(term516920, term516920.getClass(), "propListHead", null);
        setIntField(term516920, term516920.getClass(), "sourcePosition", 0);
        setField(term516920, term516920.getClass(), "jsType", null);
        setField(term516920, term516920.getClass(), "parent", null);
        setField(term516919, term516919.getClass(), "first", term516920);
        setField(term516919, term516919.getClass(), "last", null);
        setField(term516919, term516919.getClass(), "propListHead", null);
        setIntField(term516919, term516919.getClass(), "sourcePosition", 0);
        setField(term516919, term516919.getClass(), "jsType", null);
        setField(term516919, term516919.getClass(), "parent", null);
        term516817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term516819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term516821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term516823 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term516817, term516817.getClass(), "type", 86);
        setField(term516817, term516817.getClass(), "next", null);
        setIntField(term516819, term516819.getClass(), "type", 0);
        setIntField(term516821, term516821.getClass(), "type", 0);
        setField(term516821, term516821.getClass(), "next", null);
        setField(term516823, term516823.getClass(), "functionName", null);
        setBooleanField(term516823, term516823.getClass(), "itsNeedsActivation", false);
        setIntField(term516823, term516823.getClass(), "itsFunctionType", 0);
        setBooleanField(term516823, term516823.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term516823, term516823.getClass(), "encodedSourceStart", 0);
        setIntField(term516823, term516823.getClass(), "encodedSourceEnd", 0);
        setField(term516823, term516823.getClass(), "sourceName", null);
        setIntField(term516823, term516823.getClass(), "baseLineno", 0);
        setIntField(term516823, term516823.getClass(), "endLineno", 0);
        setField(term516823, term516823.getClass(), "functions", null);
        setField(term516823, term516823.getClass(), "regexps", null);
        setField(term516823, term516823.getClass(), "itsVariables", null);
        setField(term516823, term516823.getClass(), "itsConst", null);
        setField(term516823, term516823.getClass(), "itsVariableNames", null);
        setIntField(term516823, term516823.getClass(), "varStart", 0);
        setField(term516823, term516823.getClass(), "compilerData", null);
        setIntField(term516823, term516823.getClass(), "type", 0);
        setField(term516823, term516823.getClass(), "next", null);
        setField(term516823, term516823.getClass(), "first", null);
        setField(term516823, term516823.getClass(), "last", null);
        setField(term516823, term516823.getClass(), "propListHead", null);
        setIntField(term516823, term516823.getClass(), "sourcePosition", 0);
        setField(term516823, term516823.getClass(), "jsType", null);
        setField(term516823, term516823.getClass(), "parent", null);
        setField(term516821, term516821.getClass(), "first", term516823);
        setField(term516821, term516821.getClass(), "last", null);
        setField(term516821, term516821.getClass(), "propListHead", null);
        setIntField(term516821, term516821.getClass(), "sourcePosition", 0);
        setField(term516821, term516821.getClass(), "jsType", null);
        setField(term516821, term516821.getClass(), "parent", null);
        setField(term516819, term516819.getClass(), "next", term516821);
        setField(term516819, term516819.getClass(), "first", null);
        setField(term516819, term516819.getClass(), "last", null);
        setField(term516819, term516819.getClass(), "propListHead", null);
        setIntField(term516819, term516819.getClass(), "sourcePosition", 0);
        setField(term516819, term516819.getClass(), "jsType", null);
        setField(term516819, term516819.getClass(), "parent", null);
        setField(term516817, term516817.getClass(), "first", term516819);
        setField(term516817, term516817.getClass(), "last", null);
        setField(term516817, term516817.getClass(), "propListHead", null);
        setIntField(term516817, term516817.getClass(), "sourcePosition", 0);
        setField(term516817, term516817.getClass(), "jsType", null);
        setField(term516817, term516817.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term465473;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term465403, args);
        assertTrue(recursiveEquals(term465403, term516918));
        assertTrue(recursiveEquals(term465473, term516919));
        assertTrue(recursiveEquals(retValue, term516817));
    }

};


