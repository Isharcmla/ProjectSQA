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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term726227;
     Object term726319;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term726227 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term726319 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term726411 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term726497 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term726497, term726497.getClass(), "type", 39);
        setField(term726411, term726411.getClass(), "next", term726497);
        setIntField(term726411, term726411.getClass(), "type", 39);
        setField(term726319, term726319.getClass(), "first", term726411);
        setIntField(term726319, term726319.getClass(), "type", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term726319;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term726227, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


