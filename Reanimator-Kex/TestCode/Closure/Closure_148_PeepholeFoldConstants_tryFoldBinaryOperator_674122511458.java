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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93930;
     Object term94022;
     Object term95096;
     Object term95097;
     Object term95067;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93930 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term94022 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term94114 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term94206 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term94114, term94114.getClass(), "next", term94206);
        setIntField(term94114, term94114.getClass(), "type", 39);
        setField(term94022, term94022.getClass(), "first", term94114);
        setIntField(term94022, term94022.getClass(), "type", 23);
        term95096 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term95096, term95096.getClass(), "currentTraversal", null);
        term95097 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term95098 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term95099 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term95097, term95097.getClass(), "str", null);
        setIntField(term95097, term95097.getClass(), "type", 23);
        setField(term95097, term95097.getClass(), "next", null);
        setField(term95098, term95098.getClass(), "str", null);
        setIntField(term95098, term95098.getClass(), "type", 39);
        setField(term95099, term95099.getClass(), "str", null);
        setIntField(term95099, term95099.getClass(), "type", 0);
        setField(term95099, term95099.getClass(), "next", null);
        setField(term95099, term95099.getClass(), "first", null);
        setField(term95099, term95099.getClass(), "last", null);
        setField(term95099, term95099.getClass(), "propListHead", null);
        setIntField(term95099, term95099.getClass(), "sourcePosition", 0);
        setField(term95099, term95099.getClass(), "jsType", null);
        setField(term95099, term95099.getClass(), "parent", null);
        setField(term95098, term95098.getClass(), "next", term95099);
        setField(term95098, term95098.getClass(), "first", null);
        setField(term95098, term95098.getClass(), "last", null);
        setField(term95098, term95098.getClass(), "propListHead", null);
        setIntField(term95098, term95098.getClass(), "sourcePosition", 0);
        setField(term95098, term95098.getClass(), "jsType", null);
        setField(term95098, term95098.getClass(), "parent", null);
        setField(term95097, term95097.getClass(), "first", term95098);
        setField(term95097, term95097.getClass(), "last", null);
        setField(term95097, term95097.getClass(), "propListHead", null);
        setIntField(term95097, term95097.getClass(), "sourcePosition", 0);
        setField(term95097, term95097.getClass(), "jsType", null);
        setField(term95097, term95097.getClass(), "parent", null);
        term95067 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term95069 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term95071 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term95067, term95067.getClass(), "str", null);
        setIntField(term95067, term95067.getClass(), "type", 23);
        setField(term95067, term95067.getClass(), "next", null);
        setField(term95069, term95069.getClass(), "str", null);
        setIntField(term95069, term95069.getClass(), "type", 39);
        setField(term95071, term95071.getClass(), "str", null);
        setIntField(term95071, term95071.getClass(), "type", 0);
        setField(term95071, term95071.getClass(), "next", null);
        setField(term95071, term95071.getClass(), "first", null);
        setField(term95071, term95071.getClass(), "last", null);
        setField(term95071, term95071.getClass(), "propListHead", null);
        setIntField(term95071, term95071.getClass(), "sourcePosition", 0);
        setField(term95071, term95071.getClass(), "jsType", null);
        setField(term95071, term95071.getClass(), "parent", null);
        setField(term95069, term95069.getClass(), "next", term95071);
        setField(term95069, term95069.getClass(), "first", null);
        setField(term95069, term95069.getClass(), "last", null);
        setField(term95069, term95069.getClass(), "propListHead", null);
        setIntField(term95069, term95069.getClass(), "sourcePosition", 0);
        setField(term95069, term95069.getClass(), "jsType", null);
        setField(term95069, term95069.getClass(), "parent", null);
        setField(term95067, term95067.getClass(), "first", term95069);
        setField(term95067, term95067.getClass(), "last", null);
        setField(term95067, term95067.getClass(), "propListHead", null);
        setIntField(term95067, term95067.getClass(), "sourcePosition", 0);
        setField(term95067, term95067.getClass(), "jsType", null);
        setField(term95067, term95067.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term94022;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term93930, args);
        assertTrue(recursiveEquals(term93930, term95096));
        assertTrue(recursiveEquals(term94022, term95097));
        assertTrue(recursiveEquals(retValue, term95067));
    }

};


