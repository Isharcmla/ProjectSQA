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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710490;
     Object term710582;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term710490 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term710582 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term710674 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term710766 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term710766, term710766.getClass(), "type", 39);
        setField(term710674, term710674.getClass(), "next", term710766);
        setIntField(term710674, term710674.getClass(), "type", 63);
        setField(term710582, term710582.getClass(), "first", term710674);
        setIntField(term710582, term710582.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term710582;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term710490, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


