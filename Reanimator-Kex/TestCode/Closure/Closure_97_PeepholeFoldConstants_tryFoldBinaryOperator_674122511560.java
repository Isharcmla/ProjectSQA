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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147915;
     Object term148001;
     Object term148207;
     Object term148208;
     Object term148129;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147915 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term148001 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term148087 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term148001, term148001.getClass(), "first", term148001);
        setField(term148001, term148001.getClass(), "next", term148087);
        setIntField(term148001, term148001.getClass(), "type", 14);
        term148207 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term148207, term148207.getClass(), "currentTraversal", null);
        term148208 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term148209 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term148208, term148208.getClass(), "functionName", null);
        setBooleanField(term148208, term148208.getClass(), "itsNeedsActivation", false);
        setIntField(term148208, term148208.getClass(), "itsFunctionType", 0);
        setBooleanField(term148208, term148208.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term148208, term148208.getClass(), "encodedSourceStart", 0);
        setIntField(term148208, term148208.getClass(), "encodedSourceEnd", 0);
        setField(term148208, term148208.getClass(), "sourceName", null);
        setIntField(term148208, term148208.getClass(), "baseLineno", 0);
        setIntField(term148208, term148208.getClass(), "endLineno", 0);
        setField(term148208, term148208.getClass(), "functions", null);
        setField(term148208, term148208.getClass(), "regexps", null);
        setField(term148208, term148208.getClass(), "itsVariables", null);
        setField(term148208, term148208.getClass(), "itsConst", null);
        setField(term148208, term148208.getClass(), "itsVariableNames", null);
        setIntField(term148208, term148208.getClass(), "varStart", 0);
        setField(term148208, term148208.getClass(), "compilerData", null);
        setIntField(term148208, term148208.getClass(), "type", 14);
        setField(term148209, term148209.getClass(), "functionName", null);
        setBooleanField(term148209, term148209.getClass(), "itsNeedsActivation", false);
        setIntField(term148209, term148209.getClass(), "itsFunctionType", 0);
        setBooleanField(term148209, term148209.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term148209, term148209.getClass(), "encodedSourceStart", 0);
        setIntField(term148209, term148209.getClass(), "encodedSourceEnd", 0);
        setField(term148209, term148209.getClass(), "sourceName", null);
        setIntField(term148209, term148209.getClass(), "baseLineno", 0);
        setIntField(term148209, term148209.getClass(), "endLineno", 0);
        setField(term148209, term148209.getClass(), "functions", null);
        setField(term148209, term148209.getClass(), "regexps", null);
        setField(term148209, term148209.getClass(), "itsVariables", null);
        setField(term148209, term148209.getClass(), "itsConst", null);
        setField(term148209, term148209.getClass(), "itsVariableNames", null);
        setIntField(term148209, term148209.getClass(), "varStart", 0);
        setField(term148209, term148209.getClass(), "compilerData", null);
        setIntField(term148209, term148209.getClass(), "type", 0);
        setField(term148209, term148209.getClass(), "next", null);
        setField(term148209, term148209.getClass(), "first", null);
        setField(term148209, term148209.getClass(), "last", null);
        setField(term148209, term148209.getClass(), "propListHead", null);
        setIntField(term148209, term148209.getClass(), "sourcePosition", 0);
        setField(term148209, term148209.getClass(), "jsType", null);
        setField(term148209, term148209.getClass(), "parent", null);
        setField(term148208, term148208.getClass(), "next", term148209);
        setField(term148208, term148208.getClass(), "first", term148208);
        setField(term148208, term148208.getClass(), "last", null);
        setField(term148208, term148208.getClass(), "propListHead", null);
        setIntField(term148208, term148208.getClass(), "sourcePosition", 0);
        setField(term148208, term148208.getClass(), "jsType", null);
        setField(term148208, term148208.getClass(), "parent", null);
        term148129 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term148139 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term148129, term148129.getClass(), "functionName", null);
        setBooleanField(term148129, term148129.getClass(), "itsNeedsActivation", false);
        setIntField(term148129, term148129.getClass(), "itsFunctionType", 0);
        setBooleanField(term148129, term148129.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term148129, term148129.getClass(), "encodedSourceStart", 0);
        setIntField(term148129, term148129.getClass(), "encodedSourceEnd", 0);
        setField(term148129, term148129.getClass(), "sourceName", null);
        setIntField(term148129, term148129.getClass(), "baseLineno", 0);
        setIntField(term148129, term148129.getClass(), "endLineno", 0);
        setField(term148129, term148129.getClass(), "functions", null);
        setField(term148129, term148129.getClass(), "regexps", null);
        setField(term148129, term148129.getClass(), "itsVariables", null);
        setField(term148129, term148129.getClass(), "itsConst", null);
        setField(term148129, term148129.getClass(), "itsVariableNames", null);
        setIntField(term148129, term148129.getClass(), "varStart", 0);
        setField(term148129, term148129.getClass(), "compilerData", null);
        setIntField(term148129, term148129.getClass(), "type", 14);
        setField(term148139, term148139.getClass(), "functionName", null);
        setBooleanField(term148139, term148139.getClass(), "itsNeedsActivation", false);
        setIntField(term148139, term148139.getClass(), "itsFunctionType", 0);
        setBooleanField(term148139, term148139.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term148139, term148139.getClass(), "encodedSourceStart", 0);
        setIntField(term148139, term148139.getClass(), "encodedSourceEnd", 0);
        setField(term148139, term148139.getClass(), "sourceName", null);
        setIntField(term148139, term148139.getClass(), "baseLineno", 0);
        setIntField(term148139, term148139.getClass(), "endLineno", 0);
        setField(term148139, term148139.getClass(), "functions", null);
        setField(term148139, term148139.getClass(), "regexps", null);
        setField(term148139, term148139.getClass(), "itsVariables", null);
        setField(term148139, term148139.getClass(), "itsConst", null);
        setField(term148139, term148139.getClass(), "itsVariableNames", null);
        setIntField(term148139, term148139.getClass(), "varStart", 0);
        setField(term148139, term148139.getClass(), "compilerData", null);
        setIntField(term148139, term148139.getClass(), "type", 0);
        setField(term148139, term148139.getClass(), "next", null);
        setField(term148139, term148139.getClass(), "first", null);
        setField(term148139, term148139.getClass(), "last", null);
        setField(term148139, term148139.getClass(), "propListHead", null);
        setIntField(term148139, term148139.getClass(), "sourcePosition", 0);
        setField(term148139, term148139.getClass(), "jsType", null);
        setField(term148139, term148139.getClass(), "parent", null);
        setField(term148129, term148129.getClass(), "next", term148139);
        setField(term148129, term148129.getClass(), "first", term148129);
        setField(term148129, term148129.getClass(), "last", null);
        setField(term148129, term148129.getClass(), "propListHead", null);
        setIntField(term148129, term148129.getClass(), "sourcePosition", 0);
        setField(term148129, term148129.getClass(), "jsType", null);
        setField(term148129, term148129.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term148001;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term147915, args);
        assertTrue(recursiveEquals(term147915, term148207));
        assertTrue(recursiveEquals(term148001, term148208));
        assertTrue(recursiveEquals(retValue, term148129));
    }

};


