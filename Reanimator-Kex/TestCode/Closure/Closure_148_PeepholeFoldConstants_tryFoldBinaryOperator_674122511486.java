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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101267;
     Object term101359;
     Object term101535;
     Object term101536;
     Object term101505;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101267 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term101359 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term101359, term101359.getClass(), "first", term101359);
        setField(term101359, term101359.getClass(), "next", term101429);
        setIntField(term101359, term101359.getClass(), "type", 13);
        term101535 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term101535, term101535.getClass(), "currentTraversal", null);
        term101536 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term101536, term101536.getClass(), "number", 0.0);
        setIntField(term101536, term101536.getClass(), "type", 13);
        setIntField(term101537, term101537.getClass(), "type", 0);
        setField(term101537, term101537.getClass(), "next", null);
        setField(term101537, term101537.getClass(), "first", null);
        setField(term101537, term101537.getClass(), "last", null);
        setField(term101537, term101537.getClass(), "propListHead", null);
        setIntField(term101537, term101537.getClass(), "sourcePosition", 0);
        setField(term101537, term101537.getClass(), "jsType", null);
        setField(term101537, term101537.getClass(), "parent", null);
        setField(term101536, term101536.getClass(), "next", term101537);
        setField(term101536, term101536.getClass(), "first", term101536);
        setField(term101536, term101536.getClass(), "last", null);
        setField(term101536, term101536.getClass(), "propListHead", null);
        setIntField(term101536, term101536.getClass(), "sourcePosition", 0);
        setField(term101536, term101536.getClass(), "jsType", null);
        setField(term101536, term101536.getClass(), "parent", null);
        term101505 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term101505, term101505.getClass(), "number", 0.0);
        setIntField(term101505, term101505.getClass(), "type", 13);
        setIntField(term101508, term101508.getClass(), "type", 0);
        setField(term101508, term101508.getClass(), "next", null);
        setField(term101508, term101508.getClass(), "first", null);
        setField(term101508, term101508.getClass(), "last", null);
        setField(term101508, term101508.getClass(), "propListHead", null);
        setIntField(term101508, term101508.getClass(), "sourcePosition", 0);
        setField(term101508, term101508.getClass(), "jsType", null);
        setField(term101508, term101508.getClass(), "parent", null);
        setField(term101505, term101505.getClass(), "next", term101508);
        setField(term101505, term101505.getClass(), "first", term101505);
        setField(term101505, term101505.getClass(), "last", null);
        setField(term101505, term101505.getClass(), "propListHead", null);
        setIntField(term101505, term101505.getClass(), "sourcePosition", 0);
        setField(term101505, term101505.getClass(), "jsType", null);
        setField(term101505, term101505.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term101359;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term101267, args);
        assertTrue(recursiveEquals(term101267, term101535));
        assertTrue(recursiveEquals(term101359, term101536));
        assertTrue(recursiveEquals(retValue, term101505));
    }

};


