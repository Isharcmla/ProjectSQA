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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92936;
     Object term93022;
     Object term93744;
     Object term93745;
     Object term93685;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92936 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term93022 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term93108 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term93178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93108, term93108.getClass(), "next", term93178);
        setField(term93022, term93022.getClass(), "first", term93108);
        setIntField(term93022, term93022.getClass(), "type", 24);
        term93744 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term93744, term93744.getClass(), "currentTraversal", null);
        term93745 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term93746 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term93747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93745, term93745.getClass(), "functionName", null);
        setBooleanField(term93745, term93745.getClass(), "itsNeedsActivation", false);
        setIntField(term93745, term93745.getClass(), "itsFunctionType", 0);
        setBooleanField(term93745, term93745.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term93745, term93745.getClass(), "encodedSourceStart", 0);
        setIntField(term93745, term93745.getClass(), "encodedSourceEnd", 0);
        setField(term93745, term93745.getClass(), "sourceName", null);
        setIntField(term93745, term93745.getClass(), "baseLineno", 0);
        setIntField(term93745, term93745.getClass(), "endLineno", 0);
        setField(term93745, term93745.getClass(), "functions", null);
        setField(term93745, term93745.getClass(), "regexps", null);
        setField(term93745, term93745.getClass(), "itsVariables", null);
        setField(term93745, term93745.getClass(), "itsConst", null);
        setField(term93745, term93745.getClass(), "itsVariableNames", null);
        setIntField(term93745, term93745.getClass(), "varStart", 0);
        setField(term93745, term93745.getClass(), "compilerData", null);
        setIntField(term93745, term93745.getClass(), "type", 24);
        setField(term93745, term93745.getClass(), "next", null);
        setField(term93746, term93746.getClass(), "functionName", null);
        setBooleanField(term93746, term93746.getClass(), "itsNeedsActivation", false);
        setIntField(term93746, term93746.getClass(), "itsFunctionType", 0);
        setBooleanField(term93746, term93746.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term93746, term93746.getClass(), "encodedSourceStart", 0);
        setIntField(term93746, term93746.getClass(), "encodedSourceEnd", 0);
        setField(term93746, term93746.getClass(), "sourceName", null);
        setIntField(term93746, term93746.getClass(), "baseLineno", 0);
        setIntField(term93746, term93746.getClass(), "endLineno", 0);
        setField(term93746, term93746.getClass(), "functions", null);
        setField(term93746, term93746.getClass(), "regexps", null);
        setField(term93746, term93746.getClass(), "itsVariables", null);
        setField(term93746, term93746.getClass(), "itsConst", null);
        setField(term93746, term93746.getClass(), "itsVariableNames", null);
        setIntField(term93746, term93746.getClass(), "varStart", 0);
        setField(term93746, term93746.getClass(), "compilerData", null);
        setIntField(term93746, term93746.getClass(), "type", 0);
        setIntField(term93747, term93747.getClass(), "type", 0);
        setField(term93747, term93747.getClass(), "next", null);
        setField(term93747, term93747.getClass(), "first", null);
        setField(term93747, term93747.getClass(), "last", null);
        setField(term93747, term93747.getClass(), "propListHead", null);
        setIntField(term93747, term93747.getClass(), "sourcePosition", 0);
        setField(term93747, term93747.getClass(), "jsType", null);
        setField(term93747, term93747.getClass(), "parent", null);
        setField(term93746, term93746.getClass(), "next", term93747);
        setField(term93746, term93746.getClass(), "first", null);
        setField(term93746, term93746.getClass(), "last", null);
        setField(term93746, term93746.getClass(), "propListHead", null);
        setIntField(term93746, term93746.getClass(), "sourcePosition", 0);
        setField(term93746, term93746.getClass(), "jsType", null);
        setField(term93746, term93746.getClass(), "parent", null);
        setField(term93745, term93745.getClass(), "first", term93746);
        setField(term93745, term93745.getClass(), "last", null);
        setField(term93745, term93745.getClass(), "propListHead", null);
        setIntField(term93745, term93745.getClass(), "sourcePosition", 0);
        setField(term93745, term93745.getClass(), "jsType", null);
        setField(term93745, term93745.getClass(), "parent", null);
        term93685 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term93695 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term93705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93685, term93685.getClass(), "functionName", null);
        setBooleanField(term93685, term93685.getClass(), "itsNeedsActivation", false);
        setIntField(term93685, term93685.getClass(), "itsFunctionType", 0);
        setBooleanField(term93685, term93685.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term93685, term93685.getClass(), "encodedSourceStart", 0);
        setIntField(term93685, term93685.getClass(), "encodedSourceEnd", 0);
        setField(term93685, term93685.getClass(), "sourceName", null);
        setIntField(term93685, term93685.getClass(), "baseLineno", 0);
        setIntField(term93685, term93685.getClass(), "endLineno", 0);
        setField(term93685, term93685.getClass(), "functions", null);
        setField(term93685, term93685.getClass(), "regexps", null);
        setField(term93685, term93685.getClass(), "itsVariables", null);
        setField(term93685, term93685.getClass(), "itsConst", null);
        setField(term93685, term93685.getClass(), "itsVariableNames", null);
        setIntField(term93685, term93685.getClass(), "varStart", 0);
        setField(term93685, term93685.getClass(), "compilerData", null);
        setIntField(term93685, term93685.getClass(), "type", 24);
        setField(term93685, term93685.getClass(), "next", null);
        setField(term93695, term93695.getClass(), "functionName", null);
        setBooleanField(term93695, term93695.getClass(), "itsNeedsActivation", false);
        setIntField(term93695, term93695.getClass(), "itsFunctionType", 0);
        setBooleanField(term93695, term93695.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term93695, term93695.getClass(), "encodedSourceStart", 0);
        setIntField(term93695, term93695.getClass(), "encodedSourceEnd", 0);
        setField(term93695, term93695.getClass(), "sourceName", null);
        setIntField(term93695, term93695.getClass(), "baseLineno", 0);
        setIntField(term93695, term93695.getClass(), "endLineno", 0);
        setField(term93695, term93695.getClass(), "functions", null);
        setField(term93695, term93695.getClass(), "regexps", null);
        setField(term93695, term93695.getClass(), "itsVariables", null);
        setField(term93695, term93695.getClass(), "itsConst", null);
        setField(term93695, term93695.getClass(), "itsVariableNames", null);
        setIntField(term93695, term93695.getClass(), "varStart", 0);
        setField(term93695, term93695.getClass(), "compilerData", null);
        setIntField(term93695, term93695.getClass(), "type", 0);
        setIntField(term93705, term93705.getClass(), "type", 0);
        setField(term93705, term93705.getClass(), "next", null);
        setField(term93705, term93705.getClass(), "first", null);
        setField(term93705, term93705.getClass(), "last", null);
        setField(term93705, term93705.getClass(), "propListHead", null);
        setIntField(term93705, term93705.getClass(), "sourcePosition", 0);
        setField(term93705, term93705.getClass(), "jsType", null);
        setField(term93705, term93705.getClass(), "parent", null);
        setField(term93695, term93695.getClass(), "next", term93705);
        setField(term93695, term93695.getClass(), "first", null);
        setField(term93695, term93695.getClass(), "last", null);
        setField(term93695, term93695.getClass(), "propListHead", null);
        setIntField(term93695, term93695.getClass(), "sourcePosition", 0);
        setField(term93695, term93695.getClass(), "jsType", null);
        setField(term93695, term93695.getClass(), "parent", null);
        setField(term93685, term93685.getClass(), "first", term93695);
        setField(term93685, term93685.getClass(), "last", null);
        setField(term93685, term93685.getClass(), "propListHead", null);
        setIntField(term93685, term93685.getClass(), "sourcePosition", 0);
        setField(term93685, term93685.getClass(), "jsType", null);
        setField(term93685, term93685.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term93022;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term92936, args);
        assertTrue(recursiveEquals(term92936, term93744));
        assertTrue(recursiveEquals(term93022, term93745));
        assertTrue(recursiveEquals(retValue, term93685));
    }

};


