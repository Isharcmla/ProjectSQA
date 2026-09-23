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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237153;
     Object term237245;
     Object term237470;
     Object term237471;
     Object term237437;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237153 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term237245 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term237337 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term237429 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term237337, term237337.getClass(), "next", term237429);
        setIntField(term237337, term237337.getClass(), "type", 39);
        setField(term237245, term237245.getClass(), "first", term237337);
        setIntField(term237245, term237245.getClass(), "type", 20);
        term237470 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term237470, term237470.getClass(), "currentTraversal", null);
        term237471 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term237472 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term237473 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term237471, term237471.getClass(), "number", 0.0);
        setIntField(term237471, term237471.getClass(), "type", 20);
        setField(term237471, term237471.getClass(), "next", null);
        setDoubleField(term237472, term237472.getClass(), "number", 0.0);
        setIntField(term237472, term237472.getClass(), "type", 39);
        setField(term237473, term237473.getClass(), "str", null);
        setIntField(term237473, term237473.getClass(), "type", 0);
        setField(term237473, term237473.getClass(), "next", null);
        setField(term237473, term237473.getClass(), "first", null);
        setField(term237473, term237473.getClass(), "last", null);
        setField(term237473, term237473.getClass(), "propListHead", null);
        setIntField(term237473, term237473.getClass(), "sourcePosition", 0);
        setField(term237473, term237473.getClass(), "jsType", null);
        setField(term237473, term237473.getClass(), "parent", null);
        setField(term237472, term237472.getClass(), "next", term237473);
        setField(term237472, term237472.getClass(), "first", null);
        setField(term237472, term237472.getClass(), "last", null);
        setField(term237472, term237472.getClass(), "propListHead", null);
        setIntField(term237472, term237472.getClass(), "sourcePosition", 0);
        setField(term237472, term237472.getClass(), "jsType", null);
        setField(term237472, term237472.getClass(), "parent", null);
        setField(term237471, term237471.getClass(), "first", term237472);
        setField(term237471, term237471.getClass(), "last", null);
        setField(term237471, term237471.getClass(), "propListHead", null);
        setIntField(term237471, term237471.getClass(), "sourcePosition", 0);
        setField(term237471, term237471.getClass(), "jsType", null);
        setField(term237471, term237471.getClass(), "parent", null);
        term237437 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term237440 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term237443 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term237437, term237437.getClass(), "number", 0.0);
        setIntField(term237437, term237437.getClass(), "type", 20);
        setField(term237437, term237437.getClass(), "next", null);
        setDoubleField(term237440, term237440.getClass(), "number", 0.0);
        setIntField(term237440, term237440.getClass(), "type", 39);
        setField(term237443, term237443.getClass(), "str", null);
        setIntField(term237443, term237443.getClass(), "type", 0);
        setField(term237443, term237443.getClass(), "next", null);
        setField(term237443, term237443.getClass(), "first", null);
        setField(term237443, term237443.getClass(), "last", null);
        setField(term237443, term237443.getClass(), "propListHead", null);
        setIntField(term237443, term237443.getClass(), "sourcePosition", 0);
        setField(term237443, term237443.getClass(), "jsType", null);
        setField(term237443, term237443.getClass(), "parent", null);
        setField(term237440, term237440.getClass(), "next", term237443);
        setField(term237440, term237440.getClass(), "first", null);
        setField(term237440, term237440.getClass(), "last", null);
        setField(term237440, term237440.getClass(), "propListHead", null);
        setIntField(term237440, term237440.getClass(), "sourcePosition", 0);
        setField(term237440, term237440.getClass(), "jsType", null);
        setField(term237440, term237440.getClass(), "parent", null);
        setField(term237437, term237437.getClass(), "first", term237440);
        setField(term237437, term237437.getClass(), "last", null);
        setField(term237437, term237437.getClass(), "propListHead", null);
        setIntField(term237437, term237437.getClass(), "sourcePosition", 0);
        setField(term237437, term237437.getClass(), "jsType", null);
        setField(term237437, term237437.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term237245;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term237153, args);
        assertTrue(recursiveEquals(term237153, term237470));
        assertTrue(recursiveEquals(term237245, term237471));
        assertTrue(recursiveEquals(retValue, term237437));
    }

};


