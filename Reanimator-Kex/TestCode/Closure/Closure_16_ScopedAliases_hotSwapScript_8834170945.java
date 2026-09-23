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

public class ScopedAliases_hotSwapScript_8834170945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26456;
     Object term26526;
     Object term27496;
     Object term27497;

    public ScopedAliases_hotSwapScript_8834170945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26456 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term26456, term26456.getClass(), "compiler", null);
        term26526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26526, term26526.getClass(), "type", 0);
        setField(term26526, term26526.getClass(), "parent", null);
        setField(term26666, term26666.getClass(), "next", null);
        setIntField(term26666, term26666.getClass(), "type", 0);
        setField(term26736, term26736.getClass(), "next", null);
        setIntField(term26736, term26736.getClass(), "type", 0);
        setField(term26736, term26736.getClass(), "first", null);
        setField(term26666, term26666.getClass(), "first", term26736);
        setField(term26596, term26596.getClass(), "next", term26666);
        setIntField(term26596, term26596.getClass(), "type", 0);
        setField(term26806, term26806.getClass(), "next", null);
        setIntField(term26806, term26806.getClass(), "type", 0);
        setField(term26806, term26806.getClass(), "first", null);
        setField(term26596, term26596.getClass(), "first", term26806);
        setField(term26526, term26526.getClass(), "first", term26596);
        term27496 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term27496, term27496.getClass(), "compiler", null);
        setField(term27496, term27496.getClass(), "preprocessorSymbolTable", null);
        setField(term27496, term27496.getClass(), "transformationHandler", null);
        term27497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27497, term27497.getClass(), "type", 0);
        setField(term27497, term27497.getClass(), "next", null);
        setIntField(term27498, term27498.getClass(), "type", 0);
        setIntField(term27499, term27499.getClass(), "type", 0);
        setField(term27499, term27499.getClass(), "next", null);
        setIntField(term27500, term27500.getClass(), "type", 0);
        setField(term27500, term27500.getClass(), "next", null);
        setField(term27500, term27500.getClass(), "first", null);
        setField(term27500, term27500.getClass(), "last", null);
        setField(term27500, term27500.getClass(), "propListHead", null);
        setIntField(term27500, term27500.getClass(), "sourcePosition", 0);
        setField(term27500, term27500.getClass(), "jsType", null);
        setField(term27500, term27500.getClass(), "parent", null);
        setField(term27499, term27499.getClass(), "first", term27500);
        setField(term27499, term27499.getClass(), "last", null);
        setField(term27499, term27499.getClass(), "propListHead", null);
        setIntField(term27499, term27499.getClass(), "sourcePosition", 0);
        setField(term27499, term27499.getClass(), "jsType", null);
        setField(term27499, term27499.getClass(), "parent", null);
        setField(term27498, term27498.getClass(), "next", term27499);
        setIntField(term27501, term27501.getClass(), "type", 0);
        setField(term27501, term27501.getClass(), "next", null);
        setField(term27501, term27501.getClass(), "first", null);
        setField(term27501, term27501.getClass(), "last", null);
        setField(term27501, term27501.getClass(), "propListHead", null);
        setIntField(term27501, term27501.getClass(), "sourcePosition", 0);
        setField(term27501, term27501.getClass(), "jsType", null);
        setField(term27501, term27501.getClass(), "parent", null);
        setField(term27498, term27498.getClass(), "first", term27501);
        setField(term27498, term27498.getClass(), "last", null);
        setField(term27498, term27498.getClass(), "propListHead", null);
        setIntField(term27498, term27498.getClass(), "sourcePosition", 0);
        setField(term27498, term27498.getClass(), "jsType", null);
        setField(term27498, term27498.getClass(), "parent", null);
        setField(term27497, term27497.getClass(), "first", term27498);
        setField(term27497, term27497.getClass(), "last", null);
        setField(term27497, term27497.getClass(), "propListHead", null);
        setIntField(term27497, term27497.getClass(), "sourcePosition", 0);
        setField(term27497, term27497.getClass(), "jsType", null);
        setField(term27497, term27497.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term26526;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term26456, args);
        assertTrue(recursiveEquals(term26456, term27496));
        assertTrue(recursiveEquals(term26526, term27497));
    }

};


