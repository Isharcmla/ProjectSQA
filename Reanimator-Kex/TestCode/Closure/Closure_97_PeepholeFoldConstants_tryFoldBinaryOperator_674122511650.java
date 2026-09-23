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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169238;
     Object term169324;
     Object term169604;
     Object term169605;
     Object term169538;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169238 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term169324 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169410 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term169410, term169410.getClass(), "next", term169480);
        setField(term169324, term169324.getClass(), "first", term169410);
        setIntField(term169324, term169324.getClass(), "type", 13);
        term169604 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term169604, term169604.getClass(), "currentTraversal", null);
        term169605 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169606 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term169605, term169605.getClass(), "functionName", null);
        setBooleanField(term169605, term169605.getClass(), "itsNeedsActivation", false);
        setIntField(term169605, term169605.getClass(), "itsFunctionType", 0);
        setBooleanField(term169605, term169605.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term169605, term169605.getClass(), "encodedSourceStart", 0);
        setIntField(term169605, term169605.getClass(), "encodedSourceEnd", 0);
        setField(term169605, term169605.getClass(), "sourceName", null);
        setIntField(term169605, term169605.getClass(), "baseLineno", 0);
        setIntField(term169605, term169605.getClass(), "endLineno", 0);
        setField(term169605, term169605.getClass(), "functions", null);
        setField(term169605, term169605.getClass(), "regexps", null);
        setField(term169605, term169605.getClass(), "itsVariables", null);
        setField(term169605, term169605.getClass(), "itsConst", null);
        setField(term169605, term169605.getClass(), "itsVariableNames", null);
        setIntField(term169605, term169605.getClass(), "varStart", 0);
        setField(term169605, term169605.getClass(), "compilerData", null);
        setIntField(term169605, term169605.getClass(), "type", 13);
        setField(term169605, term169605.getClass(), "next", null);
        setField(term169606, term169606.getClass(), "functionName", null);
        setBooleanField(term169606, term169606.getClass(), "itsNeedsActivation", false);
        setIntField(term169606, term169606.getClass(), "itsFunctionType", 0);
        setBooleanField(term169606, term169606.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term169606, term169606.getClass(), "encodedSourceStart", 0);
        setIntField(term169606, term169606.getClass(), "encodedSourceEnd", 0);
        setField(term169606, term169606.getClass(), "sourceName", null);
        setIntField(term169606, term169606.getClass(), "baseLineno", 0);
        setIntField(term169606, term169606.getClass(), "endLineno", 0);
        setField(term169606, term169606.getClass(), "functions", null);
        setField(term169606, term169606.getClass(), "regexps", null);
        setField(term169606, term169606.getClass(), "itsVariables", null);
        setField(term169606, term169606.getClass(), "itsConst", null);
        setField(term169606, term169606.getClass(), "itsVariableNames", null);
        setIntField(term169606, term169606.getClass(), "varStart", 0);
        setField(term169606, term169606.getClass(), "compilerData", null);
        setIntField(term169606, term169606.getClass(), "type", 0);
        setIntField(term169607, term169607.getClass(), "type", 0);
        setField(term169607, term169607.getClass(), "next", null);
        setField(term169607, term169607.getClass(), "first", null);
        setField(term169607, term169607.getClass(), "last", null);
        setField(term169607, term169607.getClass(), "propListHead", null);
        setIntField(term169607, term169607.getClass(), "sourcePosition", 0);
        setField(term169607, term169607.getClass(), "jsType", null);
        setField(term169607, term169607.getClass(), "parent", null);
        setField(term169606, term169606.getClass(), "next", term169607);
        setField(term169606, term169606.getClass(), "first", null);
        setField(term169606, term169606.getClass(), "last", null);
        setField(term169606, term169606.getClass(), "propListHead", null);
        setIntField(term169606, term169606.getClass(), "sourcePosition", 0);
        setField(term169606, term169606.getClass(), "jsType", null);
        setField(term169606, term169606.getClass(), "parent", null);
        setField(term169605, term169605.getClass(), "first", term169606);
        setField(term169605, term169605.getClass(), "last", null);
        setField(term169605, term169605.getClass(), "propListHead", null);
        setIntField(term169605, term169605.getClass(), "sourcePosition", 0);
        setField(term169605, term169605.getClass(), "jsType", null);
        setField(term169605, term169605.getClass(), "parent", null);
        term169538 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169548 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term169538, term169538.getClass(), "functionName", null);
        setBooleanField(term169538, term169538.getClass(), "itsNeedsActivation", false);
        setIntField(term169538, term169538.getClass(), "itsFunctionType", 0);
        setBooleanField(term169538, term169538.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term169538, term169538.getClass(), "encodedSourceStart", 0);
        setIntField(term169538, term169538.getClass(), "encodedSourceEnd", 0);
        setField(term169538, term169538.getClass(), "sourceName", null);
        setIntField(term169538, term169538.getClass(), "baseLineno", 0);
        setIntField(term169538, term169538.getClass(), "endLineno", 0);
        setField(term169538, term169538.getClass(), "functions", null);
        setField(term169538, term169538.getClass(), "regexps", null);
        setField(term169538, term169538.getClass(), "itsVariables", null);
        setField(term169538, term169538.getClass(), "itsConst", null);
        setField(term169538, term169538.getClass(), "itsVariableNames", null);
        setIntField(term169538, term169538.getClass(), "varStart", 0);
        setField(term169538, term169538.getClass(), "compilerData", null);
        setIntField(term169538, term169538.getClass(), "type", 13);
        setField(term169538, term169538.getClass(), "next", null);
        setField(term169548, term169548.getClass(), "functionName", null);
        setBooleanField(term169548, term169548.getClass(), "itsNeedsActivation", false);
        setIntField(term169548, term169548.getClass(), "itsFunctionType", 0);
        setBooleanField(term169548, term169548.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term169548, term169548.getClass(), "encodedSourceStart", 0);
        setIntField(term169548, term169548.getClass(), "encodedSourceEnd", 0);
        setField(term169548, term169548.getClass(), "sourceName", null);
        setIntField(term169548, term169548.getClass(), "baseLineno", 0);
        setIntField(term169548, term169548.getClass(), "endLineno", 0);
        setField(term169548, term169548.getClass(), "functions", null);
        setField(term169548, term169548.getClass(), "regexps", null);
        setField(term169548, term169548.getClass(), "itsVariables", null);
        setField(term169548, term169548.getClass(), "itsConst", null);
        setField(term169548, term169548.getClass(), "itsVariableNames", null);
        setIntField(term169548, term169548.getClass(), "varStart", 0);
        setField(term169548, term169548.getClass(), "compilerData", null);
        setIntField(term169548, term169548.getClass(), "type", 0);
        setIntField(term169558, term169558.getClass(), "type", 0);
        setField(term169558, term169558.getClass(), "next", null);
        setField(term169558, term169558.getClass(), "first", null);
        setField(term169558, term169558.getClass(), "last", null);
        setField(term169558, term169558.getClass(), "propListHead", null);
        setIntField(term169558, term169558.getClass(), "sourcePosition", 0);
        setField(term169558, term169558.getClass(), "jsType", null);
        setField(term169558, term169558.getClass(), "parent", null);
        setField(term169548, term169548.getClass(), "next", term169558);
        setField(term169548, term169548.getClass(), "first", null);
        setField(term169548, term169548.getClass(), "last", null);
        setField(term169548, term169548.getClass(), "propListHead", null);
        setIntField(term169548, term169548.getClass(), "sourcePosition", 0);
        setField(term169548, term169548.getClass(), "jsType", null);
        setField(term169548, term169548.getClass(), "parent", null);
        setField(term169538, term169538.getClass(), "first", term169548);
        setField(term169538, term169538.getClass(), "last", null);
        setField(term169538, term169538.getClass(), "propListHead", null);
        setIntField(term169538, term169538.getClass(), "sourcePosition", 0);
        setField(term169538, term169538.getClass(), "jsType", null);
        setField(term169538, term169538.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term169324;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term169238, args);
        assertTrue(recursiveEquals(term169238, term169604));
        assertTrue(recursiveEquals(term169324, term169605));
        assertTrue(recursiveEquals(retValue, term169538));
    }

};


