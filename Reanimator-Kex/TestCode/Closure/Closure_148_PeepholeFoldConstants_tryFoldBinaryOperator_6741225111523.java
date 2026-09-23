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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380545;
     Object term380631;
     Object term381281;
     Object term381282;
     Object term381215;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term380545 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term380631 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term380717 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term380787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term380717, term380717.getClass(), "next", term380787);
        setField(term380631, term380631.getClass(), "first", term380717);
        setIntField(term380631, term380631.getClass(), "type", 15);
        term381281 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term381281, term381281.getClass(), "currentTraversal", null);
        term381282 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term381283 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term381284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term381282, term381282.getClass(), "functionName", null);
        setBooleanField(term381282, term381282.getClass(), "itsNeedsActivation", false);
        setIntField(term381282, term381282.getClass(), "itsFunctionType", 0);
        setBooleanField(term381282, term381282.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term381282, term381282.getClass(), "encodedSourceStart", 0);
        setIntField(term381282, term381282.getClass(), "encodedSourceEnd", 0);
        setField(term381282, term381282.getClass(), "sourceName", null);
        setIntField(term381282, term381282.getClass(), "baseLineno", 0);
        setIntField(term381282, term381282.getClass(), "endLineno", 0);
        setField(term381282, term381282.getClass(), "functions", null);
        setField(term381282, term381282.getClass(), "regexps", null);
        setField(term381282, term381282.getClass(), "itsVariables", null);
        setField(term381282, term381282.getClass(), "itsConst", null);
        setField(term381282, term381282.getClass(), "itsVariableNames", null);
        setIntField(term381282, term381282.getClass(), "varStart", 0);
        setField(term381282, term381282.getClass(), "compilerData", null);
        setIntField(term381282, term381282.getClass(), "type", 15);
        setField(term381282, term381282.getClass(), "next", null);
        setField(term381283, term381283.getClass(), "functionName", null);
        setBooleanField(term381283, term381283.getClass(), "itsNeedsActivation", false);
        setIntField(term381283, term381283.getClass(), "itsFunctionType", 0);
        setBooleanField(term381283, term381283.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term381283, term381283.getClass(), "encodedSourceStart", 0);
        setIntField(term381283, term381283.getClass(), "encodedSourceEnd", 0);
        setField(term381283, term381283.getClass(), "sourceName", null);
        setIntField(term381283, term381283.getClass(), "baseLineno", 0);
        setIntField(term381283, term381283.getClass(), "endLineno", 0);
        setField(term381283, term381283.getClass(), "functions", null);
        setField(term381283, term381283.getClass(), "regexps", null);
        setField(term381283, term381283.getClass(), "itsVariables", null);
        setField(term381283, term381283.getClass(), "itsConst", null);
        setField(term381283, term381283.getClass(), "itsVariableNames", null);
        setIntField(term381283, term381283.getClass(), "varStart", 0);
        setField(term381283, term381283.getClass(), "compilerData", null);
        setIntField(term381283, term381283.getClass(), "type", 0);
        setIntField(term381284, term381284.getClass(), "type", 0);
        setField(term381284, term381284.getClass(), "next", null);
        setField(term381284, term381284.getClass(), "first", null);
        setField(term381284, term381284.getClass(), "last", null);
        setField(term381284, term381284.getClass(), "propListHead", null);
        setIntField(term381284, term381284.getClass(), "sourcePosition", 0);
        setField(term381284, term381284.getClass(), "jsType", null);
        setField(term381284, term381284.getClass(), "parent", null);
        setField(term381283, term381283.getClass(), "next", term381284);
        setField(term381283, term381283.getClass(), "first", null);
        setField(term381283, term381283.getClass(), "last", null);
        setField(term381283, term381283.getClass(), "propListHead", null);
        setIntField(term381283, term381283.getClass(), "sourcePosition", 0);
        setField(term381283, term381283.getClass(), "jsType", null);
        setField(term381283, term381283.getClass(), "parent", null);
        setField(term381282, term381282.getClass(), "first", term381283);
        setField(term381282, term381282.getClass(), "last", null);
        setField(term381282, term381282.getClass(), "propListHead", null);
        setIntField(term381282, term381282.getClass(), "sourcePosition", 0);
        setField(term381282, term381282.getClass(), "jsType", null);
        setField(term381282, term381282.getClass(), "parent", null);
        term381215 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term381225 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term381235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term381215, term381215.getClass(), "functionName", null);
        setBooleanField(term381215, term381215.getClass(), "itsNeedsActivation", false);
        setIntField(term381215, term381215.getClass(), "itsFunctionType", 0);
        setBooleanField(term381215, term381215.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term381215, term381215.getClass(), "encodedSourceStart", 0);
        setIntField(term381215, term381215.getClass(), "encodedSourceEnd", 0);
        setField(term381215, term381215.getClass(), "sourceName", null);
        setIntField(term381215, term381215.getClass(), "baseLineno", 0);
        setIntField(term381215, term381215.getClass(), "endLineno", 0);
        setField(term381215, term381215.getClass(), "functions", null);
        setField(term381215, term381215.getClass(), "regexps", null);
        setField(term381215, term381215.getClass(), "itsVariables", null);
        setField(term381215, term381215.getClass(), "itsConst", null);
        setField(term381215, term381215.getClass(), "itsVariableNames", null);
        setIntField(term381215, term381215.getClass(), "varStart", 0);
        setField(term381215, term381215.getClass(), "compilerData", null);
        setIntField(term381215, term381215.getClass(), "type", 15);
        setField(term381215, term381215.getClass(), "next", null);
        setField(term381225, term381225.getClass(), "functionName", null);
        setBooleanField(term381225, term381225.getClass(), "itsNeedsActivation", false);
        setIntField(term381225, term381225.getClass(), "itsFunctionType", 0);
        setBooleanField(term381225, term381225.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term381225, term381225.getClass(), "encodedSourceStart", 0);
        setIntField(term381225, term381225.getClass(), "encodedSourceEnd", 0);
        setField(term381225, term381225.getClass(), "sourceName", null);
        setIntField(term381225, term381225.getClass(), "baseLineno", 0);
        setIntField(term381225, term381225.getClass(), "endLineno", 0);
        setField(term381225, term381225.getClass(), "functions", null);
        setField(term381225, term381225.getClass(), "regexps", null);
        setField(term381225, term381225.getClass(), "itsVariables", null);
        setField(term381225, term381225.getClass(), "itsConst", null);
        setField(term381225, term381225.getClass(), "itsVariableNames", null);
        setIntField(term381225, term381225.getClass(), "varStart", 0);
        setField(term381225, term381225.getClass(), "compilerData", null);
        setIntField(term381225, term381225.getClass(), "type", 0);
        setIntField(term381235, term381235.getClass(), "type", 0);
        setField(term381235, term381235.getClass(), "next", null);
        setField(term381235, term381235.getClass(), "first", null);
        setField(term381235, term381235.getClass(), "last", null);
        setField(term381235, term381235.getClass(), "propListHead", null);
        setIntField(term381235, term381235.getClass(), "sourcePosition", 0);
        setField(term381235, term381235.getClass(), "jsType", null);
        setField(term381235, term381235.getClass(), "parent", null);
        setField(term381225, term381225.getClass(), "next", term381235);
        setField(term381225, term381225.getClass(), "first", null);
        setField(term381225, term381225.getClass(), "last", null);
        setField(term381225, term381225.getClass(), "propListHead", null);
        setIntField(term381225, term381225.getClass(), "sourcePosition", 0);
        setField(term381225, term381225.getClass(), "jsType", null);
        setField(term381225, term381225.getClass(), "parent", null);
        setField(term381215, term381215.getClass(), "first", term381225);
        setField(term381215, term381215.getClass(), "last", null);
        setField(term381215, term381215.getClass(), "propListHead", null);
        setIntField(term381215, term381215.getClass(), "sourcePosition", 0);
        setField(term381215, term381215.getClass(), "jsType", null);
        setField(term381215, term381215.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term380631;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term380545, args);
        assertTrue(recursiveEquals(term380545, term381281));
        assertTrue(recursiveEquals(term380631, term381282));
        assertTrue(recursiveEquals(retValue, term381215));
    }

};


