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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87322;
     Object term87408;
     Object term87582;
     Object term87583;
     Object term87517;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87322 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term87408 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term87494 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term87408, term87408.getClass(), "first", term87408);
        setField(term87408, term87408.getClass(), "next", term87494);
        setIntField(term87408, term87408.getClass(), "type", 33);
        term87582 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term87582, term87582.getClass(), "currentTraversal", null);
        term87583 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term87584 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term87583, term87583.getClass(), "functionName", null);
        setBooleanField(term87583, term87583.getClass(), "itsNeedsActivation", false);
        setIntField(term87583, term87583.getClass(), "itsFunctionType", 0);
        setBooleanField(term87583, term87583.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term87583, term87583.getClass(), "encodedSourceStart", 0);
        setIntField(term87583, term87583.getClass(), "encodedSourceEnd", 0);
        setField(term87583, term87583.getClass(), "sourceName", null);
        setIntField(term87583, term87583.getClass(), "baseLineno", 0);
        setIntField(term87583, term87583.getClass(), "endLineno", 0);
        setField(term87583, term87583.getClass(), "functions", null);
        setField(term87583, term87583.getClass(), "regexps", null);
        setField(term87583, term87583.getClass(), "itsVariables", null);
        setField(term87583, term87583.getClass(), "itsConst", null);
        setField(term87583, term87583.getClass(), "itsVariableNames", null);
        setIntField(term87583, term87583.getClass(), "varStart", 0);
        setField(term87583, term87583.getClass(), "compilerData", null);
        setIntField(term87583, term87583.getClass(), "type", 33);
        setField(term87584, term87584.getClass(), "functionName", null);
        setBooleanField(term87584, term87584.getClass(), "itsNeedsActivation", false);
        setIntField(term87584, term87584.getClass(), "itsFunctionType", 0);
        setBooleanField(term87584, term87584.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term87584, term87584.getClass(), "encodedSourceStart", 0);
        setIntField(term87584, term87584.getClass(), "encodedSourceEnd", 0);
        setField(term87584, term87584.getClass(), "sourceName", null);
        setIntField(term87584, term87584.getClass(), "baseLineno", 0);
        setIntField(term87584, term87584.getClass(), "endLineno", 0);
        setField(term87584, term87584.getClass(), "functions", null);
        setField(term87584, term87584.getClass(), "regexps", null);
        setField(term87584, term87584.getClass(), "itsVariables", null);
        setField(term87584, term87584.getClass(), "itsConst", null);
        setField(term87584, term87584.getClass(), "itsVariableNames", null);
        setIntField(term87584, term87584.getClass(), "varStart", 0);
        setField(term87584, term87584.getClass(), "compilerData", null);
        setIntField(term87584, term87584.getClass(), "type", 0);
        setField(term87584, term87584.getClass(), "next", null);
        setField(term87584, term87584.getClass(), "first", null);
        setField(term87584, term87584.getClass(), "last", null);
        setField(term87584, term87584.getClass(), "propListHead", null);
        setIntField(term87584, term87584.getClass(), "sourcePosition", 0);
        setField(term87584, term87584.getClass(), "jsType", null);
        setField(term87584, term87584.getClass(), "parent", null);
        setField(term87583, term87583.getClass(), "next", term87584);
        setField(term87583, term87583.getClass(), "first", term87583);
        setField(term87583, term87583.getClass(), "last", null);
        setField(term87583, term87583.getClass(), "propListHead", null);
        setIntField(term87583, term87583.getClass(), "sourcePosition", 0);
        setField(term87583, term87583.getClass(), "jsType", null);
        setField(term87583, term87583.getClass(), "parent", null);
        term87517 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term87527 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term87517, term87517.getClass(), "functionName", null);
        setBooleanField(term87517, term87517.getClass(), "itsNeedsActivation", false);
        setIntField(term87517, term87517.getClass(), "itsFunctionType", 0);
        setBooleanField(term87517, term87517.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term87517, term87517.getClass(), "encodedSourceStart", 0);
        setIntField(term87517, term87517.getClass(), "encodedSourceEnd", 0);
        setField(term87517, term87517.getClass(), "sourceName", null);
        setIntField(term87517, term87517.getClass(), "baseLineno", 0);
        setIntField(term87517, term87517.getClass(), "endLineno", 0);
        setField(term87517, term87517.getClass(), "functions", null);
        setField(term87517, term87517.getClass(), "regexps", null);
        setField(term87517, term87517.getClass(), "itsVariables", null);
        setField(term87517, term87517.getClass(), "itsConst", null);
        setField(term87517, term87517.getClass(), "itsVariableNames", null);
        setIntField(term87517, term87517.getClass(), "varStart", 0);
        setField(term87517, term87517.getClass(), "compilerData", null);
        setIntField(term87517, term87517.getClass(), "type", 33);
        setField(term87527, term87527.getClass(), "functionName", null);
        setBooleanField(term87527, term87527.getClass(), "itsNeedsActivation", false);
        setIntField(term87527, term87527.getClass(), "itsFunctionType", 0);
        setBooleanField(term87527, term87527.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term87527, term87527.getClass(), "encodedSourceStart", 0);
        setIntField(term87527, term87527.getClass(), "encodedSourceEnd", 0);
        setField(term87527, term87527.getClass(), "sourceName", null);
        setIntField(term87527, term87527.getClass(), "baseLineno", 0);
        setIntField(term87527, term87527.getClass(), "endLineno", 0);
        setField(term87527, term87527.getClass(), "functions", null);
        setField(term87527, term87527.getClass(), "regexps", null);
        setField(term87527, term87527.getClass(), "itsVariables", null);
        setField(term87527, term87527.getClass(), "itsConst", null);
        setField(term87527, term87527.getClass(), "itsVariableNames", null);
        setIntField(term87527, term87527.getClass(), "varStart", 0);
        setField(term87527, term87527.getClass(), "compilerData", null);
        setIntField(term87527, term87527.getClass(), "type", 0);
        setField(term87527, term87527.getClass(), "next", null);
        setField(term87527, term87527.getClass(), "first", null);
        setField(term87527, term87527.getClass(), "last", null);
        setField(term87527, term87527.getClass(), "propListHead", null);
        setIntField(term87527, term87527.getClass(), "sourcePosition", 0);
        setField(term87527, term87527.getClass(), "jsType", null);
        setField(term87527, term87527.getClass(), "parent", null);
        setField(term87517, term87517.getClass(), "next", term87527);
        setField(term87517, term87517.getClass(), "first", term87517);
        setField(term87517, term87517.getClass(), "last", null);
        setField(term87517, term87517.getClass(), "propListHead", null);
        setIntField(term87517, term87517.getClass(), "sourcePosition", 0);
        setField(term87517, term87517.getClass(), "jsType", null);
        setField(term87517, term87517.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term87408;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term87322, args);
        assertTrue(recursiveEquals(term87322, term87582));
        assertTrue(recursiveEquals(term87408, term87583));
        assertTrue(recursiveEquals(retValue, term87517));
    }

};


