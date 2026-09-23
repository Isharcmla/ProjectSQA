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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term879929;
     Object term880015;
     Object term880282;
     Object term880283;
     Object term880186;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term879929 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term880015 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term880101 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term880171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term880101, term880101.getClass(), "next", term880171);
        setField(term880015, term880015.getClass(), "first", term880101);
        setIntField(term880015, term880015.getClass(), "type", 21);
        term880282 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term880282, term880282.getClass(), "currentTraversal", null);
        term880283 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term880284 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term880285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term880283, term880283.getClass(), "functionName", null);
        setBooleanField(term880283, term880283.getClass(), "itsNeedsActivation", false);
        setIntField(term880283, term880283.getClass(), "itsFunctionType", 0);
        setBooleanField(term880283, term880283.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term880283, term880283.getClass(), "encodedSourceStart", 0);
        setIntField(term880283, term880283.getClass(), "encodedSourceEnd", 0);
        setField(term880283, term880283.getClass(), "sourceName", null);
        setIntField(term880283, term880283.getClass(), "baseLineno", 0);
        setIntField(term880283, term880283.getClass(), "endLineno", 0);
        setField(term880283, term880283.getClass(), "functions", null);
        setField(term880283, term880283.getClass(), "regexps", null);
        setField(term880283, term880283.getClass(), "itsVariables", null);
        setField(term880283, term880283.getClass(), "itsConst", null);
        setField(term880283, term880283.getClass(), "itsVariableNames", null);
        setIntField(term880283, term880283.getClass(), "varStart", 0);
        setField(term880283, term880283.getClass(), "compilerData", null);
        setIntField(term880283, term880283.getClass(), "type", 21);
        setField(term880283, term880283.getClass(), "next", null);
        setField(term880284, term880284.getClass(), "functionName", null);
        setBooleanField(term880284, term880284.getClass(), "itsNeedsActivation", false);
        setIntField(term880284, term880284.getClass(), "itsFunctionType", 0);
        setBooleanField(term880284, term880284.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term880284, term880284.getClass(), "encodedSourceStart", 0);
        setIntField(term880284, term880284.getClass(), "encodedSourceEnd", 0);
        setField(term880284, term880284.getClass(), "sourceName", null);
        setIntField(term880284, term880284.getClass(), "baseLineno", 0);
        setIntField(term880284, term880284.getClass(), "endLineno", 0);
        setField(term880284, term880284.getClass(), "functions", null);
        setField(term880284, term880284.getClass(), "regexps", null);
        setField(term880284, term880284.getClass(), "itsVariables", null);
        setField(term880284, term880284.getClass(), "itsConst", null);
        setField(term880284, term880284.getClass(), "itsVariableNames", null);
        setIntField(term880284, term880284.getClass(), "varStart", 0);
        setField(term880284, term880284.getClass(), "compilerData", null);
        setIntField(term880284, term880284.getClass(), "type", 0);
        setIntField(term880285, term880285.getClass(), "type", 0);
        setField(term880285, term880285.getClass(), "next", null);
        setField(term880285, term880285.getClass(), "first", null);
        setField(term880285, term880285.getClass(), "last", null);
        setField(term880285, term880285.getClass(), "propListHead", null);
        setIntField(term880285, term880285.getClass(), "sourcePosition", 0);
        setField(term880285, term880285.getClass(), "jsType", null);
        setField(term880285, term880285.getClass(), "parent", null);
        setField(term880284, term880284.getClass(), "next", term880285);
        setField(term880284, term880284.getClass(), "first", null);
        setField(term880284, term880284.getClass(), "last", null);
        setField(term880284, term880284.getClass(), "propListHead", null);
        setIntField(term880284, term880284.getClass(), "sourcePosition", 0);
        setField(term880284, term880284.getClass(), "jsType", null);
        setField(term880284, term880284.getClass(), "parent", null);
        setField(term880283, term880283.getClass(), "first", term880284);
        setField(term880283, term880283.getClass(), "last", null);
        setField(term880283, term880283.getClass(), "propListHead", null);
        setIntField(term880283, term880283.getClass(), "sourcePosition", 0);
        setField(term880283, term880283.getClass(), "jsType", null);
        setField(term880283, term880283.getClass(), "parent", null);
        term880186 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term880196 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term880206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term880186, term880186.getClass(), "functionName", null);
        setBooleanField(term880186, term880186.getClass(), "itsNeedsActivation", false);
        setIntField(term880186, term880186.getClass(), "itsFunctionType", 0);
        setBooleanField(term880186, term880186.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term880186, term880186.getClass(), "encodedSourceStart", 0);
        setIntField(term880186, term880186.getClass(), "encodedSourceEnd", 0);
        setField(term880186, term880186.getClass(), "sourceName", null);
        setIntField(term880186, term880186.getClass(), "baseLineno", 0);
        setIntField(term880186, term880186.getClass(), "endLineno", 0);
        setField(term880186, term880186.getClass(), "functions", null);
        setField(term880186, term880186.getClass(), "regexps", null);
        setField(term880186, term880186.getClass(), "itsVariables", null);
        setField(term880186, term880186.getClass(), "itsConst", null);
        setField(term880186, term880186.getClass(), "itsVariableNames", null);
        setIntField(term880186, term880186.getClass(), "varStart", 0);
        setField(term880186, term880186.getClass(), "compilerData", null);
        setIntField(term880186, term880186.getClass(), "type", 21);
        setField(term880186, term880186.getClass(), "next", null);
        setField(term880196, term880196.getClass(), "functionName", null);
        setBooleanField(term880196, term880196.getClass(), "itsNeedsActivation", false);
        setIntField(term880196, term880196.getClass(), "itsFunctionType", 0);
        setBooleanField(term880196, term880196.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term880196, term880196.getClass(), "encodedSourceStart", 0);
        setIntField(term880196, term880196.getClass(), "encodedSourceEnd", 0);
        setField(term880196, term880196.getClass(), "sourceName", null);
        setIntField(term880196, term880196.getClass(), "baseLineno", 0);
        setIntField(term880196, term880196.getClass(), "endLineno", 0);
        setField(term880196, term880196.getClass(), "functions", null);
        setField(term880196, term880196.getClass(), "regexps", null);
        setField(term880196, term880196.getClass(), "itsVariables", null);
        setField(term880196, term880196.getClass(), "itsConst", null);
        setField(term880196, term880196.getClass(), "itsVariableNames", null);
        setIntField(term880196, term880196.getClass(), "varStart", 0);
        setField(term880196, term880196.getClass(), "compilerData", null);
        setIntField(term880196, term880196.getClass(), "type", 0);
        setIntField(term880206, term880206.getClass(), "type", 0);
        setField(term880206, term880206.getClass(), "next", null);
        setField(term880206, term880206.getClass(), "first", null);
        setField(term880206, term880206.getClass(), "last", null);
        setField(term880206, term880206.getClass(), "propListHead", null);
        setIntField(term880206, term880206.getClass(), "sourcePosition", 0);
        setField(term880206, term880206.getClass(), "jsType", null);
        setField(term880206, term880206.getClass(), "parent", null);
        setField(term880196, term880196.getClass(), "next", term880206);
        setField(term880196, term880196.getClass(), "first", null);
        setField(term880196, term880196.getClass(), "last", null);
        setField(term880196, term880196.getClass(), "propListHead", null);
        setIntField(term880196, term880196.getClass(), "sourcePosition", 0);
        setField(term880196, term880196.getClass(), "jsType", null);
        setField(term880196, term880196.getClass(), "parent", null);
        setField(term880186, term880186.getClass(), "first", term880196);
        setField(term880186, term880186.getClass(), "last", null);
        setField(term880186, term880186.getClass(), "propListHead", null);
        setIntField(term880186, term880186.getClass(), "sourcePosition", 0);
        setField(term880186, term880186.getClass(), "jsType", null);
        setField(term880186, term880186.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term880015;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term879929, args);
        assertTrue(recursiveEquals(term879929, term880282));
        assertTrue(recursiveEquals(term880015, term880283));
        assertTrue(recursiveEquals(retValue, term880186));
    }

};


