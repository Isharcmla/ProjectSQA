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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135236;
     Object term135322;
     Object term136268;
     Object term136269;
     Object term136192;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135236 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term135322 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term135408 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term135500 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term135500, term135500.getClass(), "type", 42);
        setField(term135408, term135408.getClass(), "next", term135500);
        setIntField(term135408, term135408.getClass(), "type", 42);
        setField(term135322, term135322.getClass(), "first", term135408);
        setIntField(term135322, term135322.getClass(), "type", 16);
        term136268 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term136268, term136268.getClass(), "currentTraversal", null);
        term136269 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term136270 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term136271 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term136269, term136269.getClass(), "functionName", null);
        setBooleanField(term136269, term136269.getClass(), "itsNeedsActivation", false);
        setIntField(term136269, term136269.getClass(), "itsFunctionType", 0);
        setBooleanField(term136269, term136269.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term136269, term136269.getClass(), "encodedSourceStart", 0);
        setIntField(term136269, term136269.getClass(), "encodedSourceEnd", 0);
        setField(term136269, term136269.getClass(), "sourceName", null);
        setIntField(term136269, term136269.getClass(), "baseLineno", 0);
        setIntField(term136269, term136269.getClass(), "endLineno", 0);
        setField(term136269, term136269.getClass(), "functions", null);
        setField(term136269, term136269.getClass(), "regexps", null);
        setField(term136269, term136269.getClass(), "itsVariables", null);
        setField(term136269, term136269.getClass(), "itsConst", null);
        setField(term136269, term136269.getClass(), "itsVariableNames", null);
        setIntField(term136269, term136269.getClass(), "varStart", 0);
        setField(term136269, term136269.getClass(), "compilerData", null);
        setIntField(term136269, term136269.getClass(), "type", 16);
        setField(term136269, term136269.getClass(), "next", null);
        setField(term136270, term136270.getClass(), "functionName", null);
        setBooleanField(term136270, term136270.getClass(), "itsNeedsActivation", false);
        setIntField(term136270, term136270.getClass(), "itsFunctionType", 0);
        setBooleanField(term136270, term136270.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term136270, term136270.getClass(), "encodedSourceStart", 0);
        setIntField(term136270, term136270.getClass(), "encodedSourceEnd", 0);
        setField(term136270, term136270.getClass(), "sourceName", null);
        setIntField(term136270, term136270.getClass(), "baseLineno", 0);
        setIntField(term136270, term136270.getClass(), "endLineno", 0);
        setField(term136270, term136270.getClass(), "functions", null);
        setField(term136270, term136270.getClass(), "regexps", null);
        setField(term136270, term136270.getClass(), "itsVariables", null);
        setField(term136270, term136270.getClass(), "itsConst", null);
        setField(term136270, term136270.getClass(), "itsVariableNames", null);
        setIntField(term136270, term136270.getClass(), "varStart", 0);
        setField(term136270, term136270.getClass(), "compilerData", null);
        setIntField(term136270, term136270.getClass(), "type", 42);
        setField(term136271, term136271.getClass(), "str", null);
        setIntField(term136271, term136271.getClass(), "type", 42);
        setField(term136271, term136271.getClass(), "next", null);
        setField(term136271, term136271.getClass(), "first", null);
        setField(term136271, term136271.getClass(), "last", null);
        setField(term136271, term136271.getClass(), "propListHead", null);
        setIntField(term136271, term136271.getClass(), "sourcePosition", 0);
        setField(term136271, term136271.getClass(), "jsType", null);
        setField(term136271, term136271.getClass(), "parent", null);
        setField(term136270, term136270.getClass(), "next", term136271);
        setField(term136270, term136270.getClass(), "first", null);
        setField(term136270, term136270.getClass(), "last", null);
        setField(term136270, term136270.getClass(), "propListHead", null);
        setIntField(term136270, term136270.getClass(), "sourcePosition", 0);
        setField(term136270, term136270.getClass(), "jsType", null);
        setField(term136270, term136270.getClass(), "parent", null);
        setField(term136269, term136269.getClass(), "first", term136270);
        setField(term136269, term136269.getClass(), "last", null);
        setField(term136269, term136269.getClass(), "propListHead", null);
        setIntField(term136269, term136269.getClass(), "sourcePosition", 0);
        setField(term136269, term136269.getClass(), "jsType", null);
        setField(term136269, term136269.getClass(), "parent", null);
        term136192 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term136202 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term136212 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term136192, term136192.getClass(), "functionName", null);
        setBooleanField(term136192, term136192.getClass(), "itsNeedsActivation", false);
        setIntField(term136192, term136192.getClass(), "itsFunctionType", 0);
        setBooleanField(term136192, term136192.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term136192, term136192.getClass(), "encodedSourceStart", 0);
        setIntField(term136192, term136192.getClass(), "encodedSourceEnd", 0);
        setField(term136192, term136192.getClass(), "sourceName", null);
        setIntField(term136192, term136192.getClass(), "baseLineno", 0);
        setIntField(term136192, term136192.getClass(), "endLineno", 0);
        setField(term136192, term136192.getClass(), "functions", null);
        setField(term136192, term136192.getClass(), "regexps", null);
        setField(term136192, term136192.getClass(), "itsVariables", null);
        setField(term136192, term136192.getClass(), "itsConst", null);
        setField(term136192, term136192.getClass(), "itsVariableNames", null);
        setIntField(term136192, term136192.getClass(), "varStart", 0);
        setField(term136192, term136192.getClass(), "compilerData", null);
        setIntField(term136192, term136192.getClass(), "type", 16);
        setField(term136192, term136192.getClass(), "next", null);
        setField(term136202, term136202.getClass(), "functionName", null);
        setBooleanField(term136202, term136202.getClass(), "itsNeedsActivation", false);
        setIntField(term136202, term136202.getClass(), "itsFunctionType", 0);
        setBooleanField(term136202, term136202.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term136202, term136202.getClass(), "encodedSourceStart", 0);
        setIntField(term136202, term136202.getClass(), "encodedSourceEnd", 0);
        setField(term136202, term136202.getClass(), "sourceName", null);
        setIntField(term136202, term136202.getClass(), "baseLineno", 0);
        setIntField(term136202, term136202.getClass(), "endLineno", 0);
        setField(term136202, term136202.getClass(), "functions", null);
        setField(term136202, term136202.getClass(), "regexps", null);
        setField(term136202, term136202.getClass(), "itsVariables", null);
        setField(term136202, term136202.getClass(), "itsConst", null);
        setField(term136202, term136202.getClass(), "itsVariableNames", null);
        setIntField(term136202, term136202.getClass(), "varStart", 0);
        setField(term136202, term136202.getClass(), "compilerData", null);
        setIntField(term136202, term136202.getClass(), "type", 42);
        setField(term136212, term136212.getClass(), "str", null);
        setIntField(term136212, term136212.getClass(), "type", 42);
        setField(term136212, term136212.getClass(), "next", null);
        setField(term136212, term136212.getClass(), "first", null);
        setField(term136212, term136212.getClass(), "last", null);
        setField(term136212, term136212.getClass(), "propListHead", null);
        setIntField(term136212, term136212.getClass(), "sourcePosition", 0);
        setField(term136212, term136212.getClass(), "jsType", null);
        setField(term136212, term136212.getClass(), "parent", null);
        setField(term136202, term136202.getClass(), "next", term136212);
        setField(term136202, term136202.getClass(), "first", null);
        setField(term136202, term136202.getClass(), "last", null);
        setField(term136202, term136202.getClass(), "propListHead", null);
        setIntField(term136202, term136202.getClass(), "sourcePosition", 0);
        setField(term136202, term136202.getClass(), "jsType", null);
        setField(term136202, term136202.getClass(), "parent", null);
        setField(term136192, term136192.getClass(), "first", term136202);
        setField(term136192, term136192.getClass(), "last", null);
        setField(term136192, term136192.getClass(), "propListHead", null);
        setIntField(term136192, term136192.getClass(), "sourcePosition", 0);
        setField(term136192, term136192.getClass(), "jsType", null);
        setField(term136192, term136192.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term135322;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term135236, args);
        assertTrue(recursiveEquals(term135236, term136268));
        assertTrue(recursiveEquals(term135322, term136269));
        assertTrue(recursiveEquals(retValue, term136192));
    }

};


