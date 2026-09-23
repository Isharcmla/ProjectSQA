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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2640456;
     Object term2640548;
     Object term2641434;
     Object term2641435;
     Object term2641304;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2640456 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2640548 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2640634 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2640704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2640790 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2640548, term2640548.getClass(), "type", 37);
        setIntField(term2640634, term2640634.getClass(), "type", 35);
        setField(term2640704, term2640704.getClass(), "next", term2640790);
        setIntField(term2640704, term2640704.getClass(), "type", 40);
        setField(term2640634, term2640634.getClass(), "first", term2640704);
        setField(term2640548, term2640548.getClass(), "first", term2640634);
        term2641434 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2641434, term2641434.getClass(), "currentTraversal", null);
        term2641435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2641436 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2641437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2641438 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term2641435, term2641435.getClass(), "number", 0.0);
        setIntField(term2641435, term2641435.getClass(), "type", 37);
        setField(term2641435, term2641435.getClass(), "next", null);
        setField(term2641436, term2641436.getClass(), "functionName", null);
        setBooleanField(term2641436, term2641436.getClass(), "itsNeedsActivation", false);
        setIntField(term2641436, term2641436.getClass(), "itsFunctionType", 0);
        setBooleanField(term2641436, term2641436.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2641436, term2641436.getClass(), "encodedSourceStart", 0);
        setIntField(term2641436, term2641436.getClass(), "encodedSourceEnd", 0);
        setField(term2641436, term2641436.getClass(), "sourceName", null);
        setIntField(term2641436, term2641436.getClass(), "baseLineno", 0);
        setIntField(term2641436, term2641436.getClass(), "endLineno", 0);
        setField(term2641436, term2641436.getClass(), "functions", null);
        setField(term2641436, term2641436.getClass(), "regexps", null);
        setField(term2641436, term2641436.getClass(), "itsVariables", null);
        setField(term2641436, term2641436.getClass(), "itsConst", null);
        setField(term2641436, term2641436.getClass(), "itsVariableNames", null);
        setIntField(term2641436, term2641436.getClass(), "varStart", 0);
        setField(term2641436, term2641436.getClass(), "compilerData", null);
        setIntField(term2641436, term2641436.getClass(), "type", 35);
        setField(term2641436, term2641436.getClass(), "next", null);
        setIntField(term2641437, term2641437.getClass(), "type", 40);
        setField(term2641438, term2641438.getClass(), "functionName", null);
        setBooleanField(term2641438, term2641438.getClass(), "itsNeedsActivation", false);
        setIntField(term2641438, term2641438.getClass(), "itsFunctionType", 0);
        setBooleanField(term2641438, term2641438.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2641438, term2641438.getClass(), "encodedSourceStart", 0);
        setIntField(term2641438, term2641438.getClass(), "encodedSourceEnd", 0);
        setField(term2641438, term2641438.getClass(), "sourceName", null);
        setIntField(term2641438, term2641438.getClass(), "baseLineno", 0);
        setIntField(term2641438, term2641438.getClass(), "endLineno", 0);
        setField(term2641438, term2641438.getClass(), "functions", null);
        setField(term2641438, term2641438.getClass(), "regexps", null);
        setField(term2641438, term2641438.getClass(), "itsVariables", null);
        setField(term2641438, term2641438.getClass(), "itsConst", null);
        setField(term2641438, term2641438.getClass(), "itsVariableNames", null);
        setIntField(term2641438, term2641438.getClass(), "varStart", 0);
        setField(term2641438, term2641438.getClass(), "compilerData", null);
        setIntField(term2641438, term2641438.getClass(), "type", 0);
        setField(term2641438, term2641438.getClass(), "next", null);
        setField(term2641438, term2641438.getClass(), "first", null);
        setField(term2641438, term2641438.getClass(), "last", null);
        setField(term2641438, term2641438.getClass(), "propListHead", null);
        setIntField(term2641438, term2641438.getClass(), "sourcePosition", 0);
        setField(term2641438, term2641438.getClass(), "jsType", null);
        setField(term2641438, term2641438.getClass(), "parent", null);
        setField(term2641437, term2641437.getClass(), "next", term2641438);
        setField(term2641437, term2641437.getClass(), "first", null);
        setField(term2641437, term2641437.getClass(), "last", null);
        setField(term2641437, term2641437.getClass(), "propListHead", null);
        setIntField(term2641437, term2641437.getClass(), "sourcePosition", 0);
        setField(term2641437, term2641437.getClass(), "jsType", null);
        setField(term2641437, term2641437.getClass(), "parent", null);
        setField(term2641436, term2641436.getClass(), "first", term2641437);
        setField(term2641436, term2641436.getClass(), "last", null);
        setField(term2641436, term2641436.getClass(), "propListHead", null);
        setIntField(term2641436, term2641436.getClass(), "sourcePosition", 0);
        setField(term2641436, term2641436.getClass(), "jsType", null);
        setField(term2641436, term2641436.getClass(), "parent", null);
        setField(term2641435, term2641435.getClass(), "first", term2641436);
        setField(term2641435, term2641435.getClass(), "last", null);
        setField(term2641435, term2641435.getClass(), "propListHead", null);
        setIntField(term2641435, term2641435.getClass(), "sourcePosition", 0);
        setField(term2641435, term2641435.getClass(), "jsType", null);
        setField(term2641435, term2641435.getClass(), "parent", null);
        term2641304 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2641307 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2641317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2641319 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term2641304, term2641304.getClass(), "number", 0.0);
        setIntField(term2641304, term2641304.getClass(), "type", 37);
        setField(term2641304, term2641304.getClass(), "next", null);
        setField(term2641307, term2641307.getClass(), "functionName", null);
        setBooleanField(term2641307, term2641307.getClass(), "itsNeedsActivation", false);
        setIntField(term2641307, term2641307.getClass(), "itsFunctionType", 0);
        setBooleanField(term2641307, term2641307.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2641307, term2641307.getClass(), "encodedSourceStart", 0);
        setIntField(term2641307, term2641307.getClass(), "encodedSourceEnd", 0);
        setField(term2641307, term2641307.getClass(), "sourceName", null);
        setIntField(term2641307, term2641307.getClass(), "baseLineno", 0);
        setIntField(term2641307, term2641307.getClass(), "endLineno", 0);
        setField(term2641307, term2641307.getClass(), "functions", null);
        setField(term2641307, term2641307.getClass(), "regexps", null);
        setField(term2641307, term2641307.getClass(), "itsVariables", null);
        setField(term2641307, term2641307.getClass(), "itsConst", null);
        setField(term2641307, term2641307.getClass(), "itsVariableNames", null);
        setIntField(term2641307, term2641307.getClass(), "varStart", 0);
        setField(term2641307, term2641307.getClass(), "compilerData", null);
        setIntField(term2641307, term2641307.getClass(), "type", 35);
        setField(term2641307, term2641307.getClass(), "next", null);
        setIntField(term2641317, term2641317.getClass(), "type", 40);
        setField(term2641319, term2641319.getClass(), "functionName", null);
        setBooleanField(term2641319, term2641319.getClass(), "itsNeedsActivation", false);
        setIntField(term2641319, term2641319.getClass(), "itsFunctionType", 0);
        setBooleanField(term2641319, term2641319.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2641319, term2641319.getClass(), "encodedSourceStart", 0);
        setIntField(term2641319, term2641319.getClass(), "encodedSourceEnd", 0);
        setField(term2641319, term2641319.getClass(), "sourceName", null);
        setIntField(term2641319, term2641319.getClass(), "baseLineno", 0);
        setIntField(term2641319, term2641319.getClass(), "endLineno", 0);
        setField(term2641319, term2641319.getClass(), "functions", null);
        setField(term2641319, term2641319.getClass(), "regexps", null);
        setField(term2641319, term2641319.getClass(), "itsVariables", null);
        setField(term2641319, term2641319.getClass(), "itsConst", null);
        setField(term2641319, term2641319.getClass(), "itsVariableNames", null);
        setIntField(term2641319, term2641319.getClass(), "varStart", 0);
        setField(term2641319, term2641319.getClass(), "compilerData", null);
        setIntField(term2641319, term2641319.getClass(), "type", 0);
        setField(term2641319, term2641319.getClass(), "next", null);
        setField(term2641319, term2641319.getClass(), "first", null);
        setField(term2641319, term2641319.getClass(), "last", null);
        setField(term2641319, term2641319.getClass(), "propListHead", null);
        setIntField(term2641319, term2641319.getClass(), "sourcePosition", 0);
        setField(term2641319, term2641319.getClass(), "jsType", null);
        setField(term2641319, term2641319.getClass(), "parent", null);
        setField(term2641317, term2641317.getClass(), "next", term2641319);
        setField(term2641317, term2641317.getClass(), "first", null);
        setField(term2641317, term2641317.getClass(), "last", null);
        setField(term2641317, term2641317.getClass(), "propListHead", null);
        setIntField(term2641317, term2641317.getClass(), "sourcePosition", 0);
        setField(term2641317, term2641317.getClass(), "jsType", null);
        setField(term2641317, term2641317.getClass(), "parent", null);
        setField(term2641307, term2641307.getClass(), "first", term2641317);
        setField(term2641307, term2641307.getClass(), "last", null);
        setField(term2641307, term2641307.getClass(), "propListHead", null);
        setIntField(term2641307, term2641307.getClass(), "sourcePosition", 0);
        setField(term2641307, term2641307.getClass(), "jsType", null);
        setField(term2641307, term2641307.getClass(), "parent", null);
        setField(term2641304, term2641304.getClass(), "first", term2641307);
        setField(term2641304, term2641304.getClass(), "last", null);
        setField(term2641304, term2641304.getClass(), "propListHead", null);
        setIntField(term2641304, term2641304.getClass(), "sourcePosition", 0);
        setField(term2641304, term2641304.getClass(), "jsType", null);
        setField(term2641304, term2641304.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2640548;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2640456, args);
        assertTrue(recursiveEquals(term2640456, term2641434));
        assertTrue(recursiveEquals(term2640548, term2641435));
        assertTrue(recursiveEquals(retValue, term2641304));
    }

};


