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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386554;
     Object term386646;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386554 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term386646 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term386732 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term386732, term386732.getClass(), "next", term386732);
        setIntField(term386732, term386732.getClass(), "type", 44);
        setField(term386646, term386646.getClass(), "first", term386732);
        setIntField(term386646, term386646.getClass(), "type", 101);
        setField(term386646, term386646.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term386646;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term386554, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


