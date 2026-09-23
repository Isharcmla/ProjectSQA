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

public class ScopedAliases_process_840655313319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212343;
     Object term212435;
     Object term213476;
     Object term213477;

    public ScopedAliases_process_840655313319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212343 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term212343, term212343.getClass(), "compiler", null);
        term212435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term212527 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term212619 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term212711 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term212781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term212435, term212435.getClass(), "type", 0);
        setField(term212435, term212435.getClass(), "parent", null);
        setField(term212619, term212619.getClass(), "next", null);
        setIntField(term212619, term212619.getClass(), "type", 0);
        setField(term212619, term212619.getClass(), "first", null);
        setField(term212527, term212527.getClass(), "next", term212619);
        setIntField(term212527, term212527.getClass(), "type", 0);
        setField(term212781, term212781.getClass(), "next", null);
        setIntField(term212781, term212781.getClass(), "type", 0);
        setField(term212781, term212781.getClass(), "first", null);
        setField(term212711, term212711.getClass(), "next", term212781);
        setIntField(term212711, term212711.getClass(), "type", 105);
        setField(term212527, term212527.getClass(), "first", term212711);
        setField(term212435, term212435.getClass(), "first", term212527);
        term213476 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term213476, term213476.getClass(), "compiler", null);
        setField(term213476, term213476.getClass(), "preprocessorSymbolTable", null);
        setField(term213476, term213476.getClass(), "transformationHandler", null);
        term213477 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term213478 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term213479 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term213480 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term213481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term213477, term213477.getClass(), "number", 0.0);
        setIntField(term213477, term213477.getClass(), "type", 0);
        setField(term213477, term213477.getClass(), "next", null);
        setDoubleField(term213478, term213478.getClass(), "number", 0.0);
        setIntField(term213478, term213478.getClass(), "type", 0);
        setDoubleField(term213479, term213479.getClass(), "number", 0.0);
        setIntField(term213479, term213479.getClass(), "type", 0);
        setField(term213479, term213479.getClass(), "next", null);
        setField(term213479, term213479.getClass(), "first", null);
        setField(term213479, term213479.getClass(), "last", null);
        setField(term213479, term213479.getClass(), "propListHead", null);
        setIntField(term213479, term213479.getClass(), "sourcePosition", 0);
        setField(term213479, term213479.getClass(), "jsType", null);
        setField(term213479, term213479.getClass(), "parent", null);
        setField(term213478, term213478.getClass(), "next", term213479);
        setDoubleField(term213480, term213480.getClass(), "number", 0.0);
        setIntField(term213480, term213480.getClass(), "type", 105);
        setIntField(term213481, term213481.getClass(), "type", 0);
        setField(term213481, term213481.getClass(), "next", null);
        setField(term213481, term213481.getClass(), "first", null);
        setField(term213481, term213481.getClass(), "last", null);
        setField(term213481, term213481.getClass(), "propListHead", null);
        setIntField(term213481, term213481.getClass(), "sourcePosition", 0);
        setField(term213481, term213481.getClass(), "jsType", null);
        setField(term213481, term213481.getClass(), "parent", null);
        setField(term213480, term213480.getClass(), "next", term213481);
        setField(term213480, term213480.getClass(), "first", null);
        setField(term213480, term213480.getClass(), "last", null);
        setField(term213480, term213480.getClass(), "propListHead", null);
        setIntField(term213480, term213480.getClass(), "sourcePosition", 0);
        setField(term213480, term213480.getClass(), "jsType", null);
        setField(term213480, term213480.getClass(), "parent", null);
        setField(term213478, term213478.getClass(), "first", term213480);
        setField(term213478, term213478.getClass(), "last", null);
        setField(term213478, term213478.getClass(), "propListHead", null);
        setIntField(term213478, term213478.getClass(), "sourcePosition", 0);
        setField(term213478, term213478.getClass(), "jsType", null);
        setField(term213478, term213478.getClass(), "parent", null);
        setField(term213477, term213477.getClass(), "first", term213478);
        setField(term213477, term213477.getClass(), "last", null);
        setField(term213477, term213477.getClass(), "propListHead", null);
        setIntField(term213477, term213477.getClass(), "sourcePosition", 0);
        setField(term213477, term213477.getClass(), "jsType", null);
        setField(term213477, term213477.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term212435;
        callMethod(klass, "process", argTypes, term212343, args);
        assertTrue(recursiveEquals(term212343, term213476));
        assertTrue(recursiveEquals(term212435, null));
    }

};


