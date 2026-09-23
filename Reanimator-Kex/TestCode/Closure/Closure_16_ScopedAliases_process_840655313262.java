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

public class ScopedAliases_process_840655313262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165169;
     Object term165261;
     Object term167341;
     Object term167342;

    public ScopedAliases_process_840655313262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165169 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term165169, term165169.getClass(), "compiler", null);
        term165261 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165353 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165445 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165537 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term165261, term165261.getClass(), "type", 0);
        setField(term165261, term165261.getClass(), "parent", null);
        setField(term165445, term165445.getClass(), "next", null);
        setIntField(term165445, term165445.getClass(), "type", 0);
        setField(term165445, term165445.getClass(), "first", null);
        setField(term165353, term165353.getClass(), "next", term165445);
        setIntField(term165353, term165353.getClass(), "type", 0);
        setField(term165607, term165607.getClass(), "next", null);
        setIntField(term165607, term165607.getClass(), "type", 0);
        setField(term165607, term165607.getClass(), "first", null);
        setField(term165537, term165537.getClass(), "next", term165607);
        setIntField(term165537, term165537.getClass(), "type", 105);
        setField(term165353, term165353.getClass(), "first", term165537);
        setField(term165261, term165261.getClass(), "first", term165353);
        term167341 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term167341, term167341.getClass(), "compiler", null);
        setField(term167341, term167341.getClass(), "preprocessorSymbolTable", null);
        setField(term167341, term167341.getClass(), "transformationHandler", null);
        term167342 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term167343 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term167344 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term167345 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term167346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term167342, term167342.getClass(), "number", 0.0);
        setIntField(term167342, term167342.getClass(), "type", 0);
        setField(term167342, term167342.getClass(), "next", null);
        setDoubleField(term167343, term167343.getClass(), "number", 0.0);
        setIntField(term167343, term167343.getClass(), "type", 0);
        setDoubleField(term167344, term167344.getClass(), "number", 0.0);
        setIntField(term167344, term167344.getClass(), "type", 0);
        setField(term167344, term167344.getClass(), "next", null);
        setField(term167344, term167344.getClass(), "first", null);
        setField(term167344, term167344.getClass(), "last", null);
        setField(term167344, term167344.getClass(), "propListHead", null);
        setIntField(term167344, term167344.getClass(), "sourcePosition", 0);
        setField(term167344, term167344.getClass(), "jsType", null);
        setField(term167344, term167344.getClass(), "parent", null);
        setField(term167343, term167343.getClass(), "next", term167344);
        setDoubleField(term167345, term167345.getClass(), "number", 0.0);
        setIntField(term167345, term167345.getClass(), "type", 105);
        setIntField(term167346, term167346.getClass(), "type", 0);
        setField(term167346, term167346.getClass(), "next", null);
        setField(term167346, term167346.getClass(), "first", null);
        setField(term167346, term167346.getClass(), "last", null);
        setField(term167346, term167346.getClass(), "propListHead", null);
        setIntField(term167346, term167346.getClass(), "sourcePosition", 0);
        setField(term167346, term167346.getClass(), "jsType", null);
        setField(term167346, term167346.getClass(), "parent", null);
        setField(term167345, term167345.getClass(), "next", term167346);
        setField(term167345, term167345.getClass(), "first", null);
        setField(term167345, term167345.getClass(), "last", null);
        setField(term167345, term167345.getClass(), "propListHead", null);
        setIntField(term167345, term167345.getClass(), "sourcePosition", 0);
        setField(term167345, term167345.getClass(), "jsType", null);
        setField(term167345, term167345.getClass(), "parent", null);
        setField(term167343, term167343.getClass(), "first", term167345);
        setField(term167343, term167343.getClass(), "last", null);
        setField(term167343, term167343.getClass(), "propListHead", null);
        setIntField(term167343, term167343.getClass(), "sourcePosition", 0);
        setField(term167343, term167343.getClass(), "jsType", null);
        setField(term167343, term167343.getClass(), "parent", null);
        setField(term167342, term167342.getClass(), "first", term167343);
        setField(term167342, term167342.getClass(), "last", null);
        setField(term167342, term167342.getClass(), "propListHead", null);
        setIntField(term167342, term167342.getClass(), "sourcePosition", 0);
        setField(term167342, term167342.getClass(), "jsType", null);
        setField(term167342, term167342.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term165261;
        callMethod(klass, "process", argTypes, term165169, args);
        assertTrue(recursiveEquals(term165169, term167341));
        assertTrue(recursiveEquals(term165261, null));
    }

};


