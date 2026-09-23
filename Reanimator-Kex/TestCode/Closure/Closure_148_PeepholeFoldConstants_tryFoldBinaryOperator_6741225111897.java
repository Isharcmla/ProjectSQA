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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501395;
     Object term501487;
     Object term502290;
     Object term502291;
     Object term502174;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term501395 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term501487 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term501573 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term501643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term501729 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term501643, term501643.getClass(), "type", 47);
        setField(term501573, term501573.getClass(), "next", term501643);
        setIntField(term501573, term501573.getClass(), "type", 0);
        setField(term501487, term501487.getClass(), "first", term501573);
        setIntField(term501487, term501487.getClass(), "type", 101);
        setField(term501487, term501487.getClass(), "parent", term501729);
        term502290 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term502290, term502290.getClass(), "currentTraversal", null);
        term502291 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term502292 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term502293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502294 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term502291, term502291.getClass(), "str", null);
        setIntField(term502291, term502291.getClass(), "type", 101);
        setField(term502291, term502291.getClass(), "next", null);
        setField(term502292, term502292.getClass(), "functionName", null);
        setBooleanField(term502292, term502292.getClass(), "itsNeedsActivation", false);
        setIntField(term502292, term502292.getClass(), "itsFunctionType", 0);
        setBooleanField(term502292, term502292.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term502292, term502292.getClass(), "encodedSourceStart", 0);
        setIntField(term502292, term502292.getClass(), "encodedSourceEnd", 0);
        setField(term502292, term502292.getClass(), "sourceName", null);
        setIntField(term502292, term502292.getClass(), "baseLineno", 0);
        setIntField(term502292, term502292.getClass(), "endLineno", 0);
        setField(term502292, term502292.getClass(), "functions", null);
        setField(term502292, term502292.getClass(), "regexps", null);
        setField(term502292, term502292.getClass(), "itsVariables", null);
        setField(term502292, term502292.getClass(), "itsConst", null);
        setField(term502292, term502292.getClass(), "itsVariableNames", null);
        setIntField(term502292, term502292.getClass(), "varStart", 0);
        setField(term502292, term502292.getClass(), "compilerData", null);
        setIntField(term502292, term502292.getClass(), "type", 0);
        setIntField(term502293, term502293.getClass(), "type", 47);
        setField(term502293, term502293.getClass(), "next", null);
        setField(term502293, term502293.getClass(), "first", null);
        setField(term502293, term502293.getClass(), "last", null);
        setField(term502293, term502293.getClass(), "propListHead", null);
        setIntField(term502293, term502293.getClass(), "sourcePosition", 0);
        setField(term502293, term502293.getClass(), "jsType", null);
        setField(term502293, term502293.getClass(), "parent", null);
        setField(term502292, term502292.getClass(), "next", term502293);
        setField(term502292, term502292.getClass(), "first", null);
        setField(term502292, term502292.getClass(), "last", null);
        setField(term502292, term502292.getClass(), "propListHead", null);
        setIntField(term502292, term502292.getClass(), "sourcePosition", 0);
        setField(term502292, term502292.getClass(), "jsType", null);
        setField(term502292, term502292.getClass(), "parent", null);
        setField(term502291, term502291.getClass(), "first", term502292);
        setField(term502291, term502291.getClass(), "last", null);
        setField(term502291, term502291.getClass(), "propListHead", null);
        setIntField(term502291, term502291.getClass(), "sourcePosition", 0);
        setField(term502291, term502291.getClass(), "jsType", null);
        setField(term502294, term502294.getClass(), "functionName", null);
        setBooleanField(term502294, term502294.getClass(), "itsNeedsActivation", false);
        setIntField(term502294, term502294.getClass(), "itsFunctionType", 0);
        setBooleanField(term502294, term502294.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term502294, term502294.getClass(), "encodedSourceStart", 0);
        setIntField(term502294, term502294.getClass(), "encodedSourceEnd", 0);
        setField(term502294, term502294.getClass(), "sourceName", null);
        setIntField(term502294, term502294.getClass(), "baseLineno", 0);
        setIntField(term502294, term502294.getClass(), "endLineno", 0);
        setField(term502294, term502294.getClass(), "functions", null);
        setField(term502294, term502294.getClass(), "regexps", null);
        setField(term502294, term502294.getClass(), "itsVariables", null);
        setField(term502294, term502294.getClass(), "itsConst", null);
        setField(term502294, term502294.getClass(), "itsVariableNames", null);
        setIntField(term502294, term502294.getClass(), "varStart", 0);
        setField(term502294, term502294.getClass(), "compilerData", null);
        setIntField(term502294, term502294.getClass(), "type", 0);
        setField(term502294, term502294.getClass(), "next", null);
        setField(term502294, term502294.getClass(), "first", null);
        setField(term502294, term502294.getClass(), "last", null);
        setField(term502294, term502294.getClass(), "propListHead", null);
        setIntField(term502294, term502294.getClass(), "sourcePosition", 0);
        setField(term502294, term502294.getClass(), "jsType", null);
        setField(term502294, term502294.getClass(), "parent", null);
        setField(term502291, term502291.getClass(), "parent", term502294);
        term502174 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term502176 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term502186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502191 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term502174, term502174.getClass(), "str", null);
        setIntField(term502174, term502174.getClass(), "type", 101);
        setField(term502174, term502174.getClass(), "next", null);
        setField(term502176, term502176.getClass(), "functionName", null);
        setBooleanField(term502176, term502176.getClass(), "itsNeedsActivation", false);
        setIntField(term502176, term502176.getClass(), "itsFunctionType", 0);
        setBooleanField(term502176, term502176.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term502176, term502176.getClass(), "encodedSourceStart", 0);
        setIntField(term502176, term502176.getClass(), "encodedSourceEnd", 0);
        setField(term502176, term502176.getClass(), "sourceName", null);
        setIntField(term502176, term502176.getClass(), "baseLineno", 0);
        setIntField(term502176, term502176.getClass(), "endLineno", 0);
        setField(term502176, term502176.getClass(), "functions", null);
        setField(term502176, term502176.getClass(), "regexps", null);
        setField(term502176, term502176.getClass(), "itsVariables", null);
        setField(term502176, term502176.getClass(), "itsConst", null);
        setField(term502176, term502176.getClass(), "itsVariableNames", null);
        setIntField(term502176, term502176.getClass(), "varStart", 0);
        setField(term502176, term502176.getClass(), "compilerData", null);
        setIntField(term502176, term502176.getClass(), "type", 0);
        setIntField(term502186, term502186.getClass(), "type", 47);
        setField(term502186, term502186.getClass(), "next", null);
        setField(term502186, term502186.getClass(), "first", null);
        setField(term502186, term502186.getClass(), "last", null);
        setField(term502186, term502186.getClass(), "propListHead", null);
        setIntField(term502186, term502186.getClass(), "sourcePosition", 0);
        setField(term502186, term502186.getClass(), "jsType", null);
        setField(term502186, term502186.getClass(), "parent", null);
        setField(term502176, term502176.getClass(), "next", term502186);
        setField(term502176, term502176.getClass(), "first", null);
        setField(term502176, term502176.getClass(), "last", null);
        setField(term502176, term502176.getClass(), "propListHead", null);
        setIntField(term502176, term502176.getClass(), "sourcePosition", 0);
        setField(term502176, term502176.getClass(), "jsType", null);
        setField(term502176, term502176.getClass(), "parent", null);
        setField(term502174, term502174.getClass(), "first", term502176);
        setField(term502174, term502174.getClass(), "last", null);
        setField(term502174, term502174.getClass(), "propListHead", null);
        setIntField(term502174, term502174.getClass(), "sourcePosition", 0);
        setField(term502174, term502174.getClass(), "jsType", null);
        setField(term502191, term502191.getClass(), "functionName", null);
        setBooleanField(term502191, term502191.getClass(), "itsNeedsActivation", false);
        setIntField(term502191, term502191.getClass(), "itsFunctionType", 0);
        setBooleanField(term502191, term502191.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term502191, term502191.getClass(), "encodedSourceStart", 0);
        setIntField(term502191, term502191.getClass(), "encodedSourceEnd", 0);
        setField(term502191, term502191.getClass(), "sourceName", null);
        setIntField(term502191, term502191.getClass(), "baseLineno", 0);
        setIntField(term502191, term502191.getClass(), "endLineno", 0);
        setField(term502191, term502191.getClass(), "functions", null);
        setField(term502191, term502191.getClass(), "regexps", null);
        setField(term502191, term502191.getClass(), "itsVariables", null);
        setField(term502191, term502191.getClass(), "itsConst", null);
        setField(term502191, term502191.getClass(), "itsVariableNames", null);
        setIntField(term502191, term502191.getClass(), "varStart", 0);
        setField(term502191, term502191.getClass(), "compilerData", null);
        setIntField(term502191, term502191.getClass(), "type", 0);
        setField(term502191, term502191.getClass(), "next", null);
        setField(term502191, term502191.getClass(), "first", null);
        setField(term502191, term502191.getClass(), "last", null);
        setField(term502191, term502191.getClass(), "propListHead", null);
        setIntField(term502191, term502191.getClass(), "sourcePosition", 0);
        setField(term502191, term502191.getClass(), "jsType", null);
        setField(term502191, term502191.getClass(), "parent", null);
        setField(term502174, term502174.getClass(), "parent", term502191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term501487;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term501395, args);
        assertTrue(recursiveEquals(term501395, term502290));
        assertTrue(recursiveEquals(term501487, term502291));
        assertTrue(recursiveEquals(retValue, term502174));
    }

};


