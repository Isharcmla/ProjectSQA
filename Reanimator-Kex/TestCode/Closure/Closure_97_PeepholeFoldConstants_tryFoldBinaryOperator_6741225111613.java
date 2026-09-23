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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624832;
     Object term624924;
     Object term651394;
     Object term651395;
     Object term651299;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term624832 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term624924 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term625010 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term625096 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term625010, term625010.getClass(), "next", term625096);
        setIntField(term625010, term625010.getClass(), "type", 0);
        setField(term624924, term624924.getClass(), "first", term625010);
        setIntField(term624924, term624924.getClass(), "type", 100);
        setField(term624924, term624924.getClass(), "parent", null);
        term651394 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term651394, term651394.getClass(), "currentTraversal", null);
        term651395 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term651396 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term651397 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term651395, term651395.getClass(), "number", 0.0);
        setIntField(term651395, term651395.getClass(), "type", 100);
        setField(term651395, term651395.getClass(), "next", null);
        setField(term651396, term651396.getClass(), "functionName", null);
        setBooleanField(term651396, term651396.getClass(), "itsNeedsActivation", false);
        setIntField(term651396, term651396.getClass(), "itsFunctionType", 0);
        setBooleanField(term651396, term651396.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651396, term651396.getClass(), "encodedSourceStart", 0);
        setIntField(term651396, term651396.getClass(), "encodedSourceEnd", 0);
        setField(term651396, term651396.getClass(), "sourceName", null);
        setIntField(term651396, term651396.getClass(), "baseLineno", 0);
        setIntField(term651396, term651396.getClass(), "endLineno", 0);
        setField(term651396, term651396.getClass(), "functions", null);
        setField(term651396, term651396.getClass(), "regexps", null);
        setField(term651396, term651396.getClass(), "itsVariables", null);
        setField(term651396, term651396.getClass(), "itsConst", null);
        setField(term651396, term651396.getClass(), "itsVariableNames", null);
        setIntField(term651396, term651396.getClass(), "varStart", 0);
        setField(term651396, term651396.getClass(), "compilerData", null);
        setIntField(term651396, term651396.getClass(), "type", 0);
        setField(term651397, term651397.getClass(), "functionName", null);
        setBooleanField(term651397, term651397.getClass(), "itsNeedsActivation", false);
        setIntField(term651397, term651397.getClass(), "itsFunctionType", 0);
        setBooleanField(term651397, term651397.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651397, term651397.getClass(), "encodedSourceStart", 0);
        setIntField(term651397, term651397.getClass(), "encodedSourceEnd", 0);
        setField(term651397, term651397.getClass(), "sourceName", null);
        setIntField(term651397, term651397.getClass(), "baseLineno", 0);
        setIntField(term651397, term651397.getClass(), "endLineno", 0);
        setField(term651397, term651397.getClass(), "functions", null);
        setField(term651397, term651397.getClass(), "regexps", null);
        setField(term651397, term651397.getClass(), "itsVariables", null);
        setField(term651397, term651397.getClass(), "itsConst", null);
        setField(term651397, term651397.getClass(), "itsVariableNames", null);
        setIntField(term651397, term651397.getClass(), "varStart", 0);
        setField(term651397, term651397.getClass(), "compilerData", null);
        setIntField(term651397, term651397.getClass(), "type", 0);
        setField(term651397, term651397.getClass(), "next", null);
        setField(term651397, term651397.getClass(), "first", null);
        setField(term651397, term651397.getClass(), "last", null);
        setField(term651397, term651397.getClass(), "propListHead", null);
        setIntField(term651397, term651397.getClass(), "sourcePosition", 0);
        setField(term651397, term651397.getClass(), "jsType", null);
        setField(term651397, term651397.getClass(), "parent", null);
        setField(term651396, term651396.getClass(), "next", term651397);
        setField(term651396, term651396.getClass(), "first", null);
        setField(term651396, term651396.getClass(), "last", null);
        setField(term651396, term651396.getClass(), "propListHead", null);
        setIntField(term651396, term651396.getClass(), "sourcePosition", 0);
        setField(term651396, term651396.getClass(), "jsType", null);
        setField(term651396, term651396.getClass(), "parent", null);
        setField(term651395, term651395.getClass(), "first", term651396);
        setField(term651395, term651395.getClass(), "last", null);
        setField(term651395, term651395.getClass(), "propListHead", null);
        setIntField(term651395, term651395.getClass(), "sourcePosition", 0);
        setField(term651395, term651395.getClass(), "jsType", null);
        setField(term651395, term651395.getClass(), "parent", null);
        term651299 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term651302 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term651312 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term651299, term651299.getClass(), "number", 0.0);
        setIntField(term651299, term651299.getClass(), "type", 100);
        setField(term651299, term651299.getClass(), "next", null);
        setField(term651302, term651302.getClass(), "functionName", null);
        setBooleanField(term651302, term651302.getClass(), "itsNeedsActivation", false);
        setIntField(term651302, term651302.getClass(), "itsFunctionType", 0);
        setBooleanField(term651302, term651302.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651302, term651302.getClass(), "encodedSourceStart", 0);
        setIntField(term651302, term651302.getClass(), "encodedSourceEnd", 0);
        setField(term651302, term651302.getClass(), "sourceName", null);
        setIntField(term651302, term651302.getClass(), "baseLineno", 0);
        setIntField(term651302, term651302.getClass(), "endLineno", 0);
        setField(term651302, term651302.getClass(), "functions", null);
        setField(term651302, term651302.getClass(), "regexps", null);
        setField(term651302, term651302.getClass(), "itsVariables", null);
        setField(term651302, term651302.getClass(), "itsConst", null);
        setField(term651302, term651302.getClass(), "itsVariableNames", null);
        setIntField(term651302, term651302.getClass(), "varStart", 0);
        setField(term651302, term651302.getClass(), "compilerData", null);
        setIntField(term651302, term651302.getClass(), "type", 0);
        setField(term651312, term651312.getClass(), "functionName", null);
        setBooleanField(term651312, term651312.getClass(), "itsNeedsActivation", false);
        setIntField(term651312, term651312.getClass(), "itsFunctionType", 0);
        setBooleanField(term651312, term651312.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651312, term651312.getClass(), "encodedSourceStart", 0);
        setIntField(term651312, term651312.getClass(), "encodedSourceEnd", 0);
        setField(term651312, term651312.getClass(), "sourceName", null);
        setIntField(term651312, term651312.getClass(), "baseLineno", 0);
        setIntField(term651312, term651312.getClass(), "endLineno", 0);
        setField(term651312, term651312.getClass(), "functions", null);
        setField(term651312, term651312.getClass(), "regexps", null);
        setField(term651312, term651312.getClass(), "itsVariables", null);
        setField(term651312, term651312.getClass(), "itsConst", null);
        setField(term651312, term651312.getClass(), "itsVariableNames", null);
        setIntField(term651312, term651312.getClass(), "varStart", 0);
        setField(term651312, term651312.getClass(), "compilerData", null);
        setIntField(term651312, term651312.getClass(), "type", 0);
        setField(term651312, term651312.getClass(), "next", null);
        setField(term651312, term651312.getClass(), "first", null);
        setField(term651312, term651312.getClass(), "last", null);
        setField(term651312, term651312.getClass(), "propListHead", null);
        setIntField(term651312, term651312.getClass(), "sourcePosition", 0);
        setField(term651312, term651312.getClass(), "jsType", null);
        setField(term651312, term651312.getClass(), "parent", null);
        setField(term651302, term651302.getClass(), "next", term651312);
        setField(term651302, term651302.getClass(), "first", null);
        setField(term651302, term651302.getClass(), "last", null);
        setField(term651302, term651302.getClass(), "propListHead", null);
        setIntField(term651302, term651302.getClass(), "sourcePosition", 0);
        setField(term651302, term651302.getClass(), "jsType", null);
        setField(term651302, term651302.getClass(), "parent", null);
        setField(term651299, term651299.getClass(), "first", term651302);
        setField(term651299, term651299.getClass(), "last", null);
        setField(term651299, term651299.getClass(), "propListHead", null);
        setIntField(term651299, term651299.getClass(), "sourcePosition", 0);
        setField(term651299, term651299.getClass(), "jsType", null);
        setField(term651299, term651299.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term624924;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term624832, args);
        assertTrue(recursiveEquals(term624832, term651394));
        assertTrue(recursiveEquals(term624924, term651395));
        assertTrue(recursiveEquals(retValue, term651299));
    }

};


