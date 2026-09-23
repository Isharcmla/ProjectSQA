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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260519;
     Object term260611;
     Object term260972;
     Object term260973;
     Object term260919;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260519 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term260611 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term260703 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term260795 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term260703, term260703.getClass(), "next", term260795);
        setIntField(term260703, term260703.getClass(), "type", 0);
        setField(term260611, term260611.getClass(), "first", term260703);
        setIntField(term260611, term260611.getClass(), "type", 101);
        setField(term260611, term260611.getClass(), "parent", null);
        term260972 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term260972, term260972.getClass(), "currentTraversal", null);
        term260973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term260974 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term260975 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term260973, term260973.getClass(), "str", null);
        setIntField(term260973, term260973.getClass(), "type", 101);
        setField(term260973, term260973.getClass(), "next", null);
        setField(term260974, term260974.getClass(), "str", null);
        setIntField(term260974, term260974.getClass(), "type", 0);
        setField(term260975, term260975.getClass(), "str", null);
        setIntField(term260975, term260975.getClass(), "type", 0);
        setField(term260975, term260975.getClass(), "next", null);
        setField(term260975, term260975.getClass(), "first", null);
        setField(term260975, term260975.getClass(), "last", null);
        setField(term260975, term260975.getClass(), "propListHead", null);
        setIntField(term260975, term260975.getClass(), "sourcePosition", 0);
        setField(term260975, term260975.getClass(), "jsType", null);
        setField(term260975, term260975.getClass(), "parent", null);
        setField(term260974, term260974.getClass(), "next", term260975);
        setField(term260974, term260974.getClass(), "first", null);
        setField(term260974, term260974.getClass(), "last", null);
        setField(term260974, term260974.getClass(), "propListHead", null);
        setIntField(term260974, term260974.getClass(), "sourcePosition", 0);
        setField(term260974, term260974.getClass(), "jsType", null);
        setField(term260974, term260974.getClass(), "parent", null);
        setField(term260973, term260973.getClass(), "first", term260974);
        setField(term260973, term260973.getClass(), "last", null);
        setField(term260973, term260973.getClass(), "propListHead", null);
        setIntField(term260973, term260973.getClass(), "sourcePosition", 0);
        setField(term260973, term260973.getClass(), "jsType", null);
        setField(term260973, term260973.getClass(), "parent", null);
        term260919 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term260921 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term260923 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term260919, term260919.getClass(), "str", null);
        setIntField(term260919, term260919.getClass(), "type", 101);
        setField(term260919, term260919.getClass(), "next", null);
        setField(term260921, term260921.getClass(), "str", null);
        setIntField(term260921, term260921.getClass(), "type", 0);
        setField(term260923, term260923.getClass(), "str", null);
        setIntField(term260923, term260923.getClass(), "type", 0);
        setField(term260923, term260923.getClass(), "next", null);
        setField(term260923, term260923.getClass(), "first", null);
        setField(term260923, term260923.getClass(), "last", null);
        setField(term260923, term260923.getClass(), "propListHead", null);
        setIntField(term260923, term260923.getClass(), "sourcePosition", 0);
        setField(term260923, term260923.getClass(), "jsType", null);
        setField(term260923, term260923.getClass(), "parent", null);
        setField(term260921, term260921.getClass(), "next", term260923);
        setField(term260921, term260921.getClass(), "first", null);
        setField(term260921, term260921.getClass(), "last", null);
        setField(term260921, term260921.getClass(), "propListHead", null);
        setIntField(term260921, term260921.getClass(), "sourcePosition", 0);
        setField(term260921, term260921.getClass(), "jsType", null);
        setField(term260921, term260921.getClass(), "parent", null);
        setField(term260919, term260919.getClass(), "first", term260921);
        setField(term260919, term260919.getClass(), "last", null);
        setField(term260919, term260919.getClass(), "propListHead", null);
        setIntField(term260919, term260919.getClass(), "sourcePosition", 0);
        setField(term260919, term260919.getClass(), "jsType", null);
        setField(term260919, term260919.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term260611;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term260519, args);
        assertTrue(recursiveEquals(term260519, term260972));
        assertTrue(recursiveEquals(term260611, term260973));
        assertTrue(recursiveEquals(retValue, term260919));
    }

};


