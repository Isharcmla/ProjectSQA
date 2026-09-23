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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465912;
     Object term465998;
     Object term517003;
     Object term517004;
     Object term516937;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term465912 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term465998 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term466084 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term466154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term466084, term466084.getClass(), "next", term466154);
        setField(term465998, term465998.getClass(), "first", term466084);
        setIntField(term465998, term465998.getClass(), "type", 52);
        term517003 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term517003, term517003.getClass(), "currentTraversal", null);
        term517004 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term517005 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term517006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term517004, term517004.getClass(), "functionName", null);
        setBooleanField(term517004, term517004.getClass(), "itsNeedsActivation", false);
        setIntField(term517004, term517004.getClass(), "itsFunctionType", 0);
        setBooleanField(term517004, term517004.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term517004, term517004.getClass(), "encodedSourceStart", 0);
        setIntField(term517004, term517004.getClass(), "encodedSourceEnd", 0);
        setField(term517004, term517004.getClass(), "sourceName", null);
        setIntField(term517004, term517004.getClass(), "baseLineno", 0);
        setIntField(term517004, term517004.getClass(), "endLineno", 0);
        setField(term517004, term517004.getClass(), "functions", null);
        setField(term517004, term517004.getClass(), "regexps", null);
        setField(term517004, term517004.getClass(), "itsVariables", null);
        setField(term517004, term517004.getClass(), "itsConst", null);
        setField(term517004, term517004.getClass(), "itsVariableNames", null);
        setIntField(term517004, term517004.getClass(), "varStart", 0);
        setField(term517004, term517004.getClass(), "compilerData", null);
        setIntField(term517004, term517004.getClass(), "type", 52);
        setField(term517004, term517004.getClass(), "next", null);
        setField(term517005, term517005.getClass(), "functionName", null);
        setBooleanField(term517005, term517005.getClass(), "itsNeedsActivation", false);
        setIntField(term517005, term517005.getClass(), "itsFunctionType", 0);
        setBooleanField(term517005, term517005.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term517005, term517005.getClass(), "encodedSourceStart", 0);
        setIntField(term517005, term517005.getClass(), "encodedSourceEnd", 0);
        setField(term517005, term517005.getClass(), "sourceName", null);
        setIntField(term517005, term517005.getClass(), "baseLineno", 0);
        setIntField(term517005, term517005.getClass(), "endLineno", 0);
        setField(term517005, term517005.getClass(), "functions", null);
        setField(term517005, term517005.getClass(), "regexps", null);
        setField(term517005, term517005.getClass(), "itsVariables", null);
        setField(term517005, term517005.getClass(), "itsConst", null);
        setField(term517005, term517005.getClass(), "itsVariableNames", null);
        setIntField(term517005, term517005.getClass(), "varStart", 0);
        setField(term517005, term517005.getClass(), "compilerData", null);
        setIntField(term517005, term517005.getClass(), "type", 0);
        setIntField(term517006, term517006.getClass(), "type", 0);
        setField(term517006, term517006.getClass(), "next", null);
        setField(term517006, term517006.getClass(), "first", null);
        setField(term517006, term517006.getClass(), "last", null);
        setField(term517006, term517006.getClass(), "propListHead", null);
        setIntField(term517006, term517006.getClass(), "sourcePosition", 0);
        setField(term517006, term517006.getClass(), "jsType", null);
        setField(term517006, term517006.getClass(), "parent", null);
        setField(term517005, term517005.getClass(), "next", term517006);
        setField(term517005, term517005.getClass(), "first", null);
        setField(term517005, term517005.getClass(), "last", null);
        setField(term517005, term517005.getClass(), "propListHead", null);
        setIntField(term517005, term517005.getClass(), "sourcePosition", 0);
        setField(term517005, term517005.getClass(), "jsType", null);
        setField(term517005, term517005.getClass(), "parent", null);
        setField(term517004, term517004.getClass(), "first", term517005);
        setField(term517004, term517004.getClass(), "last", null);
        setField(term517004, term517004.getClass(), "propListHead", null);
        setIntField(term517004, term517004.getClass(), "sourcePosition", 0);
        setField(term517004, term517004.getClass(), "jsType", null);
        setField(term517004, term517004.getClass(), "parent", null);
        term516937 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term516947 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term516957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term516937, term516937.getClass(), "functionName", null);
        setBooleanField(term516937, term516937.getClass(), "itsNeedsActivation", false);
        setIntField(term516937, term516937.getClass(), "itsFunctionType", 0);
        setBooleanField(term516937, term516937.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term516937, term516937.getClass(), "encodedSourceStart", 0);
        setIntField(term516937, term516937.getClass(), "encodedSourceEnd", 0);
        setField(term516937, term516937.getClass(), "sourceName", null);
        setIntField(term516937, term516937.getClass(), "baseLineno", 0);
        setIntField(term516937, term516937.getClass(), "endLineno", 0);
        setField(term516937, term516937.getClass(), "functions", null);
        setField(term516937, term516937.getClass(), "regexps", null);
        setField(term516937, term516937.getClass(), "itsVariables", null);
        setField(term516937, term516937.getClass(), "itsConst", null);
        setField(term516937, term516937.getClass(), "itsVariableNames", null);
        setIntField(term516937, term516937.getClass(), "varStart", 0);
        setField(term516937, term516937.getClass(), "compilerData", null);
        setIntField(term516937, term516937.getClass(), "type", 52);
        setField(term516937, term516937.getClass(), "next", null);
        setField(term516947, term516947.getClass(), "functionName", null);
        setBooleanField(term516947, term516947.getClass(), "itsNeedsActivation", false);
        setIntField(term516947, term516947.getClass(), "itsFunctionType", 0);
        setBooleanField(term516947, term516947.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term516947, term516947.getClass(), "encodedSourceStart", 0);
        setIntField(term516947, term516947.getClass(), "encodedSourceEnd", 0);
        setField(term516947, term516947.getClass(), "sourceName", null);
        setIntField(term516947, term516947.getClass(), "baseLineno", 0);
        setIntField(term516947, term516947.getClass(), "endLineno", 0);
        setField(term516947, term516947.getClass(), "functions", null);
        setField(term516947, term516947.getClass(), "regexps", null);
        setField(term516947, term516947.getClass(), "itsVariables", null);
        setField(term516947, term516947.getClass(), "itsConst", null);
        setField(term516947, term516947.getClass(), "itsVariableNames", null);
        setIntField(term516947, term516947.getClass(), "varStart", 0);
        setField(term516947, term516947.getClass(), "compilerData", null);
        setIntField(term516947, term516947.getClass(), "type", 0);
        setIntField(term516957, term516957.getClass(), "type", 0);
        setField(term516957, term516957.getClass(), "next", null);
        setField(term516957, term516957.getClass(), "first", null);
        setField(term516957, term516957.getClass(), "last", null);
        setField(term516957, term516957.getClass(), "propListHead", null);
        setIntField(term516957, term516957.getClass(), "sourcePosition", 0);
        setField(term516957, term516957.getClass(), "jsType", null);
        setField(term516957, term516957.getClass(), "parent", null);
        setField(term516947, term516947.getClass(), "next", term516957);
        setField(term516947, term516947.getClass(), "first", null);
        setField(term516947, term516947.getClass(), "last", null);
        setField(term516947, term516947.getClass(), "propListHead", null);
        setIntField(term516947, term516947.getClass(), "sourcePosition", 0);
        setField(term516947, term516947.getClass(), "jsType", null);
        setField(term516947, term516947.getClass(), "parent", null);
        setField(term516937, term516937.getClass(), "first", term516947);
        setField(term516937, term516937.getClass(), "last", null);
        setField(term516937, term516937.getClass(), "propListHead", null);
        setIntField(term516937, term516937.getClass(), "sourcePosition", 0);
        setField(term516937, term516937.getClass(), "jsType", null);
        setField(term516937, term516937.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term465998;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term465912, args);
        assertTrue(recursiveEquals(term465912, term517003));
        assertTrue(recursiveEquals(term465998, term517004));
        assertTrue(recursiveEquals(retValue, term516937));
    }

};


