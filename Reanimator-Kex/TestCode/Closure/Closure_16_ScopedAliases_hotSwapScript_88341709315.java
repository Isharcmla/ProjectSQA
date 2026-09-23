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

public class ScopedAliases_hotSwapScript_88341709315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208232;
     Object term208302;
     Object term209491;
     Object term209492;

    public ScopedAliases_hotSwapScript_88341709315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208232 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term208232, term208232.getClass(), "compiler", null);
        term208302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term208302, term208302.getClass(), "type", 37);
        setField(term208302, term208302.getClass(), "parent", null);
        setField(term208512, term208512.getClass(), "next", null);
        setIntField(term208512, term208512.getClass(), "type", 0);
        setField(term208512, term208512.getClass(), "first", null);
        setField(term208442, term208442.getClass(), "next", term208512);
        setIntField(term208442, term208442.getClass(), "type", 37);
        setField(term208582, term208582.getClass(), "next", null);
        setIntField(term208582, term208582.getClass(), "type", 0);
        setField(term208582, term208582.getClass(), "first", null);
        setField(term208442, term208442.getClass(), "first", term208582);
        setField(term208372, term208372.getClass(), "next", term208442);
        setIntField(term208372, term208372.getClass(), "type", 0);
        setField(term208652, term208652.getClass(), "next", null);
        setIntField(term208652, term208652.getClass(), "type", 0);
        setField(term208652, term208652.getClass(), "first", null);
        setField(term208372, term208372.getClass(), "first", term208652);
        setField(term208302, term208302.getClass(), "first", term208372);
        term209491 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term209491, term209491.getClass(), "compiler", null);
        setField(term209491, term209491.getClass(), "preprocessorSymbolTable", null);
        setField(term209491, term209491.getClass(), "transformationHandler", null);
        term209492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term209493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term209494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term209495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term209496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term209497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term209492, term209492.getClass(), "type", 37);
        setField(term209492, term209492.getClass(), "next", null);
        setIntField(term209493, term209493.getClass(), "type", 0);
        setIntField(term209494, term209494.getClass(), "type", 37);
        setIntField(term209495, term209495.getClass(), "type", 0);
        setField(term209495, term209495.getClass(), "next", null);
        setField(term209495, term209495.getClass(), "first", null);
        setField(term209495, term209495.getClass(), "last", null);
        setField(term209495, term209495.getClass(), "propListHead", null);
        setIntField(term209495, term209495.getClass(), "sourcePosition", 0);
        setField(term209495, term209495.getClass(), "jsType", null);
        setField(term209495, term209495.getClass(), "parent", null);
        setField(term209494, term209494.getClass(), "next", term209495);
        setIntField(term209496, term209496.getClass(), "type", 0);
        setField(term209496, term209496.getClass(), "next", null);
        setField(term209496, term209496.getClass(), "first", null);
        setField(term209496, term209496.getClass(), "last", null);
        setField(term209496, term209496.getClass(), "propListHead", null);
        setIntField(term209496, term209496.getClass(), "sourcePosition", 0);
        setField(term209496, term209496.getClass(), "jsType", null);
        setField(term209496, term209496.getClass(), "parent", null);
        setField(term209494, term209494.getClass(), "first", term209496);
        setField(term209494, term209494.getClass(), "last", null);
        setField(term209494, term209494.getClass(), "propListHead", null);
        setIntField(term209494, term209494.getClass(), "sourcePosition", 0);
        setField(term209494, term209494.getClass(), "jsType", null);
        setField(term209494, term209494.getClass(), "parent", null);
        setField(term209493, term209493.getClass(), "next", term209494);
        setIntField(term209497, term209497.getClass(), "type", 0);
        setField(term209497, term209497.getClass(), "next", null);
        setField(term209497, term209497.getClass(), "first", null);
        setField(term209497, term209497.getClass(), "last", null);
        setField(term209497, term209497.getClass(), "propListHead", null);
        setIntField(term209497, term209497.getClass(), "sourcePosition", 0);
        setField(term209497, term209497.getClass(), "jsType", null);
        setField(term209497, term209497.getClass(), "parent", null);
        setField(term209493, term209493.getClass(), "first", term209497);
        setField(term209493, term209493.getClass(), "last", null);
        setField(term209493, term209493.getClass(), "propListHead", null);
        setIntField(term209493, term209493.getClass(), "sourcePosition", 0);
        setField(term209493, term209493.getClass(), "jsType", null);
        setField(term209493, term209493.getClass(), "parent", null);
        setField(term209492, term209492.getClass(), "first", term209493);
        setField(term209492, term209492.getClass(), "last", null);
        setField(term209492, term209492.getClass(), "propListHead", null);
        setIntField(term209492, term209492.getClass(), "sourcePosition", 0);
        setField(term209492, term209492.getClass(), "jsType", null);
        setField(term209492, term209492.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term208302;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term208232, args);
        assertTrue(recursiveEquals(term208232, term209491));
        assertTrue(recursiveEquals(term208302, term209492));
    }

};


