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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348754;
     Object term348840;
     Object term349431;
     Object term349432;
     Object term349353;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348754 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term348840 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term348926 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term349018 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term349018, term349018.getClass(), "type", 42);
        setField(term348926, term348926.getClass(), "next", term349018);
        setIntField(term348926, term348926.getClass(), "type", 42);
        setField(term348840, term348840.getClass(), "first", term348926);
        setIntField(term348840, term348840.getClass(), "type", 14);
        term349431 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term349431, term349431.getClass(), "currentTraversal", null);
        term349432 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term349433 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term349434 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term349432, term349432.getClass(), "functionName", null);
        setBooleanField(term349432, term349432.getClass(), "itsNeedsActivation", false);
        setIntField(term349432, term349432.getClass(), "itsFunctionType", 0);
        setBooleanField(term349432, term349432.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term349432, term349432.getClass(), "encodedSourceStart", 0);
        setIntField(term349432, term349432.getClass(), "encodedSourceEnd", 0);
        setField(term349432, term349432.getClass(), "sourceName", null);
        setIntField(term349432, term349432.getClass(), "baseLineno", 0);
        setIntField(term349432, term349432.getClass(), "endLineno", 0);
        setField(term349432, term349432.getClass(), "functions", null);
        setField(term349432, term349432.getClass(), "regexps", null);
        setField(term349432, term349432.getClass(), "itsVariables", null);
        setField(term349432, term349432.getClass(), "itsConst", null);
        setField(term349432, term349432.getClass(), "itsVariableNames", null);
        setIntField(term349432, term349432.getClass(), "varStart", 0);
        setField(term349432, term349432.getClass(), "compilerData", null);
        setIntField(term349432, term349432.getClass(), "type", 14);
        setField(term349432, term349432.getClass(), "next", null);
        setField(term349433, term349433.getClass(), "functionName", null);
        setBooleanField(term349433, term349433.getClass(), "itsNeedsActivation", false);
        setIntField(term349433, term349433.getClass(), "itsFunctionType", 0);
        setBooleanField(term349433, term349433.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term349433, term349433.getClass(), "encodedSourceStart", 0);
        setIntField(term349433, term349433.getClass(), "encodedSourceEnd", 0);
        setField(term349433, term349433.getClass(), "sourceName", null);
        setIntField(term349433, term349433.getClass(), "baseLineno", 0);
        setIntField(term349433, term349433.getClass(), "endLineno", 0);
        setField(term349433, term349433.getClass(), "functions", null);
        setField(term349433, term349433.getClass(), "regexps", null);
        setField(term349433, term349433.getClass(), "itsVariables", null);
        setField(term349433, term349433.getClass(), "itsConst", null);
        setField(term349433, term349433.getClass(), "itsVariableNames", null);
        setIntField(term349433, term349433.getClass(), "varStart", 0);
        setField(term349433, term349433.getClass(), "compilerData", null);
        setIntField(term349433, term349433.getClass(), "type", 42);
        setField(term349434, term349434.getClass(), "str", null);
        setIntField(term349434, term349434.getClass(), "type", 42);
        setField(term349434, term349434.getClass(), "next", null);
        setField(term349434, term349434.getClass(), "first", null);
        setField(term349434, term349434.getClass(), "last", null);
        setField(term349434, term349434.getClass(), "propListHead", null);
        setIntField(term349434, term349434.getClass(), "sourcePosition", 0);
        setField(term349434, term349434.getClass(), "jsType", null);
        setField(term349434, term349434.getClass(), "parent", null);
        setField(term349433, term349433.getClass(), "next", term349434);
        setField(term349433, term349433.getClass(), "first", null);
        setField(term349433, term349433.getClass(), "last", null);
        setField(term349433, term349433.getClass(), "propListHead", null);
        setIntField(term349433, term349433.getClass(), "sourcePosition", 0);
        setField(term349433, term349433.getClass(), "jsType", null);
        setField(term349433, term349433.getClass(), "parent", null);
        setField(term349432, term349432.getClass(), "first", term349433);
        setField(term349432, term349432.getClass(), "last", null);
        setField(term349432, term349432.getClass(), "propListHead", null);
        setIntField(term349432, term349432.getClass(), "sourcePosition", 0);
        setField(term349432, term349432.getClass(), "jsType", null);
        setField(term349432, term349432.getClass(), "parent", null);
        term349353 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term349363 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term349373 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term349353, term349353.getClass(), "functionName", null);
        setBooleanField(term349353, term349353.getClass(), "itsNeedsActivation", false);
        setIntField(term349353, term349353.getClass(), "itsFunctionType", 0);
        setBooleanField(term349353, term349353.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term349353, term349353.getClass(), "encodedSourceStart", 0);
        setIntField(term349353, term349353.getClass(), "encodedSourceEnd", 0);
        setField(term349353, term349353.getClass(), "sourceName", null);
        setIntField(term349353, term349353.getClass(), "baseLineno", 0);
        setIntField(term349353, term349353.getClass(), "endLineno", 0);
        setField(term349353, term349353.getClass(), "functions", null);
        setField(term349353, term349353.getClass(), "regexps", null);
        setField(term349353, term349353.getClass(), "itsVariables", null);
        setField(term349353, term349353.getClass(), "itsConst", null);
        setField(term349353, term349353.getClass(), "itsVariableNames", null);
        setIntField(term349353, term349353.getClass(), "varStart", 0);
        setField(term349353, term349353.getClass(), "compilerData", null);
        setIntField(term349353, term349353.getClass(), "type", 14);
        setField(term349353, term349353.getClass(), "next", null);
        setField(term349363, term349363.getClass(), "functionName", null);
        setBooleanField(term349363, term349363.getClass(), "itsNeedsActivation", false);
        setIntField(term349363, term349363.getClass(), "itsFunctionType", 0);
        setBooleanField(term349363, term349363.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term349363, term349363.getClass(), "encodedSourceStart", 0);
        setIntField(term349363, term349363.getClass(), "encodedSourceEnd", 0);
        setField(term349363, term349363.getClass(), "sourceName", null);
        setIntField(term349363, term349363.getClass(), "baseLineno", 0);
        setIntField(term349363, term349363.getClass(), "endLineno", 0);
        setField(term349363, term349363.getClass(), "functions", null);
        setField(term349363, term349363.getClass(), "regexps", null);
        setField(term349363, term349363.getClass(), "itsVariables", null);
        setField(term349363, term349363.getClass(), "itsConst", null);
        setField(term349363, term349363.getClass(), "itsVariableNames", null);
        setIntField(term349363, term349363.getClass(), "varStart", 0);
        setField(term349363, term349363.getClass(), "compilerData", null);
        setIntField(term349363, term349363.getClass(), "type", 42);
        setField(term349373, term349373.getClass(), "str", null);
        setIntField(term349373, term349373.getClass(), "type", 42);
        setField(term349373, term349373.getClass(), "next", null);
        setField(term349373, term349373.getClass(), "first", null);
        setField(term349373, term349373.getClass(), "last", null);
        setField(term349373, term349373.getClass(), "propListHead", null);
        setIntField(term349373, term349373.getClass(), "sourcePosition", 0);
        setField(term349373, term349373.getClass(), "jsType", null);
        setField(term349373, term349373.getClass(), "parent", null);
        setField(term349363, term349363.getClass(), "next", term349373);
        setField(term349363, term349363.getClass(), "first", null);
        setField(term349363, term349363.getClass(), "last", null);
        setField(term349363, term349363.getClass(), "propListHead", null);
        setIntField(term349363, term349363.getClass(), "sourcePosition", 0);
        setField(term349363, term349363.getClass(), "jsType", null);
        setField(term349363, term349363.getClass(), "parent", null);
        setField(term349353, term349353.getClass(), "first", term349363);
        setField(term349353, term349353.getClass(), "last", null);
        setField(term349353, term349353.getClass(), "propListHead", null);
        setIntField(term349353, term349353.getClass(), "sourcePosition", 0);
        setField(term349353, term349353.getClass(), "jsType", null);
        setField(term349353, term349353.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term348840;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term348754, args);
        assertTrue(recursiveEquals(term348754, term349431));
        assertTrue(recursiveEquals(term348840, term349432));
        assertTrue(recursiveEquals(retValue, term349353));
    }

};


