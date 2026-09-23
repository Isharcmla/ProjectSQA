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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53539;
     Object term53625;
     Object term53827;
     Object term53828;
     Object term53786;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53539 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term53625 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term53717 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term53625, term53625.getClass(), "first", term53625);
        setField(term53625, term53625.getClass(), "next", term53717);
        setIntField(term53625, term53625.getClass(), "type", 33);
        term53827 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term53827, term53827.getClass(), "currentTraversal", null);
        term53828 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term53829 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term53828, term53828.getClass(), "functionName", null);
        setBooleanField(term53828, term53828.getClass(), "itsNeedsActivation", false);
        setIntField(term53828, term53828.getClass(), "itsFunctionType", 0);
        setBooleanField(term53828, term53828.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term53828, term53828.getClass(), "encodedSourceStart", 0);
        setIntField(term53828, term53828.getClass(), "encodedSourceEnd", 0);
        setField(term53828, term53828.getClass(), "sourceName", null);
        setIntField(term53828, term53828.getClass(), "baseLineno", 0);
        setIntField(term53828, term53828.getClass(), "endLineno", 0);
        setField(term53828, term53828.getClass(), "functions", null);
        setField(term53828, term53828.getClass(), "regexps", null);
        setField(term53828, term53828.getClass(), "itsVariables", null);
        setField(term53828, term53828.getClass(), "itsConst", null);
        setField(term53828, term53828.getClass(), "itsVariableNames", null);
        setIntField(term53828, term53828.getClass(), "varStart", 0);
        setField(term53828, term53828.getClass(), "compilerData", null);
        setIntField(term53828, term53828.getClass(), "type", 33);
        setField(term53829, term53829.getClass(), "str", null);
        setIntField(term53829, term53829.getClass(), "type", 0);
        setField(term53829, term53829.getClass(), "next", null);
        setField(term53829, term53829.getClass(), "first", null);
        setField(term53829, term53829.getClass(), "last", null);
        setField(term53829, term53829.getClass(), "propListHead", null);
        setIntField(term53829, term53829.getClass(), "sourcePosition", 0);
        setField(term53829, term53829.getClass(), "jsType", null);
        setField(term53829, term53829.getClass(), "parent", null);
        setField(term53828, term53828.getClass(), "next", term53829);
        setField(term53828, term53828.getClass(), "first", term53828);
        setField(term53828, term53828.getClass(), "last", null);
        setField(term53828, term53828.getClass(), "propListHead", null);
        setIntField(term53828, term53828.getClass(), "sourcePosition", 0);
        setField(term53828, term53828.getClass(), "jsType", null);
        setField(term53828, term53828.getClass(), "parent", null);
        term53786 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term53796 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term53786, term53786.getClass(), "functionName", null);
        setBooleanField(term53786, term53786.getClass(), "itsNeedsActivation", false);
        setIntField(term53786, term53786.getClass(), "itsFunctionType", 0);
        setBooleanField(term53786, term53786.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term53786, term53786.getClass(), "encodedSourceStart", 0);
        setIntField(term53786, term53786.getClass(), "encodedSourceEnd", 0);
        setField(term53786, term53786.getClass(), "sourceName", null);
        setIntField(term53786, term53786.getClass(), "baseLineno", 0);
        setIntField(term53786, term53786.getClass(), "endLineno", 0);
        setField(term53786, term53786.getClass(), "functions", null);
        setField(term53786, term53786.getClass(), "regexps", null);
        setField(term53786, term53786.getClass(), "itsVariables", null);
        setField(term53786, term53786.getClass(), "itsConst", null);
        setField(term53786, term53786.getClass(), "itsVariableNames", null);
        setIntField(term53786, term53786.getClass(), "varStart", 0);
        setField(term53786, term53786.getClass(), "compilerData", null);
        setIntField(term53786, term53786.getClass(), "type", 33);
        setField(term53796, term53796.getClass(), "str", null);
        setIntField(term53796, term53796.getClass(), "type", 0);
        setField(term53796, term53796.getClass(), "next", null);
        setField(term53796, term53796.getClass(), "first", null);
        setField(term53796, term53796.getClass(), "last", null);
        setField(term53796, term53796.getClass(), "propListHead", null);
        setIntField(term53796, term53796.getClass(), "sourcePosition", 0);
        setField(term53796, term53796.getClass(), "jsType", null);
        setField(term53796, term53796.getClass(), "parent", null);
        setField(term53786, term53786.getClass(), "next", term53796);
        setField(term53786, term53786.getClass(), "first", term53786);
        setField(term53786, term53786.getClass(), "last", null);
        setField(term53786, term53786.getClass(), "propListHead", null);
        setIntField(term53786, term53786.getClass(), "sourcePosition", 0);
        setField(term53786, term53786.getClass(), "jsType", null);
        setField(term53786, term53786.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term53625;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term53539, args);
        assertTrue(recursiveEquals(term53539, term53827));
        assertTrue(recursiveEquals(term53625, term53828));
        assertTrue(recursiveEquals(retValue, term53786));
    }

};


