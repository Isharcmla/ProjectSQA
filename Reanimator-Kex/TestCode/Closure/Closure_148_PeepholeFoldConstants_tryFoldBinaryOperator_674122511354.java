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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71045;
     Object term71131;
     Object term71367;
     Object term71368;
     Object term71308;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71045 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term71131 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term71217 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term71287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term71217, term71217.getClass(), "next", term71287);
        setField(term71131, term71131.getClass(), "first", term71217);
        setIntField(term71131, term71131.getClass(), "type", 23);
        term71367 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term71367, term71367.getClass(), "currentTraversal", null);
        term71368 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term71369 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term71370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term71368, term71368.getClass(), "functionName", null);
        setBooleanField(term71368, term71368.getClass(), "itsNeedsActivation", false);
        setIntField(term71368, term71368.getClass(), "itsFunctionType", 0);
        setBooleanField(term71368, term71368.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term71368, term71368.getClass(), "encodedSourceStart", 0);
        setIntField(term71368, term71368.getClass(), "encodedSourceEnd", 0);
        setField(term71368, term71368.getClass(), "sourceName", null);
        setIntField(term71368, term71368.getClass(), "baseLineno", 0);
        setIntField(term71368, term71368.getClass(), "endLineno", 0);
        setField(term71368, term71368.getClass(), "functions", null);
        setField(term71368, term71368.getClass(), "regexps", null);
        setField(term71368, term71368.getClass(), "itsVariables", null);
        setField(term71368, term71368.getClass(), "itsConst", null);
        setField(term71368, term71368.getClass(), "itsVariableNames", null);
        setIntField(term71368, term71368.getClass(), "varStart", 0);
        setField(term71368, term71368.getClass(), "compilerData", null);
        setIntField(term71368, term71368.getClass(), "type", 23);
        setField(term71368, term71368.getClass(), "next", null);
        setField(term71369, term71369.getClass(), "functionName", null);
        setBooleanField(term71369, term71369.getClass(), "itsNeedsActivation", false);
        setIntField(term71369, term71369.getClass(), "itsFunctionType", 0);
        setBooleanField(term71369, term71369.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term71369, term71369.getClass(), "encodedSourceStart", 0);
        setIntField(term71369, term71369.getClass(), "encodedSourceEnd", 0);
        setField(term71369, term71369.getClass(), "sourceName", null);
        setIntField(term71369, term71369.getClass(), "baseLineno", 0);
        setIntField(term71369, term71369.getClass(), "endLineno", 0);
        setField(term71369, term71369.getClass(), "functions", null);
        setField(term71369, term71369.getClass(), "regexps", null);
        setField(term71369, term71369.getClass(), "itsVariables", null);
        setField(term71369, term71369.getClass(), "itsConst", null);
        setField(term71369, term71369.getClass(), "itsVariableNames", null);
        setIntField(term71369, term71369.getClass(), "varStart", 0);
        setField(term71369, term71369.getClass(), "compilerData", null);
        setIntField(term71369, term71369.getClass(), "type", 0);
        setIntField(term71370, term71370.getClass(), "type", 0);
        setField(term71370, term71370.getClass(), "next", null);
        setField(term71370, term71370.getClass(), "first", null);
        setField(term71370, term71370.getClass(), "last", null);
        setField(term71370, term71370.getClass(), "propListHead", null);
        setIntField(term71370, term71370.getClass(), "sourcePosition", 0);
        setField(term71370, term71370.getClass(), "jsType", null);
        setField(term71370, term71370.getClass(), "parent", null);
        setField(term71369, term71369.getClass(), "next", term71370);
        setField(term71369, term71369.getClass(), "first", null);
        setField(term71369, term71369.getClass(), "last", null);
        setField(term71369, term71369.getClass(), "propListHead", null);
        setIntField(term71369, term71369.getClass(), "sourcePosition", 0);
        setField(term71369, term71369.getClass(), "jsType", null);
        setField(term71369, term71369.getClass(), "parent", null);
        setField(term71368, term71368.getClass(), "first", term71369);
        setField(term71368, term71368.getClass(), "last", null);
        setField(term71368, term71368.getClass(), "propListHead", null);
        setIntField(term71368, term71368.getClass(), "sourcePosition", 0);
        setField(term71368, term71368.getClass(), "jsType", null);
        setField(term71368, term71368.getClass(), "parent", null);
        term71308 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term71318 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term71328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term71308, term71308.getClass(), "functionName", null);
        setBooleanField(term71308, term71308.getClass(), "itsNeedsActivation", false);
        setIntField(term71308, term71308.getClass(), "itsFunctionType", 0);
        setBooleanField(term71308, term71308.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term71308, term71308.getClass(), "encodedSourceStart", 0);
        setIntField(term71308, term71308.getClass(), "encodedSourceEnd", 0);
        setField(term71308, term71308.getClass(), "sourceName", null);
        setIntField(term71308, term71308.getClass(), "baseLineno", 0);
        setIntField(term71308, term71308.getClass(), "endLineno", 0);
        setField(term71308, term71308.getClass(), "functions", null);
        setField(term71308, term71308.getClass(), "regexps", null);
        setField(term71308, term71308.getClass(), "itsVariables", null);
        setField(term71308, term71308.getClass(), "itsConst", null);
        setField(term71308, term71308.getClass(), "itsVariableNames", null);
        setIntField(term71308, term71308.getClass(), "varStart", 0);
        setField(term71308, term71308.getClass(), "compilerData", null);
        setIntField(term71308, term71308.getClass(), "type", 23);
        setField(term71308, term71308.getClass(), "next", null);
        setField(term71318, term71318.getClass(), "functionName", null);
        setBooleanField(term71318, term71318.getClass(), "itsNeedsActivation", false);
        setIntField(term71318, term71318.getClass(), "itsFunctionType", 0);
        setBooleanField(term71318, term71318.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term71318, term71318.getClass(), "encodedSourceStart", 0);
        setIntField(term71318, term71318.getClass(), "encodedSourceEnd", 0);
        setField(term71318, term71318.getClass(), "sourceName", null);
        setIntField(term71318, term71318.getClass(), "baseLineno", 0);
        setIntField(term71318, term71318.getClass(), "endLineno", 0);
        setField(term71318, term71318.getClass(), "functions", null);
        setField(term71318, term71318.getClass(), "regexps", null);
        setField(term71318, term71318.getClass(), "itsVariables", null);
        setField(term71318, term71318.getClass(), "itsConst", null);
        setField(term71318, term71318.getClass(), "itsVariableNames", null);
        setIntField(term71318, term71318.getClass(), "varStart", 0);
        setField(term71318, term71318.getClass(), "compilerData", null);
        setIntField(term71318, term71318.getClass(), "type", 0);
        setIntField(term71328, term71328.getClass(), "type", 0);
        setField(term71328, term71328.getClass(), "next", null);
        setField(term71328, term71328.getClass(), "first", null);
        setField(term71328, term71328.getClass(), "last", null);
        setField(term71328, term71328.getClass(), "propListHead", null);
        setIntField(term71328, term71328.getClass(), "sourcePosition", 0);
        setField(term71328, term71328.getClass(), "jsType", null);
        setField(term71328, term71328.getClass(), "parent", null);
        setField(term71318, term71318.getClass(), "next", term71328);
        setField(term71318, term71318.getClass(), "first", null);
        setField(term71318, term71318.getClass(), "last", null);
        setField(term71318, term71318.getClass(), "propListHead", null);
        setIntField(term71318, term71318.getClass(), "sourcePosition", 0);
        setField(term71318, term71318.getClass(), "jsType", null);
        setField(term71318, term71318.getClass(), "parent", null);
        setField(term71308, term71308.getClass(), "first", term71318);
        setField(term71308, term71308.getClass(), "last", null);
        setField(term71308, term71308.getClass(), "propListHead", null);
        setIntField(term71308, term71308.getClass(), "sourcePosition", 0);
        setField(term71308, term71308.getClass(), "jsType", null);
        setField(term71308, term71308.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term71131;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term71045, args);
        assertTrue(recursiveEquals(term71045, term71367));
        assertTrue(recursiveEquals(term71131, term71368));
        assertTrue(recursiveEquals(retValue, term71308));
    }

};


