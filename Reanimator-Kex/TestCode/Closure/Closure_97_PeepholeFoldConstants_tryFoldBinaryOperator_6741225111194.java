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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364744;
     Object term364836;
     Object term365135;
     Object term365136;
     Object term365104;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term364744 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term364836 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term364928 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term365020 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term364928, term364928.getClass(), "next", term365020);
        setField(term364836, term364836.getClass(), "first", term364928);
        setIntField(term364836, term364836.getClass(), "type", 35);
        term365135 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term365135, term365135.getClass(), "currentTraversal", null);
        term365136 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term365137 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term365138 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term365136, term365136.getClass(), "str", null);
        setIntField(term365136, term365136.getClass(), "type", 35);
        setField(term365136, term365136.getClass(), "next", null);
        setField(term365137, term365137.getClass(), "str", null);
        setIntField(term365137, term365137.getClass(), "type", 0);
        setField(term365138, term365138.getClass(), "str", null);
        setIntField(term365138, term365138.getClass(), "type", 0);
        setField(term365138, term365138.getClass(), "next", null);
        setField(term365138, term365138.getClass(), "first", null);
        setField(term365138, term365138.getClass(), "last", null);
        setField(term365138, term365138.getClass(), "propListHead", null);
        setIntField(term365138, term365138.getClass(), "sourcePosition", 0);
        setField(term365138, term365138.getClass(), "jsType", null);
        setField(term365138, term365138.getClass(), "parent", null);
        setField(term365137, term365137.getClass(), "next", term365138);
        setField(term365137, term365137.getClass(), "first", null);
        setField(term365137, term365137.getClass(), "last", null);
        setField(term365137, term365137.getClass(), "propListHead", null);
        setIntField(term365137, term365137.getClass(), "sourcePosition", 0);
        setField(term365137, term365137.getClass(), "jsType", null);
        setField(term365137, term365137.getClass(), "parent", null);
        setField(term365136, term365136.getClass(), "first", term365137);
        setField(term365136, term365136.getClass(), "last", null);
        setField(term365136, term365136.getClass(), "propListHead", null);
        setIntField(term365136, term365136.getClass(), "sourcePosition", 0);
        setField(term365136, term365136.getClass(), "jsType", null);
        setField(term365136, term365136.getClass(), "parent", null);
        term365104 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term365106 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term365108 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term365104, term365104.getClass(), "str", null);
        setIntField(term365104, term365104.getClass(), "type", 35);
        setField(term365104, term365104.getClass(), "next", null);
        setField(term365106, term365106.getClass(), "str", null);
        setIntField(term365106, term365106.getClass(), "type", 0);
        setField(term365108, term365108.getClass(), "str", null);
        setIntField(term365108, term365108.getClass(), "type", 0);
        setField(term365108, term365108.getClass(), "next", null);
        setField(term365108, term365108.getClass(), "first", null);
        setField(term365108, term365108.getClass(), "last", null);
        setField(term365108, term365108.getClass(), "propListHead", null);
        setIntField(term365108, term365108.getClass(), "sourcePosition", 0);
        setField(term365108, term365108.getClass(), "jsType", null);
        setField(term365108, term365108.getClass(), "parent", null);
        setField(term365106, term365106.getClass(), "next", term365108);
        setField(term365106, term365106.getClass(), "first", null);
        setField(term365106, term365106.getClass(), "last", null);
        setField(term365106, term365106.getClass(), "propListHead", null);
        setIntField(term365106, term365106.getClass(), "sourcePosition", 0);
        setField(term365106, term365106.getClass(), "jsType", null);
        setField(term365106, term365106.getClass(), "parent", null);
        setField(term365104, term365104.getClass(), "first", term365106);
        setField(term365104, term365104.getClass(), "last", null);
        setField(term365104, term365104.getClass(), "propListHead", null);
        setIntField(term365104, term365104.getClass(), "sourcePosition", 0);
        setField(term365104, term365104.getClass(), "jsType", null);
        setField(term365104, term365104.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term364836;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term364744, args);
        assertTrue(recursiveEquals(term364744, term365135));
        assertTrue(recursiveEquals(term364836, term365136));
        assertTrue(recursiveEquals(retValue, term365104));
    }

};


