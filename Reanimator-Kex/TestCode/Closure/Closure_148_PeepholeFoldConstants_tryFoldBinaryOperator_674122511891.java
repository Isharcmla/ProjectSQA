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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206212;
     Object term206304;
     Object term207206;
     Object term207207;
     Object term207159;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206212 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term206304 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term206390 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term206460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term206390, term206390.getClass(), "next", term206460);
        setField(term206304, term206304.getClass(), "first", term206390);
        setIntField(term206304, term206304.getClass(), "type", 35);
        term207206 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term207206, term207206.getClass(), "currentTraversal", null);
        term207207 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term207208 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term207209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term207207, term207207.getClass(), "str", null);
        setIntField(term207207, term207207.getClass(), "type", 35);
        setField(term207207, term207207.getClass(), "next", null);
        setField(term207208, term207208.getClass(), "functionName", null);
        setBooleanField(term207208, term207208.getClass(), "itsNeedsActivation", false);
        setIntField(term207208, term207208.getClass(), "itsFunctionType", 0);
        setBooleanField(term207208, term207208.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term207208, term207208.getClass(), "encodedSourceStart", 0);
        setIntField(term207208, term207208.getClass(), "encodedSourceEnd", 0);
        setField(term207208, term207208.getClass(), "sourceName", null);
        setIntField(term207208, term207208.getClass(), "baseLineno", 0);
        setIntField(term207208, term207208.getClass(), "endLineno", 0);
        setField(term207208, term207208.getClass(), "functions", null);
        setField(term207208, term207208.getClass(), "regexps", null);
        setField(term207208, term207208.getClass(), "itsVariables", null);
        setField(term207208, term207208.getClass(), "itsConst", null);
        setField(term207208, term207208.getClass(), "itsVariableNames", null);
        setIntField(term207208, term207208.getClass(), "varStart", 0);
        setField(term207208, term207208.getClass(), "compilerData", null);
        setIntField(term207208, term207208.getClass(), "type", 0);
        setIntField(term207209, term207209.getClass(), "type", 0);
        setField(term207209, term207209.getClass(), "next", null);
        setField(term207209, term207209.getClass(), "first", null);
        setField(term207209, term207209.getClass(), "last", null);
        setField(term207209, term207209.getClass(), "propListHead", null);
        setIntField(term207209, term207209.getClass(), "sourcePosition", 0);
        setField(term207209, term207209.getClass(), "jsType", null);
        setField(term207209, term207209.getClass(), "parent", null);
        setField(term207208, term207208.getClass(), "next", term207209);
        setField(term207208, term207208.getClass(), "first", null);
        setField(term207208, term207208.getClass(), "last", null);
        setField(term207208, term207208.getClass(), "propListHead", null);
        setIntField(term207208, term207208.getClass(), "sourcePosition", 0);
        setField(term207208, term207208.getClass(), "jsType", null);
        setField(term207208, term207208.getClass(), "parent", null);
        setField(term207207, term207207.getClass(), "first", term207208);
        setField(term207207, term207207.getClass(), "last", null);
        setField(term207207, term207207.getClass(), "propListHead", null);
        setIntField(term207207, term207207.getClass(), "sourcePosition", 0);
        setField(term207207, term207207.getClass(), "jsType", null);
        setField(term207207, term207207.getClass(), "parent", null);
        term207159 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term207161 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term207171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term207159, term207159.getClass(), "str", null);
        setIntField(term207159, term207159.getClass(), "type", 35);
        setField(term207159, term207159.getClass(), "next", null);
        setField(term207161, term207161.getClass(), "functionName", null);
        setBooleanField(term207161, term207161.getClass(), "itsNeedsActivation", false);
        setIntField(term207161, term207161.getClass(), "itsFunctionType", 0);
        setBooleanField(term207161, term207161.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term207161, term207161.getClass(), "encodedSourceStart", 0);
        setIntField(term207161, term207161.getClass(), "encodedSourceEnd", 0);
        setField(term207161, term207161.getClass(), "sourceName", null);
        setIntField(term207161, term207161.getClass(), "baseLineno", 0);
        setIntField(term207161, term207161.getClass(), "endLineno", 0);
        setField(term207161, term207161.getClass(), "functions", null);
        setField(term207161, term207161.getClass(), "regexps", null);
        setField(term207161, term207161.getClass(), "itsVariables", null);
        setField(term207161, term207161.getClass(), "itsConst", null);
        setField(term207161, term207161.getClass(), "itsVariableNames", null);
        setIntField(term207161, term207161.getClass(), "varStart", 0);
        setField(term207161, term207161.getClass(), "compilerData", null);
        setIntField(term207161, term207161.getClass(), "type", 0);
        setIntField(term207171, term207171.getClass(), "type", 0);
        setField(term207171, term207171.getClass(), "next", null);
        setField(term207171, term207171.getClass(), "first", null);
        setField(term207171, term207171.getClass(), "last", null);
        setField(term207171, term207171.getClass(), "propListHead", null);
        setIntField(term207171, term207171.getClass(), "sourcePosition", 0);
        setField(term207171, term207171.getClass(), "jsType", null);
        setField(term207171, term207171.getClass(), "parent", null);
        setField(term207161, term207161.getClass(), "next", term207171);
        setField(term207161, term207161.getClass(), "first", null);
        setField(term207161, term207161.getClass(), "last", null);
        setField(term207161, term207161.getClass(), "propListHead", null);
        setIntField(term207161, term207161.getClass(), "sourcePosition", 0);
        setField(term207161, term207161.getClass(), "jsType", null);
        setField(term207161, term207161.getClass(), "parent", null);
        setField(term207159, term207159.getClass(), "first", term207161);
        setField(term207159, term207159.getClass(), "last", null);
        setField(term207159, term207159.getClass(), "propListHead", null);
        setIntField(term207159, term207159.getClass(), "sourcePosition", 0);
        setField(term207159, term207159.getClass(), "jsType", null);
        setField(term207159, term207159.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term206304;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term206212, args);
        assertTrue(recursiveEquals(term206212, term207206));
        assertTrue(recursiveEquals(term206304, term207207));
        assertTrue(recursiveEquals(retValue, term207159));
    }

};


