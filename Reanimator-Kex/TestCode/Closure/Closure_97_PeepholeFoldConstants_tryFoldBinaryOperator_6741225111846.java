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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term712553;
     Object term712645;
     Object term712953;
     Object term712954;
     Object term712911;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term712553 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term712645 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term712737 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term712829 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term712737, term712737.getClass(), "next", term712829);
        setField(term712645, term712645.getClass(), "first", term712737);
        setIntField(term712645, term712645.getClass(), "type", 16);
        term712953 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term712953, term712953.getClass(), "currentTraversal", null);
        term712954 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term712955 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term712956 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term712954, term712954.getClass(), "str", null);
        setIntField(term712954, term712954.getClass(), "type", 16);
        setField(term712954, term712954.getClass(), "next", null);
        setField(term712955, term712955.getClass(), "str", null);
        setIntField(term712955, term712955.getClass(), "type", 0);
        setField(term712956, term712956.getClass(), "str", null);
        setIntField(term712956, term712956.getClass(), "type", 0);
        setField(term712956, term712956.getClass(), "next", null);
        setField(term712956, term712956.getClass(), "first", null);
        setField(term712956, term712956.getClass(), "last", null);
        setField(term712956, term712956.getClass(), "propListHead", null);
        setIntField(term712956, term712956.getClass(), "sourcePosition", 0);
        setField(term712956, term712956.getClass(), "jsType", null);
        setField(term712956, term712956.getClass(), "parent", null);
        setField(term712955, term712955.getClass(), "next", term712956);
        setField(term712955, term712955.getClass(), "first", null);
        setField(term712955, term712955.getClass(), "last", null);
        setField(term712955, term712955.getClass(), "propListHead", null);
        setIntField(term712955, term712955.getClass(), "sourcePosition", 0);
        setField(term712955, term712955.getClass(), "jsType", null);
        setField(term712955, term712955.getClass(), "parent", null);
        setField(term712954, term712954.getClass(), "first", term712955);
        setField(term712954, term712954.getClass(), "last", null);
        setField(term712954, term712954.getClass(), "propListHead", null);
        setIntField(term712954, term712954.getClass(), "sourcePosition", 0);
        setField(term712954, term712954.getClass(), "jsType", null);
        setField(term712954, term712954.getClass(), "parent", null);
        term712911 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term712913 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term712915 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term712911, term712911.getClass(), "str", null);
        setIntField(term712911, term712911.getClass(), "type", 16);
        setField(term712911, term712911.getClass(), "next", null);
        setField(term712913, term712913.getClass(), "str", null);
        setIntField(term712913, term712913.getClass(), "type", 0);
        setField(term712915, term712915.getClass(), "str", null);
        setIntField(term712915, term712915.getClass(), "type", 0);
        setField(term712915, term712915.getClass(), "next", null);
        setField(term712915, term712915.getClass(), "first", null);
        setField(term712915, term712915.getClass(), "last", null);
        setField(term712915, term712915.getClass(), "propListHead", null);
        setIntField(term712915, term712915.getClass(), "sourcePosition", 0);
        setField(term712915, term712915.getClass(), "jsType", null);
        setField(term712915, term712915.getClass(), "parent", null);
        setField(term712913, term712913.getClass(), "next", term712915);
        setField(term712913, term712913.getClass(), "first", null);
        setField(term712913, term712913.getClass(), "last", null);
        setField(term712913, term712913.getClass(), "propListHead", null);
        setIntField(term712913, term712913.getClass(), "sourcePosition", 0);
        setField(term712913, term712913.getClass(), "jsType", null);
        setField(term712913, term712913.getClass(), "parent", null);
        setField(term712911, term712911.getClass(), "first", term712913);
        setField(term712911, term712911.getClass(), "last", null);
        setField(term712911, term712911.getClass(), "propListHead", null);
        setIntField(term712911, term712911.getClass(), "sourcePosition", 0);
        setField(term712911, term712911.getClass(), "jsType", null);
        setField(term712911, term712911.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term712645;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term712553, args);
        assertTrue(recursiveEquals(term712553, term712953));
        assertTrue(recursiveEquals(term712645, term712954));
        assertTrue(recursiveEquals(retValue, term712911));
    }

};


