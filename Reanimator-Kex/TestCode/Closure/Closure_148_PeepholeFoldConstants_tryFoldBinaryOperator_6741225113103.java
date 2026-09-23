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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term917718;
     Object term917810;
     Object term918416;
     Object term918417;
     Object term918358;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term917718 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term917810 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term917896 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term917966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term917896, term917896.getClass(), "next", term917966);
        setField(term917810, term917810.getClass(), "first", term917896);
        setIntField(term917810, term917810.getClass(), "type", 16);
        term918416 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term918416, term918416.getClass(), "currentTraversal", null);
        term918417 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term918418 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term918419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term918417, term918417.getClass(), "str", null);
        setIntField(term918417, term918417.getClass(), "type", 16);
        setField(term918417, term918417.getClass(), "next", null);
        setField(term918418, term918418.getClass(), "functionName", null);
        setBooleanField(term918418, term918418.getClass(), "itsNeedsActivation", false);
        setIntField(term918418, term918418.getClass(), "itsFunctionType", 0);
        setBooleanField(term918418, term918418.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term918418, term918418.getClass(), "encodedSourceStart", 0);
        setIntField(term918418, term918418.getClass(), "encodedSourceEnd", 0);
        setField(term918418, term918418.getClass(), "sourceName", null);
        setIntField(term918418, term918418.getClass(), "baseLineno", 0);
        setIntField(term918418, term918418.getClass(), "endLineno", 0);
        setField(term918418, term918418.getClass(), "functions", null);
        setField(term918418, term918418.getClass(), "regexps", null);
        setField(term918418, term918418.getClass(), "itsVariables", null);
        setField(term918418, term918418.getClass(), "itsConst", null);
        setField(term918418, term918418.getClass(), "itsVariableNames", null);
        setIntField(term918418, term918418.getClass(), "varStart", 0);
        setField(term918418, term918418.getClass(), "compilerData", null);
        setIntField(term918418, term918418.getClass(), "type", 0);
        setIntField(term918419, term918419.getClass(), "type", 0);
        setField(term918419, term918419.getClass(), "next", null);
        setField(term918419, term918419.getClass(), "first", null);
        setField(term918419, term918419.getClass(), "last", null);
        setField(term918419, term918419.getClass(), "propListHead", null);
        setIntField(term918419, term918419.getClass(), "sourcePosition", 0);
        setField(term918419, term918419.getClass(), "jsType", null);
        setField(term918419, term918419.getClass(), "parent", null);
        setField(term918418, term918418.getClass(), "next", term918419);
        setField(term918418, term918418.getClass(), "first", null);
        setField(term918418, term918418.getClass(), "last", null);
        setField(term918418, term918418.getClass(), "propListHead", null);
        setIntField(term918418, term918418.getClass(), "sourcePosition", 0);
        setField(term918418, term918418.getClass(), "jsType", null);
        setField(term918418, term918418.getClass(), "parent", null);
        setField(term918417, term918417.getClass(), "first", term918418);
        setField(term918417, term918417.getClass(), "last", null);
        setField(term918417, term918417.getClass(), "propListHead", null);
        setIntField(term918417, term918417.getClass(), "sourcePosition", 0);
        setField(term918417, term918417.getClass(), "jsType", null);
        setField(term918417, term918417.getClass(), "parent", null);
        term918358 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term918360 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term918370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term918358, term918358.getClass(), "str", null);
        setIntField(term918358, term918358.getClass(), "type", 16);
        setField(term918358, term918358.getClass(), "next", null);
        setField(term918360, term918360.getClass(), "functionName", null);
        setBooleanField(term918360, term918360.getClass(), "itsNeedsActivation", false);
        setIntField(term918360, term918360.getClass(), "itsFunctionType", 0);
        setBooleanField(term918360, term918360.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term918360, term918360.getClass(), "encodedSourceStart", 0);
        setIntField(term918360, term918360.getClass(), "encodedSourceEnd", 0);
        setField(term918360, term918360.getClass(), "sourceName", null);
        setIntField(term918360, term918360.getClass(), "baseLineno", 0);
        setIntField(term918360, term918360.getClass(), "endLineno", 0);
        setField(term918360, term918360.getClass(), "functions", null);
        setField(term918360, term918360.getClass(), "regexps", null);
        setField(term918360, term918360.getClass(), "itsVariables", null);
        setField(term918360, term918360.getClass(), "itsConst", null);
        setField(term918360, term918360.getClass(), "itsVariableNames", null);
        setIntField(term918360, term918360.getClass(), "varStart", 0);
        setField(term918360, term918360.getClass(), "compilerData", null);
        setIntField(term918360, term918360.getClass(), "type", 0);
        setIntField(term918370, term918370.getClass(), "type", 0);
        setField(term918370, term918370.getClass(), "next", null);
        setField(term918370, term918370.getClass(), "first", null);
        setField(term918370, term918370.getClass(), "last", null);
        setField(term918370, term918370.getClass(), "propListHead", null);
        setIntField(term918370, term918370.getClass(), "sourcePosition", 0);
        setField(term918370, term918370.getClass(), "jsType", null);
        setField(term918370, term918370.getClass(), "parent", null);
        setField(term918360, term918360.getClass(), "next", term918370);
        setField(term918360, term918360.getClass(), "first", null);
        setField(term918360, term918360.getClass(), "last", null);
        setField(term918360, term918360.getClass(), "propListHead", null);
        setIntField(term918360, term918360.getClass(), "sourcePosition", 0);
        setField(term918360, term918360.getClass(), "jsType", null);
        setField(term918360, term918360.getClass(), "parent", null);
        setField(term918358, term918358.getClass(), "first", term918360);
        setField(term918358, term918358.getClass(), "last", null);
        setField(term918358, term918358.getClass(), "propListHead", null);
        setIntField(term918358, term918358.getClass(), "sourcePosition", 0);
        setField(term918358, term918358.getClass(), "jsType", null);
        setField(term918358, term918358.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term917810;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term917718, args);
        assertTrue(recursiveEquals(term917718, term918416));
        assertTrue(recursiveEquals(term917810, term918417));
        assertTrue(recursiveEquals(retValue, term918358));
    }

};


