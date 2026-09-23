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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320037;
     Object term320129;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320037 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term320129 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term320221 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term320313 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term320313, term320313.getClass(), "type", 39);
        setField(term320221, term320221.getClass(), "next", term320313);
        setIntField(term320221, term320221.getClass(), "type", 39);
        setField(term320129, term320129.getClass(), "first", term320221);
        setIntField(term320129, term320129.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term320129;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term320037, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


