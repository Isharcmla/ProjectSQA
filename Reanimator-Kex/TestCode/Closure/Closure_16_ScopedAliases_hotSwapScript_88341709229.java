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

public class ScopedAliases_hotSwapScript_88341709229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143298;
     Object term143390;
     Object term144441;
     Object term144442;

    public ScopedAliases_hotSwapScript_88341709229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143298 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term143298, term143298.getClass(), "compiler", null);
        term143390 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143552 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143644 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term143390, term143390.getClass(), "type", 0);
        setField(term143390, term143390.getClass(), "parent", null);
        setField(term143552, term143552.getClass(), "next", null);
        setIntField(term143552, term143552.getClass(), "type", 37);
        setField(term143644, term143644.getClass(), "next", null);
        setIntField(term143644, term143644.getClass(), "type", 0);
        setField(term143644, term143644.getClass(), "first", null);
        setField(term143552, term143552.getClass(), "first", term143644);
        setField(term143460, term143460.getClass(), "next", term143552);
        setIntField(term143460, term143460.getClass(), "type", 0);
        setField(term143714, term143714.getClass(), "next", null);
        setIntField(term143714, term143714.getClass(), "type", 0);
        setField(term143714, term143714.getClass(), "first", null);
        setField(term143460, term143460.getClass(), "first", term143714);
        setField(term143390, term143390.getClass(), "first", term143460);
        term144441 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term144441, term144441.getClass(), "compiler", null);
        setField(term144441, term144441.getClass(), "preprocessorSymbolTable", null);
        setField(term144441, term144441.getClass(), "transformationHandler", null);
        term144442 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144444 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144445 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term144442, term144442.getClass(), "number", 0.0);
        setIntField(term144442, term144442.getClass(), "type", 0);
        setField(term144442, term144442.getClass(), "next", null);
        setIntField(term144443, term144443.getClass(), "type", 0);
        setDoubleField(term144444, term144444.getClass(), "number", 0.0);
        setIntField(term144444, term144444.getClass(), "type", 37);
        setField(term144444, term144444.getClass(), "next", null);
        setDoubleField(term144445, term144445.getClass(), "number", 0.0);
        setIntField(term144445, term144445.getClass(), "type", 0);
        setField(term144445, term144445.getClass(), "next", null);
        setField(term144445, term144445.getClass(), "first", null);
        setField(term144445, term144445.getClass(), "last", null);
        setField(term144445, term144445.getClass(), "propListHead", null);
        setIntField(term144445, term144445.getClass(), "sourcePosition", 0);
        setField(term144445, term144445.getClass(), "jsType", null);
        setField(term144445, term144445.getClass(), "parent", null);
        setField(term144444, term144444.getClass(), "first", term144445);
        setField(term144444, term144444.getClass(), "last", null);
        setField(term144444, term144444.getClass(), "propListHead", null);
        setIntField(term144444, term144444.getClass(), "sourcePosition", 0);
        setField(term144444, term144444.getClass(), "jsType", null);
        setField(term144444, term144444.getClass(), "parent", null);
        setField(term144443, term144443.getClass(), "next", term144444);
        setIntField(term144446, term144446.getClass(), "type", 0);
        setField(term144446, term144446.getClass(), "next", null);
        setField(term144446, term144446.getClass(), "first", null);
        setField(term144446, term144446.getClass(), "last", null);
        setField(term144446, term144446.getClass(), "propListHead", null);
        setIntField(term144446, term144446.getClass(), "sourcePosition", 0);
        setField(term144446, term144446.getClass(), "jsType", null);
        setField(term144446, term144446.getClass(), "parent", null);
        setField(term144443, term144443.getClass(), "first", term144446);
        setField(term144443, term144443.getClass(), "last", null);
        setField(term144443, term144443.getClass(), "propListHead", null);
        setIntField(term144443, term144443.getClass(), "sourcePosition", 0);
        setField(term144443, term144443.getClass(), "jsType", null);
        setField(term144443, term144443.getClass(), "parent", null);
        setField(term144442, term144442.getClass(), "first", term144443);
        setField(term144442, term144442.getClass(), "last", null);
        setField(term144442, term144442.getClass(), "propListHead", null);
        setIntField(term144442, term144442.getClass(), "sourcePosition", 0);
        setField(term144442, term144442.getClass(), "jsType", null);
        setField(term144442, term144442.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term143390;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term143298, args);
        assertTrue(recursiveEquals(term143298, term144441));
        assertTrue(recursiveEquals(term143390, term144442));
    }

};


