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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569016;
     Object term569108;
     Object term569322;
     Object term569323;
     Object term569279;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term569016 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term569108 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term569194 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term569264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term569194, term569194.getClass(), "next", term569264);
        setField(term569108, term569108.getClass(), "first", term569194);
        setIntField(term569108, term569108.getClass(), "type", 19);
        term569322 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term569322, term569322.getClass(), "currentTraversal", null);
        term569323 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term569324 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term569325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term569323, term569323.getClass(), "str", null);
        setIntField(term569323, term569323.getClass(), "type", 19);
        setField(term569323, term569323.getClass(), "next", null);
        setField(term569324, term569324.getClass(), "functionName", null);
        setBooleanField(term569324, term569324.getClass(), "itsNeedsActivation", false);
        setIntField(term569324, term569324.getClass(), "itsFunctionType", 0);
        setBooleanField(term569324, term569324.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term569324, term569324.getClass(), "encodedSourceStart", 0);
        setIntField(term569324, term569324.getClass(), "encodedSourceEnd", 0);
        setField(term569324, term569324.getClass(), "sourceName", null);
        setIntField(term569324, term569324.getClass(), "baseLineno", 0);
        setIntField(term569324, term569324.getClass(), "endLineno", 0);
        setField(term569324, term569324.getClass(), "functions", null);
        setField(term569324, term569324.getClass(), "regexps", null);
        setField(term569324, term569324.getClass(), "itsVariables", null);
        setField(term569324, term569324.getClass(), "itsConst", null);
        setField(term569324, term569324.getClass(), "itsVariableNames", null);
        setIntField(term569324, term569324.getClass(), "varStart", 0);
        setField(term569324, term569324.getClass(), "compilerData", null);
        setIntField(term569324, term569324.getClass(), "type", 0);
        setIntField(term569325, term569325.getClass(), "type", 0);
        setField(term569325, term569325.getClass(), "next", null);
        setField(term569325, term569325.getClass(), "first", null);
        setField(term569325, term569325.getClass(), "last", null);
        setField(term569325, term569325.getClass(), "propListHead", null);
        setIntField(term569325, term569325.getClass(), "sourcePosition", 0);
        setField(term569325, term569325.getClass(), "jsType", null);
        setField(term569325, term569325.getClass(), "parent", null);
        setField(term569324, term569324.getClass(), "next", term569325);
        setField(term569324, term569324.getClass(), "first", null);
        setField(term569324, term569324.getClass(), "last", null);
        setField(term569324, term569324.getClass(), "propListHead", null);
        setIntField(term569324, term569324.getClass(), "sourcePosition", 0);
        setField(term569324, term569324.getClass(), "jsType", null);
        setField(term569324, term569324.getClass(), "parent", null);
        setField(term569323, term569323.getClass(), "first", term569324);
        setField(term569323, term569323.getClass(), "last", null);
        setField(term569323, term569323.getClass(), "propListHead", null);
        setIntField(term569323, term569323.getClass(), "sourcePosition", 0);
        setField(term569323, term569323.getClass(), "jsType", null);
        setField(term569323, term569323.getClass(), "parent", null);
        term569279 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term569281 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term569291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term569279, term569279.getClass(), "str", null);
        setIntField(term569279, term569279.getClass(), "type", 19);
        setField(term569279, term569279.getClass(), "next", null);
        setField(term569281, term569281.getClass(), "functionName", null);
        setBooleanField(term569281, term569281.getClass(), "itsNeedsActivation", false);
        setIntField(term569281, term569281.getClass(), "itsFunctionType", 0);
        setBooleanField(term569281, term569281.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term569281, term569281.getClass(), "encodedSourceStart", 0);
        setIntField(term569281, term569281.getClass(), "encodedSourceEnd", 0);
        setField(term569281, term569281.getClass(), "sourceName", null);
        setIntField(term569281, term569281.getClass(), "baseLineno", 0);
        setIntField(term569281, term569281.getClass(), "endLineno", 0);
        setField(term569281, term569281.getClass(), "functions", null);
        setField(term569281, term569281.getClass(), "regexps", null);
        setField(term569281, term569281.getClass(), "itsVariables", null);
        setField(term569281, term569281.getClass(), "itsConst", null);
        setField(term569281, term569281.getClass(), "itsVariableNames", null);
        setIntField(term569281, term569281.getClass(), "varStart", 0);
        setField(term569281, term569281.getClass(), "compilerData", null);
        setIntField(term569281, term569281.getClass(), "type", 0);
        setIntField(term569291, term569291.getClass(), "type", 0);
        setField(term569291, term569291.getClass(), "next", null);
        setField(term569291, term569291.getClass(), "first", null);
        setField(term569291, term569291.getClass(), "last", null);
        setField(term569291, term569291.getClass(), "propListHead", null);
        setIntField(term569291, term569291.getClass(), "sourcePosition", 0);
        setField(term569291, term569291.getClass(), "jsType", null);
        setField(term569291, term569291.getClass(), "parent", null);
        setField(term569281, term569281.getClass(), "next", term569291);
        setField(term569281, term569281.getClass(), "first", null);
        setField(term569281, term569281.getClass(), "last", null);
        setField(term569281, term569281.getClass(), "propListHead", null);
        setIntField(term569281, term569281.getClass(), "sourcePosition", 0);
        setField(term569281, term569281.getClass(), "jsType", null);
        setField(term569281, term569281.getClass(), "parent", null);
        setField(term569279, term569279.getClass(), "first", term569281);
        setField(term569279, term569279.getClass(), "last", null);
        setField(term569279, term569279.getClass(), "propListHead", null);
        setIntField(term569279, term569279.getClass(), "sourcePosition", 0);
        setField(term569279, term569279.getClass(), "jsType", null);
        setField(term569279, term569279.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term569108;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term569016, args);
        assertTrue(recursiveEquals(term569016, term569322));
        assertTrue(recursiveEquals(term569108, term569323));
        assertTrue(recursiveEquals(retValue, term569279));
    }

};


