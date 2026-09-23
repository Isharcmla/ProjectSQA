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

public class ScopedAliases_process_84065531361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28874;
     Object term28944;
     Object term29282;
     Object term29283;

    public ScopedAliases_process_84065531361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28874 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term28874, term28874.getClass(), "compiler", null);
        term28944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28944, term28944.getClass(), "type", -133);
        setField(term28944, term28944.getClass(), "parent", term29014);
        term29282 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term29282, term29282.getClass(), "compiler", null);
        setField(term29282, term29282.getClass(), "preprocessorSymbolTable", null);
        setField(term29282, term29282.getClass(), "transformationHandler", null);
        term29283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29283, term29283.getClass(), "type", -133);
        setField(term29283, term29283.getClass(), "next", null);
        setField(term29283, term29283.getClass(), "first", null);
        setField(term29283, term29283.getClass(), "last", null);
        setField(term29283, term29283.getClass(), "propListHead", null);
        setIntField(term29283, term29283.getClass(), "sourcePosition", 0);
        setField(term29283, term29283.getClass(), "jsType", null);
        setIntField(term29284, term29284.getClass(), "type", 0);
        setField(term29284, term29284.getClass(), "next", null);
        setField(term29284, term29284.getClass(), "first", null);
        setField(term29284, term29284.getClass(), "last", null);
        setField(term29284, term29284.getClass(), "propListHead", null);
        setIntField(term29284, term29284.getClass(), "sourcePosition", 0);
        setField(term29284, term29284.getClass(), "jsType", null);
        setField(term29284, term29284.getClass(), "parent", null);
        setField(term29283, term29283.getClass(), "parent", term29284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term28944;
        callMethod(klass, "process", argTypes, term28874, args);
        assertTrue(recursiveEquals(term28874, term29282));
        assertTrue(recursiveEquals(term28944, null));
    }

};


