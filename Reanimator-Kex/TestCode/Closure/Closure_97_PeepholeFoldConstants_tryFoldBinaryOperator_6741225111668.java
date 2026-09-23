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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term664413;
     Object term664505;
     Object term664827;
     Object term664828;
     Object term664783;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term664413 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term664505 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term664597 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term664689 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term664689, term664689.getClass(), "type", 42);
        setField(term664597, term664597.getClass(), "next", term664689);
        setIntField(term664597, term664597.getClass(), "type", 42);
        setField(term664505, term664505.getClass(), "first", term664597);
        setIntField(term664505, term664505.getClass(), "type", 16);
        term664827 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term664827, term664827.getClass(), "currentTraversal", null);
        term664828 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term664829 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term664830 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term664828, term664828.getClass(), "str", null);
        setIntField(term664828, term664828.getClass(), "type", 16);
        setField(term664828, term664828.getClass(), "next", null);
        setField(term664829, term664829.getClass(), "str", null);
        setIntField(term664829, term664829.getClass(), "type", 42);
        setField(term664830, term664830.getClass(), "str", null);
        setIntField(term664830, term664830.getClass(), "type", 42);
        setField(term664830, term664830.getClass(), "next", null);
        setField(term664830, term664830.getClass(), "first", null);
        setField(term664830, term664830.getClass(), "last", null);
        setField(term664830, term664830.getClass(), "propListHead", null);
        setIntField(term664830, term664830.getClass(), "sourcePosition", 0);
        setField(term664830, term664830.getClass(), "jsType", null);
        setField(term664830, term664830.getClass(), "parent", null);
        setField(term664829, term664829.getClass(), "next", term664830);
        setField(term664829, term664829.getClass(), "first", null);
        setField(term664829, term664829.getClass(), "last", null);
        setField(term664829, term664829.getClass(), "propListHead", null);
        setIntField(term664829, term664829.getClass(), "sourcePosition", 0);
        setField(term664829, term664829.getClass(), "jsType", null);
        setField(term664829, term664829.getClass(), "parent", null);
        setField(term664828, term664828.getClass(), "first", term664829);
        setField(term664828, term664828.getClass(), "last", null);
        setField(term664828, term664828.getClass(), "propListHead", null);
        setIntField(term664828, term664828.getClass(), "sourcePosition", 0);
        setField(term664828, term664828.getClass(), "jsType", null);
        setField(term664828, term664828.getClass(), "parent", null);
        term664783 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term664785 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term664787 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term664783, term664783.getClass(), "str", null);
        setIntField(term664783, term664783.getClass(), "type", 16);
        setField(term664783, term664783.getClass(), "next", null);
        setField(term664785, term664785.getClass(), "str", null);
        setIntField(term664785, term664785.getClass(), "type", 42);
        setField(term664787, term664787.getClass(), "str", null);
        setIntField(term664787, term664787.getClass(), "type", 42);
        setField(term664787, term664787.getClass(), "next", null);
        setField(term664787, term664787.getClass(), "first", null);
        setField(term664787, term664787.getClass(), "last", null);
        setField(term664787, term664787.getClass(), "propListHead", null);
        setIntField(term664787, term664787.getClass(), "sourcePosition", 0);
        setField(term664787, term664787.getClass(), "jsType", null);
        setField(term664787, term664787.getClass(), "parent", null);
        setField(term664785, term664785.getClass(), "next", term664787);
        setField(term664785, term664785.getClass(), "first", null);
        setField(term664785, term664785.getClass(), "last", null);
        setField(term664785, term664785.getClass(), "propListHead", null);
        setIntField(term664785, term664785.getClass(), "sourcePosition", 0);
        setField(term664785, term664785.getClass(), "jsType", null);
        setField(term664785, term664785.getClass(), "parent", null);
        setField(term664783, term664783.getClass(), "first", term664785);
        setField(term664783, term664783.getClass(), "last", null);
        setField(term664783, term664783.getClass(), "propListHead", null);
        setIntField(term664783, term664783.getClass(), "sourcePosition", 0);
        setField(term664783, term664783.getClass(), "jsType", null);
        setField(term664783, term664783.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term664505;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term664413, args);
        assertTrue(recursiveEquals(term664413, term664827));
        assertTrue(recursiveEquals(term664505, term664828));
        assertTrue(recursiveEquals(retValue, term664783));
    }

};


