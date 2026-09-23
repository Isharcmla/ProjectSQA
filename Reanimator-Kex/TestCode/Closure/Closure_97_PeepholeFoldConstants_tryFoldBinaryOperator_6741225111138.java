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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350729;
     Object term350821;
     Object term351063;
     Object term351064;
     Object term351015;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350729 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term350821 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term350913 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term351003 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term350913, term350913.getClass(), "next", term351003);
        setIntField(term350913, term350913.getClass(), "type", 63);
        setField(term350821, term350821.getClass(), "first", term350913);
        setIntField(term350821, term350821.getClass(), "type", 35);
        term351063 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term351063, term351063.getClass(), "currentTraversal", null);
        term351064 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term351065 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term351066 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term351064, term351064.getClass(), "str", null);
        setIntField(term351064, term351064.getClass(), "type", 35);
        setField(term351064, term351064.getClass(), "next", null);
        setField(term351065, term351065.getClass(), "str", null);
        setIntField(term351065, term351065.getClass(), "type", 63);
        setIntField(term351066, term351066.getClass(), "encodedSourceStart", 0);
        setIntField(term351066, term351066.getClass(), "encodedSourceEnd", 0);
        setField(term351066, term351066.getClass(), "sourceName", null);
        setIntField(term351066, term351066.getClass(), "baseLineno", 0);
        setIntField(term351066, term351066.getClass(), "endLineno", 0);
        setField(term351066, term351066.getClass(), "functions", null);
        setField(term351066, term351066.getClass(), "regexps", null);
        setField(term351066, term351066.getClass(), "itsVariables", null);
        setField(term351066, term351066.getClass(), "itsConst", null);
        setField(term351066, term351066.getClass(), "itsVariableNames", null);
        setIntField(term351066, term351066.getClass(), "varStart", 0);
        setField(term351066, term351066.getClass(), "compilerData", null);
        setIntField(term351066, term351066.getClass(), "type", 0);
        setField(term351066, term351066.getClass(), "next", null);
        setField(term351066, term351066.getClass(), "first", null);
        setField(term351066, term351066.getClass(), "last", null);
        setField(term351066, term351066.getClass(), "propListHead", null);
        setIntField(term351066, term351066.getClass(), "sourcePosition", 0);
        setField(term351066, term351066.getClass(), "jsType", null);
        setField(term351066, term351066.getClass(), "parent", null);
        setField(term351065, term351065.getClass(), "next", term351066);
        setField(term351065, term351065.getClass(), "first", null);
        setField(term351065, term351065.getClass(), "last", null);
        setField(term351065, term351065.getClass(), "propListHead", null);
        setIntField(term351065, term351065.getClass(), "sourcePosition", 0);
        setField(term351065, term351065.getClass(), "jsType", null);
        setField(term351065, term351065.getClass(), "parent", null);
        setField(term351064, term351064.getClass(), "first", term351065);
        setField(term351064, term351064.getClass(), "last", null);
        setField(term351064, term351064.getClass(), "propListHead", null);
        setIntField(term351064, term351064.getClass(), "sourcePosition", 0);
        setField(term351064, term351064.getClass(), "jsType", null);
        setField(term351064, term351064.getClass(), "parent", null);
        term351015 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term351017 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term351019 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term351015, term351015.getClass(), "str", null);
        setIntField(term351015, term351015.getClass(), "type", 35);
        setField(term351015, term351015.getClass(), "next", null);
        setField(term351017, term351017.getClass(), "str", null);
        setIntField(term351017, term351017.getClass(), "type", 63);
        setIntField(term351019, term351019.getClass(), "encodedSourceStart", 0);
        setIntField(term351019, term351019.getClass(), "encodedSourceEnd", 0);
        setField(term351019, term351019.getClass(), "sourceName", null);
        setIntField(term351019, term351019.getClass(), "baseLineno", 0);
        setIntField(term351019, term351019.getClass(), "endLineno", 0);
        setField(term351019, term351019.getClass(), "functions", null);
        setField(term351019, term351019.getClass(), "regexps", null);
        setField(term351019, term351019.getClass(), "itsVariables", null);
        setField(term351019, term351019.getClass(), "itsConst", null);
        setField(term351019, term351019.getClass(), "itsVariableNames", null);
        setIntField(term351019, term351019.getClass(), "varStart", 0);
        setField(term351019, term351019.getClass(), "compilerData", null);
        setIntField(term351019, term351019.getClass(), "type", 0);
        setField(term351019, term351019.getClass(), "next", null);
        setField(term351019, term351019.getClass(), "first", null);
        setField(term351019, term351019.getClass(), "last", null);
        setField(term351019, term351019.getClass(), "propListHead", null);
        setIntField(term351019, term351019.getClass(), "sourcePosition", 0);
        setField(term351019, term351019.getClass(), "jsType", null);
        setField(term351019, term351019.getClass(), "parent", null);
        setField(term351017, term351017.getClass(), "next", term351019);
        setField(term351017, term351017.getClass(), "first", null);
        setField(term351017, term351017.getClass(), "last", null);
        setField(term351017, term351017.getClass(), "propListHead", null);
        setIntField(term351017, term351017.getClass(), "sourcePosition", 0);
        setField(term351017, term351017.getClass(), "jsType", null);
        setField(term351017, term351017.getClass(), "parent", null);
        setField(term351015, term351015.getClass(), "first", term351017);
        setField(term351015, term351015.getClass(), "last", null);
        setField(term351015, term351015.getClass(), "propListHead", null);
        setIntField(term351015, term351015.getClass(), "sourcePosition", 0);
        setField(term351015, term351015.getClass(), "jsType", null);
        setField(term351015, term351015.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term350821;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term350729, args);
        assertTrue(recursiveEquals(term350729, term351063));
        assertTrue(recursiveEquals(term350821, term351064));
        assertTrue(recursiveEquals(retValue, term351015));
    }

};


