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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240253;
     Object term240339;
     Object term241370;
     Object term241371;
     Object term241311;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240253 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term240339 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term240425 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term240495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term240425, term240425.getClass(), "next", term240495);
        setField(term240339, term240339.getClass(), "first", term240425);
        setIntField(term240339, term240339.getClass(), "type", 23);
        term241370 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term241370, term241370.getClass(), "currentTraversal", null);
        term241371 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term241372 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term241373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term241371, term241371.getClass(), "functionName", null);
        setBooleanField(term241371, term241371.getClass(), "itsNeedsActivation", false);
        setIntField(term241371, term241371.getClass(), "itsFunctionType", 0);
        setBooleanField(term241371, term241371.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term241371, term241371.getClass(), "encodedSourceStart", 0);
        setIntField(term241371, term241371.getClass(), "encodedSourceEnd", 0);
        setField(term241371, term241371.getClass(), "sourceName", null);
        setIntField(term241371, term241371.getClass(), "baseLineno", 0);
        setIntField(term241371, term241371.getClass(), "endLineno", 0);
        setField(term241371, term241371.getClass(), "functions", null);
        setField(term241371, term241371.getClass(), "regexps", null);
        setField(term241371, term241371.getClass(), "itsVariables", null);
        setField(term241371, term241371.getClass(), "itsConst", null);
        setField(term241371, term241371.getClass(), "itsVariableNames", null);
        setIntField(term241371, term241371.getClass(), "varStart", 0);
        setField(term241371, term241371.getClass(), "compilerData", null);
        setIntField(term241371, term241371.getClass(), "type", 23);
        setField(term241371, term241371.getClass(), "next", null);
        setField(term241372, term241372.getClass(), "functionName", null);
        setBooleanField(term241372, term241372.getClass(), "itsNeedsActivation", false);
        setIntField(term241372, term241372.getClass(), "itsFunctionType", 0);
        setBooleanField(term241372, term241372.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term241372, term241372.getClass(), "encodedSourceStart", 0);
        setIntField(term241372, term241372.getClass(), "encodedSourceEnd", 0);
        setField(term241372, term241372.getClass(), "sourceName", null);
        setIntField(term241372, term241372.getClass(), "baseLineno", 0);
        setIntField(term241372, term241372.getClass(), "endLineno", 0);
        setField(term241372, term241372.getClass(), "functions", null);
        setField(term241372, term241372.getClass(), "regexps", null);
        setField(term241372, term241372.getClass(), "itsVariables", null);
        setField(term241372, term241372.getClass(), "itsConst", null);
        setField(term241372, term241372.getClass(), "itsVariableNames", null);
        setIntField(term241372, term241372.getClass(), "varStart", 0);
        setField(term241372, term241372.getClass(), "compilerData", null);
        setIntField(term241372, term241372.getClass(), "type", 0);
        setIntField(term241373, term241373.getClass(), "type", 0);
        setField(term241373, term241373.getClass(), "next", null);
        setField(term241373, term241373.getClass(), "first", null);
        setField(term241373, term241373.getClass(), "last", null);
        setField(term241373, term241373.getClass(), "propListHead", null);
        setIntField(term241373, term241373.getClass(), "sourcePosition", 0);
        setField(term241373, term241373.getClass(), "jsType", null);
        setField(term241373, term241373.getClass(), "parent", null);
        setField(term241372, term241372.getClass(), "next", term241373);
        setField(term241372, term241372.getClass(), "first", null);
        setField(term241372, term241372.getClass(), "last", null);
        setField(term241372, term241372.getClass(), "propListHead", null);
        setIntField(term241372, term241372.getClass(), "sourcePosition", 0);
        setField(term241372, term241372.getClass(), "jsType", null);
        setField(term241372, term241372.getClass(), "parent", null);
        setField(term241371, term241371.getClass(), "first", term241372);
        setField(term241371, term241371.getClass(), "last", null);
        setField(term241371, term241371.getClass(), "propListHead", null);
        setIntField(term241371, term241371.getClass(), "sourcePosition", 0);
        setField(term241371, term241371.getClass(), "jsType", null);
        setField(term241371, term241371.getClass(), "parent", null);
        term241311 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term241321 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term241331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term241311, term241311.getClass(), "functionName", null);
        setBooleanField(term241311, term241311.getClass(), "itsNeedsActivation", false);
        setIntField(term241311, term241311.getClass(), "itsFunctionType", 0);
        setBooleanField(term241311, term241311.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term241311, term241311.getClass(), "encodedSourceStart", 0);
        setIntField(term241311, term241311.getClass(), "encodedSourceEnd", 0);
        setField(term241311, term241311.getClass(), "sourceName", null);
        setIntField(term241311, term241311.getClass(), "baseLineno", 0);
        setIntField(term241311, term241311.getClass(), "endLineno", 0);
        setField(term241311, term241311.getClass(), "functions", null);
        setField(term241311, term241311.getClass(), "regexps", null);
        setField(term241311, term241311.getClass(), "itsVariables", null);
        setField(term241311, term241311.getClass(), "itsConst", null);
        setField(term241311, term241311.getClass(), "itsVariableNames", null);
        setIntField(term241311, term241311.getClass(), "varStart", 0);
        setField(term241311, term241311.getClass(), "compilerData", null);
        setIntField(term241311, term241311.getClass(), "type", 23);
        setField(term241311, term241311.getClass(), "next", null);
        setField(term241321, term241321.getClass(), "functionName", null);
        setBooleanField(term241321, term241321.getClass(), "itsNeedsActivation", false);
        setIntField(term241321, term241321.getClass(), "itsFunctionType", 0);
        setBooleanField(term241321, term241321.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term241321, term241321.getClass(), "encodedSourceStart", 0);
        setIntField(term241321, term241321.getClass(), "encodedSourceEnd", 0);
        setField(term241321, term241321.getClass(), "sourceName", null);
        setIntField(term241321, term241321.getClass(), "baseLineno", 0);
        setIntField(term241321, term241321.getClass(), "endLineno", 0);
        setField(term241321, term241321.getClass(), "functions", null);
        setField(term241321, term241321.getClass(), "regexps", null);
        setField(term241321, term241321.getClass(), "itsVariables", null);
        setField(term241321, term241321.getClass(), "itsConst", null);
        setField(term241321, term241321.getClass(), "itsVariableNames", null);
        setIntField(term241321, term241321.getClass(), "varStart", 0);
        setField(term241321, term241321.getClass(), "compilerData", null);
        setIntField(term241321, term241321.getClass(), "type", 0);
        setIntField(term241331, term241331.getClass(), "type", 0);
        setField(term241331, term241331.getClass(), "next", null);
        setField(term241331, term241331.getClass(), "first", null);
        setField(term241331, term241331.getClass(), "last", null);
        setField(term241331, term241331.getClass(), "propListHead", null);
        setIntField(term241331, term241331.getClass(), "sourcePosition", 0);
        setField(term241331, term241331.getClass(), "jsType", null);
        setField(term241331, term241331.getClass(), "parent", null);
        setField(term241321, term241321.getClass(), "next", term241331);
        setField(term241321, term241321.getClass(), "first", null);
        setField(term241321, term241321.getClass(), "last", null);
        setField(term241321, term241321.getClass(), "propListHead", null);
        setIntField(term241321, term241321.getClass(), "sourcePosition", 0);
        setField(term241321, term241321.getClass(), "jsType", null);
        setField(term241321, term241321.getClass(), "parent", null);
        setField(term241311, term241311.getClass(), "first", term241321);
        setField(term241311, term241311.getClass(), "last", null);
        setField(term241311, term241311.getClass(), "propListHead", null);
        setIntField(term241311, term241311.getClass(), "sourcePosition", 0);
        setField(term241311, term241311.getClass(), "jsType", null);
        setField(term241311, term241311.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term240339;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term240253, args);
        assertTrue(recursiveEquals(term240253, term241370));
        assertTrue(recursiveEquals(term240339, term241371));
        assertTrue(recursiveEquals(retValue, term241311));
    }

};


