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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term554726;
     Object term554812;
     Object term555451;
     Object term555452;
     Object term555370;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term554726 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term554812 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term554898 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term554990 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term554990, term554990.getClass(), "type", 106);
        setField(term554898, term554898.getClass(), "next", term554990);
        setIntField(term554898, term554898.getClass(), "type", 42);
        setField(term554812, term554812.getClass(), "first", term554898);
        setIntField(term554812, term554812.getClass(), "type", 14);
        term555451 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term555451, term555451.getClass(), "currentTraversal", null);
        term555452 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term555453 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term555454 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term555452, term555452.getClass(), "functionName", null);
        setBooleanField(term555452, term555452.getClass(), "itsNeedsActivation", false);
        setIntField(term555452, term555452.getClass(), "itsFunctionType", 0);
        setBooleanField(term555452, term555452.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term555452, term555452.getClass(), "encodedSourceStart", 0);
        setIntField(term555452, term555452.getClass(), "encodedSourceEnd", 0);
        setField(term555452, term555452.getClass(), "sourceName", null);
        setIntField(term555452, term555452.getClass(), "baseLineno", 0);
        setIntField(term555452, term555452.getClass(), "endLineno", 0);
        setField(term555452, term555452.getClass(), "functions", null);
        setField(term555452, term555452.getClass(), "regexps", null);
        setField(term555452, term555452.getClass(), "itsVariables", null);
        setField(term555452, term555452.getClass(), "itsConst", null);
        setField(term555452, term555452.getClass(), "itsVariableNames", null);
        setIntField(term555452, term555452.getClass(), "varStart", 0);
        setField(term555452, term555452.getClass(), "compilerData", null);
        setIntField(term555452, term555452.getClass(), "type", 14);
        setField(term555452, term555452.getClass(), "next", null);
        setField(term555453, term555453.getClass(), "functionName", null);
        setBooleanField(term555453, term555453.getClass(), "itsNeedsActivation", false);
        setIntField(term555453, term555453.getClass(), "itsFunctionType", 0);
        setBooleanField(term555453, term555453.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term555453, term555453.getClass(), "encodedSourceStart", 0);
        setIntField(term555453, term555453.getClass(), "encodedSourceEnd", 0);
        setField(term555453, term555453.getClass(), "sourceName", null);
        setIntField(term555453, term555453.getClass(), "baseLineno", 0);
        setIntField(term555453, term555453.getClass(), "endLineno", 0);
        setField(term555453, term555453.getClass(), "functions", null);
        setField(term555453, term555453.getClass(), "regexps", null);
        setField(term555453, term555453.getClass(), "itsVariables", null);
        setField(term555453, term555453.getClass(), "itsConst", null);
        setField(term555453, term555453.getClass(), "itsVariableNames", null);
        setIntField(term555453, term555453.getClass(), "varStart", 0);
        setField(term555453, term555453.getClass(), "compilerData", null);
        setIntField(term555453, term555453.getClass(), "type", 42);
        setField(term555454, term555454.getClass(), "str", null);
        setIntField(term555454, term555454.getClass(), "type", 106);
        setField(term555454, term555454.getClass(), "next", null);
        setField(term555454, term555454.getClass(), "first", null);
        setField(term555454, term555454.getClass(), "last", null);
        setField(term555454, term555454.getClass(), "propListHead", null);
        setIntField(term555454, term555454.getClass(), "sourcePosition", 0);
        setField(term555454, term555454.getClass(), "jsType", null);
        setField(term555454, term555454.getClass(), "parent", null);
        setField(term555453, term555453.getClass(), "next", term555454);
        setField(term555453, term555453.getClass(), "first", null);
        setField(term555453, term555453.getClass(), "last", null);
        setField(term555453, term555453.getClass(), "propListHead", null);
        setIntField(term555453, term555453.getClass(), "sourcePosition", 0);
        setField(term555453, term555453.getClass(), "jsType", null);
        setField(term555453, term555453.getClass(), "parent", null);
        setField(term555452, term555452.getClass(), "first", term555453);
        setField(term555452, term555452.getClass(), "last", null);
        setField(term555452, term555452.getClass(), "propListHead", null);
        setIntField(term555452, term555452.getClass(), "sourcePosition", 0);
        setField(term555452, term555452.getClass(), "jsType", null);
        setField(term555452, term555452.getClass(), "parent", null);
        term555370 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term555380 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term555390 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term555370, term555370.getClass(), "functionName", null);
        setBooleanField(term555370, term555370.getClass(), "itsNeedsActivation", false);
        setIntField(term555370, term555370.getClass(), "itsFunctionType", 0);
        setBooleanField(term555370, term555370.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term555370, term555370.getClass(), "encodedSourceStart", 0);
        setIntField(term555370, term555370.getClass(), "encodedSourceEnd", 0);
        setField(term555370, term555370.getClass(), "sourceName", null);
        setIntField(term555370, term555370.getClass(), "baseLineno", 0);
        setIntField(term555370, term555370.getClass(), "endLineno", 0);
        setField(term555370, term555370.getClass(), "functions", null);
        setField(term555370, term555370.getClass(), "regexps", null);
        setField(term555370, term555370.getClass(), "itsVariables", null);
        setField(term555370, term555370.getClass(), "itsConst", null);
        setField(term555370, term555370.getClass(), "itsVariableNames", null);
        setIntField(term555370, term555370.getClass(), "varStart", 0);
        setField(term555370, term555370.getClass(), "compilerData", null);
        setIntField(term555370, term555370.getClass(), "type", 14);
        setField(term555370, term555370.getClass(), "next", null);
        setField(term555380, term555380.getClass(), "functionName", null);
        setBooleanField(term555380, term555380.getClass(), "itsNeedsActivation", false);
        setIntField(term555380, term555380.getClass(), "itsFunctionType", 0);
        setBooleanField(term555380, term555380.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term555380, term555380.getClass(), "encodedSourceStart", 0);
        setIntField(term555380, term555380.getClass(), "encodedSourceEnd", 0);
        setField(term555380, term555380.getClass(), "sourceName", null);
        setIntField(term555380, term555380.getClass(), "baseLineno", 0);
        setIntField(term555380, term555380.getClass(), "endLineno", 0);
        setField(term555380, term555380.getClass(), "functions", null);
        setField(term555380, term555380.getClass(), "regexps", null);
        setField(term555380, term555380.getClass(), "itsVariables", null);
        setField(term555380, term555380.getClass(), "itsConst", null);
        setField(term555380, term555380.getClass(), "itsVariableNames", null);
        setIntField(term555380, term555380.getClass(), "varStart", 0);
        setField(term555380, term555380.getClass(), "compilerData", null);
        setIntField(term555380, term555380.getClass(), "type", 42);
        setField(term555390, term555390.getClass(), "str", null);
        setIntField(term555390, term555390.getClass(), "type", 106);
        setField(term555390, term555390.getClass(), "next", null);
        setField(term555390, term555390.getClass(), "first", null);
        setField(term555390, term555390.getClass(), "last", null);
        setField(term555390, term555390.getClass(), "propListHead", null);
        setIntField(term555390, term555390.getClass(), "sourcePosition", 0);
        setField(term555390, term555390.getClass(), "jsType", null);
        setField(term555390, term555390.getClass(), "parent", null);
        setField(term555380, term555380.getClass(), "next", term555390);
        setField(term555380, term555380.getClass(), "first", null);
        setField(term555380, term555380.getClass(), "last", null);
        setField(term555380, term555380.getClass(), "propListHead", null);
        setIntField(term555380, term555380.getClass(), "sourcePosition", 0);
        setField(term555380, term555380.getClass(), "jsType", null);
        setField(term555380, term555380.getClass(), "parent", null);
        setField(term555370, term555370.getClass(), "first", term555380);
        setField(term555370, term555370.getClass(), "last", null);
        setField(term555370, term555370.getClass(), "propListHead", null);
        setIntField(term555370, term555370.getClass(), "sourcePosition", 0);
        setField(term555370, term555370.getClass(), "jsType", null);
        setField(term555370, term555370.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term554812;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term554726, args);
        assertTrue(recursiveEquals(term554726, term555451));
        assertTrue(recursiveEquals(term554812, term555452));
        assertTrue(recursiveEquals(retValue, term555370));
    }

};


