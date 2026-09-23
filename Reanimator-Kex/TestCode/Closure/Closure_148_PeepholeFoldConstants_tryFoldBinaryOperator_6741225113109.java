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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term919316;
     Object term919408;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term919316 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term919408 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term919500 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term919592 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term919592, term919592.getClass(), "type", 39);
        setField(term919500, term919500.getClass(), "next", term919592);
        setIntField(term919500, term919500.getClass(), "type", 39);
        setField(term919408, term919408.getClass(), "first", term919500);
        setIntField(term919408, term919408.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term919408;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term919316, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


