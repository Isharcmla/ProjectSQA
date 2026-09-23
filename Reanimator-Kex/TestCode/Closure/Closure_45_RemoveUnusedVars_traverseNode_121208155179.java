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

public class RemoveUnusedVars_traverseNode_121208155179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17807;
     Object term17899;
     Object term18830;
     Object term18831;

    public RemoveUnusedVars_traverseNode_121208155179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17807 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term17899 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term17991 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term18083 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term17899, term17899.getClass(), "type", -1876034267);
        setIntField(term17991, term17991.getClass(), "type", 1876034266);
        setField(term17991, term17991.getClass(), "first", term18083);
        setField(term17899, term17899.getClass(), "first", term17991);
        term18830 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term18830, term18830.getClass(), "compiler", null);
        setField(term18830, term18830.getClass(), "codingConvention", null);
        setBooleanField(term18830, term18830.getClass(), "removeGlobals", false);
        setBooleanField(term18830, term18830.getClass(), "preserveFunctionExpressionNames", false);
        setField(term18830, term18830.getClass(), "referenced", null);
        setField(term18830, term18830.getClass(), "maybeUnreferenced", null);
        setField(term18830, term18830.getClass(), "allFunctionScopes", null);
        setField(term18830, term18830.getClass(), "assignsByVar", null);
        setField(term18830, term18830.getClass(), "assignsByNode", null);
        setField(term18830, term18830.getClass(), "inheritsCalls", null);
        setField(term18830, term18830.getClass(), "continuations", null);
        setBooleanField(term18830, term18830.getClass(), "modifyCallSites", false);
        setField(term18830, term18830.getClass(), "callSiteOptimizer", null);
        term18831 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term18832 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term18833 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term18831, term18831.getClass(), "str", null);
        setIntField(term18831, term18831.getClass(), "type", -1876034267);
        setField(term18831, term18831.getClass(), "next", null);
        setField(term18832, term18832.getClass(), "str", null);
        setIntField(term18832, term18832.getClass(), "type", 1876034266);
        setField(term18832, term18832.getClass(), "next", null);
        setDoubleField(term18833, term18833.getClass(), "number", 0.0);
        setIntField(term18833, term18833.getClass(), "type", 0);
        setField(term18833, term18833.getClass(), "next", null);
        setField(term18833, term18833.getClass(), "first", null);
        setField(term18833, term18833.getClass(), "last", null);
        setField(term18833, term18833.getClass(), "propListHead", null);
        setIntField(term18833, term18833.getClass(), "sourcePosition", 0);
        setField(term18833, term18833.getClass(), "jsType", null);
        setField(term18833, term18833.getClass(), "parent", null);
        setField(term18832, term18832.getClass(), "first", term18833);
        setField(term18832, term18832.getClass(), "last", null);
        setField(term18832, term18832.getClass(), "propListHead", null);
        setIntField(term18832, term18832.getClass(), "sourcePosition", 0);
        setField(term18832, term18832.getClass(), "jsType", null);
        setField(term18832, term18832.getClass(), "parent", null);
        setField(term18831, term18831.getClass(), "first", term18832);
        setField(term18831, term18831.getClass(), "last", null);
        setField(term18831, term18831.getClass(), "propListHead", null);
        setIntField(term18831, term18831.getClass(), "sourcePosition", 0);
        setField(term18831, term18831.getClass(), "jsType", null);
        setField(term18831, term18831.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term17899;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term17807, args);
        assertTrue(recursiveEquals(term17807, term18830));
        assertTrue(recursiveEquals(term17899, term18831));
    }

};


