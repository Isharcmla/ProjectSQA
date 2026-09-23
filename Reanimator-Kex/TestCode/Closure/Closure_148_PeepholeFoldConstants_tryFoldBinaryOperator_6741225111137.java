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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267839;
     Object term267931;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267839 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term267931 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term268023 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term268115 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term268115, term268115.getClass(), "type", 39);
        setField(term268023, term268023.getClass(), "next", term268115);
        setIntField(term268023, term268023.getClass(), "type", 39);
        setField(term267931, term267931.getClass(), "first", term268023);
        setIntField(term267931, term267931.getClass(), "type", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term267931;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term267839, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


