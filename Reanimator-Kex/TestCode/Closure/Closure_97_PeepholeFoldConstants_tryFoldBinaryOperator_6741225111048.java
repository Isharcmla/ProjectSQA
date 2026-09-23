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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326133;
     Object term326225;
     Object term326517;
     Object term326518;
     Object term326479;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326133 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term326225 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term326317 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term326409 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term326317, term326317.getClass(), "next", term326409);
        setIntField(term326317, term326317.getClass(), "type", 39);
        setField(term326225, term326225.getClass(), "first", term326317);
        setIntField(term326225, term326225.getClass(), "type", 9);
        term326517 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term326517, term326517.getClass(), "currentTraversal", null);
        term326518 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term326519 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term326520 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term326518, term326518.getClass(), "str", null);
        setIntField(term326518, term326518.getClass(), "type", 9);
        setField(term326518, term326518.getClass(), "next", null);
        setField(term326519, term326519.getClass(), "str", null);
        setIntField(term326519, term326519.getClass(), "type", 39);
        setDoubleField(term326520, term326520.getClass(), "number", 0.0);
        setIntField(term326520, term326520.getClass(), "type", 0);
        setField(term326520, term326520.getClass(), "next", null);
        setField(term326520, term326520.getClass(), "first", null);
        setField(term326520, term326520.getClass(), "last", null);
        setField(term326520, term326520.getClass(), "propListHead", null);
        setIntField(term326520, term326520.getClass(), "sourcePosition", 0);
        setField(term326520, term326520.getClass(), "jsType", null);
        setField(term326520, term326520.getClass(), "parent", null);
        setField(term326519, term326519.getClass(), "next", term326520);
        setField(term326519, term326519.getClass(), "first", null);
        setField(term326519, term326519.getClass(), "last", null);
        setField(term326519, term326519.getClass(), "propListHead", null);
        setIntField(term326519, term326519.getClass(), "sourcePosition", 0);
        setField(term326519, term326519.getClass(), "jsType", null);
        setField(term326519, term326519.getClass(), "parent", null);
        setField(term326518, term326518.getClass(), "first", term326519);
        setField(term326518, term326518.getClass(), "last", null);
        setField(term326518, term326518.getClass(), "propListHead", null);
        setIntField(term326518, term326518.getClass(), "sourcePosition", 0);
        setField(term326518, term326518.getClass(), "jsType", null);
        setField(term326518, term326518.getClass(), "parent", null);
        term326479 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term326481 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term326483 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term326479, term326479.getClass(), "str", null);
        setIntField(term326479, term326479.getClass(), "type", 9);
        setField(term326479, term326479.getClass(), "next", null);
        setField(term326481, term326481.getClass(), "str", null);
        setIntField(term326481, term326481.getClass(), "type", 39);
        setDoubleField(term326483, term326483.getClass(), "number", 0.0);
        setIntField(term326483, term326483.getClass(), "type", 0);
        setField(term326483, term326483.getClass(), "next", null);
        setField(term326483, term326483.getClass(), "first", null);
        setField(term326483, term326483.getClass(), "last", null);
        setField(term326483, term326483.getClass(), "propListHead", null);
        setIntField(term326483, term326483.getClass(), "sourcePosition", 0);
        setField(term326483, term326483.getClass(), "jsType", null);
        setField(term326483, term326483.getClass(), "parent", null);
        setField(term326481, term326481.getClass(), "next", term326483);
        setField(term326481, term326481.getClass(), "first", null);
        setField(term326481, term326481.getClass(), "last", null);
        setField(term326481, term326481.getClass(), "propListHead", null);
        setIntField(term326481, term326481.getClass(), "sourcePosition", 0);
        setField(term326481, term326481.getClass(), "jsType", null);
        setField(term326481, term326481.getClass(), "parent", null);
        setField(term326479, term326479.getClass(), "first", term326481);
        setField(term326479, term326479.getClass(), "last", null);
        setField(term326479, term326479.getClass(), "propListHead", null);
        setIntField(term326479, term326479.getClass(), "sourcePosition", 0);
        setField(term326479, term326479.getClass(), "jsType", null);
        setField(term326479, term326479.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term326225;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term326133, args);
        assertTrue(recursiveEquals(term326133, term326517));
        assertTrue(recursiveEquals(term326225, term326518));
        assertTrue(recursiveEquals(retValue, term326479));
    }

};


