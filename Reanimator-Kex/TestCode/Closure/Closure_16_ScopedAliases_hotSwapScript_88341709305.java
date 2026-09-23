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

public class ScopedAliases_hotSwapScript_88341709305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199662;
     Object term199754;
     Object term200805;
     Object term200806;

    public ScopedAliases_hotSwapScript_88341709305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199662 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term199662, term199662.getClass(), "compiler", null);
        term199754 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term199824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term199916 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term200008 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term200078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term199754, term199754.getClass(), "type", 0);
        setField(term199754, term199754.getClass(), "parent", null);
        setField(term199916, term199916.getClass(), "next", null);
        setIntField(term199916, term199916.getClass(), "type", 37);
        setField(term200008, term200008.getClass(), "next", null);
        setIntField(term200008, term200008.getClass(), "type", 0);
        setField(term200008, term200008.getClass(), "first", null);
        setField(term199916, term199916.getClass(), "first", term200008);
        setField(term199824, term199824.getClass(), "next", term199916);
        setIntField(term199824, term199824.getClass(), "type", 0);
        setField(term200078, term200078.getClass(), "next", null);
        setIntField(term200078, term200078.getClass(), "type", 0);
        setField(term200078, term200078.getClass(), "first", null);
        setField(term199824, term199824.getClass(), "first", term200078);
        setField(term199754, term199754.getClass(), "first", term199824);
        term200805 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term200805, term200805.getClass(), "compiler", null);
        setField(term200805, term200805.getClass(), "preprocessorSymbolTable", null);
        setField(term200805, term200805.getClass(), "transformationHandler", null);
        term200806 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term200807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term200808 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term200809 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term200810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term200806, term200806.getClass(), "number", 0.0);
        setIntField(term200806, term200806.getClass(), "type", 0);
        setField(term200806, term200806.getClass(), "next", null);
        setIntField(term200807, term200807.getClass(), "type", 0);
        setDoubleField(term200808, term200808.getClass(), "number", 0.0);
        setIntField(term200808, term200808.getClass(), "type", 37);
        setField(term200808, term200808.getClass(), "next", null);
        setDoubleField(term200809, term200809.getClass(), "number", 0.0);
        setIntField(term200809, term200809.getClass(), "type", 0);
        setField(term200809, term200809.getClass(), "next", null);
        setField(term200809, term200809.getClass(), "first", null);
        setField(term200809, term200809.getClass(), "last", null);
        setField(term200809, term200809.getClass(), "propListHead", null);
        setIntField(term200809, term200809.getClass(), "sourcePosition", 0);
        setField(term200809, term200809.getClass(), "jsType", null);
        setField(term200809, term200809.getClass(), "parent", null);
        setField(term200808, term200808.getClass(), "first", term200809);
        setField(term200808, term200808.getClass(), "last", null);
        setField(term200808, term200808.getClass(), "propListHead", null);
        setIntField(term200808, term200808.getClass(), "sourcePosition", 0);
        setField(term200808, term200808.getClass(), "jsType", null);
        setField(term200808, term200808.getClass(), "parent", null);
        setField(term200807, term200807.getClass(), "next", term200808);
        setIntField(term200810, term200810.getClass(), "type", 0);
        setField(term200810, term200810.getClass(), "next", null);
        setField(term200810, term200810.getClass(), "first", null);
        setField(term200810, term200810.getClass(), "last", null);
        setField(term200810, term200810.getClass(), "propListHead", null);
        setIntField(term200810, term200810.getClass(), "sourcePosition", 0);
        setField(term200810, term200810.getClass(), "jsType", null);
        setField(term200810, term200810.getClass(), "parent", null);
        setField(term200807, term200807.getClass(), "first", term200810);
        setField(term200807, term200807.getClass(), "last", null);
        setField(term200807, term200807.getClass(), "propListHead", null);
        setIntField(term200807, term200807.getClass(), "sourcePosition", 0);
        setField(term200807, term200807.getClass(), "jsType", null);
        setField(term200807, term200807.getClass(), "parent", null);
        setField(term200806, term200806.getClass(), "first", term200807);
        setField(term200806, term200806.getClass(), "last", null);
        setField(term200806, term200806.getClass(), "propListHead", null);
        setIntField(term200806, term200806.getClass(), "sourcePosition", 0);
        setField(term200806, term200806.getClass(), "jsType", null);
        setField(term200806, term200806.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term199754;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term199662, args);
        assertTrue(recursiveEquals(term199662, term200805));
        assertTrue(recursiveEquals(term199754, term200806));
    }

};


