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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term873370;
     Object term873456;
     Object term874267;
     Object term874268;
     Object term874201;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term873370 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term873456 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term873542 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term873634 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term873542, term873542.getClass(), "next", term873634);
        setField(term873456, term873456.getClass(), "first", term873542);
        setIntField(term873456, term873456.getClass(), "type", 33);
        term874267 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term874267, term874267.getClass(), "currentTraversal", null);
        term874268 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term874269 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term874270 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term874268, term874268.getClass(), "functionName", null);
        setBooleanField(term874268, term874268.getClass(), "itsNeedsActivation", false);
        setIntField(term874268, term874268.getClass(), "itsFunctionType", 0);
        setBooleanField(term874268, term874268.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term874268, term874268.getClass(), "encodedSourceStart", 0);
        setIntField(term874268, term874268.getClass(), "encodedSourceEnd", 0);
        setField(term874268, term874268.getClass(), "sourceName", null);
        setIntField(term874268, term874268.getClass(), "baseLineno", 0);
        setIntField(term874268, term874268.getClass(), "endLineno", 0);
        setField(term874268, term874268.getClass(), "functions", null);
        setField(term874268, term874268.getClass(), "regexps", null);
        setField(term874268, term874268.getClass(), "itsVariables", null);
        setField(term874268, term874268.getClass(), "itsConst", null);
        setField(term874268, term874268.getClass(), "itsVariableNames", null);
        setIntField(term874268, term874268.getClass(), "varStart", 0);
        setField(term874268, term874268.getClass(), "compilerData", null);
        setIntField(term874268, term874268.getClass(), "type", 33);
        setField(term874268, term874268.getClass(), "next", null);
        setField(term874269, term874269.getClass(), "functionName", null);
        setBooleanField(term874269, term874269.getClass(), "itsNeedsActivation", false);
        setIntField(term874269, term874269.getClass(), "itsFunctionType", 0);
        setBooleanField(term874269, term874269.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term874269, term874269.getClass(), "encodedSourceStart", 0);
        setIntField(term874269, term874269.getClass(), "encodedSourceEnd", 0);
        setField(term874269, term874269.getClass(), "sourceName", null);
        setIntField(term874269, term874269.getClass(), "baseLineno", 0);
        setIntField(term874269, term874269.getClass(), "endLineno", 0);
        setField(term874269, term874269.getClass(), "functions", null);
        setField(term874269, term874269.getClass(), "regexps", null);
        setField(term874269, term874269.getClass(), "itsVariables", null);
        setField(term874269, term874269.getClass(), "itsConst", null);
        setField(term874269, term874269.getClass(), "itsVariableNames", null);
        setIntField(term874269, term874269.getClass(), "varStart", 0);
        setField(term874269, term874269.getClass(), "compilerData", null);
        setIntField(term874269, term874269.getClass(), "type", 0);
        setDoubleField(term874270, term874270.getClass(), "number", 0.0);
        setIntField(term874270, term874270.getClass(), "type", 0);
        setField(term874270, term874270.getClass(), "next", null);
        setField(term874270, term874270.getClass(), "first", null);
        setField(term874270, term874270.getClass(), "last", null);
        setField(term874270, term874270.getClass(), "propListHead", null);
        setIntField(term874270, term874270.getClass(), "sourcePosition", 0);
        setField(term874270, term874270.getClass(), "jsType", null);
        setField(term874270, term874270.getClass(), "parent", null);
        setField(term874269, term874269.getClass(), "next", term874270);
        setField(term874269, term874269.getClass(), "first", null);
        setField(term874269, term874269.getClass(), "last", null);
        setField(term874269, term874269.getClass(), "propListHead", null);
        setIntField(term874269, term874269.getClass(), "sourcePosition", 0);
        setField(term874269, term874269.getClass(), "jsType", null);
        setField(term874269, term874269.getClass(), "parent", null);
        setField(term874268, term874268.getClass(), "first", term874269);
        setField(term874268, term874268.getClass(), "last", null);
        setField(term874268, term874268.getClass(), "propListHead", null);
        setIntField(term874268, term874268.getClass(), "sourcePosition", 0);
        setField(term874268, term874268.getClass(), "jsType", null);
        setField(term874268, term874268.getClass(), "parent", null);
        term874201 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term874211 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term874221 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term874201, term874201.getClass(), "functionName", null);
        setBooleanField(term874201, term874201.getClass(), "itsNeedsActivation", false);
        setIntField(term874201, term874201.getClass(), "itsFunctionType", 0);
        setBooleanField(term874201, term874201.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term874201, term874201.getClass(), "encodedSourceStart", 0);
        setIntField(term874201, term874201.getClass(), "encodedSourceEnd", 0);
        setField(term874201, term874201.getClass(), "sourceName", null);
        setIntField(term874201, term874201.getClass(), "baseLineno", 0);
        setIntField(term874201, term874201.getClass(), "endLineno", 0);
        setField(term874201, term874201.getClass(), "functions", null);
        setField(term874201, term874201.getClass(), "regexps", null);
        setField(term874201, term874201.getClass(), "itsVariables", null);
        setField(term874201, term874201.getClass(), "itsConst", null);
        setField(term874201, term874201.getClass(), "itsVariableNames", null);
        setIntField(term874201, term874201.getClass(), "varStart", 0);
        setField(term874201, term874201.getClass(), "compilerData", null);
        setIntField(term874201, term874201.getClass(), "type", 33);
        setField(term874201, term874201.getClass(), "next", null);
        setField(term874211, term874211.getClass(), "functionName", null);
        setBooleanField(term874211, term874211.getClass(), "itsNeedsActivation", false);
        setIntField(term874211, term874211.getClass(), "itsFunctionType", 0);
        setBooleanField(term874211, term874211.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term874211, term874211.getClass(), "encodedSourceStart", 0);
        setIntField(term874211, term874211.getClass(), "encodedSourceEnd", 0);
        setField(term874211, term874211.getClass(), "sourceName", null);
        setIntField(term874211, term874211.getClass(), "baseLineno", 0);
        setIntField(term874211, term874211.getClass(), "endLineno", 0);
        setField(term874211, term874211.getClass(), "functions", null);
        setField(term874211, term874211.getClass(), "regexps", null);
        setField(term874211, term874211.getClass(), "itsVariables", null);
        setField(term874211, term874211.getClass(), "itsConst", null);
        setField(term874211, term874211.getClass(), "itsVariableNames", null);
        setIntField(term874211, term874211.getClass(), "varStart", 0);
        setField(term874211, term874211.getClass(), "compilerData", null);
        setIntField(term874211, term874211.getClass(), "type", 0);
        setDoubleField(term874221, term874221.getClass(), "number", 0.0);
        setIntField(term874221, term874221.getClass(), "type", 0);
        setField(term874221, term874221.getClass(), "next", null);
        setField(term874221, term874221.getClass(), "first", null);
        setField(term874221, term874221.getClass(), "last", null);
        setField(term874221, term874221.getClass(), "propListHead", null);
        setIntField(term874221, term874221.getClass(), "sourcePosition", 0);
        setField(term874221, term874221.getClass(), "jsType", null);
        setField(term874221, term874221.getClass(), "parent", null);
        setField(term874211, term874211.getClass(), "next", term874221);
        setField(term874211, term874211.getClass(), "first", null);
        setField(term874211, term874211.getClass(), "last", null);
        setField(term874211, term874211.getClass(), "propListHead", null);
        setIntField(term874211, term874211.getClass(), "sourcePosition", 0);
        setField(term874211, term874211.getClass(), "jsType", null);
        setField(term874211, term874211.getClass(), "parent", null);
        setField(term874201, term874201.getClass(), "first", term874211);
        setField(term874201, term874201.getClass(), "last", null);
        setField(term874201, term874201.getClass(), "propListHead", null);
        setIntField(term874201, term874201.getClass(), "sourcePosition", 0);
        setField(term874201, term874201.getClass(), "jsType", null);
        setField(term874201, term874201.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term873456;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term873370, args);
        assertTrue(recursiveEquals(term873370, term874267));
        assertTrue(recursiveEquals(term873456, term874268));
        assertTrue(recursiveEquals(retValue, term874201));
    }

};


