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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665989;
     Object term666075;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term665989 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term666075 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term666161 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term666253 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term666253, term666253.getClass(), "type", 39);
        setField(term666161, term666161.getClass(), "next", term666253);
        setIntField(term666161, term666161.getClass(), "type", 39);
        setField(term666075, term666075.getClass(), "first", term666161);
        setIntField(term666075, term666075.getClass(), "type", 11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term666075;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term665989, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


