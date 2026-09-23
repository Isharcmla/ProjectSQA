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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673096;
     Object term673188;
     Object term673430;
     Object term673431;
     Object term673382;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term673096 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term673188 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term673274 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term673366 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term673274, term673274.getClass(), "next", term673366);
        setIntField(term673274, term673274.getClass(), "type", 39);
        setField(term673188, term673188.getClass(), "first", term673274);
        setIntField(term673188, term673188.getClass(), "type", 19);
        term673430 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term673430, term673430.getClass(), "currentTraversal", null);
        term673431 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term673432 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term673433 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term673431, term673431.getClass(), "str", null);
        setIntField(term673431, term673431.getClass(), "type", 19);
        setField(term673431, term673431.getClass(), "next", null);
        setField(term673432, term673432.getClass(), "functionName", null);
        setBooleanField(term673432, term673432.getClass(), "itsNeedsActivation", false);
        setIntField(term673432, term673432.getClass(), "itsFunctionType", 0);
        setBooleanField(term673432, term673432.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term673432, term673432.getClass(), "encodedSourceStart", 0);
        setIntField(term673432, term673432.getClass(), "encodedSourceEnd", 0);
        setField(term673432, term673432.getClass(), "sourceName", null);
        setIntField(term673432, term673432.getClass(), "baseLineno", 0);
        setIntField(term673432, term673432.getClass(), "endLineno", 0);
        setField(term673432, term673432.getClass(), "functions", null);
        setField(term673432, term673432.getClass(), "regexps", null);
        setField(term673432, term673432.getClass(), "itsVariables", null);
        setField(term673432, term673432.getClass(), "itsConst", null);
        setField(term673432, term673432.getClass(), "itsVariableNames", null);
        setIntField(term673432, term673432.getClass(), "varStart", 0);
        setField(term673432, term673432.getClass(), "compilerData", null);
        setIntField(term673432, term673432.getClass(), "type", 39);
        setDoubleField(term673433, term673433.getClass(), "number", 0.0);
        setIntField(term673433, term673433.getClass(), "type", 0);
        setField(term673433, term673433.getClass(), "next", null);
        setField(term673433, term673433.getClass(), "first", null);
        setField(term673433, term673433.getClass(), "last", null);
        setField(term673433, term673433.getClass(), "propListHead", null);
        setIntField(term673433, term673433.getClass(), "sourcePosition", 0);
        setField(term673433, term673433.getClass(), "jsType", null);
        setField(term673433, term673433.getClass(), "parent", null);
        setField(term673432, term673432.getClass(), "next", term673433);
        setField(term673432, term673432.getClass(), "first", null);
        setField(term673432, term673432.getClass(), "last", null);
        setField(term673432, term673432.getClass(), "propListHead", null);
        setIntField(term673432, term673432.getClass(), "sourcePosition", 0);
        setField(term673432, term673432.getClass(), "jsType", null);
        setField(term673432, term673432.getClass(), "parent", null);
        setField(term673431, term673431.getClass(), "first", term673432);
        setField(term673431, term673431.getClass(), "last", null);
        setField(term673431, term673431.getClass(), "propListHead", null);
        setIntField(term673431, term673431.getClass(), "sourcePosition", 0);
        setField(term673431, term673431.getClass(), "jsType", null);
        setField(term673431, term673431.getClass(), "parent", null);
        term673382 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term673384 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term673394 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term673382, term673382.getClass(), "str", null);
        setIntField(term673382, term673382.getClass(), "type", 19);
        setField(term673382, term673382.getClass(), "next", null);
        setField(term673384, term673384.getClass(), "functionName", null);
        setBooleanField(term673384, term673384.getClass(), "itsNeedsActivation", false);
        setIntField(term673384, term673384.getClass(), "itsFunctionType", 0);
        setBooleanField(term673384, term673384.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term673384, term673384.getClass(), "encodedSourceStart", 0);
        setIntField(term673384, term673384.getClass(), "encodedSourceEnd", 0);
        setField(term673384, term673384.getClass(), "sourceName", null);
        setIntField(term673384, term673384.getClass(), "baseLineno", 0);
        setIntField(term673384, term673384.getClass(), "endLineno", 0);
        setField(term673384, term673384.getClass(), "functions", null);
        setField(term673384, term673384.getClass(), "regexps", null);
        setField(term673384, term673384.getClass(), "itsVariables", null);
        setField(term673384, term673384.getClass(), "itsConst", null);
        setField(term673384, term673384.getClass(), "itsVariableNames", null);
        setIntField(term673384, term673384.getClass(), "varStart", 0);
        setField(term673384, term673384.getClass(), "compilerData", null);
        setIntField(term673384, term673384.getClass(), "type", 39);
        setDoubleField(term673394, term673394.getClass(), "number", 0.0);
        setIntField(term673394, term673394.getClass(), "type", 0);
        setField(term673394, term673394.getClass(), "next", null);
        setField(term673394, term673394.getClass(), "first", null);
        setField(term673394, term673394.getClass(), "last", null);
        setField(term673394, term673394.getClass(), "propListHead", null);
        setIntField(term673394, term673394.getClass(), "sourcePosition", 0);
        setField(term673394, term673394.getClass(), "jsType", null);
        setField(term673394, term673394.getClass(), "parent", null);
        setField(term673384, term673384.getClass(), "next", term673394);
        setField(term673384, term673384.getClass(), "first", null);
        setField(term673384, term673384.getClass(), "last", null);
        setField(term673384, term673384.getClass(), "propListHead", null);
        setIntField(term673384, term673384.getClass(), "sourcePosition", 0);
        setField(term673384, term673384.getClass(), "jsType", null);
        setField(term673384, term673384.getClass(), "parent", null);
        setField(term673382, term673382.getClass(), "first", term673384);
        setField(term673382, term673382.getClass(), "last", null);
        setField(term673382, term673382.getClass(), "propListHead", null);
        setIntField(term673382, term673382.getClass(), "sourcePosition", 0);
        setField(term673382, term673382.getClass(), "jsType", null);
        setField(term673382, term673382.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term673188;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term673096, args);
        assertTrue(recursiveEquals(term673096, term673430));
        assertTrue(recursiveEquals(term673188, term673431));
        assertTrue(recursiveEquals(retValue, term673382));
    }

};


