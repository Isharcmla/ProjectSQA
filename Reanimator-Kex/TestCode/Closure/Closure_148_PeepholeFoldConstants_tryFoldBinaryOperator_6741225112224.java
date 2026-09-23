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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term609890;
     Object term609982;
     Object term610209;
     Object term610210;
     Object term610159;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term609890 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term609982 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term610068 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term610138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term610068, term610068.getClass(), "next", term610138);
        setField(term609982, term609982.getClass(), "first", term610068);
        setIntField(term609982, term609982.getClass(), "type", 15);
        term610209 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term610209, term610209.getClass(), "currentTraversal", null);
        term610210 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term610211 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term610212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term610210, term610210.getClass(), "str", null);
        setIntField(term610210, term610210.getClass(), "type", 15);
        setField(term610210, term610210.getClass(), "next", null);
        setField(term610211, term610211.getClass(), "functionName", null);
        setBooleanField(term610211, term610211.getClass(), "itsNeedsActivation", false);
        setIntField(term610211, term610211.getClass(), "itsFunctionType", 0);
        setBooleanField(term610211, term610211.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term610211, term610211.getClass(), "encodedSourceStart", 0);
        setIntField(term610211, term610211.getClass(), "encodedSourceEnd", 0);
        setField(term610211, term610211.getClass(), "sourceName", null);
        setIntField(term610211, term610211.getClass(), "baseLineno", 0);
        setIntField(term610211, term610211.getClass(), "endLineno", 0);
        setField(term610211, term610211.getClass(), "functions", null);
        setField(term610211, term610211.getClass(), "regexps", null);
        setField(term610211, term610211.getClass(), "itsVariables", null);
        setField(term610211, term610211.getClass(), "itsConst", null);
        setField(term610211, term610211.getClass(), "itsVariableNames", null);
        setIntField(term610211, term610211.getClass(), "varStart", 0);
        setField(term610211, term610211.getClass(), "compilerData", null);
        setIntField(term610211, term610211.getClass(), "type", 0);
        setIntField(term610212, term610212.getClass(), "type", 0);
        setField(term610212, term610212.getClass(), "next", null);
        setField(term610212, term610212.getClass(), "first", null);
        setField(term610212, term610212.getClass(), "last", null);
        setField(term610212, term610212.getClass(), "propListHead", null);
        setIntField(term610212, term610212.getClass(), "sourcePosition", 0);
        setField(term610212, term610212.getClass(), "jsType", null);
        setField(term610212, term610212.getClass(), "parent", null);
        setField(term610211, term610211.getClass(), "next", term610212);
        setField(term610211, term610211.getClass(), "first", null);
        setField(term610211, term610211.getClass(), "last", null);
        setField(term610211, term610211.getClass(), "propListHead", null);
        setIntField(term610211, term610211.getClass(), "sourcePosition", 0);
        setField(term610211, term610211.getClass(), "jsType", null);
        setField(term610211, term610211.getClass(), "parent", null);
        setField(term610210, term610210.getClass(), "first", term610211);
        setField(term610210, term610210.getClass(), "last", null);
        setField(term610210, term610210.getClass(), "propListHead", null);
        setIntField(term610210, term610210.getClass(), "sourcePosition", 0);
        setField(term610210, term610210.getClass(), "jsType", null);
        setField(term610210, term610210.getClass(), "parent", null);
        term610159 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term610161 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term610171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term610159, term610159.getClass(), "str", null);
        setIntField(term610159, term610159.getClass(), "type", 15);
        setField(term610159, term610159.getClass(), "next", null);
        setField(term610161, term610161.getClass(), "functionName", null);
        setBooleanField(term610161, term610161.getClass(), "itsNeedsActivation", false);
        setIntField(term610161, term610161.getClass(), "itsFunctionType", 0);
        setBooleanField(term610161, term610161.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term610161, term610161.getClass(), "encodedSourceStart", 0);
        setIntField(term610161, term610161.getClass(), "encodedSourceEnd", 0);
        setField(term610161, term610161.getClass(), "sourceName", null);
        setIntField(term610161, term610161.getClass(), "baseLineno", 0);
        setIntField(term610161, term610161.getClass(), "endLineno", 0);
        setField(term610161, term610161.getClass(), "functions", null);
        setField(term610161, term610161.getClass(), "regexps", null);
        setField(term610161, term610161.getClass(), "itsVariables", null);
        setField(term610161, term610161.getClass(), "itsConst", null);
        setField(term610161, term610161.getClass(), "itsVariableNames", null);
        setIntField(term610161, term610161.getClass(), "varStart", 0);
        setField(term610161, term610161.getClass(), "compilerData", null);
        setIntField(term610161, term610161.getClass(), "type", 0);
        setIntField(term610171, term610171.getClass(), "type", 0);
        setField(term610171, term610171.getClass(), "next", null);
        setField(term610171, term610171.getClass(), "first", null);
        setField(term610171, term610171.getClass(), "last", null);
        setField(term610171, term610171.getClass(), "propListHead", null);
        setIntField(term610171, term610171.getClass(), "sourcePosition", 0);
        setField(term610171, term610171.getClass(), "jsType", null);
        setField(term610171, term610171.getClass(), "parent", null);
        setField(term610161, term610161.getClass(), "next", term610171);
        setField(term610161, term610161.getClass(), "first", null);
        setField(term610161, term610161.getClass(), "last", null);
        setField(term610161, term610161.getClass(), "propListHead", null);
        setIntField(term610161, term610161.getClass(), "sourcePosition", 0);
        setField(term610161, term610161.getClass(), "jsType", null);
        setField(term610161, term610161.getClass(), "parent", null);
        setField(term610159, term610159.getClass(), "first", term610161);
        setField(term610159, term610159.getClass(), "last", null);
        setField(term610159, term610159.getClass(), "propListHead", null);
        setIntField(term610159, term610159.getClass(), "sourcePosition", 0);
        setField(term610159, term610159.getClass(), "jsType", null);
        setField(term610159, term610159.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term609982;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term609890, args);
        assertTrue(recursiveEquals(term609890, term610209));
        assertTrue(recursiveEquals(term609982, term610210));
        assertTrue(recursiveEquals(retValue, term610159));
    }

};


