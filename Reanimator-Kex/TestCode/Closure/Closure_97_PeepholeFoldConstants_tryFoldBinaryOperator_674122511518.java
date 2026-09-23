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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138440;
     Object term138526;
     Object term138687;
     Object term138688;
     Object term138633;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138440 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term138526 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term138618 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term138526, term138526.getClass(), "first", term138526);
        setField(term138526, term138526.getClass(), "next", term138618);
        setIntField(term138526, term138526.getClass(), "type", 14);
        term138687 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term138687, term138687.getClass(), "currentTraversal", null);
        term138688 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term138689 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term138688, term138688.getClass(), "functionName", null);
        setBooleanField(term138688, term138688.getClass(), "itsNeedsActivation", false);
        setIntField(term138688, term138688.getClass(), "itsFunctionType", 0);
        setBooleanField(term138688, term138688.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term138688, term138688.getClass(), "encodedSourceStart", 0);
        setIntField(term138688, term138688.getClass(), "encodedSourceEnd", 0);
        setField(term138688, term138688.getClass(), "sourceName", null);
        setIntField(term138688, term138688.getClass(), "baseLineno", 0);
        setIntField(term138688, term138688.getClass(), "endLineno", 0);
        setField(term138688, term138688.getClass(), "functions", null);
        setField(term138688, term138688.getClass(), "regexps", null);
        setField(term138688, term138688.getClass(), "itsVariables", null);
        setField(term138688, term138688.getClass(), "itsConst", null);
        setField(term138688, term138688.getClass(), "itsVariableNames", null);
        setIntField(term138688, term138688.getClass(), "varStart", 0);
        setField(term138688, term138688.getClass(), "compilerData", null);
        setIntField(term138688, term138688.getClass(), "type", 14);
        setField(term138689, term138689.getClass(), "str", null);
        setIntField(term138689, term138689.getClass(), "type", 0);
        setField(term138689, term138689.getClass(), "next", null);
        setField(term138689, term138689.getClass(), "first", null);
        setField(term138689, term138689.getClass(), "last", null);
        setField(term138689, term138689.getClass(), "propListHead", null);
        setIntField(term138689, term138689.getClass(), "sourcePosition", 0);
        setField(term138689, term138689.getClass(), "jsType", null);
        setField(term138689, term138689.getClass(), "parent", null);
        setField(term138688, term138688.getClass(), "next", term138689);
        setField(term138688, term138688.getClass(), "first", term138688);
        setField(term138688, term138688.getClass(), "last", null);
        setField(term138688, term138688.getClass(), "propListHead", null);
        setIntField(term138688, term138688.getClass(), "sourcePosition", 0);
        setField(term138688, term138688.getClass(), "jsType", null);
        setField(term138688, term138688.getClass(), "parent", null);
        term138633 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term138643 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term138633, term138633.getClass(), "functionName", null);
        setBooleanField(term138633, term138633.getClass(), "itsNeedsActivation", false);
        setIntField(term138633, term138633.getClass(), "itsFunctionType", 0);
        setBooleanField(term138633, term138633.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term138633, term138633.getClass(), "encodedSourceStart", 0);
        setIntField(term138633, term138633.getClass(), "encodedSourceEnd", 0);
        setField(term138633, term138633.getClass(), "sourceName", null);
        setIntField(term138633, term138633.getClass(), "baseLineno", 0);
        setIntField(term138633, term138633.getClass(), "endLineno", 0);
        setField(term138633, term138633.getClass(), "functions", null);
        setField(term138633, term138633.getClass(), "regexps", null);
        setField(term138633, term138633.getClass(), "itsVariables", null);
        setField(term138633, term138633.getClass(), "itsConst", null);
        setField(term138633, term138633.getClass(), "itsVariableNames", null);
        setIntField(term138633, term138633.getClass(), "varStart", 0);
        setField(term138633, term138633.getClass(), "compilerData", null);
        setIntField(term138633, term138633.getClass(), "type", 14);
        setField(term138643, term138643.getClass(), "str", null);
        setIntField(term138643, term138643.getClass(), "type", 0);
        setField(term138643, term138643.getClass(), "next", null);
        setField(term138643, term138643.getClass(), "first", null);
        setField(term138643, term138643.getClass(), "last", null);
        setField(term138643, term138643.getClass(), "propListHead", null);
        setIntField(term138643, term138643.getClass(), "sourcePosition", 0);
        setField(term138643, term138643.getClass(), "jsType", null);
        setField(term138643, term138643.getClass(), "parent", null);
        setField(term138633, term138633.getClass(), "next", term138643);
        setField(term138633, term138633.getClass(), "first", term138633);
        setField(term138633, term138633.getClass(), "last", null);
        setField(term138633, term138633.getClass(), "propListHead", null);
        setIntField(term138633, term138633.getClass(), "sourcePosition", 0);
        setField(term138633, term138633.getClass(), "jsType", null);
        setField(term138633, term138633.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term138526;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term138440, args);
        assertTrue(recursiveEquals(term138440, term138687));
        assertTrue(recursiveEquals(term138526, term138688));
        assertTrue(recursiveEquals(retValue, term138633));
    }

};


