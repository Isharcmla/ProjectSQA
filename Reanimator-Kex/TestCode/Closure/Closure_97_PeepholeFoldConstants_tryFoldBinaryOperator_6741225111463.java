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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545455;
     Object term545541;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545455 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term545541 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term545627 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term545719 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term545719, term545719.getClass(), "type", 39);
        setField(term545627, term545627.getClass(), "next", term545719);
        setIntField(term545627, term545627.getClass(), "type", 39);
        setField(term545541, term545541.getClass(), "first", term545627);
        setIntField(term545541, term545541.getClass(), "type", 23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term545541;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term545455, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


