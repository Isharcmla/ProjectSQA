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

public class PeepholeFoldConstants_optimizeSubtree_16065069931400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530166;
     Object term530258;
     Object term530492;
     Object term530493;
     Object term530444;

    public PeepholeFoldConstants_optimizeSubtree_16065069931400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530166 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term530258 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term530350 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term530442 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term530258, term530258.getClass(), "type", 35);
        setField(term530350, term530350.getClass(), "next", term530442);
        setIntField(term530350, term530350.getClass(), "type", 63);
        setField(term530258, term530258.getClass(), "first", term530350);
        term530492 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term530492, term530492.getClass(), "currentTraversal", null);
        term530493 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term530494 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term530495 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term530493, term530493.getClass(), "str", null);
        setIntField(term530493, term530493.getClass(), "type", 35);
        setField(term530493, term530493.getClass(), "next", null);
        setField(term530494, term530494.getClass(), "str", null);
        setIntField(term530494, term530494.getClass(), "type", 63);
        setField(term530495, term530495.getClass(), "str", null);
        setIntField(term530495, term530495.getClass(), "type", 0);
        setField(term530495, term530495.getClass(), "next", null);
        setField(term530495, term530495.getClass(), "first", null);
        setField(term530495, term530495.getClass(), "last", null);
        setField(term530495, term530495.getClass(), "propListHead", null);
        setIntField(term530495, term530495.getClass(), "sourcePosition", 0);
        setField(term530495, term530495.getClass(), "jsType", null);
        setField(term530495, term530495.getClass(), "parent", null);
        setField(term530494, term530494.getClass(), "next", term530495);
        setField(term530494, term530494.getClass(), "first", null);
        setField(term530494, term530494.getClass(), "last", null);
        setField(term530494, term530494.getClass(), "propListHead", null);
        setIntField(term530494, term530494.getClass(), "sourcePosition", 0);
        setField(term530494, term530494.getClass(), "jsType", null);
        setField(term530494, term530494.getClass(), "parent", null);
        setField(term530493, term530493.getClass(), "first", term530494);
        setField(term530493, term530493.getClass(), "last", null);
        setField(term530493, term530493.getClass(), "propListHead", null);
        setIntField(term530493, term530493.getClass(), "sourcePosition", 0);
        setField(term530493, term530493.getClass(), "jsType", null);
        setField(term530493, term530493.getClass(), "parent", null);
        term530444 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term530446 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term530448 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term530444, term530444.getClass(), "str", null);
        setIntField(term530444, term530444.getClass(), "type", 35);
        setField(term530444, term530444.getClass(), "next", null);
        setField(term530446, term530446.getClass(), "str", null);
        setIntField(term530446, term530446.getClass(), "type", 63);
        setField(term530448, term530448.getClass(), "str", null);
        setIntField(term530448, term530448.getClass(), "type", 0);
        setField(term530448, term530448.getClass(), "next", null);
        setField(term530448, term530448.getClass(), "first", null);
        setField(term530448, term530448.getClass(), "last", null);
        setField(term530448, term530448.getClass(), "propListHead", null);
        setIntField(term530448, term530448.getClass(), "sourcePosition", 0);
        setField(term530448, term530448.getClass(), "jsType", null);
        setField(term530448, term530448.getClass(), "parent", null);
        setField(term530446, term530446.getClass(), "next", term530448);
        setField(term530446, term530446.getClass(), "first", null);
        setField(term530446, term530446.getClass(), "last", null);
        setField(term530446, term530446.getClass(), "propListHead", null);
        setIntField(term530446, term530446.getClass(), "sourcePosition", 0);
        setField(term530446, term530446.getClass(), "jsType", null);
        setField(term530446, term530446.getClass(), "parent", null);
        setField(term530444, term530444.getClass(), "first", term530446);
        setField(term530444, term530444.getClass(), "last", null);
        setField(term530444, term530444.getClass(), "propListHead", null);
        setIntField(term530444, term530444.getClass(), "sourcePosition", 0);
        setField(term530444, term530444.getClass(), "jsType", null);
        setField(term530444, term530444.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term530258;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term530166, args);
        assertTrue(recursiveEquals(term530166, term530492));
        assertTrue(recursiveEquals(term530258, term530493));
        assertTrue(recursiveEquals(retValue, term530444));
    }

};


