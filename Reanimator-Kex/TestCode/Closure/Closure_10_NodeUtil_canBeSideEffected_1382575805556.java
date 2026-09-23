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

public class NodeUtil_canBeSideEffected_1382575805556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1197438;
     Object term1312775;

    public NodeUtil_canBeSideEffected_1382575805556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1197438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1197530 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term1197438, term1197438.getClass(), "type", 0);
        setField(term1197438, term1197438.getClass(), "first", term1197530);
        term1312775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1312776 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term1312775, term1312775.getClass(), "type", 0);
        setField(term1312775, term1312775.getClass(), "next", null);
        setField(term1312776, term1312776.getClass(), "str", null);
        setIntField(term1312776, term1312776.getClass(), "type", 0);
        setField(term1312776, term1312776.getClass(), "next", null);
        setField(term1312776, term1312776.getClass(), "first", null);
        setField(term1312776, term1312776.getClass(), "last", null);
        setField(term1312776, term1312776.getClass(), "propListHead", null);
        setIntField(term1312776, term1312776.getClass(), "sourcePosition", 0);
        setField(term1312776, term1312776.getClass(), "jsType", null);
        setField(term1312776, term1312776.getClass(), "parent", null);
        setField(term1312775, term1312775.getClass(), "first", term1312776);
        setField(term1312775, term1312775.getClass(), "last", null);
        setField(term1312775, term1312775.getClass(), "propListHead", null);
        setIntField(term1312775, term1312775.getClass(), "sourcePosition", 0);
        setField(term1312775, term1312775.getClass(), "jsType", null);
        setField(term1312775, term1312775.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1197438;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term1197438, term1312775));
    }

};


