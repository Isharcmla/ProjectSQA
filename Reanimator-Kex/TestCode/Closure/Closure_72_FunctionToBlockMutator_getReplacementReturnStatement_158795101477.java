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

public class FunctionToBlockMutator_getReplacementReturnStatement_158795101477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20862;
     Object term29322;
     Object term29307;

    public FunctionToBlockMutator_getReplacementReturnStatement_158795101477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20862 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term20954 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term20954, term20954.getClass(), "first", null);
        setField(term20862, term20862.getClass(), "first", term20954);
        term29322 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term29323 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term29322, term29322.getClass(), "number", 0.0);
        setIntField(term29322, term29322.getClass(), "type", 0);
        setField(term29322, term29322.getClass(), "next", null);
        setDoubleField(term29323, term29323.getClass(), "number", 0.0);
        setIntField(term29323, term29323.getClass(), "type", 0);
        setField(term29323, term29323.getClass(), "next", null);
        setField(term29323, term29323.getClass(), "first", null);
        setField(term29323, term29323.getClass(), "last", null);
        setField(term29323, term29323.getClass(), "propListHead", null);
        setIntField(term29323, term29323.getClass(), "sourcePosition", 0);
        setField(term29323, term29323.getClass(), "jsType", null);
        setField(term29323, term29323.getClass(), "parent", null);
        setField(term29322, term29322.getClass(), "first", term29323);
        setField(term29322, term29322.getClass(), "last", null);
        setField(term29322, term29322.getClass(), "propListHead", null);
        setIntField(term29322, term29322.getClass(), "sourcePosition", 0);
        setField(term29322, term29322.getClass(), "jsType", null);
        setField(term29322, term29322.getClass(), "parent", null);
        term29307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29311 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term29315 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term29307, term29307.getClass(), "type", 130);
        setField(term29307, term29307.getClass(), "next", null);
        setIntField(term29309, term29309.getClass(), "type", 86);
        setField(term29309, term29309.getClass(), "next", null);
        setField(term29311, term29311.getClass(), "str", "");
        setIntField(term29311, term29311.getClass(), "type", 38);
        setDoubleField(term29315, term29315.getClass(), "number", 0.0);
        setIntField(term29315, term29315.getClass(), "type", 0);
        setField(term29315, term29315.getClass(), "next", null);
        setField(term29315, term29315.getClass(), "first", null);
        setField(term29315, term29315.getClass(), "last", null);
        setField(term29315, term29315.getClass(), "propListHead", null);
        setIntField(term29315, term29315.getClass(), "sourcePosition", 0);
        setField(term29315, term29315.getClass(), "jsType", null);
        setField(term29315, term29315.getClass(), "parent", term29309);
        setField(term29311, term29311.getClass(), "next", term29315);
        setField(term29311, term29311.getClass(), "first", null);
        setField(term29311, term29311.getClass(), "last", null);
        setField(term29311, term29311.getClass(), "propListHead", null);
        setIntField(term29311, term29311.getClass(), "sourcePosition", -1);
        setField(term29311, term29311.getClass(), "jsType", null);
        setField(term29311, term29311.getClass(), "parent", term29309);
        setField(term29309, term29309.getClass(), "first", term29311);
        setField(term29309, term29309.getClass(), "last", term29315);
        setField(term29309, term29309.getClass(), "propListHead", null);
        setIntField(term29309, term29309.getClass(), "sourcePosition", -1);
        setField(term29309, term29309.getClass(), "jsType", null);
        setField(term29309, term29309.getClass(), "parent", term29307);
        setField(term29307, term29307.getClass(), "first", term29309);
        setField(term29307, term29307.getClass(), "last", term29309);
        setField(term29307, term29307.getClass(), "propListHead", null);
        setIntField(term29307, term29307.getClass(), "sourcePosition", -1);
        setField(term29307, term29307.getClass(), "jsType", null);
        setField(term29307, term29307.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term20862;
        args[1] = "";
        Object retValue = callMethod(klass, "getReplacementReturnStatement", argTypes, null, args);
        assertTrue(recursiveEquals(term20862, term29322));
        assertTrue(recursiveEquals(retValue, term29307));
    }

};


