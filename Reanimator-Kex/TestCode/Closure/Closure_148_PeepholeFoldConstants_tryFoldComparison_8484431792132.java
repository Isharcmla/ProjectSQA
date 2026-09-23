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

public class PeepholeFoldConstants_tryFoldComparison_8484431792132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term580126;
     Object term580212;
     Object term580298;
     Object term580390;
     Object term580526;
     Object term580527;
     Object term580528;
     Object term580529;
     Object term580498;

    public PeepholeFoldConstants_tryFoldComparison_8484431792132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term580126 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term580212 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term580212, term580212.getClass(), "type", 14);
        term580298 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term580298, term580298.getClass(), "type", 14);
        term580390 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term580526 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term580526, term580526.getClass(), "currentTraversal", null);
        term580527 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term580527, term580527.getClass(), "functionName", null);
        setBooleanField(term580527, term580527.getClass(), "itsNeedsActivation", false);
        setIntField(term580527, term580527.getClass(), "itsFunctionType", 0);
        setBooleanField(term580527, term580527.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term580527, term580527.getClass(), "encodedSourceStart", 0);
        setIntField(term580527, term580527.getClass(), "encodedSourceEnd", 0);
        setField(term580527, term580527.getClass(), "sourceName", null);
        setIntField(term580527, term580527.getClass(), "baseLineno", 0);
        setIntField(term580527, term580527.getClass(), "endLineno", 0);
        setField(term580527, term580527.getClass(), "functions", null);
        setField(term580527, term580527.getClass(), "regexps", null);
        setField(term580527, term580527.getClass(), "itsVariables", null);
        setField(term580527, term580527.getClass(), "itsConst", null);
        setField(term580527, term580527.getClass(), "itsVariableNames", null);
        setIntField(term580527, term580527.getClass(), "varStart", 0);
        setField(term580527, term580527.getClass(), "compilerData", null);
        setIntField(term580527, term580527.getClass(), "type", 14);
        setField(term580527, term580527.getClass(), "next", null);
        setField(term580527, term580527.getClass(), "first", null);
        setField(term580527, term580527.getClass(), "last", null);
        setField(term580527, term580527.getClass(), "propListHead", null);
        setIntField(term580527, term580527.getClass(), "sourcePosition", 0);
        setField(term580527, term580527.getClass(), "jsType", null);
        setField(term580527, term580527.getClass(), "parent", null);
        term580528 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term580528, term580528.getClass(), "functionName", null);
        setBooleanField(term580528, term580528.getClass(), "itsNeedsActivation", false);
        setIntField(term580528, term580528.getClass(), "itsFunctionType", 0);
        setBooleanField(term580528, term580528.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term580528, term580528.getClass(), "encodedSourceStart", 0);
        setIntField(term580528, term580528.getClass(), "encodedSourceEnd", 0);
        setField(term580528, term580528.getClass(), "sourceName", null);
        setIntField(term580528, term580528.getClass(), "baseLineno", 0);
        setIntField(term580528, term580528.getClass(), "endLineno", 0);
        setField(term580528, term580528.getClass(), "functions", null);
        setField(term580528, term580528.getClass(), "regexps", null);
        setField(term580528, term580528.getClass(), "itsVariables", null);
        setField(term580528, term580528.getClass(), "itsConst", null);
        setField(term580528, term580528.getClass(), "itsVariableNames", null);
        setIntField(term580528, term580528.getClass(), "varStart", 0);
        setField(term580528, term580528.getClass(), "compilerData", null);
        setIntField(term580528, term580528.getClass(), "type", 14);
        setField(term580528, term580528.getClass(), "next", null);
        setField(term580528, term580528.getClass(), "first", null);
        setField(term580528, term580528.getClass(), "last", null);
        setField(term580528, term580528.getClass(), "propListHead", null);
        setIntField(term580528, term580528.getClass(), "sourcePosition", 0);
        setField(term580528, term580528.getClass(), "jsType", null);
        setField(term580528, term580528.getClass(), "parent", null);
        term580529 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term580529, term580529.getClass(), "str", null);
        setIntField(term580529, term580529.getClass(), "type", 0);
        setField(term580529, term580529.getClass(), "next", null);
        setField(term580529, term580529.getClass(), "first", null);
        setField(term580529, term580529.getClass(), "last", null);
        setField(term580529, term580529.getClass(), "propListHead", null);
        setIntField(term580529, term580529.getClass(), "sourcePosition", 0);
        setField(term580529, term580529.getClass(), "jsType", null);
        setField(term580529, term580529.getClass(), "parent", null);
        term580498 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term580498, term580498.getClass(), "functionName", null);
        setBooleanField(term580498, term580498.getClass(), "itsNeedsActivation", false);
        setIntField(term580498, term580498.getClass(), "itsFunctionType", 0);
        setBooleanField(term580498, term580498.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term580498, term580498.getClass(), "encodedSourceStart", 0);
        setIntField(term580498, term580498.getClass(), "encodedSourceEnd", 0);
        setField(term580498, term580498.getClass(), "sourceName", null);
        setIntField(term580498, term580498.getClass(), "baseLineno", 0);
        setIntField(term580498, term580498.getClass(), "endLineno", 0);
        setField(term580498, term580498.getClass(), "functions", null);
        setField(term580498, term580498.getClass(), "regexps", null);
        setField(term580498, term580498.getClass(), "itsVariables", null);
        setField(term580498, term580498.getClass(), "itsConst", null);
        setField(term580498, term580498.getClass(), "itsVariableNames", null);
        setIntField(term580498, term580498.getClass(), "varStart", 0);
        setField(term580498, term580498.getClass(), "compilerData", null);
        setIntField(term580498, term580498.getClass(), "type", 14);
        setField(term580498, term580498.getClass(), "next", null);
        setField(term580498, term580498.getClass(), "first", null);
        setField(term580498, term580498.getClass(), "last", null);
        setField(term580498, term580498.getClass(), "propListHead", null);
        setIntField(term580498, term580498.getClass(), "sourcePosition", 0);
        setField(term580498, term580498.getClass(), "jsType", null);
        setField(term580498, term580498.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term580212;
        args[1] = term580298;
        args[2] = term580390;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term580126, args);
        assertTrue(recursiveEquals(term580126, term580526));
        assertTrue(recursiveEquals(term580212, term580527));
        assertTrue(recursiveEquals(term580298, term580528));
        assertTrue(recursiveEquals(term580390, term580529));
        assertTrue(recursiveEquals(retValue, term580498));
    }

};


