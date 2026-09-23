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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term902230;
     Object term902316;
     Object term904176;
     Object term904177;
     Object term904088;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term902230 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term902316 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term902402 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term902494 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term902402, term902402.getClass(), "next", term902494);
        setIntField(term902402, term902402.getClass(), "type", 0);
        setField(term902316, term902316.getClass(), "first", term902402);
        setIntField(term902316, term902316.getClass(), "type", 101);
        setField(term902316, term902316.getClass(), "parent", null);
        term904176 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term904176, term904176.getClass(), "currentTraversal", null);
        term904177 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term904178 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term904179 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term904177, term904177.getClass(), "functionName", null);
        setBooleanField(term904177, term904177.getClass(), "itsNeedsActivation", false);
        setIntField(term904177, term904177.getClass(), "itsFunctionType", 0);
        setBooleanField(term904177, term904177.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term904177, term904177.getClass(), "encodedSourceStart", 0);
        setIntField(term904177, term904177.getClass(), "encodedSourceEnd", 0);
        setField(term904177, term904177.getClass(), "sourceName", null);
        setIntField(term904177, term904177.getClass(), "baseLineno", 0);
        setIntField(term904177, term904177.getClass(), "endLineno", 0);
        setField(term904177, term904177.getClass(), "functions", null);
        setField(term904177, term904177.getClass(), "regexps", null);
        setField(term904177, term904177.getClass(), "itsVariables", null);
        setField(term904177, term904177.getClass(), "itsConst", null);
        setField(term904177, term904177.getClass(), "itsVariableNames", null);
        setIntField(term904177, term904177.getClass(), "varStart", 0);
        setField(term904177, term904177.getClass(), "compilerData", null);
        setIntField(term904177, term904177.getClass(), "type", 101);
        setField(term904177, term904177.getClass(), "next", null);
        setField(term904178, term904178.getClass(), "functionName", null);
        setBooleanField(term904178, term904178.getClass(), "itsNeedsActivation", false);
        setIntField(term904178, term904178.getClass(), "itsFunctionType", 0);
        setBooleanField(term904178, term904178.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term904178, term904178.getClass(), "encodedSourceStart", 0);
        setIntField(term904178, term904178.getClass(), "encodedSourceEnd", 0);
        setField(term904178, term904178.getClass(), "sourceName", null);
        setIntField(term904178, term904178.getClass(), "baseLineno", 0);
        setIntField(term904178, term904178.getClass(), "endLineno", 0);
        setField(term904178, term904178.getClass(), "functions", null);
        setField(term904178, term904178.getClass(), "regexps", null);
        setField(term904178, term904178.getClass(), "itsVariables", null);
        setField(term904178, term904178.getClass(), "itsConst", null);
        setField(term904178, term904178.getClass(), "itsVariableNames", null);
        setIntField(term904178, term904178.getClass(), "varStart", 0);
        setField(term904178, term904178.getClass(), "compilerData", null);
        setIntField(term904178, term904178.getClass(), "type", 0);
        setDoubleField(term904179, term904179.getClass(), "number", 0.0);
        setIntField(term904179, term904179.getClass(), "type", 0);
        setField(term904179, term904179.getClass(), "next", null);
        setField(term904179, term904179.getClass(), "first", null);
        setField(term904179, term904179.getClass(), "last", null);
        setField(term904179, term904179.getClass(), "propListHead", null);
        setIntField(term904179, term904179.getClass(), "sourcePosition", 0);
        setField(term904179, term904179.getClass(), "jsType", null);
        setField(term904179, term904179.getClass(), "parent", null);
        setField(term904178, term904178.getClass(), "next", term904179);
        setField(term904178, term904178.getClass(), "first", null);
        setField(term904178, term904178.getClass(), "last", null);
        setField(term904178, term904178.getClass(), "propListHead", null);
        setIntField(term904178, term904178.getClass(), "sourcePosition", 0);
        setField(term904178, term904178.getClass(), "jsType", null);
        setField(term904178, term904178.getClass(), "parent", null);
        setField(term904177, term904177.getClass(), "first", term904178);
        setField(term904177, term904177.getClass(), "last", null);
        setField(term904177, term904177.getClass(), "propListHead", null);
        setIntField(term904177, term904177.getClass(), "sourcePosition", 0);
        setField(term904177, term904177.getClass(), "jsType", null);
        setField(term904177, term904177.getClass(), "parent", null);
        term904088 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term904098 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term904108 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term904088, term904088.getClass(), "functionName", null);
        setBooleanField(term904088, term904088.getClass(), "itsNeedsActivation", false);
        setIntField(term904088, term904088.getClass(), "itsFunctionType", 0);
        setBooleanField(term904088, term904088.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term904088, term904088.getClass(), "encodedSourceStart", 0);
        setIntField(term904088, term904088.getClass(), "encodedSourceEnd", 0);
        setField(term904088, term904088.getClass(), "sourceName", null);
        setIntField(term904088, term904088.getClass(), "baseLineno", 0);
        setIntField(term904088, term904088.getClass(), "endLineno", 0);
        setField(term904088, term904088.getClass(), "functions", null);
        setField(term904088, term904088.getClass(), "regexps", null);
        setField(term904088, term904088.getClass(), "itsVariables", null);
        setField(term904088, term904088.getClass(), "itsConst", null);
        setField(term904088, term904088.getClass(), "itsVariableNames", null);
        setIntField(term904088, term904088.getClass(), "varStart", 0);
        setField(term904088, term904088.getClass(), "compilerData", null);
        setIntField(term904088, term904088.getClass(), "type", 101);
        setField(term904088, term904088.getClass(), "next", null);
        setField(term904098, term904098.getClass(), "functionName", null);
        setBooleanField(term904098, term904098.getClass(), "itsNeedsActivation", false);
        setIntField(term904098, term904098.getClass(), "itsFunctionType", 0);
        setBooleanField(term904098, term904098.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term904098, term904098.getClass(), "encodedSourceStart", 0);
        setIntField(term904098, term904098.getClass(), "encodedSourceEnd", 0);
        setField(term904098, term904098.getClass(), "sourceName", null);
        setIntField(term904098, term904098.getClass(), "baseLineno", 0);
        setIntField(term904098, term904098.getClass(), "endLineno", 0);
        setField(term904098, term904098.getClass(), "functions", null);
        setField(term904098, term904098.getClass(), "regexps", null);
        setField(term904098, term904098.getClass(), "itsVariables", null);
        setField(term904098, term904098.getClass(), "itsConst", null);
        setField(term904098, term904098.getClass(), "itsVariableNames", null);
        setIntField(term904098, term904098.getClass(), "varStart", 0);
        setField(term904098, term904098.getClass(), "compilerData", null);
        setIntField(term904098, term904098.getClass(), "type", 0);
        setDoubleField(term904108, term904108.getClass(), "number", 0.0);
        setIntField(term904108, term904108.getClass(), "type", 0);
        setField(term904108, term904108.getClass(), "next", null);
        setField(term904108, term904108.getClass(), "first", null);
        setField(term904108, term904108.getClass(), "last", null);
        setField(term904108, term904108.getClass(), "propListHead", null);
        setIntField(term904108, term904108.getClass(), "sourcePosition", 0);
        setField(term904108, term904108.getClass(), "jsType", null);
        setField(term904108, term904108.getClass(), "parent", null);
        setField(term904098, term904098.getClass(), "next", term904108);
        setField(term904098, term904098.getClass(), "first", null);
        setField(term904098, term904098.getClass(), "last", null);
        setField(term904098, term904098.getClass(), "propListHead", null);
        setIntField(term904098, term904098.getClass(), "sourcePosition", 0);
        setField(term904098, term904098.getClass(), "jsType", null);
        setField(term904098, term904098.getClass(), "parent", null);
        setField(term904088, term904088.getClass(), "first", term904098);
        setField(term904088, term904088.getClass(), "last", null);
        setField(term904088, term904088.getClass(), "propListHead", null);
        setIntField(term904088, term904088.getClass(), "sourcePosition", 0);
        setField(term904088, term904088.getClass(), "jsType", null);
        setField(term904088, term904088.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term902316;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term902230, args);
        assertTrue(recursiveEquals(term902230, term904176));
        assertTrue(recursiveEquals(term902316, term904177));
        assertTrue(recursiveEquals(retValue, term904088));
    }

};


