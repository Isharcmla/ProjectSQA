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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539740;
     Object term539832;
     Object term540837;
     Object term540838;
     Object term540792;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term539740 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term539832 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term539918 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term539988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term539918, term539918.getClass(), "next", term539988);
        setIntField(term539918, term539918.getClass(), "type", 39);
        setField(term539832, term539832.getClass(), "first", term539918);
        setIntField(term539832, term539832.getClass(), "type", 22);
        term540837 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term540837, term540837.getClass(), "currentTraversal", null);
        term540838 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term540839 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term540840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term540838, term540838.getClass(), "str", null);
        setIntField(term540838, term540838.getClass(), "type", 22);
        setField(term540838, term540838.getClass(), "next", null);
        setField(term540839, term540839.getClass(), "functionName", null);
        setBooleanField(term540839, term540839.getClass(), "itsNeedsActivation", false);
        setIntField(term540839, term540839.getClass(), "itsFunctionType", 0);
        setBooleanField(term540839, term540839.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term540839, term540839.getClass(), "encodedSourceStart", 0);
        setIntField(term540839, term540839.getClass(), "encodedSourceEnd", 0);
        setField(term540839, term540839.getClass(), "sourceName", null);
        setIntField(term540839, term540839.getClass(), "baseLineno", 0);
        setIntField(term540839, term540839.getClass(), "endLineno", 0);
        setField(term540839, term540839.getClass(), "functions", null);
        setField(term540839, term540839.getClass(), "regexps", null);
        setField(term540839, term540839.getClass(), "itsVariables", null);
        setField(term540839, term540839.getClass(), "itsConst", null);
        setField(term540839, term540839.getClass(), "itsVariableNames", null);
        setIntField(term540839, term540839.getClass(), "varStart", 0);
        setField(term540839, term540839.getClass(), "compilerData", null);
        setIntField(term540839, term540839.getClass(), "type", 39);
        setIntField(term540840, term540840.getClass(), "type", 0);
        setField(term540840, term540840.getClass(), "next", null);
        setField(term540840, term540840.getClass(), "first", null);
        setField(term540840, term540840.getClass(), "last", null);
        setField(term540840, term540840.getClass(), "propListHead", null);
        setIntField(term540840, term540840.getClass(), "sourcePosition", 0);
        setField(term540840, term540840.getClass(), "jsType", null);
        setField(term540840, term540840.getClass(), "parent", null);
        setField(term540839, term540839.getClass(), "next", term540840);
        setField(term540839, term540839.getClass(), "first", null);
        setField(term540839, term540839.getClass(), "last", null);
        setField(term540839, term540839.getClass(), "propListHead", null);
        setIntField(term540839, term540839.getClass(), "sourcePosition", 0);
        setField(term540839, term540839.getClass(), "jsType", null);
        setField(term540839, term540839.getClass(), "parent", null);
        setField(term540838, term540838.getClass(), "first", term540839);
        setField(term540838, term540838.getClass(), "last", null);
        setField(term540838, term540838.getClass(), "propListHead", null);
        setIntField(term540838, term540838.getClass(), "sourcePosition", 0);
        setField(term540838, term540838.getClass(), "jsType", null);
        setField(term540838, term540838.getClass(), "parent", null);
        term540792 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term540794 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term540804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term540792, term540792.getClass(), "str", null);
        setIntField(term540792, term540792.getClass(), "type", 22);
        setField(term540792, term540792.getClass(), "next", null);
        setField(term540794, term540794.getClass(), "functionName", null);
        setBooleanField(term540794, term540794.getClass(), "itsNeedsActivation", false);
        setIntField(term540794, term540794.getClass(), "itsFunctionType", 0);
        setBooleanField(term540794, term540794.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term540794, term540794.getClass(), "encodedSourceStart", 0);
        setIntField(term540794, term540794.getClass(), "encodedSourceEnd", 0);
        setField(term540794, term540794.getClass(), "sourceName", null);
        setIntField(term540794, term540794.getClass(), "baseLineno", 0);
        setIntField(term540794, term540794.getClass(), "endLineno", 0);
        setField(term540794, term540794.getClass(), "functions", null);
        setField(term540794, term540794.getClass(), "regexps", null);
        setField(term540794, term540794.getClass(), "itsVariables", null);
        setField(term540794, term540794.getClass(), "itsConst", null);
        setField(term540794, term540794.getClass(), "itsVariableNames", null);
        setIntField(term540794, term540794.getClass(), "varStart", 0);
        setField(term540794, term540794.getClass(), "compilerData", null);
        setIntField(term540794, term540794.getClass(), "type", 39);
        setIntField(term540804, term540804.getClass(), "type", 0);
        setField(term540804, term540804.getClass(), "next", null);
        setField(term540804, term540804.getClass(), "first", null);
        setField(term540804, term540804.getClass(), "last", null);
        setField(term540804, term540804.getClass(), "propListHead", null);
        setIntField(term540804, term540804.getClass(), "sourcePosition", 0);
        setField(term540804, term540804.getClass(), "jsType", null);
        setField(term540804, term540804.getClass(), "parent", null);
        setField(term540794, term540794.getClass(), "next", term540804);
        setField(term540794, term540794.getClass(), "first", null);
        setField(term540794, term540794.getClass(), "last", null);
        setField(term540794, term540794.getClass(), "propListHead", null);
        setIntField(term540794, term540794.getClass(), "sourcePosition", 0);
        setField(term540794, term540794.getClass(), "jsType", null);
        setField(term540794, term540794.getClass(), "parent", null);
        setField(term540792, term540792.getClass(), "first", term540794);
        setField(term540792, term540792.getClass(), "last", null);
        setField(term540792, term540792.getClass(), "propListHead", null);
        setIntField(term540792, term540792.getClass(), "sourcePosition", 0);
        setField(term540792, term540792.getClass(), "jsType", null);
        setField(term540792, term540792.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term539832;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term539740, args);
        assertTrue(recursiveEquals(term539740, term540837));
        assertTrue(recursiveEquals(term539832, term540838));
        assertTrue(recursiveEquals(retValue, term540792));
    }

};


