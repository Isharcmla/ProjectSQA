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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term628318;
     Object term628410;
     Object term629168;
     Object term629169;
     Object term629116;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term628318 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term628410 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term628496 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term628566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term628496, term628496.getClass(), "next", term628566);
        setField(term628410, term628410.getClass(), "first", term628496);
        setIntField(term628410, term628410.getClass(), "type", 46);
        term629168 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term629168, term629168.getClass(), "currentTraversal", null);
        term629169 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term629170 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term629171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term629169, term629169.getClass(), "number", 0.0);
        setIntField(term629169, term629169.getClass(), "type", 46);
        setField(term629169, term629169.getClass(), "next", null);
        setField(term629170, term629170.getClass(), "functionName", null);
        setBooleanField(term629170, term629170.getClass(), "itsNeedsActivation", false);
        setIntField(term629170, term629170.getClass(), "itsFunctionType", 0);
        setBooleanField(term629170, term629170.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term629170, term629170.getClass(), "encodedSourceStart", 0);
        setIntField(term629170, term629170.getClass(), "encodedSourceEnd", 0);
        setField(term629170, term629170.getClass(), "sourceName", null);
        setIntField(term629170, term629170.getClass(), "baseLineno", 0);
        setIntField(term629170, term629170.getClass(), "endLineno", 0);
        setField(term629170, term629170.getClass(), "functions", null);
        setField(term629170, term629170.getClass(), "regexps", null);
        setField(term629170, term629170.getClass(), "itsVariables", null);
        setField(term629170, term629170.getClass(), "itsConst", null);
        setField(term629170, term629170.getClass(), "itsVariableNames", null);
        setIntField(term629170, term629170.getClass(), "varStart", 0);
        setField(term629170, term629170.getClass(), "compilerData", null);
        setIntField(term629170, term629170.getClass(), "type", 0);
        setIntField(term629171, term629171.getClass(), "type", 0);
        setField(term629171, term629171.getClass(), "next", null);
        setField(term629171, term629171.getClass(), "first", null);
        setField(term629171, term629171.getClass(), "last", null);
        setField(term629171, term629171.getClass(), "propListHead", null);
        setIntField(term629171, term629171.getClass(), "sourcePosition", 0);
        setField(term629171, term629171.getClass(), "jsType", null);
        setField(term629171, term629171.getClass(), "parent", null);
        setField(term629170, term629170.getClass(), "next", term629171);
        setField(term629170, term629170.getClass(), "first", null);
        setField(term629170, term629170.getClass(), "last", null);
        setField(term629170, term629170.getClass(), "propListHead", null);
        setIntField(term629170, term629170.getClass(), "sourcePosition", 0);
        setField(term629170, term629170.getClass(), "jsType", null);
        setField(term629170, term629170.getClass(), "parent", null);
        setField(term629169, term629169.getClass(), "first", term629170);
        setField(term629169, term629169.getClass(), "last", null);
        setField(term629169, term629169.getClass(), "propListHead", null);
        setIntField(term629169, term629169.getClass(), "sourcePosition", 0);
        setField(term629169, term629169.getClass(), "jsType", null);
        setField(term629169, term629169.getClass(), "parent", null);
        term629116 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term629119 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term629129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term629116, term629116.getClass(), "number", 0.0);
        setIntField(term629116, term629116.getClass(), "type", 46);
        setField(term629116, term629116.getClass(), "next", null);
        setField(term629119, term629119.getClass(), "functionName", null);
        setBooleanField(term629119, term629119.getClass(), "itsNeedsActivation", false);
        setIntField(term629119, term629119.getClass(), "itsFunctionType", 0);
        setBooleanField(term629119, term629119.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term629119, term629119.getClass(), "encodedSourceStart", 0);
        setIntField(term629119, term629119.getClass(), "encodedSourceEnd", 0);
        setField(term629119, term629119.getClass(), "sourceName", null);
        setIntField(term629119, term629119.getClass(), "baseLineno", 0);
        setIntField(term629119, term629119.getClass(), "endLineno", 0);
        setField(term629119, term629119.getClass(), "functions", null);
        setField(term629119, term629119.getClass(), "regexps", null);
        setField(term629119, term629119.getClass(), "itsVariables", null);
        setField(term629119, term629119.getClass(), "itsConst", null);
        setField(term629119, term629119.getClass(), "itsVariableNames", null);
        setIntField(term629119, term629119.getClass(), "varStart", 0);
        setField(term629119, term629119.getClass(), "compilerData", null);
        setIntField(term629119, term629119.getClass(), "type", 0);
        setIntField(term629129, term629129.getClass(), "type", 0);
        setField(term629129, term629129.getClass(), "next", null);
        setField(term629129, term629129.getClass(), "first", null);
        setField(term629129, term629129.getClass(), "last", null);
        setField(term629129, term629129.getClass(), "propListHead", null);
        setIntField(term629129, term629129.getClass(), "sourcePosition", 0);
        setField(term629129, term629129.getClass(), "jsType", null);
        setField(term629129, term629129.getClass(), "parent", null);
        setField(term629119, term629119.getClass(), "next", term629129);
        setField(term629119, term629119.getClass(), "first", null);
        setField(term629119, term629119.getClass(), "last", null);
        setField(term629119, term629119.getClass(), "propListHead", null);
        setIntField(term629119, term629119.getClass(), "sourcePosition", 0);
        setField(term629119, term629119.getClass(), "jsType", null);
        setField(term629119, term629119.getClass(), "parent", null);
        setField(term629116, term629116.getClass(), "first", term629119);
        setField(term629116, term629116.getClass(), "last", null);
        setField(term629116, term629116.getClass(), "propListHead", null);
        setIntField(term629116, term629116.getClass(), "sourcePosition", 0);
        setField(term629116, term629116.getClass(), "jsType", null);
        setField(term629116, term629116.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term628410;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term628318, args);
        assertTrue(recursiveEquals(term628318, term629168));
        assertTrue(recursiveEquals(term628410, term629169));
        assertTrue(recursiveEquals(retValue, term629116));
    }

};


