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

public class ScopedAliases_hotSwapScript_883417098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2604;
     Object term2674;
     Object term4110;
     Object term4111;

    public ScopedAliases_hotSwapScript_883417098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2604 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term2604, term2604.getClass(), "compiler", null);
        term2674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2674, term2674.getClass(), "type", 0);
        setField(term2674, term2674.getClass(), "parent", null);
        setField(term2814, term2814.getClass(), "next", null);
        setIntField(term2814, term2814.getClass(), "type", 0);
        setField(term2814, term2814.getClass(), "first", null);
        setField(term2744, term2744.getClass(), "next", term2814);
        setIntField(term2744, term2744.getClass(), "type", 0);
        setField(term2884, term2884.getClass(), "next", null);
        setIntField(term2884, term2884.getClass(), "type", 0);
        setField(term2884, term2884.getClass(), "first", null);
        setField(term2744, term2744.getClass(), "first", term2884);
        setField(term2674, term2674.getClass(), "first", term2744);
        term4110 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term4110, term4110.getClass(), "compiler", null);
        setField(term4110, term4110.getClass(), "preprocessorSymbolTable", null);
        setField(term4110, term4110.getClass(), "transformationHandler", null);
        term4111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4111, term4111.getClass(), "type", 0);
        setField(term4111, term4111.getClass(), "next", null);
        setIntField(term4112, term4112.getClass(), "type", 0);
        setIntField(term4113, term4113.getClass(), "type", 0);
        setField(term4113, term4113.getClass(), "next", null);
        setField(term4113, term4113.getClass(), "first", null);
        setField(term4113, term4113.getClass(), "last", null);
        setField(term4113, term4113.getClass(), "propListHead", null);
        setIntField(term4113, term4113.getClass(), "sourcePosition", 0);
        setField(term4113, term4113.getClass(), "jsType", null);
        setField(term4113, term4113.getClass(), "parent", null);
        setField(term4112, term4112.getClass(), "next", term4113);
        setIntField(term4114, term4114.getClass(), "type", 0);
        setField(term4114, term4114.getClass(), "next", null);
        setField(term4114, term4114.getClass(), "first", null);
        setField(term4114, term4114.getClass(), "last", null);
        setField(term4114, term4114.getClass(), "propListHead", null);
        setIntField(term4114, term4114.getClass(), "sourcePosition", 0);
        setField(term4114, term4114.getClass(), "jsType", null);
        setField(term4114, term4114.getClass(), "parent", null);
        setField(term4112, term4112.getClass(), "first", term4114);
        setField(term4112, term4112.getClass(), "last", null);
        setField(term4112, term4112.getClass(), "propListHead", null);
        setIntField(term4112, term4112.getClass(), "sourcePosition", 0);
        setField(term4112, term4112.getClass(), "jsType", null);
        setField(term4112, term4112.getClass(), "parent", null);
        setField(term4111, term4111.getClass(), "first", term4112);
        setField(term4111, term4111.getClass(), "last", null);
        setField(term4111, term4111.getClass(), "propListHead", null);
        setIntField(term4111, term4111.getClass(), "sourcePosition", 0);
        setField(term4111, term4111.getClass(), "jsType", null);
        setField(term4111, term4111.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term2674;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term2604, args);
        assertTrue(recursiveEquals(term2604, term4110));
        assertTrue(recursiveEquals(term2674, term4111));
    }

};


