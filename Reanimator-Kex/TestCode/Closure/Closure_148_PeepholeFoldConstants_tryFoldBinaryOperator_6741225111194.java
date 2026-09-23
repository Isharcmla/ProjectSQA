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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283165;
     Object term283251;
     Object term283865;
     Object term283866;
     Object term283780;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283165 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term283251 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term283337 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term283429 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term283337, term283337.getClass(), "next", term283429);
        setIntField(term283337, term283337.getClass(), "type", 0);
        setField(term283251, term283251.getClass(), "first", term283337);
        setIntField(term283251, term283251.getClass(), "type", 101);
        setField(term283251, term283251.getClass(), "parent", null);
        term283865 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term283865, term283865.getClass(), "currentTraversal", null);
        term283866 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term283867 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term283868 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term283866, term283866.getClass(), "functionName", null);
        setBooleanField(term283866, term283866.getClass(), "itsNeedsActivation", false);
        setIntField(term283866, term283866.getClass(), "itsFunctionType", 0);
        setBooleanField(term283866, term283866.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term283866, term283866.getClass(), "encodedSourceStart", 0);
        setIntField(term283866, term283866.getClass(), "encodedSourceEnd", 0);
        setField(term283866, term283866.getClass(), "sourceName", null);
        setIntField(term283866, term283866.getClass(), "baseLineno", 0);
        setIntField(term283866, term283866.getClass(), "endLineno", 0);
        setField(term283866, term283866.getClass(), "functions", null);
        setField(term283866, term283866.getClass(), "regexps", null);
        setField(term283866, term283866.getClass(), "itsVariables", null);
        setField(term283866, term283866.getClass(), "itsConst", null);
        setField(term283866, term283866.getClass(), "itsVariableNames", null);
        setIntField(term283866, term283866.getClass(), "varStart", 0);
        setField(term283866, term283866.getClass(), "compilerData", null);
        setIntField(term283866, term283866.getClass(), "type", 101);
        setField(term283866, term283866.getClass(), "next", null);
        setField(term283867, term283867.getClass(), "functionName", null);
        setBooleanField(term283867, term283867.getClass(), "itsNeedsActivation", false);
        setIntField(term283867, term283867.getClass(), "itsFunctionType", 0);
        setBooleanField(term283867, term283867.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term283867, term283867.getClass(), "encodedSourceStart", 0);
        setIntField(term283867, term283867.getClass(), "encodedSourceEnd", 0);
        setField(term283867, term283867.getClass(), "sourceName", null);
        setIntField(term283867, term283867.getClass(), "baseLineno", 0);
        setIntField(term283867, term283867.getClass(), "endLineno", 0);
        setField(term283867, term283867.getClass(), "functions", null);
        setField(term283867, term283867.getClass(), "regexps", null);
        setField(term283867, term283867.getClass(), "itsVariables", null);
        setField(term283867, term283867.getClass(), "itsConst", null);
        setField(term283867, term283867.getClass(), "itsVariableNames", null);
        setIntField(term283867, term283867.getClass(), "varStart", 0);
        setField(term283867, term283867.getClass(), "compilerData", null);
        setIntField(term283867, term283867.getClass(), "type", 0);
        setField(term283868, term283868.getClass(), "str", null);
        setIntField(term283868, term283868.getClass(), "type", 0);
        setField(term283868, term283868.getClass(), "next", null);
        setField(term283868, term283868.getClass(), "first", null);
        setField(term283868, term283868.getClass(), "last", null);
        setField(term283868, term283868.getClass(), "propListHead", null);
        setIntField(term283868, term283868.getClass(), "sourcePosition", 0);
        setField(term283868, term283868.getClass(), "jsType", null);
        setField(term283868, term283868.getClass(), "parent", null);
        setField(term283867, term283867.getClass(), "next", term283868);
        setField(term283867, term283867.getClass(), "first", null);
        setField(term283867, term283867.getClass(), "last", null);
        setField(term283867, term283867.getClass(), "propListHead", null);
        setIntField(term283867, term283867.getClass(), "sourcePosition", 0);
        setField(term283867, term283867.getClass(), "jsType", null);
        setField(term283867, term283867.getClass(), "parent", null);
        setField(term283866, term283866.getClass(), "first", term283867);
        setField(term283866, term283866.getClass(), "last", null);
        setField(term283866, term283866.getClass(), "propListHead", null);
        setIntField(term283866, term283866.getClass(), "sourcePosition", 0);
        setField(term283866, term283866.getClass(), "jsType", null);
        setField(term283866, term283866.getClass(), "parent", null);
        term283780 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term283790 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term283800 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term283780, term283780.getClass(), "functionName", null);
        setBooleanField(term283780, term283780.getClass(), "itsNeedsActivation", false);
        setIntField(term283780, term283780.getClass(), "itsFunctionType", 0);
        setBooleanField(term283780, term283780.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term283780, term283780.getClass(), "encodedSourceStart", 0);
        setIntField(term283780, term283780.getClass(), "encodedSourceEnd", 0);
        setField(term283780, term283780.getClass(), "sourceName", null);
        setIntField(term283780, term283780.getClass(), "baseLineno", 0);
        setIntField(term283780, term283780.getClass(), "endLineno", 0);
        setField(term283780, term283780.getClass(), "functions", null);
        setField(term283780, term283780.getClass(), "regexps", null);
        setField(term283780, term283780.getClass(), "itsVariables", null);
        setField(term283780, term283780.getClass(), "itsConst", null);
        setField(term283780, term283780.getClass(), "itsVariableNames", null);
        setIntField(term283780, term283780.getClass(), "varStart", 0);
        setField(term283780, term283780.getClass(), "compilerData", null);
        setIntField(term283780, term283780.getClass(), "type", 101);
        setField(term283780, term283780.getClass(), "next", null);
        setField(term283790, term283790.getClass(), "functionName", null);
        setBooleanField(term283790, term283790.getClass(), "itsNeedsActivation", false);
        setIntField(term283790, term283790.getClass(), "itsFunctionType", 0);
        setBooleanField(term283790, term283790.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term283790, term283790.getClass(), "encodedSourceStart", 0);
        setIntField(term283790, term283790.getClass(), "encodedSourceEnd", 0);
        setField(term283790, term283790.getClass(), "sourceName", null);
        setIntField(term283790, term283790.getClass(), "baseLineno", 0);
        setIntField(term283790, term283790.getClass(), "endLineno", 0);
        setField(term283790, term283790.getClass(), "functions", null);
        setField(term283790, term283790.getClass(), "regexps", null);
        setField(term283790, term283790.getClass(), "itsVariables", null);
        setField(term283790, term283790.getClass(), "itsConst", null);
        setField(term283790, term283790.getClass(), "itsVariableNames", null);
        setIntField(term283790, term283790.getClass(), "varStart", 0);
        setField(term283790, term283790.getClass(), "compilerData", null);
        setIntField(term283790, term283790.getClass(), "type", 0);
        setField(term283800, term283800.getClass(), "str", null);
        setIntField(term283800, term283800.getClass(), "type", 0);
        setField(term283800, term283800.getClass(), "next", null);
        setField(term283800, term283800.getClass(), "first", null);
        setField(term283800, term283800.getClass(), "last", null);
        setField(term283800, term283800.getClass(), "propListHead", null);
        setIntField(term283800, term283800.getClass(), "sourcePosition", 0);
        setField(term283800, term283800.getClass(), "jsType", null);
        setField(term283800, term283800.getClass(), "parent", null);
        setField(term283790, term283790.getClass(), "next", term283800);
        setField(term283790, term283790.getClass(), "first", null);
        setField(term283790, term283790.getClass(), "last", null);
        setField(term283790, term283790.getClass(), "propListHead", null);
        setIntField(term283790, term283790.getClass(), "sourcePosition", 0);
        setField(term283790, term283790.getClass(), "jsType", null);
        setField(term283790, term283790.getClass(), "parent", null);
        setField(term283780, term283780.getClass(), "first", term283790);
        setField(term283780, term283780.getClass(), "last", null);
        setField(term283780, term283780.getClass(), "propListHead", null);
        setIntField(term283780, term283780.getClass(), "sourcePosition", 0);
        setField(term283780, term283780.getClass(), "jsType", null);
        setField(term283780, term283780.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term283251;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term283165, args);
        assertTrue(recursiveEquals(term283165, term283865));
        assertTrue(recursiveEquals(term283251, term283866));
        assertTrue(recursiveEquals(retValue, term283780));
    }

};


