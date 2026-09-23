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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318009;
     Object term318095;
     Object term318570;
     Object term318572;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318009 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term318095 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term318181 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term318095, term318095.getClass(), "type", 100);
        setField(term318095, term318095.getClass(), "first", term318181);
        term318570 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term318571 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term318570, term318570.getClass(), "functionName", null);
        setBooleanField(term318570, term318570.getClass(), "itsNeedsActivation", false);
        setIntField(term318570, term318570.getClass(), "itsFunctionType", 0);
        setBooleanField(term318570, term318570.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term318570, term318570.getClass(), "encodedSourceStart", 0);
        setIntField(term318570, term318570.getClass(), "encodedSourceEnd", 0);
        setField(term318570, term318570.getClass(), "sourceName", null);
        setIntField(term318570, term318570.getClass(), "baseLineno", 0);
        setIntField(term318570, term318570.getClass(), "endLineno", 0);
        setField(term318570, term318570.getClass(), "functions", null);
        setField(term318570, term318570.getClass(), "regexps", null);
        setField(term318570, term318570.getClass(), "itsVariables", null);
        setField(term318570, term318570.getClass(), "itsConst", null);
        setField(term318570, term318570.getClass(), "itsVariableNames", null);
        setIntField(term318570, term318570.getClass(), "varStart", 0);
        setField(term318570, term318570.getClass(), "compilerData", null);
        setIntField(term318570, term318570.getClass(), "type", 100);
        setField(term318570, term318570.getClass(), "next", null);
        setField(term318571, term318571.getClass(), "functionName", null);
        setBooleanField(term318571, term318571.getClass(), "itsNeedsActivation", false);
        setIntField(term318571, term318571.getClass(), "itsFunctionType", 0);
        setBooleanField(term318571, term318571.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term318571, term318571.getClass(), "encodedSourceStart", 0);
        setIntField(term318571, term318571.getClass(), "encodedSourceEnd", 0);
        setField(term318571, term318571.getClass(), "sourceName", null);
        setIntField(term318571, term318571.getClass(), "baseLineno", 0);
        setIntField(term318571, term318571.getClass(), "endLineno", 0);
        setField(term318571, term318571.getClass(), "functions", null);
        setField(term318571, term318571.getClass(), "regexps", null);
        setField(term318571, term318571.getClass(), "itsVariables", null);
        setField(term318571, term318571.getClass(), "itsConst", null);
        setField(term318571, term318571.getClass(), "itsVariableNames", null);
        setIntField(term318571, term318571.getClass(), "varStart", 0);
        setField(term318571, term318571.getClass(), "compilerData", null);
        setIntField(term318571, term318571.getClass(), "type", 0);
        setField(term318571, term318571.getClass(), "next", null);
        setField(term318571, term318571.getClass(), "first", null);
        setField(term318571, term318571.getClass(), "last", null);
        setField(term318571, term318571.getClass(), "propListHead", null);
        setIntField(term318571, term318571.getClass(), "sourcePosition", 0);
        setField(term318571, term318571.getClass(), "jsType", null);
        setField(term318571, term318571.getClass(), "parent", null);
        setField(term318570, term318570.getClass(), "first", term318571);
        setField(term318570, term318570.getClass(), "last", null);
        setField(term318570, term318570.getClass(), "propListHead", null);
        setIntField(term318570, term318570.getClass(), "sourcePosition", 0);
        setField(term318570, term318570.getClass(), "jsType", null);
        setField(term318570, term318570.getClass(), "parent", null);
        term318572 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term318572, term318572.getClass(), "functionName", null);
        setBooleanField(term318572, term318572.getClass(), "itsNeedsActivation", false);
        setIntField(term318572, term318572.getClass(), "itsFunctionType", 0);
        setBooleanField(term318572, term318572.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term318572, term318572.getClass(), "encodedSourceStart", 0);
        setIntField(term318572, term318572.getClass(), "encodedSourceEnd", 0);
        setField(term318572, term318572.getClass(), "sourceName", null);
        setIntField(term318572, term318572.getClass(), "baseLineno", 0);
        setIntField(term318572, term318572.getClass(), "endLineno", 0);
        setField(term318572, term318572.getClass(), "functions", null);
        setField(term318572, term318572.getClass(), "regexps", null);
        setField(term318572, term318572.getClass(), "itsVariables", null);
        setField(term318572, term318572.getClass(), "itsConst", null);
        setField(term318572, term318572.getClass(), "itsVariableNames", null);
        setIntField(term318572, term318572.getClass(), "varStart", 0);
        setField(term318572, term318572.getClass(), "compilerData", null);
        setIntField(term318572, term318572.getClass(), "type", 0);
        setField(term318572, term318572.getClass(), "next", null);
        setField(term318572, term318572.getClass(), "first", null);
        setField(term318572, term318572.getClass(), "last", null);
        setField(term318572, term318572.getClass(), "propListHead", null);
        setIntField(term318572, term318572.getClass(), "sourcePosition", 0);
        setField(term318572, term318572.getClass(), "jsType", null);
        setField(term318572, term318572.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term318009;
        args[1] = term318095;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term318009, term318570));
        assertTrue(recursiveEquals(term318095, term318572));
        assertTrue(recursiveEquals(retValue, true));
    }

};


