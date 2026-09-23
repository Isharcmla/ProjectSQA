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

public class PeepholeFoldConstants_tryFoldTypeof_10367868771456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543938;
     Object term544024;
     Object term544277;
     Object term544278;
     Object term544223;

    public PeepholeFoldConstants_tryFoldTypeof_10367868771456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term543938 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term544024 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term544110 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term544024, term544024.getClass(), "type", 32);
        setField(term544024, term544024.getClass(), "first", term544110);
        term544277 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term544277, term544277.getClass(), "currentTraversal", null);
        term544278 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term544279 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term544278, term544278.getClass(), "functionName", null);
        setBooleanField(term544278, term544278.getClass(), "itsNeedsActivation", false);
        setIntField(term544278, term544278.getClass(), "itsFunctionType", 0);
        setBooleanField(term544278, term544278.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term544278, term544278.getClass(), "encodedSourceStart", 0);
        setIntField(term544278, term544278.getClass(), "encodedSourceEnd", 0);
        setField(term544278, term544278.getClass(), "sourceName", null);
        setIntField(term544278, term544278.getClass(), "baseLineno", 0);
        setIntField(term544278, term544278.getClass(), "endLineno", 0);
        setField(term544278, term544278.getClass(), "functions", null);
        setField(term544278, term544278.getClass(), "regexps", null);
        setField(term544278, term544278.getClass(), "itsVariables", null);
        setField(term544278, term544278.getClass(), "itsConst", null);
        setField(term544278, term544278.getClass(), "itsVariableNames", null);
        setIntField(term544278, term544278.getClass(), "varStart", 0);
        setField(term544278, term544278.getClass(), "compilerData", null);
        setIntField(term544278, term544278.getClass(), "type", 32);
        setField(term544278, term544278.getClass(), "next", null);
        setField(term544279, term544279.getClass(), "functionName", null);
        setBooleanField(term544279, term544279.getClass(), "itsNeedsActivation", false);
        setIntField(term544279, term544279.getClass(), "itsFunctionType", 0);
        setBooleanField(term544279, term544279.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term544279, term544279.getClass(), "encodedSourceStart", 0);
        setIntField(term544279, term544279.getClass(), "encodedSourceEnd", 0);
        setField(term544279, term544279.getClass(), "sourceName", null);
        setIntField(term544279, term544279.getClass(), "baseLineno", 0);
        setIntField(term544279, term544279.getClass(), "endLineno", 0);
        setField(term544279, term544279.getClass(), "functions", null);
        setField(term544279, term544279.getClass(), "regexps", null);
        setField(term544279, term544279.getClass(), "itsVariables", null);
        setField(term544279, term544279.getClass(), "itsConst", null);
        setField(term544279, term544279.getClass(), "itsVariableNames", null);
        setIntField(term544279, term544279.getClass(), "varStart", 0);
        setField(term544279, term544279.getClass(), "compilerData", null);
        setIntField(term544279, term544279.getClass(), "type", 0);
        setField(term544279, term544279.getClass(), "next", null);
        setField(term544279, term544279.getClass(), "first", null);
        setField(term544279, term544279.getClass(), "last", null);
        setField(term544279, term544279.getClass(), "propListHead", null);
        setIntField(term544279, term544279.getClass(), "sourcePosition", 0);
        setField(term544279, term544279.getClass(), "jsType", null);
        setField(term544279, term544279.getClass(), "parent", null);
        setField(term544278, term544278.getClass(), "first", term544279);
        setField(term544278, term544278.getClass(), "last", null);
        setField(term544278, term544278.getClass(), "propListHead", null);
        setIntField(term544278, term544278.getClass(), "sourcePosition", 0);
        setField(term544278, term544278.getClass(), "jsType", null);
        setField(term544278, term544278.getClass(), "parent", null);
        term544223 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term544233 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term544223, term544223.getClass(), "functionName", null);
        setBooleanField(term544223, term544223.getClass(), "itsNeedsActivation", false);
        setIntField(term544223, term544223.getClass(), "itsFunctionType", 0);
        setBooleanField(term544223, term544223.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term544223, term544223.getClass(), "encodedSourceStart", 0);
        setIntField(term544223, term544223.getClass(), "encodedSourceEnd", 0);
        setField(term544223, term544223.getClass(), "sourceName", null);
        setIntField(term544223, term544223.getClass(), "baseLineno", 0);
        setIntField(term544223, term544223.getClass(), "endLineno", 0);
        setField(term544223, term544223.getClass(), "functions", null);
        setField(term544223, term544223.getClass(), "regexps", null);
        setField(term544223, term544223.getClass(), "itsVariables", null);
        setField(term544223, term544223.getClass(), "itsConst", null);
        setField(term544223, term544223.getClass(), "itsVariableNames", null);
        setIntField(term544223, term544223.getClass(), "varStart", 0);
        setField(term544223, term544223.getClass(), "compilerData", null);
        setIntField(term544223, term544223.getClass(), "type", 32);
        setField(term544223, term544223.getClass(), "next", null);
        setField(term544233, term544233.getClass(), "functionName", null);
        setBooleanField(term544233, term544233.getClass(), "itsNeedsActivation", false);
        setIntField(term544233, term544233.getClass(), "itsFunctionType", 0);
        setBooleanField(term544233, term544233.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term544233, term544233.getClass(), "encodedSourceStart", 0);
        setIntField(term544233, term544233.getClass(), "encodedSourceEnd", 0);
        setField(term544233, term544233.getClass(), "sourceName", null);
        setIntField(term544233, term544233.getClass(), "baseLineno", 0);
        setIntField(term544233, term544233.getClass(), "endLineno", 0);
        setField(term544233, term544233.getClass(), "functions", null);
        setField(term544233, term544233.getClass(), "regexps", null);
        setField(term544233, term544233.getClass(), "itsVariables", null);
        setField(term544233, term544233.getClass(), "itsConst", null);
        setField(term544233, term544233.getClass(), "itsVariableNames", null);
        setIntField(term544233, term544233.getClass(), "varStart", 0);
        setField(term544233, term544233.getClass(), "compilerData", null);
        setIntField(term544233, term544233.getClass(), "type", 0);
        setField(term544233, term544233.getClass(), "next", null);
        setField(term544233, term544233.getClass(), "first", null);
        setField(term544233, term544233.getClass(), "last", null);
        setField(term544233, term544233.getClass(), "propListHead", null);
        setIntField(term544233, term544233.getClass(), "sourcePosition", 0);
        setField(term544233, term544233.getClass(), "jsType", null);
        setField(term544233, term544233.getClass(), "parent", null);
        setField(term544223, term544223.getClass(), "first", term544233);
        setField(term544223, term544223.getClass(), "last", null);
        setField(term544223, term544223.getClass(), "propListHead", null);
        setIntField(term544223, term544223.getClass(), "sourcePosition", 0);
        setField(term544223, term544223.getClass(), "jsType", null);
        setField(term544223, term544223.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term544024;
        Object retValue = callMethod(klass, "tryFoldTypeof", argTypes, term543938, args);
        assertTrue(recursiveEquals(term543938, term544277));
        assertTrue(recursiveEquals(term544024, term544278));
        assertTrue(recursiveEquals(retValue, term544223));
    }

};


