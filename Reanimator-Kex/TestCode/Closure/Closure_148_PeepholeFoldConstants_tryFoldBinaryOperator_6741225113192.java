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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term947552;
     Object term947644;
     Object term948231;
     Object term948232;
     Object term948180;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term947552 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term947644 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term947730 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term947800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term947730, term947730.getClass(), "next", term947800);
        setIntField(term947730, term947730.getClass(), "type", 39);
        setField(term947644, term947644.getClass(), "first", term947730);
        setIntField(term947644, term947644.getClass(), "type", 11);
        term948231 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term948231, term948231.getClass(), "currentTraversal", null);
        term948232 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term948233 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term948234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term948232, term948232.getClass(), "number", 0.0);
        setIntField(term948232, term948232.getClass(), "type", 11);
        setField(term948232, term948232.getClass(), "next", null);
        setField(term948233, term948233.getClass(), "functionName", null);
        setBooleanField(term948233, term948233.getClass(), "itsNeedsActivation", false);
        setIntField(term948233, term948233.getClass(), "itsFunctionType", 0);
        setBooleanField(term948233, term948233.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term948233, term948233.getClass(), "encodedSourceStart", 0);
        setIntField(term948233, term948233.getClass(), "encodedSourceEnd", 0);
        setField(term948233, term948233.getClass(), "sourceName", null);
        setIntField(term948233, term948233.getClass(), "baseLineno", 0);
        setIntField(term948233, term948233.getClass(), "endLineno", 0);
        setField(term948233, term948233.getClass(), "functions", null);
        setField(term948233, term948233.getClass(), "regexps", null);
        setField(term948233, term948233.getClass(), "itsVariables", null);
        setField(term948233, term948233.getClass(), "itsConst", null);
        setField(term948233, term948233.getClass(), "itsVariableNames", null);
        setIntField(term948233, term948233.getClass(), "varStart", 0);
        setField(term948233, term948233.getClass(), "compilerData", null);
        setIntField(term948233, term948233.getClass(), "type", 39);
        setIntField(term948234, term948234.getClass(), "type", 0);
        setField(term948234, term948234.getClass(), "next", null);
        setField(term948234, term948234.getClass(), "first", null);
        setField(term948234, term948234.getClass(), "last", null);
        setField(term948234, term948234.getClass(), "propListHead", null);
        setIntField(term948234, term948234.getClass(), "sourcePosition", 0);
        setField(term948234, term948234.getClass(), "jsType", null);
        setField(term948234, term948234.getClass(), "parent", null);
        setField(term948233, term948233.getClass(), "next", term948234);
        setField(term948233, term948233.getClass(), "first", null);
        setField(term948233, term948233.getClass(), "last", null);
        setField(term948233, term948233.getClass(), "propListHead", null);
        setIntField(term948233, term948233.getClass(), "sourcePosition", 0);
        setField(term948233, term948233.getClass(), "jsType", null);
        setField(term948233, term948233.getClass(), "parent", null);
        setField(term948232, term948232.getClass(), "first", term948233);
        setField(term948232, term948232.getClass(), "last", null);
        setField(term948232, term948232.getClass(), "propListHead", null);
        setIntField(term948232, term948232.getClass(), "sourcePosition", 0);
        setField(term948232, term948232.getClass(), "jsType", null);
        setField(term948232, term948232.getClass(), "parent", null);
        term948180 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term948183 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term948193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term948180, term948180.getClass(), "number", 0.0);
        setIntField(term948180, term948180.getClass(), "type", 11);
        setField(term948180, term948180.getClass(), "next", null);
        setField(term948183, term948183.getClass(), "functionName", null);
        setBooleanField(term948183, term948183.getClass(), "itsNeedsActivation", false);
        setIntField(term948183, term948183.getClass(), "itsFunctionType", 0);
        setBooleanField(term948183, term948183.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term948183, term948183.getClass(), "encodedSourceStart", 0);
        setIntField(term948183, term948183.getClass(), "encodedSourceEnd", 0);
        setField(term948183, term948183.getClass(), "sourceName", null);
        setIntField(term948183, term948183.getClass(), "baseLineno", 0);
        setIntField(term948183, term948183.getClass(), "endLineno", 0);
        setField(term948183, term948183.getClass(), "functions", null);
        setField(term948183, term948183.getClass(), "regexps", null);
        setField(term948183, term948183.getClass(), "itsVariables", null);
        setField(term948183, term948183.getClass(), "itsConst", null);
        setField(term948183, term948183.getClass(), "itsVariableNames", null);
        setIntField(term948183, term948183.getClass(), "varStart", 0);
        setField(term948183, term948183.getClass(), "compilerData", null);
        setIntField(term948183, term948183.getClass(), "type", 39);
        setIntField(term948193, term948193.getClass(), "type", 0);
        setField(term948193, term948193.getClass(), "next", null);
        setField(term948193, term948193.getClass(), "first", null);
        setField(term948193, term948193.getClass(), "last", null);
        setField(term948193, term948193.getClass(), "propListHead", null);
        setIntField(term948193, term948193.getClass(), "sourcePosition", 0);
        setField(term948193, term948193.getClass(), "jsType", null);
        setField(term948193, term948193.getClass(), "parent", null);
        setField(term948183, term948183.getClass(), "next", term948193);
        setField(term948183, term948183.getClass(), "first", null);
        setField(term948183, term948183.getClass(), "last", null);
        setField(term948183, term948183.getClass(), "propListHead", null);
        setIntField(term948183, term948183.getClass(), "sourcePosition", 0);
        setField(term948183, term948183.getClass(), "jsType", null);
        setField(term948183, term948183.getClass(), "parent", null);
        setField(term948180, term948180.getClass(), "first", term948183);
        setField(term948180, term948180.getClass(), "last", null);
        setField(term948180, term948180.getClass(), "propListHead", null);
        setIntField(term948180, term948180.getClass(), "sourcePosition", 0);
        setField(term948180, term948180.getClass(), "jsType", null);
        setField(term948180, term948180.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term947644;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term947552, args);
        assertTrue(recursiveEquals(term947552, term948231));
        assertTrue(recursiveEquals(term947644, term948232));
        assertTrue(recursiveEquals(retValue, term948180));
    }

};


