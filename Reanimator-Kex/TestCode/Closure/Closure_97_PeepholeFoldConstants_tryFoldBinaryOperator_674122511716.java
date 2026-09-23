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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183571;
     Object term183657;
     Object term183894;
     Object term183895;
     Object term183828;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183571 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term183657 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term183743 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term183813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term183743, term183743.getClass(), "next", term183813);
        setField(term183657, term183657.getClass(), "first", term183743);
        setIntField(term183657, term183657.getClass(), "type", 46);
        term183894 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term183894, term183894.getClass(), "currentTraversal", null);
        term183895 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term183896 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term183897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term183895, term183895.getClass(), "functionName", null);
        setBooleanField(term183895, term183895.getClass(), "itsNeedsActivation", false);
        setIntField(term183895, term183895.getClass(), "itsFunctionType", 0);
        setBooleanField(term183895, term183895.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term183895, term183895.getClass(), "encodedSourceStart", 0);
        setIntField(term183895, term183895.getClass(), "encodedSourceEnd", 0);
        setField(term183895, term183895.getClass(), "sourceName", null);
        setIntField(term183895, term183895.getClass(), "baseLineno", 0);
        setIntField(term183895, term183895.getClass(), "endLineno", 0);
        setField(term183895, term183895.getClass(), "functions", null);
        setField(term183895, term183895.getClass(), "regexps", null);
        setField(term183895, term183895.getClass(), "itsVariables", null);
        setField(term183895, term183895.getClass(), "itsConst", null);
        setField(term183895, term183895.getClass(), "itsVariableNames", null);
        setIntField(term183895, term183895.getClass(), "varStart", 0);
        setField(term183895, term183895.getClass(), "compilerData", null);
        setIntField(term183895, term183895.getClass(), "type", 46);
        setField(term183895, term183895.getClass(), "next", null);
        setField(term183896, term183896.getClass(), "functionName", null);
        setBooleanField(term183896, term183896.getClass(), "itsNeedsActivation", false);
        setIntField(term183896, term183896.getClass(), "itsFunctionType", 0);
        setBooleanField(term183896, term183896.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term183896, term183896.getClass(), "encodedSourceStart", 0);
        setIntField(term183896, term183896.getClass(), "encodedSourceEnd", 0);
        setField(term183896, term183896.getClass(), "sourceName", null);
        setIntField(term183896, term183896.getClass(), "baseLineno", 0);
        setIntField(term183896, term183896.getClass(), "endLineno", 0);
        setField(term183896, term183896.getClass(), "functions", null);
        setField(term183896, term183896.getClass(), "regexps", null);
        setField(term183896, term183896.getClass(), "itsVariables", null);
        setField(term183896, term183896.getClass(), "itsConst", null);
        setField(term183896, term183896.getClass(), "itsVariableNames", null);
        setIntField(term183896, term183896.getClass(), "varStart", 0);
        setField(term183896, term183896.getClass(), "compilerData", null);
        setIntField(term183896, term183896.getClass(), "type", 0);
        setIntField(term183897, term183897.getClass(), "type", 0);
        setField(term183897, term183897.getClass(), "next", null);
        setField(term183897, term183897.getClass(), "first", null);
        setField(term183897, term183897.getClass(), "last", null);
        setField(term183897, term183897.getClass(), "propListHead", null);
        setIntField(term183897, term183897.getClass(), "sourcePosition", 0);
        setField(term183897, term183897.getClass(), "jsType", null);
        setField(term183897, term183897.getClass(), "parent", null);
        setField(term183896, term183896.getClass(), "next", term183897);
        setField(term183896, term183896.getClass(), "first", null);
        setField(term183896, term183896.getClass(), "last", null);
        setField(term183896, term183896.getClass(), "propListHead", null);
        setIntField(term183896, term183896.getClass(), "sourcePosition", 0);
        setField(term183896, term183896.getClass(), "jsType", null);
        setField(term183896, term183896.getClass(), "parent", null);
        setField(term183895, term183895.getClass(), "first", term183896);
        setField(term183895, term183895.getClass(), "last", null);
        setField(term183895, term183895.getClass(), "propListHead", null);
        setIntField(term183895, term183895.getClass(), "sourcePosition", 0);
        setField(term183895, term183895.getClass(), "jsType", null);
        setField(term183895, term183895.getClass(), "parent", null);
        term183828 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term183838 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term183848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term183828, term183828.getClass(), "functionName", null);
        setBooleanField(term183828, term183828.getClass(), "itsNeedsActivation", false);
        setIntField(term183828, term183828.getClass(), "itsFunctionType", 0);
        setBooleanField(term183828, term183828.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term183828, term183828.getClass(), "encodedSourceStart", 0);
        setIntField(term183828, term183828.getClass(), "encodedSourceEnd", 0);
        setField(term183828, term183828.getClass(), "sourceName", null);
        setIntField(term183828, term183828.getClass(), "baseLineno", 0);
        setIntField(term183828, term183828.getClass(), "endLineno", 0);
        setField(term183828, term183828.getClass(), "functions", null);
        setField(term183828, term183828.getClass(), "regexps", null);
        setField(term183828, term183828.getClass(), "itsVariables", null);
        setField(term183828, term183828.getClass(), "itsConst", null);
        setField(term183828, term183828.getClass(), "itsVariableNames", null);
        setIntField(term183828, term183828.getClass(), "varStart", 0);
        setField(term183828, term183828.getClass(), "compilerData", null);
        setIntField(term183828, term183828.getClass(), "type", 46);
        setField(term183828, term183828.getClass(), "next", null);
        setField(term183838, term183838.getClass(), "functionName", null);
        setBooleanField(term183838, term183838.getClass(), "itsNeedsActivation", false);
        setIntField(term183838, term183838.getClass(), "itsFunctionType", 0);
        setBooleanField(term183838, term183838.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term183838, term183838.getClass(), "encodedSourceStart", 0);
        setIntField(term183838, term183838.getClass(), "encodedSourceEnd", 0);
        setField(term183838, term183838.getClass(), "sourceName", null);
        setIntField(term183838, term183838.getClass(), "baseLineno", 0);
        setIntField(term183838, term183838.getClass(), "endLineno", 0);
        setField(term183838, term183838.getClass(), "functions", null);
        setField(term183838, term183838.getClass(), "regexps", null);
        setField(term183838, term183838.getClass(), "itsVariables", null);
        setField(term183838, term183838.getClass(), "itsConst", null);
        setField(term183838, term183838.getClass(), "itsVariableNames", null);
        setIntField(term183838, term183838.getClass(), "varStart", 0);
        setField(term183838, term183838.getClass(), "compilerData", null);
        setIntField(term183838, term183838.getClass(), "type", 0);
        setIntField(term183848, term183848.getClass(), "type", 0);
        setField(term183848, term183848.getClass(), "next", null);
        setField(term183848, term183848.getClass(), "first", null);
        setField(term183848, term183848.getClass(), "last", null);
        setField(term183848, term183848.getClass(), "propListHead", null);
        setIntField(term183848, term183848.getClass(), "sourcePosition", 0);
        setField(term183848, term183848.getClass(), "jsType", null);
        setField(term183848, term183848.getClass(), "parent", null);
        setField(term183838, term183838.getClass(), "next", term183848);
        setField(term183838, term183838.getClass(), "first", null);
        setField(term183838, term183838.getClass(), "last", null);
        setField(term183838, term183838.getClass(), "propListHead", null);
        setIntField(term183838, term183838.getClass(), "sourcePosition", 0);
        setField(term183838, term183838.getClass(), "jsType", null);
        setField(term183838, term183838.getClass(), "parent", null);
        setField(term183828, term183828.getClass(), "first", term183838);
        setField(term183828, term183828.getClass(), "last", null);
        setField(term183828, term183828.getClass(), "propListHead", null);
        setIntField(term183828, term183828.getClass(), "sourcePosition", 0);
        setField(term183828, term183828.getClass(), "jsType", null);
        setField(term183828, term183828.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term183657;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term183571, args);
        assertTrue(recursiveEquals(term183571, term183894));
        assertTrue(recursiveEquals(term183657, term183895));
        assertTrue(recursiveEquals(retValue, term183828));
    }

};


