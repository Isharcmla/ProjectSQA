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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328633;
     Object term328719;
     Object term329347;
     Object term329348;
     Object term329277;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328633 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term328719 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term328805 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term328897 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term328805, term328805.getClass(), "next", term328897);
        setIntField(term328805, term328805.getClass(), "type", 39);
        setField(term328719, term328719.getClass(), "first", term328805);
        setIntField(term328719, term328719.getClass(), "type", 9);
        term329347 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term329347, term329347.getClass(), "currentTraversal", null);
        term329348 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term329349 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term329350 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term329348, term329348.getClass(), "functionName", null);
        setBooleanField(term329348, term329348.getClass(), "itsNeedsActivation", false);
        setIntField(term329348, term329348.getClass(), "itsFunctionType", 0);
        setBooleanField(term329348, term329348.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term329348, term329348.getClass(), "encodedSourceStart", 0);
        setIntField(term329348, term329348.getClass(), "encodedSourceEnd", 0);
        setField(term329348, term329348.getClass(), "sourceName", null);
        setIntField(term329348, term329348.getClass(), "baseLineno", 0);
        setIntField(term329348, term329348.getClass(), "endLineno", 0);
        setField(term329348, term329348.getClass(), "functions", null);
        setField(term329348, term329348.getClass(), "regexps", null);
        setField(term329348, term329348.getClass(), "itsVariables", null);
        setField(term329348, term329348.getClass(), "itsConst", null);
        setField(term329348, term329348.getClass(), "itsVariableNames", null);
        setIntField(term329348, term329348.getClass(), "varStart", 0);
        setField(term329348, term329348.getClass(), "compilerData", null);
        setIntField(term329348, term329348.getClass(), "type", 9);
        setField(term329348, term329348.getClass(), "next", null);
        setField(term329349, term329349.getClass(), "functionName", null);
        setBooleanField(term329349, term329349.getClass(), "itsNeedsActivation", false);
        setIntField(term329349, term329349.getClass(), "itsFunctionType", 0);
        setBooleanField(term329349, term329349.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term329349, term329349.getClass(), "encodedSourceStart", 0);
        setIntField(term329349, term329349.getClass(), "encodedSourceEnd", 0);
        setField(term329349, term329349.getClass(), "sourceName", null);
        setIntField(term329349, term329349.getClass(), "baseLineno", 0);
        setIntField(term329349, term329349.getClass(), "endLineno", 0);
        setField(term329349, term329349.getClass(), "functions", null);
        setField(term329349, term329349.getClass(), "regexps", null);
        setField(term329349, term329349.getClass(), "itsVariables", null);
        setField(term329349, term329349.getClass(), "itsConst", null);
        setField(term329349, term329349.getClass(), "itsVariableNames", null);
        setIntField(term329349, term329349.getClass(), "varStart", 0);
        setField(term329349, term329349.getClass(), "compilerData", null);
        setIntField(term329349, term329349.getClass(), "type", 39);
        setDoubleField(term329350, term329350.getClass(), "number", 0.0);
        setIntField(term329350, term329350.getClass(), "type", 0);
        setField(term329350, term329350.getClass(), "next", null);
        setField(term329350, term329350.getClass(), "first", null);
        setField(term329350, term329350.getClass(), "last", null);
        setField(term329350, term329350.getClass(), "propListHead", null);
        setIntField(term329350, term329350.getClass(), "sourcePosition", 0);
        setField(term329350, term329350.getClass(), "jsType", null);
        setField(term329350, term329350.getClass(), "parent", null);
        setField(term329349, term329349.getClass(), "next", term329350);
        setField(term329349, term329349.getClass(), "first", null);
        setField(term329349, term329349.getClass(), "last", null);
        setField(term329349, term329349.getClass(), "propListHead", null);
        setIntField(term329349, term329349.getClass(), "sourcePosition", 0);
        setField(term329349, term329349.getClass(), "jsType", null);
        setField(term329349, term329349.getClass(), "parent", null);
        setField(term329348, term329348.getClass(), "first", term329349);
        setField(term329348, term329348.getClass(), "last", null);
        setField(term329348, term329348.getClass(), "propListHead", null);
        setIntField(term329348, term329348.getClass(), "sourcePosition", 0);
        setField(term329348, term329348.getClass(), "jsType", null);
        setField(term329348, term329348.getClass(), "parent", null);
        term329277 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term329287 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term329297 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term329277, term329277.getClass(), "functionName", null);
        setBooleanField(term329277, term329277.getClass(), "itsNeedsActivation", false);
        setIntField(term329277, term329277.getClass(), "itsFunctionType", 0);
        setBooleanField(term329277, term329277.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term329277, term329277.getClass(), "encodedSourceStart", 0);
        setIntField(term329277, term329277.getClass(), "encodedSourceEnd", 0);
        setField(term329277, term329277.getClass(), "sourceName", null);
        setIntField(term329277, term329277.getClass(), "baseLineno", 0);
        setIntField(term329277, term329277.getClass(), "endLineno", 0);
        setField(term329277, term329277.getClass(), "functions", null);
        setField(term329277, term329277.getClass(), "regexps", null);
        setField(term329277, term329277.getClass(), "itsVariables", null);
        setField(term329277, term329277.getClass(), "itsConst", null);
        setField(term329277, term329277.getClass(), "itsVariableNames", null);
        setIntField(term329277, term329277.getClass(), "varStart", 0);
        setField(term329277, term329277.getClass(), "compilerData", null);
        setIntField(term329277, term329277.getClass(), "type", 9);
        setField(term329277, term329277.getClass(), "next", null);
        setField(term329287, term329287.getClass(), "functionName", null);
        setBooleanField(term329287, term329287.getClass(), "itsNeedsActivation", false);
        setIntField(term329287, term329287.getClass(), "itsFunctionType", 0);
        setBooleanField(term329287, term329287.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term329287, term329287.getClass(), "encodedSourceStart", 0);
        setIntField(term329287, term329287.getClass(), "encodedSourceEnd", 0);
        setField(term329287, term329287.getClass(), "sourceName", null);
        setIntField(term329287, term329287.getClass(), "baseLineno", 0);
        setIntField(term329287, term329287.getClass(), "endLineno", 0);
        setField(term329287, term329287.getClass(), "functions", null);
        setField(term329287, term329287.getClass(), "regexps", null);
        setField(term329287, term329287.getClass(), "itsVariables", null);
        setField(term329287, term329287.getClass(), "itsConst", null);
        setField(term329287, term329287.getClass(), "itsVariableNames", null);
        setIntField(term329287, term329287.getClass(), "varStart", 0);
        setField(term329287, term329287.getClass(), "compilerData", null);
        setIntField(term329287, term329287.getClass(), "type", 39);
        setDoubleField(term329297, term329297.getClass(), "number", 0.0);
        setIntField(term329297, term329297.getClass(), "type", 0);
        setField(term329297, term329297.getClass(), "next", null);
        setField(term329297, term329297.getClass(), "first", null);
        setField(term329297, term329297.getClass(), "last", null);
        setField(term329297, term329297.getClass(), "propListHead", null);
        setIntField(term329297, term329297.getClass(), "sourcePosition", 0);
        setField(term329297, term329297.getClass(), "jsType", null);
        setField(term329297, term329297.getClass(), "parent", null);
        setField(term329287, term329287.getClass(), "next", term329297);
        setField(term329287, term329287.getClass(), "first", null);
        setField(term329287, term329287.getClass(), "last", null);
        setField(term329287, term329287.getClass(), "propListHead", null);
        setIntField(term329287, term329287.getClass(), "sourcePosition", 0);
        setField(term329287, term329287.getClass(), "jsType", null);
        setField(term329287, term329287.getClass(), "parent", null);
        setField(term329277, term329277.getClass(), "first", term329287);
        setField(term329277, term329277.getClass(), "last", null);
        setField(term329277, term329277.getClass(), "propListHead", null);
        setIntField(term329277, term329277.getClass(), "sourcePosition", 0);
        setField(term329277, term329277.getClass(), "jsType", null);
        setField(term329277, term329277.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term328719;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term328633, args);
        assertTrue(recursiveEquals(term328633, term329347));
        assertTrue(recursiveEquals(term328719, term329348));
        assertTrue(recursiveEquals(retValue, term329277));
    }

};


