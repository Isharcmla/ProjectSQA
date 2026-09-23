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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term704337;
     Object term704423;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term704337 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term704423 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term704509 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term704601 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term704601, term704601.getClass(), "type", 39);
        setField(term704509, term704509.getClass(), "next", term704601);
        setIntField(term704509, term704509.getClass(), "type", 39);
        setField(term704423, term704423.getClass(), "first", term704509);
        setIntField(term704423, term704423.getClass(), "type", 19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term704423;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term704337, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


