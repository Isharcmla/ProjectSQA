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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208394;
     Object term208480;
     Object term208904;
     Object term208905;
     Object term208830;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208394 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term208480 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208566 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208658 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term208566, term208566.getClass(), "next", term208658);
        setIntField(term208566, term208566.getClass(), "type", 24);
        setField(term208480, term208480.getClass(), "first", term208566);
        setIntField(term208480, term208480.getClass(), "type", 16);
        term208904 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term208904, term208904.getClass(), "currentTraversal", null);
        term208905 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208906 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208907 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term208905, term208905.getClass(), "functionName", null);
        setBooleanField(term208905, term208905.getClass(), "itsNeedsActivation", false);
        setIntField(term208905, term208905.getClass(), "itsFunctionType", 0);
        setBooleanField(term208905, term208905.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term208905, term208905.getClass(), "encodedSourceStart", 0);
        setIntField(term208905, term208905.getClass(), "encodedSourceEnd", 0);
        setField(term208905, term208905.getClass(), "sourceName", null);
        setIntField(term208905, term208905.getClass(), "baseLineno", 0);
        setIntField(term208905, term208905.getClass(), "endLineno", 0);
        setField(term208905, term208905.getClass(), "functions", null);
        setField(term208905, term208905.getClass(), "regexps", null);
        setField(term208905, term208905.getClass(), "itsVariables", null);
        setField(term208905, term208905.getClass(), "itsConst", null);
        setField(term208905, term208905.getClass(), "itsVariableNames", null);
        setIntField(term208905, term208905.getClass(), "varStart", 0);
        setField(term208905, term208905.getClass(), "compilerData", null);
        setIntField(term208905, term208905.getClass(), "type", 16);
        setField(term208905, term208905.getClass(), "next", null);
        setField(term208906, term208906.getClass(), "functionName", null);
        setBooleanField(term208906, term208906.getClass(), "itsNeedsActivation", false);
        setIntField(term208906, term208906.getClass(), "itsFunctionType", 0);
        setBooleanField(term208906, term208906.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term208906, term208906.getClass(), "encodedSourceStart", 0);
        setIntField(term208906, term208906.getClass(), "encodedSourceEnd", 0);
        setField(term208906, term208906.getClass(), "sourceName", null);
        setIntField(term208906, term208906.getClass(), "baseLineno", 0);
        setIntField(term208906, term208906.getClass(), "endLineno", 0);
        setField(term208906, term208906.getClass(), "functions", null);
        setField(term208906, term208906.getClass(), "regexps", null);
        setField(term208906, term208906.getClass(), "itsVariables", null);
        setField(term208906, term208906.getClass(), "itsConst", null);
        setField(term208906, term208906.getClass(), "itsVariableNames", null);
        setIntField(term208906, term208906.getClass(), "varStart", 0);
        setField(term208906, term208906.getClass(), "compilerData", null);
        setIntField(term208906, term208906.getClass(), "type", 24);
        setField(term208907, term208907.getClass(), "str", null);
        setIntField(term208907, term208907.getClass(), "type", 0);
        setField(term208907, term208907.getClass(), "next", null);
        setField(term208907, term208907.getClass(), "first", null);
        setField(term208907, term208907.getClass(), "last", null);
        setField(term208907, term208907.getClass(), "propListHead", null);
        setIntField(term208907, term208907.getClass(), "sourcePosition", 0);
        setField(term208907, term208907.getClass(), "jsType", null);
        setField(term208907, term208907.getClass(), "parent", null);
        setField(term208906, term208906.getClass(), "next", term208907);
        setField(term208906, term208906.getClass(), "first", null);
        setField(term208906, term208906.getClass(), "last", null);
        setField(term208906, term208906.getClass(), "propListHead", null);
        setIntField(term208906, term208906.getClass(), "sourcePosition", 0);
        setField(term208906, term208906.getClass(), "jsType", null);
        setField(term208906, term208906.getClass(), "parent", null);
        setField(term208905, term208905.getClass(), "first", term208906);
        setField(term208905, term208905.getClass(), "last", null);
        setField(term208905, term208905.getClass(), "propListHead", null);
        setIntField(term208905, term208905.getClass(), "sourcePosition", 0);
        setField(term208905, term208905.getClass(), "jsType", null);
        setField(term208905, term208905.getClass(), "parent", null);
        term208830 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208840 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208850 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term208830, term208830.getClass(), "functionName", null);
        setBooleanField(term208830, term208830.getClass(), "itsNeedsActivation", false);
        setIntField(term208830, term208830.getClass(), "itsFunctionType", 0);
        setBooleanField(term208830, term208830.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term208830, term208830.getClass(), "encodedSourceStart", 0);
        setIntField(term208830, term208830.getClass(), "encodedSourceEnd", 0);
        setField(term208830, term208830.getClass(), "sourceName", null);
        setIntField(term208830, term208830.getClass(), "baseLineno", 0);
        setIntField(term208830, term208830.getClass(), "endLineno", 0);
        setField(term208830, term208830.getClass(), "functions", null);
        setField(term208830, term208830.getClass(), "regexps", null);
        setField(term208830, term208830.getClass(), "itsVariables", null);
        setField(term208830, term208830.getClass(), "itsConst", null);
        setField(term208830, term208830.getClass(), "itsVariableNames", null);
        setIntField(term208830, term208830.getClass(), "varStart", 0);
        setField(term208830, term208830.getClass(), "compilerData", null);
        setIntField(term208830, term208830.getClass(), "type", 16);
        setField(term208830, term208830.getClass(), "next", null);
        setField(term208840, term208840.getClass(), "functionName", null);
        setBooleanField(term208840, term208840.getClass(), "itsNeedsActivation", false);
        setIntField(term208840, term208840.getClass(), "itsFunctionType", 0);
        setBooleanField(term208840, term208840.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term208840, term208840.getClass(), "encodedSourceStart", 0);
        setIntField(term208840, term208840.getClass(), "encodedSourceEnd", 0);
        setField(term208840, term208840.getClass(), "sourceName", null);
        setIntField(term208840, term208840.getClass(), "baseLineno", 0);
        setIntField(term208840, term208840.getClass(), "endLineno", 0);
        setField(term208840, term208840.getClass(), "functions", null);
        setField(term208840, term208840.getClass(), "regexps", null);
        setField(term208840, term208840.getClass(), "itsVariables", null);
        setField(term208840, term208840.getClass(), "itsConst", null);
        setField(term208840, term208840.getClass(), "itsVariableNames", null);
        setIntField(term208840, term208840.getClass(), "varStart", 0);
        setField(term208840, term208840.getClass(), "compilerData", null);
        setIntField(term208840, term208840.getClass(), "type", 24);
        setField(term208850, term208850.getClass(), "str", null);
        setIntField(term208850, term208850.getClass(), "type", 0);
        setField(term208850, term208850.getClass(), "next", null);
        setField(term208850, term208850.getClass(), "first", null);
        setField(term208850, term208850.getClass(), "last", null);
        setField(term208850, term208850.getClass(), "propListHead", null);
        setIntField(term208850, term208850.getClass(), "sourcePosition", 0);
        setField(term208850, term208850.getClass(), "jsType", null);
        setField(term208850, term208850.getClass(), "parent", null);
        setField(term208840, term208840.getClass(), "next", term208850);
        setField(term208840, term208840.getClass(), "first", null);
        setField(term208840, term208840.getClass(), "last", null);
        setField(term208840, term208840.getClass(), "propListHead", null);
        setIntField(term208840, term208840.getClass(), "sourcePosition", 0);
        setField(term208840, term208840.getClass(), "jsType", null);
        setField(term208840, term208840.getClass(), "parent", null);
        setField(term208830, term208830.getClass(), "first", term208840);
        setField(term208830, term208830.getClass(), "last", null);
        setField(term208830, term208830.getClass(), "propListHead", null);
        setIntField(term208830, term208830.getClass(), "sourcePosition", 0);
        setField(term208830, term208830.getClass(), "jsType", null);
        setField(term208830, term208830.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term208480;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term208394, args);
        assertTrue(recursiveEquals(term208394, term208904));
        assertTrue(recursiveEquals(term208480, term208905));
        assertTrue(recursiveEquals(retValue, term208830));
    }

};


