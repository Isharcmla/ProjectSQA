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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448817;
     Object term448909;
     Object term449930;
     Object term449931;
     Object term449880;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term448817 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term448909 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term449001 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term449093 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term449093, term449093.getClass(), "type", 16);
        setField(term449001, term449001.getClass(), "next", term449093);
        setIntField(term449001, term449001.getClass(), "type", 42);
        setField(term448909, term448909.getClass(), "first", term449001);
        setIntField(term448909, term448909.getClass(), "type", 16);
        term449930 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term449930, term449930.getClass(), "currentTraversal", null);
        term449931 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term449932 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term449933 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term449931, term449931.getClass(), "str", null);
        setIntField(term449931, term449931.getClass(), "type", 16);
        setField(term449931, term449931.getClass(), "next", null);
        setField(term449932, term449932.getClass(), "str", null);
        setIntField(term449932, term449932.getClass(), "type", 42);
        setDoubleField(term449933, term449933.getClass(), "number", 0.0);
        setIntField(term449933, term449933.getClass(), "type", 16);
        setField(term449933, term449933.getClass(), "next", null);
        setField(term449933, term449933.getClass(), "first", null);
        setField(term449933, term449933.getClass(), "last", null);
        setField(term449933, term449933.getClass(), "propListHead", null);
        setIntField(term449933, term449933.getClass(), "sourcePosition", 0);
        setField(term449933, term449933.getClass(), "jsType", null);
        setField(term449933, term449933.getClass(), "parent", null);
        setField(term449932, term449932.getClass(), "next", term449933);
        setField(term449932, term449932.getClass(), "first", null);
        setField(term449932, term449932.getClass(), "last", null);
        setField(term449932, term449932.getClass(), "propListHead", null);
        setIntField(term449932, term449932.getClass(), "sourcePosition", 0);
        setField(term449932, term449932.getClass(), "jsType", null);
        setField(term449932, term449932.getClass(), "parent", null);
        setField(term449931, term449931.getClass(), "first", term449932);
        setField(term449931, term449931.getClass(), "last", null);
        setField(term449931, term449931.getClass(), "propListHead", null);
        setIntField(term449931, term449931.getClass(), "sourcePosition", 0);
        setField(term449931, term449931.getClass(), "jsType", null);
        setField(term449931, term449931.getClass(), "parent", null);
        term449880 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term449882 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term449884 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term449880, term449880.getClass(), "str", null);
        setIntField(term449880, term449880.getClass(), "type", 16);
        setField(term449880, term449880.getClass(), "next", null);
        setField(term449882, term449882.getClass(), "str", null);
        setIntField(term449882, term449882.getClass(), "type", 42);
        setDoubleField(term449884, term449884.getClass(), "number", 0.0);
        setIntField(term449884, term449884.getClass(), "type", 16);
        setField(term449884, term449884.getClass(), "next", null);
        setField(term449884, term449884.getClass(), "first", null);
        setField(term449884, term449884.getClass(), "last", null);
        setField(term449884, term449884.getClass(), "propListHead", null);
        setIntField(term449884, term449884.getClass(), "sourcePosition", 0);
        setField(term449884, term449884.getClass(), "jsType", null);
        setField(term449884, term449884.getClass(), "parent", null);
        setField(term449882, term449882.getClass(), "next", term449884);
        setField(term449882, term449882.getClass(), "first", null);
        setField(term449882, term449882.getClass(), "last", null);
        setField(term449882, term449882.getClass(), "propListHead", null);
        setIntField(term449882, term449882.getClass(), "sourcePosition", 0);
        setField(term449882, term449882.getClass(), "jsType", null);
        setField(term449882, term449882.getClass(), "parent", null);
        setField(term449880, term449880.getClass(), "first", term449882);
        setField(term449880, term449880.getClass(), "last", null);
        setField(term449880, term449880.getClass(), "propListHead", null);
        setIntField(term449880, term449880.getClass(), "sourcePosition", 0);
        setField(term449880, term449880.getClass(), "jsType", null);
        setField(term449880, term449880.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term448909;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term448817, args);
        assertTrue(recursiveEquals(term448817, term449930));
        assertTrue(recursiveEquals(term448909, term449931));
        assertTrue(recursiveEquals(retValue, term449880));
    }

};


