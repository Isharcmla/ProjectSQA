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

public class ScopedAliases_process_84065531363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35874;
     Object term35944;
     Object term36914;
     Object term36915;

    public ScopedAliases_process_84065531363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35874 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term35874, term35874.getClass(), "compiler", null);
        term35944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35944, term35944.getClass(), "type", 0);
        setField(term35944, term35944.getClass(), "parent", null);
        setField(term36084, term36084.getClass(), "next", term36154);
        setIntField(term36084, term36084.getClass(), "type", 0);
        setField(term36084, term36084.getClass(), "first", null);
        setField(term36014, term36014.getClass(), "next", term36084);
        setIntField(term36014, term36014.getClass(), "type", 0);
        setField(term36224, term36224.getClass(), "next", null);
        setIntField(term36224, term36224.getClass(), "type", 0);
        setField(term36224, term36224.getClass(), "first", null);
        setField(term36014, term36014.getClass(), "first", term36224);
        setField(term35944, term35944.getClass(), "first", term36014);
        term36914 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term36914, term36914.getClass(), "compiler", null);
        setField(term36914, term36914.getClass(), "preprocessorSymbolTable", null);
        setField(term36914, term36914.getClass(), "transformationHandler", null);
        term36915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36915, term36915.getClass(), "type", 0);
        setField(term36915, term36915.getClass(), "next", null);
        setIntField(term36916, term36916.getClass(), "type", 0);
        setIntField(term36917, term36917.getClass(), "type", 0);
        setIntField(term36918, term36918.getClass(), "type", 0);
        setField(term36918, term36918.getClass(), "next", null);
        setField(term36918, term36918.getClass(), "first", null);
        setField(term36918, term36918.getClass(), "last", null);
        setField(term36918, term36918.getClass(), "propListHead", null);
        setIntField(term36918, term36918.getClass(), "sourcePosition", 0);
        setField(term36918, term36918.getClass(), "jsType", null);
        setField(term36918, term36918.getClass(), "parent", null);
        setField(term36917, term36917.getClass(), "next", term36918);
        setField(term36917, term36917.getClass(), "first", null);
        setField(term36917, term36917.getClass(), "last", null);
        setField(term36917, term36917.getClass(), "propListHead", null);
        setIntField(term36917, term36917.getClass(), "sourcePosition", 0);
        setField(term36917, term36917.getClass(), "jsType", null);
        setField(term36917, term36917.getClass(), "parent", null);
        setField(term36916, term36916.getClass(), "next", term36917);
        setIntField(term36919, term36919.getClass(), "type", 0);
        setField(term36919, term36919.getClass(), "next", null);
        setField(term36919, term36919.getClass(), "first", null);
        setField(term36919, term36919.getClass(), "last", null);
        setField(term36919, term36919.getClass(), "propListHead", null);
        setIntField(term36919, term36919.getClass(), "sourcePosition", 0);
        setField(term36919, term36919.getClass(), "jsType", null);
        setField(term36919, term36919.getClass(), "parent", null);
        setField(term36916, term36916.getClass(), "first", term36919);
        setField(term36916, term36916.getClass(), "last", null);
        setField(term36916, term36916.getClass(), "propListHead", null);
        setIntField(term36916, term36916.getClass(), "sourcePosition", 0);
        setField(term36916, term36916.getClass(), "jsType", null);
        setField(term36916, term36916.getClass(), "parent", null);
        setField(term36915, term36915.getClass(), "first", term36916);
        setField(term36915, term36915.getClass(), "last", null);
        setField(term36915, term36915.getClass(), "propListHead", null);
        setIntField(term36915, term36915.getClass(), "sourcePosition", 0);
        setField(term36915, term36915.getClass(), "jsType", null);
        setField(term36915, term36915.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term35944;
        callMethod(klass, "process", argTypes, term35874, args);
        assertTrue(recursiveEquals(term35874, term36914));
        assertTrue(recursiveEquals(term35944, null));
    }

};


