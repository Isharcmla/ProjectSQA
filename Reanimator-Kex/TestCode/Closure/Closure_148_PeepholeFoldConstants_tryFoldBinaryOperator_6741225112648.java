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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term756580;
     Object term756670;
     Object term756918;
     Object term756919;
     Object term756863;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term756580 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term756670 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term756756 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term756848 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term756756, term756756.getClass(), "next", term756848);
        setIntField(term756756, term756756.getClass(), "type", 39);
        setField(term756670, term756670.getClass(), "first", term756756);
        setIntField(term756670, term756670.getClass(), "type", 23);
        term756918 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term756918, term756918.getClass(), "currentTraversal", null);
        term756919 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term756920 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term756921 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term756919, term756919.getClass(), "encodedSourceStart", 0);
        setIntField(term756919, term756919.getClass(), "encodedSourceEnd", 0);
        setField(term756919, term756919.getClass(), "sourceName", null);
        setIntField(term756919, term756919.getClass(), "baseLineno", 0);
        setIntField(term756919, term756919.getClass(), "endLineno", 0);
        setField(term756919, term756919.getClass(), "functions", null);
        setField(term756919, term756919.getClass(), "regexps", null);
        setField(term756919, term756919.getClass(), "itsVariables", null);
        setField(term756919, term756919.getClass(), "itsConst", null);
        setField(term756919, term756919.getClass(), "itsVariableNames", null);
        setIntField(term756919, term756919.getClass(), "varStart", 0);
        setField(term756919, term756919.getClass(), "compilerData", null);
        setIntField(term756919, term756919.getClass(), "type", 23);
        setField(term756919, term756919.getClass(), "next", null);
        setField(term756920, term756920.getClass(), "functionName", null);
        setBooleanField(term756920, term756920.getClass(), "itsNeedsActivation", false);
        setIntField(term756920, term756920.getClass(), "itsFunctionType", 0);
        setBooleanField(term756920, term756920.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term756920, term756920.getClass(), "encodedSourceStart", 0);
        setIntField(term756920, term756920.getClass(), "encodedSourceEnd", 0);
        setField(term756920, term756920.getClass(), "sourceName", null);
        setIntField(term756920, term756920.getClass(), "baseLineno", 0);
        setIntField(term756920, term756920.getClass(), "endLineno", 0);
        setField(term756920, term756920.getClass(), "functions", null);
        setField(term756920, term756920.getClass(), "regexps", null);
        setField(term756920, term756920.getClass(), "itsVariables", null);
        setField(term756920, term756920.getClass(), "itsConst", null);
        setField(term756920, term756920.getClass(), "itsVariableNames", null);
        setIntField(term756920, term756920.getClass(), "varStart", 0);
        setField(term756920, term756920.getClass(), "compilerData", null);
        setIntField(term756920, term756920.getClass(), "type", 39);
        setField(term756921, term756921.getClass(), "str", null);
        setIntField(term756921, term756921.getClass(), "type", 0);
        setField(term756921, term756921.getClass(), "next", null);
        setField(term756921, term756921.getClass(), "first", null);
        setField(term756921, term756921.getClass(), "last", null);
        setField(term756921, term756921.getClass(), "propListHead", null);
        setIntField(term756921, term756921.getClass(), "sourcePosition", 0);
        setField(term756921, term756921.getClass(), "jsType", null);
        setField(term756921, term756921.getClass(), "parent", null);
        setField(term756920, term756920.getClass(), "next", term756921);
        setField(term756920, term756920.getClass(), "first", null);
        setField(term756920, term756920.getClass(), "last", null);
        setField(term756920, term756920.getClass(), "propListHead", null);
        setIntField(term756920, term756920.getClass(), "sourcePosition", 0);
        setField(term756920, term756920.getClass(), "jsType", null);
        setField(term756920, term756920.getClass(), "parent", null);
        setField(term756919, term756919.getClass(), "first", term756920);
        setField(term756919, term756919.getClass(), "last", null);
        setField(term756919, term756919.getClass(), "propListHead", null);
        setIntField(term756919, term756919.getClass(), "sourcePosition", 0);
        setField(term756919, term756919.getClass(), "jsType", null);
        setField(term756919, term756919.getClass(), "parent", null);
        term756863 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term756870 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term756880 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term756863, term756863.getClass(), "encodedSourceStart", 0);
        setIntField(term756863, term756863.getClass(), "encodedSourceEnd", 0);
        setField(term756863, term756863.getClass(), "sourceName", null);
        setIntField(term756863, term756863.getClass(), "baseLineno", 0);
        setIntField(term756863, term756863.getClass(), "endLineno", 0);
        setField(term756863, term756863.getClass(), "functions", null);
        setField(term756863, term756863.getClass(), "regexps", null);
        setField(term756863, term756863.getClass(), "itsVariables", null);
        setField(term756863, term756863.getClass(), "itsConst", null);
        setField(term756863, term756863.getClass(), "itsVariableNames", null);
        setIntField(term756863, term756863.getClass(), "varStart", 0);
        setField(term756863, term756863.getClass(), "compilerData", null);
        setIntField(term756863, term756863.getClass(), "type", 23);
        setField(term756863, term756863.getClass(), "next", null);
        setField(term756870, term756870.getClass(), "functionName", null);
        setBooleanField(term756870, term756870.getClass(), "itsNeedsActivation", false);
        setIntField(term756870, term756870.getClass(), "itsFunctionType", 0);
        setBooleanField(term756870, term756870.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term756870, term756870.getClass(), "encodedSourceStart", 0);
        setIntField(term756870, term756870.getClass(), "encodedSourceEnd", 0);
        setField(term756870, term756870.getClass(), "sourceName", null);
        setIntField(term756870, term756870.getClass(), "baseLineno", 0);
        setIntField(term756870, term756870.getClass(), "endLineno", 0);
        setField(term756870, term756870.getClass(), "functions", null);
        setField(term756870, term756870.getClass(), "regexps", null);
        setField(term756870, term756870.getClass(), "itsVariables", null);
        setField(term756870, term756870.getClass(), "itsConst", null);
        setField(term756870, term756870.getClass(), "itsVariableNames", null);
        setIntField(term756870, term756870.getClass(), "varStart", 0);
        setField(term756870, term756870.getClass(), "compilerData", null);
        setIntField(term756870, term756870.getClass(), "type", 39);
        setField(term756880, term756880.getClass(), "str", null);
        setIntField(term756880, term756880.getClass(), "type", 0);
        setField(term756880, term756880.getClass(), "next", null);
        setField(term756880, term756880.getClass(), "first", null);
        setField(term756880, term756880.getClass(), "last", null);
        setField(term756880, term756880.getClass(), "propListHead", null);
        setIntField(term756880, term756880.getClass(), "sourcePosition", 0);
        setField(term756880, term756880.getClass(), "jsType", null);
        setField(term756880, term756880.getClass(), "parent", null);
        setField(term756870, term756870.getClass(), "next", term756880);
        setField(term756870, term756870.getClass(), "first", null);
        setField(term756870, term756870.getClass(), "last", null);
        setField(term756870, term756870.getClass(), "propListHead", null);
        setIntField(term756870, term756870.getClass(), "sourcePosition", 0);
        setField(term756870, term756870.getClass(), "jsType", null);
        setField(term756870, term756870.getClass(), "parent", null);
        setField(term756863, term756863.getClass(), "first", term756870);
        setField(term756863, term756863.getClass(), "last", null);
        setField(term756863, term756863.getClass(), "propListHead", null);
        setIntField(term756863, term756863.getClass(), "sourcePosition", 0);
        setField(term756863, term756863.getClass(), "jsType", null);
        setField(term756863, term756863.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term756670;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term756580, args);
        assertTrue(recursiveEquals(term756580, term756918));
        assertTrue(recursiveEquals(term756670, term756919));
        assertTrue(recursiveEquals(retValue, term756863));
    }

};


