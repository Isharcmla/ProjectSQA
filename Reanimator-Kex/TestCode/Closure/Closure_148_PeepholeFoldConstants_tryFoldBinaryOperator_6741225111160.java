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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273378;
     Object term273470;
     Object term274484;
     Object term274485;
     Object term274437;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273378 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term273470 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term273556 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term273626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term273556, term273556.getClass(), "next", term273626);
        setField(term273470, term273470.getClass(), "first", term273556);
        setIntField(term273470, term273470.getClass(), "type", 11);
        term274484 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term274484, term274484.getClass(), "currentTraversal", null);
        term274485 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term274486 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term274487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term274485, term274485.getClass(), "str", null);
        setIntField(term274485, term274485.getClass(), "type", 11);
        setField(term274485, term274485.getClass(), "next", null);
        setField(term274486, term274486.getClass(), "functionName", null);
        setBooleanField(term274486, term274486.getClass(), "itsNeedsActivation", false);
        setIntField(term274486, term274486.getClass(), "itsFunctionType", 0);
        setBooleanField(term274486, term274486.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term274486, term274486.getClass(), "encodedSourceStart", 0);
        setIntField(term274486, term274486.getClass(), "encodedSourceEnd", 0);
        setField(term274486, term274486.getClass(), "sourceName", null);
        setIntField(term274486, term274486.getClass(), "baseLineno", 0);
        setIntField(term274486, term274486.getClass(), "endLineno", 0);
        setField(term274486, term274486.getClass(), "functions", null);
        setField(term274486, term274486.getClass(), "regexps", null);
        setField(term274486, term274486.getClass(), "itsVariables", null);
        setField(term274486, term274486.getClass(), "itsConst", null);
        setField(term274486, term274486.getClass(), "itsVariableNames", null);
        setIntField(term274486, term274486.getClass(), "varStart", 0);
        setField(term274486, term274486.getClass(), "compilerData", null);
        setIntField(term274486, term274486.getClass(), "type", 0);
        setIntField(term274487, term274487.getClass(), "type", 0);
        setField(term274487, term274487.getClass(), "next", null);
        setField(term274487, term274487.getClass(), "first", null);
        setField(term274487, term274487.getClass(), "last", null);
        setField(term274487, term274487.getClass(), "propListHead", null);
        setIntField(term274487, term274487.getClass(), "sourcePosition", 0);
        setField(term274487, term274487.getClass(), "jsType", null);
        setField(term274487, term274487.getClass(), "parent", null);
        setField(term274486, term274486.getClass(), "next", term274487);
        setField(term274486, term274486.getClass(), "first", null);
        setField(term274486, term274486.getClass(), "last", null);
        setField(term274486, term274486.getClass(), "propListHead", null);
        setIntField(term274486, term274486.getClass(), "sourcePosition", 0);
        setField(term274486, term274486.getClass(), "jsType", null);
        setField(term274486, term274486.getClass(), "parent", null);
        setField(term274485, term274485.getClass(), "first", term274486);
        setField(term274485, term274485.getClass(), "last", null);
        setField(term274485, term274485.getClass(), "propListHead", null);
        setIntField(term274485, term274485.getClass(), "sourcePosition", 0);
        setField(term274485, term274485.getClass(), "jsType", null);
        setField(term274485, term274485.getClass(), "parent", null);
        term274437 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term274439 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term274449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term274437, term274437.getClass(), "str", null);
        setIntField(term274437, term274437.getClass(), "type", 11);
        setField(term274437, term274437.getClass(), "next", null);
        setField(term274439, term274439.getClass(), "functionName", null);
        setBooleanField(term274439, term274439.getClass(), "itsNeedsActivation", false);
        setIntField(term274439, term274439.getClass(), "itsFunctionType", 0);
        setBooleanField(term274439, term274439.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term274439, term274439.getClass(), "encodedSourceStart", 0);
        setIntField(term274439, term274439.getClass(), "encodedSourceEnd", 0);
        setField(term274439, term274439.getClass(), "sourceName", null);
        setIntField(term274439, term274439.getClass(), "baseLineno", 0);
        setIntField(term274439, term274439.getClass(), "endLineno", 0);
        setField(term274439, term274439.getClass(), "functions", null);
        setField(term274439, term274439.getClass(), "regexps", null);
        setField(term274439, term274439.getClass(), "itsVariables", null);
        setField(term274439, term274439.getClass(), "itsConst", null);
        setField(term274439, term274439.getClass(), "itsVariableNames", null);
        setIntField(term274439, term274439.getClass(), "varStart", 0);
        setField(term274439, term274439.getClass(), "compilerData", null);
        setIntField(term274439, term274439.getClass(), "type", 0);
        setIntField(term274449, term274449.getClass(), "type", 0);
        setField(term274449, term274449.getClass(), "next", null);
        setField(term274449, term274449.getClass(), "first", null);
        setField(term274449, term274449.getClass(), "last", null);
        setField(term274449, term274449.getClass(), "propListHead", null);
        setIntField(term274449, term274449.getClass(), "sourcePosition", 0);
        setField(term274449, term274449.getClass(), "jsType", null);
        setField(term274449, term274449.getClass(), "parent", null);
        setField(term274439, term274439.getClass(), "next", term274449);
        setField(term274439, term274439.getClass(), "first", null);
        setField(term274439, term274439.getClass(), "last", null);
        setField(term274439, term274439.getClass(), "propListHead", null);
        setIntField(term274439, term274439.getClass(), "sourcePosition", 0);
        setField(term274439, term274439.getClass(), "jsType", null);
        setField(term274439, term274439.getClass(), "parent", null);
        setField(term274437, term274437.getClass(), "first", term274439);
        setField(term274437, term274437.getClass(), "last", null);
        setField(term274437, term274437.getClass(), "propListHead", null);
        setIntField(term274437, term274437.getClass(), "sourcePosition", 0);
        setField(term274437, term274437.getClass(), "jsType", null);
        setField(term274437, term274437.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term273470;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term273378, args);
        assertTrue(recursiveEquals(term273378, term274484));
        assertTrue(recursiveEquals(term273470, term274485));
        assertTrue(recursiveEquals(retValue, term274437));
    }

};


