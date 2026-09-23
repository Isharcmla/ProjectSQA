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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737668;
     Object term737760;
     Object term738475;
     Object term738476;
     Object term738406;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term737668 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term737760 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term737846 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term737932 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term737846, term737846.getClass(), "next", term737932);
        setIntField(term737846, term737846.getClass(), "type", 39);
        setField(term737760, term737760.getClass(), "first", term737846);
        setIntField(term737760, term737760.getClass(), "type", 18);
        term738475 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term738475, term738475.getClass(), "currentTraversal", null);
        term738476 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term738477 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term738478 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term738476, term738476.getClass(), "str", null);
        setIntField(term738476, term738476.getClass(), "type", 18);
        setField(term738476, term738476.getClass(), "next", null);
        setField(term738477, term738477.getClass(), "functionName", null);
        setBooleanField(term738477, term738477.getClass(), "itsNeedsActivation", false);
        setIntField(term738477, term738477.getClass(), "itsFunctionType", 0);
        setBooleanField(term738477, term738477.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term738477, term738477.getClass(), "encodedSourceStart", 0);
        setIntField(term738477, term738477.getClass(), "encodedSourceEnd", 0);
        setField(term738477, term738477.getClass(), "sourceName", null);
        setIntField(term738477, term738477.getClass(), "baseLineno", 0);
        setIntField(term738477, term738477.getClass(), "endLineno", 0);
        setField(term738477, term738477.getClass(), "functions", null);
        setField(term738477, term738477.getClass(), "regexps", null);
        setField(term738477, term738477.getClass(), "itsVariables", null);
        setField(term738477, term738477.getClass(), "itsConst", null);
        setField(term738477, term738477.getClass(), "itsVariableNames", null);
        setIntField(term738477, term738477.getClass(), "varStart", 0);
        setField(term738477, term738477.getClass(), "compilerData", null);
        setIntField(term738477, term738477.getClass(), "type", 39);
        setField(term738478, term738478.getClass(), "functionName", null);
        setBooleanField(term738478, term738478.getClass(), "itsNeedsActivation", false);
        setIntField(term738478, term738478.getClass(), "itsFunctionType", 0);
        setBooleanField(term738478, term738478.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term738478, term738478.getClass(), "encodedSourceStart", 0);
        setIntField(term738478, term738478.getClass(), "encodedSourceEnd", 0);
        setField(term738478, term738478.getClass(), "sourceName", null);
        setIntField(term738478, term738478.getClass(), "baseLineno", 0);
        setIntField(term738478, term738478.getClass(), "endLineno", 0);
        setField(term738478, term738478.getClass(), "functions", null);
        setField(term738478, term738478.getClass(), "regexps", null);
        setField(term738478, term738478.getClass(), "itsVariables", null);
        setField(term738478, term738478.getClass(), "itsConst", null);
        setField(term738478, term738478.getClass(), "itsVariableNames", null);
        setIntField(term738478, term738478.getClass(), "varStart", 0);
        setField(term738478, term738478.getClass(), "compilerData", null);
        setIntField(term738478, term738478.getClass(), "type", 0);
        setField(term738478, term738478.getClass(), "next", null);
        setField(term738478, term738478.getClass(), "first", null);
        setField(term738478, term738478.getClass(), "last", null);
        setField(term738478, term738478.getClass(), "propListHead", null);
        setIntField(term738478, term738478.getClass(), "sourcePosition", 0);
        setField(term738478, term738478.getClass(), "jsType", null);
        setField(term738478, term738478.getClass(), "parent", null);
        setField(term738477, term738477.getClass(), "next", term738478);
        setField(term738477, term738477.getClass(), "first", null);
        setField(term738477, term738477.getClass(), "last", null);
        setField(term738477, term738477.getClass(), "propListHead", null);
        setIntField(term738477, term738477.getClass(), "sourcePosition", 0);
        setField(term738477, term738477.getClass(), "jsType", null);
        setField(term738477, term738477.getClass(), "parent", null);
        setField(term738476, term738476.getClass(), "first", term738477);
        setField(term738476, term738476.getClass(), "last", null);
        setField(term738476, term738476.getClass(), "propListHead", null);
        setIntField(term738476, term738476.getClass(), "sourcePosition", 0);
        setField(term738476, term738476.getClass(), "jsType", null);
        setField(term738476, term738476.getClass(), "parent", null);
        term738406 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term738408 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term738418 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term738406, term738406.getClass(), "str", null);
        setIntField(term738406, term738406.getClass(), "type", 18);
        setField(term738406, term738406.getClass(), "next", null);
        setField(term738408, term738408.getClass(), "functionName", null);
        setBooleanField(term738408, term738408.getClass(), "itsNeedsActivation", false);
        setIntField(term738408, term738408.getClass(), "itsFunctionType", 0);
        setBooleanField(term738408, term738408.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term738408, term738408.getClass(), "encodedSourceStart", 0);
        setIntField(term738408, term738408.getClass(), "encodedSourceEnd", 0);
        setField(term738408, term738408.getClass(), "sourceName", null);
        setIntField(term738408, term738408.getClass(), "baseLineno", 0);
        setIntField(term738408, term738408.getClass(), "endLineno", 0);
        setField(term738408, term738408.getClass(), "functions", null);
        setField(term738408, term738408.getClass(), "regexps", null);
        setField(term738408, term738408.getClass(), "itsVariables", null);
        setField(term738408, term738408.getClass(), "itsConst", null);
        setField(term738408, term738408.getClass(), "itsVariableNames", null);
        setIntField(term738408, term738408.getClass(), "varStart", 0);
        setField(term738408, term738408.getClass(), "compilerData", null);
        setIntField(term738408, term738408.getClass(), "type", 39);
        setField(term738418, term738418.getClass(), "functionName", null);
        setBooleanField(term738418, term738418.getClass(), "itsNeedsActivation", false);
        setIntField(term738418, term738418.getClass(), "itsFunctionType", 0);
        setBooleanField(term738418, term738418.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term738418, term738418.getClass(), "encodedSourceStart", 0);
        setIntField(term738418, term738418.getClass(), "encodedSourceEnd", 0);
        setField(term738418, term738418.getClass(), "sourceName", null);
        setIntField(term738418, term738418.getClass(), "baseLineno", 0);
        setIntField(term738418, term738418.getClass(), "endLineno", 0);
        setField(term738418, term738418.getClass(), "functions", null);
        setField(term738418, term738418.getClass(), "regexps", null);
        setField(term738418, term738418.getClass(), "itsVariables", null);
        setField(term738418, term738418.getClass(), "itsConst", null);
        setField(term738418, term738418.getClass(), "itsVariableNames", null);
        setIntField(term738418, term738418.getClass(), "varStart", 0);
        setField(term738418, term738418.getClass(), "compilerData", null);
        setIntField(term738418, term738418.getClass(), "type", 0);
        setField(term738418, term738418.getClass(), "next", null);
        setField(term738418, term738418.getClass(), "first", null);
        setField(term738418, term738418.getClass(), "last", null);
        setField(term738418, term738418.getClass(), "propListHead", null);
        setIntField(term738418, term738418.getClass(), "sourcePosition", 0);
        setField(term738418, term738418.getClass(), "jsType", null);
        setField(term738418, term738418.getClass(), "parent", null);
        setField(term738408, term738408.getClass(), "next", term738418);
        setField(term738408, term738408.getClass(), "first", null);
        setField(term738408, term738408.getClass(), "last", null);
        setField(term738408, term738408.getClass(), "propListHead", null);
        setIntField(term738408, term738408.getClass(), "sourcePosition", 0);
        setField(term738408, term738408.getClass(), "jsType", null);
        setField(term738408, term738408.getClass(), "parent", null);
        setField(term738406, term738406.getClass(), "first", term738408);
        setField(term738406, term738406.getClass(), "last", null);
        setField(term738406, term738406.getClass(), "propListHead", null);
        setIntField(term738406, term738406.getClass(), "sourcePosition", 0);
        setField(term738406, term738406.getClass(), "jsType", null);
        setField(term738406, term738406.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term737760;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term737668, args);
        assertTrue(recursiveEquals(term737668, term738475));
        assertTrue(recursiveEquals(term737760, term738476));
        assertTrue(recursiveEquals(retValue, term738406));
    }

};


