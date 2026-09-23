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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536210;
     Object term536302;
     Object term536626;
     Object term536627;
     Object term536551;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term536210 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term536302 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term536388 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term536458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term536388, term536388.getClass(), "next", term536458);
        setField(term536302, term536302.getClass(), "first", term536388);
        setIntField(term536302, term536302.getClass(), "type", 21);
        term536626 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term536626, term536626.getClass(), "currentTraversal", null);
        term536627 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term536628 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term536629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term536627, term536627.getClass(), "number", 0.0);
        setIntField(term536627, term536627.getClass(), "type", 21);
        setField(term536627, term536627.getClass(), "next", null);
        setField(term536628, term536628.getClass(), "functionName", null);
        setBooleanField(term536628, term536628.getClass(), "itsNeedsActivation", false);
        setIntField(term536628, term536628.getClass(), "itsFunctionType", 0);
        setBooleanField(term536628, term536628.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term536628, term536628.getClass(), "encodedSourceStart", 0);
        setIntField(term536628, term536628.getClass(), "encodedSourceEnd", 0);
        setField(term536628, term536628.getClass(), "sourceName", null);
        setIntField(term536628, term536628.getClass(), "baseLineno", 0);
        setIntField(term536628, term536628.getClass(), "endLineno", 0);
        setField(term536628, term536628.getClass(), "functions", null);
        setField(term536628, term536628.getClass(), "regexps", null);
        setField(term536628, term536628.getClass(), "itsVariables", null);
        setField(term536628, term536628.getClass(), "itsConst", null);
        setField(term536628, term536628.getClass(), "itsVariableNames", null);
        setIntField(term536628, term536628.getClass(), "varStart", 0);
        setField(term536628, term536628.getClass(), "compilerData", null);
        setIntField(term536628, term536628.getClass(), "type", 0);
        setIntField(term536629, term536629.getClass(), "type", 0);
        setField(term536629, term536629.getClass(), "next", null);
        setField(term536629, term536629.getClass(), "first", null);
        setField(term536629, term536629.getClass(), "last", null);
        setField(term536629, term536629.getClass(), "propListHead", null);
        setIntField(term536629, term536629.getClass(), "sourcePosition", 0);
        setField(term536629, term536629.getClass(), "jsType", null);
        setField(term536629, term536629.getClass(), "parent", null);
        setField(term536628, term536628.getClass(), "next", term536629);
        setField(term536628, term536628.getClass(), "first", null);
        setField(term536628, term536628.getClass(), "last", null);
        setField(term536628, term536628.getClass(), "propListHead", null);
        setIntField(term536628, term536628.getClass(), "sourcePosition", 0);
        setField(term536628, term536628.getClass(), "jsType", null);
        setField(term536628, term536628.getClass(), "parent", null);
        setField(term536627, term536627.getClass(), "first", term536628);
        setField(term536627, term536627.getClass(), "last", null);
        setField(term536627, term536627.getClass(), "propListHead", null);
        setIntField(term536627, term536627.getClass(), "sourcePosition", 0);
        setField(term536627, term536627.getClass(), "jsType", null);
        setField(term536627, term536627.getClass(), "parent", null);
        term536551 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term536554 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term536564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term536551, term536551.getClass(), "number", 0.0);
        setIntField(term536551, term536551.getClass(), "type", 21);
        setField(term536551, term536551.getClass(), "next", null);
        setField(term536554, term536554.getClass(), "functionName", null);
        setBooleanField(term536554, term536554.getClass(), "itsNeedsActivation", false);
        setIntField(term536554, term536554.getClass(), "itsFunctionType", 0);
        setBooleanField(term536554, term536554.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term536554, term536554.getClass(), "encodedSourceStart", 0);
        setIntField(term536554, term536554.getClass(), "encodedSourceEnd", 0);
        setField(term536554, term536554.getClass(), "sourceName", null);
        setIntField(term536554, term536554.getClass(), "baseLineno", 0);
        setIntField(term536554, term536554.getClass(), "endLineno", 0);
        setField(term536554, term536554.getClass(), "functions", null);
        setField(term536554, term536554.getClass(), "regexps", null);
        setField(term536554, term536554.getClass(), "itsVariables", null);
        setField(term536554, term536554.getClass(), "itsConst", null);
        setField(term536554, term536554.getClass(), "itsVariableNames", null);
        setIntField(term536554, term536554.getClass(), "varStart", 0);
        setField(term536554, term536554.getClass(), "compilerData", null);
        setIntField(term536554, term536554.getClass(), "type", 0);
        setIntField(term536564, term536564.getClass(), "type", 0);
        setField(term536564, term536564.getClass(), "next", null);
        setField(term536564, term536564.getClass(), "first", null);
        setField(term536564, term536564.getClass(), "last", null);
        setField(term536564, term536564.getClass(), "propListHead", null);
        setIntField(term536564, term536564.getClass(), "sourcePosition", 0);
        setField(term536564, term536564.getClass(), "jsType", null);
        setField(term536564, term536564.getClass(), "parent", null);
        setField(term536554, term536554.getClass(), "next", term536564);
        setField(term536554, term536554.getClass(), "first", null);
        setField(term536554, term536554.getClass(), "last", null);
        setField(term536554, term536554.getClass(), "propListHead", null);
        setIntField(term536554, term536554.getClass(), "sourcePosition", 0);
        setField(term536554, term536554.getClass(), "jsType", null);
        setField(term536554, term536554.getClass(), "parent", null);
        setField(term536551, term536551.getClass(), "first", term536554);
        setField(term536551, term536551.getClass(), "last", null);
        setField(term536551, term536551.getClass(), "propListHead", null);
        setIntField(term536551, term536551.getClass(), "sourcePosition", 0);
        setField(term536551, term536551.getClass(), "jsType", null);
        setField(term536551, term536551.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term536302;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term536210, args);
        assertTrue(recursiveEquals(term536210, term536626));
        assertTrue(recursiveEquals(term536302, term536627));
        assertTrue(recursiveEquals(retValue, term536551));
    }

};


