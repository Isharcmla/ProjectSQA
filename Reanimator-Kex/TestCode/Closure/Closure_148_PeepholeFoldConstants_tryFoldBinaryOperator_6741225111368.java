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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333958;
     Object term334050;
     Object term334388;
     Object term334389;
     Object term334301;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333958 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term334050 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term334140 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term334226 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term334140, term334140.getClass(), "next", term334226);
        setIntField(term334140, term334140.getClass(), "type", 0);
        setField(term334050, term334050.getClass(), "first", term334140);
        setIntField(term334050, term334050.getClass(), "type", 101);
        setField(term334050, term334050.getClass(), "parent", null);
        term334388 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term334388, term334388.getClass(), "currentTraversal", null);
        term334389 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term334390 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term334391 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term334389, term334389.getClass(), "str", null);
        setIntField(term334389, term334389.getClass(), "type", 101);
        setField(term334389, term334389.getClass(), "next", null);
        setIntField(term334390, term334390.getClass(), "encodedSourceStart", 0);
        setIntField(term334390, term334390.getClass(), "encodedSourceEnd", 0);
        setField(term334390, term334390.getClass(), "sourceName", null);
        setIntField(term334390, term334390.getClass(), "baseLineno", 0);
        setIntField(term334390, term334390.getClass(), "endLineno", 0);
        setField(term334390, term334390.getClass(), "functions", null);
        setField(term334390, term334390.getClass(), "regexps", null);
        setField(term334390, term334390.getClass(), "itsVariables", null);
        setField(term334390, term334390.getClass(), "itsConst", null);
        setField(term334390, term334390.getClass(), "itsVariableNames", null);
        setIntField(term334390, term334390.getClass(), "varStart", 0);
        setField(term334390, term334390.getClass(), "compilerData", null);
        setIntField(term334390, term334390.getClass(), "type", 0);
        setField(term334391, term334391.getClass(), "functionName", null);
        setBooleanField(term334391, term334391.getClass(), "itsNeedsActivation", false);
        setIntField(term334391, term334391.getClass(), "itsFunctionType", 0);
        setBooleanField(term334391, term334391.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term334391, term334391.getClass(), "encodedSourceStart", 0);
        setIntField(term334391, term334391.getClass(), "encodedSourceEnd", 0);
        setField(term334391, term334391.getClass(), "sourceName", null);
        setIntField(term334391, term334391.getClass(), "baseLineno", 0);
        setIntField(term334391, term334391.getClass(), "endLineno", 0);
        setField(term334391, term334391.getClass(), "functions", null);
        setField(term334391, term334391.getClass(), "regexps", null);
        setField(term334391, term334391.getClass(), "itsVariables", null);
        setField(term334391, term334391.getClass(), "itsConst", null);
        setField(term334391, term334391.getClass(), "itsVariableNames", null);
        setIntField(term334391, term334391.getClass(), "varStart", 0);
        setField(term334391, term334391.getClass(), "compilerData", null);
        setIntField(term334391, term334391.getClass(), "type", 0);
        setField(term334391, term334391.getClass(), "next", null);
        setField(term334391, term334391.getClass(), "first", null);
        setField(term334391, term334391.getClass(), "last", null);
        setField(term334391, term334391.getClass(), "propListHead", null);
        setIntField(term334391, term334391.getClass(), "sourcePosition", 0);
        setField(term334391, term334391.getClass(), "jsType", null);
        setField(term334391, term334391.getClass(), "parent", null);
        setField(term334390, term334390.getClass(), "next", term334391);
        setField(term334390, term334390.getClass(), "first", null);
        setField(term334390, term334390.getClass(), "last", null);
        setField(term334390, term334390.getClass(), "propListHead", null);
        setIntField(term334390, term334390.getClass(), "sourcePosition", 0);
        setField(term334390, term334390.getClass(), "jsType", null);
        setField(term334390, term334390.getClass(), "parent", null);
        setField(term334389, term334389.getClass(), "first", term334390);
        setField(term334389, term334389.getClass(), "last", null);
        setField(term334389, term334389.getClass(), "propListHead", null);
        setIntField(term334389, term334389.getClass(), "sourcePosition", 0);
        setField(term334389, term334389.getClass(), "jsType", null);
        setField(term334389, term334389.getClass(), "parent", null);
        term334301 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term334303 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term334310 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term334301, term334301.getClass(), "str", null);
        setIntField(term334301, term334301.getClass(), "type", 101);
        setField(term334301, term334301.getClass(), "next", null);
        setIntField(term334303, term334303.getClass(), "encodedSourceStart", 0);
        setIntField(term334303, term334303.getClass(), "encodedSourceEnd", 0);
        setField(term334303, term334303.getClass(), "sourceName", null);
        setIntField(term334303, term334303.getClass(), "baseLineno", 0);
        setIntField(term334303, term334303.getClass(), "endLineno", 0);
        setField(term334303, term334303.getClass(), "functions", null);
        setField(term334303, term334303.getClass(), "regexps", null);
        setField(term334303, term334303.getClass(), "itsVariables", null);
        setField(term334303, term334303.getClass(), "itsConst", null);
        setField(term334303, term334303.getClass(), "itsVariableNames", null);
        setIntField(term334303, term334303.getClass(), "varStart", 0);
        setField(term334303, term334303.getClass(), "compilerData", null);
        setIntField(term334303, term334303.getClass(), "type", 0);
        setField(term334310, term334310.getClass(), "functionName", null);
        setBooleanField(term334310, term334310.getClass(), "itsNeedsActivation", false);
        setIntField(term334310, term334310.getClass(), "itsFunctionType", 0);
        setBooleanField(term334310, term334310.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term334310, term334310.getClass(), "encodedSourceStart", 0);
        setIntField(term334310, term334310.getClass(), "encodedSourceEnd", 0);
        setField(term334310, term334310.getClass(), "sourceName", null);
        setIntField(term334310, term334310.getClass(), "baseLineno", 0);
        setIntField(term334310, term334310.getClass(), "endLineno", 0);
        setField(term334310, term334310.getClass(), "functions", null);
        setField(term334310, term334310.getClass(), "regexps", null);
        setField(term334310, term334310.getClass(), "itsVariables", null);
        setField(term334310, term334310.getClass(), "itsConst", null);
        setField(term334310, term334310.getClass(), "itsVariableNames", null);
        setIntField(term334310, term334310.getClass(), "varStart", 0);
        setField(term334310, term334310.getClass(), "compilerData", null);
        setIntField(term334310, term334310.getClass(), "type", 0);
        setField(term334310, term334310.getClass(), "next", null);
        setField(term334310, term334310.getClass(), "first", null);
        setField(term334310, term334310.getClass(), "last", null);
        setField(term334310, term334310.getClass(), "propListHead", null);
        setIntField(term334310, term334310.getClass(), "sourcePosition", 0);
        setField(term334310, term334310.getClass(), "jsType", null);
        setField(term334310, term334310.getClass(), "parent", null);
        setField(term334303, term334303.getClass(), "next", term334310);
        setField(term334303, term334303.getClass(), "first", null);
        setField(term334303, term334303.getClass(), "last", null);
        setField(term334303, term334303.getClass(), "propListHead", null);
        setIntField(term334303, term334303.getClass(), "sourcePosition", 0);
        setField(term334303, term334303.getClass(), "jsType", null);
        setField(term334303, term334303.getClass(), "parent", null);
        setField(term334301, term334301.getClass(), "first", term334303);
        setField(term334301, term334301.getClass(), "last", null);
        setField(term334301, term334301.getClass(), "propListHead", null);
        setIntField(term334301, term334301.getClass(), "sourcePosition", 0);
        setField(term334301, term334301.getClass(), "jsType", null);
        setField(term334301, term334301.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term334050;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term333958, args);
        assertTrue(recursiveEquals(term333958, term334388));
        assertTrue(recursiveEquals(term334050, term334389));
        assertTrue(recursiveEquals(retValue, term334301));
    }

};


