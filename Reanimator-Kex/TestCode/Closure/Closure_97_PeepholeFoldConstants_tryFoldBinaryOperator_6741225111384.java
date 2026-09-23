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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472691;
     Object term472783;
     Object term518511;
     Object term518512;
     Object term518449;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term472691 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term472783 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term472869 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term472939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term472869, term472869.getClass(), "next", term472939);
        setField(term472783, term472783.getClass(), "first", term472869);
        setIntField(term472783, term472783.getClass(), "type", 14);
        term518511 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term518511, term518511.getClass(), "currentTraversal", null);
        term518512 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term518513 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term518514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term518512, term518512.getClass(), "number", 0.0);
        setIntField(term518512, term518512.getClass(), "type", 14);
        setField(term518512, term518512.getClass(), "next", null);
        setField(term518513, term518513.getClass(), "functionName", null);
        setBooleanField(term518513, term518513.getClass(), "itsNeedsActivation", false);
        setIntField(term518513, term518513.getClass(), "itsFunctionType", 0);
        setBooleanField(term518513, term518513.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term518513, term518513.getClass(), "encodedSourceStart", 0);
        setIntField(term518513, term518513.getClass(), "encodedSourceEnd", 0);
        setField(term518513, term518513.getClass(), "sourceName", null);
        setIntField(term518513, term518513.getClass(), "baseLineno", 0);
        setIntField(term518513, term518513.getClass(), "endLineno", 0);
        setField(term518513, term518513.getClass(), "functions", null);
        setField(term518513, term518513.getClass(), "regexps", null);
        setField(term518513, term518513.getClass(), "itsVariables", null);
        setField(term518513, term518513.getClass(), "itsConst", null);
        setField(term518513, term518513.getClass(), "itsVariableNames", null);
        setIntField(term518513, term518513.getClass(), "varStart", 0);
        setField(term518513, term518513.getClass(), "compilerData", null);
        setIntField(term518513, term518513.getClass(), "type", 0);
        setIntField(term518514, term518514.getClass(), "type", 0);
        setField(term518514, term518514.getClass(), "next", null);
        setField(term518514, term518514.getClass(), "first", null);
        setField(term518514, term518514.getClass(), "last", null);
        setField(term518514, term518514.getClass(), "propListHead", null);
        setIntField(term518514, term518514.getClass(), "sourcePosition", 0);
        setField(term518514, term518514.getClass(), "jsType", null);
        setField(term518514, term518514.getClass(), "parent", null);
        setField(term518513, term518513.getClass(), "next", term518514);
        setField(term518513, term518513.getClass(), "first", null);
        setField(term518513, term518513.getClass(), "last", null);
        setField(term518513, term518513.getClass(), "propListHead", null);
        setIntField(term518513, term518513.getClass(), "sourcePosition", 0);
        setField(term518513, term518513.getClass(), "jsType", null);
        setField(term518513, term518513.getClass(), "parent", null);
        setField(term518512, term518512.getClass(), "first", term518513);
        setField(term518512, term518512.getClass(), "last", null);
        setField(term518512, term518512.getClass(), "propListHead", null);
        setIntField(term518512, term518512.getClass(), "sourcePosition", 0);
        setField(term518512, term518512.getClass(), "jsType", null);
        setField(term518512, term518512.getClass(), "parent", null);
        term518449 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term518452 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term518462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term518449, term518449.getClass(), "number", 0.0);
        setIntField(term518449, term518449.getClass(), "type", 14);
        setField(term518449, term518449.getClass(), "next", null);
        setField(term518452, term518452.getClass(), "functionName", null);
        setBooleanField(term518452, term518452.getClass(), "itsNeedsActivation", false);
        setIntField(term518452, term518452.getClass(), "itsFunctionType", 0);
        setBooleanField(term518452, term518452.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term518452, term518452.getClass(), "encodedSourceStart", 0);
        setIntField(term518452, term518452.getClass(), "encodedSourceEnd", 0);
        setField(term518452, term518452.getClass(), "sourceName", null);
        setIntField(term518452, term518452.getClass(), "baseLineno", 0);
        setIntField(term518452, term518452.getClass(), "endLineno", 0);
        setField(term518452, term518452.getClass(), "functions", null);
        setField(term518452, term518452.getClass(), "regexps", null);
        setField(term518452, term518452.getClass(), "itsVariables", null);
        setField(term518452, term518452.getClass(), "itsConst", null);
        setField(term518452, term518452.getClass(), "itsVariableNames", null);
        setIntField(term518452, term518452.getClass(), "varStart", 0);
        setField(term518452, term518452.getClass(), "compilerData", null);
        setIntField(term518452, term518452.getClass(), "type", 0);
        setIntField(term518462, term518462.getClass(), "type", 0);
        setField(term518462, term518462.getClass(), "next", null);
        setField(term518462, term518462.getClass(), "first", null);
        setField(term518462, term518462.getClass(), "last", null);
        setField(term518462, term518462.getClass(), "propListHead", null);
        setIntField(term518462, term518462.getClass(), "sourcePosition", 0);
        setField(term518462, term518462.getClass(), "jsType", null);
        setField(term518462, term518462.getClass(), "parent", null);
        setField(term518452, term518452.getClass(), "next", term518462);
        setField(term518452, term518452.getClass(), "first", null);
        setField(term518452, term518452.getClass(), "last", null);
        setField(term518452, term518452.getClass(), "propListHead", null);
        setIntField(term518452, term518452.getClass(), "sourcePosition", 0);
        setField(term518452, term518452.getClass(), "jsType", null);
        setField(term518452, term518452.getClass(), "parent", null);
        setField(term518449, term518449.getClass(), "first", term518452);
        setField(term518449, term518449.getClass(), "last", null);
        setField(term518449, term518449.getClass(), "propListHead", null);
        setIntField(term518449, term518449.getClass(), "sourcePosition", 0);
        setField(term518449, term518449.getClass(), "jsType", null);
        setField(term518449, term518449.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term472783;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term472691, args);
        assertTrue(recursiveEquals(term472691, term518511));
        assertTrue(recursiveEquals(term472783, term518512));
        assertTrue(recursiveEquals(retValue, term518449));
    }

};


