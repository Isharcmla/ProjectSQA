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

public class PeepholeFoldConstants_tryFoldComparison_8484431791644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term657842;
     Object term657934;
     Object term658026;
     Object term658118;
     Object term658520;
     Object term658521;
     Object term658522;
     Object term658523;
     Object term658497;

    public PeepholeFoldConstants_tryFoldComparison_8484431791644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term657842 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term657934 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term657934, term657934.getClass(), "type", 14);
        term658026 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term658026, term658026.getClass(), "type", 42);
        term658118 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term658118, term658118.getClass(), "type", 42);
        term658520 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term658520, term658520.getClass(), "currentTraversal", null);
        term658521 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term658521, term658521.getClass(), "number", 0.0);
        setIntField(term658521, term658521.getClass(), "type", 42);
        setField(term658521, term658521.getClass(), "next", null);
        setField(term658521, term658521.getClass(), "first", null);
        setField(term658521, term658521.getClass(), "last", null);
        setField(term658521, term658521.getClass(), "propListHead", null);
        setIntField(term658521, term658521.getClass(), "sourcePosition", 0);
        setField(term658521, term658521.getClass(), "jsType", null);
        setField(term658521, term658521.getClass(), "parent", null);
        term658522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term658522, term658522.getClass(), "number", 0.0);
        setIntField(term658522, term658522.getClass(), "type", 14);
        setField(term658522, term658522.getClass(), "next", null);
        setField(term658522, term658522.getClass(), "first", null);
        setField(term658522, term658522.getClass(), "last", null);
        setField(term658522, term658522.getClass(), "propListHead", null);
        setIntField(term658522, term658522.getClass(), "sourcePosition", 0);
        setField(term658522, term658522.getClass(), "jsType", null);
        setField(term658522, term658522.getClass(), "parent", null);
        term658523 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term658523, term658523.getClass(), "str", null);
        setIntField(term658523, term658523.getClass(), "type", 42);
        setField(term658523, term658523.getClass(), "next", null);
        setField(term658523, term658523.getClass(), "first", null);
        setField(term658523, term658523.getClass(), "last", null);
        setField(term658523, term658523.getClass(), "propListHead", null);
        setIntField(term658523, term658523.getClass(), "sourcePosition", 0);
        setField(term658523, term658523.getClass(), "jsType", null);
        setField(term658523, term658523.getClass(), "parent", null);
        term658497 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term658497, term658497.getClass(), "number", 0.0);
        setIntField(term658497, term658497.getClass(), "type", 14);
        setField(term658497, term658497.getClass(), "next", null);
        setField(term658497, term658497.getClass(), "first", null);
        setField(term658497, term658497.getClass(), "last", null);
        setField(term658497, term658497.getClass(), "propListHead", null);
        setIntField(term658497, term658497.getClass(), "sourcePosition", 0);
        setField(term658497, term658497.getClass(), "jsType", null);
        setField(term658497, term658497.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term657934;
        args[1] = term658026;
        args[2] = term658118;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term657842, args);
        assertTrue(recursiveEquals(term657842, term658520));
        assertTrue(recursiveEquals(term657934, term658521));
        assertTrue(recursiveEquals(term658026, term658522));
        assertTrue(recursiveEquals(term658118, term658523));
        assertTrue(recursiveEquals(retValue, term658497));
    }

};


