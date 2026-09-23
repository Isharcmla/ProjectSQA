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

public class ScopedAliases_process_840655313110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64323;
     Object term64415;
     Object term65769;
     Object term65770;

    public ScopedAliases_process_840655313110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64323 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term64323, term64323.getClass(), "compiler", null);
        term64415 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term64507 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term64599 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term64415, term64415.getClass(), "type", 0);
        setField(term64415, term64415.getClass(), "parent", null);
        setField(term64599, term64599.getClass(), "next", null);
        setIntField(term64599, term64599.getClass(), "type", 0);
        setField(term64599, term64599.getClass(), "first", null);
        setField(term64507, term64507.getClass(), "next", term64599);
        setIntField(term64507, term64507.getClass(), "type", 0);
        setField(term64507, term64507.getClass(), "first", term64599);
        setField(term64415, term64415.getClass(), "first", term64507);
        term65769 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term65769, term65769.getClass(), "compiler", null);
        setField(term65769, term65769.getClass(), "preprocessorSymbolTable", null);
        setField(term65769, term65769.getClass(), "transformationHandler", null);
        term65770 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65771 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65772 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term65770, term65770.getClass(), "number", 0.0);
        setIntField(term65770, term65770.getClass(), "type", 0);
        setField(term65770, term65770.getClass(), "next", null);
        setDoubleField(term65771, term65771.getClass(), "number", 0.0);
        setIntField(term65771, term65771.getClass(), "type", 0);
        setDoubleField(term65772, term65772.getClass(), "number", 0.0);
        setIntField(term65772, term65772.getClass(), "type", 0);
        setField(term65772, term65772.getClass(), "next", null);
        setField(term65772, term65772.getClass(), "first", null);
        setField(term65772, term65772.getClass(), "last", null);
        setField(term65772, term65772.getClass(), "propListHead", null);
        setIntField(term65772, term65772.getClass(), "sourcePosition", 0);
        setField(term65772, term65772.getClass(), "jsType", null);
        setField(term65772, term65772.getClass(), "parent", null);
        setField(term65771, term65771.getClass(), "next", term65772);
        setField(term65771, term65771.getClass(), "first", term65772);
        setField(term65771, term65771.getClass(), "last", null);
        setField(term65771, term65771.getClass(), "propListHead", null);
        setIntField(term65771, term65771.getClass(), "sourcePosition", 0);
        setField(term65771, term65771.getClass(), "jsType", null);
        setField(term65771, term65771.getClass(), "parent", null);
        setField(term65770, term65770.getClass(), "first", term65771);
        setField(term65770, term65770.getClass(), "last", null);
        setField(term65770, term65770.getClass(), "propListHead", null);
        setIntField(term65770, term65770.getClass(), "sourcePosition", 0);
        setField(term65770, term65770.getClass(), "jsType", null);
        setField(term65770, term65770.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term64415;
        callMethod(klass, "process", argTypes, term64323, args);
        assertTrue(recursiveEquals(term64323, term65769));
        assertTrue(recursiveEquals(term64415, null));
    }

};


