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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term893923;
     Object term894015;
     Object term894726;
     Object term894727;
     Object term894676;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term893923 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term894015 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term894101 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term894193 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term894101, term894101.getClass(), "next", term894193);
        setIntField(term894101, term894101.getClass(), "type", 39);
        setField(term894015, term894015.getClass(), "first", term894101);
        setIntField(term894015, term894015.getClass(), "type", 23);
        term894726 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term894726, term894726.getClass(), "currentTraversal", null);
        term894727 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term894728 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term894729 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term894727, term894727.getClass(), "number", 0.0);
        setIntField(term894727, term894727.getClass(), "type", 23);
        setField(term894727, term894727.getClass(), "next", null);
        setField(term894728, term894728.getClass(), "functionName", null);
        setBooleanField(term894728, term894728.getClass(), "itsNeedsActivation", false);
        setIntField(term894728, term894728.getClass(), "itsFunctionType", 0);
        setBooleanField(term894728, term894728.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term894728, term894728.getClass(), "encodedSourceStart", 0);
        setIntField(term894728, term894728.getClass(), "encodedSourceEnd", 0);
        setField(term894728, term894728.getClass(), "sourceName", null);
        setIntField(term894728, term894728.getClass(), "baseLineno", 0);
        setIntField(term894728, term894728.getClass(), "endLineno", 0);
        setField(term894728, term894728.getClass(), "functions", null);
        setField(term894728, term894728.getClass(), "regexps", null);
        setField(term894728, term894728.getClass(), "itsVariables", null);
        setField(term894728, term894728.getClass(), "itsConst", null);
        setField(term894728, term894728.getClass(), "itsVariableNames", null);
        setIntField(term894728, term894728.getClass(), "varStart", 0);
        setField(term894728, term894728.getClass(), "compilerData", null);
        setIntField(term894728, term894728.getClass(), "type", 39);
        setDoubleField(term894729, term894729.getClass(), "number", 0.0);
        setIntField(term894729, term894729.getClass(), "type", 0);
        setField(term894729, term894729.getClass(), "next", null);
        setField(term894729, term894729.getClass(), "first", null);
        setField(term894729, term894729.getClass(), "last", null);
        setField(term894729, term894729.getClass(), "propListHead", null);
        setIntField(term894729, term894729.getClass(), "sourcePosition", 0);
        setField(term894729, term894729.getClass(), "jsType", null);
        setField(term894729, term894729.getClass(), "parent", null);
        setField(term894728, term894728.getClass(), "next", term894729);
        setField(term894728, term894728.getClass(), "first", null);
        setField(term894728, term894728.getClass(), "last", null);
        setField(term894728, term894728.getClass(), "propListHead", null);
        setIntField(term894728, term894728.getClass(), "sourcePosition", 0);
        setField(term894728, term894728.getClass(), "jsType", null);
        setField(term894728, term894728.getClass(), "parent", null);
        setField(term894727, term894727.getClass(), "first", term894728);
        setField(term894727, term894727.getClass(), "last", null);
        setField(term894727, term894727.getClass(), "propListHead", null);
        setIntField(term894727, term894727.getClass(), "sourcePosition", 0);
        setField(term894727, term894727.getClass(), "jsType", null);
        setField(term894727, term894727.getClass(), "parent", null);
        term894676 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term894679 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term894689 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term894676, term894676.getClass(), "number", 0.0);
        setIntField(term894676, term894676.getClass(), "type", 23);
        setField(term894676, term894676.getClass(), "next", null);
        setField(term894679, term894679.getClass(), "functionName", null);
        setBooleanField(term894679, term894679.getClass(), "itsNeedsActivation", false);
        setIntField(term894679, term894679.getClass(), "itsFunctionType", 0);
        setBooleanField(term894679, term894679.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term894679, term894679.getClass(), "encodedSourceStart", 0);
        setIntField(term894679, term894679.getClass(), "encodedSourceEnd", 0);
        setField(term894679, term894679.getClass(), "sourceName", null);
        setIntField(term894679, term894679.getClass(), "baseLineno", 0);
        setIntField(term894679, term894679.getClass(), "endLineno", 0);
        setField(term894679, term894679.getClass(), "functions", null);
        setField(term894679, term894679.getClass(), "regexps", null);
        setField(term894679, term894679.getClass(), "itsVariables", null);
        setField(term894679, term894679.getClass(), "itsConst", null);
        setField(term894679, term894679.getClass(), "itsVariableNames", null);
        setIntField(term894679, term894679.getClass(), "varStart", 0);
        setField(term894679, term894679.getClass(), "compilerData", null);
        setIntField(term894679, term894679.getClass(), "type", 39);
        setDoubleField(term894689, term894689.getClass(), "number", 0.0);
        setIntField(term894689, term894689.getClass(), "type", 0);
        setField(term894689, term894689.getClass(), "next", null);
        setField(term894689, term894689.getClass(), "first", null);
        setField(term894689, term894689.getClass(), "last", null);
        setField(term894689, term894689.getClass(), "propListHead", null);
        setIntField(term894689, term894689.getClass(), "sourcePosition", 0);
        setField(term894689, term894689.getClass(), "jsType", null);
        setField(term894689, term894689.getClass(), "parent", null);
        setField(term894679, term894679.getClass(), "next", term894689);
        setField(term894679, term894679.getClass(), "first", null);
        setField(term894679, term894679.getClass(), "last", null);
        setField(term894679, term894679.getClass(), "propListHead", null);
        setIntField(term894679, term894679.getClass(), "sourcePosition", 0);
        setField(term894679, term894679.getClass(), "jsType", null);
        setField(term894679, term894679.getClass(), "parent", null);
        setField(term894676, term894676.getClass(), "first", term894679);
        setField(term894676, term894676.getClass(), "last", null);
        setField(term894676, term894676.getClass(), "propListHead", null);
        setIntField(term894676, term894676.getClass(), "sourcePosition", 0);
        setField(term894676, term894676.getClass(), "jsType", null);
        setField(term894676, term894676.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term894015;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term893923, args);
        assertTrue(recursiveEquals(term893923, term894726));
        assertTrue(recursiveEquals(term894015, term894727));
        assertTrue(recursiveEquals(retValue, term894676));
    }

};


