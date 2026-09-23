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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252095;
     Object term252181;
     Object term252445;
     Object term252446;
     Object term252352;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252095 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term252181 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term252251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term252337 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term252251, term252251.getClass(), "next", term252337);
        setIntField(term252251, term252251.getClass(), "type", 0);
        setField(term252181, term252181.getClass(), "first", term252251);
        setIntField(term252181, term252181.getClass(), "type", 100);
        setField(term252181, term252181.getClass(), "parent", null);
        term252445 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term252445, term252445.getClass(), "currentTraversal", null);
        term252446 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term252447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term252448 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term252446, term252446.getClass(), "functionName", null);
        setBooleanField(term252446, term252446.getClass(), "itsNeedsActivation", false);
        setIntField(term252446, term252446.getClass(), "itsFunctionType", 0);
        setBooleanField(term252446, term252446.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term252446, term252446.getClass(), "encodedSourceStart", 0);
        setIntField(term252446, term252446.getClass(), "encodedSourceEnd", 0);
        setField(term252446, term252446.getClass(), "sourceName", null);
        setIntField(term252446, term252446.getClass(), "baseLineno", 0);
        setIntField(term252446, term252446.getClass(), "endLineno", 0);
        setField(term252446, term252446.getClass(), "functions", null);
        setField(term252446, term252446.getClass(), "regexps", null);
        setField(term252446, term252446.getClass(), "itsVariables", null);
        setField(term252446, term252446.getClass(), "itsConst", null);
        setField(term252446, term252446.getClass(), "itsVariableNames", null);
        setIntField(term252446, term252446.getClass(), "varStart", 0);
        setField(term252446, term252446.getClass(), "compilerData", null);
        setIntField(term252446, term252446.getClass(), "type", 100);
        setField(term252446, term252446.getClass(), "next", null);
        setIntField(term252447, term252447.getClass(), "type", 0);
        setField(term252448, term252448.getClass(), "functionName", null);
        setBooleanField(term252448, term252448.getClass(), "itsNeedsActivation", false);
        setIntField(term252448, term252448.getClass(), "itsFunctionType", 0);
        setBooleanField(term252448, term252448.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term252448, term252448.getClass(), "encodedSourceStart", 0);
        setIntField(term252448, term252448.getClass(), "encodedSourceEnd", 0);
        setField(term252448, term252448.getClass(), "sourceName", null);
        setIntField(term252448, term252448.getClass(), "baseLineno", 0);
        setIntField(term252448, term252448.getClass(), "endLineno", 0);
        setField(term252448, term252448.getClass(), "functions", null);
        setField(term252448, term252448.getClass(), "regexps", null);
        setField(term252448, term252448.getClass(), "itsVariables", null);
        setField(term252448, term252448.getClass(), "itsConst", null);
        setField(term252448, term252448.getClass(), "itsVariableNames", null);
        setIntField(term252448, term252448.getClass(), "varStart", 0);
        setField(term252448, term252448.getClass(), "compilerData", null);
        setIntField(term252448, term252448.getClass(), "type", 0);
        setField(term252448, term252448.getClass(), "next", null);
        setField(term252448, term252448.getClass(), "first", null);
        setField(term252448, term252448.getClass(), "last", null);
        setField(term252448, term252448.getClass(), "propListHead", null);
        setIntField(term252448, term252448.getClass(), "sourcePosition", 0);
        setField(term252448, term252448.getClass(), "jsType", null);
        setField(term252448, term252448.getClass(), "parent", null);
        setField(term252447, term252447.getClass(), "next", term252448);
        setField(term252447, term252447.getClass(), "first", null);
        setField(term252447, term252447.getClass(), "last", null);
        setField(term252447, term252447.getClass(), "propListHead", null);
        setIntField(term252447, term252447.getClass(), "sourcePosition", 0);
        setField(term252447, term252447.getClass(), "jsType", null);
        setField(term252447, term252447.getClass(), "parent", null);
        setField(term252446, term252446.getClass(), "first", term252447);
        setField(term252446, term252446.getClass(), "last", null);
        setField(term252446, term252446.getClass(), "propListHead", null);
        setIntField(term252446, term252446.getClass(), "sourcePosition", 0);
        setField(term252446, term252446.getClass(), "jsType", null);
        setField(term252446, term252446.getClass(), "parent", null);
        term252352 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term252362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term252364 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term252352, term252352.getClass(), "functionName", null);
        setBooleanField(term252352, term252352.getClass(), "itsNeedsActivation", false);
        setIntField(term252352, term252352.getClass(), "itsFunctionType", 0);
        setBooleanField(term252352, term252352.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term252352, term252352.getClass(), "encodedSourceStart", 0);
        setIntField(term252352, term252352.getClass(), "encodedSourceEnd", 0);
        setField(term252352, term252352.getClass(), "sourceName", null);
        setIntField(term252352, term252352.getClass(), "baseLineno", 0);
        setIntField(term252352, term252352.getClass(), "endLineno", 0);
        setField(term252352, term252352.getClass(), "functions", null);
        setField(term252352, term252352.getClass(), "regexps", null);
        setField(term252352, term252352.getClass(), "itsVariables", null);
        setField(term252352, term252352.getClass(), "itsConst", null);
        setField(term252352, term252352.getClass(), "itsVariableNames", null);
        setIntField(term252352, term252352.getClass(), "varStart", 0);
        setField(term252352, term252352.getClass(), "compilerData", null);
        setIntField(term252352, term252352.getClass(), "type", 100);
        setField(term252352, term252352.getClass(), "next", null);
        setIntField(term252362, term252362.getClass(), "type", 0);
        setField(term252364, term252364.getClass(), "functionName", null);
        setBooleanField(term252364, term252364.getClass(), "itsNeedsActivation", false);
        setIntField(term252364, term252364.getClass(), "itsFunctionType", 0);
        setBooleanField(term252364, term252364.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term252364, term252364.getClass(), "encodedSourceStart", 0);
        setIntField(term252364, term252364.getClass(), "encodedSourceEnd", 0);
        setField(term252364, term252364.getClass(), "sourceName", null);
        setIntField(term252364, term252364.getClass(), "baseLineno", 0);
        setIntField(term252364, term252364.getClass(), "endLineno", 0);
        setField(term252364, term252364.getClass(), "functions", null);
        setField(term252364, term252364.getClass(), "regexps", null);
        setField(term252364, term252364.getClass(), "itsVariables", null);
        setField(term252364, term252364.getClass(), "itsConst", null);
        setField(term252364, term252364.getClass(), "itsVariableNames", null);
        setIntField(term252364, term252364.getClass(), "varStart", 0);
        setField(term252364, term252364.getClass(), "compilerData", null);
        setIntField(term252364, term252364.getClass(), "type", 0);
        setField(term252364, term252364.getClass(), "next", null);
        setField(term252364, term252364.getClass(), "first", null);
        setField(term252364, term252364.getClass(), "last", null);
        setField(term252364, term252364.getClass(), "propListHead", null);
        setIntField(term252364, term252364.getClass(), "sourcePosition", 0);
        setField(term252364, term252364.getClass(), "jsType", null);
        setField(term252364, term252364.getClass(), "parent", null);
        setField(term252362, term252362.getClass(), "next", term252364);
        setField(term252362, term252362.getClass(), "first", null);
        setField(term252362, term252362.getClass(), "last", null);
        setField(term252362, term252362.getClass(), "propListHead", null);
        setIntField(term252362, term252362.getClass(), "sourcePosition", 0);
        setField(term252362, term252362.getClass(), "jsType", null);
        setField(term252362, term252362.getClass(), "parent", null);
        setField(term252352, term252352.getClass(), "first", term252362);
        setField(term252352, term252352.getClass(), "last", null);
        setField(term252352, term252352.getClass(), "propListHead", null);
        setIntField(term252352, term252352.getClass(), "sourcePosition", 0);
        setField(term252352, term252352.getClass(), "jsType", null);
        setField(term252352, term252352.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term252181;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term252095, args);
        assertTrue(recursiveEquals(term252095, term252445));
        assertTrue(recursiveEquals(term252181, term252446));
        assertTrue(recursiveEquals(retValue, term252352));
    }

};


