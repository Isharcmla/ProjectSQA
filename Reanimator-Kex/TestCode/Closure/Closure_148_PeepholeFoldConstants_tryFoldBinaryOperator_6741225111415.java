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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348649;
     Object term348735;
     Object term349420;
     Object term349421;
     Object term349357;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348649 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term348735 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term348821 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term348891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term348821, term348821.getClass(), "next", term348891);
        setField(term348735, term348735.getClass(), "first", term348821);
        setIntField(term348735, term348735.getClass(), "type", 35);
        term349420 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term349420, term349420.getClass(), "currentTraversal", null);
        term349421 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term349422 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term349423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term349421, term349421.getClass(), "functionName", null);
        setBooleanField(term349421, term349421.getClass(), "itsNeedsActivation", false);
        setIntField(term349421, term349421.getClass(), "itsFunctionType", 0);
        setBooleanField(term349421, term349421.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term349421, term349421.getClass(), "encodedSourceStart", 0);
        setIntField(term349421, term349421.getClass(), "encodedSourceEnd", 0);
        setField(term349421, term349421.getClass(), "sourceName", null);
        setIntField(term349421, term349421.getClass(), "baseLineno", 0);
        setIntField(term349421, term349421.getClass(), "endLineno", 0);
        setField(term349421, term349421.getClass(), "functions", null);
        setField(term349421, term349421.getClass(), "regexps", null);
        setField(term349421, term349421.getClass(), "itsVariables", null);
        setField(term349421, term349421.getClass(), "itsConst", null);
        setField(term349421, term349421.getClass(), "itsVariableNames", null);
        setIntField(term349421, term349421.getClass(), "varStart", 0);
        setField(term349421, term349421.getClass(), "compilerData", null);
        setIntField(term349421, term349421.getClass(), "type", 35);
        setField(term349421, term349421.getClass(), "next", null);
        setField(term349422, term349422.getClass(), "functionName", null);
        setBooleanField(term349422, term349422.getClass(), "itsNeedsActivation", false);
        setIntField(term349422, term349422.getClass(), "itsFunctionType", 0);
        setBooleanField(term349422, term349422.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term349422, term349422.getClass(), "encodedSourceStart", 0);
        setIntField(term349422, term349422.getClass(), "encodedSourceEnd", 0);
        setField(term349422, term349422.getClass(), "sourceName", null);
        setIntField(term349422, term349422.getClass(), "baseLineno", 0);
        setIntField(term349422, term349422.getClass(), "endLineno", 0);
        setField(term349422, term349422.getClass(), "functions", null);
        setField(term349422, term349422.getClass(), "regexps", null);
        setField(term349422, term349422.getClass(), "itsVariables", null);
        setField(term349422, term349422.getClass(), "itsConst", null);
        setField(term349422, term349422.getClass(), "itsVariableNames", null);
        setIntField(term349422, term349422.getClass(), "varStart", 0);
        setField(term349422, term349422.getClass(), "compilerData", null);
        setIntField(term349422, term349422.getClass(), "type", 0);
        setIntField(term349423, term349423.getClass(), "type", 0);
        setField(term349423, term349423.getClass(), "next", null);
        setField(term349423, term349423.getClass(), "first", null);
        setField(term349423, term349423.getClass(), "last", null);
        setField(term349423, term349423.getClass(), "propListHead", null);
        setIntField(term349423, term349423.getClass(), "sourcePosition", 0);
        setField(term349423, term349423.getClass(), "jsType", null);
        setField(term349423, term349423.getClass(), "parent", null);
        setField(term349422, term349422.getClass(), "next", term349423);
        setField(term349422, term349422.getClass(), "first", null);
        setField(term349422, term349422.getClass(), "last", null);
        setField(term349422, term349422.getClass(), "propListHead", null);
        setIntField(term349422, term349422.getClass(), "sourcePosition", 0);
        setField(term349422, term349422.getClass(), "jsType", null);
        setField(term349422, term349422.getClass(), "parent", null);
        setField(term349421, term349421.getClass(), "first", term349422);
        setField(term349421, term349421.getClass(), "last", null);
        setField(term349421, term349421.getClass(), "propListHead", null);
        setIntField(term349421, term349421.getClass(), "sourcePosition", 0);
        setField(term349421, term349421.getClass(), "jsType", null);
        setField(term349421, term349421.getClass(), "parent", null);
        term349357 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term349367 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term349377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term349357, term349357.getClass(), "functionName", null);
        setBooleanField(term349357, term349357.getClass(), "itsNeedsActivation", false);
        setIntField(term349357, term349357.getClass(), "itsFunctionType", 0);
        setBooleanField(term349357, term349357.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term349357, term349357.getClass(), "encodedSourceStart", 0);
        setIntField(term349357, term349357.getClass(), "encodedSourceEnd", 0);
        setField(term349357, term349357.getClass(), "sourceName", null);
        setIntField(term349357, term349357.getClass(), "baseLineno", 0);
        setIntField(term349357, term349357.getClass(), "endLineno", 0);
        setField(term349357, term349357.getClass(), "functions", null);
        setField(term349357, term349357.getClass(), "regexps", null);
        setField(term349357, term349357.getClass(), "itsVariables", null);
        setField(term349357, term349357.getClass(), "itsConst", null);
        setField(term349357, term349357.getClass(), "itsVariableNames", null);
        setIntField(term349357, term349357.getClass(), "varStart", 0);
        setField(term349357, term349357.getClass(), "compilerData", null);
        setIntField(term349357, term349357.getClass(), "type", 35);
        setField(term349357, term349357.getClass(), "next", null);
        setField(term349367, term349367.getClass(), "functionName", null);
        setBooleanField(term349367, term349367.getClass(), "itsNeedsActivation", false);
        setIntField(term349367, term349367.getClass(), "itsFunctionType", 0);
        setBooleanField(term349367, term349367.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term349367, term349367.getClass(), "encodedSourceStart", 0);
        setIntField(term349367, term349367.getClass(), "encodedSourceEnd", 0);
        setField(term349367, term349367.getClass(), "sourceName", null);
        setIntField(term349367, term349367.getClass(), "baseLineno", 0);
        setIntField(term349367, term349367.getClass(), "endLineno", 0);
        setField(term349367, term349367.getClass(), "functions", null);
        setField(term349367, term349367.getClass(), "regexps", null);
        setField(term349367, term349367.getClass(), "itsVariables", null);
        setField(term349367, term349367.getClass(), "itsConst", null);
        setField(term349367, term349367.getClass(), "itsVariableNames", null);
        setIntField(term349367, term349367.getClass(), "varStart", 0);
        setField(term349367, term349367.getClass(), "compilerData", null);
        setIntField(term349367, term349367.getClass(), "type", 0);
        setIntField(term349377, term349377.getClass(), "type", 0);
        setField(term349377, term349377.getClass(), "next", null);
        setField(term349377, term349377.getClass(), "first", null);
        setField(term349377, term349377.getClass(), "last", null);
        setField(term349377, term349377.getClass(), "propListHead", null);
        setIntField(term349377, term349377.getClass(), "sourcePosition", 0);
        setField(term349377, term349377.getClass(), "jsType", null);
        setField(term349377, term349377.getClass(), "parent", null);
        setField(term349367, term349367.getClass(), "next", term349377);
        setField(term349367, term349367.getClass(), "first", null);
        setField(term349367, term349367.getClass(), "last", null);
        setField(term349367, term349367.getClass(), "propListHead", null);
        setIntField(term349367, term349367.getClass(), "sourcePosition", 0);
        setField(term349367, term349367.getClass(), "jsType", null);
        setField(term349367, term349367.getClass(), "parent", null);
        setField(term349357, term349357.getClass(), "first", term349367);
        setField(term349357, term349357.getClass(), "last", null);
        setField(term349357, term349357.getClass(), "propListHead", null);
        setIntField(term349357, term349357.getClass(), "sourcePosition", 0);
        setField(term349357, term349357.getClass(), "jsType", null);
        setField(term349357, term349357.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term348735;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term348649, args);
        assertTrue(recursiveEquals(term348649, term349420));
        assertTrue(recursiveEquals(term348735, term349421));
        assertTrue(recursiveEquals(retValue, term349357));
    }

};


