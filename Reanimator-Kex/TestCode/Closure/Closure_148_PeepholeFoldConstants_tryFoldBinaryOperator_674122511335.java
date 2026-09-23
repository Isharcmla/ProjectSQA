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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66148;
     Object term66234;
     Object term67030;
     Object term67031;
     Object term66964;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66148 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term66234 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66320 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66320, term66320.getClass(), "next", term66390);
        setField(term66234, term66234.getClass(), "first", term66320);
        setIntField(term66234, term66234.getClass(), "type", 15);
        term67030 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term67030, term67030.getClass(), "currentTraversal", null);
        term67031 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term67032 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term67033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67031, term67031.getClass(), "functionName", null);
        setBooleanField(term67031, term67031.getClass(), "itsNeedsActivation", false);
        setIntField(term67031, term67031.getClass(), "itsFunctionType", 0);
        setBooleanField(term67031, term67031.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term67031, term67031.getClass(), "encodedSourceStart", 0);
        setIntField(term67031, term67031.getClass(), "encodedSourceEnd", 0);
        setField(term67031, term67031.getClass(), "sourceName", null);
        setIntField(term67031, term67031.getClass(), "baseLineno", 0);
        setIntField(term67031, term67031.getClass(), "endLineno", 0);
        setField(term67031, term67031.getClass(), "functions", null);
        setField(term67031, term67031.getClass(), "regexps", null);
        setField(term67031, term67031.getClass(), "itsVariables", null);
        setField(term67031, term67031.getClass(), "itsConst", null);
        setField(term67031, term67031.getClass(), "itsVariableNames", null);
        setIntField(term67031, term67031.getClass(), "varStart", 0);
        setField(term67031, term67031.getClass(), "compilerData", null);
        setIntField(term67031, term67031.getClass(), "type", 15);
        setField(term67031, term67031.getClass(), "next", null);
        setField(term67032, term67032.getClass(), "functionName", null);
        setBooleanField(term67032, term67032.getClass(), "itsNeedsActivation", false);
        setIntField(term67032, term67032.getClass(), "itsFunctionType", 0);
        setBooleanField(term67032, term67032.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term67032, term67032.getClass(), "encodedSourceStart", 0);
        setIntField(term67032, term67032.getClass(), "encodedSourceEnd", 0);
        setField(term67032, term67032.getClass(), "sourceName", null);
        setIntField(term67032, term67032.getClass(), "baseLineno", 0);
        setIntField(term67032, term67032.getClass(), "endLineno", 0);
        setField(term67032, term67032.getClass(), "functions", null);
        setField(term67032, term67032.getClass(), "regexps", null);
        setField(term67032, term67032.getClass(), "itsVariables", null);
        setField(term67032, term67032.getClass(), "itsConst", null);
        setField(term67032, term67032.getClass(), "itsVariableNames", null);
        setIntField(term67032, term67032.getClass(), "varStart", 0);
        setField(term67032, term67032.getClass(), "compilerData", null);
        setIntField(term67032, term67032.getClass(), "type", 0);
        setIntField(term67033, term67033.getClass(), "type", 0);
        setField(term67033, term67033.getClass(), "next", null);
        setField(term67033, term67033.getClass(), "first", null);
        setField(term67033, term67033.getClass(), "last", null);
        setField(term67033, term67033.getClass(), "propListHead", null);
        setIntField(term67033, term67033.getClass(), "sourcePosition", 0);
        setField(term67033, term67033.getClass(), "jsType", null);
        setField(term67033, term67033.getClass(), "parent", null);
        setField(term67032, term67032.getClass(), "next", term67033);
        setField(term67032, term67032.getClass(), "first", null);
        setField(term67032, term67032.getClass(), "last", null);
        setField(term67032, term67032.getClass(), "propListHead", null);
        setIntField(term67032, term67032.getClass(), "sourcePosition", 0);
        setField(term67032, term67032.getClass(), "jsType", null);
        setField(term67032, term67032.getClass(), "parent", null);
        setField(term67031, term67031.getClass(), "first", term67032);
        setField(term67031, term67031.getClass(), "last", null);
        setField(term67031, term67031.getClass(), "propListHead", null);
        setIntField(term67031, term67031.getClass(), "sourcePosition", 0);
        setField(term67031, term67031.getClass(), "jsType", null);
        setField(term67031, term67031.getClass(), "parent", null);
        term66964 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66974 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66964, term66964.getClass(), "functionName", null);
        setBooleanField(term66964, term66964.getClass(), "itsNeedsActivation", false);
        setIntField(term66964, term66964.getClass(), "itsFunctionType", 0);
        setBooleanField(term66964, term66964.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term66964, term66964.getClass(), "encodedSourceStart", 0);
        setIntField(term66964, term66964.getClass(), "encodedSourceEnd", 0);
        setField(term66964, term66964.getClass(), "sourceName", null);
        setIntField(term66964, term66964.getClass(), "baseLineno", 0);
        setIntField(term66964, term66964.getClass(), "endLineno", 0);
        setField(term66964, term66964.getClass(), "functions", null);
        setField(term66964, term66964.getClass(), "regexps", null);
        setField(term66964, term66964.getClass(), "itsVariables", null);
        setField(term66964, term66964.getClass(), "itsConst", null);
        setField(term66964, term66964.getClass(), "itsVariableNames", null);
        setIntField(term66964, term66964.getClass(), "varStart", 0);
        setField(term66964, term66964.getClass(), "compilerData", null);
        setIntField(term66964, term66964.getClass(), "type", 15);
        setField(term66964, term66964.getClass(), "next", null);
        setField(term66974, term66974.getClass(), "functionName", null);
        setBooleanField(term66974, term66974.getClass(), "itsNeedsActivation", false);
        setIntField(term66974, term66974.getClass(), "itsFunctionType", 0);
        setBooleanField(term66974, term66974.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term66974, term66974.getClass(), "encodedSourceStart", 0);
        setIntField(term66974, term66974.getClass(), "encodedSourceEnd", 0);
        setField(term66974, term66974.getClass(), "sourceName", null);
        setIntField(term66974, term66974.getClass(), "baseLineno", 0);
        setIntField(term66974, term66974.getClass(), "endLineno", 0);
        setField(term66974, term66974.getClass(), "functions", null);
        setField(term66974, term66974.getClass(), "regexps", null);
        setField(term66974, term66974.getClass(), "itsVariables", null);
        setField(term66974, term66974.getClass(), "itsConst", null);
        setField(term66974, term66974.getClass(), "itsVariableNames", null);
        setIntField(term66974, term66974.getClass(), "varStart", 0);
        setField(term66974, term66974.getClass(), "compilerData", null);
        setIntField(term66974, term66974.getClass(), "type", 0);
        setIntField(term66984, term66984.getClass(), "type", 0);
        setField(term66984, term66984.getClass(), "next", null);
        setField(term66984, term66984.getClass(), "first", null);
        setField(term66984, term66984.getClass(), "last", null);
        setField(term66984, term66984.getClass(), "propListHead", null);
        setIntField(term66984, term66984.getClass(), "sourcePosition", 0);
        setField(term66984, term66984.getClass(), "jsType", null);
        setField(term66984, term66984.getClass(), "parent", null);
        setField(term66974, term66974.getClass(), "next", term66984);
        setField(term66974, term66974.getClass(), "first", null);
        setField(term66974, term66974.getClass(), "last", null);
        setField(term66974, term66974.getClass(), "propListHead", null);
        setIntField(term66974, term66974.getClass(), "sourcePosition", 0);
        setField(term66974, term66974.getClass(), "jsType", null);
        setField(term66974, term66974.getClass(), "parent", null);
        setField(term66964, term66964.getClass(), "first", term66974);
        setField(term66964, term66964.getClass(), "last", null);
        setField(term66964, term66964.getClass(), "propListHead", null);
        setIntField(term66964, term66964.getClass(), "sourcePosition", 0);
        setField(term66964, term66964.getClass(), "jsType", null);
        setField(term66964, term66964.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term66234;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term66148, args);
        assertTrue(recursiveEquals(term66148, term67030));
        assertTrue(recursiveEquals(term66234, term67031));
        assertTrue(recursiveEquals(retValue, term66964));
    }

};


