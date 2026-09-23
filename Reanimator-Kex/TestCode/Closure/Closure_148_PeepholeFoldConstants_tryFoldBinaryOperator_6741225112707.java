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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term776021;
     Object term776113;
     Object term777054;
     Object term777055;
     Object term776964;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term776021 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term776113 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term776205 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term776297 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term776389 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term776297, term776297.getClass(), "type", 64);
        setField(term776205, term776205.getClass(), "next", term776297);
        setIntField(term776205, term776205.getClass(), "type", 0);
        setField(term776113, term776113.getClass(), "first", term776205);
        setIntField(term776113, term776113.getClass(), "type", 100);
        setIntField(term776389, term776389.getClass(), "type", 113);
        setField(term776113, term776113.getClass(), "parent", term776389);
        term777054 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term777054, term777054.getClass(), "currentTraversal", null);
        term777055 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term777056 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term777057 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term777058 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term777055, term777055.getClass(), "str", null);
        setIntField(term777055, term777055.getClass(), "type", 100);
        setField(term777055, term777055.getClass(), "next", null);
        setField(term777056, term777056.getClass(), "str", null);
        setIntField(term777056, term777056.getClass(), "type", 0);
        setField(term777057, term777057.getClass(), "str", null);
        setIntField(term777057, term777057.getClass(), "type", 64);
        setField(term777057, term777057.getClass(), "next", null);
        setField(term777057, term777057.getClass(), "first", null);
        setField(term777057, term777057.getClass(), "last", null);
        setField(term777057, term777057.getClass(), "propListHead", null);
        setIntField(term777057, term777057.getClass(), "sourcePosition", 0);
        setField(term777057, term777057.getClass(), "jsType", null);
        setField(term777057, term777057.getClass(), "parent", null);
        setField(term777056, term777056.getClass(), "next", term777057);
        setField(term777056, term777056.getClass(), "first", null);
        setField(term777056, term777056.getClass(), "last", null);
        setField(term777056, term777056.getClass(), "propListHead", null);
        setIntField(term777056, term777056.getClass(), "sourcePosition", 0);
        setField(term777056, term777056.getClass(), "jsType", null);
        setField(term777056, term777056.getClass(), "parent", null);
        setField(term777055, term777055.getClass(), "first", term777056);
        setField(term777055, term777055.getClass(), "last", null);
        setField(term777055, term777055.getClass(), "propListHead", null);
        setIntField(term777055, term777055.getClass(), "sourcePosition", 0);
        setField(term777055, term777055.getClass(), "jsType", null);
        setField(term777058, term777058.getClass(), "str", null);
        setIntField(term777058, term777058.getClass(), "type", 113);
        setField(term777058, term777058.getClass(), "next", null);
        setField(term777058, term777058.getClass(), "first", null);
        setField(term777058, term777058.getClass(), "last", null);
        setField(term777058, term777058.getClass(), "propListHead", null);
        setIntField(term777058, term777058.getClass(), "sourcePosition", 0);
        setField(term777058, term777058.getClass(), "jsType", null);
        setField(term777058, term777058.getClass(), "parent", null);
        setField(term777055, term777055.getClass(), "parent", term777058);
        term776964 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term776966 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term776968 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term776973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term776964, term776964.getClass(), "str", null);
        setIntField(term776964, term776964.getClass(), "type", 100);
        setField(term776964, term776964.getClass(), "next", null);
        setField(term776966, term776966.getClass(), "str", null);
        setIntField(term776966, term776966.getClass(), "type", 0);
        setField(term776968, term776968.getClass(), "str", null);
        setIntField(term776968, term776968.getClass(), "type", 64);
        setField(term776968, term776968.getClass(), "next", null);
        setField(term776968, term776968.getClass(), "first", null);
        setField(term776968, term776968.getClass(), "last", null);
        setField(term776968, term776968.getClass(), "propListHead", null);
        setIntField(term776968, term776968.getClass(), "sourcePosition", 0);
        setField(term776968, term776968.getClass(), "jsType", null);
        setField(term776968, term776968.getClass(), "parent", null);
        setField(term776966, term776966.getClass(), "next", term776968);
        setField(term776966, term776966.getClass(), "first", null);
        setField(term776966, term776966.getClass(), "last", null);
        setField(term776966, term776966.getClass(), "propListHead", null);
        setIntField(term776966, term776966.getClass(), "sourcePosition", 0);
        setField(term776966, term776966.getClass(), "jsType", null);
        setField(term776966, term776966.getClass(), "parent", null);
        setField(term776964, term776964.getClass(), "first", term776966);
        setField(term776964, term776964.getClass(), "last", null);
        setField(term776964, term776964.getClass(), "propListHead", null);
        setIntField(term776964, term776964.getClass(), "sourcePosition", 0);
        setField(term776964, term776964.getClass(), "jsType", null);
        setField(term776973, term776973.getClass(), "str", null);
        setIntField(term776973, term776973.getClass(), "type", 113);
        setField(term776973, term776973.getClass(), "next", null);
        setField(term776973, term776973.getClass(), "first", null);
        setField(term776973, term776973.getClass(), "last", null);
        setField(term776973, term776973.getClass(), "propListHead", null);
        setIntField(term776973, term776973.getClass(), "sourcePosition", 0);
        setField(term776973, term776973.getClass(), "jsType", null);
        setField(term776973, term776973.getClass(), "parent", null);
        setField(term776964, term776964.getClass(), "parent", term776973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term776113;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term776021, args);
        assertTrue(recursiveEquals(term776021, term777054));
        assertTrue(recursiveEquals(term776113, term777055));
        assertTrue(recursiveEquals(retValue, term776964));
    }

};


