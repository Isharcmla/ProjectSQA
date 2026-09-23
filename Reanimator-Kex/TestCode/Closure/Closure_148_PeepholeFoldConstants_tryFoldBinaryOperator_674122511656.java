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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144832;
     Object term144918;
     Object term145174;
     Object term145175;
     Object term145089;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144832 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term144918 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term145004 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term145074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term145004, term145004.getClass(), "next", term145074);
        setField(term144918, term144918.getClass(), "first", term145004);
        setIntField(term144918, term144918.getClass(), "type", 100);
        term145174 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term145174, term145174.getClass(), "currentTraversal", null);
        term145175 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term145176 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term145177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term145175, term145175.getClass(), "functionName", null);
        setBooleanField(term145175, term145175.getClass(), "itsNeedsActivation", false);
        setIntField(term145175, term145175.getClass(), "itsFunctionType", 0);
        setBooleanField(term145175, term145175.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term145175, term145175.getClass(), "encodedSourceStart", 0);
        setIntField(term145175, term145175.getClass(), "encodedSourceEnd", 0);
        setField(term145175, term145175.getClass(), "sourceName", null);
        setIntField(term145175, term145175.getClass(), "baseLineno", 0);
        setIntField(term145175, term145175.getClass(), "endLineno", 0);
        setField(term145175, term145175.getClass(), "functions", null);
        setField(term145175, term145175.getClass(), "regexps", null);
        setField(term145175, term145175.getClass(), "itsVariables", null);
        setField(term145175, term145175.getClass(), "itsConst", null);
        setField(term145175, term145175.getClass(), "itsVariableNames", null);
        setIntField(term145175, term145175.getClass(), "varStart", 0);
        setField(term145175, term145175.getClass(), "compilerData", null);
        setIntField(term145175, term145175.getClass(), "type", 100);
        setField(term145175, term145175.getClass(), "next", null);
        setField(term145176, term145176.getClass(), "functionName", null);
        setBooleanField(term145176, term145176.getClass(), "itsNeedsActivation", false);
        setIntField(term145176, term145176.getClass(), "itsFunctionType", 0);
        setBooleanField(term145176, term145176.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term145176, term145176.getClass(), "encodedSourceStart", 0);
        setIntField(term145176, term145176.getClass(), "encodedSourceEnd", 0);
        setField(term145176, term145176.getClass(), "sourceName", null);
        setIntField(term145176, term145176.getClass(), "baseLineno", 0);
        setIntField(term145176, term145176.getClass(), "endLineno", 0);
        setField(term145176, term145176.getClass(), "functions", null);
        setField(term145176, term145176.getClass(), "regexps", null);
        setField(term145176, term145176.getClass(), "itsVariables", null);
        setField(term145176, term145176.getClass(), "itsConst", null);
        setField(term145176, term145176.getClass(), "itsVariableNames", null);
        setIntField(term145176, term145176.getClass(), "varStart", 0);
        setField(term145176, term145176.getClass(), "compilerData", null);
        setIntField(term145176, term145176.getClass(), "type", 0);
        setIntField(term145177, term145177.getClass(), "type", 0);
        setField(term145177, term145177.getClass(), "next", null);
        setField(term145177, term145177.getClass(), "first", null);
        setField(term145177, term145177.getClass(), "last", null);
        setField(term145177, term145177.getClass(), "propListHead", null);
        setIntField(term145177, term145177.getClass(), "sourcePosition", 0);
        setField(term145177, term145177.getClass(), "jsType", null);
        setField(term145177, term145177.getClass(), "parent", null);
        setField(term145176, term145176.getClass(), "next", term145177);
        setField(term145176, term145176.getClass(), "first", null);
        setField(term145176, term145176.getClass(), "last", null);
        setField(term145176, term145176.getClass(), "propListHead", null);
        setIntField(term145176, term145176.getClass(), "sourcePosition", 0);
        setField(term145176, term145176.getClass(), "jsType", null);
        setField(term145176, term145176.getClass(), "parent", null);
        setField(term145175, term145175.getClass(), "first", term145176);
        setField(term145175, term145175.getClass(), "last", null);
        setField(term145175, term145175.getClass(), "propListHead", null);
        setIntField(term145175, term145175.getClass(), "sourcePosition", 0);
        setField(term145175, term145175.getClass(), "jsType", null);
        setField(term145175, term145175.getClass(), "parent", null);
        term145089 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term145099 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term145109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term145089, term145089.getClass(), "functionName", null);
        setBooleanField(term145089, term145089.getClass(), "itsNeedsActivation", false);
        setIntField(term145089, term145089.getClass(), "itsFunctionType", 0);
        setBooleanField(term145089, term145089.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term145089, term145089.getClass(), "encodedSourceStart", 0);
        setIntField(term145089, term145089.getClass(), "encodedSourceEnd", 0);
        setField(term145089, term145089.getClass(), "sourceName", null);
        setIntField(term145089, term145089.getClass(), "baseLineno", 0);
        setIntField(term145089, term145089.getClass(), "endLineno", 0);
        setField(term145089, term145089.getClass(), "functions", null);
        setField(term145089, term145089.getClass(), "regexps", null);
        setField(term145089, term145089.getClass(), "itsVariables", null);
        setField(term145089, term145089.getClass(), "itsConst", null);
        setField(term145089, term145089.getClass(), "itsVariableNames", null);
        setIntField(term145089, term145089.getClass(), "varStart", 0);
        setField(term145089, term145089.getClass(), "compilerData", null);
        setIntField(term145089, term145089.getClass(), "type", 100);
        setField(term145089, term145089.getClass(), "next", null);
        setField(term145099, term145099.getClass(), "functionName", null);
        setBooleanField(term145099, term145099.getClass(), "itsNeedsActivation", false);
        setIntField(term145099, term145099.getClass(), "itsFunctionType", 0);
        setBooleanField(term145099, term145099.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term145099, term145099.getClass(), "encodedSourceStart", 0);
        setIntField(term145099, term145099.getClass(), "encodedSourceEnd", 0);
        setField(term145099, term145099.getClass(), "sourceName", null);
        setIntField(term145099, term145099.getClass(), "baseLineno", 0);
        setIntField(term145099, term145099.getClass(), "endLineno", 0);
        setField(term145099, term145099.getClass(), "functions", null);
        setField(term145099, term145099.getClass(), "regexps", null);
        setField(term145099, term145099.getClass(), "itsVariables", null);
        setField(term145099, term145099.getClass(), "itsConst", null);
        setField(term145099, term145099.getClass(), "itsVariableNames", null);
        setIntField(term145099, term145099.getClass(), "varStart", 0);
        setField(term145099, term145099.getClass(), "compilerData", null);
        setIntField(term145099, term145099.getClass(), "type", 0);
        setIntField(term145109, term145109.getClass(), "type", 0);
        setField(term145109, term145109.getClass(), "next", null);
        setField(term145109, term145109.getClass(), "first", null);
        setField(term145109, term145109.getClass(), "last", null);
        setField(term145109, term145109.getClass(), "propListHead", null);
        setIntField(term145109, term145109.getClass(), "sourcePosition", 0);
        setField(term145109, term145109.getClass(), "jsType", null);
        setField(term145109, term145109.getClass(), "parent", null);
        setField(term145099, term145099.getClass(), "next", term145109);
        setField(term145099, term145099.getClass(), "first", null);
        setField(term145099, term145099.getClass(), "last", null);
        setField(term145099, term145099.getClass(), "propListHead", null);
        setIntField(term145099, term145099.getClass(), "sourcePosition", 0);
        setField(term145099, term145099.getClass(), "jsType", null);
        setField(term145099, term145099.getClass(), "parent", null);
        setField(term145089, term145089.getClass(), "first", term145099);
        setField(term145089, term145089.getClass(), "last", null);
        setField(term145089, term145089.getClass(), "propListHead", null);
        setIntField(term145089, term145089.getClass(), "sourcePosition", 0);
        setField(term145089, term145089.getClass(), "jsType", null);
        setField(term145089, term145089.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term144918;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term144832, args);
        assertTrue(recursiveEquals(term144832, term145174));
        assertTrue(recursiveEquals(term144918, term145175));
        assertTrue(recursiveEquals(retValue, term145089));
    }

};


