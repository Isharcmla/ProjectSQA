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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551014;
     Object term551106;
     Object term551505;
     Object term551506;
     Object term551428;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term551014 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term551106 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term551198 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term551284 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term551198, term551198.getClass(), "next", term551284);
        setIntField(term551198, term551198.getClass(), "type", 0);
        setField(term551106, term551106.getClass(), "first", term551198);
        setIntField(term551106, term551106.getClass(), "type", 101);
        setField(term551106, term551106.getClass(), "parent", null);
        term551505 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term551505, term551505.getClass(), "currentTraversal", null);
        term551506 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term551507 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term551508 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term551506, term551506.getClass(), "str", null);
        setIntField(term551506, term551506.getClass(), "type", 101);
        setField(term551506, term551506.getClass(), "next", null);
        setField(term551507, term551507.getClass(), "str", null);
        setIntField(term551507, term551507.getClass(), "type", 0);
        setField(term551508, term551508.getClass(), "functionName", null);
        setBooleanField(term551508, term551508.getClass(), "itsNeedsActivation", false);
        setIntField(term551508, term551508.getClass(), "itsFunctionType", 0);
        setBooleanField(term551508, term551508.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term551508, term551508.getClass(), "encodedSourceStart", 0);
        setIntField(term551508, term551508.getClass(), "encodedSourceEnd", 0);
        setField(term551508, term551508.getClass(), "sourceName", null);
        setIntField(term551508, term551508.getClass(), "baseLineno", 0);
        setIntField(term551508, term551508.getClass(), "endLineno", 0);
        setField(term551508, term551508.getClass(), "functions", null);
        setField(term551508, term551508.getClass(), "regexps", null);
        setField(term551508, term551508.getClass(), "itsVariables", null);
        setField(term551508, term551508.getClass(), "itsConst", null);
        setField(term551508, term551508.getClass(), "itsVariableNames", null);
        setIntField(term551508, term551508.getClass(), "varStart", 0);
        setField(term551508, term551508.getClass(), "compilerData", null);
        setIntField(term551508, term551508.getClass(), "type", 0);
        setField(term551508, term551508.getClass(), "next", null);
        setField(term551508, term551508.getClass(), "first", null);
        setField(term551508, term551508.getClass(), "last", null);
        setField(term551508, term551508.getClass(), "propListHead", null);
        setIntField(term551508, term551508.getClass(), "sourcePosition", 0);
        setField(term551508, term551508.getClass(), "jsType", null);
        setField(term551508, term551508.getClass(), "parent", null);
        setField(term551507, term551507.getClass(), "next", term551508);
        setField(term551507, term551507.getClass(), "first", null);
        setField(term551507, term551507.getClass(), "last", null);
        setField(term551507, term551507.getClass(), "propListHead", null);
        setIntField(term551507, term551507.getClass(), "sourcePosition", 0);
        setField(term551507, term551507.getClass(), "jsType", null);
        setField(term551507, term551507.getClass(), "parent", null);
        setField(term551506, term551506.getClass(), "first", term551507);
        setField(term551506, term551506.getClass(), "last", null);
        setField(term551506, term551506.getClass(), "propListHead", null);
        setIntField(term551506, term551506.getClass(), "sourcePosition", 0);
        setField(term551506, term551506.getClass(), "jsType", null);
        setField(term551506, term551506.getClass(), "parent", null);
        term551428 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term551430 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term551432 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term551428, term551428.getClass(), "str", null);
        setIntField(term551428, term551428.getClass(), "type", 101);
        setField(term551428, term551428.getClass(), "next", null);
        setField(term551430, term551430.getClass(), "str", null);
        setIntField(term551430, term551430.getClass(), "type", 0);
        setField(term551432, term551432.getClass(), "functionName", null);
        setBooleanField(term551432, term551432.getClass(), "itsNeedsActivation", false);
        setIntField(term551432, term551432.getClass(), "itsFunctionType", 0);
        setBooleanField(term551432, term551432.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term551432, term551432.getClass(), "encodedSourceStart", 0);
        setIntField(term551432, term551432.getClass(), "encodedSourceEnd", 0);
        setField(term551432, term551432.getClass(), "sourceName", null);
        setIntField(term551432, term551432.getClass(), "baseLineno", 0);
        setIntField(term551432, term551432.getClass(), "endLineno", 0);
        setField(term551432, term551432.getClass(), "functions", null);
        setField(term551432, term551432.getClass(), "regexps", null);
        setField(term551432, term551432.getClass(), "itsVariables", null);
        setField(term551432, term551432.getClass(), "itsConst", null);
        setField(term551432, term551432.getClass(), "itsVariableNames", null);
        setIntField(term551432, term551432.getClass(), "varStart", 0);
        setField(term551432, term551432.getClass(), "compilerData", null);
        setIntField(term551432, term551432.getClass(), "type", 0);
        setField(term551432, term551432.getClass(), "next", null);
        setField(term551432, term551432.getClass(), "first", null);
        setField(term551432, term551432.getClass(), "last", null);
        setField(term551432, term551432.getClass(), "propListHead", null);
        setIntField(term551432, term551432.getClass(), "sourcePosition", 0);
        setField(term551432, term551432.getClass(), "jsType", null);
        setField(term551432, term551432.getClass(), "parent", null);
        setField(term551430, term551430.getClass(), "next", term551432);
        setField(term551430, term551430.getClass(), "first", null);
        setField(term551430, term551430.getClass(), "last", null);
        setField(term551430, term551430.getClass(), "propListHead", null);
        setIntField(term551430, term551430.getClass(), "sourcePosition", 0);
        setField(term551430, term551430.getClass(), "jsType", null);
        setField(term551430, term551430.getClass(), "parent", null);
        setField(term551428, term551428.getClass(), "first", term551430);
        setField(term551428, term551428.getClass(), "last", null);
        setField(term551428, term551428.getClass(), "propListHead", null);
        setIntField(term551428, term551428.getClass(), "sourcePosition", 0);
        setField(term551428, term551428.getClass(), "jsType", null);
        setField(term551428, term551428.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term551106;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term551014, args);
        assertTrue(recursiveEquals(term551014, term551505));
        assertTrue(recursiveEquals(term551106, term551506));
        assertTrue(recursiveEquals(retValue, term551428));
    }

};


