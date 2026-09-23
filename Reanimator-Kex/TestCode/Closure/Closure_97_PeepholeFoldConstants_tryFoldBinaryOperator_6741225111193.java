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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364374;
     Object term364460;
     Object term365094;
     Object term365095;
     Object term365035;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term364374 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term364460 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term364546 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term364616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term364546, term364546.getClass(), "next", term364616);
        setField(term364460, term364460.getClass(), "first", term364546);
        setIntField(term364460, term364460.getClass(), "type", 23);
        term365094 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term365094, term365094.getClass(), "currentTraversal", null);
        term365095 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term365096 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term365097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term365095, term365095.getClass(), "functionName", null);
        setBooleanField(term365095, term365095.getClass(), "itsNeedsActivation", false);
        setIntField(term365095, term365095.getClass(), "itsFunctionType", 0);
        setBooleanField(term365095, term365095.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term365095, term365095.getClass(), "encodedSourceStart", 0);
        setIntField(term365095, term365095.getClass(), "encodedSourceEnd", 0);
        setField(term365095, term365095.getClass(), "sourceName", null);
        setIntField(term365095, term365095.getClass(), "baseLineno", 0);
        setIntField(term365095, term365095.getClass(), "endLineno", 0);
        setField(term365095, term365095.getClass(), "functions", null);
        setField(term365095, term365095.getClass(), "regexps", null);
        setField(term365095, term365095.getClass(), "itsVariables", null);
        setField(term365095, term365095.getClass(), "itsConst", null);
        setField(term365095, term365095.getClass(), "itsVariableNames", null);
        setIntField(term365095, term365095.getClass(), "varStart", 0);
        setField(term365095, term365095.getClass(), "compilerData", null);
        setIntField(term365095, term365095.getClass(), "type", 23);
        setField(term365095, term365095.getClass(), "next", null);
        setField(term365096, term365096.getClass(), "functionName", null);
        setBooleanField(term365096, term365096.getClass(), "itsNeedsActivation", false);
        setIntField(term365096, term365096.getClass(), "itsFunctionType", 0);
        setBooleanField(term365096, term365096.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term365096, term365096.getClass(), "encodedSourceStart", 0);
        setIntField(term365096, term365096.getClass(), "encodedSourceEnd", 0);
        setField(term365096, term365096.getClass(), "sourceName", null);
        setIntField(term365096, term365096.getClass(), "baseLineno", 0);
        setIntField(term365096, term365096.getClass(), "endLineno", 0);
        setField(term365096, term365096.getClass(), "functions", null);
        setField(term365096, term365096.getClass(), "regexps", null);
        setField(term365096, term365096.getClass(), "itsVariables", null);
        setField(term365096, term365096.getClass(), "itsConst", null);
        setField(term365096, term365096.getClass(), "itsVariableNames", null);
        setIntField(term365096, term365096.getClass(), "varStart", 0);
        setField(term365096, term365096.getClass(), "compilerData", null);
        setIntField(term365096, term365096.getClass(), "type", 0);
        setIntField(term365097, term365097.getClass(), "type", 0);
        setField(term365097, term365097.getClass(), "next", null);
        setField(term365097, term365097.getClass(), "first", null);
        setField(term365097, term365097.getClass(), "last", null);
        setField(term365097, term365097.getClass(), "propListHead", null);
        setIntField(term365097, term365097.getClass(), "sourcePosition", 0);
        setField(term365097, term365097.getClass(), "jsType", null);
        setField(term365097, term365097.getClass(), "parent", null);
        setField(term365096, term365096.getClass(), "next", term365097);
        setField(term365096, term365096.getClass(), "first", null);
        setField(term365096, term365096.getClass(), "last", null);
        setField(term365096, term365096.getClass(), "propListHead", null);
        setIntField(term365096, term365096.getClass(), "sourcePosition", 0);
        setField(term365096, term365096.getClass(), "jsType", null);
        setField(term365096, term365096.getClass(), "parent", null);
        setField(term365095, term365095.getClass(), "first", term365096);
        setField(term365095, term365095.getClass(), "last", null);
        setField(term365095, term365095.getClass(), "propListHead", null);
        setIntField(term365095, term365095.getClass(), "sourcePosition", 0);
        setField(term365095, term365095.getClass(), "jsType", null);
        setField(term365095, term365095.getClass(), "parent", null);
        term365035 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term365045 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term365055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term365035, term365035.getClass(), "functionName", null);
        setBooleanField(term365035, term365035.getClass(), "itsNeedsActivation", false);
        setIntField(term365035, term365035.getClass(), "itsFunctionType", 0);
        setBooleanField(term365035, term365035.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term365035, term365035.getClass(), "encodedSourceStart", 0);
        setIntField(term365035, term365035.getClass(), "encodedSourceEnd", 0);
        setField(term365035, term365035.getClass(), "sourceName", null);
        setIntField(term365035, term365035.getClass(), "baseLineno", 0);
        setIntField(term365035, term365035.getClass(), "endLineno", 0);
        setField(term365035, term365035.getClass(), "functions", null);
        setField(term365035, term365035.getClass(), "regexps", null);
        setField(term365035, term365035.getClass(), "itsVariables", null);
        setField(term365035, term365035.getClass(), "itsConst", null);
        setField(term365035, term365035.getClass(), "itsVariableNames", null);
        setIntField(term365035, term365035.getClass(), "varStart", 0);
        setField(term365035, term365035.getClass(), "compilerData", null);
        setIntField(term365035, term365035.getClass(), "type", 23);
        setField(term365035, term365035.getClass(), "next", null);
        setField(term365045, term365045.getClass(), "functionName", null);
        setBooleanField(term365045, term365045.getClass(), "itsNeedsActivation", false);
        setIntField(term365045, term365045.getClass(), "itsFunctionType", 0);
        setBooleanField(term365045, term365045.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term365045, term365045.getClass(), "encodedSourceStart", 0);
        setIntField(term365045, term365045.getClass(), "encodedSourceEnd", 0);
        setField(term365045, term365045.getClass(), "sourceName", null);
        setIntField(term365045, term365045.getClass(), "baseLineno", 0);
        setIntField(term365045, term365045.getClass(), "endLineno", 0);
        setField(term365045, term365045.getClass(), "functions", null);
        setField(term365045, term365045.getClass(), "regexps", null);
        setField(term365045, term365045.getClass(), "itsVariables", null);
        setField(term365045, term365045.getClass(), "itsConst", null);
        setField(term365045, term365045.getClass(), "itsVariableNames", null);
        setIntField(term365045, term365045.getClass(), "varStart", 0);
        setField(term365045, term365045.getClass(), "compilerData", null);
        setIntField(term365045, term365045.getClass(), "type", 0);
        setIntField(term365055, term365055.getClass(), "type", 0);
        setField(term365055, term365055.getClass(), "next", null);
        setField(term365055, term365055.getClass(), "first", null);
        setField(term365055, term365055.getClass(), "last", null);
        setField(term365055, term365055.getClass(), "propListHead", null);
        setIntField(term365055, term365055.getClass(), "sourcePosition", 0);
        setField(term365055, term365055.getClass(), "jsType", null);
        setField(term365055, term365055.getClass(), "parent", null);
        setField(term365045, term365045.getClass(), "next", term365055);
        setField(term365045, term365045.getClass(), "first", null);
        setField(term365045, term365045.getClass(), "last", null);
        setField(term365045, term365045.getClass(), "propListHead", null);
        setIntField(term365045, term365045.getClass(), "sourcePosition", 0);
        setField(term365045, term365045.getClass(), "jsType", null);
        setField(term365045, term365045.getClass(), "parent", null);
        setField(term365035, term365035.getClass(), "first", term365045);
        setField(term365035, term365035.getClass(), "last", null);
        setField(term365035, term365035.getClass(), "propListHead", null);
        setIntField(term365035, term365035.getClass(), "sourcePosition", 0);
        setField(term365035, term365035.getClass(), "jsType", null);
        setField(term365035, term365035.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term364460;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term364374, args);
        assertTrue(recursiveEquals(term364374, term365094));
        assertTrue(recursiveEquals(term364460, term365095));
        assertTrue(recursiveEquals(retValue, term365035));
    }

};


