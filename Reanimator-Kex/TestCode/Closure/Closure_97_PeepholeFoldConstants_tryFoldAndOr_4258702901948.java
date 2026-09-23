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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term740078;
     Object term740170;
     Object term740262;
     Object term740348;
     Object term740396;
     Object term740397;
     Object term740398;
     Object term740399;
     Object term740349;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term740078 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term740170 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term740170, term740170.getClass(), "parent", null);
        setIntField(term740170, term740170.getClass(), "type", 0);
        term740262 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term740262, term740262.getClass(), "type", 0);
        term740348 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term740396 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term740396, term740396.getClass(), "currentTraversal", null);
        term740397 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term740397, term740397.getClass(), "number", 0.0);
        setIntField(term740397, term740397.getClass(), "type", 0);
        setField(term740397, term740397.getClass(), "next", null);
        setField(term740397, term740397.getClass(), "first", null);
        setField(term740397, term740397.getClass(), "last", null);
        setField(term740397, term740397.getClass(), "propListHead", null);
        setIntField(term740397, term740397.getClass(), "sourcePosition", 0);
        setField(term740397, term740397.getClass(), "jsType", null);
        setField(term740397, term740397.getClass(), "parent", null);
        term740398 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term740398, term740398.getClass(), "str", null);
        setIntField(term740398, term740398.getClass(), "type", 0);
        setField(term740398, term740398.getClass(), "next", null);
        setField(term740398, term740398.getClass(), "first", null);
        setField(term740398, term740398.getClass(), "last", null);
        setField(term740398, term740398.getClass(), "propListHead", null);
        setIntField(term740398, term740398.getClass(), "sourcePosition", 0);
        setField(term740398, term740398.getClass(), "jsType", null);
        setField(term740398, term740398.getClass(), "parent", null);
        term740399 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term740399, term740399.getClass(), "functionName", null);
        setBooleanField(term740399, term740399.getClass(), "itsNeedsActivation", false);
        setIntField(term740399, term740399.getClass(), "itsFunctionType", 0);
        setBooleanField(term740399, term740399.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term740399, term740399.getClass(), "encodedSourceStart", 0);
        setIntField(term740399, term740399.getClass(), "encodedSourceEnd", 0);
        setField(term740399, term740399.getClass(), "sourceName", null);
        setIntField(term740399, term740399.getClass(), "baseLineno", 0);
        setIntField(term740399, term740399.getClass(), "endLineno", 0);
        setField(term740399, term740399.getClass(), "functions", null);
        setField(term740399, term740399.getClass(), "regexps", null);
        setField(term740399, term740399.getClass(), "itsVariables", null);
        setField(term740399, term740399.getClass(), "itsConst", null);
        setField(term740399, term740399.getClass(), "itsVariableNames", null);
        setIntField(term740399, term740399.getClass(), "varStart", 0);
        setField(term740399, term740399.getClass(), "compilerData", null);
        setIntField(term740399, term740399.getClass(), "type", 0);
        setField(term740399, term740399.getClass(), "next", null);
        setField(term740399, term740399.getClass(), "first", null);
        setField(term740399, term740399.getClass(), "last", null);
        setField(term740399, term740399.getClass(), "propListHead", null);
        setIntField(term740399, term740399.getClass(), "sourcePosition", 0);
        setField(term740399, term740399.getClass(), "jsType", null);
        setField(term740399, term740399.getClass(), "parent", null);
        term740349 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term740349, term740349.getClass(), "number", 0.0);
        setIntField(term740349, term740349.getClass(), "type", 0);
        setField(term740349, term740349.getClass(), "next", null);
        setField(term740349, term740349.getClass(), "first", null);
        setField(term740349, term740349.getClass(), "last", null);
        setField(term740349, term740349.getClass(), "propListHead", null);
        setIntField(term740349, term740349.getClass(), "sourcePosition", 0);
        setField(term740349, term740349.getClass(), "jsType", null);
        setField(term740349, term740349.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term740170;
        args[1] = term740262;
        args[2] = term740348;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term740078, args);
        assertTrue(recursiveEquals(term740078, term740396));
        assertTrue(recursiveEquals(term740170, term740397));
        assertTrue(recursiveEquals(term740262, term740398));
        assertTrue(recursiveEquals(term740348, term740399));
        assertTrue(recursiveEquals(retValue, term740349));
    }

};


