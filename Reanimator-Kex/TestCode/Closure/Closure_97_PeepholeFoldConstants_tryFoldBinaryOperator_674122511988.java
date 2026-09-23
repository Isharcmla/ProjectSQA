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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312311;
     Object term312381;
     Object term312415;
     Object term312416;
     Object term312385;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312311 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term312381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term312381, term312381.getClass(), "first", term312381);
        setField(term312381, term312381.getClass(), "next", term312381);
        setIntField(term312381, term312381.getClass(), "type", 16);
        term312415 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term312415, term312415.getClass(), "currentTraversal", null);
        term312416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term312416, term312416.getClass(), "type", 16);
        setField(term312416, term312416.getClass(), "next", term312416);
        setField(term312416, term312416.getClass(), "first", term312416);
        setField(term312416, term312416.getClass(), "last", null);
        setField(term312416, term312416.getClass(), "propListHead", null);
        setIntField(term312416, term312416.getClass(), "sourcePosition", 0);
        setField(term312416, term312416.getClass(), "jsType", null);
        setField(term312416, term312416.getClass(), "parent", null);
        term312385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term312385, term312385.getClass(), "type", 16);
        setField(term312385, term312385.getClass(), "next", term312385);
        setField(term312385, term312385.getClass(), "first", term312385);
        setField(term312385, term312385.getClass(), "last", null);
        setField(term312385, term312385.getClass(), "propListHead", null);
        setIntField(term312385, term312385.getClass(), "sourcePosition", 0);
        setField(term312385, term312385.getClass(), "jsType", null);
        setField(term312385, term312385.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term312381;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term312311, args);
        assertTrue(recursiveEquals(term312311, term312415));
        assertTrue(recursiveEquals(term312381, term312416));
        assertTrue(recursiveEquals(retValue, term312385));
    }

};


