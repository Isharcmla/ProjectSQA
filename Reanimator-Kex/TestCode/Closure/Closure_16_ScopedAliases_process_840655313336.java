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

public class ScopedAliases_process_840655313336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225172;
     Object term225264;
     Object term227316;
     Object term227317;

    public ScopedAliases_process_840655313336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225172 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term225172, term225172.getClass(), "compiler", null);
        term225264 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term225356 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term225448 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term225540 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term225610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term225264, term225264.getClass(), "type", 0);
        setField(term225264, term225264.getClass(), "parent", null);
        setField(term225448, term225448.getClass(), "next", null);
        setIntField(term225448, term225448.getClass(), "type", 0);
        setField(term225448, term225448.getClass(), "first", null);
        setField(term225356, term225356.getClass(), "next", term225448);
        setIntField(term225356, term225356.getClass(), "type", 0);
        setField(term225610, term225610.getClass(), "next", null);
        setIntField(term225610, term225610.getClass(), "type", 0);
        setField(term225610, term225610.getClass(), "first", null);
        setField(term225540, term225540.getClass(), "next", term225610);
        setIntField(term225540, term225540.getClass(), "type", 105);
        setField(term225356, term225356.getClass(), "first", term225540);
        setField(term225264, term225264.getClass(), "first", term225356);
        term227316 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term227316, term227316.getClass(), "compiler", null);
        setField(term227316, term227316.getClass(), "preprocessorSymbolTable", null);
        setField(term227316, term227316.getClass(), "transformationHandler", null);
        term227317 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term227318 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term227319 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term227320 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term227321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term227317, term227317.getClass(), "number", 0.0);
        setIntField(term227317, term227317.getClass(), "type", 0);
        setField(term227317, term227317.getClass(), "next", null);
        setDoubleField(term227318, term227318.getClass(), "number", 0.0);
        setIntField(term227318, term227318.getClass(), "type", 0);
        setDoubleField(term227319, term227319.getClass(), "number", 0.0);
        setIntField(term227319, term227319.getClass(), "type", 0);
        setField(term227319, term227319.getClass(), "next", null);
        setField(term227319, term227319.getClass(), "first", null);
        setField(term227319, term227319.getClass(), "last", null);
        setField(term227319, term227319.getClass(), "propListHead", null);
        setIntField(term227319, term227319.getClass(), "sourcePosition", 0);
        setField(term227319, term227319.getClass(), "jsType", null);
        setField(term227319, term227319.getClass(), "parent", null);
        setField(term227318, term227318.getClass(), "next", term227319);
        setDoubleField(term227320, term227320.getClass(), "number", 0.0);
        setIntField(term227320, term227320.getClass(), "type", 105);
        setIntField(term227321, term227321.getClass(), "type", 0);
        setField(term227321, term227321.getClass(), "next", null);
        setField(term227321, term227321.getClass(), "first", null);
        setField(term227321, term227321.getClass(), "last", null);
        setField(term227321, term227321.getClass(), "propListHead", null);
        setIntField(term227321, term227321.getClass(), "sourcePosition", 0);
        setField(term227321, term227321.getClass(), "jsType", null);
        setField(term227321, term227321.getClass(), "parent", null);
        setField(term227320, term227320.getClass(), "next", term227321);
        setField(term227320, term227320.getClass(), "first", null);
        setField(term227320, term227320.getClass(), "last", null);
        setField(term227320, term227320.getClass(), "propListHead", null);
        setIntField(term227320, term227320.getClass(), "sourcePosition", 0);
        setField(term227320, term227320.getClass(), "jsType", null);
        setField(term227320, term227320.getClass(), "parent", null);
        setField(term227318, term227318.getClass(), "first", term227320);
        setField(term227318, term227318.getClass(), "last", null);
        setField(term227318, term227318.getClass(), "propListHead", null);
        setIntField(term227318, term227318.getClass(), "sourcePosition", 0);
        setField(term227318, term227318.getClass(), "jsType", null);
        setField(term227318, term227318.getClass(), "parent", null);
        setField(term227317, term227317.getClass(), "first", term227318);
        setField(term227317, term227317.getClass(), "last", null);
        setField(term227317, term227317.getClass(), "propListHead", null);
        setIntField(term227317, term227317.getClass(), "sourcePosition", 0);
        setField(term227317, term227317.getClass(), "jsType", null);
        setField(term227317, term227317.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term225264;
        callMethod(klass, "process", argTypes, term225172, args);
        assertTrue(recursiveEquals(term225172, term227316));
        assertTrue(recursiveEquals(term225264, null));
    }

};


