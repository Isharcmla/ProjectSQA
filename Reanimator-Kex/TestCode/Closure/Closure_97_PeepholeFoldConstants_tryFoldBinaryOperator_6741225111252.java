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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405491;
     Object term405583;
     Object term421473;
     Object term421474;
     Object term421442;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405491 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term405583 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term405675 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term405767 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term405675, term405675.getClass(), "next", term405767);
        setField(term405583, term405583.getClass(), "first", term405675);
        setIntField(term405583, term405583.getClass(), "type", 33);
        term421473 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term421473, term421473.getClass(), "currentTraversal", null);
        term421474 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421475 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421476 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term421474, term421474.getClass(), "str", null);
        setIntField(term421474, term421474.getClass(), "type", 33);
        setField(term421474, term421474.getClass(), "next", null);
        setField(term421475, term421475.getClass(), "str", null);
        setIntField(term421475, term421475.getClass(), "type", 0);
        setField(term421476, term421476.getClass(), "str", null);
        setIntField(term421476, term421476.getClass(), "type", 0);
        setField(term421476, term421476.getClass(), "next", null);
        setField(term421476, term421476.getClass(), "first", null);
        setField(term421476, term421476.getClass(), "last", null);
        setField(term421476, term421476.getClass(), "propListHead", null);
        setIntField(term421476, term421476.getClass(), "sourcePosition", 0);
        setField(term421476, term421476.getClass(), "jsType", null);
        setField(term421476, term421476.getClass(), "parent", null);
        setField(term421475, term421475.getClass(), "next", term421476);
        setField(term421475, term421475.getClass(), "first", null);
        setField(term421475, term421475.getClass(), "last", null);
        setField(term421475, term421475.getClass(), "propListHead", null);
        setIntField(term421475, term421475.getClass(), "sourcePosition", 0);
        setField(term421475, term421475.getClass(), "jsType", null);
        setField(term421475, term421475.getClass(), "parent", null);
        setField(term421474, term421474.getClass(), "first", term421475);
        setField(term421474, term421474.getClass(), "last", null);
        setField(term421474, term421474.getClass(), "propListHead", null);
        setIntField(term421474, term421474.getClass(), "sourcePosition", 0);
        setField(term421474, term421474.getClass(), "jsType", null);
        setField(term421474, term421474.getClass(), "parent", null);
        term421442 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421444 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421446 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term421442, term421442.getClass(), "str", null);
        setIntField(term421442, term421442.getClass(), "type", 33);
        setField(term421442, term421442.getClass(), "next", null);
        setField(term421444, term421444.getClass(), "str", null);
        setIntField(term421444, term421444.getClass(), "type", 0);
        setField(term421446, term421446.getClass(), "str", null);
        setIntField(term421446, term421446.getClass(), "type", 0);
        setField(term421446, term421446.getClass(), "next", null);
        setField(term421446, term421446.getClass(), "first", null);
        setField(term421446, term421446.getClass(), "last", null);
        setField(term421446, term421446.getClass(), "propListHead", null);
        setIntField(term421446, term421446.getClass(), "sourcePosition", 0);
        setField(term421446, term421446.getClass(), "jsType", null);
        setField(term421446, term421446.getClass(), "parent", null);
        setField(term421444, term421444.getClass(), "next", term421446);
        setField(term421444, term421444.getClass(), "first", null);
        setField(term421444, term421444.getClass(), "last", null);
        setField(term421444, term421444.getClass(), "propListHead", null);
        setIntField(term421444, term421444.getClass(), "sourcePosition", 0);
        setField(term421444, term421444.getClass(), "jsType", null);
        setField(term421444, term421444.getClass(), "parent", null);
        setField(term421442, term421442.getClass(), "first", term421444);
        setField(term421442, term421442.getClass(), "last", null);
        setField(term421442, term421442.getClass(), "propListHead", null);
        setIntField(term421442, term421442.getClass(), "sourcePosition", 0);
        setField(term421442, term421442.getClass(), "jsType", null);
        setField(term421442, term421442.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term405583;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term405491, args);
        assertTrue(recursiveEquals(term405491, term421473));
        assertTrue(recursiveEquals(term405583, term421474));
        assertTrue(recursiveEquals(retValue, term421442));
    }

};


