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

public class ScopedAliases_hotSwapScript_88341709331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221906;
     Object term221998;
     Object term223109;
     Object term223110;

    public ScopedAliases_hotSwapScript_88341709331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221906 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term221906, term221906.getClass(), "compiler", null);
        term221998 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term222090 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term222182 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term222274 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term222366 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term221998, term221998.getClass(), "type", 0);
        setField(term221998, term221998.getClass(), "parent", null);
        setField(term222182, term222182.getClass(), "next", null);
        setIntField(term222182, term222182.getClass(), "type", 37);
        setField(term222274, term222274.getClass(), "next", null);
        setIntField(term222274, term222274.getClass(), "type", 0);
        setField(term222274, term222274.getClass(), "first", null);
        setField(term222182, term222182.getClass(), "first", term222274);
        setField(term222090, term222090.getClass(), "next", term222182);
        setIntField(term222090, term222090.getClass(), "type", 0);
        setField(term222366, term222366.getClass(), "next", null);
        setIntField(term222366, term222366.getClass(), "type", 0);
        setField(term222366, term222366.getClass(), "first", null);
        setField(term222090, term222090.getClass(), "first", term222366);
        setField(term221998, term221998.getClass(), "first", term222090);
        term223109 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term223109, term223109.getClass(), "compiler", null);
        setField(term223109, term223109.getClass(), "preprocessorSymbolTable", null);
        setField(term223109, term223109.getClass(), "transformationHandler", null);
        term223110 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term223111 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term223112 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term223113 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term223114 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term223110, term223110.getClass(), "number", 0.0);
        setIntField(term223110, term223110.getClass(), "type", 0);
        setField(term223110, term223110.getClass(), "next", null);
        setDoubleField(term223111, term223111.getClass(), "number", 0.0);
        setIntField(term223111, term223111.getClass(), "type", 0);
        setDoubleField(term223112, term223112.getClass(), "number", 0.0);
        setIntField(term223112, term223112.getClass(), "type", 37);
        setField(term223112, term223112.getClass(), "next", null);
        setDoubleField(term223113, term223113.getClass(), "number", 0.0);
        setIntField(term223113, term223113.getClass(), "type", 0);
        setField(term223113, term223113.getClass(), "next", null);
        setField(term223113, term223113.getClass(), "first", null);
        setField(term223113, term223113.getClass(), "last", null);
        setField(term223113, term223113.getClass(), "propListHead", null);
        setIntField(term223113, term223113.getClass(), "sourcePosition", 0);
        setField(term223113, term223113.getClass(), "jsType", null);
        setField(term223113, term223113.getClass(), "parent", null);
        setField(term223112, term223112.getClass(), "first", term223113);
        setField(term223112, term223112.getClass(), "last", null);
        setField(term223112, term223112.getClass(), "propListHead", null);
        setIntField(term223112, term223112.getClass(), "sourcePosition", 0);
        setField(term223112, term223112.getClass(), "jsType", null);
        setField(term223112, term223112.getClass(), "parent", null);
        setField(term223111, term223111.getClass(), "next", term223112);
        setDoubleField(term223114, term223114.getClass(), "number", 0.0);
        setIntField(term223114, term223114.getClass(), "type", 0);
        setField(term223114, term223114.getClass(), "next", null);
        setField(term223114, term223114.getClass(), "first", null);
        setField(term223114, term223114.getClass(), "last", null);
        setField(term223114, term223114.getClass(), "propListHead", null);
        setIntField(term223114, term223114.getClass(), "sourcePosition", 0);
        setField(term223114, term223114.getClass(), "jsType", null);
        setField(term223114, term223114.getClass(), "parent", null);
        setField(term223111, term223111.getClass(), "first", term223114);
        setField(term223111, term223111.getClass(), "last", null);
        setField(term223111, term223111.getClass(), "propListHead", null);
        setIntField(term223111, term223111.getClass(), "sourcePosition", 0);
        setField(term223111, term223111.getClass(), "jsType", null);
        setField(term223111, term223111.getClass(), "parent", null);
        setField(term223110, term223110.getClass(), "first", term223111);
        setField(term223110, term223110.getClass(), "last", null);
        setField(term223110, term223110.getClass(), "propListHead", null);
        setIntField(term223110, term223110.getClass(), "sourcePosition", 0);
        setField(term223110, term223110.getClass(), "jsType", null);
        setField(term223110, term223110.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term221998;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term221906, args);
        assertTrue(recursiveEquals(term221906, term223109));
        assertTrue(recursiveEquals(term221998, term223110));
    }

};


