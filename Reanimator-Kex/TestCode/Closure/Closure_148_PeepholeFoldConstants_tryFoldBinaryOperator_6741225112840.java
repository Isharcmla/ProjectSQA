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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term826124;
     Object term826216;
     Object term827374;
     Object term827375;
     Object term827267;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term826124 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term826216 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term826308 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term826400 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term826486 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term826400, term826400.getClass(), "type", 44);
        setField(term826308, term826308.getClass(), "next", term826400);
        setIntField(term826308, term826308.getClass(), "type", 0);
        setField(term826216, term826216.getClass(), "first", term826308);
        setIntField(term826216, term826216.getClass(), "type", 101);
        setField(term826216, term826216.getClass(), "parent", term826486);
        term827374 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term827374, term827374.getClass(), "currentTraversal", null);
        term827375 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term827376 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term827377 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term827378 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term827375, term827375.getClass(), "number", 0.0);
        setIntField(term827375, term827375.getClass(), "type", 101);
        setField(term827375, term827375.getClass(), "next", null);
        setDoubleField(term827376, term827376.getClass(), "number", 0.0);
        setIntField(term827376, term827376.getClass(), "type", 0);
        setDoubleField(term827377, term827377.getClass(), "number", 0.0);
        setIntField(term827377, term827377.getClass(), "type", 44);
        setField(term827377, term827377.getClass(), "next", null);
        setField(term827377, term827377.getClass(), "first", null);
        setField(term827377, term827377.getClass(), "last", null);
        setField(term827377, term827377.getClass(), "propListHead", null);
        setIntField(term827377, term827377.getClass(), "sourcePosition", 0);
        setField(term827377, term827377.getClass(), "jsType", null);
        setField(term827377, term827377.getClass(), "parent", null);
        setField(term827376, term827376.getClass(), "next", term827377);
        setField(term827376, term827376.getClass(), "first", null);
        setField(term827376, term827376.getClass(), "last", null);
        setField(term827376, term827376.getClass(), "propListHead", null);
        setIntField(term827376, term827376.getClass(), "sourcePosition", 0);
        setField(term827376, term827376.getClass(), "jsType", null);
        setField(term827376, term827376.getClass(), "parent", null);
        setField(term827375, term827375.getClass(), "first", term827376);
        setField(term827375, term827375.getClass(), "last", null);
        setField(term827375, term827375.getClass(), "propListHead", null);
        setIntField(term827375, term827375.getClass(), "sourcePosition", 0);
        setField(term827375, term827375.getClass(), "jsType", null);
        setField(term827378, term827378.getClass(), "functionName", null);
        setBooleanField(term827378, term827378.getClass(), "itsNeedsActivation", false);
        setIntField(term827378, term827378.getClass(), "itsFunctionType", 0);
        setBooleanField(term827378, term827378.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term827378, term827378.getClass(), "encodedSourceStart", 0);
        setIntField(term827378, term827378.getClass(), "encodedSourceEnd", 0);
        setField(term827378, term827378.getClass(), "sourceName", null);
        setIntField(term827378, term827378.getClass(), "baseLineno", 0);
        setIntField(term827378, term827378.getClass(), "endLineno", 0);
        setField(term827378, term827378.getClass(), "functions", null);
        setField(term827378, term827378.getClass(), "regexps", null);
        setField(term827378, term827378.getClass(), "itsVariables", null);
        setField(term827378, term827378.getClass(), "itsConst", null);
        setField(term827378, term827378.getClass(), "itsVariableNames", null);
        setIntField(term827378, term827378.getClass(), "varStart", 0);
        setField(term827378, term827378.getClass(), "compilerData", null);
        setIntField(term827378, term827378.getClass(), "type", 0);
        setField(term827378, term827378.getClass(), "next", null);
        setField(term827378, term827378.getClass(), "first", null);
        setField(term827378, term827378.getClass(), "last", null);
        setField(term827378, term827378.getClass(), "propListHead", null);
        setIntField(term827378, term827378.getClass(), "sourcePosition", 0);
        setField(term827378, term827378.getClass(), "jsType", null);
        setField(term827378, term827378.getClass(), "parent", null);
        setField(term827375, term827375.getClass(), "parent", term827378);
        term827267 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term827270 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term827273 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term827279 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term827267, term827267.getClass(), "number", 0.0);
        setIntField(term827267, term827267.getClass(), "type", 101);
        setField(term827267, term827267.getClass(), "next", null);
        setDoubleField(term827270, term827270.getClass(), "number", 0.0);
        setIntField(term827270, term827270.getClass(), "type", 0);
        setDoubleField(term827273, term827273.getClass(), "number", 0.0);
        setIntField(term827273, term827273.getClass(), "type", 44);
        setField(term827273, term827273.getClass(), "next", null);
        setField(term827273, term827273.getClass(), "first", null);
        setField(term827273, term827273.getClass(), "last", null);
        setField(term827273, term827273.getClass(), "propListHead", null);
        setIntField(term827273, term827273.getClass(), "sourcePosition", 0);
        setField(term827273, term827273.getClass(), "jsType", null);
        setField(term827273, term827273.getClass(), "parent", null);
        setField(term827270, term827270.getClass(), "next", term827273);
        setField(term827270, term827270.getClass(), "first", null);
        setField(term827270, term827270.getClass(), "last", null);
        setField(term827270, term827270.getClass(), "propListHead", null);
        setIntField(term827270, term827270.getClass(), "sourcePosition", 0);
        setField(term827270, term827270.getClass(), "jsType", null);
        setField(term827270, term827270.getClass(), "parent", null);
        setField(term827267, term827267.getClass(), "first", term827270);
        setField(term827267, term827267.getClass(), "last", null);
        setField(term827267, term827267.getClass(), "propListHead", null);
        setIntField(term827267, term827267.getClass(), "sourcePosition", 0);
        setField(term827267, term827267.getClass(), "jsType", null);
        setField(term827279, term827279.getClass(), "functionName", null);
        setBooleanField(term827279, term827279.getClass(), "itsNeedsActivation", false);
        setIntField(term827279, term827279.getClass(), "itsFunctionType", 0);
        setBooleanField(term827279, term827279.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term827279, term827279.getClass(), "encodedSourceStart", 0);
        setIntField(term827279, term827279.getClass(), "encodedSourceEnd", 0);
        setField(term827279, term827279.getClass(), "sourceName", null);
        setIntField(term827279, term827279.getClass(), "baseLineno", 0);
        setIntField(term827279, term827279.getClass(), "endLineno", 0);
        setField(term827279, term827279.getClass(), "functions", null);
        setField(term827279, term827279.getClass(), "regexps", null);
        setField(term827279, term827279.getClass(), "itsVariables", null);
        setField(term827279, term827279.getClass(), "itsConst", null);
        setField(term827279, term827279.getClass(), "itsVariableNames", null);
        setIntField(term827279, term827279.getClass(), "varStart", 0);
        setField(term827279, term827279.getClass(), "compilerData", null);
        setIntField(term827279, term827279.getClass(), "type", 0);
        setField(term827279, term827279.getClass(), "next", null);
        setField(term827279, term827279.getClass(), "first", null);
        setField(term827279, term827279.getClass(), "last", null);
        setField(term827279, term827279.getClass(), "propListHead", null);
        setIntField(term827279, term827279.getClass(), "sourcePosition", 0);
        setField(term827279, term827279.getClass(), "jsType", null);
        setField(term827279, term827279.getClass(), "parent", null);
        setField(term827267, term827267.getClass(), "parent", term827279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term826216;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term826124, args);
        assertTrue(recursiveEquals(term826124, term827374));
        assertTrue(recursiveEquals(term826216, term827375));
        assertTrue(recursiveEquals(retValue, term827267));
    }

};


