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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term459810;
     Object term459939;
     Object term460465;
     Object term460466;
     Object term460467;
     Object term460429;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term459810 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term459939 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term459939, term459939.getClass(), "parent", null);
        setIntField(term459939, term459939.getClass(), "type", 44);
        term460465 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term460465, term460465.getClass(), "currentTraversal", null);
        term460466 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term460466, term460466.getClass(), "functionName", null);
        setBooleanField(term460466, term460466.getClass(), "itsNeedsActivation", false);
        setIntField(term460466, term460466.getClass(), "itsFunctionType", 0);
        setBooleanField(term460466, term460466.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term460466, term460466.getClass(), "encodedSourceStart", 0);
        setIntField(term460466, term460466.getClass(), "encodedSourceEnd", 0);
        setField(term460466, term460466.getClass(), "sourceName", null);
        setIntField(term460466, term460466.getClass(), "baseLineno", 0);
        setIntField(term460466, term460466.getClass(), "endLineno", 0);
        setField(term460466, term460466.getClass(), "functions", null);
        setField(term460466, term460466.getClass(), "regexps", null);
        setField(term460466, term460466.getClass(), "itsVariables", null);
        setField(term460466, term460466.getClass(), "itsConst", null);
        setField(term460466, term460466.getClass(), "itsVariableNames", null);
        setIntField(term460466, term460466.getClass(), "varStart", 0);
        setField(term460466, term460466.getClass(), "compilerData", null);
        setIntField(term460466, term460466.getClass(), "type", 44);
        setField(term460466, term460466.getClass(), "next", null);
        setField(term460466, term460466.getClass(), "first", null);
        setField(term460466, term460466.getClass(), "last", null);
        setField(term460466, term460466.getClass(), "propListHead", null);
        setIntField(term460466, term460466.getClass(), "sourcePosition", 0);
        setField(term460466, term460466.getClass(), "jsType", null);
        setField(term460466, term460466.getClass(), "parent", null);
        term460467 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term460467, term460467.getClass(), "functionName", null);
        setBooleanField(term460467, term460467.getClass(), "itsNeedsActivation", false);
        setIntField(term460467, term460467.getClass(), "itsFunctionType", 0);
        setBooleanField(term460467, term460467.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term460467, term460467.getClass(), "encodedSourceStart", 0);
        setIntField(term460467, term460467.getClass(), "encodedSourceEnd", 0);
        setField(term460467, term460467.getClass(), "sourceName", null);
        setIntField(term460467, term460467.getClass(), "baseLineno", 0);
        setIntField(term460467, term460467.getClass(), "endLineno", 0);
        setField(term460467, term460467.getClass(), "functions", null);
        setField(term460467, term460467.getClass(), "regexps", null);
        setField(term460467, term460467.getClass(), "itsVariables", null);
        setField(term460467, term460467.getClass(), "itsConst", null);
        setField(term460467, term460467.getClass(), "itsVariableNames", null);
        setIntField(term460467, term460467.getClass(), "varStart", 0);
        setField(term460467, term460467.getClass(), "compilerData", null);
        setIntField(term460467, term460467.getClass(), "type", 44);
        setField(term460467, term460467.getClass(), "next", null);
        setField(term460467, term460467.getClass(), "first", null);
        setField(term460467, term460467.getClass(), "last", null);
        setField(term460467, term460467.getClass(), "propListHead", null);
        setIntField(term460467, term460467.getClass(), "sourcePosition", 0);
        setField(term460467, term460467.getClass(), "jsType", null);
        setField(term460467, term460467.getClass(), "parent", null);
        term460429 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term460429, term460429.getClass(), "functionName", null);
        setBooleanField(term460429, term460429.getClass(), "itsNeedsActivation", false);
        setIntField(term460429, term460429.getClass(), "itsFunctionType", 0);
        setBooleanField(term460429, term460429.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term460429, term460429.getClass(), "encodedSourceStart", 0);
        setIntField(term460429, term460429.getClass(), "encodedSourceEnd", 0);
        setField(term460429, term460429.getClass(), "sourceName", null);
        setIntField(term460429, term460429.getClass(), "baseLineno", 0);
        setIntField(term460429, term460429.getClass(), "endLineno", 0);
        setField(term460429, term460429.getClass(), "functions", null);
        setField(term460429, term460429.getClass(), "regexps", null);
        setField(term460429, term460429.getClass(), "itsVariables", null);
        setField(term460429, term460429.getClass(), "itsConst", null);
        setField(term460429, term460429.getClass(), "itsVariableNames", null);
        setIntField(term460429, term460429.getClass(), "varStart", 0);
        setField(term460429, term460429.getClass(), "compilerData", null);
        setIntField(term460429, term460429.getClass(), "type", 44);
        setField(term460429, term460429.getClass(), "next", null);
        setField(term460429, term460429.getClass(), "first", null);
        setField(term460429, term460429.getClass(), "last", null);
        setField(term460429, term460429.getClass(), "propListHead", null);
        setIntField(term460429, term460429.getClass(), "sourcePosition", 0);
        setField(term460429, term460429.getClass(), "jsType", null);
        setField(term460429, term460429.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term459939;
        args[1] = term459939;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term459810, args);
        assertTrue(recursiveEquals(term459810, term460465));
        assertTrue(recursiveEquals(term459939, term460466));
        assertTrue(recursiveEquals(term459939, term460467));
        assertTrue(recursiveEquals(retValue, term460429));
    }

};


