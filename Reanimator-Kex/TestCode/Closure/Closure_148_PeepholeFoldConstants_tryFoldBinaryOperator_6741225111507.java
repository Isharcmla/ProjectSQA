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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376209;
     Object term376295;
     Object term377119;
     Object term377120;
     Object term377047;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376209 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term376295 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term376381 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term376473 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term376473, term376473.getClass(), "type", 40);
        setField(term376473, term376473.getClass(), "str", "");
        setField(term376381, term376381.getClass(), "next", term376473);
        setField(term376295, term376295.getClass(), "first", term376381);
        setIntField(term376295, term376295.getClass(), "type", 33);
        term377119 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term377119, term377119.getClass(), "currentTraversal", null);
        term377120 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term377121 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term377122 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term377120, term377120.getClass(), "functionName", null);
        setBooleanField(term377120, term377120.getClass(), "itsNeedsActivation", false);
        setIntField(term377120, term377120.getClass(), "itsFunctionType", 0);
        setBooleanField(term377120, term377120.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term377120, term377120.getClass(), "encodedSourceStart", 0);
        setIntField(term377120, term377120.getClass(), "encodedSourceEnd", 0);
        setField(term377120, term377120.getClass(), "sourceName", null);
        setIntField(term377120, term377120.getClass(), "baseLineno", 0);
        setIntField(term377120, term377120.getClass(), "endLineno", 0);
        setField(term377120, term377120.getClass(), "functions", null);
        setField(term377120, term377120.getClass(), "regexps", null);
        setField(term377120, term377120.getClass(), "itsVariables", null);
        setField(term377120, term377120.getClass(), "itsConst", null);
        setField(term377120, term377120.getClass(), "itsVariableNames", null);
        setIntField(term377120, term377120.getClass(), "varStart", 0);
        setField(term377120, term377120.getClass(), "compilerData", null);
        setIntField(term377120, term377120.getClass(), "type", 33);
        setField(term377120, term377120.getClass(), "next", null);
        setField(term377121, term377121.getClass(), "functionName", null);
        setBooleanField(term377121, term377121.getClass(), "itsNeedsActivation", false);
        setIntField(term377121, term377121.getClass(), "itsFunctionType", 0);
        setBooleanField(term377121, term377121.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term377121, term377121.getClass(), "encodedSourceStart", 0);
        setIntField(term377121, term377121.getClass(), "encodedSourceEnd", 0);
        setField(term377121, term377121.getClass(), "sourceName", null);
        setIntField(term377121, term377121.getClass(), "baseLineno", 0);
        setIntField(term377121, term377121.getClass(), "endLineno", 0);
        setField(term377121, term377121.getClass(), "functions", null);
        setField(term377121, term377121.getClass(), "regexps", null);
        setField(term377121, term377121.getClass(), "itsVariables", null);
        setField(term377121, term377121.getClass(), "itsConst", null);
        setField(term377121, term377121.getClass(), "itsVariableNames", null);
        setIntField(term377121, term377121.getClass(), "varStart", 0);
        setField(term377121, term377121.getClass(), "compilerData", null);
        setIntField(term377121, term377121.getClass(), "type", 0);
        setField(term377122, term377122.getClass(), "str", "");
        setIntField(term377122, term377122.getClass(), "type", 40);
        setField(term377122, term377122.getClass(), "next", null);
        setField(term377122, term377122.getClass(), "first", null);
        setField(term377122, term377122.getClass(), "last", null);
        setField(term377122, term377122.getClass(), "propListHead", null);
        setIntField(term377122, term377122.getClass(), "sourcePosition", 0);
        setField(term377122, term377122.getClass(), "jsType", null);
        setField(term377122, term377122.getClass(), "parent", null);
        setField(term377121, term377121.getClass(), "next", term377122);
        setField(term377121, term377121.getClass(), "first", null);
        setField(term377121, term377121.getClass(), "last", null);
        setField(term377121, term377121.getClass(), "propListHead", null);
        setIntField(term377121, term377121.getClass(), "sourcePosition", 0);
        setField(term377121, term377121.getClass(), "jsType", null);
        setField(term377121, term377121.getClass(), "parent", null);
        setField(term377120, term377120.getClass(), "first", term377121);
        setField(term377120, term377120.getClass(), "last", null);
        setField(term377120, term377120.getClass(), "propListHead", null);
        setIntField(term377120, term377120.getClass(), "sourcePosition", 0);
        setField(term377120, term377120.getClass(), "jsType", null);
        setField(term377120, term377120.getClass(), "parent", null);
        term377047 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term377057 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term377067 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term377047, term377047.getClass(), "functionName", null);
        setBooleanField(term377047, term377047.getClass(), "itsNeedsActivation", false);
        setIntField(term377047, term377047.getClass(), "itsFunctionType", 0);
        setBooleanField(term377047, term377047.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term377047, term377047.getClass(), "encodedSourceStart", 0);
        setIntField(term377047, term377047.getClass(), "encodedSourceEnd", 0);
        setField(term377047, term377047.getClass(), "sourceName", null);
        setIntField(term377047, term377047.getClass(), "baseLineno", 0);
        setIntField(term377047, term377047.getClass(), "endLineno", 0);
        setField(term377047, term377047.getClass(), "functions", null);
        setField(term377047, term377047.getClass(), "regexps", null);
        setField(term377047, term377047.getClass(), "itsVariables", null);
        setField(term377047, term377047.getClass(), "itsConst", null);
        setField(term377047, term377047.getClass(), "itsVariableNames", null);
        setIntField(term377047, term377047.getClass(), "varStart", 0);
        setField(term377047, term377047.getClass(), "compilerData", null);
        setIntField(term377047, term377047.getClass(), "type", 33);
        setField(term377047, term377047.getClass(), "next", null);
        setField(term377057, term377057.getClass(), "functionName", null);
        setBooleanField(term377057, term377057.getClass(), "itsNeedsActivation", false);
        setIntField(term377057, term377057.getClass(), "itsFunctionType", 0);
        setBooleanField(term377057, term377057.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term377057, term377057.getClass(), "encodedSourceStart", 0);
        setIntField(term377057, term377057.getClass(), "encodedSourceEnd", 0);
        setField(term377057, term377057.getClass(), "sourceName", null);
        setIntField(term377057, term377057.getClass(), "baseLineno", 0);
        setIntField(term377057, term377057.getClass(), "endLineno", 0);
        setField(term377057, term377057.getClass(), "functions", null);
        setField(term377057, term377057.getClass(), "regexps", null);
        setField(term377057, term377057.getClass(), "itsVariables", null);
        setField(term377057, term377057.getClass(), "itsConst", null);
        setField(term377057, term377057.getClass(), "itsVariableNames", null);
        setIntField(term377057, term377057.getClass(), "varStart", 0);
        setField(term377057, term377057.getClass(), "compilerData", null);
        setIntField(term377057, term377057.getClass(), "type", 0);
        setField(term377067, term377067.getClass(), "str", "");
        setIntField(term377067, term377067.getClass(), "type", 40);
        setField(term377067, term377067.getClass(), "next", null);
        setField(term377067, term377067.getClass(), "first", null);
        setField(term377067, term377067.getClass(), "last", null);
        setField(term377067, term377067.getClass(), "propListHead", null);
        setIntField(term377067, term377067.getClass(), "sourcePosition", 0);
        setField(term377067, term377067.getClass(), "jsType", null);
        setField(term377067, term377067.getClass(), "parent", null);
        setField(term377057, term377057.getClass(), "next", term377067);
        setField(term377057, term377057.getClass(), "first", null);
        setField(term377057, term377057.getClass(), "last", null);
        setField(term377057, term377057.getClass(), "propListHead", null);
        setIntField(term377057, term377057.getClass(), "sourcePosition", 0);
        setField(term377057, term377057.getClass(), "jsType", null);
        setField(term377057, term377057.getClass(), "parent", null);
        setField(term377047, term377047.getClass(), "first", term377057);
        setField(term377047, term377047.getClass(), "last", null);
        setField(term377047, term377047.getClass(), "propListHead", null);
        setIntField(term377047, term377047.getClass(), "sourcePosition", 0);
        setField(term377047, term377047.getClass(), "jsType", null);
        setField(term377047, term377047.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term376295;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term376209, args);
        assertTrue(recursiveEquals(term376209, term377119));
        assertTrue(recursiveEquals(term376295, term377120));
        assertTrue(recursiveEquals(retValue, term377047));
    }

};


