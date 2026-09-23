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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469942;
     Object term470028;
     Object term470234;
     Object term470235;
     Object term470197;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term469942 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term470028 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term470098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term470028, term470028.getClass(), "first", term470028);
        setField(term470028, term470028.getClass(), "next", term470098);
        setIntField(term470028, term470028.getClass(), "type", 19);
        term470234 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term470234, term470234.getClass(), "currentTraversal", null);
        term470235 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term470236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term470235, term470235.getClass(), "functionName", null);
        setBooleanField(term470235, term470235.getClass(), "itsNeedsActivation", false);
        setIntField(term470235, term470235.getClass(), "itsFunctionType", 0);
        setBooleanField(term470235, term470235.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term470235, term470235.getClass(), "encodedSourceStart", 0);
        setIntField(term470235, term470235.getClass(), "encodedSourceEnd", 0);
        setField(term470235, term470235.getClass(), "sourceName", null);
        setIntField(term470235, term470235.getClass(), "baseLineno", 0);
        setIntField(term470235, term470235.getClass(), "endLineno", 0);
        setField(term470235, term470235.getClass(), "functions", null);
        setField(term470235, term470235.getClass(), "regexps", null);
        setField(term470235, term470235.getClass(), "itsVariables", null);
        setField(term470235, term470235.getClass(), "itsConst", null);
        setField(term470235, term470235.getClass(), "itsVariableNames", null);
        setIntField(term470235, term470235.getClass(), "varStart", 0);
        setField(term470235, term470235.getClass(), "compilerData", null);
        setIntField(term470235, term470235.getClass(), "type", 19);
        setIntField(term470236, term470236.getClass(), "type", 0);
        setField(term470236, term470236.getClass(), "next", null);
        setField(term470236, term470236.getClass(), "first", null);
        setField(term470236, term470236.getClass(), "last", null);
        setField(term470236, term470236.getClass(), "propListHead", null);
        setIntField(term470236, term470236.getClass(), "sourcePosition", 0);
        setField(term470236, term470236.getClass(), "jsType", null);
        setField(term470236, term470236.getClass(), "parent", null);
        setField(term470235, term470235.getClass(), "next", term470236);
        setField(term470235, term470235.getClass(), "first", term470235);
        setField(term470235, term470235.getClass(), "last", null);
        setField(term470235, term470235.getClass(), "propListHead", null);
        setIntField(term470235, term470235.getClass(), "sourcePosition", 0);
        setField(term470235, term470235.getClass(), "jsType", null);
        setField(term470235, term470235.getClass(), "parent", null);
        term470197 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term470207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term470197, term470197.getClass(), "functionName", null);
        setBooleanField(term470197, term470197.getClass(), "itsNeedsActivation", false);
        setIntField(term470197, term470197.getClass(), "itsFunctionType", 0);
        setBooleanField(term470197, term470197.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term470197, term470197.getClass(), "encodedSourceStart", 0);
        setIntField(term470197, term470197.getClass(), "encodedSourceEnd", 0);
        setField(term470197, term470197.getClass(), "sourceName", null);
        setIntField(term470197, term470197.getClass(), "baseLineno", 0);
        setIntField(term470197, term470197.getClass(), "endLineno", 0);
        setField(term470197, term470197.getClass(), "functions", null);
        setField(term470197, term470197.getClass(), "regexps", null);
        setField(term470197, term470197.getClass(), "itsVariables", null);
        setField(term470197, term470197.getClass(), "itsConst", null);
        setField(term470197, term470197.getClass(), "itsVariableNames", null);
        setIntField(term470197, term470197.getClass(), "varStart", 0);
        setField(term470197, term470197.getClass(), "compilerData", null);
        setIntField(term470197, term470197.getClass(), "type", 19);
        setIntField(term470207, term470207.getClass(), "type", 0);
        setField(term470207, term470207.getClass(), "next", null);
        setField(term470207, term470207.getClass(), "first", null);
        setField(term470207, term470207.getClass(), "last", null);
        setField(term470207, term470207.getClass(), "propListHead", null);
        setIntField(term470207, term470207.getClass(), "sourcePosition", 0);
        setField(term470207, term470207.getClass(), "jsType", null);
        setField(term470207, term470207.getClass(), "parent", null);
        setField(term470197, term470197.getClass(), "next", term470207);
        setField(term470197, term470197.getClass(), "first", term470197);
        setField(term470197, term470197.getClass(), "last", null);
        setField(term470197, term470197.getClass(), "propListHead", null);
        setIntField(term470197, term470197.getClass(), "sourcePosition", 0);
        setField(term470197, term470197.getClass(), "jsType", null);
        setField(term470197, term470197.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term470028;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term469942, args);
        assertTrue(recursiveEquals(term469942, term470234));
        assertTrue(recursiveEquals(term470028, term470235));
        assertTrue(recursiveEquals(retValue, term470197));
    }

};


