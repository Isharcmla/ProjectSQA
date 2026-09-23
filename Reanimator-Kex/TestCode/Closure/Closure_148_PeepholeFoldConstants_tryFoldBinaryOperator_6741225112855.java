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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term831003;
     Object term831089;
     Object term832209;
     Object term832210;
     Object term832124;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term831003 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term831089 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term831175 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term831267 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term831175, term831175.getClass(), "next", term831267);
        setIntField(term831175, term831175.getClass(), "type", 0);
        setField(term831089, term831089.getClass(), "first", term831175);
        setIntField(term831089, term831089.getClass(), "type", 101);
        setField(term831089, term831089.getClass(), "parent", null);
        term832209 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term832209, term832209.getClass(), "currentTraversal", null);
        term832210 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term832211 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term832212 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term832210, term832210.getClass(), "functionName", null);
        setBooleanField(term832210, term832210.getClass(), "itsNeedsActivation", false);
        setIntField(term832210, term832210.getClass(), "itsFunctionType", 0);
        setBooleanField(term832210, term832210.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term832210, term832210.getClass(), "encodedSourceStart", 0);
        setIntField(term832210, term832210.getClass(), "encodedSourceEnd", 0);
        setField(term832210, term832210.getClass(), "sourceName", null);
        setIntField(term832210, term832210.getClass(), "baseLineno", 0);
        setIntField(term832210, term832210.getClass(), "endLineno", 0);
        setField(term832210, term832210.getClass(), "functions", null);
        setField(term832210, term832210.getClass(), "regexps", null);
        setField(term832210, term832210.getClass(), "itsVariables", null);
        setField(term832210, term832210.getClass(), "itsConst", null);
        setField(term832210, term832210.getClass(), "itsVariableNames", null);
        setIntField(term832210, term832210.getClass(), "varStart", 0);
        setField(term832210, term832210.getClass(), "compilerData", null);
        setIntField(term832210, term832210.getClass(), "type", 101);
        setField(term832210, term832210.getClass(), "next", null);
        setField(term832211, term832211.getClass(), "functionName", null);
        setBooleanField(term832211, term832211.getClass(), "itsNeedsActivation", false);
        setIntField(term832211, term832211.getClass(), "itsFunctionType", 0);
        setBooleanField(term832211, term832211.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term832211, term832211.getClass(), "encodedSourceStart", 0);
        setIntField(term832211, term832211.getClass(), "encodedSourceEnd", 0);
        setField(term832211, term832211.getClass(), "sourceName", null);
        setIntField(term832211, term832211.getClass(), "baseLineno", 0);
        setIntField(term832211, term832211.getClass(), "endLineno", 0);
        setField(term832211, term832211.getClass(), "functions", null);
        setField(term832211, term832211.getClass(), "regexps", null);
        setField(term832211, term832211.getClass(), "itsVariables", null);
        setField(term832211, term832211.getClass(), "itsConst", null);
        setField(term832211, term832211.getClass(), "itsVariableNames", null);
        setIntField(term832211, term832211.getClass(), "varStart", 0);
        setField(term832211, term832211.getClass(), "compilerData", null);
        setIntField(term832211, term832211.getClass(), "type", 0);
        setField(term832212, term832212.getClass(), "str", null);
        setIntField(term832212, term832212.getClass(), "type", 0);
        setField(term832212, term832212.getClass(), "next", null);
        setField(term832212, term832212.getClass(), "first", null);
        setField(term832212, term832212.getClass(), "last", null);
        setField(term832212, term832212.getClass(), "propListHead", null);
        setIntField(term832212, term832212.getClass(), "sourcePosition", 0);
        setField(term832212, term832212.getClass(), "jsType", null);
        setField(term832212, term832212.getClass(), "parent", null);
        setField(term832211, term832211.getClass(), "next", term832212);
        setField(term832211, term832211.getClass(), "first", null);
        setField(term832211, term832211.getClass(), "last", null);
        setField(term832211, term832211.getClass(), "propListHead", null);
        setIntField(term832211, term832211.getClass(), "sourcePosition", 0);
        setField(term832211, term832211.getClass(), "jsType", null);
        setField(term832211, term832211.getClass(), "parent", null);
        setField(term832210, term832210.getClass(), "first", term832211);
        setField(term832210, term832210.getClass(), "last", null);
        setField(term832210, term832210.getClass(), "propListHead", null);
        setIntField(term832210, term832210.getClass(), "sourcePosition", 0);
        setField(term832210, term832210.getClass(), "jsType", null);
        setField(term832210, term832210.getClass(), "parent", null);
        term832124 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term832134 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term832144 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term832124, term832124.getClass(), "functionName", null);
        setBooleanField(term832124, term832124.getClass(), "itsNeedsActivation", false);
        setIntField(term832124, term832124.getClass(), "itsFunctionType", 0);
        setBooleanField(term832124, term832124.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term832124, term832124.getClass(), "encodedSourceStart", 0);
        setIntField(term832124, term832124.getClass(), "encodedSourceEnd", 0);
        setField(term832124, term832124.getClass(), "sourceName", null);
        setIntField(term832124, term832124.getClass(), "baseLineno", 0);
        setIntField(term832124, term832124.getClass(), "endLineno", 0);
        setField(term832124, term832124.getClass(), "functions", null);
        setField(term832124, term832124.getClass(), "regexps", null);
        setField(term832124, term832124.getClass(), "itsVariables", null);
        setField(term832124, term832124.getClass(), "itsConst", null);
        setField(term832124, term832124.getClass(), "itsVariableNames", null);
        setIntField(term832124, term832124.getClass(), "varStart", 0);
        setField(term832124, term832124.getClass(), "compilerData", null);
        setIntField(term832124, term832124.getClass(), "type", 101);
        setField(term832124, term832124.getClass(), "next", null);
        setField(term832134, term832134.getClass(), "functionName", null);
        setBooleanField(term832134, term832134.getClass(), "itsNeedsActivation", false);
        setIntField(term832134, term832134.getClass(), "itsFunctionType", 0);
        setBooleanField(term832134, term832134.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term832134, term832134.getClass(), "encodedSourceStart", 0);
        setIntField(term832134, term832134.getClass(), "encodedSourceEnd", 0);
        setField(term832134, term832134.getClass(), "sourceName", null);
        setIntField(term832134, term832134.getClass(), "baseLineno", 0);
        setIntField(term832134, term832134.getClass(), "endLineno", 0);
        setField(term832134, term832134.getClass(), "functions", null);
        setField(term832134, term832134.getClass(), "regexps", null);
        setField(term832134, term832134.getClass(), "itsVariables", null);
        setField(term832134, term832134.getClass(), "itsConst", null);
        setField(term832134, term832134.getClass(), "itsVariableNames", null);
        setIntField(term832134, term832134.getClass(), "varStart", 0);
        setField(term832134, term832134.getClass(), "compilerData", null);
        setIntField(term832134, term832134.getClass(), "type", 0);
        setField(term832144, term832144.getClass(), "str", null);
        setIntField(term832144, term832144.getClass(), "type", 0);
        setField(term832144, term832144.getClass(), "next", null);
        setField(term832144, term832144.getClass(), "first", null);
        setField(term832144, term832144.getClass(), "last", null);
        setField(term832144, term832144.getClass(), "propListHead", null);
        setIntField(term832144, term832144.getClass(), "sourcePosition", 0);
        setField(term832144, term832144.getClass(), "jsType", null);
        setField(term832144, term832144.getClass(), "parent", null);
        setField(term832134, term832134.getClass(), "next", term832144);
        setField(term832134, term832134.getClass(), "first", null);
        setField(term832134, term832134.getClass(), "last", null);
        setField(term832134, term832134.getClass(), "propListHead", null);
        setIntField(term832134, term832134.getClass(), "sourcePosition", 0);
        setField(term832134, term832134.getClass(), "jsType", null);
        setField(term832134, term832134.getClass(), "parent", null);
        setField(term832124, term832124.getClass(), "first", term832134);
        setField(term832124, term832124.getClass(), "last", null);
        setField(term832124, term832124.getClass(), "propListHead", null);
        setIntField(term832124, term832124.getClass(), "sourcePosition", 0);
        setField(term832124, term832124.getClass(), "jsType", null);
        setField(term832124, term832124.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term831089;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term831003, args);
        assertTrue(recursiveEquals(term831003, term832209));
        assertTrue(recursiveEquals(term831089, term832210));
        assertTrue(recursiveEquals(retValue, term832124));
    }

};


