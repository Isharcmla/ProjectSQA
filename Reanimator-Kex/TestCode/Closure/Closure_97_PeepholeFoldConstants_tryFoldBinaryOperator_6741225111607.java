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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622608;
     Object term622694;
     Object term650898;
     Object term650899;
     Object term650833;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term622608 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term622694 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term622780 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term622850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term622780, term622780.getClass(), "next", term622850);
        setField(term622694, term622694.getClass(), "first", term622780);
        setIntField(term622694, term622694.getClass(), "type", 9);
        term650898 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term650898, term650898.getClass(), "currentTraversal", null);
        term650899 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term650900 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term650901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term650899, term650899.getClass(), "functionName", null);
        setBooleanField(term650899, term650899.getClass(), "itsNeedsActivation", false);
        setIntField(term650899, term650899.getClass(), "itsFunctionType", 0);
        setBooleanField(term650899, term650899.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term650899, term650899.getClass(), "encodedSourceStart", 0);
        setIntField(term650899, term650899.getClass(), "encodedSourceEnd", 0);
        setField(term650899, term650899.getClass(), "sourceName", null);
        setIntField(term650899, term650899.getClass(), "baseLineno", 0);
        setIntField(term650899, term650899.getClass(), "endLineno", 0);
        setField(term650899, term650899.getClass(), "functions", null);
        setField(term650899, term650899.getClass(), "regexps", null);
        setField(term650899, term650899.getClass(), "itsVariables", null);
        setField(term650899, term650899.getClass(), "itsConst", null);
        setField(term650899, term650899.getClass(), "itsVariableNames", null);
        setIntField(term650899, term650899.getClass(), "varStart", 0);
        setField(term650899, term650899.getClass(), "compilerData", null);
        setIntField(term650899, term650899.getClass(), "type", 9);
        setField(term650899, term650899.getClass(), "next", null);
        setField(term650900, term650900.getClass(), "functionName", null);
        setBooleanField(term650900, term650900.getClass(), "itsNeedsActivation", false);
        setIntField(term650900, term650900.getClass(), "itsFunctionType", 0);
        setBooleanField(term650900, term650900.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term650900, term650900.getClass(), "encodedSourceStart", 0);
        setIntField(term650900, term650900.getClass(), "encodedSourceEnd", 0);
        setField(term650900, term650900.getClass(), "sourceName", null);
        setIntField(term650900, term650900.getClass(), "baseLineno", 0);
        setIntField(term650900, term650900.getClass(), "endLineno", 0);
        setField(term650900, term650900.getClass(), "functions", null);
        setField(term650900, term650900.getClass(), "regexps", null);
        setField(term650900, term650900.getClass(), "itsVariables", null);
        setField(term650900, term650900.getClass(), "itsConst", null);
        setField(term650900, term650900.getClass(), "itsVariableNames", null);
        setIntField(term650900, term650900.getClass(), "varStart", 0);
        setField(term650900, term650900.getClass(), "compilerData", null);
        setIntField(term650900, term650900.getClass(), "type", 0);
        setIntField(term650901, term650901.getClass(), "type", 0);
        setField(term650901, term650901.getClass(), "next", null);
        setField(term650901, term650901.getClass(), "first", null);
        setField(term650901, term650901.getClass(), "last", null);
        setField(term650901, term650901.getClass(), "propListHead", null);
        setIntField(term650901, term650901.getClass(), "sourcePosition", 0);
        setField(term650901, term650901.getClass(), "jsType", null);
        setField(term650901, term650901.getClass(), "parent", null);
        setField(term650900, term650900.getClass(), "next", term650901);
        setField(term650900, term650900.getClass(), "first", null);
        setField(term650900, term650900.getClass(), "last", null);
        setField(term650900, term650900.getClass(), "propListHead", null);
        setIntField(term650900, term650900.getClass(), "sourcePosition", 0);
        setField(term650900, term650900.getClass(), "jsType", null);
        setField(term650900, term650900.getClass(), "parent", null);
        setField(term650899, term650899.getClass(), "first", term650900);
        setField(term650899, term650899.getClass(), "last", null);
        setField(term650899, term650899.getClass(), "propListHead", null);
        setIntField(term650899, term650899.getClass(), "sourcePosition", 0);
        setField(term650899, term650899.getClass(), "jsType", null);
        setField(term650899, term650899.getClass(), "parent", null);
        term650833 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term650843 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term650853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term650833, term650833.getClass(), "functionName", null);
        setBooleanField(term650833, term650833.getClass(), "itsNeedsActivation", false);
        setIntField(term650833, term650833.getClass(), "itsFunctionType", 0);
        setBooleanField(term650833, term650833.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term650833, term650833.getClass(), "encodedSourceStart", 0);
        setIntField(term650833, term650833.getClass(), "encodedSourceEnd", 0);
        setField(term650833, term650833.getClass(), "sourceName", null);
        setIntField(term650833, term650833.getClass(), "baseLineno", 0);
        setIntField(term650833, term650833.getClass(), "endLineno", 0);
        setField(term650833, term650833.getClass(), "functions", null);
        setField(term650833, term650833.getClass(), "regexps", null);
        setField(term650833, term650833.getClass(), "itsVariables", null);
        setField(term650833, term650833.getClass(), "itsConst", null);
        setField(term650833, term650833.getClass(), "itsVariableNames", null);
        setIntField(term650833, term650833.getClass(), "varStart", 0);
        setField(term650833, term650833.getClass(), "compilerData", null);
        setIntField(term650833, term650833.getClass(), "type", 9);
        setField(term650833, term650833.getClass(), "next", null);
        setField(term650843, term650843.getClass(), "functionName", null);
        setBooleanField(term650843, term650843.getClass(), "itsNeedsActivation", false);
        setIntField(term650843, term650843.getClass(), "itsFunctionType", 0);
        setBooleanField(term650843, term650843.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term650843, term650843.getClass(), "encodedSourceStart", 0);
        setIntField(term650843, term650843.getClass(), "encodedSourceEnd", 0);
        setField(term650843, term650843.getClass(), "sourceName", null);
        setIntField(term650843, term650843.getClass(), "baseLineno", 0);
        setIntField(term650843, term650843.getClass(), "endLineno", 0);
        setField(term650843, term650843.getClass(), "functions", null);
        setField(term650843, term650843.getClass(), "regexps", null);
        setField(term650843, term650843.getClass(), "itsVariables", null);
        setField(term650843, term650843.getClass(), "itsConst", null);
        setField(term650843, term650843.getClass(), "itsVariableNames", null);
        setIntField(term650843, term650843.getClass(), "varStart", 0);
        setField(term650843, term650843.getClass(), "compilerData", null);
        setIntField(term650843, term650843.getClass(), "type", 0);
        setIntField(term650853, term650853.getClass(), "type", 0);
        setField(term650853, term650853.getClass(), "next", null);
        setField(term650853, term650853.getClass(), "first", null);
        setField(term650853, term650853.getClass(), "last", null);
        setField(term650853, term650853.getClass(), "propListHead", null);
        setIntField(term650853, term650853.getClass(), "sourcePosition", 0);
        setField(term650853, term650853.getClass(), "jsType", null);
        setField(term650853, term650853.getClass(), "parent", null);
        setField(term650843, term650843.getClass(), "next", term650853);
        setField(term650843, term650843.getClass(), "first", null);
        setField(term650843, term650843.getClass(), "last", null);
        setField(term650843, term650843.getClass(), "propListHead", null);
        setIntField(term650843, term650843.getClass(), "sourcePosition", 0);
        setField(term650843, term650843.getClass(), "jsType", null);
        setField(term650843, term650843.getClass(), "parent", null);
        setField(term650833, term650833.getClass(), "first", term650843);
        setField(term650833, term650833.getClass(), "last", null);
        setField(term650833, term650833.getClass(), "propListHead", null);
        setIntField(term650833, term650833.getClass(), "sourcePosition", 0);
        setField(term650833, term650833.getClass(), "jsType", null);
        setField(term650833, term650833.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term622694;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term622608, args);
        assertTrue(recursiveEquals(term622608, term650898));
        assertTrue(recursiveEquals(term622694, term650899));
        assertTrue(recursiveEquals(retValue, term650833));
    }

};


