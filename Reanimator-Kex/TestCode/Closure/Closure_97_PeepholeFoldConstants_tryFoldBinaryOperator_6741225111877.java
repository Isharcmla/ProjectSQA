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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term719910;
     Object term720002;
     Object term720636;
     Object term720637;
     Object term720578;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term719910 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term720002 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term720088 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term720158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term720088, term720088.getClass(), "next", term720158);
        setField(term720002, term720002.getClass(), "first", term720088);
        setIntField(term720002, term720002.getClass(), "type", 16);
        term720636 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term720636, term720636.getClass(), "currentTraversal", null);
        term720637 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term720638 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term720639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term720637, term720637.getClass(), "str", null);
        setIntField(term720637, term720637.getClass(), "type", 16);
        setField(term720637, term720637.getClass(), "next", null);
        setField(term720638, term720638.getClass(), "functionName", null);
        setBooleanField(term720638, term720638.getClass(), "itsNeedsActivation", false);
        setIntField(term720638, term720638.getClass(), "itsFunctionType", 0);
        setBooleanField(term720638, term720638.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term720638, term720638.getClass(), "encodedSourceStart", 0);
        setIntField(term720638, term720638.getClass(), "encodedSourceEnd", 0);
        setField(term720638, term720638.getClass(), "sourceName", null);
        setIntField(term720638, term720638.getClass(), "baseLineno", 0);
        setIntField(term720638, term720638.getClass(), "endLineno", 0);
        setField(term720638, term720638.getClass(), "functions", null);
        setField(term720638, term720638.getClass(), "regexps", null);
        setField(term720638, term720638.getClass(), "itsVariables", null);
        setField(term720638, term720638.getClass(), "itsConst", null);
        setField(term720638, term720638.getClass(), "itsVariableNames", null);
        setIntField(term720638, term720638.getClass(), "varStart", 0);
        setField(term720638, term720638.getClass(), "compilerData", null);
        setIntField(term720638, term720638.getClass(), "type", 0);
        setIntField(term720639, term720639.getClass(), "type", 0);
        setField(term720639, term720639.getClass(), "next", null);
        setField(term720639, term720639.getClass(), "first", null);
        setField(term720639, term720639.getClass(), "last", null);
        setField(term720639, term720639.getClass(), "propListHead", null);
        setIntField(term720639, term720639.getClass(), "sourcePosition", 0);
        setField(term720639, term720639.getClass(), "jsType", null);
        setField(term720639, term720639.getClass(), "parent", null);
        setField(term720638, term720638.getClass(), "next", term720639);
        setField(term720638, term720638.getClass(), "first", null);
        setField(term720638, term720638.getClass(), "last", null);
        setField(term720638, term720638.getClass(), "propListHead", null);
        setIntField(term720638, term720638.getClass(), "sourcePosition", 0);
        setField(term720638, term720638.getClass(), "jsType", null);
        setField(term720638, term720638.getClass(), "parent", null);
        setField(term720637, term720637.getClass(), "first", term720638);
        setField(term720637, term720637.getClass(), "last", null);
        setField(term720637, term720637.getClass(), "propListHead", null);
        setIntField(term720637, term720637.getClass(), "sourcePosition", 0);
        setField(term720637, term720637.getClass(), "jsType", null);
        setField(term720637, term720637.getClass(), "parent", null);
        term720578 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term720580 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term720590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term720578, term720578.getClass(), "str", null);
        setIntField(term720578, term720578.getClass(), "type", 16);
        setField(term720578, term720578.getClass(), "next", null);
        setField(term720580, term720580.getClass(), "functionName", null);
        setBooleanField(term720580, term720580.getClass(), "itsNeedsActivation", false);
        setIntField(term720580, term720580.getClass(), "itsFunctionType", 0);
        setBooleanField(term720580, term720580.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term720580, term720580.getClass(), "encodedSourceStart", 0);
        setIntField(term720580, term720580.getClass(), "encodedSourceEnd", 0);
        setField(term720580, term720580.getClass(), "sourceName", null);
        setIntField(term720580, term720580.getClass(), "baseLineno", 0);
        setIntField(term720580, term720580.getClass(), "endLineno", 0);
        setField(term720580, term720580.getClass(), "functions", null);
        setField(term720580, term720580.getClass(), "regexps", null);
        setField(term720580, term720580.getClass(), "itsVariables", null);
        setField(term720580, term720580.getClass(), "itsConst", null);
        setField(term720580, term720580.getClass(), "itsVariableNames", null);
        setIntField(term720580, term720580.getClass(), "varStart", 0);
        setField(term720580, term720580.getClass(), "compilerData", null);
        setIntField(term720580, term720580.getClass(), "type", 0);
        setIntField(term720590, term720590.getClass(), "type", 0);
        setField(term720590, term720590.getClass(), "next", null);
        setField(term720590, term720590.getClass(), "first", null);
        setField(term720590, term720590.getClass(), "last", null);
        setField(term720590, term720590.getClass(), "propListHead", null);
        setIntField(term720590, term720590.getClass(), "sourcePosition", 0);
        setField(term720590, term720590.getClass(), "jsType", null);
        setField(term720590, term720590.getClass(), "parent", null);
        setField(term720580, term720580.getClass(), "next", term720590);
        setField(term720580, term720580.getClass(), "first", null);
        setField(term720580, term720580.getClass(), "last", null);
        setField(term720580, term720580.getClass(), "propListHead", null);
        setIntField(term720580, term720580.getClass(), "sourcePosition", 0);
        setField(term720580, term720580.getClass(), "jsType", null);
        setField(term720580, term720580.getClass(), "parent", null);
        setField(term720578, term720578.getClass(), "first", term720580);
        setField(term720578, term720578.getClass(), "last", null);
        setField(term720578, term720578.getClass(), "propListHead", null);
        setIntField(term720578, term720578.getClass(), "sourcePosition", 0);
        setField(term720578, term720578.getClass(), "jsType", null);
        setField(term720578, term720578.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term720002;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term719910, args);
        assertTrue(recursiveEquals(term719910, term720636));
        assertTrue(recursiveEquals(term720002, term720637));
        assertTrue(recursiveEquals(retValue, term720578));
    }

};


