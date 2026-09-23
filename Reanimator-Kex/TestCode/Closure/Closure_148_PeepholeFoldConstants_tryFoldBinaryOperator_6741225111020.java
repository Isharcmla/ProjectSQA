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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238940;
     Object term239026;
     Object term239288;
     Object term239289;
     Object term239220;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238940 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term239026 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term239112 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term239204 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term239112, term239112.getClass(), "next", term239204);
        setIntField(term239112, term239112.getClass(), "type", 63);
        setField(term239026, term239026.getClass(), "first", term239112);
        setIntField(term239026, term239026.getClass(), "type", 35);
        term239288 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term239288, term239288.getClass(), "currentTraversal", null);
        term239289 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term239290 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term239291 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term239289, term239289.getClass(), "functionName", null);
        setBooleanField(term239289, term239289.getClass(), "itsNeedsActivation", false);
        setIntField(term239289, term239289.getClass(), "itsFunctionType", 0);
        setBooleanField(term239289, term239289.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term239289, term239289.getClass(), "encodedSourceStart", 0);
        setIntField(term239289, term239289.getClass(), "encodedSourceEnd", 0);
        setField(term239289, term239289.getClass(), "sourceName", null);
        setIntField(term239289, term239289.getClass(), "baseLineno", 0);
        setIntField(term239289, term239289.getClass(), "endLineno", 0);
        setField(term239289, term239289.getClass(), "functions", null);
        setField(term239289, term239289.getClass(), "regexps", null);
        setField(term239289, term239289.getClass(), "itsVariables", null);
        setField(term239289, term239289.getClass(), "itsConst", null);
        setField(term239289, term239289.getClass(), "itsVariableNames", null);
        setIntField(term239289, term239289.getClass(), "varStart", 0);
        setField(term239289, term239289.getClass(), "compilerData", null);
        setIntField(term239289, term239289.getClass(), "type", 35);
        setField(term239289, term239289.getClass(), "next", null);
        setField(term239290, term239290.getClass(), "functionName", null);
        setBooleanField(term239290, term239290.getClass(), "itsNeedsActivation", false);
        setIntField(term239290, term239290.getClass(), "itsFunctionType", 0);
        setBooleanField(term239290, term239290.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term239290, term239290.getClass(), "encodedSourceStart", 0);
        setIntField(term239290, term239290.getClass(), "encodedSourceEnd", 0);
        setField(term239290, term239290.getClass(), "sourceName", null);
        setIntField(term239290, term239290.getClass(), "baseLineno", 0);
        setIntField(term239290, term239290.getClass(), "endLineno", 0);
        setField(term239290, term239290.getClass(), "functions", null);
        setField(term239290, term239290.getClass(), "regexps", null);
        setField(term239290, term239290.getClass(), "itsVariables", null);
        setField(term239290, term239290.getClass(), "itsConst", null);
        setField(term239290, term239290.getClass(), "itsVariableNames", null);
        setIntField(term239290, term239290.getClass(), "varStart", 0);
        setField(term239290, term239290.getClass(), "compilerData", null);
        setIntField(term239290, term239290.getClass(), "type", 63);
        setDoubleField(term239291, term239291.getClass(), "number", 0.0);
        setIntField(term239291, term239291.getClass(), "type", 0);
        setField(term239291, term239291.getClass(), "next", null);
        setField(term239291, term239291.getClass(), "first", null);
        setField(term239291, term239291.getClass(), "last", null);
        setField(term239291, term239291.getClass(), "propListHead", null);
        setIntField(term239291, term239291.getClass(), "sourcePosition", 0);
        setField(term239291, term239291.getClass(), "jsType", null);
        setField(term239291, term239291.getClass(), "parent", null);
        setField(term239290, term239290.getClass(), "next", term239291);
        setField(term239290, term239290.getClass(), "first", null);
        setField(term239290, term239290.getClass(), "last", null);
        setField(term239290, term239290.getClass(), "propListHead", null);
        setIntField(term239290, term239290.getClass(), "sourcePosition", 0);
        setField(term239290, term239290.getClass(), "jsType", null);
        setField(term239290, term239290.getClass(), "parent", null);
        setField(term239289, term239289.getClass(), "first", term239290);
        setField(term239289, term239289.getClass(), "last", null);
        setField(term239289, term239289.getClass(), "propListHead", null);
        setIntField(term239289, term239289.getClass(), "sourcePosition", 0);
        setField(term239289, term239289.getClass(), "jsType", null);
        setField(term239289, term239289.getClass(), "parent", null);
        term239220 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term239230 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term239240 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term239220, term239220.getClass(), "functionName", null);
        setBooleanField(term239220, term239220.getClass(), "itsNeedsActivation", false);
        setIntField(term239220, term239220.getClass(), "itsFunctionType", 0);
        setBooleanField(term239220, term239220.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term239220, term239220.getClass(), "encodedSourceStart", 0);
        setIntField(term239220, term239220.getClass(), "encodedSourceEnd", 0);
        setField(term239220, term239220.getClass(), "sourceName", null);
        setIntField(term239220, term239220.getClass(), "baseLineno", 0);
        setIntField(term239220, term239220.getClass(), "endLineno", 0);
        setField(term239220, term239220.getClass(), "functions", null);
        setField(term239220, term239220.getClass(), "regexps", null);
        setField(term239220, term239220.getClass(), "itsVariables", null);
        setField(term239220, term239220.getClass(), "itsConst", null);
        setField(term239220, term239220.getClass(), "itsVariableNames", null);
        setIntField(term239220, term239220.getClass(), "varStart", 0);
        setField(term239220, term239220.getClass(), "compilerData", null);
        setIntField(term239220, term239220.getClass(), "type", 35);
        setField(term239220, term239220.getClass(), "next", null);
        setField(term239230, term239230.getClass(), "functionName", null);
        setBooleanField(term239230, term239230.getClass(), "itsNeedsActivation", false);
        setIntField(term239230, term239230.getClass(), "itsFunctionType", 0);
        setBooleanField(term239230, term239230.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term239230, term239230.getClass(), "encodedSourceStart", 0);
        setIntField(term239230, term239230.getClass(), "encodedSourceEnd", 0);
        setField(term239230, term239230.getClass(), "sourceName", null);
        setIntField(term239230, term239230.getClass(), "baseLineno", 0);
        setIntField(term239230, term239230.getClass(), "endLineno", 0);
        setField(term239230, term239230.getClass(), "functions", null);
        setField(term239230, term239230.getClass(), "regexps", null);
        setField(term239230, term239230.getClass(), "itsVariables", null);
        setField(term239230, term239230.getClass(), "itsConst", null);
        setField(term239230, term239230.getClass(), "itsVariableNames", null);
        setIntField(term239230, term239230.getClass(), "varStart", 0);
        setField(term239230, term239230.getClass(), "compilerData", null);
        setIntField(term239230, term239230.getClass(), "type", 63);
        setDoubleField(term239240, term239240.getClass(), "number", 0.0);
        setIntField(term239240, term239240.getClass(), "type", 0);
        setField(term239240, term239240.getClass(), "next", null);
        setField(term239240, term239240.getClass(), "first", null);
        setField(term239240, term239240.getClass(), "last", null);
        setField(term239240, term239240.getClass(), "propListHead", null);
        setIntField(term239240, term239240.getClass(), "sourcePosition", 0);
        setField(term239240, term239240.getClass(), "jsType", null);
        setField(term239240, term239240.getClass(), "parent", null);
        setField(term239230, term239230.getClass(), "next", term239240);
        setField(term239230, term239230.getClass(), "first", null);
        setField(term239230, term239230.getClass(), "last", null);
        setField(term239230, term239230.getClass(), "propListHead", null);
        setIntField(term239230, term239230.getClass(), "sourcePosition", 0);
        setField(term239230, term239230.getClass(), "jsType", null);
        setField(term239230, term239230.getClass(), "parent", null);
        setField(term239220, term239220.getClass(), "first", term239230);
        setField(term239220, term239220.getClass(), "last", null);
        setField(term239220, term239220.getClass(), "propListHead", null);
        setIntField(term239220, term239220.getClass(), "sourcePosition", 0);
        setField(term239220, term239220.getClass(), "jsType", null);
        setField(term239220, term239220.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term239026;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term238940, args);
        assertTrue(recursiveEquals(term238940, term239288));
        assertTrue(recursiveEquals(term239026, term239289));
        assertTrue(recursiveEquals(retValue, term239220));
    }

};


