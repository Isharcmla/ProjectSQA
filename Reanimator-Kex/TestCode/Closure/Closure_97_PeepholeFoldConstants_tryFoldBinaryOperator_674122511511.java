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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136432;
     Object term136524;
     Object term137165;
     Object term137166;
     Object term137107;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136432 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term136524 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term136594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136686 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term136594, term136594.getClass(), "next", term136686);
        setIntField(term136594, term136594.getClass(), "type", 0);
        setField(term136524, term136524.getClass(), "first", term136594);
        setIntField(term136524, term136524.getClass(), "type", 101);
        setField(term136524, term136524.getClass(), "parent", null);
        term137165 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term137165, term137165.getClass(), "currentTraversal", null);
        term137166 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137168 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term137166, term137166.getClass(), "number", 0.0);
        setIntField(term137166, term137166.getClass(), "type", 101);
        setField(term137166, term137166.getClass(), "next", null);
        setIntField(term137167, term137167.getClass(), "type", 0);
        setDoubleField(term137168, term137168.getClass(), "number", 0.0);
        setIntField(term137168, term137168.getClass(), "type", 0);
        setField(term137168, term137168.getClass(), "next", null);
        setField(term137168, term137168.getClass(), "first", null);
        setField(term137168, term137168.getClass(), "last", null);
        setField(term137168, term137168.getClass(), "propListHead", null);
        setIntField(term137168, term137168.getClass(), "sourcePosition", 0);
        setField(term137168, term137168.getClass(), "jsType", null);
        setField(term137168, term137168.getClass(), "parent", null);
        setField(term137167, term137167.getClass(), "next", term137168);
        setField(term137167, term137167.getClass(), "first", null);
        setField(term137167, term137167.getClass(), "last", null);
        setField(term137167, term137167.getClass(), "propListHead", null);
        setIntField(term137167, term137167.getClass(), "sourcePosition", 0);
        setField(term137167, term137167.getClass(), "jsType", null);
        setField(term137167, term137167.getClass(), "parent", null);
        setField(term137166, term137166.getClass(), "first", term137167);
        setField(term137166, term137166.getClass(), "last", null);
        setField(term137166, term137166.getClass(), "propListHead", null);
        setIntField(term137166, term137166.getClass(), "sourcePosition", 0);
        setField(term137166, term137166.getClass(), "jsType", null);
        setField(term137166, term137166.getClass(), "parent", null);
        term137107 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137112 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term137107, term137107.getClass(), "number", 0.0);
        setIntField(term137107, term137107.getClass(), "type", 101);
        setField(term137107, term137107.getClass(), "next", null);
        setIntField(term137110, term137110.getClass(), "type", 0);
        setDoubleField(term137112, term137112.getClass(), "number", 0.0);
        setIntField(term137112, term137112.getClass(), "type", 0);
        setField(term137112, term137112.getClass(), "next", null);
        setField(term137112, term137112.getClass(), "first", null);
        setField(term137112, term137112.getClass(), "last", null);
        setField(term137112, term137112.getClass(), "propListHead", null);
        setIntField(term137112, term137112.getClass(), "sourcePosition", 0);
        setField(term137112, term137112.getClass(), "jsType", null);
        setField(term137112, term137112.getClass(), "parent", null);
        setField(term137110, term137110.getClass(), "next", term137112);
        setField(term137110, term137110.getClass(), "first", null);
        setField(term137110, term137110.getClass(), "last", null);
        setField(term137110, term137110.getClass(), "propListHead", null);
        setIntField(term137110, term137110.getClass(), "sourcePosition", 0);
        setField(term137110, term137110.getClass(), "jsType", null);
        setField(term137110, term137110.getClass(), "parent", null);
        setField(term137107, term137107.getClass(), "first", term137110);
        setField(term137107, term137107.getClass(), "last", null);
        setField(term137107, term137107.getClass(), "propListHead", null);
        setIntField(term137107, term137107.getClass(), "sourcePosition", 0);
        setField(term137107, term137107.getClass(), "jsType", null);
        setField(term137107, term137107.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term136524;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term136432, args);
        assertTrue(recursiveEquals(term136432, term137165));
        assertTrue(recursiveEquals(term136524, term137166));
        assertTrue(recursiveEquals(retValue, term137107));
    }

};


