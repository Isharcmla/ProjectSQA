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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term882939;
     Object term883031;
     Object term883840;
     Object term883841;
     Object term883771;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term882939 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term883031 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term883117 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term883203 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term883117, term883117.getClass(), "next", term883203);
        setIntField(term883117, term883117.getClass(), "type", 39);
        setField(term883031, term883031.getClass(), "first", term883117);
        setIntField(term883031, term883031.getClass(), "type", 18);
        term883840 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term883840, term883840.getClass(), "currentTraversal", null);
        term883841 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term883842 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term883843 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term883841, term883841.getClass(), "str", null);
        setIntField(term883841, term883841.getClass(), "type", 18);
        setField(term883841, term883841.getClass(), "next", null);
        setField(term883842, term883842.getClass(), "functionName", null);
        setBooleanField(term883842, term883842.getClass(), "itsNeedsActivation", false);
        setIntField(term883842, term883842.getClass(), "itsFunctionType", 0);
        setBooleanField(term883842, term883842.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term883842, term883842.getClass(), "encodedSourceStart", 0);
        setIntField(term883842, term883842.getClass(), "encodedSourceEnd", 0);
        setField(term883842, term883842.getClass(), "sourceName", null);
        setIntField(term883842, term883842.getClass(), "baseLineno", 0);
        setIntField(term883842, term883842.getClass(), "endLineno", 0);
        setField(term883842, term883842.getClass(), "functions", null);
        setField(term883842, term883842.getClass(), "regexps", null);
        setField(term883842, term883842.getClass(), "itsVariables", null);
        setField(term883842, term883842.getClass(), "itsConst", null);
        setField(term883842, term883842.getClass(), "itsVariableNames", null);
        setIntField(term883842, term883842.getClass(), "varStart", 0);
        setField(term883842, term883842.getClass(), "compilerData", null);
        setIntField(term883842, term883842.getClass(), "type", 39);
        setField(term883843, term883843.getClass(), "functionName", null);
        setBooleanField(term883843, term883843.getClass(), "itsNeedsActivation", false);
        setIntField(term883843, term883843.getClass(), "itsFunctionType", 0);
        setBooleanField(term883843, term883843.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term883843, term883843.getClass(), "encodedSourceStart", 0);
        setIntField(term883843, term883843.getClass(), "encodedSourceEnd", 0);
        setField(term883843, term883843.getClass(), "sourceName", null);
        setIntField(term883843, term883843.getClass(), "baseLineno", 0);
        setIntField(term883843, term883843.getClass(), "endLineno", 0);
        setField(term883843, term883843.getClass(), "functions", null);
        setField(term883843, term883843.getClass(), "regexps", null);
        setField(term883843, term883843.getClass(), "itsVariables", null);
        setField(term883843, term883843.getClass(), "itsConst", null);
        setField(term883843, term883843.getClass(), "itsVariableNames", null);
        setIntField(term883843, term883843.getClass(), "varStart", 0);
        setField(term883843, term883843.getClass(), "compilerData", null);
        setIntField(term883843, term883843.getClass(), "type", 0);
        setField(term883843, term883843.getClass(), "next", null);
        setField(term883843, term883843.getClass(), "first", null);
        setField(term883843, term883843.getClass(), "last", null);
        setField(term883843, term883843.getClass(), "propListHead", null);
        setIntField(term883843, term883843.getClass(), "sourcePosition", 0);
        setField(term883843, term883843.getClass(), "jsType", null);
        setField(term883843, term883843.getClass(), "parent", null);
        setField(term883842, term883842.getClass(), "next", term883843);
        setField(term883842, term883842.getClass(), "first", null);
        setField(term883842, term883842.getClass(), "last", null);
        setField(term883842, term883842.getClass(), "propListHead", null);
        setIntField(term883842, term883842.getClass(), "sourcePosition", 0);
        setField(term883842, term883842.getClass(), "jsType", null);
        setField(term883842, term883842.getClass(), "parent", null);
        setField(term883841, term883841.getClass(), "first", term883842);
        setField(term883841, term883841.getClass(), "last", null);
        setField(term883841, term883841.getClass(), "propListHead", null);
        setIntField(term883841, term883841.getClass(), "sourcePosition", 0);
        setField(term883841, term883841.getClass(), "jsType", null);
        setField(term883841, term883841.getClass(), "parent", null);
        term883771 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term883773 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term883783 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term883771, term883771.getClass(), "str", null);
        setIntField(term883771, term883771.getClass(), "type", 18);
        setField(term883771, term883771.getClass(), "next", null);
        setField(term883773, term883773.getClass(), "functionName", null);
        setBooleanField(term883773, term883773.getClass(), "itsNeedsActivation", false);
        setIntField(term883773, term883773.getClass(), "itsFunctionType", 0);
        setBooleanField(term883773, term883773.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term883773, term883773.getClass(), "encodedSourceStart", 0);
        setIntField(term883773, term883773.getClass(), "encodedSourceEnd", 0);
        setField(term883773, term883773.getClass(), "sourceName", null);
        setIntField(term883773, term883773.getClass(), "baseLineno", 0);
        setIntField(term883773, term883773.getClass(), "endLineno", 0);
        setField(term883773, term883773.getClass(), "functions", null);
        setField(term883773, term883773.getClass(), "regexps", null);
        setField(term883773, term883773.getClass(), "itsVariables", null);
        setField(term883773, term883773.getClass(), "itsConst", null);
        setField(term883773, term883773.getClass(), "itsVariableNames", null);
        setIntField(term883773, term883773.getClass(), "varStart", 0);
        setField(term883773, term883773.getClass(), "compilerData", null);
        setIntField(term883773, term883773.getClass(), "type", 39);
        setField(term883783, term883783.getClass(), "functionName", null);
        setBooleanField(term883783, term883783.getClass(), "itsNeedsActivation", false);
        setIntField(term883783, term883783.getClass(), "itsFunctionType", 0);
        setBooleanField(term883783, term883783.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term883783, term883783.getClass(), "encodedSourceStart", 0);
        setIntField(term883783, term883783.getClass(), "encodedSourceEnd", 0);
        setField(term883783, term883783.getClass(), "sourceName", null);
        setIntField(term883783, term883783.getClass(), "baseLineno", 0);
        setIntField(term883783, term883783.getClass(), "endLineno", 0);
        setField(term883783, term883783.getClass(), "functions", null);
        setField(term883783, term883783.getClass(), "regexps", null);
        setField(term883783, term883783.getClass(), "itsVariables", null);
        setField(term883783, term883783.getClass(), "itsConst", null);
        setField(term883783, term883783.getClass(), "itsVariableNames", null);
        setIntField(term883783, term883783.getClass(), "varStart", 0);
        setField(term883783, term883783.getClass(), "compilerData", null);
        setIntField(term883783, term883783.getClass(), "type", 0);
        setField(term883783, term883783.getClass(), "next", null);
        setField(term883783, term883783.getClass(), "first", null);
        setField(term883783, term883783.getClass(), "last", null);
        setField(term883783, term883783.getClass(), "propListHead", null);
        setIntField(term883783, term883783.getClass(), "sourcePosition", 0);
        setField(term883783, term883783.getClass(), "jsType", null);
        setField(term883783, term883783.getClass(), "parent", null);
        setField(term883773, term883773.getClass(), "next", term883783);
        setField(term883773, term883773.getClass(), "first", null);
        setField(term883773, term883773.getClass(), "last", null);
        setField(term883773, term883773.getClass(), "propListHead", null);
        setIntField(term883773, term883773.getClass(), "sourcePosition", 0);
        setField(term883773, term883773.getClass(), "jsType", null);
        setField(term883773, term883773.getClass(), "parent", null);
        setField(term883771, term883771.getClass(), "first", term883773);
        setField(term883771, term883771.getClass(), "last", null);
        setField(term883771, term883771.getClass(), "propListHead", null);
        setIntField(term883771, term883771.getClass(), "sourcePosition", 0);
        setField(term883771, term883771.getClass(), "jsType", null);
        setField(term883771, term883771.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term883031;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term882939, args);
        assertTrue(recursiveEquals(term882939, term883840));
        assertTrue(recursiveEquals(term883031, term883841));
        assertTrue(recursiveEquals(retValue, term883771));
    }

};


