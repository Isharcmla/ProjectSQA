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

public class PeepholeFoldConstants_optimizeSubtree_16065069931692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term670577;
     Object term670669;
     Object term671022;
     Object term671023;
     Object term670967;

    public PeepholeFoldConstants_optimizeSubtree_16065069931692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term670577 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term670669 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term670761 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term670853 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term670669, term670669.getClass(), "type", 35);
        setField(term670761, term670761.getClass(), "next", term670853);
        setIntField(term670761, term670761.getClass(), "type", 63);
        setField(term670669, term670669.getClass(), "first", term670761);
        term671022 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term671022, term671022.getClass(), "currentTraversal", null);
        term671023 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term671024 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term671025 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term671023, term671023.getClass(), "number", 0.0);
        setIntField(term671023, term671023.getClass(), "type", 35);
        setField(term671023, term671023.getClass(), "next", null);
        setDoubleField(term671024, term671024.getClass(), "number", 0.0);
        setIntField(term671024, term671024.getClass(), "type", 63);
        setField(term671025, term671025.getClass(), "str", null);
        setIntField(term671025, term671025.getClass(), "type", 0);
        setField(term671025, term671025.getClass(), "next", null);
        setField(term671025, term671025.getClass(), "first", null);
        setField(term671025, term671025.getClass(), "last", null);
        setField(term671025, term671025.getClass(), "propListHead", null);
        setIntField(term671025, term671025.getClass(), "sourcePosition", 0);
        setField(term671025, term671025.getClass(), "jsType", null);
        setField(term671025, term671025.getClass(), "parent", null);
        setField(term671024, term671024.getClass(), "next", term671025);
        setField(term671024, term671024.getClass(), "first", null);
        setField(term671024, term671024.getClass(), "last", null);
        setField(term671024, term671024.getClass(), "propListHead", null);
        setIntField(term671024, term671024.getClass(), "sourcePosition", 0);
        setField(term671024, term671024.getClass(), "jsType", null);
        setField(term671024, term671024.getClass(), "parent", null);
        setField(term671023, term671023.getClass(), "first", term671024);
        setField(term671023, term671023.getClass(), "last", null);
        setField(term671023, term671023.getClass(), "propListHead", null);
        setIntField(term671023, term671023.getClass(), "sourcePosition", 0);
        setField(term671023, term671023.getClass(), "jsType", null);
        setField(term671023, term671023.getClass(), "parent", null);
        term670967 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term670970 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term670973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term670967, term670967.getClass(), "number", 0.0);
        setIntField(term670967, term670967.getClass(), "type", 35);
        setField(term670967, term670967.getClass(), "next", null);
        setDoubleField(term670970, term670970.getClass(), "number", 0.0);
        setIntField(term670970, term670970.getClass(), "type", 63);
        setField(term670973, term670973.getClass(), "str", null);
        setIntField(term670973, term670973.getClass(), "type", 0);
        setField(term670973, term670973.getClass(), "next", null);
        setField(term670973, term670973.getClass(), "first", null);
        setField(term670973, term670973.getClass(), "last", null);
        setField(term670973, term670973.getClass(), "propListHead", null);
        setIntField(term670973, term670973.getClass(), "sourcePosition", 0);
        setField(term670973, term670973.getClass(), "jsType", null);
        setField(term670973, term670973.getClass(), "parent", null);
        setField(term670970, term670970.getClass(), "next", term670973);
        setField(term670970, term670970.getClass(), "first", null);
        setField(term670970, term670970.getClass(), "last", null);
        setField(term670970, term670970.getClass(), "propListHead", null);
        setIntField(term670970, term670970.getClass(), "sourcePosition", 0);
        setField(term670970, term670970.getClass(), "jsType", null);
        setField(term670970, term670970.getClass(), "parent", null);
        setField(term670967, term670967.getClass(), "first", term670970);
        setField(term670967, term670967.getClass(), "last", null);
        setField(term670967, term670967.getClass(), "propListHead", null);
        setIntField(term670967, term670967.getClass(), "sourcePosition", 0);
        setField(term670967, term670967.getClass(), "jsType", null);
        setField(term670967, term670967.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term670669;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term670577, args);
        assertTrue(recursiveEquals(term670577, term671022));
        assertTrue(recursiveEquals(term670669, term671023));
        assertTrue(recursiveEquals(retValue, term670967));
    }

};


