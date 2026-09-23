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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term724940;
     Object term725032;
     Object term725585;
     Object term725586;
     Object term725513;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term724940 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term725032 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term725118 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term725188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term725118, term725118.getClass(), "next", term725188);
        setField(term725032, term725032.getClass(), "first", term725118);
        setIntField(term725032, term725032.getClass(), "type", 21);
        term725585 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term725585, term725585.getClass(), "currentTraversal", null);
        term725586 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term725587 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term725588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term725586, term725586.getClass(), "str", null);
        setIntField(term725586, term725586.getClass(), "type", 21);
        setField(term725586, term725586.getClass(), "next", null);
        setField(term725587, term725587.getClass(), "functionName", null);
        setBooleanField(term725587, term725587.getClass(), "itsNeedsActivation", false);
        setIntField(term725587, term725587.getClass(), "itsFunctionType", 0);
        setBooleanField(term725587, term725587.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term725587, term725587.getClass(), "encodedSourceStart", 0);
        setIntField(term725587, term725587.getClass(), "encodedSourceEnd", 0);
        setField(term725587, term725587.getClass(), "sourceName", null);
        setIntField(term725587, term725587.getClass(), "baseLineno", 0);
        setIntField(term725587, term725587.getClass(), "endLineno", 0);
        setField(term725587, term725587.getClass(), "functions", null);
        setField(term725587, term725587.getClass(), "regexps", null);
        setField(term725587, term725587.getClass(), "itsVariables", null);
        setField(term725587, term725587.getClass(), "itsConst", null);
        setField(term725587, term725587.getClass(), "itsVariableNames", null);
        setIntField(term725587, term725587.getClass(), "varStart", 0);
        setField(term725587, term725587.getClass(), "compilerData", null);
        setIntField(term725587, term725587.getClass(), "type", 0);
        setIntField(term725588, term725588.getClass(), "type", 0);
        setField(term725588, term725588.getClass(), "next", null);
        setField(term725588, term725588.getClass(), "first", null);
        setField(term725588, term725588.getClass(), "last", null);
        setField(term725588, term725588.getClass(), "propListHead", null);
        setIntField(term725588, term725588.getClass(), "sourcePosition", 0);
        setField(term725588, term725588.getClass(), "jsType", null);
        setField(term725588, term725588.getClass(), "parent", null);
        setField(term725587, term725587.getClass(), "next", term725588);
        setField(term725587, term725587.getClass(), "first", null);
        setField(term725587, term725587.getClass(), "last", null);
        setField(term725587, term725587.getClass(), "propListHead", null);
        setIntField(term725587, term725587.getClass(), "sourcePosition", 0);
        setField(term725587, term725587.getClass(), "jsType", null);
        setField(term725587, term725587.getClass(), "parent", null);
        setField(term725586, term725586.getClass(), "first", term725587);
        setField(term725586, term725586.getClass(), "last", null);
        setField(term725586, term725586.getClass(), "propListHead", null);
        setIntField(term725586, term725586.getClass(), "sourcePosition", 0);
        setField(term725586, term725586.getClass(), "jsType", null);
        setField(term725586, term725586.getClass(), "parent", null);
        term725513 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term725515 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term725525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term725513, term725513.getClass(), "str", null);
        setIntField(term725513, term725513.getClass(), "type", 21);
        setField(term725513, term725513.getClass(), "next", null);
        setField(term725515, term725515.getClass(), "functionName", null);
        setBooleanField(term725515, term725515.getClass(), "itsNeedsActivation", false);
        setIntField(term725515, term725515.getClass(), "itsFunctionType", 0);
        setBooleanField(term725515, term725515.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term725515, term725515.getClass(), "encodedSourceStart", 0);
        setIntField(term725515, term725515.getClass(), "encodedSourceEnd", 0);
        setField(term725515, term725515.getClass(), "sourceName", null);
        setIntField(term725515, term725515.getClass(), "baseLineno", 0);
        setIntField(term725515, term725515.getClass(), "endLineno", 0);
        setField(term725515, term725515.getClass(), "functions", null);
        setField(term725515, term725515.getClass(), "regexps", null);
        setField(term725515, term725515.getClass(), "itsVariables", null);
        setField(term725515, term725515.getClass(), "itsConst", null);
        setField(term725515, term725515.getClass(), "itsVariableNames", null);
        setIntField(term725515, term725515.getClass(), "varStart", 0);
        setField(term725515, term725515.getClass(), "compilerData", null);
        setIntField(term725515, term725515.getClass(), "type", 0);
        setIntField(term725525, term725525.getClass(), "type", 0);
        setField(term725525, term725525.getClass(), "next", null);
        setField(term725525, term725525.getClass(), "first", null);
        setField(term725525, term725525.getClass(), "last", null);
        setField(term725525, term725525.getClass(), "propListHead", null);
        setIntField(term725525, term725525.getClass(), "sourcePosition", 0);
        setField(term725525, term725525.getClass(), "jsType", null);
        setField(term725525, term725525.getClass(), "parent", null);
        setField(term725515, term725515.getClass(), "next", term725525);
        setField(term725515, term725515.getClass(), "first", null);
        setField(term725515, term725515.getClass(), "last", null);
        setField(term725515, term725515.getClass(), "propListHead", null);
        setIntField(term725515, term725515.getClass(), "sourcePosition", 0);
        setField(term725515, term725515.getClass(), "jsType", null);
        setField(term725515, term725515.getClass(), "parent", null);
        setField(term725513, term725513.getClass(), "first", term725515);
        setField(term725513, term725513.getClass(), "last", null);
        setField(term725513, term725513.getClass(), "propListHead", null);
        setIntField(term725513, term725513.getClass(), "sourcePosition", 0);
        setField(term725513, term725513.getClass(), "jsType", null);
        setField(term725513, term725513.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term725032;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term724940, args);
        assertTrue(recursiveEquals(term724940, term725585));
        assertTrue(recursiveEquals(term725032, term725586));
        assertTrue(recursiveEquals(retValue, term725513));
    }

};


