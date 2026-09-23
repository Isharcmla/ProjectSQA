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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401521;
     Object term401613;
     Object term420514;
     Object term420515;
     Object term420453;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term401521 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term401613 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term401705 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term401791 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term401705, term401705.getClass(), "next", term401791);
        setIntField(term401705, term401705.getClass(), "type", 39);
        setField(term401613, term401613.getClass(), "first", term401705);
        setIntField(term401613, term401613.getClass(), "type", 11);
        term420514 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term420514, term420514.getClass(), "currentTraversal", null);
        term420515 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term420516 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term420517 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term420515, term420515.getClass(), "number", 0.0);
        setIntField(term420515, term420515.getClass(), "type", 11);
        setField(term420515, term420515.getClass(), "next", null);
        setDoubleField(term420516, term420516.getClass(), "number", 0.0);
        setIntField(term420516, term420516.getClass(), "type", 39);
        setField(term420517, term420517.getClass(), "functionName", null);
        setBooleanField(term420517, term420517.getClass(), "itsNeedsActivation", false);
        setIntField(term420517, term420517.getClass(), "itsFunctionType", 0);
        setBooleanField(term420517, term420517.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term420517, term420517.getClass(), "encodedSourceStart", 0);
        setIntField(term420517, term420517.getClass(), "encodedSourceEnd", 0);
        setField(term420517, term420517.getClass(), "sourceName", null);
        setIntField(term420517, term420517.getClass(), "baseLineno", 0);
        setIntField(term420517, term420517.getClass(), "endLineno", 0);
        setField(term420517, term420517.getClass(), "functions", null);
        setField(term420517, term420517.getClass(), "regexps", null);
        setField(term420517, term420517.getClass(), "itsVariables", null);
        setField(term420517, term420517.getClass(), "itsConst", null);
        setField(term420517, term420517.getClass(), "itsVariableNames", null);
        setIntField(term420517, term420517.getClass(), "varStart", 0);
        setField(term420517, term420517.getClass(), "compilerData", null);
        setIntField(term420517, term420517.getClass(), "type", 0);
        setField(term420517, term420517.getClass(), "next", null);
        setField(term420517, term420517.getClass(), "first", null);
        setField(term420517, term420517.getClass(), "last", null);
        setField(term420517, term420517.getClass(), "propListHead", null);
        setIntField(term420517, term420517.getClass(), "sourcePosition", 0);
        setField(term420517, term420517.getClass(), "jsType", null);
        setField(term420517, term420517.getClass(), "parent", null);
        setField(term420516, term420516.getClass(), "next", term420517);
        setField(term420516, term420516.getClass(), "first", null);
        setField(term420516, term420516.getClass(), "last", null);
        setField(term420516, term420516.getClass(), "propListHead", null);
        setIntField(term420516, term420516.getClass(), "sourcePosition", 0);
        setField(term420516, term420516.getClass(), "jsType", null);
        setField(term420516, term420516.getClass(), "parent", null);
        setField(term420515, term420515.getClass(), "first", term420516);
        setField(term420515, term420515.getClass(), "last", null);
        setField(term420515, term420515.getClass(), "propListHead", null);
        setIntField(term420515, term420515.getClass(), "sourcePosition", 0);
        setField(term420515, term420515.getClass(), "jsType", null);
        setField(term420515, term420515.getClass(), "parent", null);
        term420453 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term420456 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term420459 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term420453, term420453.getClass(), "number", 0.0);
        setIntField(term420453, term420453.getClass(), "type", 11);
        setField(term420453, term420453.getClass(), "next", null);
        setDoubleField(term420456, term420456.getClass(), "number", 0.0);
        setIntField(term420456, term420456.getClass(), "type", 39);
        setField(term420459, term420459.getClass(), "functionName", null);
        setBooleanField(term420459, term420459.getClass(), "itsNeedsActivation", false);
        setIntField(term420459, term420459.getClass(), "itsFunctionType", 0);
        setBooleanField(term420459, term420459.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term420459, term420459.getClass(), "encodedSourceStart", 0);
        setIntField(term420459, term420459.getClass(), "encodedSourceEnd", 0);
        setField(term420459, term420459.getClass(), "sourceName", null);
        setIntField(term420459, term420459.getClass(), "baseLineno", 0);
        setIntField(term420459, term420459.getClass(), "endLineno", 0);
        setField(term420459, term420459.getClass(), "functions", null);
        setField(term420459, term420459.getClass(), "regexps", null);
        setField(term420459, term420459.getClass(), "itsVariables", null);
        setField(term420459, term420459.getClass(), "itsConst", null);
        setField(term420459, term420459.getClass(), "itsVariableNames", null);
        setIntField(term420459, term420459.getClass(), "varStart", 0);
        setField(term420459, term420459.getClass(), "compilerData", null);
        setIntField(term420459, term420459.getClass(), "type", 0);
        setField(term420459, term420459.getClass(), "next", null);
        setField(term420459, term420459.getClass(), "first", null);
        setField(term420459, term420459.getClass(), "last", null);
        setField(term420459, term420459.getClass(), "propListHead", null);
        setIntField(term420459, term420459.getClass(), "sourcePosition", 0);
        setField(term420459, term420459.getClass(), "jsType", null);
        setField(term420459, term420459.getClass(), "parent", null);
        setField(term420456, term420456.getClass(), "next", term420459);
        setField(term420456, term420456.getClass(), "first", null);
        setField(term420456, term420456.getClass(), "last", null);
        setField(term420456, term420456.getClass(), "propListHead", null);
        setIntField(term420456, term420456.getClass(), "sourcePosition", 0);
        setField(term420456, term420456.getClass(), "jsType", null);
        setField(term420456, term420456.getClass(), "parent", null);
        setField(term420453, term420453.getClass(), "first", term420456);
        setField(term420453, term420453.getClass(), "last", null);
        setField(term420453, term420453.getClass(), "propListHead", null);
        setIntField(term420453, term420453.getClass(), "sourcePosition", 0);
        setField(term420453, term420453.getClass(), "jsType", null);
        setField(term420453, term420453.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term401613;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term401521, args);
        assertTrue(recursiveEquals(term401521, term420514));
        assertTrue(recursiveEquals(term401613, term420515));
        assertTrue(recursiveEquals(retValue, term420453));
    }

};


