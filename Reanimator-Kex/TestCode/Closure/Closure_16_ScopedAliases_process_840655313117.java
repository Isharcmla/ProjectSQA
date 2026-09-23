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

public class ScopedAliases_process_840655313117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70071;
     Object term70141;
     Object term71111;
     Object term71112;

    public ScopedAliases_process_840655313117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70071 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term70071, term70071.getClass(), "compiler", null);
        term70141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term70141, term70141.getClass(), "type", 0);
        setField(term70141, term70141.getClass(), "parent", null);
        setField(term70351, term70351.getClass(), "next", null);
        setIntField(term70351, term70351.getClass(), "type", 0);
        setField(term70351, term70351.getClass(), "first", null);
        setField(term70281, term70281.getClass(), "next", term70351);
        setIntField(term70281, term70281.getClass(), "type", 0);
        setField(term70281, term70281.getClass(), "first", null);
        setField(term70211, term70211.getClass(), "next", term70281);
        setIntField(term70211, term70211.getClass(), "type", 0);
        setField(term70421, term70421.getClass(), "next", null);
        setIntField(term70421, term70421.getClass(), "type", 0);
        setField(term70421, term70421.getClass(), "first", null);
        setField(term70211, term70211.getClass(), "first", term70421);
        setField(term70141, term70141.getClass(), "first", term70211);
        term71111 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term71111, term71111.getClass(), "compiler", null);
        setField(term71111, term71111.getClass(), "preprocessorSymbolTable", null);
        setField(term71111, term71111.getClass(), "transformationHandler", null);
        term71112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term71112, term71112.getClass(), "type", 0);
        setField(term71112, term71112.getClass(), "next", null);
        setIntField(term71113, term71113.getClass(), "type", 0);
        setIntField(term71114, term71114.getClass(), "type", 0);
        setIntField(term71115, term71115.getClass(), "type", 0);
        setField(term71115, term71115.getClass(), "next", null);
        setField(term71115, term71115.getClass(), "first", null);
        setField(term71115, term71115.getClass(), "last", null);
        setField(term71115, term71115.getClass(), "propListHead", null);
        setIntField(term71115, term71115.getClass(), "sourcePosition", 0);
        setField(term71115, term71115.getClass(), "jsType", null);
        setField(term71115, term71115.getClass(), "parent", null);
        setField(term71114, term71114.getClass(), "next", term71115);
        setField(term71114, term71114.getClass(), "first", null);
        setField(term71114, term71114.getClass(), "last", null);
        setField(term71114, term71114.getClass(), "propListHead", null);
        setIntField(term71114, term71114.getClass(), "sourcePosition", 0);
        setField(term71114, term71114.getClass(), "jsType", null);
        setField(term71114, term71114.getClass(), "parent", null);
        setField(term71113, term71113.getClass(), "next", term71114);
        setIntField(term71116, term71116.getClass(), "type", 0);
        setField(term71116, term71116.getClass(), "next", null);
        setField(term71116, term71116.getClass(), "first", null);
        setField(term71116, term71116.getClass(), "last", null);
        setField(term71116, term71116.getClass(), "propListHead", null);
        setIntField(term71116, term71116.getClass(), "sourcePosition", 0);
        setField(term71116, term71116.getClass(), "jsType", null);
        setField(term71116, term71116.getClass(), "parent", null);
        setField(term71113, term71113.getClass(), "first", term71116);
        setField(term71113, term71113.getClass(), "last", null);
        setField(term71113, term71113.getClass(), "propListHead", null);
        setIntField(term71113, term71113.getClass(), "sourcePosition", 0);
        setField(term71113, term71113.getClass(), "jsType", null);
        setField(term71113, term71113.getClass(), "parent", null);
        setField(term71112, term71112.getClass(), "first", term71113);
        setField(term71112, term71112.getClass(), "last", null);
        setField(term71112, term71112.getClass(), "propListHead", null);
        setIntField(term71112, term71112.getClass(), "sourcePosition", 0);
        setField(term71112, term71112.getClass(), "jsType", null);
        setField(term71112, term71112.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term70141;
        callMethod(klass, "process", argTypes, term70071, args);
        assertTrue(recursiveEquals(term70071, term71111));
        assertTrue(recursiveEquals(term70141, null));
    }

};


