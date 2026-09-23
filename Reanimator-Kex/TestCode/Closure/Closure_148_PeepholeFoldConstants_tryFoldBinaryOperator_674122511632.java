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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139149;
     Object term139235;
     Object term139472;
     Object term139473;
     Object term139406;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139149 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term139235 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term139321 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term139391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term139321, term139321.getClass(), "next", term139391);
        setField(term139235, term139235.getClass(), "first", term139321);
        setIntField(term139235, term139235.getClass(), "type", 45);
        term139472 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term139472, term139472.getClass(), "currentTraversal", null);
        term139473 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term139474 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term139475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term139473, term139473.getClass(), "functionName", null);
        setBooleanField(term139473, term139473.getClass(), "itsNeedsActivation", false);
        setIntField(term139473, term139473.getClass(), "itsFunctionType", 0);
        setBooleanField(term139473, term139473.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term139473, term139473.getClass(), "encodedSourceStart", 0);
        setIntField(term139473, term139473.getClass(), "encodedSourceEnd", 0);
        setField(term139473, term139473.getClass(), "sourceName", null);
        setIntField(term139473, term139473.getClass(), "baseLineno", 0);
        setIntField(term139473, term139473.getClass(), "endLineno", 0);
        setField(term139473, term139473.getClass(), "functions", null);
        setField(term139473, term139473.getClass(), "regexps", null);
        setField(term139473, term139473.getClass(), "itsVariables", null);
        setField(term139473, term139473.getClass(), "itsConst", null);
        setField(term139473, term139473.getClass(), "itsVariableNames", null);
        setIntField(term139473, term139473.getClass(), "varStart", 0);
        setField(term139473, term139473.getClass(), "compilerData", null);
        setIntField(term139473, term139473.getClass(), "type", 45);
        setField(term139473, term139473.getClass(), "next", null);
        setField(term139474, term139474.getClass(), "functionName", null);
        setBooleanField(term139474, term139474.getClass(), "itsNeedsActivation", false);
        setIntField(term139474, term139474.getClass(), "itsFunctionType", 0);
        setBooleanField(term139474, term139474.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term139474, term139474.getClass(), "encodedSourceStart", 0);
        setIntField(term139474, term139474.getClass(), "encodedSourceEnd", 0);
        setField(term139474, term139474.getClass(), "sourceName", null);
        setIntField(term139474, term139474.getClass(), "baseLineno", 0);
        setIntField(term139474, term139474.getClass(), "endLineno", 0);
        setField(term139474, term139474.getClass(), "functions", null);
        setField(term139474, term139474.getClass(), "regexps", null);
        setField(term139474, term139474.getClass(), "itsVariables", null);
        setField(term139474, term139474.getClass(), "itsConst", null);
        setField(term139474, term139474.getClass(), "itsVariableNames", null);
        setIntField(term139474, term139474.getClass(), "varStart", 0);
        setField(term139474, term139474.getClass(), "compilerData", null);
        setIntField(term139474, term139474.getClass(), "type", 0);
        setIntField(term139475, term139475.getClass(), "type", 0);
        setField(term139475, term139475.getClass(), "next", null);
        setField(term139475, term139475.getClass(), "first", null);
        setField(term139475, term139475.getClass(), "last", null);
        setField(term139475, term139475.getClass(), "propListHead", null);
        setIntField(term139475, term139475.getClass(), "sourcePosition", 0);
        setField(term139475, term139475.getClass(), "jsType", null);
        setField(term139475, term139475.getClass(), "parent", null);
        setField(term139474, term139474.getClass(), "next", term139475);
        setField(term139474, term139474.getClass(), "first", null);
        setField(term139474, term139474.getClass(), "last", null);
        setField(term139474, term139474.getClass(), "propListHead", null);
        setIntField(term139474, term139474.getClass(), "sourcePosition", 0);
        setField(term139474, term139474.getClass(), "jsType", null);
        setField(term139474, term139474.getClass(), "parent", null);
        setField(term139473, term139473.getClass(), "first", term139474);
        setField(term139473, term139473.getClass(), "last", null);
        setField(term139473, term139473.getClass(), "propListHead", null);
        setIntField(term139473, term139473.getClass(), "sourcePosition", 0);
        setField(term139473, term139473.getClass(), "jsType", null);
        setField(term139473, term139473.getClass(), "parent", null);
        term139406 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term139416 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term139426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term139406, term139406.getClass(), "functionName", null);
        setBooleanField(term139406, term139406.getClass(), "itsNeedsActivation", false);
        setIntField(term139406, term139406.getClass(), "itsFunctionType", 0);
        setBooleanField(term139406, term139406.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term139406, term139406.getClass(), "encodedSourceStart", 0);
        setIntField(term139406, term139406.getClass(), "encodedSourceEnd", 0);
        setField(term139406, term139406.getClass(), "sourceName", null);
        setIntField(term139406, term139406.getClass(), "baseLineno", 0);
        setIntField(term139406, term139406.getClass(), "endLineno", 0);
        setField(term139406, term139406.getClass(), "functions", null);
        setField(term139406, term139406.getClass(), "regexps", null);
        setField(term139406, term139406.getClass(), "itsVariables", null);
        setField(term139406, term139406.getClass(), "itsConst", null);
        setField(term139406, term139406.getClass(), "itsVariableNames", null);
        setIntField(term139406, term139406.getClass(), "varStart", 0);
        setField(term139406, term139406.getClass(), "compilerData", null);
        setIntField(term139406, term139406.getClass(), "type", 45);
        setField(term139406, term139406.getClass(), "next", null);
        setField(term139416, term139416.getClass(), "functionName", null);
        setBooleanField(term139416, term139416.getClass(), "itsNeedsActivation", false);
        setIntField(term139416, term139416.getClass(), "itsFunctionType", 0);
        setBooleanField(term139416, term139416.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term139416, term139416.getClass(), "encodedSourceStart", 0);
        setIntField(term139416, term139416.getClass(), "encodedSourceEnd", 0);
        setField(term139416, term139416.getClass(), "sourceName", null);
        setIntField(term139416, term139416.getClass(), "baseLineno", 0);
        setIntField(term139416, term139416.getClass(), "endLineno", 0);
        setField(term139416, term139416.getClass(), "functions", null);
        setField(term139416, term139416.getClass(), "regexps", null);
        setField(term139416, term139416.getClass(), "itsVariables", null);
        setField(term139416, term139416.getClass(), "itsConst", null);
        setField(term139416, term139416.getClass(), "itsVariableNames", null);
        setIntField(term139416, term139416.getClass(), "varStart", 0);
        setField(term139416, term139416.getClass(), "compilerData", null);
        setIntField(term139416, term139416.getClass(), "type", 0);
        setIntField(term139426, term139426.getClass(), "type", 0);
        setField(term139426, term139426.getClass(), "next", null);
        setField(term139426, term139426.getClass(), "first", null);
        setField(term139426, term139426.getClass(), "last", null);
        setField(term139426, term139426.getClass(), "propListHead", null);
        setIntField(term139426, term139426.getClass(), "sourcePosition", 0);
        setField(term139426, term139426.getClass(), "jsType", null);
        setField(term139426, term139426.getClass(), "parent", null);
        setField(term139416, term139416.getClass(), "next", term139426);
        setField(term139416, term139416.getClass(), "first", null);
        setField(term139416, term139416.getClass(), "last", null);
        setField(term139416, term139416.getClass(), "propListHead", null);
        setIntField(term139416, term139416.getClass(), "sourcePosition", 0);
        setField(term139416, term139416.getClass(), "jsType", null);
        setField(term139416, term139416.getClass(), "parent", null);
        setField(term139406, term139406.getClass(), "first", term139416);
        setField(term139406, term139406.getClass(), "last", null);
        setField(term139406, term139406.getClass(), "propListHead", null);
        setIntField(term139406, term139406.getClass(), "sourcePosition", 0);
        setField(term139406, term139406.getClass(), "jsType", null);
        setField(term139406, term139406.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term139235;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term139149, args);
        assertTrue(recursiveEquals(term139149, term139472));
        assertTrue(recursiveEquals(term139235, term139473));
        assertTrue(recursiveEquals(retValue, term139406));
    }

};


