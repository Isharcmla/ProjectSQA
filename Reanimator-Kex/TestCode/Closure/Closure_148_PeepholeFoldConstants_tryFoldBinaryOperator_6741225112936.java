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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term860307;
     Object term860399;
     Object term860660;
     Object term860661;
     Object term860599;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term860307 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term860399 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term860491 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term860577 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term860491, term860491.getClass(), "next", term860577);
        setIntField(term860491, term860491.getClass(), "type", 39);
        setField(term860399, term860399.getClass(), "first", term860491);
        setIntField(term860399, term860399.getClass(), "type", 11);
        term860660 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term860660, term860660.getClass(), "currentTraversal", null);
        term860661 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term860662 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term860663 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term860661, term860661.getClass(), "number", 0.0);
        setIntField(term860661, term860661.getClass(), "type", 11);
        setField(term860661, term860661.getClass(), "next", null);
        setDoubleField(term860662, term860662.getClass(), "number", 0.0);
        setIntField(term860662, term860662.getClass(), "type", 39);
        setField(term860663, term860663.getClass(), "functionName", null);
        setBooleanField(term860663, term860663.getClass(), "itsNeedsActivation", false);
        setIntField(term860663, term860663.getClass(), "itsFunctionType", 0);
        setBooleanField(term860663, term860663.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term860663, term860663.getClass(), "encodedSourceStart", 0);
        setIntField(term860663, term860663.getClass(), "encodedSourceEnd", 0);
        setField(term860663, term860663.getClass(), "sourceName", null);
        setIntField(term860663, term860663.getClass(), "baseLineno", 0);
        setIntField(term860663, term860663.getClass(), "endLineno", 0);
        setField(term860663, term860663.getClass(), "functions", null);
        setField(term860663, term860663.getClass(), "regexps", null);
        setField(term860663, term860663.getClass(), "itsVariables", null);
        setField(term860663, term860663.getClass(), "itsConst", null);
        setField(term860663, term860663.getClass(), "itsVariableNames", null);
        setIntField(term860663, term860663.getClass(), "varStart", 0);
        setField(term860663, term860663.getClass(), "compilerData", null);
        setIntField(term860663, term860663.getClass(), "type", 0);
        setField(term860663, term860663.getClass(), "next", null);
        setField(term860663, term860663.getClass(), "first", null);
        setField(term860663, term860663.getClass(), "last", null);
        setField(term860663, term860663.getClass(), "propListHead", null);
        setIntField(term860663, term860663.getClass(), "sourcePosition", 0);
        setField(term860663, term860663.getClass(), "jsType", null);
        setField(term860663, term860663.getClass(), "parent", null);
        setField(term860662, term860662.getClass(), "next", term860663);
        setField(term860662, term860662.getClass(), "first", null);
        setField(term860662, term860662.getClass(), "last", null);
        setField(term860662, term860662.getClass(), "propListHead", null);
        setIntField(term860662, term860662.getClass(), "sourcePosition", 0);
        setField(term860662, term860662.getClass(), "jsType", null);
        setField(term860662, term860662.getClass(), "parent", null);
        setField(term860661, term860661.getClass(), "first", term860662);
        setField(term860661, term860661.getClass(), "last", null);
        setField(term860661, term860661.getClass(), "propListHead", null);
        setIntField(term860661, term860661.getClass(), "sourcePosition", 0);
        setField(term860661, term860661.getClass(), "jsType", null);
        setField(term860661, term860661.getClass(), "parent", null);
        term860599 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term860602 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term860605 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term860599, term860599.getClass(), "number", 0.0);
        setIntField(term860599, term860599.getClass(), "type", 11);
        setField(term860599, term860599.getClass(), "next", null);
        setDoubleField(term860602, term860602.getClass(), "number", 0.0);
        setIntField(term860602, term860602.getClass(), "type", 39);
        setField(term860605, term860605.getClass(), "functionName", null);
        setBooleanField(term860605, term860605.getClass(), "itsNeedsActivation", false);
        setIntField(term860605, term860605.getClass(), "itsFunctionType", 0);
        setBooleanField(term860605, term860605.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term860605, term860605.getClass(), "encodedSourceStart", 0);
        setIntField(term860605, term860605.getClass(), "encodedSourceEnd", 0);
        setField(term860605, term860605.getClass(), "sourceName", null);
        setIntField(term860605, term860605.getClass(), "baseLineno", 0);
        setIntField(term860605, term860605.getClass(), "endLineno", 0);
        setField(term860605, term860605.getClass(), "functions", null);
        setField(term860605, term860605.getClass(), "regexps", null);
        setField(term860605, term860605.getClass(), "itsVariables", null);
        setField(term860605, term860605.getClass(), "itsConst", null);
        setField(term860605, term860605.getClass(), "itsVariableNames", null);
        setIntField(term860605, term860605.getClass(), "varStart", 0);
        setField(term860605, term860605.getClass(), "compilerData", null);
        setIntField(term860605, term860605.getClass(), "type", 0);
        setField(term860605, term860605.getClass(), "next", null);
        setField(term860605, term860605.getClass(), "first", null);
        setField(term860605, term860605.getClass(), "last", null);
        setField(term860605, term860605.getClass(), "propListHead", null);
        setIntField(term860605, term860605.getClass(), "sourcePosition", 0);
        setField(term860605, term860605.getClass(), "jsType", null);
        setField(term860605, term860605.getClass(), "parent", null);
        setField(term860602, term860602.getClass(), "next", term860605);
        setField(term860602, term860602.getClass(), "first", null);
        setField(term860602, term860602.getClass(), "last", null);
        setField(term860602, term860602.getClass(), "propListHead", null);
        setIntField(term860602, term860602.getClass(), "sourcePosition", 0);
        setField(term860602, term860602.getClass(), "jsType", null);
        setField(term860602, term860602.getClass(), "parent", null);
        setField(term860599, term860599.getClass(), "first", term860602);
        setField(term860599, term860599.getClass(), "last", null);
        setField(term860599, term860599.getClass(), "propListHead", null);
        setIntField(term860599, term860599.getClass(), "sourcePosition", 0);
        setField(term860599, term860599.getClass(), "jsType", null);
        setField(term860599, term860599.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term860399;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term860307, args);
        assertTrue(recursiveEquals(term860307, term860660));
        assertTrue(recursiveEquals(term860399, term860661));
        assertTrue(recursiveEquals(retValue, term860599));
    }

};


