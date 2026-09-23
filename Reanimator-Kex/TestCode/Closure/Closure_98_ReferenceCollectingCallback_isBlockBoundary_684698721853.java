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

public class ReferenceCollectingCallback_isBlockBoundary_684698721853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224022;
     Object term224108;
     Object term225280;
     Object term225282;

    public ReferenceCollectingCallback_isBlockBoundary_684698721853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224022 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term224108 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term224194 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term224108, term224108.getClass(), "type", 108);
        setField(term224108, term224108.getClass(), "first", term224194);
        term225280 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term225281 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term225280, term225280.getClass(), "functionName", null);
        setBooleanField(term225280, term225280.getClass(), "itsNeedsActivation", false);
        setIntField(term225280, term225280.getClass(), "itsFunctionType", 0);
        setBooleanField(term225280, term225280.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term225280, term225280.getClass(), "encodedSourceStart", 0);
        setIntField(term225280, term225280.getClass(), "encodedSourceEnd", 0);
        setField(term225280, term225280.getClass(), "sourceName", null);
        setIntField(term225280, term225280.getClass(), "baseLineno", 0);
        setIntField(term225280, term225280.getClass(), "endLineno", 0);
        setField(term225280, term225280.getClass(), "functions", null);
        setField(term225280, term225280.getClass(), "regexps", null);
        setField(term225280, term225280.getClass(), "itsVariables", null);
        setField(term225280, term225280.getClass(), "itsConst", null);
        setField(term225280, term225280.getClass(), "itsVariableNames", null);
        setIntField(term225280, term225280.getClass(), "varStart", 0);
        setField(term225280, term225280.getClass(), "compilerData", null);
        setIntField(term225280, term225280.getClass(), "type", 108);
        setField(term225280, term225280.getClass(), "next", null);
        setField(term225281, term225281.getClass(), "functionName", null);
        setBooleanField(term225281, term225281.getClass(), "itsNeedsActivation", false);
        setIntField(term225281, term225281.getClass(), "itsFunctionType", 0);
        setBooleanField(term225281, term225281.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term225281, term225281.getClass(), "encodedSourceStart", 0);
        setIntField(term225281, term225281.getClass(), "encodedSourceEnd", 0);
        setField(term225281, term225281.getClass(), "sourceName", null);
        setIntField(term225281, term225281.getClass(), "baseLineno", 0);
        setIntField(term225281, term225281.getClass(), "endLineno", 0);
        setField(term225281, term225281.getClass(), "functions", null);
        setField(term225281, term225281.getClass(), "regexps", null);
        setField(term225281, term225281.getClass(), "itsVariables", null);
        setField(term225281, term225281.getClass(), "itsConst", null);
        setField(term225281, term225281.getClass(), "itsVariableNames", null);
        setIntField(term225281, term225281.getClass(), "varStart", 0);
        setField(term225281, term225281.getClass(), "compilerData", null);
        setIntField(term225281, term225281.getClass(), "type", 0);
        setField(term225281, term225281.getClass(), "next", null);
        setField(term225281, term225281.getClass(), "first", null);
        setField(term225281, term225281.getClass(), "last", null);
        setField(term225281, term225281.getClass(), "propListHead", null);
        setIntField(term225281, term225281.getClass(), "sourcePosition", 0);
        setField(term225281, term225281.getClass(), "jsType", null);
        setField(term225281, term225281.getClass(), "parent", null);
        setField(term225280, term225280.getClass(), "first", term225281);
        setField(term225280, term225280.getClass(), "last", null);
        setField(term225280, term225280.getClass(), "propListHead", null);
        setIntField(term225280, term225280.getClass(), "sourcePosition", 0);
        setField(term225280, term225280.getClass(), "jsType", null);
        setField(term225280, term225280.getClass(), "parent", null);
        term225282 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term225282, term225282.getClass(), "functionName", null);
        setBooleanField(term225282, term225282.getClass(), "itsNeedsActivation", false);
        setIntField(term225282, term225282.getClass(), "itsFunctionType", 0);
        setBooleanField(term225282, term225282.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term225282, term225282.getClass(), "encodedSourceStart", 0);
        setIntField(term225282, term225282.getClass(), "encodedSourceEnd", 0);
        setField(term225282, term225282.getClass(), "sourceName", null);
        setIntField(term225282, term225282.getClass(), "baseLineno", 0);
        setIntField(term225282, term225282.getClass(), "endLineno", 0);
        setField(term225282, term225282.getClass(), "functions", null);
        setField(term225282, term225282.getClass(), "regexps", null);
        setField(term225282, term225282.getClass(), "itsVariables", null);
        setField(term225282, term225282.getClass(), "itsConst", null);
        setField(term225282, term225282.getClass(), "itsVariableNames", null);
        setIntField(term225282, term225282.getClass(), "varStart", 0);
        setField(term225282, term225282.getClass(), "compilerData", null);
        setIntField(term225282, term225282.getClass(), "type", 0);
        setField(term225282, term225282.getClass(), "next", null);
        setField(term225282, term225282.getClass(), "first", null);
        setField(term225282, term225282.getClass(), "last", null);
        setField(term225282, term225282.getClass(), "propListHead", null);
        setIntField(term225282, term225282.getClass(), "sourcePosition", 0);
        setField(term225282, term225282.getClass(), "jsType", null);
        setField(term225282, term225282.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term224022;
        args[1] = term224108;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term224022, term225280));
        assertTrue(recursiveEquals(term224108, term225282));
        assertTrue(recursiveEquals(retValue, true));
    }

};


