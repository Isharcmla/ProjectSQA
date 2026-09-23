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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239388;
     Object term239474;
     Object term239743;
     Object term239744;
     Object term239667;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239388 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term239474 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term239560 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term239652 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term239560, term239560.getClass(), "next", term239652);
        setIntField(term239560, term239560.getClass(), "type", 14);
        setField(term239474, term239474.getClass(), "first", term239560);
        setIntField(term239474, term239474.getClass(), "type", 14);
        term239743 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term239743, term239743.getClass(), "currentTraversal", null);
        term239744 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term239745 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term239746 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term239744, term239744.getClass(), "functionName", null);
        setBooleanField(term239744, term239744.getClass(), "itsNeedsActivation", false);
        setIntField(term239744, term239744.getClass(), "itsFunctionType", 0);
        setBooleanField(term239744, term239744.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term239744, term239744.getClass(), "encodedSourceStart", 0);
        setIntField(term239744, term239744.getClass(), "encodedSourceEnd", 0);
        setField(term239744, term239744.getClass(), "sourceName", null);
        setIntField(term239744, term239744.getClass(), "baseLineno", 0);
        setIntField(term239744, term239744.getClass(), "endLineno", 0);
        setField(term239744, term239744.getClass(), "functions", null);
        setField(term239744, term239744.getClass(), "regexps", null);
        setField(term239744, term239744.getClass(), "itsVariables", null);
        setField(term239744, term239744.getClass(), "itsConst", null);
        setField(term239744, term239744.getClass(), "itsVariableNames", null);
        setIntField(term239744, term239744.getClass(), "varStart", 0);
        setField(term239744, term239744.getClass(), "compilerData", null);
        setIntField(term239744, term239744.getClass(), "type", 14);
        setField(term239744, term239744.getClass(), "next", null);
        setField(term239745, term239745.getClass(), "functionName", null);
        setBooleanField(term239745, term239745.getClass(), "itsNeedsActivation", false);
        setIntField(term239745, term239745.getClass(), "itsFunctionType", 0);
        setBooleanField(term239745, term239745.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term239745, term239745.getClass(), "encodedSourceStart", 0);
        setIntField(term239745, term239745.getClass(), "encodedSourceEnd", 0);
        setField(term239745, term239745.getClass(), "sourceName", null);
        setIntField(term239745, term239745.getClass(), "baseLineno", 0);
        setIntField(term239745, term239745.getClass(), "endLineno", 0);
        setField(term239745, term239745.getClass(), "functions", null);
        setField(term239745, term239745.getClass(), "regexps", null);
        setField(term239745, term239745.getClass(), "itsVariables", null);
        setField(term239745, term239745.getClass(), "itsConst", null);
        setField(term239745, term239745.getClass(), "itsVariableNames", null);
        setIntField(term239745, term239745.getClass(), "varStart", 0);
        setField(term239745, term239745.getClass(), "compilerData", null);
        setIntField(term239745, term239745.getClass(), "type", 14);
        setField(term239746, term239746.getClass(), "str", null);
        setIntField(term239746, term239746.getClass(), "type", 0);
        setField(term239746, term239746.getClass(), "next", null);
        setField(term239746, term239746.getClass(), "first", null);
        setField(term239746, term239746.getClass(), "last", null);
        setField(term239746, term239746.getClass(), "propListHead", null);
        setIntField(term239746, term239746.getClass(), "sourcePosition", 0);
        setField(term239746, term239746.getClass(), "jsType", null);
        setField(term239746, term239746.getClass(), "parent", null);
        setField(term239745, term239745.getClass(), "next", term239746);
        setField(term239745, term239745.getClass(), "first", null);
        setField(term239745, term239745.getClass(), "last", null);
        setField(term239745, term239745.getClass(), "propListHead", null);
        setIntField(term239745, term239745.getClass(), "sourcePosition", 0);
        setField(term239745, term239745.getClass(), "jsType", null);
        setField(term239745, term239745.getClass(), "parent", null);
        setField(term239744, term239744.getClass(), "first", term239745);
        setField(term239744, term239744.getClass(), "last", null);
        setField(term239744, term239744.getClass(), "propListHead", null);
        setIntField(term239744, term239744.getClass(), "sourcePosition", 0);
        setField(term239744, term239744.getClass(), "jsType", null);
        setField(term239744, term239744.getClass(), "parent", null);
        term239667 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term239677 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term239687 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term239667, term239667.getClass(), "functionName", null);
        setBooleanField(term239667, term239667.getClass(), "itsNeedsActivation", false);
        setIntField(term239667, term239667.getClass(), "itsFunctionType", 0);
        setBooleanField(term239667, term239667.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term239667, term239667.getClass(), "encodedSourceStart", 0);
        setIntField(term239667, term239667.getClass(), "encodedSourceEnd", 0);
        setField(term239667, term239667.getClass(), "sourceName", null);
        setIntField(term239667, term239667.getClass(), "baseLineno", 0);
        setIntField(term239667, term239667.getClass(), "endLineno", 0);
        setField(term239667, term239667.getClass(), "functions", null);
        setField(term239667, term239667.getClass(), "regexps", null);
        setField(term239667, term239667.getClass(), "itsVariables", null);
        setField(term239667, term239667.getClass(), "itsConst", null);
        setField(term239667, term239667.getClass(), "itsVariableNames", null);
        setIntField(term239667, term239667.getClass(), "varStart", 0);
        setField(term239667, term239667.getClass(), "compilerData", null);
        setIntField(term239667, term239667.getClass(), "type", 14);
        setField(term239667, term239667.getClass(), "next", null);
        setField(term239677, term239677.getClass(), "functionName", null);
        setBooleanField(term239677, term239677.getClass(), "itsNeedsActivation", false);
        setIntField(term239677, term239677.getClass(), "itsFunctionType", 0);
        setBooleanField(term239677, term239677.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term239677, term239677.getClass(), "encodedSourceStart", 0);
        setIntField(term239677, term239677.getClass(), "encodedSourceEnd", 0);
        setField(term239677, term239677.getClass(), "sourceName", null);
        setIntField(term239677, term239677.getClass(), "baseLineno", 0);
        setIntField(term239677, term239677.getClass(), "endLineno", 0);
        setField(term239677, term239677.getClass(), "functions", null);
        setField(term239677, term239677.getClass(), "regexps", null);
        setField(term239677, term239677.getClass(), "itsVariables", null);
        setField(term239677, term239677.getClass(), "itsConst", null);
        setField(term239677, term239677.getClass(), "itsVariableNames", null);
        setIntField(term239677, term239677.getClass(), "varStart", 0);
        setField(term239677, term239677.getClass(), "compilerData", null);
        setIntField(term239677, term239677.getClass(), "type", 14);
        setField(term239687, term239687.getClass(), "str", null);
        setIntField(term239687, term239687.getClass(), "type", 0);
        setField(term239687, term239687.getClass(), "next", null);
        setField(term239687, term239687.getClass(), "first", null);
        setField(term239687, term239687.getClass(), "last", null);
        setField(term239687, term239687.getClass(), "propListHead", null);
        setIntField(term239687, term239687.getClass(), "sourcePosition", 0);
        setField(term239687, term239687.getClass(), "jsType", null);
        setField(term239687, term239687.getClass(), "parent", null);
        setField(term239677, term239677.getClass(), "next", term239687);
        setField(term239677, term239677.getClass(), "first", null);
        setField(term239677, term239677.getClass(), "last", null);
        setField(term239677, term239677.getClass(), "propListHead", null);
        setIntField(term239677, term239677.getClass(), "sourcePosition", 0);
        setField(term239677, term239677.getClass(), "jsType", null);
        setField(term239677, term239677.getClass(), "parent", null);
        setField(term239667, term239667.getClass(), "first", term239677);
        setField(term239667, term239667.getClass(), "last", null);
        setField(term239667, term239667.getClass(), "propListHead", null);
        setIntField(term239667, term239667.getClass(), "sourcePosition", 0);
        setField(term239667, term239667.getClass(), "jsType", null);
        setField(term239667, term239667.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term239474;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term239388, args);
        assertTrue(recursiveEquals(term239388, term239743));
        assertTrue(recursiveEquals(term239474, term239744));
        assertTrue(recursiveEquals(retValue, term239667));
    }

};


