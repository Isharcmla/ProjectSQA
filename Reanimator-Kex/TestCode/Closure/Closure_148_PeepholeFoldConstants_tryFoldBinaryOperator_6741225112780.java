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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term803165;
     Object term803257;
     Object term803480;
     Object term803481;
     Object term803428;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term803165 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term803257 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term803343 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term803413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term803343, term803343.getClass(), "next", term803413);
        setField(term803257, term803257.getClass(), "first", term803343);
        setIntField(term803257, term803257.getClass(), "type", 12);
        term803480 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term803480, term803480.getClass(), "currentTraversal", null);
        term803481 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term803482 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term803483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term803481, term803481.getClass(), "number", 0.0);
        setIntField(term803481, term803481.getClass(), "type", 12);
        setField(term803481, term803481.getClass(), "next", null);
        setField(term803482, term803482.getClass(), "functionName", null);
        setBooleanField(term803482, term803482.getClass(), "itsNeedsActivation", false);
        setIntField(term803482, term803482.getClass(), "itsFunctionType", 0);
        setBooleanField(term803482, term803482.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term803482, term803482.getClass(), "encodedSourceStart", 0);
        setIntField(term803482, term803482.getClass(), "encodedSourceEnd", 0);
        setField(term803482, term803482.getClass(), "sourceName", null);
        setIntField(term803482, term803482.getClass(), "baseLineno", 0);
        setIntField(term803482, term803482.getClass(), "endLineno", 0);
        setField(term803482, term803482.getClass(), "functions", null);
        setField(term803482, term803482.getClass(), "regexps", null);
        setField(term803482, term803482.getClass(), "itsVariables", null);
        setField(term803482, term803482.getClass(), "itsConst", null);
        setField(term803482, term803482.getClass(), "itsVariableNames", null);
        setIntField(term803482, term803482.getClass(), "varStart", 0);
        setField(term803482, term803482.getClass(), "compilerData", null);
        setIntField(term803482, term803482.getClass(), "type", 0);
        setIntField(term803483, term803483.getClass(), "type", 0);
        setField(term803483, term803483.getClass(), "next", null);
        setField(term803483, term803483.getClass(), "first", null);
        setField(term803483, term803483.getClass(), "last", null);
        setField(term803483, term803483.getClass(), "propListHead", null);
        setIntField(term803483, term803483.getClass(), "sourcePosition", 0);
        setField(term803483, term803483.getClass(), "jsType", null);
        setField(term803483, term803483.getClass(), "parent", null);
        setField(term803482, term803482.getClass(), "next", term803483);
        setField(term803482, term803482.getClass(), "first", null);
        setField(term803482, term803482.getClass(), "last", null);
        setField(term803482, term803482.getClass(), "propListHead", null);
        setIntField(term803482, term803482.getClass(), "sourcePosition", 0);
        setField(term803482, term803482.getClass(), "jsType", null);
        setField(term803482, term803482.getClass(), "parent", null);
        setField(term803481, term803481.getClass(), "first", term803482);
        setField(term803481, term803481.getClass(), "last", null);
        setField(term803481, term803481.getClass(), "propListHead", null);
        setIntField(term803481, term803481.getClass(), "sourcePosition", 0);
        setField(term803481, term803481.getClass(), "jsType", null);
        setField(term803481, term803481.getClass(), "parent", null);
        term803428 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term803431 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term803441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term803428, term803428.getClass(), "number", 0.0);
        setIntField(term803428, term803428.getClass(), "type", 12);
        setField(term803428, term803428.getClass(), "next", null);
        setField(term803431, term803431.getClass(), "functionName", null);
        setBooleanField(term803431, term803431.getClass(), "itsNeedsActivation", false);
        setIntField(term803431, term803431.getClass(), "itsFunctionType", 0);
        setBooleanField(term803431, term803431.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term803431, term803431.getClass(), "encodedSourceStart", 0);
        setIntField(term803431, term803431.getClass(), "encodedSourceEnd", 0);
        setField(term803431, term803431.getClass(), "sourceName", null);
        setIntField(term803431, term803431.getClass(), "baseLineno", 0);
        setIntField(term803431, term803431.getClass(), "endLineno", 0);
        setField(term803431, term803431.getClass(), "functions", null);
        setField(term803431, term803431.getClass(), "regexps", null);
        setField(term803431, term803431.getClass(), "itsVariables", null);
        setField(term803431, term803431.getClass(), "itsConst", null);
        setField(term803431, term803431.getClass(), "itsVariableNames", null);
        setIntField(term803431, term803431.getClass(), "varStart", 0);
        setField(term803431, term803431.getClass(), "compilerData", null);
        setIntField(term803431, term803431.getClass(), "type", 0);
        setIntField(term803441, term803441.getClass(), "type", 0);
        setField(term803441, term803441.getClass(), "next", null);
        setField(term803441, term803441.getClass(), "first", null);
        setField(term803441, term803441.getClass(), "last", null);
        setField(term803441, term803441.getClass(), "propListHead", null);
        setIntField(term803441, term803441.getClass(), "sourcePosition", 0);
        setField(term803441, term803441.getClass(), "jsType", null);
        setField(term803441, term803441.getClass(), "parent", null);
        setField(term803431, term803431.getClass(), "next", term803441);
        setField(term803431, term803431.getClass(), "first", null);
        setField(term803431, term803431.getClass(), "last", null);
        setField(term803431, term803431.getClass(), "propListHead", null);
        setIntField(term803431, term803431.getClass(), "sourcePosition", 0);
        setField(term803431, term803431.getClass(), "jsType", null);
        setField(term803431, term803431.getClass(), "parent", null);
        setField(term803428, term803428.getClass(), "first", term803431);
        setField(term803428, term803428.getClass(), "last", null);
        setField(term803428, term803428.getClass(), "propListHead", null);
        setIntField(term803428, term803428.getClass(), "sourcePosition", 0);
        setField(term803428, term803428.getClass(), "jsType", null);
        setField(term803428, term803428.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term803257;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term803165, args);
        assertTrue(recursiveEquals(term803165, term803480));
        assertTrue(recursiveEquals(term803257, term803481));
        assertTrue(recursiveEquals(retValue, term803428));
    }

};


