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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302099;
     Object term302191;
     Object term302424;
     Object term302425;
     Object term302384;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term302099 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term302191 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term302283 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term302375 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term302283, term302283.getClass(), "next", term302375);
        setIntField(term302283, term302283.getClass(), "type", 39);
        setField(term302191, term302191.getClass(), "first", term302283);
        setIntField(term302191, term302191.getClass(), "type", 11);
        term302424 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term302424, term302424.getClass(), "currentTraversal", null);
        term302425 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term302426 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term302427 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term302425, term302425.getClass(), "number", 0.0);
        setIntField(term302425, term302425.getClass(), "type", 11);
        setField(term302425, term302425.getClass(), "next", null);
        setDoubleField(term302426, term302426.getClass(), "number", 0.0);
        setIntField(term302426, term302426.getClass(), "type", 39);
        setDoubleField(term302427, term302427.getClass(), "number", 0.0);
        setIntField(term302427, term302427.getClass(), "type", 0);
        setField(term302427, term302427.getClass(), "next", null);
        setField(term302427, term302427.getClass(), "first", null);
        setField(term302427, term302427.getClass(), "last", null);
        setField(term302427, term302427.getClass(), "propListHead", null);
        setIntField(term302427, term302427.getClass(), "sourcePosition", 0);
        setField(term302427, term302427.getClass(), "jsType", null);
        setField(term302427, term302427.getClass(), "parent", null);
        setField(term302426, term302426.getClass(), "next", term302427);
        setField(term302426, term302426.getClass(), "first", null);
        setField(term302426, term302426.getClass(), "last", null);
        setField(term302426, term302426.getClass(), "propListHead", null);
        setIntField(term302426, term302426.getClass(), "sourcePosition", 0);
        setField(term302426, term302426.getClass(), "jsType", null);
        setField(term302426, term302426.getClass(), "parent", null);
        setField(term302425, term302425.getClass(), "first", term302426);
        setField(term302425, term302425.getClass(), "last", null);
        setField(term302425, term302425.getClass(), "propListHead", null);
        setIntField(term302425, term302425.getClass(), "sourcePosition", 0);
        setField(term302425, term302425.getClass(), "jsType", null);
        setField(term302425, term302425.getClass(), "parent", null);
        term302384 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term302387 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term302390 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term302384, term302384.getClass(), "number", 0.0);
        setIntField(term302384, term302384.getClass(), "type", 11);
        setField(term302384, term302384.getClass(), "next", null);
        setDoubleField(term302387, term302387.getClass(), "number", 0.0);
        setIntField(term302387, term302387.getClass(), "type", 39);
        setDoubleField(term302390, term302390.getClass(), "number", 0.0);
        setIntField(term302390, term302390.getClass(), "type", 0);
        setField(term302390, term302390.getClass(), "next", null);
        setField(term302390, term302390.getClass(), "first", null);
        setField(term302390, term302390.getClass(), "last", null);
        setField(term302390, term302390.getClass(), "propListHead", null);
        setIntField(term302390, term302390.getClass(), "sourcePosition", 0);
        setField(term302390, term302390.getClass(), "jsType", null);
        setField(term302390, term302390.getClass(), "parent", null);
        setField(term302387, term302387.getClass(), "next", term302390);
        setField(term302387, term302387.getClass(), "first", null);
        setField(term302387, term302387.getClass(), "last", null);
        setField(term302387, term302387.getClass(), "propListHead", null);
        setIntField(term302387, term302387.getClass(), "sourcePosition", 0);
        setField(term302387, term302387.getClass(), "jsType", null);
        setField(term302387, term302387.getClass(), "parent", null);
        setField(term302384, term302384.getClass(), "first", term302387);
        setField(term302384, term302384.getClass(), "last", null);
        setField(term302384, term302384.getClass(), "propListHead", null);
        setIntField(term302384, term302384.getClass(), "sourcePosition", 0);
        setField(term302384, term302384.getClass(), "jsType", null);
        setField(term302384, term302384.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term302191;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term302099, args);
        assertTrue(recursiveEquals(term302099, term302424));
        assertTrue(recursiveEquals(term302191, term302425));
        assertTrue(recursiveEquals(retValue, term302384));
    }

};


