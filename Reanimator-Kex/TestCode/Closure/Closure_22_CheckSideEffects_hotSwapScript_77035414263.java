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

public class CheckSideEffects_hotSwapScript_77035414263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28203;
     Object term28273;
     Object term29281;
     Object term29282;

    public CheckSideEffects_hotSwapScript_77035414263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28203 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term28203, term28203.getClass(), "compiler", null);
        term28273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28273, term28273.getClass(), "type", 115);
        setField(term28273, term28273.getClass(), "parent", null);
        setField(term28343, term28343.getClass(), "next", null);
        setIntField(term28343, term28343.getClass(), "type", 115);
        setField(term28413, term28413.getClass(), "next", null);
        setIntField(term28413, term28413.getClass(), "type", 0);
        setField(term28413, term28413.getClass(), "first", null);
        setField(term28343, term28343.getClass(), "first", term28413);
        setField(term28273, term28273.getClass(), "first", term28343);
        term29281 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term29281, term29281.getClass(), "level", null);
        setField(term29281, term29281.getClass(), "problemNodes", null);
        setField(term29281, term29281.getClass(), "compiler", null);
        setBooleanField(term29281, term29281.getClass(), "protectSideEffectFreeCode", false);
        term29282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29282, term29282.getClass(), "type", 115);
        setField(term29282, term29282.getClass(), "next", null);
        setIntField(term29283, term29283.getClass(), "type", 115);
        setField(term29283, term29283.getClass(), "next", null);
        setIntField(term29284, term29284.getClass(), "type", 0);
        setField(term29284, term29284.getClass(), "next", null);
        setField(term29284, term29284.getClass(), "first", null);
        setField(term29284, term29284.getClass(), "last", null);
        setField(term29284, term29284.getClass(), "propListHead", null);
        setIntField(term29284, term29284.getClass(), "sourcePosition", 0);
        setField(term29284, term29284.getClass(), "jsType", null);
        setField(term29284, term29284.getClass(), "parent", null);
        setField(term29283, term29283.getClass(), "first", term29284);
        setField(term29283, term29283.getClass(), "last", null);
        setField(term29283, term29283.getClass(), "propListHead", null);
        setIntField(term29283, term29283.getClass(), "sourcePosition", 0);
        setField(term29283, term29283.getClass(), "jsType", null);
        setField(term29283, term29283.getClass(), "parent", null);
        setField(term29282, term29282.getClass(), "first", term29283);
        setField(term29282, term29282.getClass(), "last", null);
        setField(term29282, term29282.getClass(), "propListHead", null);
        setIntField(term29282, term29282.getClass(), "sourcePosition", 0);
        setField(term29282, term29282.getClass(), "jsType", null);
        setField(term29282, term29282.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term28273;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term28203, args);
        assertTrue(recursiveEquals(term28203, term29281));
        assertTrue(recursiveEquals(term28273, term29282));
    }

};


