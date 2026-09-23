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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52607;
     Object term52693;
     Object term53041;
     Object term53042;
     Object term52967;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52607 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term52693 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term52779 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term52849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term52779, term52779.getClass(), "next", term52849);
        setField(term52693, term52693.getClass(), "first", term52779);
        setIntField(term52693, term52693.getClass(), "type", 16);
        term53041 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term53041, term53041.getClass(), "currentTraversal", null);
        term53042 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term53043 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term53044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term53042, term53042.getClass(), "functionName", null);
        setBooleanField(term53042, term53042.getClass(), "itsNeedsActivation", false);
        setIntField(term53042, term53042.getClass(), "itsFunctionType", 0);
        setBooleanField(term53042, term53042.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term53042, term53042.getClass(), "encodedSourceStart", 0);
        setIntField(term53042, term53042.getClass(), "encodedSourceEnd", 0);
        setField(term53042, term53042.getClass(), "sourceName", null);
        setIntField(term53042, term53042.getClass(), "baseLineno", 0);
        setIntField(term53042, term53042.getClass(), "endLineno", 0);
        setField(term53042, term53042.getClass(), "functions", null);
        setField(term53042, term53042.getClass(), "regexps", null);
        setField(term53042, term53042.getClass(), "itsVariables", null);
        setField(term53042, term53042.getClass(), "itsConst", null);
        setField(term53042, term53042.getClass(), "itsVariableNames", null);
        setIntField(term53042, term53042.getClass(), "varStart", 0);
        setField(term53042, term53042.getClass(), "compilerData", null);
        setIntField(term53042, term53042.getClass(), "type", 16);
        setField(term53042, term53042.getClass(), "next", null);
        setField(term53043, term53043.getClass(), "functionName", null);
        setBooleanField(term53043, term53043.getClass(), "itsNeedsActivation", false);
        setIntField(term53043, term53043.getClass(), "itsFunctionType", 0);
        setBooleanField(term53043, term53043.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term53043, term53043.getClass(), "encodedSourceStart", 0);
        setIntField(term53043, term53043.getClass(), "encodedSourceEnd", 0);
        setField(term53043, term53043.getClass(), "sourceName", null);
        setIntField(term53043, term53043.getClass(), "baseLineno", 0);
        setIntField(term53043, term53043.getClass(), "endLineno", 0);
        setField(term53043, term53043.getClass(), "functions", null);
        setField(term53043, term53043.getClass(), "regexps", null);
        setField(term53043, term53043.getClass(), "itsVariables", null);
        setField(term53043, term53043.getClass(), "itsConst", null);
        setField(term53043, term53043.getClass(), "itsVariableNames", null);
        setIntField(term53043, term53043.getClass(), "varStart", 0);
        setField(term53043, term53043.getClass(), "compilerData", null);
        setIntField(term53043, term53043.getClass(), "type", 0);
        setIntField(term53044, term53044.getClass(), "type", 0);
        setField(term53044, term53044.getClass(), "next", null);
        setField(term53044, term53044.getClass(), "first", null);
        setField(term53044, term53044.getClass(), "last", null);
        setField(term53044, term53044.getClass(), "propListHead", null);
        setIntField(term53044, term53044.getClass(), "sourcePosition", 0);
        setField(term53044, term53044.getClass(), "jsType", null);
        setField(term53044, term53044.getClass(), "parent", null);
        setField(term53043, term53043.getClass(), "next", term53044);
        setField(term53043, term53043.getClass(), "first", null);
        setField(term53043, term53043.getClass(), "last", null);
        setField(term53043, term53043.getClass(), "propListHead", null);
        setIntField(term53043, term53043.getClass(), "sourcePosition", 0);
        setField(term53043, term53043.getClass(), "jsType", null);
        setField(term53043, term53043.getClass(), "parent", null);
        setField(term53042, term53042.getClass(), "first", term53043);
        setField(term53042, term53042.getClass(), "last", null);
        setField(term53042, term53042.getClass(), "propListHead", null);
        setIntField(term53042, term53042.getClass(), "sourcePosition", 0);
        setField(term53042, term53042.getClass(), "jsType", null);
        setField(term53042, term53042.getClass(), "parent", null);
        term52967 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term52977 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term52987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term52967, term52967.getClass(), "functionName", null);
        setBooleanField(term52967, term52967.getClass(), "itsNeedsActivation", false);
        setIntField(term52967, term52967.getClass(), "itsFunctionType", 0);
        setBooleanField(term52967, term52967.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term52967, term52967.getClass(), "encodedSourceStart", 0);
        setIntField(term52967, term52967.getClass(), "encodedSourceEnd", 0);
        setField(term52967, term52967.getClass(), "sourceName", null);
        setIntField(term52967, term52967.getClass(), "baseLineno", 0);
        setIntField(term52967, term52967.getClass(), "endLineno", 0);
        setField(term52967, term52967.getClass(), "functions", null);
        setField(term52967, term52967.getClass(), "regexps", null);
        setField(term52967, term52967.getClass(), "itsVariables", null);
        setField(term52967, term52967.getClass(), "itsConst", null);
        setField(term52967, term52967.getClass(), "itsVariableNames", null);
        setIntField(term52967, term52967.getClass(), "varStart", 0);
        setField(term52967, term52967.getClass(), "compilerData", null);
        setIntField(term52967, term52967.getClass(), "type", 16);
        setField(term52967, term52967.getClass(), "next", null);
        setField(term52977, term52977.getClass(), "functionName", null);
        setBooleanField(term52977, term52977.getClass(), "itsNeedsActivation", false);
        setIntField(term52977, term52977.getClass(), "itsFunctionType", 0);
        setBooleanField(term52977, term52977.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term52977, term52977.getClass(), "encodedSourceStart", 0);
        setIntField(term52977, term52977.getClass(), "encodedSourceEnd", 0);
        setField(term52977, term52977.getClass(), "sourceName", null);
        setIntField(term52977, term52977.getClass(), "baseLineno", 0);
        setIntField(term52977, term52977.getClass(), "endLineno", 0);
        setField(term52977, term52977.getClass(), "functions", null);
        setField(term52977, term52977.getClass(), "regexps", null);
        setField(term52977, term52977.getClass(), "itsVariables", null);
        setField(term52977, term52977.getClass(), "itsConst", null);
        setField(term52977, term52977.getClass(), "itsVariableNames", null);
        setIntField(term52977, term52977.getClass(), "varStart", 0);
        setField(term52977, term52977.getClass(), "compilerData", null);
        setIntField(term52977, term52977.getClass(), "type", 0);
        setIntField(term52987, term52987.getClass(), "type", 0);
        setField(term52987, term52987.getClass(), "next", null);
        setField(term52987, term52987.getClass(), "first", null);
        setField(term52987, term52987.getClass(), "last", null);
        setField(term52987, term52987.getClass(), "propListHead", null);
        setIntField(term52987, term52987.getClass(), "sourcePosition", 0);
        setField(term52987, term52987.getClass(), "jsType", null);
        setField(term52987, term52987.getClass(), "parent", null);
        setField(term52977, term52977.getClass(), "next", term52987);
        setField(term52977, term52977.getClass(), "first", null);
        setField(term52977, term52977.getClass(), "last", null);
        setField(term52977, term52977.getClass(), "propListHead", null);
        setIntField(term52977, term52977.getClass(), "sourcePosition", 0);
        setField(term52977, term52977.getClass(), "jsType", null);
        setField(term52977, term52977.getClass(), "parent", null);
        setField(term52967, term52967.getClass(), "first", term52977);
        setField(term52967, term52967.getClass(), "last", null);
        setField(term52967, term52967.getClass(), "propListHead", null);
        setIntField(term52967, term52967.getClass(), "sourcePosition", 0);
        setField(term52967, term52967.getClass(), "jsType", null);
        setField(term52967, term52967.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term52693;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term52607, args);
        assertTrue(recursiveEquals(term52607, term53041));
        assertTrue(recursiveEquals(term52693, term53042));
        assertTrue(recursiveEquals(retValue, term52967));
    }

};


