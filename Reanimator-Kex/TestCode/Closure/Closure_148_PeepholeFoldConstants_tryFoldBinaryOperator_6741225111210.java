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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287233;
     Object term287325;
     Object term287625;
     Object term287626;
     Object term287567;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287233 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term287325 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term287411 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term287481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term287411, term287411.getClass(), "next", term287481);
        setField(term287325, term287325.getClass(), "first", term287411);
        setIntField(term287325, term287325.getClass(), "type", 16);
        term287625 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term287625, term287625.getClass(), "currentTraversal", null);
        term287626 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term287627 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term287628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term287626, term287626.getClass(), "str", null);
        setIntField(term287626, term287626.getClass(), "type", 16);
        setField(term287626, term287626.getClass(), "next", null);
        setField(term287627, term287627.getClass(), "functionName", null);
        setBooleanField(term287627, term287627.getClass(), "itsNeedsActivation", false);
        setIntField(term287627, term287627.getClass(), "itsFunctionType", 0);
        setBooleanField(term287627, term287627.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term287627, term287627.getClass(), "encodedSourceStart", 0);
        setIntField(term287627, term287627.getClass(), "encodedSourceEnd", 0);
        setField(term287627, term287627.getClass(), "sourceName", null);
        setIntField(term287627, term287627.getClass(), "baseLineno", 0);
        setIntField(term287627, term287627.getClass(), "endLineno", 0);
        setField(term287627, term287627.getClass(), "functions", null);
        setField(term287627, term287627.getClass(), "regexps", null);
        setField(term287627, term287627.getClass(), "itsVariables", null);
        setField(term287627, term287627.getClass(), "itsConst", null);
        setField(term287627, term287627.getClass(), "itsVariableNames", null);
        setIntField(term287627, term287627.getClass(), "varStart", 0);
        setField(term287627, term287627.getClass(), "compilerData", null);
        setIntField(term287627, term287627.getClass(), "type", 0);
        setIntField(term287628, term287628.getClass(), "type", 0);
        setField(term287628, term287628.getClass(), "next", null);
        setField(term287628, term287628.getClass(), "first", null);
        setField(term287628, term287628.getClass(), "last", null);
        setField(term287628, term287628.getClass(), "propListHead", null);
        setIntField(term287628, term287628.getClass(), "sourcePosition", 0);
        setField(term287628, term287628.getClass(), "jsType", null);
        setField(term287628, term287628.getClass(), "parent", null);
        setField(term287627, term287627.getClass(), "next", term287628);
        setField(term287627, term287627.getClass(), "first", null);
        setField(term287627, term287627.getClass(), "last", null);
        setField(term287627, term287627.getClass(), "propListHead", null);
        setIntField(term287627, term287627.getClass(), "sourcePosition", 0);
        setField(term287627, term287627.getClass(), "jsType", null);
        setField(term287627, term287627.getClass(), "parent", null);
        setField(term287626, term287626.getClass(), "first", term287627);
        setField(term287626, term287626.getClass(), "last", null);
        setField(term287626, term287626.getClass(), "propListHead", null);
        setIntField(term287626, term287626.getClass(), "sourcePosition", 0);
        setField(term287626, term287626.getClass(), "jsType", null);
        setField(term287626, term287626.getClass(), "parent", null);
        term287567 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term287569 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term287579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term287567, term287567.getClass(), "str", null);
        setIntField(term287567, term287567.getClass(), "type", 16);
        setField(term287567, term287567.getClass(), "next", null);
        setField(term287569, term287569.getClass(), "functionName", null);
        setBooleanField(term287569, term287569.getClass(), "itsNeedsActivation", false);
        setIntField(term287569, term287569.getClass(), "itsFunctionType", 0);
        setBooleanField(term287569, term287569.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term287569, term287569.getClass(), "encodedSourceStart", 0);
        setIntField(term287569, term287569.getClass(), "encodedSourceEnd", 0);
        setField(term287569, term287569.getClass(), "sourceName", null);
        setIntField(term287569, term287569.getClass(), "baseLineno", 0);
        setIntField(term287569, term287569.getClass(), "endLineno", 0);
        setField(term287569, term287569.getClass(), "functions", null);
        setField(term287569, term287569.getClass(), "regexps", null);
        setField(term287569, term287569.getClass(), "itsVariables", null);
        setField(term287569, term287569.getClass(), "itsConst", null);
        setField(term287569, term287569.getClass(), "itsVariableNames", null);
        setIntField(term287569, term287569.getClass(), "varStart", 0);
        setField(term287569, term287569.getClass(), "compilerData", null);
        setIntField(term287569, term287569.getClass(), "type", 0);
        setIntField(term287579, term287579.getClass(), "type", 0);
        setField(term287579, term287579.getClass(), "next", null);
        setField(term287579, term287579.getClass(), "first", null);
        setField(term287579, term287579.getClass(), "last", null);
        setField(term287579, term287579.getClass(), "propListHead", null);
        setIntField(term287579, term287579.getClass(), "sourcePosition", 0);
        setField(term287579, term287579.getClass(), "jsType", null);
        setField(term287579, term287579.getClass(), "parent", null);
        setField(term287569, term287569.getClass(), "next", term287579);
        setField(term287569, term287569.getClass(), "first", null);
        setField(term287569, term287569.getClass(), "last", null);
        setField(term287569, term287569.getClass(), "propListHead", null);
        setIntField(term287569, term287569.getClass(), "sourcePosition", 0);
        setField(term287569, term287569.getClass(), "jsType", null);
        setField(term287569, term287569.getClass(), "parent", null);
        setField(term287567, term287567.getClass(), "first", term287569);
        setField(term287567, term287567.getClass(), "last", null);
        setField(term287567, term287567.getClass(), "propListHead", null);
        setIntField(term287567, term287567.getClass(), "sourcePosition", 0);
        setField(term287567, term287567.getClass(), "jsType", null);
        setField(term287567, term287567.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term287325;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term287233, args);
        assertTrue(recursiveEquals(term287233, term287625));
        assertTrue(recursiveEquals(term287325, term287626));
        assertTrue(recursiveEquals(retValue, term287567));
    }

};


