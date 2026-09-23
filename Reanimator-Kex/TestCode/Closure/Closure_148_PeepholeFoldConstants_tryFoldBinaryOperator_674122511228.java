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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43160;
     Object term43246;
     Object term43493;
     Object term43494;
     Object term43430;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43160 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term43246 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term43332 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term43402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term43332, term43332.getClass(), "next", term43402);
        setField(term43246, term43246.getClass(), "first", term43332);
        setIntField(term43246, term43246.getClass(), "type", 35);
        term43493 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term43493, term43493.getClass(), "currentTraversal", null);
        term43494 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term43495 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term43496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term43494, term43494.getClass(), "functionName", null);
        setBooleanField(term43494, term43494.getClass(), "itsNeedsActivation", false);
        setIntField(term43494, term43494.getClass(), "itsFunctionType", 0);
        setBooleanField(term43494, term43494.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term43494, term43494.getClass(), "encodedSourceStart", 0);
        setIntField(term43494, term43494.getClass(), "encodedSourceEnd", 0);
        setField(term43494, term43494.getClass(), "sourceName", null);
        setIntField(term43494, term43494.getClass(), "baseLineno", 0);
        setIntField(term43494, term43494.getClass(), "endLineno", 0);
        setField(term43494, term43494.getClass(), "functions", null);
        setField(term43494, term43494.getClass(), "regexps", null);
        setField(term43494, term43494.getClass(), "itsVariables", null);
        setField(term43494, term43494.getClass(), "itsConst", null);
        setField(term43494, term43494.getClass(), "itsVariableNames", null);
        setIntField(term43494, term43494.getClass(), "varStart", 0);
        setField(term43494, term43494.getClass(), "compilerData", null);
        setIntField(term43494, term43494.getClass(), "type", 35);
        setField(term43494, term43494.getClass(), "next", null);
        setField(term43495, term43495.getClass(), "functionName", null);
        setBooleanField(term43495, term43495.getClass(), "itsNeedsActivation", false);
        setIntField(term43495, term43495.getClass(), "itsFunctionType", 0);
        setBooleanField(term43495, term43495.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term43495, term43495.getClass(), "encodedSourceStart", 0);
        setIntField(term43495, term43495.getClass(), "encodedSourceEnd", 0);
        setField(term43495, term43495.getClass(), "sourceName", null);
        setIntField(term43495, term43495.getClass(), "baseLineno", 0);
        setIntField(term43495, term43495.getClass(), "endLineno", 0);
        setField(term43495, term43495.getClass(), "functions", null);
        setField(term43495, term43495.getClass(), "regexps", null);
        setField(term43495, term43495.getClass(), "itsVariables", null);
        setField(term43495, term43495.getClass(), "itsConst", null);
        setField(term43495, term43495.getClass(), "itsVariableNames", null);
        setIntField(term43495, term43495.getClass(), "varStart", 0);
        setField(term43495, term43495.getClass(), "compilerData", null);
        setIntField(term43495, term43495.getClass(), "type", 0);
        setIntField(term43496, term43496.getClass(), "type", 0);
        setField(term43496, term43496.getClass(), "next", null);
        setField(term43496, term43496.getClass(), "first", null);
        setField(term43496, term43496.getClass(), "last", null);
        setField(term43496, term43496.getClass(), "propListHead", null);
        setIntField(term43496, term43496.getClass(), "sourcePosition", 0);
        setField(term43496, term43496.getClass(), "jsType", null);
        setField(term43496, term43496.getClass(), "parent", null);
        setField(term43495, term43495.getClass(), "next", term43496);
        setField(term43495, term43495.getClass(), "first", null);
        setField(term43495, term43495.getClass(), "last", null);
        setField(term43495, term43495.getClass(), "propListHead", null);
        setIntField(term43495, term43495.getClass(), "sourcePosition", 0);
        setField(term43495, term43495.getClass(), "jsType", null);
        setField(term43495, term43495.getClass(), "parent", null);
        setField(term43494, term43494.getClass(), "first", term43495);
        setField(term43494, term43494.getClass(), "last", null);
        setField(term43494, term43494.getClass(), "propListHead", null);
        setIntField(term43494, term43494.getClass(), "sourcePosition", 0);
        setField(term43494, term43494.getClass(), "jsType", null);
        setField(term43494, term43494.getClass(), "parent", null);
        term43430 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term43440 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term43450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term43430, term43430.getClass(), "functionName", null);
        setBooleanField(term43430, term43430.getClass(), "itsNeedsActivation", false);
        setIntField(term43430, term43430.getClass(), "itsFunctionType", 0);
        setBooleanField(term43430, term43430.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term43430, term43430.getClass(), "encodedSourceStart", 0);
        setIntField(term43430, term43430.getClass(), "encodedSourceEnd", 0);
        setField(term43430, term43430.getClass(), "sourceName", null);
        setIntField(term43430, term43430.getClass(), "baseLineno", 0);
        setIntField(term43430, term43430.getClass(), "endLineno", 0);
        setField(term43430, term43430.getClass(), "functions", null);
        setField(term43430, term43430.getClass(), "regexps", null);
        setField(term43430, term43430.getClass(), "itsVariables", null);
        setField(term43430, term43430.getClass(), "itsConst", null);
        setField(term43430, term43430.getClass(), "itsVariableNames", null);
        setIntField(term43430, term43430.getClass(), "varStart", 0);
        setField(term43430, term43430.getClass(), "compilerData", null);
        setIntField(term43430, term43430.getClass(), "type", 35);
        setField(term43430, term43430.getClass(), "next", null);
        setField(term43440, term43440.getClass(), "functionName", null);
        setBooleanField(term43440, term43440.getClass(), "itsNeedsActivation", false);
        setIntField(term43440, term43440.getClass(), "itsFunctionType", 0);
        setBooleanField(term43440, term43440.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term43440, term43440.getClass(), "encodedSourceStart", 0);
        setIntField(term43440, term43440.getClass(), "encodedSourceEnd", 0);
        setField(term43440, term43440.getClass(), "sourceName", null);
        setIntField(term43440, term43440.getClass(), "baseLineno", 0);
        setIntField(term43440, term43440.getClass(), "endLineno", 0);
        setField(term43440, term43440.getClass(), "functions", null);
        setField(term43440, term43440.getClass(), "regexps", null);
        setField(term43440, term43440.getClass(), "itsVariables", null);
        setField(term43440, term43440.getClass(), "itsConst", null);
        setField(term43440, term43440.getClass(), "itsVariableNames", null);
        setIntField(term43440, term43440.getClass(), "varStart", 0);
        setField(term43440, term43440.getClass(), "compilerData", null);
        setIntField(term43440, term43440.getClass(), "type", 0);
        setIntField(term43450, term43450.getClass(), "type", 0);
        setField(term43450, term43450.getClass(), "next", null);
        setField(term43450, term43450.getClass(), "first", null);
        setField(term43450, term43450.getClass(), "last", null);
        setField(term43450, term43450.getClass(), "propListHead", null);
        setIntField(term43450, term43450.getClass(), "sourcePosition", 0);
        setField(term43450, term43450.getClass(), "jsType", null);
        setField(term43450, term43450.getClass(), "parent", null);
        setField(term43440, term43440.getClass(), "next", term43450);
        setField(term43440, term43440.getClass(), "first", null);
        setField(term43440, term43440.getClass(), "last", null);
        setField(term43440, term43440.getClass(), "propListHead", null);
        setIntField(term43440, term43440.getClass(), "sourcePosition", 0);
        setField(term43440, term43440.getClass(), "jsType", null);
        setField(term43440, term43440.getClass(), "parent", null);
        setField(term43430, term43430.getClass(), "first", term43440);
        setField(term43430, term43430.getClass(), "last", null);
        setField(term43430, term43430.getClass(), "propListHead", null);
        setIntField(term43430, term43430.getClass(), "sourcePosition", 0);
        setField(term43430, term43430.getClass(), "jsType", null);
        setField(term43430, term43430.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43246;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term43160, args);
        assertTrue(recursiveEquals(term43160, term43493));
        assertTrue(recursiveEquals(term43246, term43494));
        assertTrue(recursiveEquals(retValue, term43430));
    }

};


