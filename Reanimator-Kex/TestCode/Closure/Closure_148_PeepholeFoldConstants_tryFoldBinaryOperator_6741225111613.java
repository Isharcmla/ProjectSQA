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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410508;
     Object term410600;
     Object term411387;
     Object term411388;
     Object term411297;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410508 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term410600 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term410686 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term410756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term410756, term410756.getClass(), "type", 47);
        setField(term410686, term410686.getClass(), "next", term410756);
        setIntField(term410686, term410686.getClass(), "type", 0);
        setField(term410600, term410600.getClass(), "first", term410686);
        setIntField(term410600, term410600.getClass(), "type", 101);
        setField(term410600, term410600.getClass(), "parent", term410826);
        term411387 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term411387, term411387.getClass(), "currentTraversal", null);
        term411388 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term411389 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term411390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term411388, term411388.getClass(), "str", null);
        setIntField(term411388, term411388.getClass(), "type", 101);
        setField(term411388, term411388.getClass(), "next", null);
        setField(term411389, term411389.getClass(), "functionName", null);
        setBooleanField(term411389, term411389.getClass(), "itsNeedsActivation", false);
        setIntField(term411389, term411389.getClass(), "itsFunctionType", 0);
        setBooleanField(term411389, term411389.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term411389, term411389.getClass(), "encodedSourceStart", 0);
        setIntField(term411389, term411389.getClass(), "encodedSourceEnd", 0);
        setField(term411389, term411389.getClass(), "sourceName", null);
        setIntField(term411389, term411389.getClass(), "baseLineno", 0);
        setIntField(term411389, term411389.getClass(), "endLineno", 0);
        setField(term411389, term411389.getClass(), "functions", null);
        setField(term411389, term411389.getClass(), "regexps", null);
        setField(term411389, term411389.getClass(), "itsVariables", null);
        setField(term411389, term411389.getClass(), "itsConst", null);
        setField(term411389, term411389.getClass(), "itsVariableNames", null);
        setIntField(term411389, term411389.getClass(), "varStart", 0);
        setField(term411389, term411389.getClass(), "compilerData", null);
        setIntField(term411389, term411389.getClass(), "type", 0);
        setIntField(term411390, term411390.getClass(), "type", 47);
        setField(term411390, term411390.getClass(), "next", null);
        setField(term411390, term411390.getClass(), "first", null);
        setField(term411390, term411390.getClass(), "last", null);
        setField(term411390, term411390.getClass(), "propListHead", null);
        setIntField(term411390, term411390.getClass(), "sourcePosition", 0);
        setField(term411390, term411390.getClass(), "jsType", null);
        setField(term411390, term411390.getClass(), "parent", null);
        setField(term411389, term411389.getClass(), "next", term411390);
        setField(term411389, term411389.getClass(), "first", null);
        setField(term411389, term411389.getClass(), "last", null);
        setField(term411389, term411389.getClass(), "propListHead", null);
        setIntField(term411389, term411389.getClass(), "sourcePosition", 0);
        setField(term411389, term411389.getClass(), "jsType", null);
        setField(term411389, term411389.getClass(), "parent", null);
        setField(term411388, term411388.getClass(), "first", term411389);
        setField(term411388, term411388.getClass(), "last", null);
        setField(term411388, term411388.getClass(), "propListHead", null);
        setIntField(term411388, term411388.getClass(), "sourcePosition", 0);
        setField(term411388, term411388.getClass(), "jsType", null);
        setIntField(term411391, term411391.getClass(), "type", 0);
        setField(term411391, term411391.getClass(), "next", null);
        setField(term411391, term411391.getClass(), "first", null);
        setField(term411391, term411391.getClass(), "last", null);
        setField(term411391, term411391.getClass(), "propListHead", null);
        setIntField(term411391, term411391.getClass(), "sourcePosition", 0);
        setField(term411391, term411391.getClass(), "jsType", null);
        setField(term411391, term411391.getClass(), "parent", null);
        setField(term411388, term411388.getClass(), "parent", term411391);
        term411297 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term411299 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term411309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term411297, term411297.getClass(), "str", null);
        setIntField(term411297, term411297.getClass(), "type", 101);
        setField(term411297, term411297.getClass(), "next", null);
        setField(term411299, term411299.getClass(), "functionName", null);
        setBooleanField(term411299, term411299.getClass(), "itsNeedsActivation", false);
        setIntField(term411299, term411299.getClass(), "itsFunctionType", 0);
        setBooleanField(term411299, term411299.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term411299, term411299.getClass(), "encodedSourceStart", 0);
        setIntField(term411299, term411299.getClass(), "encodedSourceEnd", 0);
        setField(term411299, term411299.getClass(), "sourceName", null);
        setIntField(term411299, term411299.getClass(), "baseLineno", 0);
        setIntField(term411299, term411299.getClass(), "endLineno", 0);
        setField(term411299, term411299.getClass(), "functions", null);
        setField(term411299, term411299.getClass(), "regexps", null);
        setField(term411299, term411299.getClass(), "itsVariables", null);
        setField(term411299, term411299.getClass(), "itsConst", null);
        setField(term411299, term411299.getClass(), "itsVariableNames", null);
        setIntField(term411299, term411299.getClass(), "varStart", 0);
        setField(term411299, term411299.getClass(), "compilerData", null);
        setIntField(term411299, term411299.getClass(), "type", 0);
        setIntField(term411309, term411309.getClass(), "type", 47);
        setField(term411309, term411309.getClass(), "next", null);
        setField(term411309, term411309.getClass(), "first", null);
        setField(term411309, term411309.getClass(), "last", null);
        setField(term411309, term411309.getClass(), "propListHead", null);
        setIntField(term411309, term411309.getClass(), "sourcePosition", 0);
        setField(term411309, term411309.getClass(), "jsType", null);
        setField(term411309, term411309.getClass(), "parent", null);
        setField(term411299, term411299.getClass(), "next", term411309);
        setField(term411299, term411299.getClass(), "first", null);
        setField(term411299, term411299.getClass(), "last", null);
        setField(term411299, term411299.getClass(), "propListHead", null);
        setIntField(term411299, term411299.getClass(), "sourcePosition", 0);
        setField(term411299, term411299.getClass(), "jsType", null);
        setField(term411299, term411299.getClass(), "parent", null);
        setField(term411297, term411297.getClass(), "first", term411299);
        setField(term411297, term411297.getClass(), "last", null);
        setField(term411297, term411297.getClass(), "propListHead", null);
        setIntField(term411297, term411297.getClass(), "sourcePosition", 0);
        setField(term411297, term411297.getClass(), "jsType", null);
        setIntField(term411314, term411314.getClass(), "type", 0);
        setField(term411314, term411314.getClass(), "next", null);
        setField(term411314, term411314.getClass(), "first", null);
        setField(term411314, term411314.getClass(), "last", null);
        setField(term411314, term411314.getClass(), "propListHead", null);
        setIntField(term411314, term411314.getClass(), "sourcePosition", 0);
        setField(term411314, term411314.getClass(), "jsType", null);
        setField(term411314, term411314.getClass(), "parent", null);
        setField(term411297, term411297.getClass(), "parent", term411314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term410600;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term410508, args);
        assertTrue(recursiveEquals(term410508, term411387));
        assertTrue(recursiveEquals(term410600, term411388));
        assertTrue(recursiveEquals(retValue, term411297));
    }

};


