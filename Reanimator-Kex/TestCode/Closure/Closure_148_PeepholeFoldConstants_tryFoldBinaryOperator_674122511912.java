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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211859;
     Object term211951;
     Object term212165;
     Object term212166;
     Object term212122;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211859 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term211951 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term212037 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term212107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term212037, term212037.getClass(), "next", term212107);
        setField(term211951, term211951.getClass(), "first", term212037);
        setIntField(term211951, term211951.getClass(), "type", 23);
        term212165 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term212165, term212165.getClass(), "currentTraversal", null);
        term212166 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term212167 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term212168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term212166, term212166.getClass(), "str", null);
        setIntField(term212166, term212166.getClass(), "type", 23);
        setField(term212166, term212166.getClass(), "next", null);
        setField(term212167, term212167.getClass(), "functionName", null);
        setBooleanField(term212167, term212167.getClass(), "itsNeedsActivation", false);
        setIntField(term212167, term212167.getClass(), "itsFunctionType", 0);
        setBooleanField(term212167, term212167.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term212167, term212167.getClass(), "encodedSourceStart", 0);
        setIntField(term212167, term212167.getClass(), "encodedSourceEnd", 0);
        setField(term212167, term212167.getClass(), "sourceName", null);
        setIntField(term212167, term212167.getClass(), "baseLineno", 0);
        setIntField(term212167, term212167.getClass(), "endLineno", 0);
        setField(term212167, term212167.getClass(), "functions", null);
        setField(term212167, term212167.getClass(), "regexps", null);
        setField(term212167, term212167.getClass(), "itsVariables", null);
        setField(term212167, term212167.getClass(), "itsConst", null);
        setField(term212167, term212167.getClass(), "itsVariableNames", null);
        setIntField(term212167, term212167.getClass(), "varStart", 0);
        setField(term212167, term212167.getClass(), "compilerData", null);
        setIntField(term212167, term212167.getClass(), "type", 0);
        setIntField(term212168, term212168.getClass(), "type", 0);
        setField(term212168, term212168.getClass(), "next", null);
        setField(term212168, term212168.getClass(), "first", null);
        setField(term212168, term212168.getClass(), "last", null);
        setField(term212168, term212168.getClass(), "propListHead", null);
        setIntField(term212168, term212168.getClass(), "sourcePosition", 0);
        setField(term212168, term212168.getClass(), "jsType", null);
        setField(term212168, term212168.getClass(), "parent", null);
        setField(term212167, term212167.getClass(), "next", term212168);
        setField(term212167, term212167.getClass(), "first", null);
        setField(term212167, term212167.getClass(), "last", null);
        setField(term212167, term212167.getClass(), "propListHead", null);
        setIntField(term212167, term212167.getClass(), "sourcePosition", 0);
        setField(term212167, term212167.getClass(), "jsType", null);
        setField(term212167, term212167.getClass(), "parent", null);
        setField(term212166, term212166.getClass(), "first", term212167);
        setField(term212166, term212166.getClass(), "last", null);
        setField(term212166, term212166.getClass(), "propListHead", null);
        setIntField(term212166, term212166.getClass(), "sourcePosition", 0);
        setField(term212166, term212166.getClass(), "jsType", null);
        setField(term212166, term212166.getClass(), "parent", null);
        term212122 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term212124 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term212134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term212122, term212122.getClass(), "str", null);
        setIntField(term212122, term212122.getClass(), "type", 23);
        setField(term212122, term212122.getClass(), "next", null);
        setField(term212124, term212124.getClass(), "functionName", null);
        setBooleanField(term212124, term212124.getClass(), "itsNeedsActivation", false);
        setIntField(term212124, term212124.getClass(), "itsFunctionType", 0);
        setBooleanField(term212124, term212124.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term212124, term212124.getClass(), "encodedSourceStart", 0);
        setIntField(term212124, term212124.getClass(), "encodedSourceEnd", 0);
        setField(term212124, term212124.getClass(), "sourceName", null);
        setIntField(term212124, term212124.getClass(), "baseLineno", 0);
        setIntField(term212124, term212124.getClass(), "endLineno", 0);
        setField(term212124, term212124.getClass(), "functions", null);
        setField(term212124, term212124.getClass(), "regexps", null);
        setField(term212124, term212124.getClass(), "itsVariables", null);
        setField(term212124, term212124.getClass(), "itsConst", null);
        setField(term212124, term212124.getClass(), "itsVariableNames", null);
        setIntField(term212124, term212124.getClass(), "varStart", 0);
        setField(term212124, term212124.getClass(), "compilerData", null);
        setIntField(term212124, term212124.getClass(), "type", 0);
        setIntField(term212134, term212134.getClass(), "type", 0);
        setField(term212134, term212134.getClass(), "next", null);
        setField(term212134, term212134.getClass(), "first", null);
        setField(term212134, term212134.getClass(), "last", null);
        setField(term212134, term212134.getClass(), "propListHead", null);
        setIntField(term212134, term212134.getClass(), "sourcePosition", 0);
        setField(term212134, term212134.getClass(), "jsType", null);
        setField(term212134, term212134.getClass(), "parent", null);
        setField(term212124, term212124.getClass(), "next", term212134);
        setField(term212124, term212124.getClass(), "first", null);
        setField(term212124, term212124.getClass(), "last", null);
        setField(term212124, term212124.getClass(), "propListHead", null);
        setIntField(term212124, term212124.getClass(), "sourcePosition", 0);
        setField(term212124, term212124.getClass(), "jsType", null);
        setField(term212124, term212124.getClass(), "parent", null);
        setField(term212122, term212122.getClass(), "first", term212124);
        setField(term212122, term212122.getClass(), "last", null);
        setField(term212122, term212122.getClass(), "propListHead", null);
        setIntField(term212122, term212122.getClass(), "sourcePosition", 0);
        setField(term212122, term212122.getClass(), "jsType", null);
        setField(term212122, term212122.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term211951;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term211859, args);
        assertTrue(recursiveEquals(term211859, term212165));
        assertTrue(recursiveEquals(term211951, term212166));
        assertTrue(recursiveEquals(retValue, term212122));
    }

};


