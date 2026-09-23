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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313339;
     Object term313425;
     Object term314093;
     Object term314094;
     Object term314023;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313339 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term313425 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term313511 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term313603 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term313511, term313511.getClass(), "next", term313603);
        setIntField(term313511, term313511.getClass(), "type", 39);
        setField(term313425, term313425.getClass(), "first", term313511);
        setIntField(term313425, term313425.getClass(), "type", 9);
        term314093 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term314093, term314093.getClass(), "currentTraversal", null);
        term314094 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term314095 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term314096 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term314094, term314094.getClass(), "functionName", null);
        setBooleanField(term314094, term314094.getClass(), "itsNeedsActivation", false);
        setIntField(term314094, term314094.getClass(), "itsFunctionType", 0);
        setBooleanField(term314094, term314094.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term314094, term314094.getClass(), "encodedSourceStart", 0);
        setIntField(term314094, term314094.getClass(), "encodedSourceEnd", 0);
        setField(term314094, term314094.getClass(), "sourceName", null);
        setIntField(term314094, term314094.getClass(), "baseLineno", 0);
        setIntField(term314094, term314094.getClass(), "endLineno", 0);
        setField(term314094, term314094.getClass(), "functions", null);
        setField(term314094, term314094.getClass(), "regexps", null);
        setField(term314094, term314094.getClass(), "itsVariables", null);
        setField(term314094, term314094.getClass(), "itsConst", null);
        setField(term314094, term314094.getClass(), "itsVariableNames", null);
        setIntField(term314094, term314094.getClass(), "varStart", 0);
        setField(term314094, term314094.getClass(), "compilerData", null);
        setIntField(term314094, term314094.getClass(), "type", 9);
        setField(term314094, term314094.getClass(), "next", null);
        setField(term314095, term314095.getClass(), "functionName", null);
        setBooleanField(term314095, term314095.getClass(), "itsNeedsActivation", false);
        setIntField(term314095, term314095.getClass(), "itsFunctionType", 0);
        setBooleanField(term314095, term314095.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term314095, term314095.getClass(), "encodedSourceStart", 0);
        setIntField(term314095, term314095.getClass(), "encodedSourceEnd", 0);
        setField(term314095, term314095.getClass(), "sourceName", null);
        setIntField(term314095, term314095.getClass(), "baseLineno", 0);
        setIntField(term314095, term314095.getClass(), "endLineno", 0);
        setField(term314095, term314095.getClass(), "functions", null);
        setField(term314095, term314095.getClass(), "regexps", null);
        setField(term314095, term314095.getClass(), "itsVariables", null);
        setField(term314095, term314095.getClass(), "itsConst", null);
        setField(term314095, term314095.getClass(), "itsVariableNames", null);
        setIntField(term314095, term314095.getClass(), "varStart", 0);
        setField(term314095, term314095.getClass(), "compilerData", null);
        setIntField(term314095, term314095.getClass(), "type", 39);
        setDoubleField(term314096, term314096.getClass(), "number", 0.0);
        setIntField(term314096, term314096.getClass(), "type", 0);
        setField(term314096, term314096.getClass(), "next", null);
        setField(term314096, term314096.getClass(), "first", null);
        setField(term314096, term314096.getClass(), "last", null);
        setField(term314096, term314096.getClass(), "propListHead", null);
        setIntField(term314096, term314096.getClass(), "sourcePosition", 0);
        setField(term314096, term314096.getClass(), "jsType", null);
        setField(term314096, term314096.getClass(), "parent", null);
        setField(term314095, term314095.getClass(), "next", term314096);
        setField(term314095, term314095.getClass(), "first", null);
        setField(term314095, term314095.getClass(), "last", null);
        setField(term314095, term314095.getClass(), "propListHead", null);
        setIntField(term314095, term314095.getClass(), "sourcePosition", 0);
        setField(term314095, term314095.getClass(), "jsType", null);
        setField(term314095, term314095.getClass(), "parent", null);
        setField(term314094, term314094.getClass(), "first", term314095);
        setField(term314094, term314094.getClass(), "last", null);
        setField(term314094, term314094.getClass(), "propListHead", null);
        setIntField(term314094, term314094.getClass(), "sourcePosition", 0);
        setField(term314094, term314094.getClass(), "jsType", null);
        setField(term314094, term314094.getClass(), "parent", null);
        term314023 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term314033 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term314043 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term314023, term314023.getClass(), "functionName", null);
        setBooleanField(term314023, term314023.getClass(), "itsNeedsActivation", false);
        setIntField(term314023, term314023.getClass(), "itsFunctionType", 0);
        setBooleanField(term314023, term314023.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term314023, term314023.getClass(), "encodedSourceStart", 0);
        setIntField(term314023, term314023.getClass(), "encodedSourceEnd", 0);
        setField(term314023, term314023.getClass(), "sourceName", null);
        setIntField(term314023, term314023.getClass(), "baseLineno", 0);
        setIntField(term314023, term314023.getClass(), "endLineno", 0);
        setField(term314023, term314023.getClass(), "functions", null);
        setField(term314023, term314023.getClass(), "regexps", null);
        setField(term314023, term314023.getClass(), "itsVariables", null);
        setField(term314023, term314023.getClass(), "itsConst", null);
        setField(term314023, term314023.getClass(), "itsVariableNames", null);
        setIntField(term314023, term314023.getClass(), "varStart", 0);
        setField(term314023, term314023.getClass(), "compilerData", null);
        setIntField(term314023, term314023.getClass(), "type", 9);
        setField(term314023, term314023.getClass(), "next", null);
        setField(term314033, term314033.getClass(), "functionName", null);
        setBooleanField(term314033, term314033.getClass(), "itsNeedsActivation", false);
        setIntField(term314033, term314033.getClass(), "itsFunctionType", 0);
        setBooleanField(term314033, term314033.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term314033, term314033.getClass(), "encodedSourceStart", 0);
        setIntField(term314033, term314033.getClass(), "encodedSourceEnd", 0);
        setField(term314033, term314033.getClass(), "sourceName", null);
        setIntField(term314033, term314033.getClass(), "baseLineno", 0);
        setIntField(term314033, term314033.getClass(), "endLineno", 0);
        setField(term314033, term314033.getClass(), "functions", null);
        setField(term314033, term314033.getClass(), "regexps", null);
        setField(term314033, term314033.getClass(), "itsVariables", null);
        setField(term314033, term314033.getClass(), "itsConst", null);
        setField(term314033, term314033.getClass(), "itsVariableNames", null);
        setIntField(term314033, term314033.getClass(), "varStart", 0);
        setField(term314033, term314033.getClass(), "compilerData", null);
        setIntField(term314033, term314033.getClass(), "type", 39);
        setDoubleField(term314043, term314043.getClass(), "number", 0.0);
        setIntField(term314043, term314043.getClass(), "type", 0);
        setField(term314043, term314043.getClass(), "next", null);
        setField(term314043, term314043.getClass(), "first", null);
        setField(term314043, term314043.getClass(), "last", null);
        setField(term314043, term314043.getClass(), "propListHead", null);
        setIntField(term314043, term314043.getClass(), "sourcePosition", 0);
        setField(term314043, term314043.getClass(), "jsType", null);
        setField(term314043, term314043.getClass(), "parent", null);
        setField(term314033, term314033.getClass(), "next", term314043);
        setField(term314033, term314033.getClass(), "first", null);
        setField(term314033, term314033.getClass(), "last", null);
        setField(term314033, term314033.getClass(), "propListHead", null);
        setIntField(term314033, term314033.getClass(), "sourcePosition", 0);
        setField(term314033, term314033.getClass(), "jsType", null);
        setField(term314033, term314033.getClass(), "parent", null);
        setField(term314023, term314023.getClass(), "first", term314033);
        setField(term314023, term314023.getClass(), "last", null);
        setField(term314023, term314023.getClass(), "propListHead", null);
        setIntField(term314023, term314023.getClass(), "sourcePosition", 0);
        setField(term314023, term314023.getClass(), "jsType", null);
        setField(term314023, term314023.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term313425;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term313339, args);
        assertTrue(recursiveEquals(term313339, term314093));
        assertTrue(recursiveEquals(term313425, term314094));
        assertTrue(recursiveEquals(retValue, term314023));
    }

};


