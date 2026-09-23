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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36107;
     Object term36199;
     Object term36481;
     Object term36482;
     Object term36448;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36107 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term36199 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term36291 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term36383 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term36291, term36291.getClass(), "next", term36383);
        setIntField(term36291, term36291.getClass(), "type", 63);
        setField(term36199, term36199.getClass(), "first", term36291);
        setIntField(term36199, term36199.getClass(), "type", 35);
        term36481 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term36481, term36481.getClass(), "currentTraversal", null);
        term36482 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term36483 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term36484 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term36482, term36482.getClass(), "str", null);
        setIntField(term36482, term36482.getClass(), "type", 35);
        setField(term36482, term36482.getClass(), "next", null);
        setField(term36483, term36483.getClass(), "str", null);
        setIntField(term36483, term36483.getClass(), "type", 63);
        setField(term36484, term36484.getClass(), "str", null);
        setIntField(term36484, term36484.getClass(), "type", 0);
        setField(term36484, term36484.getClass(), "next", null);
        setField(term36484, term36484.getClass(), "first", null);
        setField(term36484, term36484.getClass(), "last", null);
        setField(term36484, term36484.getClass(), "propListHead", null);
        setIntField(term36484, term36484.getClass(), "sourcePosition", 0);
        setField(term36484, term36484.getClass(), "jsType", null);
        setField(term36484, term36484.getClass(), "parent", null);
        setField(term36483, term36483.getClass(), "next", term36484);
        setField(term36483, term36483.getClass(), "first", null);
        setField(term36483, term36483.getClass(), "last", null);
        setField(term36483, term36483.getClass(), "propListHead", null);
        setIntField(term36483, term36483.getClass(), "sourcePosition", 0);
        setField(term36483, term36483.getClass(), "jsType", null);
        setField(term36483, term36483.getClass(), "parent", null);
        setField(term36482, term36482.getClass(), "first", term36483);
        setField(term36482, term36482.getClass(), "last", null);
        setField(term36482, term36482.getClass(), "propListHead", null);
        setIntField(term36482, term36482.getClass(), "sourcePosition", 0);
        setField(term36482, term36482.getClass(), "jsType", null);
        setField(term36482, term36482.getClass(), "parent", null);
        term36448 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term36450 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term36452 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term36448, term36448.getClass(), "str", null);
        setIntField(term36448, term36448.getClass(), "type", 35);
        setField(term36448, term36448.getClass(), "next", null);
        setField(term36450, term36450.getClass(), "str", null);
        setIntField(term36450, term36450.getClass(), "type", 63);
        setField(term36452, term36452.getClass(), "str", null);
        setIntField(term36452, term36452.getClass(), "type", 0);
        setField(term36452, term36452.getClass(), "next", null);
        setField(term36452, term36452.getClass(), "first", null);
        setField(term36452, term36452.getClass(), "last", null);
        setField(term36452, term36452.getClass(), "propListHead", null);
        setIntField(term36452, term36452.getClass(), "sourcePosition", 0);
        setField(term36452, term36452.getClass(), "jsType", null);
        setField(term36452, term36452.getClass(), "parent", null);
        setField(term36450, term36450.getClass(), "next", term36452);
        setField(term36450, term36450.getClass(), "first", null);
        setField(term36450, term36450.getClass(), "last", null);
        setField(term36450, term36450.getClass(), "propListHead", null);
        setIntField(term36450, term36450.getClass(), "sourcePosition", 0);
        setField(term36450, term36450.getClass(), "jsType", null);
        setField(term36450, term36450.getClass(), "parent", null);
        setField(term36448, term36448.getClass(), "first", term36450);
        setField(term36448, term36448.getClass(), "last", null);
        setField(term36448, term36448.getClass(), "propListHead", null);
        setIntField(term36448, term36448.getClass(), "sourcePosition", 0);
        setField(term36448, term36448.getClass(), "jsType", null);
        setField(term36448, term36448.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36199;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term36107, args);
        assertTrue(recursiveEquals(term36107, term36481));
        assertTrue(recursiveEquals(term36199, term36482));
        assertTrue(recursiveEquals(retValue, term36448));
    }

};


