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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134160;
     Object term134246;
     Object term135012;
     Object term135013;
     Object term134968;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134160 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term134246 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term134338 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term134246, term134246.getClass(), "first", term134246);
        setField(term134246, term134246.getClass(), "next", term134338);
        setIntField(term134246, term134246.getClass(), "type", 33);
        term135012 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term135012, term135012.getClass(), "currentTraversal", null);
        term135013 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term135014 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term135013, term135013.getClass(), "functionName", null);
        setBooleanField(term135013, term135013.getClass(), "itsNeedsActivation", false);
        setIntField(term135013, term135013.getClass(), "itsFunctionType", 0);
        setBooleanField(term135013, term135013.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term135013, term135013.getClass(), "encodedSourceStart", 0);
        setIntField(term135013, term135013.getClass(), "encodedSourceEnd", 0);
        setField(term135013, term135013.getClass(), "sourceName", null);
        setIntField(term135013, term135013.getClass(), "baseLineno", 0);
        setIntField(term135013, term135013.getClass(), "endLineno", 0);
        setField(term135013, term135013.getClass(), "functions", null);
        setField(term135013, term135013.getClass(), "regexps", null);
        setField(term135013, term135013.getClass(), "itsVariables", null);
        setField(term135013, term135013.getClass(), "itsConst", null);
        setField(term135013, term135013.getClass(), "itsVariableNames", null);
        setIntField(term135013, term135013.getClass(), "varStart", 0);
        setField(term135013, term135013.getClass(), "compilerData", null);
        setIntField(term135013, term135013.getClass(), "type", 33);
        setDoubleField(term135014, term135014.getClass(), "number", 0.0);
        setIntField(term135014, term135014.getClass(), "type", 0);
        setField(term135014, term135014.getClass(), "next", null);
        setField(term135014, term135014.getClass(), "first", null);
        setField(term135014, term135014.getClass(), "last", null);
        setField(term135014, term135014.getClass(), "propListHead", null);
        setIntField(term135014, term135014.getClass(), "sourcePosition", 0);
        setField(term135014, term135014.getClass(), "jsType", null);
        setField(term135014, term135014.getClass(), "parent", null);
        setField(term135013, term135013.getClass(), "next", term135014);
        setField(term135013, term135013.getClass(), "first", term135013);
        setField(term135013, term135013.getClass(), "last", null);
        setField(term135013, term135013.getClass(), "propListHead", null);
        setIntField(term135013, term135013.getClass(), "sourcePosition", 0);
        setField(term135013, term135013.getClass(), "jsType", null);
        setField(term135013, term135013.getClass(), "parent", null);
        term134968 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term134978 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term134968, term134968.getClass(), "functionName", null);
        setBooleanField(term134968, term134968.getClass(), "itsNeedsActivation", false);
        setIntField(term134968, term134968.getClass(), "itsFunctionType", 0);
        setBooleanField(term134968, term134968.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term134968, term134968.getClass(), "encodedSourceStart", 0);
        setIntField(term134968, term134968.getClass(), "encodedSourceEnd", 0);
        setField(term134968, term134968.getClass(), "sourceName", null);
        setIntField(term134968, term134968.getClass(), "baseLineno", 0);
        setIntField(term134968, term134968.getClass(), "endLineno", 0);
        setField(term134968, term134968.getClass(), "functions", null);
        setField(term134968, term134968.getClass(), "regexps", null);
        setField(term134968, term134968.getClass(), "itsVariables", null);
        setField(term134968, term134968.getClass(), "itsConst", null);
        setField(term134968, term134968.getClass(), "itsVariableNames", null);
        setIntField(term134968, term134968.getClass(), "varStart", 0);
        setField(term134968, term134968.getClass(), "compilerData", null);
        setIntField(term134968, term134968.getClass(), "type", 33);
        setDoubleField(term134978, term134978.getClass(), "number", 0.0);
        setIntField(term134978, term134978.getClass(), "type", 0);
        setField(term134978, term134978.getClass(), "next", null);
        setField(term134978, term134978.getClass(), "first", null);
        setField(term134978, term134978.getClass(), "last", null);
        setField(term134978, term134978.getClass(), "propListHead", null);
        setIntField(term134978, term134978.getClass(), "sourcePosition", 0);
        setField(term134978, term134978.getClass(), "jsType", null);
        setField(term134978, term134978.getClass(), "parent", null);
        setField(term134968, term134968.getClass(), "next", term134978);
        setField(term134968, term134968.getClass(), "first", term134968);
        setField(term134968, term134968.getClass(), "last", null);
        setField(term134968, term134968.getClass(), "propListHead", null);
        setIntField(term134968, term134968.getClass(), "sourcePosition", 0);
        setField(term134968, term134968.getClass(), "jsType", null);
        setField(term134968, term134968.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term134246;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term134160, args);
        assertTrue(recursiveEquals(term134160, term135012));
        assertTrue(recursiveEquals(term134246, term135013));
        assertTrue(recursiveEquals(retValue, term134968));
    }

};


