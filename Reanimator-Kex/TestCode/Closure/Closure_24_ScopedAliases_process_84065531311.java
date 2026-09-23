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

public class ScopedAliases_process_84065531311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5157;
     Object term5227;
     Object term5967;
     Object term5968;

    public ScopedAliases_process_84065531311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5157 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term5157, term5157.getClass(), "compiler", null);
        term5227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5227, term5227.getClass(), "type", 0);
        setField(term5227, term5227.getClass(), "parent", null);
        setField(term5367, term5367.getClass(), "next", null);
        setIntField(term5367, term5367.getClass(), "type", 0);
        setField(term5367, term5367.getClass(), "first", null);
        setField(term5297, term5297.getClass(), "next", term5367);
        setIntField(term5297, term5297.getClass(), "type", 0);
        setField(term5437, term5437.getClass(), "next", null);
        setIntField(term5437, term5437.getClass(), "type", 0);
        setField(term5437, term5437.getClass(), "first", null);
        setField(term5297, term5297.getClass(), "first", term5437);
        setField(term5227, term5227.getClass(), "first", term5297);
        term5967 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term5967, term5967.getClass(), "compiler", null);
        setField(term5967, term5967.getClass(), "preprocessorSymbolTable", null);
        setField(term5967, term5967.getClass(), "transformationHandler", null);
        term5968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5968, term5968.getClass(), "type", 0);
        setField(term5968, term5968.getClass(), "next", null);
        setIntField(term5969, term5969.getClass(), "type", 0);
        setIntField(term5970, term5970.getClass(), "type", 0);
        setField(term5970, term5970.getClass(), "next", null);
        setField(term5970, term5970.getClass(), "first", null);
        setField(term5970, term5970.getClass(), "last", null);
        setField(term5970, term5970.getClass(), "propListHead", null);
        setIntField(term5970, term5970.getClass(), "sourcePosition", 0);
        setField(term5970, term5970.getClass(), "jsType", null);
        setField(term5970, term5970.getClass(), "parent", null);
        setField(term5969, term5969.getClass(), "next", term5970);
        setIntField(term5971, term5971.getClass(), "type", 0);
        setField(term5971, term5971.getClass(), "next", null);
        setField(term5971, term5971.getClass(), "first", null);
        setField(term5971, term5971.getClass(), "last", null);
        setField(term5971, term5971.getClass(), "propListHead", null);
        setIntField(term5971, term5971.getClass(), "sourcePosition", 0);
        setField(term5971, term5971.getClass(), "jsType", null);
        setField(term5971, term5971.getClass(), "parent", null);
        setField(term5969, term5969.getClass(), "first", term5971);
        setField(term5969, term5969.getClass(), "last", null);
        setField(term5969, term5969.getClass(), "propListHead", null);
        setIntField(term5969, term5969.getClass(), "sourcePosition", 0);
        setField(term5969, term5969.getClass(), "jsType", null);
        setField(term5969, term5969.getClass(), "parent", null);
        setField(term5968, term5968.getClass(), "first", term5969);
        setField(term5968, term5968.getClass(), "last", null);
        setField(term5968, term5968.getClass(), "propListHead", null);
        setIntField(term5968, term5968.getClass(), "sourcePosition", 0);
        setField(term5968, term5968.getClass(), "jsType", null);
        setField(term5968, term5968.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5227;
        callMethod(klass, "process", argTypes, term5157, args);
        assertTrue(recursiveEquals(term5157, term5967));
        assertTrue(recursiveEquals(term5227, null));
    }

};


