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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539626;
     Object term539718;
     Object term540107;
     Object term540108;
     Object term540051;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term539626 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term539718 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term539804 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term539896 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term539896, term539896.getClass(), "type", 40);
        setField(term539896, term539896.getClass(), "str", "");
        setField(term539804, term539804.getClass(), "next", term539896);
        setField(term539718, term539718.getClass(), "first", term539804);
        setIntField(term539718, term539718.getClass(), "type", 33);
        term540107 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term540107, term540107.getClass(), "currentTraversal", null);
        term540108 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term540109 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term540110 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term540108, term540108.getClass(), "str", null);
        setIntField(term540108, term540108.getClass(), "type", 33);
        setField(term540108, term540108.getClass(), "next", null);
        setField(term540109, term540109.getClass(), "functionName", null);
        setBooleanField(term540109, term540109.getClass(), "itsNeedsActivation", false);
        setIntField(term540109, term540109.getClass(), "itsFunctionType", 0);
        setBooleanField(term540109, term540109.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term540109, term540109.getClass(), "encodedSourceStart", 0);
        setIntField(term540109, term540109.getClass(), "encodedSourceEnd", 0);
        setField(term540109, term540109.getClass(), "sourceName", null);
        setIntField(term540109, term540109.getClass(), "baseLineno", 0);
        setIntField(term540109, term540109.getClass(), "endLineno", 0);
        setField(term540109, term540109.getClass(), "functions", null);
        setField(term540109, term540109.getClass(), "regexps", null);
        setField(term540109, term540109.getClass(), "itsVariables", null);
        setField(term540109, term540109.getClass(), "itsConst", null);
        setField(term540109, term540109.getClass(), "itsVariableNames", null);
        setIntField(term540109, term540109.getClass(), "varStart", 0);
        setField(term540109, term540109.getClass(), "compilerData", null);
        setIntField(term540109, term540109.getClass(), "type", 0);
        setField(term540110, term540110.getClass(), "str", "");
        setIntField(term540110, term540110.getClass(), "type", 40);
        setField(term540110, term540110.getClass(), "next", null);
        setField(term540110, term540110.getClass(), "first", null);
        setField(term540110, term540110.getClass(), "last", null);
        setField(term540110, term540110.getClass(), "propListHead", null);
        setIntField(term540110, term540110.getClass(), "sourcePosition", 0);
        setField(term540110, term540110.getClass(), "jsType", null);
        setField(term540110, term540110.getClass(), "parent", null);
        setField(term540109, term540109.getClass(), "next", term540110);
        setField(term540109, term540109.getClass(), "first", null);
        setField(term540109, term540109.getClass(), "last", null);
        setField(term540109, term540109.getClass(), "propListHead", null);
        setIntField(term540109, term540109.getClass(), "sourcePosition", 0);
        setField(term540109, term540109.getClass(), "jsType", null);
        setField(term540109, term540109.getClass(), "parent", null);
        setField(term540108, term540108.getClass(), "first", term540109);
        setField(term540108, term540108.getClass(), "last", null);
        setField(term540108, term540108.getClass(), "propListHead", null);
        setIntField(term540108, term540108.getClass(), "sourcePosition", 0);
        setField(term540108, term540108.getClass(), "jsType", null);
        setField(term540108, term540108.getClass(), "parent", null);
        term540051 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term540053 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term540063 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term540051, term540051.getClass(), "str", null);
        setIntField(term540051, term540051.getClass(), "type", 33);
        setField(term540051, term540051.getClass(), "next", null);
        setField(term540053, term540053.getClass(), "functionName", null);
        setBooleanField(term540053, term540053.getClass(), "itsNeedsActivation", false);
        setIntField(term540053, term540053.getClass(), "itsFunctionType", 0);
        setBooleanField(term540053, term540053.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term540053, term540053.getClass(), "encodedSourceStart", 0);
        setIntField(term540053, term540053.getClass(), "encodedSourceEnd", 0);
        setField(term540053, term540053.getClass(), "sourceName", null);
        setIntField(term540053, term540053.getClass(), "baseLineno", 0);
        setIntField(term540053, term540053.getClass(), "endLineno", 0);
        setField(term540053, term540053.getClass(), "functions", null);
        setField(term540053, term540053.getClass(), "regexps", null);
        setField(term540053, term540053.getClass(), "itsVariables", null);
        setField(term540053, term540053.getClass(), "itsConst", null);
        setField(term540053, term540053.getClass(), "itsVariableNames", null);
        setIntField(term540053, term540053.getClass(), "varStart", 0);
        setField(term540053, term540053.getClass(), "compilerData", null);
        setIntField(term540053, term540053.getClass(), "type", 0);
        setField(term540063, term540063.getClass(), "str", "");
        setIntField(term540063, term540063.getClass(), "type", 40);
        setField(term540063, term540063.getClass(), "next", null);
        setField(term540063, term540063.getClass(), "first", null);
        setField(term540063, term540063.getClass(), "last", null);
        setField(term540063, term540063.getClass(), "propListHead", null);
        setIntField(term540063, term540063.getClass(), "sourcePosition", 0);
        setField(term540063, term540063.getClass(), "jsType", null);
        setField(term540063, term540063.getClass(), "parent", null);
        setField(term540053, term540053.getClass(), "next", term540063);
        setField(term540053, term540053.getClass(), "first", null);
        setField(term540053, term540053.getClass(), "last", null);
        setField(term540053, term540053.getClass(), "propListHead", null);
        setIntField(term540053, term540053.getClass(), "sourcePosition", 0);
        setField(term540053, term540053.getClass(), "jsType", null);
        setField(term540053, term540053.getClass(), "parent", null);
        setField(term540051, term540051.getClass(), "first", term540053);
        setField(term540051, term540051.getClass(), "last", null);
        setField(term540051, term540051.getClass(), "propListHead", null);
        setIntField(term540051, term540051.getClass(), "sourcePosition", 0);
        setField(term540051, term540051.getClass(), "jsType", null);
        setField(term540051, term540051.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term539718;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term539626, args);
        assertTrue(recursiveEquals(term539626, term540107));
        assertTrue(recursiveEquals(term539718, term540108));
        assertTrue(recursiveEquals(retValue, term540051));
    }

};


