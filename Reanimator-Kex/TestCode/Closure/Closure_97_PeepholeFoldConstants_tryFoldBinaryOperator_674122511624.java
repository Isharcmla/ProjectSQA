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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162992;
     Object term163078;
     Object term163385;
     Object term163386;
     Object term163292;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162992 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term163078 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term163148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163234 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term163148, term163148.getClass(), "next", term163234);
        setIntField(term163148, term163148.getClass(), "type", 0);
        setField(term163078, term163078.getClass(), "first", term163148);
        setIntField(term163078, term163078.getClass(), "type", 101);
        setField(term163078, term163078.getClass(), "parent", null);
        term163385 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term163385, term163385.getClass(), "currentTraversal", null);
        term163386 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term163387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163388 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term163386, term163386.getClass(), "functionName", null);
        setBooleanField(term163386, term163386.getClass(), "itsNeedsActivation", false);
        setIntField(term163386, term163386.getClass(), "itsFunctionType", 0);
        setBooleanField(term163386, term163386.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term163386, term163386.getClass(), "encodedSourceStart", 0);
        setIntField(term163386, term163386.getClass(), "encodedSourceEnd", 0);
        setField(term163386, term163386.getClass(), "sourceName", null);
        setIntField(term163386, term163386.getClass(), "baseLineno", 0);
        setIntField(term163386, term163386.getClass(), "endLineno", 0);
        setField(term163386, term163386.getClass(), "functions", null);
        setField(term163386, term163386.getClass(), "regexps", null);
        setField(term163386, term163386.getClass(), "itsVariables", null);
        setField(term163386, term163386.getClass(), "itsConst", null);
        setField(term163386, term163386.getClass(), "itsVariableNames", null);
        setIntField(term163386, term163386.getClass(), "varStart", 0);
        setField(term163386, term163386.getClass(), "compilerData", null);
        setIntField(term163386, term163386.getClass(), "type", 101);
        setField(term163386, term163386.getClass(), "next", null);
        setIntField(term163387, term163387.getClass(), "type", 0);
        setField(term163388, term163388.getClass(), "functionName", null);
        setBooleanField(term163388, term163388.getClass(), "itsNeedsActivation", false);
        setIntField(term163388, term163388.getClass(), "itsFunctionType", 0);
        setBooleanField(term163388, term163388.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term163388, term163388.getClass(), "encodedSourceStart", 0);
        setIntField(term163388, term163388.getClass(), "encodedSourceEnd", 0);
        setField(term163388, term163388.getClass(), "sourceName", null);
        setIntField(term163388, term163388.getClass(), "baseLineno", 0);
        setIntField(term163388, term163388.getClass(), "endLineno", 0);
        setField(term163388, term163388.getClass(), "functions", null);
        setField(term163388, term163388.getClass(), "regexps", null);
        setField(term163388, term163388.getClass(), "itsVariables", null);
        setField(term163388, term163388.getClass(), "itsConst", null);
        setField(term163388, term163388.getClass(), "itsVariableNames", null);
        setIntField(term163388, term163388.getClass(), "varStart", 0);
        setField(term163388, term163388.getClass(), "compilerData", null);
        setIntField(term163388, term163388.getClass(), "type", 0);
        setField(term163388, term163388.getClass(), "next", null);
        setField(term163388, term163388.getClass(), "first", null);
        setField(term163388, term163388.getClass(), "last", null);
        setField(term163388, term163388.getClass(), "propListHead", null);
        setIntField(term163388, term163388.getClass(), "sourcePosition", 0);
        setField(term163388, term163388.getClass(), "jsType", null);
        setField(term163388, term163388.getClass(), "parent", null);
        setField(term163387, term163387.getClass(), "next", term163388);
        setField(term163387, term163387.getClass(), "first", null);
        setField(term163387, term163387.getClass(), "last", null);
        setField(term163387, term163387.getClass(), "propListHead", null);
        setIntField(term163387, term163387.getClass(), "sourcePosition", 0);
        setField(term163387, term163387.getClass(), "jsType", null);
        setField(term163387, term163387.getClass(), "parent", null);
        setField(term163386, term163386.getClass(), "first", term163387);
        setField(term163386, term163386.getClass(), "last", null);
        setField(term163386, term163386.getClass(), "propListHead", null);
        setIntField(term163386, term163386.getClass(), "sourcePosition", 0);
        setField(term163386, term163386.getClass(), "jsType", null);
        setField(term163386, term163386.getClass(), "parent", null);
        term163292 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term163302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163304 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term163292, term163292.getClass(), "functionName", null);
        setBooleanField(term163292, term163292.getClass(), "itsNeedsActivation", false);
        setIntField(term163292, term163292.getClass(), "itsFunctionType", 0);
        setBooleanField(term163292, term163292.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term163292, term163292.getClass(), "encodedSourceStart", 0);
        setIntField(term163292, term163292.getClass(), "encodedSourceEnd", 0);
        setField(term163292, term163292.getClass(), "sourceName", null);
        setIntField(term163292, term163292.getClass(), "baseLineno", 0);
        setIntField(term163292, term163292.getClass(), "endLineno", 0);
        setField(term163292, term163292.getClass(), "functions", null);
        setField(term163292, term163292.getClass(), "regexps", null);
        setField(term163292, term163292.getClass(), "itsVariables", null);
        setField(term163292, term163292.getClass(), "itsConst", null);
        setField(term163292, term163292.getClass(), "itsVariableNames", null);
        setIntField(term163292, term163292.getClass(), "varStart", 0);
        setField(term163292, term163292.getClass(), "compilerData", null);
        setIntField(term163292, term163292.getClass(), "type", 101);
        setField(term163292, term163292.getClass(), "next", null);
        setIntField(term163302, term163302.getClass(), "type", 0);
        setField(term163304, term163304.getClass(), "functionName", null);
        setBooleanField(term163304, term163304.getClass(), "itsNeedsActivation", false);
        setIntField(term163304, term163304.getClass(), "itsFunctionType", 0);
        setBooleanField(term163304, term163304.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term163304, term163304.getClass(), "encodedSourceStart", 0);
        setIntField(term163304, term163304.getClass(), "encodedSourceEnd", 0);
        setField(term163304, term163304.getClass(), "sourceName", null);
        setIntField(term163304, term163304.getClass(), "baseLineno", 0);
        setIntField(term163304, term163304.getClass(), "endLineno", 0);
        setField(term163304, term163304.getClass(), "functions", null);
        setField(term163304, term163304.getClass(), "regexps", null);
        setField(term163304, term163304.getClass(), "itsVariables", null);
        setField(term163304, term163304.getClass(), "itsConst", null);
        setField(term163304, term163304.getClass(), "itsVariableNames", null);
        setIntField(term163304, term163304.getClass(), "varStart", 0);
        setField(term163304, term163304.getClass(), "compilerData", null);
        setIntField(term163304, term163304.getClass(), "type", 0);
        setField(term163304, term163304.getClass(), "next", null);
        setField(term163304, term163304.getClass(), "first", null);
        setField(term163304, term163304.getClass(), "last", null);
        setField(term163304, term163304.getClass(), "propListHead", null);
        setIntField(term163304, term163304.getClass(), "sourcePosition", 0);
        setField(term163304, term163304.getClass(), "jsType", null);
        setField(term163304, term163304.getClass(), "parent", null);
        setField(term163302, term163302.getClass(), "next", term163304);
        setField(term163302, term163302.getClass(), "first", null);
        setField(term163302, term163302.getClass(), "last", null);
        setField(term163302, term163302.getClass(), "propListHead", null);
        setIntField(term163302, term163302.getClass(), "sourcePosition", 0);
        setField(term163302, term163302.getClass(), "jsType", null);
        setField(term163302, term163302.getClass(), "parent", null);
        setField(term163292, term163292.getClass(), "first", term163302);
        setField(term163292, term163292.getClass(), "last", null);
        setField(term163292, term163292.getClass(), "propListHead", null);
        setIntField(term163292, term163292.getClass(), "sourcePosition", 0);
        setField(term163292, term163292.getClass(), "jsType", null);
        setField(term163292, term163292.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term163078;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term162992, args);
        assertTrue(recursiveEquals(term162992, term163385));
        assertTrue(recursiveEquals(term163078, term163386));
        assertTrue(recursiveEquals(retValue, term163292));
    }

};


