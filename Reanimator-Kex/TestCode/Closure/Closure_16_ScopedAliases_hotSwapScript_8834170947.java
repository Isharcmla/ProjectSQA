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

public class ScopedAliases_hotSwapScript_8834170947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28049;
     Object term28119;
     Object term29089;
     Object term29090;

    public ScopedAliases_hotSwapScript_8834170947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28049 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term28049, term28049.getClass(), "compiler", null);
        term28119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28119, term28119.getClass(), "type", 0);
        setField(term28119, term28119.getClass(), "parent", null);
        setField(term28259, term28259.getClass(), "next", null);
        setIntField(term28259, term28259.getClass(), "type", 0);
        setField(term28329, term28329.getClass(), "next", null);
        setIntField(term28329, term28329.getClass(), "type", 0);
        setField(term28329, term28329.getClass(), "first", null);
        setField(term28259, term28259.getClass(), "first", term28329);
        setField(term28189, term28189.getClass(), "next", term28259);
        setIntField(term28189, term28189.getClass(), "type", 0);
        setField(term28399, term28399.getClass(), "next", null);
        setIntField(term28399, term28399.getClass(), "type", 0);
        setField(term28399, term28399.getClass(), "first", null);
        setField(term28189, term28189.getClass(), "first", term28399);
        setField(term28119, term28119.getClass(), "first", term28189);
        term29089 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term29089, term29089.getClass(), "compiler", null);
        setField(term29089, term29089.getClass(), "preprocessorSymbolTable", null);
        setField(term29089, term29089.getClass(), "transformationHandler", null);
        term29090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29090, term29090.getClass(), "type", 0);
        setField(term29090, term29090.getClass(), "next", null);
        setIntField(term29091, term29091.getClass(), "type", 0);
        setIntField(term29092, term29092.getClass(), "type", 0);
        setField(term29092, term29092.getClass(), "next", null);
        setIntField(term29093, term29093.getClass(), "type", 0);
        setField(term29093, term29093.getClass(), "next", null);
        setField(term29093, term29093.getClass(), "first", null);
        setField(term29093, term29093.getClass(), "last", null);
        setField(term29093, term29093.getClass(), "propListHead", null);
        setIntField(term29093, term29093.getClass(), "sourcePosition", 0);
        setField(term29093, term29093.getClass(), "jsType", null);
        setField(term29093, term29093.getClass(), "parent", null);
        setField(term29092, term29092.getClass(), "first", term29093);
        setField(term29092, term29092.getClass(), "last", null);
        setField(term29092, term29092.getClass(), "propListHead", null);
        setIntField(term29092, term29092.getClass(), "sourcePosition", 0);
        setField(term29092, term29092.getClass(), "jsType", null);
        setField(term29092, term29092.getClass(), "parent", null);
        setField(term29091, term29091.getClass(), "next", term29092);
        setIntField(term29094, term29094.getClass(), "type", 0);
        setField(term29094, term29094.getClass(), "next", null);
        setField(term29094, term29094.getClass(), "first", null);
        setField(term29094, term29094.getClass(), "last", null);
        setField(term29094, term29094.getClass(), "propListHead", null);
        setIntField(term29094, term29094.getClass(), "sourcePosition", 0);
        setField(term29094, term29094.getClass(), "jsType", null);
        setField(term29094, term29094.getClass(), "parent", null);
        setField(term29091, term29091.getClass(), "first", term29094);
        setField(term29091, term29091.getClass(), "last", null);
        setField(term29091, term29091.getClass(), "propListHead", null);
        setIntField(term29091, term29091.getClass(), "sourcePosition", 0);
        setField(term29091, term29091.getClass(), "jsType", null);
        setField(term29091, term29091.getClass(), "parent", null);
        setField(term29090, term29090.getClass(), "first", term29091);
        setField(term29090, term29090.getClass(), "last", null);
        setField(term29090, term29090.getClass(), "propListHead", null);
        setIntField(term29090, term29090.getClass(), "sourcePosition", 0);
        setField(term29090, term29090.getClass(), "jsType", null);
        setField(term29090, term29090.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term28119;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term28049, args);
        assertTrue(recursiveEquals(term28049, term29089));
        assertTrue(recursiveEquals(term28119, term29090));
    }

};


