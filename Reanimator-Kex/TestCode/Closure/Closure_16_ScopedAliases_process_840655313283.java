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

public class ScopedAliases_process_840655313283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182757;
     Object term182849;
     Object term184106;
     Object term184107;

    public ScopedAliases_process_840655313283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182757 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term182757, term182757.getClass(), "compiler", null);
        term182849 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term182941 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term182849, term182849.getClass(), "type", -133);
        setField(term182849, term182849.getClass(), "parent", term182941);
        term184106 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term184106, term184106.getClass(), "compiler", null);
        setField(term184106, term184106.getClass(), "preprocessorSymbolTable", null);
        setField(term184106, term184106.getClass(), "transformationHandler", null);
        term184107 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term184108 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term184107, term184107.getClass(), "str", null);
        setIntField(term184107, term184107.getClass(), "type", -133);
        setField(term184107, term184107.getClass(), "next", null);
        setField(term184107, term184107.getClass(), "first", null);
        setField(term184107, term184107.getClass(), "last", null);
        setField(term184107, term184107.getClass(), "propListHead", null);
        setIntField(term184107, term184107.getClass(), "sourcePosition", 0);
        setField(term184107, term184107.getClass(), "jsType", null);
        setDoubleField(term184108, term184108.getClass(), "number", 0.0);
        setIntField(term184108, term184108.getClass(), "type", 0);
        setField(term184108, term184108.getClass(), "next", null);
        setField(term184108, term184108.getClass(), "first", null);
        setField(term184108, term184108.getClass(), "last", null);
        setField(term184108, term184108.getClass(), "propListHead", null);
        setIntField(term184108, term184108.getClass(), "sourcePosition", 0);
        setField(term184108, term184108.getClass(), "jsType", null);
        setField(term184108, term184108.getClass(), "parent", null);
        setField(term184107, term184107.getClass(), "parent", term184108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term182849;
        callMethod(klass, "process", argTypes, term182757, args);
        assertTrue(recursiveEquals(term182757, term184106));
        assertTrue(recursiveEquals(term182849, null));
    }

};


