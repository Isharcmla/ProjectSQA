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

public class NodeUtil_canBeSideEffected_1382575805307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27807;
     Object term28165;

    public NodeUtil_canBeSideEffected_1382575805307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27807, term27807.getClass(), "type", 0);
        setIntField(term27877, term27877.getClass(), "type", 35);
        setField(term27807, term27807.getClass(), "first", term27877);
        term28165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28165, term28165.getClass(), "type", 0);
        setField(term28165, term28165.getClass(), "next", null);
        setIntField(term28166, term28166.getClass(), "type", 35);
        setField(term28166, term28166.getClass(), "next", null);
        setField(term28166, term28166.getClass(), "first", null);
        setField(term28166, term28166.getClass(), "last", null);
        setField(term28166, term28166.getClass(), "propListHead", null);
        setIntField(term28166, term28166.getClass(), "sourcePosition", 0);
        setField(term28166, term28166.getClass(), "jsType", null);
        setField(term28166, term28166.getClass(), "parent", null);
        setField(term28165, term28165.getClass(), "first", term28166);
        setField(term28165, term28165.getClass(), "last", null);
        setField(term28165, term28165.getClass(), "propListHead", null);
        setIntField(term28165, term28165.getClass(), "sourcePosition", 0);
        setField(term28165, term28165.getClass(), "jsType", null);
        setField(term28165, term28165.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27807;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term27807, term28165));
    }

};


