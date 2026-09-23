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

public class ScopedAliases_process_840655313149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91190;
     Object term91282;
     Object term92124;
     Object term92125;

    public ScopedAliases_process_840655313149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91190 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term91190, term91190.getClass(), "compiler", null);
        term91282 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91514 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term91282, term91282.getClass(), "type", 0);
        setField(term91282, term91282.getClass(), "parent", null);
        setField(term91422, term91422.getClass(), "next", null);
        setIntField(term91422, term91422.getClass(), "type", 0);
        setField(term91422, term91422.getClass(), "first", null);
        setField(term91352, term91352.getClass(), "next", term91422);
        setIntField(term91352, term91352.getClass(), "type", 0);
        setField(term91514, term91514.getClass(), "next", null);
        setIntField(term91514, term91514.getClass(), "type", 0);
        setField(term91514, term91514.getClass(), "first", null);
        setField(term91352, term91352.getClass(), "first", term91514);
        setField(term91282, term91282.getClass(), "first", term91352);
        term92124 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term92124, term92124.getClass(), "compiler", null);
        setField(term92124, term92124.getClass(), "preprocessorSymbolTable", null);
        setField(term92124, term92124.getClass(), "transformationHandler", null);
        term92125 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92128 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term92125, term92125.getClass(), "number", 0.0);
        setIntField(term92125, term92125.getClass(), "type", 0);
        setField(term92125, term92125.getClass(), "next", null);
        setIntField(term92126, term92126.getClass(), "type", 0);
        setIntField(term92127, term92127.getClass(), "type", 0);
        setField(term92127, term92127.getClass(), "next", null);
        setField(term92127, term92127.getClass(), "first", null);
        setField(term92127, term92127.getClass(), "last", null);
        setField(term92127, term92127.getClass(), "propListHead", null);
        setIntField(term92127, term92127.getClass(), "sourcePosition", 0);
        setField(term92127, term92127.getClass(), "jsType", null);
        setField(term92127, term92127.getClass(), "parent", null);
        setField(term92126, term92126.getClass(), "next", term92127);
        setDoubleField(term92128, term92128.getClass(), "number", 0.0);
        setIntField(term92128, term92128.getClass(), "type", 0);
        setField(term92128, term92128.getClass(), "next", null);
        setField(term92128, term92128.getClass(), "first", null);
        setField(term92128, term92128.getClass(), "last", null);
        setField(term92128, term92128.getClass(), "propListHead", null);
        setIntField(term92128, term92128.getClass(), "sourcePosition", 0);
        setField(term92128, term92128.getClass(), "jsType", null);
        setField(term92128, term92128.getClass(), "parent", null);
        setField(term92126, term92126.getClass(), "first", term92128);
        setField(term92126, term92126.getClass(), "last", null);
        setField(term92126, term92126.getClass(), "propListHead", null);
        setIntField(term92126, term92126.getClass(), "sourcePosition", 0);
        setField(term92126, term92126.getClass(), "jsType", null);
        setField(term92126, term92126.getClass(), "parent", null);
        setField(term92125, term92125.getClass(), "first", term92126);
        setField(term92125, term92125.getClass(), "last", null);
        setField(term92125, term92125.getClass(), "propListHead", null);
        setIntField(term92125, term92125.getClass(), "sourcePosition", 0);
        setField(term92125, term92125.getClass(), "jsType", null);
        setField(term92125, term92125.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term91282;
        callMethod(klass, "process", argTypes, term91190, args);
        assertTrue(recursiveEquals(term91190, term92124));
        assertTrue(recursiveEquals(term91282, null));
    }

};


