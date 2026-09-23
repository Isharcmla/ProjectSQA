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

public class ScopedAliases_hotSwapScript_88341709144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79399;
     Object term79491;
     Object term80280;
     Object term80281;

    public ScopedAliases_hotSwapScript_88341709144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79399 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term79399, term79399.getClass(), "compiler", null);
        term79491 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term79583 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term79675 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term79767 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term79491, term79491.getClass(), "type", 0);
        setField(term79491, term79491.getClass(), "parent", null);
        setField(term79675, term79675.getClass(), "next", null);
        setIntField(term79675, term79675.getClass(), "type", 0);
        setField(term79675, term79675.getClass(), "first", null);
        setField(term79583, term79583.getClass(), "next", term79675);
        setIntField(term79583, term79583.getClass(), "type", 0);
        setField(term79767, term79767.getClass(), "next", null);
        setIntField(term79767, term79767.getClass(), "type", 0);
        setField(term79767, term79767.getClass(), "first", null);
        setField(term79583, term79583.getClass(), "first", term79767);
        setField(term79491, term79491.getClass(), "first", term79583);
        term80280 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term80280, term80280.getClass(), "compiler", null);
        setField(term80280, term80280.getClass(), "preprocessorSymbolTable", null);
        setField(term80280, term80280.getClass(), "transformationHandler", null);
        term80281 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term80282 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term80283 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term80284 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term80281, term80281.getClass(), "number", 0.0);
        setIntField(term80281, term80281.getClass(), "type", 0);
        setField(term80281, term80281.getClass(), "next", null);
        setDoubleField(term80282, term80282.getClass(), "number", 0.0);
        setIntField(term80282, term80282.getClass(), "type", 0);
        setDoubleField(term80283, term80283.getClass(), "number", 0.0);
        setIntField(term80283, term80283.getClass(), "type", 0);
        setField(term80283, term80283.getClass(), "next", null);
        setField(term80283, term80283.getClass(), "first", null);
        setField(term80283, term80283.getClass(), "last", null);
        setField(term80283, term80283.getClass(), "propListHead", null);
        setIntField(term80283, term80283.getClass(), "sourcePosition", 0);
        setField(term80283, term80283.getClass(), "jsType", null);
        setField(term80283, term80283.getClass(), "parent", null);
        setField(term80282, term80282.getClass(), "next", term80283);
        setDoubleField(term80284, term80284.getClass(), "number", 0.0);
        setIntField(term80284, term80284.getClass(), "type", 0);
        setField(term80284, term80284.getClass(), "next", null);
        setField(term80284, term80284.getClass(), "first", null);
        setField(term80284, term80284.getClass(), "last", null);
        setField(term80284, term80284.getClass(), "propListHead", null);
        setIntField(term80284, term80284.getClass(), "sourcePosition", 0);
        setField(term80284, term80284.getClass(), "jsType", null);
        setField(term80284, term80284.getClass(), "parent", null);
        setField(term80282, term80282.getClass(), "first", term80284);
        setField(term80282, term80282.getClass(), "last", null);
        setField(term80282, term80282.getClass(), "propListHead", null);
        setIntField(term80282, term80282.getClass(), "sourcePosition", 0);
        setField(term80282, term80282.getClass(), "jsType", null);
        setField(term80282, term80282.getClass(), "parent", null);
        setField(term80281, term80281.getClass(), "first", term80282);
        setField(term80281, term80281.getClass(), "last", null);
        setField(term80281, term80281.getClass(), "propListHead", null);
        setIntField(term80281, term80281.getClass(), "sourcePosition", 0);
        setField(term80281, term80281.getClass(), "jsType", null);
        setField(term80281, term80281.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term79491;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term79399, args);
        assertTrue(recursiveEquals(term79399, term80280));
        assertTrue(recursiveEquals(term79491, term80281));
    }

};


