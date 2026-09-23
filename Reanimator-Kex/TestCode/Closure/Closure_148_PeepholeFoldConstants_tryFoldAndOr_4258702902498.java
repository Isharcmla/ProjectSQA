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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term701957;
     Object term702043;
     Object term702227;
     Object term702319;
     Object term702399;
     Object term702400;
     Object term702402;
     Object term702403;
     Object term702323;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term701957 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term702043 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term702135 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term702135, term702135.getClass(), "type", 108);
        setField(term702043, term702043.getClass(), "parent", term702135);
        setIntField(term702043, term702043.getClass(), "type", 0);
        term702227 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term702227, term702227.getClass(), "type", 0);
        term702319 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term702319, term702319.getClass(), "type", 64);
        term702399 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term702399, term702399.getClass(), "currentTraversal", null);
        term702400 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term702401 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term702400, term702400.getClass(), "functionName", null);
        setBooleanField(term702400, term702400.getClass(), "itsNeedsActivation", false);
        setIntField(term702400, term702400.getClass(), "itsFunctionType", 0);
        setBooleanField(term702400, term702400.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term702400, term702400.getClass(), "encodedSourceStart", 0);
        setIntField(term702400, term702400.getClass(), "encodedSourceEnd", 0);
        setField(term702400, term702400.getClass(), "sourceName", null);
        setIntField(term702400, term702400.getClass(), "baseLineno", 0);
        setIntField(term702400, term702400.getClass(), "endLineno", 0);
        setField(term702400, term702400.getClass(), "functions", null);
        setField(term702400, term702400.getClass(), "regexps", null);
        setField(term702400, term702400.getClass(), "itsVariables", null);
        setField(term702400, term702400.getClass(), "itsConst", null);
        setField(term702400, term702400.getClass(), "itsVariableNames", null);
        setIntField(term702400, term702400.getClass(), "varStart", 0);
        setField(term702400, term702400.getClass(), "compilerData", null);
        setIntField(term702400, term702400.getClass(), "type", 0);
        setField(term702400, term702400.getClass(), "next", null);
        setField(term702400, term702400.getClass(), "first", null);
        setField(term702400, term702400.getClass(), "last", null);
        setField(term702400, term702400.getClass(), "propListHead", null);
        setIntField(term702400, term702400.getClass(), "sourcePosition", 0);
        setField(term702400, term702400.getClass(), "jsType", null);
        setField(term702401, term702401.getClass(), "str", null);
        setIntField(term702401, term702401.getClass(), "type", 108);
        setField(term702401, term702401.getClass(), "next", null);
        setField(term702401, term702401.getClass(), "first", null);
        setField(term702401, term702401.getClass(), "last", null);
        setField(term702401, term702401.getClass(), "propListHead", null);
        setIntField(term702401, term702401.getClass(), "sourcePosition", 0);
        setField(term702401, term702401.getClass(), "jsType", null);
        setField(term702401, term702401.getClass(), "parent", null);
        setField(term702400, term702400.getClass(), "parent", term702401);
        term702402 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term702402, term702402.getClass(), "str", null);
        setIntField(term702402, term702402.getClass(), "type", 0);
        setField(term702402, term702402.getClass(), "next", null);
        setField(term702402, term702402.getClass(), "first", null);
        setField(term702402, term702402.getClass(), "last", null);
        setField(term702402, term702402.getClass(), "propListHead", null);
        setIntField(term702402, term702402.getClass(), "sourcePosition", 0);
        setField(term702402, term702402.getClass(), "jsType", null);
        setField(term702402, term702402.getClass(), "parent", null);
        term702403 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term702403, term702403.getClass(), "number", 0.0);
        setIntField(term702403, term702403.getClass(), "type", 64);
        setField(term702403, term702403.getClass(), "next", null);
        setField(term702403, term702403.getClass(), "first", null);
        setField(term702403, term702403.getClass(), "last", null);
        setField(term702403, term702403.getClass(), "propListHead", null);
        setIntField(term702403, term702403.getClass(), "sourcePosition", 0);
        setField(term702403, term702403.getClass(), "jsType", null);
        setField(term702403, term702403.getClass(), "parent", null);
        term702323 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term702334 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term702323, term702323.getClass(), "functionName", null);
        setBooleanField(term702323, term702323.getClass(), "itsNeedsActivation", false);
        setIntField(term702323, term702323.getClass(), "itsFunctionType", 0);
        setBooleanField(term702323, term702323.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term702323, term702323.getClass(), "encodedSourceStart", 0);
        setIntField(term702323, term702323.getClass(), "encodedSourceEnd", 0);
        setField(term702323, term702323.getClass(), "sourceName", null);
        setIntField(term702323, term702323.getClass(), "baseLineno", 0);
        setIntField(term702323, term702323.getClass(), "endLineno", 0);
        setField(term702323, term702323.getClass(), "functions", null);
        setField(term702323, term702323.getClass(), "regexps", null);
        setField(term702323, term702323.getClass(), "itsVariables", null);
        setField(term702323, term702323.getClass(), "itsConst", null);
        setField(term702323, term702323.getClass(), "itsVariableNames", null);
        setIntField(term702323, term702323.getClass(), "varStart", 0);
        setField(term702323, term702323.getClass(), "compilerData", null);
        setIntField(term702323, term702323.getClass(), "type", 0);
        setField(term702323, term702323.getClass(), "next", null);
        setField(term702323, term702323.getClass(), "first", null);
        setField(term702323, term702323.getClass(), "last", null);
        setField(term702323, term702323.getClass(), "propListHead", null);
        setIntField(term702323, term702323.getClass(), "sourcePosition", 0);
        setField(term702323, term702323.getClass(), "jsType", null);
        setField(term702334, term702334.getClass(), "str", null);
        setIntField(term702334, term702334.getClass(), "type", 108);
        setField(term702334, term702334.getClass(), "next", null);
        setField(term702334, term702334.getClass(), "first", null);
        setField(term702334, term702334.getClass(), "last", null);
        setField(term702334, term702334.getClass(), "propListHead", null);
        setIntField(term702334, term702334.getClass(), "sourcePosition", 0);
        setField(term702334, term702334.getClass(), "jsType", null);
        setField(term702334, term702334.getClass(), "parent", null);
        setField(term702323, term702323.getClass(), "parent", term702334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term702043;
        args[1] = term702227;
        args[2] = term702319;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term701957, args);
        assertTrue(recursiveEquals(term701957, term702399));
        assertTrue(recursiveEquals(term702043, term702400));
        assertTrue(recursiveEquals(term702227, term702402));
        assertTrue(recursiveEquals(term702319, term702403));
        assertTrue(recursiveEquals(retValue, term702323));
    }

};


