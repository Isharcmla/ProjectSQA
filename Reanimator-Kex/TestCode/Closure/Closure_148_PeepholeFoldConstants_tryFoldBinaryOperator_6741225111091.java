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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256686;
     Object term256778;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256686 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term256778 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term256870 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term256962 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term256962, term256962.getClass(), "type", 39);
        setField(term256870, term256870.getClass(), "next", term256962);
        setIntField(term256870, term256870.getClass(), "type", 39);
        setField(term256778, term256778.getClass(), "first", term256870);
        setIntField(term256778, term256778.getClass(), "type", 20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term256778;
        callMethod(klass, "tryFoldBinaryOperator", argTypes, term256686, args);
    }

};


