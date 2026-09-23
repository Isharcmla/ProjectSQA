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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545856;
     Object term545948;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545856 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term545948 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term546040 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term546132 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term546132, term546132.getClass(), "type", 39);
        setField(term546040, term546040.getClass(), "next", term546132);
        setIntField(term546040, term546040.getClass(), "type", 39);
        setField(term545948, term545948.getClass(), "first", term546040);
        setIntField(term545948, term545948.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term545948;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term545856, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


