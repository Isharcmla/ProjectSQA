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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415061;
     Object term415153;
     Object term415868;
     Object term415869;
     Object term415806;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term415061 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term415153 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term415239 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term415309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term415309, term415309.getClass(), "type", 42);
        setField(term415239, term415239.getClass(), "next", term415309);
        setIntField(term415239, term415239.getClass(), "type", 42);
        setField(term415153, term415153.getClass(), "first", term415239);
        setIntField(term415153, term415153.getClass(), "type", 16);
        term415868 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term415868, term415868.getClass(), "currentTraversal", null);
        term415869 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term415870 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term415871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term415869, term415869.getClass(), "number", 0.0);
        setIntField(term415869, term415869.getClass(), "type", 16);
        setField(term415869, term415869.getClass(), "next", null);
        setField(term415870, term415870.getClass(), "functionName", null);
        setBooleanField(term415870, term415870.getClass(), "itsNeedsActivation", false);
        setIntField(term415870, term415870.getClass(), "itsFunctionType", 0);
        setBooleanField(term415870, term415870.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term415870, term415870.getClass(), "encodedSourceStart", 0);
        setIntField(term415870, term415870.getClass(), "encodedSourceEnd", 0);
        setField(term415870, term415870.getClass(), "sourceName", null);
        setIntField(term415870, term415870.getClass(), "baseLineno", 0);
        setIntField(term415870, term415870.getClass(), "endLineno", 0);
        setField(term415870, term415870.getClass(), "functions", null);
        setField(term415870, term415870.getClass(), "regexps", null);
        setField(term415870, term415870.getClass(), "itsVariables", null);
        setField(term415870, term415870.getClass(), "itsConst", null);
        setField(term415870, term415870.getClass(), "itsVariableNames", null);
        setIntField(term415870, term415870.getClass(), "varStart", 0);
        setField(term415870, term415870.getClass(), "compilerData", null);
        setIntField(term415870, term415870.getClass(), "type", 42);
        setIntField(term415871, term415871.getClass(), "type", 42);
        setField(term415871, term415871.getClass(), "next", null);
        setField(term415871, term415871.getClass(), "first", null);
        setField(term415871, term415871.getClass(), "last", null);
        setField(term415871, term415871.getClass(), "propListHead", null);
        setIntField(term415871, term415871.getClass(), "sourcePosition", 0);
        setField(term415871, term415871.getClass(), "jsType", null);
        setField(term415871, term415871.getClass(), "parent", null);
        setField(term415870, term415870.getClass(), "next", term415871);
        setField(term415870, term415870.getClass(), "first", null);
        setField(term415870, term415870.getClass(), "last", null);
        setField(term415870, term415870.getClass(), "propListHead", null);
        setIntField(term415870, term415870.getClass(), "sourcePosition", 0);
        setField(term415870, term415870.getClass(), "jsType", null);
        setField(term415870, term415870.getClass(), "parent", null);
        setField(term415869, term415869.getClass(), "first", term415870);
        setField(term415869, term415869.getClass(), "last", null);
        setField(term415869, term415869.getClass(), "propListHead", null);
        setIntField(term415869, term415869.getClass(), "sourcePosition", 0);
        setField(term415869, term415869.getClass(), "jsType", null);
        setField(term415869, term415869.getClass(), "parent", null);
        term415806 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term415809 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term415819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term415806, term415806.getClass(), "number", 0.0);
        setIntField(term415806, term415806.getClass(), "type", 16);
        setField(term415806, term415806.getClass(), "next", null);
        setField(term415809, term415809.getClass(), "functionName", null);
        setBooleanField(term415809, term415809.getClass(), "itsNeedsActivation", false);
        setIntField(term415809, term415809.getClass(), "itsFunctionType", 0);
        setBooleanField(term415809, term415809.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term415809, term415809.getClass(), "encodedSourceStart", 0);
        setIntField(term415809, term415809.getClass(), "encodedSourceEnd", 0);
        setField(term415809, term415809.getClass(), "sourceName", null);
        setIntField(term415809, term415809.getClass(), "baseLineno", 0);
        setIntField(term415809, term415809.getClass(), "endLineno", 0);
        setField(term415809, term415809.getClass(), "functions", null);
        setField(term415809, term415809.getClass(), "regexps", null);
        setField(term415809, term415809.getClass(), "itsVariables", null);
        setField(term415809, term415809.getClass(), "itsConst", null);
        setField(term415809, term415809.getClass(), "itsVariableNames", null);
        setIntField(term415809, term415809.getClass(), "varStart", 0);
        setField(term415809, term415809.getClass(), "compilerData", null);
        setIntField(term415809, term415809.getClass(), "type", 42);
        setIntField(term415819, term415819.getClass(), "type", 42);
        setField(term415819, term415819.getClass(), "next", null);
        setField(term415819, term415819.getClass(), "first", null);
        setField(term415819, term415819.getClass(), "last", null);
        setField(term415819, term415819.getClass(), "propListHead", null);
        setIntField(term415819, term415819.getClass(), "sourcePosition", 0);
        setField(term415819, term415819.getClass(), "jsType", null);
        setField(term415819, term415819.getClass(), "parent", null);
        setField(term415809, term415809.getClass(), "next", term415819);
        setField(term415809, term415809.getClass(), "first", null);
        setField(term415809, term415809.getClass(), "last", null);
        setField(term415809, term415809.getClass(), "propListHead", null);
        setIntField(term415809, term415809.getClass(), "sourcePosition", 0);
        setField(term415809, term415809.getClass(), "jsType", null);
        setField(term415809, term415809.getClass(), "parent", null);
        setField(term415806, term415806.getClass(), "first", term415809);
        setField(term415806, term415806.getClass(), "last", null);
        setField(term415806, term415806.getClass(), "propListHead", null);
        setIntField(term415806, term415806.getClass(), "sourcePosition", 0);
        setField(term415806, term415806.getClass(), "jsType", null);
        setField(term415806, term415806.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term415153;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term415061, args);
        assertTrue(recursiveEquals(term415061, term415868));
        assertTrue(recursiveEquals(term415153, term415869));
        assertTrue(recursiveEquals(retValue, term415806));
    }

};


