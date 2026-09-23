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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552038;
     Object term552124;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term552038 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term552124 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term552210 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term552302 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term552302, term552302.getClass(), "type", 39);
        setField(term552210, term552210.getClass(), "next", term552302);
        setIntField(term552210, term552210.getClass(), "type", 39);
        setField(term552124, term552124.getClass(), "first", term552210);
        setIntField(term552124, term552124.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term552124;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term552038, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


