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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174916;
     Object term175008;
     Object term175319;
     Object term175320;
     Object term175278;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174916 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term175008 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term175100 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term175192 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term175100, term175100.getClass(), "next", term175192);
        setField(term175008, term175008.getClass(), "first", term175100);
        setIntField(term175008, term175008.getClass(), "type", 12);
        term175319 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term175319, term175319.getClass(), "currentTraversal", null);
        term175320 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term175321 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term175322 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term175320, term175320.getClass(), "number", 0.0);
        setIntField(term175320, term175320.getClass(), "type", 12);
        setField(term175320, term175320.getClass(), "next", null);
        setDoubleField(term175321, term175321.getClass(), "number", 0.0);
        setIntField(term175321, term175321.getClass(), "type", 0);
        setDoubleField(term175322, term175322.getClass(), "number", 0.0);
        setIntField(term175322, term175322.getClass(), "type", 0);
        setField(term175322, term175322.getClass(), "next", null);
        setField(term175322, term175322.getClass(), "first", null);
        setField(term175322, term175322.getClass(), "last", null);
        setField(term175322, term175322.getClass(), "propListHead", null);
        setIntField(term175322, term175322.getClass(), "sourcePosition", 0);
        setField(term175322, term175322.getClass(), "jsType", null);
        setField(term175322, term175322.getClass(), "parent", null);
        setField(term175321, term175321.getClass(), "next", term175322);
        setField(term175321, term175321.getClass(), "first", null);
        setField(term175321, term175321.getClass(), "last", null);
        setField(term175321, term175321.getClass(), "propListHead", null);
        setIntField(term175321, term175321.getClass(), "sourcePosition", 0);
        setField(term175321, term175321.getClass(), "jsType", null);
        setField(term175321, term175321.getClass(), "parent", null);
        setField(term175320, term175320.getClass(), "first", term175321);
        setField(term175320, term175320.getClass(), "last", null);
        setField(term175320, term175320.getClass(), "propListHead", null);
        setIntField(term175320, term175320.getClass(), "sourcePosition", 0);
        setField(term175320, term175320.getClass(), "jsType", null);
        setField(term175320, term175320.getClass(), "parent", null);
        term175278 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term175281 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term175284 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term175278, term175278.getClass(), "number", 0.0);
        setIntField(term175278, term175278.getClass(), "type", 12);
        setField(term175278, term175278.getClass(), "next", null);
        setDoubleField(term175281, term175281.getClass(), "number", 0.0);
        setIntField(term175281, term175281.getClass(), "type", 0);
        setDoubleField(term175284, term175284.getClass(), "number", 0.0);
        setIntField(term175284, term175284.getClass(), "type", 0);
        setField(term175284, term175284.getClass(), "next", null);
        setField(term175284, term175284.getClass(), "first", null);
        setField(term175284, term175284.getClass(), "last", null);
        setField(term175284, term175284.getClass(), "propListHead", null);
        setIntField(term175284, term175284.getClass(), "sourcePosition", 0);
        setField(term175284, term175284.getClass(), "jsType", null);
        setField(term175284, term175284.getClass(), "parent", null);
        setField(term175281, term175281.getClass(), "next", term175284);
        setField(term175281, term175281.getClass(), "first", null);
        setField(term175281, term175281.getClass(), "last", null);
        setField(term175281, term175281.getClass(), "propListHead", null);
        setIntField(term175281, term175281.getClass(), "sourcePosition", 0);
        setField(term175281, term175281.getClass(), "jsType", null);
        setField(term175281, term175281.getClass(), "parent", null);
        setField(term175278, term175278.getClass(), "first", term175281);
        setField(term175278, term175278.getClass(), "last", null);
        setField(term175278, term175278.getClass(), "propListHead", null);
        setIntField(term175278, term175278.getClass(), "sourcePosition", 0);
        setField(term175278, term175278.getClass(), "jsType", null);
        setField(term175278, term175278.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term175008;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term174916, args);
        assertTrue(recursiveEquals(term174916, term175319));
        assertTrue(recursiveEquals(term175008, term175320));
        assertTrue(recursiveEquals(retValue, term175278));
    }

};


