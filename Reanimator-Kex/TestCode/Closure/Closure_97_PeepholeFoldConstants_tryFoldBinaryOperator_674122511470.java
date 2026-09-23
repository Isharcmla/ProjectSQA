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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108697;
     Object term108783;
     Object term109094;
     Object term109095;
     Object term109009;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108697 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term108783 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term108869 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term108961 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term108869, term108869.getClass(), "next", term108961);
        setIntField(term108869, term108869.getClass(), "type", 0);
        setField(term108783, term108783.getClass(), "first", term108869);
        setIntField(term108783, term108783.getClass(), "type", 101);
        setField(term108783, term108783.getClass(), "parent", null);
        term109094 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term109094, term109094.getClass(), "currentTraversal", null);
        term109095 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term109096 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term109097 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term109095, term109095.getClass(), "functionName", null);
        setBooleanField(term109095, term109095.getClass(), "itsNeedsActivation", false);
        setIntField(term109095, term109095.getClass(), "itsFunctionType", 0);
        setBooleanField(term109095, term109095.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term109095, term109095.getClass(), "encodedSourceStart", 0);
        setIntField(term109095, term109095.getClass(), "encodedSourceEnd", 0);
        setField(term109095, term109095.getClass(), "sourceName", null);
        setIntField(term109095, term109095.getClass(), "baseLineno", 0);
        setIntField(term109095, term109095.getClass(), "endLineno", 0);
        setField(term109095, term109095.getClass(), "functions", null);
        setField(term109095, term109095.getClass(), "regexps", null);
        setField(term109095, term109095.getClass(), "itsVariables", null);
        setField(term109095, term109095.getClass(), "itsConst", null);
        setField(term109095, term109095.getClass(), "itsVariableNames", null);
        setIntField(term109095, term109095.getClass(), "varStart", 0);
        setField(term109095, term109095.getClass(), "compilerData", null);
        setIntField(term109095, term109095.getClass(), "type", 101);
        setField(term109095, term109095.getClass(), "next", null);
        setField(term109096, term109096.getClass(), "functionName", null);
        setBooleanField(term109096, term109096.getClass(), "itsNeedsActivation", false);
        setIntField(term109096, term109096.getClass(), "itsFunctionType", 0);
        setBooleanField(term109096, term109096.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term109096, term109096.getClass(), "encodedSourceStart", 0);
        setIntField(term109096, term109096.getClass(), "encodedSourceEnd", 0);
        setField(term109096, term109096.getClass(), "sourceName", null);
        setIntField(term109096, term109096.getClass(), "baseLineno", 0);
        setIntField(term109096, term109096.getClass(), "endLineno", 0);
        setField(term109096, term109096.getClass(), "functions", null);
        setField(term109096, term109096.getClass(), "regexps", null);
        setField(term109096, term109096.getClass(), "itsVariables", null);
        setField(term109096, term109096.getClass(), "itsConst", null);
        setField(term109096, term109096.getClass(), "itsVariableNames", null);
        setIntField(term109096, term109096.getClass(), "varStart", 0);
        setField(term109096, term109096.getClass(), "compilerData", null);
        setIntField(term109096, term109096.getClass(), "type", 0);
        setField(term109097, term109097.getClass(), "str", null);
        setIntField(term109097, term109097.getClass(), "type", 0);
        setField(term109097, term109097.getClass(), "next", null);
        setField(term109097, term109097.getClass(), "first", null);
        setField(term109097, term109097.getClass(), "last", null);
        setField(term109097, term109097.getClass(), "propListHead", null);
        setIntField(term109097, term109097.getClass(), "sourcePosition", 0);
        setField(term109097, term109097.getClass(), "jsType", null);
        setField(term109097, term109097.getClass(), "parent", null);
        setField(term109096, term109096.getClass(), "next", term109097);
        setField(term109096, term109096.getClass(), "first", null);
        setField(term109096, term109096.getClass(), "last", null);
        setField(term109096, term109096.getClass(), "propListHead", null);
        setIntField(term109096, term109096.getClass(), "sourcePosition", 0);
        setField(term109096, term109096.getClass(), "jsType", null);
        setField(term109096, term109096.getClass(), "parent", null);
        setField(term109095, term109095.getClass(), "first", term109096);
        setField(term109095, term109095.getClass(), "last", null);
        setField(term109095, term109095.getClass(), "propListHead", null);
        setIntField(term109095, term109095.getClass(), "sourcePosition", 0);
        setField(term109095, term109095.getClass(), "jsType", null);
        setField(term109095, term109095.getClass(), "parent", null);
        term109009 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term109019 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term109029 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term109009, term109009.getClass(), "functionName", null);
        setBooleanField(term109009, term109009.getClass(), "itsNeedsActivation", false);
        setIntField(term109009, term109009.getClass(), "itsFunctionType", 0);
        setBooleanField(term109009, term109009.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term109009, term109009.getClass(), "encodedSourceStart", 0);
        setIntField(term109009, term109009.getClass(), "encodedSourceEnd", 0);
        setField(term109009, term109009.getClass(), "sourceName", null);
        setIntField(term109009, term109009.getClass(), "baseLineno", 0);
        setIntField(term109009, term109009.getClass(), "endLineno", 0);
        setField(term109009, term109009.getClass(), "functions", null);
        setField(term109009, term109009.getClass(), "regexps", null);
        setField(term109009, term109009.getClass(), "itsVariables", null);
        setField(term109009, term109009.getClass(), "itsConst", null);
        setField(term109009, term109009.getClass(), "itsVariableNames", null);
        setIntField(term109009, term109009.getClass(), "varStart", 0);
        setField(term109009, term109009.getClass(), "compilerData", null);
        setIntField(term109009, term109009.getClass(), "type", 101);
        setField(term109009, term109009.getClass(), "next", null);
        setField(term109019, term109019.getClass(), "functionName", null);
        setBooleanField(term109019, term109019.getClass(), "itsNeedsActivation", false);
        setIntField(term109019, term109019.getClass(), "itsFunctionType", 0);
        setBooleanField(term109019, term109019.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term109019, term109019.getClass(), "encodedSourceStart", 0);
        setIntField(term109019, term109019.getClass(), "encodedSourceEnd", 0);
        setField(term109019, term109019.getClass(), "sourceName", null);
        setIntField(term109019, term109019.getClass(), "baseLineno", 0);
        setIntField(term109019, term109019.getClass(), "endLineno", 0);
        setField(term109019, term109019.getClass(), "functions", null);
        setField(term109019, term109019.getClass(), "regexps", null);
        setField(term109019, term109019.getClass(), "itsVariables", null);
        setField(term109019, term109019.getClass(), "itsConst", null);
        setField(term109019, term109019.getClass(), "itsVariableNames", null);
        setIntField(term109019, term109019.getClass(), "varStart", 0);
        setField(term109019, term109019.getClass(), "compilerData", null);
        setIntField(term109019, term109019.getClass(), "type", 0);
        setField(term109029, term109029.getClass(), "str", null);
        setIntField(term109029, term109029.getClass(), "type", 0);
        setField(term109029, term109029.getClass(), "next", null);
        setField(term109029, term109029.getClass(), "first", null);
        setField(term109029, term109029.getClass(), "last", null);
        setField(term109029, term109029.getClass(), "propListHead", null);
        setIntField(term109029, term109029.getClass(), "sourcePosition", 0);
        setField(term109029, term109029.getClass(), "jsType", null);
        setField(term109029, term109029.getClass(), "parent", null);
        setField(term109019, term109019.getClass(), "next", term109029);
        setField(term109019, term109019.getClass(), "first", null);
        setField(term109019, term109019.getClass(), "last", null);
        setField(term109019, term109019.getClass(), "propListHead", null);
        setIntField(term109019, term109019.getClass(), "sourcePosition", 0);
        setField(term109019, term109019.getClass(), "jsType", null);
        setField(term109019, term109019.getClass(), "parent", null);
        setField(term109009, term109009.getClass(), "first", term109019);
        setField(term109009, term109009.getClass(), "last", null);
        setField(term109009, term109009.getClass(), "propListHead", null);
        setIntField(term109009, term109009.getClass(), "sourcePosition", 0);
        setField(term109009, term109009.getClass(), "jsType", null);
        setField(term109009, term109009.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term108783;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term108697, args);
        assertTrue(recursiveEquals(term108697, term109094));
        assertTrue(recursiveEquals(term108783, term109095));
        assertTrue(recursiveEquals(retValue, term109009));
    }

};


