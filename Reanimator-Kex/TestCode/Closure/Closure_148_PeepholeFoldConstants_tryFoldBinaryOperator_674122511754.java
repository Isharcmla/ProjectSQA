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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169890;
     Object term169982;
     Object term170209;
     Object term170210;
     Object term170175;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169890 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term169982 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170074 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170166 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term170074, term170074.getClass(), "next", term170166);
        setField(term169982, term169982.getClass(), "first", term170074);
        setIntField(term169982, term169982.getClass(), "type", 22);
        term170209 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term170209, term170209.getClass(), "currentTraversal", null);
        term170210 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170211 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170212 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term170210, term170210.getClass(), "number", 0.0);
        setIntField(term170210, term170210.getClass(), "type", 22);
        setField(term170210, term170210.getClass(), "next", null);
        setDoubleField(term170211, term170211.getClass(), "number", 0.0);
        setIntField(term170211, term170211.getClass(), "type", 0);
        setDoubleField(term170212, term170212.getClass(), "number", 0.0);
        setIntField(term170212, term170212.getClass(), "type", 0);
        setField(term170212, term170212.getClass(), "next", null);
        setField(term170212, term170212.getClass(), "first", null);
        setField(term170212, term170212.getClass(), "last", null);
        setField(term170212, term170212.getClass(), "propListHead", null);
        setIntField(term170212, term170212.getClass(), "sourcePosition", 0);
        setField(term170212, term170212.getClass(), "jsType", null);
        setField(term170212, term170212.getClass(), "parent", null);
        setField(term170211, term170211.getClass(), "next", term170212);
        setField(term170211, term170211.getClass(), "first", null);
        setField(term170211, term170211.getClass(), "last", null);
        setField(term170211, term170211.getClass(), "propListHead", null);
        setIntField(term170211, term170211.getClass(), "sourcePosition", 0);
        setField(term170211, term170211.getClass(), "jsType", null);
        setField(term170211, term170211.getClass(), "parent", null);
        setField(term170210, term170210.getClass(), "first", term170211);
        setField(term170210, term170210.getClass(), "last", null);
        setField(term170210, term170210.getClass(), "propListHead", null);
        setIntField(term170210, term170210.getClass(), "sourcePosition", 0);
        setField(term170210, term170210.getClass(), "jsType", null);
        setField(term170210, term170210.getClass(), "parent", null);
        term170175 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170178 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170181 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term170175, term170175.getClass(), "number", 0.0);
        setIntField(term170175, term170175.getClass(), "type", 22);
        setField(term170175, term170175.getClass(), "next", null);
        setDoubleField(term170178, term170178.getClass(), "number", 0.0);
        setIntField(term170178, term170178.getClass(), "type", 0);
        setDoubleField(term170181, term170181.getClass(), "number", 0.0);
        setIntField(term170181, term170181.getClass(), "type", 0);
        setField(term170181, term170181.getClass(), "next", null);
        setField(term170181, term170181.getClass(), "first", null);
        setField(term170181, term170181.getClass(), "last", null);
        setField(term170181, term170181.getClass(), "propListHead", null);
        setIntField(term170181, term170181.getClass(), "sourcePosition", 0);
        setField(term170181, term170181.getClass(), "jsType", null);
        setField(term170181, term170181.getClass(), "parent", null);
        setField(term170178, term170178.getClass(), "next", term170181);
        setField(term170178, term170178.getClass(), "first", null);
        setField(term170178, term170178.getClass(), "last", null);
        setField(term170178, term170178.getClass(), "propListHead", null);
        setIntField(term170178, term170178.getClass(), "sourcePosition", 0);
        setField(term170178, term170178.getClass(), "jsType", null);
        setField(term170178, term170178.getClass(), "parent", null);
        setField(term170175, term170175.getClass(), "first", term170178);
        setField(term170175, term170175.getClass(), "last", null);
        setField(term170175, term170175.getClass(), "propListHead", null);
        setIntField(term170175, term170175.getClass(), "sourcePosition", 0);
        setField(term170175, term170175.getClass(), "jsType", null);
        setField(term170175, term170175.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term169982;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term169890, args);
        assertTrue(recursiveEquals(term169890, term170209));
        assertTrue(recursiveEquals(term169982, term170210));
        assertTrue(recursiveEquals(retValue, term170175));
    }

};


