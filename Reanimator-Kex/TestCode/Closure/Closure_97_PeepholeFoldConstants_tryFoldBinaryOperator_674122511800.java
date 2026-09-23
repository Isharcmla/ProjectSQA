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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511800 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230481;
     Object term230567;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511800() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230481 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term230567 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term230659 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term230567, term230567.getClass(), "first", term230567);
        setIntField(term230659, term230659.getClass(), "type", 40);
        setField(term230567, term230567.getClass(), "next", term230659);
        setIntField(term230567, term230567.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term230567;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term230481, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


