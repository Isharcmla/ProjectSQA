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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term740539;
     Object term740631;
     Object term740901;
     Object term740902;
     Object term740826;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term740539 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term740631 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term740717 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term740803 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term740717, term740717.getClass(), "next", term740803);
        setIntField(term740717, term740717.getClass(), "type", 39);
        setField(term740631, term740631.getClass(), "first", term740717);
        setIntField(term740631, term740631.getClass(), "type", 9);
        term740901 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term740901, term740901.getClass(), "currentTraversal", null);
        term740902 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term740903 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term740904 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term740902, term740902.getClass(), "str", null);
        setIntField(term740902, term740902.getClass(), "type", 9);
        setField(term740902, term740902.getClass(), "next", null);
        setField(term740903, term740903.getClass(), "functionName", null);
        setBooleanField(term740903, term740903.getClass(), "itsNeedsActivation", false);
        setIntField(term740903, term740903.getClass(), "itsFunctionType", 0);
        setBooleanField(term740903, term740903.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term740903, term740903.getClass(), "encodedSourceStart", 0);
        setIntField(term740903, term740903.getClass(), "encodedSourceEnd", 0);
        setField(term740903, term740903.getClass(), "sourceName", null);
        setIntField(term740903, term740903.getClass(), "baseLineno", 0);
        setIntField(term740903, term740903.getClass(), "endLineno", 0);
        setField(term740903, term740903.getClass(), "functions", null);
        setField(term740903, term740903.getClass(), "regexps", null);
        setField(term740903, term740903.getClass(), "itsVariables", null);
        setField(term740903, term740903.getClass(), "itsConst", null);
        setField(term740903, term740903.getClass(), "itsVariableNames", null);
        setIntField(term740903, term740903.getClass(), "varStart", 0);
        setField(term740903, term740903.getClass(), "compilerData", null);
        setIntField(term740903, term740903.getClass(), "type", 39);
        setField(term740904, term740904.getClass(), "functionName", null);
        setBooleanField(term740904, term740904.getClass(), "itsNeedsActivation", false);
        setIntField(term740904, term740904.getClass(), "itsFunctionType", 0);
        setBooleanField(term740904, term740904.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term740904, term740904.getClass(), "encodedSourceStart", 0);
        setIntField(term740904, term740904.getClass(), "encodedSourceEnd", 0);
        setField(term740904, term740904.getClass(), "sourceName", null);
        setIntField(term740904, term740904.getClass(), "baseLineno", 0);
        setIntField(term740904, term740904.getClass(), "endLineno", 0);
        setField(term740904, term740904.getClass(), "functions", null);
        setField(term740904, term740904.getClass(), "regexps", null);
        setField(term740904, term740904.getClass(), "itsVariables", null);
        setField(term740904, term740904.getClass(), "itsConst", null);
        setField(term740904, term740904.getClass(), "itsVariableNames", null);
        setIntField(term740904, term740904.getClass(), "varStart", 0);
        setField(term740904, term740904.getClass(), "compilerData", null);
        setIntField(term740904, term740904.getClass(), "type", 0);
        setField(term740904, term740904.getClass(), "next", null);
        setField(term740904, term740904.getClass(), "first", null);
        setField(term740904, term740904.getClass(), "last", null);
        setField(term740904, term740904.getClass(), "propListHead", null);
        setIntField(term740904, term740904.getClass(), "sourcePosition", 0);
        setField(term740904, term740904.getClass(), "jsType", null);
        setField(term740904, term740904.getClass(), "parent", null);
        setField(term740903, term740903.getClass(), "next", term740904);
        setField(term740903, term740903.getClass(), "first", null);
        setField(term740903, term740903.getClass(), "last", null);
        setField(term740903, term740903.getClass(), "propListHead", null);
        setIntField(term740903, term740903.getClass(), "sourcePosition", 0);
        setField(term740903, term740903.getClass(), "jsType", null);
        setField(term740903, term740903.getClass(), "parent", null);
        setField(term740902, term740902.getClass(), "first", term740903);
        setField(term740902, term740902.getClass(), "last", null);
        setField(term740902, term740902.getClass(), "propListHead", null);
        setIntField(term740902, term740902.getClass(), "sourcePosition", 0);
        setField(term740902, term740902.getClass(), "jsType", null);
        setField(term740902, term740902.getClass(), "parent", null);
        term740826 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term740828 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term740838 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term740826, term740826.getClass(), "str", null);
        setIntField(term740826, term740826.getClass(), "type", 9);
        setField(term740826, term740826.getClass(), "next", null);
        setField(term740828, term740828.getClass(), "functionName", null);
        setBooleanField(term740828, term740828.getClass(), "itsNeedsActivation", false);
        setIntField(term740828, term740828.getClass(), "itsFunctionType", 0);
        setBooleanField(term740828, term740828.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term740828, term740828.getClass(), "encodedSourceStart", 0);
        setIntField(term740828, term740828.getClass(), "encodedSourceEnd", 0);
        setField(term740828, term740828.getClass(), "sourceName", null);
        setIntField(term740828, term740828.getClass(), "baseLineno", 0);
        setIntField(term740828, term740828.getClass(), "endLineno", 0);
        setField(term740828, term740828.getClass(), "functions", null);
        setField(term740828, term740828.getClass(), "regexps", null);
        setField(term740828, term740828.getClass(), "itsVariables", null);
        setField(term740828, term740828.getClass(), "itsConst", null);
        setField(term740828, term740828.getClass(), "itsVariableNames", null);
        setIntField(term740828, term740828.getClass(), "varStart", 0);
        setField(term740828, term740828.getClass(), "compilerData", null);
        setIntField(term740828, term740828.getClass(), "type", 39);
        setField(term740838, term740838.getClass(), "functionName", null);
        setBooleanField(term740838, term740838.getClass(), "itsNeedsActivation", false);
        setIntField(term740838, term740838.getClass(), "itsFunctionType", 0);
        setBooleanField(term740838, term740838.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term740838, term740838.getClass(), "encodedSourceStart", 0);
        setIntField(term740838, term740838.getClass(), "encodedSourceEnd", 0);
        setField(term740838, term740838.getClass(), "sourceName", null);
        setIntField(term740838, term740838.getClass(), "baseLineno", 0);
        setIntField(term740838, term740838.getClass(), "endLineno", 0);
        setField(term740838, term740838.getClass(), "functions", null);
        setField(term740838, term740838.getClass(), "regexps", null);
        setField(term740838, term740838.getClass(), "itsVariables", null);
        setField(term740838, term740838.getClass(), "itsConst", null);
        setField(term740838, term740838.getClass(), "itsVariableNames", null);
        setIntField(term740838, term740838.getClass(), "varStart", 0);
        setField(term740838, term740838.getClass(), "compilerData", null);
        setIntField(term740838, term740838.getClass(), "type", 0);
        setField(term740838, term740838.getClass(), "next", null);
        setField(term740838, term740838.getClass(), "first", null);
        setField(term740838, term740838.getClass(), "last", null);
        setField(term740838, term740838.getClass(), "propListHead", null);
        setIntField(term740838, term740838.getClass(), "sourcePosition", 0);
        setField(term740838, term740838.getClass(), "jsType", null);
        setField(term740838, term740838.getClass(), "parent", null);
        setField(term740828, term740828.getClass(), "next", term740838);
        setField(term740828, term740828.getClass(), "first", null);
        setField(term740828, term740828.getClass(), "last", null);
        setField(term740828, term740828.getClass(), "propListHead", null);
        setIntField(term740828, term740828.getClass(), "sourcePosition", 0);
        setField(term740828, term740828.getClass(), "jsType", null);
        setField(term740828, term740828.getClass(), "parent", null);
        setField(term740826, term740826.getClass(), "first", term740828);
        setField(term740826, term740826.getClass(), "last", null);
        setField(term740826, term740826.getClass(), "propListHead", null);
        setIntField(term740826, term740826.getClass(), "sourcePosition", 0);
        setField(term740826, term740826.getClass(), "jsType", null);
        setField(term740826, term740826.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term740631;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term740539, args);
        assertTrue(recursiveEquals(term740539, term740901));
        assertTrue(recursiveEquals(term740631, term740902));
        assertTrue(recursiveEquals(retValue, term740826));
    }

};


