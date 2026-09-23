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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421731;
     Object term421821;
     Object term422069;
     Object term422070;
     Object term422014;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term421731 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term421821 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term421907 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term421999 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term421907, term421907.getClass(), "next", term421999);
        setIntField(term421907, term421907.getClass(), "type", 39);
        setField(term421821, term421821.getClass(), "first", term421907);
        setIntField(term421821, term421821.getClass(), "type", 22);
        term422069 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term422069, term422069.getClass(), "currentTraversal", null);
        term422070 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term422071 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term422072 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term422070, term422070.getClass(), "encodedSourceStart", 0);
        setIntField(term422070, term422070.getClass(), "encodedSourceEnd", 0);
        setField(term422070, term422070.getClass(), "sourceName", null);
        setIntField(term422070, term422070.getClass(), "baseLineno", 0);
        setIntField(term422070, term422070.getClass(), "endLineno", 0);
        setField(term422070, term422070.getClass(), "functions", null);
        setField(term422070, term422070.getClass(), "regexps", null);
        setField(term422070, term422070.getClass(), "itsVariables", null);
        setField(term422070, term422070.getClass(), "itsConst", null);
        setField(term422070, term422070.getClass(), "itsVariableNames", null);
        setIntField(term422070, term422070.getClass(), "varStart", 0);
        setField(term422070, term422070.getClass(), "compilerData", null);
        setIntField(term422070, term422070.getClass(), "type", 22);
        setField(term422070, term422070.getClass(), "next", null);
        setField(term422071, term422071.getClass(), "functionName", null);
        setBooleanField(term422071, term422071.getClass(), "itsNeedsActivation", false);
        setIntField(term422071, term422071.getClass(), "itsFunctionType", 0);
        setBooleanField(term422071, term422071.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term422071, term422071.getClass(), "encodedSourceStart", 0);
        setIntField(term422071, term422071.getClass(), "encodedSourceEnd", 0);
        setField(term422071, term422071.getClass(), "sourceName", null);
        setIntField(term422071, term422071.getClass(), "baseLineno", 0);
        setIntField(term422071, term422071.getClass(), "endLineno", 0);
        setField(term422071, term422071.getClass(), "functions", null);
        setField(term422071, term422071.getClass(), "regexps", null);
        setField(term422071, term422071.getClass(), "itsVariables", null);
        setField(term422071, term422071.getClass(), "itsConst", null);
        setField(term422071, term422071.getClass(), "itsVariableNames", null);
        setIntField(term422071, term422071.getClass(), "varStart", 0);
        setField(term422071, term422071.getClass(), "compilerData", null);
        setIntField(term422071, term422071.getClass(), "type", 39);
        setField(term422072, term422072.getClass(), "str", null);
        setIntField(term422072, term422072.getClass(), "type", 0);
        setField(term422072, term422072.getClass(), "next", null);
        setField(term422072, term422072.getClass(), "first", null);
        setField(term422072, term422072.getClass(), "last", null);
        setField(term422072, term422072.getClass(), "propListHead", null);
        setIntField(term422072, term422072.getClass(), "sourcePosition", 0);
        setField(term422072, term422072.getClass(), "jsType", null);
        setField(term422072, term422072.getClass(), "parent", null);
        setField(term422071, term422071.getClass(), "next", term422072);
        setField(term422071, term422071.getClass(), "first", null);
        setField(term422071, term422071.getClass(), "last", null);
        setField(term422071, term422071.getClass(), "propListHead", null);
        setIntField(term422071, term422071.getClass(), "sourcePosition", 0);
        setField(term422071, term422071.getClass(), "jsType", null);
        setField(term422071, term422071.getClass(), "parent", null);
        setField(term422070, term422070.getClass(), "first", term422071);
        setField(term422070, term422070.getClass(), "last", null);
        setField(term422070, term422070.getClass(), "propListHead", null);
        setIntField(term422070, term422070.getClass(), "sourcePosition", 0);
        setField(term422070, term422070.getClass(), "jsType", null);
        setField(term422070, term422070.getClass(), "parent", null);
        term422014 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term422021 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term422031 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term422014, term422014.getClass(), "encodedSourceStart", 0);
        setIntField(term422014, term422014.getClass(), "encodedSourceEnd", 0);
        setField(term422014, term422014.getClass(), "sourceName", null);
        setIntField(term422014, term422014.getClass(), "baseLineno", 0);
        setIntField(term422014, term422014.getClass(), "endLineno", 0);
        setField(term422014, term422014.getClass(), "functions", null);
        setField(term422014, term422014.getClass(), "regexps", null);
        setField(term422014, term422014.getClass(), "itsVariables", null);
        setField(term422014, term422014.getClass(), "itsConst", null);
        setField(term422014, term422014.getClass(), "itsVariableNames", null);
        setIntField(term422014, term422014.getClass(), "varStart", 0);
        setField(term422014, term422014.getClass(), "compilerData", null);
        setIntField(term422014, term422014.getClass(), "type", 22);
        setField(term422014, term422014.getClass(), "next", null);
        setField(term422021, term422021.getClass(), "functionName", null);
        setBooleanField(term422021, term422021.getClass(), "itsNeedsActivation", false);
        setIntField(term422021, term422021.getClass(), "itsFunctionType", 0);
        setBooleanField(term422021, term422021.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term422021, term422021.getClass(), "encodedSourceStart", 0);
        setIntField(term422021, term422021.getClass(), "encodedSourceEnd", 0);
        setField(term422021, term422021.getClass(), "sourceName", null);
        setIntField(term422021, term422021.getClass(), "baseLineno", 0);
        setIntField(term422021, term422021.getClass(), "endLineno", 0);
        setField(term422021, term422021.getClass(), "functions", null);
        setField(term422021, term422021.getClass(), "regexps", null);
        setField(term422021, term422021.getClass(), "itsVariables", null);
        setField(term422021, term422021.getClass(), "itsConst", null);
        setField(term422021, term422021.getClass(), "itsVariableNames", null);
        setIntField(term422021, term422021.getClass(), "varStart", 0);
        setField(term422021, term422021.getClass(), "compilerData", null);
        setIntField(term422021, term422021.getClass(), "type", 39);
        setField(term422031, term422031.getClass(), "str", null);
        setIntField(term422031, term422031.getClass(), "type", 0);
        setField(term422031, term422031.getClass(), "next", null);
        setField(term422031, term422031.getClass(), "first", null);
        setField(term422031, term422031.getClass(), "last", null);
        setField(term422031, term422031.getClass(), "propListHead", null);
        setIntField(term422031, term422031.getClass(), "sourcePosition", 0);
        setField(term422031, term422031.getClass(), "jsType", null);
        setField(term422031, term422031.getClass(), "parent", null);
        setField(term422021, term422021.getClass(), "next", term422031);
        setField(term422021, term422021.getClass(), "first", null);
        setField(term422021, term422021.getClass(), "last", null);
        setField(term422021, term422021.getClass(), "propListHead", null);
        setIntField(term422021, term422021.getClass(), "sourcePosition", 0);
        setField(term422021, term422021.getClass(), "jsType", null);
        setField(term422021, term422021.getClass(), "parent", null);
        setField(term422014, term422014.getClass(), "first", term422021);
        setField(term422014, term422014.getClass(), "last", null);
        setField(term422014, term422014.getClass(), "propListHead", null);
        setIntField(term422014, term422014.getClass(), "sourcePosition", 0);
        setField(term422014, term422014.getClass(), "jsType", null);
        setField(term422014, term422014.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term421821;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term421731, args);
        assertTrue(recursiveEquals(term421731, term422069));
        assertTrue(recursiveEquals(term421821, term422070));
        assertTrue(recursiveEquals(retValue, term422014));
    }

};


