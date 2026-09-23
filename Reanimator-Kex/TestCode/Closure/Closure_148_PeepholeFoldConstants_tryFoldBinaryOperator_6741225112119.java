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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term575846;
     Object term575932;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term575846 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term575932 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term576018 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term576104 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term576104, term576104.getClass(), "type", 39);
        setField(term576018, term576018.getClass(), "next", term576104);
        setIntField(term576018, term576018.getClass(), "type", 63);
        setField(term575932, term575932.getClass(), "first", term576018);
        setIntField(term575932, term575932.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term575932;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term575846, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


