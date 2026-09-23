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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473077;
     Object term473163;
     Object term518615;
     Object term518616;
     Object term518537;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term473077 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term473163 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term473249 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term473163, term473163.getClass(), "first", term473163);
        setField(term473163, term473163.getClass(), "next", term473249);
        setIntField(term473163, term473163.getClass(), "type", 14);
        term518615 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term518615, term518615.getClass(), "currentTraversal", null);
        term518616 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term518617 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term518616, term518616.getClass(), "functionName", null);
        setBooleanField(term518616, term518616.getClass(), "itsNeedsActivation", false);
        setIntField(term518616, term518616.getClass(), "itsFunctionType", 0);
        setBooleanField(term518616, term518616.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term518616, term518616.getClass(), "encodedSourceStart", 0);
        setIntField(term518616, term518616.getClass(), "encodedSourceEnd", 0);
        setField(term518616, term518616.getClass(), "sourceName", null);
        setIntField(term518616, term518616.getClass(), "baseLineno", 0);
        setIntField(term518616, term518616.getClass(), "endLineno", 0);
        setField(term518616, term518616.getClass(), "functions", null);
        setField(term518616, term518616.getClass(), "regexps", null);
        setField(term518616, term518616.getClass(), "itsVariables", null);
        setField(term518616, term518616.getClass(), "itsConst", null);
        setField(term518616, term518616.getClass(), "itsVariableNames", null);
        setIntField(term518616, term518616.getClass(), "varStart", 0);
        setField(term518616, term518616.getClass(), "compilerData", null);
        setIntField(term518616, term518616.getClass(), "type", 14);
        setField(term518617, term518617.getClass(), "functionName", null);
        setBooleanField(term518617, term518617.getClass(), "itsNeedsActivation", false);
        setIntField(term518617, term518617.getClass(), "itsFunctionType", 0);
        setBooleanField(term518617, term518617.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term518617, term518617.getClass(), "encodedSourceStart", 0);
        setIntField(term518617, term518617.getClass(), "encodedSourceEnd", 0);
        setField(term518617, term518617.getClass(), "sourceName", null);
        setIntField(term518617, term518617.getClass(), "baseLineno", 0);
        setIntField(term518617, term518617.getClass(), "endLineno", 0);
        setField(term518617, term518617.getClass(), "functions", null);
        setField(term518617, term518617.getClass(), "regexps", null);
        setField(term518617, term518617.getClass(), "itsVariables", null);
        setField(term518617, term518617.getClass(), "itsConst", null);
        setField(term518617, term518617.getClass(), "itsVariableNames", null);
        setIntField(term518617, term518617.getClass(), "varStart", 0);
        setField(term518617, term518617.getClass(), "compilerData", null);
        setIntField(term518617, term518617.getClass(), "type", 0);
        setField(term518617, term518617.getClass(), "next", null);
        setField(term518617, term518617.getClass(), "first", null);
        setField(term518617, term518617.getClass(), "last", null);
        setField(term518617, term518617.getClass(), "propListHead", null);
        setIntField(term518617, term518617.getClass(), "sourcePosition", 0);
        setField(term518617, term518617.getClass(), "jsType", null);
        setField(term518617, term518617.getClass(), "parent", null);
        setField(term518616, term518616.getClass(), "next", term518617);
        setField(term518616, term518616.getClass(), "first", term518616);
        setField(term518616, term518616.getClass(), "last", null);
        setField(term518616, term518616.getClass(), "propListHead", null);
        setIntField(term518616, term518616.getClass(), "sourcePosition", 0);
        setField(term518616, term518616.getClass(), "jsType", null);
        setField(term518616, term518616.getClass(), "parent", null);
        term518537 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term518547 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term518537, term518537.getClass(), "functionName", null);
        setBooleanField(term518537, term518537.getClass(), "itsNeedsActivation", false);
        setIntField(term518537, term518537.getClass(), "itsFunctionType", 0);
        setBooleanField(term518537, term518537.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term518537, term518537.getClass(), "encodedSourceStart", 0);
        setIntField(term518537, term518537.getClass(), "encodedSourceEnd", 0);
        setField(term518537, term518537.getClass(), "sourceName", null);
        setIntField(term518537, term518537.getClass(), "baseLineno", 0);
        setIntField(term518537, term518537.getClass(), "endLineno", 0);
        setField(term518537, term518537.getClass(), "functions", null);
        setField(term518537, term518537.getClass(), "regexps", null);
        setField(term518537, term518537.getClass(), "itsVariables", null);
        setField(term518537, term518537.getClass(), "itsConst", null);
        setField(term518537, term518537.getClass(), "itsVariableNames", null);
        setIntField(term518537, term518537.getClass(), "varStart", 0);
        setField(term518537, term518537.getClass(), "compilerData", null);
        setIntField(term518537, term518537.getClass(), "type", 14);
        setField(term518547, term518547.getClass(), "functionName", null);
        setBooleanField(term518547, term518547.getClass(), "itsNeedsActivation", false);
        setIntField(term518547, term518547.getClass(), "itsFunctionType", 0);
        setBooleanField(term518547, term518547.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term518547, term518547.getClass(), "encodedSourceStart", 0);
        setIntField(term518547, term518547.getClass(), "encodedSourceEnd", 0);
        setField(term518547, term518547.getClass(), "sourceName", null);
        setIntField(term518547, term518547.getClass(), "baseLineno", 0);
        setIntField(term518547, term518547.getClass(), "endLineno", 0);
        setField(term518547, term518547.getClass(), "functions", null);
        setField(term518547, term518547.getClass(), "regexps", null);
        setField(term518547, term518547.getClass(), "itsVariables", null);
        setField(term518547, term518547.getClass(), "itsConst", null);
        setField(term518547, term518547.getClass(), "itsVariableNames", null);
        setIntField(term518547, term518547.getClass(), "varStart", 0);
        setField(term518547, term518547.getClass(), "compilerData", null);
        setIntField(term518547, term518547.getClass(), "type", 0);
        setField(term518547, term518547.getClass(), "next", null);
        setField(term518547, term518547.getClass(), "first", null);
        setField(term518547, term518547.getClass(), "last", null);
        setField(term518547, term518547.getClass(), "propListHead", null);
        setIntField(term518547, term518547.getClass(), "sourcePosition", 0);
        setField(term518547, term518547.getClass(), "jsType", null);
        setField(term518547, term518547.getClass(), "parent", null);
        setField(term518537, term518537.getClass(), "next", term518547);
        setField(term518537, term518537.getClass(), "first", term518537);
        setField(term518537, term518537.getClass(), "last", null);
        setField(term518537, term518537.getClass(), "propListHead", null);
        setIntField(term518537, term518537.getClass(), "sourcePosition", 0);
        setField(term518537, term518537.getClass(), "jsType", null);
        setField(term518537, term518537.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term473163;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term473077, args);
        assertTrue(recursiveEquals(term473077, term518615));
        assertTrue(recursiveEquals(term473163, term518616));
        assertTrue(recursiveEquals(retValue, term518537));
    }

};


