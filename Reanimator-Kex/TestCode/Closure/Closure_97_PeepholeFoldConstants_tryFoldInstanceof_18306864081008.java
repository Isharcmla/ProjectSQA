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

public class PeepholeFoldConstants_tryFoldInstanceof_18306864081008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316278;
     Object term316364;
     Object term316456;
     Object term316526;
     Object term316527;
     Object term316528;
     Object term316503;

    public PeepholeFoldConstants_tryFoldInstanceof_18306864081008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316278 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term316364 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term316364, term316364.getClass(), "type", 52);
        term316456 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term316526 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term316526, term316526.getClass(), "currentTraversal", null);
        term316527 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term316527, term316527.getClass(), "functionName", null);
        setBooleanField(term316527, term316527.getClass(), "itsNeedsActivation", false);
        setIntField(term316527, term316527.getClass(), "itsFunctionType", 0);
        setBooleanField(term316527, term316527.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term316527, term316527.getClass(), "encodedSourceStart", 0);
        setIntField(term316527, term316527.getClass(), "encodedSourceEnd", 0);
        setField(term316527, term316527.getClass(), "sourceName", null);
        setIntField(term316527, term316527.getClass(), "baseLineno", 0);
        setIntField(term316527, term316527.getClass(), "endLineno", 0);
        setField(term316527, term316527.getClass(), "functions", null);
        setField(term316527, term316527.getClass(), "regexps", null);
        setField(term316527, term316527.getClass(), "itsVariables", null);
        setField(term316527, term316527.getClass(), "itsConst", null);
        setField(term316527, term316527.getClass(), "itsVariableNames", null);
        setIntField(term316527, term316527.getClass(), "varStart", 0);
        setField(term316527, term316527.getClass(), "compilerData", null);
        setIntField(term316527, term316527.getClass(), "type", 52);
        setField(term316527, term316527.getClass(), "next", null);
        setField(term316527, term316527.getClass(), "first", null);
        setField(term316527, term316527.getClass(), "last", null);
        setField(term316527, term316527.getClass(), "propListHead", null);
        setIntField(term316527, term316527.getClass(), "sourcePosition", 0);
        setField(term316527, term316527.getClass(), "jsType", null);
        setField(term316527, term316527.getClass(), "parent", null);
        term316528 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term316528, term316528.getClass(), "str", null);
        setIntField(term316528, term316528.getClass(), "type", 0);
        setField(term316528, term316528.getClass(), "next", null);
        setField(term316528, term316528.getClass(), "first", null);
        setField(term316528, term316528.getClass(), "last", null);
        setField(term316528, term316528.getClass(), "propListHead", null);
        setIntField(term316528, term316528.getClass(), "sourcePosition", 0);
        setField(term316528, term316528.getClass(), "jsType", null);
        setField(term316528, term316528.getClass(), "parent", null);
        term316503 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term316503, term316503.getClass(), "functionName", null);
        setBooleanField(term316503, term316503.getClass(), "itsNeedsActivation", false);
        setIntField(term316503, term316503.getClass(), "itsFunctionType", 0);
        setBooleanField(term316503, term316503.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term316503, term316503.getClass(), "encodedSourceStart", 0);
        setIntField(term316503, term316503.getClass(), "encodedSourceEnd", 0);
        setField(term316503, term316503.getClass(), "sourceName", null);
        setIntField(term316503, term316503.getClass(), "baseLineno", 0);
        setIntField(term316503, term316503.getClass(), "endLineno", 0);
        setField(term316503, term316503.getClass(), "functions", null);
        setField(term316503, term316503.getClass(), "regexps", null);
        setField(term316503, term316503.getClass(), "itsVariables", null);
        setField(term316503, term316503.getClass(), "itsConst", null);
        setField(term316503, term316503.getClass(), "itsVariableNames", null);
        setIntField(term316503, term316503.getClass(), "varStart", 0);
        setField(term316503, term316503.getClass(), "compilerData", null);
        setIntField(term316503, term316503.getClass(), "type", 52);
        setField(term316503, term316503.getClass(), "next", null);
        setField(term316503, term316503.getClass(), "first", null);
        setField(term316503, term316503.getClass(), "last", null);
        setField(term316503, term316503.getClass(), "propListHead", null);
        setIntField(term316503, term316503.getClass(), "sourcePosition", 0);
        setField(term316503, term316503.getClass(), "jsType", null);
        setField(term316503, term316503.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term316364;
        args[1] = term316456;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term316278, args);
        assertTrue(recursiveEquals(term316278, term316526));
        assertTrue(recursiveEquals(term316364, term316527));
        assertTrue(recursiveEquals(term316456, term316528));
        assertTrue(recursiveEquals(retValue, term316503));
    }

};


