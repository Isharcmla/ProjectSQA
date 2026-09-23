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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term789585;
     Object term789677;
     Object term789912;
     Object term789913;
     Object term789868;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term789585 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term789677 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term789769 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term789861 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term789861, term789861.getClass(), "type", 42);
        setField(term789769, term789769.getClass(), "next", term789861);
        setIntField(term789769, term789769.getClass(), "type", 42);
        setField(term789677, term789677.getClass(), "first", term789769);
        setIntField(term789677, term789677.getClass(), "type", 16);
        term789912 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term789912, term789912.getClass(), "currentTraversal", null);
        term789913 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term789914 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term789915 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term789913, term789913.getClass(), "str", null);
        setIntField(term789913, term789913.getClass(), "type", 16);
        setField(term789913, term789913.getClass(), "next", null);
        setField(term789914, term789914.getClass(), "str", null);
        setIntField(term789914, term789914.getClass(), "type", 42);
        setField(term789915, term789915.getClass(), "str", null);
        setIntField(term789915, term789915.getClass(), "type", 42);
        setField(term789915, term789915.getClass(), "next", null);
        setField(term789915, term789915.getClass(), "first", null);
        setField(term789915, term789915.getClass(), "last", null);
        setField(term789915, term789915.getClass(), "propListHead", null);
        setIntField(term789915, term789915.getClass(), "sourcePosition", 0);
        setField(term789915, term789915.getClass(), "jsType", null);
        setField(term789915, term789915.getClass(), "parent", null);
        setField(term789914, term789914.getClass(), "next", term789915);
        setField(term789914, term789914.getClass(), "first", null);
        setField(term789914, term789914.getClass(), "last", null);
        setField(term789914, term789914.getClass(), "propListHead", null);
        setIntField(term789914, term789914.getClass(), "sourcePosition", 0);
        setField(term789914, term789914.getClass(), "jsType", null);
        setField(term789914, term789914.getClass(), "parent", null);
        setField(term789913, term789913.getClass(), "first", term789914);
        setField(term789913, term789913.getClass(), "last", null);
        setField(term789913, term789913.getClass(), "propListHead", null);
        setIntField(term789913, term789913.getClass(), "sourcePosition", 0);
        setField(term789913, term789913.getClass(), "jsType", null);
        setField(term789913, term789913.getClass(), "parent", null);
        term789868 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term789870 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term789872 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term789868, term789868.getClass(), "str", null);
        setIntField(term789868, term789868.getClass(), "type", 16);
        setField(term789868, term789868.getClass(), "next", null);
        setField(term789870, term789870.getClass(), "str", null);
        setIntField(term789870, term789870.getClass(), "type", 42);
        setField(term789872, term789872.getClass(), "str", null);
        setIntField(term789872, term789872.getClass(), "type", 42);
        setField(term789872, term789872.getClass(), "next", null);
        setField(term789872, term789872.getClass(), "first", null);
        setField(term789872, term789872.getClass(), "last", null);
        setField(term789872, term789872.getClass(), "propListHead", null);
        setIntField(term789872, term789872.getClass(), "sourcePosition", 0);
        setField(term789872, term789872.getClass(), "jsType", null);
        setField(term789872, term789872.getClass(), "parent", null);
        setField(term789870, term789870.getClass(), "next", term789872);
        setField(term789870, term789870.getClass(), "first", null);
        setField(term789870, term789870.getClass(), "last", null);
        setField(term789870, term789870.getClass(), "propListHead", null);
        setIntField(term789870, term789870.getClass(), "sourcePosition", 0);
        setField(term789870, term789870.getClass(), "jsType", null);
        setField(term789870, term789870.getClass(), "parent", null);
        setField(term789868, term789868.getClass(), "first", term789870);
        setField(term789868, term789868.getClass(), "last", null);
        setField(term789868, term789868.getClass(), "propListHead", null);
        setIntField(term789868, term789868.getClass(), "sourcePosition", 0);
        setField(term789868, term789868.getClass(), "jsType", null);
        setField(term789868, term789868.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term789677;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term789585, args);
        assertTrue(recursiveEquals(term789585, term789912));
        assertTrue(recursiveEquals(term789677, term789913));
        assertTrue(recursiveEquals(retValue, term789868));
    }

};


