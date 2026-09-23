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

public class ScopedAliases_process_840655313146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88475;
     Object term88545;
     Object term89964;
     Object term89965;

    public ScopedAliases_process_840655313146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88475 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term88475, term88475.getClass(), "compiler", null);
        term88545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88545, term88545.getClass(), "type", 0);
        setIntField(term88615, term88615.getClass(), "type", 0);
        setField(term88615, term88615.getClass(), "parent", null);
        setField(term88545, term88545.getClass(), "parent", term88615);
        setField(term88685, term88685.getClass(), "next", null);
        setIntField(term88685, term88685.getClass(), "type", 0);
        setField(term88685, term88685.getClass(), "first", null);
        setField(term88545, term88545.getClass(), "first", term88685);
        term89964 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term89964, term89964.getClass(), "compiler", null);
        setField(term89964, term89964.getClass(), "preprocessorSymbolTable", null);
        setField(term89964, term89964.getClass(), "transformationHandler", null);
        term89965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89965, term89965.getClass(), "type", 0);
        setField(term89965, term89965.getClass(), "next", null);
        setIntField(term89966, term89966.getClass(), "type", 0);
        setField(term89966, term89966.getClass(), "next", null);
        setField(term89966, term89966.getClass(), "first", null);
        setField(term89966, term89966.getClass(), "last", null);
        setField(term89966, term89966.getClass(), "propListHead", null);
        setIntField(term89966, term89966.getClass(), "sourcePosition", 0);
        setField(term89966, term89966.getClass(), "jsType", null);
        setField(term89966, term89966.getClass(), "parent", null);
        setField(term89965, term89965.getClass(), "first", term89966);
        setField(term89965, term89965.getClass(), "last", null);
        setField(term89965, term89965.getClass(), "propListHead", null);
        setIntField(term89965, term89965.getClass(), "sourcePosition", 0);
        setField(term89965, term89965.getClass(), "jsType", null);
        setIntField(term89967, term89967.getClass(), "type", 0);
        setField(term89967, term89967.getClass(), "next", null);
        setField(term89967, term89967.getClass(), "first", null);
        setField(term89967, term89967.getClass(), "last", null);
        setField(term89967, term89967.getClass(), "propListHead", null);
        setIntField(term89967, term89967.getClass(), "sourcePosition", 0);
        setField(term89967, term89967.getClass(), "jsType", null);
        setField(term89967, term89967.getClass(), "parent", null);
        setField(term89965, term89965.getClass(), "parent", term89967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term88545;
        callMethod(klass, "process", argTypes, term88475, args);
        assertTrue(recursiveEquals(term88475, term89964));
        assertTrue(recursiveEquals(term88545, null));
    }

};


