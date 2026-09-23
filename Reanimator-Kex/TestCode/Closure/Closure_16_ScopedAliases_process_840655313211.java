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

public class ScopedAliases_process_840655313211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129934;
     Object term130026;
     Object term130917;
     Object term130918;

    public ScopedAliases_process_840655313211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129934 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term129934, term129934.getClass(), "compiler", null);
        term130026 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130118 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130210 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130302 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term130026, term130026.getClass(), "type", 0);
        setField(term130026, term130026.getClass(), "parent", null);
        setField(term130210, term130210.getClass(), "next", null);
        setIntField(term130210, term130210.getClass(), "type", 0);
        setField(term130210, term130210.getClass(), "first", null);
        setField(term130118, term130118.getClass(), "next", term130210);
        setIntField(term130118, term130118.getClass(), "type", 0);
        setField(term130302, term130302.getClass(), "next", null);
        setIntField(term130302, term130302.getClass(), "type", 0);
        setField(term130302, term130302.getClass(), "first", null);
        setField(term130118, term130118.getClass(), "first", term130302);
        setField(term130026, term130026.getClass(), "first", term130118);
        term130917 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term130917, term130917.getClass(), "compiler", null);
        setField(term130917, term130917.getClass(), "preprocessorSymbolTable", null);
        setField(term130917, term130917.getClass(), "transformationHandler", null);
        term130918 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130919 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130920 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130921 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term130918, term130918.getClass(), "number", 0.0);
        setIntField(term130918, term130918.getClass(), "type", 0);
        setField(term130918, term130918.getClass(), "next", null);
        setDoubleField(term130919, term130919.getClass(), "number", 0.0);
        setIntField(term130919, term130919.getClass(), "type", 0);
        setDoubleField(term130920, term130920.getClass(), "number", 0.0);
        setIntField(term130920, term130920.getClass(), "type", 0);
        setField(term130920, term130920.getClass(), "next", null);
        setField(term130920, term130920.getClass(), "first", null);
        setField(term130920, term130920.getClass(), "last", null);
        setField(term130920, term130920.getClass(), "propListHead", null);
        setIntField(term130920, term130920.getClass(), "sourcePosition", 0);
        setField(term130920, term130920.getClass(), "jsType", null);
        setField(term130920, term130920.getClass(), "parent", null);
        setField(term130919, term130919.getClass(), "next", term130920);
        setDoubleField(term130921, term130921.getClass(), "number", 0.0);
        setIntField(term130921, term130921.getClass(), "type", 0);
        setField(term130921, term130921.getClass(), "next", null);
        setField(term130921, term130921.getClass(), "first", null);
        setField(term130921, term130921.getClass(), "last", null);
        setField(term130921, term130921.getClass(), "propListHead", null);
        setIntField(term130921, term130921.getClass(), "sourcePosition", 0);
        setField(term130921, term130921.getClass(), "jsType", null);
        setField(term130921, term130921.getClass(), "parent", null);
        setField(term130919, term130919.getClass(), "first", term130921);
        setField(term130919, term130919.getClass(), "last", null);
        setField(term130919, term130919.getClass(), "propListHead", null);
        setIntField(term130919, term130919.getClass(), "sourcePosition", 0);
        setField(term130919, term130919.getClass(), "jsType", null);
        setField(term130919, term130919.getClass(), "parent", null);
        setField(term130918, term130918.getClass(), "first", term130919);
        setField(term130918, term130918.getClass(), "last", null);
        setField(term130918, term130918.getClass(), "propListHead", null);
        setIntField(term130918, term130918.getClass(), "sourcePosition", 0);
        setField(term130918, term130918.getClass(), "jsType", null);
        setField(term130918, term130918.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term130026;
        callMethod(klass, "process", argTypes, term129934, args);
        assertTrue(recursiveEquals(term129934, term130917));
        assertTrue(recursiveEquals(term130026, null));
    }

};


