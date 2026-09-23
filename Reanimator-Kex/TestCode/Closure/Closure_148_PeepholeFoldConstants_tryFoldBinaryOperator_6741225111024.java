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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239814;
     Object term239906;
     Object term240122;
     Object term240123;
     Object term240094;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239814 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term239906 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term239976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term239906, term239906.getClass(), "first", term239906);
        setField(term239906, term239906.getClass(), "next", term239976);
        setIntField(term239906, term239906.getClass(), "type", 45);
        term240122 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term240122, term240122.getClass(), "currentTraversal", null);
        term240123 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term240124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term240123, term240123.getClass(), "str", null);
        setIntField(term240123, term240123.getClass(), "type", 45);
        setIntField(term240124, term240124.getClass(), "type", 0);
        setField(term240124, term240124.getClass(), "next", null);
        setField(term240124, term240124.getClass(), "first", null);
        setField(term240124, term240124.getClass(), "last", null);
        setField(term240124, term240124.getClass(), "propListHead", null);
        setIntField(term240124, term240124.getClass(), "sourcePosition", 0);
        setField(term240124, term240124.getClass(), "jsType", null);
        setField(term240124, term240124.getClass(), "parent", null);
        setField(term240123, term240123.getClass(), "next", term240124);
        setField(term240123, term240123.getClass(), "first", term240123);
        setField(term240123, term240123.getClass(), "last", null);
        setField(term240123, term240123.getClass(), "propListHead", null);
        setIntField(term240123, term240123.getClass(), "sourcePosition", 0);
        setField(term240123, term240123.getClass(), "jsType", null);
        setField(term240123, term240123.getClass(), "parent", null);
        term240094 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term240096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term240094, term240094.getClass(), "str", null);
        setIntField(term240094, term240094.getClass(), "type", 45);
        setIntField(term240096, term240096.getClass(), "type", 0);
        setField(term240096, term240096.getClass(), "next", null);
        setField(term240096, term240096.getClass(), "first", null);
        setField(term240096, term240096.getClass(), "last", null);
        setField(term240096, term240096.getClass(), "propListHead", null);
        setIntField(term240096, term240096.getClass(), "sourcePosition", 0);
        setField(term240096, term240096.getClass(), "jsType", null);
        setField(term240096, term240096.getClass(), "parent", null);
        setField(term240094, term240094.getClass(), "next", term240096);
        setField(term240094, term240094.getClass(), "first", term240094);
        setField(term240094, term240094.getClass(), "last", null);
        setField(term240094, term240094.getClass(), "propListHead", null);
        setIntField(term240094, term240094.getClass(), "sourcePosition", 0);
        setField(term240094, term240094.getClass(), "jsType", null);
        setField(term240094, term240094.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term239906;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term239814, args);
        assertTrue(recursiveEquals(term239814, term240122));
        assertTrue(recursiveEquals(term239906, term240123));
        assertTrue(recursiveEquals(retValue, term240094));
    }

};


