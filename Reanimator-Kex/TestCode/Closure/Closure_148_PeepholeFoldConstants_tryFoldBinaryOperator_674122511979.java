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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228706;
     Object term228792;
     Object term229430;
     Object term229431;
     Object term229356;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228706 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term228792 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term228878 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term228948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term228878, term228878.getClass(), "next", term228948);
        setField(term228792, term228792.getClass(), "first", term228878);
        setIntField(term228792, term228792.getClass(), "type", 16);
        term229430 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term229430, term229430.getClass(), "currentTraversal", null);
        term229431 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term229432 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term229433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term229431, term229431.getClass(), "functionName", null);
        setBooleanField(term229431, term229431.getClass(), "itsNeedsActivation", false);
        setIntField(term229431, term229431.getClass(), "itsFunctionType", 0);
        setBooleanField(term229431, term229431.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term229431, term229431.getClass(), "encodedSourceStart", 0);
        setIntField(term229431, term229431.getClass(), "encodedSourceEnd", 0);
        setField(term229431, term229431.getClass(), "sourceName", null);
        setIntField(term229431, term229431.getClass(), "baseLineno", 0);
        setIntField(term229431, term229431.getClass(), "endLineno", 0);
        setField(term229431, term229431.getClass(), "functions", null);
        setField(term229431, term229431.getClass(), "regexps", null);
        setField(term229431, term229431.getClass(), "itsVariables", null);
        setField(term229431, term229431.getClass(), "itsConst", null);
        setField(term229431, term229431.getClass(), "itsVariableNames", null);
        setIntField(term229431, term229431.getClass(), "varStart", 0);
        setField(term229431, term229431.getClass(), "compilerData", null);
        setIntField(term229431, term229431.getClass(), "type", 16);
        setField(term229431, term229431.getClass(), "next", null);
        setField(term229432, term229432.getClass(), "functionName", null);
        setBooleanField(term229432, term229432.getClass(), "itsNeedsActivation", false);
        setIntField(term229432, term229432.getClass(), "itsFunctionType", 0);
        setBooleanField(term229432, term229432.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term229432, term229432.getClass(), "encodedSourceStart", 0);
        setIntField(term229432, term229432.getClass(), "encodedSourceEnd", 0);
        setField(term229432, term229432.getClass(), "sourceName", null);
        setIntField(term229432, term229432.getClass(), "baseLineno", 0);
        setIntField(term229432, term229432.getClass(), "endLineno", 0);
        setField(term229432, term229432.getClass(), "functions", null);
        setField(term229432, term229432.getClass(), "regexps", null);
        setField(term229432, term229432.getClass(), "itsVariables", null);
        setField(term229432, term229432.getClass(), "itsConst", null);
        setField(term229432, term229432.getClass(), "itsVariableNames", null);
        setIntField(term229432, term229432.getClass(), "varStart", 0);
        setField(term229432, term229432.getClass(), "compilerData", null);
        setIntField(term229432, term229432.getClass(), "type", 0);
        setIntField(term229433, term229433.getClass(), "type", 0);
        setField(term229433, term229433.getClass(), "next", null);
        setField(term229433, term229433.getClass(), "first", null);
        setField(term229433, term229433.getClass(), "last", null);
        setField(term229433, term229433.getClass(), "propListHead", null);
        setIntField(term229433, term229433.getClass(), "sourcePosition", 0);
        setField(term229433, term229433.getClass(), "jsType", null);
        setField(term229433, term229433.getClass(), "parent", null);
        setField(term229432, term229432.getClass(), "next", term229433);
        setField(term229432, term229432.getClass(), "first", null);
        setField(term229432, term229432.getClass(), "last", null);
        setField(term229432, term229432.getClass(), "propListHead", null);
        setIntField(term229432, term229432.getClass(), "sourcePosition", 0);
        setField(term229432, term229432.getClass(), "jsType", null);
        setField(term229432, term229432.getClass(), "parent", null);
        setField(term229431, term229431.getClass(), "first", term229432);
        setField(term229431, term229431.getClass(), "last", null);
        setField(term229431, term229431.getClass(), "propListHead", null);
        setIntField(term229431, term229431.getClass(), "sourcePosition", 0);
        setField(term229431, term229431.getClass(), "jsType", null);
        setField(term229431, term229431.getClass(), "parent", null);
        term229356 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term229366 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term229376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term229356, term229356.getClass(), "functionName", null);
        setBooleanField(term229356, term229356.getClass(), "itsNeedsActivation", false);
        setIntField(term229356, term229356.getClass(), "itsFunctionType", 0);
        setBooleanField(term229356, term229356.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term229356, term229356.getClass(), "encodedSourceStart", 0);
        setIntField(term229356, term229356.getClass(), "encodedSourceEnd", 0);
        setField(term229356, term229356.getClass(), "sourceName", null);
        setIntField(term229356, term229356.getClass(), "baseLineno", 0);
        setIntField(term229356, term229356.getClass(), "endLineno", 0);
        setField(term229356, term229356.getClass(), "functions", null);
        setField(term229356, term229356.getClass(), "regexps", null);
        setField(term229356, term229356.getClass(), "itsVariables", null);
        setField(term229356, term229356.getClass(), "itsConst", null);
        setField(term229356, term229356.getClass(), "itsVariableNames", null);
        setIntField(term229356, term229356.getClass(), "varStart", 0);
        setField(term229356, term229356.getClass(), "compilerData", null);
        setIntField(term229356, term229356.getClass(), "type", 16);
        setField(term229356, term229356.getClass(), "next", null);
        setField(term229366, term229366.getClass(), "functionName", null);
        setBooleanField(term229366, term229366.getClass(), "itsNeedsActivation", false);
        setIntField(term229366, term229366.getClass(), "itsFunctionType", 0);
        setBooleanField(term229366, term229366.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term229366, term229366.getClass(), "encodedSourceStart", 0);
        setIntField(term229366, term229366.getClass(), "encodedSourceEnd", 0);
        setField(term229366, term229366.getClass(), "sourceName", null);
        setIntField(term229366, term229366.getClass(), "baseLineno", 0);
        setIntField(term229366, term229366.getClass(), "endLineno", 0);
        setField(term229366, term229366.getClass(), "functions", null);
        setField(term229366, term229366.getClass(), "regexps", null);
        setField(term229366, term229366.getClass(), "itsVariables", null);
        setField(term229366, term229366.getClass(), "itsConst", null);
        setField(term229366, term229366.getClass(), "itsVariableNames", null);
        setIntField(term229366, term229366.getClass(), "varStart", 0);
        setField(term229366, term229366.getClass(), "compilerData", null);
        setIntField(term229366, term229366.getClass(), "type", 0);
        setIntField(term229376, term229376.getClass(), "type", 0);
        setField(term229376, term229376.getClass(), "next", null);
        setField(term229376, term229376.getClass(), "first", null);
        setField(term229376, term229376.getClass(), "last", null);
        setField(term229376, term229376.getClass(), "propListHead", null);
        setIntField(term229376, term229376.getClass(), "sourcePosition", 0);
        setField(term229376, term229376.getClass(), "jsType", null);
        setField(term229376, term229376.getClass(), "parent", null);
        setField(term229366, term229366.getClass(), "next", term229376);
        setField(term229366, term229366.getClass(), "first", null);
        setField(term229366, term229366.getClass(), "last", null);
        setField(term229366, term229366.getClass(), "propListHead", null);
        setIntField(term229366, term229366.getClass(), "sourcePosition", 0);
        setField(term229366, term229366.getClass(), "jsType", null);
        setField(term229366, term229366.getClass(), "parent", null);
        setField(term229356, term229356.getClass(), "first", term229366);
        setField(term229356, term229356.getClass(), "last", null);
        setField(term229356, term229356.getClass(), "propListHead", null);
        setIntField(term229356, term229356.getClass(), "sourcePosition", 0);
        setField(term229356, term229356.getClass(), "jsType", null);
        setField(term229356, term229356.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term228792;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term228706, args);
        assertTrue(recursiveEquals(term228706, term229430));
        assertTrue(recursiveEquals(term228792, term229431));
        assertTrue(recursiveEquals(retValue, term229356));
    }

};


