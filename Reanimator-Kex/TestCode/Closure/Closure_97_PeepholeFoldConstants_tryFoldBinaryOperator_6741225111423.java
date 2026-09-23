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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term535832;
     Object term535924;
     Object term536533;
     Object term536534;
     Object term536473;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term535832 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term535924 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term536010 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term536080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term536010, term536010.getClass(), "next", term536080);
        setField(term535924, term535924.getClass(), "first", term536010);
        setIntField(term535924, term535924.getClass(), "type", 14);
        term536533 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term536533, term536533.getClass(), "currentTraversal", null);
        term536534 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term536535 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term536536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term536534, term536534.getClass(), "str", null);
        setIntField(term536534, term536534.getClass(), "type", 14);
        setField(term536534, term536534.getClass(), "next", null);
        setField(term536535, term536535.getClass(), "functionName", null);
        setBooleanField(term536535, term536535.getClass(), "itsNeedsActivation", false);
        setIntField(term536535, term536535.getClass(), "itsFunctionType", 0);
        setBooleanField(term536535, term536535.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term536535, term536535.getClass(), "encodedSourceStart", 0);
        setIntField(term536535, term536535.getClass(), "encodedSourceEnd", 0);
        setField(term536535, term536535.getClass(), "sourceName", null);
        setIntField(term536535, term536535.getClass(), "baseLineno", 0);
        setIntField(term536535, term536535.getClass(), "endLineno", 0);
        setField(term536535, term536535.getClass(), "functions", null);
        setField(term536535, term536535.getClass(), "regexps", null);
        setField(term536535, term536535.getClass(), "itsVariables", null);
        setField(term536535, term536535.getClass(), "itsConst", null);
        setField(term536535, term536535.getClass(), "itsVariableNames", null);
        setIntField(term536535, term536535.getClass(), "varStart", 0);
        setField(term536535, term536535.getClass(), "compilerData", null);
        setIntField(term536535, term536535.getClass(), "type", 0);
        setIntField(term536536, term536536.getClass(), "type", 0);
        setField(term536536, term536536.getClass(), "next", null);
        setField(term536536, term536536.getClass(), "first", null);
        setField(term536536, term536536.getClass(), "last", null);
        setField(term536536, term536536.getClass(), "propListHead", null);
        setIntField(term536536, term536536.getClass(), "sourcePosition", 0);
        setField(term536536, term536536.getClass(), "jsType", null);
        setField(term536536, term536536.getClass(), "parent", null);
        setField(term536535, term536535.getClass(), "next", term536536);
        setField(term536535, term536535.getClass(), "first", null);
        setField(term536535, term536535.getClass(), "last", null);
        setField(term536535, term536535.getClass(), "propListHead", null);
        setIntField(term536535, term536535.getClass(), "sourcePosition", 0);
        setField(term536535, term536535.getClass(), "jsType", null);
        setField(term536535, term536535.getClass(), "parent", null);
        setField(term536534, term536534.getClass(), "first", term536535);
        setField(term536534, term536534.getClass(), "last", null);
        setField(term536534, term536534.getClass(), "propListHead", null);
        setIntField(term536534, term536534.getClass(), "sourcePosition", 0);
        setField(term536534, term536534.getClass(), "jsType", null);
        setField(term536534, term536534.getClass(), "parent", null);
        term536473 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term536475 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term536485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term536473, term536473.getClass(), "str", null);
        setIntField(term536473, term536473.getClass(), "type", 14);
        setField(term536473, term536473.getClass(), "next", null);
        setField(term536475, term536475.getClass(), "functionName", null);
        setBooleanField(term536475, term536475.getClass(), "itsNeedsActivation", false);
        setIntField(term536475, term536475.getClass(), "itsFunctionType", 0);
        setBooleanField(term536475, term536475.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term536475, term536475.getClass(), "encodedSourceStart", 0);
        setIntField(term536475, term536475.getClass(), "encodedSourceEnd", 0);
        setField(term536475, term536475.getClass(), "sourceName", null);
        setIntField(term536475, term536475.getClass(), "baseLineno", 0);
        setIntField(term536475, term536475.getClass(), "endLineno", 0);
        setField(term536475, term536475.getClass(), "functions", null);
        setField(term536475, term536475.getClass(), "regexps", null);
        setField(term536475, term536475.getClass(), "itsVariables", null);
        setField(term536475, term536475.getClass(), "itsConst", null);
        setField(term536475, term536475.getClass(), "itsVariableNames", null);
        setIntField(term536475, term536475.getClass(), "varStart", 0);
        setField(term536475, term536475.getClass(), "compilerData", null);
        setIntField(term536475, term536475.getClass(), "type", 0);
        setIntField(term536485, term536485.getClass(), "type", 0);
        setField(term536485, term536485.getClass(), "next", null);
        setField(term536485, term536485.getClass(), "first", null);
        setField(term536485, term536485.getClass(), "last", null);
        setField(term536485, term536485.getClass(), "propListHead", null);
        setIntField(term536485, term536485.getClass(), "sourcePosition", 0);
        setField(term536485, term536485.getClass(), "jsType", null);
        setField(term536485, term536485.getClass(), "parent", null);
        setField(term536475, term536475.getClass(), "next", term536485);
        setField(term536475, term536475.getClass(), "first", null);
        setField(term536475, term536475.getClass(), "last", null);
        setField(term536475, term536475.getClass(), "propListHead", null);
        setIntField(term536475, term536475.getClass(), "sourcePosition", 0);
        setField(term536475, term536475.getClass(), "jsType", null);
        setField(term536475, term536475.getClass(), "parent", null);
        setField(term536473, term536473.getClass(), "first", term536475);
        setField(term536473, term536473.getClass(), "last", null);
        setField(term536473, term536473.getClass(), "propListHead", null);
        setIntField(term536473, term536473.getClass(), "sourcePosition", 0);
        setField(term536473, term536473.getClass(), "jsType", null);
        setField(term536473, term536473.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term535924;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term535832, args);
        assertTrue(recursiveEquals(term535832, term536533));
        assertTrue(recursiveEquals(term535924, term536534));
        assertTrue(recursiveEquals(retValue, term536473));
    }

};


