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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term666383;
     Object term666475;
     Object term667535;
     Object term667536;
     Object term667483;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term666383 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term666475 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term666561 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term666631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term666561, term666561.getClass(), "next", term666631);
        setField(term666475, term666475.getClass(), "first", term666561);
        setIntField(term666475, term666475.getClass(), "type", 45);
        term667535 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term667535, term667535.getClass(), "currentTraversal", null);
        term667536 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term667537 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term667538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term667536, term667536.getClass(), "number", 0.0);
        setIntField(term667536, term667536.getClass(), "type", 45);
        setField(term667536, term667536.getClass(), "next", null);
        setField(term667537, term667537.getClass(), "functionName", null);
        setBooleanField(term667537, term667537.getClass(), "itsNeedsActivation", false);
        setIntField(term667537, term667537.getClass(), "itsFunctionType", 0);
        setBooleanField(term667537, term667537.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term667537, term667537.getClass(), "encodedSourceStart", 0);
        setIntField(term667537, term667537.getClass(), "encodedSourceEnd", 0);
        setField(term667537, term667537.getClass(), "sourceName", null);
        setIntField(term667537, term667537.getClass(), "baseLineno", 0);
        setIntField(term667537, term667537.getClass(), "endLineno", 0);
        setField(term667537, term667537.getClass(), "functions", null);
        setField(term667537, term667537.getClass(), "regexps", null);
        setField(term667537, term667537.getClass(), "itsVariables", null);
        setField(term667537, term667537.getClass(), "itsConst", null);
        setField(term667537, term667537.getClass(), "itsVariableNames", null);
        setIntField(term667537, term667537.getClass(), "varStart", 0);
        setField(term667537, term667537.getClass(), "compilerData", null);
        setIntField(term667537, term667537.getClass(), "type", 0);
        setIntField(term667538, term667538.getClass(), "type", 0);
        setField(term667538, term667538.getClass(), "next", null);
        setField(term667538, term667538.getClass(), "first", null);
        setField(term667538, term667538.getClass(), "last", null);
        setField(term667538, term667538.getClass(), "propListHead", null);
        setIntField(term667538, term667538.getClass(), "sourcePosition", 0);
        setField(term667538, term667538.getClass(), "jsType", null);
        setField(term667538, term667538.getClass(), "parent", null);
        setField(term667537, term667537.getClass(), "next", term667538);
        setField(term667537, term667537.getClass(), "first", null);
        setField(term667537, term667537.getClass(), "last", null);
        setField(term667537, term667537.getClass(), "propListHead", null);
        setIntField(term667537, term667537.getClass(), "sourcePosition", 0);
        setField(term667537, term667537.getClass(), "jsType", null);
        setField(term667537, term667537.getClass(), "parent", null);
        setField(term667536, term667536.getClass(), "first", term667537);
        setField(term667536, term667536.getClass(), "last", null);
        setField(term667536, term667536.getClass(), "propListHead", null);
        setIntField(term667536, term667536.getClass(), "sourcePosition", 0);
        setField(term667536, term667536.getClass(), "jsType", null);
        setField(term667536, term667536.getClass(), "parent", null);
        term667483 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term667486 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term667496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term667483, term667483.getClass(), "number", 0.0);
        setIntField(term667483, term667483.getClass(), "type", 45);
        setField(term667483, term667483.getClass(), "next", null);
        setField(term667486, term667486.getClass(), "functionName", null);
        setBooleanField(term667486, term667486.getClass(), "itsNeedsActivation", false);
        setIntField(term667486, term667486.getClass(), "itsFunctionType", 0);
        setBooleanField(term667486, term667486.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term667486, term667486.getClass(), "encodedSourceStart", 0);
        setIntField(term667486, term667486.getClass(), "encodedSourceEnd", 0);
        setField(term667486, term667486.getClass(), "sourceName", null);
        setIntField(term667486, term667486.getClass(), "baseLineno", 0);
        setIntField(term667486, term667486.getClass(), "endLineno", 0);
        setField(term667486, term667486.getClass(), "functions", null);
        setField(term667486, term667486.getClass(), "regexps", null);
        setField(term667486, term667486.getClass(), "itsVariables", null);
        setField(term667486, term667486.getClass(), "itsConst", null);
        setField(term667486, term667486.getClass(), "itsVariableNames", null);
        setIntField(term667486, term667486.getClass(), "varStart", 0);
        setField(term667486, term667486.getClass(), "compilerData", null);
        setIntField(term667486, term667486.getClass(), "type", 0);
        setIntField(term667496, term667496.getClass(), "type", 0);
        setField(term667496, term667496.getClass(), "next", null);
        setField(term667496, term667496.getClass(), "first", null);
        setField(term667496, term667496.getClass(), "last", null);
        setField(term667496, term667496.getClass(), "propListHead", null);
        setIntField(term667496, term667496.getClass(), "sourcePosition", 0);
        setField(term667496, term667496.getClass(), "jsType", null);
        setField(term667496, term667496.getClass(), "parent", null);
        setField(term667486, term667486.getClass(), "next", term667496);
        setField(term667486, term667486.getClass(), "first", null);
        setField(term667486, term667486.getClass(), "last", null);
        setField(term667486, term667486.getClass(), "propListHead", null);
        setIntField(term667486, term667486.getClass(), "sourcePosition", 0);
        setField(term667486, term667486.getClass(), "jsType", null);
        setField(term667486, term667486.getClass(), "parent", null);
        setField(term667483, term667483.getClass(), "first", term667486);
        setField(term667483, term667483.getClass(), "last", null);
        setField(term667483, term667483.getClass(), "propListHead", null);
        setIntField(term667483, term667483.getClass(), "sourcePosition", 0);
        setField(term667483, term667483.getClass(), "jsType", null);
        setField(term667483, term667483.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term666475;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term666383, args);
        assertTrue(recursiveEquals(term666383, term667535));
        assertTrue(recursiveEquals(term666475, term667536));
        assertTrue(recursiveEquals(retValue, term667483));
    }

};


