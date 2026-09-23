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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term654664;
     Object term654756;
     Object term655436;
     Object term655437;
     Object term655383;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term654664 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term654756 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term654842 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term654912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term654842, term654842.getClass(), "next", term654912);
        setIntField(term654842, term654842.getClass(), "type", 39);
        setField(term654756, term654756.getClass(), "first", term654842);
        setIntField(term654756, term654756.getClass(), "type", 9);
        term655436 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term655436, term655436.getClass(), "currentTraversal", null);
        term655437 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term655438 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term655439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term655437, term655437.getClass(), "number", 0.0);
        setIntField(term655437, term655437.getClass(), "type", 9);
        setField(term655437, term655437.getClass(), "next", null);
        setField(term655438, term655438.getClass(), "functionName", null);
        setBooleanField(term655438, term655438.getClass(), "itsNeedsActivation", false);
        setIntField(term655438, term655438.getClass(), "itsFunctionType", 0);
        setBooleanField(term655438, term655438.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term655438, term655438.getClass(), "encodedSourceStart", 0);
        setIntField(term655438, term655438.getClass(), "encodedSourceEnd", 0);
        setField(term655438, term655438.getClass(), "sourceName", null);
        setIntField(term655438, term655438.getClass(), "baseLineno", 0);
        setIntField(term655438, term655438.getClass(), "endLineno", 0);
        setField(term655438, term655438.getClass(), "functions", null);
        setField(term655438, term655438.getClass(), "regexps", null);
        setField(term655438, term655438.getClass(), "itsVariables", null);
        setField(term655438, term655438.getClass(), "itsConst", null);
        setField(term655438, term655438.getClass(), "itsVariableNames", null);
        setIntField(term655438, term655438.getClass(), "varStart", 0);
        setField(term655438, term655438.getClass(), "compilerData", null);
        setIntField(term655438, term655438.getClass(), "type", 39);
        setIntField(term655439, term655439.getClass(), "type", 0);
        setField(term655439, term655439.getClass(), "next", null);
        setField(term655439, term655439.getClass(), "first", null);
        setField(term655439, term655439.getClass(), "last", null);
        setField(term655439, term655439.getClass(), "propListHead", null);
        setIntField(term655439, term655439.getClass(), "sourcePosition", 0);
        setField(term655439, term655439.getClass(), "jsType", null);
        setField(term655439, term655439.getClass(), "parent", null);
        setField(term655438, term655438.getClass(), "next", term655439);
        setField(term655438, term655438.getClass(), "first", null);
        setField(term655438, term655438.getClass(), "last", null);
        setField(term655438, term655438.getClass(), "propListHead", null);
        setIntField(term655438, term655438.getClass(), "sourcePosition", 0);
        setField(term655438, term655438.getClass(), "jsType", null);
        setField(term655438, term655438.getClass(), "parent", null);
        setField(term655437, term655437.getClass(), "first", term655438);
        setField(term655437, term655437.getClass(), "last", null);
        setField(term655437, term655437.getClass(), "propListHead", null);
        setIntField(term655437, term655437.getClass(), "sourcePosition", 0);
        setField(term655437, term655437.getClass(), "jsType", null);
        setField(term655437, term655437.getClass(), "parent", null);
        term655383 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term655386 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term655396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term655383, term655383.getClass(), "number", 0.0);
        setIntField(term655383, term655383.getClass(), "type", 9);
        setField(term655383, term655383.getClass(), "next", null);
        setField(term655386, term655386.getClass(), "functionName", null);
        setBooleanField(term655386, term655386.getClass(), "itsNeedsActivation", false);
        setIntField(term655386, term655386.getClass(), "itsFunctionType", 0);
        setBooleanField(term655386, term655386.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term655386, term655386.getClass(), "encodedSourceStart", 0);
        setIntField(term655386, term655386.getClass(), "encodedSourceEnd", 0);
        setField(term655386, term655386.getClass(), "sourceName", null);
        setIntField(term655386, term655386.getClass(), "baseLineno", 0);
        setIntField(term655386, term655386.getClass(), "endLineno", 0);
        setField(term655386, term655386.getClass(), "functions", null);
        setField(term655386, term655386.getClass(), "regexps", null);
        setField(term655386, term655386.getClass(), "itsVariables", null);
        setField(term655386, term655386.getClass(), "itsConst", null);
        setField(term655386, term655386.getClass(), "itsVariableNames", null);
        setIntField(term655386, term655386.getClass(), "varStart", 0);
        setField(term655386, term655386.getClass(), "compilerData", null);
        setIntField(term655386, term655386.getClass(), "type", 39);
        setIntField(term655396, term655396.getClass(), "type", 0);
        setField(term655396, term655396.getClass(), "next", null);
        setField(term655396, term655396.getClass(), "first", null);
        setField(term655396, term655396.getClass(), "last", null);
        setField(term655396, term655396.getClass(), "propListHead", null);
        setIntField(term655396, term655396.getClass(), "sourcePosition", 0);
        setField(term655396, term655396.getClass(), "jsType", null);
        setField(term655396, term655396.getClass(), "parent", null);
        setField(term655386, term655386.getClass(), "next", term655396);
        setField(term655386, term655386.getClass(), "first", null);
        setField(term655386, term655386.getClass(), "last", null);
        setField(term655386, term655386.getClass(), "propListHead", null);
        setIntField(term655386, term655386.getClass(), "sourcePosition", 0);
        setField(term655386, term655386.getClass(), "jsType", null);
        setField(term655386, term655386.getClass(), "parent", null);
        setField(term655383, term655383.getClass(), "first", term655386);
        setField(term655383, term655383.getClass(), "last", null);
        setField(term655383, term655383.getClass(), "propListHead", null);
        setIntField(term655383, term655383.getClass(), "sourcePosition", 0);
        setField(term655383, term655383.getClass(), "jsType", null);
        setField(term655383, term655383.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term654756;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term654664, args);
        assertTrue(recursiveEquals(term654664, term655436));
        assertTrue(recursiveEquals(term654756, term655437));
        assertTrue(recursiveEquals(retValue, term655383));
    }

};


