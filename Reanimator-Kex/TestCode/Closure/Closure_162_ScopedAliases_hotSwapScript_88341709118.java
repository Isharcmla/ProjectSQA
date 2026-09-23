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

public class ScopedAliases_hotSwapScript_88341709118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62530;
     Object term62600;
     Object term63810;
     Object term63811;

    public ScopedAliases_hotSwapScript_88341709118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62530 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term62530, term62530.getClass(), "compiler", null);
        term62600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62600, term62600.getClass(), "type", 0);
        setField(term62600, term62600.getClass(), "parent", null);
        setField(term62740, term62740.getClass(), "next", null);
        setIntField(term62740, term62740.getClass(), "type", 0);
        setField(term62740, term62740.getClass(), "first", null);
        setField(term62670, term62670.getClass(), "next", term62740);
        setIntField(term62670, term62670.getClass(), "type", 0);
        setField(term62670, term62670.getClass(), "first", null);
        setField(term62600, term62600.getClass(), "first", term62670);
        term63810 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term63810, term63810.getClass(), "compiler", null);
        setField(term63810, term63810.getClass(), "preprocessorSymbolTable", null);
        setField(term63810, term63810.getClass(), "transformationHandler", null);
        term63811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63811, term63811.getClass(), "type", 0);
        setField(term63811, term63811.getClass(), "next", null);
        setIntField(term63812, term63812.getClass(), "type", 0);
        setIntField(term63813, term63813.getClass(), "type", 0);
        setField(term63813, term63813.getClass(), "next", null);
        setField(term63813, term63813.getClass(), "first", null);
        setField(term63813, term63813.getClass(), "last", null);
        setField(term63813, term63813.getClass(), "propListHead", null);
        setIntField(term63813, term63813.getClass(), "sourcePosition", 0);
        setField(term63813, term63813.getClass(), "jsType", null);
        setField(term63813, term63813.getClass(), "parent", null);
        setField(term63812, term63812.getClass(), "next", term63813);
        setField(term63812, term63812.getClass(), "first", null);
        setField(term63812, term63812.getClass(), "last", null);
        setField(term63812, term63812.getClass(), "propListHead", null);
        setIntField(term63812, term63812.getClass(), "sourcePosition", 0);
        setField(term63812, term63812.getClass(), "jsType", null);
        setField(term63812, term63812.getClass(), "parent", null);
        setField(term63811, term63811.getClass(), "first", term63812);
        setField(term63811, term63811.getClass(), "last", null);
        setField(term63811, term63811.getClass(), "propListHead", null);
        setIntField(term63811, term63811.getClass(), "sourcePosition", 0);
        setField(term63811, term63811.getClass(), "jsType", null);
        setField(term63811, term63811.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term62600;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term62530, args);
        assertTrue(recursiveEquals(term62530, term63810));
        assertTrue(recursiveEquals(term62600, term63811));
    }

};


