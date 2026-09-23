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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729638;
     Object term729724;
     Object term729889;
     Object term729890;
     Object term729832;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term729638 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term729724 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term729816 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term729724, term729724.getClass(), "first", term729724);
        setField(term729724, term729724.getClass(), "next", term729816);
        setIntField(term729724, term729724.getClass(), "type", 14);
        term729889 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term729889, term729889.getClass(), "currentTraversal", null);
        term729890 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term729891 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term729890, term729890.getClass(), "functionName", null);
        setBooleanField(term729890, term729890.getClass(), "itsNeedsActivation", false);
        setIntField(term729890, term729890.getClass(), "itsFunctionType", 0);
        setBooleanField(term729890, term729890.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term729890, term729890.getClass(), "encodedSourceStart", 0);
        setIntField(term729890, term729890.getClass(), "encodedSourceEnd", 0);
        setField(term729890, term729890.getClass(), "sourceName", null);
        setIntField(term729890, term729890.getClass(), "baseLineno", 0);
        setIntField(term729890, term729890.getClass(), "endLineno", 0);
        setField(term729890, term729890.getClass(), "functions", null);
        setField(term729890, term729890.getClass(), "regexps", null);
        setField(term729890, term729890.getClass(), "itsVariables", null);
        setField(term729890, term729890.getClass(), "itsConst", null);
        setField(term729890, term729890.getClass(), "itsVariableNames", null);
        setIntField(term729890, term729890.getClass(), "varStart", 0);
        setField(term729890, term729890.getClass(), "compilerData", null);
        setIntField(term729890, term729890.getClass(), "type", 14);
        setDoubleField(term729891, term729891.getClass(), "number", 0.0);
        setIntField(term729891, term729891.getClass(), "type", 0);
        setField(term729891, term729891.getClass(), "next", null);
        setField(term729891, term729891.getClass(), "first", null);
        setField(term729891, term729891.getClass(), "last", null);
        setField(term729891, term729891.getClass(), "propListHead", null);
        setIntField(term729891, term729891.getClass(), "sourcePosition", 0);
        setField(term729891, term729891.getClass(), "jsType", null);
        setField(term729891, term729891.getClass(), "parent", null);
        setField(term729890, term729890.getClass(), "next", term729891);
        setField(term729890, term729890.getClass(), "first", term729890);
        setField(term729890, term729890.getClass(), "last", null);
        setField(term729890, term729890.getClass(), "propListHead", null);
        setIntField(term729890, term729890.getClass(), "sourcePosition", 0);
        setField(term729890, term729890.getClass(), "jsType", null);
        setField(term729890, term729890.getClass(), "parent", null);
        term729832 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term729842 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term729832, term729832.getClass(), "functionName", null);
        setBooleanField(term729832, term729832.getClass(), "itsNeedsActivation", false);
        setIntField(term729832, term729832.getClass(), "itsFunctionType", 0);
        setBooleanField(term729832, term729832.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term729832, term729832.getClass(), "encodedSourceStart", 0);
        setIntField(term729832, term729832.getClass(), "encodedSourceEnd", 0);
        setField(term729832, term729832.getClass(), "sourceName", null);
        setIntField(term729832, term729832.getClass(), "baseLineno", 0);
        setIntField(term729832, term729832.getClass(), "endLineno", 0);
        setField(term729832, term729832.getClass(), "functions", null);
        setField(term729832, term729832.getClass(), "regexps", null);
        setField(term729832, term729832.getClass(), "itsVariables", null);
        setField(term729832, term729832.getClass(), "itsConst", null);
        setField(term729832, term729832.getClass(), "itsVariableNames", null);
        setIntField(term729832, term729832.getClass(), "varStart", 0);
        setField(term729832, term729832.getClass(), "compilerData", null);
        setIntField(term729832, term729832.getClass(), "type", 14);
        setDoubleField(term729842, term729842.getClass(), "number", 0.0);
        setIntField(term729842, term729842.getClass(), "type", 0);
        setField(term729842, term729842.getClass(), "next", null);
        setField(term729842, term729842.getClass(), "first", null);
        setField(term729842, term729842.getClass(), "last", null);
        setField(term729842, term729842.getClass(), "propListHead", null);
        setIntField(term729842, term729842.getClass(), "sourcePosition", 0);
        setField(term729842, term729842.getClass(), "jsType", null);
        setField(term729842, term729842.getClass(), "parent", null);
        setField(term729832, term729832.getClass(), "next", term729842);
        setField(term729832, term729832.getClass(), "first", term729832);
        setField(term729832, term729832.getClass(), "last", null);
        setField(term729832, term729832.getClass(), "propListHead", null);
        setIntField(term729832, term729832.getClass(), "sourcePosition", 0);
        setField(term729832, term729832.getClass(), "jsType", null);
        setField(term729832, term729832.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term729724;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term729638, args);
        assertTrue(recursiveEquals(term729638, term729889));
        assertTrue(recursiveEquals(term729724, term729890));
        assertTrue(recursiveEquals(retValue, term729832));
    }

};


