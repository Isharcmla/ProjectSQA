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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51883;
     Object term51975;
     Object term52885;
     Object term52886;
     Object term52856;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51883 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term51975 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term52067 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term52159 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term52067, term52067.getClass(), "next", term52159);
        setIntField(term52067, term52067.getClass(), "type", 39);
        setField(term51975, term51975.getClass(), "first", term52067);
        setIntField(term51975, term51975.getClass(), "type", 20);
        term52885 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term52885, term52885.getClass(), "currentTraversal", null);
        term52886 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term52887 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term52888 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term52886, term52886.getClass(), "str", null);
        setIntField(term52886, term52886.getClass(), "type", 20);
        setField(term52886, term52886.getClass(), "next", null);
        setField(term52887, term52887.getClass(), "str", null);
        setIntField(term52887, term52887.getClass(), "type", 39);
        setField(term52888, term52888.getClass(), "str", null);
        setIntField(term52888, term52888.getClass(), "type", 0);
        setField(term52888, term52888.getClass(), "next", null);
        setField(term52888, term52888.getClass(), "first", null);
        setField(term52888, term52888.getClass(), "last", null);
        setField(term52888, term52888.getClass(), "propListHead", null);
        setIntField(term52888, term52888.getClass(), "sourcePosition", 0);
        setField(term52888, term52888.getClass(), "jsType", null);
        setField(term52888, term52888.getClass(), "parent", null);
        setField(term52887, term52887.getClass(), "next", term52888);
        setField(term52887, term52887.getClass(), "first", null);
        setField(term52887, term52887.getClass(), "last", null);
        setField(term52887, term52887.getClass(), "propListHead", null);
        setIntField(term52887, term52887.getClass(), "sourcePosition", 0);
        setField(term52887, term52887.getClass(), "jsType", null);
        setField(term52887, term52887.getClass(), "parent", null);
        setField(term52886, term52886.getClass(), "first", term52887);
        setField(term52886, term52886.getClass(), "last", null);
        setField(term52886, term52886.getClass(), "propListHead", null);
        setIntField(term52886, term52886.getClass(), "sourcePosition", 0);
        setField(term52886, term52886.getClass(), "jsType", null);
        setField(term52886, term52886.getClass(), "parent", null);
        term52856 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term52858 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term52860 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term52856, term52856.getClass(), "str", null);
        setIntField(term52856, term52856.getClass(), "type", 20);
        setField(term52856, term52856.getClass(), "next", null);
        setField(term52858, term52858.getClass(), "str", null);
        setIntField(term52858, term52858.getClass(), "type", 39);
        setField(term52860, term52860.getClass(), "str", null);
        setIntField(term52860, term52860.getClass(), "type", 0);
        setField(term52860, term52860.getClass(), "next", null);
        setField(term52860, term52860.getClass(), "first", null);
        setField(term52860, term52860.getClass(), "last", null);
        setField(term52860, term52860.getClass(), "propListHead", null);
        setIntField(term52860, term52860.getClass(), "sourcePosition", 0);
        setField(term52860, term52860.getClass(), "jsType", null);
        setField(term52860, term52860.getClass(), "parent", null);
        setField(term52858, term52858.getClass(), "next", term52860);
        setField(term52858, term52858.getClass(), "first", null);
        setField(term52858, term52858.getClass(), "last", null);
        setField(term52858, term52858.getClass(), "propListHead", null);
        setIntField(term52858, term52858.getClass(), "sourcePosition", 0);
        setField(term52858, term52858.getClass(), "jsType", null);
        setField(term52858, term52858.getClass(), "parent", null);
        setField(term52856, term52856.getClass(), "first", term52858);
        setField(term52856, term52856.getClass(), "last", null);
        setField(term52856, term52856.getClass(), "propListHead", null);
        setIntField(term52856, term52856.getClass(), "sourcePosition", 0);
        setField(term52856, term52856.getClass(), "jsType", null);
        setField(term52856, term52856.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term51975;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term51883, args);
        assertTrue(recursiveEquals(term51883, term52885));
        assertTrue(recursiveEquals(term51975, term52886));
        assertTrue(recursiveEquals(retValue, term52856));
    }

};


