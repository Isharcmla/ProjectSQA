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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141177;
     Object term141263;
     Object term141799;
     Object term141800;
     Object term141762;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141177 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term141263 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term141333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term141263, term141263.getClass(), "first", term141263);
        setField(term141263, term141263.getClass(), "next", term141333);
        setIntField(term141263, term141263.getClass(), "type", 22);
        term141799 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term141799, term141799.getClass(), "currentTraversal", null);
        term141800 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term141801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term141800, term141800.getClass(), "functionName", null);
        setBooleanField(term141800, term141800.getClass(), "itsNeedsActivation", false);
        setIntField(term141800, term141800.getClass(), "itsFunctionType", 0);
        setBooleanField(term141800, term141800.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term141800, term141800.getClass(), "encodedSourceStart", 0);
        setIntField(term141800, term141800.getClass(), "encodedSourceEnd", 0);
        setField(term141800, term141800.getClass(), "sourceName", null);
        setIntField(term141800, term141800.getClass(), "baseLineno", 0);
        setIntField(term141800, term141800.getClass(), "endLineno", 0);
        setField(term141800, term141800.getClass(), "functions", null);
        setField(term141800, term141800.getClass(), "regexps", null);
        setField(term141800, term141800.getClass(), "itsVariables", null);
        setField(term141800, term141800.getClass(), "itsConst", null);
        setField(term141800, term141800.getClass(), "itsVariableNames", null);
        setIntField(term141800, term141800.getClass(), "varStart", 0);
        setField(term141800, term141800.getClass(), "compilerData", null);
        setIntField(term141800, term141800.getClass(), "type", 22);
        setIntField(term141801, term141801.getClass(), "type", 0);
        setField(term141801, term141801.getClass(), "next", null);
        setField(term141801, term141801.getClass(), "first", null);
        setField(term141801, term141801.getClass(), "last", null);
        setField(term141801, term141801.getClass(), "propListHead", null);
        setIntField(term141801, term141801.getClass(), "sourcePosition", 0);
        setField(term141801, term141801.getClass(), "jsType", null);
        setField(term141801, term141801.getClass(), "parent", null);
        setField(term141800, term141800.getClass(), "next", term141801);
        setField(term141800, term141800.getClass(), "first", term141800);
        setField(term141800, term141800.getClass(), "last", null);
        setField(term141800, term141800.getClass(), "propListHead", null);
        setIntField(term141800, term141800.getClass(), "sourcePosition", 0);
        setField(term141800, term141800.getClass(), "jsType", null);
        setField(term141800, term141800.getClass(), "parent", null);
        term141762 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term141772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term141762, term141762.getClass(), "functionName", null);
        setBooleanField(term141762, term141762.getClass(), "itsNeedsActivation", false);
        setIntField(term141762, term141762.getClass(), "itsFunctionType", 0);
        setBooleanField(term141762, term141762.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term141762, term141762.getClass(), "encodedSourceStart", 0);
        setIntField(term141762, term141762.getClass(), "encodedSourceEnd", 0);
        setField(term141762, term141762.getClass(), "sourceName", null);
        setIntField(term141762, term141762.getClass(), "baseLineno", 0);
        setIntField(term141762, term141762.getClass(), "endLineno", 0);
        setField(term141762, term141762.getClass(), "functions", null);
        setField(term141762, term141762.getClass(), "regexps", null);
        setField(term141762, term141762.getClass(), "itsVariables", null);
        setField(term141762, term141762.getClass(), "itsConst", null);
        setField(term141762, term141762.getClass(), "itsVariableNames", null);
        setIntField(term141762, term141762.getClass(), "varStart", 0);
        setField(term141762, term141762.getClass(), "compilerData", null);
        setIntField(term141762, term141762.getClass(), "type", 22);
        setIntField(term141772, term141772.getClass(), "type", 0);
        setField(term141772, term141772.getClass(), "next", null);
        setField(term141772, term141772.getClass(), "first", null);
        setField(term141772, term141772.getClass(), "last", null);
        setField(term141772, term141772.getClass(), "propListHead", null);
        setIntField(term141772, term141772.getClass(), "sourcePosition", 0);
        setField(term141772, term141772.getClass(), "jsType", null);
        setField(term141772, term141772.getClass(), "parent", null);
        setField(term141762, term141762.getClass(), "next", term141772);
        setField(term141762, term141762.getClass(), "first", term141762);
        setField(term141762, term141762.getClass(), "last", null);
        setField(term141762, term141762.getClass(), "propListHead", null);
        setIntField(term141762, term141762.getClass(), "sourcePosition", 0);
        setField(term141762, term141762.getClass(), "jsType", null);
        setField(term141762, term141762.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term141263;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term141177, args);
        assertTrue(recursiveEquals(term141177, term141799));
        assertTrue(recursiveEquals(term141263, term141800));
        assertTrue(recursiveEquals(retValue, term141762));
    }

};


