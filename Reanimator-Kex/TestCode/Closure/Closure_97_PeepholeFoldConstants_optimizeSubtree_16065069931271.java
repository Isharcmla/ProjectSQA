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

public class PeepholeFoldConstants_optimizeSubtree_16065069931271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424976;
     Object term425068;
     Object term426125;
     Object term426126;
     Object term426065;

    public PeepholeFoldConstants_optimizeSubtree_16065069931271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424976 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term425068 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term425160 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term425252 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term425068, term425068.getClass(), "type", 35);
        setField(term425160, term425160.getClass(), "next", term425252);
        setIntField(term425160, term425160.getClass(), "type", 63);
        setField(term425068, term425068.getClass(), "first", term425160);
        term426125 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term426125, term426125.getClass(), "currentTraversal", null);
        term426126 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term426127 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term426128 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term426126, term426126.getClass(), "number", 0.0);
        setIntField(term426126, term426126.getClass(), "type", 35);
        setField(term426126, term426126.getClass(), "next", null);
        setDoubleField(term426127, term426127.getClass(), "number", 0.0);
        setIntField(term426127, term426127.getClass(), "type", 63);
        setDoubleField(term426128, term426128.getClass(), "number", 0.0);
        setIntField(term426128, term426128.getClass(), "type", 0);
        setField(term426128, term426128.getClass(), "next", null);
        setField(term426128, term426128.getClass(), "first", null);
        setField(term426128, term426128.getClass(), "last", null);
        setField(term426128, term426128.getClass(), "propListHead", null);
        setIntField(term426128, term426128.getClass(), "sourcePosition", 0);
        setField(term426128, term426128.getClass(), "jsType", null);
        setField(term426128, term426128.getClass(), "parent", null);
        setField(term426127, term426127.getClass(), "next", term426128);
        setField(term426127, term426127.getClass(), "first", null);
        setField(term426127, term426127.getClass(), "last", null);
        setField(term426127, term426127.getClass(), "propListHead", null);
        setIntField(term426127, term426127.getClass(), "sourcePosition", 0);
        setField(term426127, term426127.getClass(), "jsType", null);
        setField(term426127, term426127.getClass(), "parent", null);
        setField(term426126, term426126.getClass(), "first", term426127);
        setField(term426126, term426126.getClass(), "last", null);
        setField(term426126, term426126.getClass(), "propListHead", null);
        setIntField(term426126, term426126.getClass(), "sourcePosition", 0);
        setField(term426126, term426126.getClass(), "jsType", null);
        setField(term426126, term426126.getClass(), "parent", null);
        term426065 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term426068 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term426071 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term426065, term426065.getClass(), "number", 0.0);
        setIntField(term426065, term426065.getClass(), "type", 35);
        setField(term426065, term426065.getClass(), "next", null);
        setDoubleField(term426068, term426068.getClass(), "number", 0.0);
        setIntField(term426068, term426068.getClass(), "type", 63);
        setDoubleField(term426071, term426071.getClass(), "number", 0.0);
        setIntField(term426071, term426071.getClass(), "type", 0);
        setField(term426071, term426071.getClass(), "next", null);
        setField(term426071, term426071.getClass(), "first", null);
        setField(term426071, term426071.getClass(), "last", null);
        setField(term426071, term426071.getClass(), "propListHead", null);
        setIntField(term426071, term426071.getClass(), "sourcePosition", 0);
        setField(term426071, term426071.getClass(), "jsType", null);
        setField(term426071, term426071.getClass(), "parent", null);
        setField(term426068, term426068.getClass(), "next", term426071);
        setField(term426068, term426068.getClass(), "first", null);
        setField(term426068, term426068.getClass(), "last", null);
        setField(term426068, term426068.getClass(), "propListHead", null);
        setIntField(term426068, term426068.getClass(), "sourcePosition", 0);
        setField(term426068, term426068.getClass(), "jsType", null);
        setField(term426068, term426068.getClass(), "parent", null);
        setField(term426065, term426065.getClass(), "first", term426068);
        setField(term426065, term426065.getClass(), "last", null);
        setField(term426065, term426065.getClass(), "propListHead", null);
        setIntField(term426065, term426065.getClass(), "sourcePosition", 0);
        setField(term426065, term426065.getClass(), "jsType", null);
        setField(term426065, term426065.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term425068;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term424976, args);
        assertTrue(recursiveEquals(term424976, term426125));
        assertTrue(recursiveEquals(term425068, term426126));
        assertTrue(recursiveEquals(retValue, term426065));
    }

};


