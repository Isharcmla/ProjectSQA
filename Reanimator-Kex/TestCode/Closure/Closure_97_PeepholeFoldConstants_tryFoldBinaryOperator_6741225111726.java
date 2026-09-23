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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term680551;
     Object term680643;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term680551 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term680643 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term680735 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term680827 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term680827, term680827.getClass(), "type", 39);
        setField(term680735, term680735.getClass(), "next", term680827);
        setIntField(term680735, term680735.getClass(), "type", 39);
        setField(term680643, term680643.getClass(), "first", term680735);
        setIntField(term680643, term680643.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term680643;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term680551, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


