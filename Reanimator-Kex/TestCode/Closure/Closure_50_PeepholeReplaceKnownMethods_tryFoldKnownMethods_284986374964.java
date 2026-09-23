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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3804889;
     Object term3804981;
     Object term3805555;
     Object term3805556;
     Object term3805321;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3804889 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3804981 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3805073 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3805165 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3805289 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3805073, term3805073.getClass(), "type", 35);
        setField(term3805165, term3805165.getClass(), "next", term3805165);
        setIntField(term3805165, term3805165.getClass(), "type", 40);
        setField(term3805165, term3805165.getClass(), "str", "");
        setField(term3805073, term3805073.getClass(), "first", term3805165);
        setIntField(term3805289, term3805289.getClass(), "type", 40);
        setField(term3805073, term3805073.getClass(), "next", term3805289);
        setField(term3804981, term3804981.getClass(), "first", term3805073);
        setIntField(term3804981, term3804981.getClass(), "type", 37);
        term3805555 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3805555, term3805555.getClass(), "currentTraversal", null);
        term3805556 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3805557 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3805558 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3805559 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3805556, term3805556.getClass(), "str", null);
        setIntField(term3805556, term3805556.getClass(), "type", 37);
        setField(term3805556, term3805556.getClass(), "next", null);
        setField(term3805557, term3805557.getClass(), "str", null);
        setIntField(term3805557, term3805557.getClass(), "type", 35);
        setField(term3805558, term3805558.getClass(), "functionName", null);
        setBooleanField(term3805558, term3805558.getClass(), "itsNeedsActivation", false);
        setIntField(term3805558, term3805558.getClass(), "itsFunctionType", 0);
        setBooleanField(term3805558, term3805558.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3805558, term3805558.getClass(), "encodedSourceStart", 0);
        setIntField(term3805558, term3805558.getClass(), "encodedSourceEnd", 0);
        setField(term3805558, term3805558.getClass(), "sourceName", null);
        setIntField(term3805558, term3805558.getClass(), "baseLineno", 0);
        setIntField(term3805558, term3805558.getClass(), "endLineno", 0);
        setField(term3805558, term3805558.getClass(), "functions", null);
        setField(term3805558, term3805558.getClass(), "regexps", null);
        setField(term3805558, term3805558.getClass(), "itsVariables", null);
        setField(term3805558, term3805558.getClass(), "itsConst", null);
        setField(term3805558, term3805558.getClass(), "itsVariableNames", null);
        setIntField(term3805558, term3805558.getClass(), "varStart", 0);
        setField(term3805558, term3805558.getClass(), "compilerData", null);
        setIntField(term3805558, term3805558.getClass(), "type", 40);
        setField(term3805558, term3805558.getClass(), "next", null);
        setField(term3805558, term3805558.getClass(), "first", null);
        setField(term3805558, term3805558.getClass(), "last", null);
        setField(term3805558, term3805558.getClass(), "propListHead", null);
        setIntField(term3805558, term3805558.getClass(), "sourcePosition", 0);
        setField(term3805558, term3805558.getClass(), "jsType", null);
        setField(term3805558, term3805558.getClass(), "parent", null);
        setField(term3805557, term3805557.getClass(), "next", term3805558);
        setField(term3805559, term3805559.getClass(), "str", "");
        setIntField(term3805559, term3805559.getClass(), "type", 40);
        setField(term3805559, term3805559.getClass(), "next", term3805559);
        setField(term3805559, term3805559.getClass(), "first", null);
        setField(term3805559, term3805559.getClass(), "last", null);
        setField(term3805559, term3805559.getClass(), "propListHead", null);
        setIntField(term3805559, term3805559.getClass(), "sourcePosition", 0);
        setField(term3805559, term3805559.getClass(), "jsType", null);
        setField(term3805559, term3805559.getClass(), "parent", null);
        setField(term3805557, term3805557.getClass(), "first", term3805559);
        setField(term3805557, term3805557.getClass(), "last", null);
        setField(term3805557, term3805557.getClass(), "propListHead", null);
        setIntField(term3805557, term3805557.getClass(), "sourcePosition", 0);
        setField(term3805557, term3805557.getClass(), "jsType", null);
        setField(term3805557, term3805557.getClass(), "parent", null);
        setField(term3805556, term3805556.getClass(), "first", term3805557);
        setField(term3805556, term3805556.getClass(), "last", null);
        setField(term3805556, term3805556.getClass(), "propListHead", null);
        setIntField(term3805556, term3805556.getClass(), "sourcePosition", 0);
        setField(term3805556, term3805556.getClass(), "jsType", null);
        setField(term3805556, term3805556.getClass(), "parent", null);
        term3805321 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3805323 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3805325 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3805336 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3805321, term3805321.getClass(), "str", null);
        setIntField(term3805321, term3805321.getClass(), "type", 37);
        setField(term3805321, term3805321.getClass(), "next", null);
        setField(term3805323, term3805323.getClass(), "str", null);
        setIntField(term3805323, term3805323.getClass(), "type", 35);
        setField(term3805325, term3805325.getClass(), "functionName", null);
        setBooleanField(term3805325, term3805325.getClass(), "itsNeedsActivation", false);
        setIntField(term3805325, term3805325.getClass(), "itsFunctionType", 0);
        setBooleanField(term3805325, term3805325.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3805325, term3805325.getClass(), "encodedSourceStart", 0);
        setIntField(term3805325, term3805325.getClass(), "encodedSourceEnd", 0);
        setField(term3805325, term3805325.getClass(), "sourceName", null);
        setIntField(term3805325, term3805325.getClass(), "baseLineno", 0);
        setIntField(term3805325, term3805325.getClass(), "endLineno", 0);
        setField(term3805325, term3805325.getClass(), "functions", null);
        setField(term3805325, term3805325.getClass(), "regexps", null);
        setField(term3805325, term3805325.getClass(), "itsVariables", null);
        setField(term3805325, term3805325.getClass(), "itsConst", null);
        setField(term3805325, term3805325.getClass(), "itsVariableNames", null);
        setIntField(term3805325, term3805325.getClass(), "varStart", 0);
        setField(term3805325, term3805325.getClass(), "compilerData", null);
        setIntField(term3805325, term3805325.getClass(), "type", 40);
        setField(term3805325, term3805325.getClass(), "next", null);
        setField(term3805325, term3805325.getClass(), "first", null);
        setField(term3805325, term3805325.getClass(), "last", null);
        setField(term3805325, term3805325.getClass(), "propListHead", null);
        setIntField(term3805325, term3805325.getClass(), "sourcePosition", 0);
        setField(term3805325, term3805325.getClass(), "jsType", null);
        setField(term3805325, term3805325.getClass(), "parent", null);
        setField(term3805323, term3805323.getClass(), "next", term3805325);
        setField(term3805336, term3805336.getClass(), "str", "");
        setIntField(term3805336, term3805336.getClass(), "type", 40);
        setField(term3805336, term3805336.getClass(), "next", term3805336);
        setField(term3805336, term3805336.getClass(), "first", null);
        setField(term3805336, term3805336.getClass(), "last", null);
        setField(term3805336, term3805336.getClass(), "propListHead", null);
        setIntField(term3805336, term3805336.getClass(), "sourcePosition", 0);
        setField(term3805336, term3805336.getClass(), "jsType", null);
        setField(term3805336, term3805336.getClass(), "parent", null);
        setField(term3805323, term3805323.getClass(), "first", term3805336);
        setField(term3805323, term3805323.getClass(), "last", null);
        setField(term3805323, term3805323.getClass(), "propListHead", null);
        setIntField(term3805323, term3805323.getClass(), "sourcePosition", 0);
        setField(term3805323, term3805323.getClass(), "jsType", null);
        setField(term3805323, term3805323.getClass(), "parent", null);
        setField(term3805321, term3805321.getClass(), "first", term3805323);
        setField(term3805321, term3805321.getClass(), "last", null);
        setField(term3805321, term3805321.getClass(), "propListHead", null);
        setIntField(term3805321, term3805321.getClass(), "sourcePosition", 0);
        setField(term3805321, term3805321.getClass(), "jsType", null);
        setField(term3805321, term3805321.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3804981;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3804889, args);
        assertTrue(recursiveEquals(term3804889, term3805555));
        assertTrue(recursiveEquals(term3804981, term3805556));
        assertTrue(recursiveEquals(retValue, term3805321));
    }

};


