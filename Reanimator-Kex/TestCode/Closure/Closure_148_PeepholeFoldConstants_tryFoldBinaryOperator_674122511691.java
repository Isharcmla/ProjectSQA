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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153116;
     Object term153186;
     Object term153710;
     Object term153711;
     Object term153691;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153116 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term153186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term153186, term153186.getClass(), "first", term153186);
        setField(term153186, term153186.getClass(), "next", term153186);
        setIntField(term153186, term153186.getClass(), "type", 33);
        term153710 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term153710, term153710.getClass(), "currentTraversal", null);
        term153711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term153711, term153711.getClass(), "type", 33);
        setField(term153711, term153711.getClass(), "next", term153711);
        setField(term153711, term153711.getClass(), "first", term153711);
        setField(term153711, term153711.getClass(), "last", null);
        setField(term153711, term153711.getClass(), "propListHead", null);
        setIntField(term153711, term153711.getClass(), "sourcePosition", 0);
        setField(term153711, term153711.getClass(), "jsType", null);
        setField(term153711, term153711.getClass(), "parent", null);
        term153691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term153691, term153691.getClass(), "type", 33);
        setField(term153691, term153691.getClass(), "next", term153691);
        setField(term153691, term153691.getClass(), "first", term153691);
        setField(term153691, term153691.getClass(), "last", null);
        setField(term153691, term153691.getClass(), "propListHead", null);
        setIntField(term153691, term153691.getClass(), "sourcePosition", 0);
        setField(term153691, term153691.getClass(), "jsType", null);
        setField(term153691, term153691.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term153186;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term153116, args);
        assertTrue(recursiveEquals(term153116, term153710));
        assertTrue(recursiveEquals(term153186, term153711));
        assertTrue(recursiveEquals(retValue, term153691));
    }

};


