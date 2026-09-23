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

public class ScopedAliases_process_840655313279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179625;
     Object term179695;
     Object term181235;
     Object term181236;

    public ScopedAliases_process_840655313279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179625 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term179625, term179625.getClass(), "compiler", null);
        term179695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179787 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term179879 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term179971 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term179695, term179695.getClass(), "type", 0);
        setIntField(term179787, term179787.getClass(), "type", 0);
        setField(term179787, term179787.getClass(), "parent", null);
        setField(term179695, term179695.getClass(), "parent", term179787);
        setField(term179879, term179879.getClass(), "next", null);
        setIntField(term179879, term179879.getClass(), "type", 0);
        setField(term179879, term179879.getClass(), "first", term179971);
        setField(term179695, term179695.getClass(), "first", term179879);
        term181235 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term181235, term181235.getClass(), "compiler", null);
        setField(term181235, term181235.getClass(), "preprocessorSymbolTable", null);
        setField(term181235, term181235.getClass(), "transformationHandler", null);
        term181236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181237 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term181238 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term181239 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term181236, term181236.getClass(), "type", 0);
        setField(term181236, term181236.getClass(), "next", null);
        setField(term181237, term181237.getClass(), "str", null);
        setIntField(term181237, term181237.getClass(), "type", 0);
        setField(term181237, term181237.getClass(), "next", null);
        setField(term181238, term181238.getClass(), "str", null);
        setIntField(term181238, term181238.getClass(), "type", 0);
        setField(term181238, term181238.getClass(), "next", null);
        setField(term181238, term181238.getClass(), "first", null);
        setField(term181238, term181238.getClass(), "last", null);
        setField(term181238, term181238.getClass(), "propListHead", null);
        setIntField(term181238, term181238.getClass(), "sourcePosition", 0);
        setField(term181238, term181238.getClass(), "jsType", null);
        setField(term181238, term181238.getClass(), "parent", null);
        setField(term181237, term181237.getClass(), "first", term181238);
        setField(term181237, term181237.getClass(), "last", null);
        setField(term181237, term181237.getClass(), "propListHead", null);
        setIntField(term181237, term181237.getClass(), "sourcePosition", 0);
        setField(term181237, term181237.getClass(), "jsType", null);
        setField(term181237, term181237.getClass(), "parent", null);
        setField(term181236, term181236.getClass(), "first", term181237);
        setField(term181236, term181236.getClass(), "last", null);
        setField(term181236, term181236.getClass(), "propListHead", null);
        setIntField(term181236, term181236.getClass(), "sourcePosition", 0);
        setField(term181236, term181236.getClass(), "jsType", null);
        setField(term181239, term181239.getClass(), "str", null);
        setIntField(term181239, term181239.getClass(), "type", 0);
        setField(term181239, term181239.getClass(), "next", null);
        setField(term181239, term181239.getClass(), "first", null);
        setField(term181239, term181239.getClass(), "last", null);
        setField(term181239, term181239.getClass(), "propListHead", null);
        setIntField(term181239, term181239.getClass(), "sourcePosition", 0);
        setField(term181239, term181239.getClass(), "jsType", null);
        setField(term181239, term181239.getClass(), "parent", null);
        setField(term181236, term181236.getClass(), "parent", term181239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term179695;
        callMethod(klass, "process", argTypes, term179625, args);
        assertTrue(recursiveEquals(term179625, term181235));
        assertTrue(recursiveEquals(term179695, null));
    }

};


