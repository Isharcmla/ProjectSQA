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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471502;
     Object term471588;
     Object term518015;
     Object term518016;
     Object term517956;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471502 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term471588 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term471674 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term471744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term471674, term471674.getClass(), "next", term471744);
        setField(term471588, term471588.getClass(), "first", term471674);
        setIntField(term471588, term471588.getClass(), "type", 22);
        term518015 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term518015, term518015.getClass(), "currentTraversal", null);
        term518016 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term518017 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term518018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term518016, term518016.getClass(), "functionName", null);
        setBooleanField(term518016, term518016.getClass(), "itsNeedsActivation", false);
        setIntField(term518016, term518016.getClass(), "itsFunctionType", 0);
        setBooleanField(term518016, term518016.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term518016, term518016.getClass(), "encodedSourceStart", 0);
        setIntField(term518016, term518016.getClass(), "encodedSourceEnd", 0);
        setField(term518016, term518016.getClass(), "sourceName", null);
        setIntField(term518016, term518016.getClass(), "baseLineno", 0);
        setIntField(term518016, term518016.getClass(), "endLineno", 0);
        setField(term518016, term518016.getClass(), "functions", null);
        setField(term518016, term518016.getClass(), "regexps", null);
        setField(term518016, term518016.getClass(), "itsVariables", null);
        setField(term518016, term518016.getClass(), "itsConst", null);
        setField(term518016, term518016.getClass(), "itsVariableNames", null);
        setIntField(term518016, term518016.getClass(), "varStart", 0);
        setField(term518016, term518016.getClass(), "compilerData", null);
        setIntField(term518016, term518016.getClass(), "type", 22);
        setField(term518016, term518016.getClass(), "next", null);
        setField(term518017, term518017.getClass(), "functionName", null);
        setBooleanField(term518017, term518017.getClass(), "itsNeedsActivation", false);
        setIntField(term518017, term518017.getClass(), "itsFunctionType", 0);
        setBooleanField(term518017, term518017.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term518017, term518017.getClass(), "encodedSourceStart", 0);
        setIntField(term518017, term518017.getClass(), "encodedSourceEnd", 0);
        setField(term518017, term518017.getClass(), "sourceName", null);
        setIntField(term518017, term518017.getClass(), "baseLineno", 0);
        setIntField(term518017, term518017.getClass(), "endLineno", 0);
        setField(term518017, term518017.getClass(), "functions", null);
        setField(term518017, term518017.getClass(), "regexps", null);
        setField(term518017, term518017.getClass(), "itsVariables", null);
        setField(term518017, term518017.getClass(), "itsConst", null);
        setField(term518017, term518017.getClass(), "itsVariableNames", null);
        setIntField(term518017, term518017.getClass(), "varStart", 0);
        setField(term518017, term518017.getClass(), "compilerData", null);
        setIntField(term518017, term518017.getClass(), "type", 0);
        setIntField(term518018, term518018.getClass(), "type", 0);
        setField(term518018, term518018.getClass(), "next", null);
        setField(term518018, term518018.getClass(), "first", null);
        setField(term518018, term518018.getClass(), "last", null);
        setField(term518018, term518018.getClass(), "propListHead", null);
        setIntField(term518018, term518018.getClass(), "sourcePosition", 0);
        setField(term518018, term518018.getClass(), "jsType", null);
        setField(term518018, term518018.getClass(), "parent", null);
        setField(term518017, term518017.getClass(), "next", term518018);
        setField(term518017, term518017.getClass(), "first", null);
        setField(term518017, term518017.getClass(), "last", null);
        setField(term518017, term518017.getClass(), "propListHead", null);
        setIntField(term518017, term518017.getClass(), "sourcePosition", 0);
        setField(term518017, term518017.getClass(), "jsType", null);
        setField(term518017, term518017.getClass(), "parent", null);
        setField(term518016, term518016.getClass(), "first", term518017);
        setField(term518016, term518016.getClass(), "last", null);
        setField(term518016, term518016.getClass(), "propListHead", null);
        setIntField(term518016, term518016.getClass(), "sourcePosition", 0);
        setField(term518016, term518016.getClass(), "jsType", null);
        setField(term518016, term518016.getClass(), "parent", null);
        term517956 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term517966 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term517976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term517956, term517956.getClass(), "functionName", null);
        setBooleanField(term517956, term517956.getClass(), "itsNeedsActivation", false);
        setIntField(term517956, term517956.getClass(), "itsFunctionType", 0);
        setBooleanField(term517956, term517956.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term517956, term517956.getClass(), "encodedSourceStart", 0);
        setIntField(term517956, term517956.getClass(), "encodedSourceEnd", 0);
        setField(term517956, term517956.getClass(), "sourceName", null);
        setIntField(term517956, term517956.getClass(), "baseLineno", 0);
        setIntField(term517956, term517956.getClass(), "endLineno", 0);
        setField(term517956, term517956.getClass(), "functions", null);
        setField(term517956, term517956.getClass(), "regexps", null);
        setField(term517956, term517956.getClass(), "itsVariables", null);
        setField(term517956, term517956.getClass(), "itsConst", null);
        setField(term517956, term517956.getClass(), "itsVariableNames", null);
        setIntField(term517956, term517956.getClass(), "varStart", 0);
        setField(term517956, term517956.getClass(), "compilerData", null);
        setIntField(term517956, term517956.getClass(), "type", 22);
        setField(term517956, term517956.getClass(), "next", null);
        setField(term517966, term517966.getClass(), "functionName", null);
        setBooleanField(term517966, term517966.getClass(), "itsNeedsActivation", false);
        setIntField(term517966, term517966.getClass(), "itsFunctionType", 0);
        setBooleanField(term517966, term517966.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term517966, term517966.getClass(), "encodedSourceStart", 0);
        setIntField(term517966, term517966.getClass(), "encodedSourceEnd", 0);
        setField(term517966, term517966.getClass(), "sourceName", null);
        setIntField(term517966, term517966.getClass(), "baseLineno", 0);
        setIntField(term517966, term517966.getClass(), "endLineno", 0);
        setField(term517966, term517966.getClass(), "functions", null);
        setField(term517966, term517966.getClass(), "regexps", null);
        setField(term517966, term517966.getClass(), "itsVariables", null);
        setField(term517966, term517966.getClass(), "itsConst", null);
        setField(term517966, term517966.getClass(), "itsVariableNames", null);
        setIntField(term517966, term517966.getClass(), "varStart", 0);
        setField(term517966, term517966.getClass(), "compilerData", null);
        setIntField(term517966, term517966.getClass(), "type", 0);
        setIntField(term517976, term517976.getClass(), "type", 0);
        setField(term517976, term517976.getClass(), "next", null);
        setField(term517976, term517976.getClass(), "first", null);
        setField(term517976, term517976.getClass(), "last", null);
        setField(term517976, term517976.getClass(), "propListHead", null);
        setIntField(term517976, term517976.getClass(), "sourcePosition", 0);
        setField(term517976, term517976.getClass(), "jsType", null);
        setField(term517976, term517976.getClass(), "parent", null);
        setField(term517966, term517966.getClass(), "next", term517976);
        setField(term517966, term517966.getClass(), "first", null);
        setField(term517966, term517966.getClass(), "last", null);
        setField(term517966, term517966.getClass(), "propListHead", null);
        setIntField(term517966, term517966.getClass(), "sourcePosition", 0);
        setField(term517966, term517966.getClass(), "jsType", null);
        setField(term517966, term517966.getClass(), "parent", null);
        setField(term517956, term517956.getClass(), "first", term517966);
        setField(term517956, term517956.getClass(), "last", null);
        setField(term517956, term517956.getClass(), "propListHead", null);
        setIntField(term517956, term517956.getClass(), "sourcePosition", 0);
        setField(term517956, term517956.getClass(), "jsType", null);
        setField(term517956, term517956.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term471588;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term471502, args);
        assertTrue(recursiveEquals(term471502, term518015));
        assertTrue(recursiveEquals(term471588, term518016));
        assertTrue(recursiveEquals(retValue, term517956));
    }

};


