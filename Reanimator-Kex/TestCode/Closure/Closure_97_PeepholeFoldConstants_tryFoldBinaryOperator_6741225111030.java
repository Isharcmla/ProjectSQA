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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321664;
     Object term321750;
     Object term322063;
     Object term322064;
     Object term321981;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term321664 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term321750 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term321836 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term321928 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term321928, term321928.getClass(), "type", 16);
        setField(term321836, term321836.getClass(), "next", term321928);
        setIntField(term321836, term321836.getClass(), "type", 42);
        setField(term321750, term321750.getClass(), "first", term321836);
        setIntField(term321750, term321750.getClass(), "type", 16);
        term322063 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term322063, term322063.getClass(), "currentTraversal", null);
        term322064 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term322065 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term322066 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term322064, term322064.getClass(), "functionName", null);
        setBooleanField(term322064, term322064.getClass(), "itsNeedsActivation", false);
        setIntField(term322064, term322064.getClass(), "itsFunctionType", 0);
        setBooleanField(term322064, term322064.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term322064, term322064.getClass(), "encodedSourceStart", 0);
        setIntField(term322064, term322064.getClass(), "encodedSourceEnd", 0);
        setField(term322064, term322064.getClass(), "sourceName", null);
        setIntField(term322064, term322064.getClass(), "baseLineno", 0);
        setIntField(term322064, term322064.getClass(), "endLineno", 0);
        setField(term322064, term322064.getClass(), "functions", null);
        setField(term322064, term322064.getClass(), "regexps", null);
        setField(term322064, term322064.getClass(), "itsVariables", null);
        setField(term322064, term322064.getClass(), "itsConst", null);
        setField(term322064, term322064.getClass(), "itsVariableNames", null);
        setIntField(term322064, term322064.getClass(), "varStart", 0);
        setField(term322064, term322064.getClass(), "compilerData", null);
        setIntField(term322064, term322064.getClass(), "type", 16);
        setField(term322064, term322064.getClass(), "next", null);
        setField(term322065, term322065.getClass(), "functionName", null);
        setBooleanField(term322065, term322065.getClass(), "itsNeedsActivation", false);
        setIntField(term322065, term322065.getClass(), "itsFunctionType", 0);
        setBooleanField(term322065, term322065.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term322065, term322065.getClass(), "encodedSourceStart", 0);
        setIntField(term322065, term322065.getClass(), "encodedSourceEnd", 0);
        setField(term322065, term322065.getClass(), "sourceName", null);
        setIntField(term322065, term322065.getClass(), "baseLineno", 0);
        setIntField(term322065, term322065.getClass(), "endLineno", 0);
        setField(term322065, term322065.getClass(), "functions", null);
        setField(term322065, term322065.getClass(), "regexps", null);
        setField(term322065, term322065.getClass(), "itsVariables", null);
        setField(term322065, term322065.getClass(), "itsConst", null);
        setField(term322065, term322065.getClass(), "itsVariableNames", null);
        setIntField(term322065, term322065.getClass(), "varStart", 0);
        setField(term322065, term322065.getClass(), "compilerData", null);
        setIntField(term322065, term322065.getClass(), "type", 42);
        setDoubleField(term322066, term322066.getClass(), "number", 0.0);
        setIntField(term322066, term322066.getClass(), "type", 16);
        setField(term322066, term322066.getClass(), "next", null);
        setField(term322066, term322066.getClass(), "first", null);
        setField(term322066, term322066.getClass(), "last", null);
        setField(term322066, term322066.getClass(), "propListHead", null);
        setIntField(term322066, term322066.getClass(), "sourcePosition", 0);
        setField(term322066, term322066.getClass(), "jsType", null);
        setField(term322066, term322066.getClass(), "parent", null);
        setField(term322065, term322065.getClass(), "next", term322066);
        setField(term322065, term322065.getClass(), "first", null);
        setField(term322065, term322065.getClass(), "last", null);
        setField(term322065, term322065.getClass(), "propListHead", null);
        setIntField(term322065, term322065.getClass(), "sourcePosition", 0);
        setField(term322065, term322065.getClass(), "jsType", null);
        setField(term322065, term322065.getClass(), "parent", null);
        setField(term322064, term322064.getClass(), "first", term322065);
        setField(term322064, term322064.getClass(), "last", null);
        setField(term322064, term322064.getClass(), "propListHead", null);
        setIntField(term322064, term322064.getClass(), "sourcePosition", 0);
        setField(term322064, term322064.getClass(), "jsType", null);
        setField(term322064, term322064.getClass(), "parent", null);
        term321981 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term321991 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term322001 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term321981, term321981.getClass(), "functionName", null);
        setBooleanField(term321981, term321981.getClass(), "itsNeedsActivation", false);
        setIntField(term321981, term321981.getClass(), "itsFunctionType", 0);
        setBooleanField(term321981, term321981.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term321981, term321981.getClass(), "encodedSourceStart", 0);
        setIntField(term321981, term321981.getClass(), "encodedSourceEnd", 0);
        setField(term321981, term321981.getClass(), "sourceName", null);
        setIntField(term321981, term321981.getClass(), "baseLineno", 0);
        setIntField(term321981, term321981.getClass(), "endLineno", 0);
        setField(term321981, term321981.getClass(), "functions", null);
        setField(term321981, term321981.getClass(), "regexps", null);
        setField(term321981, term321981.getClass(), "itsVariables", null);
        setField(term321981, term321981.getClass(), "itsConst", null);
        setField(term321981, term321981.getClass(), "itsVariableNames", null);
        setIntField(term321981, term321981.getClass(), "varStart", 0);
        setField(term321981, term321981.getClass(), "compilerData", null);
        setIntField(term321981, term321981.getClass(), "type", 16);
        setField(term321981, term321981.getClass(), "next", null);
        setField(term321991, term321991.getClass(), "functionName", null);
        setBooleanField(term321991, term321991.getClass(), "itsNeedsActivation", false);
        setIntField(term321991, term321991.getClass(), "itsFunctionType", 0);
        setBooleanField(term321991, term321991.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term321991, term321991.getClass(), "encodedSourceStart", 0);
        setIntField(term321991, term321991.getClass(), "encodedSourceEnd", 0);
        setField(term321991, term321991.getClass(), "sourceName", null);
        setIntField(term321991, term321991.getClass(), "baseLineno", 0);
        setIntField(term321991, term321991.getClass(), "endLineno", 0);
        setField(term321991, term321991.getClass(), "functions", null);
        setField(term321991, term321991.getClass(), "regexps", null);
        setField(term321991, term321991.getClass(), "itsVariables", null);
        setField(term321991, term321991.getClass(), "itsConst", null);
        setField(term321991, term321991.getClass(), "itsVariableNames", null);
        setIntField(term321991, term321991.getClass(), "varStart", 0);
        setField(term321991, term321991.getClass(), "compilerData", null);
        setIntField(term321991, term321991.getClass(), "type", 42);
        setDoubleField(term322001, term322001.getClass(), "number", 0.0);
        setIntField(term322001, term322001.getClass(), "type", 16);
        setField(term322001, term322001.getClass(), "next", null);
        setField(term322001, term322001.getClass(), "first", null);
        setField(term322001, term322001.getClass(), "last", null);
        setField(term322001, term322001.getClass(), "propListHead", null);
        setIntField(term322001, term322001.getClass(), "sourcePosition", 0);
        setField(term322001, term322001.getClass(), "jsType", null);
        setField(term322001, term322001.getClass(), "parent", null);
        setField(term321991, term321991.getClass(), "next", term322001);
        setField(term321991, term321991.getClass(), "first", null);
        setField(term321991, term321991.getClass(), "last", null);
        setField(term321991, term321991.getClass(), "propListHead", null);
        setIntField(term321991, term321991.getClass(), "sourcePosition", 0);
        setField(term321991, term321991.getClass(), "jsType", null);
        setField(term321991, term321991.getClass(), "parent", null);
        setField(term321981, term321981.getClass(), "first", term321991);
        setField(term321981, term321981.getClass(), "last", null);
        setField(term321981, term321981.getClass(), "propListHead", null);
        setIntField(term321981, term321981.getClass(), "sourcePosition", 0);
        setField(term321981, term321981.getClass(), "jsType", null);
        setField(term321981, term321981.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term321750;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term321664, args);
        assertTrue(recursiveEquals(term321664, term322063));
        assertTrue(recursiveEquals(term321750, term322064));
        assertTrue(recursiveEquals(retValue, term321981));
    }

};


