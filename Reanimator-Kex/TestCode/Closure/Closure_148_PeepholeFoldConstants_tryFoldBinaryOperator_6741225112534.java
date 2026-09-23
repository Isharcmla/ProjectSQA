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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714959;
     Object term715051;
     Object term715297;
     Object term715298;
     Object term715228;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term714959 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term715051 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term715137 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term715207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term715137, term715137.getClass(), "next", term715207);
        setField(term715051, term715051.getClass(), "first", term715137);
        setIntField(term715051, term715051.getClass(), "type", 100);
        term715297 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term715297, term715297.getClass(), "currentTraversal", null);
        term715298 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term715299 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term715300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term715298, term715298.getClass(), "str", null);
        setIntField(term715298, term715298.getClass(), "type", 100);
        setField(term715298, term715298.getClass(), "next", null);
        setField(term715299, term715299.getClass(), "functionName", null);
        setBooleanField(term715299, term715299.getClass(), "itsNeedsActivation", false);
        setIntField(term715299, term715299.getClass(), "itsFunctionType", 0);
        setBooleanField(term715299, term715299.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term715299, term715299.getClass(), "encodedSourceStart", 0);
        setIntField(term715299, term715299.getClass(), "encodedSourceEnd", 0);
        setField(term715299, term715299.getClass(), "sourceName", null);
        setIntField(term715299, term715299.getClass(), "baseLineno", 0);
        setIntField(term715299, term715299.getClass(), "endLineno", 0);
        setField(term715299, term715299.getClass(), "functions", null);
        setField(term715299, term715299.getClass(), "regexps", null);
        setField(term715299, term715299.getClass(), "itsVariables", null);
        setField(term715299, term715299.getClass(), "itsConst", null);
        setField(term715299, term715299.getClass(), "itsVariableNames", null);
        setIntField(term715299, term715299.getClass(), "varStart", 0);
        setField(term715299, term715299.getClass(), "compilerData", null);
        setIntField(term715299, term715299.getClass(), "type", 0);
        setIntField(term715300, term715300.getClass(), "type", 0);
        setField(term715300, term715300.getClass(), "next", null);
        setField(term715300, term715300.getClass(), "first", null);
        setField(term715300, term715300.getClass(), "last", null);
        setField(term715300, term715300.getClass(), "propListHead", null);
        setIntField(term715300, term715300.getClass(), "sourcePosition", 0);
        setField(term715300, term715300.getClass(), "jsType", null);
        setField(term715300, term715300.getClass(), "parent", null);
        setField(term715299, term715299.getClass(), "next", term715300);
        setField(term715299, term715299.getClass(), "first", null);
        setField(term715299, term715299.getClass(), "last", null);
        setField(term715299, term715299.getClass(), "propListHead", null);
        setIntField(term715299, term715299.getClass(), "sourcePosition", 0);
        setField(term715299, term715299.getClass(), "jsType", null);
        setField(term715299, term715299.getClass(), "parent", null);
        setField(term715298, term715298.getClass(), "first", term715299);
        setField(term715298, term715298.getClass(), "last", null);
        setField(term715298, term715298.getClass(), "propListHead", null);
        setIntField(term715298, term715298.getClass(), "sourcePosition", 0);
        setField(term715298, term715298.getClass(), "jsType", null);
        setField(term715298, term715298.getClass(), "parent", null);
        term715228 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term715230 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term715240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term715228, term715228.getClass(), "str", null);
        setIntField(term715228, term715228.getClass(), "type", 100);
        setField(term715228, term715228.getClass(), "next", null);
        setField(term715230, term715230.getClass(), "functionName", null);
        setBooleanField(term715230, term715230.getClass(), "itsNeedsActivation", false);
        setIntField(term715230, term715230.getClass(), "itsFunctionType", 0);
        setBooleanField(term715230, term715230.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term715230, term715230.getClass(), "encodedSourceStart", 0);
        setIntField(term715230, term715230.getClass(), "encodedSourceEnd", 0);
        setField(term715230, term715230.getClass(), "sourceName", null);
        setIntField(term715230, term715230.getClass(), "baseLineno", 0);
        setIntField(term715230, term715230.getClass(), "endLineno", 0);
        setField(term715230, term715230.getClass(), "functions", null);
        setField(term715230, term715230.getClass(), "regexps", null);
        setField(term715230, term715230.getClass(), "itsVariables", null);
        setField(term715230, term715230.getClass(), "itsConst", null);
        setField(term715230, term715230.getClass(), "itsVariableNames", null);
        setIntField(term715230, term715230.getClass(), "varStart", 0);
        setField(term715230, term715230.getClass(), "compilerData", null);
        setIntField(term715230, term715230.getClass(), "type", 0);
        setIntField(term715240, term715240.getClass(), "type", 0);
        setField(term715240, term715240.getClass(), "next", null);
        setField(term715240, term715240.getClass(), "first", null);
        setField(term715240, term715240.getClass(), "last", null);
        setField(term715240, term715240.getClass(), "propListHead", null);
        setIntField(term715240, term715240.getClass(), "sourcePosition", 0);
        setField(term715240, term715240.getClass(), "jsType", null);
        setField(term715240, term715240.getClass(), "parent", null);
        setField(term715230, term715230.getClass(), "next", term715240);
        setField(term715230, term715230.getClass(), "first", null);
        setField(term715230, term715230.getClass(), "last", null);
        setField(term715230, term715230.getClass(), "propListHead", null);
        setIntField(term715230, term715230.getClass(), "sourcePosition", 0);
        setField(term715230, term715230.getClass(), "jsType", null);
        setField(term715230, term715230.getClass(), "parent", null);
        setField(term715228, term715228.getClass(), "first", term715230);
        setField(term715228, term715228.getClass(), "last", null);
        setField(term715228, term715228.getClass(), "propListHead", null);
        setIntField(term715228, term715228.getClass(), "sourcePosition", 0);
        setField(term715228, term715228.getClass(), "jsType", null);
        setField(term715228, term715228.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term715051;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term714959, args);
        assertTrue(recursiveEquals(term714959, term715297));
        assertTrue(recursiveEquals(term715051, term715298));
        assertTrue(recursiveEquals(retValue, term715228));
    }

};


