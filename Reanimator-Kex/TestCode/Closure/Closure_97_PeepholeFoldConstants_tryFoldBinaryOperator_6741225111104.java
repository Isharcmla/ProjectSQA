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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341197;
     Object term341283;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341197 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term341283 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term341369 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term341461 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term341461, term341461.getClass(), "type", 39);
        setField(term341369, term341369.getClass(), "next", term341461);
        setIntField(term341369, term341369.getClass(), "type", 39);
        setField(term341283, term341283.getClass(), "first", term341369);
        setIntField(term341283, term341283.getClass(), "type", 23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term341283;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term341197, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


