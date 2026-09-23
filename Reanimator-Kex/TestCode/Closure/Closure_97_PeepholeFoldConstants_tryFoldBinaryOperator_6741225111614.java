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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625234;
     Object term625320;
     Object term651477;
     Object term651478;
     Object term651412;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term625234 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term625320 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term625406 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term625498 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term625406, term625406.getClass(), "next", term625498);
        setIntField(term625406, term625406.getClass(), "type", 63);
        setField(term625320, term625320.getClass(), "first", term625406);
        setIntField(term625320, term625320.getClass(), "type", 35);
        term651477 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term651477, term651477.getClass(), "currentTraversal", null);
        term651478 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term651479 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term651480 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term651478, term651478.getClass(), "functionName", null);
        setBooleanField(term651478, term651478.getClass(), "itsNeedsActivation", false);
        setIntField(term651478, term651478.getClass(), "itsFunctionType", 0);
        setBooleanField(term651478, term651478.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651478, term651478.getClass(), "encodedSourceStart", 0);
        setIntField(term651478, term651478.getClass(), "encodedSourceEnd", 0);
        setField(term651478, term651478.getClass(), "sourceName", null);
        setIntField(term651478, term651478.getClass(), "baseLineno", 0);
        setIntField(term651478, term651478.getClass(), "endLineno", 0);
        setField(term651478, term651478.getClass(), "functions", null);
        setField(term651478, term651478.getClass(), "regexps", null);
        setField(term651478, term651478.getClass(), "itsVariables", null);
        setField(term651478, term651478.getClass(), "itsConst", null);
        setField(term651478, term651478.getClass(), "itsVariableNames", null);
        setIntField(term651478, term651478.getClass(), "varStart", 0);
        setField(term651478, term651478.getClass(), "compilerData", null);
        setIntField(term651478, term651478.getClass(), "type", 35);
        setField(term651478, term651478.getClass(), "next", null);
        setField(term651479, term651479.getClass(), "functionName", null);
        setBooleanField(term651479, term651479.getClass(), "itsNeedsActivation", false);
        setIntField(term651479, term651479.getClass(), "itsFunctionType", 0);
        setBooleanField(term651479, term651479.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651479, term651479.getClass(), "encodedSourceStart", 0);
        setIntField(term651479, term651479.getClass(), "encodedSourceEnd", 0);
        setField(term651479, term651479.getClass(), "sourceName", null);
        setIntField(term651479, term651479.getClass(), "baseLineno", 0);
        setIntField(term651479, term651479.getClass(), "endLineno", 0);
        setField(term651479, term651479.getClass(), "functions", null);
        setField(term651479, term651479.getClass(), "regexps", null);
        setField(term651479, term651479.getClass(), "itsVariables", null);
        setField(term651479, term651479.getClass(), "itsConst", null);
        setField(term651479, term651479.getClass(), "itsVariableNames", null);
        setIntField(term651479, term651479.getClass(), "varStart", 0);
        setField(term651479, term651479.getClass(), "compilerData", null);
        setIntField(term651479, term651479.getClass(), "type", 63);
        setField(term651480, term651480.getClass(), "str", null);
        setIntField(term651480, term651480.getClass(), "type", 0);
        setField(term651480, term651480.getClass(), "next", null);
        setField(term651480, term651480.getClass(), "first", null);
        setField(term651480, term651480.getClass(), "last", null);
        setField(term651480, term651480.getClass(), "propListHead", null);
        setIntField(term651480, term651480.getClass(), "sourcePosition", 0);
        setField(term651480, term651480.getClass(), "jsType", null);
        setField(term651480, term651480.getClass(), "parent", null);
        setField(term651479, term651479.getClass(), "next", term651480);
        setField(term651479, term651479.getClass(), "first", null);
        setField(term651479, term651479.getClass(), "last", null);
        setField(term651479, term651479.getClass(), "propListHead", null);
        setIntField(term651479, term651479.getClass(), "sourcePosition", 0);
        setField(term651479, term651479.getClass(), "jsType", null);
        setField(term651479, term651479.getClass(), "parent", null);
        setField(term651478, term651478.getClass(), "first", term651479);
        setField(term651478, term651478.getClass(), "last", null);
        setField(term651478, term651478.getClass(), "propListHead", null);
        setIntField(term651478, term651478.getClass(), "sourcePosition", 0);
        setField(term651478, term651478.getClass(), "jsType", null);
        setField(term651478, term651478.getClass(), "parent", null);
        term651412 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term651422 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term651432 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term651412, term651412.getClass(), "functionName", null);
        setBooleanField(term651412, term651412.getClass(), "itsNeedsActivation", false);
        setIntField(term651412, term651412.getClass(), "itsFunctionType", 0);
        setBooleanField(term651412, term651412.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651412, term651412.getClass(), "encodedSourceStart", 0);
        setIntField(term651412, term651412.getClass(), "encodedSourceEnd", 0);
        setField(term651412, term651412.getClass(), "sourceName", null);
        setIntField(term651412, term651412.getClass(), "baseLineno", 0);
        setIntField(term651412, term651412.getClass(), "endLineno", 0);
        setField(term651412, term651412.getClass(), "functions", null);
        setField(term651412, term651412.getClass(), "regexps", null);
        setField(term651412, term651412.getClass(), "itsVariables", null);
        setField(term651412, term651412.getClass(), "itsConst", null);
        setField(term651412, term651412.getClass(), "itsVariableNames", null);
        setIntField(term651412, term651412.getClass(), "varStart", 0);
        setField(term651412, term651412.getClass(), "compilerData", null);
        setIntField(term651412, term651412.getClass(), "type", 35);
        setField(term651412, term651412.getClass(), "next", null);
        setField(term651422, term651422.getClass(), "functionName", null);
        setBooleanField(term651422, term651422.getClass(), "itsNeedsActivation", false);
        setIntField(term651422, term651422.getClass(), "itsFunctionType", 0);
        setBooleanField(term651422, term651422.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651422, term651422.getClass(), "encodedSourceStart", 0);
        setIntField(term651422, term651422.getClass(), "encodedSourceEnd", 0);
        setField(term651422, term651422.getClass(), "sourceName", null);
        setIntField(term651422, term651422.getClass(), "baseLineno", 0);
        setIntField(term651422, term651422.getClass(), "endLineno", 0);
        setField(term651422, term651422.getClass(), "functions", null);
        setField(term651422, term651422.getClass(), "regexps", null);
        setField(term651422, term651422.getClass(), "itsVariables", null);
        setField(term651422, term651422.getClass(), "itsConst", null);
        setField(term651422, term651422.getClass(), "itsVariableNames", null);
        setIntField(term651422, term651422.getClass(), "varStart", 0);
        setField(term651422, term651422.getClass(), "compilerData", null);
        setIntField(term651422, term651422.getClass(), "type", 63);
        setField(term651432, term651432.getClass(), "str", null);
        setIntField(term651432, term651432.getClass(), "type", 0);
        setField(term651432, term651432.getClass(), "next", null);
        setField(term651432, term651432.getClass(), "first", null);
        setField(term651432, term651432.getClass(), "last", null);
        setField(term651432, term651432.getClass(), "propListHead", null);
        setIntField(term651432, term651432.getClass(), "sourcePosition", 0);
        setField(term651432, term651432.getClass(), "jsType", null);
        setField(term651432, term651432.getClass(), "parent", null);
        setField(term651422, term651422.getClass(), "next", term651432);
        setField(term651422, term651422.getClass(), "first", null);
        setField(term651422, term651422.getClass(), "last", null);
        setField(term651422, term651422.getClass(), "propListHead", null);
        setIntField(term651422, term651422.getClass(), "sourcePosition", 0);
        setField(term651422, term651422.getClass(), "jsType", null);
        setField(term651422, term651422.getClass(), "parent", null);
        setField(term651412, term651412.getClass(), "first", term651422);
        setField(term651412, term651412.getClass(), "last", null);
        setField(term651412, term651412.getClass(), "propListHead", null);
        setIntField(term651412, term651412.getClass(), "sourcePosition", 0);
        setField(term651412, term651412.getClass(), "jsType", null);
        setField(term651412, term651412.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term625320;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term625234, args);
        assertTrue(recursiveEquals(term625234, term651477));
        assertTrue(recursiveEquals(term625320, term651478));
        assertTrue(recursiveEquals(retValue, term651412));
    }

};


