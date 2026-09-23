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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362515;
     Object term362601;
     Object term362859;
     Object term362860;
     Object term362795;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term362515 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term362601 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term362687 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term362779 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term362687, term362687.getClass(), "next", term362779);
        setIntField(term362687, term362687.getClass(), "type", 39);
        setField(term362601, term362601.getClass(), "first", term362687);
        setIntField(term362601, term362601.getClass(), "type", 19);
        term362859 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term362859, term362859.getClass(), "currentTraversal", null);
        term362860 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term362861 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term362862 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term362860, term362860.getClass(), "functionName", null);
        setBooleanField(term362860, term362860.getClass(), "itsNeedsActivation", false);
        setIntField(term362860, term362860.getClass(), "itsFunctionType", 0);
        setBooleanField(term362860, term362860.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term362860, term362860.getClass(), "encodedSourceStart", 0);
        setIntField(term362860, term362860.getClass(), "encodedSourceEnd", 0);
        setField(term362860, term362860.getClass(), "sourceName", null);
        setIntField(term362860, term362860.getClass(), "baseLineno", 0);
        setIntField(term362860, term362860.getClass(), "endLineno", 0);
        setField(term362860, term362860.getClass(), "functions", null);
        setField(term362860, term362860.getClass(), "regexps", null);
        setField(term362860, term362860.getClass(), "itsVariables", null);
        setField(term362860, term362860.getClass(), "itsConst", null);
        setField(term362860, term362860.getClass(), "itsVariableNames", null);
        setIntField(term362860, term362860.getClass(), "varStart", 0);
        setField(term362860, term362860.getClass(), "compilerData", null);
        setIntField(term362860, term362860.getClass(), "type", 19);
        setField(term362860, term362860.getClass(), "next", null);
        setField(term362861, term362861.getClass(), "functionName", null);
        setBooleanField(term362861, term362861.getClass(), "itsNeedsActivation", false);
        setIntField(term362861, term362861.getClass(), "itsFunctionType", 0);
        setBooleanField(term362861, term362861.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term362861, term362861.getClass(), "encodedSourceStart", 0);
        setIntField(term362861, term362861.getClass(), "encodedSourceEnd", 0);
        setField(term362861, term362861.getClass(), "sourceName", null);
        setIntField(term362861, term362861.getClass(), "baseLineno", 0);
        setIntField(term362861, term362861.getClass(), "endLineno", 0);
        setField(term362861, term362861.getClass(), "functions", null);
        setField(term362861, term362861.getClass(), "regexps", null);
        setField(term362861, term362861.getClass(), "itsVariables", null);
        setField(term362861, term362861.getClass(), "itsConst", null);
        setField(term362861, term362861.getClass(), "itsVariableNames", null);
        setIntField(term362861, term362861.getClass(), "varStart", 0);
        setField(term362861, term362861.getClass(), "compilerData", null);
        setIntField(term362861, term362861.getClass(), "type", 39);
        setDoubleField(term362862, term362862.getClass(), "number", 0.0);
        setIntField(term362862, term362862.getClass(), "type", 0);
        setField(term362862, term362862.getClass(), "next", null);
        setField(term362862, term362862.getClass(), "first", null);
        setField(term362862, term362862.getClass(), "last", null);
        setField(term362862, term362862.getClass(), "propListHead", null);
        setIntField(term362862, term362862.getClass(), "sourcePosition", 0);
        setField(term362862, term362862.getClass(), "jsType", null);
        setField(term362862, term362862.getClass(), "parent", null);
        setField(term362861, term362861.getClass(), "next", term362862);
        setField(term362861, term362861.getClass(), "first", null);
        setField(term362861, term362861.getClass(), "last", null);
        setField(term362861, term362861.getClass(), "propListHead", null);
        setIntField(term362861, term362861.getClass(), "sourcePosition", 0);
        setField(term362861, term362861.getClass(), "jsType", null);
        setField(term362861, term362861.getClass(), "parent", null);
        setField(term362860, term362860.getClass(), "first", term362861);
        setField(term362860, term362860.getClass(), "last", null);
        setField(term362860, term362860.getClass(), "propListHead", null);
        setIntField(term362860, term362860.getClass(), "sourcePosition", 0);
        setField(term362860, term362860.getClass(), "jsType", null);
        setField(term362860, term362860.getClass(), "parent", null);
        term362795 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term362805 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term362815 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term362795, term362795.getClass(), "functionName", null);
        setBooleanField(term362795, term362795.getClass(), "itsNeedsActivation", false);
        setIntField(term362795, term362795.getClass(), "itsFunctionType", 0);
        setBooleanField(term362795, term362795.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term362795, term362795.getClass(), "encodedSourceStart", 0);
        setIntField(term362795, term362795.getClass(), "encodedSourceEnd", 0);
        setField(term362795, term362795.getClass(), "sourceName", null);
        setIntField(term362795, term362795.getClass(), "baseLineno", 0);
        setIntField(term362795, term362795.getClass(), "endLineno", 0);
        setField(term362795, term362795.getClass(), "functions", null);
        setField(term362795, term362795.getClass(), "regexps", null);
        setField(term362795, term362795.getClass(), "itsVariables", null);
        setField(term362795, term362795.getClass(), "itsConst", null);
        setField(term362795, term362795.getClass(), "itsVariableNames", null);
        setIntField(term362795, term362795.getClass(), "varStart", 0);
        setField(term362795, term362795.getClass(), "compilerData", null);
        setIntField(term362795, term362795.getClass(), "type", 19);
        setField(term362795, term362795.getClass(), "next", null);
        setField(term362805, term362805.getClass(), "functionName", null);
        setBooleanField(term362805, term362805.getClass(), "itsNeedsActivation", false);
        setIntField(term362805, term362805.getClass(), "itsFunctionType", 0);
        setBooleanField(term362805, term362805.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term362805, term362805.getClass(), "encodedSourceStart", 0);
        setIntField(term362805, term362805.getClass(), "encodedSourceEnd", 0);
        setField(term362805, term362805.getClass(), "sourceName", null);
        setIntField(term362805, term362805.getClass(), "baseLineno", 0);
        setIntField(term362805, term362805.getClass(), "endLineno", 0);
        setField(term362805, term362805.getClass(), "functions", null);
        setField(term362805, term362805.getClass(), "regexps", null);
        setField(term362805, term362805.getClass(), "itsVariables", null);
        setField(term362805, term362805.getClass(), "itsConst", null);
        setField(term362805, term362805.getClass(), "itsVariableNames", null);
        setIntField(term362805, term362805.getClass(), "varStart", 0);
        setField(term362805, term362805.getClass(), "compilerData", null);
        setIntField(term362805, term362805.getClass(), "type", 39);
        setDoubleField(term362815, term362815.getClass(), "number", 0.0);
        setIntField(term362815, term362815.getClass(), "type", 0);
        setField(term362815, term362815.getClass(), "next", null);
        setField(term362815, term362815.getClass(), "first", null);
        setField(term362815, term362815.getClass(), "last", null);
        setField(term362815, term362815.getClass(), "propListHead", null);
        setIntField(term362815, term362815.getClass(), "sourcePosition", 0);
        setField(term362815, term362815.getClass(), "jsType", null);
        setField(term362815, term362815.getClass(), "parent", null);
        setField(term362805, term362805.getClass(), "next", term362815);
        setField(term362805, term362805.getClass(), "first", null);
        setField(term362805, term362805.getClass(), "last", null);
        setField(term362805, term362805.getClass(), "propListHead", null);
        setIntField(term362805, term362805.getClass(), "sourcePosition", 0);
        setField(term362805, term362805.getClass(), "jsType", null);
        setField(term362805, term362805.getClass(), "parent", null);
        setField(term362795, term362795.getClass(), "first", term362805);
        setField(term362795, term362795.getClass(), "last", null);
        setField(term362795, term362795.getClass(), "propListHead", null);
        setIntField(term362795, term362795.getClass(), "sourcePosition", 0);
        setField(term362795, term362795.getClass(), "jsType", null);
        setField(term362795, term362795.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term362601;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term362515, args);
        assertTrue(recursiveEquals(term362515, term362859));
        assertTrue(recursiveEquals(term362601, term362860));
        assertTrue(recursiveEquals(retValue, term362795));
    }

};


