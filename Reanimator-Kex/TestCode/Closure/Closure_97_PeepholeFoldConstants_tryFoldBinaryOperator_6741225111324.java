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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437961;
     Object term438053;
     Object term438408;
     Object term438409;
     Object term438349;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term437961 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term438053 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term438145 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term438231 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term438145, term438145.getClass(), "next", term438231);
        setIntField(term438145, term438145.getClass(), "type", 39);
        setField(term438053, term438053.getClass(), "first", term438145);
        setIntField(term438053, term438053.getClass(), "type", 9);
        term438408 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term438408, term438408.getClass(), "currentTraversal", null);
        term438409 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term438410 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term438411 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term438409, term438409.getClass(), "str", null);
        setIntField(term438409, term438409.getClass(), "type", 9);
        setField(term438409, term438409.getClass(), "next", null);
        setField(term438410, term438410.getClass(), "str", null);
        setIntField(term438410, term438410.getClass(), "type", 39);
        setField(term438411, term438411.getClass(), "functionName", null);
        setBooleanField(term438411, term438411.getClass(), "itsNeedsActivation", false);
        setIntField(term438411, term438411.getClass(), "itsFunctionType", 0);
        setBooleanField(term438411, term438411.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term438411, term438411.getClass(), "encodedSourceStart", 0);
        setIntField(term438411, term438411.getClass(), "encodedSourceEnd", 0);
        setField(term438411, term438411.getClass(), "sourceName", null);
        setIntField(term438411, term438411.getClass(), "baseLineno", 0);
        setIntField(term438411, term438411.getClass(), "endLineno", 0);
        setField(term438411, term438411.getClass(), "functions", null);
        setField(term438411, term438411.getClass(), "regexps", null);
        setField(term438411, term438411.getClass(), "itsVariables", null);
        setField(term438411, term438411.getClass(), "itsConst", null);
        setField(term438411, term438411.getClass(), "itsVariableNames", null);
        setIntField(term438411, term438411.getClass(), "varStart", 0);
        setField(term438411, term438411.getClass(), "compilerData", null);
        setIntField(term438411, term438411.getClass(), "type", 0);
        setField(term438411, term438411.getClass(), "next", null);
        setField(term438411, term438411.getClass(), "first", null);
        setField(term438411, term438411.getClass(), "last", null);
        setField(term438411, term438411.getClass(), "propListHead", null);
        setIntField(term438411, term438411.getClass(), "sourcePosition", 0);
        setField(term438411, term438411.getClass(), "jsType", null);
        setField(term438411, term438411.getClass(), "parent", null);
        setField(term438410, term438410.getClass(), "next", term438411);
        setField(term438410, term438410.getClass(), "first", null);
        setField(term438410, term438410.getClass(), "last", null);
        setField(term438410, term438410.getClass(), "propListHead", null);
        setIntField(term438410, term438410.getClass(), "sourcePosition", 0);
        setField(term438410, term438410.getClass(), "jsType", null);
        setField(term438410, term438410.getClass(), "parent", null);
        setField(term438409, term438409.getClass(), "first", term438410);
        setField(term438409, term438409.getClass(), "last", null);
        setField(term438409, term438409.getClass(), "propListHead", null);
        setIntField(term438409, term438409.getClass(), "sourcePosition", 0);
        setField(term438409, term438409.getClass(), "jsType", null);
        setField(term438409, term438409.getClass(), "parent", null);
        term438349 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term438351 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term438353 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term438349, term438349.getClass(), "str", null);
        setIntField(term438349, term438349.getClass(), "type", 9);
        setField(term438349, term438349.getClass(), "next", null);
        setField(term438351, term438351.getClass(), "str", null);
        setIntField(term438351, term438351.getClass(), "type", 39);
        setField(term438353, term438353.getClass(), "functionName", null);
        setBooleanField(term438353, term438353.getClass(), "itsNeedsActivation", false);
        setIntField(term438353, term438353.getClass(), "itsFunctionType", 0);
        setBooleanField(term438353, term438353.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term438353, term438353.getClass(), "encodedSourceStart", 0);
        setIntField(term438353, term438353.getClass(), "encodedSourceEnd", 0);
        setField(term438353, term438353.getClass(), "sourceName", null);
        setIntField(term438353, term438353.getClass(), "baseLineno", 0);
        setIntField(term438353, term438353.getClass(), "endLineno", 0);
        setField(term438353, term438353.getClass(), "functions", null);
        setField(term438353, term438353.getClass(), "regexps", null);
        setField(term438353, term438353.getClass(), "itsVariables", null);
        setField(term438353, term438353.getClass(), "itsConst", null);
        setField(term438353, term438353.getClass(), "itsVariableNames", null);
        setIntField(term438353, term438353.getClass(), "varStart", 0);
        setField(term438353, term438353.getClass(), "compilerData", null);
        setIntField(term438353, term438353.getClass(), "type", 0);
        setField(term438353, term438353.getClass(), "next", null);
        setField(term438353, term438353.getClass(), "first", null);
        setField(term438353, term438353.getClass(), "last", null);
        setField(term438353, term438353.getClass(), "propListHead", null);
        setIntField(term438353, term438353.getClass(), "sourcePosition", 0);
        setField(term438353, term438353.getClass(), "jsType", null);
        setField(term438353, term438353.getClass(), "parent", null);
        setField(term438351, term438351.getClass(), "next", term438353);
        setField(term438351, term438351.getClass(), "first", null);
        setField(term438351, term438351.getClass(), "last", null);
        setField(term438351, term438351.getClass(), "propListHead", null);
        setIntField(term438351, term438351.getClass(), "sourcePosition", 0);
        setField(term438351, term438351.getClass(), "jsType", null);
        setField(term438351, term438351.getClass(), "parent", null);
        setField(term438349, term438349.getClass(), "first", term438351);
        setField(term438349, term438349.getClass(), "last", null);
        setField(term438349, term438349.getClass(), "propListHead", null);
        setIntField(term438349, term438349.getClass(), "sourcePosition", 0);
        setField(term438349, term438349.getClass(), "jsType", null);
        setField(term438349, term438349.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term438053;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term437961, args);
        assertTrue(recursiveEquals(term437961, term438408));
        assertTrue(recursiveEquals(term438053, term438409));
        assertTrue(recursiveEquals(retValue, term438349));
    }

};


