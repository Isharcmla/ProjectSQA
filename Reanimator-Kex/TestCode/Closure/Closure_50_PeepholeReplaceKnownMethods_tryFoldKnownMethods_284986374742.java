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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3639490;
     Object term3639582;
     Object term3640345;
     Object term3640346;
     Object term3640017;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3639490 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3639582 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3639674 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3639766 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3639858 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3639982 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3639674, term3639674.getClass(), "type", 35);
        setIntField(term3639858, term3639858.getClass(), "type", 40);
        setField(term3639858, term3639858.getClass(), "str", "substr");
        setField(term3639766, term3639766.getClass(), "next", term3639858);
        setIntField(term3639766, term3639766.getClass(), "type", 40);
        setField(term3639674, term3639674.getClass(), "first", term3639766);
        setIntField(term3639982, term3639982.getClass(), "type", 41);
        setField(term3639674, term3639674.getClass(), "next", term3639982);
        setField(term3639582, term3639582.getClass(), "first", term3639674);
        setIntField(term3639582, term3639582.getClass(), "type", 37);
        term3640345 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3640345, term3640345.getClass(), "currentTraversal", null);
        term3640346 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3640347 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3640348 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3640349 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3640350 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3640346, term3640346.getClass(), "str", null);
        setIntField(term3640346, term3640346.getClass(), "type", 37);
        setField(term3640346, term3640346.getClass(), "next", null);
        setField(term3640347, term3640347.getClass(), "str", null);
        setIntField(term3640347, term3640347.getClass(), "type", 35);
        setField(term3640348, term3640348.getClass(), "functionName", null);
        setBooleanField(term3640348, term3640348.getClass(), "itsNeedsActivation", false);
        setIntField(term3640348, term3640348.getClass(), "itsFunctionType", 0);
        setBooleanField(term3640348, term3640348.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3640348, term3640348.getClass(), "encodedSourceStart", 0);
        setIntField(term3640348, term3640348.getClass(), "encodedSourceEnd", 0);
        setField(term3640348, term3640348.getClass(), "sourceName", null);
        setIntField(term3640348, term3640348.getClass(), "baseLineno", 0);
        setIntField(term3640348, term3640348.getClass(), "endLineno", 0);
        setField(term3640348, term3640348.getClass(), "functions", null);
        setField(term3640348, term3640348.getClass(), "regexps", null);
        setField(term3640348, term3640348.getClass(), "itsVariables", null);
        setField(term3640348, term3640348.getClass(), "itsConst", null);
        setField(term3640348, term3640348.getClass(), "itsVariableNames", null);
        setIntField(term3640348, term3640348.getClass(), "varStart", 0);
        setField(term3640348, term3640348.getClass(), "compilerData", null);
        setIntField(term3640348, term3640348.getClass(), "type", 41);
        setField(term3640348, term3640348.getClass(), "next", null);
        setField(term3640348, term3640348.getClass(), "first", null);
        setField(term3640348, term3640348.getClass(), "last", null);
        setField(term3640348, term3640348.getClass(), "propListHead", null);
        setIntField(term3640348, term3640348.getClass(), "sourcePosition", 0);
        setField(term3640348, term3640348.getClass(), "jsType", null);
        setField(term3640348, term3640348.getClass(), "parent", null);
        setField(term3640347, term3640347.getClass(), "next", term3640348);
        setField(term3640349, term3640349.getClass(), "str", null);
        setIntField(term3640349, term3640349.getClass(), "type", 40);
        setField(term3640350, term3640350.getClass(), "str", "");
        setIntField(term3640350, term3640350.getClass(), "type", 40);
        setField(term3640350, term3640350.getClass(), "next", null);
        setField(term3640350, term3640350.getClass(), "first", null);
        setField(term3640350, term3640350.getClass(), "last", null);
        setField(term3640350, term3640350.getClass(), "propListHead", null);
        setIntField(term3640350, term3640350.getClass(), "sourcePosition", 0);
        setField(term3640350, term3640350.getClass(), "jsType", null);
        setField(term3640350, term3640350.getClass(), "parent", null);
        setField(term3640349, term3640349.getClass(), "next", term3640350);
        setField(term3640349, term3640349.getClass(), "first", null);
        setField(term3640349, term3640349.getClass(), "last", null);
        setField(term3640349, term3640349.getClass(), "propListHead", null);
        setIntField(term3640349, term3640349.getClass(), "sourcePosition", 0);
        setField(term3640349, term3640349.getClass(), "jsType", null);
        setField(term3640349, term3640349.getClass(), "parent", null);
        setField(term3640347, term3640347.getClass(), "first", term3640349);
        setField(term3640347, term3640347.getClass(), "last", null);
        setField(term3640347, term3640347.getClass(), "propListHead", null);
        setIntField(term3640347, term3640347.getClass(), "sourcePosition", 0);
        setField(term3640347, term3640347.getClass(), "jsType", null);
        setField(term3640347, term3640347.getClass(), "parent", null);
        setField(term3640346, term3640346.getClass(), "first", term3640347);
        setField(term3640346, term3640346.getClass(), "last", null);
        setField(term3640346, term3640346.getClass(), "propListHead", null);
        setIntField(term3640346, term3640346.getClass(), "sourcePosition", 0);
        setField(term3640346, term3640346.getClass(), "jsType", null);
        setField(term3640346, term3640346.getClass(), "parent", null);
        term3640017 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3640019 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3640021 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3640032 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3640034 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3640017, term3640017.getClass(), "str", null);
        setIntField(term3640017, term3640017.getClass(), "type", 37);
        setField(term3640017, term3640017.getClass(), "next", null);
        setField(term3640019, term3640019.getClass(), "str", null);
        setIntField(term3640019, term3640019.getClass(), "type", 35);
        setField(term3640021, term3640021.getClass(), "functionName", null);
        setBooleanField(term3640021, term3640021.getClass(), "itsNeedsActivation", false);
        setIntField(term3640021, term3640021.getClass(), "itsFunctionType", 0);
        setBooleanField(term3640021, term3640021.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3640021, term3640021.getClass(), "encodedSourceStart", 0);
        setIntField(term3640021, term3640021.getClass(), "encodedSourceEnd", 0);
        setField(term3640021, term3640021.getClass(), "sourceName", null);
        setIntField(term3640021, term3640021.getClass(), "baseLineno", 0);
        setIntField(term3640021, term3640021.getClass(), "endLineno", 0);
        setField(term3640021, term3640021.getClass(), "functions", null);
        setField(term3640021, term3640021.getClass(), "regexps", null);
        setField(term3640021, term3640021.getClass(), "itsVariables", null);
        setField(term3640021, term3640021.getClass(), "itsConst", null);
        setField(term3640021, term3640021.getClass(), "itsVariableNames", null);
        setIntField(term3640021, term3640021.getClass(), "varStart", 0);
        setField(term3640021, term3640021.getClass(), "compilerData", null);
        setIntField(term3640021, term3640021.getClass(), "type", 41);
        setField(term3640021, term3640021.getClass(), "next", null);
        setField(term3640021, term3640021.getClass(), "first", null);
        setField(term3640021, term3640021.getClass(), "last", null);
        setField(term3640021, term3640021.getClass(), "propListHead", null);
        setIntField(term3640021, term3640021.getClass(), "sourcePosition", 0);
        setField(term3640021, term3640021.getClass(), "jsType", null);
        setField(term3640021, term3640021.getClass(), "parent", null);
        setField(term3640019, term3640019.getClass(), "next", term3640021);
        setField(term3640032, term3640032.getClass(), "str", null);
        setIntField(term3640032, term3640032.getClass(), "type", 40);
        setField(term3640034, term3640034.getClass(), "str", "");
        setIntField(term3640034, term3640034.getClass(), "type", 40);
        setField(term3640034, term3640034.getClass(), "next", null);
        setField(term3640034, term3640034.getClass(), "first", null);
        setField(term3640034, term3640034.getClass(), "last", null);
        setField(term3640034, term3640034.getClass(), "propListHead", null);
        setIntField(term3640034, term3640034.getClass(), "sourcePosition", 0);
        setField(term3640034, term3640034.getClass(), "jsType", null);
        setField(term3640034, term3640034.getClass(), "parent", null);
        setField(term3640032, term3640032.getClass(), "next", term3640034);
        setField(term3640032, term3640032.getClass(), "first", null);
        setField(term3640032, term3640032.getClass(), "last", null);
        setField(term3640032, term3640032.getClass(), "propListHead", null);
        setIntField(term3640032, term3640032.getClass(), "sourcePosition", 0);
        setField(term3640032, term3640032.getClass(), "jsType", null);
        setField(term3640032, term3640032.getClass(), "parent", null);
        setField(term3640019, term3640019.getClass(), "first", term3640032);
        setField(term3640019, term3640019.getClass(), "last", null);
        setField(term3640019, term3640019.getClass(), "propListHead", null);
        setIntField(term3640019, term3640019.getClass(), "sourcePosition", 0);
        setField(term3640019, term3640019.getClass(), "jsType", null);
        setField(term3640019, term3640019.getClass(), "parent", null);
        setField(term3640017, term3640017.getClass(), "first", term3640019);
        setField(term3640017, term3640017.getClass(), "last", null);
        setField(term3640017, term3640017.getClass(), "propListHead", null);
        setIntField(term3640017, term3640017.getClass(), "sourcePosition", 0);
        setField(term3640017, term3640017.getClass(), "jsType", null);
        setField(term3640017, term3640017.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3639582;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3639490, args);
        assertTrue(recursiveEquals(term3639490, term3640345));
        assertTrue(recursiveEquals(term3639582, term3640346));
        assertTrue(recursiveEquals(retValue, term3640017));
    }

};


