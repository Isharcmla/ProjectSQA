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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396540;
     Object term396626;
     Object term397353;
     Object term397354;
     Object term397276;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term396540 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term396626 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term396712 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term396804 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term396712, term396712.getClass(), "next", term396804);
        setIntField(term396712, term396712.getClass(), "type", 16);
        setField(term396626, term396626.getClass(), "first", term396712);
        setIntField(term396626, term396626.getClass(), "type", 16);
        term397353 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term397353, term397353.getClass(), "currentTraversal", null);
        term397354 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term397355 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term397356 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term397354, term397354.getClass(), "functionName", null);
        setBooleanField(term397354, term397354.getClass(), "itsNeedsActivation", false);
        setIntField(term397354, term397354.getClass(), "itsFunctionType", 0);
        setBooleanField(term397354, term397354.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term397354, term397354.getClass(), "encodedSourceStart", 0);
        setIntField(term397354, term397354.getClass(), "encodedSourceEnd", 0);
        setField(term397354, term397354.getClass(), "sourceName", null);
        setIntField(term397354, term397354.getClass(), "baseLineno", 0);
        setIntField(term397354, term397354.getClass(), "endLineno", 0);
        setField(term397354, term397354.getClass(), "functions", null);
        setField(term397354, term397354.getClass(), "regexps", null);
        setField(term397354, term397354.getClass(), "itsVariables", null);
        setField(term397354, term397354.getClass(), "itsConst", null);
        setField(term397354, term397354.getClass(), "itsVariableNames", null);
        setIntField(term397354, term397354.getClass(), "varStart", 0);
        setField(term397354, term397354.getClass(), "compilerData", null);
        setIntField(term397354, term397354.getClass(), "type", 16);
        setField(term397354, term397354.getClass(), "next", null);
        setField(term397355, term397355.getClass(), "functionName", null);
        setBooleanField(term397355, term397355.getClass(), "itsNeedsActivation", false);
        setIntField(term397355, term397355.getClass(), "itsFunctionType", 0);
        setBooleanField(term397355, term397355.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term397355, term397355.getClass(), "encodedSourceStart", 0);
        setIntField(term397355, term397355.getClass(), "encodedSourceEnd", 0);
        setField(term397355, term397355.getClass(), "sourceName", null);
        setIntField(term397355, term397355.getClass(), "baseLineno", 0);
        setIntField(term397355, term397355.getClass(), "endLineno", 0);
        setField(term397355, term397355.getClass(), "functions", null);
        setField(term397355, term397355.getClass(), "regexps", null);
        setField(term397355, term397355.getClass(), "itsVariables", null);
        setField(term397355, term397355.getClass(), "itsConst", null);
        setField(term397355, term397355.getClass(), "itsVariableNames", null);
        setIntField(term397355, term397355.getClass(), "varStart", 0);
        setField(term397355, term397355.getClass(), "compilerData", null);
        setIntField(term397355, term397355.getClass(), "type", 16);
        setDoubleField(term397356, term397356.getClass(), "number", 0.0);
        setIntField(term397356, term397356.getClass(), "type", 0);
        setField(term397356, term397356.getClass(), "next", null);
        setField(term397356, term397356.getClass(), "first", null);
        setField(term397356, term397356.getClass(), "last", null);
        setField(term397356, term397356.getClass(), "propListHead", null);
        setIntField(term397356, term397356.getClass(), "sourcePosition", 0);
        setField(term397356, term397356.getClass(), "jsType", null);
        setField(term397356, term397356.getClass(), "parent", null);
        setField(term397355, term397355.getClass(), "next", term397356);
        setField(term397355, term397355.getClass(), "first", null);
        setField(term397355, term397355.getClass(), "last", null);
        setField(term397355, term397355.getClass(), "propListHead", null);
        setIntField(term397355, term397355.getClass(), "sourcePosition", 0);
        setField(term397355, term397355.getClass(), "jsType", null);
        setField(term397355, term397355.getClass(), "parent", null);
        setField(term397354, term397354.getClass(), "first", term397355);
        setField(term397354, term397354.getClass(), "last", null);
        setField(term397354, term397354.getClass(), "propListHead", null);
        setIntField(term397354, term397354.getClass(), "sourcePosition", 0);
        setField(term397354, term397354.getClass(), "jsType", null);
        setField(term397354, term397354.getClass(), "parent", null);
        term397276 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term397286 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term397296 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term397276, term397276.getClass(), "functionName", null);
        setBooleanField(term397276, term397276.getClass(), "itsNeedsActivation", false);
        setIntField(term397276, term397276.getClass(), "itsFunctionType", 0);
        setBooleanField(term397276, term397276.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term397276, term397276.getClass(), "encodedSourceStart", 0);
        setIntField(term397276, term397276.getClass(), "encodedSourceEnd", 0);
        setField(term397276, term397276.getClass(), "sourceName", null);
        setIntField(term397276, term397276.getClass(), "baseLineno", 0);
        setIntField(term397276, term397276.getClass(), "endLineno", 0);
        setField(term397276, term397276.getClass(), "functions", null);
        setField(term397276, term397276.getClass(), "regexps", null);
        setField(term397276, term397276.getClass(), "itsVariables", null);
        setField(term397276, term397276.getClass(), "itsConst", null);
        setField(term397276, term397276.getClass(), "itsVariableNames", null);
        setIntField(term397276, term397276.getClass(), "varStart", 0);
        setField(term397276, term397276.getClass(), "compilerData", null);
        setIntField(term397276, term397276.getClass(), "type", 16);
        setField(term397276, term397276.getClass(), "next", null);
        setField(term397286, term397286.getClass(), "functionName", null);
        setBooleanField(term397286, term397286.getClass(), "itsNeedsActivation", false);
        setIntField(term397286, term397286.getClass(), "itsFunctionType", 0);
        setBooleanField(term397286, term397286.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term397286, term397286.getClass(), "encodedSourceStart", 0);
        setIntField(term397286, term397286.getClass(), "encodedSourceEnd", 0);
        setField(term397286, term397286.getClass(), "sourceName", null);
        setIntField(term397286, term397286.getClass(), "baseLineno", 0);
        setIntField(term397286, term397286.getClass(), "endLineno", 0);
        setField(term397286, term397286.getClass(), "functions", null);
        setField(term397286, term397286.getClass(), "regexps", null);
        setField(term397286, term397286.getClass(), "itsVariables", null);
        setField(term397286, term397286.getClass(), "itsConst", null);
        setField(term397286, term397286.getClass(), "itsVariableNames", null);
        setIntField(term397286, term397286.getClass(), "varStart", 0);
        setField(term397286, term397286.getClass(), "compilerData", null);
        setIntField(term397286, term397286.getClass(), "type", 16);
        setDoubleField(term397296, term397296.getClass(), "number", 0.0);
        setIntField(term397296, term397296.getClass(), "type", 0);
        setField(term397296, term397296.getClass(), "next", null);
        setField(term397296, term397296.getClass(), "first", null);
        setField(term397296, term397296.getClass(), "last", null);
        setField(term397296, term397296.getClass(), "propListHead", null);
        setIntField(term397296, term397296.getClass(), "sourcePosition", 0);
        setField(term397296, term397296.getClass(), "jsType", null);
        setField(term397296, term397296.getClass(), "parent", null);
        setField(term397286, term397286.getClass(), "next", term397296);
        setField(term397286, term397286.getClass(), "first", null);
        setField(term397286, term397286.getClass(), "last", null);
        setField(term397286, term397286.getClass(), "propListHead", null);
        setIntField(term397286, term397286.getClass(), "sourcePosition", 0);
        setField(term397286, term397286.getClass(), "jsType", null);
        setField(term397286, term397286.getClass(), "parent", null);
        setField(term397276, term397276.getClass(), "first", term397286);
        setField(term397276, term397276.getClass(), "last", null);
        setField(term397276, term397276.getClass(), "propListHead", null);
        setIntField(term397276, term397276.getClass(), "sourcePosition", 0);
        setField(term397276, term397276.getClass(), "jsType", null);
        setField(term397276, term397276.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term396626;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term396540, args);
        assertTrue(recursiveEquals(term396540, term397353));
        assertTrue(recursiveEquals(term396626, term397354));
        assertTrue(recursiveEquals(retValue, term397276));
    }

};


