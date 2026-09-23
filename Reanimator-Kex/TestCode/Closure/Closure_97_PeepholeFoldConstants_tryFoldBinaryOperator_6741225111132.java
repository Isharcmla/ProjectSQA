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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349166;
     Object term349252;
     Object term349549;
     Object term349550;
     Object term349457;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349166 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term349252 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term349338 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term349338, term349338.getClass(), "next", term349252);
        setIntField(term349338, term349338.getClass(), "type", 42);
        setField(term349252, term349252.getClass(), "first", term349338);
        setIntField(term349252, term349252.getClass(), "type", 16);
        term349549 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term349549, term349549.getClass(), "currentTraversal", null);
        term349550 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term349551 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term349550, term349550.getClass(), "functionName", null);
        setBooleanField(term349550, term349550.getClass(), "itsNeedsActivation", false);
        setIntField(term349550, term349550.getClass(), "itsFunctionType", 0);
        setBooleanField(term349550, term349550.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term349550, term349550.getClass(), "encodedSourceStart", 0);
        setIntField(term349550, term349550.getClass(), "encodedSourceEnd", 0);
        setField(term349550, term349550.getClass(), "sourceName", null);
        setIntField(term349550, term349550.getClass(), "baseLineno", 0);
        setIntField(term349550, term349550.getClass(), "endLineno", 0);
        setField(term349550, term349550.getClass(), "functions", null);
        setField(term349550, term349550.getClass(), "regexps", null);
        setField(term349550, term349550.getClass(), "itsVariables", null);
        setField(term349550, term349550.getClass(), "itsConst", null);
        setField(term349550, term349550.getClass(), "itsVariableNames", null);
        setIntField(term349550, term349550.getClass(), "varStart", 0);
        setField(term349550, term349550.getClass(), "compilerData", null);
        setIntField(term349550, term349550.getClass(), "type", 16);
        setField(term349550, term349550.getClass(), "next", null);
        setField(term349551, term349551.getClass(), "functionName", null);
        setBooleanField(term349551, term349551.getClass(), "itsNeedsActivation", false);
        setIntField(term349551, term349551.getClass(), "itsFunctionType", 0);
        setBooleanField(term349551, term349551.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term349551, term349551.getClass(), "encodedSourceStart", 0);
        setIntField(term349551, term349551.getClass(), "encodedSourceEnd", 0);
        setField(term349551, term349551.getClass(), "sourceName", null);
        setIntField(term349551, term349551.getClass(), "baseLineno", 0);
        setIntField(term349551, term349551.getClass(), "endLineno", 0);
        setField(term349551, term349551.getClass(), "functions", null);
        setField(term349551, term349551.getClass(), "regexps", null);
        setField(term349551, term349551.getClass(), "itsVariables", null);
        setField(term349551, term349551.getClass(), "itsConst", null);
        setField(term349551, term349551.getClass(), "itsVariableNames", null);
        setIntField(term349551, term349551.getClass(), "varStart", 0);
        setField(term349551, term349551.getClass(), "compilerData", null);
        setIntField(term349551, term349551.getClass(), "type", 42);
        setField(term349551, term349551.getClass(), "next", term349550);
        setField(term349551, term349551.getClass(), "first", null);
        setField(term349551, term349551.getClass(), "last", null);
        setField(term349551, term349551.getClass(), "propListHead", null);
        setIntField(term349551, term349551.getClass(), "sourcePosition", 0);
        setField(term349551, term349551.getClass(), "jsType", null);
        setField(term349551, term349551.getClass(), "parent", null);
        setField(term349550, term349550.getClass(), "first", term349551);
        setField(term349550, term349550.getClass(), "last", null);
        setField(term349550, term349550.getClass(), "propListHead", null);
        setIntField(term349550, term349550.getClass(), "sourcePosition", 0);
        setField(term349550, term349550.getClass(), "jsType", null);
        setField(term349550, term349550.getClass(), "parent", null);
        term349457 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term349467 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term349457, term349457.getClass(), "functionName", null);
        setBooleanField(term349457, term349457.getClass(), "itsNeedsActivation", false);
        setIntField(term349457, term349457.getClass(), "itsFunctionType", 0);
        setBooleanField(term349457, term349457.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term349457, term349457.getClass(), "encodedSourceStart", 0);
        setIntField(term349457, term349457.getClass(), "encodedSourceEnd", 0);
        setField(term349457, term349457.getClass(), "sourceName", null);
        setIntField(term349457, term349457.getClass(), "baseLineno", 0);
        setIntField(term349457, term349457.getClass(), "endLineno", 0);
        setField(term349457, term349457.getClass(), "functions", null);
        setField(term349457, term349457.getClass(), "regexps", null);
        setField(term349457, term349457.getClass(), "itsVariables", null);
        setField(term349457, term349457.getClass(), "itsConst", null);
        setField(term349457, term349457.getClass(), "itsVariableNames", null);
        setIntField(term349457, term349457.getClass(), "varStart", 0);
        setField(term349457, term349457.getClass(), "compilerData", null);
        setIntField(term349457, term349457.getClass(), "type", 16);
        setField(term349457, term349457.getClass(), "next", null);
        setField(term349467, term349467.getClass(), "functionName", null);
        setBooleanField(term349467, term349467.getClass(), "itsNeedsActivation", false);
        setIntField(term349467, term349467.getClass(), "itsFunctionType", 0);
        setBooleanField(term349467, term349467.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term349467, term349467.getClass(), "encodedSourceStart", 0);
        setIntField(term349467, term349467.getClass(), "encodedSourceEnd", 0);
        setField(term349467, term349467.getClass(), "sourceName", null);
        setIntField(term349467, term349467.getClass(), "baseLineno", 0);
        setIntField(term349467, term349467.getClass(), "endLineno", 0);
        setField(term349467, term349467.getClass(), "functions", null);
        setField(term349467, term349467.getClass(), "regexps", null);
        setField(term349467, term349467.getClass(), "itsVariables", null);
        setField(term349467, term349467.getClass(), "itsConst", null);
        setField(term349467, term349467.getClass(), "itsVariableNames", null);
        setIntField(term349467, term349467.getClass(), "varStart", 0);
        setField(term349467, term349467.getClass(), "compilerData", null);
        setIntField(term349467, term349467.getClass(), "type", 42);
        setField(term349467, term349467.getClass(), "next", term349457);
        setField(term349467, term349467.getClass(), "first", null);
        setField(term349467, term349467.getClass(), "last", null);
        setField(term349467, term349467.getClass(), "propListHead", null);
        setIntField(term349467, term349467.getClass(), "sourcePosition", 0);
        setField(term349467, term349467.getClass(), "jsType", null);
        setField(term349467, term349467.getClass(), "parent", null);
        setField(term349457, term349457.getClass(), "first", term349467);
        setField(term349457, term349457.getClass(), "last", null);
        setField(term349457, term349457.getClass(), "propListHead", null);
        setIntField(term349457, term349457.getClass(), "sourcePosition", 0);
        setField(term349457, term349457.getClass(), "jsType", null);
        setField(term349457, term349457.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term349252;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term349166, args);
        assertTrue(recursiveEquals(term349166, term349549));
        assertTrue(recursiveEquals(term349252, term349550));
        assertTrue(recursiveEquals(retValue, term349457));
    }

};


