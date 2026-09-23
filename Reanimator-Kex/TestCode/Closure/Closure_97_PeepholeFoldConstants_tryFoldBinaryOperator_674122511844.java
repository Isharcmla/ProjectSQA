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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241235;
     Object term241327;
     Object term241576;
     Object term241577;
     Object term241519;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241235 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term241327 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241419 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241511 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term241419, term241419.getClass(), "next", term241511);
        setIntField(term241419, term241419.getClass(), "type", 0);
        setField(term241327, term241327.getClass(), "first", term241419);
        setIntField(term241327, term241327.getClass(), "type", 100);
        setField(term241327, term241327.getClass(), "parent", null);
        term241576 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term241576, term241576.getClass(), "currentTraversal", null);
        term241577 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241578 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241579 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term241577, term241577.getClass(), "number", 0.0);
        setIntField(term241577, term241577.getClass(), "type", 100);
        setField(term241577, term241577.getClass(), "next", null);
        setDoubleField(term241578, term241578.getClass(), "number", 0.0);
        setIntField(term241578, term241578.getClass(), "type", 0);
        setField(term241579, term241579.getClass(), "str", null);
        setIntField(term241579, term241579.getClass(), "type", 0);
        setField(term241579, term241579.getClass(), "next", null);
        setField(term241579, term241579.getClass(), "first", null);
        setField(term241579, term241579.getClass(), "last", null);
        setField(term241579, term241579.getClass(), "propListHead", null);
        setIntField(term241579, term241579.getClass(), "sourcePosition", 0);
        setField(term241579, term241579.getClass(), "jsType", null);
        setField(term241579, term241579.getClass(), "parent", null);
        setField(term241578, term241578.getClass(), "next", term241579);
        setField(term241578, term241578.getClass(), "first", null);
        setField(term241578, term241578.getClass(), "last", null);
        setField(term241578, term241578.getClass(), "propListHead", null);
        setIntField(term241578, term241578.getClass(), "sourcePosition", 0);
        setField(term241578, term241578.getClass(), "jsType", null);
        setField(term241578, term241578.getClass(), "parent", null);
        setField(term241577, term241577.getClass(), "first", term241578);
        setField(term241577, term241577.getClass(), "last", null);
        setField(term241577, term241577.getClass(), "propListHead", null);
        setIntField(term241577, term241577.getClass(), "sourcePosition", 0);
        setField(term241577, term241577.getClass(), "jsType", null);
        setField(term241577, term241577.getClass(), "parent", null);
        term241519 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241525 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term241519, term241519.getClass(), "number", 0.0);
        setIntField(term241519, term241519.getClass(), "type", 100);
        setField(term241519, term241519.getClass(), "next", null);
        setDoubleField(term241522, term241522.getClass(), "number", 0.0);
        setIntField(term241522, term241522.getClass(), "type", 0);
        setField(term241525, term241525.getClass(), "str", null);
        setIntField(term241525, term241525.getClass(), "type", 0);
        setField(term241525, term241525.getClass(), "next", null);
        setField(term241525, term241525.getClass(), "first", null);
        setField(term241525, term241525.getClass(), "last", null);
        setField(term241525, term241525.getClass(), "propListHead", null);
        setIntField(term241525, term241525.getClass(), "sourcePosition", 0);
        setField(term241525, term241525.getClass(), "jsType", null);
        setField(term241525, term241525.getClass(), "parent", null);
        setField(term241522, term241522.getClass(), "next", term241525);
        setField(term241522, term241522.getClass(), "first", null);
        setField(term241522, term241522.getClass(), "last", null);
        setField(term241522, term241522.getClass(), "propListHead", null);
        setIntField(term241522, term241522.getClass(), "sourcePosition", 0);
        setField(term241522, term241522.getClass(), "jsType", null);
        setField(term241522, term241522.getClass(), "parent", null);
        setField(term241519, term241519.getClass(), "first", term241522);
        setField(term241519, term241519.getClass(), "last", null);
        setField(term241519, term241519.getClass(), "propListHead", null);
        setIntField(term241519, term241519.getClass(), "sourcePosition", 0);
        setField(term241519, term241519.getClass(), "jsType", null);
        setField(term241519, term241519.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term241327;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term241235, args);
        assertTrue(recursiveEquals(term241235, term241576));
        assertTrue(recursiveEquals(term241327, term241577));
        assertTrue(recursiveEquals(retValue, term241519));
    }

};


