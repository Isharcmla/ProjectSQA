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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term593622;
     Object term593708;
     Object term593909;
     Object term593910;
     Object term593817;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term593622 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term593708 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term593794 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term593794, term593794.getClass(), "next", term593708);
        setIntField(term593794, term593794.getClass(), "type", 42);
        setField(term593708, term593708.getClass(), "first", term593794);
        setIntField(term593708, term593708.getClass(), "type", 16);
        term593909 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term593909, term593909.getClass(), "currentTraversal", null);
        term593910 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term593911 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term593910, term593910.getClass(), "functionName", null);
        setBooleanField(term593910, term593910.getClass(), "itsNeedsActivation", false);
        setIntField(term593910, term593910.getClass(), "itsFunctionType", 0);
        setBooleanField(term593910, term593910.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term593910, term593910.getClass(), "encodedSourceStart", 0);
        setIntField(term593910, term593910.getClass(), "encodedSourceEnd", 0);
        setField(term593910, term593910.getClass(), "sourceName", null);
        setIntField(term593910, term593910.getClass(), "baseLineno", 0);
        setIntField(term593910, term593910.getClass(), "endLineno", 0);
        setField(term593910, term593910.getClass(), "functions", null);
        setField(term593910, term593910.getClass(), "regexps", null);
        setField(term593910, term593910.getClass(), "itsVariables", null);
        setField(term593910, term593910.getClass(), "itsConst", null);
        setField(term593910, term593910.getClass(), "itsVariableNames", null);
        setIntField(term593910, term593910.getClass(), "varStart", 0);
        setField(term593910, term593910.getClass(), "compilerData", null);
        setIntField(term593910, term593910.getClass(), "type", 16);
        setField(term593910, term593910.getClass(), "next", null);
        setField(term593911, term593911.getClass(), "functionName", null);
        setBooleanField(term593911, term593911.getClass(), "itsNeedsActivation", false);
        setIntField(term593911, term593911.getClass(), "itsFunctionType", 0);
        setBooleanField(term593911, term593911.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term593911, term593911.getClass(), "encodedSourceStart", 0);
        setIntField(term593911, term593911.getClass(), "encodedSourceEnd", 0);
        setField(term593911, term593911.getClass(), "sourceName", null);
        setIntField(term593911, term593911.getClass(), "baseLineno", 0);
        setIntField(term593911, term593911.getClass(), "endLineno", 0);
        setField(term593911, term593911.getClass(), "functions", null);
        setField(term593911, term593911.getClass(), "regexps", null);
        setField(term593911, term593911.getClass(), "itsVariables", null);
        setField(term593911, term593911.getClass(), "itsConst", null);
        setField(term593911, term593911.getClass(), "itsVariableNames", null);
        setIntField(term593911, term593911.getClass(), "varStart", 0);
        setField(term593911, term593911.getClass(), "compilerData", null);
        setIntField(term593911, term593911.getClass(), "type", 42);
        setField(term593911, term593911.getClass(), "next", term593910);
        setField(term593911, term593911.getClass(), "first", null);
        setField(term593911, term593911.getClass(), "last", null);
        setField(term593911, term593911.getClass(), "propListHead", null);
        setIntField(term593911, term593911.getClass(), "sourcePosition", 0);
        setField(term593911, term593911.getClass(), "jsType", null);
        setField(term593911, term593911.getClass(), "parent", null);
        setField(term593910, term593910.getClass(), "first", term593911);
        setField(term593910, term593910.getClass(), "last", null);
        setField(term593910, term593910.getClass(), "propListHead", null);
        setIntField(term593910, term593910.getClass(), "sourcePosition", 0);
        setField(term593910, term593910.getClass(), "jsType", null);
        setField(term593910, term593910.getClass(), "parent", null);
        term593817 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term593827 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term593817, term593817.getClass(), "functionName", null);
        setBooleanField(term593817, term593817.getClass(), "itsNeedsActivation", false);
        setIntField(term593817, term593817.getClass(), "itsFunctionType", 0);
        setBooleanField(term593817, term593817.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term593817, term593817.getClass(), "encodedSourceStart", 0);
        setIntField(term593817, term593817.getClass(), "encodedSourceEnd", 0);
        setField(term593817, term593817.getClass(), "sourceName", null);
        setIntField(term593817, term593817.getClass(), "baseLineno", 0);
        setIntField(term593817, term593817.getClass(), "endLineno", 0);
        setField(term593817, term593817.getClass(), "functions", null);
        setField(term593817, term593817.getClass(), "regexps", null);
        setField(term593817, term593817.getClass(), "itsVariables", null);
        setField(term593817, term593817.getClass(), "itsConst", null);
        setField(term593817, term593817.getClass(), "itsVariableNames", null);
        setIntField(term593817, term593817.getClass(), "varStart", 0);
        setField(term593817, term593817.getClass(), "compilerData", null);
        setIntField(term593817, term593817.getClass(), "type", 16);
        setField(term593817, term593817.getClass(), "next", null);
        setField(term593827, term593827.getClass(), "functionName", null);
        setBooleanField(term593827, term593827.getClass(), "itsNeedsActivation", false);
        setIntField(term593827, term593827.getClass(), "itsFunctionType", 0);
        setBooleanField(term593827, term593827.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term593827, term593827.getClass(), "encodedSourceStart", 0);
        setIntField(term593827, term593827.getClass(), "encodedSourceEnd", 0);
        setField(term593827, term593827.getClass(), "sourceName", null);
        setIntField(term593827, term593827.getClass(), "baseLineno", 0);
        setIntField(term593827, term593827.getClass(), "endLineno", 0);
        setField(term593827, term593827.getClass(), "functions", null);
        setField(term593827, term593827.getClass(), "regexps", null);
        setField(term593827, term593827.getClass(), "itsVariables", null);
        setField(term593827, term593827.getClass(), "itsConst", null);
        setField(term593827, term593827.getClass(), "itsVariableNames", null);
        setIntField(term593827, term593827.getClass(), "varStart", 0);
        setField(term593827, term593827.getClass(), "compilerData", null);
        setIntField(term593827, term593827.getClass(), "type", 42);
        setField(term593827, term593827.getClass(), "next", term593817);
        setField(term593827, term593827.getClass(), "first", null);
        setField(term593827, term593827.getClass(), "last", null);
        setField(term593827, term593827.getClass(), "propListHead", null);
        setIntField(term593827, term593827.getClass(), "sourcePosition", 0);
        setField(term593827, term593827.getClass(), "jsType", null);
        setField(term593827, term593827.getClass(), "parent", null);
        setField(term593817, term593817.getClass(), "first", term593827);
        setField(term593817, term593817.getClass(), "last", null);
        setField(term593817, term593817.getClass(), "propListHead", null);
        setIntField(term593817, term593817.getClass(), "sourcePosition", 0);
        setField(term593817, term593817.getClass(), "jsType", null);
        setField(term593817, term593817.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term593708;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term593622, args);
        assertTrue(recursiveEquals(term593622, term593909));
        assertTrue(recursiveEquals(term593708, term593910));
        assertTrue(recursiveEquals(retValue, term593817));
    }

};


