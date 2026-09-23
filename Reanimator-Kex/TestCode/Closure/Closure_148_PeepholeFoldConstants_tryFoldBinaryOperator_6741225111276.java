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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305408;
     Object term305500;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305408 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term305500 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term305592 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term305684 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term305684, term305684.getClass(), "type", 39);
        setField(term305592, term305592.getClass(), "next", term305684);
        setIntField(term305592, term305592.getClass(), "type", 39);
        setField(term305500, term305500.getClass(), "first", term305592);
        setIntField(term305500, term305500.getClass(), "type", 20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term305500;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term305408, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


