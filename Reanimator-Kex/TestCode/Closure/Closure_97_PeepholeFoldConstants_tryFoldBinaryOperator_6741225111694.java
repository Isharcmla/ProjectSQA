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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term671167;
     Object term671259;
     Object term671538;
     Object term671539;
     Object term671454;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term671167 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term671259 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term671345 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term671431 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term671345, term671345.getClass(), "next", term671431);
        setIntField(term671345, term671345.getClass(), "type", 102);
        setField(term671259, term671259.getClass(), "first", term671345);
        setIntField(term671259, term671259.getClass(), "type", 14);
        term671538 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term671538, term671538.getClass(), "currentTraversal", null);
        term671539 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term671540 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term671541 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term671539, term671539.getClass(), "str", null);
        setIntField(term671539, term671539.getClass(), "type", 14);
        setField(term671539, term671539.getClass(), "next", null);
        setField(term671540, term671540.getClass(), "functionName", null);
        setBooleanField(term671540, term671540.getClass(), "itsNeedsActivation", false);
        setIntField(term671540, term671540.getClass(), "itsFunctionType", 0);
        setBooleanField(term671540, term671540.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term671540, term671540.getClass(), "encodedSourceStart", 0);
        setIntField(term671540, term671540.getClass(), "encodedSourceEnd", 0);
        setField(term671540, term671540.getClass(), "sourceName", null);
        setIntField(term671540, term671540.getClass(), "baseLineno", 0);
        setIntField(term671540, term671540.getClass(), "endLineno", 0);
        setField(term671540, term671540.getClass(), "functions", null);
        setField(term671540, term671540.getClass(), "regexps", null);
        setField(term671540, term671540.getClass(), "itsVariables", null);
        setField(term671540, term671540.getClass(), "itsConst", null);
        setField(term671540, term671540.getClass(), "itsVariableNames", null);
        setIntField(term671540, term671540.getClass(), "varStart", 0);
        setField(term671540, term671540.getClass(), "compilerData", null);
        setIntField(term671540, term671540.getClass(), "type", 102);
        setField(term671541, term671541.getClass(), "functionName", null);
        setBooleanField(term671541, term671541.getClass(), "itsNeedsActivation", false);
        setIntField(term671541, term671541.getClass(), "itsFunctionType", 0);
        setBooleanField(term671541, term671541.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term671541, term671541.getClass(), "encodedSourceStart", 0);
        setIntField(term671541, term671541.getClass(), "encodedSourceEnd", 0);
        setField(term671541, term671541.getClass(), "sourceName", null);
        setIntField(term671541, term671541.getClass(), "baseLineno", 0);
        setIntField(term671541, term671541.getClass(), "endLineno", 0);
        setField(term671541, term671541.getClass(), "functions", null);
        setField(term671541, term671541.getClass(), "regexps", null);
        setField(term671541, term671541.getClass(), "itsVariables", null);
        setField(term671541, term671541.getClass(), "itsConst", null);
        setField(term671541, term671541.getClass(), "itsVariableNames", null);
        setIntField(term671541, term671541.getClass(), "varStart", 0);
        setField(term671541, term671541.getClass(), "compilerData", null);
        setIntField(term671541, term671541.getClass(), "type", 0);
        setField(term671541, term671541.getClass(), "next", null);
        setField(term671541, term671541.getClass(), "first", null);
        setField(term671541, term671541.getClass(), "last", null);
        setField(term671541, term671541.getClass(), "propListHead", null);
        setIntField(term671541, term671541.getClass(), "sourcePosition", 0);
        setField(term671541, term671541.getClass(), "jsType", null);
        setField(term671541, term671541.getClass(), "parent", null);
        setField(term671540, term671540.getClass(), "next", term671541);
        setField(term671540, term671540.getClass(), "first", null);
        setField(term671540, term671540.getClass(), "last", null);
        setField(term671540, term671540.getClass(), "propListHead", null);
        setIntField(term671540, term671540.getClass(), "sourcePosition", 0);
        setField(term671540, term671540.getClass(), "jsType", null);
        setField(term671540, term671540.getClass(), "parent", null);
        setField(term671539, term671539.getClass(), "first", term671540);
        setField(term671539, term671539.getClass(), "last", null);
        setField(term671539, term671539.getClass(), "propListHead", null);
        setIntField(term671539, term671539.getClass(), "sourcePosition", 0);
        setField(term671539, term671539.getClass(), "jsType", null);
        setField(term671539, term671539.getClass(), "parent", null);
        term671454 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term671456 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term671466 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term671454, term671454.getClass(), "str", null);
        setIntField(term671454, term671454.getClass(), "type", 14);
        setField(term671454, term671454.getClass(), "next", null);
        setField(term671456, term671456.getClass(), "functionName", null);
        setBooleanField(term671456, term671456.getClass(), "itsNeedsActivation", false);
        setIntField(term671456, term671456.getClass(), "itsFunctionType", 0);
        setBooleanField(term671456, term671456.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term671456, term671456.getClass(), "encodedSourceStart", 0);
        setIntField(term671456, term671456.getClass(), "encodedSourceEnd", 0);
        setField(term671456, term671456.getClass(), "sourceName", null);
        setIntField(term671456, term671456.getClass(), "baseLineno", 0);
        setIntField(term671456, term671456.getClass(), "endLineno", 0);
        setField(term671456, term671456.getClass(), "functions", null);
        setField(term671456, term671456.getClass(), "regexps", null);
        setField(term671456, term671456.getClass(), "itsVariables", null);
        setField(term671456, term671456.getClass(), "itsConst", null);
        setField(term671456, term671456.getClass(), "itsVariableNames", null);
        setIntField(term671456, term671456.getClass(), "varStart", 0);
        setField(term671456, term671456.getClass(), "compilerData", null);
        setIntField(term671456, term671456.getClass(), "type", 102);
        setField(term671466, term671466.getClass(), "functionName", null);
        setBooleanField(term671466, term671466.getClass(), "itsNeedsActivation", false);
        setIntField(term671466, term671466.getClass(), "itsFunctionType", 0);
        setBooleanField(term671466, term671466.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term671466, term671466.getClass(), "encodedSourceStart", 0);
        setIntField(term671466, term671466.getClass(), "encodedSourceEnd", 0);
        setField(term671466, term671466.getClass(), "sourceName", null);
        setIntField(term671466, term671466.getClass(), "baseLineno", 0);
        setIntField(term671466, term671466.getClass(), "endLineno", 0);
        setField(term671466, term671466.getClass(), "functions", null);
        setField(term671466, term671466.getClass(), "regexps", null);
        setField(term671466, term671466.getClass(), "itsVariables", null);
        setField(term671466, term671466.getClass(), "itsConst", null);
        setField(term671466, term671466.getClass(), "itsVariableNames", null);
        setIntField(term671466, term671466.getClass(), "varStart", 0);
        setField(term671466, term671466.getClass(), "compilerData", null);
        setIntField(term671466, term671466.getClass(), "type", 0);
        setField(term671466, term671466.getClass(), "next", null);
        setField(term671466, term671466.getClass(), "first", null);
        setField(term671466, term671466.getClass(), "last", null);
        setField(term671466, term671466.getClass(), "propListHead", null);
        setIntField(term671466, term671466.getClass(), "sourcePosition", 0);
        setField(term671466, term671466.getClass(), "jsType", null);
        setField(term671466, term671466.getClass(), "parent", null);
        setField(term671456, term671456.getClass(), "next", term671466);
        setField(term671456, term671456.getClass(), "first", null);
        setField(term671456, term671456.getClass(), "last", null);
        setField(term671456, term671456.getClass(), "propListHead", null);
        setIntField(term671456, term671456.getClass(), "sourcePosition", 0);
        setField(term671456, term671456.getClass(), "jsType", null);
        setField(term671456, term671456.getClass(), "parent", null);
        setField(term671454, term671454.getClass(), "first", term671456);
        setField(term671454, term671454.getClass(), "last", null);
        setField(term671454, term671454.getClass(), "propListHead", null);
        setIntField(term671454, term671454.getClass(), "sourcePosition", 0);
        setField(term671454, term671454.getClass(), "jsType", null);
        setField(term671454, term671454.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term671259;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term671167, args);
        assertTrue(recursiveEquals(term671167, term671538));
        assertTrue(recursiveEquals(term671259, term671539));
        assertTrue(recursiveEquals(retValue, term671454));
    }

};


