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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term948434;
     Object term948526;
     Object term949449;
     Object term949450;
     Object term949342;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term948434 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term948526 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term948618 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term948710 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term948796 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term948710, term948710.getClass(), "type", 47);
        setField(term948618, term948618.getClass(), "next", term948710);
        setIntField(term948618, term948618.getClass(), "type", 0);
        setField(term948526, term948526.getClass(), "first", term948618);
        setIntField(term948526, term948526.getClass(), "type", 101);
        setField(term948526, term948526.getClass(), "parent", term948796);
        term949449 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term949449, term949449.getClass(), "currentTraversal", null);
        term949450 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term949451 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term949452 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term949453 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term949450, term949450.getClass(), "number", 0.0);
        setIntField(term949450, term949450.getClass(), "type", 101);
        setField(term949450, term949450.getClass(), "next", null);
        setDoubleField(term949451, term949451.getClass(), "number", 0.0);
        setIntField(term949451, term949451.getClass(), "type", 0);
        setDoubleField(term949452, term949452.getClass(), "number", 0.0);
        setIntField(term949452, term949452.getClass(), "type", 47);
        setField(term949452, term949452.getClass(), "next", null);
        setField(term949452, term949452.getClass(), "first", null);
        setField(term949452, term949452.getClass(), "last", null);
        setField(term949452, term949452.getClass(), "propListHead", null);
        setIntField(term949452, term949452.getClass(), "sourcePosition", 0);
        setField(term949452, term949452.getClass(), "jsType", null);
        setField(term949452, term949452.getClass(), "parent", null);
        setField(term949451, term949451.getClass(), "next", term949452);
        setField(term949451, term949451.getClass(), "first", null);
        setField(term949451, term949451.getClass(), "last", null);
        setField(term949451, term949451.getClass(), "propListHead", null);
        setIntField(term949451, term949451.getClass(), "sourcePosition", 0);
        setField(term949451, term949451.getClass(), "jsType", null);
        setField(term949451, term949451.getClass(), "parent", null);
        setField(term949450, term949450.getClass(), "first", term949451);
        setField(term949450, term949450.getClass(), "last", null);
        setField(term949450, term949450.getClass(), "propListHead", null);
        setIntField(term949450, term949450.getClass(), "sourcePosition", 0);
        setField(term949450, term949450.getClass(), "jsType", null);
        setField(term949453, term949453.getClass(), "functionName", null);
        setBooleanField(term949453, term949453.getClass(), "itsNeedsActivation", false);
        setIntField(term949453, term949453.getClass(), "itsFunctionType", 0);
        setBooleanField(term949453, term949453.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term949453, term949453.getClass(), "encodedSourceStart", 0);
        setIntField(term949453, term949453.getClass(), "encodedSourceEnd", 0);
        setField(term949453, term949453.getClass(), "sourceName", null);
        setIntField(term949453, term949453.getClass(), "baseLineno", 0);
        setIntField(term949453, term949453.getClass(), "endLineno", 0);
        setField(term949453, term949453.getClass(), "functions", null);
        setField(term949453, term949453.getClass(), "regexps", null);
        setField(term949453, term949453.getClass(), "itsVariables", null);
        setField(term949453, term949453.getClass(), "itsConst", null);
        setField(term949453, term949453.getClass(), "itsVariableNames", null);
        setIntField(term949453, term949453.getClass(), "varStart", 0);
        setField(term949453, term949453.getClass(), "compilerData", null);
        setIntField(term949453, term949453.getClass(), "type", 0);
        setField(term949453, term949453.getClass(), "next", null);
        setField(term949453, term949453.getClass(), "first", null);
        setField(term949453, term949453.getClass(), "last", null);
        setField(term949453, term949453.getClass(), "propListHead", null);
        setIntField(term949453, term949453.getClass(), "sourcePosition", 0);
        setField(term949453, term949453.getClass(), "jsType", null);
        setField(term949453, term949453.getClass(), "parent", null);
        setField(term949450, term949450.getClass(), "parent", term949453);
        term949342 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term949345 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term949348 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term949354 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term949342, term949342.getClass(), "number", 0.0);
        setIntField(term949342, term949342.getClass(), "type", 101);
        setField(term949342, term949342.getClass(), "next", null);
        setDoubleField(term949345, term949345.getClass(), "number", 0.0);
        setIntField(term949345, term949345.getClass(), "type", 0);
        setDoubleField(term949348, term949348.getClass(), "number", 0.0);
        setIntField(term949348, term949348.getClass(), "type", 47);
        setField(term949348, term949348.getClass(), "next", null);
        setField(term949348, term949348.getClass(), "first", null);
        setField(term949348, term949348.getClass(), "last", null);
        setField(term949348, term949348.getClass(), "propListHead", null);
        setIntField(term949348, term949348.getClass(), "sourcePosition", 0);
        setField(term949348, term949348.getClass(), "jsType", null);
        setField(term949348, term949348.getClass(), "parent", null);
        setField(term949345, term949345.getClass(), "next", term949348);
        setField(term949345, term949345.getClass(), "first", null);
        setField(term949345, term949345.getClass(), "last", null);
        setField(term949345, term949345.getClass(), "propListHead", null);
        setIntField(term949345, term949345.getClass(), "sourcePosition", 0);
        setField(term949345, term949345.getClass(), "jsType", null);
        setField(term949345, term949345.getClass(), "parent", null);
        setField(term949342, term949342.getClass(), "first", term949345);
        setField(term949342, term949342.getClass(), "last", null);
        setField(term949342, term949342.getClass(), "propListHead", null);
        setIntField(term949342, term949342.getClass(), "sourcePosition", 0);
        setField(term949342, term949342.getClass(), "jsType", null);
        setField(term949354, term949354.getClass(), "functionName", null);
        setBooleanField(term949354, term949354.getClass(), "itsNeedsActivation", false);
        setIntField(term949354, term949354.getClass(), "itsFunctionType", 0);
        setBooleanField(term949354, term949354.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term949354, term949354.getClass(), "encodedSourceStart", 0);
        setIntField(term949354, term949354.getClass(), "encodedSourceEnd", 0);
        setField(term949354, term949354.getClass(), "sourceName", null);
        setIntField(term949354, term949354.getClass(), "baseLineno", 0);
        setIntField(term949354, term949354.getClass(), "endLineno", 0);
        setField(term949354, term949354.getClass(), "functions", null);
        setField(term949354, term949354.getClass(), "regexps", null);
        setField(term949354, term949354.getClass(), "itsVariables", null);
        setField(term949354, term949354.getClass(), "itsConst", null);
        setField(term949354, term949354.getClass(), "itsVariableNames", null);
        setIntField(term949354, term949354.getClass(), "varStart", 0);
        setField(term949354, term949354.getClass(), "compilerData", null);
        setIntField(term949354, term949354.getClass(), "type", 0);
        setField(term949354, term949354.getClass(), "next", null);
        setField(term949354, term949354.getClass(), "first", null);
        setField(term949354, term949354.getClass(), "last", null);
        setField(term949354, term949354.getClass(), "propListHead", null);
        setIntField(term949354, term949354.getClass(), "sourcePosition", 0);
        setField(term949354, term949354.getClass(), "jsType", null);
        setField(term949354, term949354.getClass(), "parent", null);
        setField(term949342, term949342.getClass(), "parent", term949354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term948526;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term948434, args);
        assertTrue(recursiveEquals(term948434, term949449));
        assertTrue(recursiveEquals(term948526, term949450));
        assertTrue(recursiveEquals(retValue, term949342));
    }

};


