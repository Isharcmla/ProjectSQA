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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346268;
     Object term346360;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term346268 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term346360 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term346452 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term346544 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term346544, term346544.getClass(), "type", 39);
        setField(term346452, term346452.getClass(), "next", term346544);
        setIntField(term346452, term346452.getClass(), "type", 39);
        setField(term346360, term346360.getClass(), "first", term346452);
        setIntField(term346360, term346360.getClass(), "type", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term346360;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term346268, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


