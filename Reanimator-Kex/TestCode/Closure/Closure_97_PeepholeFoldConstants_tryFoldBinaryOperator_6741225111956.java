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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741934;
     Object term742020;
     Object term742282;
     Object term742283;
     Object term742214;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term741934 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term742020 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term742106 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term742198 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term742106, term742106.getClass(), "next", term742198);
        setIntField(term742106, term742106.getClass(), "type", 39);
        setField(term742020, term742020.getClass(), "first", term742106);
        setIntField(term742020, term742020.getClass(), "type", 11);
        term742282 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term742282, term742282.getClass(), "currentTraversal", null);
        term742283 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term742284 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term742285 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term742283, term742283.getClass(), "functionName", null);
        setBooleanField(term742283, term742283.getClass(), "itsNeedsActivation", false);
        setIntField(term742283, term742283.getClass(), "itsFunctionType", 0);
        setBooleanField(term742283, term742283.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term742283, term742283.getClass(), "encodedSourceStart", 0);
        setIntField(term742283, term742283.getClass(), "encodedSourceEnd", 0);
        setField(term742283, term742283.getClass(), "sourceName", null);
        setIntField(term742283, term742283.getClass(), "baseLineno", 0);
        setIntField(term742283, term742283.getClass(), "endLineno", 0);
        setField(term742283, term742283.getClass(), "functions", null);
        setField(term742283, term742283.getClass(), "regexps", null);
        setField(term742283, term742283.getClass(), "itsVariables", null);
        setField(term742283, term742283.getClass(), "itsConst", null);
        setField(term742283, term742283.getClass(), "itsVariableNames", null);
        setIntField(term742283, term742283.getClass(), "varStart", 0);
        setField(term742283, term742283.getClass(), "compilerData", null);
        setIntField(term742283, term742283.getClass(), "type", 11);
        setField(term742283, term742283.getClass(), "next", null);
        setField(term742284, term742284.getClass(), "functionName", null);
        setBooleanField(term742284, term742284.getClass(), "itsNeedsActivation", false);
        setIntField(term742284, term742284.getClass(), "itsFunctionType", 0);
        setBooleanField(term742284, term742284.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term742284, term742284.getClass(), "encodedSourceStart", 0);
        setIntField(term742284, term742284.getClass(), "encodedSourceEnd", 0);
        setField(term742284, term742284.getClass(), "sourceName", null);
        setIntField(term742284, term742284.getClass(), "baseLineno", 0);
        setIntField(term742284, term742284.getClass(), "endLineno", 0);
        setField(term742284, term742284.getClass(), "functions", null);
        setField(term742284, term742284.getClass(), "regexps", null);
        setField(term742284, term742284.getClass(), "itsVariables", null);
        setField(term742284, term742284.getClass(), "itsConst", null);
        setField(term742284, term742284.getClass(), "itsVariableNames", null);
        setIntField(term742284, term742284.getClass(), "varStart", 0);
        setField(term742284, term742284.getClass(), "compilerData", null);
        setIntField(term742284, term742284.getClass(), "type", 39);
        setDoubleField(term742285, term742285.getClass(), "number", 0.0);
        setIntField(term742285, term742285.getClass(), "type", 0);
        setField(term742285, term742285.getClass(), "next", null);
        setField(term742285, term742285.getClass(), "first", null);
        setField(term742285, term742285.getClass(), "last", null);
        setField(term742285, term742285.getClass(), "propListHead", null);
        setIntField(term742285, term742285.getClass(), "sourcePosition", 0);
        setField(term742285, term742285.getClass(), "jsType", null);
        setField(term742285, term742285.getClass(), "parent", null);
        setField(term742284, term742284.getClass(), "next", term742285);
        setField(term742284, term742284.getClass(), "first", null);
        setField(term742284, term742284.getClass(), "last", null);
        setField(term742284, term742284.getClass(), "propListHead", null);
        setIntField(term742284, term742284.getClass(), "sourcePosition", 0);
        setField(term742284, term742284.getClass(), "jsType", null);
        setField(term742284, term742284.getClass(), "parent", null);
        setField(term742283, term742283.getClass(), "first", term742284);
        setField(term742283, term742283.getClass(), "last", null);
        setField(term742283, term742283.getClass(), "propListHead", null);
        setIntField(term742283, term742283.getClass(), "sourcePosition", 0);
        setField(term742283, term742283.getClass(), "jsType", null);
        setField(term742283, term742283.getClass(), "parent", null);
        term742214 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term742224 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term742234 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term742214, term742214.getClass(), "functionName", null);
        setBooleanField(term742214, term742214.getClass(), "itsNeedsActivation", false);
        setIntField(term742214, term742214.getClass(), "itsFunctionType", 0);
        setBooleanField(term742214, term742214.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term742214, term742214.getClass(), "encodedSourceStart", 0);
        setIntField(term742214, term742214.getClass(), "encodedSourceEnd", 0);
        setField(term742214, term742214.getClass(), "sourceName", null);
        setIntField(term742214, term742214.getClass(), "baseLineno", 0);
        setIntField(term742214, term742214.getClass(), "endLineno", 0);
        setField(term742214, term742214.getClass(), "functions", null);
        setField(term742214, term742214.getClass(), "regexps", null);
        setField(term742214, term742214.getClass(), "itsVariables", null);
        setField(term742214, term742214.getClass(), "itsConst", null);
        setField(term742214, term742214.getClass(), "itsVariableNames", null);
        setIntField(term742214, term742214.getClass(), "varStart", 0);
        setField(term742214, term742214.getClass(), "compilerData", null);
        setIntField(term742214, term742214.getClass(), "type", 11);
        setField(term742214, term742214.getClass(), "next", null);
        setField(term742224, term742224.getClass(), "functionName", null);
        setBooleanField(term742224, term742224.getClass(), "itsNeedsActivation", false);
        setIntField(term742224, term742224.getClass(), "itsFunctionType", 0);
        setBooleanField(term742224, term742224.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term742224, term742224.getClass(), "encodedSourceStart", 0);
        setIntField(term742224, term742224.getClass(), "encodedSourceEnd", 0);
        setField(term742224, term742224.getClass(), "sourceName", null);
        setIntField(term742224, term742224.getClass(), "baseLineno", 0);
        setIntField(term742224, term742224.getClass(), "endLineno", 0);
        setField(term742224, term742224.getClass(), "functions", null);
        setField(term742224, term742224.getClass(), "regexps", null);
        setField(term742224, term742224.getClass(), "itsVariables", null);
        setField(term742224, term742224.getClass(), "itsConst", null);
        setField(term742224, term742224.getClass(), "itsVariableNames", null);
        setIntField(term742224, term742224.getClass(), "varStart", 0);
        setField(term742224, term742224.getClass(), "compilerData", null);
        setIntField(term742224, term742224.getClass(), "type", 39);
        setDoubleField(term742234, term742234.getClass(), "number", 0.0);
        setIntField(term742234, term742234.getClass(), "type", 0);
        setField(term742234, term742234.getClass(), "next", null);
        setField(term742234, term742234.getClass(), "first", null);
        setField(term742234, term742234.getClass(), "last", null);
        setField(term742234, term742234.getClass(), "propListHead", null);
        setIntField(term742234, term742234.getClass(), "sourcePosition", 0);
        setField(term742234, term742234.getClass(), "jsType", null);
        setField(term742234, term742234.getClass(), "parent", null);
        setField(term742224, term742224.getClass(), "next", term742234);
        setField(term742224, term742224.getClass(), "first", null);
        setField(term742224, term742224.getClass(), "last", null);
        setField(term742224, term742224.getClass(), "propListHead", null);
        setIntField(term742224, term742224.getClass(), "sourcePosition", 0);
        setField(term742224, term742224.getClass(), "jsType", null);
        setField(term742224, term742224.getClass(), "parent", null);
        setField(term742214, term742214.getClass(), "first", term742224);
        setField(term742214, term742214.getClass(), "last", null);
        setField(term742214, term742214.getClass(), "propListHead", null);
        setIntField(term742214, term742214.getClass(), "sourcePosition", 0);
        setField(term742214, term742214.getClass(), "jsType", null);
        setField(term742214, term742214.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term742020;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term741934, args);
        assertTrue(recursiveEquals(term741934, term742282));
        assertTrue(recursiveEquals(term742020, term742283));
        assertTrue(recursiveEquals(retValue, term742214));
    }

};


