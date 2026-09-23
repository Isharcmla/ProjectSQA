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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358075;
     Object term358167;
     Object term358810;
     Object term358811;
     Object term358774;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358075 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term358167 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term358259 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term358351 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term358259, term358259.getClass(), "next", term358351);
        setIntField(term358259, term358259.getClass(), "type", 39);
        setField(term358167, term358167.getClass(), "first", term358259);
        setIntField(term358167, term358167.getClass(), "type", 19);
        term358810 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term358810, term358810.getClass(), "currentTraversal", null);
        term358811 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term358812 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term358813 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term358811, term358811.getClass(), "number", 0.0);
        setIntField(term358811, term358811.getClass(), "type", 19);
        setField(term358811, term358811.getClass(), "next", null);
        setDoubleField(term358812, term358812.getClass(), "number", 0.0);
        setIntField(term358812, term358812.getClass(), "type", 39);
        setDoubleField(term358813, term358813.getClass(), "number", 0.0);
        setIntField(term358813, term358813.getClass(), "type", 0);
        setField(term358813, term358813.getClass(), "next", null);
        setField(term358813, term358813.getClass(), "first", null);
        setField(term358813, term358813.getClass(), "last", null);
        setField(term358813, term358813.getClass(), "propListHead", null);
        setIntField(term358813, term358813.getClass(), "sourcePosition", 0);
        setField(term358813, term358813.getClass(), "jsType", null);
        setField(term358813, term358813.getClass(), "parent", null);
        setField(term358812, term358812.getClass(), "next", term358813);
        setField(term358812, term358812.getClass(), "first", null);
        setField(term358812, term358812.getClass(), "last", null);
        setField(term358812, term358812.getClass(), "propListHead", null);
        setIntField(term358812, term358812.getClass(), "sourcePosition", 0);
        setField(term358812, term358812.getClass(), "jsType", null);
        setField(term358812, term358812.getClass(), "parent", null);
        setField(term358811, term358811.getClass(), "first", term358812);
        setField(term358811, term358811.getClass(), "last", null);
        setField(term358811, term358811.getClass(), "propListHead", null);
        setIntField(term358811, term358811.getClass(), "sourcePosition", 0);
        setField(term358811, term358811.getClass(), "jsType", null);
        setField(term358811, term358811.getClass(), "parent", null);
        term358774 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term358777 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term358780 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term358774, term358774.getClass(), "number", 0.0);
        setIntField(term358774, term358774.getClass(), "type", 19);
        setField(term358774, term358774.getClass(), "next", null);
        setDoubleField(term358777, term358777.getClass(), "number", 0.0);
        setIntField(term358777, term358777.getClass(), "type", 39);
        setDoubleField(term358780, term358780.getClass(), "number", 0.0);
        setIntField(term358780, term358780.getClass(), "type", 0);
        setField(term358780, term358780.getClass(), "next", null);
        setField(term358780, term358780.getClass(), "first", null);
        setField(term358780, term358780.getClass(), "last", null);
        setField(term358780, term358780.getClass(), "propListHead", null);
        setIntField(term358780, term358780.getClass(), "sourcePosition", 0);
        setField(term358780, term358780.getClass(), "jsType", null);
        setField(term358780, term358780.getClass(), "parent", null);
        setField(term358777, term358777.getClass(), "next", term358780);
        setField(term358777, term358777.getClass(), "first", null);
        setField(term358777, term358777.getClass(), "last", null);
        setField(term358777, term358777.getClass(), "propListHead", null);
        setIntField(term358777, term358777.getClass(), "sourcePosition", 0);
        setField(term358777, term358777.getClass(), "jsType", null);
        setField(term358777, term358777.getClass(), "parent", null);
        setField(term358774, term358774.getClass(), "first", term358777);
        setField(term358774, term358774.getClass(), "last", null);
        setField(term358774, term358774.getClass(), "propListHead", null);
        setIntField(term358774, term358774.getClass(), "sourcePosition", 0);
        setField(term358774, term358774.getClass(), "jsType", null);
        setField(term358774, term358774.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term358167;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term358075, args);
        assertTrue(recursiveEquals(term358075, term358810));
        assertTrue(recursiveEquals(term358167, term358811));
        assertTrue(recursiveEquals(retValue, term358774));
    }

};


