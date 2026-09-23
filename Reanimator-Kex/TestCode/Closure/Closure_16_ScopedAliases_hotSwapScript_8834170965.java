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

public class ScopedAliases_hotSwapScript_8834170965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37236;
     Object term37306;
     Object term38089;
     Object term38090;

    public ScopedAliases_hotSwapScript_8834170965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37236 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term37236, term37236.getClass(), "compiler", null);
        term37306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37306, term37306.getClass(), "type", 0);
        setField(term37306, term37306.getClass(), "parent", null);
        setField(term37376, term37376.getClass(), "next", null);
        setIntField(term37376, term37376.getClass(), "type", 0);
        setField(term37446, term37446.getClass(), "next", term37516);
        setIntField(term37446, term37446.getClass(), "type", 105);
        setField(term37376, term37376.getClass(), "first", term37446);
        setField(term37306, term37306.getClass(), "first", term37376);
        term38089 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term38089, term38089.getClass(), "compiler", null);
        setField(term38089, term38089.getClass(), "preprocessorSymbolTable", null);
        setField(term38089, term38089.getClass(), "transformationHandler", null);
        term38090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38090, term38090.getClass(), "type", 0);
        setField(term38090, term38090.getClass(), "next", null);
        setIntField(term38091, term38091.getClass(), "type", 0);
        setField(term38091, term38091.getClass(), "next", null);
        setIntField(term38092, term38092.getClass(), "type", 105);
        setIntField(term38093, term38093.getClass(), "type", 0);
        setField(term38093, term38093.getClass(), "next", null);
        setField(term38093, term38093.getClass(), "first", null);
        setField(term38093, term38093.getClass(), "last", null);
        setField(term38093, term38093.getClass(), "propListHead", null);
        setIntField(term38093, term38093.getClass(), "sourcePosition", 0);
        setField(term38093, term38093.getClass(), "jsType", null);
        setField(term38093, term38093.getClass(), "parent", null);
        setField(term38092, term38092.getClass(), "next", term38093);
        setField(term38092, term38092.getClass(), "first", null);
        setField(term38092, term38092.getClass(), "last", null);
        setField(term38092, term38092.getClass(), "propListHead", null);
        setIntField(term38092, term38092.getClass(), "sourcePosition", 0);
        setField(term38092, term38092.getClass(), "jsType", null);
        setField(term38092, term38092.getClass(), "parent", null);
        setField(term38091, term38091.getClass(), "first", term38092);
        setField(term38091, term38091.getClass(), "last", null);
        setField(term38091, term38091.getClass(), "propListHead", null);
        setIntField(term38091, term38091.getClass(), "sourcePosition", 0);
        setField(term38091, term38091.getClass(), "jsType", null);
        setField(term38091, term38091.getClass(), "parent", null);
        setField(term38090, term38090.getClass(), "first", term38091);
        setField(term38090, term38090.getClass(), "last", null);
        setField(term38090, term38090.getClass(), "propListHead", null);
        setIntField(term38090, term38090.getClass(), "sourcePosition", 0);
        setField(term38090, term38090.getClass(), "jsType", null);
        setField(term38090, term38090.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term37306;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term37236, args);
        assertTrue(recursiveEquals(term37236, term38089));
        assertTrue(recursiveEquals(term37306, term38090));
    }

};


