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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3726128;
     Object term3726214;
     Object term3727529;
     Object term3727530;
     Object term3727339;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3726128 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3726214 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3726306 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3726398 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3726490 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3726598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3726214, term3726214.getClass(), "type", 37);
        setIntField(term3726306, term3726306.getClass(), "type", 33);
        setIntField(term3726490, term3726490.getClass(), "type", 40);
        setField(term3726490, term3726490.getClass(), "str", "charCodeAt");
        setField(term3726398, term3726398.getClass(), "next", term3726490);
        setIntField(term3726398, term3726398.getClass(), "type", 40);
        setField(term3726306, term3726306.getClass(), "first", term3726398);
        setIntField(term3726598, term3726598.getClass(), "type", 40);
        setField(term3726306, term3726306.getClass(), "next", term3726598);
        setField(term3726214, term3726214.getClass(), "first", term3726306);
        term3727529 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3727529, term3727529.getClass(), "currentTraversal", null);
        term3727530 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3727531 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3727532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3727533 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3727534 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3727530, term3727530.getClass(), "functionName", null);
        setBooleanField(term3727530, term3727530.getClass(), "itsNeedsActivation", false);
        setIntField(term3727530, term3727530.getClass(), "itsFunctionType", 0);
        setBooleanField(term3727530, term3727530.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3727530, term3727530.getClass(), "encodedSourceStart", 0);
        setIntField(term3727530, term3727530.getClass(), "encodedSourceEnd", 0);
        setField(term3727530, term3727530.getClass(), "sourceName", null);
        setIntField(term3727530, term3727530.getClass(), "baseLineno", 0);
        setIntField(term3727530, term3727530.getClass(), "endLineno", 0);
        setField(term3727530, term3727530.getClass(), "functions", null);
        setField(term3727530, term3727530.getClass(), "regexps", null);
        setField(term3727530, term3727530.getClass(), "itsVariables", null);
        setField(term3727530, term3727530.getClass(), "itsConst", null);
        setField(term3727530, term3727530.getClass(), "itsVariableNames", null);
        setIntField(term3727530, term3727530.getClass(), "varStart", 0);
        setField(term3727530, term3727530.getClass(), "compilerData", null);
        setIntField(term3727530, term3727530.getClass(), "type", 37);
        setField(term3727530, term3727530.getClass(), "next", null);
        setField(term3727531, term3727531.getClass(), "str", null);
        setIntField(term3727531, term3727531.getClass(), "type", 33);
        setIntField(term3727532, term3727532.getClass(), "type", 40);
        setField(term3727532, term3727532.getClass(), "next", null);
        setField(term3727532, term3727532.getClass(), "first", null);
        setField(term3727532, term3727532.getClass(), "last", null);
        setField(term3727532, term3727532.getClass(), "propListHead", null);
        setIntField(term3727532, term3727532.getClass(), "sourcePosition", 0);
        setField(term3727532, term3727532.getClass(), "jsType", null);
        setField(term3727532, term3727532.getClass(), "parent", null);
        setField(term3727531, term3727531.getClass(), "next", term3727532);
        setField(term3727533, term3727533.getClass(), "str", null);
        setIntField(term3727533, term3727533.getClass(), "type", 40);
        setField(term3727534, term3727534.getClass(), "str", "");
        setIntField(term3727534, term3727534.getClass(), "type", 40);
        setField(term3727534, term3727534.getClass(), "next", null);
        setField(term3727534, term3727534.getClass(), "first", null);
        setField(term3727534, term3727534.getClass(), "last", null);
        setField(term3727534, term3727534.getClass(), "propListHead", null);
        setIntField(term3727534, term3727534.getClass(), "sourcePosition", 0);
        setField(term3727534, term3727534.getClass(), "jsType", null);
        setField(term3727534, term3727534.getClass(), "parent", null);
        setField(term3727533, term3727533.getClass(), "next", term3727534);
        setField(term3727533, term3727533.getClass(), "first", null);
        setField(term3727533, term3727533.getClass(), "last", null);
        setField(term3727533, term3727533.getClass(), "propListHead", null);
        setIntField(term3727533, term3727533.getClass(), "sourcePosition", 0);
        setField(term3727533, term3727533.getClass(), "jsType", null);
        setField(term3727533, term3727533.getClass(), "parent", null);
        setField(term3727531, term3727531.getClass(), "first", term3727533);
        setField(term3727531, term3727531.getClass(), "last", null);
        setField(term3727531, term3727531.getClass(), "propListHead", null);
        setIntField(term3727531, term3727531.getClass(), "sourcePosition", 0);
        setField(term3727531, term3727531.getClass(), "jsType", null);
        setField(term3727531, term3727531.getClass(), "parent", null);
        setField(term3727530, term3727530.getClass(), "first", term3727531);
        setField(term3727530, term3727530.getClass(), "last", null);
        setField(term3727530, term3727530.getClass(), "propListHead", null);
        setIntField(term3727530, term3727530.getClass(), "sourcePosition", 0);
        setField(term3727530, term3727530.getClass(), "jsType", null);
        setField(term3727530, term3727530.getClass(), "parent", null);
        term3727339 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3727349 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3727351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3727354 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3727356 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3727339, term3727339.getClass(), "functionName", null);
        setBooleanField(term3727339, term3727339.getClass(), "itsNeedsActivation", false);
        setIntField(term3727339, term3727339.getClass(), "itsFunctionType", 0);
        setBooleanField(term3727339, term3727339.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3727339, term3727339.getClass(), "encodedSourceStart", 0);
        setIntField(term3727339, term3727339.getClass(), "encodedSourceEnd", 0);
        setField(term3727339, term3727339.getClass(), "sourceName", null);
        setIntField(term3727339, term3727339.getClass(), "baseLineno", 0);
        setIntField(term3727339, term3727339.getClass(), "endLineno", 0);
        setField(term3727339, term3727339.getClass(), "functions", null);
        setField(term3727339, term3727339.getClass(), "regexps", null);
        setField(term3727339, term3727339.getClass(), "itsVariables", null);
        setField(term3727339, term3727339.getClass(), "itsConst", null);
        setField(term3727339, term3727339.getClass(), "itsVariableNames", null);
        setIntField(term3727339, term3727339.getClass(), "varStart", 0);
        setField(term3727339, term3727339.getClass(), "compilerData", null);
        setIntField(term3727339, term3727339.getClass(), "type", 37);
        setField(term3727339, term3727339.getClass(), "next", null);
        setField(term3727349, term3727349.getClass(), "str", null);
        setIntField(term3727349, term3727349.getClass(), "type", 33);
        setIntField(term3727351, term3727351.getClass(), "type", 40);
        setField(term3727351, term3727351.getClass(), "next", null);
        setField(term3727351, term3727351.getClass(), "first", null);
        setField(term3727351, term3727351.getClass(), "last", null);
        setField(term3727351, term3727351.getClass(), "propListHead", null);
        setIntField(term3727351, term3727351.getClass(), "sourcePosition", 0);
        setField(term3727351, term3727351.getClass(), "jsType", null);
        setField(term3727351, term3727351.getClass(), "parent", null);
        setField(term3727349, term3727349.getClass(), "next", term3727351);
        setField(term3727354, term3727354.getClass(), "str", null);
        setIntField(term3727354, term3727354.getClass(), "type", 40);
        setField(term3727356, term3727356.getClass(), "str", "");
        setIntField(term3727356, term3727356.getClass(), "type", 40);
        setField(term3727356, term3727356.getClass(), "next", null);
        setField(term3727356, term3727356.getClass(), "first", null);
        setField(term3727356, term3727356.getClass(), "last", null);
        setField(term3727356, term3727356.getClass(), "propListHead", null);
        setIntField(term3727356, term3727356.getClass(), "sourcePosition", 0);
        setField(term3727356, term3727356.getClass(), "jsType", null);
        setField(term3727356, term3727356.getClass(), "parent", null);
        setField(term3727354, term3727354.getClass(), "next", term3727356);
        setField(term3727354, term3727354.getClass(), "first", null);
        setField(term3727354, term3727354.getClass(), "last", null);
        setField(term3727354, term3727354.getClass(), "propListHead", null);
        setIntField(term3727354, term3727354.getClass(), "sourcePosition", 0);
        setField(term3727354, term3727354.getClass(), "jsType", null);
        setField(term3727354, term3727354.getClass(), "parent", null);
        setField(term3727349, term3727349.getClass(), "first", term3727354);
        setField(term3727349, term3727349.getClass(), "last", null);
        setField(term3727349, term3727349.getClass(), "propListHead", null);
        setIntField(term3727349, term3727349.getClass(), "sourcePosition", 0);
        setField(term3727349, term3727349.getClass(), "jsType", null);
        setField(term3727349, term3727349.getClass(), "parent", null);
        setField(term3727339, term3727339.getClass(), "first", term3727349);
        setField(term3727339, term3727339.getClass(), "last", null);
        setField(term3727339, term3727339.getClass(), "propListHead", null);
        setIntField(term3727339, term3727339.getClass(), "sourcePosition", 0);
        setField(term3727339, term3727339.getClass(), "jsType", null);
        setField(term3727339, term3727339.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3726214;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3726128, args);
        assertTrue(recursiveEquals(term3726128, term3727529));
        assertTrue(recursiveEquals(term3726214, term3727530));
        assertTrue(recursiveEquals(retValue, term3727339));
    }

};


