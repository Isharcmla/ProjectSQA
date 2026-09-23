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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693586;
     Object term693678;
     Object term693898;
     Object term693899;
     Object term693849;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term693586 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term693678 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term693764 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term693834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term693764, term693764.getClass(), "next", term693834);
        setField(term693678, term693678.getClass(), "first", term693764);
        setIntField(term693678, term693678.getClass(), "type", 33);
        term693898 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term693898, term693898.getClass(), "currentTraversal", null);
        term693899 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term693900 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term693901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term693899, term693899.getClass(), "number", 0.0);
        setIntField(term693899, term693899.getClass(), "type", 33);
        setField(term693899, term693899.getClass(), "next", null);
        setField(term693900, term693900.getClass(), "functionName", null);
        setBooleanField(term693900, term693900.getClass(), "itsNeedsActivation", false);
        setIntField(term693900, term693900.getClass(), "itsFunctionType", 0);
        setBooleanField(term693900, term693900.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term693900, term693900.getClass(), "encodedSourceStart", 0);
        setIntField(term693900, term693900.getClass(), "encodedSourceEnd", 0);
        setField(term693900, term693900.getClass(), "sourceName", null);
        setIntField(term693900, term693900.getClass(), "baseLineno", 0);
        setIntField(term693900, term693900.getClass(), "endLineno", 0);
        setField(term693900, term693900.getClass(), "functions", null);
        setField(term693900, term693900.getClass(), "regexps", null);
        setField(term693900, term693900.getClass(), "itsVariables", null);
        setField(term693900, term693900.getClass(), "itsConst", null);
        setField(term693900, term693900.getClass(), "itsVariableNames", null);
        setIntField(term693900, term693900.getClass(), "varStart", 0);
        setField(term693900, term693900.getClass(), "compilerData", null);
        setIntField(term693900, term693900.getClass(), "type", 0);
        setIntField(term693901, term693901.getClass(), "type", 0);
        setField(term693901, term693901.getClass(), "next", null);
        setField(term693901, term693901.getClass(), "first", null);
        setField(term693901, term693901.getClass(), "last", null);
        setField(term693901, term693901.getClass(), "propListHead", null);
        setIntField(term693901, term693901.getClass(), "sourcePosition", 0);
        setField(term693901, term693901.getClass(), "jsType", null);
        setField(term693901, term693901.getClass(), "parent", null);
        setField(term693900, term693900.getClass(), "next", term693901);
        setField(term693900, term693900.getClass(), "first", null);
        setField(term693900, term693900.getClass(), "last", null);
        setField(term693900, term693900.getClass(), "propListHead", null);
        setIntField(term693900, term693900.getClass(), "sourcePosition", 0);
        setField(term693900, term693900.getClass(), "jsType", null);
        setField(term693900, term693900.getClass(), "parent", null);
        setField(term693899, term693899.getClass(), "first", term693900);
        setField(term693899, term693899.getClass(), "last", null);
        setField(term693899, term693899.getClass(), "propListHead", null);
        setIntField(term693899, term693899.getClass(), "sourcePosition", 0);
        setField(term693899, term693899.getClass(), "jsType", null);
        setField(term693899, term693899.getClass(), "parent", null);
        term693849 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term693852 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term693862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term693849, term693849.getClass(), "number", 0.0);
        setIntField(term693849, term693849.getClass(), "type", 33);
        setField(term693849, term693849.getClass(), "next", null);
        setField(term693852, term693852.getClass(), "functionName", null);
        setBooleanField(term693852, term693852.getClass(), "itsNeedsActivation", false);
        setIntField(term693852, term693852.getClass(), "itsFunctionType", 0);
        setBooleanField(term693852, term693852.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term693852, term693852.getClass(), "encodedSourceStart", 0);
        setIntField(term693852, term693852.getClass(), "encodedSourceEnd", 0);
        setField(term693852, term693852.getClass(), "sourceName", null);
        setIntField(term693852, term693852.getClass(), "baseLineno", 0);
        setIntField(term693852, term693852.getClass(), "endLineno", 0);
        setField(term693852, term693852.getClass(), "functions", null);
        setField(term693852, term693852.getClass(), "regexps", null);
        setField(term693852, term693852.getClass(), "itsVariables", null);
        setField(term693852, term693852.getClass(), "itsConst", null);
        setField(term693852, term693852.getClass(), "itsVariableNames", null);
        setIntField(term693852, term693852.getClass(), "varStart", 0);
        setField(term693852, term693852.getClass(), "compilerData", null);
        setIntField(term693852, term693852.getClass(), "type", 0);
        setIntField(term693862, term693862.getClass(), "type", 0);
        setField(term693862, term693862.getClass(), "next", null);
        setField(term693862, term693862.getClass(), "first", null);
        setField(term693862, term693862.getClass(), "last", null);
        setField(term693862, term693862.getClass(), "propListHead", null);
        setIntField(term693862, term693862.getClass(), "sourcePosition", 0);
        setField(term693862, term693862.getClass(), "jsType", null);
        setField(term693862, term693862.getClass(), "parent", null);
        setField(term693852, term693852.getClass(), "next", term693862);
        setField(term693852, term693852.getClass(), "first", null);
        setField(term693852, term693852.getClass(), "last", null);
        setField(term693852, term693852.getClass(), "propListHead", null);
        setIntField(term693852, term693852.getClass(), "sourcePosition", 0);
        setField(term693852, term693852.getClass(), "jsType", null);
        setField(term693852, term693852.getClass(), "parent", null);
        setField(term693849, term693849.getClass(), "first", term693852);
        setField(term693849, term693849.getClass(), "last", null);
        setField(term693849, term693849.getClass(), "propListHead", null);
        setIntField(term693849, term693849.getClass(), "sourcePosition", 0);
        setField(term693849, term693849.getClass(), "jsType", null);
        setField(term693849, term693849.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term693678;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term693586, args);
        assertTrue(recursiveEquals(term693586, term693898));
        assertTrue(recursiveEquals(term693678, term693899));
        assertTrue(recursiveEquals(retValue, term693849));
    }

};


