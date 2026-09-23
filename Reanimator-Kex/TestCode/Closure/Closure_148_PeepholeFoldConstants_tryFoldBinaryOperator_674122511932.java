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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217074;
     Object term217166;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217074 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term217166 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term217258 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term217344 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term217344, term217344.getClass(), "type", 39);
        setField(term217258, term217258.getClass(), "next", term217344);
        setIntField(term217258, term217258.getClass(), "type", 39);
        setField(term217166, term217166.getClass(), "first", term217258);
        setIntField(term217166, term217166.getClass(), "type", 11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term217166;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term217074, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


