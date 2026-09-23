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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term730425;
     Object term730517;
     Object term731254;
     Object term731255;
     Object term731207;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term730425 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term730517 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term730603 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term730673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term730603, term730603.getClass(), "next", term730673);
        setField(term730517, term730517.getClass(), "first", term730603);
        setIntField(term730517, term730517.getClass(), "type", 11);
        term731254 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term731254, term731254.getClass(), "currentTraversal", null);
        term731255 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term731256 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term731257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term731255, term731255.getClass(), "str", null);
        setIntField(term731255, term731255.getClass(), "type", 11);
        setField(term731255, term731255.getClass(), "next", null);
        setField(term731256, term731256.getClass(), "functionName", null);
        setBooleanField(term731256, term731256.getClass(), "itsNeedsActivation", false);
        setIntField(term731256, term731256.getClass(), "itsFunctionType", 0);
        setBooleanField(term731256, term731256.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term731256, term731256.getClass(), "encodedSourceStart", 0);
        setIntField(term731256, term731256.getClass(), "encodedSourceEnd", 0);
        setField(term731256, term731256.getClass(), "sourceName", null);
        setIntField(term731256, term731256.getClass(), "baseLineno", 0);
        setIntField(term731256, term731256.getClass(), "endLineno", 0);
        setField(term731256, term731256.getClass(), "functions", null);
        setField(term731256, term731256.getClass(), "regexps", null);
        setField(term731256, term731256.getClass(), "itsVariables", null);
        setField(term731256, term731256.getClass(), "itsConst", null);
        setField(term731256, term731256.getClass(), "itsVariableNames", null);
        setIntField(term731256, term731256.getClass(), "varStart", 0);
        setField(term731256, term731256.getClass(), "compilerData", null);
        setIntField(term731256, term731256.getClass(), "type", 0);
        setIntField(term731257, term731257.getClass(), "type", 0);
        setField(term731257, term731257.getClass(), "next", null);
        setField(term731257, term731257.getClass(), "first", null);
        setField(term731257, term731257.getClass(), "last", null);
        setField(term731257, term731257.getClass(), "propListHead", null);
        setIntField(term731257, term731257.getClass(), "sourcePosition", 0);
        setField(term731257, term731257.getClass(), "jsType", null);
        setField(term731257, term731257.getClass(), "parent", null);
        setField(term731256, term731256.getClass(), "next", term731257);
        setField(term731256, term731256.getClass(), "first", null);
        setField(term731256, term731256.getClass(), "last", null);
        setField(term731256, term731256.getClass(), "propListHead", null);
        setIntField(term731256, term731256.getClass(), "sourcePosition", 0);
        setField(term731256, term731256.getClass(), "jsType", null);
        setField(term731256, term731256.getClass(), "parent", null);
        setField(term731255, term731255.getClass(), "first", term731256);
        setField(term731255, term731255.getClass(), "last", null);
        setField(term731255, term731255.getClass(), "propListHead", null);
        setIntField(term731255, term731255.getClass(), "sourcePosition", 0);
        setField(term731255, term731255.getClass(), "jsType", null);
        setField(term731255, term731255.getClass(), "parent", null);
        term731207 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term731209 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term731219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term731207, term731207.getClass(), "str", null);
        setIntField(term731207, term731207.getClass(), "type", 11);
        setField(term731207, term731207.getClass(), "next", null);
        setField(term731209, term731209.getClass(), "functionName", null);
        setBooleanField(term731209, term731209.getClass(), "itsNeedsActivation", false);
        setIntField(term731209, term731209.getClass(), "itsFunctionType", 0);
        setBooleanField(term731209, term731209.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term731209, term731209.getClass(), "encodedSourceStart", 0);
        setIntField(term731209, term731209.getClass(), "encodedSourceEnd", 0);
        setField(term731209, term731209.getClass(), "sourceName", null);
        setIntField(term731209, term731209.getClass(), "baseLineno", 0);
        setIntField(term731209, term731209.getClass(), "endLineno", 0);
        setField(term731209, term731209.getClass(), "functions", null);
        setField(term731209, term731209.getClass(), "regexps", null);
        setField(term731209, term731209.getClass(), "itsVariables", null);
        setField(term731209, term731209.getClass(), "itsConst", null);
        setField(term731209, term731209.getClass(), "itsVariableNames", null);
        setIntField(term731209, term731209.getClass(), "varStart", 0);
        setField(term731209, term731209.getClass(), "compilerData", null);
        setIntField(term731209, term731209.getClass(), "type", 0);
        setIntField(term731219, term731219.getClass(), "type", 0);
        setField(term731219, term731219.getClass(), "next", null);
        setField(term731219, term731219.getClass(), "first", null);
        setField(term731219, term731219.getClass(), "last", null);
        setField(term731219, term731219.getClass(), "propListHead", null);
        setIntField(term731219, term731219.getClass(), "sourcePosition", 0);
        setField(term731219, term731219.getClass(), "jsType", null);
        setField(term731219, term731219.getClass(), "parent", null);
        setField(term731209, term731209.getClass(), "next", term731219);
        setField(term731209, term731209.getClass(), "first", null);
        setField(term731209, term731209.getClass(), "last", null);
        setField(term731209, term731209.getClass(), "propListHead", null);
        setIntField(term731209, term731209.getClass(), "sourcePosition", 0);
        setField(term731209, term731209.getClass(), "jsType", null);
        setField(term731209, term731209.getClass(), "parent", null);
        setField(term731207, term731207.getClass(), "first", term731209);
        setField(term731207, term731207.getClass(), "last", null);
        setField(term731207, term731207.getClass(), "propListHead", null);
        setIntField(term731207, term731207.getClass(), "sourcePosition", 0);
        setField(term731207, term731207.getClass(), "jsType", null);
        setField(term731207, term731207.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term730517;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term730425, args);
        assertTrue(recursiveEquals(term730425, term731254));
        assertTrue(recursiveEquals(term730517, term731255));
        assertTrue(recursiveEquals(retValue, term731207));
    }

};


