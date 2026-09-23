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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term696378;
     Object term696470;
     Object term697081;
     Object term697082;
     Object term697036;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term696378 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term696470 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term696556 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term696626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term696556, term696556.getClass(), "next", term696626);
        setField(term696470, term696470.getClass(), "first", term696556);
        setIntField(term696470, term696470.getClass(), "type", 20);
        term697081 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term697081, term697081.getClass(), "currentTraversal", null);
        term697082 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term697083 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term697084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term697082, term697082.getClass(), "number", 0.0);
        setIntField(term697082, term697082.getClass(), "type", 20);
        setField(term697082, term697082.getClass(), "next", null);
        setField(term697083, term697083.getClass(), "functionName", null);
        setBooleanField(term697083, term697083.getClass(), "itsNeedsActivation", false);
        setIntField(term697083, term697083.getClass(), "itsFunctionType", 0);
        setBooleanField(term697083, term697083.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term697083, term697083.getClass(), "encodedSourceStart", 0);
        setIntField(term697083, term697083.getClass(), "encodedSourceEnd", 0);
        setField(term697083, term697083.getClass(), "sourceName", null);
        setIntField(term697083, term697083.getClass(), "baseLineno", 0);
        setIntField(term697083, term697083.getClass(), "endLineno", 0);
        setField(term697083, term697083.getClass(), "functions", null);
        setField(term697083, term697083.getClass(), "regexps", null);
        setField(term697083, term697083.getClass(), "itsVariables", null);
        setField(term697083, term697083.getClass(), "itsConst", null);
        setField(term697083, term697083.getClass(), "itsVariableNames", null);
        setIntField(term697083, term697083.getClass(), "varStart", 0);
        setField(term697083, term697083.getClass(), "compilerData", null);
        setIntField(term697083, term697083.getClass(), "type", 0);
        setIntField(term697084, term697084.getClass(), "type", 0);
        setField(term697084, term697084.getClass(), "next", null);
        setField(term697084, term697084.getClass(), "first", null);
        setField(term697084, term697084.getClass(), "last", null);
        setField(term697084, term697084.getClass(), "propListHead", null);
        setIntField(term697084, term697084.getClass(), "sourcePosition", 0);
        setField(term697084, term697084.getClass(), "jsType", null);
        setField(term697084, term697084.getClass(), "parent", null);
        setField(term697083, term697083.getClass(), "next", term697084);
        setField(term697083, term697083.getClass(), "first", null);
        setField(term697083, term697083.getClass(), "last", null);
        setField(term697083, term697083.getClass(), "propListHead", null);
        setIntField(term697083, term697083.getClass(), "sourcePosition", 0);
        setField(term697083, term697083.getClass(), "jsType", null);
        setField(term697083, term697083.getClass(), "parent", null);
        setField(term697082, term697082.getClass(), "first", term697083);
        setField(term697082, term697082.getClass(), "last", null);
        setField(term697082, term697082.getClass(), "propListHead", null);
        setIntField(term697082, term697082.getClass(), "sourcePosition", 0);
        setField(term697082, term697082.getClass(), "jsType", null);
        setField(term697082, term697082.getClass(), "parent", null);
        term697036 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term697039 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term697049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term697036, term697036.getClass(), "number", 0.0);
        setIntField(term697036, term697036.getClass(), "type", 20);
        setField(term697036, term697036.getClass(), "next", null);
        setField(term697039, term697039.getClass(), "functionName", null);
        setBooleanField(term697039, term697039.getClass(), "itsNeedsActivation", false);
        setIntField(term697039, term697039.getClass(), "itsFunctionType", 0);
        setBooleanField(term697039, term697039.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term697039, term697039.getClass(), "encodedSourceStart", 0);
        setIntField(term697039, term697039.getClass(), "encodedSourceEnd", 0);
        setField(term697039, term697039.getClass(), "sourceName", null);
        setIntField(term697039, term697039.getClass(), "baseLineno", 0);
        setIntField(term697039, term697039.getClass(), "endLineno", 0);
        setField(term697039, term697039.getClass(), "functions", null);
        setField(term697039, term697039.getClass(), "regexps", null);
        setField(term697039, term697039.getClass(), "itsVariables", null);
        setField(term697039, term697039.getClass(), "itsConst", null);
        setField(term697039, term697039.getClass(), "itsVariableNames", null);
        setIntField(term697039, term697039.getClass(), "varStart", 0);
        setField(term697039, term697039.getClass(), "compilerData", null);
        setIntField(term697039, term697039.getClass(), "type", 0);
        setIntField(term697049, term697049.getClass(), "type", 0);
        setField(term697049, term697049.getClass(), "next", null);
        setField(term697049, term697049.getClass(), "first", null);
        setField(term697049, term697049.getClass(), "last", null);
        setField(term697049, term697049.getClass(), "propListHead", null);
        setIntField(term697049, term697049.getClass(), "sourcePosition", 0);
        setField(term697049, term697049.getClass(), "jsType", null);
        setField(term697049, term697049.getClass(), "parent", null);
        setField(term697039, term697039.getClass(), "next", term697049);
        setField(term697039, term697039.getClass(), "first", null);
        setField(term697039, term697039.getClass(), "last", null);
        setField(term697039, term697039.getClass(), "propListHead", null);
        setIntField(term697039, term697039.getClass(), "sourcePosition", 0);
        setField(term697039, term697039.getClass(), "jsType", null);
        setField(term697039, term697039.getClass(), "parent", null);
        setField(term697036, term697036.getClass(), "first", term697039);
        setField(term697036, term697036.getClass(), "last", null);
        setField(term697036, term697036.getClass(), "propListHead", null);
        setIntField(term697036, term697036.getClass(), "sourcePosition", 0);
        setField(term697036, term697036.getClass(), "jsType", null);
        setField(term697036, term697036.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term696470;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term696378, args);
        assertTrue(recursiveEquals(term696378, term697081));
        assertTrue(recursiveEquals(term696470, term697082));
        assertTrue(recursiveEquals(retValue, term697036));
    }

};


