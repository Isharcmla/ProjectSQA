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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174315;
     Object term174407;
     Object term174646;
     Object term174647;
     Object term174599;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174315 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term174407 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term174499 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term174591 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term174499, term174499.getClass(), "next", term174591);
        setIntField(term174499, term174499.getClass(), "type", 14);
        setField(term174407, term174407.getClass(), "first", term174499);
        setIntField(term174407, term174407.getClass(), "type", 14);
        term174646 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term174646, term174646.getClass(), "currentTraversal", null);
        term174647 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term174648 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term174649 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term174647, term174647.getClass(), "str", null);
        setIntField(term174647, term174647.getClass(), "type", 14);
        setField(term174647, term174647.getClass(), "next", null);
        setField(term174648, term174648.getClass(), "str", null);
        setIntField(term174648, term174648.getClass(), "type", 14);
        setDoubleField(term174649, term174649.getClass(), "number", 0.0);
        setIntField(term174649, term174649.getClass(), "type", 0);
        setField(term174649, term174649.getClass(), "next", null);
        setField(term174649, term174649.getClass(), "first", null);
        setField(term174649, term174649.getClass(), "last", null);
        setField(term174649, term174649.getClass(), "propListHead", null);
        setIntField(term174649, term174649.getClass(), "sourcePosition", 0);
        setField(term174649, term174649.getClass(), "jsType", null);
        setField(term174649, term174649.getClass(), "parent", null);
        setField(term174648, term174648.getClass(), "next", term174649);
        setField(term174648, term174648.getClass(), "first", null);
        setField(term174648, term174648.getClass(), "last", null);
        setField(term174648, term174648.getClass(), "propListHead", null);
        setIntField(term174648, term174648.getClass(), "sourcePosition", 0);
        setField(term174648, term174648.getClass(), "jsType", null);
        setField(term174648, term174648.getClass(), "parent", null);
        setField(term174647, term174647.getClass(), "first", term174648);
        setField(term174647, term174647.getClass(), "last", null);
        setField(term174647, term174647.getClass(), "propListHead", null);
        setIntField(term174647, term174647.getClass(), "sourcePosition", 0);
        setField(term174647, term174647.getClass(), "jsType", null);
        setField(term174647, term174647.getClass(), "parent", null);
        term174599 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term174601 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term174603 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term174599, term174599.getClass(), "str", null);
        setIntField(term174599, term174599.getClass(), "type", 14);
        setField(term174599, term174599.getClass(), "next", null);
        setField(term174601, term174601.getClass(), "str", null);
        setIntField(term174601, term174601.getClass(), "type", 14);
        setDoubleField(term174603, term174603.getClass(), "number", 0.0);
        setIntField(term174603, term174603.getClass(), "type", 0);
        setField(term174603, term174603.getClass(), "next", null);
        setField(term174603, term174603.getClass(), "first", null);
        setField(term174603, term174603.getClass(), "last", null);
        setField(term174603, term174603.getClass(), "propListHead", null);
        setIntField(term174603, term174603.getClass(), "sourcePosition", 0);
        setField(term174603, term174603.getClass(), "jsType", null);
        setField(term174603, term174603.getClass(), "parent", null);
        setField(term174601, term174601.getClass(), "next", term174603);
        setField(term174601, term174601.getClass(), "first", null);
        setField(term174601, term174601.getClass(), "last", null);
        setField(term174601, term174601.getClass(), "propListHead", null);
        setIntField(term174601, term174601.getClass(), "sourcePosition", 0);
        setField(term174601, term174601.getClass(), "jsType", null);
        setField(term174601, term174601.getClass(), "parent", null);
        setField(term174599, term174599.getClass(), "first", term174601);
        setField(term174599, term174599.getClass(), "last", null);
        setField(term174599, term174599.getClass(), "propListHead", null);
        setIntField(term174599, term174599.getClass(), "sourcePosition", 0);
        setField(term174599, term174599.getClass(), "jsType", null);
        setField(term174599, term174599.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term174407;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term174315, args);
        assertTrue(recursiveEquals(term174315, term174646));
        assertTrue(recursiveEquals(term174407, term174647));
        assertTrue(recursiveEquals(retValue, term174599));
    }

};


