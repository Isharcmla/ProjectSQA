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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534062;
     Object term534154;
     Object term534411;
     Object term534412;
     Object term534354;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term534062 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term534154 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term534246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term534332 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term534246, term534246.getClass(), "next", term534332);
        setIntField(term534246, term534246.getClass(), "type", 39);
        setField(term534154, term534154.getClass(), "first", term534246);
        setIntField(term534154, term534154.getClass(), "type", 24);
        term534411 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term534411, term534411.getClass(), "currentTraversal", null);
        term534412 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term534413 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term534414 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term534412, term534412.getClass(), "number", 0.0);
        setIntField(term534412, term534412.getClass(), "type", 24);
        setField(term534412, term534412.getClass(), "next", null);
        setDoubleField(term534413, term534413.getClass(), "number", 0.0);
        setIntField(term534413, term534413.getClass(), "type", 39);
        setField(term534414, term534414.getClass(), "functionName", null);
        setBooleanField(term534414, term534414.getClass(), "itsNeedsActivation", false);
        setIntField(term534414, term534414.getClass(), "itsFunctionType", 0);
        setBooleanField(term534414, term534414.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term534414, term534414.getClass(), "encodedSourceStart", 0);
        setIntField(term534414, term534414.getClass(), "encodedSourceEnd", 0);
        setField(term534414, term534414.getClass(), "sourceName", null);
        setIntField(term534414, term534414.getClass(), "baseLineno", 0);
        setIntField(term534414, term534414.getClass(), "endLineno", 0);
        setField(term534414, term534414.getClass(), "functions", null);
        setField(term534414, term534414.getClass(), "regexps", null);
        setField(term534414, term534414.getClass(), "itsVariables", null);
        setField(term534414, term534414.getClass(), "itsConst", null);
        setField(term534414, term534414.getClass(), "itsVariableNames", null);
        setIntField(term534414, term534414.getClass(), "varStart", 0);
        setField(term534414, term534414.getClass(), "compilerData", null);
        setIntField(term534414, term534414.getClass(), "type", 0);
        setField(term534414, term534414.getClass(), "next", null);
        setField(term534414, term534414.getClass(), "first", null);
        setField(term534414, term534414.getClass(), "last", null);
        setField(term534414, term534414.getClass(), "propListHead", null);
        setIntField(term534414, term534414.getClass(), "sourcePosition", 0);
        setField(term534414, term534414.getClass(), "jsType", null);
        setField(term534414, term534414.getClass(), "parent", null);
        setField(term534413, term534413.getClass(), "next", term534414);
        setField(term534413, term534413.getClass(), "first", null);
        setField(term534413, term534413.getClass(), "last", null);
        setField(term534413, term534413.getClass(), "propListHead", null);
        setIntField(term534413, term534413.getClass(), "sourcePosition", 0);
        setField(term534413, term534413.getClass(), "jsType", null);
        setField(term534413, term534413.getClass(), "parent", null);
        setField(term534412, term534412.getClass(), "first", term534413);
        setField(term534412, term534412.getClass(), "last", null);
        setField(term534412, term534412.getClass(), "propListHead", null);
        setIntField(term534412, term534412.getClass(), "sourcePosition", 0);
        setField(term534412, term534412.getClass(), "jsType", null);
        setField(term534412, term534412.getClass(), "parent", null);
        term534354 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term534357 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term534360 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term534354, term534354.getClass(), "number", 0.0);
        setIntField(term534354, term534354.getClass(), "type", 24);
        setField(term534354, term534354.getClass(), "next", null);
        setDoubleField(term534357, term534357.getClass(), "number", 0.0);
        setIntField(term534357, term534357.getClass(), "type", 39);
        setField(term534360, term534360.getClass(), "functionName", null);
        setBooleanField(term534360, term534360.getClass(), "itsNeedsActivation", false);
        setIntField(term534360, term534360.getClass(), "itsFunctionType", 0);
        setBooleanField(term534360, term534360.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term534360, term534360.getClass(), "encodedSourceStart", 0);
        setIntField(term534360, term534360.getClass(), "encodedSourceEnd", 0);
        setField(term534360, term534360.getClass(), "sourceName", null);
        setIntField(term534360, term534360.getClass(), "baseLineno", 0);
        setIntField(term534360, term534360.getClass(), "endLineno", 0);
        setField(term534360, term534360.getClass(), "functions", null);
        setField(term534360, term534360.getClass(), "regexps", null);
        setField(term534360, term534360.getClass(), "itsVariables", null);
        setField(term534360, term534360.getClass(), "itsConst", null);
        setField(term534360, term534360.getClass(), "itsVariableNames", null);
        setIntField(term534360, term534360.getClass(), "varStart", 0);
        setField(term534360, term534360.getClass(), "compilerData", null);
        setIntField(term534360, term534360.getClass(), "type", 0);
        setField(term534360, term534360.getClass(), "next", null);
        setField(term534360, term534360.getClass(), "first", null);
        setField(term534360, term534360.getClass(), "last", null);
        setField(term534360, term534360.getClass(), "propListHead", null);
        setIntField(term534360, term534360.getClass(), "sourcePosition", 0);
        setField(term534360, term534360.getClass(), "jsType", null);
        setField(term534360, term534360.getClass(), "parent", null);
        setField(term534357, term534357.getClass(), "next", term534360);
        setField(term534357, term534357.getClass(), "first", null);
        setField(term534357, term534357.getClass(), "last", null);
        setField(term534357, term534357.getClass(), "propListHead", null);
        setIntField(term534357, term534357.getClass(), "sourcePosition", 0);
        setField(term534357, term534357.getClass(), "jsType", null);
        setField(term534357, term534357.getClass(), "parent", null);
        setField(term534354, term534354.getClass(), "first", term534357);
        setField(term534354, term534354.getClass(), "last", null);
        setField(term534354, term534354.getClass(), "propListHead", null);
        setIntField(term534354, term534354.getClass(), "sourcePosition", 0);
        setField(term534354, term534354.getClass(), "jsType", null);
        setField(term534354, term534354.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term534154;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term534062, args);
        assertTrue(recursiveEquals(term534062, term534411));
        assertTrue(recursiveEquals(term534154, term534412));
        assertTrue(recursiveEquals(retValue, term534354));
    }

};


