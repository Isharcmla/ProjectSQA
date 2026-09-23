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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4464852;
     Object term4464938;
     Object term4466327;
     Object term4466328;
     Object term4466118;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4464852 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4464938 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4465030 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4465122 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4465230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4464938, term4464938.getClass(), "type", 37);
        setIntField(term4465030, term4465030.getClass(), "type", 33);
        setField(term4465122, term4465122.getClass(), "next", term4465122);
        setIntField(term4465122, term4465122.getClass(), "type", 40);
        setField(term4465122, term4465122.getClass(), "str", "charCodeAt");
        setField(term4465030, term4465030.getClass(), "first", term4465122);
        setIntField(term4465230, term4465230.getClass(), "type", 44);
        setField(term4465030, term4465030.getClass(), "next", term4465230);
        setField(term4464938, term4464938.getClass(), "first", term4465030);
        term4466327 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4466327, term4466327.getClass(), "currentTraversal", null);
        term4466328 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4466329 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4466330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4466331 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4466328, term4466328.getClass(), "functionName", null);
        setBooleanField(term4466328, term4466328.getClass(), "itsNeedsActivation", false);
        setIntField(term4466328, term4466328.getClass(), "itsFunctionType", 0);
        setBooleanField(term4466328, term4466328.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4466328, term4466328.getClass(), "encodedSourceStart", 0);
        setIntField(term4466328, term4466328.getClass(), "encodedSourceEnd", 0);
        setField(term4466328, term4466328.getClass(), "sourceName", null);
        setIntField(term4466328, term4466328.getClass(), "baseLineno", 0);
        setIntField(term4466328, term4466328.getClass(), "endLineno", 0);
        setField(term4466328, term4466328.getClass(), "functions", null);
        setField(term4466328, term4466328.getClass(), "regexps", null);
        setField(term4466328, term4466328.getClass(), "itsVariables", null);
        setField(term4466328, term4466328.getClass(), "itsConst", null);
        setField(term4466328, term4466328.getClass(), "itsVariableNames", null);
        setIntField(term4466328, term4466328.getClass(), "varStart", 0);
        setField(term4466328, term4466328.getClass(), "compilerData", null);
        setIntField(term4466328, term4466328.getClass(), "type", 37);
        setField(term4466328, term4466328.getClass(), "next", null);
        setField(term4466329, term4466329.getClass(), "str", null);
        setIntField(term4466329, term4466329.getClass(), "type", 33);
        setIntField(term4466330, term4466330.getClass(), "type", 44);
        setField(term4466330, term4466330.getClass(), "next", null);
        setField(term4466330, term4466330.getClass(), "first", null);
        setField(term4466330, term4466330.getClass(), "last", null);
        setField(term4466330, term4466330.getClass(), "propListHead", null);
        setIntField(term4466330, term4466330.getClass(), "sourcePosition", 0);
        setField(term4466330, term4466330.getClass(), "jsType", null);
        setField(term4466330, term4466330.getClass(), "parent", null);
        setField(term4466329, term4466329.getClass(), "next", term4466330);
        setField(term4466331, term4466331.getClass(), "str", "charCodeAt");
        setIntField(term4466331, term4466331.getClass(), "type", 40);
        setField(term4466331, term4466331.getClass(), "next", term4466331);
        setField(term4466331, term4466331.getClass(), "first", null);
        setField(term4466331, term4466331.getClass(), "last", null);
        setField(term4466331, term4466331.getClass(), "propListHead", null);
        setIntField(term4466331, term4466331.getClass(), "sourcePosition", 0);
        setField(term4466331, term4466331.getClass(), "jsType", null);
        setField(term4466331, term4466331.getClass(), "parent", null);
        setField(term4466329, term4466329.getClass(), "first", term4466331);
        setField(term4466329, term4466329.getClass(), "last", null);
        setField(term4466329, term4466329.getClass(), "propListHead", null);
        setIntField(term4466329, term4466329.getClass(), "sourcePosition", 0);
        setField(term4466329, term4466329.getClass(), "jsType", null);
        setField(term4466329, term4466329.getClass(), "parent", null);
        setField(term4466328, term4466328.getClass(), "first", term4466329);
        setField(term4466328, term4466328.getClass(), "last", null);
        setField(term4466328, term4466328.getClass(), "propListHead", null);
        setIntField(term4466328, term4466328.getClass(), "sourcePosition", 0);
        setField(term4466328, term4466328.getClass(), "jsType", null);
        setField(term4466328, term4466328.getClass(), "parent", null);
        term4466118 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4466128 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4466130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4466133 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4466118, term4466118.getClass(), "functionName", null);
        setBooleanField(term4466118, term4466118.getClass(), "itsNeedsActivation", false);
        setIntField(term4466118, term4466118.getClass(), "itsFunctionType", 0);
        setBooleanField(term4466118, term4466118.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4466118, term4466118.getClass(), "encodedSourceStart", 0);
        setIntField(term4466118, term4466118.getClass(), "encodedSourceEnd", 0);
        setField(term4466118, term4466118.getClass(), "sourceName", null);
        setIntField(term4466118, term4466118.getClass(), "baseLineno", 0);
        setIntField(term4466118, term4466118.getClass(), "endLineno", 0);
        setField(term4466118, term4466118.getClass(), "functions", null);
        setField(term4466118, term4466118.getClass(), "regexps", null);
        setField(term4466118, term4466118.getClass(), "itsVariables", null);
        setField(term4466118, term4466118.getClass(), "itsConst", null);
        setField(term4466118, term4466118.getClass(), "itsVariableNames", null);
        setIntField(term4466118, term4466118.getClass(), "varStart", 0);
        setField(term4466118, term4466118.getClass(), "compilerData", null);
        setIntField(term4466118, term4466118.getClass(), "type", 37);
        setField(term4466118, term4466118.getClass(), "next", null);
        setField(term4466128, term4466128.getClass(), "str", null);
        setIntField(term4466128, term4466128.getClass(), "type", 33);
        setIntField(term4466130, term4466130.getClass(), "type", 44);
        setField(term4466130, term4466130.getClass(), "next", null);
        setField(term4466130, term4466130.getClass(), "first", null);
        setField(term4466130, term4466130.getClass(), "last", null);
        setField(term4466130, term4466130.getClass(), "propListHead", null);
        setIntField(term4466130, term4466130.getClass(), "sourcePosition", 0);
        setField(term4466130, term4466130.getClass(), "jsType", null);
        setField(term4466130, term4466130.getClass(), "parent", null);
        setField(term4466128, term4466128.getClass(), "next", term4466130);
        setField(term4466133, term4466133.getClass(), "str", "charCodeAt");
        setIntField(term4466133, term4466133.getClass(), "type", 40);
        setField(term4466133, term4466133.getClass(), "next", term4466133);
        setField(term4466133, term4466133.getClass(), "first", null);
        setField(term4466133, term4466133.getClass(), "last", null);
        setField(term4466133, term4466133.getClass(), "propListHead", null);
        setIntField(term4466133, term4466133.getClass(), "sourcePosition", 0);
        setField(term4466133, term4466133.getClass(), "jsType", null);
        setField(term4466133, term4466133.getClass(), "parent", null);
        setField(term4466128, term4466128.getClass(), "first", term4466133);
        setField(term4466128, term4466128.getClass(), "last", null);
        setField(term4466128, term4466128.getClass(), "propListHead", null);
        setIntField(term4466128, term4466128.getClass(), "sourcePosition", 0);
        setField(term4466128, term4466128.getClass(), "jsType", null);
        setField(term4466128, term4466128.getClass(), "parent", null);
        setField(term4466118, term4466118.getClass(), "first", term4466128);
        setField(term4466118, term4466118.getClass(), "last", null);
        setField(term4466118, term4466118.getClass(), "propListHead", null);
        setIntField(term4466118, term4466118.getClass(), "sourcePosition", 0);
        setField(term4466118, term4466118.getClass(), "jsType", null);
        setField(term4466118, term4466118.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4464938;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4464852, args);
        assertTrue(recursiveEquals(term4464852, term4466327));
        assertTrue(recursiveEquals(term4464938, term4466328));
        assertTrue(recursiveEquals(retValue, term4466118));
    }

};


