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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242617;
     Object term242709;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242617 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term242709 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term242801 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term242893 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term242893, term242893.getClass(), "type", 39);
        setField(term242801, term242801.getClass(), "next", term242893);
        setIntField(term242801, term242801.getClass(), "type", 39);
        setField(term242709, term242709.getClass(), "first", term242801);
        setIntField(term242709, term242709.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term242709;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term242617, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


