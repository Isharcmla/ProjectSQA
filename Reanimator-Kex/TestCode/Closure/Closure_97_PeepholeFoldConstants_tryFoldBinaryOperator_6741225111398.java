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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529293;
     Object term529379;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term529293 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term529379 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term529465 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term529551 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term529551, term529551.getClass(), "type", 39);
        setField(term529465, term529465.getClass(), "next", term529551);
        setIntField(term529465, term529465.getClass(), "type", 63);
        setField(term529379, term529379.getClass(), "first", term529465);
        setIntField(term529379, term529379.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term529379;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term529293, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


