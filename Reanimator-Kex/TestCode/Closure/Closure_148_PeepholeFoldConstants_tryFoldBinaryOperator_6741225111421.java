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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350219;
     Object term350311;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350219 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term350311 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term350403 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term350311, term350311.getClass(), "first", term350311);
        setIntField(term350403, term350403.getClass(), "type", 40);
        setField(term350311, term350311.getClass(), "next", term350403);
        setIntField(term350311, term350311.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term350311;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term350219, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


