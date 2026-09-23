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

public class ScopedAliases_hotSwapScript_88341709188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106711;
     Object term106803;
     Object term107592;
     Object term107593;

    public ScopedAliases_hotSwapScript_88341709188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106711 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term106711, term106711.getClass(), "compiler", null);
        term106803 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term106895 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term106987 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term107079 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term106803, term106803.getClass(), "type", 0);
        setField(term106803, term106803.getClass(), "parent", null);
        setField(term106895, term106895.getClass(), "next", term106987);
        setIntField(term106895, term106895.getClass(), "type", 0);
        setField(term107079, term107079.getClass(), "next", null);
        setIntField(term107079, term107079.getClass(), "type", 0);
        setField(term107079, term107079.getClass(), "first", null);
        setField(term106895, term106895.getClass(), "first", term107079);
        setField(term106803, term106803.getClass(), "first", term106895);
        term107592 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term107592, term107592.getClass(), "compiler", null);
        setField(term107592, term107592.getClass(), "preprocessorSymbolTable", null);
        setField(term107592, term107592.getClass(), "transformationHandler", null);
        term107593 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term107594 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term107595 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term107596 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term107593, term107593.getClass(), "number", 0.0);
        setIntField(term107593, term107593.getClass(), "type", 0);
        setField(term107593, term107593.getClass(), "next", null);
        setDoubleField(term107594, term107594.getClass(), "number", 0.0);
        setIntField(term107594, term107594.getClass(), "type", 0);
        setDoubleField(term107595, term107595.getClass(), "number", 0.0);
        setIntField(term107595, term107595.getClass(), "type", 0);
        setField(term107595, term107595.getClass(), "next", null);
        setField(term107595, term107595.getClass(), "first", null);
        setField(term107595, term107595.getClass(), "last", null);
        setField(term107595, term107595.getClass(), "propListHead", null);
        setIntField(term107595, term107595.getClass(), "sourcePosition", 0);
        setField(term107595, term107595.getClass(), "jsType", null);
        setField(term107595, term107595.getClass(), "parent", null);
        setField(term107594, term107594.getClass(), "next", term107595);
        setDoubleField(term107596, term107596.getClass(), "number", 0.0);
        setIntField(term107596, term107596.getClass(), "type", 0);
        setField(term107596, term107596.getClass(), "next", null);
        setField(term107596, term107596.getClass(), "first", null);
        setField(term107596, term107596.getClass(), "last", null);
        setField(term107596, term107596.getClass(), "propListHead", null);
        setIntField(term107596, term107596.getClass(), "sourcePosition", 0);
        setField(term107596, term107596.getClass(), "jsType", null);
        setField(term107596, term107596.getClass(), "parent", null);
        setField(term107594, term107594.getClass(), "first", term107596);
        setField(term107594, term107594.getClass(), "last", null);
        setField(term107594, term107594.getClass(), "propListHead", null);
        setIntField(term107594, term107594.getClass(), "sourcePosition", 0);
        setField(term107594, term107594.getClass(), "jsType", null);
        setField(term107594, term107594.getClass(), "parent", null);
        setField(term107593, term107593.getClass(), "first", term107594);
        setField(term107593, term107593.getClass(), "last", null);
        setField(term107593, term107593.getClass(), "propListHead", null);
        setIntField(term107593, term107593.getClass(), "sourcePosition", 0);
        setField(term107593, term107593.getClass(), "jsType", null);
        setField(term107593, term107593.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term106803;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term106711, args);
        assertTrue(recursiveEquals(term106711, term107592));
        assertTrue(recursiveEquals(term106803, term107593));
    }

};


