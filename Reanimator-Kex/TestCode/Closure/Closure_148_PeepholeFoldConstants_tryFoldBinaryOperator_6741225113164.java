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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term938413;
     Object term938505;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term938413 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term938505 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term938575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term938667 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term938759 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term938667, term938667.getClass(), "type", 47);
        setField(term938575, term938575.getClass(), "next", term938667);
        setIntField(term938575, term938575.getClass(), "type", 0);
        setField(term938505, term938505.getClass(), "first", term938575);
        setIntField(term938505, term938505.getClass(), "type", 101);
        setIntField(term938759, term938759.getClass(), "type", 108);
        setField(term938505, term938505.getClass(), "parent", term938759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term938505;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term938413, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


