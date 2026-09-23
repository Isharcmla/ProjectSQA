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

public class NodeUtil_canBeSideEffected_1382575805426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37508;
     Object term59253;

    public NodeUtil_canBeSideEffected_1382575805426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37508, term37508.getClass(), "type", 2);
        setIntField(term37578, term37578.getClass(), "type", 1);
        setIntField(term37648, term37648.getClass(), "type", 0);
        setField(term37648, term37648.getClass(), "first", null);
        setField(term37648, term37648.getClass(), "next", null);
        setField(term37578, term37578.getClass(), "first", term37648);
        setIntField(term37718, term37718.getClass(), "type", 37);
        setField(term37578, term37578.getClass(), "next", term37718);
        setField(term37508, term37508.getClass(), "first", term37578);
        term59253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59253, term59253.getClass(), "type", 2);
        setField(term59253, term59253.getClass(), "next", null);
        setIntField(term59254, term59254.getClass(), "type", 1);
        setIntField(term59255, term59255.getClass(), "type", 37);
        setField(term59255, term59255.getClass(), "next", null);
        setField(term59255, term59255.getClass(), "first", null);
        setField(term59255, term59255.getClass(), "last", null);
        setField(term59255, term59255.getClass(), "propListHead", null);
        setIntField(term59255, term59255.getClass(), "sourcePosition", 0);
        setField(term59255, term59255.getClass(), "jsType", null);
        setField(term59255, term59255.getClass(), "parent", null);
        setField(term59254, term59254.getClass(), "next", term59255);
        setIntField(term59256, term59256.getClass(), "type", 0);
        setField(term59256, term59256.getClass(), "next", null);
        setField(term59256, term59256.getClass(), "first", null);
        setField(term59256, term59256.getClass(), "last", null);
        setField(term59256, term59256.getClass(), "propListHead", null);
        setIntField(term59256, term59256.getClass(), "sourcePosition", 0);
        setField(term59256, term59256.getClass(), "jsType", null);
        setField(term59256, term59256.getClass(), "parent", null);
        setField(term59254, term59254.getClass(), "first", term59256);
        setField(term59254, term59254.getClass(), "last", null);
        setField(term59254, term59254.getClass(), "propListHead", null);
        setIntField(term59254, term59254.getClass(), "sourcePosition", 0);
        setField(term59254, term59254.getClass(), "jsType", null);
        setField(term59254, term59254.getClass(), "parent", null);
        setField(term59253, term59253.getClass(), "first", term59254);
        setField(term59253, term59253.getClass(), "last", null);
        setField(term59253, term59253.getClass(), "propListHead", null);
        setIntField(term59253, term59253.getClass(), "sourcePosition", 0);
        setField(term59253, term59253.getClass(), "jsType", null);
        setField(term59253, term59253.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37508;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term37508, term59253));
    }

};


