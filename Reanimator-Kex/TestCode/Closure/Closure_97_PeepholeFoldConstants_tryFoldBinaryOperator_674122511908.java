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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256019;
     Object term256105;
     Object term256374;
     Object term256375;
     Object term256298;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256019 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term256105 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term256191 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term256283 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term256283, term256283.getClass(), "type", 42);
        setField(term256191, term256191.getClass(), "next", term256283);
        setIntField(term256191, term256191.getClass(), "type", 42);
        setField(term256105, term256105.getClass(), "first", term256191);
        setIntField(term256105, term256105.getClass(), "type", 16);
        term256374 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term256374, term256374.getClass(), "currentTraversal", null);
        term256375 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term256376 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term256377 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term256375, term256375.getClass(), "functionName", null);
        setBooleanField(term256375, term256375.getClass(), "itsNeedsActivation", false);
        setIntField(term256375, term256375.getClass(), "itsFunctionType", 0);
        setBooleanField(term256375, term256375.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term256375, term256375.getClass(), "encodedSourceStart", 0);
        setIntField(term256375, term256375.getClass(), "encodedSourceEnd", 0);
        setField(term256375, term256375.getClass(), "sourceName", null);
        setIntField(term256375, term256375.getClass(), "baseLineno", 0);
        setIntField(term256375, term256375.getClass(), "endLineno", 0);
        setField(term256375, term256375.getClass(), "functions", null);
        setField(term256375, term256375.getClass(), "regexps", null);
        setField(term256375, term256375.getClass(), "itsVariables", null);
        setField(term256375, term256375.getClass(), "itsConst", null);
        setField(term256375, term256375.getClass(), "itsVariableNames", null);
        setIntField(term256375, term256375.getClass(), "varStart", 0);
        setField(term256375, term256375.getClass(), "compilerData", null);
        setIntField(term256375, term256375.getClass(), "type", 16);
        setField(term256375, term256375.getClass(), "next", null);
        setField(term256376, term256376.getClass(), "functionName", null);
        setBooleanField(term256376, term256376.getClass(), "itsNeedsActivation", false);
        setIntField(term256376, term256376.getClass(), "itsFunctionType", 0);
        setBooleanField(term256376, term256376.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term256376, term256376.getClass(), "encodedSourceStart", 0);
        setIntField(term256376, term256376.getClass(), "encodedSourceEnd", 0);
        setField(term256376, term256376.getClass(), "sourceName", null);
        setIntField(term256376, term256376.getClass(), "baseLineno", 0);
        setIntField(term256376, term256376.getClass(), "endLineno", 0);
        setField(term256376, term256376.getClass(), "functions", null);
        setField(term256376, term256376.getClass(), "regexps", null);
        setField(term256376, term256376.getClass(), "itsVariables", null);
        setField(term256376, term256376.getClass(), "itsConst", null);
        setField(term256376, term256376.getClass(), "itsVariableNames", null);
        setIntField(term256376, term256376.getClass(), "varStart", 0);
        setField(term256376, term256376.getClass(), "compilerData", null);
        setIntField(term256376, term256376.getClass(), "type", 42);
        setField(term256377, term256377.getClass(), "str", null);
        setIntField(term256377, term256377.getClass(), "type", 42);
        setField(term256377, term256377.getClass(), "next", null);
        setField(term256377, term256377.getClass(), "first", null);
        setField(term256377, term256377.getClass(), "last", null);
        setField(term256377, term256377.getClass(), "propListHead", null);
        setIntField(term256377, term256377.getClass(), "sourcePosition", 0);
        setField(term256377, term256377.getClass(), "jsType", null);
        setField(term256377, term256377.getClass(), "parent", null);
        setField(term256376, term256376.getClass(), "next", term256377);
        setField(term256376, term256376.getClass(), "first", null);
        setField(term256376, term256376.getClass(), "last", null);
        setField(term256376, term256376.getClass(), "propListHead", null);
        setIntField(term256376, term256376.getClass(), "sourcePosition", 0);
        setField(term256376, term256376.getClass(), "jsType", null);
        setField(term256376, term256376.getClass(), "parent", null);
        setField(term256375, term256375.getClass(), "first", term256376);
        setField(term256375, term256375.getClass(), "last", null);
        setField(term256375, term256375.getClass(), "propListHead", null);
        setIntField(term256375, term256375.getClass(), "sourcePosition", 0);
        setField(term256375, term256375.getClass(), "jsType", null);
        setField(term256375, term256375.getClass(), "parent", null);
        term256298 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term256308 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term256318 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term256298, term256298.getClass(), "functionName", null);
        setBooleanField(term256298, term256298.getClass(), "itsNeedsActivation", false);
        setIntField(term256298, term256298.getClass(), "itsFunctionType", 0);
        setBooleanField(term256298, term256298.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term256298, term256298.getClass(), "encodedSourceStart", 0);
        setIntField(term256298, term256298.getClass(), "encodedSourceEnd", 0);
        setField(term256298, term256298.getClass(), "sourceName", null);
        setIntField(term256298, term256298.getClass(), "baseLineno", 0);
        setIntField(term256298, term256298.getClass(), "endLineno", 0);
        setField(term256298, term256298.getClass(), "functions", null);
        setField(term256298, term256298.getClass(), "regexps", null);
        setField(term256298, term256298.getClass(), "itsVariables", null);
        setField(term256298, term256298.getClass(), "itsConst", null);
        setField(term256298, term256298.getClass(), "itsVariableNames", null);
        setIntField(term256298, term256298.getClass(), "varStart", 0);
        setField(term256298, term256298.getClass(), "compilerData", null);
        setIntField(term256298, term256298.getClass(), "type", 16);
        setField(term256298, term256298.getClass(), "next", null);
        setField(term256308, term256308.getClass(), "functionName", null);
        setBooleanField(term256308, term256308.getClass(), "itsNeedsActivation", false);
        setIntField(term256308, term256308.getClass(), "itsFunctionType", 0);
        setBooleanField(term256308, term256308.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term256308, term256308.getClass(), "encodedSourceStart", 0);
        setIntField(term256308, term256308.getClass(), "encodedSourceEnd", 0);
        setField(term256308, term256308.getClass(), "sourceName", null);
        setIntField(term256308, term256308.getClass(), "baseLineno", 0);
        setIntField(term256308, term256308.getClass(), "endLineno", 0);
        setField(term256308, term256308.getClass(), "functions", null);
        setField(term256308, term256308.getClass(), "regexps", null);
        setField(term256308, term256308.getClass(), "itsVariables", null);
        setField(term256308, term256308.getClass(), "itsConst", null);
        setField(term256308, term256308.getClass(), "itsVariableNames", null);
        setIntField(term256308, term256308.getClass(), "varStart", 0);
        setField(term256308, term256308.getClass(), "compilerData", null);
        setIntField(term256308, term256308.getClass(), "type", 42);
        setField(term256318, term256318.getClass(), "str", null);
        setIntField(term256318, term256318.getClass(), "type", 42);
        setField(term256318, term256318.getClass(), "next", null);
        setField(term256318, term256318.getClass(), "first", null);
        setField(term256318, term256318.getClass(), "last", null);
        setField(term256318, term256318.getClass(), "propListHead", null);
        setIntField(term256318, term256318.getClass(), "sourcePosition", 0);
        setField(term256318, term256318.getClass(), "jsType", null);
        setField(term256318, term256318.getClass(), "parent", null);
        setField(term256308, term256308.getClass(), "next", term256318);
        setField(term256308, term256308.getClass(), "first", null);
        setField(term256308, term256308.getClass(), "last", null);
        setField(term256308, term256308.getClass(), "propListHead", null);
        setIntField(term256308, term256308.getClass(), "sourcePosition", 0);
        setField(term256308, term256308.getClass(), "jsType", null);
        setField(term256308, term256308.getClass(), "parent", null);
        setField(term256298, term256298.getClass(), "first", term256308);
        setField(term256298, term256298.getClass(), "last", null);
        setField(term256298, term256298.getClass(), "propListHead", null);
        setIntField(term256298, term256298.getClass(), "sourcePosition", 0);
        setField(term256298, term256298.getClass(), "jsType", null);
        setField(term256298, term256298.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term256105;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term256019, args);
        assertTrue(recursiveEquals(term256019, term256374));
        assertTrue(recursiveEquals(term256105, term256375));
        assertTrue(recursiveEquals(retValue, term256298));
    }

};


