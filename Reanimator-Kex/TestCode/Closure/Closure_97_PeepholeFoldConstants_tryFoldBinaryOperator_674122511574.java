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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150853;
     Object term150939;
     Object term151207;
     Object term151208;
     Object term151139;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150853 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term150939 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term151025 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term151117 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term151025, term151025.getClass(), "next", term151117);
        setIntField(term151025, term151025.getClass(), "type", 39);
        setField(term150939, term150939.getClass(), "first", term151025);
        setIntField(term150939, term150939.getClass(), "type", 11);
        term151207 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term151207, term151207.getClass(), "currentTraversal", null);
        term151208 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term151209 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term151210 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term151208, term151208.getClass(), "functionName", null);
        setBooleanField(term151208, term151208.getClass(), "itsNeedsActivation", false);
        setIntField(term151208, term151208.getClass(), "itsFunctionType", 0);
        setBooleanField(term151208, term151208.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term151208, term151208.getClass(), "encodedSourceStart", 0);
        setIntField(term151208, term151208.getClass(), "encodedSourceEnd", 0);
        setField(term151208, term151208.getClass(), "sourceName", null);
        setIntField(term151208, term151208.getClass(), "baseLineno", 0);
        setIntField(term151208, term151208.getClass(), "endLineno", 0);
        setField(term151208, term151208.getClass(), "functions", null);
        setField(term151208, term151208.getClass(), "regexps", null);
        setField(term151208, term151208.getClass(), "itsVariables", null);
        setField(term151208, term151208.getClass(), "itsConst", null);
        setField(term151208, term151208.getClass(), "itsVariableNames", null);
        setIntField(term151208, term151208.getClass(), "varStart", 0);
        setField(term151208, term151208.getClass(), "compilerData", null);
        setIntField(term151208, term151208.getClass(), "type", 11);
        setField(term151208, term151208.getClass(), "next", null);
        setField(term151209, term151209.getClass(), "functionName", null);
        setBooleanField(term151209, term151209.getClass(), "itsNeedsActivation", false);
        setIntField(term151209, term151209.getClass(), "itsFunctionType", 0);
        setBooleanField(term151209, term151209.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term151209, term151209.getClass(), "encodedSourceStart", 0);
        setIntField(term151209, term151209.getClass(), "encodedSourceEnd", 0);
        setField(term151209, term151209.getClass(), "sourceName", null);
        setIntField(term151209, term151209.getClass(), "baseLineno", 0);
        setIntField(term151209, term151209.getClass(), "endLineno", 0);
        setField(term151209, term151209.getClass(), "functions", null);
        setField(term151209, term151209.getClass(), "regexps", null);
        setField(term151209, term151209.getClass(), "itsVariables", null);
        setField(term151209, term151209.getClass(), "itsConst", null);
        setField(term151209, term151209.getClass(), "itsVariableNames", null);
        setIntField(term151209, term151209.getClass(), "varStart", 0);
        setField(term151209, term151209.getClass(), "compilerData", null);
        setIntField(term151209, term151209.getClass(), "type", 39);
        setDoubleField(term151210, term151210.getClass(), "number", 0.0);
        setIntField(term151210, term151210.getClass(), "type", 0);
        setField(term151210, term151210.getClass(), "next", null);
        setField(term151210, term151210.getClass(), "first", null);
        setField(term151210, term151210.getClass(), "last", null);
        setField(term151210, term151210.getClass(), "propListHead", null);
        setIntField(term151210, term151210.getClass(), "sourcePosition", 0);
        setField(term151210, term151210.getClass(), "jsType", null);
        setField(term151210, term151210.getClass(), "parent", null);
        setField(term151209, term151209.getClass(), "next", term151210);
        setField(term151209, term151209.getClass(), "first", null);
        setField(term151209, term151209.getClass(), "last", null);
        setField(term151209, term151209.getClass(), "propListHead", null);
        setIntField(term151209, term151209.getClass(), "sourcePosition", 0);
        setField(term151209, term151209.getClass(), "jsType", null);
        setField(term151209, term151209.getClass(), "parent", null);
        setField(term151208, term151208.getClass(), "first", term151209);
        setField(term151208, term151208.getClass(), "last", null);
        setField(term151208, term151208.getClass(), "propListHead", null);
        setIntField(term151208, term151208.getClass(), "sourcePosition", 0);
        setField(term151208, term151208.getClass(), "jsType", null);
        setField(term151208, term151208.getClass(), "parent", null);
        term151139 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term151149 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term151159 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term151139, term151139.getClass(), "functionName", null);
        setBooleanField(term151139, term151139.getClass(), "itsNeedsActivation", false);
        setIntField(term151139, term151139.getClass(), "itsFunctionType", 0);
        setBooleanField(term151139, term151139.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term151139, term151139.getClass(), "encodedSourceStart", 0);
        setIntField(term151139, term151139.getClass(), "encodedSourceEnd", 0);
        setField(term151139, term151139.getClass(), "sourceName", null);
        setIntField(term151139, term151139.getClass(), "baseLineno", 0);
        setIntField(term151139, term151139.getClass(), "endLineno", 0);
        setField(term151139, term151139.getClass(), "functions", null);
        setField(term151139, term151139.getClass(), "regexps", null);
        setField(term151139, term151139.getClass(), "itsVariables", null);
        setField(term151139, term151139.getClass(), "itsConst", null);
        setField(term151139, term151139.getClass(), "itsVariableNames", null);
        setIntField(term151139, term151139.getClass(), "varStart", 0);
        setField(term151139, term151139.getClass(), "compilerData", null);
        setIntField(term151139, term151139.getClass(), "type", 11);
        setField(term151139, term151139.getClass(), "next", null);
        setField(term151149, term151149.getClass(), "functionName", null);
        setBooleanField(term151149, term151149.getClass(), "itsNeedsActivation", false);
        setIntField(term151149, term151149.getClass(), "itsFunctionType", 0);
        setBooleanField(term151149, term151149.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term151149, term151149.getClass(), "encodedSourceStart", 0);
        setIntField(term151149, term151149.getClass(), "encodedSourceEnd", 0);
        setField(term151149, term151149.getClass(), "sourceName", null);
        setIntField(term151149, term151149.getClass(), "baseLineno", 0);
        setIntField(term151149, term151149.getClass(), "endLineno", 0);
        setField(term151149, term151149.getClass(), "functions", null);
        setField(term151149, term151149.getClass(), "regexps", null);
        setField(term151149, term151149.getClass(), "itsVariables", null);
        setField(term151149, term151149.getClass(), "itsConst", null);
        setField(term151149, term151149.getClass(), "itsVariableNames", null);
        setIntField(term151149, term151149.getClass(), "varStart", 0);
        setField(term151149, term151149.getClass(), "compilerData", null);
        setIntField(term151149, term151149.getClass(), "type", 39);
        setDoubleField(term151159, term151159.getClass(), "number", 0.0);
        setIntField(term151159, term151159.getClass(), "type", 0);
        setField(term151159, term151159.getClass(), "next", null);
        setField(term151159, term151159.getClass(), "first", null);
        setField(term151159, term151159.getClass(), "last", null);
        setField(term151159, term151159.getClass(), "propListHead", null);
        setIntField(term151159, term151159.getClass(), "sourcePosition", 0);
        setField(term151159, term151159.getClass(), "jsType", null);
        setField(term151159, term151159.getClass(), "parent", null);
        setField(term151149, term151149.getClass(), "next", term151159);
        setField(term151149, term151149.getClass(), "first", null);
        setField(term151149, term151149.getClass(), "last", null);
        setField(term151149, term151149.getClass(), "propListHead", null);
        setIntField(term151149, term151149.getClass(), "sourcePosition", 0);
        setField(term151149, term151149.getClass(), "jsType", null);
        setField(term151149, term151149.getClass(), "parent", null);
        setField(term151139, term151139.getClass(), "first", term151149);
        setField(term151139, term151139.getClass(), "last", null);
        setField(term151139, term151139.getClass(), "propListHead", null);
        setIntField(term151139, term151139.getClass(), "sourcePosition", 0);
        setField(term151139, term151139.getClass(), "jsType", null);
        setField(term151139, term151139.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term150939;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term150853, args);
        assertTrue(recursiveEquals(term150853, term151207));
        assertTrue(recursiveEquals(term150939, term151208));
        assertTrue(recursiveEquals(retValue, term151139));
    }

};


