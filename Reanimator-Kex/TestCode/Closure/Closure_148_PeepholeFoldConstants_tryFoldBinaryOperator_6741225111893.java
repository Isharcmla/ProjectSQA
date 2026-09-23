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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term500306;
     Object term500398;
     Object term501072;
     Object term501073;
     Object term501020;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term500306 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term500398 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term500484 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term500554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term500484, term500484.getClass(), "next", term500554);
        setField(term500398, term500398.getClass(), "first", term500484);
        setIntField(term500398, term500398.getClass(), "type", 13);
        term501072 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term501072, term501072.getClass(), "currentTraversal", null);
        term501073 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term501074 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term501075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term501073, term501073.getClass(), "number", 0.0);
        setIntField(term501073, term501073.getClass(), "type", 13);
        setField(term501073, term501073.getClass(), "next", null);
        setField(term501074, term501074.getClass(), "functionName", null);
        setBooleanField(term501074, term501074.getClass(), "itsNeedsActivation", false);
        setIntField(term501074, term501074.getClass(), "itsFunctionType", 0);
        setBooleanField(term501074, term501074.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term501074, term501074.getClass(), "encodedSourceStart", 0);
        setIntField(term501074, term501074.getClass(), "encodedSourceEnd", 0);
        setField(term501074, term501074.getClass(), "sourceName", null);
        setIntField(term501074, term501074.getClass(), "baseLineno", 0);
        setIntField(term501074, term501074.getClass(), "endLineno", 0);
        setField(term501074, term501074.getClass(), "functions", null);
        setField(term501074, term501074.getClass(), "regexps", null);
        setField(term501074, term501074.getClass(), "itsVariables", null);
        setField(term501074, term501074.getClass(), "itsConst", null);
        setField(term501074, term501074.getClass(), "itsVariableNames", null);
        setIntField(term501074, term501074.getClass(), "varStart", 0);
        setField(term501074, term501074.getClass(), "compilerData", null);
        setIntField(term501074, term501074.getClass(), "type", 0);
        setIntField(term501075, term501075.getClass(), "type", 0);
        setField(term501075, term501075.getClass(), "next", null);
        setField(term501075, term501075.getClass(), "first", null);
        setField(term501075, term501075.getClass(), "last", null);
        setField(term501075, term501075.getClass(), "propListHead", null);
        setIntField(term501075, term501075.getClass(), "sourcePosition", 0);
        setField(term501075, term501075.getClass(), "jsType", null);
        setField(term501075, term501075.getClass(), "parent", null);
        setField(term501074, term501074.getClass(), "next", term501075);
        setField(term501074, term501074.getClass(), "first", null);
        setField(term501074, term501074.getClass(), "last", null);
        setField(term501074, term501074.getClass(), "propListHead", null);
        setIntField(term501074, term501074.getClass(), "sourcePosition", 0);
        setField(term501074, term501074.getClass(), "jsType", null);
        setField(term501074, term501074.getClass(), "parent", null);
        setField(term501073, term501073.getClass(), "first", term501074);
        setField(term501073, term501073.getClass(), "last", null);
        setField(term501073, term501073.getClass(), "propListHead", null);
        setIntField(term501073, term501073.getClass(), "sourcePosition", 0);
        setField(term501073, term501073.getClass(), "jsType", null);
        setField(term501073, term501073.getClass(), "parent", null);
        term501020 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term501023 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term501033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term501020, term501020.getClass(), "number", 0.0);
        setIntField(term501020, term501020.getClass(), "type", 13);
        setField(term501020, term501020.getClass(), "next", null);
        setField(term501023, term501023.getClass(), "functionName", null);
        setBooleanField(term501023, term501023.getClass(), "itsNeedsActivation", false);
        setIntField(term501023, term501023.getClass(), "itsFunctionType", 0);
        setBooleanField(term501023, term501023.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term501023, term501023.getClass(), "encodedSourceStart", 0);
        setIntField(term501023, term501023.getClass(), "encodedSourceEnd", 0);
        setField(term501023, term501023.getClass(), "sourceName", null);
        setIntField(term501023, term501023.getClass(), "baseLineno", 0);
        setIntField(term501023, term501023.getClass(), "endLineno", 0);
        setField(term501023, term501023.getClass(), "functions", null);
        setField(term501023, term501023.getClass(), "regexps", null);
        setField(term501023, term501023.getClass(), "itsVariables", null);
        setField(term501023, term501023.getClass(), "itsConst", null);
        setField(term501023, term501023.getClass(), "itsVariableNames", null);
        setIntField(term501023, term501023.getClass(), "varStart", 0);
        setField(term501023, term501023.getClass(), "compilerData", null);
        setIntField(term501023, term501023.getClass(), "type", 0);
        setIntField(term501033, term501033.getClass(), "type", 0);
        setField(term501033, term501033.getClass(), "next", null);
        setField(term501033, term501033.getClass(), "first", null);
        setField(term501033, term501033.getClass(), "last", null);
        setField(term501033, term501033.getClass(), "propListHead", null);
        setIntField(term501033, term501033.getClass(), "sourcePosition", 0);
        setField(term501033, term501033.getClass(), "jsType", null);
        setField(term501033, term501033.getClass(), "parent", null);
        setField(term501023, term501023.getClass(), "next", term501033);
        setField(term501023, term501023.getClass(), "first", null);
        setField(term501023, term501023.getClass(), "last", null);
        setField(term501023, term501023.getClass(), "propListHead", null);
        setIntField(term501023, term501023.getClass(), "sourcePosition", 0);
        setField(term501023, term501023.getClass(), "jsType", null);
        setField(term501023, term501023.getClass(), "parent", null);
        setField(term501020, term501020.getClass(), "first", term501023);
        setField(term501020, term501020.getClass(), "last", null);
        setField(term501020, term501020.getClass(), "propListHead", null);
        setIntField(term501020, term501020.getClass(), "sourcePosition", 0);
        setField(term501020, term501020.getClass(), "jsType", null);
        setField(term501020, term501020.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term500398;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term500306, args);
        assertTrue(recursiveEquals(term500306, term501072));
        assertTrue(recursiveEquals(term500398, term501073));
        assertTrue(recursiveEquals(retValue, term501020));
    }

};


