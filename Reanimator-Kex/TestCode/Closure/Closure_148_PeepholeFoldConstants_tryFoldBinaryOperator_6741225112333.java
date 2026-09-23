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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term645678;
     Object term645770;
     Object term646491;
     Object term646492;
     Object term646423;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term645678 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term645770 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term645840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term645932 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term646024 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term645932, term645932.getClass(), "type", 64);
        setField(term645840, term645840.getClass(), "next", term645932);
        setIntField(term645840, term645840.getClass(), "type", 0);
        setField(term645770, term645770.getClass(), "first", term645840);
        setIntField(term645770, term645770.getClass(), "type", 101);
        setField(term645770, term645770.getClass(), "parent", term646024);
        term646491 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term646491, term646491.getClass(), "currentTraversal", null);
        term646492 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term646493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term646494 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term646495 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term646492, term646492.getClass(), "str", null);
        setIntField(term646492, term646492.getClass(), "type", 101);
        setField(term646492, term646492.getClass(), "next", null);
        setIntField(term646493, term646493.getClass(), "type", 0);
        setField(term646494, term646494.getClass(), "str", null);
        setIntField(term646494, term646494.getClass(), "type", 64);
        setField(term646494, term646494.getClass(), "next", null);
        setField(term646494, term646494.getClass(), "first", null);
        setField(term646494, term646494.getClass(), "last", null);
        setField(term646494, term646494.getClass(), "propListHead", null);
        setIntField(term646494, term646494.getClass(), "sourcePosition", 0);
        setField(term646494, term646494.getClass(), "jsType", null);
        setField(term646494, term646494.getClass(), "parent", null);
        setField(term646493, term646493.getClass(), "next", term646494);
        setField(term646493, term646493.getClass(), "first", null);
        setField(term646493, term646493.getClass(), "last", null);
        setField(term646493, term646493.getClass(), "propListHead", null);
        setIntField(term646493, term646493.getClass(), "sourcePosition", 0);
        setField(term646493, term646493.getClass(), "jsType", null);
        setField(term646493, term646493.getClass(), "parent", null);
        setField(term646492, term646492.getClass(), "first", term646493);
        setField(term646492, term646492.getClass(), "last", null);
        setField(term646492, term646492.getClass(), "propListHead", null);
        setIntField(term646492, term646492.getClass(), "sourcePosition", 0);
        setField(term646492, term646492.getClass(), "jsType", null);
        setField(term646495, term646495.getClass(), "str", null);
        setIntField(term646495, term646495.getClass(), "type", 0);
        setField(term646495, term646495.getClass(), "next", null);
        setField(term646495, term646495.getClass(), "first", null);
        setField(term646495, term646495.getClass(), "last", null);
        setField(term646495, term646495.getClass(), "propListHead", null);
        setIntField(term646495, term646495.getClass(), "sourcePosition", 0);
        setField(term646495, term646495.getClass(), "jsType", null);
        setField(term646495, term646495.getClass(), "parent", null);
        setField(term646492, term646492.getClass(), "parent", term646495);
        term646423 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term646425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term646427 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term646432 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term646423, term646423.getClass(), "str", null);
        setIntField(term646423, term646423.getClass(), "type", 101);
        setField(term646423, term646423.getClass(), "next", null);
        setIntField(term646425, term646425.getClass(), "type", 0);
        setField(term646427, term646427.getClass(), "str", null);
        setIntField(term646427, term646427.getClass(), "type", 64);
        setField(term646427, term646427.getClass(), "next", null);
        setField(term646427, term646427.getClass(), "first", null);
        setField(term646427, term646427.getClass(), "last", null);
        setField(term646427, term646427.getClass(), "propListHead", null);
        setIntField(term646427, term646427.getClass(), "sourcePosition", 0);
        setField(term646427, term646427.getClass(), "jsType", null);
        setField(term646427, term646427.getClass(), "parent", null);
        setField(term646425, term646425.getClass(), "next", term646427);
        setField(term646425, term646425.getClass(), "first", null);
        setField(term646425, term646425.getClass(), "last", null);
        setField(term646425, term646425.getClass(), "propListHead", null);
        setIntField(term646425, term646425.getClass(), "sourcePosition", 0);
        setField(term646425, term646425.getClass(), "jsType", null);
        setField(term646425, term646425.getClass(), "parent", null);
        setField(term646423, term646423.getClass(), "first", term646425);
        setField(term646423, term646423.getClass(), "last", null);
        setField(term646423, term646423.getClass(), "propListHead", null);
        setIntField(term646423, term646423.getClass(), "sourcePosition", 0);
        setField(term646423, term646423.getClass(), "jsType", null);
        setField(term646432, term646432.getClass(), "str", null);
        setIntField(term646432, term646432.getClass(), "type", 0);
        setField(term646432, term646432.getClass(), "next", null);
        setField(term646432, term646432.getClass(), "first", null);
        setField(term646432, term646432.getClass(), "last", null);
        setField(term646432, term646432.getClass(), "propListHead", null);
        setIntField(term646432, term646432.getClass(), "sourcePosition", 0);
        setField(term646432, term646432.getClass(), "jsType", null);
        setField(term646432, term646432.getClass(), "parent", null);
        setField(term646423, term646423.getClass(), "parent", term646432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term645770;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term645678, args);
        assertTrue(recursiveEquals(term645678, term646491));
        assertTrue(recursiveEquals(term645770, term646492));
        assertTrue(recursiveEquals(retValue, term646423));
    }

};


