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

public class ScopedAliases_process_84065531327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14108;
     Object term14178;
     Object term14884;
     Object term14885;

    public ScopedAliases_process_84065531327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14108 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term14108, term14108.getClass(), "compiler", null);
        term14178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14178, term14178.getClass(), "type", 0);
        setField(term14178, term14178.getClass(), "parent", null);
        setField(term14248, term14248.getClass(), "next", null);
        setIntField(term14248, term14248.getClass(), "type", 0);
        setField(term14318, term14318.getClass(), "next", term14388);
        setIntField(term14318, term14318.getClass(), "type", 105);
        setField(term14248, term14248.getClass(), "first", term14318);
        setField(term14178, term14178.getClass(), "first", term14248);
        term14884 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term14884, term14884.getClass(), "compiler", null);
        setField(term14884, term14884.getClass(), "preprocessorSymbolTable", null);
        setField(term14884, term14884.getClass(), "transformationHandler", null);
        term14885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14885, term14885.getClass(), "type", 0);
        setField(term14885, term14885.getClass(), "next", null);
        setIntField(term14886, term14886.getClass(), "type", 0);
        setField(term14886, term14886.getClass(), "next", null);
        setIntField(term14887, term14887.getClass(), "type", 105);
        setIntField(term14888, term14888.getClass(), "type", 0);
        setField(term14888, term14888.getClass(), "next", null);
        setField(term14888, term14888.getClass(), "first", null);
        setField(term14888, term14888.getClass(), "last", null);
        setField(term14888, term14888.getClass(), "propListHead", null);
        setIntField(term14888, term14888.getClass(), "sourcePosition", 0);
        setField(term14888, term14888.getClass(), "jsType", null);
        setField(term14888, term14888.getClass(), "parent", null);
        setField(term14887, term14887.getClass(), "next", term14888);
        setField(term14887, term14887.getClass(), "first", null);
        setField(term14887, term14887.getClass(), "last", null);
        setField(term14887, term14887.getClass(), "propListHead", null);
        setIntField(term14887, term14887.getClass(), "sourcePosition", 0);
        setField(term14887, term14887.getClass(), "jsType", null);
        setField(term14887, term14887.getClass(), "parent", null);
        setField(term14886, term14886.getClass(), "first", term14887);
        setField(term14886, term14886.getClass(), "last", null);
        setField(term14886, term14886.getClass(), "propListHead", null);
        setIntField(term14886, term14886.getClass(), "sourcePosition", 0);
        setField(term14886, term14886.getClass(), "jsType", null);
        setField(term14886, term14886.getClass(), "parent", null);
        setField(term14885, term14885.getClass(), "first", term14886);
        setField(term14885, term14885.getClass(), "last", null);
        setField(term14885, term14885.getClass(), "propListHead", null);
        setIntField(term14885, term14885.getClass(), "sourcePosition", 0);
        setField(term14885, term14885.getClass(), "jsType", null);
        setField(term14885, term14885.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term14178;
        callMethod(klass, "process", argTypes, term14108, args);
        assertTrue(recursiveEquals(term14108, term14884));
        assertTrue(recursiveEquals(term14178, null));
    }

};


