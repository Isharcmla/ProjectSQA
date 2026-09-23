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

public class ScopedAliases_process_84065531331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17766;
     Object term17836;
     Object term18621;
     Object term18622;

    public ScopedAliases_process_84065531331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17766 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term17766, term17766.getClass(), "compiler", null);
        term17836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17836, term17836.getClass(), "type", 0);
        setField(term17836, term17836.getClass(), "parent", null);
        setField(term17976, term17976.getClass(), "next", null);
        setIntField(term17976, term17976.getClass(), "type", 105);
        setField(term17906, term17906.getClass(), "next", term17976);
        setIntField(term17906, term17906.getClass(), "type", 0);
        setField(term18046, term18046.getClass(), "next", null);
        setIntField(term18046, term18046.getClass(), "type", 0);
        setField(term18046, term18046.getClass(), "first", null);
        setField(term17906, term17906.getClass(), "first", term18046);
        setField(term17836, term17836.getClass(), "first", term17906);
        term18621 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term18621, term18621.getClass(), "compiler", null);
        setField(term18621, term18621.getClass(), "preprocessorSymbolTable", null);
        setField(term18621, term18621.getClass(), "transformationHandler", null);
        term18622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18622, term18622.getClass(), "type", 0);
        setField(term18622, term18622.getClass(), "next", null);
        setIntField(term18623, term18623.getClass(), "type", 0);
        setIntField(term18624, term18624.getClass(), "type", 105);
        setField(term18624, term18624.getClass(), "next", null);
        setField(term18624, term18624.getClass(), "first", null);
        setField(term18624, term18624.getClass(), "last", null);
        setField(term18624, term18624.getClass(), "propListHead", null);
        setIntField(term18624, term18624.getClass(), "sourcePosition", 0);
        setField(term18624, term18624.getClass(), "jsType", null);
        setField(term18624, term18624.getClass(), "parent", null);
        setField(term18623, term18623.getClass(), "next", term18624);
        setIntField(term18625, term18625.getClass(), "type", 0);
        setField(term18625, term18625.getClass(), "next", null);
        setField(term18625, term18625.getClass(), "first", null);
        setField(term18625, term18625.getClass(), "last", null);
        setField(term18625, term18625.getClass(), "propListHead", null);
        setIntField(term18625, term18625.getClass(), "sourcePosition", 0);
        setField(term18625, term18625.getClass(), "jsType", null);
        setField(term18625, term18625.getClass(), "parent", null);
        setField(term18623, term18623.getClass(), "first", term18625);
        setField(term18623, term18623.getClass(), "last", null);
        setField(term18623, term18623.getClass(), "propListHead", null);
        setIntField(term18623, term18623.getClass(), "sourcePosition", 0);
        setField(term18623, term18623.getClass(), "jsType", null);
        setField(term18623, term18623.getClass(), "parent", null);
        setField(term18622, term18622.getClass(), "first", term18623);
        setField(term18622, term18622.getClass(), "last", null);
        setField(term18622, term18622.getClass(), "propListHead", null);
        setIntField(term18622, term18622.getClass(), "sourcePosition", 0);
        setField(term18622, term18622.getClass(), "jsType", null);
        setField(term18622, term18622.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17836;
        callMethod(klass, "process", argTypes, term17766, args);
        assertTrue(recursiveEquals(term17766, term18621));
        assertTrue(recursiveEquals(term17836, null));
    }

};


