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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term872656;
     Object term872748;
     Object term873206;
     Object term873207;
     Object term873125;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term872656 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term872748 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term872834 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term872926 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term872926, term872926.getClass(), "type", 40);
        setField(term872926, term872926.getClass(), "str", "length");
        setField(term872834, term872834.getClass(), "next", term872926);
        setField(term872748, term872748.getClass(), "first", term872834);
        setIntField(term872748, term872748.getClass(), "type", 33);
        term873206 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term873206, term873206.getClass(), "currentTraversal", null);
        term873207 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term873208 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term873209 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term873207, term873207.getClass(), "str", null);
        setIntField(term873207, term873207.getClass(), "type", 33);
        setField(term873207, term873207.getClass(), "next", null);
        setField(term873208, term873208.getClass(), "functionName", null);
        setBooleanField(term873208, term873208.getClass(), "itsNeedsActivation", false);
        setIntField(term873208, term873208.getClass(), "itsFunctionType", 0);
        setBooleanField(term873208, term873208.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term873208, term873208.getClass(), "encodedSourceStart", 0);
        setIntField(term873208, term873208.getClass(), "encodedSourceEnd", 0);
        setField(term873208, term873208.getClass(), "sourceName", null);
        setIntField(term873208, term873208.getClass(), "baseLineno", 0);
        setIntField(term873208, term873208.getClass(), "endLineno", 0);
        setField(term873208, term873208.getClass(), "functions", null);
        setField(term873208, term873208.getClass(), "regexps", null);
        setField(term873208, term873208.getClass(), "itsVariables", null);
        setField(term873208, term873208.getClass(), "itsConst", null);
        setField(term873208, term873208.getClass(), "itsVariableNames", null);
        setIntField(term873208, term873208.getClass(), "varStart", 0);
        setField(term873208, term873208.getClass(), "compilerData", null);
        setIntField(term873208, term873208.getClass(), "type", 0);
        setField(term873209, term873209.getClass(), "str", "length");
        setIntField(term873209, term873209.getClass(), "type", 40);
        setField(term873209, term873209.getClass(), "next", null);
        setField(term873209, term873209.getClass(), "first", null);
        setField(term873209, term873209.getClass(), "last", null);
        setField(term873209, term873209.getClass(), "propListHead", null);
        setIntField(term873209, term873209.getClass(), "sourcePosition", 0);
        setField(term873209, term873209.getClass(), "jsType", null);
        setField(term873209, term873209.getClass(), "parent", null);
        setField(term873208, term873208.getClass(), "next", term873209);
        setField(term873208, term873208.getClass(), "first", null);
        setField(term873208, term873208.getClass(), "last", null);
        setField(term873208, term873208.getClass(), "propListHead", null);
        setIntField(term873208, term873208.getClass(), "sourcePosition", 0);
        setField(term873208, term873208.getClass(), "jsType", null);
        setField(term873208, term873208.getClass(), "parent", null);
        setField(term873207, term873207.getClass(), "first", term873208);
        setField(term873207, term873207.getClass(), "last", null);
        setField(term873207, term873207.getClass(), "propListHead", null);
        setIntField(term873207, term873207.getClass(), "sourcePosition", 0);
        setField(term873207, term873207.getClass(), "jsType", null);
        setField(term873207, term873207.getClass(), "parent", null);
        term873125 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term873127 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term873137 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term873125, term873125.getClass(), "str", null);
        setIntField(term873125, term873125.getClass(), "type", 33);
        setField(term873125, term873125.getClass(), "next", null);
        setField(term873127, term873127.getClass(), "functionName", null);
        setBooleanField(term873127, term873127.getClass(), "itsNeedsActivation", false);
        setIntField(term873127, term873127.getClass(), "itsFunctionType", 0);
        setBooleanField(term873127, term873127.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term873127, term873127.getClass(), "encodedSourceStart", 0);
        setIntField(term873127, term873127.getClass(), "encodedSourceEnd", 0);
        setField(term873127, term873127.getClass(), "sourceName", null);
        setIntField(term873127, term873127.getClass(), "baseLineno", 0);
        setIntField(term873127, term873127.getClass(), "endLineno", 0);
        setField(term873127, term873127.getClass(), "functions", null);
        setField(term873127, term873127.getClass(), "regexps", null);
        setField(term873127, term873127.getClass(), "itsVariables", null);
        setField(term873127, term873127.getClass(), "itsConst", null);
        setField(term873127, term873127.getClass(), "itsVariableNames", null);
        setIntField(term873127, term873127.getClass(), "varStart", 0);
        setField(term873127, term873127.getClass(), "compilerData", null);
        setIntField(term873127, term873127.getClass(), "type", 0);
        setField(term873137, term873137.getClass(), "str", "length");
        setIntField(term873137, term873137.getClass(), "type", 40);
        setField(term873137, term873137.getClass(), "next", null);
        setField(term873137, term873137.getClass(), "first", null);
        setField(term873137, term873137.getClass(), "last", null);
        setField(term873137, term873137.getClass(), "propListHead", null);
        setIntField(term873137, term873137.getClass(), "sourcePosition", 0);
        setField(term873137, term873137.getClass(), "jsType", null);
        setField(term873137, term873137.getClass(), "parent", null);
        setField(term873127, term873127.getClass(), "next", term873137);
        setField(term873127, term873127.getClass(), "first", null);
        setField(term873127, term873127.getClass(), "last", null);
        setField(term873127, term873127.getClass(), "propListHead", null);
        setIntField(term873127, term873127.getClass(), "sourcePosition", 0);
        setField(term873127, term873127.getClass(), "jsType", null);
        setField(term873127, term873127.getClass(), "parent", null);
        setField(term873125, term873125.getClass(), "first", term873127);
        setField(term873125, term873125.getClass(), "last", null);
        setField(term873125, term873125.getClass(), "propListHead", null);
        setIntField(term873125, term873125.getClass(), "sourcePosition", 0);
        setField(term873125, term873125.getClass(), "jsType", null);
        setField(term873125, term873125.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term872748;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term872656, args);
        assertTrue(recursiveEquals(term872656, term873206));
        assertTrue(recursiveEquals(term872748, term873207));
        assertTrue(recursiveEquals(retValue, term873125));
    }

};


