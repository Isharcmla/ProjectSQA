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

public class ScopedAliases_process_84065531351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24740;
     Object term24810;
     Object term25177;
     Object term25178;

    public ScopedAliases_process_84065531351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24740 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term24740, term24740.getClass(), "compiler", null);
        term24810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24810, term24810.getClass(), "type", 0);
        setField(term24810, term24810.getClass(), "parent", null);
        setField(term24880, term24880.getClass(), "next", null);
        setIntField(term24880, term24880.getClass(), "type", 105);
        setField(term24810, term24810.getClass(), "first", term24880);
        term25177 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term25177, term25177.getClass(), "compiler", null);
        setField(term25177, term25177.getClass(), "preprocessorSymbolTable", null);
        setField(term25177, term25177.getClass(), "transformationHandler", null);
        term25178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25178, term25178.getClass(), "type", 0);
        setField(term25178, term25178.getClass(), "next", null);
        setIntField(term25179, term25179.getClass(), "type", 105);
        setField(term25179, term25179.getClass(), "next", null);
        setField(term25179, term25179.getClass(), "first", null);
        setField(term25179, term25179.getClass(), "last", null);
        setField(term25179, term25179.getClass(), "propListHead", null);
        setIntField(term25179, term25179.getClass(), "sourcePosition", 0);
        setField(term25179, term25179.getClass(), "jsType", null);
        setField(term25179, term25179.getClass(), "parent", null);
        setField(term25178, term25178.getClass(), "first", term25179);
        setField(term25178, term25178.getClass(), "last", null);
        setField(term25178, term25178.getClass(), "propListHead", null);
        setIntField(term25178, term25178.getClass(), "sourcePosition", 0);
        setField(term25178, term25178.getClass(), "jsType", null);
        setField(term25178, term25178.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term24810;
        callMethod(klass, "process", argTypes, term24740, args);
        assertTrue(recursiveEquals(term24740, term25177));
        assertTrue(recursiveEquals(term24810, null));
    }

};


