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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term515398;
     Object term515484;
     Object term515662;
     Object term515754;
     Object term516208;
     Object term516209;
     Object term516211;
     Object term516212;
     Object term516113;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term515398 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term515484 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term515570 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term515570, term515570.getClass(), "type", 114);
        setField(term515484, term515484.getClass(), "parent", term515570);
        setIntField(term515484, term515484.getClass(), "type", 0);
        term515662 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term515662, term515662.getClass(), "type", 50);
        term515754 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term515754, term515754.getClass(), "type", 63);
        term516208 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term516208, term516208.getClass(), "currentTraversal", null);
        term516209 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term516210 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term516209, term516209.getClass(), "functionName", null);
        setBooleanField(term516209, term516209.getClass(), "itsNeedsActivation", false);
        setIntField(term516209, term516209.getClass(), "itsFunctionType", 0);
        setBooleanField(term516209, term516209.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term516209, term516209.getClass(), "encodedSourceStart", 0);
        setIntField(term516209, term516209.getClass(), "encodedSourceEnd", 0);
        setField(term516209, term516209.getClass(), "sourceName", null);
        setIntField(term516209, term516209.getClass(), "baseLineno", 0);
        setIntField(term516209, term516209.getClass(), "endLineno", 0);
        setField(term516209, term516209.getClass(), "functions", null);
        setField(term516209, term516209.getClass(), "regexps", null);
        setField(term516209, term516209.getClass(), "itsVariables", null);
        setField(term516209, term516209.getClass(), "itsConst", null);
        setField(term516209, term516209.getClass(), "itsVariableNames", null);
        setIntField(term516209, term516209.getClass(), "varStart", 0);
        setField(term516209, term516209.getClass(), "compilerData", null);
        setIntField(term516209, term516209.getClass(), "type", 0);
        setField(term516209, term516209.getClass(), "next", null);
        setField(term516209, term516209.getClass(), "first", null);
        setField(term516209, term516209.getClass(), "last", null);
        setField(term516209, term516209.getClass(), "propListHead", null);
        setIntField(term516209, term516209.getClass(), "sourcePosition", 0);
        setField(term516209, term516209.getClass(), "jsType", null);
        setField(term516210, term516210.getClass(), "functionName", null);
        setBooleanField(term516210, term516210.getClass(), "itsNeedsActivation", false);
        setIntField(term516210, term516210.getClass(), "itsFunctionType", 0);
        setBooleanField(term516210, term516210.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term516210, term516210.getClass(), "encodedSourceStart", 0);
        setIntField(term516210, term516210.getClass(), "encodedSourceEnd", 0);
        setField(term516210, term516210.getClass(), "sourceName", null);
        setIntField(term516210, term516210.getClass(), "baseLineno", 0);
        setIntField(term516210, term516210.getClass(), "endLineno", 0);
        setField(term516210, term516210.getClass(), "functions", null);
        setField(term516210, term516210.getClass(), "regexps", null);
        setField(term516210, term516210.getClass(), "itsVariables", null);
        setField(term516210, term516210.getClass(), "itsConst", null);
        setField(term516210, term516210.getClass(), "itsVariableNames", null);
        setIntField(term516210, term516210.getClass(), "varStart", 0);
        setField(term516210, term516210.getClass(), "compilerData", null);
        setIntField(term516210, term516210.getClass(), "type", 114);
        setField(term516210, term516210.getClass(), "next", null);
        setField(term516210, term516210.getClass(), "first", null);
        setField(term516210, term516210.getClass(), "last", null);
        setField(term516210, term516210.getClass(), "propListHead", null);
        setIntField(term516210, term516210.getClass(), "sourcePosition", 0);
        setField(term516210, term516210.getClass(), "jsType", null);
        setField(term516210, term516210.getClass(), "parent", null);
        setField(term516209, term516209.getClass(), "parent", term516210);
        term516211 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term516211, term516211.getClass(), "number", 0.0);
        setIntField(term516211, term516211.getClass(), "type", 50);
        setField(term516211, term516211.getClass(), "next", null);
        setField(term516211, term516211.getClass(), "first", null);
        setField(term516211, term516211.getClass(), "last", null);
        setField(term516211, term516211.getClass(), "propListHead", null);
        setIntField(term516211, term516211.getClass(), "sourcePosition", 0);
        setField(term516211, term516211.getClass(), "jsType", null);
        setField(term516211, term516211.getClass(), "parent", null);
        term516212 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term516212, term516212.getClass(), "number", 0.0);
        setIntField(term516212, term516212.getClass(), "type", 63);
        setField(term516212, term516212.getClass(), "next", null);
        setField(term516212, term516212.getClass(), "first", null);
        setField(term516212, term516212.getClass(), "last", null);
        setField(term516212, term516212.getClass(), "propListHead", null);
        setIntField(term516212, term516212.getClass(), "sourcePosition", 0);
        setField(term516212, term516212.getClass(), "jsType", null);
        setField(term516212, term516212.getClass(), "parent", null);
        term516113 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term516124 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term516113, term516113.getClass(), "functionName", null);
        setBooleanField(term516113, term516113.getClass(), "itsNeedsActivation", false);
        setIntField(term516113, term516113.getClass(), "itsFunctionType", 0);
        setBooleanField(term516113, term516113.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term516113, term516113.getClass(), "encodedSourceStart", 0);
        setIntField(term516113, term516113.getClass(), "encodedSourceEnd", 0);
        setField(term516113, term516113.getClass(), "sourceName", null);
        setIntField(term516113, term516113.getClass(), "baseLineno", 0);
        setIntField(term516113, term516113.getClass(), "endLineno", 0);
        setField(term516113, term516113.getClass(), "functions", null);
        setField(term516113, term516113.getClass(), "regexps", null);
        setField(term516113, term516113.getClass(), "itsVariables", null);
        setField(term516113, term516113.getClass(), "itsConst", null);
        setField(term516113, term516113.getClass(), "itsVariableNames", null);
        setIntField(term516113, term516113.getClass(), "varStart", 0);
        setField(term516113, term516113.getClass(), "compilerData", null);
        setIntField(term516113, term516113.getClass(), "type", 0);
        setField(term516113, term516113.getClass(), "next", null);
        setField(term516113, term516113.getClass(), "first", null);
        setField(term516113, term516113.getClass(), "last", null);
        setField(term516113, term516113.getClass(), "propListHead", null);
        setIntField(term516113, term516113.getClass(), "sourcePosition", 0);
        setField(term516113, term516113.getClass(), "jsType", null);
        setField(term516124, term516124.getClass(), "functionName", null);
        setBooleanField(term516124, term516124.getClass(), "itsNeedsActivation", false);
        setIntField(term516124, term516124.getClass(), "itsFunctionType", 0);
        setBooleanField(term516124, term516124.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term516124, term516124.getClass(), "encodedSourceStart", 0);
        setIntField(term516124, term516124.getClass(), "encodedSourceEnd", 0);
        setField(term516124, term516124.getClass(), "sourceName", null);
        setIntField(term516124, term516124.getClass(), "baseLineno", 0);
        setIntField(term516124, term516124.getClass(), "endLineno", 0);
        setField(term516124, term516124.getClass(), "functions", null);
        setField(term516124, term516124.getClass(), "regexps", null);
        setField(term516124, term516124.getClass(), "itsVariables", null);
        setField(term516124, term516124.getClass(), "itsConst", null);
        setField(term516124, term516124.getClass(), "itsVariableNames", null);
        setIntField(term516124, term516124.getClass(), "varStart", 0);
        setField(term516124, term516124.getClass(), "compilerData", null);
        setIntField(term516124, term516124.getClass(), "type", 114);
        setField(term516124, term516124.getClass(), "next", null);
        setField(term516124, term516124.getClass(), "first", null);
        setField(term516124, term516124.getClass(), "last", null);
        setField(term516124, term516124.getClass(), "propListHead", null);
        setIntField(term516124, term516124.getClass(), "sourcePosition", 0);
        setField(term516124, term516124.getClass(), "jsType", null);
        setField(term516124, term516124.getClass(), "parent", null);
        setField(term516113, term516113.getClass(), "parent", term516124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term515484;
        args[1] = term515662;
        args[2] = term515754;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term515398, args);
        assertTrue(recursiveEquals(term515398, term516208));
        assertTrue(recursiveEquals(term515484, term516209));
        assertTrue(recursiveEquals(term515662, term516211));
        assertTrue(recursiveEquals(term515754, term516212));
        assertTrue(recursiveEquals(retValue, term516113));
    }

};


