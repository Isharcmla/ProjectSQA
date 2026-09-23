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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3628867;
     Object term3628953;
     Object term3629447;
     Object term3629448;
     Object term3629339;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3628867 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3628953 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3629045 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3629137 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3629229 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3629337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3628953, term3628953.getClass(), "type", 37);
        setIntField(term3629045, term3629045.getClass(), "type", 35);
        setIntField(term3629229, term3629229.getClass(), "type", 40);
        setField(term3629229, term3629229.getClass(), "str", "");
        setField(term3629137, term3629137.getClass(), "next", term3629229);
        setIntField(term3629137, term3629137.getClass(), "type", 40);
        setField(term3629045, term3629045.getClass(), "first", term3629137);
        setIntField(term3629337, term3629337.getClass(), "type", 40);
        setField(term3629045, term3629045.getClass(), "next", term3629337);
        setField(term3628953, term3628953.getClass(), "first", term3629045);
        term3629447 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3629447, term3629447.getClass(), "currentTraversal", null);
        term3629448 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3629449 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3629450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3629451 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3629452 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3629448, term3629448.getClass(), "functionName", null);
        setBooleanField(term3629448, term3629448.getClass(), "itsNeedsActivation", false);
        setIntField(term3629448, term3629448.getClass(), "itsFunctionType", 0);
        setBooleanField(term3629448, term3629448.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3629448, term3629448.getClass(), "encodedSourceStart", 0);
        setIntField(term3629448, term3629448.getClass(), "encodedSourceEnd", 0);
        setField(term3629448, term3629448.getClass(), "sourceName", null);
        setIntField(term3629448, term3629448.getClass(), "baseLineno", 0);
        setIntField(term3629448, term3629448.getClass(), "endLineno", 0);
        setField(term3629448, term3629448.getClass(), "functions", null);
        setField(term3629448, term3629448.getClass(), "regexps", null);
        setField(term3629448, term3629448.getClass(), "itsVariables", null);
        setField(term3629448, term3629448.getClass(), "itsConst", null);
        setField(term3629448, term3629448.getClass(), "itsVariableNames", null);
        setIntField(term3629448, term3629448.getClass(), "varStart", 0);
        setField(term3629448, term3629448.getClass(), "compilerData", null);
        setIntField(term3629448, term3629448.getClass(), "type", 37);
        setField(term3629448, term3629448.getClass(), "next", null);
        setField(term3629449, term3629449.getClass(), "str", null);
        setIntField(term3629449, term3629449.getClass(), "type", 35);
        setIntField(term3629450, term3629450.getClass(), "type", 40);
        setField(term3629450, term3629450.getClass(), "next", null);
        setField(term3629450, term3629450.getClass(), "first", null);
        setField(term3629450, term3629450.getClass(), "last", null);
        setField(term3629450, term3629450.getClass(), "propListHead", null);
        setIntField(term3629450, term3629450.getClass(), "sourcePosition", 0);
        setField(term3629450, term3629450.getClass(), "jsType", null);
        setField(term3629450, term3629450.getClass(), "parent", null);
        setField(term3629449, term3629449.getClass(), "next", term3629450);
        setField(term3629451, term3629451.getClass(), "str", null);
        setIntField(term3629451, term3629451.getClass(), "type", 40);
        setField(term3629452, term3629452.getClass(), "str", "");
        setIntField(term3629452, term3629452.getClass(), "type", 40);
        setField(term3629452, term3629452.getClass(), "next", null);
        setField(term3629452, term3629452.getClass(), "first", null);
        setField(term3629452, term3629452.getClass(), "last", null);
        setField(term3629452, term3629452.getClass(), "propListHead", null);
        setIntField(term3629452, term3629452.getClass(), "sourcePosition", 0);
        setField(term3629452, term3629452.getClass(), "jsType", null);
        setField(term3629452, term3629452.getClass(), "parent", null);
        setField(term3629451, term3629451.getClass(), "next", term3629452);
        setField(term3629451, term3629451.getClass(), "first", null);
        setField(term3629451, term3629451.getClass(), "last", null);
        setField(term3629451, term3629451.getClass(), "propListHead", null);
        setIntField(term3629451, term3629451.getClass(), "sourcePosition", 0);
        setField(term3629451, term3629451.getClass(), "jsType", null);
        setField(term3629451, term3629451.getClass(), "parent", null);
        setField(term3629449, term3629449.getClass(), "first", term3629451);
        setField(term3629449, term3629449.getClass(), "last", null);
        setField(term3629449, term3629449.getClass(), "propListHead", null);
        setIntField(term3629449, term3629449.getClass(), "sourcePosition", 0);
        setField(term3629449, term3629449.getClass(), "jsType", null);
        setField(term3629449, term3629449.getClass(), "parent", null);
        setField(term3629448, term3629448.getClass(), "first", term3629449);
        setField(term3629448, term3629448.getClass(), "last", null);
        setField(term3629448, term3629448.getClass(), "propListHead", null);
        setIntField(term3629448, term3629448.getClass(), "sourcePosition", 0);
        setField(term3629448, term3629448.getClass(), "jsType", null);
        setField(term3629448, term3629448.getClass(), "parent", null);
        term3629339 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3629349 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3629351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3629354 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3629356 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3629339, term3629339.getClass(), "functionName", null);
        setBooleanField(term3629339, term3629339.getClass(), "itsNeedsActivation", false);
        setIntField(term3629339, term3629339.getClass(), "itsFunctionType", 0);
        setBooleanField(term3629339, term3629339.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3629339, term3629339.getClass(), "encodedSourceStart", 0);
        setIntField(term3629339, term3629339.getClass(), "encodedSourceEnd", 0);
        setField(term3629339, term3629339.getClass(), "sourceName", null);
        setIntField(term3629339, term3629339.getClass(), "baseLineno", 0);
        setIntField(term3629339, term3629339.getClass(), "endLineno", 0);
        setField(term3629339, term3629339.getClass(), "functions", null);
        setField(term3629339, term3629339.getClass(), "regexps", null);
        setField(term3629339, term3629339.getClass(), "itsVariables", null);
        setField(term3629339, term3629339.getClass(), "itsConst", null);
        setField(term3629339, term3629339.getClass(), "itsVariableNames", null);
        setIntField(term3629339, term3629339.getClass(), "varStart", 0);
        setField(term3629339, term3629339.getClass(), "compilerData", null);
        setIntField(term3629339, term3629339.getClass(), "type", 37);
        setField(term3629339, term3629339.getClass(), "next", null);
        setField(term3629349, term3629349.getClass(), "str", null);
        setIntField(term3629349, term3629349.getClass(), "type", 35);
        setIntField(term3629351, term3629351.getClass(), "type", 40);
        setField(term3629351, term3629351.getClass(), "next", null);
        setField(term3629351, term3629351.getClass(), "first", null);
        setField(term3629351, term3629351.getClass(), "last", null);
        setField(term3629351, term3629351.getClass(), "propListHead", null);
        setIntField(term3629351, term3629351.getClass(), "sourcePosition", 0);
        setField(term3629351, term3629351.getClass(), "jsType", null);
        setField(term3629351, term3629351.getClass(), "parent", null);
        setField(term3629349, term3629349.getClass(), "next", term3629351);
        setField(term3629354, term3629354.getClass(), "str", null);
        setIntField(term3629354, term3629354.getClass(), "type", 40);
        setField(term3629356, term3629356.getClass(), "str", "");
        setIntField(term3629356, term3629356.getClass(), "type", 40);
        setField(term3629356, term3629356.getClass(), "next", null);
        setField(term3629356, term3629356.getClass(), "first", null);
        setField(term3629356, term3629356.getClass(), "last", null);
        setField(term3629356, term3629356.getClass(), "propListHead", null);
        setIntField(term3629356, term3629356.getClass(), "sourcePosition", 0);
        setField(term3629356, term3629356.getClass(), "jsType", null);
        setField(term3629356, term3629356.getClass(), "parent", null);
        setField(term3629354, term3629354.getClass(), "next", term3629356);
        setField(term3629354, term3629354.getClass(), "first", null);
        setField(term3629354, term3629354.getClass(), "last", null);
        setField(term3629354, term3629354.getClass(), "propListHead", null);
        setIntField(term3629354, term3629354.getClass(), "sourcePosition", 0);
        setField(term3629354, term3629354.getClass(), "jsType", null);
        setField(term3629354, term3629354.getClass(), "parent", null);
        setField(term3629349, term3629349.getClass(), "first", term3629354);
        setField(term3629349, term3629349.getClass(), "last", null);
        setField(term3629349, term3629349.getClass(), "propListHead", null);
        setIntField(term3629349, term3629349.getClass(), "sourcePosition", 0);
        setField(term3629349, term3629349.getClass(), "jsType", null);
        setField(term3629349, term3629349.getClass(), "parent", null);
        setField(term3629339, term3629339.getClass(), "first", term3629349);
        setField(term3629339, term3629339.getClass(), "last", null);
        setField(term3629339, term3629339.getClass(), "propListHead", null);
        setIntField(term3629339, term3629339.getClass(), "sourcePosition", 0);
        setField(term3629339, term3629339.getClass(), "jsType", null);
        setField(term3629339, term3629339.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3628953;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3628867, args);
        assertTrue(recursiveEquals(term3628867, term3629447));
        assertTrue(recursiveEquals(term3628953, term3629448));
        assertTrue(recursiveEquals(retValue, term3629339));
    }

};


