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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423554;
     Object term423640;
     Object term423876;
     Object term423877;
     Object term423811;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423554 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term423640 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423726 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term423726, term423726.getClass(), "next", term423796);
        setField(term423640, term423640.getClass(), "first", term423726);
        setIntField(term423640, term423640.getClass(), "type", 9);
        term423876 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term423876, term423876.getClass(), "currentTraversal", null);
        term423877 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423878 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term423877, term423877.getClass(), "functionName", null);
        setBooleanField(term423877, term423877.getClass(), "itsNeedsActivation", false);
        setIntField(term423877, term423877.getClass(), "itsFunctionType", 0);
        setBooleanField(term423877, term423877.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423877, term423877.getClass(), "encodedSourceStart", 0);
        setIntField(term423877, term423877.getClass(), "encodedSourceEnd", 0);
        setField(term423877, term423877.getClass(), "sourceName", null);
        setIntField(term423877, term423877.getClass(), "baseLineno", 0);
        setIntField(term423877, term423877.getClass(), "endLineno", 0);
        setField(term423877, term423877.getClass(), "functions", null);
        setField(term423877, term423877.getClass(), "regexps", null);
        setField(term423877, term423877.getClass(), "itsVariables", null);
        setField(term423877, term423877.getClass(), "itsConst", null);
        setField(term423877, term423877.getClass(), "itsVariableNames", null);
        setIntField(term423877, term423877.getClass(), "varStart", 0);
        setField(term423877, term423877.getClass(), "compilerData", null);
        setIntField(term423877, term423877.getClass(), "type", 9);
        setField(term423877, term423877.getClass(), "next", null);
        setField(term423878, term423878.getClass(), "functionName", null);
        setBooleanField(term423878, term423878.getClass(), "itsNeedsActivation", false);
        setIntField(term423878, term423878.getClass(), "itsFunctionType", 0);
        setBooleanField(term423878, term423878.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423878, term423878.getClass(), "encodedSourceStart", 0);
        setIntField(term423878, term423878.getClass(), "encodedSourceEnd", 0);
        setField(term423878, term423878.getClass(), "sourceName", null);
        setIntField(term423878, term423878.getClass(), "baseLineno", 0);
        setIntField(term423878, term423878.getClass(), "endLineno", 0);
        setField(term423878, term423878.getClass(), "functions", null);
        setField(term423878, term423878.getClass(), "regexps", null);
        setField(term423878, term423878.getClass(), "itsVariables", null);
        setField(term423878, term423878.getClass(), "itsConst", null);
        setField(term423878, term423878.getClass(), "itsVariableNames", null);
        setIntField(term423878, term423878.getClass(), "varStart", 0);
        setField(term423878, term423878.getClass(), "compilerData", null);
        setIntField(term423878, term423878.getClass(), "type", 0);
        setIntField(term423879, term423879.getClass(), "type", 0);
        setField(term423879, term423879.getClass(), "next", null);
        setField(term423879, term423879.getClass(), "first", null);
        setField(term423879, term423879.getClass(), "last", null);
        setField(term423879, term423879.getClass(), "propListHead", null);
        setIntField(term423879, term423879.getClass(), "sourcePosition", 0);
        setField(term423879, term423879.getClass(), "jsType", null);
        setField(term423879, term423879.getClass(), "parent", null);
        setField(term423878, term423878.getClass(), "next", term423879);
        setField(term423878, term423878.getClass(), "first", null);
        setField(term423878, term423878.getClass(), "last", null);
        setField(term423878, term423878.getClass(), "propListHead", null);
        setIntField(term423878, term423878.getClass(), "sourcePosition", 0);
        setField(term423878, term423878.getClass(), "jsType", null);
        setField(term423878, term423878.getClass(), "parent", null);
        setField(term423877, term423877.getClass(), "first", term423878);
        setField(term423877, term423877.getClass(), "last", null);
        setField(term423877, term423877.getClass(), "propListHead", null);
        setIntField(term423877, term423877.getClass(), "sourcePosition", 0);
        setField(term423877, term423877.getClass(), "jsType", null);
        setField(term423877, term423877.getClass(), "parent", null);
        term423811 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423821 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term423811, term423811.getClass(), "functionName", null);
        setBooleanField(term423811, term423811.getClass(), "itsNeedsActivation", false);
        setIntField(term423811, term423811.getClass(), "itsFunctionType", 0);
        setBooleanField(term423811, term423811.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423811, term423811.getClass(), "encodedSourceStart", 0);
        setIntField(term423811, term423811.getClass(), "encodedSourceEnd", 0);
        setField(term423811, term423811.getClass(), "sourceName", null);
        setIntField(term423811, term423811.getClass(), "baseLineno", 0);
        setIntField(term423811, term423811.getClass(), "endLineno", 0);
        setField(term423811, term423811.getClass(), "functions", null);
        setField(term423811, term423811.getClass(), "regexps", null);
        setField(term423811, term423811.getClass(), "itsVariables", null);
        setField(term423811, term423811.getClass(), "itsConst", null);
        setField(term423811, term423811.getClass(), "itsVariableNames", null);
        setIntField(term423811, term423811.getClass(), "varStart", 0);
        setField(term423811, term423811.getClass(), "compilerData", null);
        setIntField(term423811, term423811.getClass(), "type", 9);
        setField(term423811, term423811.getClass(), "next", null);
        setField(term423821, term423821.getClass(), "functionName", null);
        setBooleanField(term423821, term423821.getClass(), "itsNeedsActivation", false);
        setIntField(term423821, term423821.getClass(), "itsFunctionType", 0);
        setBooleanField(term423821, term423821.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423821, term423821.getClass(), "encodedSourceStart", 0);
        setIntField(term423821, term423821.getClass(), "encodedSourceEnd", 0);
        setField(term423821, term423821.getClass(), "sourceName", null);
        setIntField(term423821, term423821.getClass(), "baseLineno", 0);
        setIntField(term423821, term423821.getClass(), "endLineno", 0);
        setField(term423821, term423821.getClass(), "functions", null);
        setField(term423821, term423821.getClass(), "regexps", null);
        setField(term423821, term423821.getClass(), "itsVariables", null);
        setField(term423821, term423821.getClass(), "itsConst", null);
        setField(term423821, term423821.getClass(), "itsVariableNames", null);
        setIntField(term423821, term423821.getClass(), "varStart", 0);
        setField(term423821, term423821.getClass(), "compilerData", null);
        setIntField(term423821, term423821.getClass(), "type", 0);
        setIntField(term423831, term423831.getClass(), "type", 0);
        setField(term423831, term423831.getClass(), "next", null);
        setField(term423831, term423831.getClass(), "first", null);
        setField(term423831, term423831.getClass(), "last", null);
        setField(term423831, term423831.getClass(), "propListHead", null);
        setIntField(term423831, term423831.getClass(), "sourcePosition", 0);
        setField(term423831, term423831.getClass(), "jsType", null);
        setField(term423831, term423831.getClass(), "parent", null);
        setField(term423821, term423821.getClass(), "next", term423831);
        setField(term423821, term423821.getClass(), "first", null);
        setField(term423821, term423821.getClass(), "last", null);
        setField(term423821, term423821.getClass(), "propListHead", null);
        setIntField(term423821, term423821.getClass(), "sourcePosition", 0);
        setField(term423821, term423821.getClass(), "jsType", null);
        setField(term423821, term423821.getClass(), "parent", null);
        setField(term423811, term423811.getClass(), "first", term423821);
        setField(term423811, term423811.getClass(), "last", null);
        setField(term423811, term423811.getClass(), "propListHead", null);
        setIntField(term423811, term423811.getClass(), "sourcePosition", 0);
        setField(term423811, term423811.getClass(), "jsType", null);
        setField(term423811, term423811.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term423640;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term423554, args);
        assertTrue(recursiveEquals(term423554, term423876));
        assertTrue(recursiveEquals(term423640, term423877));
        assertTrue(recursiveEquals(retValue, term423811));
    }

};


