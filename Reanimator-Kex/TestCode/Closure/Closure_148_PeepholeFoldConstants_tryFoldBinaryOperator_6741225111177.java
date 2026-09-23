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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278061;
     Object term278153;
     Object term278755;
     Object term278756;
     Object term278710;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278061 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term278153 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term278239 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term278309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term278239, term278239.getClass(), "next", term278309);
        setField(term278153, term278153.getClass(), "first", term278239);
        setIntField(term278153, term278153.getClass(), "type", 22);
        term278755 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term278755, term278755.getClass(), "currentTraversal", null);
        term278756 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term278757 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term278758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term278756, term278756.getClass(), "number", 0.0);
        setIntField(term278756, term278756.getClass(), "type", 22);
        setField(term278756, term278756.getClass(), "next", null);
        setField(term278757, term278757.getClass(), "functionName", null);
        setBooleanField(term278757, term278757.getClass(), "itsNeedsActivation", false);
        setIntField(term278757, term278757.getClass(), "itsFunctionType", 0);
        setBooleanField(term278757, term278757.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term278757, term278757.getClass(), "encodedSourceStart", 0);
        setIntField(term278757, term278757.getClass(), "encodedSourceEnd", 0);
        setField(term278757, term278757.getClass(), "sourceName", null);
        setIntField(term278757, term278757.getClass(), "baseLineno", 0);
        setIntField(term278757, term278757.getClass(), "endLineno", 0);
        setField(term278757, term278757.getClass(), "functions", null);
        setField(term278757, term278757.getClass(), "regexps", null);
        setField(term278757, term278757.getClass(), "itsVariables", null);
        setField(term278757, term278757.getClass(), "itsConst", null);
        setField(term278757, term278757.getClass(), "itsVariableNames", null);
        setIntField(term278757, term278757.getClass(), "varStart", 0);
        setField(term278757, term278757.getClass(), "compilerData", null);
        setIntField(term278757, term278757.getClass(), "type", 0);
        setIntField(term278758, term278758.getClass(), "type", 0);
        setField(term278758, term278758.getClass(), "next", null);
        setField(term278758, term278758.getClass(), "first", null);
        setField(term278758, term278758.getClass(), "last", null);
        setField(term278758, term278758.getClass(), "propListHead", null);
        setIntField(term278758, term278758.getClass(), "sourcePosition", 0);
        setField(term278758, term278758.getClass(), "jsType", null);
        setField(term278758, term278758.getClass(), "parent", null);
        setField(term278757, term278757.getClass(), "next", term278758);
        setField(term278757, term278757.getClass(), "first", null);
        setField(term278757, term278757.getClass(), "last", null);
        setField(term278757, term278757.getClass(), "propListHead", null);
        setIntField(term278757, term278757.getClass(), "sourcePosition", 0);
        setField(term278757, term278757.getClass(), "jsType", null);
        setField(term278757, term278757.getClass(), "parent", null);
        setField(term278756, term278756.getClass(), "first", term278757);
        setField(term278756, term278756.getClass(), "last", null);
        setField(term278756, term278756.getClass(), "propListHead", null);
        setIntField(term278756, term278756.getClass(), "sourcePosition", 0);
        setField(term278756, term278756.getClass(), "jsType", null);
        setField(term278756, term278756.getClass(), "parent", null);
        term278710 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term278713 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term278723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term278710, term278710.getClass(), "number", 0.0);
        setIntField(term278710, term278710.getClass(), "type", 22);
        setField(term278710, term278710.getClass(), "next", null);
        setField(term278713, term278713.getClass(), "functionName", null);
        setBooleanField(term278713, term278713.getClass(), "itsNeedsActivation", false);
        setIntField(term278713, term278713.getClass(), "itsFunctionType", 0);
        setBooleanField(term278713, term278713.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term278713, term278713.getClass(), "encodedSourceStart", 0);
        setIntField(term278713, term278713.getClass(), "encodedSourceEnd", 0);
        setField(term278713, term278713.getClass(), "sourceName", null);
        setIntField(term278713, term278713.getClass(), "baseLineno", 0);
        setIntField(term278713, term278713.getClass(), "endLineno", 0);
        setField(term278713, term278713.getClass(), "functions", null);
        setField(term278713, term278713.getClass(), "regexps", null);
        setField(term278713, term278713.getClass(), "itsVariables", null);
        setField(term278713, term278713.getClass(), "itsConst", null);
        setField(term278713, term278713.getClass(), "itsVariableNames", null);
        setIntField(term278713, term278713.getClass(), "varStart", 0);
        setField(term278713, term278713.getClass(), "compilerData", null);
        setIntField(term278713, term278713.getClass(), "type", 0);
        setIntField(term278723, term278723.getClass(), "type", 0);
        setField(term278723, term278723.getClass(), "next", null);
        setField(term278723, term278723.getClass(), "first", null);
        setField(term278723, term278723.getClass(), "last", null);
        setField(term278723, term278723.getClass(), "propListHead", null);
        setIntField(term278723, term278723.getClass(), "sourcePosition", 0);
        setField(term278723, term278723.getClass(), "jsType", null);
        setField(term278723, term278723.getClass(), "parent", null);
        setField(term278713, term278713.getClass(), "next", term278723);
        setField(term278713, term278713.getClass(), "first", null);
        setField(term278713, term278713.getClass(), "last", null);
        setField(term278713, term278713.getClass(), "propListHead", null);
        setIntField(term278713, term278713.getClass(), "sourcePosition", 0);
        setField(term278713, term278713.getClass(), "jsType", null);
        setField(term278713, term278713.getClass(), "parent", null);
        setField(term278710, term278710.getClass(), "first", term278713);
        setField(term278710, term278710.getClass(), "last", null);
        setField(term278710, term278710.getClass(), "propListHead", null);
        setIntField(term278710, term278710.getClass(), "sourcePosition", 0);
        setField(term278710, term278710.getClass(), "jsType", null);
        setField(term278710, term278710.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term278153;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term278061, args);
        assertTrue(recursiveEquals(term278061, term278755));
        assertTrue(recursiveEquals(term278153, term278756));
        assertTrue(recursiveEquals(retValue, term278710));
    }

};


