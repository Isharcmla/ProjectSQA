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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433521;
     Object term433613;
     Object term433834;
     Object term433835;
     Object term433784;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term433521 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term433613 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term433699 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term433769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term433699, term433699.getClass(), "next", term433769);
        setField(term433613, term433613.getClass(), "first", term433699);
        setIntField(term433613, term433613.getClass(), "type", 13);
        term433834 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term433834, term433834.getClass(), "currentTraversal", null);
        term433835 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term433836 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term433837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term433835, term433835.getClass(), "str", null);
        setIntField(term433835, term433835.getClass(), "type", 13);
        setField(term433835, term433835.getClass(), "next", null);
        setField(term433836, term433836.getClass(), "functionName", null);
        setBooleanField(term433836, term433836.getClass(), "itsNeedsActivation", false);
        setIntField(term433836, term433836.getClass(), "itsFunctionType", 0);
        setBooleanField(term433836, term433836.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term433836, term433836.getClass(), "encodedSourceStart", 0);
        setIntField(term433836, term433836.getClass(), "encodedSourceEnd", 0);
        setField(term433836, term433836.getClass(), "sourceName", null);
        setIntField(term433836, term433836.getClass(), "baseLineno", 0);
        setIntField(term433836, term433836.getClass(), "endLineno", 0);
        setField(term433836, term433836.getClass(), "functions", null);
        setField(term433836, term433836.getClass(), "regexps", null);
        setField(term433836, term433836.getClass(), "itsVariables", null);
        setField(term433836, term433836.getClass(), "itsConst", null);
        setField(term433836, term433836.getClass(), "itsVariableNames", null);
        setIntField(term433836, term433836.getClass(), "varStart", 0);
        setField(term433836, term433836.getClass(), "compilerData", null);
        setIntField(term433836, term433836.getClass(), "type", 0);
        setIntField(term433837, term433837.getClass(), "type", 0);
        setField(term433837, term433837.getClass(), "next", null);
        setField(term433837, term433837.getClass(), "first", null);
        setField(term433837, term433837.getClass(), "last", null);
        setField(term433837, term433837.getClass(), "propListHead", null);
        setIntField(term433837, term433837.getClass(), "sourcePosition", 0);
        setField(term433837, term433837.getClass(), "jsType", null);
        setField(term433837, term433837.getClass(), "parent", null);
        setField(term433836, term433836.getClass(), "next", term433837);
        setField(term433836, term433836.getClass(), "first", null);
        setField(term433836, term433836.getClass(), "last", null);
        setField(term433836, term433836.getClass(), "propListHead", null);
        setIntField(term433836, term433836.getClass(), "sourcePosition", 0);
        setField(term433836, term433836.getClass(), "jsType", null);
        setField(term433836, term433836.getClass(), "parent", null);
        setField(term433835, term433835.getClass(), "first", term433836);
        setField(term433835, term433835.getClass(), "last", null);
        setField(term433835, term433835.getClass(), "propListHead", null);
        setIntField(term433835, term433835.getClass(), "sourcePosition", 0);
        setField(term433835, term433835.getClass(), "jsType", null);
        setField(term433835, term433835.getClass(), "parent", null);
        term433784 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term433786 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term433796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term433784, term433784.getClass(), "str", null);
        setIntField(term433784, term433784.getClass(), "type", 13);
        setField(term433784, term433784.getClass(), "next", null);
        setField(term433786, term433786.getClass(), "functionName", null);
        setBooleanField(term433786, term433786.getClass(), "itsNeedsActivation", false);
        setIntField(term433786, term433786.getClass(), "itsFunctionType", 0);
        setBooleanField(term433786, term433786.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term433786, term433786.getClass(), "encodedSourceStart", 0);
        setIntField(term433786, term433786.getClass(), "encodedSourceEnd", 0);
        setField(term433786, term433786.getClass(), "sourceName", null);
        setIntField(term433786, term433786.getClass(), "baseLineno", 0);
        setIntField(term433786, term433786.getClass(), "endLineno", 0);
        setField(term433786, term433786.getClass(), "functions", null);
        setField(term433786, term433786.getClass(), "regexps", null);
        setField(term433786, term433786.getClass(), "itsVariables", null);
        setField(term433786, term433786.getClass(), "itsConst", null);
        setField(term433786, term433786.getClass(), "itsVariableNames", null);
        setIntField(term433786, term433786.getClass(), "varStart", 0);
        setField(term433786, term433786.getClass(), "compilerData", null);
        setIntField(term433786, term433786.getClass(), "type", 0);
        setIntField(term433796, term433796.getClass(), "type", 0);
        setField(term433796, term433796.getClass(), "next", null);
        setField(term433796, term433796.getClass(), "first", null);
        setField(term433796, term433796.getClass(), "last", null);
        setField(term433796, term433796.getClass(), "propListHead", null);
        setIntField(term433796, term433796.getClass(), "sourcePosition", 0);
        setField(term433796, term433796.getClass(), "jsType", null);
        setField(term433796, term433796.getClass(), "parent", null);
        setField(term433786, term433786.getClass(), "next", term433796);
        setField(term433786, term433786.getClass(), "first", null);
        setField(term433786, term433786.getClass(), "last", null);
        setField(term433786, term433786.getClass(), "propListHead", null);
        setIntField(term433786, term433786.getClass(), "sourcePosition", 0);
        setField(term433786, term433786.getClass(), "jsType", null);
        setField(term433786, term433786.getClass(), "parent", null);
        setField(term433784, term433784.getClass(), "first", term433786);
        setField(term433784, term433784.getClass(), "last", null);
        setField(term433784, term433784.getClass(), "propListHead", null);
        setIntField(term433784, term433784.getClass(), "sourcePosition", 0);
        setField(term433784, term433784.getClass(), "jsType", null);
        setField(term433784, term433784.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term433613;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term433521, args);
        assertTrue(recursiveEquals(term433521, term433834));
        assertTrue(recursiveEquals(term433613, term433835));
        assertTrue(recursiveEquals(retValue, term433784));
    }

};


