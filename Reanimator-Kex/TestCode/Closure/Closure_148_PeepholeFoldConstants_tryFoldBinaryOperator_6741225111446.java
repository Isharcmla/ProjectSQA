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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357946;
     Object term358032;
     Object term358272;
     Object term358273;
     Object term358209;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357946 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term358032 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term358118 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term358188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term358118, term358118.getClass(), "next", term358188);
        setField(term358032, term358032.getClass(), "first", term358118);
        setIntField(term358032, term358032.getClass(), "type", 33);
        term358272 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term358272, term358272.getClass(), "currentTraversal", null);
        term358273 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term358274 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term358275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term358273, term358273.getClass(), "functionName", null);
        setBooleanField(term358273, term358273.getClass(), "itsNeedsActivation", false);
        setIntField(term358273, term358273.getClass(), "itsFunctionType", 0);
        setBooleanField(term358273, term358273.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term358273, term358273.getClass(), "encodedSourceStart", 0);
        setIntField(term358273, term358273.getClass(), "encodedSourceEnd", 0);
        setField(term358273, term358273.getClass(), "sourceName", null);
        setIntField(term358273, term358273.getClass(), "baseLineno", 0);
        setIntField(term358273, term358273.getClass(), "endLineno", 0);
        setField(term358273, term358273.getClass(), "functions", null);
        setField(term358273, term358273.getClass(), "regexps", null);
        setField(term358273, term358273.getClass(), "itsVariables", null);
        setField(term358273, term358273.getClass(), "itsConst", null);
        setField(term358273, term358273.getClass(), "itsVariableNames", null);
        setIntField(term358273, term358273.getClass(), "varStart", 0);
        setField(term358273, term358273.getClass(), "compilerData", null);
        setIntField(term358273, term358273.getClass(), "type", 33);
        setField(term358273, term358273.getClass(), "next", null);
        setField(term358274, term358274.getClass(), "functionName", null);
        setBooleanField(term358274, term358274.getClass(), "itsNeedsActivation", false);
        setIntField(term358274, term358274.getClass(), "itsFunctionType", 0);
        setBooleanField(term358274, term358274.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term358274, term358274.getClass(), "encodedSourceStart", 0);
        setIntField(term358274, term358274.getClass(), "encodedSourceEnd", 0);
        setField(term358274, term358274.getClass(), "sourceName", null);
        setIntField(term358274, term358274.getClass(), "baseLineno", 0);
        setIntField(term358274, term358274.getClass(), "endLineno", 0);
        setField(term358274, term358274.getClass(), "functions", null);
        setField(term358274, term358274.getClass(), "regexps", null);
        setField(term358274, term358274.getClass(), "itsVariables", null);
        setField(term358274, term358274.getClass(), "itsConst", null);
        setField(term358274, term358274.getClass(), "itsVariableNames", null);
        setIntField(term358274, term358274.getClass(), "varStart", 0);
        setField(term358274, term358274.getClass(), "compilerData", null);
        setIntField(term358274, term358274.getClass(), "type", 0);
        setIntField(term358275, term358275.getClass(), "type", 0);
        setField(term358275, term358275.getClass(), "next", null);
        setField(term358275, term358275.getClass(), "first", null);
        setField(term358275, term358275.getClass(), "last", null);
        setField(term358275, term358275.getClass(), "propListHead", null);
        setIntField(term358275, term358275.getClass(), "sourcePosition", 0);
        setField(term358275, term358275.getClass(), "jsType", null);
        setField(term358275, term358275.getClass(), "parent", null);
        setField(term358274, term358274.getClass(), "next", term358275);
        setField(term358274, term358274.getClass(), "first", null);
        setField(term358274, term358274.getClass(), "last", null);
        setField(term358274, term358274.getClass(), "propListHead", null);
        setIntField(term358274, term358274.getClass(), "sourcePosition", 0);
        setField(term358274, term358274.getClass(), "jsType", null);
        setField(term358274, term358274.getClass(), "parent", null);
        setField(term358273, term358273.getClass(), "first", term358274);
        setField(term358273, term358273.getClass(), "last", null);
        setField(term358273, term358273.getClass(), "propListHead", null);
        setIntField(term358273, term358273.getClass(), "sourcePosition", 0);
        setField(term358273, term358273.getClass(), "jsType", null);
        setField(term358273, term358273.getClass(), "parent", null);
        term358209 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term358219 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term358229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term358209, term358209.getClass(), "functionName", null);
        setBooleanField(term358209, term358209.getClass(), "itsNeedsActivation", false);
        setIntField(term358209, term358209.getClass(), "itsFunctionType", 0);
        setBooleanField(term358209, term358209.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term358209, term358209.getClass(), "encodedSourceStart", 0);
        setIntField(term358209, term358209.getClass(), "encodedSourceEnd", 0);
        setField(term358209, term358209.getClass(), "sourceName", null);
        setIntField(term358209, term358209.getClass(), "baseLineno", 0);
        setIntField(term358209, term358209.getClass(), "endLineno", 0);
        setField(term358209, term358209.getClass(), "functions", null);
        setField(term358209, term358209.getClass(), "regexps", null);
        setField(term358209, term358209.getClass(), "itsVariables", null);
        setField(term358209, term358209.getClass(), "itsConst", null);
        setField(term358209, term358209.getClass(), "itsVariableNames", null);
        setIntField(term358209, term358209.getClass(), "varStart", 0);
        setField(term358209, term358209.getClass(), "compilerData", null);
        setIntField(term358209, term358209.getClass(), "type", 33);
        setField(term358209, term358209.getClass(), "next", null);
        setField(term358219, term358219.getClass(), "functionName", null);
        setBooleanField(term358219, term358219.getClass(), "itsNeedsActivation", false);
        setIntField(term358219, term358219.getClass(), "itsFunctionType", 0);
        setBooleanField(term358219, term358219.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term358219, term358219.getClass(), "encodedSourceStart", 0);
        setIntField(term358219, term358219.getClass(), "encodedSourceEnd", 0);
        setField(term358219, term358219.getClass(), "sourceName", null);
        setIntField(term358219, term358219.getClass(), "baseLineno", 0);
        setIntField(term358219, term358219.getClass(), "endLineno", 0);
        setField(term358219, term358219.getClass(), "functions", null);
        setField(term358219, term358219.getClass(), "regexps", null);
        setField(term358219, term358219.getClass(), "itsVariables", null);
        setField(term358219, term358219.getClass(), "itsConst", null);
        setField(term358219, term358219.getClass(), "itsVariableNames", null);
        setIntField(term358219, term358219.getClass(), "varStart", 0);
        setField(term358219, term358219.getClass(), "compilerData", null);
        setIntField(term358219, term358219.getClass(), "type", 0);
        setIntField(term358229, term358229.getClass(), "type", 0);
        setField(term358229, term358229.getClass(), "next", null);
        setField(term358229, term358229.getClass(), "first", null);
        setField(term358229, term358229.getClass(), "last", null);
        setField(term358229, term358229.getClass(), "propListHead", null);
        setIntField(term358229, term358229.getClass(), "sourcePosition", 0);
        setField(term358229, term358229.getClass(), "jsType", null);
        setField(term358229, term358229.getClass(), "parent", null);
        setField(term358219, term358219.getClass(), "next", term358229);
        setField(term358219, term358219.getClass(), "first", null);
        setField(term358219, term358219.getClass(), "last", null);
        setField(term358219, term358219.getClass(), "propListHead", null);
        setIntField(term358219, term358219.getClass(), "sourcePosition", 0);
        setField(term358219, term358219.getClass(), "jsType", null);
        setField(term358219, term358219.getClass(), "parent", null);
        setField(term358209, term358209.getClass(), "first", term358219);
        setField(term358209, term358209.getClass(), "last", null);
        setField(term358209, term358209.getClass(), "propListHead", null);
        setIntField(term358209, term358209.getClass(), "sourcePosition", 0);
        setField(term358209, term358209.getClass(), "jsType", null);
        setField(term358209, term358209.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term358032;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term357946, args);
        assertTrue(recursiveEquals(term357946, term358272));
        assertTrue(recursiveEquals(term358032, term358273));
        assertTrue(recursiveEquals(retValue, term358209));
    }

};


