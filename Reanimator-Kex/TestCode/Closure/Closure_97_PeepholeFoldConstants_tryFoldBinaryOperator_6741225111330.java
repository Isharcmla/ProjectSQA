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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439324;
     Object term439410;
     Object term439644;
     Object term439645;
     Object term439581;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term439324 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term439410 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term439496 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term439566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term439496, term439496.getClass(), "next", term439566);
        setField(term439410, term439410.getClass(), "first", term439496);
        setIntField(term439410, term439410.getClass(), "type", 35);
        term439644 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term439644, term439644.getClass(), "currentTraversal", null);
        term439645 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term439646 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term439647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term439645, term439645.getClass(), "functionName", null);
        setBooleanField(term439645, term439645.getClass(), "itsNeedsActivation", false);
        setIntField(term439645, term439645.getClass(), "itsFunctionType", 0);
        setBooleanField(term439645, term439645.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term439645, term439645.getClass(), "encodedSourceStart", 0);
        setIntField(term439645, term439645.getClass(), "encodedSourceEnd", 0);
        setField(term439645, term439645.getClass(), "sourceName", null);
        setIntField(term439645, term439645.getClass(), "baseLineno", 0);
        setIntField(term439645, term439645.getClass(), "endLineno", 0);
        setField(term439645, term439645.getClass(), "functions", null);
        setField(term439645, term439645.getClass(), "regexps", null);
        setField(term439645, term439645.getClass(), "itsVariables", null);
        setField(term439645, term439645.getClass(), "itsConst", null);
        setField(term439645, term439645.getClass(), "itsVariableNames", null);
        setIntField(term439645, term439645.getClass(), "varStart", 0);
        setField(term439645, term439645.getClass(), "compilerData", null);
        setIntField(term439645, term439645.getClass(), "type", 35);
        setField(term439645, term439645.getClass(), "next", null);
        setField(term439646, term439646.getClass(), "functionName", null);
        setBooleanField(term439646, term439646.getClass(), "itsNeedsActivation", false);
        setIntField(term439646, term439646.getClass(), "itsFunctionType", 0);
        setBooleanField(term439646, term439646.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term439646, term439646.getClass(), "encodedSourceStart", 0);
        setIntField(term439646, term439646.getClass(), "encodedSourceEnd", 0);
        setField(term439646, term439646.getClass(), "sourceName", null);
        setIntField(term439646, term439646.getClass(), "baseLineno", 0);
        setIntField(term439646, term439646.getClass(), "endLineno", 0);
        setField(term439646, term439646.getClass(), "functions", null);
        setField(term439646, term439646.getClass(), "regexps", null);
        setField(term439646, term439646.getClass(), "itsVariables", null);
        setField(term439646, term439646.getClass(), "itsConst", null);
        setField(term439646, term439646.getClass(), "itsVariableNames", null);
        setIntField(term439646, term439646.getClass(), "varStart", 0);
        setField(term439646, term439646.getClass(), "compilerData", null);
        setIntField(term439646, term439646.getClass(), "type", 0);
        setIntField(term439647, term439647.getClass(), "type", 0);
        setField(term439647, term439647.getClass(), "next", null);
        setField(term439647, term439647.getClass(), "first", null);
        setField(term439647, term439647.getClass(), "last", null);
        setField(term439647, term439647.getClass(), "propListHead", null);
        setIntField(term439647, term439647.getClass(), "sourcePosition", 0);
        setField(term439647, term439647.getClass(), "jsType", null);
        setField(term439647, term439647.getClass(), "parent", null);
        setField(term439646, term439646.getClass(), "next", term439647);
        setField(term439646, term439646.getClass(), "first", null);
        setField(term439646, term439646.getClass(), "last", null);
        setField(term439646, term439646.getClass(), "propListHead", null);
        setIntField(term439646, term439646.getClass(), "sourcePosition", 0);
        setField(term439646, term439646.getClass(), "jsType", null);
        setField(term439646, term439646.getClass(), "parent", null);
        setField(term439645, term439645.getClass(), "first", term439646);
        setField(term439645, term439645.getClass(), "last", null);
        setField(term439645, term439645.getClass(), "propListHead", null);
        setIntField(term439645, term439645.getClass(), "sourcePosition", 0);
        setField(term439645, term439645.getClass(), "jsType", null);
        setField(term439645, term439645.getClass(), "parent", null);
        term439581 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term439591 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term439601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term439581, term439581.getClass(), "functionName", null);
        setBooleanField(term439581, term439581.getClass(), "itsNeedsActivation", false);
        setIntField(term439581, term439581.getClass(), "itsFunctionType", 0);
        setBooleanField(term439581, term439581.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term439581, term439581.getClass(), "encodedSourceStart", 0);
        setIntField(term439581, term439581.getClass(), "encodedSourceEnd", 0);
        setField(term439581, term439581.getClass(), "sourceName", null);
        setIntField(term439581, term439581.getClass(), "baseLineno", 0);
        setIntField(term439581, term439581.getClass(), "endLineno", 0);
        setField(term439581, term439581.getClass(), "functions", null);
        setField(term439581, term439581.getClass(), "regexps", null);
        setField(term439581, term439581.getClass(), "itsVariables", null);
        setField(term439581, term439581.getClass(), "itsConst", null);
        setField(term439581, term439581.getClass(), "itsVariableNames", null);
        setIntField(term439581, term439581.getClass(), "varStart", 0);
        setField(term439581, term439581.getClass(), "compilerData", null);
        setIntField(term439581, term439581.getClass(), "type", 35);
        setField(term439581, term439581.getClass(), "next", null);
        setField(term439591, term439591.getClass(), "functionName", null);
        setBooleanField(term439591, term439591.getClass(), "itsNeedsActivation", false);
        setIntField(term439591, term439591.getClass(), "itsFunctionType", 0);
        setBooleanField(term439591, term439591.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term439591, term439591.getClass(), "encodedSourceStart", 0);
        setIntField(term439591, term439591.getClass(), "encodedSourceEnd", 0);
        setField(term439591, term439591.getClass(), "sourceName", null);
        setIntField(term439591, term439591.getClass(), "baseLineno", 0);
        setIntField(term439591, term439591.getClass(), "endLineno", 0);
        setField(term439591, term439591.getClass(), "functions", null);
        setField(term439591, term439591.getClass(), "regexps", null);
        setField(term439591, term439591.getClass(), "itsVariables", null);
        setField(term439591, term439591.getClass(), "itsConst", null);
        setField(term439591, term439591.getClass(), "itsVariableNames", null);
        setIntField(term439591, term439591.getClass(), "varStart", 0);
        setField(term439591, term439591.getClass(), "compilerData", null);
        setIntField(term439591, term439591.getClass(), "type", 0);
        setIntField(term439601, term439601.getClass(), "type", 0);
        setField(term439601, term439601.getClass(), "next", null);
        setField(term439601, term439601.getClass(), "first", null);
        setField(term439601, term439601.getClass(), "last", null);
        setField(term439601, term439601.getClass(), "propListHead", null);
        setIntField(term439601, term439601.getClass(), "sourcePosition", 0);
        setField(term439601, term439601.getClass(), "jsType", null);
        setField(term439601, term439601.getClass(), "parent", null);
        setField(term439591, term439591.getClass(), "next", term439601);
        setField(term439591, term439591.getClass(), "first", null);
        setField(term439591, term439591.getClass(), "last", null);
        setField(term439591, term439591.getClass(), "propListHead", null);
        setIntField(term439591, term439591.getClass(), "sourcePosition", 0);
        setField(term439591, term439591.getClass(), "jsType", null);
        setField(term439591, term439591.getClass(), "parent", null);
        setField(term439581, term439581.getClass(), "first", term439591);
        setField(term439581, term439581.getClass(), "last", null);
        setField(term439581, term439581.getClass(), "propListHead", null);
        setIntField(term439581, term439581.getClass(), "sourcePosition", 0);
        setField(term439581, term439581.getClass(), "jsType", null);
        setField(term439581, term439581.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term439410;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term439324, args);
        assertTrue(recursiveEquals(term439324, term439644));
        assertTrue(recursiveEquals(term439410, term439645));
        assertTrue(recursiveEquals(retValue, term439581));
    }

};


