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

public class ScopedAliases_hotSwapScript_88341709142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77883;
     Object term77975;
     Object term78892;
     Object term78893;

    public ScopedAliases_hotSwapScript_88341709142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77883 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term77883, term77883.getClass(), "compiler", null);
        term77975 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term78067 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term78137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78299 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term77975, term77975.getClass(), "type", 0);
        setField(term77975, term77975.getClass(), "parent", null);
        setField(term78207, term78207.getClass(), "next", null);
        setIntField(term78207, term78207.getClass(), "type", 0);
        setField(term78207, term78207.getClass(), "first", null);
        setField(term78137, term78137.getClass(), "next", term78207);
        setIntField(term78137, term78137.getClass(), "type", 0);
        setField(term78137, term78137.getClass(), "first", null);
        setField(term78067, term78067.getClass(), "next", term78137);
        setIntField(term78067, term78067.getClass(), "type", 0);
        setField(term78299, term78299.getClass(), "next", null);
        setIntField(term78299, term78299.getClass(), "type", 0);
        setField(term78299, term78299.getClass(), "first", null);
        setField(term78067, term78067.getClass(), "first", term78299);
        setField(term77975, term77975.getClass(), "first", term78067);
        term78892 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term78892, term78892.getClass(), "compiler", null);
        setField(term78892, term78892.getClass(), "preprocessorSymbolTable", null);
        setField(term78892, term78892.getClass(), "transformationHandler", null);
        term78893 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term78894 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term78895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78897 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term78893, term78893.getClass(), "number", 0.0);
        setIntField(term78893, term78893.getClass(), "type", 0);
        setField(term78893, term78893.getClass(), "next", null);
        setDoubleField(term78894, term78894.getClass(), "number", 0.0);
        setIntField(term78894, term78894.getClass(), "type", 0);
        setIntField(term78895, term78895.getClass(), "type", 0);
        setIntField(term78896, term78896.getClass(), "type", 0);
        setField(term78896, term78896.getClass(), "next", null);
        setField(term78896, term78896.getClass(), "first", null);
        setField(term78896, term78896.getClass(), "last", null);
        setField(term78896, term78896.getClass(), "propListHead", null);
        setIntField(term78896, term78896.getClass(), "sourcePosition", 0);
        setField(term78896, term78896.getClass(), "jsType", null);
        setField(term78896, term78896.getClass(), "parent", null);
        setField(term78895, term78895.getClass(), "next", term78896);
        setField(term78895, term78895.getClass(), "first", null);
        setField(term78895, term78895.getClass(), "last", null);
        setField(term78895, term78895.getClass(), "propListHead", null);
        setIntField(term78895, term78895.getClass(), "sourcePosition", 0);
        setField(term78895, term78895.getClass(), "jsType", null);
        setField(term78895, term78895.getClass(), "parent", null);
        setField(term78894, term78894.getClass(), "next", term78895);
        setDoubleField(term78897, term78897.getClass(), "number", 0.0);
        setIntField(term78897, term78897.getClass(), "type", 0);
        setField(term78897, term78897.getClass(), "next", null);
        setField(term78897, term78897.getClass(), "first", null);
        setField(term78897, term78897.getClass(), "last", null);
        setField(term78897, term78897.getClass(), "propListHead", null);
        setIntField(term78897, term78897.getClass(), "sourcePosition", 0);
        setField(term78897, term78897.getClass(), "jsType", null);
        setField(term78897, term78897.getClass(), "parent", null);
        setField(term78894, term78894.getClass(), "first", term78897);
        setField(term78894, term78894.getClass(), "last", null);
        setField(term78894, term78894.getClass(), "propListHead", null);
        setIntField(term78894, term78894.getClass(), "sourcePosition", 0);
        setField(term78894, term78894.getClass(), "jsType", null);
        setField(term78894, term78894.getClass(), "parent", null);
        setField(term78893, term78893.getClass(), "first", term78894);
        setField(term78893, term78893.getClass(), "last", null);
        setField(term78893, term78893.getClass(), "propListHead", null);
        setIntField(term78893, term78893.getClass(), "sourcePosition", 0);
        setField(term78893, term78893.getClass(), "jsType", null);
        setField(term78893, term78893.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term77975;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term77883, args);
        assertTrue(recursiveEquals(term77883, term78892));
        assertTrue(recursiveEquals(term77975, term78893));
    }

};


