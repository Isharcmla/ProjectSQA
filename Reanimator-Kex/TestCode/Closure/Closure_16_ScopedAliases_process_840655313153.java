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

public class ScopedAliases_process_840655313153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93094;
     Object term93186;
     Object term94272;
     Object term94273;

    public ScopedAliases_process_840655313153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93094 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term93094, term93094.getClass(), "compiler", null);
        term93186 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term93278 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term93186, term93186.getClass(), "type", 105);
        setIntField(term93278, term93278.getClass(), "type", 0);
        setField(term93278, term93278.getClass(), "parent", null);
        setField(term93186, term93186.getClass(), "parent", term93278);
        term94272 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term94272, term94272.getClass(), "compiler", null);
        setField(term94272, term94272.getClass(), "preprocessorSymbolTable", null);
        setField(term94272, term94272.getClass(), "transformationHandler", null);
        term94273 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term94274 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term94273, term94273.getClass(), "number", 0.0);
        setIntField(term94273, term94273.getClass(), "type", 105);
        setField(term94273, term94273.getClass(), "next", null);
        setField(term94273, term94273.getClass(), "first", null);
        setField(term94273, term94273.getClass(), "last", null);
        setField(term94273, term94273.getClass(), "propListHead", null);
        setIntField(term94273, term94273.getClass(), "sourcePosition", 0);
        setField(term94273, term94273.getClass(), "jsType", null);
        setDoubleField(term94274, term94274.getClass(), "number", 0.0);
        setIntField(term94274, term94274.getClass(), "type", 0);
        setField(term94274, term94274.getClass(), "next", null);
        setField(term94274, term94274.getClass(), "first", null);
        setField(term94274, term94274.getClass(), "last", null);
        setField(term94274, term94274.getClass(), "propListHead", null);
        setIntField(term94274, term94274.getClass(), "sourcePosition", 0);
        setField(term94274, term94274.getClass(), "jsType", null);
        setField(term94274, term94274.getClass(), "parent", null);
        setField(term94273, term94273.getClass(), "parent", term94274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term93186;
        callMethod(klass, "process", argTypes, term93094, args);
        assertTrue(recursiveEquals(term93094, term94272));
        assertTrue(recursiveEquals(term93186, null));
    }

};


