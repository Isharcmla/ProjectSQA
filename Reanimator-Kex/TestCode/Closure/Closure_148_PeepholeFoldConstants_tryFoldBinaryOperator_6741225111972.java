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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term526219;
     Object term526309;
     Object term526561;
     Object term526562;
     Object term526503;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term526219 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term526309 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term526395 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term526487 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term526395, term526395.getClass(), "next", term526487);
        setIntField(term526395, term526395.getClass(), "type", 39);
        setField(term526309, term526309.getClass(), "first", term526395);
        setIntField(term526309, term526309.getClass(), "type", 24);
        term526561 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term526561, term526561.getClass(), "currentTraversal", null);
        term526562 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term526563 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term526564 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term526562, term526562.getClass(), "encodedSourceStart", 0);
        setIntField(term526562, term526562.getClass(), "encodedSourceEnd", 0);
        setField(term526562, term526562.getClass(), "sourceName", null);
        setIntField(term526562, term526562.getClass(), "baseLineno", 0);
        setIntField(term526562, term526562.getClass(), "endLineno", 0);
        setField(term526562, term526562.getClass(), "functions", null);
        setField(term526562, term526562.getClass(), "regexps", null);
        setField(term526562, term526562.getClass(), "itsVariables", null);
        setField(term526562, term526562.getClass(), "itsConst", null);
        setField(term526562, term526562.getClass(), "itsVariableNames", null);
        setIntField(term526562, term526562.getClass(), "varStart", 0);
        setField(term526562, term526562.getClass(), "compilerData", null);
        setIntField(term526562, term526562.getClass(), "type", 24);
        setField(term526562, term526562.getClass(), "next", null);
        setField(term526563, term526563.getClass(), "functionName", null);
        setBooleanField(term526563, term526563.getClass(), "itsNeedsActivation", false);
        setIntField(term526563, term526563.getClass(), "itsFunctionType", 0);
        setBooleanField(term526563, term526563.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term526563, term526563.getClass(), "encodedSourceStart", 0);
        setIntField(term526563, term526563.getClass(), "encodedSourceEnd", 0);
        setField(term526563, term526563.getClass(), "sourceName", null);
        setIntField(term526563, term526563.getClass(), "baseLineno", 0);
        setIntField(term526563, term526563.getClass(), "endLineno", 0);
        setField(term526563, term526563.getClass(), "functions", null);
        setField(term526563, term526563.getClass(), "regexps", null);
        setField(term526563, term526563.getClass(), "itsVariables", null);
        setField(term526563, term526563.getClass(), "itsConst", null);
        setField(term526563, term526563.getClass(), "itsVariableNames", null);
        setIntField(term526563, term526563.getClass(), "varStart", 0);
        setField(term526563, term526563.getClass(), "compilerData", null);
        setIntField(term526563, term526563.getClass(), "type", 39);
        setDoubleField(term526564, term526564.getClass(), "number", 0.0);
        setIntField(term526564, term526564.getClass(), "type", 0);
        setField(term526564, term526564.getClass(), "next", null);
        setField(term526564, term526564.getClass(), "first", null);
        setField(term526564, term526564.getClass(), "last", null);
        setField(term526564, term526564.getClass(), "propListHead", null);
        setIntField(term526564, term526564.getClass(), "sourcePosition", 0);
        setField(term526564, term526564.getClass(), "jsType", null);
        setField(term526564, term526564.getClass(), "parent", null);
        setField(term526563, term526563.getClass(), "next", term526564);
        setField(term526563, term526563.getClass(), "first", null);
        setField(term526563, term526563.getClass(), "last", null);
        setField(term526563, term526563.getClass(), "propListHead", null);
        setIntField(term526563, term526563.getClass(), "sourcePosition", 0);
        setField(term526563, term526563.getClass(), "jsType", null);
        setField(term526563, term526563.getClass(), "parent", null);
        setField(term526562, term526562.getClass(), "first", term526563);
        setField(term526562, term526562.getClass(), "last", null);
        setField(term526562, term526562.getClass(), "propListHead", null);
        setIntField(term526562, term526562.getClass(), "sourcePosition", 0);
        setField(term526562, term526562.getClass(), "jsType", null);
        setField(term526562, term526562.getClass(), "parent", null);
        term526503 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term526510 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term526520 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term526503, term526503.getClass(), "encodedSourceStart", 0);
        setIntField(term526503, term526503.getClass(), "encodedSourceEnd", 0);
        setField(term526503, term526503.getClass(), "sourceName", null);
        setIntField(term526503, term526503.getClass(), "baseLineno", 0);
        setIntField(term526503, term526503.getClass(), "endLineno", 0);
        setField(term526503, term526503.getClass(), "functions", null);
        setField(term526503, term526503.getClass(), "regexps", null);
        setField(term526503, term526503.getClass(), "itsVariables", null);
        setField(term526503, term526503.getClass(), "itsConst", null);
        setField(term526503, term526503.getClass(), "itsVariableNames", null);
        setIntField(term526503, term526503.getClass(), "varStart", 0);
        setField(term526503, term526503.getClass(), "compilerData", null);
        setIntField(term526503, term526503.getClass(), "type", 24);
        setField(term526503, term526503.getClass(), "next", null);
        setField(term526510, term526510.getClass(), "functionName", null);
        setBooleanField(term526510, term526510.getClass(), "itsNeedsActivation", false);
        setIntField(term526510, term526510.getClass(), "itsFunctionType", 0);
        setBooleanField(term526510, term526510.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term526510, term526510.getClass(), "encodedSourceStart", 0);
        setIntField(term526510, term526510.getClass(), "encodedSourceEnd", 0);
        setField(term526510, term526510.getClass(), "sourceName", null);
        setIntField(term526510, term526510.getClass(), "baseLineno", 0);
        setIntField(term526510, term526510.getClass(), "endLineno", 0);
        setField(term526510, term526510.getClass(), "functions", null);
        setField(term526510, term526510.getClass(), "regexps", null);
        setField(term526510, term526510.getClass(), "itsVariables", null);
        setField(term526510, term526510.getClass(), "itsConst", null);
        setField(term526510, term526510.getClass(), "itsVariableNames", null);
        setIntField(term526510, term526510.getClass(), "varStart", 0);
        setField(term526510, term526510.getClass(), "compilerData", null);
        setIntField(term526510, term526510.getClass(), "type", 39);
        setDoubleField(term526520, term526520.getClass(), "number", 0.0);
        setIntField(term526520, term526520.getClass(), "type", 0);
        setField(term526520, term526520.getClass(), "next", null);
        setField(term526520, term526520.getClass(), "first", null);
        setField(term526520, term526520.getClass(), "last", null);
        setField(term526520, term526520.getClass(), "propListHead", null);
        setIntField(term526520, term526520.getClass(), "sourcePosition", 0);
        setField(term526520, term526520.getClass(), "jsType", null);
        setField(term526520, term526520.getClass(), "parent", null);
        setField(term526510, term526510.getClass(), "next", term526520);
        setField(term526510, term526510.getClass(), "first", null);
        setField(term526510, term526510.getClass(), "last", null);
        setField(term526510, term526510.getClass(), "propListHead", null);
        setIntField(term526510, term526510.getClass(), "sourcePosition", 0);
        setField(term526510, term526510.getClass(), "jsType", null);
        setField(term526510, term526510.getClass(), "parent", null);
        setField(term526503, term526503.getClass(), "first", term526510);
        setField(term526503, term526503.getClass(), "last", null);
        setField(term526503, term526503.getClass(), "propListHead", null);
        setIntField(term526503, term526503.getClass(), "sourcePosition", 0);
        setField(term526503, term526503.getClass(), "jsType", null);
        setField(term526503, term526503.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term526309;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term526219, args);
        assertTrue(recursiveEquals(term526219, term526561));
        assertTrue(recursiveEquals(term526309, term526562));
        assertTrue(recursiveEquals(retValue, term526503));
    }

};


