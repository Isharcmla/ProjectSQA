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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term596854;
     Object term596946;
     Object term597277;
     Object term597278;
     Object term597193;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term596854 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term596946 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term597032 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term597102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term597172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term597102, term597102.getClass(), "type", 44);
        setField(term597032, term597032.getClass(), "next", term597102);
        setIntField(term597032, term597032.getClass(), "type", 0);
        setField(term596946, term596946.getClass(), "first", term597032);
        setIntField(term596946, term596946.getClass(), "type", 101);
        setField(term596946, term596946.getClass(), "parent", term597172);
        term597277 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term597277, term597277.getClass(), "currentTraversal", null);
        term597278 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term597279 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term597280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term597281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term597278, term597278.getClass(), "str", null);
        setIntField(term597278, term597278.getClass(), "type", 101);
        setField(term597278, term597278.getClass(), "next", null);
        setField(term597279, term597279.getClass(), "functionName", null);
        setBooleanField(term597279, term597279.getClass(), "itsNeedsActivation", false);
        setIntField(term597279, term597279.getClass(), "itsFunctionType", 0);
        setBooleanField(term597279, term597279.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term597279, term597279.getClass(), "encodedSourceStart", 0);
        setIntField(term597279, term597279.getClass(), "encodedSourceEnd", 0);
        setField(term597279, term597279.getClass(), "sourceName", null);
        setIntField(term597279, term597279.getClass(), "baseLineno", 0);
        setIntField(term597279, term597279.getClass(), "endLineno", 0);
        setField(term597279, term597279.getClass(), "functions", null);
        setField(term597279, term597279.getClass(), "regexps", null);
        setField(term597279, term597279.getClass(), "itsVariables", null);
        setField(term597279, term597279.getClass(), "itsConst", null);
        setField(term597279, term597279.getClass(), "itsVariableNames", null);
        setIntField(term597279, term597279.getClass(), "varStart", 0);
        setField(term597279, term597279.getClass(), "compilerData", null);
        setIntField(term597279, term597279.getClass(), "type", 0);
        setIntField(term597280, term597280.getClass(), "type", 44);
        setField(term597280, term597280.getClass(), "next", null);
        setField(term597280, term597280.getClass(), "first", null);
        setField(term597280, term597280.getClass(), "last", null);
        setField(term597280, term597280.getClass(), "propListHead", null);
        setIntField(term597280, term597280.getClass(), "sourcePosition", 0);
        setField(term597280, term597280.getClass(), "jsType", null);
        setField(term597280, term597280.getClass(), "parent", null);
        setField(term597279, term597279.getClass(), "next", term597280);
        setField(term597279, term597279.getClass(), "first", null);
        setField(term597279, term597279.getClass(), "last", null);
        setField(term597279, term597279.getClass(), "propListHead", null);
        setIntField(term597279, term597279.getClass(), "sourcePosition", 0);
        setField(term597279, term597279.getClass(), "jsType", null);
        setField(term597279, term597279.getClass(), "parent", null);
        setField(term597278, term597278.getClass(), "first", term597279);
        setField(term597278, term597278.getClass(), "last", null);
        setField(term597278, term597278.getClass(), "propListHead", null);
        setIntField(term597278, term597278.getClass(), "sourcePosition", 0);
        setField(term597278, term597278.getClass(), "jsType", null);
        setIntField(term597281, term597281.getClass(), "type", 0);
        setField(term597281, term597281.getClass(), "next", null);
        setField(term597281, term597281.getClass(), "first", null);
        setField(term597281, term597281.getClass(), "last", null);
        setField(term597281, term597281.getClass(), "propListHead", null);
        setIntField(term597281, term597281.getClass(), "sourcePosition", 0);
        setField(term597281, term597281.getClass(), "jsType", null);
        setField(term597281, term597281.getClass(), "parent", null);
        setField(term597278, term597278.getClass(), "parent", term597281);
        term597193 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term597195 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term597205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term597210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term597193, term597193.getClass(), "str", null);
        setIntField(term597193, term597193.getClass(), "type", 101);
        setField(term597193, term597193.getClass(), "next", null);
        setField(term597195, term597195.getClass(), "functionName", null);
        setBooleanField(term597195, term597195.getClass(), "itsNeedsActivation", false);
        setIntField(term597195, term597195.getClass(), "itsFunctionType", 0);
        setBooleanField(term597195, term597195.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term597195, term597195.getClass(), "encodedSourceStart", 0);
        setIntField(term597195, term597195.getClass(), "encodedSourceEnd", 0);
        setField(term597195, term597195.getClass(), "sourceName", null);
        setIntField(term597195, term597195.getClass(), "baseLineno", 0);
        setIntField(term597195, term597195.getClass(), "endLineno", 0);
        setField(term597195, term597195.getClass(), "functions", null);
        setField(term597195, term597195.getClass(), "regexps", null);
        setField(term597195, term597195.getClass(), "itsVariables", null);
        setField(term597195, term597195.getClass(), "itsConst", null);
        setField(term597195, term597195.getClass(), "itsVariableNames", null);
        setIntField(term597195, term597195.getClass(), "varStart", 0);
        setField(term597195, term597195.getClass(), "compilerData", null);
        setIntField(term597195, term597195.getClass(), "type", 0);
        setIntField(term597205, term597205.getClass(), "type", 44);
        setField(term597205, term597205.getClass(), "next", null);
        setField(term597205, term597205.getClass(), "first", null);
        setField(term597205, term597205.getClass(), "last", null);
        setField(term597205, term597205.getClass(), "propListHead", null);
        setIntField(term597205, term597205.getClass(), "sourcePosition", 0);
        setField(term597205, term597205.getClass(), "jsType", null);
        setField(term597205, term597205.getClass(), "parent", null);
        setField(term597195, term597195.getClass(), "next", term597205);
        setField(term597195, term597195.getClass(), "first", null);
        setField(term597195, term597195.getClass(), "last", null);
        setField(term597195, term597195.getClass(), "propListHead", null);
        setIntField(term597195, term597195.getClass(), "sourcePosition", 0);
        setField(term597195, term597195.getClass(), "jsType", null);
        setField(term597195, term597195.getClass(), "parent", null);
        setField(term597193, term597193.getClass(), "first", term597195);
        setField(term597193, term597193.getClass(), "last", null);
        setField(term597193, term597193.getClass(), "propListHead", null);
        setIntField(term597193, term597193.getClass(), "sourcePosition", 0);
        setField(term597193, term597193.getClass(), "jsType", null);
        setIntField(term597210, term597210.getClass(), "type", 0);
        setField(term597210, term597210.getClass(), "next", null);
        setField(term597210, term597210.getClass(), "first", null);
        setField(term597210, term597210.getClass(), "last", null);
        setField(term597210, term597210.getClass(), "propListHead", null);
        setIntField(term597210, term597210.getClass(), "sourcePosition", 0);
        setField(term597210, term597210.getClass(), "jsType", null);
        setField(term597210, term597210.getClass(), "parent", null);
        setField(term597193, term597193.getClass(), "parent", term597210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term596946;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term596854, args);
        assertTrue(recursiveEquals(term596854, term597277));
        assertTrue(recursiveEquals(term596946, term597278));
        assertTrue(recursiveEquals(retValue, term597193));
    }

};


