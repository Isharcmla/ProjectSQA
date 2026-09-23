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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537685;
     Object term537771;
     Object term538749;
     Object term538750;
     Object term538688;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537685 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term537771 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term537857 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term537949 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term537857, term537857.getClass(), "next", term537949);
        setIntField(term537857, term537857.getClass(), "type", 39);
        setField(term537771, term537771.getClass(), "first", term537857);
        setIntField(term537771, term537771.getClass(), "type", 19);
        term538749 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term538749, term538749.getClass(), "currentTraversal", null);
        term538750 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term538751 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term538752 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term538750, term538750.getClass(), "functionName", null);
        setBooleanField(term538750, term538750.getClass(), "itsNeedsActivation", false);
        setIntField(term538750, term538750.getClass(), "itsFunctionType", 0);
        setBooleanField(term538750, term538750.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term538750, term538750.getClass(), "encodedSourceStart", 0);
        setIntField(term538750, term538750.getClass(), "encodedSourceEnd", 0);
        setField(term538750, term538750.getClass(), "sourceName", null);
        setIntField(term538750, term538750.getClass(), "baseLineno", 0);
        setIntField(term538750, term538750.getClass(), "endLineno", 0);
        setField(term538750, term538750.getClass(), "functions", null);
        setField(term538750, term538750.getClass(), "regexps", null);
        setField(term538750, term538750.getClass(), "itsVariables", null);
        setField(term538750, term538750.getClass(), "itsConst", null);
        setField(term538750, term538750.getClass(), "itsVariableNames", null);
        setIntField(term538750, term538750.getClass(), "varStart", 0);
        setField(term538750, term538750.getClass(), "compilerData", null);
        setIntField(term538750, term538750.getClass(), "type", 19);
        setField(term538750, term538750.getClass(), "next", null);
        setField(term538751, term538751.getClass(), "functionName", null);
        setBooleanField(term538751, term538751.getClass(), "itsNeedsActivation", false);
        setIntField(term538751, term538751.getClass(), "itsFunctionType", 0);
        setBooleanField(term538751, term538751.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term538751, term538751.getClass(), "encodedSourceStart", 0);
        setIntField(term538751, term538751.getClass(), "encodedSourceEnd", 0);
        setField(term538751, term538751.getClass(), "sourceName", null);
        setIntField(term538751, term538751.getClass(), "baseLineno", 0);
        setIntField(term538751, term538751.getClass(), "endLineno", 0);
        setField(term538751, term538751.getClass(), "functions", null);
        setField(term538751, term538751.getClass(), "regexps", null);
        setField(term538751, term538751.getClass(), "itsVariables", null);
        setField(term538751, term538751.getClass(), "itsConst", null);
        setField(term538751, term538751.getClass(), "itsVariableNames", null);
        setIntField(term538751, term538751.getClass(), "varStart", 0);
        setField(term538751, term538751.getClass(), "compilerData", null);
        setIntField(term538751, term538751.getClass(), "type", 39);
        setField(term538752, term538752.getClass(), "str", null);
        setIntField(term538752, term538752.getClass(), "type", 0);
        setField(term538752, term538752.getClass(), "next", null);
        setField(term538752, term538752.getClass(), "first", null);
        setField(term538752, term538752.getClass(), "last", null);
        setField(term538752, term538752.getClass(), "propListHead", null);
        setIntField(term538752, term538752.getClass(), "sourcePosition", 0);
        setField(term538752, term538752.getClass(), "jsType", null);
        setField(term538752, term538752.getClass(), "parent", null);
        setField(term538751, term538751.getClass(), "next", term538752);
        setField(term538751, term538751.getClass(), "first", null);
        setField(term538751, term538751.getClass(), "last", null);
        setField(term538751, term538751.getClass(), "propListHead", null);
        setIntField(term538751, term538751.getClass(), "sourcePosition", 0);
        setField(term538751, term538751.getClass(), "jsType", null);
        setField(term538751, term538751.getClass(), "parent", null);
        setField(term538750, term538750.getClass(), "first", term538751);
        setField(term538750, term538750.getClass(), "last", null);
        setField(term538750, term538750.getClass(), "propListHead", null);
        setIntField(term538750, term538750.getClass(), "sourcePosition", 0);
        setField(term538750, term538750.getClass(), "jsType", null);
        setField(term538750, term538750.getClass(), "parent", null);
        term538688 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term538698 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term538708 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term538688, term538688.getClass(), "functionName", null);
        setBooleanField(term538688, term538688.getClass(), "itsNeedsActivation", false);
        setIntField(term538688, term538688.getClass(), "itsFunctionType", 0);
        setBooleanField(term538688, term538688.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term538688, term538688.getClass(), "encodedSourceStart", 0);
        setIntField(term538688, term538688.getClass(), "encodedSourceEnd", 0);
        setField(term538688, term538688.getClass(), "sourceName", null);
        setIntField(term538688, term538688.getClass(), "baseLineno", 0);
        setIntField(term538688, term538688.getClass(), "endLineno", 0);
        setField(term538688, term538688.getClass(), "functions", null);
        setField(term538688, term538688.getClass(), "regexps", null);
        setField(term538688, term538688.getClass(), "itsVariables", null);
        setField(term538688, term538688.getClass(), "itsConst", null);
        setField(term538688, term538688.getClass(), "itsVariableNames", null);
        setIntField(term538688, term538688.getClass(), "varStart", 0);
        setField(term538688, term538688.getClass(), "compilerData", null);
        setIntField(term538688, term538688.getClass(), "type", 19);
        setField(term538688, term538688.getClass(), "next", null);
        setField(term538698, term538698.getClass(), "functionName", null);
        setBooleanField(term538698, term538698.getClass(), "itsNeedsActivation", false);
        setIntField(term538698, term538698.getClass(), "itsFunctionType", 0);
        setBooleanField(term538698, term538698.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term538698, term538698.getClass(), "encodedSourceStart", 0);
        setIntField(term538698, term538698.getClass(), "encodedSourceEnd", 0);
        setField(term538698, term538698.getClass(), "sourceName", null);
        setIntField(term538698, term538698.getClass(), "baseLineno", 0);
        setIntField(term538698, term538698.getClass(), "endLineno", 0);
        setField(term538698, term538698.getClass(), "functions", null);
        setField(term538698, term538698.getClass(), "regexps", null);
        setField(term538698, term538698.getClass(), "itsVariables", null);
        setField(term538698, term538698.getClass(), "itsConst", null);
        setField(term538698, term538698.getClass(), "itsVariableNames", null);
        setIntField(term538698, term538698.getClass(), "varStart", 0);
        setField(term538698, term538698.getClass(), "compilerData", null);
        setIntField(term538698, term538698.getClass(), "type", 39);
        setField(term538708, term538708.getClass(), "str", null);
        setIntField(term538708, term538708.getClass(), "type", 0);
        setField(term538708, term538708.getClass(), "next", null);
        setField(term538708, term538708.getClass(), "first", null);
        setField(term538708, term538708.getClass(), "last", null);
        setField(term538708, term538708.getClass(), "propListHead", null);
        setIntField(term538708, term538708.getClass(), "sourcePosition", 0);
        setField(term538708, term538708.getClass(), "jsType", null);
        setField(term538708, term538708.getClass(), "parent", null);
        setField(term538698, term538698.getClass(), "next", term538708);
        setField(term538698, term538698.getClass(), "first", null);
        setField(term538698, term538698.getClass(), "last", null);
        setField(term538698, term538698.getClass(), "propListHead", null);
        setIntField(term538698, term538698.getClass(), "sourcePosition", 0);
        setField(term538698, term538698.getClass(), "jsType", null);
        setField(term538698, term538698.getClass(), "parent", null);
        setField(term538688, term538688.getClass(), "first", term538698);
        setField(term538688, term538688.getClass(), "last", null);
        setField(term538688, term538688.getClass(), "propListHead", null);
        setIntField(term538688, term538688.getClass(), "sourcePosition", 0);
        setField(term538688, term538688.getClass(), "jsType", null);
        setField(term538688, term538688.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term537771;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term537685, args);
        assertTrue(recursiveEquals(term537685, term538749));
        assertTrue(recursiveEquals(term537771, term538750));
        assertTrue(recursiveEquals(retValue, term538688));
    }

};


