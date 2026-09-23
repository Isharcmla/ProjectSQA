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

public class ScopedAliases_hotSwapScript_88341709333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223724;
     Object term223794;
     Object term224564;
     Object term224565;

    public ScopedAliases_hotSwapScript_88341709333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223724 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term223724, term223724.getClass(), "compiler", null);
        term223794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term223864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term223934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term224004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term223794, term223794.getClass(), "type", 0);
        setField(term223794, term223794.getClass(), "parent", null);
        setField(term223934, term223934.getClass(), "next", null);
        setIntField(term223934, term223934.getClass(), "type", 105);
        setField(term223864, term223864.getClass(), "next", term223934);
        setIntField(term223864, term223864.getClass(), "type", 0);
        setField(term224004, term224004.getClass(), "next", null);
        setIntField(term224004, term224004.getClass(), "type", 0);
        setField(term224004, term224004.getClass(), "first", null);
        setField(term223864, term223864.getClass(), "first", term224004);
        setField(term223794, term223794.getClass(), "first", term223864);
        term224564 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term224564, term224564.getClass(), "compiler", null);
        setField(term224564, term224564.getClass(), "preprocessorSymbolTable", null);
        setField(term224564, term224564.getClass(), "transformationHandler", null);
        term224565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term224566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term224567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term224568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term224565, term224565.getClass(), "type", 0);
        setField(term224565, term224565.getClass(), "next", null);
        setIntField(term224566, term224566.getClass(), "type", 0);
        setIntField(term224567, term224567.getClass(), "type", 105);
        setField(term224567, term224567.getClass(), "next", null);
        setField(term224567, term224567.getClass(), "first", null);
        setField(term224567, term224567.getClass(), "last", null);
        setField(term224567, term224567.getClass(), "propListHead", null);
        setIntField(term224567, term224567.getClass(), "sourcePosition", 0);
        setField(term224567, term224567.getClass(), "jsType", null);
        setField(term224567, term224567.getClass(), "parent", null);
        setField(term224566, term224566.getClass(), "next", term224567);
        setIntField(term224568, term224568.getClass(), "type", 0);
        setField(term224568, term224568.getClass(), "next", null);
        setField(term224568, term224568.getClass(), "first", null);
        setField(term224568, term224568.getClass(), "last", null);
        setField(term224568, term224568.getClass(), "propListHead", null);
        setIntField(term224568, term224568.getClass(), "sourcePosition", 0);
        setField(term224568, term224568.getClass(), "jsType", null);
        setField(term224568, term224568.getClass(), "parent", null);
        setField(term224566, term224566.getClass(), "first", term224568);
        setField(term224566, term224566.getClass(), "last", null);
        setField(term224566, term224566.getClass(), "propListHead", null);
        setIntField(term224566, term224566.getClass(), "sourcePosition", 0);
        setField(term224566, term224566.getClass(), "jsType", null);
        setField(term224566, term224566.getClass(), "parent", null);
        setField(term224565, term224565.getClass(), "first", term224566);
        setField(term224565, term224565.getClass(), "last", null);
        setField(term224565, term224565.getClass(), "propListHead", null);
        setIntField(term224565, term224565.getClass(), "sourcePosition", 0);
        setField(term224565, term224565.getClass(), "jsType", null);
        setField(term224565, term224565.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term223794;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term223724, args);
        assertTrue(recursiveEquals(term223724, term224564));
        assertTrue(recursiveEquals(term223794, term224565));
    }

};


