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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term922401;
     Object term922493;
     Object term923242;
     Object term923243;
     Object term923195;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term922401 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term922493 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term922579 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term922649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term922579, term922579.getClass(), "next", term922649);
        setField(term922493, term922493.getClass(), "first", term922579);
        setIntField(term922493, term922493.getClass(), "type", 33);
        term923242 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term923242, term923242.getClass(), "currentTraversal", null);
        term923243 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term923244 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term923245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term923243, term923243.getClass(), "str", null);
        setIntField(term923243, term923243.getClass(), "type", 33);
        setField(term923243, term923243.getClass(), "next", null);
        setField(term923244, term923244.getClass(), "functionName", null);
        setBooleanField(term923244, term923244.getClass(), "itsNeedsActivation", false);
        setIntField(term923244, term923244.getClass(), "itsFunctionType", 0);
        setBooleanField(term923244, term923244.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term923244, term923244.getClass(), "encodedSourceStart", 0);
        setIntField(term923244, term923244.getClass(), "encodedSourceEnd", 0);
        setField(term923244, term923244.getClass(), "sourceName", null);
        setIntField(term923244, term923244.getClass(), "baseLineno", 0);
        setIntField(term923244, term923244.getClass(), "endLineno", 0);
        setField(term923244, term923244.getClass(), "functions", null);
        setField(term923244, term923244.getClass(), "regexps", null);
        setField(term923244, term923244.getClass(), "itsVariables", null);
        setField(term923244, term923244.getClass(), "itsConst", null);
        setField(term923244, term923244.getClass(), "itsVariableNames", null);
        setIntField(term923244, term923244.getClass(), "varStart", 0);
        setField(term923244, term923244.getClass(), "compilerData", null);
        setIntField(term923244, term923244.getClass(), "type", 0);
        setIntField(term923245, term923245.getClass(), "type", 0);
        setField(term923245, term923245.getClass(), "next", null);
        setField(term923245, term923245.getClass(), "first", null);
        setField(term923245, term923245.getClass(), "last", null);
        setField(term923245, term923245.getClass(), "propListHead", null);
        setIntField(term923245, term923245.getClass(), "sourcePosition", 0);
        setField(term923245, term923245.getClass(), "jsType", null);
        setField(term923245, term923245.getClass(), "parent", null);
        setField(term923244, term923244.getClass(), "next", term923245);
        setField(term923244, term923244.getClass(), "first", null);
        setField(term923244, term923244.getClass(), "last", null);
        setField(term923244, term923244.getClass(), "propListHead", null);
        setIntField(term923244, term923244.getClass(), "sourcePosition", 0);
        setField(term923244, term923244.getClass(), "jsType", null);
        setField(term923244, term923244.getClass(), "parent", null);
        setField(term923243, term923243.getClass(), "first", term923244);
        setField(term923243, term923243.getClass(), "last", null);
        setField(term923243, term923243.getClass(), "propListHead", null);
        setIntField(term923243, term923243.getClass(), "sourcePosition", 0);
        setField(term923243, term923243.getClass(), "jsType", null);
        setField(term923243, term923243.getClass(), "parent", null);
        term923195 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term923197 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term923207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term923195, term923195.getClass(), "str", null);
        setIntField(term923195, term923195.getClass(), "type", 33);
        setField(term923195, term923195.getClass(), "next", null);
        setField(term923197, term923197.getClass(), "functionName", null);
        setBooleanField(term923197, term923197.getClass(), "itsNeedsActivation", false);
        setIntField(term923197, term923197.getClass(), "itsFunctionType", 0);
        setBooleanField(term923197, term923197.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term923197, term923197.getClass(), "encodedSourceStart", 0);
        setIntField(term923197, term923197.getClass(), "encodedSourceEnd", 0);
        setField(term923197, term923197.getClass(), "sourceName", null);
        setIntField(term923197, term923197.getClass(), "baseLineno", 0);
        setIntField(term923197, term923197.getClass(), "endLineno", 0);
        setField(term923197, term923197.getClass(), "functions", null);
        setField(term923197, term923197.getClass(), "regexps", null);
        setField(term923197, term923197.getClass(), "itsVariables", null);
        setField(term923197, term923197.getClass(), "itsConst", null);
        setField(term923197, term923197.getClass(), "itsVariableNames", null);
        setIntField(term923197, term923197.getClass(), "varStart", 0);
        setField(term923197, term923197.getClass(), "compilerData", null);
        setIntField(term923197, term923197.getClass(), "type", 0);
        setIntField(term923207, term923207.getClass(), "type", 0);
        setField(term923207, term923207.getClass(), "next", null);
        setField(term923207, term923207.getClass(), "first", null);
        setField(term923207, term923207.getClass(), "last", null);
        setField(term923207, term923207.getClass(), "propListHead", null);
        setIntField(term923207, term923207.getClass(), "sourcePosition", 0);
        setField(term923207, term923207.getClass(), "jsType", null);
        setField(term923207, term923207.getClass(), "parent", null);
        setField(term923197, term923197.getClass(), "next", term923207);
        setField(term923197, term923197.getClass(), "first", null);
        setField(term923197, term923197.getClass(), "last", null);
        setField(term923197, term923197.getClass(), "propListHead", null);
        setIntField(term923197, term923197.getClass(), "sourcePosition", 0);
        setField(term923197, term923197.getClass(), "jsType", null);
        setField(term923197, term923197.getClass(), "parent", null);
        setField(term923195, term923195.getClass(), "first", term923197);
        setField(term923195, term923195.getClass(), "last", null);
        setField(term923195, term923195.getClass(), "propListHead", null);
        setIntField(term923195, term923195.getClass(), "sourcePosition", 0);
        setField(term923195, term923195.getClass(), "jsType", null);
        setField(term923195, term923195.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term922493;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term922401, args);
        assertTrue(recursiveEquals(term922401, term923242));
        assertTrue(recursiveEquals(term922493, term923243));
        assertTrue(recursiveEquals(retValue, term923195));
    }

};


