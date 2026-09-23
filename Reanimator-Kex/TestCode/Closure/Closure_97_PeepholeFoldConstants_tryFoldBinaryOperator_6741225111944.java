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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term738748;
     Object term738840;
     Object term739062;
     Object term739063;
     Object term739011;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term738748 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term738840 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term738926 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term738996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term738926, term738926.getClass(), "next", term738996);
        setIntField(term738926, term738926.getClass(), "type", 39);
        setField(term738840, term738840.getClass(), "first", term738926);
        setIntField(term738840, term738840.getClass(), "type", 11);
        term739062 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term739062, term739062.getClass(), "currentTraversal", null);
        term739063 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term739064 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term739065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term739063, term739063.getClass(), "number", 0.0);
        setIntField(term739063, term739063.getClass(), "type", 11);
        setField(term739063, term739063.getClass(), "next", null);
        setField(term739064, term739064.getClass(), "functionName", null);
        setBooleanField(term739064, term739064.getClass(), "itsNeedsActivation", false);
        setIntField(term739064, term739064.getClass(), "itsFunctionType", 0);
        setBooleanField(term739064, term739064.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term739064, term739064.getClass(), "encodedSourceStart", 0);
        setIntField(term739064, term739064.getClass(), "encodedSourceEnd", 0);
        setField(term739064, term739064.getClass(), "sourceName", null);
        setIntField(term739064, term739064.getClass(), "baseLineno", 0);
        setIntField(term739064, term739064.getClass(), "endLineno", 0);
        setField(term739064, term739064.getClass(), "functions", null);
        setField(term739064, term739064.getClass(), "regexps", null);
        setField(term739064, term739064.getClass(), "itsVariables", null);
        setField(term739064, term739064.getClass(), "itsConst", null);
        setField(term739064, term739064.getClass(), "itsVariableNames", null);
        setIntField(term739064, term739064.getClass(), "varStart", 0);
        setField(term739064, term739064.getClass(), "compilerData", null);
        setIntField(term739064, term739064.getClass(), "type", 39);
        setIntField(term739065, term739065.getClass(), "type", 0);
        setField(term739065, term739065.getClass(), "next", null);
        setField(term739065, term739065.getClass(), "first", null);
        setField(term739065, term739065.getClass(), "last", null);
        setField(term739065, term739065.getClass(), "propListHead", null);
        setIntField(term739065, term739065.getClass(), "sourcePosition", 0);
        setField(term739065, term739065.getClass(), "jsType", null);
        setField(term739065, term739065.getClass(), "parent", null);
        setField(term739064, term739064.getClass(), "next", term739065);
        setField(term739064, term739064.getClass(), "first", null);
        setField(term739064, term739064.getClass(), "last", null);
        setField(term739064, term739064.getClass(), "propListHead", null);
        setIntField(term739064, term739064.getClass(), "sourcePosition", 0);
        setField(term739064, term739064.getClass(), "jsType", null);
        setField(term739064, term739064.getClass(), "parent", null);
        setField(term739063, term739063.getClass(), "first", term739064);
        setField(term739063, term739063.getClass(), "last", null);
        setField(term739063, term739063.getClass(), "propListHead", null);
        setIntField(term739063, term739063.getClass(), "sourcePosition", 0);
        setField(term739063, term739063.getClass(), "jsType", null);
        setField(term739063, term739063.getClass(), "parent", null);
        term739011 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term739014 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term739024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term739011, term739011.getClass(), "number", 0.0);
        setIntField(term739011, term739011.getClass(), "type", 11);
        setField(term739011, term739011.getClass(), "next", null);
        setField(term739014, term739014.getClass(), "functionName", null);
        setBooleanField(term739014, term739014.getClass(), "itsNeedsActivation", false);
        setIntField(term739014, term739014.getClass(), "itsFunctionType", 0);
        setBooleanField(term739014, term739014.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term739014, term739014.getClass(), "encodedSourceStart", 0);
        setIntField(term739014, term739014.getClass(), "encodedSourceEnd", 0);
        setField(term739014, term739014.getClass(), "sourceName", null);
        setIntField(term739014, term739014.getClass(), "baseLineno", 0);
        setIntField(term739014, term739014.getClass(), "endLineno", 0);
        setField(term739014, term739014.getClass(), "functions", null);
        setField(term739014, term739014.getClass(), "regexps", null);
        setField(term739014, term739014.getClass(), "itsVariables", null);
        setField(term739014, term739014.getClass(), "itsConst", null);
        setField(term739014, term739014.getClass(), "itsVariableNames", null);
        setIntField(term739014, term739014.getClass(), "varStart", 0);
        setField(term739014, term739014.getClass(), "compilerData", null);
        setIntField(term739014, term739014.getClass(), "type", 39);
        setIntField(term739024, term739024.getClass(), "type", 0);
        setField(term739024, term739024.getClass(), "next", null);
        setField(term739024, term739024.getClass(), "first", null);
        setField(term739024, term739024.getClass(), "last", null);
        setField(term739024, term739024.getClass(), "propListHead", null);
        setIntField(term739024, term739024.getClass(), "sourcePosition", 0);
        setField(term739024, term739024.getClass(), "jsType", null);
        setField(term739024, term739024.getClass(), "parent", null);
        setField(term739014, term739014.getClass(), "next", term739024);
        setField(term739014, term739014.getClass(), "first", null);
        setField(term739014, term739014.getClass(), "last", null);
        setField(term739014, term739014.getClass(), "propListHead", null);
        setIntField(term739014, term739014.getClass(), "sourcePosition", 0);
        setField(term739014, term739014.getClass(), "jsType", null);
        setField(term739014, term739014.getClass(), "parent", null);
        setField(term739011, term739011.getClass(), "first", term739014);
        setField(term739011, term739011.getClass(), "last", null);
        setField(term739011, term739011.getClass(), "propListHead", null);
        setIntField(term739011, term739011.getClass(), "sourcePosition", 0);
        setField(term739011, term739011.getClass(), "jsType", null);
        setField(term739011, term739011.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term738840;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term738748, args);
        assertTrue(recursiveEquals(term738748, term739062));
        assertTrue(recursiveEquals(term738840, term739063));
        assertTrue(recursiveEquals(retValue, term739011));
    }

};


