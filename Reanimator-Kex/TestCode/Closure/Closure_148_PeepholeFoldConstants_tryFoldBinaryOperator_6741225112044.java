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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550315;
     Object term550407;
     Object term550633;
     Object term550634;
     Object term550584;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term550315 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term550407 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term550493 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term550563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term550493, term550493.getClass(), "next", term550563);
        setField(term550407, term550407.getClass(), "first", term550493);
        setIntField(term550407, term550407.getClass(), "type", 33);
        term550633 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term550633, term550633.getClass(), "currentTraversal", null);
        term550634 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term550635 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term550636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term550634, term550634.getClass(), "number", 0.0);
        setIntField(term550634, term550634.getClass(), "type", 33);
        setField(term550634, term550634.getClass(), "next", null);
        setField(term550635, term550635.getClass(), "functionName", null);
        setBooleanField(term550635, term550635.getClass(), "itsNeedsActivation", false);
        setIntField(term550635, term550635.getClass(), "itsFunctionType", 0);
        setBooleanField(term550635, term550635.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term550635, term550635.getClass(), "encodedSourceStart", 0);
        setIntField(term550635, term550635.getClass(), "encodedSourceEnd", 0);
        setField(term550635, term550635.getClass(), "sourceName", null);
        setIntField(term550635, term550635.getClass(), "baseLineno", 0);
        setIntField(term550635, term550635.getClass(), "endLineno", 0);
        setField(term550635, term550635.getClass(), "functions", null);
        setField(term550635, term550635.getClass(), "regexps", null);
        setField(term550635, term550635.getClass(), "itsVariables", null);
        setField(term550635, term550635.getClass(), "itsConst", null);
        setField(term550635, term550635.getClass(), "itsVariableNames", null);
        setIntField(term550635, term550635.getClass(), "varStart", 0);
        setField(term550635, term550635.getClass(), "compilerData", null);
        setIntField(term550635, term550635.getClass(), "type", 0);
        setIntField(term550636, term550636.getClass(), "type", 0);
        setField(term550636, term550636.getClass(), "next", null);
        setField(term550636, term550636.getClass(), "first", null);
        setField(term550636, term550636.getClass(), "last", null);
        setField(term550636, term550636.getClass(), "propListHead", null);
        setIntField(term550636, term550636.getClass(), "sourcePosition", 0);
        setField(term550636, term550636.getClass(), "jsType", null);
        setField(term550636, term550636.getClass(), "parent", null);
        setField(term550635, term550635.getClass(), "next", term550636);
        setField(term550635, term550635.getClass(), "first", null);
        setField(term550635, term550635.getClass(), "last", null);
        setField(term550635, term550635.getClass(), "propListHead", null);
        setIntField(term550635, term550635.getClass(), "sourcePosition", 0);
        setField(term550635, term550635.getClass(), "jsType", null);
        setField(term550635, term550635.getClass(), "parent", null);
        setField(term550634, term550634.getClass(), "first", term550635);
        setField(term550634, term550634.getClass(), "last", null);
        setField(term550634, term550634.getClass(), "propListHead", null);
        setIntField(term550634, term550634.getClass(), "sourcePosition", 0);
        setField(term550634, term550634.getClass(), "jsType", null);
        setField(term550634, term550634.getClass(), "parent", null);
        term550584 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term550587 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term550597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term550584, term550584.getClass(), "number", 0.0);
        setIntField(term550584, term550584.getClass(), "type", 33);
        setField(term550584, term550584.getClass(), "next", null);
        setField(term550587, term550587.getClass(), "functionName", null);
        setBooleanField(term550587, term550587.getClass(), "itsNeedsActivation", false);
        setIntField(term550587, term550587.getClass(), "itsFunctionType", 0);
        setBooleanField(term550587, term550587.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term550587, term550587.getClass(), "encodedSourceStart", 0);
        setIntField(term550587, term550587.getClass(), "encodedSourceEnd", 0);
        setField(term550587, term550587.getClass(), "sourceName", null);
        setIntField(term550587, term550587.getClass(), "baseLineno", 0);
        setIntField(term550587, term550587.getClass(), "endLineno", 0);
        setField(term550587, term550587.getClass(), "functions", null);
        setField(term550587, term550587.getClass(), "regexps", null);
        setField(term550587, term550587.getClass(), "itsVariables", null);
        setField(term550587, term550587.getClass(), "itsConst", null);
        setField(term550587, term550587.getClass(), "itsVariableNames", null);
        setIntField(term550587, term550587.getClass(), "varStart", 0);
        setField(term550587, term550587.getClass(), "compilerData", null);
        setIntField(term550587, term550587.getClass(), "type", 0);
        setIntField(term550597, term550597.getClass(), "type", 0);
        setField(term550597, term550597.getClass(), "next", null);
        setField(term550597, term550597.getClass(), "first", null);
        setField(term550597, term550597.getClass(), "last", null);
        setField(term550597, term550597.getClass(), "propListHead", null);
        setIntField(term550597, term550597.getClass(), "sourcePosition", 0);
        setField(term550597, term550597.getClass(), "jsType", null);
        setField(term550597, term550597.getClass(), "parent", null);
        setField(term550587, term550587.getClass(), "next", term550597);
        setField(term550587, term550587.getClass(), "first", null);
        setField(term550587, term550587.getClass(), "last", null);
        setField(term550587, term550587.getClass(), "propListHead", null);
        setIntField(term550587, term550587.getClass(), "sourcePosition", 0);
        setField(term550587, term550587.getClass(), "jsType", null);
        setField(term550587, term550587.getClass(), "parent", null);
        setField(term550584, term550584.getClass(), "first", term550587);
        setField(term550584, term550584.getClass(), "last", null);
        setField(term550584, term550584.getClass(), "propListHead", null);
        setIntField(term550584, term550584.getClass(), "sourcePosition", 0);
        setField(term550584, term550584.getClass(), "jsType", null);
        setField(term550584, term550584.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term550407;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term550315, args);
        assertTrue(recursiveEquals(term550315, term550633));
        assertTrue(recursiveEquals(term550407, term550634));
        assertTrue(recursiveEquals(retValue, term550584));
    }

};


