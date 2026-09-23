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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236239;
     Object term236325;
     Object term236559;
     Object term236560;
     Object term236496;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236239 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term236325 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term236411 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term236481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term236411, term236411.getClass(), "next", term236481);
        setField(term236325, term236325.getClass(), "first", term236411);
        setIntField(term236325, term236325.getClass(), "type", 35);
        term236559 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term236559, term236559.getClass(), "currentTraversal", null);
        term236560 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term236561 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term236562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term236560, term236560.getClass(), "functionName", null);
        setBooleanField(term236560, term236560.getClass(), "itsNeedsActivation", false);
        setIntField(term236560, term236560.getClass(), "itsFunctionType", 0);
        setBooleanField(term236560, term236560.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term236560, term236560.getClass(), "encodedSourceStart", 0);
        setIntField(term236560, term236560.getClass(), "encodedSourceEnd", 0);
        setField(term236560, term236560.getClass(), "sourceName", null);
        setIntField(term236560, term236560.getClass(), "baseLineno", 0);
        setIntField(term236560, term236560.getClass(), "endLineno", 0);
        setField(term236560, term236560.getClass(), "functions", null);
        setField(term236560, term236560.getClass(), "regexps", null);
        setField(term236560, term236560.getClass(), "itsVariables", null);
        setField(term236560, term236560.getClass(), "itsConst", null);
        setField(term236560, term236560.getClass(), "itsVariableNames", null);
        setIntField(term236560, term236560.getClass(), "varStart", 0);
        setField(term236560, term236560.getClass(), "compilerData", null);
        setIntField(term236560, term236560.getClass(), "type", 35);
        setField(term236560, term236560.getClass(), "next", null);
        setField(term236561, term236561.getClass(), "functionName", null);
        setBooleanField(term236561, term236561.getClass(), "itsNeedsActivation", false);
        setIntField(term236561, term236561.getClass(), "itsFunctionType", 0);
        setBooleanField(term236561, term236561.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term236561, term236561.getClass(), "encodedSourceStart", 0);
        setIntField(term236561, term236561.getClass(), "encodedSourceEnd", 0);
        setField(term236561, term236561.getClass(), "sourceName", null);
        setIntField(term236561, term236561.getClass(), "baseLineno", 0);
        setIntField(term236561, term236561.getClass(), "endLineno", 0);
        setField(term236561, term236561.getClass(), "functions", null);
        setField(term236561, term236561.getClass(), "regexps", null);
        setField(term236561, term236561.getClass(), "itsVariables", null);
        setField(term236561, term236561.getClass(), "itsConst", null);
        setField(term236561, term236561.getClass(), "itsVariableNames", null);
        setIntField(term236561, term236561.getClass(), "varStart", 0);
        setField(term236561, term236561.getClass(), "compilerData", null);
        setIntField(term236561, term236561.getClass(), "type", 0);
        setIntField(term236562, term236562.getClass(), "type", 0);
        setField(term236562, term236562.getClass(), "next", null);
        setField(term236562, term236562.getClass(), "first", null);
        setField(term236562, term236562.getClass(), "last", null);
        setField(term236562, term236562.getClass(), "propListHead", null);
        setIntField(term236562, term236562.getClass(), "sourcePosition", 0);
        setField(term236562, term236562.getClass(), "jsType", null);
        setField(term236562, term236562.getClass(), "parent", null);
        setField(term236561, term236561.getClass(), "next", term236562);
        setField(term236561, term236561.getClass(), "first", null);
        setField(term236561, term236561.getClass(), "last", null);
        setField(term236561, term236561.getClass(), "propListHead", null);
        setIntField(term236561, term236561.getClass(), "sourcePosition", 0);
        setField(term236561, term236561.getClass(), "jsType", null);
        setField(term236561, term236561.getClass(), "parent", null);
        setField(term236560, term236560.getClass(), "first", term236561);
        setField(term236560, term236560.getClass(), "last", null);
        setField(term236560, term236560.getClass(), "propListHead", null);
        setIntField(term236560, term236560.getClass(), "sourcePosition", 0);
        setField(term236560, term236560.getClass(), "jsType", null);
        setField(term236560, term236560.getClass(), "parent", null);
        term236496 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term236506 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term236516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term236496, term236496.getClass(), "functionName", null);
        setBooleanField(term236496, term236496.getClass(), "itsNeedsActivation", false);
        setIntField(term236496, term236496.getClass(), "itsFunctionType", 0);
        setBooleanField(term236496, term236496.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term236496, term236496.getClass(), "encodedSourceStart", 0);
        setIntField(term236496, term236496.getClass(), "encodedSourceEnd", 0);
        setField(term236496, term236496.getClass(), "sourceName", null);
        setIntField(term236496, term236496.getClass(), "baseLineno", 0);
        setIntField(term236496, term236496.getClass(), "endLineno", 0);
        setField(term236496, term236496.getClass(), "functions", null);
        setField(term236496, term236496.getClass(), "regexps", null);
        setField(term236496, term236496.getClass(), "itsVariables", null);
        setField(term236496, term236496.getClass(), "itsConst", null);
        setField(term236496, term236496.getClass(), "itsVariableNames", null);
        setIntField(term236496, term236496.getClass(), "varStart", 0);
        setField(term236496, term236496.getClass(), "compilerData", null);
        setIntField(term236496, term236496.getClass(), "type", 35);
        setField(term236496, term236496.getClass(), "next", null);
        setField(term236506, term236506.getClass(), "functionName", null);
        setBooleanField(term236506, term236506.getClass(), "itsNeedsActivation", false);
        setIntField(term236506, term236506.getClass(), "itsFunctionType", 0);
        setBooleanField(term236506, term236506.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term236506, term236506.getClass(), "encodedSourceStart", 0);
        setIntField(term236506, term236506.getClass(), "encodedSourceEnd", 0);
        setField(term236506, term236506.getClass(), "sourceName", null);
        setIntField(term236506, term236506.getClass(), "baseLineno", 0);
        setIntField(term236506, term236506.getClass(), "endLineno", 0);
        setField(term236506, term236506.getClass(), "functions", null);
        setField(term236506, term236506.getClass(), "regexps", null);
        setField(term236506, term236506.getClass(), "itsVariables", null);
        setField(term236506, term236506.getClass(), "itsConst", null);
        setField(term236506, term236506.getClass(), "itsVariableNames", null);
        setIntField(term236506, term236506.getClass(), "varStart", 0);
        setField(term236506, term236506.getClass(), "compilerData", null);
        setIntField(term236506, term236506.getClass(), "type", 0);
        setIntField(term236516, term236516.getClass(), "type", 0);
        setField(term236516, term236516.getClass(), "next", null);
        setField(term236516, term236516.getClass(), "first", null);
        setField(term236516, term236516.getClass(), "last", null);
        setField(term236516, term236516.getClass(), "propListHead", null);
        setIntField(term236516, term236516.getClass(), "sourcePosition", 0);
        setField(term236516, term236516.getClass(), "jsType", null);
        setField(term236516, term236516.getClass(), "parent", null);
        setField(term236506, term236506.getClass(), "next", term236516);
        setField(term236506, term236506.getClass(), "first", null);
        setField(term236506, term236506.getClass(), "last", null);
        setField(term236506, term236506.getClass(), "propListHead", null);
        setIntField(term236506, term236506.getClass(), "sourcePosition", 0);
        setField(term236506, term236506.getClass(), "jsType", null);
        setField(term236506, term236506.getClass(), "parent", null);
        setField(term236496, term236496.getClass(), "first", term236506);
        setField(term236496, term236496.getClass(), "last", null);
        setField(term236496, term236496.getClass(), "propListHead", null);
        setIntField(term236496, term236496.getClass(), "sourcePosition", 0);
        setField(term236496, term236496.getClass(), "jsType", null);
        setField(term236496, term236496.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term236325;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term236239, args);
        assertTrue(recursiveEquals(term236239, term236559));
        assertTrue(recursiveEquals(term236325, term236560));
        assertTrue(recursiveEquals(retValue, term236496));
    }

};


