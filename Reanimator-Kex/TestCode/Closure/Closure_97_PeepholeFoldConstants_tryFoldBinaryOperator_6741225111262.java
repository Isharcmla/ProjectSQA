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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423148;
     Object term423234;
     Object term423498;
     Object term423499;
     Object term423428;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423148 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term423234 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423320 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423412 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term423320, term423320.getClass(), "next", term423412);
        setIntField(term423320, term423320.getClass(), "type", 39);
        setField(term423234, term423234.getClass(), "first", term423320);
        setIntField(term423234, term423234.getClass(), "type", 9);
        term423498 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term423498, term423498.getClass(), "currentTraversal", null);
        term423499 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423500 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423501 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term423499, term423499.getClass(), "functionName", null);
        setBooleanField(term423499, term423499.getClass(), "itsNeedsActivation", false);
        setIntField(term423499, term423499.getClass(), "itsFunctionType", 0);
        setBooleanField(term423499, term423499.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423499, term423499.getClass(), "encodedSourceStart", 0);
        setIntField(term423499, term423499.getClass(), "encodedSourceEnd", 0);
        setField(term423499, term423499.getClass(), "sourceName", null);
        setIntField(term423499, term423499.getClass(), "baseLineno", 0);
        setIntField(term423499, term423499.getClass(), "endLineno", 0);
        setField(term423499, term423499.getClass(), "functions", null);
        setField(term423499, term423499.getClass(), "regexps", null);
        setField(term423499, term423499.getClass(), "itsVariables", null);
        setField(term423499, term423499.getClass(), "itsConst", null);
        setField(term423499, term423499.getClass(), "itsVariableNames", null);
        setIntField(term423499, term423499.getClass(), "varStart", 0);
        setField(term423499, term423499.getClass(), "compilerData", null);
        setIntField(term423499, term423499.getClass(), "type", 9);
        setField(term423499, term423499.getClass(), "next", null);
        setField(term423500, term423500.getClass(), "functionName", null);
        setBooleanField(term423500, term423500.getClass(), "itsNeedsActivation", false);
        setIntField(term423500, term423500.getClass(), "itsFunctionType", 0);
        setBooleanField(term423500, term423500.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423500, term423500.getClass(), "encodedSourceStart", 0);
        setIntField(term423500, term423500.getClass(), "encodedSourceEnd", 0);
        setField(term423500, term423500.getClass(), "sourceName", null);
        setIntField(term423500, term423500.getClass(), "baseLineno", 0);
        setIntField(term423500, term423500.getClass(), "endLineno", 0);
        setField(term423500, term423500.getClass(), "functions", null);
        setField(term423500, term423500.getClass(), "regexps", null);
        setField(term423500, term423500.getClass(), "itsVariables", null);
        setField(term423500, term423500.getClass(), "itsConst", null);
        setField(term423500, term423500.getClass(), "itsVariableNames", null);
        setIntField(term423500, term423500.getClass(), "varStart", 0);
        setField(term423500, term423500.getClass(), "compilerData", null);
        setIntField(term423500, term423500.getClass(), "type", 39);
        setDoubleField(term423501, term423501.getClass(), "number", 0.0);
        setIntField(term423501, term423501.getClass(), "type", 0);
        setField(term423501, term423501.getClass(), "next", null);
        setField(term423501, term423501.getClass(), "first", null);
        setField(term423501, term423501.getClass(), "last", null);
        setField(term423501, term423501.getClass(), "propListHead", null);
        setIntField(term423501, term423501.getClass(), "sourcePosition", 0);
        setField(term423501, term423501.getClass(), "jsType", null);
        setField(term423501, term423501.getClass(), "parent", null);
        setField(term423500, term423500.getClass(), "next", term423501);
        setField(term423500, term423500.getClass(), "first", null);
        setField(term423500, term423500.getClass(), "last", null);
        setField(term423500, term423500.getClass(), "propListHead", null);
        setIntField(term423500, term423500.getClass(), "sourcePosition", 0);
        setField(term423500, term423500.getClass(), "jsType", null);
        setField(term423500, term423500.getClass(), "parent", null);
        setField(term423499, term423499.getClass(), "first", term423500);
        setField(term423499, term423499.getClass(), "last", null);
        setField(term423499, term423499.getClass(), "propListHead", null);
        setIntField(term423499, term423499.getClass(), "sourcePosition", 0);
        setField(term423499, term423499.getClass(), "jsType", null);
        setField(term423499, term423499.getClass(), "parent", null);
        term423428 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423438 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423448 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term423428, term423428.getClass(), "functionName", null);
        setBooleanField(term423428, term423428.getClass(), "itsNeedsActivation", false);
        setIntField(term423428, term423428.getClass(), "itsFunctionType", 0);
        setBooleanField(term423428, term423428.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423428, term423428.getClass(), "encodedSourceStart", 0);
        setIntField(term423428, term423428.getClass(), "encodedSourceEnd", 0);
        setField(term423428, term423428.getClass(), "sourceName", null);
        setIntField(term423428, term423428.getClass(), "baseLineno", 0);
        setIntField(term423428, term423428.getClass(), "endLineno", 0);
        setField(term423428, term423428.getClass(), "functions", null);
        setField(term423428, term423428.getClass(), "regexps", null);
        setField(term423428, term423428.getClass(), "itsVariables", null);
        setField(term423428, term423428.getClass(), "itsConst", null);
        setField(term423428, term423428.getClass(), "itsVariableNames", null);
        setIntField(term423428, term423428.getClass(), "varStart", 0);
        setField(term423428, term423428.getClass(), "compilerData", null);
        setIntField(term423428, term423428.getClass(), "type", 9);
        setField(term423428, term423428.getClass(), "next", null);
        setField(term423438, term423438.getClass(), "functionName", null);
        setBooleanField(term423438, term423438.getClass(), "itsNeedsActivation", false);
        setIntField(term423438, term423438.getClass(), "itsFunctionType", 0);
        setBooleanField(term423438, term423438.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423438, term423438.getClass(), "encodedSourceStart", 0);
        setIntField(term423438, term423438.getClass(), "encodedSourceEnd", 0);
        setField(term423438, term423438.getClass(), "sourceName", null);
        setIntField(term423438, term423438.getClass(), "baseLineno", 0);
        setIntField(term423438, term423438.getClass(), "endLineno", 0);
        setField(term423438, term423438.getClass(), "functions", null);
        setField(term423438, term423438.getClass(), "regexps", null);
        setField(term423438, term423438.getClass(), "itsVariables", null);
        setField(term423438, term423438.getClass(), "itsConst", null);
        setField(term423438, term423438.getClass(), "itsVariableNames", null);
        setIntField(term423438, term423438.getClass(), "varStart", 0);
        setField(term423438, term423438.getClass(), "compilerData", null);
        setIntField(term423438, term423438.getClass(), "type", 39);
        setDoubleField(term423448, term423448.getClass(), "number", 0.0);
        setIntField(term423448, term423448.getClass(), "type", 0);
        setField(term423448, term423448.getClass(), "next", null);
        setField(term423448, term423448.getClass(), "first", null);
        setField(term423448, term423448.getClass(), "last", null);
        setField(term423448, term423448.getClass(), "propListHead", null);
        setIntField(term423448, term423448.getClass(), "sourcePosition", 0);
        setField(term423448, term423448.getClass(), "jsType", null);
        setField(term423448, term423448.getClass(), "parent", null);
        setField(term423438, term423438.getClass(), "next", term423448);
        setField(term423438, term423438.getClass(), "first", null);
        setField(term423438, term423438.getClass(), "last", null);
        setField(term423438, term423438.getClass(), "propListHead", null);
        setIntField(term423438, term423438.getClass(), "sourcePosition", 0);
        setField(term423438, term423438.getClass(), "jsType", null);
        setField(term423438, term423438.getClass(), "parent", null);
        setField(term423428, term423428.getClass(), "first", term423438);
        setField(term423428, term423428.getClass(), "last", null);
        setField(term423428, term423428.getClass(), "propListHead", null);
        setIntField(term423428, term423428.getClass(), "sourcePosition", 0);
        setField(term423428, term423428.getClass(), "jsType", null);
        setField(term423428, term423428.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term423234;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term423148, args);
        assertTrue(recursiveEquals(term423148, term423498));
        assertTrue(recursiveEquals(term423234, term423499));
        assertTrue(recursiveEquals(retValue, term423428));
    }

};


