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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term697861;
     Object term697953;
     Object term698202;
     Object term698203;
     Object term698145;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term697861 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term697953 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term698045 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term698137 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term698045, term698045.getClass(), "next", term698137);
        setIntField(term698045, term698045.getClass(), "type", 0);
        setField(term697953, term697953.getClass(), "first", term698045);
        setIntField(term697953, term697953.getClass(), "type", 100);
        setField(term697953, term697953.getClass(), "parent", null);
        term698202 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term698202, term698202.getClass(), "currentTraversal", null);
        term698203 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term698204 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term698205 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term698203, term698203.getClass(), "number", 0.0);
        setIntField(term698203, term698203.getClass(), "type", 100);
        setField(term698203, term698203.getClass(), "next", null);
        setDoubleField(term698204, term698204.getClass(), "number", 0.0);
        setIntField(term698204, term698204.getClass(), "type", 0);
        setField(term698205, term698205.getClass(), "str", null);
        setIntField(term698205, term698205.getClass(), "type", 0);
        setField(term698205, term698205.getClass(), "next", null);
        setField(term698205, term698205.getClass(), "first", null);
        setField(term698205, term698205.getClass(), "last", null);
        setField(term698205, term698205.getClass(), "propListHead", null);
        setIntField(term698205, term698205.getClass(), "sourcePosition", 0);
        setField(term698205, term698205.getClass(), "jsType", null);
        setField(term698205, term698205.getClass(), "parent", null);
        setField(term698204, term698204.getClass(), "next", term698205);
        setField(term698204, term698204.getClass(), "first", null);
        setField(term698204, term698204.getClass(), "last", null);
        setField(term698204, term698204.getClass(), "propListHead", null);
        setIntField(term698204, term698204.getClass(), "sourcePosition", 0);
        setField(term698204, term698204.getClass(), "jsType", null);
        setField(term698204, term698204.getClass(), "parent", null);
        setField(term698203, term698203.getClass(), "first", term698204);
        setField(term698203, term698203.getClass(), "last", null);
        setField(term698203, term698203.getClass(), "propListHead", null);
        setIntField(term698203, term698203.getClass(), "sourcePosition", 0);
        setField(term698203, term698203.getClass(), "jsType", null);
        setField(term698203, term698203.getClass(), "parent", null);
        term698145 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term698148 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term698151 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term698145, term698145.getClass(), "number", 0.0);
        setIntField(term698145, term698145.getClass(), "type", 100);
        setField(term698145, term698145.getClass(), "next", null);
        setDoubleField(term698148, term698148.getClass(), "number", 0.0);
        setIntField(term698148, term698148.getClass(), "type", 0);
        setField(term698151, term698151.getClass(), "str", null);
        setIntField(term698151, term698151.getClass(), "type", 0);
        setField(term698151, term698151.getClass(), "next", null);
        setField(term698151, term698151.getClass(), "first", null);
        setField(term698151, term698151.getClass(), "last", null);
        setField(term698151, term698151.getClass(), "propListHead", null);
        setIntField(term698151, term698151.getClass(), "sourcePosition", 0);
        setField(term698151, term698151.getClass(), "jsType", null);
        setField(term698151, term698151.getClass(), "parent", null);
        setField(term698148, term698148.getClass(), "next", term698151);
        setField(term698148, term698148.getClass(), "first", null);
        setField(term698148, term698148.getClass(), "last", null);
        setField(term698148, term698148.getClass(), "propListHead", null);
        setIntField(term698148, term698148.getClass(), "sourcePosition", 0);
        setField(term698148, term698148.getClass(), "jsType", null);
        setField(term698148, term698148.getClass(), "parent", null);
        setField(term698145, term698145.getClass(), "first", term698148);
        setField(term698145, term698145.getClass(), "last", null);
        setField(term698145, term698145.getClass(), "propListHead", null);
        setIntField(term698145, term698145.getClass(), "sourcePosition", 0);
        setField(term698145, term698145.getClass(), "jsType", null);
        setField(term698145, term698145.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term697953;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term697861, args);
        assertTrue(recursiveEquals(term697861, term698202));
        assertTrue(recursiveEquals(term697953, term698203));
        assertTrue(recursiveEquals(retValue, term698145));
    }

};


