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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281477;
     Object term281563;
     Object term304223;
     Object term304224;
     Object term304157;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281477 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term281563 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term281649 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term281741 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term281649, term281649.getClass(), "next", term281741);
        setField(term281563, term281563.getClass(), "first", term281649);
        setIntField(term281563, term281563.getClass(), "type", 33);
        term304223 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term304223, term304223.getClass(), "currentTraversal", null);
        term304224 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term304225 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term304226 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term304224, term304224.getClass(), "functionName", null);
        setBooleanField(term304224, term304224.getClass(), "itsNeedsActivation", false);
        setIntField(term304224, term304224.getClass(), "itsFunctionType", 0);
        setBooleanField(term304224, term304224.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term304224, term304224.getClass(), "encodedSourceStart", 0);
        setIntField(term304224, term304224.getClass(), "encodedSourceEnd", 0);
        setField(term304224, term304224.getClass(), "sourceName", null);
        setIntField(term304224, term304224.getClass(), "baseLineno", 0);
        setIntField(term304224, term304224.getClass(), "endLineno", 0);
        setField(term304224, term304224.getClass(), "functions", null);
        setField(term304224, term304224.getClass(), "regexps", null);
        setField(term304224, term304224.getClass(), "itsVariables", null);
        setField(term304224, term304224.getClass(), "itsConst", null);
        setField(term304224, term304224.getClass(), "itsVariableNames", null);
        setIntField(term304224, term304224.getClass(), "varStart", 0);
        setField(term304224, term304224.getClass(), "compilerData", null);
        setIntField(term304224, term304224.getClass(), "type", 33);
        setField(term304224, term304224.getClass(), "next", null);
        setField(term304225, term304225.getClass(), "functionName", null);
        setBooleanField(term304225, term304225.getClass(), "itsNeedsActivation", false);
        setIntField(term304225, term304225.getClass(), "itsFunctionType", 0);
        setBooleanField(term304225, term304225.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term304225, term304225.getClass(), "encodedSourceStart", 0);
        setIntField(term304225, term304225.getClass(), "encodedSourceEnd", 0);
        setField(term304225, term304225.getClass(), "sourceName", null);
        setIntField(term304225, term304225.getClass(), "baseLineno", 0);
        setIntField(term304225, term304225.getClass(), "endLineno", 0);
        setField(term304225, term304225.getClass(), "functions", null);
        setField(term304225, term304225.getClass(), "regexps", null);
        setField(term304225, term304225.getClass(), "itsVariables", null);
        setField(term304225, term304225.getClass(), "itsConst", null);
        setField(term304225, term304225.getClass(), "itsVariableNames", null);
        setIntField(term304225, term304225.getClass(), "varStart", 0);
        setField(term304225, term304225.getClass(), "compilerData", null);
        setIntField(term304225, term304225.getClass(), "type", 0);
        setDoubleField(term304226, term304226.getClass(), "number", 0.0);
        setIntField(term304226, term304226.getClass(), "type", 0);
        setField(term304226, term304226.getClass(), "next", null);
        setField(term304226, term304226.getClass(), "first", null);
        setField(term304226, term304226.getClass(), "last", null);
        setField(term304226, term304226.getClass(), "propListHead", null);
        setIntField(term304226, term304226.getClass(), "sourcePosition", 0);
        setField(term304226, term304226.getClass(), "jsType", null);
        setField(term304226, term304226.getClass(), "parent", null);
        setField(term304225, term304225.getClass(), "next", term304226);
        setField(term304225, term304225.getClass(), "first", null);
        setField(term304225, term304225.getClass(), "last", null);
        setField(term304225, term304225.getClass(), "propListHead", null);
        setIntField(term304225, term304225.getClass(), "sourcePosition", 0);
        setField(term304225, term304225.getClass(), "jsType", null);
        setField(term304225, term304225.getClass(), "parent", null);
        setField(term304224, term304224.getClass(), "first", term304225);
        setField(term304224, term304224.getClass(), "last", null);
        setField(term304224, term304224.getClass(), "propListHead", null);
        setIntField(term304224, term304224.getClass(), "sourcePosition", 0);
        setField(term304224, term304224.getClass(), "jsType", null);
        setField(term304224, term304224.getClass(), "parent", null);
        term304157 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term304167 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term304177 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term304157, term304157.getClass(), "functionName", null);
        setBooleanField(term304157, term304157.getClass(), "itsNeedsActivation", false);
        setIntField(term304157, term304157.getClass(), "itsFunctionType", 0);
        setBooleanField(term304157, term304157.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term304157, term304157.getClass(), "encodedSourceStart", 0);
        setIntField(term304157, term304157.getClass(), "encodedSourceEnd", 0);
        setField(term304157, term304157.getClass(), "sourceName", null);
        setIntField(term304157, term304157.getClass(), "baseLineno", 0);
        setIntField(term304157, term304157.getClass(), "endLineno", 0);
        setField(term304157, term304157.getClass(), "functions", null);
        setField(term304157, term304157.getClass(), "regexps", null);
        setField(term304157, term304157.getClass(), "itsVariables", null);
        setField(term304157, term304157.getClass(), "itsConst", null);
        setField(term304157, term304157.getClass(), "itsVariableNames", null);
        setIntField(term304157, term304157.getClass(), "varStart", 0);
        setField(term304157, term304157.getClass(), "compilerData", null);
        setIntField(term304157, term304157.getClass(), "type", 33);
        setField(term304157, term304157.getClass(), "next", null);
        setField(term304167, term304167.getClass(), "functionName", null);
        setBooleanField(term304167, term304167.getClass(), "itsNeedsActivation", false);
        setIntField(term304167, term304167.getClass(), "itsFunctionType", 0);
        setBooleanField(term304167, term304167.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term304167, term304167.getClass(), "encodedSourceStart", 0);
        setIntField(term304167, term304167.getClass(), "encodedSourceEnd", 0);
        setField(term304167, term304167.getClass(), "sourceName", null);
        setIntField(term304167, term304167.getClass(), "baseLineno", 0);
        setIntField(term304167, term304167.getClass(), "endLineno", 0);
        setField(term304167, term304167.getClass(), "functions", null);
        setField(term304167, term304167.getClass(), "regexps", null);
        setField(term304167, term304167.getClass(), "itsVariables", null);
        setField(term304167, term304167.getClass(), "itsConst", null);
        setField(term304167, term304167.getClass(), "itsVariableNames", null);
        setIntField(term304167, term304167.getClass(), "varStart", 0);
        setField(term304167, term304167.getClass(), "compilerData", null);
        setIntField(term304167, term304167.getClass(), "type", 0);
        setDoubleField(term304177, term304177.getClass(), "number", 0.0);
        setIntField(term304177, term304177.getClass(), "type", 0);
        setField(term304177, term304177.getClass(), "next", null);
        setField(term304177, term304177.getClass(), "first", null);
        setField(term304177, term304177.getClass(), "last", null);
        setField(term304177, term304177.getClass(), "propListHead", null);
        setIntField(term304177, term304177.getClass(), "sourcePosition", 0);
        setField(term304177, term304177.getClass(), "jsType", null);
        setField(term304177, term304177.getClass(), "parent", null);
        setField(term304167, term304167.getClass(), "next", term304177);
        setField(term304167, term304167.getClass(), "first", null);
        setField(term304167, term304167.getClass(), "last", null);
        setField(term304167, term304167.getClass(), "propListHead", null);
        setIntField(term304167, term304167.getClass(), "sourcePosition", 0);
        setField(term304167, term304167.getClass(), "jsType", null);
        setField(term304167, term304167.getClass(), "parent", null);
        setField(term304157, term304157.getClass(), "first", term304167);
        setField(term304157, term304157.getClass(), "last", null);
        setField(term304157, term304157.getClass(), "propListHead", null);
        setIntField(term304157, term304157.getClass(), "sourcePosition", 0);
        setField(term304157, term304157.getClass(), "jsType", null);
        setField(term304157, term304157.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term281563;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term281477, args);
        assertTrue(recursiveEquals(term281477, term304223));
        assertTrue(recursiveEquals(term281563, term304224));
        assertTrue(recursiveEquals(retValue, term304157));
    }

};


