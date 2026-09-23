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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625627;
     Object term625719;
     Object term651545;
     Object term651546;
     Object term651495;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term625627 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term625719 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term625805 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term625875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term625805, term625805.getClass(), "next", term625875);
        setField(term625719, term625719.getClass(), "first", term625805);
        setIntField(term625719, term625719.getClass(), "type", 13);
        term651545 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term651545, term651545.getClass(), "currentTraversal", null);
        term651546 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term651547 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term651548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term651546, term651546.getClass(), "str", null);
        setIntField(term651546, term651546.getClass(), "type", 13);
        setField(term651546, term651546.getClass(), "next", null);
        setField(term651547, term651547.getClass(), "functionName", null);
        setBooleanField(term651547, term651547.getClass(), "itsNeedsActivation", false);
        setIntField(term651547, term651547.getClass(), "itsFunctionType", 0);
        setBooleanField(term651547, term651547.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651547, term651547.getClass(), "encodedSourceStart", 0);
        setIntField(term651547, term651547.getClass(), "encodedSourceEnd", 0);
        setField(term651547, term651547.getClass(), "sourceName", null);
        setIntField(term651547, term651547.getClass(), "baseLineno", 0);
        setIntField(term651547, term651547.getClass(), "endLineno", 0);
        setField(term651547, term651547.getClass(), "functions", null);
        setField(term651547, term651547.getClass(), "regexps", null);
        setField(term651547, term651547.getClass(), "itsVariables", null);
        setField(term651547, term651547.getClass(), "itsConst", null);
        setField(term651547, term651547.getClass(), "itsVariableNames", null);
        setIntField(term651547, term651547.getClass(), "varStart", 0);
        setField(term651547, term651547.getClass(), "compilerData", null);
        setIntField(term651547, term651547.getClass(), "type", 0);
        setIntField(term651548, term651548.getClass(), "type", 0);
        setField(term651548, term651548.getClass(), "next", null);
        setField(term651548, term651548.getClass(), "first", null);
        setField(term651548, term651548.getClass(), "last", null);
        setField(term651548, term651548.getClass(), "propListHead", null);
        setIntField(term651548, term651548.getClass(), "sourcePosition", 0);
        setField(term651548, term651548.getClass(), "jsType", null);
        setField(term651548, term651548.getClass(), "parent", null);
        setField(term651547, term651547.getClass(), "next", term651548);
        setField(term651547, term651547.getClass(), "first", null);
        setField(term651547, term651547.getClass(), "last", null);
        setField(term651547, term651547.getClass(), "propListHead", null);
        setIntField(term651547, term651547.getClass(), "sourcePosition", 0);
        setField(term651547, term651547.getClass(), "jsType", null);
        setField(term651547, term651547.getClass(), "parent", null);
        setField(term651546, term651546.getClass(), "first", term651547);
        setField(term651546, term651546.getClass(), "last", null);
        setField(term651546, term651546.getClass(), "propListHead", null);
        setIntField(term651546, term651546.getClass(), "sourcePosition", 0);
        setField(term651546, term651546.getClass(), "jsType", null);
        setField(term651546, term651546.getClass(), "parent", null);
        term651495 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term651497 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term651507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term651495, term651495.getClass(), "str", null);
        setIntField(term651495, term651495.getClass(), "type", 13);
        setField(term651495, term651495.getClass(), "next", null);
        setField(term651497, term651497.getClass(), "functionName", null);
        setBooleanField(term651497, term651497.getClass(), "itsNeedsActivation", false);
        setIntField(term651497, term651497.getClass(), "itsFunctionType", 0);
        setBooleanField(term651497, term651497.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651497, term651497.getClass(), "encodedSourceStart", 0);
        setIntField(term651497, term651497.getClass(), "encodedSourceEnd", 0);
        setField(term651497, term651497.getClass(), "sourceName", null);
        setIntField(term651497, term651497.getClass(), "baseLineno", 0);
        setIntField(term651497, term651497.getClass(), "endLineno", 0);
        setField(term651497, term651497.getClass(), "functions", null);
        setField(term651497, term651497.getClass(), "regexps", null);
        setField(term651497, term651497.getClass(), "itsVariables", null);
        setField(term651497, term651497.getClass(), "itsConst", null);
        setField(term651497, term651497.getClass(), "itsVariableNames", null);
        setIntField(term651497, term651497.getClass(), "varStart", 0);
        setField(term651497, term651497.getClass(), "compilerData", null);
        setIntField(term651497, term651497.getClass(), "type", 0);
        setIntField(term651507, term651507.getClass(), "type", 0);
        setField(term651507, term651507.getClass(), "next", null);
        setField(term651507, term651507.getClass(), "first", null);
        setField(term651507, term651507.getClass(), "last", null);
        setField(term651507, term651507.getClass(), "propListHead", null);
        setIntField(term651507, term651507.getClass(), "sourcePosition", 0);
        setField(term651507, term651507.getClass(), "jsType", null);
        setField(term651507, term651507.getClass(), "parent", null);
        setField(term651497, term651497.getClass(), "next", term651507);
        setField(term651497, term651497.getClass(), "first", null);
        setField(term651497, term651497.getClass(), "last", null);
        setField(term651497, term651497.getClass(), "propListHead", null);
        setIntField(term651497, term651497.getClass(), "sourcePosition", 0);
        setField(term651497, term651497.getClass(), "jsType", null);
        setField(term651497, term651497.getClass(), "parent", null);
        setField(term651495, term651495.getClass(), "first", term651497);
        setField(term651495, term651495.getClass(), "last", null);
        setField(term651495, term651495.getClass(), "propListHead", null);
        setIntField(term651495, term651495.getClass(), "sourcePosition", 0);
        setField(term651495, term651495.getClass(), "jsType", null);
        setField(term651495, term651495.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term625719;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term625627, args);
        assertTrue(recursiveEquals(term625627, term651545));
        assertTrue(recursiveEquals(term625719, term651546));
        assertTrue(recursiveEquals(retValue, term651495));
    }

};


