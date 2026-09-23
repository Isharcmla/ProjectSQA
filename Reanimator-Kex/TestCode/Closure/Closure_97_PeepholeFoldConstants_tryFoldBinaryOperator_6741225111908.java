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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term728414;
     Object term728506;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term728414 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term728506 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term728592 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term728662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term728662, term728662.getClass(), "type", 39);
        setField(term728592, term728592.getClass(), "next", term728662);
        setIntField(term728592, term728592.getClass(), "type", 39);
        setField(term728506, term728506.getClass(), "first", term728592);
        setIntField(term728506, term728506.getClass(), "type", 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term728506;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term728414, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


