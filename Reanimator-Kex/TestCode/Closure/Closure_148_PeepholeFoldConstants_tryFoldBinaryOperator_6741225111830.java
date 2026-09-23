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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478751;
     Object term478837;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term478751 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term478837 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term478923 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term479009 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term479009, term479009.getClass(), "type", 64);
        setField(term478923, term478923.getClass(), "next", term479009);
        setIntField(term478923, term478923.getClass(), "type", 0);
        setField(term478837, term478837.getClass(), "first", term478923);
        setIntField(term478837, term478837.getClass(), "type", 101);
        setField(term478837, term478837.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term478837;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term478751, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


