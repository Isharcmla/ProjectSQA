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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532168;
     Object term532260;
     Object term533073;
     Object term533074;
     Object term533024;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term532168 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term532260 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term532346 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term532416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term532346, term532346.getClass(), "next", term532416);
        setField(term532260, term532260.getClass(), "first", term532346);
        setIntField(term532260, term532260.getClass(), "type", 9);
        term533073 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term533073, term533073.getClass(), "currentTraversal", null);
        term533074 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term533075 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term533076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term533074, term533074.getClass(), "str", null);
        setIntField(term533074, term533074.getClass(), "type", 9);
        setField(term533074, term533074.getClass(), "next", null);
        setField(term533075, term533075.getClass(), "functionName", null);
        setBooleanField(term533075, term533075.getClass(), "itsNeedsActivation", false);
        setIntField(term533075, term533075.getClass(), "itsFunctionType", 0);
        setBooleanField(term533075, term533075.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term533075, term533075.getClass(), "encodedSourceStart", 0);
        setIntField(term533075, term533075.getClass(), "encodedSourceEnd", 0);
        setField(term533075, term533075.getClass(), "sourceName", null);
        setIntField(term533075, term533075.getClass(), "baseLineno", 0);
        setIntField(term533075, term533075.getClass(), "endLineno", 0);
        setField(term533075, term533075.getClass(), "functions", null);
        setField(term533075, term533075.getClass(), "regexps", null);
        setField(term533075, term533075.getClass(), "itsVariables", null);
        setField(term533075, term533075.getClass(), "itsConst", null);
        setField(term533075, term533075.getClass(), "itsVariableNames", null);
        setIntField(term533075, term533075.getClass(), "varStart", 0);
        setField(term533075, term533075.getClass(), "compilerData", null);
        setIntField(term533075, term533075.getClass(), "type", 0);
        setIntField(term533076, term533076.getClass(), "type", 0);
        setField(term533076, term533076.getClass(), "next", null);
        setField(term533076, term533076.getClass(), "first", null);
        setField(term533076, term533076.getClass(), "last", null);
        setField(term533076, term533076.getClass(), "propListHead", null);
        setIntField(term533076, term533076.getClass(), "sourcePosition", 0);
        setField(term533076, term533076.getClass(), "jsType", null);
        setField(term533076, term533076.getClass(), "parent", null);
        setField(term533075, term533075.getClass(), "next", term533076);
        setField(term533075, term533075.getClass(), "first", null);
        setField(term533075, term533075.getClass(), "last", null);
        setField(term533075, term533075.getClass(), "propListHead", null);
        setIntField(term533075, term533075.getClass(), "sourcePosition", 0);
        setField(term533075, term533075.getClass(), "jsType", null);
        setField(term533075, term533075.getClass(), "parent", null);
        setField(term533074, term533074.getClass(), "first", term533075);
        setField(term533074, term533074.getClass(), "last", null);
        setField(term533074, term533074.getClass(), "propListHead", null);
        setIntField(term533074, term533074.getClass(), "sourcePosition", 0);
        setField(term533074, term533074.getClass(), "jsType", null);
        setField(term533074, term533074.getClass(), "parent", null);
        term533024 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term533026 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term533036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term533024, term533024.getClass(), "str", null);
        setIntField(term533024, term533024.getClass(), "type", 9);
        setField(term533024, term533024.getClass(), "next", null);
        setField(term533026, term533026.getClass(), "functionName", null);
        setBooleanField(term533026, term533026.getClass(), "itsNeedsActivation", false);
        setIntField(term533026, term533026.getClass(), "itsFunctionType", 0);
        setBooleanField(term533026, term533026.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term533026, term533026.getClass(), "encodedSourceStart", 0);
        setIntField(term533026, term533026.getClass(), "encodedSourceEnd", 0);
        setField(term533026, term533026.getClass(), "sourceName", null);
        setIntField(term533026, term533026.getClass(), "baseLineno", 0);
        setIntField(term533026, term533026.getClass(), "endLineno", 0);
        setField(term533026, term533026.getClass(), "functions", null);
        setField(term533026, term533026.getClass(), "regexps", null);
        setField(term533026, term533026.getClass(), "itsVariables", null);
        setField(term533026, term533026.getClass(), "itsConst", null);
        setField(term533026, term533026.getClass(), "itsVariableNames", null);
        setIntField(term533026, term533026.getClass(), "varStart", 0);
        setField(term533026, term533026.getClass(), "compilerData", null);
        setIntField(term533026, term533026.getClass(), "type", 0);
        setIntField(term533036, term533036.getClass(), "type", 0);
        setField(term533036, term533036.getClass(), "next", null);
        setField(term533036, term533036.getClass(), "first", null);
        setField(term533036, term533036.getClass(), "last", null);
        setField(term533036, term533036.getClass(), "propListHead", null);
        setIntField(term533036, term533036.getClass(), "sourcePosition", 0);
        setField(term533036, term533036.getClass(), "jsType", null);
        setField(term533036, term533036.getClass(), "parent", null);
        setField(term533026, term533026.getClass(), "next", term533036);
        setField(term533026, term533026.getClass(), "first", null);
        setField(term533026, term533026.getClass(), "last", null);
        setField(term533026, term533026.getClass(), "propListHead", null);
        setIntField(term533026, term533026.getClass(), "sourcePosition", 0);
        setField(term533026, term533026.getClass(), "jsType", null);
        setField(term533026, term533026.getClass(), "parent", null);
        setField(term533024, term533024.getClass(), "first", term533026);
        setField(term533024, term533024.getClass(), "last", null);
        setField(term533024, term533024.getClass(), "propListHead", null);
        setIntField(term533024, term533024.getClass(), "sourcePosition", 0);
        setField(term533024, term533024.getClass(), "jsType", null);
        setField(term533024, term533024.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term532260;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term532168, args);
        assertTrue(recursiveEquals(term532168, term533073));
        assertTrue(recursiveEquals(term532260, term533074));
        assertTrue(recursiveEquals(retValue, term533024));
    }

};


