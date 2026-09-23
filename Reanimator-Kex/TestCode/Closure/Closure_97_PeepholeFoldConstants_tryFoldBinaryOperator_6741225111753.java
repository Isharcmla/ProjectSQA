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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term688059;
     Object term688145;
     Object term688776;
     Object term688777;
     Object term688715;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term688059 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term688145 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term688231 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term688323 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term688231, term688231.getClass(), "next", term688323);
        setIntField(term688231, term688231.getClass(), "type", 39);
        setField(term688145, term688145.getClass(), "first", term688231);
        setIntField(term688145, term688145.getClass(), "type", 18);
        term688776 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term688776, term688776.getClass(), "currentTraversal", null);
        term688777 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term688778 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term688779 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term688777, term688777.getClass(), "functionName", null);
        setBooleanField(term688777, term688777.getClass(), "itsNeedsActivation", false);
        setIntField(term688777, term688777.getClass(), "itsFunctionType", 0);
        setBooleanField(term688777, term688777.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term688777, term688777.getClass(), "encodedSourceStart", 0);
        setIntField(term688777, term688777.getClass(), "encodedSourceEnd", 0);
        setField(term688777, term688777.getClass(), "sourceName", null);
        setIntField(term688777, term688777.getClass(), "baseLineno", 0);
        setIntField(term688777, term688777.getClass(), "endLineno", 0);
        setField(term688777, term688777.getClass(), "functions", null);
        setField(term688777, term688777.getClass(), "regexps", null);
        setField(term688777, term688777.getClass(), "itsVariables", null);
        setField(term688777, term688777.getClass(), "itsConst", null);
        setField(term688777, term688777.getClass(), "itsVariableNames", null);
        setIntField(term688777, term688777.getClass(), "varStart", 0);
        setField(term688777, term688777.getClass(), "compilerData", null);
        setIntField(term688777, term688777.getClass(), "type", 18);
        setField(term688777, term688777.getClass(), "next", null);
        setField(term688778, term688778.getClass(), "functionName", null);
        setBooleanField(term688778, term688778.getClass(), "itsNeedsActivation", false);
        setIntField(term688778, term688778.getClass(), "itsFunctionType", 0);
        setBooleanField(term688778, term688778.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term688778, term688778.getClass(), "encodedSourceStart", 0);
        setIntField(term688778, term688778.getClass(), "encodedSourceEnd", 0);
        setField(term688778, term688778.getClass(), "sourceName", null);
        setIntField(term688778, term688778.getClass(), "baseLineno", 0);
        setIntField(term688778, term688778.getClass(), "endLineno", 0);
        setField(term688778, term688778.getClass(), "functions", null);
        setField(term688778, term688778.getClass(), "regexps", null);
        setField(term688778, term688778.getClass(), "itsVariables", null);
        setField(term688778, term688778.getClass(), "itsConst", null);
        setField(term688778, term688778.getClass(), "itsVariableNames", null);
        setIntField(term688778, term688778.getClass(), "varStart", 0);
        setField(term688778, term688778.getClass(), "compilerData", null);
        setIntField(term688778, term688778.getClass(), "type", 39);
        setField(term688779, term688779.getClass(), "str", null);
        setIntField(term688779, term688779.getClass(), "type", 0);
        setField(term688779, term688779.getClass(), "next", null);
        setField(term688779, term688779.getClass(), "first", null);
        setField(term688779, term688779.getClass(), "last", null);
        setField(term688779, term688779.getClass(), "propListHead", null);
        setIntField(term688779, term688779.getClass(), "sourcePosition", 0);
        setField(term688779, term688779.getClass(), "jsType", null);
        setField(term688779, term688779.getClass(), "parent", null);
        setField(term688778, term688778.getClass(), "next", term688779);
        setField(term688778, term688778.getClass(), "first", null);
        setField(term688778, term688778.getClass(), "last", null);
        setField(term688778, term688778.getClass(), "propListHead", null);
        setIntField(term688778, term688778.getClass(), "sourcePosition", 0);
        setField(term688778, term688778.getClass(), "jsType", null);
        setField(term688778, term688778.getClass(), "parent", null);
        setField(term688777, term688777.getClass(), "first", term688778);
        setField(term688777, term688777.getClass(), "last", null);
        setField(term688777, term688777.getClass(), "propListHead", null);
        setIntField(term688777, term688777.getClass(), "sourcePosition", 0);
        setField(term688777, term688777.getClass(), "jsType", null);
        setField(term688777, term688777.getClass(), "parent", null);
        term688715 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term688725 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term688735 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term688715, term688715.getClass(), "functionName", null);
        setBooleanField(term688715, term688715.getClass(), "itsNeedsActivation", false);
        setIntField(term688715, term688715.getClass(), "itsFunctionType", 0);
        setBooleanField(term688715, term688715.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term688715, term688715.getClass(), "encodedSourceStart", 0);
        setIntField(term688715, term688715.getClass(), "encodedSourceEnd", 0);
        setField(term688715, term688715.getClass(), "sourceName", null);
        setIntField(term688715, term688715.getClass(), "baseLineno", 0);
        setIntField(term688715, term688715.getClass(), "endLineno", 0);
        setField(term688715, term688715.getClass(), "functions", null);
        setField(term688715, term688715.getClass(), "regexps", null);
        setField(term688715, term688715.getClass(), "itsVariables", null);
        setField(term688715, term688715.getClass(), "itsConst", null);
        setField(term688715, term688715.getClass(), "itsVariableNames", null);
        setIntField(term688715, term688715.getClass(), "varStart", 0);
        setField(term688715, term688715.getClass(), "compilerData", null);
        setIntField(term688715, term688715.getClass(), "type", 18);
        setField(term688715, term688715.getClass(), "next", null);
        setField(term688725, term688725.getClass(), "functionName", null);
        setBooleanField(term688725, term688725.getClass(), "itsNeedsActivation", false);
        setIntField(term688725, term688725.getClass(), "itsFunctionType", 0);
        setBooleanField(term688725, term688725.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term688725, term688725.getClass(), "encodedSourceStart", 0);
        setIntField(term688725, term688725.getClass(), "encodedSourceEnd", 0);
        setField(term688725, term688725.getClass(), "sourceName", null);
        setIntField(term688725, term688725.getClass(), "baseLineno", 0);
        setIntField(term688725, term688725.getClass(), "endLineno", 0);
        setField(term688725, term688725.getClass(), "functions", null);
        setField(term688725, term688725.getClass(), "regexps", null);
        setField(term688725, term688725.getClass(), "itsVariables", null);
        setField(term688725, term688725.getClass(), "itsConst", null);
        setField(term688725, term688725.getClass(), "itsVariableNames", null);
        setIntField(term688725, term688725.getClass(), "varStart", 0);
        setField(term688725, term688725.getClass(), "compilerData", null);
        setIntField(term688725, term688725.getClass(), "type", 39);
        setField(term688735, term688735.getClass(), "str", null);
        setIntField(term688735, term688735.getClass(), "type", 0);
        setField(term688735, term688735.getClass(), "next", null);
        setField(term688735, term688735.getClass(), "first", null);
        setField(term688735, term688735.getClass(), "last", null);
        setField(term688735, term688735.getClass(), "propListHead", null);
        setIntField(term688735, term688735.getClass(), "sourcePosition", 0);
        setField(term688735, term688735.getClass(), "jsType", null);
        setField(term688735, term688735.getClass(), "parent", null);
        setField(term688725, term688725.getClass(), "next", term688735);
        setField(term688725, term688725.getClass(), "first", null);
        setField(term688725, term688725.getClass(), "last", null);
        setField(term688725, term688725.getClass(), "propListHead", null);
        setIntField(term688725, term688725.getClass(), "sourcePosition", 0);
        setField(term688725, term688725.getClass(), "jsType", null);
        setField(term688725, term688725.getClass(), "parent", null);
        setField(term688715, term688715.getClass(), "first", term688725);
        setField(term688715, term688715.getClass(), "last", null);
        setField(term688715, term688715.getClass(), "propListHead", null);
        setIntField(term688715, term688715.getClass(), "sourcePosition", 0);
        setField(term688715, term688715.getClass(), "jsType", null);
        setField(term688715, term688715.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term688145;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term688059, args);
        assertTrue(recursiveEquals(term688059, term688776));
        assertTrue(recursiveEquals(term688145, term688777));
        assertTrue(recursiveEquals(retValue, term688715));
    }

};


