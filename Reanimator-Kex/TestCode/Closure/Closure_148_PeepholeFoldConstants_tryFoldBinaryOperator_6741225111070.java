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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250768;
     Object term250860;
     Object term251359;
     Object term251360;
     Object term251325;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250768 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term250860 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term250952 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term251044 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term250952, term250952.getClass(), "next", term251044);
        setField(term250860, term250860.getClass(), "first", term250952);
        setIntField(term250860, term250860.getClass(), "type", 13);
        term251359 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term251359, term251359.getClass(), "currentTraversal", null);
        term251360 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term251361 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term251362 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term251360, term251360.getClass(), "str", null);
        setIntField(term251360, term251360.getClass(), "type", 13);
        setField(term251360, term251360.getClass(), "next", null);
        setField(term251361, term251361.getClass(), "str", null);
        setIntField(term251361, term251361.getClass(), "type", 0);
        setField(term251362, term251362.getClass(), "str", null);
        setIntField(term251362, term251362.getClass(), "type", 0);
        setField(term251362, term251362.getClass(), "next", null);
        setField(term251362, term251362.getClass(), "first", null);
        setField(term251362, term251362.getClass(), "last", null);
        setField(term251362, term251362.getClass(), "propListHead", null);
        setIntField(term251362, term251362.getClass(), "sourcePosition", 0);
        setField(term251362, term251362.getClass(), "jsType", null);
        setField(term251362, term251362.getClass(), "parent", null);
        setField(term251361, term251361.getClass(), "next", term251362);
        setField(term251361, term251361.getClass(), "first", null);
        setField(term251361, term251361.getClass(), "last", null);
        setField(term251361, term251361.getClass(), "propListHead", null);
        setIntField(term251361, term251361.getClass(), "sourcePosition", 0);
        setField(term251361, term251361.getClass(), "jsType", null);
        setField(term251361, term251361.getClass(), "parent", null);
        setField(term251360, term251360.getClass(), "first", term251361);
        setField(term251360, term251360.getClass(), "last", null);
        setField(term251360, term251360.getClass(), "propListHead", null);
        setIntField(term251360, term251360.getClass(), "sourcePosition", 0);
        setField(term251360, term251360.getClass(), "jsType", null);
        setField(term251360, term251360.getClass(), "parent", null);
        term251325 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term251327 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term251329 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term251325, term251325.getClass(), "str", null);
        setIntField(term251325, term251325.getClass(), "type", 13);
        setField(term251325, term251325.getClass(), "next", null);
        setField(term251327, term251327.getClass(), "str", null);
        setIntField(term251327, term251327.getClass(), "type", 0);
        setField(term251329, term251329.getClass(), "str", null);
        setIntField(term251329, term251329.getClass(), "type", 0);
        setField(term251329, term251329.getClass(), "next", null);
        setField(term251329, term251329.getClass(), "first", null);
        setField(term251329, term251329.getClass(), "last", null);
        setField(term251329, term251329.getClass(), "propListHead", null);
        setIntField(term251329, term251329.getClass(), "sourcePosition", 0);
        setField(term251329, term251329.getClass(), "jsType", null);
        setField(term251329, term251329.getClass(), "parent", null);
        setField(term251327, term251327.getClass(), "next", term251329);
        setField(term251327, term251327.getClass(), "first", null);
        setField(term251327, term251327.getClass(), "last", null);
        setField(term251327, term251327.getClass(), "propListHead", null);
        setIntField(term251327, term251327.getClass(), "sourcePosition", 0);
        setField(term251327, term251327.getClass(), "jsType", null);
        setField(term251327, term251327.getClass(), "parent", null);
        setField(term251325, term251325.getClass(), "first", term251327);
        setField(term251325, term251325.getClass(), "last", null);
        setField(term251325, term251325.getClass(), "propListHead", null);
        setIntField(term251325, term251325.getClass(), "sourcePosition", 0);
        setField(term251325, term251325.getClass(), "jsType", null);
        setField(term251325, term251325.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term250860;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term250768, args);
        assertTrue(recursiveEquals(term250768, term251359));
        assertTrue(recursiveEquals(term250860, term251360));
        assertTrue(recursiveEquals(retValue, term251325));
    }

};


