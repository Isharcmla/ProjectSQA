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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746399;
     Object term746491;
     Object term746737;
     Object term746738;
     Object term746685;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term746399 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term746491 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term746577 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term746669 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term746577, term746577.getClass(), "next", term746669);
        setIntField(term746577, term746577.getClass(), "type", 39);
        setField(term746491, term746491.getClass(), "first", term746577);
        setIntField(term746491, term746491.getClass(), "type", 11);
        term746737 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term746737, term746737.getClass(), "currentTraversal", null);
        term746738 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term746739 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term746740 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term746738, term746738.getClass(), "str", null);
        setIntField(term746738, term746738.getClass(), "type", 11);
        setField(term746738, term746738.getClass(), "next", null);
        setField(term746739, term746739.getClass(), "functionName", null);
        setBooleanField(term746739, term746739.getClass(), "itsNeedsActivation", false);
        setIntField(term746739, term746739.getClass(), "itsFunctionType", 0);
        setBooleanField(term746739, term746739.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term746739, term746739.getClass(), "encodedSourceStart", 0);
        setIntField(term746739, term746739.getClass(), "encodedSourceEnd", 0);
        setField(term746739, term746739.getClass(), "sourceName", null);
        setIntField(term746739, term746739.getClass(), "baseLineno", 0);
        setIntField(term746739, term746739.getClass(), "endLineno", 0);
        setField(term746739, term746739.getClass(), "functions", null);
        setField(term746739, term746739.getClass(), "regexps", null);
        setField(term746739, term746739.getClass(), "itsVariables", null);
        setField(term746739, term746739.getClass(), "itsConst", null);
        setField(term746739, term746739.getClass(), "itsVariableNames", null);
        setIntField(term746739, term746739.getClass(), "varStart", 0);
        setField(term746739, term746739.getClass(), "compilerData", null);
        setIntField(term746739, term746739.getClass(), "type", 39);
        setDoubleField(term746740, term746740.getClass(), "number", 0.0);
        setIntField(term746740, term746740.getClass(), "type", 0);
        setField(term746740, term746740.getClass(), "next", null);
        setField(term746740, term746740.getClass(), "first", null);
        setField(term746740, term746740.getClass(), "last", null);
        setField(term746740, term746740.getClass(), "propListHead", null);
        setIntField(term746740, term746740.getClass(), "sourcePosition", 0);
        setField(term746740, term746740.getClass(), "jsType", null);
        setField(term746740, term746740.getClass(), "parent", null);
        setField(term746739, term746739.getClass(), "next", term746740);
        setField(term746739, term746739.getClass(), "first", null);
        setField(term746739, term746739.getClass(), "last", null);
        setField(term746739, term746739.getClass(), "propListHead", null);
        setIntField(term746739, term746739.getClass(), "sourcePosition", 0);
        setField(term746739, term746739.getClass(), "jsType", null);
        setField(term746739, term746739.getClass(), "parent", null);
        setField(term746738, term746738.getClass(), "first", term746739);
        setField(term746738, term746738.getClass(), "last", null);
        setField(term746738, term746738.getClass(), "propListHead", null);
        setIntField(term746738, term746738.getClass(), "sourcePosition", 0);
        setField(term746738, term746738.getClass(), "jsType", null);
        setField(term746738, term746738.getClass(), "parent", null);
        term746685 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term746687 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term746697 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term746685, term746685.getClass(), "str", null);
        setIntField(term746685, term746685.getClass(), "type", 11);
        setField(term746685, term746685.getClass(), "next", null);
        setField(term746687, term746687.getClass(), "functionName", null);
        setBooleanField(term746687, term746687.getClass(), "itsNeedsActivation", false);
        setIntField(term746687, term746687.getClass(), "itsFunctionType", 0);
        setBooleanField(term746687, term746687.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term746687, term746687.getClass(), "encodedSourceStart", 0);
        setIntField(term746687, term746687.getClass(), "encodedSourceEnd", 0);
        setField(term746687, term746687.getClass(), "sourceName", null);
        setIntField(term746687, term746687.getClass(), "baseLineno", 0);
        setIntField(term746687, term746687.getClass(), "endLineno", 0);
        setField(term746687, term746687.getClass(), "functions", null);
        setField(term746687, term746687.getClass(), "regexps", null);
        setField(term746687, term746687.getClass(), "itsVariables", null);
        setField(term746687, term746687.getClass(), "itsConst", null);
        setField(term746687, term746687.getClass(), "itsVariableNames", null);
        setIntField(term746687, term746687.getClass(), "varStart", 0);
        setField(term746687, term746687.getClass(), "compilerData", null);
        setIntField(term746687, term746687.getClass(), "type", 39);
        setDoubleField(term746697, term746697.getClass(), "number", 0.0);
        setIntField(term746697, term746697.getClass(), "type", 0);
        setField(term746697, term746697.getClass(), "next", null);
        setField(term746697, term746697.getClass(), "first", null);
        setField(term746697, term746697.getClass(), "last", null);
        setField(term746697, term746697.getClass(), "propListHead", null);
        setIntField(term746697, term746697.getClass(), "sourcePosition", 0);
        setField(term746697, term746697.getClass(), "jsType", null);
        setField(term746697, term746697.getClass(), "parent", null);
        setField(term746687, term746687.getClass(), "next", term746697);
        setField(term746687, term746687.getClass(), "first", null);
        setField(term746687, term746687.getClass(), "last", null);
        setField(term746687, term746687.getClass(), "propListHead", null);
        setIntField(term746687, term746687.getClass(), "sourcePosition", 0);
        setField(term746687, term746687.getClass(), "jsType", null);
        setField(term746687, term746687.getClass(), "parent", null);
        setField(term746685, term746685.getClass(), "first", term746687);
        setField(term746685, term746685.getClass(), "last", null);
        setField(term746685, term746685.getClass(), "propListHead", null);
        setIntField(term746685, term746685.getClass(), "sourcePosition", 0);
        setField(term746685, term746685.getClass(), "jsType", null);
        setField(term746685, term746685.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term746491;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term746399, args);
        assertTrue(recursiveEquals(term746399, term746737));
        assertTrue(recursiveEquals(term746491, term746738));
        assertTrue(recursiveEquals(retValue, term746685));
    }

};


