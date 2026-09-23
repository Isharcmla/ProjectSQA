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

public class PeepholeFoldConstants_optimizeSubtree_16065069931799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term699767;
     Object term699859;
     Object term700424;
     Object term700425;
     Object term700361;

    public PeepholeFoldConstants_optimizeSubtree_16065069931799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term699767 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term699859 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term699945 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term699859, term699859.getClass(), "type", 32);
        setField(term699859, term699859.getClass(), "first", term699945);
        term700424 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term700424, term700424.getClass(), "currentTraversal", null);
        term700425 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term700426 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term700425, term700425.getClass(), "number", 0.0);
        setIntField(term700425, term700425.getClass(), "type", 32);
        setField(term700425, term700425.getClass(), "next", null);
        setField(term700426, term700426.getClass(), "functionName", null);
        setBooleanField(term700426, term700426.getClass(), "itsNeedsActivation", false);
        setIntField(term700426, term700426.getClass(), "itsFunctionType", 0);
        setBooleanField(term700426, term700426.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term700426, term700426.getClass(), "encodedSourceStart", 0);
        setIntField(term700426, term700426.getClass(), "encodedSourceEnd", 0);
        setField(term700426, term700426.getClass(), "sourceName", null);
        setIntField(term700426, term700426.getClass(), "baseLineno", 0);
        setIntField(term700426, term700426.getClass(), "endLineno", 0);
        setField(term700426, term700426.getClass(), "functions", null);
        setField(term700426, term700426.getClass(), "regexps", null);
        setField(term700426, term700426.getClass(), "itsVariables", null);
        setField(term700426, term700426.getClass(), "itsConst", null);
        setField(term700426, term700426.getClass(), "itsVariableNames", null);
        setIntField(term700426, term700426.getClass(), "varStart", 0);
        setField(term700426, term700426.getClass(), "compilerData", null);
        setIntField(term700426, term700426.getClass(), "type", 0);
        setField(term700426, term700426.getClass(), "next", null);
        setField(term700426, term700426.getClass(), "first", null);
        setField(term700426, term700426.getClass(), "last", null);
        setField(term700426, term700426.getClass(), "propListHead", null);
        setIntField(term700426, term700426.getClass(), "sourcePosition", 0);
        setField(term700426, term700426.getClass(), "jsType", null);
        setField(term700426, term700426.getClass(), "parent", null);
        setField(term700425, term700425.getClass(), "first", term700426);
        setField(term700425, term700425.getClass(), "last", null);
        setField(term700425, term700425.getClass(), "propListHead", null);
        setIntField(term700425, term700425.getClass(), "sourcePosition", 0);
        setField(term700425, term700425.getClass(), "jsType", null);
        setField(term700425, term700425.getClass(), "parent", null);
        term700361 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term700364 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term700361, term700361.getClass(), "number", 0.0);
        setIntField(term700361, term700361.getClass(), "type", 32);
        setField(term700361, term700361.getClass(), "next", null);
        setField(term700364, term700364.getClass(), "functionName", null);
        setBooleanField(term700364, term700364.getClass(), "itsNeedsActivation", false);
        setIntField(term700364, term700364.getClass(), "itsFunctionType", 0);
        setBooleanField(term700364, term700364.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term700364, term700364.getClass(), "encodedSourceStart", 0);
        setIntField(term700364, term700364.getClass(), "encodedSourceEnd", 0);
        setField(term700364, term700364.getClass(), "sourceName", null);
        setIntField(term700364, term700364.getClass(), "baseLineno", 0);
        setIntField(term700364, term700364.getClass(), "endLineno", 0);
        setField(term700364, term700364.getClass(), "functions", null);
        setField(term700364, term700364.getClass(), "regexps", null);
        setField(term700364, term700364.getClass(), "itsVariables", null);
        setField(term700364, term700364.getClass(), "itsConst", null);
        setField(term700364, term700364.getClass(), "itsVariableNames", null);
        setIntField(term700364, term700364.getClass(), "varStart", 0);
        setField(term700364, term700364.getClass(), "compilerData", null);
        setIntField(term700364, term700364.getClass(), "type", 0);
        setField(term700364, term700364.getClass(), "next", null);
        setField(term700364, term700364.getClass(), "first", null);
        setField(term700364, term700364.getClass(), "last", null);
        setField(term700364, term700364.getClass(), "propListHead", null);
        setIntField(term700364, term700364.getClass(), "sourcePosition", 0);
        setField(term700364, term700364.getClass(), "jsType", null);
        setField(term700364, term700364.getClass(), "parent", null);
        setField(term700361, term700361.getClass(), "first", term700364);
        setField(term700361, term700361.getClass(), "last", null);
        setField(term700361, term700361.getClass(), "propListHead", null);
        setIntField(term700361, term700361.getClass(), "sourcePosition", 0);
        setField(term700361, term700361.getClass(), "jsType", null);
        setField(term700361, term700361.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term699859;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term699767, args);
        assertTrue(recursiveEquals(term699767, term700424));
        assertTrue(recursiveEquals(term699859, term700425));
        assertTrue(recursiveEquals(retValue, term700361));
    }

};


