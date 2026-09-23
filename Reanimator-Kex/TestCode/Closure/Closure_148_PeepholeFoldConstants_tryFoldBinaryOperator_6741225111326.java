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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320633;
     Object term320725;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320633 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term320725 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term320817 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term320909 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term320909, term320909.getClass(), "type", 39);
        setField(term320817, term320817.getClass(), "next", term320909);
        setIntField(term320817, term320817.getClass(), "type", 39);
        setField(term320725, term320725.getClass(), "first", term320817);
        setIntField(term320725, term320725.getClass(), "type", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term320725;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term320633, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


