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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295139;
     Object term295231;
     Object term295445;
     Object term295446;
     Object term295402;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295139 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term295231 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term295317 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term295387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term295317, term295317.getClass(), "next", term295387);
        setField(term295231, term295231.getClass(), "first", term295317);
        setIntField(term295231, term295231.getClass(), "type", 23);
        term295445 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term295445, term295445.getClass(), "currentTraversal", null);
        term295446 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term295447 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term295448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term295446, term295446.getClass(), "str", null);
        setIntField(term295446, term295446.getClass(), "type", 23);
        setField(term295446, term295446.getClass(), "next", null);
        setField(term295447, term295447.getClass(), "functionName", null);
        setBooleanField(term295447, term295447.getClass(), "itsNeedsActivation", false);
        setIntField(term295447, term295447.getClass(), "itsFunctionType", 0);
        setBooleanField(term295447, term295447.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term295447, term295447.getClass(), "encodedSourceStart", 0);
        setIntField(term295447, term295447.getClass(), "encodedSourceEnd", 0);
        setField(term295447, term295447.getClass(), "sourceName", null);
        setIntField(term295447, term295447.getClass(), "baseLineno", 0);
        setIntField(term295447, term295447.getClass(), "endLineno", 0);
        setField(term295447, term295447.getClass(), "functions", null);
        setField(term295447, term295447.getClass(), "regexps", null);
        setField(term295447, term295447.getClass(), "itsVariables", null);
        setField(term295447, term295447.getClass(), "itsConst", null);
        setField(term295447, term295447.getClass(), "itsVariableNames", null);
        setIntField(term295447, term295447.getClass(), "varStart", 0);
        setField(term295447, term295447.getClass(), "compilerData", null);
        setIntField(term295447, term295447.getClass(), "type", 0);
        setIntField(term295448, term295448.getClass(), "type", 0);
        setField(term295448, term295448.getClass(), "next", null);
        setField(term295448, term295448.getClass(), "first", null);
        setField(term295448, term295448.getClass(), "last", null);
        setField(term295448, term295448.getClass(), "propListHead", null);
        setIntField(term295448, term295448.getClass(), "sourcePosition", 0);
        setField(term295448, term295448.getClass(), "jsType", null);
        setField(term295448, term295448.getClass(), "parent", null);
        setField(term295447, term295447.getClass(), "next", term295448);
        setField(term295447, term295447.getClass(), "first", null);
        setField(term295447, term295447.getClass(), "last", null);
        setField(term295447, term295447.getClass(), "propListHead", null);
        setIntField(term295447, term295447.getClass(), "sourcePosition", 0);
        setField(term295447, term295447.getClass(), "jsType", null);
        setField(term295447, term295447.getClass(), "parent", null);
        setField(term295446, term295446.getClass(), "first", term295447);
        setField(term295446, term295446.getClass(), "last", null);
        setField(term295446, term295446.getClass(), "propListHead", null);
        setIntField(term295446, term295446.getClass(), "sourcePosition", 0);
        setField(term295446, term295446.getClass(), "jsType", null);
        setField(term295446, term295446.getClass(), "parent", null);
        term295402 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term295404 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term295414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term295402, term295402.getClass(), "str", null);
        setIntField(term295402, term295402.getClass(), "type", 23);
        setField(term295402, term295402.getClass(), "next", null);
        setField(term295404, term295404.getClass(), "functionName", null);
        setBooleanField(term295404, term295404.getClass(), "itsNeedsActivation", false);
        setIntField(term295404, term295404.getClass(), "itsFunctionType", 0);
        setBooleanField(term295404, term295404.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term295404, term295404.getClass(), "encodedSourceStart", 0);
        setIntField(term295404, term295404.getClass(), "encodedSourceEnd", 0);
        setField(term295404, term295404.getClass(), "sourceName", null);
        setIntField(term295404, term295404.getClass(), "baseLineno", 0);
        setIntField(term295404, term295404.getClass(), "endLineno", 0);
        setField(term295404, term295404.getClass(), "functions", null);
        setField(term295404, term295404.getClass(), "regexps", null);
        setField(term295404, term295404.getClass(), "itsVariables", null);
        setField(term295404, term295404.getClass(), "itsConst", null);
        setField(term295404, term295404.getClass(), "itsVariableNames", null);
        setIntField(term295404, term295404.getClass(), "varStart", 0);
        setField(term295404, term295404.getClass(), "compilerData", null);
        setIntField(term295404, term295404.getClass(), "type", 0);
        setIntField(term295414, term295414.getClass(), "type", 0);
        setField(term295414, term295414.getClass(), "next", null);
        setField(term295414, term295414.getClass(), "first", null);
        setField(term295414, term295414.getClass(), "last", null);
        setField(term295414, term295414.getClass(), "propListHead", null);
        setIntField(term295414, term295414.getClass(), "sourcePosition", 0);
        setField(term295414, term295414.getClass(), "jsType", null);
        setField(term295414, term295414.getClass(), "parent", null);
        setField(term295404, term295404.getClass(), "next", term295414);
        setField(term295404, term295404.getClass(), "first", null);
        setField(term295404, term295404.getClass(), "last", null);
        setField(term295404, term295404.getClass(), "propListHead", null);
        setIntField(term295404, term295404.getClass(), "sourcePosition", 0);
        setField(term295404, term295404.getClass(), "jsType", null);
        setField(term295404, term295404.getClass(), "parent", null);
        setField(term295402, term295402.getClass(), "first", term295404);
        setField(term295402, term295402.getClass(), "last", null);
        setField(term295402, term295402.getClass(), "propListHead", null);
        setIntField(term295402, term295402.getClass(), "sourcePosition", 0);
        setField(term295402, term295402.getClass(), "jsType", null);
        setField(term295402, term295402.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term295231;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term295139, args);
        assertTrue(recursiveEquals(term295139, term295445));
        assertTrue(recursiveEquals(term295231, term295446));
        assertTrue(recursiveEquals(retValue, term295402));
    }

};


