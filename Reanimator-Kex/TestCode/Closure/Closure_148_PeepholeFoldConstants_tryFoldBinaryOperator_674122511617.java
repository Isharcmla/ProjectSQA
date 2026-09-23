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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134903;
     Object term134995;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134903 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term134995 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term135087 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term134995, term134995.getClass(), "first", term134995);
        setIntField(term135087, term135087.getClass(), "type", 40);
        setField(term134995, term134995.getClass(), "next", term135087);
        setIntField(term134995, term134995.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term134995;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term134903, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


