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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term937339;
     Object term937431;
     Object term938216;
     Object term938217;
     Object term938145;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term937339 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term937431 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term937517 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term937587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term937517, term937517.getClass(), "next", term937587);
        setField(term937431, term937431.getClass(), "first", term937517);
        setIntField(term937431, term937431.getClass(), "type", 101);
        term938216 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term938216, term938216.getClass(), "currentTraversal", null);
        term938217 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term938218 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term938219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term938217, term938217.getClass(), "number", 0.0);
        setIntField(term938217, term938217.getClass(), "type", 101);
        setField(term938217, term938217.getClass(), "next", null);
        setField(term938218, term938218.getClass(), "functionName", null);
        setBooleanField(term938218, term938218.getClass(), "itsNeedsActivation", false);
        setIntField(term938218, term938218.getClass(), "itsFunctionType", 0);
        setBooleanField(term938218, term938218.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term938218, term938218.getClass(), "encodedSourceStart", 0);
        setIntField(term938218, term938218.getClass(), "encodedSourceEnd", 0);
        setField(term938218, term938218.getClass(), "sourceName", null);
        setIntField(term938218, term938218.getClass(), "baseLineno", 0);
        setIntField(term938218, term938218.getClass(), "endLineno", 0);
        setField(term938218, term938218.getClass(), "functions", null);
        setField(term938218, term938218.getClass(), "regexps", null);
        setField(term938218, term938218.getClass(), "itsVariables", null);
        setField(term938218, term938218.getClass(), "itsConst", null);
        setField(term938218, term938218.getClass(), "itsVariableNames", null);
        setIntField(term938218, term938218.getClass(), "varStart", 0);
        setField(term938218, term938218.getClass(), "compilerData", null);
        setIntField(term938218, term938218.getClass(), "type", 0);
        setIntField(term938219, term938219.getClass(), "type", 0);
        setField(term938219, term938219.getClass(), "next", null);
        setField(term938219, term938219.getClass(), "first", null);
        setField(term938219, term938219.getClass(), "last", null);
        setField(term938219, term938219.getClass(), "propListHead", null);
        setIntField(term938219, term938219.getClass(), "sourcePosition", 0);
        setField(term938219, term938219.getClass(), "jsType", null);
        setField(term938219, term938219.getClass(), "parent", null);
        setField(term938218, term938218.getClass(), "next", term938219);
        setField(term938218, term938218.getClass(), "first", null);
        setField(term938218, term938218.getClass(), "last", null);
        setField(term938218, term938218.getClass(), "propListHead", null);
        setIntField(term938218, term938218.getClass(), "sourcePosition", 0);
        setField(term938218, term938218.getClass(), "jsType", null);
        setField(term938218, term938218.getClass(), "parent", null);
        setField(term938217, term938217.getClass(), "first", term938218);
        setField(term938217, term938217.getClass(), "last", null);
        setField(term938217, term938217.getClass(), "propListHead", null);
        setIntField(term938217, term938217.getClass(), "sourcePosition", 0);
        setField(term938217, term938217.getClass(), "jsType", null);
        setField(term938217, term938217.getClass(), "parent", null);
        term938145 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term938148 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term938158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term938145, term938145.getClass(), "number", 0.0);
        setIntField(term938145, term938145.getClass(), "type", 101);
        setField(term938145, term938145.getClass(), "next", null);
        setField(term938148, term938148.getClass(), "functionName", null);
        setBooleanField(term938148, term938148.getClass(), "itsNeedsActivation", false);
        setIntField(term938148, term938148.getClass(), "itsFunctionType", 0);
        setBooleanField(term938148, term938148.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term938148, term938148.getClass(), "encodedSourceStart", 0);
        setIntField(term938148, term938148.getClass(), "encodedSourceEnd", 0);
        setField(term938148, term938148.getClass(), "sourceName", null);
        setIntField(term938148, term938148.getClass(), "baseLineno", 0);
        setIntField(term938148, term938148.getClass(), "endLineno", 0);
        setField(term938148, term938148.getClass(), "functions", null);
        setField(term938148, term938148.getClass(), "regexps", null);
        setField(term938148, term938148.getClass(), "itsVariables", null);
        setField(term938148, term938148.getClass(), "itsConst", null);
        setField(term938148, term938148.getClass(), "itsVariableNames", null);
        setIntField(term938148, term938148.getClass(), "varStart", 0);
        setField(term938148, term938148.getClass(), "compilerData", null);
        setIntField(term938148, term938148.getClass(), "type", 0);
        setIntField(term938158, term938158.getClass(), "type", 0);
        setField(term938158, term938158.getClass(), "next", null);
        setField(term938158, term938158.getClass(), "first", null);
        setField(term938158, term938158.getClass(), "last", null);
        setField(term938158, term938158.getClass(), "propListHead", null);
        setIntField(term938158, term938158.getClass(), "sourcePosition", 0);
        setField(term938158, term938158.getClass(), "jsType", null);
        setField(term938158, term938158.getClass(), "parent", null);
        setField(term938148, term938148.getClass(), "next", term938158);
        setField(term938148, term938148.getClass(), "first", null);
        setField(term938148, term938148.getClass(), "last", null);
        setField(term938148, term938148.getClass(), "propListHead", null);
        setIntField(term938148, term938148.getClass(), "sourcePosition", 0);
        setField(term938148, term938148.getClass(), "jsType", null);
        setField(term938148, term938148.getClass(), "parent", null);
        setField(term938145, term938145.getClass(), "first", term938148);
        setField(term938145, term938145.getClass(), "last", null);
        setField(term938145, term938145.getClass(), "propListHead", null);
        setIntField(term938145, term938145.getClass(), "sourcePosition", 0);
        setField(term938145, term938145.getClass(), "jsType", null);
        setField(term938145, term938145.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term937431;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term937339, args);
        assertTrue(recursiveEquals(term937339, term938216));
        assertTrue(recursiveEquals(term937431, term938217));
        assertTrue(recursiveEquals(retValue, term938145));
    }

};


