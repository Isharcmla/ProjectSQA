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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293496;
     Object term293582;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293496 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term293582 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term293668 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term293760 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term293760, term293760.getClass(), "type", 39);
        setField(term293668, term293668.getClass(), "next", term293760);
        setIntField(term293668, term293668.getClass(), "type", 39);
        setField(term293582, term293582.getClass(), "first", term293668);
        setIntField(term293582, term293582.getClass(), "type", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term293582;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term293496, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


