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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81106;
     Object term81192;
     Object term81382;
     Object term81383;
     Object term81338;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81106 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term81192 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term81262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81192, term81192.getClass(), "first", term81192);
        setField(term81192, term81192.getClass(), "next", term81262);
        setIntField(term81192, term81192.getClass(), "type", 13);
        term81382 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term81382, term81382.getClass(), "currentTraversal", null);
        term81383 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term81384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81383, term81383.getClass(), "functionName", null);
        setBooleanField(term81383, term81383.getClass(), "itsNeedsActivation", false);
        setIntField(term81383, term81383.getClass(), "itsFunctionType", 0);
        setBooleanField(term81383, term81383.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81383, term81383.getClass(), "encodedSourceStart", 0);
        setIntField(term81383, term81383.getClass(), "encodedSourceEnd", 0);
        setField(term81383, term81383.getClass(), "sourceName", null);
        setIntField(term81383, term81383.getClass(), "baseLineno", 0);
        setIntField(term81383, term81383.getClass(), "endLineno", 0);
        setField(term81383, term81383.getClass(), "functions", null);
        setField(term81383, term81383.getClass(), "regexps", null);
        setField(term81383, term81383.getClass(), "itsVariables", null);
        setField(term81383, term81383.getClass(), "itsConst", null);
        setField(term81383, term81383.getClass(), "itsVariableNames", null);
        setIntField(term81383, term81383.getClass(), "varStart", 0);
        setField(term81383, term81383.getClass(), "compilerData", null);
        setIntField(term81383, term81383.getClass(), "type", 13);
        setIntField(term81384, term81384.getClass(), "type", 0);
        setField(term81384, term81384.getClass(), "next", null);
        setField(term81384, term81384.getClass(), "first", null);
        setField(term81384, term81384.getClass(), "last", null);
        setField(term81384, term81384.getClass(), "propListHead", null);
        setIntField(term81384, term81384.getClass(), "sourcePosition", 0);
        setField(term81384, term81384.getClass(), "jsType", null);
        setField(term81384, term81384.getClass(), "parent", null);
        setField(term81383, term81383.getClass(), "next", term81384);
        setField(term81383, term81383.getClass(), "first", term81383);
        setField(term81383, term81383.getClass(), "last", null);
        setField(term81383, term81383.getClass(), "propListHead", null);
        setIntField(term81383, term81383.getClass(), "sourcePosition", 0);
        setField(term81383, term81383.getClass(), "jsType", null);
        setField(term81383, term81383.getClass(), "parent", null);
        term81338 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term81348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81338, term81338.getClass(), "functionName", null);
        setBooleanField(term81338, term81338.getClass(), "itsNeedsActivation", false);
        setIntField(term81338, term81338.getClass(), "itsFunctionType", 0);
        setBooleanField(term81338, term81338.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81338, term81338.getClass(), "encodedSourceStart", 0);
        setIntField(term81338, term81338.getClass(), "encodedSourceEnd", 0);
        setField(term81338, term81338.getClass(), "sourceName", null);
        setIntField(term81338, term81338.getClass(), "baseLineno", 0);
        setIntField(term81338, term81338.getClass(), "endLineno", 0);
        setField(term81338, term81338.getClass(), "functions", null);
        setField(term81338, term81338.getClass(), "regexps", null);
        setField(term81338, term81338.getClass(), "itsVariables", null);
        setField(term81338, term81338.getClass(), "itsConst", null);
        setField(term81338, term81338.getClass(), "itsVariableNames", null);
        setIntField(term81338, term81338.getClass(), "varStart", 0);
        setField(term81338, term81338.getClass(), "compilerData", null);
        setIntField(term81338, term81338.getClass(), "type", 13);
        setIntField(term81348, term81348.getClass(), "type", 0);
        setField(term81348, term81348.getClass(), "next", null);
        setField(term81348, term81348.getClass(), "first", null);
        setField(term81348, term81348.getClass(), "last", null);
        setField(term81348, term81348.getClass(), "propListHead", null);
        setIntField(term81348, term81348.getClass(), "sourcePosition", 0);
        setField(term81348, term81348.getClass(), "jsType", null);
        setField(term81348, term81348.getClass(), "parent", null);
        setField(term81338, term81338.getClass(), "next", term81348);
        setField(term81338, term81338.getClass(), "first", term81338);
        setField(term81338, term81338.getClass(), "last", null);
        setField(term81338, term81338.getClass(), "propListHead", null);
        setIntField(term81338, term81338.getClass(), "sourcePosition", 0);
        setField(term81338, term81338.getClass(), "jsType", null);
        setField(term81338, term81338.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term81192;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term81106, args);
        assertTrue(recursiveEquals(term81106, term81382));
        assertTrue(recursiveEquals(term81192, term81383));
        assertTrue(recursiveEquals(retValue, term81338));
    }

};


