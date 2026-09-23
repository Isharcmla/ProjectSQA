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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265303;
     Object term265389;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265303 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term265389 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term265475 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term265567 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term265567, term265567.getClass(), "type", 39);
        setField(term265475, term265475.getClass(), "next", term265567);
        setIntField(term265475, term265475.getClass(), "type", 63);
        setField(term265389, term265389.getClass(), "first", term265475);
        setIntField(term265389, term265389.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term265389;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term265303, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


