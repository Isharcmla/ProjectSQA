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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91391;
     Object term91483;
     Object term92209;
     Object term92210;
     Object term92165;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91391 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term91483 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term91575 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term91667 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term91575, term91575.getClass(), "next", term91667);
        setField(term91483, term91483.getClass(), "first", term91575);
        setIntField(term91483, term91483.getClass(), "type", 14);
        term92209 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term92209, term92209.getClass(), "currentTraversal", null);
        term92210 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92211 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92212 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term92210, term92210.getClass(), "str", null);
        setIntField(term92210, term92210.getClass(), "type", 14);
        setField(term92210, term92210.getClass(), "next", null);
        setField(term92211, term92211.getClass(), "str", null);
        setIntField(term92211, term92211.getClass(), "type", 0);
        setField(term92212, term92212.getClass(), "str", null);
        setIntField(term92212, term92212.getClass(), "type", 0);
        setField(term92212, term92212.getClass(), "next", null);
        setField(term92212, term92212.getClass(), "first", null);
        setField(term92212, term92212.getClass(), "last", null);
        setField(term92212, term92212.getClass(), "propListHead", null);
        setIntField(term92212, term92212.getClass(), "sourcePosition", 0);
        setField(term92212, term92212.getClass(), "jsType", null);
        setField(term92212, term92212.getClass(), "parent", null);
        setField(term92211, term92211.getClass(), "next", term92212);
        setField(term92211, term92211.getClass(), "first", null);
        setField(term92211, term92211.getClass(), "last", null);
        setField(term92211, term92211.getClass(), "propListHead", null);
        setIntField(term92211, term92211.getClass(), "sourcePosition", 0);
        setField(term92211, term92211.getClass(), "jsType", null);
        setField(term92211, term92211.getClass(), "parent", null);
        setField(term92210, term92210.getClass(), "first", term92211);
        setField(term92210, term92210.getClass(), "last", null);
        setField(term92210, term92210.getClass(), "propListHead", null);
        setIntField(term92210, term92210.getClass(), "sourcePosition", 0);
        setField(term92210, term92210.getClass(), "jsType", null);
        setField(term92210, term92210.getClass(), "parent", null);
        term92165 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92167 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92169 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term92165, term92165.getClass(), "str", null);
        setIntField(term92165, term92165.getClass(), "type", 14);
        setField(term92165, term92165.getClass(), "next", null);
        setField(term92167, term92167.getClass(), "str", null);
        setIntField(term92167, term92167.getClass(), "type", 0);
        setField(term92169, term92169.getClass(), "str", null);
        setIntField(term92169, term92169.getClass(), "type", 0);
        setField(term92169, term92169.getClass(), "next", null);
        setField(term92169, term92169.getClass(), "first", null);
        setField(term92169, term92169.getClass(), "last", null);
        setField(term92169, term92169.getClass(), "propListHead", null);
        setIntField(term92169, term92169.getClass(), "sourcePosition", 0);
        setField(term92169, term92169.getClass(), "jsType", null);
        setField(term92169, term92169.getClass(), "parent", null);
        setField(term92167, term92167.getClass(), "next", term92169);
        setField(term92167, term92167.getClass(), "first", null);
        setField(term92167, term92167.getClass(), "last", null);
        setField(term92167, term92167.getClass(), "propListHead", null);
        setIntField(term92167, term92167.getClass(), "sourcePosition", 0);
        setField(term92167, term92167.getClass(), "jsType", null);
        setField(term92167, term92167.getClass(), "parent", null);
        setField(term92165, term92165.getClass(), "first", term92167);
        setField(term92165, term92165.getClass(), "last", null);
        setField(term92165, term92165.getClass(), "propListHead", null);
        setIntField(term92165, term92165.getClass(), "sourcePosition", 0);
        setField(term92165, term92165.getClass(), "jsType", null);
        setField(term92165, term92165.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term91483;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term91391, args);
        assertTrue(recursiveEquals(term91391, term92209));
        assertTrue(recursiveEquals(term91483, term92210));
        assertTrue(recursiveEquals(retValue, term92165));
    }

};


