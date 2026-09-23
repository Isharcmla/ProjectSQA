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

public class ScopedAliases_hotSwapScript_883417097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1881;
     Object term1951;
     Object term2338;
     Object term2339;

    public ScopedAliases_hotSwapScript_883417097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1881 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term1881, term1881.getClass(), "compiler", null);
        term1951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1951, term1951.getClass(), "type", 0);
        setField(term1951, term1951.getClass(), "parent", null);
        setField(term2021, term2021.getClass(), "next", null);
        setIntField(term2021, term2021.getClass(), "type", 0);
        setField(term2021, term2021.getClass(), "first", null);
        setField(term1951, term1951.getClass(), "first", term2021);
        term2338 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term2338, term2338.getClass(), "compiler", null);
        setField(term2338, term2338.getClass(), "preprocessorSymbolTable", null);
        setField(term2338, term2338.getClass(), "transformationHandler", null);
        term2339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2339, term2339.getClass(), "type", 0);
        setField(term2339, term2339.getClass(), "next", null);
        setIntField(term2340, term2340.getClass(), "type", 0);
        setField(term2340, term2340.getClass(), "next", null);
        setField(term2340, term2340.getClass(), "first", null);
        setField(term2340, term2340.getClass(), "last", null);
        setField(term2340, term2340.getClass(), "propListHead", null);
        setIntField(term2340, term2340.getClass(), "sourcePosition", 0);
        setField(term2340, term2340.getClass(), "jsType", null);
        setField(term2340, term2340.getClass(), "parent", null);
        setField(term2339, term2339.getClass(), "first", term2340);
        setField(term2339, term2339.getClass(), "last", null);
        setField(term2339, term2339.getClass(), "propListHead", null);
        setIntField(term2339, term2339.getClass(), "sourcePosition", 0);
        setField(term2339, term2339.getClass(), "jsType", null);
        setField(term2339, term2339.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1951;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term1881, args);
        assertTrue(recursiveEquals(term1881, term2338));
        assertTrue(recursiveEquals(term1951, term2339));
    }

};


